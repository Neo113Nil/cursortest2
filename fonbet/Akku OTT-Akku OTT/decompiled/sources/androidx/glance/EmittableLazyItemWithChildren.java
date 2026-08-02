package androidx.glance;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.layout.Alignment;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/EmittableLazyItemWithChildren;", "Landroidx/glance/EmittableWithChildren;", "()V", "alignment", "Landroidx/glance/layout/Alignment;", "getAlignment", "()Landroidx/glance/layout/Alignment;", "setAlignment", "(Landroidx/glance/layout/Alignment;)V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class EmittableLazyItemWithChildren extends EmittableWithChildren {
    public static final int $stable = 8;
    private Alignment alignment;

    public EmittableLazyItemWithChildren() {
        super(0, false, 3, null);
        this.alignment = Alignment.INSTANCE.getCenterStart();
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }
}
