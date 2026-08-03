package h;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143a extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.ActionBarContainer f3117a;

    public C0143a(androidx.appcompat.widget.ActionBarContainer actionBarContainer) {
        this.f3117a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f3117a;
        if (actionBarContainer.f1988g) {
            android.graphics.drawable.Drawable drawable = actionBarContainer.f1987f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = actionBarContainer.f1985d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.graphics.drawable.Drawable drawable3 = actionBarContainer.f1986e;
        if (drawable3 == null || !actionBarContainer.f1989h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f3117a;
        if (actionBarContainer.f1988g) {
            android.graphics.drawable.Drawable drawable = actionBarContainer.f1987f;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = actionBarContainer.f1985d;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
