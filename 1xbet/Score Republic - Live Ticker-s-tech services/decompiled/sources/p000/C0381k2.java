package p000;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: k2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0381k2 extends w40 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f4255s = 0;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ View f4256t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381k2(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f4256t = actionMenuItemView;
    }

    @Override // p000.w40
    /* JADX INFO: renamed from: b */
    public final t71 mo2980b() {
        C0455m2 c0455m2;
        int i = this.f4255s;
        View view = this.f4256t;
        switch (i) {
            case 0:
                AbstractC0418l2 abstractC0418l2 = ((ActionMenuItemView) view).f305u;
                if (abstractC0418l2 == null || (c0455m2 = ((C0492n2) abstractC0418l2).f5259a.f6320C) == null) {
                    return null;
                }
                return c0455m2.m5813a();
            default:
                C0455m2 c0455m3 = ((C0566p2) view).f5965m.f6319B;
                if (c0455m3 == null) {
                    return null;
                }
                return c0455m3.m5813a();
        }
    }

    @Override // p000.w40
    /* JADX INFO: renamed from: c */
    public final boolean mo2981c() {
        t71 t71VarMo2980b;
        int i = this.f4255s;
        View view = this.f4256t;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                nn0 nn0Var = actionMenuItemView.f303s;
                return nn0Var != null && nn0Var.mo334a(actionMenuItemView.f300p) && (t71VarMo2980b = mo2980b()) != null && t71VarMo2980b.mo3216a();
            default:
                ((C0566p2) view).f5965m.m4028l();
                return true;
        }
    }

    @Override // p000.w40
    /* JADX INFO: renamed from: d */
    public boolean mo2982d() {
        switch (this.f4255s) {
            case 1:
                C0603q2 c0603q2 = ((C0566p2) this.f4256t).f5965m;
                if (c0603q2.f6321D != null) {
                    return false;
                }
                c0603q2.m4026c();
                return true;
            default:
                return super.mo2982d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381k2(C0566p2 c0566p2, C0566p2 c0566p3) {
        super(c0566p3);
        this.f4256t = c0566p2;
    }
}
