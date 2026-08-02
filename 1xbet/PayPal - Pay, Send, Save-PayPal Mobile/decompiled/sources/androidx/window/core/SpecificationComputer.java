package androidx.window.core;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 \u0012*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/window/core/SpecificationComputer;", "", "T", "<init>", "()V", "", "message", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "condition", "require", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/window/core/SpecificationComputer;", "compute", "()Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "createMessage", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SpecificationComputer<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.core.SpecificationComputer.Companion INSTANCE = new androidx.window.core.SpecificationComputer.Companion(null);

    public abstract T compute();

    public abstract androidx.window.core.SpecificationComputer<T> require(java.lang.String message, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> condition);

    protected final java.lang.String createMessage(java.lang.Object value, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(message);
        sb.append(" value: ");
        sb.append(value);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0004*\u00020\u0001*\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/window/core/SpecificationComputer$Companion;", "", "<init>", "()V", "T", "", "tag", "Landroidx/window/core/VerificationMode;", "verificationMode", "Landroidx/window/core/Logger;", "logger", "Landroidx/window/core/SpecificationComputer;", "startSpecification", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/VerificationMode;Landroidx/window/core/Logger;)Landroidx/window/core/SpecificationComputer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ androidx.window.core.SpecificationComputer startSpecification$default(androidx.window.core.SpecificationComputer.Companion companion, java.lang.Object obj, java.lang.String str, androidx.window.core.VerificationMode verificationMode, androidx.window.core.Logger logger, int i, java.lang.Object obj2) {
            if ((i & 2) != 0) {
                verificationMode = androidx.window.core.BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i & 4) != 0) {
                logger = androidx.window.core.AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        public final <T> androidx.window.core.SpecificationComputer<T> startSpecification(T t, java.lang.String str, androidx.window.core.VerificationMode verificationMode, androidx.window.core.Logger logger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
            return new androidx.window.core.ValidSpecification(t, str, verificationMode, logger);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
