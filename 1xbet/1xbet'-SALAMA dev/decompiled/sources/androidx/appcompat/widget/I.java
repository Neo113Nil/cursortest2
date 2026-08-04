package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class I extends ListPopupWindow implements K {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public CharSequence f8356S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public F f8357T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Rect f8358U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f8359V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f8360W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8360W = appCompatSpinner;
        this.f8358U = new Rect();
        this.f8387F = appCompatSpinner;
        this.f8396O = true;
        this.f8397P.setFocusable(true);
        this.f8388G = new G(this, 0);
    }

    @Override // androidx.appcompat.widget.K
    public final CharSequence f() {
        return this.f8356S;
    }

    @Override // androidx.appcompat.widget.K
    public final void i(CharSequence charSequence) {
        this.f8356S = charSequence;
    }

    @Override // androidx.appcompat.widget.K
    public final void l(int i7) {
        this.f8359V = i7;
    }

    @Override // androidx.appcompat.widget.K
    public final void m(int i7, int i8) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.f8397P;
        boolean zIsShowing = popupWindow.isShowing();
        r();
        this.f8397P.setInputMethodMode(2);
        show();
        C0628l0 c0628l0 = this.f8400c;
        c0628l0.setChoiceMode(1);
        C.d(c0628l0, i7);
        C.c(c0628l0, i8);
        AppCompatSpinner appCompatSpinner = this.f8360W;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C0628l0 c0628l1 = this.f8400c;
        if (popupWindow.isShowing() && c0628l1 != null) {
            c0628l1.setListSelectionHidden(false);
            c0628l1.setSelection(selectedItemPosition);
            if (c0628l1.getChoiceMode() != 0) {
                c0628l1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0635p viewTreeObserverOnGlobalLayoutListenerC0635p = new ViewTreeObserverOnGlobalLayoutListenerC0635p(this, 2);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0635p);
        this.f8397P.setOnDismissListener(new H(this, viewTreeObserverOnGlobalLayoutListenerC0635p));
    }

    @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.K
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f8357T = (F) listAdapter;
    }

    public final void r() {
        int i7;
        PopupWindow popupWindow = this.f8397P;
        Drawable background = popupWindow.getBackground();
        AppCompatSpinner appCompatSpinner = this.f8360W;
        if (background != null) {
            background.getPadding(appCompatSpinner.f8304y);
            boolean zA = q1.a(appCompatSpinner);
            Rect rect = appCompatSpinner.f8304y;
            i7 = zA ? rect.right : -rect.left;
        } else {
            Rect rect2 = appCompatSpinner.f8304y;
            rect2.right = 0;
            rect2.left = 0;
            i7 = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i8 = appCompatSpinner.f8303x;
        if (i8 == -2) {
            int iA = appCompatSpinner.a(this.f8357T, popupWindow.getBackground());
            int i9 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = appCompatSpinner.f8304y;
            int i10 = (i9 - rect3.left) - rect3.right;
            if (iA > i10) {
                iA = i10;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i8 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i8);
        }
        this.f8403f = q1.a(appCompatSpinner) ? (((width - paddingRight) - this.f8402e) - this.f8359V) + i7 : paddingLeft + this.f8359V + i7;
    }
}
