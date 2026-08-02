package androidx.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 $2\u00020\u0001:\u0002%$B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/activity/BackEventCompat;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "", "frameTimeMillis", "<init>", "(FFFIJ)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", "Landroidx/navigationevent/NavigationEvent;", "navigationEvent", "(Landroidx/navigationevent/NavigationEvent;)V", "toBackEvent", "()Landroid/window/BackEvent;", "toNavigationEvent", "()Landroidx/navigationevent/NavigationEvent;", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTouchX", "()F", "getTouchY", "getProgress", com.visa.cbp.getEncExpo.warmup, "getSwipeEdge", "()I", "J", "getFrameTimeMillis", "()J", "Companion", "SwipeEdge"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackEventCompat {
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_NONE = 2;
    public static final int EDGE_RIGHT = 1;
    private final long frameTimeMillis;
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/activity/BackEventCompat$SwipeEdge;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface SwipeEdge {
    }

    public BackEventCompat(float f, float f2, float f3, int i, long j) {
        this.touchX = f;
        this.touchY = f2;
        this.progress = f3;
        this.swipeEdge = i;
        this.frameTimeMillis = j;
    }

    public /* synthetic */ BackEventCompat(float f, float f2, float f3, int i, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, i, (i2 & 16) != 0 ? 0L : j);
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

    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    public final long getFrameTimeMillis() {
        return this.frameTimeMillis;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackEventCompat(android.window.BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), android.os.Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackEventCompat(androidx.view.NavigationEvent navigationEvent) {
        this(navigationEvent.getTouchX(), navigationEvent.getTouchY(), navigationEvent.getProgress(), navigationEvent.getSwipeEdge(), navigationEvent.getFrameTimeMillis());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationEvent, "");
    }

    public final android.window.BackEvent toBackEvent() {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return new android.window.BackEvent(this.touchX, this.touchY, this.progress, this.swipeEdge, this.frameTimeMillis);
        }
        return new android.window.BackEvent(this.touchX, this.touchY, this.progress, this.swipeEdge);
    }

    public final androidx.view.NavigationEvent toNavigationEvent() {
        float f = this.touchX;
        float f2 = this.touchY;
        return new androidx.view.NavigationEvent(this.swipeEdge, this.progress, f, f2, this.frameTimeMillis);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackEventCompat(touchX=");
        sb.append(this.touchX);
        sb.append(", touchY=");
        sb.append(this.touchY);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", swipeEdge=");
        sb.append(this.swipeEdge);
        sb.append(", frameTimeMillis=");
        sb.append(this.frameTimeMillis);
        sb.append(')');
        return sb.toString();
    }

    public BackEventCompat(float f, float f2, float f3, int i) {
        this(f, f2, f3, i, 0L, 16, null);
    }
}
