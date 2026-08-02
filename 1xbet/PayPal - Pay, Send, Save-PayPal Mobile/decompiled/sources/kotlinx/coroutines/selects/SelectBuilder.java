package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J2\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\b\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002¢\u0006\u0004\b\b\u0010\rJX\u0010\b\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002¢\u0006\u0004\b\b\u0010\u0011JR\u0010\b\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\n*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002¢\u0006\u0004\b\b\u0010\u0012J5\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H\u0017¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0017"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilder;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", com.visa.cbp.getEncExpo.updateVisuals, "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Lkotlinx/coroutines/selects/SelectClause2;Lkotlin/jvm/functions/Function2;)V", "", "timeMillis", "onTimeout", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/selects/SelectImplementation;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SelectBuilder<R> {
    void invoke(kotlinx.coroutines.selects.SelectClause0 selectClause0, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1);

    <Q> void invoke(kotlinx.coroutines.selects.SelectClause1<? extends Q> selectClause1, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2);

    <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> selectClause2, P p, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2);

    <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> selectClause2, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @kotlin.ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    void onTimeout(long timeMillis, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void invoke(kotlinx.coroutines.selects.SelectBuilder<? super R> selectBuilder, kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> selectClause2, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
            selectBuilder.invoke(selectClause2, null, function2);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @kotlin.ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        public static <R> void onTimeout(kotlinx.coroutines.selects.SelectBuilder<? super R> selectBuilder, long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
            kotlinx.coroutines.selects.OnTimeoutKt.onTimeout(selectBuilder, j, function1);
        }
    }
}
