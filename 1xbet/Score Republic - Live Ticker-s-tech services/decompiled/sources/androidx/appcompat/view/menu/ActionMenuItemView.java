package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p000.AbstractC0418l2;
import p000.C0276h7;
import p000.C0381k2;
import p000.InterfaceC0640r2;
import p000.fo0;
import p000.mz0;
import p000.nn0;
import p000.on0;
import p000.rn0;
import p000.yd1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0276h7 implements fo0, View.OnClickListener, InterfaceC0640r2 {

    /* JADX INFO: renamed from: p */
    public rn0 f300p;

    /* JADX INFO: renamed from: q */
    public CharSequence f301q;

    /* JADX INFO: renamed from: r */
    public Drawable f302r;

    /* JADX INFO: renamed from: s */
    public nn0 f303s;

    /* JADX INFO: renamed from: t */
    public C0381k2 f304t;

    /* JADX INFO: renamed from: u */
    public AbstractC0418l2 f305u;

    /* JADX INFO: renamed from: v */
    public boolean f306v;

    /* JADX INFO: renamed from: w */
    public boolean f307w;

    /* JADX INFO: renamed from: x */
    public final int f308x;

    /* JADX INFO: renamed from: y */
    public int f309y;

    /* JADX INFO: renamed from: z */
    public final int f310z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f306v = m332e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mz0.f5189c, 0, 0);
        this.f308x = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f310z = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f309y = -1;
        setSaveEnabled(false);
    }

    @Override // p000.fo0
    /* JADX INFO: renamed from: a */
    public final void mo329a(rn0 rn0Var) {
        this.f300p = rn0Var;
        setIcon(rn0Var.getIcon());
        setTitle(rn0Var.getTitleCondensed());
        setId(rn0Var.f6903j);
        setVisibility(rn0Var.isVisible() ? 0 : 8);
        setEnabled(rn0Var.isEnabled());
        if (rn0Var.hasSubMenu() && this.f304t == null) {
            this.f304t = new C0381k2(this);
        }
    }

    @Override // p000.InterfaceC0640r2
    /* JADX INFO: renamed from: b */
    public final boolean mo330b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p000.InterfaceC0640r2
    /* JADX INFO: renamed from: c */
    public final boolean mo331c() {
        return !TextUtils.isEmpty(getText()) && this.f300p.getIcon() == null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m332e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m333f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f301q);
        if (this.f302r != null && ((this.f300p.f6898H & 4) != 4 || (!this.f306v && !this.f307w))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f301q : null);
        CharSequence charSequence = this.f300p.f6919z;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f300p.f6907n);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f300p.f6891A;
        if (TextUtils.isEmpty(charSequence2)) {
            yd1.m5788a(this, z3 ? null : this.f300p.f6907n);
        } else {
            yd1.m5788a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000.fo0
    public rn0 getItemData() {
        return this.f300p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nn0 nn0Var = this.f303s;
        if (nn0Var != null) {
            nn0Var.mo334a(this.f300p);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f306v = m332e();
        m333f();
    }

    @Override // p000.C0276h7, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f309y) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f308x;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f302r == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f302r.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0381k2 c0381k2;
        if (this.f300p.hasSubMenu() && (c0381k2 = this.f304t) != null && c0381k2.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f307w != z) {
            this.f307w = z;
            rn0 rn0Var = this.f300p;
            if (rn0Var != null) {
                on0 on0Var = rn0Var.f6916w;
                on0Var.f5809t = true;
                on0Var.m3712p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f302r = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f310z;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m333f();
    }

    public void setItemInvoker(nn0 nn0Var) {
        this.f303s = nn0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f309y = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0418l2 abstractC0418l2) {
        this.f305u = abstractC0418l2;
    }

    public void setTitle(CharSequence charSequence) {
        this.f301q = charSequence;
        m333f();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
