package androidx.view.contextaware;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/activity/contextaware/ContextAwareHelper;", "", "<init>", "()V", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Landroidx/activity/contextaware/OnContextAvailableListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addOnContextAvailableListener", "(Landroidx/activity/contextaware/OnContextAvailableListener;)V", "removeOnContextAvailableListener", "context", "dispatchOnContextAvailable", "(Landroid/content/Context;)V", "clearAvailableContext", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "Camera2StreamConfigurationMap", "Landroid/content/Context;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextAwareHelper {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<androidx.view.contextaware.OnContextAvailableListener> Camera2StreamConfigurationMap = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: peekAvailableContext, reason: from getter */
    public final android.content.Context getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void addOnContextAvailableListener(androidx.view.contextaware.OnContextAvailableListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        android.content.Context context = this.getHighSpeedVideoFpsRanges;
        if (context != null) {
            listener.onContextAvailable(context);
        }
        this.Camera2StreamConfigurationMap.add(listener);
    }

    public final void removeOnContextAvailableListener(androidx.view.contextaware.OnContextAvailableListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.Camera2StreamConfigurationMap.remove(listener);
    }

    public final void dispatchOnContextAvailable(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = context;
        java.util.Iterator<androidx.view.contextaware.OnContextAvailableListener> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    public final void clearAvailableContext() {
        this.getHighSpeedVideoFpsRanges = null;
    }
}
