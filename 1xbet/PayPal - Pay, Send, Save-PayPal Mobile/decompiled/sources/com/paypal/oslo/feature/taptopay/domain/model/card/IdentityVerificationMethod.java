package com.paypal.oslo.feature.taptopay.domain.model.card;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "OtpSms", "OtpEmail", "Website", "CallCustomerService", "AppToApp", "Emv3ds", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$AppToApp;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$CallCustomerService;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$Emv3ds;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$OtpEmail;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$OtpSms;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$Website;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class IdentityVerificationMethod {
    public static final int $stable = 0;
    private final java.lang.String id;

    private IdentityVerificationMethod(java.lang.String str) {
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$OtpSms;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OtpSms extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtpSms(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.phoneNumber = str2;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$OtpEmail;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getEmailAddress", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OtpEmail extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod {
        public static final int $stable = 0;
        private final java.lang.String emailAddress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtpEmail(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.emailAddress = str2;
        }

        public final java.lang.String getEmailAddress() {
            return this.emailAddress;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$Website;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Website extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Website(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.url = str2;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$CallCustomerService;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CallCustomerService extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallCustomerService(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.phoneNumber = str2;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$AppToApp;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", "appName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AppToApp extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod {
        public static final int $stable = 0;
        private final java.lang.String appName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppToApp(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.appName = str2;
        }

        public final java.lang.String getAppName() {
            return this.appName;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod$Emv3ds;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Emv3ds extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Emv3ds(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.url = str2;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }
    }

    public boolean equals(java.lang.Object other) {
        boolean z;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        java.lang.String str = this.id;
        com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod = other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod ? (com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod) other : null;
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(str, identityVerificationMethod != null ? identityVerificationMethod.id : null);
        if (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpSms) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
            z = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpSms) this).getPhoneNumber(), ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpSms) other).getPhoneNumber());
        } else if (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.AppToApp) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
            z = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.AppToApp) this).getAppName(), ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.AppToApp) other).getAppName());
        } else if (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.CallCustomerService) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
            z = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.CallCustomerService) this).getPhoneNumber(), ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.CallCustomerService) other).getPhoneNumber());
        } else if (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
            z = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpEmail) this).getEmailAddress(), ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpEmail) other).getEmailAddress());
        } else if (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Website) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
            z = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Website) this).getUrl(), ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Website) other).getUrl());
        } else if (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Emv3ds) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
            z = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Emv3ds) this).getUrl(), ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Emv3ds) other).getUrl());
        } else {
            z = false;
        }
        return areEqual && z;
    }

    public int hashCode() {
        java.lang.String url;
        java.lang.String simpleName = getClass().getSimpleName();
        java.lang.String str = this.id;
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpSms) {
            url = ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpSms) this).getPhoneNumber();
        } else if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.AppToApp) {
            url = ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.AppToApp) this).getAppName();
        } else if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.CallCustomerService) {
            url = ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.CallCustomerService) this).getPhoneNumber();
        } else if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpEmail) {
            url = ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpEmail) this).getEmailAddress();
        } else if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Website) {
            url = ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Website) this).getUrl();
        } else {
            if (!(this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Emv3ds)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            url = ((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Emv3ds) this).getUrl();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleName);
        sb.append(str);
        sb.append(url);
        return sb.toString().hashCode();
    }

    public /* synthetic */ IdentityVerificationMethod(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
