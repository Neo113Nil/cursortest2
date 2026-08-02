package androidx.content.preferences;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\""}, d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "", "name", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroid/content/Context;Lkotlin/reflect/KProperty;)Landroidx/datastore/core/DataStore;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "Landroidx/datastore/core/DataStore;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferenceDataStoreSingletonDelegate implements kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.content.core.DataStore<androidx.content.preferences.core.Preferences>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<android.content.Context, java.util.List<androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(java.lang.String str, androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> replaceFileCorruptionHandler, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>>> function1, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = replaceFileCorruptionHandler;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final /* bridge */ /* synthetic */ androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> getValue(android.content.Context context, kotlin.reflect.KProperty kProperty) {
        return getValue2(context, (kotlin.reflect.KProperty<?>) kProperty);
    }

    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> getValue2(android.content.Context thisRef, kotlin.reflect.KProperty<?> property) {
        androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> dataStore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> dataStore2 = this.getHighSpeedVideoSizesFor;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoSizesFor == null) {
                final android.content.Context applicationContext = thisRef.getApplicationContext();
                androidx.content.preferences.core.PreferenceDataStoreFactory preferenceDataStoreFactory = androidx.content.preferences.core.PreferenceDataStoreFactory.INSTANCE;
                androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> replaceFileCorruptionHandler = this.Camera2StreamConfigurationMap;
                kotlin.jvm.functions.Function1<android.content.Context, java.util.List<androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>>> function1 = this.getHighSpeedVideoSizes;
                kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext);
                this.getHighSpeedVideoSizesFor = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, function1.invoke(applicationContext), this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function0() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.content.preferences.PreferenceDataStoreSingletonDelegate.$r8$lambda$n_JROCQhFBE9lHuSpefRs1uNEcA(applicationContext, this);
                    }
                });
            }
            dataStore = this.getHighSpeedVideoSizesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dataStore);
        }
        return dataStore;
    }

    public static /* synthetic */ java.io.File $r8$lambda$n_JROCQhFBE9lHuSpefRs1uNEcA(android.content.Context context, androidx.content.preferences.PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        return androidx.content.preferences.PreferenceDataStoreFile.preferencesDataStoreFile(context, preferenceDataStoreSingletonDelegate.getHighSpeedVideoFpsRanges);
    }
}
