package com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bP\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0015\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0015\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010&J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010&J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010(J\u0010\u00103\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010&J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010&J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u0010(J\u0012\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010&J\u0012\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b?\u0010;J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010&J\u0010\u0010A\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bA\u0010;J\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u0010&J\u0010\u0010C\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bC\u0010;J\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u0010&J\u0010\u0010E\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bE\u0010;J\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u0010&J¦\u0002\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\bL\u0010;J\u0010\u0010M\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bM\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\b\u0003\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bP\u0010(R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bQ\u0010(R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\b\u0007\u0010&R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010O\u001a\u0004\bR\u0010(R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bS\u0010(R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010T\u001a\u0004\bU\u0010.R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\b\f\u0010&R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\b\r\u0010&R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\b\u000e\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bV\u0010(R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010W\u001a\u0004\bX\u00104R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bY\u0010&R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bZ\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\b[\u0010(R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u00109R\u001a\u0010\u0017\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\b_\u0010;R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010N\u001a\u0004\b\u0018\u0010&R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010`\u001a\u0004\ba\u0010>R\u001a\u0010\u001b\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\bb\u0010;R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010N\u001a\u0004\bc\u0010&R\u001a\u0010\u001d\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010^\u001a\u0004\bd\u0010;R\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010N\u001a\u0004\be\u0010&R\u001a\u0010\u001f\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010^\u001a\u0004\bf\u0010;R\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010N\u001a\u0004\bg\u0010&R\u001a\u0010!\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010^\u001a\u0004\bh\u0010;R\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010N\u001a\u0004\bi\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDepositUiState;", "", "", "isLoading", "", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "maskedAccountNumber", "isAccountNumberVisible", "routingNumber", "bankName", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDebitStatus;", "directDebitStatus", "isDirectDebitEnabled", "isDirectDepositInfoExpanded", "isDirectDebitInfoExpanded", "error", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/ErrorType;", "errorType", "showErrorScreen", "showIntroScreen", "toastMessage", "", "toastMessageResId", "retryCount", "isFillOutFormEnabled", "Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;", "smartRoutePreferences", "directDebitErrorRetryCount", "showDirectDebitErrorHalfSheet", "atomicSetupErrorRetryCount", "showAtomicSetupErrorHalfSheet", "linkAccountErrorRetryCount", "showLinkAccountErrorHalfSheet", "smartRoutePreferencesErrorRetryCount", "showSmartRoutePreferencesErrorHalfSheet", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDebitStatus;ZZZLjava/lang/String;Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/ErrorType;ZZLjava/lang/String;Ljava/lang/Integer;IZLcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;IZIZIZIZ)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDebitStatus;", "component8", "component9", "component10", "component11", "component12", "()Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/ErrorType;", "component13", "component14", "component15", "component16", "()Ljava/lang/Integer;", "component17", "()I", "component18", "component19", "()Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDebitStatus;ZZZLjava/lang/String;Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/ErrorType;ZZLjava/lang/String;Ljava/lang/Integer;IZLcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;IZIZIZIZ)Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDepositUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Z", "Ljava/lang/String;", "getAccountNumber", "getMaskedAccountNumber", "getRoutingNumber", "getBankName", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDebitStatus;", "getDirectDebitStatus", "getError", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/ErrorType;", "getErrorType", "getShowErrorScreen", "getShowIntroScreen", "getToastMessage", "Ljava/lang/Integer;", "getToastMessageResId", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;", "getSmartRoutePreferences", "getDirectDebitErrorRetryCount", "getShowDirectDebitErrorHalfSheet", "getAtomicSetupErrorRetryCount", "getShowAtomicSetupErrorHalfSheet", "getLinkAccountErrorRetryCount", "getShowLinkAccountErrorHalfSheet", "getSmartRoutePreferencesErrorRetryCount", "getShowSmartRoutePreferencesErrorHalfSheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DirectDepositUiState {
    public static final int $stable = 8;
    private final java.lang.String accountNumber;
    private final int atomicSetupErrorRetryCount;
    private final java.lang.String bankName;
    private final int directDebitErrorRetryCount;
    private final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus directDebitStatus;
    private final java.lang.String error;
    private final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType;
    private final boolean isAccountNumberVisible;
    private final boolean isDirectDebitEnabled;
    private final boolean isDirectDebitInfoExpanded;
    private final boolean isDirectDepositInfoExpanded;
    private final boolean isFillOutFormEnabled;
    private final boolean isLoading;
    private final int linkAccountErrorRetryCount;
    private final java.lang.String maskedAccountNumber;
    private final int retryCount;
    private final java.lang.String routingNumber;
    private final boolean showAtomicSetupErrorHalfSheet;
    private final boolean showDirectDebitErrorHalfSheet;
    private final boolean showErrorScreen;
    private final boolean showIntroScreen;
    private final boolean showLinkAccountErrorHalfSheet;
    private final boolean showSmartRoutePreferencesErrorHalfSheet;
    private final com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences;
    private final int smartRoutePreferencesErrorRetryCount;
    private final java.lang.String toastMessage;
    private final java.lang.Integer toastMessageResId;

    public DirectDepositUiState(boolean z, java.lang.String str, java.lang.String str2, boolean z2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus directDebitStatus, boolean z3, boolean z4, boolean z5, java.lang.String str5, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType, boolean z6, boolean z7, java.lang.String str6, java.lang.Integer num, int i, boolean z8, com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences, int i2, boolean z9, int i3, boolean z10, int i4, boolean z11, int i5, boolean z12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDebitStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        this.isLoading = z;
        this.accountNumber = str;
        this.maskedAccountNumber = str2;
        this.isAccountNumberVisible = z2;
        this.routingNumber = str3;
        this.bankName = str4;
        this.directDebitStatus = directDebitStatus;
        this.isDirectDebitEnabled = z3;
        this.isDirectDepositInfoExpanded = z4;
        this.isDirectDebitInfoExpanded = z5;
        this.error = str5;
        this.errorType = errorType;
        this.showErrorScreen = z6;
        this.showIntroScreen = z7;
        this.toastMessage = str6;
        this.toastMessageResId = num;
        this.retryCount = i;
        this.isFillOutFormEnabled = z8;
        this.smartRoutePreferences = smartRoutePreferences;
        this.directDebitErrorRetryCount = i2;
        this.showDirectDebitErrorHalfSheet = z9;
        this.atomicSetupErrorRetryCount = i3;
        this.showAtomicSetupErrorHalfSheet = z10;
        this.linkAccountErrorRetryCount = i4;
        this.showLinkAccountErrorHalfSheet = z11;
        this.smartRoutePreferencesErrorRetryCount = i5;
        this.showSmartRoutePreferencesErrorHalfSheet = z12;
    }

    public /* synthetic */ DirectDepositUiState(boolean z, java.lang.String str, java.lang.String str2, boolean z2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus directDebitStatus, boolean z3, boolean z4, boolean z5, java.lang.String str5, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType, boolean z6, boolean z7, java.lang.String str6, java.lang.Integer num, int i, boolean z8, com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences, int i2, boolean z9, int i3, boolean z10, int i4, boolean z11, int i5, boolean z12, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? true : z, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? false : z2, (i6 & 16) != 0 ? "" : str3, (i6 & 32) == 0 ? str4 : "", (i6 & 64) != 0 ? com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus.UNKNOWN : directDebitStatus, (i6 & 128) != 0 ? false : z3, (i6 & 256) != 0 ? false : z4, (i6 & 512) != 0 ? false : z5, (i6 & 1024) != 0 ? null : str5, (i6 & 2048) != 0 ? com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.NONE : errorType, (i6 & 4096) != 0 ? false : z6, (i6 & 8192) != 0 ? false : z7, (i6 & 16384) != 0 ? null : str6, (i6 & 32768) != 0 ? null : num, (i6 & 65536) != 0 ? 0 : i, (i6 & 131072) != 0 ? false : z8, (i6 & 262144) != 0 ? null : smartRoutePreferences, (i6 & 524288) != 0 ? 0 : i2, (i6 & 1048576) != 0 ? false : z9, (i6 & 2097152) != 0 ? 0 : i3, (i6 & 4194304) != 0 ? false : z10, (i6 & 8388608) != 0 ? 0 : i4, (i6 & 16777216) != 0 ? false : z11, (i6 & 33554432) != 0 ? 0 : i5, (i6 & 67108864) != 0 ? false : z12);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String getAccountNumber() {
        return this.accountNumber;
    }

    public final java.lang.String getMaskedAccountNumber() {
        return this.maskedAccountNumber;
    }

    public final boolean isAccountNumberVisible() {
        return this.isAccountNumberVisible;
    }

    public final java.lang.String getRoutingNumber() {
        return this.routingNumber;
    }

    public final java.lang.String getBankName() {
        return this.bankName;
    }

    public final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus getDirectDebitStatus() {
        return this.directDebitStatus;
    }

    public final boolean isDirectDebitEnabled() {
        return this.isDirectDebitEnabled;
    }

    public final boolean isDirectDepositInfoExpanded() {
        return this.isDirectDepositInfoExpanded;
    }

    public final boolean isDirectDebitInfoExpanded() {
        return this.isDirectDebitInfoExpanded;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType getErrorType() {
        return this.errorType;
    }

    public final boolean getShowErrorScreen() {
        return this.showErrorScreen;
    }

    public final boolean getShowIntroScreen() {
        return this.showIntroScreen;
    }

    public final java.lang.String getToastMessage() {
        return this.toastMessage;
    }

    public final java.lang.Integer getToastMessageResId() {
        return this.toastMessageResId;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final boolean isFillOutFormEnabled() {
        return this.isFillOutFormEnabled;
    }

    public final com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences getSmartRoutePreferences() {
        return this.smartRoutePreferences;
    }

    public final int getDirectDebitErrorRetryCount() {
        return this.directDebitErrorRetryCount;
    }

    public final boolean getShowDirectDebitErrorHalfSheet() {
        return this.showDirectDebitErrorHalfSheet;
    }

    public final int getAtomicSetupErrorRetryCount() {
        return this.atomicSetupErrorRetryCount;
    }

    public final boolean getShowAtomicSetupErrorHalfSheet() {
        return this.showAtomicSetupErrorHalfSheet;
    }

    public final int getLinkAccountErrorRetryCount() {
        return this.linkAccountErrorRetryCount;
    }

    public final boolean getShowLinkAccountErrorHalfSheet() {
        return this.showLinkAccountErrorHalfSheet;
    }

    public final int getSmartRoutePreferencesErrorRetryCount() {
        return this.smartRoutePreferencesErrorRetryCount;
    }

    public final boolean getShowSmartRoutePreferencesErrorHalfSheet() {
        return this.showSmartRoutePreferencesErrorHalfSheet;
    }

    public final java.lang.String toString() {
        boolean z = this.isLoading;
        java.lang.String str = this.accountNumber;
        java.lang.String str2 = this.maskedAccountNumber;
        boolean z2 = this.isAccountNumberVisible;
        java.lang.String str3 = this.routingNumber;
        java.lang.String str4 = this.bankName;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus directDebitStatus = this.directDebitStatus;
        boolean z3 = this.isDirectDebitEnabled;
        boolean z4 = this.isDirectDepositInfoExpanded;
        boolean z5 = this.isDirectDebitInfoExpanded;
        java.lang.String str5 = this.error;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType = this.errorType;
        boolean z6 = this.showErrorScreen;
        boolean z7 = this.showIntroScreen;
        java.lang.String str6 = this.toastMessage;
        java.lang.Integer num = this.toastMessageResId;
        int i = this.retryCount;
        boolean z8 = this.isFillOutFormEnabled;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences = this.smartRoutePreferences;
        int i2 = this.directDebitErrorRetryCount;
        boolean z9 = this.showDirectDebitErrorHalfSheet;
        int i3 = this.atomicSetupErrorRetryCount;
        boolean z10 = this.showAtomicSetupErrorHalfSheet;
        int i4 = this.linkAccountErrorRetryCount;
        boolean z11 = this.showLinkAccountErrorHalfSheet;
        int i5 = this.smartRoutePreferencesErrorRetryCount;
        boolean z12 = this.showSmartRoutePreferencesErrorHalfSheet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DirectDepositUiState(isLoading=");
        sb.append(z);
        sb.append(", accountNumber=");
        sb.append(str);
        sb.append(", maskedAccountNumber=");
        sb.append(str2);
        sb.append(", isAccountNumberVisible=");
        sb.append(z2);
        sb.append(", routingNumber=");
        sb.append(str3);
        sb.append(", bankName=");
        sb.append(str4);
        sb.append(", directDebitStatus=");
        sb.append(directDebitStatus);
        sb.append(", isDirectDebitEnabled=");
        sb.append(z3);
        sb.append(", isDirectDepositInfoExpanded=");
        sb.append(z4);
        sb.append(", isDirectDebitInfoExpanded=");
        sb.append(z5);
        sb.append(", error=");
        sb.append(str5);
        sb.append(", errorType=");
        sb.append(errorType);
        sb.append(", showErrorScreen=");
        sb.append(z6);
        sb.append(", showIntroScreen=");
        sb.append(z7);
        sb.append(", toastMessage=");
        sb.append(str6);
        sb.append(", toastMessageResId=");
        sb.append(num);
        sb.append(", retryCount=");
        sb.append(i);
        sb.append(", isFillOutFormEnabled=");
        sb.append(z8);
        sb.append(", smartRoutePreferences=");
        sb.append(smartRoutePreferences);
        sb.append(", directDebitErrorRetryCount=");
        sb.append(i2);
        sb.append(", showDirectDebitErrorHalfSheet=");
        sb.append(z9);
        sb.append(", atomicSetupErrorRetryCount=");
        sb.append(i3);
        sb.append(", showAtomicSetupErrorHalfSheet=");
        sb.append(z10);
        sb.append(", linkAccountErrorRetryCount=");
        sb.append(i4);
        sb.append(", showLinkAccountErrorHalfSheet=");
        sb.append(z11);
        sb.append(", smartRoutePreferencesErrorRetryCount=");
        sb.append(i5);
        sb.append(", showSmartRoutePreferencesErrorHalfSheet=");
        sb.append(z12);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isLoading);
        int hashCode2 = this.accountNumber.hashCode();
        int hashCode3 = this.maskedAccountNumber.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.isAccountNumberVisible);
        int hashCode5 = this.routingNumber.hashCode();
        int hashCode6 = this.bankName.hashCode();
        int hashCode7 = this.directDebitStatus.hashCode();
        int hashCode8 = java.lang.Boolean.hashCode(this.isDirectDebitEnabled);
        int hashCode9 = java.lang.Boolean.hashCode(this.isDirectDepositInfoExpanded);
        int hashCode10 = java.lang.Boolean.hashCode(this.isDirectDebitInfoExpanded);
        java.lang.String str = this.error;
        int hashCode11 = str == null ? 0 : str.hashCode();
        int hashCode12 = this.errorType.hashCode();
        int hashCode13 = java.lang.Boolean.hashCode(this.showErrorScreen);
        int hashCode14 = java.lang.Boolean.hashCode(this.showIntroScreen);
        java.lang.String str2 = this.toastMessage;
        int hashCode15 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.toastMessageResId;
        int hashCode16 = num == null ? 0 : num.hashCode();
        int hashCode17 = java.lang.Integer.hashCode(this.retryCount);
        int hashCode18 = java.lang.Boolean.hashCode(this.isFillOutFormEnabled);
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences = this.smartRoutePreferences;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + (smartRoutePreferences != null ? smartRoutePreferences.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.directDebitErrorRetryCount)) * 31) + java.lang.Boolean.hashCode(this.showDirectDebitErrorHalfSheet)) * 31) + java.lang.Integer.hashCode(this.atomicSetupErrorRetryCount)) * 31) + java.lang.Boolean.hashCode(this.showAtomicSetupErrorHalfSheet)) * 31) + java.lang.Integer.hashCode(this.linkAccountErrorRetryCount)) * 31) + java.lang.Boolean.hashCode(this.showLinkAccountErrorHalfSheet)) * 31) + java.lang.Integer.hashCode(this.smartRoutePreferencesErrorRetryCount)) * 31) + java.lang.Boolean.hashCode(this.showSmartRoutePreferencesErrorHalfSheet);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState = (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) other;
        return this.isLoading == directDepositUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.accountNumber, directDepositUiState.accountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedAccountNumber, directDepositUiState.maskedAccountNumber) && this.isAccountNumberVisible == directDepositUiState.isAccountNumberVisible && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, directDepositUiState.routingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, directDepositUiState.bankName) && this.directDebitStatus == directDepositUiState.directDebitStatus && this.isDirectDebitEnabled == directDepositUiState.isDirectDebitEnabled && this.isDirectDepositInfoExpanded == directDepositUiState.isDirectDepositInfoExpanded && this.isDirectDebitInfoExpanded == directDepositUiState.isDirectDebitInfoExpanded && kotlin.jvm.internal.Intrinsics.areEqual(this.error, directDepositUiState.error) && this.errorType == directDepositUiState.errorType && this.showErrorScreen == directDepositUiState.showErrorScreen && this.showIntroScreen == directDepositUiState.showIntroScreen && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, directDepositUiState.toastMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessageResId, directDepositUiState.toastMessageResId) && this.retryCount == directDepositUiState.retryCount && this.isFillOutFormEnabled == directDepositUiState.isFillOutFormEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.smartRoutePreferences, directDepositUiState.smartRoutePreferences) && this.directDebitErrorRetryCount == directDepositUiState.directDebitErrorRetryCount && this.showDirectDebitErrorHalfSheet == directDepositUiState.showDirectDebitErrorHalfSheet && this.atomicSetupErrorRetryCount == directDepositUiState.atomicSetupErrorRetryCount && this.showAtomicSetupErrorHalfSheet == directDepositUiState.showAtomicSetupErrorHalfSheet && this.linkAccountErrorRetryCount == directDepositUiState.linkAccountErrorRetryCount && this.showLinkAccountErrorHalfSheet == directDepositUiState.showLinkAccountErrorHalfSheet && this.smartRoutePreferencesErrorRetryCount == directDepositUiState.smartRoutePreferencesErrorRetryCount && this.showSmartRoutePreferencesErrorHalfSheet == directDepositUiState.showSmartRoutePreferencesErrorHalfSheet;
    }

    public final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy(boolean isLoading, java.lang.String accountNumber, java.lang.String maskedAccountNumber, boolean isAccountNumberVisible, java.lang.String routingNumber, java.lang.String bankName, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus directDebitStatus, boolean isDirectDebitEnabled, boolean isDirectDepositInfoExpanded, boolean isDirectDebitInfoExpanded, java.lang.String error, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType, boolean showErrorScreen, boolean showIntroScreen, java.lang.String toastMessage, java.lang.Integer toastMessageResId, int retryCount, boolean isFillOutFormEnabled, com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences, int directDebitErrorRetryCount, boolean showDirectDebitErrorHalfSheet, int atomicSetupErrorRetryCount, boolean showAtomicSetupErrorHalfSheet, int linkAccountErrorRetryCount, boolean showLinkAccountErrorHalfSheet, int smartRoutePreferencesErrorRetryCount, boolean showSmartRoutePreferencesErrorHalfSheet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedAccountNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDebitStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        return new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState(isLoading, accountNumber, maskedAccountNumber, isAccountNumberVisible, routingNumber, bankName, directDebitStatus, isDirectDebitEnabled, isDirectDepositInfoExpanded, isDirectDebitInfoExpanded, error, errorType, showErrorScreen, showIntroScreen, toastMessage, toastMessageResId, retryCount, isFillOutFormEnabled, smartRoutePreferences, directDebitErrorRetryCount, showDirectDebitErrorHalfSheet, atomicSetupErrorRetryCount, showAtomicSetupErrorHalfSheet, linkAccountErrorRetryCount, showLinkAccountErrorHalfSheet, smartRoutePreferencesErrorRetryCount, showSmartRoutePreferencesErrorHalfSheet);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsDirectDepositInfoExpanded() {
        return this.isDirectDepositInfoExpanded;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsDirectDebitEnabled() {
        return this.isDirectDebitEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus getDirectDebitStatus() {
        return this.directDebitStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getBankName() {
        return this.bankName;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getRoutingNumber() {
        return this.routingNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAccountNumberVisible() {
        return this.isAccountNumberVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMaskedAccountNumber() {
        return this.maskedAccountNumber;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getShowSmartRoutePreferencesErrorHalfSheet() {
        return this.showSmartRoutePreferencesErrorHalfSheet;
    }

    /* renamed from: component26, reason: from getter */
    public final int getSmartRoutePreferencesErrorRetryCount() {
        return this.smartRoutePreferencesErrorRetryCount;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getShowLinkAccountErrorHalfSheet() {
        return this.showLinkAccountErrorHalfSheet;
    }

    /* renamed from: component24, reason: from getter */
    public final int getLinkAccountErrorRetryCount() {
        return this.linkAccountErrorRetryCount;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getShowAtomicSetupErrorHalfSheet() {
        return this.showAtomicSetupErrorHalfSheet;
    }

    /* renamed from: component22, reason: from getter */
    public final int getAtomicSetupErrorRetryCount() {
        return this.atomicSetupErrorRetryCount;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getShowDirectDebitErrorHalfSheet() {
        return this.showDirectDebitErrorHalfSheet;
    }

    /* renamed from: component20, reason: from getter */
    public final int getDirectDebitErrorRetryCount() {
        return this.directDebitErrorRetryCount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component19, reason: from getter */
    public final com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences getSmartRoutePreferences() {
        return this.smartRoutePreferences;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsFillOutFormEnabled() {
        return this.isFillOutFormEnabled;
    }

    /* renamed from: component17, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component16, reason: from getter */
    public final java.lang.Integer getToastMessageResId() {
        return this.toastMessageResId;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getToastMessage() {
        return this.toastMessage;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowIntroScreen() {
        return this.showIntroScreen;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowErrorScreen() {
        return this.showErrorScreen;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType getErrorType() {
        return this.errorType;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getError() {
        return this.error;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsDirectDebitInfoExpanded() {
        return this.isDirectDebitInfoExpanded;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public DirectDepositUiState() {
        this(false, null, null, false, null, null, null, false, false, false, null, null, false, false, null, null, 0, false, null, 0, false, 0, false, 0, false, 0, false, 134217727, null);
    }
}
