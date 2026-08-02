package com.paypal.oslo.core.userstore.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/UserState;", "", "LoggedOut", "LoggingIn", "LoggedIn", "ProfileLoading", "ProfileLoaded", "ProfileError", "Lcom/paypal/oslo/core/userstore/model/UserState$LoggedIn;", "Lcom/paypal/oslo/core/userstore/model/UserState$LoggedOut;", "Lcom/paypal/oslo/core/userstore/model/UserState$LoggingIn;", "Lcom/paypal/oslo/core/userstore/model/UserState$ProfileError;", "Lcom/paypal/oslo/core/userstore/model/UserState$ProfileLoaded;", "Lcom/paypal/oslo/core/userstore/model/UserState$ProfileLoading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/UserState$LoggedOut;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoggedOut implements com.paypal.oslo.core.userstore.model.UserState {
        public static final com.paypal.oslo.core.userstore.model.UserState.LoggedOut INSTANCE = new com.paypal.oslo.core.userstore.model.UserState.LoggedOut();

        public final int hashCode() {
            return -203527439;
        }

        private LoggedOut() {
        }

        public final java.lang.String toString() {
            return "LoggedOut";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/UserState$LoggingIn;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoggingIn implements com.paypal.oslo.core.userstore.model.UserState {
        public static final com.paypal.oslo.core.userstore.model.UserState.LoggingIn INSTANCE = new com.paypal.oslo.core.userstore.model.UserState.LoggingIn();

        public final int hashCode() {
            return -199513751;
        }

        private LoggingIn() {
        }

        public final java.lang.String toString() {
            return "LoggingIn";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.model.UserState.LoggingIn)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/UserState$LoggedIn;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoggedIn implements com.paypal.oslo.core.userstore.model.UserState {
        public static final com.paypal.oslo.core.userstore.model.UserState.LoggedIn INSTANCE = new com.paypal.oslo.core.userstore.model.UserState.LoggedIn();

        public final int hashCode() {
            return -6565598;
        }

        private LoggedIn() {
        }

        public final java.lang.String toString() {
            return "LoggedIn";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedIn)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/UserState$ProfileLoading;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProfileLoading implements com.paypal.oslo.core.userstore.model.UserState {
        public static final com.paypal.oslo.core.userstore.model.UserState.ProfileLoading INSTANCE = new com.paypal.oslo.core.userstore.model.UserState.ProfileLoading();

        public final int hashCode() {
            return 608029166;
        }

        private ProfileLoading() {
        }

        public final java.lang.String toString() {
            return "ProfileLoading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/UserState$ProfileLoaded;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "Lcom/paypal/oslo/core/userstore/model/User;", "user", "Lcom/paypal/oslo/core/userstore/model/ProfileIntent;", "intent", "<init>", "(Lcom/paypal/oslo/core/userstore/model/User;Lcom/paypal/oslo/core/userstore/model/ProfileIntent;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/User;", "component2", "()Lcom/paypal/oslo/core/userstore/model/ProfileIntent;", "copy", "(Lcom/paypal/oslo/core/userstore/model/User;Lcom/paypal/oslo/core/userstore/model/ProfileIntent;)Lcom/paypal/oslo/core/userstore/model/UserState$ProfileLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/model/User;", "getUser", "Lcom/paypal/oslo/core/userstore/model/ProfileIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProfileLoaded implements com.paypal.oslo.core.userstore.model.UserState {
        private final com.paypal.oslo.core.userstore.model.ProfileIntent intent;
        private final com.paypal.oslo.core.userstore.model.User user;

        public ProfileLoaded(com.paypal.oslo.core.userstore.model.User user, com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
            this.user = user;
            this.intent = profileIntent;
        }

        public /* synthetic */ ProfileLoaded(com.paypal.oslo.core.userstore.model.User user, com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(user, (i & 2) != 0 ? null : profileIntent);
        }

        public final com.paypal.oslo.core.userstore.model.User getUser() {
            return this.user;
        }

        public final com.paypal.oslo.core.userstore.model.ProfileIntent getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.userstore.model.User user = this.user;
            com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileLoaded(user=");
            sb.append(user);
            sb.append(", intent=");
            sb.append(profileIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.user.hashCode();
            com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent = this.intent;
            return (hashCode * 31) + (profileIntent == null ? 0 : profileIntent.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
                return false;
            }
            com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.user, profileLoaded.user) && this.intent == profileLoaded.intent;
        }

        public final com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded copy(com.paypal.oslo.core.userstore.model.User user, com.paypal.oslo.core.userstore.model.ProfileIntent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
            return new com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded(user, intent);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.model.ProfileIntent getIntent() {
            return this.intent;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.userstore.model.User getUser() {
            return this.user;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded copy$default(com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded, com.paypal.oslo.core.userstore.model.User user, com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                user = profileLoaded.user;
            }
            if ((i & 2) != 0) {
                profileIntent = profileLoaded.intent;
            }
            return profileLoaded.copy(user, profileIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/UserState$ProfileError;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/core/userstore/model/UserState$ProfileError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProfileError implements com.paypal.oslo.core.userstore.model.UserState {
        private final java.lang.Throwable cause;

        public ProfileError(java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.cause = th;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileError(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.core.userstore.model.UserState.ProfileError) other).cause);
        }

        public final com.paypal.oslo.core.userstore.model.UserState.ProfileError copy(java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.core.userstore.model.UserState.ProfileError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.model.UserState.ProfileError copy$default(com.paypal.oslo.core.userstore.model.UserState.ProfileError profileError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = profileError.cause;
            }
            return profileError.copy(th);
        }
    }
}
