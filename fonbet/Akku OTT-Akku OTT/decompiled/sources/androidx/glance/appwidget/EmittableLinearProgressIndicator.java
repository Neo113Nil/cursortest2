package androidx.glance.appwidget;

import androidx.core.app.NotificationCompat;
import androidx.glance.Emittable;
import androidx.glance.GlanceModifier;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0001H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/glance/appwidget/EmittableLinearProgressIndicator;", "Landroidx/glance/Emittable;", "()V", "backgroundColor", "Landroidx/glance/unit/ColorProvider;", "getBackgroundColor", "()Landroidx/glance/unit/ColorProvider;", "setBackgroundColor", "(Landroidx/glance/unit/ColorProvider;)V", "color", "getColor", "setColor", "indeterminate", "", "getIndeterminate", "()Z", "setIndeterminate", "(Z)V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", NotificationCompat.CATEGORY_PROGRESS, "", "getProgress", "()F", "setProgress", "(F)V", "copy", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmittableLinearProgressIndicator implements Emittable {
    private ColorProvider backgroundColor;
    private ColorProvider color;
    private boolean indeterminate;
    private GlanceModifier modifier = GlanceModifier.INSTANCE;
    private float progress;

    public EmittableLinearProgressIndicator() {
        ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
        this.color = progressIndicatorDefaults.getIndicatorColorProvider();
        this.backgroundColor = progressIndicatorDefaults.getBackgroundColorProvider();
    }

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        EmittableLinearProgressIndicator emittableLinearProgressIndicator = new EmittableLinearProgressIndicator();
        emittableLinearProgressIndicator.setModifier(getModifier());
        emittableLinearProgressIndicator.progress = this.progress;
        emittableLinearProgressIndicator.indeterminate = this.indeterminate;
        emittableLinearProgressIndicator.color = this.color;
        emittableLinearProgressIndicator.backgroundColor = this.backgroundColor;
        return emittableLinearProgressIndicator;
    }

    public final ColorProvider getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ColorProvider getColor() {
        return this.color;
    }

    public final boolean getIndeterminate() {
        return this.indeterminate;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final void setBackgroundColor(ColorProvider colorProvider) {
        this.backgroundColor = colorProvider;
    }

    public final void setColor(ColorProvider colorProvider) {
        this.color = colorProvider;
    }

    public final void setIndeterminate(boolean z) {
        this.indeterminate = z;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public final void setProgress(float f) {
        this.progress = f;
    }

    public String toString() {
        return "EmittableLinearProgressIndicator(modifier=" + getModifier() + ", progress=" + this.progress + ", indeterminate=" + this.indeterminate + ", color=" + this.color + ", backgroundColor=" + this.backgroundColor + ')';
    }
}
