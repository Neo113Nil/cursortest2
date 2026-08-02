package com.payair.logic.storage;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/payair/logic/storage/StorageServiceImpl;", "Lcom/payair/logic/storage/StorageService;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "clear", "()V", "", "Lcom/payair/model/NetworkTokenReference;", "getNetworkTokenReferencesPendingHandle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkTokenReferences", "setNetworkTokenReferences", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isRegistrationComplete", "()Z", "", "networkTokenReference", "alias", "setTokenAlias", "(Ljava/lang/String;Ljava/lang/String;)V", "getTokenAlias", "(Ljava/lang/String;)Ljava/lang/String;", "deleteTokenAlias", "(Ljava/lang/String;)V", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "setRegistrationComplete", "(Z)V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StorageServiceImpl implements com.payair.logic.storage.StorageService {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f4511a;
    public final android.content.SharedPreferences b;
    public final com.google.gson.Gson c;

    public StorageServiceImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f4511a = context.getSharedPreferences("csdk", 0);
        this.b = context.getSharedPreferences("csdk-tokenalias", 0);
        this.c = new com.google.gson.Gson();
    }

    @Override // com.payair.logic.storage.StorageService
    public final void clear() {
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "Clearing shar pref", null, null, 6, null);
        android.content.SharedPreferences sharedPreferences = this.f4511a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        edit.apply();
        android.content.SharedPreferences sharedPreferences2 = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "");
        android.content.SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        edit2.clear();
        edit2.apply();
    }

    @Override // com.payair.logic.storage.StorageService
    public final void deleteTokenAlias(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        android.content.SharedPreferences sharedPreferences = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(networkTokenReference);
        edit.apply();
    }

    @Override // com.payair.logic.storage.StorageService
    public final java.lang.Object getNetworkTokenReferencesPendingHandle(kotlin.coroutines.Continuation<? super java.util.Set<com.payair.model.NetworkTokenReference>> continuation) {
        java.lang.String string = this.f4511a.getString("network_token_references", null);
        if (string == null) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.lang.Object fromJson = this.c.fromJson(string, (java.lang.Class<java.lang.Object>) com.payair.model.NetworkTokenReference[].class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "");
        return kotlin.collections.ArraysKt.toSet((java.lang.Object[]) fromJson);
    }

    @Override // com.payair.logic.storage.StorageService
    public final java.lang.String getTokenAlias(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return this.b.getString(networkTokenReference, null);
    }

    @Override // com.payair.logic.storage.StorageService
    public final boolean isRegistrationComplete() {
        return this.f4511a.getBoolean("isPINorFingerprint", false);
    }

    @Override // com.payair.logic.storage.StorageService
    public final java.lang.Object setNetworkTokenReferences(java.util.Set<com.payair.model.NetworkTokenReference> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.String json = this.c.toJson(set);
        android.content.SharedPreferences sharedPreferences = this.f4511a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("network_token_references", json);
        edit.apply();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.StorageService
    public final void setRegistrationComplete(boolean complete) {
        android.content.SharedPreferences sharedPreferences = this.f4511a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("isPINorFingerprint", complete);
        edit.apply();
    }

    @Override // com.payair.logic.storage.StorageService
    public final void setTokenAlias(java.lang.String networkTokenReference, java.lang.String alias) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alias, "");
        android.content.SharedPreferences sharedPreferences = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(networkTokenReference, alias);
        edit.apply();
    }
}
