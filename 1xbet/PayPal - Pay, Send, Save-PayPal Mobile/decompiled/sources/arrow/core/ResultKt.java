package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0005\u001a\u0019\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"A", "B", "Lkotlin/Result;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "transform", "flatMap", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResultKt {
    public static final <A, B> java.lang.Object flatMap(java.lang.Object obj, kotlin.jvm.functions.Function1<? super A, ? extends kotlin.Result<? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (kotlin.Result.m23442isSuccessimpl(obj)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            obj = function1.invoke(obj);
        }
        java.lang.Object m23436constructorimpl = kotlin.Result.m23436constructorimpl(obj);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        return m23439exceptionOrNullimpl == null ? ((kotlin.Result) m23436constructorimpl).getCamera2StreamConfigurationMap() : kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(m23439exceptionOrNullimpl));
    }
}
