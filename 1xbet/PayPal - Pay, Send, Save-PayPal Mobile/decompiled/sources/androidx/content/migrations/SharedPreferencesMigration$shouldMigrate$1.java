package androidx.content.migrations;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", i = {}, l = {145}, m = "shouldMigrate", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class SharedPreferencesMigration$shouldMigrate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.content.migrations.SharedPreferencesMigration<T> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.shouldMigrate(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedPreferencesMigration$shouldMigrate$1(androidx.content.migrations.SharedPreferencesMigration<T> sharedPreferencesMigration, kotlin.coroutines.Continuation<? super androidx.content.migrations.SharedPreferencesMigration$shouldMigrate$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = sharedPreferencesMigration;
    }
}
