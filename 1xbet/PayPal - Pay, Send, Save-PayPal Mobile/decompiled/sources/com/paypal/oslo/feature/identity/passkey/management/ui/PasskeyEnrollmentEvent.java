package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent;", "", "CreatePasskey", "DismissGotIt", "DismissBannerError", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent$CreatePasskey;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent$DismissBannerError;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent$DismissGotIt;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PasskeyEnrollmentEvent {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent$CreatePasskey;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent;", "Landroid/content/Context;", "activityContext", "", "publicCredential", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "component1", "()Landroid/content/Context;", "component2", "()Ljava/lang/String;", "copy", "(Landroid/content/Context;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent$CreatePasskey;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/content/Context;", "getActivityContext", "Ljava/lang/String;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreatePasskey implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent {
        public static final int $stable = 8;
        private final android.content.Context activityContext;
        private final java.lang.String publicCredential;

        public CreatePasskey(android.content.Context context, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            this.activityContext = context;
            this.publicCredential = str;
        }

        public /* synthetic */ CreatePasskey(android.content.Context context, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreatePasskey(activityContext=");
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
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey createPasskey = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.activityContext, createPasskey.activityContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, createPasskey.publicCredential);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey copy(android.content.Context activityContext, java.lang.String publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
            return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey(activityContext, publicCredential);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        /* renamed from: component1, reason: from getter */
        public final android.content.Context getActivityContext() {
            return this.activityContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey copy$default(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey createPasskey, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = createPasskey.activityContext;
            }
            if ((i & 2) != 0) {
                str = createPasskey.publicCredential;
            }
            return createPasskey.copy(context, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent$DismissGotIt;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissGotIt implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissGotIt INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissGotIt();

        public final int hashCode() {
            return -245316507;
        }

        private DismissGotIt() {
        }

        public final java.lang.String toString() {
            return "DismissGotIt";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissGotIt)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent$DismissBannerError;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissBannerError implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissBannerError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissBannerError();

        public final int hashCode() {
            return -2146092726;
        }

        private DismissBannerError() {
        }

        public final java.lang.String toString() {
            return "DismissBannerError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissBannerError)) {
                return false;
            }
            return true;
        }
    }
}
