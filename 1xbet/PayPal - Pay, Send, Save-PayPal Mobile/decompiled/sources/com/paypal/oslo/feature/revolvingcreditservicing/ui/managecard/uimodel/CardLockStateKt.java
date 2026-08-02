package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "toCardLockState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "toCreditInstrumentStatus", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardLockStateKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState toCardLockState(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditInstrumentStatus, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockStateKt.WhenMappings.$EnumSwitchMapping$0[creditInstrumentStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.UNLOCKED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.LOCKED;
        }
        if (i == 3 || i == 4 || i == 5) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus toCreditInstrumentStatus(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardLockState, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockStateKt.WhenMappings.$EnumSwitchMapping$1[cardLockState.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.FROZEN;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.ACTIVE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.FROZEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.BLOCKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.TERMINATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.values().length];
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.LOCKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.UNLOCKED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
