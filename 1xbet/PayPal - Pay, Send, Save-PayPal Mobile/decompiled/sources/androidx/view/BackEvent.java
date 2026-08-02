package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/window/BackEvent;", "backEvent", "Landroidx/navigationevent/NavigationEvent;", "NavigationEvent", "(Landroid/window/BackEvent;)Landroidx/navigationevent/NavigationEvent;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.navigationevent.NavigationEvent_androidKt, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class BackEvent {
    public static final androidx.view.NavigationEvent NavigationEvent(android.window.BackEvent backEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new androidx.view.NavigationEvent(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, android.os.Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
