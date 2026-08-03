package h;

/* renamed from: h.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0159q extends android.widget.ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final h.C0156n f3237a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.e f3238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159q(android.content.Context context, int i2) {
        super(context, null, i2);
        h.g0.a(context);
        h.C0156n c0156n = new h.C0156n(this);
        this.f3237a = c0156n;
        c0156n.b(null, i2);
        x0.e eVar = new x0.e(this);
        this.f3238b = eVar;
        eVar.s(i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h.C0156n c0156n = this.f3237a;
        if (c0156n != null) {
            c0156n.a();
        }
        x0.e eVar = this.f3238b;
        if (eVar != null) {
            eVar.m();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        I1.h hVar;
        h.C0156n c0156n = this.f3237a;
        if (c0156n == null || (hVar = c0156n.f3204e) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) hVar.f725c;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        I1.h hVar;
        h.C0156n c0156n = this.f3237a;
        if (c0156n == null || (hVar = c0156n.f3204e) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) hVar.f726d;
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
        I1.h hVar;
        x0.e eVar = this.f3238b;
        if (eVar == null || (hVar = (I1.h) eVar.f8410c) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) hVar.f725c;
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
        I1.h hVar;
        x0.e eVar = this.f3238b;
        if (eVar == null || (hVar = (I1.h) eVar.f8410c) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) hVar.f726d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((android.widget.ImageView) this.f3238b.f8409b).getBackground() instanceof android.graphics.drawable.RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h.C0156n c0156n = this.f3237a;
        if (c0156n != null) {
            c0156n.f3202c = -1;
            c0156n.d(null);
            c0156n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        h.C0156n c0156n = this.f3237a;
        if (c0156n != null) {
            c0156n.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        x0.e eVar = this.f3238b;
        if (eVar != null) {
            eVar.m();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        x0.e eVar = this.f3238b;
        if (eVar != null) {
            eVar.m();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        x0.e eVar = this.f3238b;
        if (eVar != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) eVar.f8409b;
            if (i2 != 0) {
                android.graphics.drawable.Drawable a2 = d.AbstractC0106a.a(imageView.getContext(), i2);
                if (a2 != null) {
                    android.graphics.Rect rect = h.AbstractC0165x.f3277a;
                }
                imageView.setImageDrawable(a2);
            } else {
                imageView.setImageDrawable(null);
            }
            eVar.m();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        x0.e eVar = this.f3238b;
        if (eVar != null) {
            eVar.m();
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        h.C0156n c0156n = this.f3237a;
        if (c0156n != null) {
            c0156n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        h.C0156n c0156n = this.f3237a;
        if (c0156n != null) {
            c0156n.f(mode);
        }
    }

    public void setSupportImageTintList(android.content.res.ColorStateList colorStateList) {
        x0.e eVar = this.f3238b;
        if (eVar != null) {
            if (((I1.h) eVar.f8410c) == null) {
                eVar.f8410c = new I1.h();
            }
            I1.h hVar = (I1.h) eVar.f8410c;
            hVar.f725c = colorStateList;
            hVar.f724b = true;
            eVar.m();
        }
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode) {
        x0.e eVar = this.f3238b;
        if (eVar != null) {
            if (((I1.h) eVar.f8410c) == null) {
                eVar.f8410c = new I1.h();
            }
            I1.h hVar = (I1.h) eVar.f8410c;
            hVar.f726d = mode;
            hVar.f723a = true;
            eVar.m();
        }
    }
}
