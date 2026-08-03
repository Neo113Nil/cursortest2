package h;

/* renamed from: h.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166y extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.drawable.Drawable f3279a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3280b;

    public final void a(android.graphics.Canvas canvas) {
        this.f3279a.draw(canvas);
    }

    public final void b(float f2, float f3) {
        s.AbstractC0989a.e(this.f3279a, f2, f3);
    }

    public final void c(int i2, int i3, int i4, int i5) {
        s.AbstractC0989a.f(this.f3279a, i2, i3, i4, i5);
    }

    public final boolean d(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f3279a.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.f3280b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f3279a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable getCurrent() {
        return this.f3279a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f3279a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f3279a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f3279a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f3279a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f3279a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        return this.f3279a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f3279a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
        return this.f3279a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f3279a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f3279a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f3279a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        this.f3279a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        return this.f3279a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f3279a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f3279a.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i2) {
        this.f3279a.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f3279a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f3279a.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f3279a.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        if (this.f3280b) {
            b(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        if (this.f3280b) {
            c(i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f3280b) {
            return this.f3279a.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        s.AbstractC0989a.g(this.f3279a, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        s.AbstractC0989a.h(this.f3279a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        s.AbstractC0989a.i(this.f3279a, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        if (this.f3280b) {
            return d(z2, z3);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
