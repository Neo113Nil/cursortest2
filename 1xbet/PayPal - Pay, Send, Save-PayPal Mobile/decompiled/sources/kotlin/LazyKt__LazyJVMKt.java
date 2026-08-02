package kotlin;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\b\u001a1\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u000b"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "lazy", "(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "Lkotlin/LazyThreadSafetyMode;", "mode", "(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "", "lock", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/LazyKt")
/* loaded from: classes.dex */
public class LazyKt__LazyJVMKt {
    public static final <T> kotlin.Lazy<T> lazy(kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        return new kotlin.SynchronizedLazyImpl(function0, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final <T> kotlin.Lazy<T> lazy(kotlin.LazyThreadSafetyMode lazyThreadSafetyMode, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        int i = kotlin.LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0[lazyThreadSafetyMode.ordinal()];
        int i2 = 2;
        if (i == 1) {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            return new kotlin.SynchronizedLazyImpl(function0, defaultConstructorMarker, i2, defaultConstructorMarker);
        }
        if (i == 2) {
            return new kotlin.SafePublicationLazyImpl(function0);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new kotlin.UnsafeLazyImpl(function0);
    }

    public static final <T> kotlin.Lazy<T> lazy(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.SynchronizedLazyImpl(function0, obj);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.LazyThreadSafetyMode.values().length];
            try {
                iArr[kotlin.LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
