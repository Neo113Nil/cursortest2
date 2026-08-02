package kotlin.reflect.jvm.internal;

/* loaded from: classes5.dex */
public class ReflectProperties {

    public static abstract class Val<T> {
        private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object() { // from class: kotlin.reflect.jvm.internal.ReflectProperties.Val.1
        };

        public abstract T invoke();

        public final T getValue(java.lang.Object obj, java.lang.Object obj2) {
            return invoke();
        }

        protected java.lang.Object escape(T t) {
            return t == null ? getHighResolutionOutputSizeshNQ4ISI : t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T unescape(java.lang.Object obj) {
            if (obj == getHighResolutionOutputSizeshNQ4ISI) {
                return null;
            }
            return obj;
        }
    }

    public static class LazySoftVal<T> extends kotlin.reflect.jvm.internal.ReflectProperties.Val<T> implements kotlin.jvm.functions.Function0<T> {
        private volatile java.lang.ref.SoftReference<java.lang.Object> getHighSpeedVideoFpsRanges;
        private final kotlin.jvm.functions.Function0<T> getHighSpeedVideoFpsRangesFor;

        public LazySoftVal(T t, kotlin.jvm.functions.Function0<T> function0) {
            if (function0 != null) {
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoFpsRangesFor = function0;
                if (t != null) {
                    this.getHighSpeedVideoFpsRanges = new java.lang.ref.SoftReference<>(escape(t));
                    return;
                }
                return;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, kotlin.jvm.functions.Function0
        public T invoke() {
            java.lang.Object obj;
            java.lang.ref.SoftReference<java.lang.Object> softReference = this.getHighSpeedVideoFpsRanges;
            if (softReference != null && (obj = softReference.get()) != null) {
                return unescape(obj);
            }
            T invoke = this.getHighSpeedVideoFpsRangesFor.invoke();
            this.getHighSpeedVideoFpsRanges = new java.lang.ref.SoftReference<>(escape(invoke));
            return invoke;
        }
    }

    public static <T> kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<T> lazySoft(T t, kotlin.jvm.functions.Function0<T> function0) {
        if (function0 == null) {
            getHighSpeedVideoSizes();
        }
        return new kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<>(t, function0);
    }

    public static <T> kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<T> lazySoft(kotlin.jvm.functions.Function0<T> function0) {
        if (function0 == null) {
            getHighSpeedVideoSizes();
        }
        return lazySoft(null, function0);
    }

    private static /* synthetic */ void getHighSpeedVideoSizes() {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }
}
