package androidx.privacysandbox.ads.adservices.appsetid;

/* compiled from: AppSetIdManagerImplCommon.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", f = "AppSetIdManagerImplCommon.kt", i = {}, l = {38}, m = "getAppSetId$suspendImpl", n = {}, s = {})
/* loaded from: classes2.dex */
final class AppSetIdManagerImplCommon$getAppSetId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSetIdManagerImplCommon$getAppSetId$1(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon appSetIdManagerImplCommon, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1> continuation) {
        super(continuation);
        this.this$0 = appSetIdManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.getAppSetId$suspendImpl(this.this$0, this);
    }
}
