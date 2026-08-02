package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J&\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/RequestMetadata;", "Landroidx/camera/camera2/pipe/Metadata;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "T", "Landroid/hardware/camera2/CaptureRequest$Key;", "key", "get", "(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getOrDefault", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/RequestTemplate;", "getTemplate-fGx8uWA", "()I", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE, "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "getStreams", "()Ljava/util/Map;", "streams", "", "getRepeating", "()Z", "repeating", "Landroidx/camera/camera2/pipe/Request;", "getRequest", "()Landroidx/camera/camera2/pipe/Request;", "request", "Landroidx/camera/camera2/pipe/RequestNumber;", "getRequestNumber-my6kx4g", "()J", "requestNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RequestMetadata extends androidx.camera.camera2.pipe.Metadata, androidx.camera.camera2.pipe.UnsafeWrapper {
    <T> T get(android.hardware.camera2.CaptureRequest.Key<T> key);

    <T> T getOrDefault(android.hardware.camera2.CaptureRequest.Key<T> key, T r2);

    boolean getRepeating();

    androidx.camera.camera2.pipe.Request getRequest();

    /* renamed from: getRequestNumber-my6kx4g */
    long mo108getRequestNumbermy6kx4g();

    java.util.Map<androidx.camera.camera2.pipe.StreamId, android.view.Surface> getStreams();

    /* renamed from: getTemplate-fGx8uWA */
    int mo109getTemplatefGx8uWA();
}
