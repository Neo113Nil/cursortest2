package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Landroidx/glance/appwidget/ExtractedSizeModifiers;", "", "sizeModifiers", "Landroidx/glance/GlanceModifier;", "nonSizeModifiers", "(Landroidx/glance/GlanceModifier;Landroidx/glance/GlanceModifier;)V", "getNonSizeModifiers", "()Landroidx/glance/GlanceModifier;", "getSizeModifiers", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class ExtractedSizeModifiers {
    private final GlanceModifier nonSizeModifiers;
    private final GlanceModifier sizeModifiers;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtractedSizeModifiers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExtractedSizeModifiers copy$default(ExtractedSizeModifiers extractedSizeModifiers, GlanceModifier glanceModifier, GlanceModifier glanceModifier2, int i, Object obj) {
        if ((i & 1) != 0) {
            glanceModifier = extractedSizeModifiers.sizeModifiers;
        }
        if ((i & 2) != 0) {
            glanceModifier2 = extractedSizeModifiers.nonSizeModifiers;
        }
        return extractedSizeModifiers.copy(glanceModifier, glanceModifier2);
    }

    /* renamed from: component1, reason: from getter */
    public final GlanceModifier getSizeModifiers() {
        return this.sizeModifiers;
    }

    /* renamed from: component2, reason: from getter */
    public final GlanceModifier getNonSizeModifiers() {
        return this.nonSizeModifiers;
    }

    public final ExtractedSizeModifiers copy(GlanceModifier sizeModifiers, GlanceModifier nonSizeModifiers) {
        return new ExtractedSizeModifiers(sizeModifiers, nonSizeModifiers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtractedSizeModifiers)) {
            return false;
        }
        ExtractedSizeModifiers extractedSizeModifiers = (ExtractedSizeModifiers) other;
        return Intrinsics.areEqual(this.sizeModifiers, extractedSizeModifiers.sizeModifiers) && Intrinsics.areEqual(this.nonSizeModifiers, extractedSizeModifiers.nonSizeModifiers);
    }

    public final GlanceModifier getNonSizeModifiers() {
        return this.nonSizeModifiers;
    }

    public final GlanceModifier getSizeModifiers() {
        return this.sizeModifiers;
    }

    public int hashCode() {
        return this.nonSizeModifiers.hashCode() + (this.sizeModifiers.hashCode() * 31);
    }

    public String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.sizeModifiers + ", nonSizeModifiers=" + this.nonSizeModifiers + ')';
    }

    public ExtractedSizeModifiers(GlanceModifier glanceModifier, GlanceModifier glanceModifier2) {
        this.sizeModifiers = glanceModifier;
        this.nonSizeModifiers = glanceModifier2;
    }

    public /* synthetic */ ExtractedSizeModifiers(GlanceModifier glanceModifier, GlanceModifier glanceModifier2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GlanceModifier.INSTANCE : glanceModifier, (i & 2) != 0 ? GlanceModifier.INSTANCE : glanceModifier2);
    }
}
