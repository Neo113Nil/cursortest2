package com.paypal.oslo.feature.pools.extensions;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pools/extensions/DefaultPoolUiErrorMapper;", "Lcom/paypal/oslo/feature/pools/extensions/PoolUiErrorMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "error", "Lcom/paypal/oslo/feature/pools/shared/ui/error/PoolUiError;", "map", "(Lcom/paypal/oslo/feature/pools/domain/error/PoolError;)Lcom/paypal/oslo/feature/pools/shared/ui/error/PoolUiError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DefaultPoolUiErrorMapper implements com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DefaultPoolUiErrorMapper() {
    }

    @Override // com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper
    public final com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError map(com.paypal.oslo.feature.pools.domain.error.PoolError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound) {
            return new com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError(com.paypal.oslo.feature.pools.R.string.feature_pools_error_message_title, null, com.paypal.oslo.feature.pools.R.string.feature_pools_error_try_again, 2, null);
        }
        if (!(error instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Network) && !(error instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Business.Unauthorized) && !(error instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Business.ServerError) && !(error instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Business.PartialDataAvailable)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        int i = com.paypal.oslo.feature.pools.R.string.feature_pools_error_message_title;
        int i2 = com.paypal.oslo.feature.pools.R.string.feature_pools_error_message_body;
        return new com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError(i, java.lang.Integer.valueOf(i2), com.paypal.oslo.feature.pools.R.string.feature_pools_error_message_action_button);
    }
}
