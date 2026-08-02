package com.zettle.sdk.commons;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ#\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0014\u001a\u0006*\u00020\u001a0\u001a8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/commons/SecureStorageImpl;", "Lcom/zettle/sdk/commons/SecureStorage;", "Landroid/content/Context;", "p0", "Lcom/zettle/sdk/commons/Encryptor;", "p1", "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/commons/Encryptor;)V", "", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "has", "(Ljava/lang/String;)Z", "remove", "save", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/commons/Encryptor;", "getHighSpeedVideoFpsRanges", "Landroid/content/SharedPreferences;", "Lkotlin/Lazy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class SecureStorageImpl implements com.zettle.sdk.commons.SecureStorage {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.Encryptor getHighSpeedVideoFpsRanges;

    public SecureStorageImpl(android.content.Context context, com.zettle.sdk.commons.Encryptor encryptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptor, "");
        this.getHighSpeedVideoFpsRanges = encryptor;
        this.Camera2StreamConfigurationMap = context.getApplicationContext();
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<android.content.SharedPreferences>() { // from class: com.zettle.sdk.commons.SecureStorageImpl$sharedPreferences$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final android.content.SharedPreferences invoke() {
                android.content.Context context2;
                context2 = com.zettle.sdk.commons.SecureStorageImpl.this.Camera2StreamConfigurationMap;
                android.content.SharedPreferences sharedPreferences = context2.getSharedPreferences("pp_encrypted_storage_prefs", 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
                com.zettle.sdk.commons.SecureStorageImpl.getHighSpeedVideoSizes(sharedPreferences);
                return sharedPreferences;
            }

            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.commons.SecureStorage
    public final java.lang.Object save(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        java.lang.String encrypt = this.getHighSpeedVideoFpsRanges.encrypt(str2);
        if (encrypt == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, encrypt);
        edit.apply();
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    public static final /* synthetic */ void getHighSpeedVideoSizes(android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences.getInt("_secure_storage_version", 0) <= 0) {
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("_secure_storage_version", 1);
            edit.apply();
        }
    }

    @Override // com.zettle.sdk.commons.SecureStorage
    public final java.lang.Object clearAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        edit.putInt("_secure_storage_version", 1);
        edit.apply();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.commons.SecureStorage
    public final java.lang.Object get(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String string = ((android.content.SharedPreferences) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).getString(str, null);
        if (string == null) {
            return null;
        }
        return this.getHighSpeedVideoFpsRanges.decrypt(string);
    }

    @Override // com.zettle.sdk.commons.SecureStorage
    public final boolean has(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return ((android.content.SharedPreferences) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).contains(p0);
    }

    @Override // com.zettle.sdk.commons.SecureStorage
    public final java.lang.Object remove(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.apply();
        return kotlin.Unit.INSTANCE;
    }
}
