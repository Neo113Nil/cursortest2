package p000;

import android.content.Context;
import android.view.View;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: m2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0455m2 extends yn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4957l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0603q2 f4958m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0455m2(C0603q2 c0603q2, Context context, gb1 gb1Var, View view) {
        super(context, gb1Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f4958m = c0603q2;
        if ((gb1Var.f2685J.f6897G & 32) != 32) {
            View view2 = c0603q2.f6332r;
            this.f9400e = view2 == null ? (View) c0603q2.f6331q : view2;
        }
        b90 b90Var = c0603q2.f6323F;
        this.f9403h = b90Var;
        wn0 wn0Var = this.f9404i;
        if (wn0Var != null) {
            wn0Var.mo1483e(b90Var);
        }
    }

    @Override // p000.yn0
    /* JADX INFO: renamed from: c */
    public final void mo3323c() {
        int i = this.f4957l;
        C0603q2 c0603q2 = this.f4958m;
        switch (i) {
            case 0:
                c0603q2.f6320C = null;
                super.mo3323c();
                break;
            default:
                on0 on0Var = c0603q2.f6326l;
                if (on0Var != null) {
                    on0Var.m3707c(true);
                }
                c0603q2.f6319B = null;
                super.mo3323c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0455m2(C0603q2 c0603q2, Context context, on0 on0Var, View view) {
        super(context, on0Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f4958m = c0603q2;
        this.f9401f = 8388613;
        b90 b90Var = c0603q2.f6323F;
        this.f9403h = b90Var;
        wn0 wn0Var = this.f9404i;
        if (wn0Var != null) {
            wn0Var.mo1483e(b90Var);
        }
    }
}
