package J2;

import A0.C;
import P.AbstractC0329z;
import P.C0280a;
import P.P;
import Q2.C0397z0;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import java.util.ArrayList;
import u.t0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public Object f2693a;

    public a(int i) {
        switch (i) {
            case 1:
                this.f2693a = new C(9, this);
                break;
            case 2:
                this.f2693a = new ArrayList();
                break;
            case 3:
            default:
                C0397z0 c0397z0 = new C0397z0();
                this.f2693a = c0397z0;
                c0397z0.f5067d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
            case 4:
                this.f2693a = AbstractC0329z.t(Boolean.FALSE);
                break;
        }
    }

    public a a(Bundle bundle) {
        C0397z0 c0397z0 = (C0397z0) this.f2693a;
        c0397z0.getClass();
        c0397z0.f5065b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            c0397z0.f5067d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (g) this;
    }

    public abstract void b(m2.g gVar);

    public boolean c(P p5, Object obj) {
        ArrayList arrayList = p5.f4365a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof C0280a) {
                if (kotlin.jvm.internal.l.a(obj2, obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof P)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (c((P) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract String d();

    public abstract Object e();

    public abstract Object f();

    public abstract void h(Object obj);

    public abstract void i(t0 t0Var);

    public abstract void j();

    public abstract void k();

    public E3.a l() {
        return AbstractC0613Id.f9539a.b((C) this.f2693a);
    }

    public void g(P p5, Object obj) {
    }
}
