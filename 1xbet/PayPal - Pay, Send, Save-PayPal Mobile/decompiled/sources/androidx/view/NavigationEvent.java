package androidx.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/navigationevent/NavigationEvent;", "", "", "swipeEdge", "", "progress", "touchX", "touchY", "", "frameTimeMillis", "<init>", "(IFFFJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getSwipeEdge", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getProgress", "()F", "getTouchX", "getTouchY", "J", "getFrameTimeMillis", "()J", "Companion", "SwipeEdge"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationEvent {
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_NONE = 2;
    public static final int EDGE_RIGHT = 1;
    private final long frameTimeMillis;
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/navigationevent/NavigationEvent$SwipeEdge;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface SwipeEdge {
    }

    public NavigationEvent(int i, float f, float f2, float f3, long j) {
        this.swipeEdge = i;
        this.progress = f;
        this.touchX = f2;
        this.touchY = f3;
        this.frameTimeMillis = j;
    }

    public /* synthetic */ NavigationEvent(int i, float f, float f2, float f3, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) == 0 ? f3 : 0.0f, (i2 & 16) != 0 ? 0L : j);
    }

    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final float getTouchX() {
        return this.touchX;
    }

    public final float getTouchY() {
        return this.touchY;
    }

    public final long getFrameTimeMillis() {
        return this.frameTimeMillis;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass() == other.getClass()) {
            androidx.view.NavigationEvent navigationEvent = (androidx.view.NavigationEvent) other;
            return this.touchX == navigationEvent.touchX && this.touchY == navigationEvent.touchY && this.progress == navigationEvent.progress && this.swipeEdge == navigationEvent.swipeEdge && this.frameTimeMillis == navigationEvent.frameTimeMillis;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.touchX);
        int hashCode2 = java.lang.Float.hashCode(this.touchY);
        return (((((((hashCode * 31) + hashCode2) * 31) + java.lang.Float.hashCode(this.progress)) * 31) + java.lang.Integer.hashCode(this.swipeEdge)) * 31) + java.lang.Long.hashCode(this.frameTimeMillis);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationEvent(touchX=");
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

    public NavigationEvent(int i, float f, float f2, float f3) {
        this(i, f, f2, f3, 0L, 16, null);
    }

    public NavigationEvent(int i, float f, float f2) {
        this(i, f, f2, 0.0f, 0L, 24, null);
    }

    public NavigationEvent(int i, float f) {
        this(i, f, 0.0f, 0.0f, 0L, 28, null);
    }

    public NavigationEvent(int i) {
        this(i, 0.0f, 0.0f, 0.0f, 0L, 30, null);
    }

    public NavigationEvent() {
        this(0, 0.0f, 0.0f, 0.0f, 0L, 31, null);
    }
}
