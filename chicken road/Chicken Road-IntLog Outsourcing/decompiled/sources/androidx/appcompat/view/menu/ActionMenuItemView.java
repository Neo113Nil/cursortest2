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
import g.AbstractC0444a;
import k.AbstractC1202b;
import k.ViewOnTouchListenerC1201a;
import k.h;
import k.i;
import k.j;
import k.p;
import l.C1246s;
import l.InterfaceC1238j;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1246s implements p, View.OnClickListener, InterfaceC1238j {

    /* renamed from: e, reason: collision with root package name */
    public j f4080e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4081f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f4082g;

    /* renamed from: h, reason: collision with root package name */
    public h f4083h;

    /* renamed from: i, reason: collision with root package name */
    public ViewOnTouchListenerC1201a f4084i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC1202b f4085j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4086k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4087l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4088m;

    /* renamed from: n, reason: collision with root package name */
    public int f4089n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4090o;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4086k = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0444a.f5695c, 0, 0);
        this.f4088m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f4090o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4089n = -1;
        setSaveEnabled(false);
    }

    @Override // k.p
    public final void a(j jVar) {
        this.f4080e = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f10608a);
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f4084i == null) {
            this.f4084i = new ViewOnTouchListenerC1201a(this);
        }
    }

    @Override // l.InterfaceC1238j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC1238j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f4080e.getIcon() == null;
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z = true;
        boolean z5 = !TextUtils.isEmpty(this.f4081f);
        if (this.f4082g != null && ((this.f4080e.f10632y & 4) != 4 || (!this.f4086k && !this.f4087l))) {
            z = false;
        }
        boolean z6 = z5 & z;
        setText(z6 ? this.f4081f : null);
        CharSequence charSequence = this.f4080e.f10624q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f4080e.f10612e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4080e.f10625r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC1477a.z(this, z6 ? null : this.f4080e.f10612e);
        } else {
            AbstractC1477a.z(this, charSequence2);
        }
    }

    @Override // k.p
    public j getItemData() {
        return this.f4080e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f4083h;
        if (hVar != null) {
            hVar.a(this.f4080e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4086k = e();
        f();
    }

    @Override // l.C1246s, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.f4089n) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f4088m;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!isEmpty || this.f4082g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4082g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC1201a viewOnTouchListenerC1201a;
        if (this.f4080e.hasSubMenu() && (viewOnTouchListenerC1201a = this.f4084i) != null && viewOnTouchListenerC1201a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f4087l != z) {
            this.f4087l = z;
            j jVar = this.f4080e;
            if (jVar != null) {
                i iVar = jVar.f10621n;
                iVar.f10596k = true;
                iVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4082g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f4090o;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(h hVar) {
        this.f4083h = hVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i6, int i7) {
        this.f4089n = i2;
        super.setPadding(i2, i3, i6, i7);
    }

    public void setPopupCallback(AbstractC1202b abstractC1202b) {
        this.f4085j = abstractC1202b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4081f = charSequence;
        f();
    }
}
