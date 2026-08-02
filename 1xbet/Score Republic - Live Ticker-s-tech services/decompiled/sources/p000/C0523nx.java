package p000;

import android.content.Context;

/* JADX INFO: renamed from: nx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0523nx implements InterfaceC0968zy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5561a;

    /* JADX INFO: renamed from: b */
    public final ny0 f5562b;

    public /* synthetic */ C0523nx(ny0 ny0Var, int i) {
        this.f5561a = i;
        this.f5562b = ny0Var;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f5561a;
        ny0 ny0Var = this.f5562b;
        switch (i) {
            case 0:
                String packageName = ((Context) ny0Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                C0270h1.m2192h("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new u51(Integer.valueOf(u51.f7682m).intValue(), (Context) ny0Var.get(), "com.google.android.datatransport.events");
        }
    }
}
