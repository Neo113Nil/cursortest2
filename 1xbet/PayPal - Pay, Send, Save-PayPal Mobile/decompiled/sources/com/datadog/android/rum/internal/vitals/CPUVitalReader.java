package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/CPUVitalReader;", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "Ljava/io/File;", "statFile", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "", "readVitalData", "()Ljava/lang/Double;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_rum_release", "()Lcom/datadog/android/api/InternalLogger;", "Ljava/io/File;", "getStatFile$dd_sdk_android_rum_release", "()Ljava/io/File;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CPUVitalReader implements com.datadog.android.rum.internal.vitals.VitalReader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.vitals.CPUVitalReader.Companion INSTANCE = new com.datadog.android.rum.internal.vitals.CPUVitalReader.Companion(null);
    private static final java.io.File STAT_FILE = new java.io.File("/proc/self/stat");
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final java.io.File statFile;

    public CPUVitalReader(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.statFile = file;
        this.internalLogger = internalLogger;
    }

    public /* synthetic */ CPUVitalReader(java.io.File file, com.datadog.android.api.InternalLogger internalLogger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? STAT_FILE : file, internalLogger);
    }

    /* renamed from: getStatFile$dd_sdk_android_rum_release, reason: from getter */
    public final java.io.File getStatFile() {
        return this.statFile;
    }

    /* renamed from: getInternalLogger$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalReader
    public final java.lang.Double readVitalData() {
        java.lang.String readTextSafe$default;
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(this.statFile, this.internalLogger) || !com.datadog.android.core.internal.persistence.file.FileExtKt.canReadSafe(this.statFile, this.internalLogger) || (readTextSafe$default = com.datadog.android.core.internal.persistence.file.FileExtKt.readTextSafe$default(this.statFile, null, this.internalLogger, 1, null)) == null) {
            return null;
        }
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) readTextSafe$default, new char[]{' '}, false, 0, 6, (java.lang.Object) null);
        if (split$default.size() > 13) {
            return kotlin.text.StringsKt.toDoubleOrNull((java.lang.String) split$default.get(13));
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/CPUVitalReader$Companion;", "", "<init>", "()V", "Ljava/io/File;", "STAT_FILE", "Ljava/io/File;", "getSTAT_FILE$dd_sdk_android_rum_release", "()Ljava/io/File;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.io.File getSTAT_FILE$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.vitals.CPUVitalReader.STAT_FILE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
