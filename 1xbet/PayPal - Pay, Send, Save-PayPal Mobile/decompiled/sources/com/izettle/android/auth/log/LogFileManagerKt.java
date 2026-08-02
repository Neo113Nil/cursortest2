package com.izettle.android.auth.log;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"", "otherTimeInMillis", "", "is24HoursBefore", "(JJ)Z", "Ljava/io/File;", "readAsLongOrNull", "(Ljava/io/File;)Ljava/lang/Long;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LogFileManagerKt {
    private static final java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmm", java.util.Locale.ROOT);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean is24HoursBefore(long j, long j2) {
        return java.lang.Math.abs(j - j2) >= 86400000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Long readAsLongOrNull(java.io.File file) {
        java.lang.String readText$default;
        if (!file.exists()) {
            file = null;
        }
        if (file == null || (readText$default = kotlin.io.FilesKt.readText$default(file, null, 1, null)) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toLongOrNull(readText$default);
    }
}
