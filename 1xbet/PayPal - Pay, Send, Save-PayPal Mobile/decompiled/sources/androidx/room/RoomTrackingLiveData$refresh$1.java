package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomTrackingLiveData", f = "RoomTrackingLiveData.android.kt", i = {0}, l = {82}, m = com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, n = {"computed"}, s = {"I$0"})
/* loaded from: classes7.dex */
final class RoomTrackingLiveData$refresh$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.room.RoomTrackingLiveData<T> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomTrackingLiveData$refresh$1(androidx.room.RoomTrackingLiveData<T> roomTrackingLiveData, kotlin.coroutines.Continuation<? super androidx.room.RoomTrackingLiveData$refresh$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = roomTrackingLiveData;
    }
}
