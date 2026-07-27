package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC1249v {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f10911a;

    /* renamed from: b, reason: collision with root package name */
    public int f10912b;

    /* renamed from: c, reason: collision with root package name */
    public View f10913c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f10914d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f10915e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f10916f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10917g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f10918h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f10919i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f10920j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f10921k;

    /* renamed from: l, reason: collision with root package name */
    public int f10922l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f10923m;

    public final void a(int i2) {
        View view;
        int i3 = this.f10912b ^ i2;
        this.f10912b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i6 = this.f10912b & 4;
                Toolbar toolbar = this.f10911a;
                if (i6 != 0) {
                    Drawable drawable = this.f10916f;
                    if (drawable == null) {
                        drawable = this.f10923m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i7 = i3 & 8;
            Toolbar toolbar2 = this.f10911a;
            if (i7 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f10918h);
                    toolbar2.setSubtitle(this.f10919i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f10913c) == null) {
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
        if ((this.f10912b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f10920j);
            Toolbar toolbar = this.f10911a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f10922l);
            } else {
                toolbar.setNavigationContentDescription(this.f10920j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f10912b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f10915e;
            if (drawable == null) {
                drawable = this.f10914d;
            }
        } else {
            drawable = this.f10914d;
        }
        this.f10911a.setLogo(drawable);
    }
}
