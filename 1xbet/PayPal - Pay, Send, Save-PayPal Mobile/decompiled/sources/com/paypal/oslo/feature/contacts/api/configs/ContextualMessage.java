package com.paypal.oslo.feature.contacts.api.configs;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage;", "", "Info", "Error", com.google.common.net.HttpHeaders.WARNING, "Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage$Error;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage$Info;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage$Warning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContextualMessage {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage$Info;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage;", "", "localizedMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage$Info;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLocalizedMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Info implements com.paypal.oslo.feature.contacts.api.configs.ContextualMessage {
        public static final int $stable = 0;
        private final java.lang.String localizedMessage;

        public Info(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.localizedMessage = str;
        }

        public final java.lang.String getLocalizedMessage() {
            return this.localizedMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.localizedMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Info(localizedMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.localizedMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Info) && kotlin.jvm.internal.Intrinsics.areEqual(this.localizedMessage, ((com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Info) other).localizedMessage);
        }

        public final com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Info copy(java.lang.String localizedMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localizedMessage, "");
            return new com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Info(localizedMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLocalizedMessage() {
            return this.localizedMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Info copy$default(com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Info info, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = info.localizedMessage;
            }
            return info.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage$Error;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage;", "", "localizedError", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLocalizedError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.contacts.api.configs.ContextualMessage {
        public static final int $stable = 0;
        private final java.lang.String localizedError;

        public Error(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.localizedError = str;
        }

        public final java.lang.String getLocalizedError() {
            return this.localizedError;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.localizedError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(localizedError=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.localizedError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.localizedError, ((com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Error) other).localizedError);
        }

        public final com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Error copy(java.lang.String localizedError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localizedError, "");
            return new com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Error(localizedError);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLocalizedError() {
            return this.localizedError;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Error copy$default(com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.localizedError;
            }
            return error.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage$Warning;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage;", "", "localizedWarning", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage$Warning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLocalizedWarning"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Warning implements com.paypal.oslo.feature.contacts.api.configs.ContextualMessage {
        public static final int $stable = 0;
        private final java.lang.String localizedWarning;

        public Warning(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.localizedWarning = str;
        }

        public final java.lang.String getLocalizedWarning() {
            return this.localizedWarning;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.localizedWarning;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Warning(localizedWarning=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.localizedWarning.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Warning) && kotlin.jvm.internal.Intrinsics.areEqual(this.localizedWarning, ((com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Warning) other).localizedWarning);
        }

        public final com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Warning copy(java.lang.String localizedWarning) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localizedWarning, "");
            return new com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Warning(localizedWarning);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLocalizedWarning() {
            return this.localizedWarning;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Warning copy$default(com.paypal.oslo.feature.contacts.api.configs.ContextualMessage.Warning warning, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = warning.localizedWarning;
            }
            return warning.copy(str);
        }
    }
}
