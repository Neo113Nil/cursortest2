package b2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f7227a;

    public c(Drawable.ConstantState constantState) {
        this.f7227a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f7227a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f7227a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f7227a.newDrawable();
        dVar.f7233k = newDrawable;
        newDrawable.setCallback(dVar.f7230n);
        return dVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f7227a.newDrawable(resources);
        dVar.f7233k = newDrawable;
        newDrawable.setCallback(dVar.f7230n);
        return dVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f7227a.newDrawable(resources, theme);
        dVar.f7233k = newDrawable;
        newDrawable.setCallback(dVar.f7230n);
        return dVar;
    }
}
