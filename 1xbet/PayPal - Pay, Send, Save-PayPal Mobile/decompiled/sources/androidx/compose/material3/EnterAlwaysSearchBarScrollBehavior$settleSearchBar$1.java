package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior", f = "SearchBar.kt", i = {0, 0, 1}, l = {972, 986}, m = "settleSearchBar-OhffZ5M", n = {"remainingVelocity", "scrollFraction", "remainingVelocity"}, s = {"L$0", "F$0", "L$0"})
/* loaded from: classes.dex */
final class EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, 0.0f, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, kotlin.coroutines.Continuation<? super androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = enterAlwaysSearchBarScrollBehavior;
    }
}
