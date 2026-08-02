package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/EvCompCompat;", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "stopRunningTask", "(Ljava/lang/Throwable;)V", "", "evCompIndex", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "", "cancelPreviousTask", "Lkotlinx/coroutines/Deferred;", "applyAsync", "(ILandroidx/camera/camera2/impl/UseCaseCameraRequestControl;Z)Lkotlinx/coroutines/Deferred;", "getSupported", "()Z", "supported", "Landroid/util/Range;", "getRange", "()Landroid/util/Range;", "range", "Landroid/util/Rational;", "getStep", "()Landroid/util/Rational;", "step", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EvCompCompat {

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/EvCompCompat$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/compat/EvCompImpl;", "impl", "Landroidx/camera/camera2/compat/EvCompCompat;", "bindEvCompImpl", "(Landroidx/camera/camera2/compat/EvCompImpl;)Landroidx/camera/camera2/compat/EvCompCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        public abstract androidx.camera.camera2.compat.EvCompCompat bindEvCompImpl(androidx.camera.camera2.compat.EvCompImpl impl);
    }

    kotlinx.coroutines.Deferred<java.lang.Integer> applyAsync(int evCompIndex, androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl, boolean cancelPreviousTask);

    android.util.Range<java.lang.Integer> getRange();

    android.util.Rational getStep();

    boolean getSupported();

    void stopRunningTask(java.lang.Throwable throwable);
}
