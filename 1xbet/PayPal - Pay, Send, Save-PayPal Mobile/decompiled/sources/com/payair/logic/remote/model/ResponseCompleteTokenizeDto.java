package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001:\u0003()*B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0012"}, d2 = {"Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto;", "Lcom/payair/hce/communication/JsonResponse;", "", "networkTokenReference", "Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$ProductConfigDto;", "productConfig", "Lcom/payair/model/TokenStatus;", "status", "", "Lcom/payair/logic/remote/model/AuthenticationMethodDto;", "authenticationMethods", "<init>", "(Ljava/lang/String;Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$ProductConfigDto;Lcom/payair/model/TokenStatus;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$ProductConfigDto;", "component3", "()Lcom/payair/model/TokenStatus;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$ProductConfigDto;Lcom/payair/model/TokenStatus;Ljava/util/List;)Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAuthenticationMethods", "Ljava/lang/String;", "getNetworkTokenReference", "Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$ProductConfigDto;", "getProductConfig", "Lcom/payair/model/TokenStatus;", "getStatus", "MobileAppActivationParametersDto", "OpenMobileAppParametersDto", "ProductConfigDto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ResponseCompleteTokenizeDto extends com.payair.hce.communication.JsonResponse {
    private final java.util.List<com.payair.logic.remote.model.AuthenticationMethodDto> authenticationMethods;
    private final java.lang.String networkTokenReference;
    private final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfig;
    private final com.payair.model.TokenStatus status;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00020\u0001B«\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010!J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010!J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010!J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010!J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010!J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010!J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010!J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010!J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010!J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010!J´\u0002\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00112\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bD\u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bG\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bH\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bI\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bJ\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bK\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bL\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bM\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bN\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bO\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bP\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bQ\u0010!R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bR\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bS\u0010!R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\b\u0012\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bU\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bW\u0010+R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010E\u001a\u0004\bX\u0010!R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bY\u0010!R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bZ\u0010!R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\b[\u0010!R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\b\\\u0010!R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010E\u001a\u0004\b]\u0010!R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\b^\u0010!R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010E\u001a\u0004\b_\u0010!"}, d2 = {"Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$ProductConfigDto;", "", "", "backgroundColor", "bankAppName", "brandLogoAssetId", "cardBackgroundAssetId", "cardBackgroundCombinedAssetId", "coBrandLogoAssetId", "coBrandName", "contactName", "contactWebsite", "customerServiceEmail", "customerServicePhoneNr", "customerServiceUrl", "foregroundColor", "iconAssetId", "", "isCoBranded", "issuerLogoAssetId", "Lcom/payair/logic/remote/model/IssuerMobileAppDto;", "issuerMobileApp", "issuerName", "issuerProductConfigCode", "labelColor", "longDescription", "onlineBankingLoginUrl", "privacyPolicyUrl", "shortDescription", "termsAndConditionsUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/payair/logic/remote/model/IssuerMobileAppDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component10", "component11", "component12", "component13", "component14", "component15", "()Z", "component16", "component17", "()Lcom/payair/logic/remote/model/IssuerMobileAppDto;", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/payair/logic/remote/model/IssuerMobileAppDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$ProductConfigDto;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBackgroundColor", "getBankAppName", "getBrandLogoAssetId", "getCardBackgroundAssetId", "getCardBackgroundCombinedAssetId", "getCoBrandLogoAssetId", "getCoBrandName", "getContactName", "getContactWebsite", "getCustomerServiceEmail", "getCustomerServicePhoneNr", "getCustomerServiceUrl", "getForegroundColor", "getIconAssetId", "Z", "getIssuerLogoAssetId", "Lcom/payair/logic/remote/model/IssuerMobileAppDto;", "getIssuerMobileApp", "getIssuerName", "getIssuerProductConfigCode", "getLabelColor", "getLongDescription", "getOnlineBankingLoginUrl", "getPrivacyPolicyUrl", "getShortDescription", "getTermsAndConditionsUrl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProductConfigDto {
        private final java.lang.String backgroundColor;
        private final java.lang.String bankAppName;
        private final java.lang.String brandLogoAssetId;
        private final java.lang.String cardBackgroundAssetId;
        private final java.lang.String cardBackgroundCombinedAssetId;
        private final java.lang.String coBrandLogoAssetId;
        private final java.lang.String coBrandName;
        private final java.lang.String contactName;
        private final java.lang.String contactWebsite;
        private final java.lang.String customerServiceEmail;
        private final java.lang.String customerServicePhoneNr;
        private final java.lang.String customerServiceUrl;
        private final java.lang.String foregroundColor;
        private final java.lang.String iconAssetId;
        private final boolean isCoBranded;
        private final java.lang.String issuerLogoAssetId;
        private final com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileApp;
        private final java.lang.String issuerName;
        private final java.lang.String issuerProductConfigCode;
        private final java.lang.String labelColor;
        private final java.lang.String longDescription;
        private final java.lang.String onlineBankingLoginUrl;
        private final java.lang.String privacyPolicyUrl;
        private final java.lang.String shortDescription;
        private final java.lang.String termsAndConditionsUrl;

        public ProductConfigDto() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 33554431, null);
        }

        public final java.lang.String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final java.lang.String getBankAppName() {
            return this.bankAppName;
        }

        public final java.lang.String getBrandLogoAssetId() {
            return this.brandLogoAssetId;
        }

        public final java.lang.String getCardBackgroundAssetId() {
            return this.cardBackgroundAssetId;
        }

        public final java.lang.String getCardBackgroundCombinedAssetId() {
            return this.cardBackgroundCombinedAssetId;
        }

        public final java.lang.String getCoBrandLogoAssetId() {
            return this.coBrandLogoAssetId;
        }

        public final java.lang.String getCoBrandName() {
            return this.coBrandName;
        }

        public final java.lang.String getContactName() {
            return this.contactName;
        }

        public final java.lang.String getContactWebsite() {
            return this.contactWebsite;
        }

        public final java.lang.String getCustomerServiceEmail() {
            return this.customerServiceEmail;
        }

        public final java.lang.String getCustomerServicePhoneNr() {
            return this.customerServicePhoneNr;
        }

        public final java.lang.String getCustomerServiceUrl() {
            return this.customerServiceUrl;
        }

        public final java.lang.String getForegroundColor() {
            return this.foregroundColor;
        }

        public final java.lang.String getIconAssetId() {
            return this.iconAssetId;
        }

        public final java.lang.String getIssuerLogoAssetId() {
            return this.issuerLogoAssetId;
        }

        public final com.payair.logic.remote.model.IssuerMobileAppDto getIssuerMobileApp() {
            return this.issuerMobileApp;
        }

        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public final java.lang.String getIssuerProductConfigCode() {
            return this.issuerProductConfigCode;
        }

        public final java.lang.String getLabelColor() {
            return this.labelColor;
        }

        public final java.lang.String getLongDescription() {
            return this.longDescription;
        }

        public final java.lang.String getOnlineBankingLoginUrl() {
            return this.onlineBankingLoginUrl;
        }

        public final java.lang.String getPrivacyPolicyUrl() {
            return this.privacyPolicyUrl;
        }

        public final java.lang.String getShortDescription() {
            return this.shortDescription;
        }

        public final java.lang.String getTermsAndConditionsUrl() {
            return this.termsAndConditionsUrl;
        }

        public final int hashCode() {
            java.lang.String str = this.backgroundColor;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.bankAppName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.brandLogoAssetId;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.cardBackgroundAssetId;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.cardBackgroundCombinedAssetId;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.coBrandLogoAssetId;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.coBrandName;
            int hashCode7 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.contactName;
            int hashCode8 = str8 == null ? 0 : str8.hashCode();
            java.lang.String str9 = this.contactWebsite;
            int hashCode9 = str9 == null ? 0 : str9.hashCode();
            java.lang.String str10 = this.customerServiceEmail;
            int hashCode10 = str10 == null ? 0 : str10.hashCode();
            java.lang.String str11 = this.customerServicePhoneNr;
            int hashCode11 = str11 == null ? 0 : str11.hashCode();
            java.lang.String str12 = this.customerServiceUrl;
            int a2 = com.payair.csdk.w3.a(this.foregroundColor, ((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str12 == null ? 0 : str12.hashCode())) * 31, 31);
            java.lang.String str13 = this.iconAssetId;
            int hashCode12 = str13 == null ? 0 : str13.hashCode();
            int hashCode13 = java.lang.Boolean.hashCode(this.isCoBranded);
            java.lang.String str14 = this.issuerLogoAssetId;
            int hashCode14 = str14 == null ? 0 : str14.hashCode();
            com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto = this.issuerMobileApp;
            int a3 = com.payair.csdk.w3.a(this.issuerName, (((((hashCode13 + ((a2 + hashCode12) * 31)) * 31) + hashCode14) * 31) + (issuerMobileAppDto == null ? 0 : issuerMobileAppDto.hashCode())) * 31, 31);
            java.lang.String str15 = this.issuerProductConfigCode;
            int hashCode15 = str15 == null ? 0 : str15.hashCode();
            java.lang.String str16 = this.labelColor;
            int hashCode16 = str16 == null ? 0 : str16.hashCode();
            java.lang.String str17 = this.longDescription;
            int hashCode17 = str17 == null ? 0 : str17.hashCode();
            java.lang.String str18 = this.onlineBankingLoginUrl;
            int hashCode18 = str18 == null ? 0 : str18.hashCode();
            java.lang.String str19 = this.privacyPolicyUrl;
            int a4 = com.payair.csdk.w3.a(this.shortDescription, (((((((((a3 + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + (str19 == null ? 0 : str19.hashCode())) * 31, 31);
            java.lang.String str20 = this.termsAndConditionsUrl;
            return a4 + (str20 != null ? str20.hashCode() : 0);
        }

        public final boolean isCoBranded() {
            return this.isCoBranded;
        }

        public ProductConfigDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, boolean z, java.lang.String str15, com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, java.lang.String str22, java.lang.String str23) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str22, "");
            this.backgroundColor = str;
            this.bankAppName = str2;
            this.brandLogoAssetId = str3;
            this.cardBackgroundAssetId = str4;
            this.cardBackgroundCombinedAssetId = str5;
            this.coBrandLogoAssetId = str6;
            this.coBrandName = str7;
            this.contactName = str8;
            this.contactWebsite = str9;
            this.customerServiceEmail = str10;
            this.customerServicePhoneNr = str11;
            this.customerServiceUrl = str12;
            this.foregroundColor = str13;
            this.iconAssetId = str14;
            this.isCoBranded = z;
            this.issuerLogoAssetId = str15;
            this.issuerMobileApp = issuerMobileAppDto;
            this.issuerName = str16;
            this.issuerProductConfigCode = str17;
            this.labelColor = str18;
            this.longDescription = str19;
            this.onlineBankingLoginUrl = str20;
            this.privacyPolicyUrl = str21;
            this.shortDescription = str22;
            this.termsAndConditionsUrl = str23;
        }

        public /* synthetic */ ProductConfigDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, boolean z, java.lang.String str15, com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, java.lang.String str22, java.lang.String str23, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? false : z, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : issuerMobileAppDto, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? "" : str22, (i & 16777216) != 0 ? null : str23);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.backgroundColor;
            java.lang.String str2 = this.bankAppName;
            java.lang.String str3 = this.brandLogoAssetId;
            java.lang.String str4 = this.cardBackgroundAssetId;
            java.lang.String str5 = this.cardBackgroundCombinedAssetId;
            java.lang.String str6 = this.coBrandLogoAssetId;
            java.lang.String str7 = this.coBrandName;
            java.lang.String str8 = this.contactName;
            java.lang.String str9 = this.contactWebsite;
            java.lang.String str10 = this.customerServiceEmail;
            java.lang.String str11 = this.customerServicePhoneNr;
            java.lang.String str12 = this.customerServiceUrl;
            java.lang.String str13 = this.foregroundColor;
            java.lang.String str14 = this.iconAssetId;
            boolean z = this.isCoBranded;
            java.lang.String str15 = this.issuerLogoAssetId;
            com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto = this.issuerMobileApp;
            java.lang.String str16 = this.issuerName;
            java.lang.String str17 = this.issuerProductConfigCode;
            java.lang.String str18 = this.labelColor;
            java.lang.String str19 = this.longDescription;
            java.lang.String str20 = this.onlineBankingLoginUrl;
            java.lang.String str21 = this.privacyPolicyUrl;
            java.lang.String str22 = this.shortDescription;
            java.lang.String str23 = this.termsAndConditionsUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductConfigDto(backgroundColor=");
            sb.append(str);
            sb.append(", bankAppName=");
            sb.append(str2);
            sb.append(", brandLogoAssetId=");
            sb.append(str3);
            sb.append(", cardBackgroundAssetId=");
            sb.append(str4);
            sb.append(", cardBackgroundCombinedAssetId=");
            sb.append(str5);
            sb.append(", coBrandLogoAssetId=");
            sb.append(str6);
            sb.append(", coBrandName=");
            sb.append(str7);
            sb.append(", contactName=");
            sb.append(str8);
            sb.append(", contactWebsite=");
            sb.append(str9);
            sb.append(", customerServiceEmail=");
            sb.append(str10);
            sb.append(", customerServicePhoneNr=");
            sb.append(str11);
            sb.append(", customerServiceUrl=");
            sb.append(str12);
            sb.append(", foregroundColor=");
            sb.append(str13);
            sb.append(", iconAssetId=");
            sb.append(str14);
            sb.append(", isCoBranded=");
            sb.append(z);
            sb.append(", issuerLogoAssetId=");
            sb.append(str15);
            sb.append(", issuerMobileApp=");
            sb.append(issuerMobileAppDto);
            sb.append(", issuerName=");
            sb.append(str16);
            sb.append(", issuerProductConfigCode=");
            sb.append(str17);
            sb.append(", labelColor=");
            sb.append(str18);
            sb.append(", longDescription=");
            sb.append(str19);
            sb.append(", onlineBankingLoginUrl=");
            sb.append(str20);
            sb.append(", privacyPolicyUrl=");
            sb.append(str21);
            sb.append(", shortDescription=");
            sb.append(str22);
            sb.append(", termsAndConditionsUrl=");
            sb.append(str23);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto)) {
                return false;
            }
            com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfigDto = (com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundColor, productConfigDto.backgroundColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAppName, productConfigDto.bankAppName) && kotlin.jvm.internal.Intrinsics.areEqual(this.brandLogoAssetId, productConfigDto.brandLogoAssetId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardBackgroundAssetId, productConfigDto.cardBackgroundAssetId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardBackgroundCombinedAssetId, productConfigDto.cardBackgroundCombinedAssetId) && kotlin.jvm.internal.Intrinsics.areEqual(this.coBrandLogoAssetId, productConfigDto.coBrandLogoAssetId) && kotlin.jvm.internal.Intrinsics.areEqual(this.coBrandName, productConfigDto.coBrandName) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactName, productConfigDto.contactName) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactWebsite, productConfigDto.contactWebsite) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerServiceEmail, productConfigDto.customerServiceEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerServicePhoneNr, productConfigDto.customerServicePhoneNr) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerServiceUrl, productConfigDto.customerServiceUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.foregroundColor, productConfigDto.foregroundColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconAssetId, productConfigDto.iconAssetId) && this.isCoBranded == productConfigDto.isCoBranded && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerLogoAssetId, productConfigDto.issuerLogoAssetId) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerMobileApp, productConfigDto.issuerMobileApp) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, productConfigDto.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerProductConfigCode, productConfigDto.issuerProductConfigCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelColor, productConfigDto.labelColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.longDescription, productConfigDto.longDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.onlineBankingLoginUrl, productConfigDto.onlineBankingLoginUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacyPolicyUrl, productConfigDto.privacyPolicyUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.shortDescription, productConfigDto.shortDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsAndConditionsUrl, productConfigDto.termsAndConditionsUrl);
        }

        public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto copy(java.lang.String backgroundColor, java.lang.String bankAppName, java.lang.String brandLogoAssetId, java.lang.String cardBackgroundAssetId, java.lang.String cardBackgroundCombinedAssetId, java.lang.String coBrandLogoAssetId, java.lang.String coBrandName, java.lang.String contactName, java.lang.String contactWebsite, java.lang.String customerServiceEmail, java.lang.String customerServicePhoneNr, java.lang.String customerServiceUrl, java.lang.String foregroundColor, java.lang.String iconAssetId, boolean isCoBranded, java.lang.String issuerLogoAssetId, com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileApp, java.lang.String issuerName, java.lang.String issuerProductConfigCode, java.lang.String labelColor, java.lang.String longDescription, java.lang.String onlineBankingLoginUrl, java.lang.String privacyPolicyUrl, java.lang.String shortDescription, java.lang.String termsAndConditionsUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(foregroundColor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shortDescription, "");
            return new com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto(backgroundColor, bankAppName, brandLogoAssetId, cardBackgroundAssetId, cardBackgroundCombinedAssetId, coBrandLogoAssetId, coBrandName, contactName, contactWebsite, customerServiceEmail, customerServicePhoneNr, customerServiceUrl, foregroundColor, iconAssetId, isCoBranded, issuerLogoAssetId, issuerMobileApp, issuerName, issuerProductConfigCode, labelColor, longDescription, onlineBankingLoginUrl, privacyPolicyUrl, shortDescription, termsAndConditionsUrl);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getContactWebsite() {
            return this.contactWebsite;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getContactName() {
            return this.contactName;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getCoBrandName() {
            return this.coBrandName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getCoBrandLogoAssetId() {
            return this.coBrandLogoAssetId;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCardBackgroundCombinedAssetId() {
            return this.cardBackgroundCombinedAssetId;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCardBackgroundAssetId() {
            return this.cardBackgroundAssetId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBrandLogoAssetId() {
            return this.brandLogoAssetId;
        }

        /* renamed from: component25, reason: from getter */
        public final java.lang.String getTermsAndConditionsUrl() {
            return this.termsAndConditionsUrl;
        }

        /* renamed from: component24, reason: from getter */
        public final java.lang.String getShortDescription() {
            return this.shortDescription;
        }

        /* renamed from: component23, reason: from getter */
        public final java.lang.String getPrivacyPolicyUrl() {
            return this.privacyPolicyUrl;
        }

        /* renamed from: component22, reason: from getter */
        public final java.lang.String getOnlineBankingLoginUrl() {
            return this.onlineBankingLoginUrl;
        }

        /* renamed from: component21, reason: from getter */
        public final java.lang.String getLongDescription() {
            return this.longDescription;
        }

        /* renamed from: component20, reason: from getter */
        public final java.lang.String getLabelColor() {
            return this.labelColor;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBankAppName() {
            return this.bankAppName;
        }

        /* renamed from: component19, reason: from getter */
        public final java.lang.String getIssuerProductConfigCode() {
            return this.issuerProductConfigCode;
        }

        /* renamed from: component18, reason: from getter */
        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        /* renamed from: component17, reason: from getter */
        public final com.payair.logic.remote.model.IssuerMobileAppDto getIssuerMobileApp() {
            return this.issuerMobileApp;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.String getIssuerLogoAssetId() {
            return this.issuerLogoAssetId;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getIsCoBranded() {
            return this.isCoBranded;
        }

        /* renamed from: component14, reason: from getter */
        public final java.lang.String getIconAssetId() {
            return this.iconAssetId;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getForegroundColor() {
            return this.foregroundColor;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getCustomerServiceUrl() {
            return this.customerServiceUrl;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getCustomerServicePhoneNr() {
            return this.customerServicePhoneNr;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getCustomerServiceEmail() {
            return this.customerServiceEmail;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBackgroundColor() {
            return this.backgroundColor;
        }
    }

    public ResponseCompleteTokenizeDto() {
        this(null, null, null, null, 15, null);
    }

    public final java.util.List<com.payair.logic.remote.model.AuthenticationMethodDto> getAuthenticationMethods() {
        return this.authenticationMethods;
    }

    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto getProductConfig() {
        return this.productConfig;
    }

    public final com.payair.model.TokenStatus getStatus() {
        return this.status;
    }

    public /* synthetic */ ResponseCompleteTokenizeDto(java.lang.String str, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfigDto, com.payair.model.TokenStatus tokenStatus, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : productConfigDto, (i & 4) != 0 ? com.payair.model.TokenStatus.UNKNOWN : tokenStatus, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public ResponseCompleteTokenizeDto(java.lang.String str, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfigDto, com.payair.model.TokenStatus tokenStatus, java.util.List<com.payair.logic.remote.model.AuthenticationMethodDto> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.networkTokenReference = str;
        this.productConfig = productConfigDto;
        this.status = tokenStatus;
        this.authenticationMethods = list;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$MobileAppActivationParametersDto;", "", "", "paymentAppProviderId", "paymentAppInstanceId", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "accountPanSuffix", "accountExpiry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$MobileAppActivationParametersDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountExpiry", "getAccountPanSuffix", "getPaymentAppInstanceId", "getPaymentAppProviderId", "getTokenUniqueReference"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MobileAppActivationParametersDto {
        private final java.lang.String accountExpiry;
        private final java.lang.String accountPanSuffix;
        private final java.lang.String paymentAppInstanceId;
        private final java.lang.String paymentAppProviderId;
        private final java.lang.String tokenUniqueReference;

        public MobileAppActivationParametersDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.paymentAppProviderId = str;
            this.paymentAppInstanceId = str2;
            this.tokenUniqueReference = str3;
            this.accountPanSuffix = str4;
            this.accountExpiry = str5;
        }

        public final java.lang.String getAccountExpiry() {
            return this.accountExpiry;
        }

        public final java.lang.String getAccountPanSuffix() {
            return this.accountPanSuffix;
        }

        public final java.lang.String getPaymentAppInstanceId() {
            return this.paymentAppInstanceId;
        }

        public final java.lang.String getPaymentAppProviderId() {
            return this.paymentAppProviderId;
        }

        public final java.lang.String getTokenUniqueReference() {
            return this.tokenUniqueReference;
        }

        public final int hashCode() {
            return this.accountExpiry.hashCode() + com.payair.csdk.w3.a(this.accountPanSuffix, com.payair.csdk.w3.a(this.tokenUniqueReference, com.payair.csdk.w3.a(this.paymentAppInstanceId, this.paymentAppProviderId.hashCode() * 31, 31), 31), 31);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.paymentAppProviderId;
            java.lang.String str2 = this.paymentAppInstanceId;
            java.lang.String str3 = this.tokenUniqueReference;
            java.lang.String str4 = this.accountPanSuffix;
            java.lang.String str5 = this.accountExpiry;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileAppActivationParametersDto(paymentAppProviderId=");
            sb.append(str);
            sb.append(", paymentAppInstanceId=");
            sb.append(str2);
            sb.append(", tokenUniqueReference=");
            sb.append(str3);
            sb.append(", accountPanSuffix=");
            sb.append(str4);
            sb.append(", accountExpiry=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto)) {
                return false;
            }
            com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto mobileAppActivationParametersDto = (com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAppProviderId, mobileAppActivationParametersDto.paymentAppProviderId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAppInstanceId, mobileAppActivationParametersDto.paymentAppInstanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenUniqueReference, mobileAppActivationParametersDto.tokenUniqueReference) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountPanSuffix, mobileAppActivationParametersDto.accountPanSuffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountExpiry, mobileAppActivationParametersDto.accountExpiry);
        }

        public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto copy(java.lang.String paymentAppProviderId, java.lang.String paymentAppInstanceId, java.lang.String tokenUniqueReference, java.lang.String accountPanSuffix, java.lang.String accountExpiry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppProviderId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountPanSuffix, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountExpiry, "");
            return new com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto(paymentAppProviderId, paymentAppInstanceId, tokenUniqueReference, accountPanSuffix, accountExpiry);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAccountExpiry() {
            return this.accountExpiry;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAccountPanSuffix() {
            return this.accountPanSuffix;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTokenUniqueReference() {
            return this.tokenUniqueReference;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPaymentAppInstanceId() {
            return this.paymentAppInstanceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPaymentAppProviderId() {
            return this.paymentAppProviderId;
        }

        public static /* synthetic */ com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto copy$default(com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto mobileAppActivationParametersDto, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = mobileAppActivationParametersDto.paymentAppProviderId;
            }
            if ((i & 2) != 0) {
                str2 = mobileAppActivationParametersDto.paymentAppInstanceId;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = mobileAppActivationParametersDto.tokenUniqueReference;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = mobileAppActivationParametersDto.accountPanSuffix;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = mobileAppActivationParametersDto.accountExpiry;
            }
            return mobileAppActivationParametersDto.copy(str, str6, str7, str8, str5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$OpenMobileAppParametersDto;", "", "", "paymentAppProviderId", "paymentAppId", "paymentAppInstanceId", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$OpenMobileAppParametersDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentAppId", "getPaymentAppInstanceId", "getPaymentAppProviderId", "getTokenUniqueReference"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMobileAppParametersDto {
        private final java.lang.String paymentAppId;
        private final java.lang.String paymentAppInstanceId;
        private final java.lang.String paymentAppProviderId;
        private final java.lang.String tokenUniqueReference;

        public OpenMobileAppParametersDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.paymentAppProviderId = str;
            this.paymentAppId = str2;
            this.paymentAppInstanceId = str3;
            this.tokenUniqueReference = str4;
        }

        public final java.lang.String getPaymentAppId() {
            return this.paymentAppId;
        }

        public final java.lang.String getPaymentAppInstanceId() {
            return this.paymentAppInstanceId;
        }

        public final java.lang.String getPaymentAppProviderId() {
            return this.paymentAppProviderId;
        }

        public final java.lang.String getTokenUniqueReference() {
            return this.tokenUniqueReference;
        }

        public final int hashCode() {
            return this.tokenUniqueReference.hashCode() + com.payair.csdk.w3.a(this.paymentAppInstanceId, com.payair.csdk.w3.a(this.paymentAppId, this.paymentAppProviderId.hashCode() * 31, 31), 31);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.paymentAppProviderId;
            java.lang.String str2 = this.paymentAppId;
            java.lang.String str3 = this.paymentAppInstanceId;
            java.lang.String str4 = this.tokenUniqueReference;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenMobileAppParametersDto(paymentAppProviderId=");
            sb.append(str);
            sb.append(", paymentAppId=");
            sb.append(str2);
            sb.append(", paymentAppInstanceId=");
            sb.append(str3);
            sb.append(", tokenUniqueReference=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto)) {
                return false;
            }
            com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto openMobileAppParametersDto = (com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAppProviderId, openMobileAppParametersDto.paymentAppProviderId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAppId, openMobileAppParametersDto.paymentAppId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAppInstanceId, openMobileAppParametersDto.paymentAppInstanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenUniqueReference, openMobileAppParametersDto.tokenUniqueReference);
        }

        public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto copy(java.lang.String paymentAppProviderId, java.lang.String paymentAppId, java.lang.String paymentAppInstanceId, java.lang.String tokenUniqueReference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppProviderId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
            return new com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto(paymentAppProviderId, paymentAppId, paymentAppInstanceId, tokenUniqueReference);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getTokenUniqueReference() {
            return this.tokenUniqueReference;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPaymentAppInstanceId() {
            return this.paymentAppInstanceId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPaymentAppId() {
            return this.paymentAppId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPaymentAppProviderId() {
            return this.paymentAppProviderId;
        }

        public static /* synthetic */ com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto copy$default(com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto openMobileAppParametersDto, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openMobileAppParametersDto.paymentAppProviderId;
            }
            if ((i & 2) != 0) {
                str2 = openMobileAppParametersDto.paymentAppId;
            }
            if ((i & 4) != 0) {
                str3 = openMobileAppParametersDto.paymentAppInstanceId;
            }
            if ((i & 8) != 0) {
                str4 = openMobileAppParametersDto.tokenUniqueReference;
            }
            return openMobileAppParametersDto.copy(str, str2, str3, str4);
        }
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        java.lang.String str = this.networkTokenReference;
        com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfigDto = this.productConfig;
        com.payair.model.TokenStatus tokenStatus = this.status;
        java.util.List<com.payair.logic.remote.model.AuthenticationMethodDto> list = this.authenticationMethods;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseCompleteTokenizeDto(networkTokenReference=");
        sb.append(str);
        sb.append(", productConfig=");
        sb.append(productConfigDto);
        sb.append(", status=");
        sb.append(tokenStatus);
        sb.append(", authenticationMethods=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.networkTokenReference.hashCode();
        com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfigDto = this.productConfig;
        int hashCode2 = productConfigDto == null ? 0 : productConfigDto.hashCode();
        com.payair.model.TokenStatus tokenStatus = this.status;
        int hashCode3 = tokenStatus == null ? 0 : tokenStatus.hashCode();
        java.util.List<com.payair.logic.remote.model.AuthenticationMethodDto> list = this.authenticationMethods;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.logic.remote.model.ResponseCompleteTokenizeDto)) {
            return false;
        }
        com.payair.logic.remote.model.ResponseCompleteTokenizeDto responseCompleteTokenizeDto = (com.payair.logic.remote.model.ResponseCompleteTokenizeDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.networkTokenReference, responseCompleteTokenizeDto.networkTokenReference) && kotlin.jvm.internal.Intrinsics.areEqual(this.productConfig, responseCompleteTokenizeDto.productConfig) && this.status == responseCompleteTokenizeDto.status && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationMethods, responseCompleteTokenizeDto.authenticationMethods);
    }

    public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto copy(java.lang.String networkTokenReference, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfig, com.payair.model.TokenStatus status, java.util.List<com.payair.logic.remote.model.AuthenticationMethodDto> authenticationMethods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return new com.payair.logic.remote.model.ResponseCompleteTokenizeDto(networkTokenReference, productConfig, status, authenticationMethods);
    }

    public final java.util.List<com.payair.logic.remote.model.AuthenticationMethodDto> component4() {
        return this.authenticationMethods;
    }

    /* renamed from: component3, reason: from getter */
    public final com.payair.model.TokenStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto getProductConfig() {
        return this.productConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.payair.logic.remote.model.ResponseCompleteTokenizeDto copy$default(com.payair.logic.remote.model.ResponseCompleteTokenizeDto responseCompleteTokenizeDto, java.lang.String str, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfigDto, com.payair.model.TokenStatus tokenStatus, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = responseCompleteTokenizeDto.networkTokenReference;
        }
        if ((i & 2) != 0) {
            productConfigDto = responseCompleteTokenizeDto.productConfig;
        }
        if ((i & 4) != 0) {
            tokenStatus = responseCompleteTokenizeDto.status;
        }
        if ((i & 8) != 0) {
            list = responseCompleteTokenizeDto.authenticationMethods;
        }
        return responseCompleteTokenizeDto.copy(str, productConfigDto, tokenStatus, list);
    }
}
