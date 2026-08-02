package com.datadog.android.sessionreplay;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "", "", "minCPUCores", "minRAMSizeMb", "<init>", "(II)V", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lkotlin/Function0;", "", "runnable", "runIfRequirementsMet$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/api/InternalLogger;Lkotlin/jvm/functions/Function0;)V", com.visa.cbp.getEncExpo.warmup, "getMinCPUCores$dd_sdk_android_session_replay_release", "()I", "getMinRAMSizeMb$dd_sdk_android_session_replay_release", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SystemRequirementsConfiguration {
    private final int minCPUCores;
    private final int minRAMSizeMb;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.SystemRequirementsConfiguration.Companion INSTANCE = new com.datadog.android.sessionreplay.SystemRequirementsConfiguration.Companion(null);
    private static final com.datadog.android.sessionreplay.SystemRequirementsConfiguration BASIC = new com.datadog.android.sessionreplay.SystemRequirementsConfiguration(2, 1024);
    private static final com.datadog.android.sessionreplay.SystemRequirementsConfiguration NONE = new com.datadog.android.sessionreplay.SystemRequirementsConfiguration(0, 0);

    public SystemRequirementsConfiguration(int i, int i2) {
        this.minCPUCores = i;
        this.minRAMSizeMb = i2;
    }

    /* renamed from: getMinCPUCores$dd_sdk_android_session_replay_release, reason: from getter */
    public final int getMinCPUCores() {
        return this.minCPUCores;
    }

    /* renamed from: getMinRAMSizeMb$dd_sdk_android_session_replay_release, reason: from getter */
    public final int getMinRAMSizeMb() {
        return this.minRAMSizeMb;
    }

    public final void runIfRequirementsMet$dd_sdk_android_session_replay_release(com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function0<kotlin.Unit> runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        java.io.File file = null;
        int i = 2;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        java.util.List<com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker[]{new com.datadog.android.sessionreplay.internal.prerequisite.CPURequirementChecker(this.minCPUCores, file, internalLogger, i, defaultConstructorMarker), new com.datadog.android.sessionreplay.internal.prerequisite.MemoryRequirementChecker(this.minRAMSizeMb, file, internalLogger, i, defaultConstructorMarker)});
        if (!(listOf instanceof java.util.Collection) || !listOf.isEmpty()) {
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (!((com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker) it.next()).checkMinimumRequirement()) {
                    com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.INFO;
                    java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.TELEMETRY, com.datadog.android.api.InternalLogger.Target.USER});
                    com.datadog.android.sessionreplay.SystemRequirementsConfiguration$runIfRequirementsMet$1 systemRequirementsConfiguration$runIfRequirementsMet$1 = new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.SystemRequirementsConfiguration$runIfRequirementsMet$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return "Session replay is disabled because the system doesn't meet the minimum Session Replay requirements";
                        }
                    };
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10)), 16));
                    for (com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker systemRequirementChecker : listOf) {
                        kotlin.Pair pair = kotlin.TuplesKt.to(systemRequirementChecker.name(), systemRequirementChecker.checkedValue());
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, level, listOf2, (kotlin.jvm.functions.Function0) systemRequirementsConfiguration$runIfRequirementsMet$1, (java.lang.Throwable) null, true, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("device_stats", linkedHashMap)), 8, (java.lang.Object) null);
                    return;
                }
            }
        }
        runnable.invoke();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration$Builder;", "", "<init>", "()V", "Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "build", "()Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "", "cpuCoreNumber", "setMinCPUCoreNumber", "(I)Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration$Builder;", "minRAMSizeMb", "setMinRAMSizeMb", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;

        public final com.datadog.android.sessionreplay.SystemRequirementsConfiguration.Builder setMinCPUCoreNumber(int cpuCoreNumber) {
            this.getHighResolutionOutputSizeshNQ4ISI = cpuCoreNumber;
            return this;
        }

        public final com.datadog.android.sessionreplay.SystemRequirementsConfiguration.Builder setMinRAMSizeMb(int minRAMSizeMb) {
            this.getHighSpeedVideoFpsRangesFor = minRAMSizeMb;
            return this;
        }

        public final com.datadog.android.sessionreplay.SystemRequirementsConfiguration build() {
            return new com.datadog.android.sessionreplay.SystemRequirementsConfiguration(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration$Companion;", "", "<init>", "()V", "Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "BASIC", "Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "getBASIC", "()Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "NONE", "getNONE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.sessionreplay.SystemRequirementsConfiguration getBASIC() {
            return com.datadog.android.sessionreplay.SystemRequirementsConfiguration.BASIC;
        }

        public final com.datadog.android.sessionreplay.SystemRequirementsConfiguration getNONE() {
            return com.datadog.android.sessionreplay.SystemRequirementsConfiguration.NONE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
