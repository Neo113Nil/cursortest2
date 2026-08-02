package com.datadog.android.sessionreplay.internal.prerequisite;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/prerequisite/CPURequirementChecker;", "Lcom/datadog/android/sessionreplay/internal/prerequisite/SystemRequirementChecker;", "", "minCPUCores", "Ljava/io/File;", "cpuDirFile", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(ILjava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "", "checkMinimumRequirement", "()Z", "", "checkedValue", "()Ljava/lang/Object;", "", "name", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Integer;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Ljava/io/File;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CPURequirementChecker implements com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Integer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.io.File getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("cpu[0-9]+");

    public CPURequirementChecker(int i, java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = file;
        this.Camera2StreamConfigurationMap = internalLogger;
    }

    public /* synthetic */ CPURequirementChecker(int i, java.io.File file, com.datadog.android.api.InternalLogger internalLogger, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new java.io.File("/sys/devices/system/cpu/") : file, internalLogger);
    }

    @Override // com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker
    public final boolean checkMinimumRequirement() {
        return this.getHighSpeedVideoFpsRanges == 0 || ((java.lang.Number) com.datadog.android.internal.utils.StrictModeExtKt.allowThreadDiskReads(new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: com.datadog.android.sessionreplay.internal.prerequisite.CPURequirementChecker$checkMinimumRequirement$actualCPUCoreNumber$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Integer invoke() {
                return java.lang.Integer.valueOf(com.datadog.android.sessionreplay.internal.prerequisite.CPURequirementChecker.access$readCPUCoreNumber(com.datadog.android.sessionreplay.internal.prerequisite.CPURequirementChecker.this));
            }

            {
                super(0);
            }
        })).intValue() >= this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker
    public final java.lang.String name() {
        return "cpu";
    }

    @Override // com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker
    public final java.lang.Object checkedValue() {
        return this.getHighSpeedVideoSizes;
    }

    public static /* synthetic */ boolean $r8$lambda$cNy62CC4VqwTyGh08ojBH7WBwC8(java.io.File file, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return Camera2StreamConfigurationMap.matches(str);
    }

    public static final /* synthetic */ int access$readCPUCoreNumber(com.datadog.android.sessionreplay.internal.prerequisite.CPURequirementChecker cPURequirementChecker) {
        int availableProcessors;
        java.io.File[] listFilesSafe = com.datadog.android.core.internal.persistence.file.FileExtKt.listFilesSafe(cPURequirementChecker.getHighSpeedVideoFpsRangesFor, cPURequirementChecker.Camera2StreamConfigurationMap, new java.io.FilenameFilter() { // from class: com.datadog.android.sessionreplay.internal.prerequisite.CPURequirementChecker$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                return com.datadog.android.sessionreplay.internal.prerequisite.CPURequirementChecker.$r8$lambda$cNy62CC4VqwTyGh08ojBH7WBwC8(file, str);
            }
        });
        if (listFilesSafe != null) {
            availableProcessors = listFilesSafe.length;
        } else {
            availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        }
        cPURequirementChecker.getHighSpeedVideoSizes = java.lang.Integer.valueOf(availableProcessors);
        return availableProcessors;
    }
}
