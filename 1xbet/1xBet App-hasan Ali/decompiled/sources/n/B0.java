package n;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class B0 implements InterfaceC2118L {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f18120a;

    /* renamed from: b, reason: collision with root package name */
    public int f18121b;

    /* renamed from: c, reason: collision with root package name */
    public View f18122c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f18123d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f18124e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18125g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f18126h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f18127j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f18128k;

    /* renamed from: l, reason: collision with root package name */
    public int f18129l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f18130m;

    public final void a(int i) {
        View view;
        int i5 = this.f18121b ^ i;
        this.f18121b = i;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i6 = this.f18121b & 4;
                Toolbar toolbar = this.f18120a;
                if (i6 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.f18130m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            int i7 = i5 & 8;
            Toolbar toolbar2 = this.f18120a;
            if (i7 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f18126h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f18122c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f18121b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f18127j);
            Toolbar toolbar = this.f18120a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f18129l);
            } else {
                toolbar.setNavigationContentDescription(this.f18127j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f18121b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f18124e;
            if (drawable == null) {
                drawable = this.f18123d;
            }
        } else {
            drawable = this.f18123d;
        }
        this.f18120a.setLogo(drawable);
    }
}
