package com.paypal.oslo.core.identity.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "", "<init>", "()V", "NotFound", "Lcom/paypal/oslo/core/identity/domain/model/TokenError$NotFound;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TokenError {
    private TokenError() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/TokenError$NotFound;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NotFound extends com.paypal.oslo.core.identity.domain.model.TokenError {
        public static final com.paypal.oslo.core.identity.domain.model.TokenError.NotFound INSTANCE = new com.paypal.oslo.core.identity.domain.model.TokenError.NotFound();

        private NotFound() {
            super(null);
        }
    }

    public /* synthetic */ TokenError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
