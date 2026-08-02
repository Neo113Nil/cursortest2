package androidx.view;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/lifecycle/LifecycleService;", "Landroid/app/Service;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "startId", "onStart", "(Landroid/content/Intent;I)V", "flags", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Landroidx/lifecycle/ServiceLifecycleDispatcher;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/ServiceLifecycleDispatcher;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class LifecycleService extends android.app.Service implements androidx.view.LifecycleOwner {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.ServiceLifecycleDispatcher Camera2StreamConfigurationMap = new androidx.view.ServiceLifecycleDispatcher(this);

    @Override // android.app.Service
    public void onCreate() {
        this.Camera2StreamConfigurationMap.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        this.Camera2StreamConfigurationMap.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    @kotlin.Deprecated(message = "Deprecated in Java")
    public void onStart(android.content.Intent intent, int startId) {
        this.Camera2StreamConfigurationMap.onServicePreSuperOnStart();
        super.onStart(intent, startId);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.Camera2StreamConfigurationMap.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // androidx.view.LifecycleOwner
    public androidx.view.Lifecycle getLifecycle() {
        return this.Camera2StreamConfigurationMap.getLifecycle();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
