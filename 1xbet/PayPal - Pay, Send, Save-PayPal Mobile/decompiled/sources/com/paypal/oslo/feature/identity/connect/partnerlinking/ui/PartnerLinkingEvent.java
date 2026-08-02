package com.paypal.oslo.feature.identity.connect.partnerlinking.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "<init>", "()V", "ValidatePartner", "ValidationFailed", "OAuthInitializationComplete", "OAuthInitializationFailed", "WebViewPageLoadStarted", "WebViewPageLoadFinished", "WebViewRedirectUrlIntercepted", "WebViewRedirectSucceeded", "WebViewRedirectFailed", "WebViewBackClicked", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR, "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$DismissError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$OAuthInitializationComplete;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$OAuthInitializationFailed;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$ValidatePartner;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewBackClicked;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewPageLoadFinished;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewPageLoadStarted;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewRedirectFailed;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewRedirectSucceeded;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewRedirectUrlIntercepted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PartnerLinkingEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;

    private PartnerLinkingEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$ValidatePartner;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "", "type", "partnerName", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_CONTEXT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$ValidatePartner;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "getPartnerName", "getFlowContextId", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidatePartner extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        private final java.lang.String flowContextId;
        private final java.lang.String name;
        private final java.lang.String partnerName;
        private final java.lang.String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidatePartner(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.type = str;
            this.partnerName = str2;
            this.flowContextId = str3;
            this.name = "ValidatePartner";
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.lang.String getPartnerName() {
            return this.partnerName;
        }

        public final java.lang.String getFlowContextId() {
            return this.flowContextId;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.type;
            java.lang.String str2 = this.partnerName;
            java.lang.String str3 = this.flowContextId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidatePartner(type=");
            sb.append(str);
            sb.append(", partnerName=");
            sb.append(str2);
            sb.append(", flowContextId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.type.hashCode() * 31) + this.partnerName.hashCode()) * 31) + this.flowContextId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner)) {
                return false;
            }
            com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner validatePartner = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, validatePartner.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerName, validatePartner.partnerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContextId, validatePartner.flowContextId);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner copy(java.lang.String type, java.lang.String partnerName, java.lang.String flowContextId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContextId, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner(type, partnerName, flowContextId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFlowContextId() {
            return this.flowContextId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPartnerName() {
            return this.partnerName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner validatePartner, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validatePartner.type;
            }
            if ((i & 2) != 0) {
                str2 = validatePartner.partnerName;
            }
            if ((i & 4) != 0) {
                str3 = validatePartner.flowContextId;
            }
            return validatePartner.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010!\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "error", "", "type", "partnerName", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_CONTEXT_ID, "<init>", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$ValidationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "getError", "Ljava/lang/String;", "getType", "getPartnerName", "getFlowContextId", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationFailed extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError error;
        private final java.lang.String flowContextId;
        private final java.lang.String name;
        private final java.lang.String partnerName;
        private final java.lang.String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationFailed(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConnectError, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.error = validateConnectError;
            this.type = str;
            this.partnerName = str2;
            this.flowContextId = str3;
            this.name = "ValidationFailed";
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError getError() {
            return this.error;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.lang.String getPartnerName() {
            return this.partnerName;
        }

        public final java.lang.String getFlowContextId() {
            return this.flowContextId;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError = this.error;
            java.lang.String str = this.type;
            java.lang.String str2 = this.partnerName;
            java.lang.String str3 = this.flowContextId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationFailed(error=");
            sb.append(validateConnectError);
            sb.append(", type=");
            sb.append(str);
            sb.append(", partnerName=");
            sb.append(str2);
            sb.append(", flowContextId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.error.hashCode() * 31) + this.type.hashCode()) * 31) + this.partnerName.hashCode()) * 31) + this.flowContextId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed validationFailed = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, validationFailed.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, validationFailed.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerName, validationFailed.partnerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContextId, validationFailed.flowContextId);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed copy(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError error, java.lang.String type, java.lang.String partnerName, java.lang.String flowContextId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContextId, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed(error, type, partnerName, flowContextId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFlowContextId() {
            return this.flowContextId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPartnerName() {
            return this.partnerName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed validationFailed, com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateConnectError = validationFailed.error;
            }
            if ((i & 2) != 0) {
                str = validationFailed.type;
            }
            if ((i & 4) != 0) {
                str2 = validationFailed.partnerName;
            }
            if ((i & 8) != 0) {
                str3 = validationFailed.flowContextId;
            }
            return validationFailed.copy(validateConnectError, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$OAuthInitializationComplete;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "", "connectUrl", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$OAuthInitializationComplete;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConnectUrl", "getReturnUrl", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OAuthInitializationComplete extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        private final java.lang.String connectUrl;
        private final java.lang.String name;
        private final java.lang.String returnUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAuthInitializationComplete(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.connectUrl = str;
            this.returnUrl = str2;
            this.name = "OAuthInitializationComplete";
        }

        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.connectUrl;
            java.lang.String str2 = this.returnUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OAuthInitializationComplete(connectUrl=");
            sb.append(str);
            sb.append(", returnUrl=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.connectUrl.hashCode() * 31) + this.returnUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete)) {
                return false;
            }
            com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete oAuthInitializationComplete = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.connectUrl, oAuthInitializationComplete.connectUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, oAuthInitializationComplete.returnUrl);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete copy(java.lang.String connectUrl, java.lang.String returnUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete(connectUrl, returnUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete oAuthInitializationComplete, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = oAuthInitializationComplete.connectUrl;
            }
            if ((i & 2) != 0) {
                str2 = oAuthInitializationComplete.returnUrl;
            }
            return oAuthInitializationComplete.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$OAuthInitializationFailed;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "error", "", "connectUrl", "<init>", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$OAuthInitializationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "getError", "Ljava/lang/String;", "getConnectUrl", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OAuthInitializationFailed extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        private final java.lang.String connectUrl;
        private final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError error;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAuthInitializationFailed(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConnectError, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = validateConnectError;
            this.connectUrl = str;
            this.name = "OAuthInitializationFailed";
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError getError() {
            return this.error;
        }

        public /* synthetic */ OAuthInitializationFailed(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(validateConnectError, (i & 2) != 0 ? "" : str);
        }

        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError = this.error;
            java.lang.String str = this.connectUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OAuthInitializationFailed(error=");
            sb.append(validateConnectError);
            sb.append(", connectUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.error.hashCode() * 31) + this.connectUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed oAuthInitializationFailed = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, oAuthInitializationFailed.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectUrl, oAuthInitializationFailed.connectUrl);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed copy(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError error, java.lang.String connectUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectUrl, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed(error, connectUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed oAuthInitializationFailed, com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateConnectError = oAuthInitializationFailed.error;
            }
            if ((i & 2) != 0) {
                str = oAuthInitializationFailed.connectUrl;
            }
            return oAuthInitializationFailed.copy(validateConnectError, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewPageLoadStarted;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewPageLoadStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewPageLoadStarted extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewPageLoadStarted(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.name = "WebViewPageLoadStarted";
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewPageLoadStarted(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadStarted) other).url);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadStarted copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadStarted(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadStarted copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadStarted webViewPageLoadStarted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = webViewPageLoadStarted.url;
            }
            return webViewPageLoadStarted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewPageLoadFinished;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewPageLoadFinished;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewPageLoadFinished extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewPageLoadFinished(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.name = "WebViewPageLoadFinished";
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewPageLoadFinished(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadFinished) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadFinished) other).url);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadFinished copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadFinished(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadFinished copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadFinished webViewPageLoadFinished, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = webViewPageLoadFinished.url;
            }
            return webViewPageLoadFinished.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewRedirectUrlIntercepted;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewRedirectUrlIntercepted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewRedirectUrlIntercepted extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewRedirectUrlIntercepted(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.name = "WebViewRedirectUrlIntercepted";
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewRedirectUrlIntercepted(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted) other).url);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted webViewRedirectUrlIntercepted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = webViewRedirectUrlIntercepted.url;
            }
            return webViewRedirectUrlIntercepted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewRedirectSucceeded;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewRedirectSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewRedirectSucceeded extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewRedirectSucceeded(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.name = "WebViewRedirectSucceeded";
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewRedirectSucceeded(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectSucceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectSucceeded) other).url);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectSucceeded copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectSucceeded(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectSucceeded copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectSucceeded webViewRedirectSucceeded, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = webViewRedirectSucceeded.url;
            }
            return webViewRedirectSucceeded.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewRedirectFailed;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "error", "", "connectUrl", "<init>", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewRedirectFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "getError", "Ljava/lang/String;", "getConnectUrl", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewRedirectFailed extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        private final java.lang.String connectUrl;
        private final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError error;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewRedirectFailed(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConnectError, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = validateConnectError;
            this.connectUrl = str;
            this.name = "WebViewRedirectFailed";
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError getError() {
            return this.error;
        }

        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError = this.error;
            java.lang.String str = this.connectUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewRedirectFailed(error=");
            sb.append(validateConnectError);
            sb.append(", connectUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.error.hashCode() * 31) + this.connectUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed webViewRedirectFailed = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, webViewRedirectFailed.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectUrl, webViewRedirectFailed.connectUrl);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed copy(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError error, java.lang.String connectUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectUrl, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed(error, connectUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed webViewRedirectFailed, com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateConnectError = webViewRedirectFailed.error;
            }
            if ((i & 2) != 0) {
                str = webViewRedirectFailed.connectUrl;
            }
            return webViewRedirectFailed.copy(validateConnectError, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$WebViewBackClicked;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewBackClicked extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewBackClicked INSTANCE = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewBackClicked();
        private static final java.lang.String name = "WebViewBackClicked";

        public final int hashCode() {
            return -1690712054;
        }

        private WebViewBackClicked() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "WebViewBackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewBackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent$DismissError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissError extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.DismissError INSTANCE = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.DismissError();
        private static final java.lang.String name = com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR;

        public final int hashCode() {
            return -1534872447;
        }

        private DismissError() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.DismissError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PartnerLinkingEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
