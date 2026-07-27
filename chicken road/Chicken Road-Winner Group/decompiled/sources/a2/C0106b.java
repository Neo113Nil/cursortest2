package a2;

import e2.AbstractC0293h;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106b extends T1.r {

    /* renamed from: b, reason: collision with root package name */
    public static final C0106b f1832b = new C0106b(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1833a;

    public /* synthetic */ C0106b(int i3) {
        this.f1833a = i3;
    }

    @Override // T1.r
    public Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
        switch (this.f1833a) {
            case 1:
                if (b3 == -127) {
                    Long l3 = (Long) readValue(byteBuffer);
                    if (l3 != null) {
                        int longValue = (int) l3.longValue();
                        EnumC0102L.f1823b.getClass();
                        EnumC0102L[] values = EnumC0102L.values();
                        int length = values.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            EnumC0102L enumC0102L = values[i3];
                            if (enumC0102L.f1827a == longValue) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b3 == -126) {
                    Object readValue = readValue(byteBuffer);
                    List list = readValue instanceof List ? (List) readValue : null;
                    if (list != null) {
                        String str = (String) list.get(0);
                        Object obj = list.get(1);
                        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b3 == -125) {
                    Object readValue2 = readValue(byteBuffer);
                    List list2 = readValue2 instanceof List ? (List) readValue2 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.readValueOfType(b3, byteBuffer);
    }

    @Override // T1.r
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        switch (this.f1833a) {
            case 1:
                kotlin.jvm.internal.j.e(stream, "stream");
                if (!(obj instanceof EnumC0102L)) {
                    if (!(obj instanceof C0112h)) {
                        if (!(obj instanceof C0104N)) {
                            super.writeValue(stream, obj);
                            break;
                        } else {
                            stream.write(131);
                            C0104N c0104n = (C0104N) obj;
                            writeValue(stream, AbstractC0293h.S(c0104n.f1828a, c0104n.f1829b));
                            break;
                        }
                    } else {
                        stream.write(130);
                        writeValue(stream, ((C0112h) obj).a());
                        break;
                    }
                } else {
                    stream.write(129);
                    writeValue(stream, Long.valueOf(((EnumC0102L) obj).f1827a));
                    break;
                }
            default:
                super.writeValue(stream, obj);
                break;
        }
    }
}
