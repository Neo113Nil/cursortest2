package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductValueProposition;", "valuePropositions", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "toProductConfigurations", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;", "toProductCapabilities", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductConfigurationsMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations toProductConfigurations$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return toProductConfigurations(capabilities, list);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations toProductConfigurations(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> list) {
        java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> list2;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability> productCapabilities = capabilities != null ? toProductCapabilities(capabilities) : null;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability> list3 = productCapabilities;
        if ((list3 == null || list3.isEmpty()) && ((list2 = list) == null || list2.isEmpty())) {
            return null;
        }
        if (productCapabilities == null) {
            productCapabilities = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability> list4 = productCapabilities;
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations((com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, list4, list, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability> toProductCapabilities(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability productCapability;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability productCapability2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability productCapability3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilities, "");
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability> card = capabilities.getCard();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability> creditLine = capabilities.getCreditLine();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> payment = capabilities.getPayment();
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (card != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = card.iterator();
            while (it.hasNext()) {
                switch (com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ProductConfigurationsMapperKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability) it.next()).ordinal()]) {
                    case 1:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.VIEW_CASH_ADVANCE_APR;
                        break;
                    case 2:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.CONTACT_CUSTOMER_SUPPORT;
                        break;
                    case 3:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.LOCK_CARD;
                        break;
                    case 4:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_NOTIFICATIONS;
                        break;
                    case 5:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_STATEMENT_DELIVERY;
                        break;
                    case 6:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_PAYMENT_SECURITY;
                        break;
                    case 7:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.VIEW_PURCHASE_APR;
                        break;
                    case 8:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.PUSH_TO_WALLET;
                        break;
                    case 9:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.REPORT_LOST_STOLEN;
                        break;
                    case 10:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.REPORT_LOST_STOLEN_VIA_CUSTOMER_SERVICE;
                        break;
                    case 11:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.REQUEST_PHYSICAL_CARD;
                        break;
                    case 12:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.REQUEST_VIRTUAL_CARD;
                        break;
                    case 13:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.SET_PAYMENT_INSTRUMENT_AS_PREFERRED;
                        break;
                    case 14:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.SHARE_FEEDBACK;
                        break;
                    case 15:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.VIEW_CARD_BENEFITS;
                        break;
                    case 16:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.VIEW_CUSTOMER_INFO;
                        break;
                    case 17:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.ACCESS_HELP_CENTER;
                        break;
                    case 18:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.CANCEL_CARD;
                        break;
                    case 19:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_PIN;
                        break;
                    case 20:
                        productCapability3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.VIEW_CREDIT_CARD_SECURE_DETAILS;
                        break;
                    default:
                        productCapability3 = null;
                        break;
                }
                if (productCapability3 != null) {
                    arrayList.add(productCapability3);
                }
            }
            createListBuilder.addAll(arrayList);
        }
        if (creditLine != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it2 = creditLine.iterator();
            while (it2.hasNext()) {
                int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ProductConfigurationsMapperKt.WhenMappings.$EnumSwitchMapping$2[((com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability) it2.next()).ordinal()];
                if (i == 1) {
                    productCapability2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_CREDIT_LINE_INCREASE_OFFERS;
                } else if (i == 2) {
                    productCapability2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.RECEIVE_TEMPORARY_CREDIT_LINE;
                } else if (i == 3) {
                    productCapability2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.REQUEST_CREDIT_LINE_INCREASE;
                } else {
                    if (i != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    productCapability2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.UNKNOWN;
                }
                if (productCapability2 != null) {
                    arrayList2.add(productCapability2);
                }
            }
            createListBuilder.addAll(arrayList2);
        }
        if (payment != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it3 = payment.iterator();
            while (it3.hasNext()) {
                int i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ProductConfigurationsMapperKt.WhenMappings.$EnumSwitchMapping$1[((com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability) it3.next()).ordinal()];
                if (i2 == 1) {
                    productCapability = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.REPAY_AMOUNT_TO_AVOID_INTEREST;
                } else if (i2 == 2) {
                    productCapability = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.ADD_BACKUP_FUNDING_INSTRUMENT;
                } else if (i2 == 3) {
                    productCapability = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.SHOW_DEBT_COLLECTION_MIRANDA;
                } else if (i2 == 4) {
                    productCapability = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.VIEW_PERSISTENT_DEBT;
                } else {
                    productCapability = i2 != 5 ? null : com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.VIEW_ESTIMATED_FIRST_PAYMENT_DUE_DATE;
                }
                if (productCapability != null) {
                    arrayList3.add(productCapability);
                }
            }
            createListBuilder.addAll(arrayList3);
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.VIEW_CASH_ADVANCE_APR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.CONTACT_CUSTOMER_SUPPORT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.LOCK_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.MANAGE_NOTIFICATIONS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.MANAGE_STATEMENT_DELIVERY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.MANAGE_PAYMENT_SECURITY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.VIEW_PURCHASE_APR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.PUSH_TO_WALLET.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.REPORT_LOST_STOLEN.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.REPORT_LOST_STOLEN_VIA_CUSTOMER_SERVICE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.REQUEST_PHYSICAL_CARD.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.REQUEST_VIRTUAL_CARD.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.SET_PAYMENT_INSTRUMENT_AS_PREFERRED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.SHARE_FEEDBACK.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.VIEW_CARD_BENEFITS.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.VIEW_CUSTOMER_INFO.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.ACCESS_HELP_CENTER.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.CANCEL_CARD.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.MANAGE_PIN.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability.VIEW_CREDIT_CARD_SECURE_DETAILS.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability.REPAY_AMOUNT_TO_AVOID_INTEREST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability.ADD_BACKUP_FUNDING_INSTRUMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability.SHOW_DEBT_COLLECTION_MIRANDA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability.VIEW_PERSISTENT_DEBT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability.VIEW_ESTIMATED_FIRST_PAYMENT_DUE_DATE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability.MANAGE_CREDIT_LINE_INCREASE_OFFERS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability.RECEIVE_TEMPORARY_CREDIT_LINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability.REQUEST_CREDIT_LINE_INCREASE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
