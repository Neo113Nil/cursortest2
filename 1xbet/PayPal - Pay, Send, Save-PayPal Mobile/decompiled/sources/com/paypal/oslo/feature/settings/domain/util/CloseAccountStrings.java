package com.paypal.oslo.feature.settings.domain.util;

@kotlin.Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0003\bÛ\u0001\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0004R\u0014\u0010-\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0004R\u0014\u0010/\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0004R\u0014\u00101\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0004R\u0014\u00103\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0004R\u0014\u00105\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0004R\u0014\u00107\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0004R\u0014\u00109\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0004R\u0014\u0010;\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0004R\u0014\u0010=\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0004R\u0014\u0010?\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0004R\u0014\u0010A\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0004R\u0014\u0010C\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0004R\u0014\u0010E\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0004R\u0014\u0010G\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0004R\u0014\u0010I\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0004R\u0014\u0010K\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0004R\u0014\u0010M\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0004R\u0014\u0010O\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0004R\u0014\u0010Q\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0004R\u0014\u0010S\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0004R\u0014\u0010U\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0004R\u0014\u0010W\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0004R\u0014\u0010Y\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0004R\u0014\u0010[\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0004R\u0014\u0010]\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0004R\u0014\u0010_\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u0004R\u0014\u0010a\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0004R\u0014\u0010c\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u0004R\u0014\u0010e\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u0004R\u0014\u0010g\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\u0004R\u0014\u0010i\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u0004R\u0014\u0010k\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u0004R\u0014\u0010m\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u0004R\u0014\u0010o\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0004R\u0014\u0010q\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u0004R\u0014\u0010s\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010\u0004R\u0014\u0010u\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u0004R\u0014\u0010w\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u0004R\u0014\u0010y\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bx\u0010\u0004R\u0014\u0010{\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010\u0004R\u0014\u0010}\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b|\u0010\u0004R\u0014\u0010\u007f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u0004R\u0016\u0010\u0081\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0004R\u0016\u0010\u0083\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0004R\u0016\u0010\u0085\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u0004R\u0016\u0010\u0087\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0004R\u0016\u0010\u0089\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0004R\u0016\u0010\u008b\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u0004R\u0016\u0010\u008d\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u0004R\u0016\u0010\u008f\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u0004R\u0016\u0010\u0091\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u0004R\u0016\u0010\u0093\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u0004R\u0016\u0010\u0095\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u0004R\u0016\u0010\u0097\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010\u0004R\u0016\u0010\u0099\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u0004R\u0016\u0010\u009b\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010\u0004R\u0016\u0010\u009d\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\u0004R\u0016\u0010\u009f\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u0004R\u0016\u0010¡\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u0004R\u0016\u0010£\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010\u0004R\u0016\u0010¥\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u0004R\u0016\u0010§\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010\u0004R\u0016\u0010©\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010\u0004R\u0016\u0010«\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u0004R\u0016\u0010\u00ad\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010\u0004R\u0016\u0010¯\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\u0004R\u0016\u0010±\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010\u0004R\u0016\u0010³\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010\u0004R\u0016\u0010µ\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u0004R\u0016\u0010·\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\u0004R\u0016\u0010¹\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\u0004R\u0016\u0010»\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\u0004R\u0016\u0010½\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\u0004R\u0016\u0010¿\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\u0004R\u0016\u0010Á\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010\u0004R\u0016\u0010Ã\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\u0004R\u0016\u0010Å\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010\u0004R\u0016\u0010Ç\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010\u0004R\u0016\u0010É\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010\u0004R\u0016\u0010Ë\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010\u0004R\u0016\u0010Í\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010\u0004R\u0016\u0010Ï\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010\u0004R\u0016\u0010Ñ\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\u0004R\u0016\u0010Ó\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010\u0004R\u0016\u0010Õ\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\u0004R\u0016\u0010×\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\u0004R\u0016\u0010Ù\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010\u0004R\u0016\u0010Û\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010\u0004R\u0016\u0010Ý\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "", "", "getContinue", "()Ljava/lang/String;", "continue", "getCancel", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "getConfirm", "confirm", "getCloseAccount", "closeAccount", "getL2EligibleBeforeClose", "l2EligibleBeforeClose", "getL2EligibleSendEmail", "l2EligibleSendEmail", "getL2EligiblePrimaryEmail", "l2EligiblePrimaryEmail", "getL2EligibleChangeEmail", "l2EligibleChangeEmail", "getL2EligibleWeCanHelp", "l2EligibleWeCanHelp", "getL2EligibleWeCanHelpReOpened", "l2EligibleWeCanHelpReOpened", "getL2EligibleOnceClosed", "l2EligibleOnceClosed", "getL2EligibleIfYouDeleteData", "l2EligibleIfYouDeleteData", "getL2EligibleYourFeedbackMatters", "l2EligibleYourFeedbackMatters", "getL2EligibleYourShareFeedback", "l2EligibleYourShareFeedback", "getL2IneligibleTitle", "l2IneligibleTitle", "getL2IneligibleWeWereUnableToClose", "l2IneligibleWeWereUnableToClose", "getL2IneligibleGenericErrorDesc", "l2IneligibleGenericErrorDesc", "getL2IneligibleDescription", "l2IneligibleDescription", "getL2IneligibleThingsToDo", "l2IneligibleThingsToDo", "getL2IneligiblePayOutstandingBalances", "l2IneligiblePayOutstandingBalances", "getL2IneligiblePayOutstandingAmount", "l2IneligiblePayOutstandingAmount", "getL2IneligibleClosePaypalCredit", "l2IneligibleClosePaypalCredit", "getL2IneligibleWaitPendingTransactions", "l2IneligibleWaitPendingTransactions", "getL2IneligibleTransferYourFunds", "l2IneligibleTransferYourFunds", "getL2IneligiblePayOffAnyOpenPaymentPlans", "l2IneligiblePayOffAnyOpenPaymentPlans", "getL2IneligibleResolveAccountLimitation", "l2IneligibleResolveAccountLimitation", "getL2IneligibleCloseAnyOpenPools", "l2IneligibleCloseAnyOpenPools", "getL2IneligibleTransferRemainingBalance", "l2IneligibleTransferRemainingBalance", "getL2IneligibleIfYouNeedHelp", "l2IneligibleIfYouNeedHelp", "getL2IneligibleBeforeYouCloseYourAccount", "l2IneligibleBeforeYouCloseYourAccount", "getL2IneligibleYouCanChangeYourEmail", "l2IneligibleYouCanChangeYourEmail", "getL2IneligibleSorryYouCannotCloseAccount", "l2IneligibleSorryYouCannotCloseAccount", "getL2IneligibleSorryYouCannotCloseAccountRecurringSub", "l2IneligibleSorryYouCannotCloseAccountRecurringSub", "getL2IneligibleThereChargeback", "l2IneligibleThereChargeback", "getL2IneligibleTherePreApprovedPayment", "l2IneligibleTherePreApprovedPayment", "getL2IneligibleYouHaveGiftCard", "l2IneligibleYouHaveGiftCard", "getL2IneligibleSomeoneSentYouPayment", "l2IneligibleSomeoneSentYouPayment", "getL2IneligiblePendingTransactionSubscription", "l2IneligiblePendingTransactionSubscription", "getL2IneligibleUnresolvedActions", "l2IneligibleUnresolvedActions", "getL2IneligibleTryAgainLater", "l2IneligibleTryAgainLater", "getL2IneligibleSorry", "l2IneligibleSorry", "getL2IneligibleAreYouSureClose", "l2IneligibleAreYouSureClose", "getL2IneligibleOnceYouClosePaypal", "l2IneligibleOnceYouClosePaypal", "getL2IneligibleShopPayOrReceive", "l2IneligibleShopPayOrReceive", "getL2IneligibleTakeAdvantage", "l2IneligibleTakeAdvantage", "getL2IneligibleViewYourTransaction", "l2IneligibleViewYourTransaction", "getL2IneligibleIfYouHaveScheduledIncomplete", "l2IneligibleIfYouHaveScheduledIncomplete", "getL2IneligibleIfYouLikeCloseAccountContact", "l2IneligibleIfYouLikeCloseAccountContact", "getL2IneligibleIfYouLikeCloseXoomAccount", "l2IneligibleIfYouLikeCloseXoomAccount", "getRedeemYourPayPalRewardsPoints", "redeemYourPayPalRewardsPoints", "getRedeemYourPayPalRewardsPointsDescription", "redeemYourPayPalRewardsPointsDescription", "getSomethingThatNeedsToBeResolved", "somethingThatNeedsToBeResolved", "getLinkLetUsKnow", "linkLetUsKnow", "getLinkHelpCenter", "linkHelpCenter", "getLinkSettings", "linkSettings", "getLinkWallet", "linkWallet", "getLinkTransactions", "linkTransactions", "getLinkSubscriptions", "linkSubscriptions", "getLinkResolutionCenter", "linkResolutionCenter", "getLinkContactUs", "linkContactUs", "getLinkDeleteYourData", "linkDeleteYourData", "getLinkPassword", "linkPassword", "getLinkReviewYourLinkedBanks", "linkReviewYourLinkedBanks", "getLinkClosingYourXoomAccount", "linkClosingYourXoomAccount", "getLinkCloseYourAccount", "linkCloseYourAccount", "getLinkCustomerService", "linkCustomerService", "getL3IneligiblePaymentTransferred", "l3IneligiblePaymentTransferred", "getL3IneligibleToReceivePayment", "l3IneligibleToReceivePayment", "getL3IneligiblePayDueAmount", "l3IneligiblePayDueAmount", "getL3IneligibleContactCustomerSer", "l3IneligibleContactCustomerSer", "getL3IneligibleHelpClosePaypalCredit", "l3IneligibleHelpClosePaypalCredit", "getL3IneligibleKeepPaypalCredit", "l3IneligibleKeepPaypalCredit", "getL2IneligibleBusinessHelpContactUs", "l2IneligibleBusinessHelpContactUs", "getL2IneligibleBusinessClosingAccount", "l2IneligibleBusinessClosingAccount", "getL2IneligibleBusinessNote", "l2IneligibleBusinessNote", "getL2IneligibleBusinessReasonOne", "l2IneligibleBusinessReasonOne", "getL2IneligibleBusinessReasonTwo", "l2IneligibleBusinessReasonTwo", "getL2IneligibleBusinessConfirmation", "l2IneligibleBusinessConfirmation", "getL2IneligibleBusinessContactUs", "l2IneligibleBusinessContactUs", "getL2IneligibleBusinessReasonTitle", "l2IneligibleBusinessReasonTitle", "getL2IneligibleBusinessDoYouCloseAccount", "l2IneligibleBusinessDoYouCloseAccount", "getL2IneligibleBusinessPlsEnterConcern", "l2IneligibleBusinessPlsEnterConcern", "getL2IneligibleBusinessComments", "l2IneligibleBusinessComments", "getL2IneligibleBusinessEnterComments", "l2IneligibleBusinessEnterComments", "getL2IneligibleBusinessChooseReasons", "l2IneligibleBusinessChooseReasons", "getL2EligibleBusinessTitle", "l2EligibleBusinessTitle", "getL2EligibleBusinessHelpCenterContactUs", "l2EligibleBusinessHelpCenterContactUs", "getL2EligibleBusinessClosingAccountFinal", "l2EligibleBusinessClosingAccountFinal", "getL2EligibleBusinessCheckProcessingNote", "l2EligibleBusinessCheckProcessingNote", "getL2EligibleBusinessNoteLabel", "l2EligibleBusinessNoteLabel", "getL2EligibleBusinessReasonTitle", "l2EligibleBusinessReasonTitle", "getL2EligibleBusinessReasonDescription", "l2EligibleBusinessReasonDescription", "getL2EligibleBusinessChooseReasons", "l2EligibleBusinessChooseReasons", "getL2EligibleBusinessReasonHaveAnotherAccount", "l2EligibleBusinessReasonHaveAnotherAccount", "getL2EligibleBusinessReasonDontUseAnymore", "l2EligibleBusinessReasonDontUseAnymore", "getL2EligibleBusinessReasonSwitchingService", "l2EligibleBusinessReasonSwitchingService", "getL2EligibleBusinessReasonPrivacyConcern", "l2EligibleBusinessReasonPrivacyConcern", "getL2EligibleBusinessReasonNotSatisfied", "l2EligibleBusinessReasonNotSatisfied", "getL2EligibleBusinessCommentsLabel", "l2EligibleBusinessCommentsLabel", "getL2EligibleBusinessCommentsDescription", "l2EligibleBusinessCommentsDescription", "getL2EligibleBusinessEnterComments", "l2EligibleBusinessEnterComments", "getL2EligibleBusinessDoYouWantToClose", "l2EligibleBusinessDoYouWantToClose", "getL2EligibleBusinessForgotPassword", "l2EligibleBusinessForgotPassword", "getL2EligibleBusinessContactUsTitle", "l2EligibleBusinessContactUsTitle", "getL2EligibleBusinessSatisfactionImportant", "l2EligibleBusinessSatisfactionImportant", "getL2EligibleBusinessPleaseContactUs", "l2EligibleBusinessPleaseContactUs", "getL2EligibleBusinessStillCloseConfirm", "l2EligibleBusinessStillCloseConfirm", "getL2EligibleBusinessErrorTitle", "l2EligibleBusinessErrorTitle", "getL2EligibleBusinessErrorMessage", "l2EligibleBusinessErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CloseAccountStrings {
    java.lang.String getCancel();

    java.lang.String getCloseAccount();

    java.lang.String getConfirm();

    java.lang.String getContinue();

    java.lang.String getL2EligibleBeforeClose();

    java.lang.String getL2EligibleBusinessCheckProcessingNote();

    java.lang.String getL2EligibleBusinessChooseReasons();

    java.lang.String getL2EligibleBusinessClosingAccountFinal();

    java.lang.String getL2EligibleBusinessCommentsDescription();

    java.lang.String getL2EligibleBusinessCommentsLabel();

    java.lang.String getL2EligibleBusinessContactUsTitle();

    java.lang.String getL2EligibleBusinessDoYouWantToClose();

    java.lang.String getL2EligibleBusinessEnterComments();

    java.lang.String getL2EligibleBusinessErrorMessage();

    java.lang.String getL2EligibleBusinessErrorTitle();

    java.lang.String getL2EligibleBusinessForgotPassword();

    java.lang.String getL2EligibleBusinessHelpCenterContactUs();

    java.lang.String getL2EligibleBusinessNoteLabel();

    java.lang.String getL2EligibleBusinessPleaseContactUs();

    java.lang.String getL2EligibleBusinessReasonDescription();

    java.lang.String getL2EligibleBusinessReasonDontUseAnymore();

    java.lang.String getL2EligibleBusinessReasonHaveAnotherAccount();

    java.lang.String getL2EligibleBusinessReasonNotSatisfied();

    java.lang.String getL2EligibleBusinessReasonPrivacyConcern();

    java.lang.String getL2EligibleBusinessReasonSwitchingService();

    java.lang.String getL2EligibleBusinessReasonTitle();

    java.lang.String getL2EligibleBusinessSatisfactionImportant();

    java.lang.String getL2EligibleBusinessStillCloseConfirm();

    java.lang.String getL2EligibleBusinessTitle();

    java.lang.String getL2EligibleChangeEmail();

    java.lang.String getL2EligibleIfYouDeleteData();

    java.lang.String getL2EligibleOnceClosed();

    java.lang.String getL2EligiblePrimaryEmail();

    java.lang.String getL2EligibleSendEmail();

    java.lang.String getL2EligibleWeCanHelp();

    java.lang.String getL2EligibleWeCanHelpReOpened();

    java.lang.String getL2EligibleYourFeedbackMatters();

    java.lang.String getL2EligibleYourShareFeedback();

    java.lang.String getL2IneligibleAreYouSureClose();

    java.lang.String getL2IneligibleBeforeYouCloseYourAccount();

    java.lang.String getL2IneligibleBusinessChooseReasons();

    java.lang.String getL2IneligibleBusinessClosingAccount();

    java.lang.String getL2IneligibleBusinessComments();

    java.lang.String getL2IneligibleBusinessConfirmation();

    java.lang.String getL2IneligibleBusinessContactUs();

    java.lang.String getL2IneligibleBusinessDoYouCloseAccount();

    java.lang.String getL2IneligibleBusinessEnterComments();

    java.lang.String getL2IneligibleBusinessHelpContactUs();

    java.lang.String getL2IneligibleBusinessNote();

    java.lang.String getL2IneligibleBusinessPlsEnterConcern();

    java.lang.String getL2IneligibleBusinessReasonOne();

    java.lang.String getL2IneligibleBusinessReasonTitle();

    java.lang.String getL2IneligibleBusinessReasonTwo();

    java.lang.String getL2IneligibleCloseAnyOpenPools();

    java.lang.String getL2IneligibleClosePaypalCredit();

    java.lang.String getL2IneligibleDescription();

    java.lang.String getL2IneligibleGenericErrorDesc();

    java.lang.String getL2IneligibleIfYouHaveScheduledIncomplete();

    java.lang.String getL2IneligibleIfYouLikeCloseAccountContact();

    java.lang.String getL2IneligibleIfYouLikeCloseXoomAccount();

    java.lang.String getL2IneligibleIfYouNeedHelp();

    java.lang.String getL2IneligibleOnceYouClosePaypal();

    java.lang.String getL2IneligiblePayOffAnyOpenPaymentPlans();

    java.lang.String getL2IneligiblePayOutstandingAmount();

    java.lang.String getL2IneligiblePayOutstandingBalances();

    java.lang.String getL2IneligiblePendingTransactionSubscription();

    java.lang.String getL2IneligibleResolveAccountLimitation();

    java.lang.String getL2IneligibleShopPayOrReceive();

    java.lang.String getL2IneligibleSomeoneSentYouPayment();

    java.lang.String getL2IneligibleSorry();

    java.lang.String getL2IneligibleSorryYouCannotCloseAccount();

    java.lang.String getL2IneligibleSorryYouCannotCloseAccountRecurringSub();

    java.lang.String getL2IneligibleTakeAdvantage();

    java.lang.String getL2IneligibleThereChargeback();

    java.lang.String getL2IneligibleTherePreApprovedPayment();

    java.lang.String getL2IneligibleThingsToDo();

    java.lang.String getL2IneligibleTitle();

    java.lang.String getL2IneligibleTransferRemainingBalance();

    java.lang.String getL2IneligibleTransferYourFunds();

    java.lang.String getL2IneligibleTryAgainLater();

    java.lang.String getL2IneligibleUnresolvedActions();

    java.lang.String getL2IneligibleViewYourTransaction();

    java.lang.String getL2IneligibleWaitPendingTransactions();

    java.lang.String getL2IneligibleWeWereUnableToClose();

    java.lang.String getL2IneligibleYouCanChangeYourEmail();

    java.lang.String getL2IneligibleYouHaveGiftCard();

    java.lang.String getL3IneligibleContactCustomerSer();

    java.lang.String getL3IneligibleHelpClosePaypalCredit();

    java.lang.String getL3IneligibleKeepPaypalCredit();

    java.lang.String getL3IneligiblePayDueAmount();

    java.lang.String getL3IneligiblePaymentTransferred();

    java.lang.String getL3IneligibleToReceivePayment();

    java.lang.String getLinkCloseYourAccount();

    java.lang.String getLinkClosingYourXoomAccount();

    java.lang.String getLinkContactUs();

    java.lang.String getLinkCustomerService();

    java.lang.String getLinkDeleteYourData();

    java.lang.String getLinkHelpCenter();

    java.lang.String getLinkLetUsKnow();

    java.lang.String getLinkPassword();

    java.lang.String getLinkResolutionCenter();

    java.lang.String getLinkReviewYourLinkedBanks();

    java.lang.String getLinkSettings();

    java.lang.String getLinkSubscriptions();

    java.lang.String getLinkTransactions();

    java.lang.String getLinkWallet();

    java.lang.String getRedeemYourPayPalRewardsPoints();

    java.lang.String getRedeemYourPayPalRewardsPointsDescription();

    java.lang.String getSomethingThatNeedsToBeResolved();
}
