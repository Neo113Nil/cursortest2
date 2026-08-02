package com.paypal.oslo.core.webview.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/webview/di/WebKitModule;", "", "Lcom/paypal/oslo/core/webview/data/provider/TrustedHostsProviderImpl;", "impl", "Lcom/paypal/oslo/core/webview/domain/provider/TrustedHostsProvider;", "bindTrustedHostsProvider", "(Lcom/paypal/oslo/core/webview/data/provider/TrustedHostsProviderImpl;)Lcom/paypal/oslo/core/webview/domain/provider/TrustedHostsProvider;", "Lcom/paypal/oslo/core/webview/data/repository/WebAuthSessionRepositoryImpl;", "Lcom/paypal/oslo/core/webview/domain/repository/WebAuthSessionRepository;", "bindWebAuthSessionRepository", "(Lcom/paypal/oslo/core/webview/data/repository/WebAuthSessionRepositoryImpl;)Lcom/paypal/oslo/core/webview/domain/repository/WebAuthSessionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface WebKitModule {
    @dagger.Binds
    com.paypal.oslo.core.webview.domain.provider.TrustedHostsProvider bindTrustedHostsProvider(com.paypal.oslo.core.webview.data.provider.TrustedHostsProviderImpl impl);

    @dagger.Binds
    com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository bindWebAuthSessionRepository(com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl impl);
}
