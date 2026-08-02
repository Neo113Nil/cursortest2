package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GetAddUserAccountOptionsUseCase;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "Lcom/paypal/oslo/feature/identity/api/accountswitch/domain/model/LinkProfileOptionType;", "linkProfileOptions", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption;", "invoke", "(Ljava/util/List;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetAddUserAccountOptionsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetAddUserAccountOptionsUseCase(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRangesFor = featureGate;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> invoke(java.util.List<? extends com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> linkProfileOptions) {
        com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType optionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkProfileOptions, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkProfileOptions.contains(com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType.LINK_PERSONAL) || linkProfileOptions.contains(com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType.LINK_BUSINESS)) {
            arrayList.add(new com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption("link_existing", com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.LINK_EXISTING));
        }
        if (this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.identity.featureflags.AuthFeatureGates.INSTANCE.getCreateNewBusinessAccountEnabled())) {
            if (linkProfileOptions.contains(com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType.LINK_BUSINESS)) {
                optionType = com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.CREATE_BUSINESS;
            } else {
                linkProfileOptions.contains(com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType.LINK_PERSONAL);
                optionType = com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.CREATE_PERSONAL;
            }
            arrayList.add(new com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption("create_new", optionType));
        }
        return arrayList;
    }
}
