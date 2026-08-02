package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u0013\u0010\n\u001a\u00020\u0002*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u000e\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u000e\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$RevolvingCreditInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;", "cbmcToCreditInstruments", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditInstrument;", "ppccToCreditInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCUKServicingOverviewQuery$RevolvingCreditInstrument;", "ppcukToCreditInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "toGraphQL", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentCardActivationStatus;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentActivationStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentCardActivationStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentActivationStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/InstrumentType;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/InstrumentType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditInstrumentMapperKt {
    public static final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> cbmcToCreditInstruments(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditInstrument> list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditInstrument> list2 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditInstrument) it.next()).getRevolvingCreditInstrumentsFragment()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    public static final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> ppccToCreditInstruments(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> list2 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument) it.next()).getRevolvingCreditInstrumentsFragment()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    public static final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> ppcukToCreditInstruments(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditInstrument> list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditInstrument> list2 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditInstrument) it.next()).getRevolvingCreditInstrumentsFragment()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment revolvingCreditInstrumentsFragment) {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus activationStatus;
        java.lang.String obj = revolvingCreditInstrumentsFragment.getId().toString();
        java.lang.Object lastNChars = revolvingCreditInstrumentsFragment.getLastNChars();
        java.lang.String obj2 = lastNChars != null ? lastNChars.toString() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(revolvingCreditInstrumentsFragment.getStatus());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(revolvingCreditInstrumentsFragment.getType());
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card card = revolvingCreditInstrumentsFragment.getCard();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument(obj, obj2, highResolutionOutputSizeshNQ4ISI, null, (card == null || (activationStatus = card.getActivationStatus()) == null) ? null : getHighResolutionOutputSizeshNQ4ISI(activationStatus), Camera2StreamConfigurationMap);
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus revolvingCreditInstrumentStatus) {
        int i = revolvingCreditInstrumentStatus == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditInstrumentStatus.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.ACTIVE;
            }
            if (i == 2) {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.BLOCKED;
            }
            if (i == 3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.FROZEN;
            }
            if (i == 4) {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.TERMINATED;
            }
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.UNKNOWN;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus toGraphQL(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditInstrumentStatus, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$1[creditInstrumentStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.ACTIVE;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.BLOCKED;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.FROZEN;
        }
        if (i == 4) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.TERMINATED;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.UNKNOWN__;
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus revolvingCreditInstrumentCardActivationStatus) {
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$2[revolvingCreditInstrumentCardActivationStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus.ACTIVATED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus.NOT_READY_TO_ACTIVATE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus.READY_TO_ACTIVATE;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus.UNKNOWN;
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType) {
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$3[revolvingCreditInstrumentType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.PHYSICAL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.VIRTUAL;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.WALLET;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.BLOCKED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.FROZEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.TERMINATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.values().length];
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.BLOCKED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.FROZEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.TERMINATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus.ACTIVATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus.NOT_READY_TO_ACTIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus.READY_TO_ACTIVATE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType.values().length];
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType.PHYSICAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType.VIRTUAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType.WALLET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
