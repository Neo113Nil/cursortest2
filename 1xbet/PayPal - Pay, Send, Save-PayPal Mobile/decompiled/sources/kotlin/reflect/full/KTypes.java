package kotlin.reflect.full;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Lkotlin/reflect/KType;", "", "nullable", "withNullability", "(Lkotlin/reflect/KType;Z)Lkotlin/reflect/KType;", "other", "isSubtypeOf", "(Lkotlin/reflect/KType;Lkotlin/reflect/KType;)Z", "isSupertypeOf"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KTypes {
    public static final kotlin.reflect.KType withNullability(kotlin.reflect.KType kType, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        return ((kotlin.reflect.jvm.internal.types.AbstractKType) kType).makeNullableAsSpecified(z);
    }

    public static final boolean isSubtypeOf(kotlin.reflect.KType kType, kotlin.reflect.KType kType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType2, "");
        if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
            return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(((kotlin.reflect.jvm.internal.types.DescriptorKType) kType).getGetHighResolutionOutputSizeshNQ4ISI(), ((kotlin.reflect.jvm.internal.types.DescriptorKType) kType2).getGetHighResolutionOutputSizeshNQ4ISI());
        }
        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.isSubtypeOf$default(kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE, new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState(false, false, false, false, kotlin.reflect.jvm.internal.types.ReflectTypeSystemContext.INSTANCE, kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator.Default.INSTANCE, kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner.Default.INSTANCE), (kotlin.reflect.jvm.internal.types.AbstractKType) kType, (kotlin.reflect.jvm.internal.types.AbstractKType) kType2, false, 8, null);
    }

    public static final boolean isSupertypeOf(kotlin.reflect.KType kType, kotlin.reflect.KType kType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType2, "");
        return isSubtypeOf(kType2, kType);
    }
}
