package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001bJ\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001bJ\u009c\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b\u0003\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b@\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010(R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010,R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\bM\u0010\u001bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\bN\u0010\u001bR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\bO\u0010\u001bR\u0013\u0010Q\u001a\u0004\u0018\u0001088G¢\u0006\u0006\u001a\u0004\bP\u0010:"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABUiState;", "", "", "isLoadingData", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "iabOfferDetails", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitDetails;", "benefitDetails", "showInterstitial", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDialog;", androidx.view.compose.DialogNavigator.NAME, "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabToolBarInfo;", "toolBarInfo", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabNavBarInfo;", "navBarInfo", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;", "bannerContent", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABConfig;", "webViewConfig", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDataError;", "dataError", "shouldDestroyWebView", "showContinueButton", "continueClicked", "<init>", "(ZLcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitDetails;ZLcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDialog;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabToolBarInfo;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabNavBarInfo;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABConfig;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDataError;ZZZ)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitDetails;", "component4", "component5", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDialog;", "component6", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabToolBarInfo;", "component7", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabNavBarInfo;", "component8", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;", "component9", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABConfig;", "component10", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDataError;", "component11", "component12", "component13", "copy", "(ZLcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitDetails;ZLcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDialog;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabToolBarInfo;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabNavBarInfo;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABConfig;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDataError;ZZZ)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "getIabOfferDetails", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitDetails;", "getBenefitDetails", "getShowInterstitial", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDialog;", "getDialog", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabToolBarInfo;", "getToolBarInfo", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabNavBarInfo;", "getNavBarInfo", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;", "getBannerContent", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABConfig;", "getWebViewConfig", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDataError;", "getDataError", "getShouldDestroyWebView", "getShowContinueButton", "getContinueClicked", "getInitialUrl", "initialUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ShoppingIABUiState {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContent;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails benefitDetails;
    private final boolean continueClicked;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDataError dataError;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDialog dialog;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails;
    private final boolean isLoadingData;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo navBarInfo;
    private final boolean shouldDestroyWebView;
    private final boolean showContinueButton;
    private final boolean showInterstitial;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo toolBarInfo;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig webViewConfig;

    public ShoppingIABUiState(boolean z, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails iabBenefitDetails, boolean z2, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDialog iabDialog, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo iabToolBarInfo, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo iabNavBarInfo, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig shoppingIABConfig, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDataError iabDataError, boolean z3, boolean z4, boolean z5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iabOfferDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iabBenefitDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingIABConfig, "");
        this.isLoadingData = z;
        this.iabOfferDetails = iabOfferDetails;
        this.benefitDetails = iabBenefitDetails;
        this.showInterstitial = z2;
        this.dialog = iabDialog;
        this.toolBarInfo = iabToolBarInfo;
        this.navBarInfo = iabNavBarInfo;
        this.bannerContent = bannerContentData;
        this.webViewConfig = shoppingIABConfig;
        this.dataError = iabDataError;
        this.shouldDestroyWebView = z3;
        this.showContinueButton = z4;
        this.continueClicked = z5;
    }

    public final boolean isLoadingData() {
        return this.isLoadingData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ShoppingIABUiState(boolean z, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails iabBenefitDetails, boolean z2, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDialog iabDialog, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo iabToolBarInfo, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo iabNavBarInfo, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig shoppingIABConfig, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDataError iabDataError, boolean z3, boolean z4, boolean z5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : iabDialog, (i & 32) != 0 ? null : iabToolBarInfo, (i & 64) != 0 ? null : iabNavBarInfo, (i & 128) != 0 ? null : bannerContentData, (i & 256) != 0 ? com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig.INSTANCE.defaultShoppingConfig() : shoppingIABConfig, (i & 512) == 0 ? iabDataError : null, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? false : z4, (i & 4096) == 0 ? z5 : false);
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails iabBenefitDetails2;
        boolean z6 = (i & 1) != 0 ? false : z;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails2 = (i & 2) != 0 ? new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails(null, null, null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.reader.TransactionCodes.SupportedScheme.ALL, null) : iabOfferDetails;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if ((i & 4) != 0) {
            iabBenefitDetails2 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            iabBenefitDetails2 = iabBenefitDetails;
        }
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails getIabOfferDetails() {
        return this.iabOfferDetails;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails getBenefitDetails() {
        return this.benefitDetails;
    }

    public final boolean getShowInterstitial() {
        return this.showInterstitial;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDialog getDialog() {
        return this.dialog;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo getToolBarInfo() {
        return this.toolBarInfo;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo getNavBarInfo() {
        return this.navBarInfo;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData getBannerContent() {
        return this.bannerContent;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig getWebViewConfig() {
        return this.webViewConfig;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDataError getDataError() {
        return this.dataError;
    }

    public final boolean getShouldDestroyWebView() {
        return this.shouldDestroyWebView;
    }

    public final boolean getShowContinueButton() {
        return this.showContinueButton;
    }

    public final boolean getContinueClicked() {
        return this.continueClicked;
    }

    public final java.lang.String getInitialUrl() {
        return this.iabOfferDetails.getUrl();
    }

    public final java.lang.String toString() {
        boolean z = this.isLoadingData;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails = this.iabOfferDetails;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails iabBenefitDetails = this.benefitDetails;
        boolean z2 = this.showInterstitial;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDialog iabDialog = this.dialog;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo iabToolBarInfo = this.toolBarInfo;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo iabNavBarInfo = this.navBarInfo;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData = this.bannerContent;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig shoppingIABConfig = this.webViewConfig;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDataError iabDataError = this.dataError;
        boolean z3 = this.shouldDestroyWebView;
        boolean z4 = this.showContinueButton;
        boolean z5 = this.continueClicked;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShoppingIABUiState(isLoadingData=");
        sb.append(z);
        sb.append(", iabOfferDetails=");
        sb.append(iabOfferDetails);
        sb.append(", benefitDetails=");
        sb.append(iabBenefitDetails);
        sb.append(", showInterstitial=");
        sb.append(z2);
        sb.append(", dialog=");
        sb.append(iabDialog);
        sb.append(", toolBarInfo=");
        sb.append(iabToolBarInfo);
        sb.append(", navBarInfo=");
        sb.append(iabNavBarInfo);
        sb.append(", bannerContent=");
        sb.append(bannerContentData);
        sb.append(", webViewConfig=");
        sb.append(shoppingIABConfig);
        sb.append(", dataError=");
        sb.append(iabDataError);
        sb.append(", shouldDestroyWebView=");
        sb.append(z3);
        sb.append(", showContinueButton=");
        sb.append(z4);
        sb.append(", continueClicked=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isLoadingData);
        int hashCode2 = this.iabOfferDetails.hashCode();
        int hashCode3 = this.benefitDetails.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.showInterstitial);
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDialog iabDialog = this.dialog;
        int hashCode5 = iabDialog == null ? 0 : iabDialog.hashCode();
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo iabToolBarInfo = this.toolBarInfo;
        int hashCode6 = iabToolBarInfo == null ? 0 : iabToolBarInfo.hashCode();
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo iabNavBarInfo = this.navBarInfo;
        int hashCode7 = iabNavBarInfo == null ? 0 : iabNavBarInfo.hashCode();
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData = this.bannerContent;
        int hashCode8 = bannerContentData == null ? 0 : bannerContentData.hashCode();
        int hashCode9 = this.webViewConfig.hashCode();
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDataError iabDataError = this.dataError;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (iabDataError != null ? iabDataError.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.shouldDestroyWebView)) * 31) + java.lang.Boolean.hashCode(this.showContinueButton)) * 31) + java.lang.Boolean.hashCode(this.continueClicked);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState shoppingIABUiState = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState) other;
        return this.isLoadingData == shoppingIABUiState.isLoadingData && kotlin.jvm.internal.Intrinsics.areEqual(this.iabOfferDetails, shoppingIABUiState.iabOfferDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitDetails, shoppingIABUiState.benefitDetails) && this.showInterstitial == shoppingIABUiState.showInterstitial && kotlin.jvm.internal.Intrinsics.areEqual(this.dialog, shoppingIABUiState.dialog) && kotlin.jvm.internal.Intrinsics.areEqual(this.toolBarInfo, shoppingIABUiState.toolBarInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.navBarInfo, shoppingIABUiState.navBarInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.bannerContent, shoppingIABUiState.bannerContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.webViewConfig, shoppingIABUiState.webViewConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataError, shoppingIABUiState.dataError) && this.shouldDestroyWebView == shoppingIABUiState.shouldDestroyWebView && this.showContinueButton == shoppingIABUiState.showContinueButton && this.continueClicked == shoppingIABUiState.continueClicked;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState copy(boolean isLoadingData, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails benefitDetails, boolean showInterstitial, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDialog dialog, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo toolBarInfo, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo navBarInfo, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContent, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig webViewConfig, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDataError dataError, boolean shouldDestroyWebView, boolean showContinueButton, boolean continueClicked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iabOfferDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewConfig, "");
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState(isLoadingData, iabOfferDetails, benefitDetails, showInterstitial, dialog, toolBarInfo, navBarInfo, bannerContent, webViewConfig, dataError, shouldDestroyWebView, showContinueButton, continueClicked);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig getWebViewConfig() {
        return this.webViewConfig;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData getBannerContent() {
        return this.bannerContent;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo getNavBarInfo() {
        return this.navBarInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo getToolBarInfo() {
        return this.toolBarInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDialog getDialog() {
        return this.dialog;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowInterstitial() {
        return this.showInterstitial;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails getBenefitDetails() {
        return this.benefitDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails getIabOfferDetails() {
        return this.iabOfferDetails;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getContinueClicked() {
        return this.continueClicked;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowContinueButton() {
        return this.showContinueButton;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShouldDestroyWebView() {
        return this.shouldDestroyWebView;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDataError getDataError() {
        return this.dataError;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoadingData() {
        return this.isLoadingData;
    }

    public ShoppingIABUiState() {
        this(false, null, null, false, null, null, null, null, null, null, false, false, false, 8191, null);
    }
}
