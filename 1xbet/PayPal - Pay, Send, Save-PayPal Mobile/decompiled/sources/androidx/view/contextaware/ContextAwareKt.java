package androidx.view.contextaware;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00078\u0000¢\u0006\u0002\b\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u0002H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/activity/contextaware/ContextAware;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/jvm/JvmSuppressWildcards;", "onContextAvailable", "withContextAvailable", "(Landroidx/activity/contextaware/ContextAware;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContextAwareKt {
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1] */
    public static final <R> java.lang.Object withContextAvailable(final androidx.view.contextaware.ContextAware contextAware, final kotlin.jvm.functions.Function1<android.content.Context, R> function1, kotlin.coroutines.Continuation<R> continuation) {
        android.content.Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return function1.invoke(peekAvailableContext);
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final ?? r2 = new androidx.view.contextaware.OnContextAvailableListener() { // from class: androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public final void onContextAvailable(android.content.Context context) {
                java.lang.Object m23436constructorimpl;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                kotlin.coroutines.Continuation continuation2 = cancellableContinuationImpl2;
                kotlin.jvm.functions.Function1<android.content.Context, R> function12 = function1;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    androidx.view.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = this;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(function12.invoke(context));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                continuation2.resumeWith(m23436constructorimpl);
            }
        };
        contextAware.addOnContextAvailableListener((androidx.view.contextaware.OnContextAvailableListener) r2);
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                androidx.view.contextaware.ContextAware.this.removeOnContextAvailableListener(r2);
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
