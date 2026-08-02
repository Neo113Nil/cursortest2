package com.datadog.android.sessionreplay.internal.prerequisite;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/prerequisite/MemoryRequirementChecker;", "Lcom/datadog/android/sessionreplay/internal/prerequisite/SystemRequirementChecker;", "", "minRamSizeMb", "Ljava/io/File;", "memInfoFile", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(ILjava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "", "checkMinimumRequirement", "()Z", "", "checkedValue", "()Ljava/lang/Object;", "", "name", "()Ljava/lang/String;", "", "Camera2StreamConfigurationMap", "Ljava/lang/Long;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRanges", "Ljava/io/File;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MemoryRequirementChecker implements com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Long getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.io.File Camera2StreamConfigurationMap;

    public MemoryRequirementChecker(int i, java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = file;
        this.getHighSpeedVideoFpsRanges = internalLogger;
    }

    public /* synthetic */ MemoryRequirementChecker(int i, java.io.File file, com.datadog.android.api.InternalLogger internalLogger, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new java.io.File("/proc/meminfo") : file, internalLogger);
    }

    @Override // com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker
    public final boolean checkMinimumRequirement() {
        return this.getHighResolutionOutputSizeshNQ4ISI == 0 || ((java.lang.Number) com.datadog.android.internal.utils.StrictModeExtKt.allowThreadDiskReads(new kotlin.jvm.functions.Function0<java.lang.Long>() { // from class: com.datadog.android.sessionreplay.internal.prerequisite.MemoryRequirementChecker$checkMinimumRequirement$actualMaxRamSizeMb$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Long invoke() {
                return java.lang.Long.valueOf(com.datadog.android.sessionreplay.internal.prerequisite.MemoryRequirementChecker.access$getMaxRAMSize(com.datadog.android.sessionreplay.internal.prerequisite.MemoryRequirementChecker.this));
            }

            {
                super(0);
            }
        })).longValue() >= ((long) this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker
    public final java.lang.String name() {
        return "ram";
    }

    @Override // com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker
    public final java.lang.Object checkedValue() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ long access$getMaxRAMSize(com.datadog.android.sessionreplay.internal.prerequisite.MemoryRequirementChecker memoryRequirementChecker) {
        java.lang.Long l;
        if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(memoryRequirementChecker.Camera2StreamConfigurationMap, memoryRequirementChecker.getHighSpeedVideoFpsRanges) && com.datadog.android.core.internal.persistence.file.FileExtKt.canReadSafe(memoryRequirementChecker.Camera2StreamConfigurationMap, memoryRequirementChecker.getHighSpeedVideoFpsRanges)) {
            java.lang.Long l2 = null;
            java.util.List<java.lang.String> readLinesSafe$default = com.datadog.android.core.internal.persistence.file.FileExtKt.readLinesSafe$default(memoryRequirementChecker.Camera2StreamConfigurationMap, null, memoryRequirementChecker.getHighSpeedVideoFpsRanges, 1, null);
            if (readLinesSafe$default != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str : readLinesSafe$default) {
                    if (kotlin.text.StringsKt.startsWith$default(str, "MemTotal:", false, 2, (java.lang.Object) null)) {
                        java.util.List<java.lang.String> split = new kotlin.text.Regex("\\s+").split(str, 0);
                        if (split.size() > 1) {
                            l = kotlin.text.StringsKt.toLongOrNull(split.get(1));
                            if (l == null) {
                                arrayList.add(l);
                            }
                        }
                    }
                    l = null;
                    if (l == null) {
                    }
                }
                l2 = (java.lang.Long) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
            }
            r1 = l2 != null ? l2.longValue() / 1000 : 0L;
            memoryRequirementChecker.getHighSpeedVideoSizes = java.lang.Long.valueOf(r1);
        }
        return r1;
    }
}
