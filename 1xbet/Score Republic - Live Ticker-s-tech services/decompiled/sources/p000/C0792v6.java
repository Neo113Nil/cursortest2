package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: v6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0792v6 extends zi0 implements InterfaceC0866x6 {

    /* JADX INFO: renamed from: I */
    public CharSequence f8101I;

    /* JADX INFO: renamed from: J */
    public C0681s6 f8102J;

    /* JADX INFO: renamed from: K */
    public final Rect f8103K;

    /* JADX INFO: renamed from: L */
    public int f8104L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ C0903y6 f8105M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0792v6(C0903y6 c0903y6, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f8105M = c0903y6;
        this.f8103K = new Rect();
        this.f9794x = c0903y6;
        this.f9778G = true;
        this.f9779H.setFocusable(true);
        this.f9795y = new C0718t6(this);
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: e */
    public final void mo4260e(CharSequence charSequence) {
        this.f8101I = charSequence;
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: k */
    public final void mo4263k(int i) {
        this.f8104L = i;
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: m */
    public final void mo4265m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0275h6 c0275h6 = this.f9779H;
        boolean zIsShowing = c0275h6.isShowing();
        m5103s();
        c0275h6.setInputMethodMode(2);
        mo3217c();
        C0151dv c0151dv = this.f9782l;
        c0151dv.setChoiceMode(1);
        c0151dv.setTextDirection(i);
        c0151dv.setTextAlignment(i2);
        C0903y6 c0903y6 = this.f8105M;
        int selectedItemPosition = c0903y6.getSelectedItemPosition();
        C0151dv c0151dv2 = this.f9782l;
        if (c0275h6.isShowing() && c0151dv2 != null) {
            c0151dv2.setListSelectionHidden(false);
            c0151dv2.setSelection(selectedItemPosition);
            if (c0151dv2.getChoiceMode() != 0) {
                c0151dv2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c0903y6.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0570p6 viewTreeObserverOnGlobalLayoutListenerC0570p6 = new ViewTreeObserverOnGlobalLayoutListenerC0570p6(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0570p6);
        c0275h6.setOnDismissListener(new C0755u6(this, viewTreeObserverOnGlobalLayoutListenerC0570p6));
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: o */
    public final CharSequence mo4267o() {
        return this.f8101I;
    }

    @Override // p000.zi0, p000.InterfaceC0866x6
    /* JADX INFO: renamed from: p */
    public final void mo4268p(ListAdapter listAdapter) {
        super.mo4268p(listAdapter);
        this.f8102J = (C0681s6) listAdapter;
    }

    /* JADX INFO: renamed from: s */
    public final void m5103s() {
        int i;
        C0275h6 c0275h6 = this.f9779H;
        Drawable background = c0275h6.getBackground();
        C0903y6 c0903y6 = this.f8105M;
        Rect rect = c0903y6.f9187q;
        if (background != null) {
            background.getPadding(rect);
            i = c0903y6.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c0903y6.getPaddingLeft();
        int paddingRight = c0903y6.getPaddingRight();
        int width = c0903y6.getWidth();
        int i2 = c0903y6.f9186p;
        if (i2 == -2) {
            int iM5741a = c0903y6.m5741a(this.f8102J, c0275h6.getBackground());
            int i3 = (c0903y6.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM5741a > i3) {
                iM5741a = i3;
            }
            m5917r(Math.max(iM5741a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m5917r((width - paddingLeft) - paddingRight);
        } else {
            m5917r(i2);
        }
        this.f9785o = c0903y6.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f9784n) - this.f8104L) + i : paddingLeft + this.f8104L + i;
    }
}
