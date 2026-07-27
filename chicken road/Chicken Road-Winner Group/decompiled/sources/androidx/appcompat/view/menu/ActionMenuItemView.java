package androidx.appcompat.view.menu;

import X0.a;
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
import g.AbstractC0301a;
import k.AbstractC1061b;
import k.InterfaceC1068i;
import k.InterfaceC1076q;
import k.MenuC1069j;
import k.MenuItemC1070k;
import k.ViewOnTouchListenerC1060a;
import l.C1101u;
import l.InterfaceC1091j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1101u implements InterfaceC1076q, View.OnClickListener, InterfaceC1091j {

    /* renamed from: e, reason: collision with root package name */
    public MenuItemC1070k f1894e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f1895g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1068i f1896h;

    /* renamed from: i, reason: collision with root package name */
    public ViewOnTouchListenerC1060a f1897i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC1061b f1898j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1899k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1900l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1901m;

    /* renamed from: n, reason: collision with root package name */
    public int f1902n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1903o;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1899k = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0301a.f4928c, 0, 0);
        this.f1901m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1903o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1902n = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC1076q
    public final void a(MenuItemC1070k menuItemC1070k) {
        this.f1894e = menuItemC1070k;
        setIcon(menuItemC1070k.getIcon());
        setTitle(menuItemC1070k.getTitleCondensed());
        setId(menuItemC1070k.f9601a);
        setVisibility(menuItemC1070k.isVisible() ? 0 : 8);
        setEnabled(menuItemC1070k.isEnabled());
        if (menuItemC1070k.hasSubMenu() && this.f1897i == null) {
            this.f1897i = new ViewOnTouchListenerC1060a(this);
        }
    }

    @Override // l.InterfaceC1091j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC1091j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f1894e.getIcon() == null;
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 < 480) {
            return (i3 >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void f() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f);
        if (this.f1895g != null && ((this.f1894e.y & 4) != 4 || (!this.f1899k && !this.f1900l))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f : null);
        CharSequence charSequence = this.f1894e.f9616q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z5 ? null : this.f1894e.f9605e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1894e.f9617r;
        if (TextUtils.isEmpty(charSequence2)) {
            a.J(this, z5 ? null : this.f1894e.f9605e);
        } else {
            a.J(this, charSequence2);
        }
    }

    @Override // k.InterfaceC1076q
    public MenuItemC1070k getItemData() {
        return this.f1894e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1068i interfaceC1068i = this.f1896h;
        if (interfaceC1068i != null) {
            interfaceC1068i.a(this.f1894e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1899k = e();
        f();
    }

    @Override // l.C1101u, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i5 = this.f1902n) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f1901m;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (!isEmpty || this.f1895g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1895g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC1060a viewOnTouchListenerC1060a;
        if (this.f1894e.hasSubMenu() && (viewOnTouchListenerC1060a = this.f1897i) != null && viewOnTouchListenerC1060a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f1900l != z3) {
            this.f1900l = z3;
            MenuItemC1070k menuItemC1070k = this.f1894e;
            if (menuItemC1070k != null) {
                MenuC1069j menuC1069j = menuItemC1070k.f9613n;
                menuC1069j.f9588k = true;
                menuC1069j.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1895g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f1903o;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(InterfaceC1068i interfaceC1068i) {
        this.f1896h = interfaceC1068i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.f1902n = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(AbstractC1061b abstractC1061b) {
        this.f1898j = abstractC1061b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f = charSequence;
        f();
    }
}
