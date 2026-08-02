package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xd1 implements InterfaceC0295hq {

    /* JADX INFO: renamed from: a */
    public Toolbar f8896a;

    /* JADX INFO: renamed from: b */
    public int f8897b;

    /* JADX INFO: renamed from: c */
    public View f8898c;

    /* JADX INFO: renamed from: d */
    public Drawable f8899d;

    /* JADX INFO: renamed from: e */
    public Drawable f8900e;

    /* JADX INFO: renamed from: f */
    public Drawable f8901f;

    /* JADX INFO: renamed from: g */
    public boolean f8902g;

    /* JADX INFO: renamed from: h */
    public CharSequence f8903h;

    /* JADX INFO: renamed from: i */
    public CharSequence f8904i;

    /* JADX INFO: renamed from: j */
    public CharSequence f8905j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f8906k;

    /* JADX INFO: renamed from: l */
    public boolean f8907l;

    /* JADX INFO: renamed from: m */
    public C0603q2 f8908m;

    /* JADX INFO: renamed from: n */
    public int f8909n;

    /* JADX INFO: renamed from: o */
    public Drawable f8910o;

    /* JADX INFO: renamed from: a */
    public final void m5621a(int i) {
        View view;
        Toolbar toolbar = this.f8896a;
        int i2 = this.f8897b ^ i;
        this.f8897b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m5622b();
                }
                if ((this.f8897b & 4) != 0) {
                    Drawable drawable = this.f8901f;
                    if (drawable == null) {
                        drawable = this.f8910o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m5623c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f8903h);
                    toolbar.setSubtitle(this.f8904i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f8898c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5622b() {
        if ((this.f8897b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f8905j);
            Toolbar toolbar = this.f8896a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f8909n);
            } else {
                toolbar.setNavigationContentDescription(this.f8905j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5623c() {
        Drawable drawable;
        int i = this.f8897b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f8900e) == null) {
            drawable = this.f8899d;
        }
        this.f8896a.setLogo(drawable);
    }
}
