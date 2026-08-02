package p000;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g90 {

    /* JADX INFO: renamed from: a */
    public final Context f2657a;

    /* JADX INFO: renamed from: b */
    public final String f2658b;

    /* JADX INFO: renamed from: c */
    public final nu1 f2659c;

    /* JADX INFO: renamed from: d */
    public final C0312i6 f2660d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0420l4 f2661e;

    /* JADX INFO: renamed from: f */
    public final C0679s4 f2662f;

    /* JADX INFO: renamed from: g */
    public final Looper f2663g;

    /* JADX INFO: renamed from: h */
    public final int f2664h;

    /* JADX INFO: renamed from: i */
    public final o31 f2665i;

    /* JADX INFO: renamed from: j */
    public final l90 f2666j;

    public g90(Context context, C0312i6 c0312i6, InterfaceC0420l4 interfaceC0420l4, f90 f90Var) {
        p80.m3864i(context, "Null context is not permitted.");
        p80.m3864i(c0312i6, "Api must not be null.");
        p80.m3864i(f90Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        p80.m3864i(applicationContext, "The provided context did not have an application context.");
        this.f2657a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = (i < 30 || i < 30) ? null : context.getAttributionTag();
        this.f2658b = attributionTag;
        this.f2659c = i >= 31 ? new nu1(9, context.getAttributionSource()) : null;
        this.f2660d = c0312i6;
        this.f2661e = interfaceC0420l4;
        this.f2663g = f90Var.f2352b;
        this.f2662f = new C0679s4(c0312i6, interfaceC0420l4, attributionTag);
        l90 l90VarM3191c = l90.m3191c(applicationContext);
        this.f2666j = l90VarM3191c;
        this.f2664h = l90VarM3191c.f4729h.getAndIncrement();
        this.f2665i = f90Var.f2351a;
        bm1 bm1Var = l90VarM3191c.f4734m;
        bm1Var.sendMessage(bm1Var.obtainMessage(7, this));
    }

    /* JADX INFO: renamed from: a */
    public final qd0 m2001a() {
        qd0 qd0Var = new qd0(9);
        Set set = Collections.EMPTY_SET;
        if (((C0165e8) qd0Var.f6471k) == null) {
            qd0Var.f6471k = new C0165e8();
        }
        ((C0165e8) qd0Var.f6471k).addAll(set);
        Context context = this.f2657a;
        qd0Var.f6473m = context.getClass().getName();
        qd0Var.f6472l = context.getPackageName();
        return qd0Var;
    }

    /* JADX INFO: renamed from: b */
    public final v92 m2002b(int i, m81 m81Var) {
        qc1 qc1Var = new qc1();
        l90 l90Var = this.f2666j;
        l90Var.getClass();
        kl1 kl1Var = new kl1(new ul1(i, m81Var, qc1Var, this.f2665i), l90Var.f4730i.get(), this);
        bm1 bm1Var = l90Var.f4734m;
        bm1Var.sendMessage(bm1Var.obtainMessage(4, kl1Var));
        return qc1Var.f6465a;
    }
}
