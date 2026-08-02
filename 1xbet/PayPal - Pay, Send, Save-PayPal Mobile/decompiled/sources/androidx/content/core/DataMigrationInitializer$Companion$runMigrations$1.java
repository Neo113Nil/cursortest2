package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {39, 54}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes3.dex */
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.content.core.DataMigrationInitializer.Companion getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$1(androidx.content.core.DataMigrationInitializer.Companion companion, kotlin.coroutines.Continuation<? super androidx.content.core.DataMigrationInitializer$Companion$runMigrations$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = companion;
    }
}
