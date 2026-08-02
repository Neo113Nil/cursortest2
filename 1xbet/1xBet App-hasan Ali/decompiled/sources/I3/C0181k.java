package I3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: I3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181k implements F3.z {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2657k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2658l;

    public /* synthetic */ C0181k(int i, Object obj) {
        this.f2657k = i;
        this.f2658l = obj;
    }

    @Override // F3.z
    public final F3.y a(F3.m mVar, M3.a aVar) {
        switch (this.f2657k) {
            case 0:
                if (aVar.f3616a == Number.class) {
                    return (C0182l) this.f2658l;
                }
                return null;
            case 1:
                if (aVar.f3616a == Object.class) {
                    return new C0183m(mVar, (F3.x) this.f2658l);
                }
                return null;
            default:
                Class cls = aVar.f3616a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (M) this.f2658l;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f2657k) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((M) this.f2658l) + "]";
            default:
                return super.toString();
        }
    }
}
