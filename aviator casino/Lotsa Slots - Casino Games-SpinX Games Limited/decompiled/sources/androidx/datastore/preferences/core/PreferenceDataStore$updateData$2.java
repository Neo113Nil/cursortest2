package androidx.datastore.preferences.core;

/* compiled from: PreferenceDataStoreFactory.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class PreferenceDataStore$updateData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> $transform;
    /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PreferenceDataStore$updateData$2(kotlin.jvm.functions.Function2<? super androidx.datastore.preferences.core.Preferences, ? super kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.PreferenceDataStore$updateData$2> continuation) {
        super(2, continuation);
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.datastore.preferences.core.PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new androidx.datastore.preferences.core.PreferenceDataStore$updateData$2(this.$transform, continuation);
        preferenceDataStore$updateData$2.L$0 = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.datastore.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> continuation) {
        return ((androidx.datastore.preferences.core.PreferenceDataStore$updateData$2) create(preferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.datastore.preferences.core.Preferences preferences = (androidx.datastore.preferences.core.Preferences) this.L$0;
            kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> function2 = this.$transform;
            this.label = 1;
            obj = function2.invoke(preferences, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.datastore.preferences.core.Preferences preferences2 = (androidx.datastore.preferences.core.Preferences) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNull(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((androidx.datastore.preferences.core.MutablePreferences) preferences2).freeze$datastore_preferences_core();
        return preferences2;
    }
}
