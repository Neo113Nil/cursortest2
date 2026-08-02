package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Landroidx/camera/core/impl/StreamUseCase;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "J", "getValue", "()J", "DEFAULT", "PREVIEW", "VIDEO_RECORD", "STILL_CAPTURE", "VIDEO_CALL", "PREVIEW_VIDEO_STILL", "CROPPED_RAW"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamUseCase {
    public static final androidx.camera.core.impl.StreamUseCase CROPPED_RAW;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.camera.core.impl.StreamUseCase DEFAULT;
    public static final androidx.camera.core.impl.StreamUseCase PREVIEW;
    public static final androidx.camera.core.impl.StreamUseCase PREVIEW_VIDEO_STILL;
    public static final androidx.camera.core.impl.StreamUseCase STILL_CAPTURE;
    public static final androidx.camera.core.impl.StreamUseCase VIDEO_CALL;
    public static final androidx.camera.core.impl.StreamUseCase VIDEO_RECORD;
    private static final /* synthetic */ androidx.camera.core.impl.StreamUseCase[] getHighSpeedVideoSizes;
    private final long value;

    private StreamUseCase(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    static {
        androidx.camera.core.impl.StreamUseCase streamUseCase = new androidx.camera.core.impl.StreamUseCase("DEFAULT", 0, 0);
        DEFAULT = streamUseCase;
        androidx.camera.core.impl.StreamUseCase streamUseCase2 = new androidx.camera.core.impl.StreamUseCase("PREVIEW", 1, 1);
        PREVIEW = streamUseCase2;
        androidx.camera.core.impl.StreamUseCase streamUseCase3 = new androidx.camera.core.impl.StreamUseCase("VIDEO_RECORD", 2, 3);
        VIDEO_RECORD = streamUseCase3;
        androidx.camera.core.impl.StreamUseCase streamUseCase4 = new androidx.camera.core.impl.StreamUseCase("STILL_CAPTURE", 3, 2);
        STILL_CAPTURE = streamUseCase4;
        androidx.camera.core.impl.StreamUseCase streamUseCase5 = new androidx.camera.core.impl.StreamUseCase("VIDEO_CALL", 4, 5);
        VIDEO_CALL = streamUseCase5;
        androidx.camera.core.impl.StreamUseCase streamUseCase6 = new androidx.camera.core.impl.StreamUseCase("PREVIEW_VIDEO_STILL", 5, 4);
        PREVIEW_VIDEO_STILL = streamUseCase6;
        androidx.camera.core.impl.StreamUseCase streamUseCase7 = new androidx.camera.core.impl.StreamUseCase("CROPPED_RAW", 6, 6);
        CROPPED_RAW = streamUseCase7;
        androidx.camera.core.impl.StreamUseCase[] streamUseCaseArr = {streamUseCase, streamUseCase2, streamUseCase3, streamUseCase4, streamUseCase5, streamUseCase6, streamUseCase7};
        getHighSpeedVideoSizes = streamUseCaseArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(streamUseCaseArr);
    }

    public final long getValue() {
        return this.value;
    }

    public static androidx.camera.core.impl.StreamUseCase[] values() {
        return (androidx.camera.core.impl.StreamUseCase[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.camera.core.impl.StreamUseCase valueOf(java.lang.String str) {
        return (androidx.camera.core.impl.StreamUseCase) java.lang.Enum.valueOf(androidx.camera.core.impl.StreamUseCase.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.camera.core.impl.StreamUseCase> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
