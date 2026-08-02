package com.paypal.oslo.core.appidentity.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tH\u0007¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/appidentity/di/PersistenceModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "provideAppStorage", "(Landroid/content/Context;)Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "Lkotlin/Pair;", "", "", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefKeyMigration;", "appGuidKeyMapping", "()Lkotlin/Pair;", "rememberedUserNameEncryptedKeyMapping", "APP_IDENTITY_MODULE_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class PersistenceModule {
    public static final java.lang.String APP_IDENTITY_MODULE_NAME = "app_identity";
    public static final com.paypal.oslo.core.appidentity.di.PersistenceModule INSTANCE = new com.paypal.oslo.core.appidentity.di.PersistenceModule();

    private PersistenceModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.persistence.appstorage.AppStorage provideAppStorage(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.core.persistence.appstorage.AppStorage(APP_IDENTITY_MODULE_NAME, context);
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> appGuidKeyMapping() {
        return kotlin.TuplesKt.to("version.6.shared.keys", kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration(com.paypal.oslo.core.appidentity.data.AppGUID.LEGACY_KEY_APP_GUID, com.paypal.oslo.core.appidentity.data.AppGUID.INSTANCE.getKEY_APP_GUID$app_identity_release(), APP_IDENTITY_MODULE_NAME, com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.STRING)));
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    @javax.inject.Named("encryptedPrefs")
    public final kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> rememberedUserNameEncryptedKeyMapping() {
        return kotlin.TuplesKt.to("PresentationAccount.RememberedUserState_encrypted", kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration("RememberedLoginUserName", new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("RememberedLoginUserName"), APP_IDENTITY_MODULE_NAME, com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.STRING)));
    }
}
