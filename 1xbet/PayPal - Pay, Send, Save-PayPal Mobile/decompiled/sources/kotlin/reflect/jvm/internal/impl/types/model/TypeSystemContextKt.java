package kotlin.reflect.jvm.internal.impl.types.model;

/* loaded from: classes5.dex */
public final class TypeSystemContextKt {
    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance convertVariance(kotlin.reflect.jvm.internal.impl.types.Variance variance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variance, "");
        int i = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV;
        }
        if (i == 2) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
