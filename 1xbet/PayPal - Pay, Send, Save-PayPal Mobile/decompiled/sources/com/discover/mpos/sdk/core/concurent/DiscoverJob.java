package com.discover.mpos.sdk.core.concurent;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\r\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001b\b\u0002\u0010\n\u001a\u0015\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u001b\b\u0002\u0010\f\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH&¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "Lkotlin/Function0;", "onExecute", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "onResult", "", "onError", "execute", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface DiscoverJob<R> {
    void cancel();

    void execute(kotlin.jvm.functions.Function0<? extends R> onExecute, kotlin.jvm.functions.Function1<? super R, kotlin.Unit> onResult, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError);

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void execute$default(com.discover.mpos.sdk.core.concurent.DiscoverJob discoverJob, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if ((i & 4) != 0) {
                function12 = null;
            }
            discoverJob.execute(function0, function1, function12);
        }
    }
}
