package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState;", "", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState$Error;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState$Loading;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface EmailConfirmationInitState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState$Loading;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Loading INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Loading();

        public final int hashCode() {
            return 372417569;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState$Success;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Success INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Success();

        public final int hashCode() {
            return -1831402776;
        }

        private Success() {
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState$Error;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState;", "", "title", "message", "buttonText", "", "retryable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getMessage", "getButtonText", "Z", "getRetryable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState {
        public static final int $stable = 0;
        private final java.lang.String buttonText;
        private final java.lang.String message;
        private final boolean retryable;
        private final java.lang.String title;

        public Error(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.title = str;
            this.message = str2;
            this.buttonText = str3;
            this.retryable = z;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? true : z);
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getButtonText() {
            return this.buttonText;
        }

        public final boolean getRetryable() {
            return this.retryable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.message;
            java.lang.String str3 = this.buttonText;
            boolean z = this.retryable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(title=");
            sb.append(str);
            sb.append(", message=");
            sb.append(str2);
            sb.append(", buttonText=");
            sb.append(str3);
            sb.append(", retryable=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + java.lang.Boolean.hashCode(this.retryable);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error error = (com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, error.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, error.buttonText) && this.retryable == error.retryable;
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error copy(java.lang.String title, java.lang.String message, java.lang.String buttonText, boolean retryable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error(title, message, buttonText, retryable);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getRetryable() {
            return this.retryable;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error error, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.title;
            }
            if ((i & 2) != 0) {
                str2 = error.message;
            }
            if ((i & 4) != 0) {
                str3 = error.buttonText;
            }
            if ((i & 8) != 0) {
                z = error.retryable;
            }
            return error.copy(str, str2, str3, z);
        }
    }
}
