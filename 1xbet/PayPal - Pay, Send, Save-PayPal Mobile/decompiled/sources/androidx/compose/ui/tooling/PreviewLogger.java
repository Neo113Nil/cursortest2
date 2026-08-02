package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/tooling/PreviewLogger;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreviewLogger {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.tooling.PreviewLogger.Companion INSTANCE = new androidx.compose.ui.tooling.PreviewLogger.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/compose/ui/tooling/PreviewLogger$Companion;", "", "<init>", "()V", "", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "logWarning$ui_tooling", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "logError$ui_tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final void logError$ui_tooling(java.lang.String message, java.lang.Throwable throwable) {
        }

        public final void logWarning$ui_tooling(java.lang.String message, java.lang.Throwable throwable) {
        }

        private Companion() {
        }

        public static /* synthetic */ void logWarning$ui_tooling$default(androidx.compose.ui.tooling.PreviewLogger.Companion companion, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.logWarning$ui_tooling(str, th);
        }

        public static /* synthetic */ void logError$ui_tooling$default(androidx.compose.ui.tooling.PreviewLogger.Companion companion, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.logError$ui_tooling(str, th);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
