package w1;

import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class B implements I2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17281a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17282b;

    @Override // w1.I2
    public final void a(Object obj) {
        boolean z4;
        switch (this.f17281a) {
            case 0:
                K2 k22 = (K2) obj;
                C c3 = (C) this.f17282b;
                c3.d(new C1763z(c3, 2));
                HashMap hashMap = new HashMap();
                hashMap.put("previous_state", L.q(k22.f17443a));
                hashMap.put("current_state", L.q(k22.f17444b));
                break;
            case 1:
                ((K) this.f17282b).d(new com.flurry.android.marketing.messaging.notification.b(4, this, (M) obj));
                break;
            case 2:
                boolean z7 = ((K2) obj).f17444b == 2;
                T t7 = (T) this.f17282b;
                t7.f17534C = z7;
                if (z7) {
                    Location j = t7.j();
                    if (j != null) {
                        t7.f17535D = j;
                    }
                    t7.h(new S(t7.f17532A, t7.f17533B, t7.f17535D));
                    break;
                }
                break;
            case 3:
                if (((K2) obj).f17444b == 2) {
                    Y y4 = (Y) this.f17282b;
                    y4.d(new W(y4, 3));
                    break;
                }
                break;
            case 4:
                C1674a0 c1674a0 = (C1674a0) this.f17282b;
                c1674a0.h(new Z(c1674a0.f17635A, c1674a0.f17636B));
                break;
            case 5:
                int i7 = AbstractC1698g0.f17716a[t.e.e(((K2) obj).f17444b)];
                C1702h0 c1702h0 = (C1702h0) this.f17282b;
                if (i7 == 1) {
                    c1702h0.d(new C1694f0(2, 0, c1702h0, false));
                    break;
                } else if (i7 == 2) {
                    c1702h0.d(new C1694f0(2, 1, c1702h0, false));
                    break;
                }
                break;
            case 6:
                U u4 = (U) obj;
                C1743s0 c1743s0 = (C1743s0) this.f17282b;
                String str = c1743s0.f17856z;
                AbstractC1706i0.o(2, "NetworkAvailabilityChanged : NetworkAvailable = " + u4.f17546a);
                if (u4.f17546a) {
                    c1743s0.d(new C1717l(c1743s0, 4));
                    break;
                }
                break;
            case 7:
                C c4 = H2.a().f17403g;
                A0 a02 = (A0) this.f17282b;
                B b7 = a02.f17278F;
                c4.getClass();
                c4.d(new F2(c4, b7, 1));
                a02.h();
                break;
            case 8:
                C c7 = H2.a().f17403g;
                C1695f1 c1695f1 = (C1695f1) this.f17282b;
                B b8 = c1695f1.f17710A;
                c7.getClass();
                c7.d(new F2(c7, b8, 1));
                c1695f1.d(new C1691e1(c1695f1, 1));
                break;
            case 9:
                Z z8 = (Z) obj;
                String str2 = z8.f17614a;
                if (str2 != null && !str2.equals((String) this.f17282b) && (z4 = z8.f17615b)) {
                    Collections.emptyMap();
                    this.f17282b = str2;
                    C1759x1.z().A(new R1(new u2(str2, z4), 25));
                    break;
                }
                break;
            default:
                M m7 = (M) obj;
                int i8 = J2.f17423a[t.e.e(m7.f17447a)];
                C1682c0 c1682c0 = (C1682c0) this.f17282b;
                if (i8 == 1) {
                    C1682c0.j(c1682c0, true);
                    break;
                } else if (i8 == 2) {
                    C1682c0.j(c1682c0, false);
                    break;
                } else if (i8 == 3) {
                    Bundle bundle = m7.f17448b;
                    if (bundle.containsKey("trim_memory_level") && bundle.getInt("trim_memory_level") == 20) {
                        C1682c0.j(c1682c0, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ B(AbstractC1765z1 abstractC1765z1, int i7) {
        this.f17281a = i7;
        this.f17282b = abstractC1765z1;
    }
}
