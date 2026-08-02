package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE}, m = "readAndInitOrPropagateAndThrowFailure", n = {"preReadVersion"}, s = {"I$0"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = dataStoreImpl;
    }
}
