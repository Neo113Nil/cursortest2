package com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/capabilities/GetCryptoCapabilitiesUseCase;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;", "capabilities", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/CryptoUserCapabilities;", "invoke", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/CryptoUserCapabilities;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetCryptoCapabilitiesUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetCryptoCapabilitiesUseCase() {
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities invoke(java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities> capabilities) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilities, "");
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities> list = capabilities;
        boolean z6 = list instanceof java.util.Collection;
        if (!z6 || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities) it.next()).isBuyEnabled()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z6 || !list.isEmpty()) {
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities) it2.next()).isSellEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z6 || !list.isEmpty()) {
            java.util.Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (((com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities) it3.next()).isReceiveEnabled()) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (!z6 || !list.isEmpty()) {
            java.util.Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                if (((com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities) it4.next()).isSendEnabled()) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        if (!z6 || !list.isEmpty()) {
            java.util.Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                if (((com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities) it5.next()).isSwapEnabled()) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities(z, z2, z3, z4, z5);
    }
}
