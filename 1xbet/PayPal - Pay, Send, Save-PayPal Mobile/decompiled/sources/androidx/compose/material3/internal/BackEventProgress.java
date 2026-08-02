package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/BackEventProgress;", "", "NotRunning", "InProgress", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Landroidx/compose/material3/internal/BackEventProgress$Completed;", "Landroidx/compose/material3/internal/BackEventProgress$InProgress;", "Landroidx/compose/material3/internal/BackEventProgress$NotRunning;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BackEventProgress {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/internal/BackEventProgress$NotRunning;", "Landroidx/compose/material3/internal/BackEventProgress;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotRunning implements androidx.compose.material3.internal.BackEventProgress {
        public static final int $stable = 0;
        public static final androidx.compose.material3.internal.BackEventProgress.NotRunning INSTANCE = new androidx.compose.material3.internal.BackEventProgress.NotRunning();

        private NotRunning() {
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Landroidx/compose/material3/internal/BackEventProgress$InProgress;", "Landroidx/compose/material3/internal/BackEventProgress;", "", "touchX", "touchY", "progress", "Landroidx/compose/material3/internal/SwipeEdge;", "swipeEdge", "<init>", "(FFFLandroidx/compose/material3/internal/SwipeEdge;)V", "component1", "()F", "component2", "component3", "component4", "()Landroidx/compose/material3/internal/SwipeEdge;", "copy", "(FFFLandroidx/compose/material3/internal/SwipeEdge;)Landroidx/compose/material3/internal/BackEventProgress$InProgress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTouchX", "getTouchY", "getProgress", "Landroidx/compose/material3/internal/SwipeEdge;", "getSwipeEdge"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InProgress implements androidx.compose.material3.internal.BackEventProgress {
        public static final int $stable = 0;
        private final float progress;
        private final androidx.compose.material3.internal.SwipeEdge swipeEdge;
        private final float touchX;
        private final float touchY;

        public InProgress(float f, float f2, float f3, androidx.compose.material3.internal.SwipeEdge swipeEdge) {
            this.touchX = f;
            this.touchY = f2;
            this.progress = f3;
            this.swipeEdge = swipeEdge;
        }

        public final float getTouchX() {
            return this.touchX;
        }

        public final float getTouchY() {
            return this.touchY;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final androidx.compose.material3.internal.SwipeEdge getSwipeEdge() {
            return this.swipeEdge;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InProgress(touchX=");
            sb.append(this.touchX);
            sb.append(", touchY=");
            sb.append(this.touchY);
            sb.append(", progress=");
            sb.append(this.progress);
            sb.append(", swipeEdge=");
            sb.append(this.swipeEdge);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Float.hashCode(this.touchX) * 31) + java.lang.Float.hashCode(this.touchY)) * 31) + java.lang.Float.hashCode(this.progress)) * 31) + this.swipeEdge.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.material3.internal.BackEventProgress.InProgress)) {
                return false;
            }
            androidx.compose.material3.internal.BackEventProgress.InProgress inProgress = (androidx.compose.material3.internal.BackEventProgress.InProgress) other;
            return java.lang.Float.compare(this.touchX, inProgress.touchX) == 0 && java.lang.Float.compare(this.touchY, inProgress.touchY) == 0 && java.lang.Float.compare(this.progress, inProgress.progress) == 0 && this.swipeEdge == inProgress.swipeEdge;
        }

        public final androidx.compose.material3.internal.BackEventProgress.InProgress copy(float touchX, float touchY, float progress, androidx.compose.material3.internal.SwipeEdge swipeEdge) {
            return new androidx.compose.material3.internal.BackEventProgress.InProgress(touchX, touchY, progress, swipeEdge);
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.compose.material3.internal.SwipeEdge getSwipeEdge() {
            return this.swipeEdge;
        }

        /* renamed from: component3, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        /* renamed from: component2, reason: from getter */
        public final float getTouchY() {
            return this.touchY;
        }

        /* renamed from: component1, reason: from getter */
        public final float getTouchX() {
            return this.touchX;
        }

        public static /* synthetic */ androidx.compose.material3.internal.BackEventProgress.InProgress copy$default(androidx.compose.material3.internal.BackEventProgress.InProgress inProgress, float f, float f2, float f3, androidx.compose.material3.internal.SwipeEdge swipeEdge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = inProgress.touchX;
            }
            if ((i & 2) != 0) {
                f2 = inProgress.touchY;
            }
            if ((i & 4) != 0) {
                f3 = inProgress.progress;
            }
            if ((i & 8) != 0) {
                swipeEdge = inProgress.swipeEdge;
            }
            return inProgress.copy(f, f2, f3, swipeEdge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/internal/BackEventProgress$Completed;", "Landroidx/compose/material3/internal/BackEventProgress;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Completed implements androidx.compose.material3.internal.BackEventProgress {
        public static final int $stable = 0;
        public static final androidx.compose.material3.internal.BackEventProgress.Completed INSTANCE = new androidx.compose.material3.internal.BackEventProgress.Completed();

        private Completed() {
        }
    }
}
