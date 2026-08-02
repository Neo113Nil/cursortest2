package androidx.content.preferences.core;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {343}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class PreferencesKt$edit$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            return mutablePreferences;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences2 = ((androidx.content.preferences.core.Preferences) this.getHighSpeedVideoSizes).toMutablePreferences();
        kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = mutablePreferences2;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        return function2.invoke(mutablePreferences2, this) == coroutine_suspended ? coroutine_suspended : mutablePreferences2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.content.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
        return ((androidx.content.preferences.core.PreferencesKt$edit$2) create(preferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.preferences.core.PreferencesKt$edit$2 preferencesKt$edit$2 = new androidx.content.preferences.core.PreferencesKt$edit$2(this.getHighSpeedVideoFpsRangesFor, continuation);
        preferencesKt$edit$2.getHighSpeedVideoSizes = obj;
        return preferencesKt$edit$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PreferencesKt$edit$2(kotlin.jvm.functions.Function2<? super androidx.content.preferences.core.MutablePreferences, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.PreferencesKt$edit$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
