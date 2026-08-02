package com.paypal.oslo.feature.identity.moreoptions.data.cache;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0003R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/data/cache/MoreOptionCache;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "authOptions", "", "syncOptions", "(Ljava/util/List;)V", "getOptions", "()Ljava/util/List;", "clearOptions", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MoreOptionCache {
    public static final int $stable = 8;
    private volatile java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();

    @javax.inject.Inject
    public MoreOptionCache() {
    }

    public final void syncOptions(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptions, "");
            this.getHighResolutionOutputSizeshNQ4ISI = authOptions;
        }
    }

    public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getOptions() {
        java.util.List list;
        synchronized (this) {
            list = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return list;
    }

    public final void clearOptions() {
        synchronized (this) {
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();
        }
    }
}
