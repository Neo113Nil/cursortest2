package com.discover.mpos.sdk.core.extensions;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "unsafeLazy", "(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class UtilExtensionsKt {
    public static final <T> kotlin.Lazy<T> unsafeLazy(final kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<T>() { // from class: com.discover.mpos.sdk.core.extensions.UtilExtensionsKt$unsafeLazy$1
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) kotlin.jvm.functions.Function0.this.invoke();
            }

            {
                super(0);
            }
        });
    }
}
