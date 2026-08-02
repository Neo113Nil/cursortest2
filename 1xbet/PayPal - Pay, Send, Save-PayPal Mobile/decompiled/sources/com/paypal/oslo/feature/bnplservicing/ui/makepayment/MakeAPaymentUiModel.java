package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bW\n\u0002\u0010\u0006\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\u0006\u0088\u0001\u0089\u0001\u008a\u0001B¡\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000e\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000e\u0012\b\b\u0002\u0010(\u001a\u00020\f\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b?\u00106J\u0012\u0010@\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eHÆ\u0003¢\u0006\u0004\bB\u0010<J\u0012\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bE\u00106J\u0012\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bF\u00106J\u0012\u0010G\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bG\u0010AJ\u0010\u0010H\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bH\u0010:J\u0012\u0010I\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bK\u0010JJ\u0010\u0010L\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bL\u0010:J\u0012\u0010M\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020$0\u000eHÆ\u0003¢\u0006\u0004\bO\u0010<J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020&0\u000eHÆ\u0003¢\u0006\u0004\bP\u0010<J\u0010\u0010Q\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bQ\u0010:J\u0010\u0010R\u001a\u00020)HÆ\u0003¢\u0006\u0004\bR\u0010SJ¬\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001d\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000e2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000e2\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020)HÆ\u0001¢\u0006\u0004\bT\u0010UJ\u001a\u0010W\u001a\u00020\f2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\"HÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b[\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\\\u001a\u0004\b]\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010^\u001a\u0004\b_\u00102R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010`\u001a\u0004\ba\u00104R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010b\u001a\u0004\bc\u00106R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010d\u001a\u0004\be\u00108R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010f\u001a\u0004\b\r\u0010:R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010g\u001a\u0004\bh\u0010<R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010i\u001a\u0004\bj\u0010>R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010b\u001a\u0004\bk\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010l\u001a\u0004\bm\u0010AR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010g\u001a\u0004\bn\u0010<R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010o\u001a\u0004\bp\u0010DR\u001a\u0010\u001a\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010b\u001a\u0004\bq\u00106R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010b\u001a\u0004\br\u00106R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010l\u001a\u0004\bs\u0010AR\u001a\u0010\u001d\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010f\u001a\u0004\bt\u0010:R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010u\u001a\u0004\bv\u0010JR\u001c\u0010 \u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010u\u001a\u0004\bw\u0010JR\u001a\u0010!\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010f\u001a\u0004\b!\u0010:R\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010x\u001a\u0004\by\u0010NR \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010g\u001a\u0004\bz\u0010<R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010g\u001a\u0004\b{\u0010<R\u001a\u0010(\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010f\u001a\u0004\b|\u0010:R\u001a\u0010*\u001a\u00020)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010}\u001a\u0004\b~\u0010SR\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\n8G¢\u0006\u0006\u001a\u0004\b\u007f\u00108R\u0017\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018G¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0087\u0001\u001a\u0004\u0018\u00010$8G¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentContent;", "content", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "planStatus", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "currentDueAmount", "", "isAutopayEnabled", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentOption;", "paymentOptions", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/CustomAmountOption;", "customAmountOption", "formattedCurrentDueAmount", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "defaultFundingInstrument", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$AddFundingInstrumentLink;", "addFundingInstrumentLinks", "Lcom/paypal/oslo/feature/bnplservicing/common/model/TermsAndConditions;", "termsAndConditions", "currencyCode", "selectedAmount", "selectedFundingInstrument", "processingMakeAPayment", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "formAlertMessage", "customAmountAlertMessage", "isCustomAmountInError", "", "selectedIndex", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/SupportedFundingInstrumentTypeForAddition;", "supportingFundingInstrumentsToAdd", "shouldShowOtherAmountOption", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentContent;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;ZLjava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/CustomAmountOption;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/common/model/TermsAndConditions;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;ZLcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/List;ZLjava/util/Locale;)V", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/String;", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentContent;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "component6", "()Z", "component7", "()Ljava/util/List;", "component8", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/CustomAmountOption;", "component9", "component10", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "component11", "component12", "()Lcom/paypal/oslo/feature/bnplservicing/common/model/TermsAndConditions;", "component13", "component14", "component15", "component16", "component17", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component18", "component19", "component20", "()Ljava/lang/Integer;", "component21", "component22", "component23", "component24", "()Ljava/util/Locale;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentContent;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;ZLjava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/CustomAmountOption;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/common/model/TermsAndConditions;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;ZLcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/List;ZLjava/util/Locale;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentContent;", "getContent", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "getPlanStatus", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getCurrentDueAmount", "Z", "Ljava/util/List;", "getPaymentOptions", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/CustomAmountOption;", "getCustomAmountOption", "getFormattedCurrentDueAmount", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "getDefaultFundingInstrument", "getAddFundingInstrumentLinks", "Lcom/paypal/oslo/feature/bnplservicing/common/model/TermsAndConditions;", "getTermsAndConditions", "getCurrencyCode", "getSelectedAmount", "getSelectedFundingInstrument", "getProcessingMakeAPayment", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getFormAlertMessage", "getCustomAmountAlertMessage", "Ljava/lang/Integer;", "getSelectedIndex", "getFundingInstruments", "getSupportingFundingInstrumentsToAdd", "getShouldShowOtherAmountOption", "Ljava/util/Locale;", "getLocale", "getRawAmount", "rawAmount", "", "getNextPaymentAmount", "()Ljava/lang/Double;", "nextPaymentAmount", "getCurrentFundingInstrument", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "currentFundingInstrument", "AddFundingInstrumentLink", "MakeAPaymentContent", "MakeAPaymentValidationContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MakeAPaymentUiModel {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink> addFundingInstrumentLinks;
    private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent content;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;
    private final java.lang.String currencyCode;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money currentDueAmount;
    private final com.paypal.oslo.core.commonui.utils.RefText customAmountAlertMessage;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption;
    private final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel defaultFundingInstrument;
    private final com.paypal.oslo.core.commonui.utils.RefText formAlertMessage;
    private final java.lang.String formattedCurrentDueAmount;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
    private final boolean isAutopayEnabled;
    private final boolean isCustomAmountInError;
    private final java.util.Locale locale;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption> paymentOptions;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus;
    private final boolean processingMakeAPayment;
    private final java.lang.String selectedAmount;
    private final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel selectedFundingInstrument;
    private final java.lang.Integer selectedIndex;
    private final boolean shouldShowOtherAmountOption;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> supportingFundingInstrumentsToAdd;
    private final com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions;

    /* JADX WARN: Multi-variable type inference failed */
    public MakeAPaymentUiModel(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent makeAPaymentContent, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, boolean z, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption> list, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink> list2, com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel2, boolean z2, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, boolean z3, java.lang.Integer num, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> list3, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> list4, boolean z4, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        this.content = makeAPaymentContent;
        this.planStatus = planStatus;
        this.creditProductIdentifier = creditProductIdentifier;
        this.creditAccountId = str;
        this.currentDueAmount = money;
        this.isAutopayEnabled = z;
        this.paymentOptions = list;
        this.customAmountOption = customAmountOption;
        this.formattedCurrentDueAmount = str2;
        this.defaultFundingInstrument = fundingInstrumentUiModel;
        this.addFundingInstrumentLinks = list2;
        this.termsAndConditions = termsAndConditions;
        this.currencyCode = str3;
        this.selectedAmount = str4;
        this.selectedFundingInstrument = fundingInstrumentUiModel2;
        this.processingMakeAPayment = z2;
        this.formAlertMessage = refText;
        this.customAmountAlertMessage = refText2;
        this.isCustomAmountInError = z3;
        this.selectedIndex = num;
        this.fundingInstruments = list3;
        this.supportingFundingInstrumentsToAdd = list4;
        this.shouldShowOtherAmountOption = z4;
        this.locale = locale;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent getContent() {
        return this.content;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MakeAPaymentUiModel(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent makeAPaymentContent, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, boolean z, java.util.List list, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, java.util.List list2, com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel2, boolean z2, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, boolean z3, java.lang.Integer num, java.util.List list3, java.util.List list4, boolean z4, java.util.Locale locale, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(makeAPaymentContent, r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r6, r8, r16, r17, r18, r19, r20, r21, r22, r23, r0);
        java.util.Locale locale2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus2 = (i & 2) != 0 ? com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.UNKNOWN : planStatus;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier2 = (i & 4) != 0 ? com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.UNKNOWN : creditProductIdentifier;
        java.lang.String str5 = (i & 8) != 0 ? "" : str;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = (i & 16) != 0 ? null : money;
        boolean z5 = (i & 32) != 0 ? false : z;
        java.util.List emptyList = (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption2 = (i & 128) != 0 ? null : customAmountOption;
        java.lang.String str6 = (i & 256) != 0 ? null : str2;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel3 = (i & 512) != 0 ? null : fundingInstrumentUiModel;
        java.util.List emptyList2 = (i & 1024) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
        com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions2 = (i & 2048) != 0 ? null : termsAndConditions;
        java.lang.String str7 = (i & 4096) != 0 ? "" : str3;
        java.lang.String str8 = (i & 8192) != 0 ? null : str4;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel4 = (i & 16384) != 0 ? null : fundingInstrumentUiModel2;
        boolean z6 = (i & 32768) != 0 ? false : z2;
        com.paypal.oslo.core.commonui.utils.RefText refText3 = (i & 65536) != 0 ? null : refText;
        com.paypal.oslo.core.commonui.utils.RefText refText4 = (i & 131072) != 0 ? null : refText2;
        boolean z7 = (i & 262144) != 0 ? false : z3;
        java.lang.Integer num2 = (i & 524288) != 0 ? null : num;
        java.util.List emptyList3 = (i & 1048576) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3;
        java.util.List emptyList4 = (i & 2097152) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4;
        boolean z8 = (i & 4194304) != 0 ? true : z4;
        if ((i & 8388608) != 0) {
            locale2 = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
        } else {
            locale2 = locale;
        }
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus getPlanStatus() {
        return this.planStatus;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getCurrentDueAmount() {
        return this.currentDueAmount;
    }

    public final boolean isAutopayEnabled() {
        return this.isAutopayEnabled;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption> getPaymentOptions() {
        return this.paymentOptions;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption getCustomAmountOption() {
        return this.customAmountOption;
    }

    public final java.lang.String getFormattedCurrentDueAmount() {
        return this.formattedCurrentDueAmount;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getDefaultFundingInstrument() {
        return this.defaultFundingInstrument;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink> getAddFundingInstrumentLinks() {
        return this.addFundingInstrumentLinks;
    }

    public final com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getSelectedAmount() {
        return this.selectedAmount;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getSelectedFundingInstrument() {
        return this.selectedFundingInstrument;
    }

    public final boolean getProcessingMakeAPayment() {
        return this.processingMakeAPayment;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getFormAlertMessage() {
        return this.formAlertMessage;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getCustomAmountAlertMessage() {
        return this.customAmountAlertMessage;
    }

    public final boolean isCustomAmountInError() {
        return this.isCustomAmountInError;
    }

    public final java.lang.Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> getSupportingFundingInstrumentsToAdd() {
        return this.supportingFundingInstrumentsToAdd;
    }

    public final boolean getShouldShowOtherAmountOption() {
        return this.shouldShowOtherAmountOption;
    }

    public final java.util.Locale getLocale() {
        return this.locale;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getRawAmount() {
        java.lang.String str = this.selectedAmount;
        if (str != null) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(this.currencyCode, getHighResolutionOutputSizeshNQ4ISI(str));
        }
        return null;
    }

    public final java.lang.Double getNextPaymentAmount() {
        java.lang.String amount;
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption paymentOption = (com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.paymentOptions);
        if (paymentOption == null || (amount = paymentOption.getAmount()) == null || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(amount)) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toDoubleOrNull(highResolutionOutputSizeshNQ4ISI);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getCurrentFundingInstrument() {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingInstrument;
        if (fundingInstrumentUiModel != null && (fundingInstrument = fundingInstrumentUiModel.getFundingInstrument()) != null) {
            return fundingInstrument;
        }
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel2 = this.defaultFundingInstrument;
        if (fundingInstrumentUiModel2 != null) {
            return fundingInstrumentUiModel2.getFundingInstrument();
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$AddFundingInstrumentLink;", "", "", "text", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$AddFundingInstrumentLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddFundingInstrumentLink {
        public static final int $stable = 0;
        private final java.lang.String text;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType type;

        public AddFundingInstrumentLink(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundingInstrumentType, "");
            this.text = str;
            this.type = addFundingInstrumentType;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddFundingInstrumentLink(text=");
            sb.append(str);
            sb.append(", type=");
            sb.append(addFundingInstrumentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.text.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink addFundingInstrumentLink = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, addFundingInstrumentLink.text) && this.type == addFundingInstrumentLink.type;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink copy(java.lang.String text, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink(text, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink addFundingInstrumentLink, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addFundingInstrumentLink.text;
            }
            if ((i & 2) != 0) {
                addFundingInstrumentType = addFundingInstrumentLink.type;
            }
            return addFundingInstrumentLink.copy(str, addFundingInstrumentType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ~\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b2\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b3\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b4\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "paymentAmountTitle", "autopayOnTitle", "otherAmountLabel", "enterAmountHint", "payWithTitle", "changePaymentMethodLabel", "paymentMethodEmptyMessage", "paymentMethodUnavailableMessage", "confirmAndPayButton", "chooseWayToPayButton", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentValidationContent;", "validationContent", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentValidationContent;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentValidationContent;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentValidationContent;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getPaymentAmountTitle", "getAutopayOnTitle", "getOtherAmountLabel", "getEnterAmountHint", "getPayWithTitle", "getChangePaymentMethodLabel", "getPaymentMethodEmptyMessage", "getPaymentMethodUnavailableMessage", "getConfirmAndPayButton", "getChooseWayToPayButton", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentValidationContent;", "getValidationContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MakeAPaymentContent {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText autopayOnTitle;
        private final com.paypal.oslo.core.commonui.utils.RefText changePaymentMethodLabel;
        private final com.paypal.oslo.core.commonui.utils.RefText chooseWayToPayButton;
        private final com.paypal.oslo.core.commonui.utils.RefText confirmAndPayButton;
        private final com.paypal.oslo.core.commonui.utils.RefText enterAmountHint;
        private final com.paypal.oslo.core.commonui.utils.RefText otherAmountLabel;
        private final com.paypal.oslo.core.commonui.utils.RefText payWithTitle;
        private final com.paypal.oslo.core.commonui.utils.RefText paymentAmountTitle;
        private final com.paypal.oslo.core.commonui.utils.RefText paymentMethodEmptyMessage;
        private final com.paypal.oslo.core.commonui.utils.RefText paymentMethodUnavailableMessage;
        private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent validationContent;

        public MakeAPaymentContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4, com.paypal.oslo.core.commonui.utils.RefText refText5, com.paypal.oslo.core.commonui.utils.RefText refText6, com.paypal.oslo.core.commonui.utils.RefText refText7, com.paypal.oslo.core.commonui.utils.RefText refText8, com.paypal.oslo.core.commonui.utils.RefText refText9, com.paypal.oslo.core.commonui.utils.RefText refText10, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent makeAPaymentValidationContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText8, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText9, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText10, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentValidationContent, "");
            this.paymentAmountTitle = refText;
            this.autopayOnTitle = refText2;
            this.otherAmountLabel = refText3;
            this.enterAmountHint = refText4;
            this.payWithTitle = refText5;
            this.changePaymentMethodLabel = refText6;
            this.paymentMethodEmptyMessage = refText7;
            this.paymentMethodUnavailableMessage = refText8;
            this.confirmAndPayButton = refText9;
            this.chooseWayToPayButton = refText10;
            this.validationContent = makeAPaymentValidationContent;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getPaymentAmountTitle() {
            return this.paymentAmountTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getAutopayOnTitle() {
            return this.autopayOnTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getOtherAmountLabel() {
            return this.otherAmountLabel;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getEnterAmountHint() {
            return this.enterAmountHint;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getPayWithTitle() {
            return this.payWithTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getChangePaymentMethodLabel() {
            return this.changePaymentMethodLabel;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getPaymentMethodEmptyMessage() {
            return this.paymentMethodEmptyMessage;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getPaymentMethodUnavailableMessage() {
            return this.paymentMethodUnavailableMessage;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getConfirmAndPayButton() {
            return this.confirmAndPayButton;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getChooseWayToPayButton() {
            return this.chooseWayToPayButton;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent getValidationContent() {
            return this.validationContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.paymentAmountTitle;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.autopayOnTitle;
            com.paypal.oslo.core.commonui.utils.RefText refText3 = this.otherAmountLabel;
            com.paypal.oslo.core.commonui.utils.RefText refText4 = this.enterAmountHint;
            com.paypal.oslo.core.commonui.utils.RefText refText5 = this.payWithTitle;
            com.paypal.oslo.core.commonui.utils.RefText refText6 = this.changePaymentMethodLabel;
            com.paypal.oslo.core.commonui.utils.RefText refText7 = this.paymentMethodEmptyMessage;
            com.paypal.oslo.core.commonui.utils.RefText refText8 = this.paymentMethodUnavailableMessage;
            com.paypal.oslo.core.commonui.utils.RefText refText9 = this.confirmAndPayButton;
            com.paypal.oslo.core.commonui.utils.RefText refText10 = this.chooseWayToPayButton;
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent makeAPaymentValidationContent = this.validationContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MakeAPaymentContent(paymentAmountTitle=");
            sb.append(refText);
            sb.append(", autopayOnTitle=");
            sb.append(refText2);
            sb.append(", otherAmountLabel=");
            sb.append(refText3);
            sb.append(", enterAmountHint=");
            sb.append(refText4);
            sb.append(", payWithTitle=");
            sb.append(refText5);
            sb.append(", changePaymentMethodLabel=");
            sb.append(refText6);
            sb.append(", paymentMethodEmptyMessage=");
            sb.append(refText7);
            sb.append(", paymentMethodUnavailableMessage=");
            sb.append(refText8);
            sb.append(", confirmAndPayButton=");
            sb.append(refText9);
            sb.append(", chooseWayToPayButton=");
            sb.append(refText10);
            sb.append(", validationContent=");
            sb.append(makeAPaymentValidationContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((((((this.paymentAmountTitle.hashCode() * 31) + this.autopayOnTitle.hashCode()) * 31) + this.otherAmountLabel.hashCode()) * 31) + this.enterAmountHint.hashCode()) * 31) + this.payWithTitle.hashCode()) * 31) + this.changePaymentMethodLabel.hashCode()) * 31) + this.paymentMethodEmptyMessage.hashCode()) * 31) + this.paymentMethodUnavailableMessage.hashCode()) * 31) + this.confirmAndPayButton.hashCode()) * 31) + this.chooseWayToPayButton.hashCode()) * 31) + this.validationContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent makeAPaymentContent = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAmountTitle, makeAPaymentContent.paymentAmountTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopayOnTitle, makeAPaymentContent.autopayOnTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.otherAmountLabel, makeAPaymentContent.otherAmountLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.enterAmountHint, makeAPaymentContent.enterAmountHint) && kotlin.jvm.internal.Intrinsics.areEqual(this.payWithTitle, makeAPaymentContent.payWithTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.changePaymentMethodLabel, makeAPaymentContent.changePaymentMethodLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentMethodEmptyMessage, makeAPaymentContent.paymentMethodEmptyMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentMethodUnavailableMessage, makeAPaymentContent.paymentMethodUnavailableMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmAndPayButton, makeAPaymentContent.confirmAndPayButton) && kotlin.jvm.internal.Intrinsics.areEqual(this.chooseWayToPayButton, makeAPaymentContent.chooseWayToPayButton) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationContent, makeAPaymentContent.validationContent);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent copy(com.paypal.oslo.core.commonui.utils.RefText paymentAmountTitle, com.paypal.oslo.core.commonui.utils.RefText autopayOnTitle, com.paypal.oslo.core.commonui.utils.RefText otherAmountLabel, com.paypal.oslo.core.commonui.utils.RefText enterAmountHint, com.paypal.oslo.core.commonui.utils.RefText payWithTitle, com.paypal.oslo.core.commonui.utils.RefText changePaymentMethodLabel, com.paypal.oslo.core.commonui.utils.RefText paymentMethodEmptyMessage, com.paypal.oslo.core.commonui.utils.RefText paymentMethodUnavailableMessage, com.paypal.oslo.core.commonui.utils.RefText confirmAndPayButton, com.paypal.oslo.core.commonui.utils.RefText chooseWayToPayButton, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent validationContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAmountTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayOnTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherAmountLabel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountHint, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payWithTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePaymentMethodLabel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodEmptyMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodUnavailableMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmAndPayButton, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseWayToPayButton, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationContent, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent(paymentAmountTitle, autopayOnTitle, otherAmountLabel, enterAmountHint, payWithTitle, changePaymentMethodLabel, paymentMethodEmptyMessage, paymentMethodUnavailableMessage, confirmAndPayButton, chooseWayToPayButton, validationContent);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getConfirmAndPayButton() {
            return this.confirmAndPayButton;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getPaymentMethodUnavailableMessage() {
            return this.paymentMethodUnavailableMessage;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getPaymentMethodEmptyMessage() {
            return this.paymentMethodEmptyMessage;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getChangePaymentMethodLabel() {
            return this.changePaymentMethodLabel;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getPayWithTitle() {
            return this.payWithTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getEnterAmountHint() {
            return this.enterAmountHint;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getOtherAmountLabel() {
            return this.otherAmountLabel;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getAutopayOnTitle() {
            return this.autopayOnTitle;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent getValidationContent() {
            return this.validationContent;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getChooseWayToPayButton() {
            return this.chooseWayToPayButton;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getPaymentAmountTitle() {
            return this.paymentAmountTitle;
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ`\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010\u000eR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentValidationContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "missingAmount", "missingFundingInstrument", "insufficientBalance", "amountBelowMinimum", "amountAboveMaximum", "amountExceedsInfo", "amountBelowInfo", "amountEqualsMaximum", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$MakeAPaymentValidationContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getMissingAmount", "getMissingFundingInstrument", "getInsufficientBalance", "getAmountBelowMinimum", "getAmountAboveMaximum", "getAmountExceedsInfo", "getAmountBelowInfo", "getAmountEqualsMaximum"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MakeAPaymentValidationContent {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText amountAboveMaximum;
        private final com.paypal.oslo.core.commonui.utils.RefText amountBelowInfo;
        private final com.paypal.oslo.core.commonui.utils.RefText amountBelowMinimum;
        private final com.paypal.oslo.core.commonui.utils.RefText amountEqualsMaximum;
        private final com.paypal.oslo.core.commonui.utils.RefText amountExceedsInfo;
        private final com.paypal.oslo.core.commonui.utils.RefText insufficientBalance;
        private final com.paypal.oslo.core.commonui.utils.RefText missingAmount;
        private final com.paypal.oslo.core.commonui.utils.RefText missingFundingInstrument;

        public MakeAPaymentValidationContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4, com.paypal.oslo.core.commonui.utils.RefText refText5, com.paypal.oslo.core.commonui.utils.RefText refText6, com.paypal.oslo.core.commonui.utils.RefText refText7, com.paypal.oslo.core.commonui.utils.RefText refText8) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText8, "");
            this.missingAmount = refText;
            this.missingFundingInstrument = refText2;
            this.insufficientBalance = refText3;
            this.amountBelowMinimum = refText4;
            this.amountAboveMaximum = refText5;
            this.amountExceedsInfo = refText6;
            this.amountBelowInfo = refText7;
            this.amountEqualsMaximum = refText8;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getMissingAmount() {
            return this.missingAmount;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getMissingFundingInstrument() {
            return this.missingFundingInstrument;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getInsufficientBalance() {
            return this.insufficientBalance;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getAmountBelowMinimum() {
            return this.amountBelowMinimum;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getAmountAboveMaximum() {
            return this.amountAboveMaximum;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getAmountExceedsInfo() {
            return this.amountExceedsInfo;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getAmountBelowInfo() {
            return this.amountBelowInfo;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getAmountEqualsMaximum() {
            return this.amountEqualsMaximum;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.missingAmount;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.missingFundingInstrument;
            com.paypal.oslo.core.commonui.utils.RefText refText3 = this.insufficientBalance;
            com.paypal.oslo.core.commonui.utils.RefText refText4 = this.amountBelowMinimum;
            com.paypal.oslo.core.commonui.utils.RefText refText5 = this.amountAboveMaximum;
            com.paypal.oslo.core.commonui.utils.RefText refText6 = this.amountExceedsInfo;
            com.paypal.oslo.core.commonui.utils.RefText refText7 = this.amountBelowInfo;
            com.paypal.oslo.core.commonui.utils.RefText refText8 = this.amountEqualsMaximum;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MakeAPaymentValidationContent(missingAmount=");
            sb.append(refText);
            sb.append(", missingFundingInstrument=");
            sb.append(refText2);
            sb.append(", insufficientBalance=");
            sb.append(refText3);
            sb.append(", amountBelowMinimum=");
            sb.append(refText4);
            sb.append(", amountAboveMaximum=");
            sb.append(refText5);
            sb.append(", amountExceedsInfo=");
            sb.append(refText6);
            sb.append(", amountBelowInfo=");
            sb.append(refText7);
            sb.append(", amountEqualsMaximum=");
            sb.append(refText8);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((this.missingAmount.hashCode() * 31) + this.missingFundingInstrument.hashCode()) * 31) + this.insufficientBalance.hashCode()) * 31) + this.amountBelowMinimum.hashCode()) * 31) + this.amountAboveMaximum.hashCode()) * 31) + this.amountExceedsInfo.hashCode()) * 31) + this.amountBelowInfo.hashCode()) * 31) + this.amountEqualsMaximum.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent makeAPaymentValidationContent = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.missingAmount, makeAPaymentValidationContent.missingAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.missingFundingInstrument, makeAPaymentValidationContent.missingFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.insufficientBalance, makeAPaymentValidationContent.insufficientBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountBelowMinimum, makeAPaymentValidationContent.amountBelowMinimum) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountAboveMaximum, makeAPaymentValidationContent.amountAboveMaximum) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountExceedsInfo, makeAPaymentValidationContent.amountExceedsInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountBelowInfo, makeAPaymentValidationContent.amountBelowInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountEqualsMaximum, makeAPaymentValidationContent.amountEqualsMaximum);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent copy(com.paypal.oslo.core.commonui.utils.RefText missingAmount, com.paypal.oslo.core.commonui.utils.RefText missingFundingInstrument, com.paypal.oslo.core.commonui.utils.RefText insufficientBalance, com.paypal.oslo.core.commonui.utils.RefText amountBelowMinimum, com.paypal.oslo.core.commonui.utils.RefText amountAboveMaximum, com.paypal.oslo.core.commonui.utils.RefText amountExceedsInfo, com.paypal.oslo.core.commonui.utils.RefText amountBelowInfo, com.paypal.oslo.core.commonui.utils.RefText amountEqualsMaximum) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingFundingInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insufficientBalance, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountBelowMinimum, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountAboveMaximum, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountExceedsInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountBelowInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountEqualsMaximum, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent(missingAmount, missingFundingInstrument, insufficientBalance, amountBelowMinimum, amountAboveMaximum, amountExceedsInfo, amountBelowInfo, amountEqualsMaximum);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getAmountEqualsMaximum() {
            return this.amountEqualsMaximum;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getAmountBelowInfo() {
            return this.amountBelowInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getAmountExceedsInfo() {
            return this.amountExceedsInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getAmountAboveMaximum() {
            return this.amountAboveMaximum;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getAmountBelowMinimum() {
            return this.amountBelowMinimum;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getInsufficientBalance() {
            return this.insufficientBalance;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getMissingFundingInstrument() {
            return this.missingFundingInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getMissingAmount() {
            return this.missingAmount;
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new kotlin.text.Regex("[^0-9.-]").replace(kotlin.text.StringsKt.replace$default(str, ",", "", false, 4, (java.lang.Object) null), ""));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        java.lang.String str2 = (java.lang.String) m23436constructorimpl;
        return str2 == null ? str : str2;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent makeAPaymentContent = this.content;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus = this.planStatus;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.String str = this.creditAccountId;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.currentDueAmount;
        boolean z = this.isAutopayEnabled;
        java.util.List<com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption> list = this.paymentOptions;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption = this.customAmountOption;
        java.lang.String str2 = this.formattedCurrentDueAmount;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel = this.defaultFundingInstrument;
        java.util.List<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink> list2 = this.addFundingInstrumentLinks;
        com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions = this.termsAndConditions;
        java.lang.String str3 = this.currencyCode;
        java.lang.String str4 = this.selectedAmount;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel2 = this.selectedFundingInstrument;
        boolean z2 = this.processingMakeAPayment;
        com.paypal.oslo.core.commonui.utils.RefText refText = this.formAlertMessage;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.customAmountAlertMessage;
        boolean z3 = this.isCustomAmountInError;
        java.lang.Integer num = this.selectedIndex;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> list3 = this.fundingInstruments;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> list4 = this.supportingFundingInstrumentsToAdd;
        boolean z4 = this.shouldShowOtherAmountOption;
        java.util.Locale locale = this.locale;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MakeAPaymentUiModel(content=");
        sb.append(makeAPaymentContent);
        sb.append(", planStatus=");
        sb.append(planStatus);
        sb.append(", creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(str);
        sb.append(", currentDueAmount=");
        sb.append(money);
        sb.append(", isAutopayEnabled=");
        sb.append(z);
        sb.append(", paymentOptions=");
        sb.append(list);
        sb.append(", customAmountOption=");
        sb.append(customAmountOption);
        sb.append(", formattedCurrentDueAmount=");
        sb.append(str2);
        sb.append(", defaultFundingInstrument=");
        sb.append(fundingInstrumentUiModel);
        sb.append(", addFundingInstrumentLinks=");
        sb.append(list2);
        sb.append(", termsAndConditions=");
        sb.append(termsAndConditions);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", selectedAmount=");
        sb.append(str4);
        sb.append(", selectedFundingInstrument=");
        sb.append(fundingInstrumentUiModel2);
        sb.append(", processingMakeAPayment=");
        sb.append(z2);
        sb.append(", formAlertMessage=");
        sb.append(refText);
        sb.append(", customAmountAlertMessage=");
        sb.append(refText2);
        sb.append(", isCustomAmountInError=");
        sb.append(z3);
        sb.append(", selectedIndex=");
        sb.append(num);
        sb.append(", fundingInstruments=");
        sb.append(list3);
        sb.append(", supportingFundingInstrumentsToAdd=");
        sb.append(list4);
        sb.append(", shouldShowOtherAmountOption=");
        sb.append(z4);
        sb.append(", locale=");
        sb.append(locale);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.content.hashCode();
        int hashCode2 = this.planStatus.hashCode();
        int hashCode3 = this.creditProductIdentifier.hashCode();
        int hashCode4 = this.creditAccountId.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.currentDueAmount;
        int hashCode5 = money == null ? 0 : money.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.isAutopayEnabled);
        int hashCode7 = this.paymentOptions.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption = this.customAmountOption;
        int hashCode8 = customAmountOption == null ? 0 : customAmountOption.hashCode();
        java.lang.String str = this.formattedCurrentDueAmount;
        int hashCode9 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel = this.defaultFundingInstrument;
        int hashCode10 = fundingInstrumentUiModel == null ? 0 : fundingInstrumentUiModel.hashCode();
        int hashCode11 = this.addFundingInstrumentLinks.hashCode();
        com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions = this.termsAndConditions;
        int hashCode12 = termsAndConditions == null ? 0 : termsAndConditions.hashCode();
        int hashCode13 = this.currencyCode.hashCode();
        java.lang.String str2 = this.selectedAmount;
        int hashCode14 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel2 = this.selectedFundingInstrument;
        int hashCode15 = fundingInstrumentUiModel2 == null ? 0 : fundingInstrumentUiModel2.hashCode();
        int hashCode16 = java.lang.Boolean.hashCode(this.processingMakeAPayment);
        com.paypal.oslo.core.commonui.utils.RefText refText = this.formAlertMessage;
        int hashCode17 = refText == null ? 0 : refText.hashCode();
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.customAmountAlertMessage;
        int hashCode18 = refText2 == null ? 0 : refText2.hashCode();
        int hashCode19 = java.lang.Boolean.hashCode(this.isCustomAmountInError);
        java.lang.Integer num = this.selectedIndex;
        return (((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.fundingInstruments.hashCode()) * 31) + this.supportingFundingInstrumentsToAdd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldShowOtherAmountOption)) * 31) + this.locale.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, makeAPaymentUiModel.content) && this.planStatus == makeAPaymentUiModel.planStatus && this.creditProductIdentifier == makeAPaymentUiModel.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, makeAPaymentUiModel.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentDueAmount, makeAPaymentUiModel.currentDueAmount) && this.isAutopayEnabled == makeAPaymentUiModel.isAutopayEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentOptions, makeAPaymentUiModel.paymentOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmountOption, makeAPaymentUiModel.customAmountOption) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedCurrentDueAmount, makeAPaymentUiModel.formattedCurrentDueAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultFundingInstrument, makeAPaymentUiModel.defaultFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.addFundingInstrumentLinks, makeAPaymentUiModel.addFundingInstrumentLinks) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsAndConditions, makeAPaymentUiModel.termsAndConditions) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, makeAPaymentUiModel.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedAmount, makeAPaymentUiModel.selectedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrument, makeAPaymentUiModel.selectedFundingInstrument) && this.processingMakeAPayment == makeAPaymentUiModel.processingMakeAPayment && kotlin.jvm.internal.Intrinsics.areEqual(this.formAlertMessage, makeAPaymentUiModel.formAlertMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmountAlertMessage, makeAPaymentUiModel.customAmountAlertMessage) && this.isCustomAmountInError == makeAPaymentUiModel.isCustomAmountInError && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedIndex, makeAPaymentUiModel.selectedIndex) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, makeAPaymentUiModel.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportingFundingInstrumentsToAdd, makeAPaymentUiModel.supportingFundingInstrumentsToAdd) && this.shouldShowOtherAmountOption == makeAPaymentUiModel.shouldShowOtherAmountOption && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, makeAPaymentUiModel.locale);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent content, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money currentDueAmount, boolean isAutopayEnabled, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption> paymentOptions, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption, java.lang.String formattedCurrentDueAmount, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel defaultFundingInstrument, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink> addFundingInstrumentLinks, com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions, java.lang.String currencyCode, java.lang.String selectedAmount, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel selectedFundingInstrument, boolean processingMakeAPayment, com.paypal.oslo.core.commonui.utils.RefText formAlertMessage, com.paypal.oslo.core.commonui.utils.RefText customAmountAlertMessage, boolean isCustomAmountInError, java.lang.Integer selectedIndex, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> supportingFundingInstrumentsToAdd, boolean shouldShowOtherAmountOption, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundingInstrumentLinks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportingFundingInstrumentsToAdd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel(content, planStatus, creditProductIdentifier, creditAccountId, currentDueAmount, isAutopayEnabled, paymentOptions, customAmountOption, formattedCurrentDueAmount, defaultFundingInstrument, addFundingInstrumentLinks, termsAndConditions, currencyCode, selectedAmount, selectedFundingInstrument, processingMakeAPayment, formAlertMessage, customAmountAlertMessage, isCustomAmountInError, selectedIndex, fundingInstruments, supportingFundingInstrumentsToAdd, shouldShowOtherAmountOption, locale);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getFormattedCurrentDueAmount() {
        return this.formattedCurrentDueAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption getCustomAmountOption() {
        return this.customAmountOption;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption> component7() {
        return this.paymentOptions;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsAutopayEnabled() {
        return this.isAutopayEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getCurrentDueAmount() {
        return this.currentDueAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component24, reason: from getter */
    public final java.util.Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getShouldShowOtherAmountOption() {
        return this.shouldShowOtherAmountOption;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> component22() {
        return this.supportingFundingInstrumentsToAdd;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> component21() {
        return this.fundingInstruments;
    }

    /* renamed from: component20, reason: from getter */
    public final java.lang.Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus getPlanStatus() {
        return this.planStatus;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsCustomAmountInError() {
        return this.isCustomAmountInError;
    }

    /* renamed from: component18, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getCustomAmountAlertMessage() {
        return this.customAmountAlertMessage;
    }

    /* renamed from: component17, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getFormAlertMessage() {
        return this.formAlertMessage;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getProcessingMakeAPayment() {
        return this.processingMakeAPayment;
    }

    /* renamed from: component15, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getSelectedFundingInstrument() {
        return this.selectedFundingInstrument;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getSelectedAmount() {
        return this.selectedAmount;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink> component11() {
        return this.addFundingInstrumentLinks;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getDefaultFundingInstrument() {
        return this.defaultFundingInstrument;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent getContent() {
        return this.content;
    }
}
