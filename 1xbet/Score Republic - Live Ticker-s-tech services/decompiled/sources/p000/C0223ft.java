package p000;

import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: renamed from: ft */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0223ft implements InterfaceC0551oo {

    /* JADX INFO: renamed from: j */
    public final Resources.Theme f2492j;

    /* JADX INFO: renamed from: k */
    public final Resources f2493k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC0261gt f2494l;

    /* JADX INFO: renamed from: m */
    public final int f2495m;

    /* JADX INFO: renamed from: n */
    public Object f2496n;

    public C0223ft(Resources.Theme theme, Resources resources, InterfaceC0261gt interfaceC0261gt, int i) {
        this.f2492j = theme;
        this.f2493k = resources;
        this.f2494l = interfaceC0261gt;
        this.f2495m = i;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        return this.f2494l.mo1476a();
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: d */
    public final void mo1072d() {
        Object obj = this.f2496n;
        if (obj != null) {
            try {
                this.f2494l.mo1477b(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: e */
    public final void mo1073e(ex0 ex0Var, InterfaceC0514no interfaceC0514no) {
        try {
            Object objMo1478c = this.f2494l.mo1478c(this.f2492j, this.f2493k, this.f2495m);
            this.f2496n = objMo1478c;
            interfaceC0514no.mo84h(objMo1478c);
        } catch (Resources.NotFoundException e) {
            interfaceC0514no.mo82f(e);
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: g */
    public final int mo1074g() {
        return 1;
    }

    @Override // p000.InterfaceC0551oo
    public final void cancel() {
    }
}
