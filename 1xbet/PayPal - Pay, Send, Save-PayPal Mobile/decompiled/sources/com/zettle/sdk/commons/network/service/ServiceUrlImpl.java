package com.zettle.sdk.commons.network.service;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0015\u0010\u001b\u001a\u00020\u00108CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00108CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/commons/network/service/ServiceUrlImpl;", "Lcom/zettle/sdk/commons/network/ServiceUrl;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/commons/network/Service;", "service", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "serviceProvider", "Lcom/izettle/android/auth/BackendEnvironment;", "environment", "", "locked", "<init>", "(Lcom/zettle/sdk/commons/network/Service;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/izettle/android/auth/BackendEnvironment;Z)V", "", "baseUrl", "()Ljava/lang/String;", "Lcom/izettle/android/auth/model/ServiceUrls;", "getHighSpeedVideoFpsRanges", "()Lcom/izettle/android/auth/model/ServiceUrls;", "", "invalidate", "()V", "path", "url", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRangesFor", "Lcom/izettle/android/auth/BackendEnvironment;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/network/Service;", "getOutputFormats", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceUrlImpl implements com.zettle.sdk.commons.network.ServiceUrl, com.zettle.sdk.core.log.Loggable {
    private final com.zettle.sdk.commons.network.Service Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.izettle.android.auth.BackendEnvironment getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.ServiceProvider getOutputMinFrameDuration;

    public ServiceUrlImpl(com.zettle.sdk.commons.network.Service service, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.izettle.android.auth.BackendEnvironment backendEnvironment, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
        this.Camera2StreamConfigurationMap = service;
        this.getOutputMinFrameDuration = serviceProvider;
        this.getHighSpeedVideoSizes = backendEnvironment;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.izettle.android.auth.model.ServiceUrls>() { // from class: com.zettle.sdk.commons.network.service.ServiceUrlImpl$lockedUrl$2
            /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
            
                r0 = r3.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
             */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final com.izettle.android.auth.model.ServiceUrls invoke() {
                com.zettle.sdk.core.auth.ServiceProvider serviceProvider2;
                com.zettle.sdk.commons.network.Service service2;
                com.zettle.sdk.commons.network.Service service3;
                serviceProvider2 = com.zettle.sdk.commons.network.service.ServiceUrlImpl.this.getOutputMinFrameDuration;
                service2 = com.zettle.sdk.commons.network.service.ServiceUrlImpl.this.Camera2StreamConfigurationMap;
                java.lang.Object mo23162getServiceUrlsIoAF18A = serviceProvider2.mo23162getServiceUrlsIoAF18A(service2.getKey());
                if (kotlin.Result.m23441isFailureimpl(mo23162getServiceUrlsIoAF18A)) {
                    mo23162getServiceUrlsIoAF18A = null;
                }
                com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) mo23162getServiceUrlsIoAF18A;
                if (serviceUrls != null || serviceUrls != null) {
                    return serviceUrls.getSize() == 1 ? serviceUrls : com.izettle.android.auth.model.ServiceUrls.INSTANCE.create(kotlin.collections.CollectionsKt.listOf(serviceUrls.getCurrent()));
                }
                service3 = com.zettle.sdk.commons.network.service.ServiceUrlImpl.this.Camera2StreamConfigurationMap;
                throw new java.io.IOException("No url for service ".concat(java.lang.String.valueOf(service3.getKey())));
            }

            {
                super(0);
            }
        });
    }

    public /* synthetic */ ServiceUrlImpl(com.zettle.sdk.commons.network.Service service, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.izettle.android.auth.BackendEnvironment backendEnvironment, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(service, serviceProvider, (i & 4) != 0 ? null : backendEnvironment, (i & 8) != 0 ? false : z);
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    private final com.izettle.android.auth.model.ServiceUrls getHighResolutionOutputSizeshNQ4ISI() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.Object mo23162getServiceUrlsIoAF18A = this.getOutputMinFrameDuration.mo23162getServiceUrlsIoAF18A(this.Camera2StreamConfigurationMap.getKey());
            if (kotlin.Result.m23441isFailureimpl(mo23162getServiceUrlsIoAF18A)) {
                mo23162getServiceUrlsIoAF18A = null;
            }
            com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) mo23162getServiceUrlsIoAF18A;
            if (serviceUrls != null) {
                return serviceUrls;
            }
            com.izettle.android.auth.model.ServiceUrls highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges != null) {
                return highSpeedVideoFpsRanges;
            }
            throw new java.io.IOException("No url for service ".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap.getKey())));
        }
        return (com.izettle.android.auth.model.ServiceUrls) this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // com.zettle.sdk.commons.network.ServiceUrl
    public final java.lang.String url(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) path, new char[]{kotlinx.io.files.FileSystemKt.UnixPathSeparator}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : split$default) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        java.lang.String url = getHighResolutionOutputSizeshNQ4ISI().getCurrent().newBuilder().pathSegments((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)).build().getUrl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Getting url for path (");
        sb.append(path);
        sb.append(") -> ");
        sb.append(url);
        com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
        this.getHighSpeedVideoFpsRanges = true;
        return url;
    }

    @Override // com.zettle.sdk.commons.network.ServiceUrl
    public final java.lang.String baseUrl() {
        java.lang.String url = getHighResolutionOutputSizeshNQ4ISI().getCurrent().getUrl();
        com.zettle.sdk.core.log.LogKt.debug(this, "Getting base url -> ".concat(java.lang.String.valueOf(url)));
        this.getHighSpeedVideoFpsRanges = true;
        return url;
    }

    @Override // com.zettle.sdk.commons.network.ServiceUrl
    public final void invalidate() {
        if (this.getHighSpeedVideoFpsRanges) {
            java.lang.Object mo23162getServiceUrlsIoAF18A = this.getOutputMinFrameDuration.mo23162getServiceUrlsIoAF18A(this.Camera2StreamConfigurationMap.getKey());
            if (kotlin.Result.m23441isFailureimpl(mo23162getServiceUrlsIoAF18A)) {
                mo23162getServiceUrlsIoAF18A = null;
            }
            com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) mo23162getServiceUrlsIoAF18A;
            if (serviceUrls != null) {
                serviceUrls.invalidateUrl(getHighResolutionOutputSizeshNQ4ISI().getCurrent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.izettle.android.auth.model.ServiceUrls getHighSpeedVideoFpsRanges() {
        com.izettle.android.auth.BackendEnvironment backendEnvironment = this.getHighSpeedVideoSizes;
        if (backendEnvironment == null) {
            return null;
        }
        com.izettle.android.auth.model.ServiceUrls serviceUrls = backendEnvironment.getFallbackUrls().get(this.Camera2StreamConfigurationMap.getKey());
        if (serviceUrls != null) {
            java.lang.String key = this.Camera2StreamConfigurationMap.getKey();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[ServiceUrl] SDK local fallback URL found! ");
            sb.append(key);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
            sb.append(serviceUrls);
            com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
            return serviceUrls;
        }
        com.zettle.sdk.core.log.LogKt.debug(this, "[ServiceUrl] SDK local fallback URL not found for ".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap.getKey())));
        return null;
    }
}
