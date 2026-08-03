package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ActionMenuItemView extends h.C0161t implements g.q, android.view.View.OnClickListener, h.InterfaceC0152j {

    /* renamed from: e, reason: collision with root package name */
    public g.k f1953e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f1954f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f1955g;

    /* renamed from: h, reason: collision with root package name */
    public g.i f1956h;

    /* renamed from: i, reason: collision with root package name */
    public g.a f1957i;

    /* renamed from: j, reason: collision with root package name */
    public g.b f1958j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1959k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1960l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1961m;

    /* renamed from: n, reason: collision with root package name */
    public int f1962n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1963o;

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        android.content.res.Resources resources = context.getResources();
        this.f1959k = e();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.AbstractC0095a.f2534c, 0, 0);
        this.f1961m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1963o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1962n = -1;
        setSaveEnabled(false);
    }

    @Override // h.InterfaceC0152j
    public final boolean a() {
        return !android.text.TextUtils.isEmpty(getText());
    }

    @Override // h.InterfaceC0152j
    public final boolean b() {
        return !android.text.TextUtils.isEmpty(getText()) && this.f1953e.getIcon() == null;
    }

    @Override // g.q
    public final void c(g.k kVar) {
        this.f1953e = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f2981a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f1957i == null) {
            this.f1957i = new g.a(this);
        }
    }

    public final boolean e() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z2 = true;
        boolean z3 = !android.text.TextUtils.isEmpty(this.f1954f);
        if (this.f1955g != null && ((this.f1953e.f3004y & 4) != 4 || (!this.f1959k && !this.f1960l))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1954f : null);
        java.lang.CharSequence charSequence = this.f1953e.f2997q;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1953e.f2985e);
        } else {
            setContentDescription(charSequence);
        }
        java.lang.CharSequence charSequence2 = this.f1953e.f2998r;
        if (android.text.TextUtils.isEmpty(charSequence2)) {
            u0.AbstractC0995a.z(this, z4 ? null : this.f1953e.f2985e);
        } else {
            u0.AbstractC0995a.z(this, charSequence2);
        }
    }

    @Override // g.q
    public g.k getItemData() {
        return this.f1953e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        g.i iVar = this.f1956h;
        if (iVar != null) {
            iVar.a(this.f1953e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1959k = e();
        f();
    }

    @Override // h.C0161t, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean isEmpty = android.text.TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.f1962n) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f1961m;
        int min = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < min) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!isEmpty || this.f1955g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1955g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        g.a aVar;
        if (this.f1953e.hasSubMenu() && (aVar = this.f1957i) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1960l != z2) {
            this.f1960l = z2;
            g.k kVar = this.f1953e;
            if (kVar != null) {
                g.j jVar = kVar.f2994n;
                jVar.f2970k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f1955g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1963o;
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

    public void setItemInvoker(g.i iVar) {
        this.f1956h = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f1962n = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(g.b bVar) {
        this.f1958j = bVar;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f1954f = charSequence;
        f();
    }
}
