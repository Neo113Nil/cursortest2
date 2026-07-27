package N2;

import g4.AbstractC0466k;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: N2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111b extends H2.r {

    /* renamed from: b, reason: collision with root package name */
    public static final C0111b f2077b = new C0111b(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2078a;

    public /* synthetic */ C0111b(int i2) {
        this.f2078a = i2;
    }

    @Override // H2.r
    public Object readValueOfType(byte b6, ByteBuffer buffer) {
        switch (this.f2078a) {
            case 1:
                kotlin.jvm.internal.i.e(buffer, "buffer");
                if (b6 == -127) {
                    Long l2 = (Long) readValue(buffer);
                    if (l2 != null) {
                        int longValue = (int) l2.longValue();
                        J.f2067b.getClass();
                        J[] values = J.values();
                        int length = values.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            J j2 = values[i2];
                            if (j2.f2072a == longValue) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b6 == -126) {
                    Object readValue = readValue(buffer);
                    List list = readValue instanceof List ? (List) readValue : null;
                    if (list != null) {
                        String str = (String) list.get(0);
                        Object obj = list.get(1);
                        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b6 == -125) {
                    Object readValue2 = readValue(buffer);
                    List list2 = readValue2 instanceof List ? (List) readValue2 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.readValueOfType(b6, buffer);
    }

    @Override // H2.r
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        switch (this.f2078a) {
            case 1:
                kotlin.jvm.internal.i.e(stream, "stream");
                if (!(obj instanceof J)) {
                    if (!(obj instanceof C0116g)) {
                        if (!(obj instanceof L)) {
                            super.writeValue(stream, obj);
                            break;
                        } else {
                            stream.write(131);
                            L l2 = (L) obj;
                            writeValue(stream, AbstractC0466k.A0(l2.f2073a, l2.f2074b));
                            break;
                        }
                    } else {
                        stream.write(130);
                        writeValue(stream, ((C0116g) obj).a());
                        break;
                    }
                } else {
                    stream.write(129);
                    writeValue(stream, Long.valueOf(((J) obj).f2072a));
                    break;
                }
            default:
                super.writeValue(stream, obj);
                break;
        }
    }
}
