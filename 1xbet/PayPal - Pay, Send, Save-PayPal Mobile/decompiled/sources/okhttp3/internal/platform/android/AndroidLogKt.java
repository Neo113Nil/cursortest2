package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidLogKt {
    public static final /* synthetic */ int access$getAndroidLevel(java.util.logging.LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > java.util.logging.Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == java.util.logging.Level.INFO.intValue() ? 4 : 3;
    }
}
