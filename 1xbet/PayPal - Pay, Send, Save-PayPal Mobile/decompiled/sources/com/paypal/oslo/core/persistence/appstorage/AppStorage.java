package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u000f\u001a\u00020\u000e\"\b\b\u0000\u0010\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0086B¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0015\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0016\u0010\u0014J\u001d\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00192\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001cH\u0086B¢\u0006\u0004\b\u0013\u0010\u001dJ \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001e\u0010\u001dJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u001f\u0010\u0017J \u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001f\u0010\u001dJ\u001d\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00192\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b \u0010\u001bJ \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020!H\u0086B¢\u0006\u0004\b\u0013\u0010\"J \u0010#\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020!H\u0086@¢\u0006\u0004\b#\u0010\"J\u001a\u0010$\u001a\u0004\u0018\u00010!2\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0004\b$\u0010\u0017J \u0010$\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020!H\u0086@¢\u0006\u0004\b$\u0010\"J\u001d\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00192\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b%\u0010\u001bJ \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020&H\u0086B¢\u0006\u0004\b\u0013\u0010'J \u0010(\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020&H\u0086@¢\u0006\u0004\b(\u0010'J\u001a\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0004\b)\u0010\u0017J \u0010)\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020&H\u0086@¢\u0006\u0004\b)\u0010'J\u001d\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00192\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b*\u0010\u001bJ \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020+H\u0086B¢\u0006\u0004\b\u0013\u0010,J \u0010-\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020+H\u0086@¢\u0006\u0004\b-\u0010,J\u001a\u0010.\u001a\u0004\u0018\u00010+2\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0004\b.\u0010\u0017J \u0010.\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020+H\u0086@¢\u0006\u0004\b.\u0010,J\u001d\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00192\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b/\u0010\u001bJ \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u000200H\u0086B¢\u0006\u0004\b\u0013\u00101J \u00102\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u000200H\u0086@¢\u0006\u0004\b2\u00101J\u001a\u00103\u001a\u0004\u0018\u0001002\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0004\b3\u0010\u0017J \u00103\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0018\u001a\u000200H\u0086@¢\u0006\u0004\b3\u00101J\u001d\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00192\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b4\u0010\u001bJ&\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0086B¢\u0006\u0004\b\u0013\u00106J&\u00107\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0086@¢\u0006\u0004\b7\u00106J \u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001052\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0004\b8\u0010\u0017J,\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002052\u0006\u0010\u0011\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0086@¢\u0006\u0004\b8\u00106J#\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001050\u00192\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b9\u0010\u001bJ \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020:H\u0086B¢\u0006\u0004\b\u0013\u0010;J \u0010<\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020:H\u0086@¢\u0006\u0004\b<\u0010;J\u001a\u0010=\u001a\u0004\u0018\u00010:2\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0004\b=\u0010\u0017J \u0010=\u001a\u00020:2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020:H\u0086@¢\u0006\u0004\b=\u0010;J\u001d\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u00192\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b>\u0010\u001bJ\u0018\u0010?\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0004\b?\u0010\u0017J\u0018\u0010@\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0086B¢\u0006\u0004\b@\u0010\u0017J\u0010\u0010A\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bA\u0010BJ-\u0010D\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020C2\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u001c0C2\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u001c¢\u0006\u0004\bF\u0010GJ-\u0010H\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020!0C2\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020!¢\u0006\u0004\bH\u0010IJ-\u0010J\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020&0C2\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020&¢\u0006\u0004\bJ\u0010KJ-\u0010L\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020+0C2\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020+¢\u0006\u0004\bL\u0010MJ-\u0010N\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u0002000C2\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u000200¢\u0006\u0004\bN\u0010OJ9\u0010P\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0002050C2\u0006\u0010\u0011\u001a\u00020\t2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000205¢\u0006\u0004\bP\u0010QJ-\u0010R\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020:0C2\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020:¢\u0006\u0004\bR\u0010SR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "", "", "moduleName", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Landroid/content/Context;)V", "T", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;", "p0", "Landroidx/datastore/preferences/core/Preferences$Key;", "p1", "p2", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "set", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setString", "getString", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultValue", "Lkotlinx/coroutines/flow/Flow;", "getStringFlow", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;)Lkotlinx/coroutines/flow/Flow;", "", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInt", "getInt", "getIntFlow", "", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBoolean", "getBoolean", "getBooleanFlow", "", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLong", "getLong", "getLongFlow", "", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFloat", "getFloat", "getFloatFlow", "", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDouble", "getDouble", "getDoubleFlow", "", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setStringSet", "getStringSet", "getStringSetFlow", "", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setByteArray", "getByteArray", "getByteArrayFlow", "remove", "minusAssign", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/properties/ReadWriteProperty;", "string", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Ljava/lang/String;)Lkotlin/properties/ReadWriteProperty;", com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT, "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;I)Lkotlin/properties/ReadWriteProperty;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN, "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Z)Lkotlin/properties/ReadWriteProperty;", com.adjust.sdk.Constants.LONG, "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;J)Lkotlin/properties/ReadWriteProperty;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT, "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;F)Lkotlin/properties/ReadWriteProperty;", com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE, "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;D)Lkotlin/properties/ReadWriteProperty;", "stringSet", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Ljava/util/Set;)Lkotlin/properties/ReadWriteProperty;", "byteArray", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;[B)Lkotlin/properties/ReadWriteProperty;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getHighSpeedVideoFpsRanges", "Landroidx/datastore/core/DataStore;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppStorage {
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorage.Companion Companion = new com.paypal.oslo.core.persistence.appstorage.AppStorage.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String ENCRYPTED_PREFIX = "encrypted_";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.persistence.encryption.EncryptionManager getHighSpeedVideoFpsRangesFor;

    public AppStorage(java.lang.String str, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context.getApplicationContext(), com.paypal.oslo.core.persistence.appstorage.di.AppStorageEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.core.persistence.appstorage.di.AppStorageEntryPoint appStorageEntryPoint = (com.paypal.oslo.core.persistence.appstorage.di.AppStorageEntryPoint) obj;
        this.getHighSpeedVideoSizes = appStorageEntryPoint.dataStore();
        this.getHighSpeedVideoFpsRangesFor = appStorageEntryPoint.encryptionManager();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/AppStorage$Companion;", "", "<init>", "()V", "", "ENCRYPTED_PREFIX", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key<T> key, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(this.getHighSpeedVideoSizes, new com.paypal.oslo.core.persistence.appstorage.AppStorage$setValue$2(this, appStorageKey, t, key, null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object set(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), str, continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setString(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), str, continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getString(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getString$1 appStorage$getString$1;
        int i;
        androidx.datastore.preferences.core.Preferences.Key<java.lang.String> stringKey;
        java.lang.Object first;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getString$1) {
            appStorage$getString$1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getString$1) continuation;
            if ((appStorage$getString$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                appStorage$getString$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = appStorage$getString$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getString$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    stringKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
                    kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
                    appStorage$getString$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getString$1.Camera2StreamConfigurationMap = this;
                    appStorage$getString$1.getHighSpeedVideoSizes = appStorageKey;
                    appStorage$getString$1.getHighResolutionOutputSizeshNQ4ISI = stringKey;
                    appStorage$getString$1.getHighSpeedVideoFpsRanges = 0;
                    appStorage$getString$1.getOutputMinFrameDuration = 1;
                    first = kotlinx.coroutines.flow.FlowKt.first(data, appStorage$getString$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appStorage = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = appStorage$getString$1.getHighSpeedVideoFpsRanges;
                    androidx.datastore.preferences.core.Preferences.Key<java.lang.String> key = (androidx.datastore.preferences.core.Preferences.Key) appStorage$getString$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey2 = (com.paypal.oslo.core.persistence.appstorage.AppStorageKey) appStorage$getString$1.getHighSpeedVideoSizes;
                    appStorage = (com.paypal.oslo.core.persistence.appstorage.AppStorage) appStorage$getString$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    first = obj;
                    stringKey = key;
                    appStorageKey = appStorageKey2;
                }
                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) first;
                if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
                    java.lang.String str = (java.lang.String) preferences.get(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(appStorageKey.getName()))));
                    if (str == null) {
                        return null;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = appStorage;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(appStorage.getHighSpeedVideoFpsRangesFor.decryptValue(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", stringKey.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                    }
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        return null;
                    }
                    return m23436constructorimpl;
                }
                java.lang.Object obj2 = preferences.get(stringKey);
                return (java.lang.String) (obj2 instanceof java.lang.String ? obj2 : null);
            }
        }
        appStorage$getString$1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getString$1(this, continuation);
        java.lang.Object obj3 = appStorage$getString$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getString$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        androidx.content.preferences.core.Preferences preferences2 = (androidx.content.preferences.core.Preferences) first;
        if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getString(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getString$2 appStorage$getString$2;
        int i;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getString$2) {
            appStorage$getString$2 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getString$2) continuation;
            if ((appStorage$getString$2.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                appStorage$getString$2.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = appStorage$getString$2.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getString$2.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appStorage$getString$2.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getString$2.getHighSpeedVideoSizes = str;
                    appStorage$getString$2.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getString(appStorageKey, appStorage$getString$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) appStorage$getString$2.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str2 = (java.lang.String) obj;
                return str2 != null ? str : str2;
            }
        }
        appStorage$getString$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getString$2(this, continuation);
        java.lang.Object obj2 = appStorage$getString$2.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getString$2.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        if (str22 != null) {
        }
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.String> getStringFlow(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> stringKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(this.getHighResolutionOutputSizeshNQ4ISI, key.getName());
        final kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
        return new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1.AnonymousClass2(flowCollector, this, key, stringKey), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRanges;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.lang.String str;
                    java.lang.String concat;
                    java.lang.Object m23436constructorimpl;
                    com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
                    if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
                                if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges)) {
                                    com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                                    str = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighResolutionOutputSizeshNQ4ISI;
                                    concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges.getName()));
                                    java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                                    obj2 = null;
                                    if (str2 != null) {
                                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                        try {
                                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                            encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class)));
                                        } catch (java.lang.Throwable th) {
                                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                        }
                                        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                        if (m23439exceptionOrNullimpl != null) {
                                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.Camera2StreamConfigurationMap.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                                        }
                                        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                            obj2 = m23436constructorimpl;
                                        }
                                    }
                                } else {
                                    obj2 = preferences.get(this.Camera2StreamConfigurationMap);
                                }
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getOutputMinFrameDuration = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj5 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1$2", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringFlow$$inlined$getValueFlow$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = appStorage;
                    this.getHighSpeedVideoFpsRanges = appStorageKey;
                    this.Camera2StreamConfigurationMap = key;
                }
            }
        };
    }

    public final java.lang.Object set(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.intKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxInt(i), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setInt(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.intKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxInt(i), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInt(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getInt$1 appStorage$getInt$1;
        int i;
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> intKey;
        java.lang.Object first;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getInt$1) {
            appStorage$getInt$1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getInt$1) continuation;
            if ((appStorage$getInt$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                appStorage$getInt$1.getInputFormats -= 2147483648;
                java.lang.Object obj = appStorage$getInt$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getInt$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    intKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.intKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
                    kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
                    appStorage$getInt$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getInt$1.Camera2StreamConfigurationMap = this;
                    appStorage$getInt$1.getHighSpeedVideoFpsRanges = appStorageKey;
                    appStorage$getInt$1.getHighResolutionOutputSizeshNQ4ISI = intKey;
                    appStorage$getInt$1.getHighSpeedVideoFpsRangesFor = 0;
                    appStorage$getInt$1.getInputFormats = 1;
                    first = kotlinx.coroutines.flow.FlowKt.first(data, appStorage$getInt$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appStorage = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = appStorage$getInt$1.getHighSpeedVideoFpsRangesFor;
                    androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> key = (androidx.datastore.preferences.core.Preferences.Key) appStorage$getInt$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey2 = (com.paypal.oslo.core.persistence.appstorage.AppStorageKey) appStorage$getInt$1.getHighSpeedVideoFpsRanges;
                    appStorage = (com.paypal.oslo.core.persistence.appstorage.AppStorage) appStorage$getInt$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    first = obj;
                    intKey = key;
                    appStorageKey = appStorageKey2;
                }
                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) first;
                if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
                    java.lang.String str = (java.lang.String) preferences.get(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(appStorageKey.getName()))));
                    if (str == null) {
                        return null;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = appStorage;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(appStorage.getHighSpeedVideoFpsRangesFor.decryptValue(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.class)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", intKey.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                    }
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        return null;
                    }
                    return m23436constructorimpl;
                }
                java.lang.Object obj2 = preferences.get(intKey);
                return (java.lang.Integer) (obj2 instanceof java.lang.Integer ? obj2 : null);
            }
        }
        appStorage$getInt$1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getInt$1(this, continuation);
        java.lang.Object obj3 = appStorage$getInt$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getInt$1.getInputFormats;
        if (i != 0) {
        }
        androidx.content.preferences.core.Preferences preferences2 = (androidx.content.preferences.core.Preferences) first;
        if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInt(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, int i, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getInt$2 appStorage$getInt$2;
        int i2;
        java.lang.Integer num;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getInt$2) {
            appStorage$getInt$2 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getInt$2) continuation;
            if ((appStorage$getInt$2.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                appStorage$getInt$2.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = appStorage$getInt$2.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = appStorage$getInt$2.Camera2StreamConfigurationMap;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appStorage$getInt$2.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getInt$2.getHighSpeedVideoSizes = i;
                    appStorage$getInt$2.Camera2StreamConfigurationMap = 1;
                    obj = getInt(appStorageKey, appStorage$getInt$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = appStorage$getInt$2.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                num = (java.lang.Integer) obj;
                if (num != null) {
                    i = num.intValue();
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(i);
            }
        }
        appStorage$getInt$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getInt$2(this, continuation);
        java.lang.Object obj2 = appStorage$getInt$2.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = appStorage$getInt$2.Camera2StreamConfigurationMap;
        if (i2 != 0) {
        }
        num = (java.lang.Integer) obj2;
        if (num != null) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(i);
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getIntFlow(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> intKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.intKey(this.getHighResolutionOutputSizeshNQ4ISI, key.getName());
        final kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
        return new kotlinx.coroutines.flow.Flow<java.lang.Integer>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Integer> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1.AnonymousClass2(flowCollector, this, key, intKey), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.lang.String str;
                    java.lang.String concat;
                    java.lang.Object m23436constructorimpl;
                    com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
                    if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
                                if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor)) {
                                    com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                                    str = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighResolutionOutputSizeshNQ4ISI;
                                    concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor.getName()));
                                    java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                                    obj2 = null;
                                    if (str2 != null) {
                                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                        try {
                                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                            encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.class)));
                                        } catch (java.lang.Throwable th) {
                                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                        }
                                        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                        if (m23439exceptionOrNullimpl != null) {
                                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.Camera2StreamConfigurationMap.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                                        }
                                        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                            obj2 = m23436constructorimpl;
                                        }
                                    }
                                } else {
                                    obj2 = preferences.get(this.Camera2StreamConfigurationMap);
                                }
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.Camera2StreamConfigurationMap = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj4 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj5 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1$2", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputFormats;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.persistence.appstorage.AppStorage$getIntFlow$$inlined$getValueFlow$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = appStorage;
                    this.getHighSpeedVideoFpsRangesFor = appStorageKey;
                    this.Camera2StreamConfigurationMap = key;
                }
            }
        };
    }

    public final java.lang.Object set(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.booleanKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setBoolean(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.booleanKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getBoolean(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getBoolean$1 appStorage$getBoolean$1;
        int i;
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> booleanKey;
        java.lang.Object first;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getBoolean$1) {
            appStorage$getBoolean$1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getBoolean$1) continuation;
            if ((appStorage$getBoolean$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                appStorage$getBoolean$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = appStorage$getBoolean$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getBoolean$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    booleanKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.booleanKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
                    kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
                    appStorage$getBoolean$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getBoolean$1.getHighSpeedVideoFpsRangesFor = this;
                    appStorage$getBoolean$1.getHighResolutionOutputSizeshNQ4ISI = appStorageKey;
                    appStorage$getBoolean$1.getHighSpeedVideoFpsRanges = booleanKey;
                    appStorage$getBoolean$1.getHighSpeedVideoSizes = 0;
                    appStorage$getBoolean$1.getOutputFormats = 1;
                    first = kotlinx.coroutines.flow.FlowKt.first(data, appStorage$getBoolean$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appStorage = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = appStorage$getBoolean$1.getHighSpeedVideoSizes;
                    androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> key = (androidx.datastore.preferences.core.Preferences.Key) appStorage$getBoolean$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey2 = (com.paypal.oslo.core.persistence.appstorage.AppStorageKey) appStorage$getBoolean$1.getHighResolutionOutputSizeshNQ4ISI;
                    appStorage = (com.paypal.oslo.core.persistence.appstorage.AppStorage) appStorage$getBoolean$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    first = obj;
                    booleanKey = key;
                    appStorageKey = appStorageKey2;
                }
                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) first;
                if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
                    java.lang.String str = (java.lang.String) preferences.get(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(appStorageKey.getName()))));
                    if (str == null) {
                        return null;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = appStorage;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(appStorage.getHighSpeedVideoFpsRangesFor.decryptValue(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", booleanKey.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                    }
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        return null;
                    }
                    return m23436constructorimpl;
                }
                java.lang.Object obj2 = preferences.get(booleanKey);
                return (java.lang.Boolean) (obj2 instanceof java.lang.Boolean ? obj2 : null);
            }
        }
        appStorage$getBoolean$1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getBoolean$1(this, continuation);
        java.lang.Object obj3 = appStorage$getBoolean$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getBoolean$1.getOutputFormats;
        if (i != 0) {
        }
        androidx.content.preferences.core.Preferences preferences2 = (androidx.content.preferences.core.Preferences) first;
        if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getBoolean(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, boolean z, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getBoolean$2 appStorage$getBoolean$2;
        int i;
        java.lang.Boolean bool;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getBoolean$2) {
            appStorage$getBoolean$2 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getBoolean$2) continuation;
            if ((appStorage$getBoolean$2.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                appStorage$getBoolean$2.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = appStorage$getBoolean$2.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getBoolean$2.getHighSpeedVideoFpsRanges;
                boolean z2 = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appStorage$getBoolean$2.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getBoolean$2.Camera2StreamConfigurationMap = z;
                    appStorage$getBoolean$2.getHighSpeedVideoFpsRanges = 1;
                    obj = getBoolean(appStorageKey, appStorage$getBoolean$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = appStorage$getBoolean$2.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                bool = (java.lang.Boolean) obj;
                if (bool == null) {
                    z2 = bool.booleanValue();
                } else if (!z) {
                    z2 = false;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
            }
        }
        appStorage$getBoolean$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getBoolean$2(this, continuation);
        java.lang.Object obj2 = appStorage$getBoolean$2.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getBoolean$2.getHighSpeedVideoFpsRanges;
        boolean z22 = true;
        if (i != 0) {
        }
        bool = (java.lang.Boolean) obj2;
        if (bool == null) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z22);
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getBooleanFlow(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> booleanKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.booleanKey(this.getHighResolutionOutputSizeshNQ4ISI, key.getName());
        final kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
        return new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1.AnonymousClass2(flowCollector, this, key, booleanKey), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key getHighSpeedVideoSizes;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.lang.String str;
                    java.lang.String concat;
                    java.lang.Object m23436constructorimpl;
                    com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
                    if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
                                if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI)) {
                                    com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                                    str = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                                    concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getName()));
                                    java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                                    obj2 = null;
                                    if (str2 != null) {
                                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
                                        try {
                                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                            encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class)));
                                        } catch (java.lang.Throwable th) {
                                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                        }
                                        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                        if (m23439exceptionOrNullimpl != null) {
                                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighSpeedVideoSizes.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                                        }
                                        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                            obj2 = m23436constructorimpl;
                                        }
                                    }
                                } else {
                                    obj2 = preferences.get(this.getHighSpeedVideoSizes);
                                }
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj5 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1$2", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputFormats;
                    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputSizeshNQ4ISI = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.persistence.appstorage.AppStorage$getBooleanFlow$$inlined$getValueFlow$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    this.Camera2StreamConfigurationMap = appStorage;
                    this.getHighResolutionOutputSizeshNQ4ISI = appStorageKey;
                    this.getHighSpeedVideoSizes = key;
                }
            }
        };
    }

    public final java.lang.Object set(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.longKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxLong(j), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setLong(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.longKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxLong(j), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getLong(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getLong$1 appStorage$getLong$1;
        int i;
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> longKey;
        java.lang.Object first;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getLong$1) {
            appStorage$getLong$1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getLong$1) continuation;
            if ((appStorage$getLong$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                appStorage$getLong$1.getInputFormats -= 2147483648;
                java.lang.Object obj = appStorage$getLong$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getLong$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    longKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.longKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
                    kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
                    appStorage$getLong$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getLong$1.getHighSpeedVideoFpsRanges = this;
                    appStorage$getLong$1.getHighSpeedVideoSizes = appStorageKey;
                    appStorage$getLong$1.getHighSpeedVideoFpsRangesFor = longKey;
                    appStorage$getLong$1.Camera2StreamConfigurationMap = 0;
                    appStorage$getLong$1.getInputFormats = 1;
                    first = kotlinx.coroutines.flow.FlowKt.first(data, appStorage$getLong$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appStorage = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = appStorage$getLong$1.Camera2StreamConfigurationMap;
                    androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> key = (androidx.datastore.preferences.core.Preferences.Key) appStorage$getLong$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey2 = (com.paypal.oslo.core.persistence.appstorage.AppStorageKey) appStorage$getLong$1.getHighSpeedVideoSizes;
                    appStorage = (com.paypal.oslo.core.persistence.appstorage.AppStorage) appStorage$getLong$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    first = obj;
                    longKey = key;
                    appStorageKey = appStorageKey2;
                }
                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) first;
                if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
                    java.lang.String str = (java.lang.String) preferences.get(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(appStorageKey.getName()))));
                    if (str == null) {
                        return null;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = appStorage;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(appStorage.getHighSpeedVideoFpsRangesFor.decryptValue(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.class)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", longKey.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                    }
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        return null;
                    }
                    return m23436constructorimpl;
                }
                java.lang.Object obj2 = preferences.get(longKey);
                return (java.lang.Long) (obj2 instanceof java.lang.Long ? obj2 : null);
            }
        }
        appStorage$getLong$1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getLong$1(this, continuation);
        java.lang.Object obj3 = appStorage$getLong$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getLong$1.getInputFormats;
        if (i != 0) {
        }
        androidx.content.preferences.core.Preferences preferences2 = (androidx.content.preferences.core.Preferences) first;
        if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getLong(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, long j, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getLong$2 appStorage$getLong$2;
        int i;
        java.lang.Long l;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getLong$2) {
            appStorage$getLong$2 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getLong$2) continuation;
            if ((appStorage$getLong$2.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                appStorage$getLong$2.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = appStorage$getLong$2.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getLong$2.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appStorage$getLong$2.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getLong$2.getHighSpeedVideoFpsRangesFor = j;
                    appStorage$getLong$2.getHighSpeedVideoFpsRanges = 1;
                    obj = getLong(appStorageKey, appStorage$getLong$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = appStorage$getLong$2.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                l = (java.lang.Long) obj;
                if (l != null) {
                    j = l.longValue();
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxLong(j);
            }
        }
        appStorage$getLong$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getLong$2(this, continuation);
        java.lang.Object obj2 = appStorage$getLong$2.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getLong$2.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        l = (java.lang.Long) obj2;
        if (l != null) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxLong(j);
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.Long> getLongFlow(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> longKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.longKey(this.getHighResolutionOutputSizeshNQ4ISI, key.getName());
        final kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
        return new kotlinx.coroutines.flow.Flow<java.lang.Long>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Long> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1.AnonymousClass2(flowCollector, this, key, longKey), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRanges;
                final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.lang.String str;
                    java.lang.String concat;
                    java.lang.Object m23436constructorimpl;
                    com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
                    if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputFormats -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
                                if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI)) {
                                    com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                                    str = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRanges;
                                    concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getName()));
                                    java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                                    obj2 = null;
                                    if (str2 != null) {
                                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighSpeedVideoFpsRanges;
                                        try {
                                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                            encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.class)));
                                        } catch (java.lang.Throwable th) {
                                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                        }
                                        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                        if (m23439exceptionOrNullimpl != null) {
                                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighSpeedVideoFpsRangesFor.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                                        }
                                        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                            obj2 = m23436constructorimpl;
                                        }
                                    }
                                } else {
                                    obj2 = preferences.get(this.getHighSpeedVideoFpsRangesFor);
                                }
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getOutputFormats = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj5 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getInputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1$2", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputFormats;
                    int getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputFormats = obj;
                        this.getOutputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.persistence.appstorage.AppStorage$getLongFlow$$inlined$getValueFlow$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.getHighSpeedVideoFpsRanges = appStorage;
                    this.getHighResolutionOutputSizeshNQ4ISI = appStorageKey;
                    this.getHighSpeedVideoFpsRangesFor = key;
                }
            }
        };
    }

    public final java.lang.Object set(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.floatKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setFloat(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.floatKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getFloat(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$1 appStorage$getFloat$1;
        int i;
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> floatKey;
        java.lang.Object first;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$1) {
            appStorage$getFloat$1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$1) continuation;
            if ((appStorage$getFloat$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                appStorage$getFloat$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = appStorage$getFloat$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getFloat$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    floatKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.floatKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
                    kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
                    appStorage$getFloat$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getFloat$1.getHighSpeedVideoFpsRangesFor = this;
                    appStorage$getFloat$1.getHighSpeedVideoSizes = appStorageKey;
                    appStorage$getFloat$1.getHighSpeedVideoFpsRanges = floatKey;
                    appStorage$getFloat$1.Camera2StreamConfigurationMap = 0;
                    appStorage$getFloat$1.getHighSpeedVideoSizesFor = 1;
                    first = kotlinx.coroutines.flow.FlowKt.first(data, appStorage$getFloat$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appStorage = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = appStorage$getFloat$1.Camera2StreamConfigurationMap;
                    androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> key = (androidx.datastore.preferences.core.Preferences.Key) appStorage$getFloat$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey2 = (com.paypal.oslo.core.persistence.appstorage.AppStorageKey) appStorage$getFloat$1.getHighSpeedVideoSizes;
                    appStorage = (com.paypal.oslo.core.persistence.appstorage.AppStorage) appStorage$getFloat$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    first = obj;
                    floatKey = key;
                    appStorageKey = appStorageKey2;
                }
                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) first;
                if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
                    java.lang.String str = (java.lang.String) preferences.get(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(appStorageKey.getName()))));
                    if (str == null) {
                        return null;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = appStorage;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(appStorage.getHighSpeedVideoFpsRangesFor.decryptValue(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.class)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", floatKey.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                    }
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        return null;
                    }
                    return m23436constructorimpl;
                }
                java.lang.Object obj2 = preferences.get(floatKey);
                return (java.lang.Float) (obj2 instanceof java.lang.Float ? obj2 : null);
            }
        }
        appStorage$getFloat$1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$1(this, continuation);
        java.lang.Object obj3 = appStorage$getFloat$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getFloat$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        androidx.content.preferences.core.Preferences preferences2 = (androidx.content.preferences.core.Preferences) first;
        if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getFloat(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$2 appStorage$getFloat$2;
        int i;
        java.lang.Float f2;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$2) {
            appStorage$getFloat$2 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$2) continuation;
            if ((appStorage$getFloat$2.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                appStorage$getFloat$2.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = appStorage$getFloat$2.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getFloat$2.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appStorage$getFloat$2.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getFloat$2.getHighSpeedVideoSizes = f;
                    appStorage$getFloat$2.getHighSpeedVideoFpsRanges = 1;
                    obj = getFloat(appStorageKey, appStorage$getFloat$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = appStorage$getFloat$2.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                f2 = (java.lang.Float) obj;
                if (f2 != null) {
                    f = f2.floatValue();
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
            }
        }
        appStorage$getFloat$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$2(this, continuation);
        java.lang.Object obj2 = appStorage$getFloat$2.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getFloat$2.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        f2 = (java.lang.Float) obj2;
        if (f2 != null) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.Float> getFloatFlow(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> floatKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.floatKey(this.getHighResolutionOutputSizeshNQ4ISI, key.getName());
        final kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
        return new kotlinx.coroutines.flow.Flow<java.lang.Float>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Float> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1.AnonymousClass2(flowCollector, this, key, floatKey), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey Camera2StreamConfigurationMap;
                final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoSizes;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.lang.String str;
                    java.lang.String concat;
                    java.lang.Object m23436constructorimpl;
                    com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
                    if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
                                if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap)) {
                                    com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                                    str = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoSizes;
                                    concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap.getName()));
                                    java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                                    obj2 = null;
                                    if (str2 != null) {
                                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighSpeedVideoSizes;
                                        try {
                                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                            encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.class)));
                                        } catch (java.lang.Throwable th) {
                                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                        }
                                        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                        if (m23439exceptionOrNullimpl != null) {
                                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                                        }
                                        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                            obj2 = m23436constructorimpl;
                                        }
                                    }
                                } else {
                                    obj2 = preferences.get(this.getHighResolutionOutputSizeshNQ4ISI);
                                }
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj5 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1$2", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloatFlow$$inlined$getValueFlow$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                    this.getHighSpeedVideoSizes = appStorage;
                    this.Camera2StreamConfigurationMap = appStorageKey;
                    this.getHighResolutionOutputSizeshNQ4ISI = key;
                }
            }
        };
    }

    public final java.lang.Object set(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.doubleKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxDouble(d), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setDouble(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.doubleKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), kotlin.coroutines.jvm.internal.Boxing.boxDouble(d), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDouble(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super java.lang.Double> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getDouble$1 appStorage$getDouble$1;
        int i;
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> doubleKey;
        java.lang.Object first;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getDouble$1) {
            appStorage$getDouble$1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getDouble$1) continuation;
            if ((appStorage$getDouble$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                appStorage$getDouble$1.getInputFormats -= 2147483648;
                java.lang.Object obj = appStorage$getDouble$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getDouble$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    doubleKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.doubleKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
                    kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
                    appStorage$getDouble$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getDouble$1.getHighResolutionOutputSizeshNQ4ISI = this;
                    appStorage$getDouble$1.getHighSpeedVideoSizes = appStorageKey;
                    appStorage$getDouble$1.Camera2StreamConfigurationMap = doubleKey;
                    appStorage$getDouble$1.getHighSpeedVideoFpsRangesFor = 0;
                    appStorage$getDouble$1.getInputFormats = 1;
                    first = kotlinx.coroutines.flow.FlowKt.first(data, appStorage$getDouble$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appStorage = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = appStorage$getDouble$1.getHighSpeedVideoFpsRangesFor;
                    androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> key = (androidx.datastore.preferences.core.Preferences.Key) appStorage$getDouble$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey2 = (com.paypal.oslo.core.persistence.appstorage.AppStorageKey) appStorage$getDouble$1.getHighSpeedVideoSizes;
                    appStorage = (com.paypal.oslo.core.persistence.appstorage.AppStorage) appStorage$getDouble$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    first = obj;
                    doubleKey = key;
                    appStorageKey = appStorageKey2;
                }
                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) first;
                if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
                    java.lang.String str = (java.lang.String) preferences.get(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(appStorageKey.getName()))));
                    if (str == null) {
                        return null;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = appStorage;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(appStorage.getHighSpeedVideoFpsRangesFor.decryptValue(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.class)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", doubleKey.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                    }
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        return null;
                    }
                    return m23436constructorimpl;
                }
                java.lang.Object obj2 = preferences.get(doubleKey);
                return (java.lang.Double) (obj2 instanceof java.lang.Double ? obj2 : null);
            }
        }
        appStorage$getDouble$1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getDouble$1(this, continuation);
        java.lang.Object obj3 = appStorage$getDouble$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getDouble$1.getInputFormats;
        if (i != 0) {
        }
        androidx.content.preferences.core.Preferences preferences2 = (androidx.content.preferences.core.Preferences) first;
        if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDouble(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, double d, kotlin.coroutines.Continuation<? super java.lang.Double> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getDouble$2 appStorage$getDouble$2;
        int i;
        java.lang.Double d2;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getDouble$2) {
            appStorage$getDouble$2 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getDouble$2) continuation;
            if ((appStorage$getDouble$2.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                appStorage$getDouble$2.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = appStorage$getDouble$2.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getDouble$2.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appStorage$getDouble$2.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getDouble$2.getHighResolutionOutputSizeshNQ4ISI = d;
                    appStorage$getDouble$2.getHighSpeedVideoFpsRanges = 1;
                    obj = getDouble(appStorageKey, appStorage$getDouble$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d = appStorage$getDouble$2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                d2 = (java.lang.Double) obj;
                if (d2 != null) {
                    d = d2.doubleValue();
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxDouble(d);
            }
        }
        appStorage$getDouble$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getDouble$2(this, continuation);
        java.lang.Object obj2 = appStorage$getDouble$2.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getDouble$2.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        d2 = (java.lang.Double) obj2;
        if (d2 != null) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxDouble(d);
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.Double> getDoubleFlow(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> doubleKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.doubleKey(this.getHighResolutionOutputSizeshNQ4ISI, key.getName());
        final kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
        return new kotlinx.coroutines.flow.Flow<java.lang.Double>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Double> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1.AnonymousClass2(flowCollector, this, key, doubleKey), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRanges;
                final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.lang.String str;
                    java.lang.String concat;
                    java.lang.Object m23436constructorimpl;
                    com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
                    if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
                                if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges)) {
                                    com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                                    str = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                                    concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges.getName()));
                                    java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                                    obj2 = null;
                                    if (str2 != null) {
                                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
                                        try {
                                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                            encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.class)));
                                        } catch (java.lang.Throwable th) {
                                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                        }
                                        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                        if (m23439exceptionOrNullimpl != null) {
                                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighSpeedVideoFpsRangesFor.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                                        }
                                        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                            obj2 = m23436constructorimpl;
                                        }
                                    }
                                } else {
                                    obj2 = preferences.get(this.getHighSpeedVideoFpsRangesFor);
                                }
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj5 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1$2", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.persistence.appstorage.AppStorage$getDoubleFlow$$inlined$getValueFlow$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.Camera2StreamConfigurationMap = appStorage;
                    this.getHighSpeedVideoFpsRanges = appStorageKey;
                    this.getHighSpeedVideoFpsRangesFor = key;
                }
            }
        };
    }

    public final java.lang.Object set(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringSetKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), set, continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setStringSet(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringSetKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), set, continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getStringSet(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSet$1 appStorage$getStringSet$1;
        int i;
        androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> stringSetKey;
        java.lang.Object first;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSet$1) {
            appStorage$getStringSet$1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSet$1) continuation;
            if ((appStorage$getStringSet$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                appStorage$getStringSet$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = appStorage$getStringSet$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getStringSet$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    stringSetKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringSetKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
                    kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
                    appStorage$getStringSet$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getStringSet$1.getHighSpeedVideoFpsRanges = this;
                    appStorage$getStringSet$1.getHighSpeedVideoFpsRangesFor = appStorageKey;
                    appStorage$getStringSet$1.Camera2StreamConfigurationMap = stringSetKey;
                    appStorage$getStringSet$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    appStorage$getStringSet$1.getOutputFormats = 1;
                    first = kotlinx.coroutines.flow.FlowKt.first(data, appStorage$getStringSet$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appStorage = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = appStorage$getStringSet$1.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> key = (androidx.datastore.preferences.core.Preferences.Key) appStorage$getStringSet$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey2 = (com.paypal.oslo.core.persistence.appstorage.AppStorageKey) appStorage$getStringSet$1.getHighSpeedVideoFpsRangesFor;
                    appStorage = (com.paypal.oslo.core.persistence.appstorage.AppStorage) appStorage$getStringSet$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    first = obj;
                    stringSetKey = key;
                    appStorageKey = appStorageKey2;
                }
                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) first;
                if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
                    java.lang.String str = (java.lang.String) preferences.get(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(appStorageKey.getName()))));
                    if (str == null) {
                        return null;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = appStorage;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(appStorage.getHighSpeedVideoFpsRangesFor.decryptValue(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Set.class)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", stringSetKey.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                    }
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        return null;
                    }
                    return m23436constructorimpl;
                }
                java.lang.Object obj2 = preferences.get(stringSetKey);
                return (java.util.Set) (obj2 instanceof java.util.Set ? obj2 : null);
            }
        }
        appStorage$getStringSet$1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSet$1(this, continuation);
        java.lang.Object obj3 = appStorage$getStringSet$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getStringSet$1.getOutputFormats;
        if (i != 0) {
        }
        androidx.content.preferences.core.Preferences preferences2 = (androidx.content.preferences.core.Preferences) first;
        if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getStringSet(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSet$2 appStorage$getStringSet$2;
        int i;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSet$2) {
            appStorage$getStringSet$2 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSet$2) continuation;
            if ((appStorage$getStringSet$2.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                appStorage$getStringSet$2.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = appStorage$getStringSet$2.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getStringSet$2.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appStorage$getStringSet$2.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getStringSet$2.getHighResolutionOutputSizeshNQ4ISI = set;
                    appStorage$getStringSet$2.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getStringSet(appStorageKey, appStorage$getStringSet$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (java.util.Set) appStorage$getStringSet$2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.Set set2 = (java.util.Set) obj;
                return set2 != null ? set : set2;
            }
        }
        appStorage$getStringSet$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSet$2(this, continuation);
        java.lang.Object obj2 = appStorage$getStringSet$2.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getStringSet$2.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.util.Set set22 = (java.util.Set) obj2;
        if (set22 != null) {
        }
    }

    public final kotlinx.coroutines.flow.Flow<java.util.Set<java.lang.String>> getStringSetFlow(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> stringSetKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringSetKey(this.getHighResolutionOutputSizeshNQ4ISI, key.getName());
        final kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<java.util.Set<? extends java.lang.String>>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.Set<? extends java.lang.String>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1.AnonymousClass2(flowCollector, this, key, stringSetKey), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;
                final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoSizes;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.lang.String str;
                    java.lang.String concat;
                    java.lang.Object m23436constructorimpl;
                    com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
                    if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
                                if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI)) {
                                    com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                                    str = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoSizes;
                                    concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getName()));
                                    java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                                    obj2 = null;
                                    if (str2 != null) {
                                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighSpeedVideoSizes;
                                        try {
                                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                            encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Set.class)));
                                        } catch (java.lang.Throwable th) {
                                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                        }
                                        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                        if (m23439exceptionOrNullimpl != null) {
                                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighSpeedVideoFpsRangesFor.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                                        }
                                        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                            obj2 = m23436constructorimpl;
                                        }
                                    }
                                } else {
                                    obj2 = preferences.get(this.getHighSpeedVideoFpsRangesFor);
                                }
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj5 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1$2", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSetFlow$$inlined$getValueFlow$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                    this.getHighSpeedVideoSizes = appStorage;
                    this.getHighResolutionOutputSizeshNQ4ISI = appStorageKey;
                    this.getHighSpeedVideoFpsRangesFor = key;
                }
            }
        };
    }

    public final java.lang.Object set(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.byteArrayKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), bArr, continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setByteArray(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(appStorageKey, com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.byteArrayKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName()), bArr, continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getByteArray(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArray$1 appStorage$getByteArray$1;
        int i;
        androidx.datastore.preferences.core.Preferences.Key<byte[]> byteArrayKey;
        java.lang.Object first;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArray$1) {
            appStorage$getByteArray$1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArray$1) continuation;
            if ((appStorage$getByteArray$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                appStorage$getByteArray$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = appStorage$getByteArray$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getByteArray$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteArrayKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.byteArrayKey(this.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
                    kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
                    appStorage$getByteArray$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getByteArray$1.getHighSpeedVideoSizes = this;
                    appStorage$getByteArray$1.getHighSpeedVideoFpsRangesFor = appStorageKey;
                    appStorage$getByteArray$1.getHighSpeedVideoFpsRanges = byteArrayKey;
                    appStorage$getByteArray$1.Camera2StreamConfigurationMap = 0;
                    appStorage$getByteArray$1.getOutputFormats = 1;
                    first = kotlinx.coroutines.flow.FlowKt.first(data, appStorage$getByteArray$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appStorage = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = appStorage$getByteArray$1.Camera2StreamConfigurationMap;
                    androidx.datastore.preferences.core.Preferences.Key<byte[]> key = (androidx.datastore.preferences.core.Preferences.Key) appStorage$getByteArray$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey2 = (com.paypal.oslo.core.persistence.appstorage.AppStorageKey) appStorage$getByteArray$1.getHighSpeedVideoFpsRangesFor;
                    appStorage = (com.paypal.oslo.core.persistence.appstorage.AppStorage) appStorage$getByteArray$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    first = obj;
                    byteArrayKey = key;
                    appStorageKey = appStorageKey2;
                }
                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) first;
                if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
                    java.lang.String str = (java.lang.String) preferences.get(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(appStorageKey.getName()))));
                    if (str == null) {
                        return null;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = appStorage;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(appStorage.getHighSpeedVideoFpsRangesFor.decryptValue(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", byteArrayKey.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                    }
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        return null;
                    }
                    return m23436constructorimpl;
                }
                java.lang.Object obj2 = preferences.get(byteArrayKey);
                return (byte[]) (obj2 instanceof byte[] ? obj2 : null);
            }
        }
        appStorage$getByteArray$1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArray$1(this, continuation);
        java.lang.Object obj3 = appStorage$getByteArray$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getByteArray$1.getOutputFormats;
        if (i != 0) {
        }
        androidx.content.preferences.core.Preferences preferences2 = (androidx.content.preferences.core.Preferences) first;
        if (!(appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getByteArray(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, byte[] bArr, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArray$2 appStorage$getByteArray$2;
        int i;
        if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArray$2) {
            appStorage$getByteArray$2 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArray$2) continuation;
            if ((appStorage$getByteArray$2.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                appStorage$getByteArray$2.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = appStorage$getByteArray$2.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appStorage$getByteArray$2.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appStorage$getByteArray$2.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(appStorageKey);
                    appStorage$getByteArray$2.getHighSpeedVideoFpsRanges = bArr;
                    appStorage$getByteArray$2.getHighSpeedVideoSizes = 1;
                    obj = getByteArray(appStorageKey, appStorage$getByteArray$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bArr = (byte[]) appStorage$getByteArray$2.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                byte[] bArr2 = (byte[]) obj;
                return bArr2 != null ? bArr : bArr2;
            }
        }
        appStorage$getByteArray$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArray$2(this, continuation);
        java.lang.Object obj2 = appStorage$getByteArray$2.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appStorage$getByteArray$2.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        byte[] bArr22 = (byte[]) obj2;
        if (bArr22 != null) {
        }
    }

    public final kotlinx.coroutines.flow.Flow<byte[]> getByteArrayFlow(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final androidx.datastore.preferences.core.Preferences.Key<byte[]> byteArrayKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.byteArrayKey(this.getHighResolutionOutputSizeshNQ4ISI, key.getName());
        final kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> data = this.getHighSpeedVideoSizes.getData();
        return new kotlinx.coroutines.flow.Flow<byte[]>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super byte[]> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1.AnonymousClass2(flowCollector, this, key, byteArrayKey), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key getHighSpeedVideoSizes;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.lang.String str;
                    java.lang.String concat;
                    java.lang.Object m23436constructorimpl;
                    com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
                    if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
                                if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor)) {
                                    com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                                    str = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighResolutionOutputSizeshNQ4ISI;
                                    concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor.getName()));
                                    java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                                    obj2 = null;
                                    if (str2 != null) {
                                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                        try {
                                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                            encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class)));
                                        } catch (java.lang.Throwable th) {
                                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                        }
                                        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                        if (m23439exceptionOrNullimpl != null) {
                                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighSpeedVideoSizes.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                                        }
                                        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                            obj2 = m23436constructorimpl;
                                        }
                                    }
                                } else {
                                    obj2 = preferences.get(this.getHighSpeedVideoSizes);
                                }
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj5 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1$2", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputFormats;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.persistence.appstorage.AppStorage$getByteArrayFlow$$inlined$getValueFlow$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = appStorage;
                    this.getHighSpeedVideoFpsRangesFor = appStorageKey;
                    this.getHighSpeedVideoSizes = key;
                }
            }
        };
    }

    public final java.lang.Object remove(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(this.getHighSpeedVideoSizes, new com.paypal.oslo.core.persistence.appstorage.AppStorage$remove$2(this, appStorageKey, null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object minusAssign(com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object remove = remove(appStorageKey, continuation);
        return remove == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? remove : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object clearAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(this.getHighSpeedVideoSizes, new com.paypal.oslo.core.persistence.appstorage.AppStorage$clearAll$2(this, null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty string$default(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return appStorage.string(appStorageKey, str);
    }

    public final kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.String> string(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key, final java.lang.String defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        return new kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.String>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$string$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return getValue(obj, (kotlin.reflect.KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.ReadWriteProperty
            public final /* bridge */ /* synthetic */ void setValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty, java.lang.String str) {
                setValue2(obj, (kotlin.reflect.KProperty<?>) kProperty, str);
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final java.lang.String getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
                java.lang.Object runBlocking$default;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$string$1$getValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, defaultValue, null), 1, null);
                return (java.lang.String) runBlocking$default;
            }

            /* renamed from: setValue, reason: avoid collision after fix types in other method */
            public final void setValue2(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$string$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, value, null), 1, null);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty int$default(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return appStorage.m11673int(appStorageKey, i);
    }

    /* renamed from: int, reason: not valid java name */
    public final kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Integer> m11673int(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key, final int defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Integer>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$int$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return getValue(obj, (kotlin.reflect.KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.ReadWriteProperty
            public final /* synthetic */ void setValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty, java.lang.Integer num) {
                setValue(obj, (kotlin.reflect.KProperty<?>) kProperty, num.intValue());
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final java.lang.Integer getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
                java.lang.Object runBlocking$default;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$int$1$getValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, defaultValue, null), 1, null);
                return (java.lang.Integer) runBlocking$default;
            }

            public final void setValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, int value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$int$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, value, null), 1, null);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty boolean$default(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return appStorage.m11670boolean(appStorageKey, z);
    }

    /* renamed from: boolean, reason: not valid java name */
    public final kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Boolean> m11670boolean(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key, final boolean defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Boolean>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$boolean$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return getValue(obj, (kotlin.reflect.KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.ReadWriteProperty
            public final /* synthetic */ void setValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty, java.lang.Boolean bool) {
                setValue(obj, (kotlin.reflect.KProperty<?>) kProperty, bool.booleanValue());
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final java.lang.Boolean getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
                java.lang.Object runBlocking$default;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$boolean$1$getValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, defaultValue, null), 1, null);
                return (java.lang.Boolean) runBlocking$default;
            }

            public final void setValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, boolean value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$boolean$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, value, null), 1, null);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty long$default(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return appStorage.m11674long(appStorageKey, j);
    }

    /* renamed from: long, reason: not valid java name */
    public final kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Long> m11674long(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key, final long defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Long>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$long$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return getValue(obj, (kotlin.reflect.KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.ReadWriteProperty
            public final /* synthetic */ void setValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty, java.lang.Long l) {
                setValue(obj, (kotlin.reflect.KProperty<?>) kProperty, l.longValue());
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final java.lang.Long getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
                java.lang.Object runBlocking$default;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$long$1$getValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, defaultValue, null), 1, null);
                return (java.lang.Long) runBlocking$default;
            }

            public final void setValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, long value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$long$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, value, null), 1, null);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty float$default(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return appStorage.m11672float(appStorageKey, f);
    }

    /* renamed from: float, reason: not valid java name */
    public final kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Float> m11672float(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key, final float defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Float>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$float$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return getValue(obj, (kotlin.reflect.KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.ReadWriteProperty
            public final /* synthetic */ void setValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty, java.lang.Float f) {
                setValue(obj, (kotlin.reflect.KProperty<?>) kProperty, f.floatValue());
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final java.lang.Float getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
                java.lang.Object runBlocking$default;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$float$1$getValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, defaultValue, null), 1, null);
                return (java.lang.Float) runBlocking$default;
            }

            public final void setValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, float value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$float$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, value, null), 1, null);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty double$default(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, double d, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        return appStorage.m11671double(appStorageKey, d);
    }

    /* renamed from: double, reason: not valid java name */
    public final kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Double> m11671double(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key, final double defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Double>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$double$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return getValue(obj, (kotlin.reflect.KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.ReadWriteProperty
            public final /* synthetic */ void setValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty, java.lang.Double d) {
                setValue(obj, (kotlin.reflect.KProperty<?>) kProperty, d.doubleValue());
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final java.lang.Double getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
                java.lang.Object runBlocking$default;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$double$1$getValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, defaultValue, null), 1, null);
                return (java.lang.Double) runBlocking$default;
            }

            public final void setValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, double value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$double$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, value, null), 1, null);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.properties.ReadWriteProperty stringSet$default(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            set = kotlin.collections.SetsKt.emptySet();
        }
        return appStorage.stringSet(appStorageKey, set);
    }

    public final kotlin.properties.ReadWriteProperty<java.lang.Object, java.util.Set<java.lang.String>> stringSet(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key, final java.util.Set<java.lang.String> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        return (kotlin.properties.ReadWriteProperty) new kotlin.properties.ReadWriteProperty<java.lang.Object, java.util.Set<? extends java.lang.String>>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$stringSet$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return getValue(obj, (kotlin.reflect.KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.ReadWriteProperty
            public final /* bridge */ /* synthetic */ void setValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty, java.util.Set<? extends java.lang.String> set) {
                setValue2(obj, (kotlin.reflect.KProperty<?>) kProperty, (java.util.Set<java.lang.String>) set);
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final java.util.Set<java.lang.String> getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
                java.lang.Object runBlocking$default;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$stringSet$1$getValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, defaultValue, null), 1, null);
                return (java.util.Set) runBlocking$default;
            }

            /* renamed from: setValue, reason: avoid collision after fix types in other method */
            public final void setValue2(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, java.util.Set<java.lang.String> value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$stringSet$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, value, null), 1, null);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty byteArray$default(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bArr = new byte[0];
        }
        return appStorage.byteArray(appStorageKey, bArr);
    }

    public final kotlin.properties.ReadWriteProperty<java.lang.Object, byte[]> byteArray(final com.paypal.oslo.core.persistence.appstorage.AppStorageKey key, final byte[] defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        return new kotlin.properties.ReadWriteProperty<java.lang.Object, byte[]>() { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$byteArray$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return getValue(obj, (kotlin.reflect.KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.ReadWriteProperty
            public final /* bridge */ /* synthetic */ void setValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty, byte[] bArr) {
                setValue2(obj, (kotlin.reflect.KProperty<?>) kProperty, bArr);
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final byte[] getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
                java.lang.Object runBlocking$default;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$byteArray$1$getValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, defaultValue, null), 1, null);
                return (byte[]) runBlocking$default;
            }

            /* renamed from: setValue, reason: avoid collision after fix types in other method */
            public final void setValue2(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, byte[] value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.persistence.appstorage.AppStorage$byteArray$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage.this, key, value, null), 1, null);
            }
        };
    }

    public static final /* synthetic */ boolean access$isEncrypted(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey) {
        return appStorageKey instanceof com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted;
    }

    public static final /* synthetic */ void access$removeEncryptedKey(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.content.preferences.core.MutablePreferences mutablePreferences) {
        androidx.datastore.preferences.core.Preferences.Key<java.lang.String> stringKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(appStorageKey.getName())));
        if (mutablePreferences.contains(stringKey)) {
            mutablePreferences.minusAssign(stringKey);
        }
    }

    public static final /* synthetic */ void access$removeUnencryptedKey(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.content.preferences.core.MutablePreferences mutablePreferences) {
        androidx.datastore.preferences.core.Preferences.Key<java.lang.String> stringKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> intKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.intKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> booleanKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.booleanKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> longKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.longKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> floatKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.floatKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> doubleKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.doubleKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
        androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> stringSetKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringSetKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
        androidx.datastore.preferences.core.Preferences.Key<byte[]> byteArrayKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.byteArrayKey(appStorage.getHighResolutionOutputSizeshNQ4ISI, appStorageKey.getName());
        if (mutablePreferences.contains(stringKey)) {
            mutablePreferences.minusAssign(stringKey);
        }
        if (mutablePreferences.contains(intKey)) {
            mutablePreferences.minusAssign(intKey);
        }
        if (mutablePreferences.contains(booleanKey)) {
            mutablePreferences.minusAssign(booleanKey);
        }
        if (mutablePreferences.contains(longKey)) {
            mutablePreferences.minusAssign(longKey);
        }
        if (mutablePreferences.contains(floatKey)) {
            mutablePreferences.minusAssign(floatKey);
        }
        if (mutablePreferences.contains(doubleKey)) {
            mutablePreferences.minusAssign(doubleKey);
        }
        if (mutablePreferences.contains(stringSetKey)) {
            mutablePreferences.minusAssign(stringSetKey);
        }
        if (mutablePreferences.contains(byteArrayKey)) {
            mutablePreferences.minusAssign(byteArrayKey);
        }
    }
}
