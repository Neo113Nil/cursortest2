package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00172\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0004\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "seen0", "typeName", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTypeName", "()Ljava/lang/String;", "Companion", "Valid", "AlreadyHandled", "NotProcessed", "Unknown", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$AlreadyHandled;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$NotProcessed;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Unknown;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class UniversalLinkData {
    public static final int $stable = 0;
    private final java.lang.String typeName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.m15447$r8$lambda$474WWmUTEegxjbm4MwN0DQ6MwY();
        }
    });

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private UniversalLinkData(java.lang.String str) {
        this.typeName = str;
    }

    public final java.lang.String getTypeName() {
        return this.typeName;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ¾\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b3\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b:\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b;\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b<\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b=\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b>\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b?\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b@\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bA\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bD\u0010\u001cR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bE\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\bF\u0010\u001cR\u0011\u0010H\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bG\u0010\u001cR\u0011\u0010I\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bI\u0010&R\u0011\u0010J\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bJ\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "Landroid/net/Uri;", "universalLink", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "checkoutToken", "", "source", "switchInitiatedTime", "buttonSessionId", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "merchant", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE, "tokenType", "referrerURL", "", "appSwitchEligible", "environment", "experiment", "merchantPath", "<init>", "(Landroid/net/Uri;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "component14", "component15", "copy", "(Landroid/net/Uri;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getUniversalLink", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "getCheckoutToken", "Ljava/lang/String;", "getSource", "getSwitchInitiatedTime", "getButtonSessionId", "getIntegrationType", "getMerchant", "getFlowType", "getFundingSource", "getTokenType", "getReferrerURL", "Z", "getAppSwitchEligible", "getEnvironment", "getExperiment", "getMerchantPath", "getToken", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "isMerchantUpgradePath", "isNoMerchantUpgradePath"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Valid extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData {
        public static final int $stable = 8;
        private final boolean appSwitchEligible;
        private final java.lang.String buttonSessionId;
        private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken;
        private final java.lang.String environment;
        private final java.lang.String experiment;
        private final java.lang.String flowType;
        private final java.lang.String fundingSource;
        private final java.lang.String integrationType;
        private final java.lang.String merchant;
        private final java.lang.String merchantPath;
        private final java.lang.String referrerURL;
        private final java.lang.String source;
        private final java.lang.String switchInitiatedTime;
        private final java.lang.String tokenType;
        private final android.net.Uri universalLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Valid(android.net.Uri uri, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z, java.lang.String str10, java.lang.String str11, java.lang.String str12) {
            super("Valid", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutToken, "");
            this.universalLink = uri;
            this.checkoutToken = checkoutToken;
            this.source = str;
            this.switchInitiatedTime = str2;
            this.buttonSessionId = str3;
            this.integrationType = str4;
            this.merchant = str5;
            this.flowType = str6;
            this.fundingSource = str7;
            this.tokenType = str8;
            this.referrerURL = str9;
            this.appSwitchEligible = z;
            this.environment = str10;
            this.experiment = str11;
            this.merchantPath = str12;
        }

        public /* synthetic */ Valid(android.net.Uri uri, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z, java.lang.String str10, java.lang.String str11, java.lang.String str12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, checkoutToken, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : str12);
        }

        public final android.net.Uri getUniversalLink() {
            return this.universalLink;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken getCheckoutToken() {
            return this.checkoutToken;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String getSwitchInitiatedTime() {
            return this.switchInitiatedTime;
        }

        public final java.lang.String getButtonSessionId() {
            return this.buttonSessionId;
        }

        public final java.lang.String getIntegrationType() {
            return this.integrationType;
        }

        public final java.lang.String getMerchant() {
            return this.merchant;
        }

        public final java.lang.String getFlowType() {
            return this.flowType;
        }

        public final java.lang.String getFundingSource() {
            return this.fundingSource;
        }

        public final java.lang.String getTokenType() {
            return this.tokenType;
        }

        public final java.lang.String getReferrerURL() {
            return this.referrerURL;
        }

        public final boolean getAppSwitchEligible() {
            return this.appSwitchEligible;
        }

        public final java.lang.String getEnvironment() {
            return this.environment;
        }

        public final java.lang.String getExperiment() {
            return this.experiment;
        }

        public final java.lang.String getMerchantPath() {
            return this.merchantPath;
        }

        public final java.lang.String getToken() {
            return this.checkoutToken.getValue();
        }

        public final boolean isMerchantUpgradePath() {
            java.lang.String str = this.merchantPath;
            if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                return !kotlin.jvm.internal.Intrinsics.areEqual(this.merchantPath, com.paypal.oslo.feature.inappcheckout.Constants.MERCHANT_PATH_NOMU);
            }
            java.lang.String str2 = this.flowType;
            return (str2 == null || kotlin.text.StringsKt.isBlank(str2) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) this.flowType, (java.lang.CharSequence) com.paypal.oslo.feature.inappcheckout.Constants.MERCHANT_PATH_NOMU, false, 2, (java.lang.Object) null)) ? false : true;
        }

        public final boolean isNoMerchantUpgradePath() {
            java.lang.String str = this.merchantPath;
            if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantPath, com.paypal.oslo.feature.inappcheckout.Constants.MERCHANT_PATH_NOMU);
            }
            java.lang.String str2 = this.flowType;
            if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
                return false;
            }
            return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) this.flowType, (java.lang.CharSequence) com.paypal.oslo.feature.inappcheckout.Constants.MERCHANT_PATH_NOMU, false, 2, (java.lang.Object) null);
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.universalLink;
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken = this.checkoutToken;
            java.lang.String str = this.source;
            java.lang.String str2 = this.switchInitiatedTime;
            java.lang.String str3 = this.buttonSessionId;
            java.lang.String str4 = this.integrationType;
            java.lang.String str5 = this.merchant;
            java.lang.String str6 = this.flowType;
            java.lang.String str7 = this.fundingSource;
            java.lang.String str8 = this.tokenType;
            java.lang.String str9 = this.referrerURL;
            boolean z = this.appSwitchEligible;
            java.lang.String str10 = this.environment;
            java.lang.String str11 = this.experiment;
            java.lang.String str12 = this.merchantPath;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Valid(universalLink=");
            sb.append(uri);
            sb.append(", checkoutToken=");
            sb.append(checkoutToken);
            sb.append(", source=");
            sb.append(str);
            sb.append(", switchInitiatedTime=");
            sb.append(str2);
            sb.append(", buttonSessionId=");
            sb.append(str3);
            sb.append(", integrationType=");
            sb.append(str4);
            sb.append(", merchant=");
            sb.append(str5);
            sb.append(", flowType=");
            sb.append(str6);
            sb.append(", fundingSource=");
            sb.append(str7);
            sb.append(", tokenType=");
            sb.append(str8);
            sb.append(", referrerURL=");
            sb.append(str9);
            sb.append(", appSwitchEligible=");
            sb.append(z);
            sb.append(", environment=");
            sb.append(str10);
            sb.append(", experiment=");
            sb.append(str11);
            sb.append(", merchantPath=");
            sb.append(str12);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.universalLink.hashCode();
            int hashCode2 = this.checkoutToken.hashCode();
            java.lang.String str = this.source;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.switchInitiatedTime;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.buttonSessionId;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.integrationType;
            int hashCode6 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.merchant;
            int hashCode7 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.flowType;
            int hashCode8 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.fundingSource;
            int hashCode9 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.tokenType;
            int hashCode10 = str8 == null ? 0 : str8.hashCode();
            java.lang.String str9 = this.referrerURL;
            int hashCode11 = str9 == null ? 0 : str9.hashCode();
            int hashCode12 = java.lang.Boolean.hashCode(this.appSwitchEligible);
            java.lang.String str10 = this.environment;
            int hashCode13 = str10 == null ? 0 : str10.hashCode();
            java.lang.String str11 = this.experiment;
            int hashCode14 = str11 == null ? 0 : str11.hashCode();
            java.lang.String str12 = this.merchantPath;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (str12 != null ? str12.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.universalLink, valid.universalLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutToken, valid.checkoutToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, valid.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.switchInitiatedTime, valid.switchInitiatedTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonSessionId, valid.buttonSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.integrationType, valid.integrationType) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, valid.merchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowType, valid.flowType) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSource, valid.fundingSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenType, valid.tokenType) && kotlin.jvm.internal.Intrinsics.areEqual(this.referrerURL, valid.referrerURL) && this.appSwitchEligible == valid.appSwitchEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.environment, valid.environment) && kotlin.jvm.internal.Intrinsics.areEqual(this.experiment, valid.experiment) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantPath, valid.merchantPath);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid copy(android.net.Uri universalLink, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, java.lang.String source, java.lang.String switchInitiatedTime, java.lang.String buttonSessionId, java.lang.String integrationType, java.lang.String merchant, java.lang.String flowType, java.lang.String fundingSource, java.lang.String tokenType, java.lang.String referrerURL, boolean appSwitchEligible, java.lang.String environment, java.lang.String experiment, java.lang.String merchantPath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalLink, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutToken, "");
            return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid(universalLink, checkoutToken, source, switchInitiatedTime, buttonSessionId, integrationType, merchant, flowType, fundingSource, tokenType, referrerURL, appSwitchEligible, environment, experiment, merchantPath);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getFundingSource() {
            return this.fundingSource;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getFlowType() {
            return this.flowType;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getMerchant() {
            return this.merchant;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getIntegrationType() {
            return this.integrationType;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getButtonSessionId() {
            return this.buttonSessionId;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSwitchInitiatedTime() {
            return this.switchInitiatedTime;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken getCheckoutToken() {
            return this.checkoutToken;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.String getMerchantPath() {
            return this.merchantPath;
        }

        /* renamed from: component14, reason: from getter */
        public final java.lang.String getExperiment() {
            return this.experiment;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getEnvironment() {
            return this.environment;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getAppSwitchEligible() {
            return this.appSwitchEligible;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getReferrerURL() {
            return this.referrerURL;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getTokenType() {
            return this.tokenType;
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getUniversalLink() {
            return this.universalLink;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$AlreadyHandled;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class AlreadyHandled extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.AlreadyHandled INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.AlreadyHandled();

        private AlreadyHandled() {
            super("AlreadyHandled", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$NotProcessed;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class NotProcessed extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.NotProcessed INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.NotProcessed();

        private NotProcessed() {
            super("NotProcessed", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Unknown;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "Landroid/net/Uri;", "universalLink", "", "source", "switchInitiatedTime", "experiment", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getUniversalLink", "Ljava/lang/String;", "getSource", "getSwitchInitiatedTime", "getExperiment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData {
        public static final int $stable = 8;
        private final java.lang.String experiment;
        private final java.lang.String source;
        private final java.lang.String switchInitiatedTime;
        private final android.net.Uri universalLink;

        public Unknown(android.net.Uri uri, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("Unknown", null);
            this.universalLink = uri;
            this.source = str;
            this.switchInitiatedTime = str2;
            this.experiment = str3;
        }

        public /* synthetic */ Unknown(android.net.Uri uri, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public final android.net.Uri getUniversalLink() {
            return this.universalLink;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String getSwitchInitiatedTime() {
            return this.switchInitiatedTime;
        }

        public final java.lang.String getExperiment() {
            return this.experiment;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.universalLink;
            java.lang.String str = this.source;
            java.lang.String str2 = this.switchInitiatedTime;
            java.lang.String str3 = this.experiment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(universalLink=");
            sb.append(uri);
            sb.append(", source=");
            sb.append(str);
            sb.append(", switchInitiatedTime=");
            sb.append(str2);
            sb.append(", experiment=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            android.net.Uri uri = this.universalLink;
            int hashCode = uri == null ? 0 : uri.hashCode();
            java.lang.String str = this.source;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.switchInitiatedTime;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.experiment;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown unknown = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.universalLink, unknown.universalLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, unknown.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.switchInitiatedTime, unknown.switchInitiatedTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.experiment, unknown.experiment);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown copy(android.net.Uri universalLink, java.lang.String source, java.lang.String switchInitiatedTime, java.lang.String experiment) {
            return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown(universalLink, source, switchInitiatedTime, experiment);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getExperiment() {
            return this.experiment;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSwitchInitiatedTime() {
            return this.switchInitiatedTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getUniversalLink() {
            return this.universalLink;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown unknown, android.net.Uri uri, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = unknown.universalLink;
            }
            if ((i & 2) != 0) {
                str = unknown.source;
            }
            if ((i & 4) != 0) {
                str2 = unknown.switchInitiatedTime;
            }
            if ((i & 8) != 0) {
                str3 = unknown.experiment;
            }
            return unknown.copy(uri, str, str2, str3);
        }

        public Unknown() {
            this(null, null, null, null, 15, null);
        }
    }

    /* renamed from: $r8$lambda$474WWmUTEegxjbm4Mw-N0DQ6MwY, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m15447$r8$lambda$474WWmUTEegxjbm4MwN0DQ6MwY() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.class), new kotlin.reflect.KClass[0], new kotlinx.serialization.KSerializer[0], new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ UniversalLinkData(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
