package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005"}, d2 = {"Lcom/zettle/sdk/core/auth/User;", "", "AuthState", "Info", "PaymentInfo", "ProfileImageUrl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface User {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/core/auth/User$Info;", "", "Lcom/zettle/sdk/core/user/CountryCode;", "getCountry", "()Lcom/zettle/sdk/core/user/CountryCode;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Lcom/zettle/sdk/core/user/CurrencyCode;", "getCurrency", "()Lcom/zettle/sdk/core/user/CurrencyCode;", "currency", "Lcom/zettle/sdk/core/auth/User$ProfileImageUrl;", "getImageUrl", "()Lcom/zettle/sdk/core/auth/User$ProfileImageUrl;", "imageUrl", "", "getOrganizationId", "()Ljava/lang/String;", "organizationId", "getPublicName", "publicName", "getUserId", "userId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Info {
        com.zettle.sdk.core.user.CountryCode getCountry();

        com.zettle.sdk.core.user.CurrencyCode getCurrency();

        com.zettle.sdk.core.auth.User.ProfileImageUrl getImageUrl();

        java.lang.String getOrganizationId();

        java.lang.String getPublicName();

        java.lang.String getUserId();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/core/auth/User$PaymentInfo;", "", "Lcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;", "getGratuityPercentageConfiguration", "()Lcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;", "gratuityPercentageConfiguration"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PaymentInfo {
        com.zettle.sdk.core.payment.GratuityPercentageConfiguration getGratuityPercentageConfiguration();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/core/auth/User$ProfileImageUrl;", "", "", "getLarge", "()Ljava/lang/String;", com.adjust.sdk.Constants.LARGE, "getMedium", "medium", "getSmall", com.adjust.sdk.Constants.SMALL}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ProfileImageUrl {
        java.lang.String getLarge();

        java.lang.String getMedium();

        java.lang.String getSmall();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/core/auth/User$AuthState;", "", "<init>", "()V", "Initial", "LoggedIn", "LoggedOut", "LoggingIn", "Lcom/zettle/sdk/core/auth/User$AuthState$Initial;", "Lcom/zettle/sdk/core/auth/User$AuthState$LoggedIn;", "Lcom/zettle/sdk/core/auth/User$AuthState$LoggedOut;", "Lcom/zettle/sdk/core/auth/User$AuthState$LoggingIn;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AuthState {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/auth/User$AuthState$Initial;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Initial extends com.zettle.sdk.core.auth.User.AuthState {
            public static final com.zettle.sdk.core.auth.User.AuthState.Initial INSTANCE = new com.zettle.sdk.core.auth.User.AuthState.Initial();

            private Initial() {
                super(null);
            }
        }

        private AuthState() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/auth/User$AuthState$LoggedOut;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LoggedOut extends com.zettle.sdk.core.auth.User.AuthState {
            public static final com.zettle.sdk.core.auth.User.AuthState.LoggedOut INSTANCE = new com.zettle.sdk.core.auth.User.AuthState.LoggedOut();

            private LoggedOut() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/auth/User$AuthState$LoggingIn;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LoggingIn extends com.zettle.sdk.core.auth.User.AuthState {
            public static final com.zettle.sdk.core.auth.User.AuthState.LoggingIn INSTANCE = new com.zettle.sdk.core.auth.User.AuthState.LoggingIn();

            private LoggingIn() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/core/auth/User$AuthState$LoggedIn;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "Lcom/zettle/sdk/core/auth/User$Info;", "info", "Lcom/zettle/sdk/core/auth/User$PaymentInfo;", "paymentInfo", "<init>", "(Lcom/zettle/sdk/core/auth/User$Info;Lcom/zettle/sdk/core/auth/User$PaymentInfo;)V", "component1", "()Lcom/zettle/sdk/core/auth/User$Info;", "component2", "()Lcom/zettle/sdk/core/auth/User$PaymentInfo;", "copy", "(Lcom/zettle/sdk/core/auth/User$Info;Lcom/zettle/sdk/core/auth/User$PaymentInfo;)Lcom/zettle/sdk/core/auth/User$AuthState$LoggedIn;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/core/auth/User$Info;", "getInfo", "Lcom/zettle/sdk/core/auth/User$PaymentInfo;", "getPaymentInfo"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class LoggedIn extends com.zettle.sdk.core.auth.User.AuthState {
            private final com.zettle.sdk.core.auth.User.Info info;
            private final com.zettle.sdk.core.auth.User.PaymentInfo paymentInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoggedIn(com.zettle.sdk.core.auth.User.Info info, com.zettle.sdk.core.auth.User.PaymentInfo paymentInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
                this.info = info;
                this.paymentInfo = paymentInfo;
            }

            public final com.zettle.sdk.core.auth.User.Info getInfo() {
                return this.info;
            }

            public final com.zettle.sdk.core.auth.User.PaymentInfo getPaymentInfo() {
                return this.paymentInfo;
            }

            public final java.lang.String toString() {
                com.zettle.sdk.core.auth.User.Info info = this.info;
                com.zettle.sdk.core.auth.User.PaymentInfo paymentInfo = this.paymentInfo;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LoggedIn(info=");
                sb.append(info);
                sb.append(", paymentInfo=");
                sb.append(paymentInfo);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.info.hashCode();
                com.zettle.sdk.core.auth.User.PaymentInfo paymentInfo = this.paymentInfo;
                return (hashCode * 31) + (paymentInfo == null ? 0 : paymentInfo.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.zettle.sdk.core.auth.User.AuthState.LoggedIn)) {
                    return false;
                }
                com.zettle.sdk.core.auth.User.AuthState.LoggedIn loggedIn = (com.zettle.sdk.core.auth.User.AuthState.LoggedIn) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.info, loggedIn.info) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentInfo, loggedIn.paymentInfo);
            }

            public final com.zettle.sdk.core.auth.User.AuthState.LoggedIn copy(com.zettle.sdk.core.auth.User.Info info, com.zettle.sdk.core.auth.User.PaymentInfo paymentInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
                return new com.zettle.sdk.core.auth.User.AuthState.LoggedIn(info, paymentInfo);
            }

            /* renamed from: component2, reason: from getter */
            public final com.zettle.sdk.core.auth.User.PaymentInfo getPaymentInfo() {
                return this.paymentInfo;
            }

            /* renamed from: component1, reason: from getter */
            public final com.zettle.sdk.core.auth.User.Info getInfo() {
                return this.info;
            }

            public static /* synthetic */ com.zettle.sdk.core.auth.User.AuthState.LoggedIn copy$default(com.zettle.sdk.core.auth.User.AuthState.LoggedIn loggedIn, com.zettle.sdk.core.auth.User.Info info, com.zettle.sdk.core.auth.User.PaymentInfo paymentInfo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    info = loggedIn.info;
                }
                if ((i & 2) != 0) {
                    paymentInfo = loggedIn.paymentInfo;
                }
                return loggedIn.copy(info, paymentInfo);
            }
        }

        public /* synthetic */ AuthState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
