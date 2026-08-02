package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/MemoryVitalReader;", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "Ljava/io/File;", "statusFile", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "", "readVitalData", "()Ljava/lang/Double;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_rum_release", "()Lcom/datadog/android/api/InternalLogger;", "Ljava/io/File;", "getStatusFile$dd_sdk_android_rum_release", "()Ljava/io/File;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MemoryVitalReader implements com.datadog.android.rum.internal.vitals.VitalReader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.vitals.MemoryVitalReader.Companion INSTANCE = new com.datadog.android.rum.internal.vitals.MemoryVitalReader.Companion(null);
    private static final java.io.File STATUS_FILE = new java.io.File("/proc/self/status");
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("VmRSS:\\s+(\\d+) kB");
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final java.io.File statusFile;

    public MemoryVitalReader(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.statusFile = file;
        this.internalLogger = internalLogger;
    }

    public /* synthetic */ MemoryVitalReader(java.io.File file, com.datadog.android.api.InternalLogger internalLogger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? STATUS_FILE : file, internalLogger);
    }

    /* renamed from: getStatusFile$dd_sdk_android_rum_release, reason: from getter */
    public final java.io.File getStatusFile() {
        return this.statusFile;
    }

    /* renamed from: getInternalLogger$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    @Override // com.datadog.android.rum.internal.vitals.VitalReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Double readVitalData() {
        java.lang.Double d;
        java.util.List<java.lang.String> groupValues;
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(this.statusFile, this.internalLogger) || !com.datadog.android.core.internal.persistence.file.FileExtKt.canReadSafe(this.statusFile, this.internalLogger)) {
            return null;
        }
        java.util.List readLinesSafe$default = com.datadog.android.core.internal.persistence.file.FileExtKt.readLinesSafe$default(this.statusFile, null, this.internalLogger, 1, null);
        if (readLinesSafe$default != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = readLinesSafe$default.iterator();
            while (it.hasNext()) {
                kotlin.text.MatchResult matchEntire = getHighSpeedVideoSizes.matchEntire((java.lang.String) it.next());
                java.lang.String str = (matchEntire == null || (groupValues = matchEntire.getGroupValues()) == null) ? null : (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(groupValues, 1);
                if (str != null) {
                    arrayList.add(str);
                }
            }
            java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
            if (str2 != null) {
                d = kotlin.text.StringsKt.toDoubleOrNull(str2);
                if (d != null) {
                    return null;
                }
                return java.lang.Double.valueOf(d.doubleValue() * 1000.0d);
            }
        }
        d = null;
        if (d != null) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/MemoryVitalReader$Companion;", "", "<init>", "()V", "Ljava/io/File;", "STATUS_FILE", "Ljava/io/File;", "getSTATUS_FILE$dd_sdk_android_rum_release", "()Ljava/io/File;", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.io.File getSTATUS_FILE$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.vitals.MemoryVitalReader.STATUS_FILE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
