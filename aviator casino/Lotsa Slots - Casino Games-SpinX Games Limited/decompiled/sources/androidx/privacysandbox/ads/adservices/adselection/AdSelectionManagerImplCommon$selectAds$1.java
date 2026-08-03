package androidx.privacysandbox.ads.adservices.adselection;

/* compiled from: AdSelectionManagerImplCommon.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon", f = "AdSelectionManagerImplCommon.kt", i = {}, l = {44}, m = "selectAds$suspendImpl", n = {}, s = {})
/* loaded from: classes2.dex */
final class AdSelectionManagerImplCommon$selectAds$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdSelectionManagerImplCommon$selectAds$1(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon adSelectionManagerImplCommon, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1> continuation) {
        super(continuation);
        this.this$0 = adSelectionManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.selectAds$suspendImpl(this.this$0, (androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig) null, this);
    }
}
