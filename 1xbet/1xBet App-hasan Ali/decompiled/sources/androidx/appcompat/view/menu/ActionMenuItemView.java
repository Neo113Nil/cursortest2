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
import h.AbstractC1986a;
import m.AbstractC2064b;
import m.InterfaceC2069g;
import m.InterfaceC2077o;
import m.MenuC2070h;
import m.MenuItemC2071i;
import m.ViewOnTouchListenerC2063a;
import n.C2111E;
import n.InterfaceC2141k;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C2111E implements InterfaceC2077o, View.OnClickListener, InterfaceC2141k {

    /* renamed from: A, reason: collision with root package name */
    public int f6652A;

    /* renamed from: B, reason: collision with root package name */
    public final int f6653B;

    /* renamed from: r, reason: collision with root package name */
    public MenuItemC2071i f6654r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f6655s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f6656t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC2069g f6657u;

    /* renamed from: v, reason: collision with root package name */
    public ViewOnTouchListenerC2063a f6658v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC2064b f6659w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6660x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6661y;

    /* renamed from: z, reason: collision with root package name */
    public final int f6662z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f6660x = q();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1986a.f17171c, 0, 0);
        this.f6662z = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f6653B = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f6652A = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC2077o
    public final void a(MenuItemC2071i menuItemC2071i) {
        this.f6654r = menuItemC2071i;
        setIcon(menuItemC2071i.getIcon());
        setTitle(menuItemC2071i.getTitleCondensed());
        setId(menuItemC2071i.f17926a);
        setVisibility(menuItemC2071i.isVisible() ? 0 : 8);
        setEnabled(menuItemC2071i.isEnabled());
        if (menuItemC2071i.hasSubMenu() && this.f6658v == null) {
            this.f6658v = new ViewOnTouchListenerC2063a(this);
        }
    }

    @Override // n.InterfaceC2141k
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // n.InterfaceC2141k
    public final boolean d() {
        return !TextUtils.isEmpty(getText()) && this.f6654r.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // m.InterfaceC2077o
    public MenuItemC2071i getItemData() {
        return this.f6654r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2069g interfaceC2069g = this.f6657u;
        if (interfaceC2069g != null) {
            interfaceC2069g.a(this.f6654r);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6660x = q();
        s();
    }

    @Override // n.C2111E, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.f6652A) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i5);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f6662z;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (!isEmpty || this.f6656t == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f6656t.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC2063a viewOnTouchListenerC2063a;
        if (this.f6654r.hasSubMenu() && (viewOnTouchListenerC2063a = this.f6658v) != null && viewOnTouchListenerC2063a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean q() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i5 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void s() {
        boolean z3 = true;
        boolean z5 = !TextUtils.isEmpty(this.f6655s);
        if (this.f6656t != null && ((this.f6654r.f17948y & 4) != 4 || (!this.f6660x && !this.f6661y))) {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        setText(z6 ? this.f6655s : null);
        CharSequence charSequence = this.f6654r.f17940q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f6654r.f17930e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f6654r.f17941r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC2346c.E(this, z6 ? null : this.f6654r.f17930e);
        } else {
            AbstractC2346c.E(this, charSequence2);
        }
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f6661y != z3) {
            this.f6661y = z3;
            MenuItemC2071i menuItemC2071i = this.f6654r;
            if (menuItemC2071i != null) {
                MenuC2070h menuC2070h = menuItemC2071i.f17937n;
                menuC2070h.f17913k = true;
                menuC2070h.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f6656t = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f6653B;
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
        s();
    }

    public void setItemInvoker(InterfaceC2069g interfaceC2069g) {
        this.f6657u = interfaceC2069g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i5, int i6, int i7) {
        this.f6652A = i;
        super.setPadding(i, i5, i6, i7);
    }

    public void setPopupCallback(AbstractC2064b abstractC2064b) {
        this.f6659w = abstractC2064b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f6655s = charSequence;
        s();
    }
}
