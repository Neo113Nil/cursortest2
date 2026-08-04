package A1;

import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.crypto.tink.shaded.protobuf.AbstractC0821a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: A1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0021h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f364a;

    public static AbstractC0021h c(C0.u uVar, int i7) {
        if (i7 == 0) {
            return new C0.o(uVar, 0);
        }
        if (i7 == 1) {
            return new C0.o(uVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public AbstractC0021h a(Bundle bundle, Class cls) {
        F2.L0 l7 = (F2.L0) this.f364a;
        l7.getClass();
        ((Bundle) l7.f2595g).putBundle(cls.getName(), bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            ((HashSet) l7.f2593e).remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return n();
    }

    public abstract AbstractC0821a b(AbstractC0821a abstractC0821a);

    public abstract int d(View view);

    public abstract int e(View view);

    public String f() {
        return (String) this.f364a;
    }

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public Map l() {
        return Collections.emptyMap();
    }

    public abstract AbstractC0821a m(AbstractC0829i abstractC0829i);

    public abstract AbstractC0021h n();

    public void o(Object obj, boolean z4) {
        Set set = (Set) this.f364a;
        int size = set.size();
        if (z4) {
            set.add(obj);
            if (size == 0) {
                j();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            k();
        }
    }

    public abstract void p(AbstractC0821a abstractC0821a);

    public AbstractC0021h(int i7) {
        switch (i7) {
            case 4:
                this.f364a = Collections.newSetFromMap(new IdentityHashMap());
                break;
            case 5:
            default:
                this.f364a = new Q0();
                break;
            case 6:
                F2.L0 l7 = new F2.L0();
                this.f364a = l7;
                ((HashSet) l7.f2593e).add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
        }
    }
}
