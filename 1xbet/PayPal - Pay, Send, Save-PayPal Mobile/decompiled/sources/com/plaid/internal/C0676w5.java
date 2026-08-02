package com.plaid.internal;

/* renamed from: com.plaid.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0676w5 implements dagger.internal.Factory<com.google.gson.Gson> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0623q5 f6610a;

    public C0676w5(com.plaid.internal.C0623q5 c0623q5) {
        this.f6610a = c0623q5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.google.gson.GsonBuilder gsonBuilder = new com.google.gson.GsonBuilder();
        gsonBuilder.registerTypeAdapter(com.plaid.link.event.LinkEventViewName.class, new com.plaid.internal.classic.networking.adapter.LinkEventViewNameAdapter());
        gsonBuilder.registerTypeAdapter(com.plaid.link.event.LinkEventName.class, new com.plaid.internal.classic.networking.adapter.LinkEventNameAdapter());
        gsonBuilder.registerTypeAdapter(com.plaid.link.result.LinkAccountType.class, new com.plaid.internal.classic.networking.adapter.AccountTypeAdapter());
        gsonBuilder.registerTypeAdapter(com.plaid.link.result.LinkAccountSubtype.class, new com.plaid.internal.classic.networking.adapter.AccountSubtypeAdapter());
        gsonBuilder.registerTypeAdapter(com.plaid.link.result.LinkErrorCode.class, new com.plaid.internal.classic.networking.adapter.PlaidErrorCodeAdapter());
        gsonBuilder.registerTypeAdapter(com.plaid.link.result.LinkErrorType.class, new com.plaid.internal.classic.networking.adapter.PlaidErrorTypeAdapter());
        gsonBuilder.registerTypeAdapter(com.plaid.link.result.LinkAccountVerificationStatus.class, new com.plaid.internal.classic.networking.adapter.LinkAccountVerificationStatusAdapter());
        gsonBuilder.registerTypeAdapter(com.plaid.link.result.LinkExitMetadataStatus.class, new com.plaid.internal.classic.networking.adapter.LinkExitMetadataStatusAdapter());
        com.google.gson.Gson create = gsonBuilder.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return (com.google.gson.Gson) dagger.internal.Preconditions.checkNotNullFromProvides(create);
    }
}
