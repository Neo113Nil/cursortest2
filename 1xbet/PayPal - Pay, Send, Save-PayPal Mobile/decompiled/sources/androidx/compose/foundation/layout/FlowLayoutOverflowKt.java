package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "errorMessage", "Lkotlin/Function0;", "", "initializer", "Lkotlin/Lazy;", "lazyInt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlowLayoutOverflowKt {
    public static /* synthetic */ kotlin.Lazy lazyInt$default(java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return lazyInt(str, function0);
    }

    public static final kotlin.Lazy<java.lang.Integer> lazyInt(java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        return new androidx.compose.foundation.layout.LazyImpl(function0, str);
    }
}
