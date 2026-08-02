package com.discover.mpos.sdk.security.storage;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/discover/mpos/sdk/security/storage/MPosDataStorage;", "Lcom/discover/mpos/sdk/security/storage/DataStorage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "securePrefsSdk", "", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "sharedPref$delegate", "Lkotlin/Lazy;", "getValue", "key", "saveValue", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.security.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class MPosDataStorage implements com.discover.mpos.sdk.security.storage.DataStorage {

    /* renamed from: a, reason: collision with root package name */
    final java.lang.String f3225a;
    private final kotlin.Lazy b;

    public MPosDataStorage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f3225a = "SHARED_PREFS_MPOS_SDK";
        this.b = kotlin.LazyKt.lazy(new com.discover.mpos.sdk.security.storage.MPosDataStorage.a(context));
    }

    @Override // com.discover.mpos.sdk.security.storage.DataStorage
    public final void a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        a().edit().putString(str2, str).apply();
    }

    @Override // com.discover.mpos.sdk.security.storage.DataStorage
    public final java.lang.String a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return a().getString(str, null);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.security.a.b$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<android.content.SharedPreferences> {
        final /* synthetic */ android.content.Context b;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ android.content.SharedPreferences invoke() {
            return androidx.security.crypto.EncryptedSharedPreferences.create(com.discover.mpos.sdk.security.storage.MPosDataStorage.this.f3225a, androidx.security.crypto.MasterKeys.getOrCreate(androidx.security.crypto.MasterKeys.AES256_GCM_SPEC), this.b, androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.content.Context context) {
            super(0);
            this.b = context;
        }
    }

    private final android.content.SharedPreferences a() {
        return (android.content.SharedPreferences) this.b.getValue();
    }
}
