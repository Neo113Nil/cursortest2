package androidx.glance.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.Emittable;
import androidx.glance.GlanceModifier;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0001H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/glance/layout/EmittableSpacer;", "Landroidx/glance/Emittable;", "()V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "copy", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class EmittableSpacer implements Emittable {
    public static final int $stable = 8;
    private GlanceModifier modifier = GlanceModifier.INSTANCE;

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        EmittableSpacer emittableSpacer = new EmittableSpacer();
        emittableSpacer.setModifier(getModifier());
        return emittableSpacer;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public String toString() {
        return "EmittableSpacer(modifier=" + getModifier() + ')';
    }
}
