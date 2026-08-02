package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "legacyPrefs", "Landroidx/datastore/migrations/SharedPreferencesView;", "currentPrefs"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider$provideMigrations$1$1", f = "SharedPrefsMigrationProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class SharedPrefsMigrationProvider$provideMigrations$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.content.migrations.SharedPreferencesView, androidx.content.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Set<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration> getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper sharedPreferenceMigrationHelper;
        androidx.content.migrations.SharedPreferencesView sharedPreferencesView = (androidx.content.migrations.SharedPreferencesView) this.getHighSpeedVideoSizes;
        androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sharedPreferenceMigrationHelper = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            return sharedPreferenceMigrationHelper.migratePrefs(sharedPreferencesView, preferences, this.getHighSpeedVideoFpsRanges);
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(androidx.content.migrations.SharedPreferencesView sharedPreferencesView, androidx.content.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
        com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider$provideMigrations$1$1 sharedPrefsMigrationProvider$provideMigrations$1$1 = new com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider$provideMigrations$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        sharedPrefsMigrationProvider$provideMigrations$1$1.getHighSpeedVideoSizes = sharedPreferencesView;
        sharedPrefsMigrationProvider$provideMigrations$1$1.getHighSpeedVideoFpsRangesFor = preferences;
        return sharedPrefsMigrationProvider$provideMigrations$1$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedPrefsMigrationProvider$provideMigrations$1$1(com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider sharedPrefsMigrationProvider, java.util.Set<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration> set, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider$provideMigrations$1$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = sharedPrefsMigrationProvider;
        this.getHighSpeedVideoFpsRanges = set;
    }
}
