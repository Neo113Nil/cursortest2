package h;

/* loaded from: classes.dex */
public final class n0 implements h.InterfaceC0164w {

    /* renamed from: a, reason: collision with root package name */
    public androidx.appcompat.widget.Toolbar f3206a;

    /* renamed from: b, reason: collision with root package name */
    public int f3207b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f3208c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f3209d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f3210e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f3211f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3212g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f3213h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f3214i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f3215j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.Window.Callback f3216k;

    /* renamed from: l, reason: collision with root package name */
    public int f3217l;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f3218m;

    public final void a(int i2) {
        android.view.View view;
        int i3 = this.f3207b ^ i2;
        this.f3207b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.f3207b & 4;
                androidx.appcompat.widget.Toolbar toolbar = this.f3206a;
                if (i4 != 0) {
                    android.graphics.drawable.Drawable drawable = this.f3211f;
                    if (drawable == null) {
                        drawable = this.f3218m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i5 = i3 & 8;
            androidx.appcompat.widget.Toolbar toolbar2 = this.f3206a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f3213h);
                    toolbar2.setSubtitle(this.f3214i);
                } else {
                    toolbar2.setTitle((java.lang.CharSequence) null);
                    toolbar2.setSubtitle((java.lang.CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f3208c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f3207b & 4) != 0) {
            boolean isEmpty = android.text.TextUtils.isEmpty(this.f3215j);
            androidx.appcompat.widget.Toolbar toolbar = this.f3206a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3217l);
            } else {
                toolbar.setNavigationContentDescription(this.f3215j);
            }
        }
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable;
        int i2 = this.f3207b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f3210e;
            if (drawable == null) {
                drawable = this.f3209d;
            }
        } else {
            drawable = this.f3209d;
        }
        this.f3206a.setLogo(drawable);
    }
}
