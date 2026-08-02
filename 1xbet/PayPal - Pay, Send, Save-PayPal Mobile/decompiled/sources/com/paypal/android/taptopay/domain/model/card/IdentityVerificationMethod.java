package com.paypal.android.taptopay.domain.model.card;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "AppToApp", "CallCustomerService", "OtpEmail", "OtpSms", "Website", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$AppToApp;", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$CallCustomerService;", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$OtpEmail;", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$OtpSms;", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$Website;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class IdentityVerificationMethod {
    private final java.lang.String id;

    private IdentityVerificationMethod(java.lang.String str) {
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$OtpSms;", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OtpSms extends com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod {
        private final java.lang.String phoneNumber;

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtpSms(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.phoneNumber = str2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$OtpEmail;", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getEmailAddress", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OtpEmail extends com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod {
        private final java.lang.String emailAddress;

        public final java.lang.String getEmailAddress() {
            return this.emailAddress;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtpEmail(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.emailAddress = str2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$Website;", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Website extends com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod {
        private final java.lang.String url;

        public final java.lang.String getUrl() {
            return this.url;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Website(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.url = str2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$CallCustomerService;", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallCustomerService extends com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod {
        private final java.lang.String phoneNumber;

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallCustomerService(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.phoneNumber = str2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod$AppToApp;", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod;", "", "id", "appName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AppToApp extends com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod {
        private final java.lang.String appName;

        public final java.lang.String getAppName() {
            return this.appName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppToApp(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.appName = str2;
        }
    }

    public /* synthetic */ IdentityVerificationMethod(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
