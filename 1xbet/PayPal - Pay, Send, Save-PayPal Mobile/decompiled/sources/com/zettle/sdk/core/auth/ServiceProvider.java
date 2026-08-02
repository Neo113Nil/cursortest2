package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/ServiceProvider;", "", "", "service", "Lkotlin/Result;", "Lcom/izettle/android/auth/model/ServiceUrls;", "getServiceUrls-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "getServiceUrls", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.auth.ServiceProvider.Companion INSTANCE = com.zettle.sdk.core.auth.ServiceProvider.Companion.getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getServiceUrls-IoAF18A, reason: not valid java name */
    java.lang.Object mo23162getServiceUrlsIoAF18A(java.lang.String service);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/auth/ServiceProvider$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/ZettleAuth;", "auth", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "create", "(Lcom/izettle/android/auth/ZettleAuth;)Lcom/zettle/sdk/core/auth/ServiceProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.auth.ServiceProvider.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.core.auth.ServiceProvider.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.core.auth.ServiceProvider create(com.izettle.android.auth.ZettleAuth auth) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auth, "");
            return new com.zettle.sdk.core.auth.ServiceProviderImpl(auth);
        }
    }
}
