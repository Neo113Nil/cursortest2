package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent;", "", "LoadPasskeys", "AddPasskey", "DeletePasskey", "RetryLoad", "DismissCreateErrorOverlay", "DismissCreateErrorBanner", "DismissSuccessMessage", "DismissDeleteSuccessBanner", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$AddPasskey;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DeletePasskey;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DismissCreateErrorBanner;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DismissCreateErrorOverlay;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DismissDeleteSuccessBanner;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DismissSuccessMessage;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$LoadPasskeys;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$RetryLoad;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PasskeyListEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$LoadPasskeys;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadPasskeys implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.LoadPasskeys INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.LoadPasskeys();

        public final int hashCode() {
            return 818463133;
        }

        private LoadPasskeys() {
        }

        public final java.lang.String toString() {
            return "LoadPasskeys";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.LoadPasskeys)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$AddPasskey;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent;", "Landroid/content/Context;", "activityContext", "", "publicCredential", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "component1", "()Landroid/content/Context;", "component2", "()Ljava/lang/String;", "copy", "(Landroid/content/Context;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$AddPasskey;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/content/Context;", "getActivityContext", "Ljava/lang/String;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddPasskey implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent {
        public static final int $stable = 8;
        private final android.content.Context activityContext;
        private final java.lang.String publicCredential;

        public AddPasskey(android.content.Context context, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            this.activityContext = context;
            this.publicCredential = str;
        }

        public /* synthetic */ AddPasskey(android.content.Context context, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? null : str);
        }

        public final android.content.Context getActivityContext() {
            return this.activityContext;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            android.content.Context context = this.activityContext;
            java.lang.String str = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddPasskey(activityContext=");
            sb.append(context);
            sb.append(", publicCredential=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.activityContext.hashCode();
            java.lang.String str = this.publicCredential;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.AddPasskey)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.AddPasskey addPasskey = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.AddPasskey) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.activityContext, addPasskey.activityContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, addPasskey.publicCredential);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.AddPasskey copy(android.content.Context activityContext, java.lang.String publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
            return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.AddPasskey(activityContext, publicCredential);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        /* renamed from: component1, reason: from getter */
        public final android.content.Context getActivityContext() {
            return this.activityContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.AddPasskey copy$default(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.AddPasskey addPasskey, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = addPasskey.activityContext;
            }
            if ((i & 2) != 0) {
                str = addPasskey.publicCredential;
            }
            return addPasskey.copy(context, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DeletePasskey;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent;", "", "passkeyCredentialId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DeletePasskey;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPasskeyCredentialId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeletePasskey implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent {
        public static final int $stable = 0;
        private final java.lang.String passkeyCredentialId;

        public DeletePasskey(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.passkeyCredentialId = str;
        }

        public final java.lang.String getPasskeyCredentialId() {
            return this.passkeyCredentialId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.passkeyCredentialId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeletePasskey(passkeyCredentialId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.passkeyCredentialId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DeletePasskey) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyCredentialId, ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DeletePasskey) other).passkeyCredentialId);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DeletePasskey copy(java.lang.String passkeyCredentialId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCredentialId, "");
            return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DeletePasskey(passkeyCredentialId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPasskeyCredentialId() {
            return this.passkeyCredentialId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DeletePasskey copy$default(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DeletePasskey deletePasskey, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deletePasskey.passkeyCredentialId;
            }
            return deletePasskey.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$RetryLoad;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryLoad implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.RetryLoad INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.RetryLoad();

        public final int hashCode() {
            return -530680868;
        }

        private RetryLoad() {
        }

        public final java.lang.String toString() {
            return "RetryLoad";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.RetryLoad)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DismissCreateErrorOverlay;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissCreateErrorOverlay implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissCreateErrorOverlay INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissCreateErrorOverlay();

        public final int hashCode() {
            return 990362780;
        }

        private DismissCreateErrorOverlay() {
        }

        public final java.lang.String toString() {
            return "DismissCreateErrorOverlay";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissCreateErrorOverlay)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DismissCreateErrorBanner;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissCreateErrorBanner implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissCreateErrorBanner INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissCreateErrorBanner();

        public final int hashCode() {
            return -2021929632;
        }

        private DismissCreateErrorBanner() {
        }

        public final java.lang.String toString() {
            return "DismissCreateErrorBanner";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissCreateErrorBanner)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DismissSuccessMessage;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissSuccessMessage implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissSuccessMessage INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissSuccessMessage();

        public final int hashCode() {
            return 1749744348;
        }

        private DismissSuccessMessage() {
        }

        public final java.lang.String toString() {
            return "DismissSuccessMessage";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissSuccessMessage)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent$DismissDeleteSuccessBanner;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissDeleteSuccessBanner implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissDeleteSuccessBanner INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissDeleteSuccessBanner();

        public final int hashCode() {
            return -514084916;
        }

        private DismissDeleteSuccessBanner() {
        }

        public final java.lang.String toString() {
            return "DismissDeleteSuccessBanner";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListEvent.DismissDeleteSuccessBanner)) {
                return false;
            }
            return true;
        }
    }
}
