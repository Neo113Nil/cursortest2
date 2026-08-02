package androidx.glance;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.GlanceModifier;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/glance/VisibilityModifier;", "Landroidx/glance/GlanceModifier$Element;", "visibility", "Landroidx/glance/Visibility;", "(Landroidx/glance/Visibility;)V", "getVisibility", "()Landroidx/glance/Visibility;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final /* data */ class VisibilityModifier implements GlanceModifier.Element {
    public static final int $stable = 0;
    private final Visibility visibility;

    public VisibilityModifier(Visibility visibility) {
        this.visibility = visibility;
    }

    public static /* synthetic */ VisibilityModifier copy$default(VisibilityModifier visibilityModifier, Visibility visibility, int i, Object obj) {
        if ((i & 1) != 0) {
            visibility = visibilityModifier.visibility;
        }
        return visibilityModifier.copy(visibility);
    }

    /* renamed from: component1, reason: from getter */
    public final Visibility getVisibility() {
        return this.visibility;
    }

    public final VisibilityModifier copy(Visibility visibility) {
        return new VisibilityModifier(visibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VisibilityModifier) && this.visibility == ((VisibilityModifier) other).visibility;
    }

    public final Visibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        return this.visibility.hashCode();
    }

    public String toString() {
        return "VisibilityModifier(visibility=" + this.visibility + ')';
    }
}
