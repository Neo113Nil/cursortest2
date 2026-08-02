package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/window/embedding/OverlayInfo;", "", "", "overlayTag", "Landroidx/window/embedding/OverlayAttributes;", "currentOverlayAttributes", "Landroidx/window/embedding/ActivityStack;", "activityStack", "<init>", "(Ljava/lang/String;Landroidx/window/embedding/OverlayAttributes;Landroidx/window/embedding/ActivityStack;)V", "Landroid/app/Activity;", "activity", "", "contains", "(Landroid/app/Activity;)Z", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getOverlayTag", "Landroidx/window/embedding/OverlayAttributes;", "getCurrentOverlayAttributes", "()Landroidx/window/embedding/OverlayAttributes;", "Landroidx/window/embedding/ActivityStack;", "getActivityStack", "()Landroidx/window/embedding/ActivityStack;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverlayInfo {
    private final androidx.window.embedding.ActivityStack activityStack;
    private final androidx.window.embedding.OverlayAttributes currentOverlayAttributes;
    private final java.lang.String overlayTag;

    public OverlayInfo(java.lang.String str, androidx.window.embedding.OverlayAttributes overlayAttributes, androidx.window.embedding.ActivityStack activityStack) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.overlayTag = str;
        this.currentOverlayAttributes = overlayAttributes;
        this.activityStack = activityStack;
    }

    public final java.lang.String getOverlayTag() {
        return this.overlayTag;
    }

    public final androidx.window.embedding.OverlayAttributes getCurrentOverlayAttributes() {
        return this.currentOverlayAttributes;
    }

    public final androidx.window.embedding.ActivityStack getActivityStack() {
        return this.activityStack;
    }

    public final boolean contains(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        androidx.window.embedding.ActivityStack activityStack = this.activityStack;
        if (activityStack != null) {
            return activityStack.contains(activity);
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OverlayInfo: {tag=");
        sb.append(this.overlayTag);
        sb.append(", currentOverlayAttrs=");
        sb.append(this.currentOverlayAttributes);
        sb.append(", activityStack=");
        sb.append(this.activityStack);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
