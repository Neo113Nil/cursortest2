package androidx.compose.material;

@kotlin.Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00028\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/material/SwipeProgress;", "T", "", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "", "fraction", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getFrom", "()Ljava/lang/Object;", "getTo", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFraction", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeProgress<T> {
    public static final int $stable = 0;
    private final float fraction;
    private final T from;
    private final T to;

    public SwipeProgress(T t, T t2, float f) {
        this.from = t;
        this.to = t2;
        this.fraction = f;
    }

    public final T getFrom() {
        return this.from;
    }

    public final T getTo() {
        return this.to;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material.SwipeProgress)) {
            return false;
        }
        androidx.compose.material.SwipeProgress swipeProgress = (androidx.compose.material.SwipeProgress) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.from, swipeProgress.from) && kotlin.jvm.internal.Intrinsics.areEqual(this.to, swipeProgress.to) && this.fraction == swipeProgress.fraction;
    }

    public final int hashCode() {
        T t = this.from;
        int hashCode = t != null ? t.hashCode() : 0;
        T t2 = this.to;
        return (((hashCode * 31) + (t2 != null ? t2.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.fraction);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SwipeProgress(from=");
        sb.append(this.from);
        sb.append(", to=");
        sb.append(this.to);
        sb.append(", fraction=");
        sb.append(this.fraction);
        sb.append(')');
        return sb.toString();
    }
}
