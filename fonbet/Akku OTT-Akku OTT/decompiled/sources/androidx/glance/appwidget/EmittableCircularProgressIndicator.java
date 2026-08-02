package androidx.glance.appwidget;

import androidx.glance.Emittable;
import androidx.glance.GlanceModifier;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/glance/appwidget/EmittableCircularProgressIndicator;", "Landroidx/glance/Emittable;", "()V", "color", "Landroidx/glance/unit/ColorProvider;", "getColor", "()Landroidx/glance/unit/ColorProvider;", "setColor", "(Landroidx/glance/unit/ColorProvider;)V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "copy", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmittableCircularProgressIndicator implements Emittable {
    private GlanceModifier modifier = GlanceModifier.INSTANCE;
    private ColorProvider color = ProgressIndicatorDefaults.INSTANCE.getIndicatorColorProvider();

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        EmittableCircularProgressIndicator emittableCircularProgressIndicator = new EmittableCircularProgressIndicator();
        emittableCircularProgressIndicator.setModifier(getModifier());
        emittableCircularProgressIndicator.color = this.color;
        return emittableCircularProgressIndicator;
    }

    public final ColorProvider getColor() {
        return this.color;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    public final void setColor(ColorProvider colorProvider) {
        this.color = colorProvider;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public String toString() {
        return "EmittableCircularProgressIndicator(modifier=" + getModifier() + ", color=" + this.color + ')';
    }
}
