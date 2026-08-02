package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016Jn\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0016J'\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b\u0007\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b7\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b8\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b9\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b:\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b;\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b<\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "", "id", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "type", "", "isEligible", "webChallengeUrl", "returnUri", "returnUriParam", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_STEP_UP_CONTEXT_ID, com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "flowContext", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "getType", "Z", "getWebChallengeUrl", "getReturnUri", "getReturnUriParam", "getStepUpContextId", "getFlowName", "getFlowContext", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class WebViewChallenge implements com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge {
    public static final int $stable = 0;
    private final java.lang.String flowContext;
    private final java.lang.String flowName;
    private final java.lang.String id;
    private final boolean isEligible;
    private final java.lang.String returnUri;
    private final java.lang.String returnUriParam;
    private final java.lang.String stepUpContextId;
    private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type;
    private final java.lang.String webChallengeUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge.Companion INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge> serializer() {
            return com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WebViewChallenge(int i, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 511, com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.type = challengeType;
        this.isEligible = z;
        this.webChallengeUrl = str2;
        this.returnUri = str3;
        this.returnUriParam = str4;
        this.stepUpContextId = str5;
        this.flowName = str6;
        this.flowContext = str7;
    }

    public WebViewChallenge(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.id = str;
        this.type = challengeType;
        this.isEligible = z;
        this.webChallengeUrl = str2;
        this.returnUri = str3;
        this.returnUriParam = str4;
        this.stepUpContextId = str5;
        this.flowName = str6;
        this.flowContext = str7;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getId());
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.getType());
        output.encodeBooleanElement(serialDesc, 2, self.isEligible());
        output.encodeStringElement(serialDesc, 3, self.webChallengeUrl);
        output.encodeStringElement(serialDesc, 4, self.returnUri);
        output.encodeStringElement(serialDesc, 5, self.returnUriParam);
        output.encodeStringElement(serialDesc, 6, self.stepUpContextId);
        output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.flowName);
        output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.flowContext);
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge
    public final java.lang.String getId() {
        return this.id;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge
    public final boolean isEligible() {
        return this.isEligible;
    }

    public final java.lang.String getWebChallengeUrl() {
        return this.webChallengeUrl;
    }

    public final java.lang.String getReturnUri() {
        return this.returnUri;
    }

    public final java.lang.String getReturnUriParam() {
        return this.returnUriParam;
    }

    public final java.lang.String getStepUpContextId() {
        return this.stepUpContextId;
    }

    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    public final java.lang.String getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType = this.type;
        boolean z = this.isEligible;
        java.lang.String str2 = this.webChallengeUrl;
        java.lang.String str3 = this.returnUri;
        java.lang.String str4 = this.returnUriParam;
        java.lang.String str5 = this.stepUpContextId;
        java.lang.String str6 = this.flowName;
        java.lang.String str7 = this.flowContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewChallenge(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(challengeType);
        sb.append(", isEligible=");
        sb.append(z);
        sb.append(", webChallengeUrl=");
        sb.append(str2);
        sb.append(", returnUri=");
        sb.append(str3);
        sb.append(", returnUriParam=");
        sb.append(str4);
        sb.append(", stepUpContextId=");
        sb.append(str5);
        sb.append(", flowName=");
        sb.append(str6);
        sb.append(", flowContext=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isEligible);
        int hashCode4 = this.webChallengeUrl.hashCode();
        int hashCode5 = this.returnUri.hashCode();
        int hashCode6 = this.returnUriParam.hashCode();
        int hashCode7 = this.stepUpContextId.hashCode();
        java.lang.String str = this.flowName;
        int hashCode8 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.flowContext;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge)) {
            return false;
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, webViewChallenge.id) && this.type == webViewChallenge.type && this.isEligible == webViewChallenge.isEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.webChallengeUrl, webViewChallenge.webChallengeUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUri, webViewChallenge.returnUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUriParam, webViewChallenge.returnUriParam) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepUpContextId, webViewChallenge.stepUpContextId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowName, webViewChallenge.flowName) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, webViewChallenge.flowContext);
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge copy(java.lang.String id, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type, boolean isEligible, java.lang.String webChallengeUrl, java.lang.String returnUri, java.lang.String returnUriParam, java.lang.String stepUpContextId, java.lang.String flowName, java.lang.String flowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webChallengeUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUriParam, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpContextId, "");
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge(id, type, isEligible, webChallengeUrl, returnUri, returnUriParam, stepUpContextId, flowName, flowContext);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getFlowContext() {
        return this.flowContext;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getStepUpContextId() {
        return this.stepUpContextId;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getReturnUriParam() {
        return this.returnUriParam;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getReturnUri() {
        return this.returnUri;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getWebChallengeUrl() {
        return this.webChallengeUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
