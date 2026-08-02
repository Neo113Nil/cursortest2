package androidx.glance.appwidget.lazy;

import android.os.Bundle;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u00020\nX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/glance/appwidget/lazy/EmittableLazyList;", "Landroidx/glance/EmittableWithChildren;", "()V", "activityOptions", "Landroid/os/Bundle;", "getActivityOptions", "()Landroid/os/Bundle;", "setActivityOptions", "(Landroid/os/Bundle;)V", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", "getHorizontalAlignment-PGIyAqw", "()I", "setHorizontalAlignment-uMT2-20", "(I)V", "I", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EmittableLazyList extends EmittableWithChildren {
    private Bundle activityOptions;
    private int horizontalAlignment;
    private GlanceModifier modifier;

    public EmittableLazyList() {
        super(0, true, 1, null);
        this.modifier = GlanceModifier.INSTANCE;
        this.horizontalAlignment = Alignment.INSTANCE.m1367getStartPGIyAqw();
    }

    public final Bundle getActivityOptions() {
        return this.activityOptions;
    }

    /* renamed from: getHorizontalAlignment-PGIyAqw, reason: not valid java name and from getter */
    public final int getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    public final void setActivityOptions(Bundle bundle) {
        this.activityOptions = bundle;
    }

    /* renamed from: setHorizontalAlignment-uMT2-20, reason: not valid java name */
    public final void m1331setHorizontalAlignmentuMT220(int i) {
        this.horizontalAlignment = i;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public String toString() {
        return "EmittableLazyList(modifier=" + getModifier() + ", horizontalAlignment=" + ((Object) Alignment.Horizontal.m1374toStringimpl(this.horizontalAlignment)) + ", activityOptions=" + this.activityOptions + ", children=[\n" + childrenToString() + "\n])";
    }
}
