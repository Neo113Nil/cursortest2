package kotlin.reflect.jvm.internal.impl.types.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CaptureStatus {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus FOR_INCORPORATION;
    public static final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus FOR_SUBTYPING;
    public static final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus FROM_EXPRESSION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private CaptureStatus(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus = new kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus("FOR_SUBTYPING", 0);
        FOR_SUBTYPING = captureStatus;
        kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus2 = new kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus("FOR_INCORPORATION", 1);
        FOR_INCORPORATION = captureStatus2;
        kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus3 = new kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus("FROM_EXPRESSION", 2);
        FROM_EXPRESSION = captureStatus3;
        kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] captureStatusArr = {captureStatus, captureStatus2, captureStatus3};
        Camera2StreamConfigurationMap = captureStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(captureStatusArr);
    }

    public static kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] values() {
        return (kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.class, str);
    }
}
