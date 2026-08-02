package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sd1 implements eo0 {

    /* JADX INFO: renamed from: j */
    public on0 f7098j;

    /* JADX INFO: renamed from: k */
    public rn0 f7099k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Toolbar f7100l;

    public sd1(Toolbar toolbar) {
        this.f7100l = toolbar;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: d */
    public final boolean mo1482d(rn0 rn0Var) {
        Toolbar toolbar = this.f7100l;
        KeyEvent.Callback callback = toolbar.f450r;
        if (callback instanceof InterfaceC0434li) {
            ((tn0) ((InterfaceC0434li) callback)).f7535j.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f450r);
        toolbar.removeView(toolbar.f449q);
        toolbar.f450r = null;
        ArrayList arrayList = toolbar.f429N;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f7099k = null;
        toolbar.requestLayout();
        rn0Var.f6902L = false;
        rn0Var.f6916w.m3712p(false);
        toolbar.m383t();
        return true;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: f */
    public final boolean mo1484f(rn0 rn0Var) {
        Toolbar toolbar = this.f7100l;
        toolbar.m370c();
        ViewParent parent = toolbar.f449q.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f449q);
            }
            toolbar.addView(toolbar.f449q);
        }
        View actionView = rn0Var.getActionView();
        toolbar.f450r = actionView;
        this.f7099k = rn0Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f450r);
            }
            td1 td1VarM364h = Toolbar.m364h();
            td1VarM364h.f7437a = (toolbar.f455w & 112) | 8388611;
            td1VarM364h.f7438b = 2;
            toolbar.f450r.setLayoutParams(td1VarM364h);
            toolbar.addView(toolbar.f450r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((td1) childAt.getLayoutParams()).f7438b != 2 && childAt != toolbar.f442j) {
                toolbar.removeViewAt(childCount);
                toolbar.f429N.add(childAt);
            }
        }
        toolbar.requestLayout();
        rn0Var.f6902L = true;
        rn0Var.f6916w.m3712p(false);
        KeyEvent.Callback callback = toolbar.f450r;
        if (callback instanceof InterfaceC0434li) {
            ((tn0) ((InterfaceC0434li) callback)).f7535j.onActionViewExpanded();
        }
        toolbar.m383t();
        return true;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: g */
    public final void mo1485g() {
        if (this.f7099k != null) {
            on0 on0Var = this.f7098j;
            if (on0Var != null) {
                int size = on0Var.f5804o.size();
                for (int i = 0; i < size; i++) {
                    if (this.f7098j.getItem(i) == this.f7099k) {
                        return;
                    }
                }
            }
            mo1482d(this.f7099k);
        }
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: h */
    public final void mo1486h(Context context, on0 on0Var) {
        rn0 rn0Var;
        on0 on0Var2 = this.f7098j;
        if (on0Var2 != null && (rn0Var = this.f7099k) != null) {
            on0Var2.mo2016d(rn0Var);
        }
        this.f7098j = on0Var;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: j */
    public final boolean mo1487j(gb1 gb1Var) {
        return false;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: k */
    public final boolean mo1488k() {
        return false;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: b */
    public final void mo1481b(on0 on0Var, boolean z) {
    }
}
