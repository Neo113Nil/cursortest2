package kotlin.internal.jdk7;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "<init>", "()V", "", "cause", "exception", "", "addSuppressed", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "getSuppressed", "(Ljava/lang/Throwable;)Ljava/util/List;", "ReflectSdkVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class JDK7PlatformImplementations extends kotlin.internal.PlatformImplementations {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", "", "<init>", "()V", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Integer;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class ReflectSdkVersion {
        public static final kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion INSTANCE = new kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion();

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        public static final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;

        private ReflectSdkVersion() {
        }

        static {
            java.lang.Integer num;
            java.lang.Object obj;
            java.lang.Integer num2 = null;
            try {
                obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (java.lang.Throwable unused) {
            }
            if (obj instanceof java.lang.Integer) {
                num = (java.lang.Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                getHighResolutionOutputSizeshNQ4ISI = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            getHighResolutionOutputSizeshNQ4ISI = num2;
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    public void addSuppressed(java.lang.Throwable cause, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        if (kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.getHighResolutionOutputSizeshNQ4ISI == null || kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.getHighResolutionOutputSizeshNQ4ISI.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.addSuppressed(cause, exception);
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    public java.util.List<java.lang.Throwable> getSuppressed(java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        if (kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.getHighResolutionOutputSizeshNQ4ISI == null || kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.getHighResolutionOutputSizeshNQ4ISI.intValue() >= 19) {
            java.lang.Throwable[] suppressed = exception.getSuppressed();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(suppressed, "");
            return kotlin.collections.ArraysKt.asList(suppressed);
        }
        return super.getSuppressed(exception);
    }
}
