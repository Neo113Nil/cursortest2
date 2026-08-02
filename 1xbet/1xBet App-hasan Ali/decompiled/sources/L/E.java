package L;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* loaded from: classes.dex */
public final class E extends RippleDrawable {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2905k;

    /* renamed from: l, reason: collision with root package name */
    public i0.p f2906l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f2907m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2908n;

    public E(boolean z3) {
        super(ColorStateList.valueOf(-16777216), null, z3 ? new ColorDrawable(-1) : null);
        this.f2905k = z3;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f2905k) {
            this.f2908n = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f2908n = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f2908n;
    }
}
