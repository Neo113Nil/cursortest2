package P5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: P5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0390b extends A5.x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0390b f5642e = new C0390b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
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
                    if (l7 == null) {
                        return null;
                    }
                    int iLongValue = (int) l7.longValue();
                    N.f5632b.getClass();
                    for (N n2 : N.values()) {
                        if (n2.f5637a == iLongValue) {
                            return n2;
                        }
                    }
                    return null;
                }
                if (b7 == -126) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list == null) {
                        return null;
                    }
                    String str = (String) list.get(0);
                    Object obj = list.get(1);
                    t6.h.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C0396h(str, ((Boolean) obj).booleanValue());
                }
                if (b7 != -125) {
                    return super.f(b7, byteBuffer);
                }
                Object objE2 = e(byteBuffer);
                List list2 = objE2 instanceof List ? (List) objE2 : null;
                if (list2 == null) {
                    return null;
                }
                String str2 = (String) list2.get(0);
                Object obj2 = list2.get(1);
                t6.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                return new P(str2, (N) obj2);
            default:
                return super.f(b7, byteBuffer);
        }
    }

    @Override // A5.x
    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        switch (this.f5643d) {
            case 1:
                t6.h.e(byteArrayOutputStream, "stream");
                if (obj instanceof N) {
                    byteArrayOutputStream.write(129);
                    k(byteArrayOutputStream, Integer.valueOf(((N) obj).f5637a));
                } else if (obj instanceof C0396h) {
                    byteArrayOutputStream.write(130);
                    C0396h c0396h = (C0396h) obj;
                    k(byteArrayOutputStream, p050g6.i.M0(c0396h.f5652a, Boolean.valueOf(c0396h.f5653b)));
                } else if (!(obj instanceof P)) {
                    super.k(byteArrayOutputStream, obj);
                } else {
                    byteArrayOutputStream.write(131);
                    P p5 = (P) obj;
                    k(byteArrayOutputStream, p050g6.i.M0(p5.f5638a, p5.f5639b));
                }
                break;
            default:
                super.k(byteArrayOutputStream, obj);
                break;
        }
    }
}
