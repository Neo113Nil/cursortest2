package P5;

import g6.AbstractC1160i;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: P5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0390b extends A5.x {

    /* renamed from: e, reason: collision with root package name */
    public static final C0390b f5642e = new C0390b(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5643d;

    public /* synthetic */ C0390b(int i7) {
        this.f5643d = i7;
    }

    @Override // A5.x
    public Object f(byte b7, ByteBuffer byteBuffer) {
        switch (this.f5643d) {
            case 1:
                t6.h.e(byteBuffer, "buffer");
                if (b7 == -127) {
                    Long l7 = (Long) e(byteBuffer);
                    if (l7 != null) {
                        int longValue = (int) l7.longValue();
                        N.f5632b.getClass();
                        N[] values = N.values();
                        int length = values.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            N n2 = values[i7];
                            if (n2.f5637a == longValue) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b7 == -126) {
                    Object e7 = e(byteBuffer);
                    List list = e7 instanceof List ? (List) e7 : null;
                    if (list != null) {
                        String str = (String) list.get(0);
                        Object obj = list.get(1);
                        t6.h.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b7 == -125) {
                    Object e8 = e(byteBuffer);
                    List list2 = e8 instanceof List ? (List) e8 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        t6.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.f(b7, byteBuffer);
    }

    @Override // A5.x
    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        switch (this.f5643d) {
            case 1:
                t6.h.e(byteArrayOutputStream, "stream");
                if (!(obj instanceof N)) {
                    if (!(obj instanceof C0396h)) {
                        if (!(obj instanceof P)) {
                            super.k(byteArrayOutputStream, obj);
                            break;
                        } else {
                            byteArrayOutputStream.write(131);
                            P p5 = (P) obj;
                            k(byteArrayOutputStream, AbstractC1160i.M0(p5.f5638a, p5.f5639b));
                            break;
                        }
                    } else {
                        byteArrayOutputStream.write(130);
                        C0396h c0396h = (C0396h) obj;
                        k(byteArrayOutputStream, AbstractC1160i.M0(c0396h.f5652a, Boolean.valueOf(c0396h.f5653b)));
                        break;
                    }
                } else {
                    byteArrayOutputStream.write(129);
                    k(byteArrayOutputStream, Integer.valueOf(((N) obj).f5637a));
                    break;
                }
            default:
                super.k(byteArrayOutputStream, obj);
                break;
        }
    }
}
