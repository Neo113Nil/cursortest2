package com.paypal.oslo.feature.inappcheckout.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/mapper/InitializeCheckoutEntityMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutDTO;", "dto", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "convert", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InitializeCheckoutEntityMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public InitializeCheckoutEntityMapper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity convert(com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO dto) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum;
        java.lang.String billingType;
        java.lang.String flow;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern merchantIntegrationPattern;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dto, "");
        java.lang.String token = dto.getToken();
        if (token == null) {
            throw new java.lang.IllegalArgumentException("token cannot be null in success response");
        }
        com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO checkoutContext = dto.getCheckoutContext();
        if (checkoutContext == null) {
            throw new java.lang.IllegalArgumentException("checkoutContext cannot be null in success response");
        }
        com.paypal.oslo.feature.inappcheckout.data.dto.MerchantDTO merchant = checkoutContext.getMerchant();
        if (merchant == null) {
            throw new java.lang.IllegalArgumentException("merchant cannot be null in checkoutContext");
        }
        java.lang.String merchantId = merchant.getMerchantId();
        java.lang.String merchantLogo = merchant.getMerchantLogo();
        java.lang.String name2 = merchant.getName();
        java.util.List<java.lang.String> merchantIntegrationPattern2 = merchant.getMerchantIntegrationPattern();
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType3 = null;
        if (merchantIntegrationPattern2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str : merchantIntegrationPattern2) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2113017421:
                            if (str.equals("PAY_FAST")) {
                                merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.PAY_FAST;
                                break;
                            }
                            merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.UNKNOWN__;
                            break;
                        case -74946392:
                            if (str.equals("PARTNER")) {
                                merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.PARTNER;
                                break;
                            }
                            merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.UNKNOWN__;
                            break;
                        case 1626154128:
                            if (str.equals("TYPE_5_DISBURSEMENT")) {
                                merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.TYPE_5_DISBURSEMENT;
                                break;
                            }
                            merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.UNKNOWN__;
                            break;
                        case 1673536592:
                            if (str.equals("BILL_PAY")) {
                                merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.BILL_PAY;
                                break;
                            }
                            merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.UNKNOWN__;
                            break;
                        case 1941010322:
                            if (str.equals("DONATION")) {
                                merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.DONATION;
                                break;
                            }
                            merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.UNKNOWN__;
                            break;
                        case 2016710633:
                            if (str.equals("DIRECT")) {
                                merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.DIRECT;
                                break;
                            }
                            merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.UNKNOWN__;
                            break;
                        default:
                            merchantIntegrationPattern = com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.UNKNOWN__;
                            break;
                    }
                } else {
                    merchantIntegrationPattern = null;
                }
                if (merchantIntegrationPattern != null) {
                    arrayList2.add(merchantIntegrationPattern);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchantEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity(merchantId, merchantLogo, name2, arrayList, merchant.getConsentCode(), merchant.getBillPayIntegratorName(), merchant.getMerchantCountry());
        com.paypal.oslo.feature.inappcheckout.data.dto.IntegrationDetailsDTO integrationDetails = checkoutContext.getIntegrationDetails();
        if (integrationDetails == null) {
            throw new java.lang.IllegalArgumentException("integrationDetails cannot be null in checkoutContext");
        }
        java.lang.String returnUrl = integrationDetails.getReturnUrl();
        java.lang.String cancelUrl = integrationDetails.getCancelUrl();
        java.lang.String editStickyFiScenario = integrationDetails.getEditStickyFiScenario();
        if (editStickyFiScenario != null) {
            int hashCode = editStickyFiScenario.hashCode();
            if (hashCode != 2402104) {
                if (hashCode != 602574172) {
                    if (hashCode == 1804446588 && editStickyFiScenario.equals("REGULAR")) {
                        editStickyFiScenarioEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum.REGULAR;
                    }
                } else if (editStickyFiScenario.equals("ERROR_HANDLING")) {
                    editStickyFiScenarioEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum.ERROR_HANDLING;
                }
            } else if (editStickyFiScenario.equals("NONE")) {
                editStickyFiScenarioEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum.NONE;
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum2 = editStickyFiScenarioEnum;
            java.lang.Boolean hideShipping = integrationDetails.getHideShipping();
            billingType = integrationDetails.getBillingType();
            if (billingType != null) {
                switch (billingType.hashCode()) {
                    case -1859195856:
                        if (billingType.equals("MERCHANT_INITIATED_BILLING")) {
                            billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.MERCHANT_INITIATED_BILLING;
                            break;
                        }
                        billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.UNKNOWN__;
                        break;
                    case -958346613:
                        if (billingType.equals("CHANNEL_INITIATED_BILLING")) {
                            billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.CHANNEL_INITIATED_BILLING;
                            break;
                        }
                        billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.UNKNOWN__;
                        break;
                    case -240347996:
                        if (billingType.equals("SUBSCRIPTIONS_V1")) {
                            billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.SUBSCRIPTIONS_V1;
                            break;
                        }
                        billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.UNKNOWN__;
                        break;
                    case 488537583:
                        if (billingType.equals("MERCHANT_INITIATED_SINGLE_BILLING")) {
                            billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.MERCHANT_INITIATED_SINGLE_BILLING;
                            break;
                        }
                        billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.UNKNOWN__;
                        break;
                    case 683112047:
                        if (billingType.equals("RECURRING_PAYMENTS")) {
                            billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.RECURRING_PAYMENTS;
                            break;
                        }
                        billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.UNKNOWN__;
                        break;
                    default:
                        billingType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.UNKNOWN__;
                        break;
                }
                billingType3 = billingType2;
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType4 = billingType3;
            flow = integrationDetails.getFlow();
            if (flow != null) {
                switch (flow.hashCode()) {
                    case -2121674018:
                        if (flow.equals("EC_ONE_TIME_CHECKOUT")) {
                            flowEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.EC_ONE_TIME_CHECKOUT;
                            break;
                        }
                        break;
                    case -1742760998:
                        if (flow.equals("WPS_ONE_TIME_CHECKOUT")) {
                            flowEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.WPS_ONE_TIME_CHECKOUT;
                            break;
                        }
                        break;
                    case -1705393802:
                        if (flow.equals("BILLING_WITH_PURCHASE")) {
                            flowEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.BILLING_WITH_PURCHASE;
                            break;
                        }
                        break;
                    case -1636482787:
                        if (flow.equals("SUBSCRIPTION")) {
                            flowEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.SUBSCRIPTION;
                            break;
                        }
                        break;
                    case -1240774951:
                        if (flow.equals("RECURRING_BILLING")) {
                            flowEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.RECURRING_BILLING;
                            break;
                        }
                        break;
                    case 97070108:
                        if (flow.equals("BILLING_WITHOUT_PURCHASE")) {
                            flowEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.BILLING_WITHOUT_PURCHASE;
                            break;
                        }
                        break;
                    case 771335540:
                        if (flow.equals("RECURRING_BILLING_WITH_PURCHASE")) {
                            flowEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.RECURRING_BILLING_WITH_PURCHASE;
                            break;
                        }
                        break;
                }
                return new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity(token, new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity(merchantEntity, new com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity(returnUrl, cancelUrl, editStickyFiScenarioEnum2, hideShipping, billingType4, flowEnum)));
            }
            flowEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.UNKNOWN__;
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity(token, new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity(merchantEntity, new com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity(returnUrl, cancelUrl, editStickyFiScenarioEnum2, hideShipping, billingType4, flowEnum)));
        }
        editStickyFiScenarioEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum.UNKNOWN__;
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum22 = editStickyFiScenarioEnum;
        java.lang.Boolean hideShipping2 = integrationDetails.getHideShipping();
        billingType = integrationDetails.getBillingType();
        if (billingType != null) {
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType42 = billingType3;
        flow = integrationDetails.getFlow();
        if (flow != null) {
        }
        flowEnum = com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.UNKNOWN__;
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity(token, new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity(merchantEntity, new com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity(returnUrl, cancelUrl, editStickyFiScenarioEnum22, hideShipping2, billingType42, flowEnum)));
    }
}
