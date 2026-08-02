package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\r\u0010\n"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/selects/SelectBuilder;", "", "timeMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "", "onTimeout", "(Lkotlinx/coroutines/selects/SelectBuilder;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/Duration;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "onTimeout-8Mi8wO0"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnTimeoutKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <R> void onTimeout(kotlinx.coroutines.selects.SelectBuilder<? super R> selectBuilder, long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        kotlinx.coroutines.selects.OnTimeout onTimeout = new kotlinx.coroutines.selects.OnTimeout(j);
        kotlinx.coroutines.selects.OnTimeout$selectClause$1 onTimeout$selectClause$1 = kotlinx.coroutines.selects.OnTimeout$selectClause$1.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(onTimeout$selectClause$1, "");
        selectBuilder.invoke((kotlinx.coroutines.selects.SelectClause0) new kotlinx.coroutines.selects.SelectClause0Impl(onTimeout, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(onTimeout$selectClause$1, 3), null, 4, null), (kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Object>, ? extends java.lang.Object>) function1);
    }

    /* renamed from: onTimeout-8Mi8wO0, reason: not valid java name */
    public static final <R> void m24132onTimeout8Mi8wO0(kotlinx.coroutines.selects.SelectBuilder<? super R> selectBuilder, long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        onTimeout(selectBuilder, kotlinx.coroutines.DelayKt.m24058toDelayMillisLRDsOJo(j), function1);
    }
}
