package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "", "<init>", "()V", "", "getHasVisibleUI", "()Z", "hasVisibleUI", "isActive", "Idle", "AttemptingBiometric", "AttemptingPasskey", "PrefetchingAuthOptions", "AwaitingCredentialEntry", "ProcessingPostLogin", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Failed", "Cancelled", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$AttemptingBiometric;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$AttemptingPasskey;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$AwaitingCredentialEntry;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Cancelled;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Completed;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Failed;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Idle;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$PrefetchingAuthOptions;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$ProcessingPostLogin;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AuthPhase {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Idle;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.identity.login.domain.model.AuthPhase {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Idle INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Idle();

        public final int hashCode() {
            return -1920865414;
        }

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Idle)) {
                return false;
            }
            return true;
        }
    }

    private AuthPhase() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$AttemptingBiometric;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AttemptingBiometric extends com.paypal.oslo.feature.identity.login.domain.model.AuthPhase {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingBiometric INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingBiometric();

        public final int hashCode() {
            return 2126753245;
        }

        private AttemptingBiometric() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AttemptingBiometric";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingBiometric)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$AttemptingPasskey;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AttemptingPasskey extends com.paypal.oslo.feature.identity.login.domain.model.AuthPhase {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingPasskey INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingPasskey();

        public final int hashCode() {
            return 349608723;
        }

        private AttemptingPasskey() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AttemptingPasskey";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingPasskey)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$PrefetchingAuthOptions;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrefetchingAuthOptions extends com.paypal.oslo.feature.identity.login.domain.model.AuthPhase {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.PrefetchingAuthOptions INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.PrefetchingAuthOptions();

        public final int hashCode() {
            return -819898767;
        }

        private PrefetchingAuthOptions() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PrefetchingAuthOptions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.PrefetchingAuthOptions)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$AwaitingCredentialEntry;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AwaitingCredentialEntry extends com.paypal.oslo.feature.identity.login.domain.model.AuthPhase {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AwaitingCredentialEntry INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AwaitingCredentialEntry();

        public final int hashCode() {
            return -1043696503;
        }

        private AwaitingCredentialEntry() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AwaitingCredentialEntry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AwaitingCredentialEntry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$ProcessingPostLogin;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProcessingPostLogin extends com.paypal.oslo.feature.identity.login.domain.model.AuthPhase {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.ProcessingPostLogin INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.ProcessingPostLogin();

        public final int hashCode() {
            return -40971152;
        }

        private ProcessingPostLogin() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ProcessingPostLogin";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.ProcessingPostLogin)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Completed;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/Token;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/Token;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/Token;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Completed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Completed extends com.paypal.oslo.feature.identity.login.domain.model.AuthPhase {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.identity.domain.model.Token token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(com.paypal.oslo.core.identity.domain.model.Token token) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            this.token = token;
        }

        public final com.paypal.oslo.core.identity.domain.model.Token getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.Token token = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(token=");
            sb.append(token);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed) other).token);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed copy(com.paypal.oslo.core.identity.domain.model.Token token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed(token);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.Token getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed completed, com.paypal.oslo.core.identity.domain.model.Token token, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                token = completed.token;
            }
            return completed.copy(token);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Failed;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "error", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/TokenError;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/TokenError;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed extends com.paypal.oslo.feature.identity.login.domain.model.AuthPhase {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.identity.domain.model.TokenError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(com.paypal.oslo.core.identity.domain.model.TokenError tokenError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenError, "");
            this.error = tokenError;
        }

        public final com.paypal.oslo.core.identity.domain.model.TokenError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.TokenError tokenError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(error=");
            sb.append(tokenError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed) other).error);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed copy(com.paypal.oslo.core.identity.domain.model.TokenError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.TokenError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed failed, com.paypal.oslo.core.identity.domain.model.TokenError tokenError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tokenError = failed.error;
            }
            return failed.copy(tokenError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase$Cancelled;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthPhase;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.identity.login.domain.model.AuthPhase {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Cancelled INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Cancelled();

        public final int hashCode() {
            return 1225708907;
        }

        private Cancelled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    public final boolean getHasVisibleUI() {
        return this instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AwaitingCredentialEntry;
    }

    public final boolean isActive() {
        return ((this instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Idle) || (this instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed) || (this instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed) || (this instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Cancelled)) ? false : true;
    }

    public /* synthetic */ AuthPhase(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
