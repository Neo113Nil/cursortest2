package androidx.appcompat.view.menu;

import P6.b;
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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0619h;
import androidx.appcompat.widget.InterfaceC0625k;
import p051h.a;
import p086m.AbstractC0925b;
import p086m.j;
import p086m.k;
import p086m.m;
import p086m.y;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements y, View.OnClickListener, InterfaceC0625k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f8144A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public j f8145B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0619h f8146C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AbstractC0925b f8147D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f8148E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f8149F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f8150G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f8151H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f8152I;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m f8153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f8154z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // p086m.y
    public final void a(m mVar) {
        this.f8153y = mVar;
        setIcon(mVar.getIcon());
        setTitle(mVar.getTitleCondensed());
        setId(mVar.f15176a);
        setVisibility(mVar.isVisible() ? 0 : 8);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.f8146C == null) {
            this.f8146C = new C0619h(this);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0625k
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.InterfaceC0625k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f8153y.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        return i7 >= 480 || (i7 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p086m.y
    public m getItemData() {
        return this.f8153y;
    }

    public final void h() {
        boolean z4 = true;
        boolean z7 = !TextUtils.isEmpty(this.f8154z);
        if (this.f8144A != null && ((this.f8153y.f15171P & 4) != 4 || (!this.f8148E && !this.f8149F))) {
            z4 = false;
        }
        boolean z8 = z7 & z4;
        setText(z8 ? this.f8154z : null);
        CharSequence charSequence = this.f8153y.f15163H;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z8 ? null : this.f8153y.f15180e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f8153y.f15164I;
        if (TextUtils.isEmpty(charSequence2)) {
            b.I(this, z8 ? null : this.f8153y.f15180e);
        } else {
            b.I(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f8145B;
        if (jVar != null) {
            jVar.b(this.f8153y);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8148E = g();
        h();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i9 = this.f8151H) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f8150G;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i10) : i10;
        if (mode != 1073741824 && i10 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i8);
        }
        if (!zIsEmpty || this.f8144A == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f8144A.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0619h c0619h;
        if (this.f8153y.hasSubMenu() && (c0619h = this.f8146C) != null && c0619h.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f8149F != z4) {
            this.f8149F = z4;
            m mVar = this.f8153y;
            if (mVar != null) {
                k kVar = mVar.f15160E;
                kVar.f15129B = true;
                kVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8144A = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f8152I;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(j jVar) {
        this.f8145B = jVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
        this.f8151H = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(AbstractC0925b abstractC0925b) {
        this.f8147D = abstractC0925b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f8154z = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.f8148E = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f13331c, i7, 0);
        this.f8150G = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f8152I = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f8151H = -1;
        setSaveEnabled(false);
    }
}
