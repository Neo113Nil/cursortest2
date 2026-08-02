package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPoolBase;", "", "<init>", "()V", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "take", "(I)[C", "array", "", "releaseImpl", "([C)V", "Lkotlin/collections/ArrayDeque;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/collections/ArrayDeque;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class CharArrayPoolBase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.collections.ArrayDeque<char[]> getHighSpeedVideoFpsRanges = new kotlin.collections.ArrayDeque<>();

    protected final char[] take(int size) {
        char[] removeLastOrNull;
        synchronized (this) {
            removeLastOrNull = this.getHighSpeedVideoFpsRanges.removeLastOrNull();
            if (removeLastOrNull != null) {
                this.getHighSpeedVideoSizes -= removeLastOrNull.length;
            } else {
                removeLastOrNull = null;
            }
        }
        return removeLastOrNull == null ? new char[size] : removeLastOrNull;
    }

    protected final void releaseImpl(char[] array) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        synchronized (this) {
            int length = this.getHighSpeedVideoSizes + array.length;
            i = kotlinx.serialization.json.internal.ArrayPoolsKt.getHighSpeedVideoFpsRangesFor;
            if (length < i) {
                this.getHighSpeedVideoSizes += array.length;
                this.getHighSpeedVideoFpsRanges.addLast(array);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
