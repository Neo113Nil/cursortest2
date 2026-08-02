package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: renamed from: d6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0127d6 extends ImageButton {

    /* JADX INFO: renamed from: j */
    public final C0864x4 f1562j;

    /* JADX INFO: renamed from: k */
    public final C0163e6 f1563k;

    /* JADX INFO: renamed from: l */
    public boolean f1564l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0127d6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        md1.m3376a(context);
        this.f1564l = false;
        zc1.m5876a(this, getContext());
        C0864x4 c0864x4 = new C0864x4(this);
        this.f1562j = c0864x4;
        c0864x4.m5518d(attributeSet, i);
        C0163e6 c0163e6 = new C0163e6(this);
        this.f1563k = c0163e6;
        c0163e6.m1370e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0864x4 c0864x4 = this.f1562j;
        if (c0864x4 != null) {
            c0864x4.m5515a();
        }
        C0163e6 c0163e6 = this.f1563k;
        if (c0163e6 != null) {
            c0163e6.m1368c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0864x4 c0864x4 = this.f1562j;
        if (c0864x4 != null) {
            return c0864x4.m5516b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0864x4 c0864x4 = this.f1562j;
        if (c0864x4 != null) {
            return c0864x4.m5517c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0290hl c0290hl;
        C0163e6 c0163e6 = this.f1563k;
        if (c0163e6 == null || (c0290hl = (C0290hl) c0163e6.f1966m) == null) {
            return null;
        }
        return (ColorStateList) c0290hl.f3255c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0290hl c0290hl;
        C0163e6 c0163e6 = this.f1563k;
        if (c0163e6 == null || (c0290hl = (C0290hl) c0163e6.f1966m) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0290hl.f3256d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f1563k.f1965l).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0864x4 c0864x4 = this.f1562j;
        if (c0864x4 != null) {
            c0864x4.m5519e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0864x4 c0864x4 = this.f1562j;
        if (c0864x4 != null) {
            c0864x4.m5520f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0163e6 c0163e6 = this.f1563k;
        if (c0163e6 != null) {
            c0163e6.m1368c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0163e6 c0163e6 = this.f1563k;
        if (c0163e6 != null && drawable != null && !this.f1564l) {
            c0163e6.f1964k = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0163e6 != null) {
            c0163e6.m1368c();
            if (this.f1564l) {
                return;
            }
            ImageView imageView = (ImageView) c0163e6.f1965l;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0163e6.f1964k);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1564l = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0163e6 c0163e6 = this.f1563k;
        ImageView imageView = (ImageView) c0163e6.f1965l;
        if (i != 0) {
            Drawable drawableM2807p = j22.m2807p(imageView.getContext(), i);
            if (drawableM2807p != null) {
                AbstractC0890xu.m5688a(drawableM2807p);
            }
            imageView.setImageDrawable(drawableM2807p);
        } else {
            imageView.setImageDrawable(null);
        }
        c0163e6.m1368c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0163e6 c0163e6 = this.f1563k;
        if (c0163e6 != null) {
            c0163e6.m1368c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0864x4 c0864x4 = this.f1562j;
        if (c0864x4 != null) {
            c0864x4.m5522h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0864x4 c0864x4 = this.f1562j;
        if (c0864x4 != null) {
            c0864x4.m5523i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0163e6 c0163e6 = this.f1563k;
        if (c0163e6 != null) {
            if (((C0290hl) c0163e6.f1966m) == null) {
                c0163e6.f1966m = new C0290hl();
            }
            C0290hl c0290hl = (C0290hl) c0163e6.f1966m;
            c0290hl.f3255c = colorStateList;
            c0290hl.f3254b = true;
            c0163e6.m1368c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0163e6 c0163e6 = this.f1563k;
        if (c0163e6 != null) {
            if (((C0290hl) c0163e6.f1966m) == null) {
                c0163e6.f1966m = new C0290hl();
            }
            C0290hl c0290hl = (C0290hl) c0163e6.f1966m;
            c0290hl.f3256d = mode;
            c0290hl.f3253a = true;
            c0163e6.m1368c();
        }
    }
}
