package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent;", "", "NavigateToConfirmation", "NavigateToFullScreenError", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent$NavigateToConfirmation;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent$NavigateToFullScreenError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AddEditEmailEvent {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent$NavigateToConfirmation;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent;", "", "emailId", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "makePrimary", "replaceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent$NavigateToConfirmation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmailId", "getEmailAddress", "Z", "getMakePrimary", "getReplaceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToConfirmation implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent {
        public static final int $stable = 0;
        private final java.lang.String emailAddress;
        private final java.lang.String emailId;
        private final boolean makePrimary;
        private final java.lang.String replaceId;

        public NavigateToConfirmation(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.emailId = str;
            this.emailAddress = str2;
            this.makePrimary = z;
            this.replaceId = str3;
        }

        public /* synthetic */ NavigateToConfirmation(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, (i & 8) != 0 ? null : str3);
        }

        public final java.lang.String getEmailId() {
            return this.emailId;
        }

        public final java.lang.String getEmailAddress() {
            return this.emailAddress;
        }

        public final boolean getMakePrimary() {
            return this.makePrimary;
        }

        public final java.lang.String getReplaceId() {
            return this.replaceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.emailId;
            java.lang.String str2 = this.emailAddress;
            boolean z = this.makePrimary;
            java.lang.String str3 = this.replaceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToConfirmation(emailId=");
            sb.append(str);
            sb.append(", emailAddress=");
            sb.append(str2);
            sb.append(", makePrimary=");
            sb.append(z);
            sb.append(", replaceId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.emailId.hashCode();
            int hashCode2 = this.emailAddress.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.makePrimary);
            java.lang.String str = this.replaceId;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation navigateToConfirmation = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.emailId, navigateToConfirmation.emailId) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, navigateToConfirmation.emailAddress) && this.makePrimary == navigateToConfirmation.makePrimary && kotlin.jvm.internal.Intrinsics.areEqual(this.replaceId, navigateToConfirmation.replaceId);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation copy(java.lang.String emailId, java.lang.String emailAddress, boolean makePrimary, java.lang.String replaceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation(emailId, emailAddress, makePrimary, replaceId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getReplaceId() {
            return this.replaceId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMakePrimary() {
            return this.makePrimary;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEmailAddress() {
            return this.emailAddress;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmailId() {
            return this.emailId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation navigateToConfirmation, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToConfirmation.emailId;
            }
            if ((i & 2) != 0) {
                str2 = navigateToConfirmation.emailAddress;
            }
            if ((i & 4) != 0) {
                z = navigateToConfirmation.makePrimary;
            }
            if ((i & 8) != 0) {
                str3 = navigateToConfirmation.replaceId;
            }
            return navigateToConfirmation.copy(str, str2, z, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent$NavigateToFullScreenError;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "strategy", "<init>", "(Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "copy", "(Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent$NavigateToFullScreenError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "getStrategy"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToFullScreenError implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen strategy;

        public NavigateToFullScreenError(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen fullScreen) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullScreen, "");
            this.strategy = fullScreen;
        }

        public final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen getStrategy() {
            return this.strategy;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen fullScreen = this.strategy;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToFullScreenError(strategy=");
            sb.append(fullScreen);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.strategy.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToFullScreenError) && kotlin.jvm.internal.Intrinsics.areEqual(this.strategy, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToFullScreenError) other).strategy);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToFullScreenError copy(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen strategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToFullScreenError(strategy);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen getStrategy() {
            return this.strategy;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToFullScreenError copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToFullScreenError navigateToFullScreenError, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen fullScreen, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullScreen = navigateToFullScreenError.strategy;
            }
            return navigateToFullScreenError.copy(fullScreen);
        }
    }
}
