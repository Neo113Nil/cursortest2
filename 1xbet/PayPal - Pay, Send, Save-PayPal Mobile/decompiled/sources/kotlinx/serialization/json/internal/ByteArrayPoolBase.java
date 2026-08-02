package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/ByteArrayPoolBase;", "", "<init>", "()V", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "take", "(I)[B", "array", "", "releaseImpl", "([B)V", "Lkotlin/collections/ArrayDeque;", "getHighSpeedVideoFpsRanges", "Lkotlin/collections/ArrayDeque;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public class ByteArrayPoolBase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.collections.ArrayDeque<byte[]> getHighResolutionOutputSizeshNQ4ISI = new kotlin.collections.ArrayDeque<>();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    protected final byte[] take(int size) {
        byte[] removeLastOrNull;
        synchronized (this) {
            removeLastOrNull = this.getHighResolutionOutputSizeshNQ4ISI.removeLastOrNull();
            if (removeLastOrNull != null) {
                this.Camera2StreamConfigurationMap -= removeLastOrNull.length / 2;
            } else {
                removeLastOrNull = null;
            }
        }
        return removeLastOrNull == null ? new byte[size] : removeLastOrNull;
    }

    protected final void releaseImpl(byte[] array) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        synchronized (this) {
            int length = this.Camera2StreamConfigurationMap + array.length;
            i = kotlinx.serialization.json.internal.ArrayPoolsKt.getHighSpeedVideoFpsRangesFor;
            if (length < i) {
                this.Camera2StreamConfigurationMap += array.length / 2;
                this.getHighResolutionOutputSizeshNQ4ISI.addLast(array);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
