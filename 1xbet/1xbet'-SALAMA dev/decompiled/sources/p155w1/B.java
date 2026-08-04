package p155w1;

import android.location.Location;
import android.os.Bundle;
import com.flurry.android.marketing.messaging.notification.b;
import java.util.Collections;
import java.util.HashMap;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class B implements I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17288b;

    @Override // p155w1.I2
    public final void a(Object obj) {
        boolean z4;
        switch (this.f17287a) {
            case 0:
                K2 k7 = (K2) obj;
                C c3 = (C) this.f17288b;
                c3.d(new C1054z(c3, 2));
                HashMap map = new HashMap();
                map.put("previous_state", L.q(k7.f17449a));
                map.put("current_state", L.q(k7.f17450b));
                break;
            case 1:
                ((K) this.f17288b).d(new b(4, this, (M) obj));
                break;
            case 2:
                boolean z7 = ((K2) obj).f17450b == 2;
                T t7 = (T) this.f17288b;
                t7.f17540C = z7;
                if (z7) {
                    Location locationJ = t7.j();
                    if (locationJ != null) {
                        t7.f17541D = locationJ;
                    }
                    t7.h(new S(t7.f17538A, t7.f17539B, t7.f17541D));
                }
                break;
            case 3:
                if (((K2) obj).f17450b == 2) {
                    Y y4 = (Y) this.f17288b;
                    y4.d(new W(y4, 3));
                }
                break;
            case 4:
                C0965a0 c0965a0 = (C0965a0) this.f17288b;
                c0965a0.h(new Z(c0965a0.f17641A, c0965a0.f17642B));
                break;
            case 5:
                int i7 = AbstractC0989g0.f17722a[e.e(((K2) obj).f17450b)];
                C0993h0 c0993h0 = (C0993h0) this.f17288b;
                if (i7 == 1) {
                    c0993h0.d(new C0985f0(2, 0, c0993h0, false));
                    break;
                } else if (i7 == 2) {
                    c0993h0.d(new C0985f0(2, 1, c0993h0, false));
                    break;
                }
                break;
            case 6:
                U u4 = (U) obj;
                C1034s0 c1034s0 = (C1034s0) this.f17288b;
                String str = c1034s0.f17862z;
                AbstractC0997i0.o(2, "NetworkAvailabilityChanged : NetworkAvailable = " + u4.f17552a);
                if (u4.f17552a) {
                    c1034s0.d(new C1008l(c1034s0, 4));
                }
                break;
            case 7:
                C c4 = H2.a().f17409g;
                A0 a2 = (A0) this.f17288b;
                B b7 = a2.f17284F;
                c4.getClass();
                c4.d(new F2(c4, b7, 1));
                a2.h();
                break;
            case 8:
                C c7 = H2.a().f17409g;
                C0986f1 c0986f1 = (C0986f1) this.f17288b;
                B b8 = c0986f1.f17716A;
                c7.getClass();
                c7.d(new F2(c7, b8, 1));
                c0986f1.d(new C0982e1(c0986f1, 1));
                break;
            case 9:
                Z z8 = (Z) obj;
                String str2 = z8.f17620a;
                if (str2 != null && !str2.equals((String) this.f17288b) && (z4 = z8.f17621b)) {
                    Collections.emptyMap();
                    this.f17288b = str2;
                    C1050x1.z().A(new R1(new u2(str2, z4), 25));
                    break;
                }
                break;
            default:
                M m7 = (M) obj;
                int i8 = J2.f17429a[e.e(m7.f17453a)];
                C0973c0 c0973c0 = (C0973c0) this.f17288b;
                if (i8 == 1) {
                    C0973c0.j(c0973c0, true);
                    break;
                } else if (i8 == 2) {
                    C0973c0.j(c0973c0, false);
                    break;
                } else if (i8 == 3) {
                    Bundle bundle = m7.f17454b;
                    if (bundle.containsKey("trim_memory_level") && bundle.getInt("trim_memory_level") == 20) {
                        C0973c0.j(c0973c0, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ B(AbstractC1056z1 abstractC1056z1, int i7) {
        this.f17287a = i7;
        this.f17288b = abstractC1056z1;
    }
}
