package com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CreatePasswordSubmit", "CreatePasswordSuccess", "CreatePasswordError", "CreatePasswordSkip", "BannerDismiss", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$BannerDismiss;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordSkip;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordSubmit;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PasswordRecoveryEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PasswordRecoveryEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJP\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordSubmit;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent;", "", "credential", androidx.autofill.HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "confirmPassword", "", "shouldLogOutAllDevices", "nonce", "partialToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordSubmit;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCredential", "getNewPassword", "getConfirmPassword", "Z", "getShouldLogOutAllDevices", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreatePasswordSubmit extends com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent {
        public static final int $stable = 0;
        private final java.lang.String confirmPassword;
        private final java.lang.String credential;
        private final java.lang.String newPassword;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final boolean shouldLogOutAllDevices;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreatePasswordSubmit(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5) {
            super("PasswordRecoveryEvent.CreatePasswordSubmit", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.credential = str;
            this.newPassword = str2;
            this.confirmPassword = str3;
            this.shouldLogOutAllDevices = z;
            this.nonce = str4;
            this.partialToken = str5;
        }

        public /* synthetic */ CreatePasswordSubmit(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
        }

        public final java.lang.String getCredential() {
            return this.credential;
        }

        public final java.lang.String getNewPassword() {
            return this.newPassword;
        }

        public final java.lang.String getConfirmPassword() {
            return this.confirmPassword;
        }

        public final boolean getShouldLogOutAllDevices() {
            return this.shouldLogOutAllDevices;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.credential;
            java.lang.String str2 = this.newPassword;
            java.lang.String str3 = this.confirmPassword;
            boolean z = this.shouldLogOutAllDevices;
            java.lang.String str4 = this.nonce;
            java.lang.String str5 = this.partialToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreatePasswordSubmit(credential=");
            sb.append(str);
            sb.append(", newPassword=");
            sb.append(str2);
            sb.append(", confirmPassword=");
            sb.append(str3);
            sb.append(", shouldLogOutAllDevices=");
            sb.append(z);
            sb.append(", nonce=");
            sb.append(str4);
            sb.append(", partialToken=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.credential.hashCode();
            int hashCode2 = this.newPassword.hashCode();
            int hashCode3 = this.confirmPassword.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.shouldLogOutAllDevices);
            java.lang.String str = this.nonce;
            int hashCode5 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSubmit)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSubmit createPasswordSubmit = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSubmit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.credential, createPasswordSubmit.credential) && kotlin.jvm.internal.Intrinsics.areEqual(this.newPassword, createPasswordSubmit.newPassword) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmPassword, createPasswordSubmit.confirmPassword) && this.shouldLogOutAllDevices == createPasswordSubmit.shouldLogOutAllDevices && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, createPasswordSubmit.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, createPasswordSubmit.partialToken);
        }

        public final com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSubmit copy(java.lang.String credential, java.lang.String newPassword, java.lang.String confirmPassword, boolean shouldLogOutAllDevices, java.lang.String nonce, java.lang.String partialToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPassword, "");
            return new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSubmit(credential, newPassword, confirmPassword, shouldLogOutAllDevices, nonce, partialToken);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldLogOutAllDevices() {
            return this.shouldLogOutAllDevices;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getConfirmPassword() {
            return this.confirmPassword;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNewPassword() {
            return this.newPassword;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCredential() {
            return this.credential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSubmit copy$default(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSubmit createPasswordSubmit, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = createPasswordSubmit.credential;
            }
            if ((i & 2) != 0) {
                str2 = createPasswordSubmit.newPassword;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = createPasswordSubmit.confirmPassword;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                z = createPasswordSubmit.shouldLogOutAllDevices;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                str4 = createPasswordSubmit.nonce;
            }
            java.lang.String str8 = str4;
            if ((i & 32) != 0) {
                str5 = createPasswordSubmit.partialToken;
            }
            return createPasswordSubmit.copy(str, str6, str7, z2, str8, str5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordSuccess;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;", "output", "", "credential", androidx.autofill.HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "<init>", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;", "getOutput", "Ljava/lang/String;", "getCredential", "getNewPassword"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreatePasswordSuccess extends com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent {
        public static final int $stable = 0;
        private final java.lang.String credential;
        private final java.lang.String newPassword;
        private final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput output;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreatePasswordSuccess(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput createPasswordOutput, java.lang.String str, java.lang.String str2) {
            super("PasswordRecoveryEvent.CreatePasswordSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPasswordOutput, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.output = createPasswordOutput;
            this.credential = str;
            this.newPassword = str2;
        }

        public final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput getOutput() {
            return this.output;
        }

        public final java.lang.String getCredential() {
            return this.credential;
        }

        public final java.lang.String getNewPassword() {
            return this.newPassword;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput createPasswordOutput = this.output;
            java.lang.String str = this.credential;
            java.lang.String str2 = this.newPassword;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreatePasswordSuccess(output=");
            sb.append(createPasswordOutput);
            sb.append(", credential=");
            sb.append(str);
            sb.append(", newPassword=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.output.hashCode() * 31) + this.credential.hashCode()) * 31) + this.newPassword.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess createPasswordSuccess = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.output, createPasswordSuccess.output) && kotlin.jvm.internal.Intrinsics.areEqual(this.credential, createPasswordSuccess.credential) && kotlin.jvm.internal.Intrinsics.areEqual(this.newPassword, createPasswordSuccess.newPassword);
        }

        public final com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess copy(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput output, java.lang.String credential, java.lang.String newPassword) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "");
            return new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess(output, credential, newPassword);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNewPassword() {
            return this.newPassword;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCredential() {
            return this.credential;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput getOutput() {
            return this.output;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess copy$default(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess createPasswordSuccess, com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput createPasswordOutput, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createPasswordOutput = createPasswordSuccess.output;
            }
            if ((i & 2) != 0) {
                str = createPasswordSuccess.credential;
            }
            if ((i & 4) != 0) {
                str2 = createPasswordSuccess.newPassword;
            }
            return createPasswordSuccess.copy(createPasswordOutput, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "copy", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;)Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreatePasswordError extends com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreatePasswordError(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError passwordRecoveryError) {
            super("PasswordRecoveryEvent.CreatePasswordError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordRecoveryError, "");
            this.error = passwordRecoveryError;
        }

        public final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError passwordRecoveryError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreatePasswordError(error=");
            sb.append(passwordRecoveryError);
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
            return (other instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError) other).error);
        }

        public final com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError copy(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError copy$default(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError createPasswordError, com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError passwordRecoveryError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passwordRecoveryError = createPasswordError.error;
            }
            return createPasswordError.copy(passwordRecoveryError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$CreatePasswordSkip;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreatePasswordSkip extends com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSkip INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSkip();

        public final int hashCode() {
            return 1589047843;
        }

        private CreatePasswordSkip() {
            super("PasswordRecoveryEvent.CreatePasswordSkip", null);
        }

        public final java.lang.String toString() {
            return "CreatePasswordSkip";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSkip)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent$BannerDismiss;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BannerDismiss extends com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.BannerDismiss INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.BannerDismiss();

        public final int hashCode() {
            return -342123183;
        }

        private BannerDismiss() {
            super("PasswordRecoveryEvent.BannerDismiss", null);
        }

        public final java.lang.String toString() {
            return "BannerDismiss";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.BannerDismiss)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PasswordRecoveryEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
