package p000;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yy1 {

    /* JADX INFO: renamed from: a */
    public final String f9542a;

    /* JADX INFO: renamed from: b */
    public final boolean f9543b;

    /* JADX INFO: renamed from: c */
    public boolean f9544c;

    /* JADX INFO: renamed from: d */
    public boolean f9545d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fz1 f9546e;

    public yy1(fz1 fz1Var, String str, boolean z) {
        this.f9546e = fz1Var;
        p80.m3860e(str);
        this.f9542a = str;
        this.f9543b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5852a() {
        if (!this.f9544c) {
            this.f9544c = true;
            this.f9545d = this.f9546e.m1908E().getBoolean(this.f9542a, this.f9543b);
        }
        return this.f9545d;
    }

    /* JADX INFO: renamed from: b */
    public final void m5853b(boolean z) {
        SharedPreferences.Editor editorEdit = this.f9546e.m1908E().edit();
        editorEdit.putBoolean(this.f9542a, z);
        editorEdit.apply();
        this.f9545d = z;
    }
}
