package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/ServiceProviderImpl;", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "Lcom/izettle/android/auth/ZettleAuth;", "auth", "<init>", "(Lcom/izettle/android/auth/ZettleAuth;)V", "", "service", "Lkotlin/Result;", "Lcom/izettle/android/auth/model/ServiceUrls;", "getServiceUrls-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "getServiceUrls", "Camera2StreamConfigurationMap", "Lcom/izettle/android/auth/ZettleAuth;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ServiceProviderImpl implements com.zettle.sdk.core.auth.ServiceProvider {
    private final com.izettle.android.auth.ZettleAuth Camera2StreamConfigurationMap;

    public ServiceProviderImpl(com.izettle.android.auth.ZettleAuth zettleAuth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
        this.Camera2StreamConfigurationMap = zettleAuth;
    }

    @Override // com.zettle.sdk.core.auth.ServiceProvider
    /* renamed from: getServiceUrls-IoAF18A */
    public final java.lang.Object mo23162getServiceUrlsIoAF18A(java.lang.String service) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        com.izettle.android.core.data.result.Success serviceUrls = this.Camera2StreamConfigurationMap.getServiceUrls(service);
        if (serviceUrls instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.auth.model.ServiceUrls serviceUrls2 = (com.izettle.android.auth.model.ServiceUrls) ((com.izettle.android.core.data.result.Success) serviceUrls).getValue();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            serviceUrls = new com.izettle.android.core.data.result.Success(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(serviceUrls2)));
        } else if (!(serviceUrls instanceof com.izettle.android.core.data.result.Failure)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return ((kotlin.Result) com.izettle.android.core.data.result.ResultKt.get(com.izettle.android.core.data.result.ResultKt.onErrorResume(serviceUrls, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Result<? extends com.izettle.android.auth.model.ServiceUrls>>() { // from class: com.zettle.sdk.core.auth.ServiceProviderImpl$getServiceUrls$2
            public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Result<? extends com.izettle.android.auth.model.ServiceUrls> invoke(java.lang.Throwable th) {
                return kotlin.Result.m23435boximpl(getHighResolutionOutputSizeshNQ4ISI(th));
            }
        }))).getCamera2StreamConfigurationMap();
    }
}
