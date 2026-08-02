package kotlin.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "<init>", "()V", "", "cause", "exception", "", "addSuppressed", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "getSuppressed", "(Ljava/lang/Throwable;)Ljava/util/List;", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/MatchGroup;", "getMatchResultNamedGroup", "(Ljava/util/regex/MatchResult;Ljava/lang/String;)Lkotlin/text/MatchGroup;", "Lkotlin/random/Random;", "defaultPlatformRandom", "()Lkotlin/random/Random;", "Lkotlin/time/Clock;", "getSystemClock", "()Lkotlin/time/Clock;", "ReflectThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class PlatformImplementations {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "getHighSpeedVideoFpsRanges", "Ljava/lang/reflect/Method;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class ReflectThrowable {
        public static final kotlin.internal.PlatformImplementations.ReflectThrowable INSTANCE = new kotlin.internal.PlatformImplementations.ReflectThrowable();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        public static final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        public static final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;

        private ReflectThrowable() {
        }

        static {
            java.lang.reflect.Method method;
            java.lang.reflect.Method method2;
            java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
            kotlin.jvm.internal.Intrinsics.checkNotNull(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (kotlin.jvm.internal.Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.ArraysKt.singleOrNull(parameterTypes), java.lang.Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            getHighResolutionOutputSizeshNQ4ISI = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                java.lang.reflect.Method method3 = methods[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            getHighSpeedVideoFpsRangesFor = method;
        }
    }

    public void addSuppressed(java.lang.Throwable cause, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        java.lang.reflect.Method method = kotlin.internal.PlatformImplementations.ReflectThrowable.getHighResolutionOutputSizeshNQ4ISI;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public java.util.List<java.lang.Throwable> getSuppressed(java.lang.Throwable exception) {
        java.lang.Object invoke;
        java.util.List<java.lang.Throwable> asList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        java.lang.reflect.Method method = kotlin.internal.PlatformImplementations.ReflectThrowable.getHighSpeedVideoFpsRangesFor;
        return (method == null || (invoke = method.invoke(exception, new java.lang.Object[0])) == null || (asList = kotlin.collections.ArraysKt.asList((java.lang.Throwable[]) invoke)) == null) ? kotlin.collections.CollectionsKt.emptyList() : asList;
    }

    public kotlin.text.MatchGroup getMatchResultNamedGroup(java.util.regex.MatchResult matchResult, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        throw new java.lang.UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public kotlin.random.Random defaultPlatformRandom() {
        return new kotlin.random.FallbackThreadLocalRandom();
    }

    public kotlin.time.Clock getSystemClock() {
        throw new java.lang.UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
