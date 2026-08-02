package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent;", "", "ConfirmationSuccess", "NavigateToFullScreenError", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent$ConfirmationSuccess;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent$NavigateToFullScreenError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConfirmEmailEvent {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent$ConfirmationSuccess;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "email", "<init>", "(Lcom/paypal/oslo/core/userstore/model/ProfileEmail;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "copy", "(Lcom/paypal/oslo/core/userstore/model/ProfileEmail;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent$ConfirmationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "getEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmationSuccess implements com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.userstore.model.ProfileEmail email;

        public ConfirmationSuccess(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileEmail, "");
            this.email = profileEmail;
        }

        public final com.paypal.oslo.core.userstore.model.ProfileEmail getEmail() {
            return this.email;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = this.email;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmationSuccess(email=");
            sb.append(profileEmail);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.email.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess) other).email);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess copy(com.paypal.oslo.core.userstore.model.ProfileEmail email) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess(email);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.userstore.model.ProfileEmail getEmail() {
            return this.email;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess confirmationSuccess, com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profileEmail = confirmationSuccess.email;
            }
            return confirmationSuccess.copy(profileEmail);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent$NavigateToFullScreenError;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "strategy", "<init>", "(Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "copy", "(Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent$NavigateToFullScreenError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "getStrategy"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToFullScreenError implements com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent {
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
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError) && kotlin.jvm.internal.Intrinsics.areEqual(this.strategy, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError) other).strategy);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError copy(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen strategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError(strategy);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen getStrategy() {
            return this.strategy;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError navigateToFullScreenError, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen fullScreen, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullScreen = navigateToFullScreenError.strategy;
            }
            return navigateToFullScreenError.copy(fullScreen);
        }
    }
}
