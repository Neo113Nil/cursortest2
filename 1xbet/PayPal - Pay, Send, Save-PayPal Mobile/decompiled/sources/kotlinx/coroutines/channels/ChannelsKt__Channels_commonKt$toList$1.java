package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m = "toList", n = {"$this$toList_u24lambda_u242", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
/* loaded from: classes3.dex */
final class ChannelsKt__Channels_commonKt$toList$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return kotlinx.coroutines.channels.ChannelsKt.toList(null, this);
    }

    ChannelsKt__Channels_commonKt$toList$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1> continuation) {
        super(continuation);
    }
}
