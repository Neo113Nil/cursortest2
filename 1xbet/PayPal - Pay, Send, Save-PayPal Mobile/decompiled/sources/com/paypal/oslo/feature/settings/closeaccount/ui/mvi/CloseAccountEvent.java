package com.paypal.oslo.feature.settings.closeaccount.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "UserIntent", "SystemEvent", "DataEvent", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CloseAccountEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;

    private CloseAccountEvent() {
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "CloseAccountEvent" : simpleName;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent;", "<init>", "()V", "OnBackPressed", "OnClosePressed", "OnLinkPressed", "OnContinuePressed", "OnCanceledPressed", "OnCloseAccountClicked", "OnFeedbackChanged", "OnReasonToggled", "OnReasonForClosingChanged", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnBackPressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnCanceledPressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnCloseAccountClicked;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnClosePressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnContinuePressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnFeedbackChanged;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnLinkPressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnReasonForClosingChanged;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnReasonToggled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UserIntent extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnBackPressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnBackPressed extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnBackPressed INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnBackPressed();

            public final int hashCode() {
                return -1393345881;
            }

            private OnBackPressed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "OnBackPressed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnBackPressed)) {
                    return false;
                }
                return true;
            }
        }

        private UserIntent() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnClosePressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnClosePressed extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnClosePressed INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnClosePressed();

            public final int hashCode() {
                return 148696862;
            }

            private OnClosePressed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "OnClosePressed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnClosePressed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnLinkPressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/LinkDestination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/LinkDestination;)V", "component1", "()Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/LinkDestination;", "copy", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/LinkDestination;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnLinkPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/LinkDestination;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnLinkPressed extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination destination;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLinkPressed(com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination linkDestination) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkDestination, "");
                this.destination = linkDestination;
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination getDestination() {
                return this.destination;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination linkDestination = this.destination;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLinkPressed(destination=");
                sb.append(linkDestination);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.destination.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed) other).destination);
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed copy(com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination destination) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed(destination);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination getDestination() {
                return this.destination;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed onLinkPressed, com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination linkDestination, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    linkDestination = onLinkPressed.destination;
                }
                return onLinkPressed.copy(linkDestination);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnContinuePressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnContinuePressed extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnContinuePressed INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnContinuePressed();

            public final int hashCode() {
                return -1728887577;
            }

            private OnContinuePressed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "OnContinuePressed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnContinuePressed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnCanceledPressed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnCanceledPressed extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCanceledPressed INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCanceledPressed();

            public final int hashCode() {
                return -742885195;
            }

            private OnCanceledPressed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "OnCanceledPressed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCanceledPressed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnCloseAccountClicked;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnCloseAccountClicked extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCloseAccountClicked INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCloseAccountClicked();

            public final int hashCode() {
                return -2015761730;
            }

            private OnCloseAccountClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "OnCloseAccountClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCloseAccountClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnFeedbackChanged;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnFeedbackChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnFeedbackChanged extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent {
            public static final int $stable = 0;
            private final java.lang.String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFeedbackChanged(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.value = str;
            }

            public final java.lang.String getValue() {
                return this.value;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.value;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFeedbackChanged(value=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnFeedbackChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnFeedbackChanged) other).value);
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnFeedbackChanged copy(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnFeedbackChanged(value);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getValue() {
                return this.value;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnFeedbackChanged copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnFeedbackChanged onFeedbackChanged, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = onFeedbackChanged.value;
                }
                return onFeedbackChanged.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnReasonToggled;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "", "reason", "", com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnReasonToggled;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "Z", "getSelected"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnReasonToggled extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent {
            public static final int $stable = 0;
            private final java.lang.String reason;
            private final boolean selected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnReasonToggled(java.lang.String str, boolean z) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
                this.selected = z;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final boolean getSelected() {
                return this.selected;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.reason;
                boolean z = this.selected;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnReasonToggled(reason=");
                sb.append(str);
                sb.append(", selected=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.reason.hashCode() * 31) + java.lang.Boolean.hashCode(this.selected);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled onReasonToggled = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, onReasonToggled.reason) && this.selected == onReasonToggled.selected;
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled copy(java.lang.String reason, boolean selected) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled(reason, selected);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getSelected() {
                return this.selected;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled onReasonToggled, java.lang.String str, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = onReasonToggled.reason;
                }
                if ((i & 2) != 0) {
                    z = onReasonToggled.selected;
                }
                return onReasonToggled.copy(str, z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnReasonForClosingChanged;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent$OnReasonForClosingChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnReasonForClosingChanged extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent {
            public static final int $stable = 0;
            private final java.lang.String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnReasonForClosingChanged(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.value = str;
            }

            public final java.lang.String getValue() {
                return this.value;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.value;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnReasonForClosingChanged(value=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonForClosingChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonForClosingChanged) other).value);
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonForClosingChanged copy(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonForClosingChanged(value);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getValue() {
                return this.value;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonForClosingChanged copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonForClosingChanged onReasonForClosingChanged, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = onReasonForClosingChanged.value;
                }
                return onReasonForClosingChanged.copy(str);
            }
        }

        public /* synthetic */ UserIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent;", "<init>", "()V", "LoadCloseAccount", com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.OPERATION_NAME, "LoadBusinessStepContent", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent$CloseAccount;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent$LoadBusinessStepContent;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent$LoadCloseAccount;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class SystemEvent extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent$LoadCloseAccount;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LoadCloseAccount extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadCloseAccount INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadCloseAccount();

            public final int hashCode() {
                return -1380935056;
            }

            private LoadCloseAccount() {
                super(null);
            }

            public final java.lang.String toString() {
                return "LoadCloseAccount";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadCloseAccount)) {
                    return false;
                }
                return true;
            }
        }

        private SystemEvent() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent$CloseAccount;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CloseAccount extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.CloseAccount INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.CloseAccount();

            public final int hashCode() {
                return -836854550;
            }

            private CloseAccount() {
                super(null);
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.OPERATION_NAME;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.CloseAccount)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent$LoadBusinessStepContent;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent;", "", "step", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$SystemEvent$LoadBusinessStepContent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LoadBusinessStepContent extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent {
            public static final int $stable = 0;
            private final int step;

            public LoadBusinessStepContent(int i) {
                super(null);
                this.step = i;
            }

            public final int getStep() {
                return this.step;
            }

            public final java.lang.String toString() {
                int i = this.step;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadBusinessStepContent(step=");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Integer.hashCode(this.step);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent) && this.step == ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent) other).step;
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent copy(int step) {
                return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent(step);
            }

            /* renamed from: component1, reason: from getter */
            public final int getStep() {
                return this.step;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent loadBusinessStepContent, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = loadBusinessStepContent.step;
                }
                return loadBusinessStepContent.copy(i);
            }
        }

        public /* synthetic */ SystemEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent;", "<init>", "()V", "EligibilityError", "ScreenContentReady", "StepContentReady", "CloseAccountSucceeded", "CloseAccountFailed", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$CloseAccountFailed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$CloseAccountSucceeded;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$EligibilityError;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$ScreenContentReady;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$StepContentReady;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class DataEvent extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$EligibilityError;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "error", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;)V", "component1", "()Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "copy", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$EligibilityError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EligibilityError extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EligibilityError(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError closeAccountError) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountError, "");
                this.error = closeAccountError;
            }

            public final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError closeAccountError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityError(error=");
                sb.append(closeAccountError);
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
                return (other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.EligibilityError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.EligibilityError) other).error);
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.EligibilityError copy(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.EligibilityError(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.EligibilityError copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.EligibilityError eligibilityError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError closeAccountError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    closeAccountError = eligibilityError.error;
                }
                return eligibilityError.copy(closeAccountError);
            }
        }

        private DataEvent() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$ScreenContentReady;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent;", "", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiItem;", "content", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "footer", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$ScreenContentReady;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContent", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "getFooter"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ScreenContentReady extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> content;
            private final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ScreenContentReady(java.util.List<? extends com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> list, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.content = list;
                this.footer = closeAccountUiFooter;
            }

            public /* synthetic */ ScreenContentReady(java.util.List list, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : closeAccountUiFooter);
            }

            public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> getContent() {
                return this.content;
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter getFooter() {
                return this.footer;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> list = this.content;
                com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter = this.footer;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenContentReady(content=");
                sb.append(list);
                sb.append(", footer=");
                sb.append(closeAccountUiFooter);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.content.hashCode();
                com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter = this.footer;
                return (hashCode * 31) + (closeAccountUiFooter == null ? 0 : closeAccountUiFooter.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady screenContentReady = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.content, screenContentReady.content) && kotlin.jvm.internal.Intrinsics.areEqual(this.footer, screenContentReady.footer);
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady copy(java.util.List<? extends com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> content, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
                return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady(content, footer);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter getFooter() {
                return this.footer;
            }

            public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> component1() {
                return this.content;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady screenContentReady, java.util.List list, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = screenContentReady.content;
                }
                if ((i & 2) != 0) {
                    closeAccountUiFooter = screenContentReady.footer;
                }
                return screenContentReady.copy(list, closeAccountUiFooter);
            }
        }

        @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$StepContentReady;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent;", "", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiItem;", "content", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "footer", "", "step", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;I)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "component3", "()I", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;I)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$StepContentReady;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContent", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "getFooter", com.visa.cbp.getEncExpo.warmup, "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StepContentReady extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> content;
            private final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer;
            private final int step;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public StepContentReady(java.util.List<? extends com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> list, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, int i) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.content = list;
                this.footer = closeAccountUiFooter;
                this.step = i;
            }

            public /* synthetic */ StepContentReady(java.util.List list, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i2 & 2) != 0 ? null : closeAccountUiFooter, i);
            }

            public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> getContent() {
                return this.content;
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter getFooter() {
                return this.footer;
            }

            public final int getStep() {
                return this.step;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> list = this.content;
                com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter = this.footer;
                int i = this.step;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("StepContentReady(content=");
                sb.append(list);
                sb.append(", footer=");
                sb.append(closeAccountUiFooter);
                sb.append(", step=");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.content.hashCode();
                com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter = this.footer;
                return (((hashCode * 31) + (closeAccountUiFooter == null ? 0 : closeAccountUiFooter.hashCode())) * 31) + java.lang.Integer.hashCode(this.step);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady stepContentReady = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.content, stepContentReady.content) && kotlin.jvm.internal.Intrinsics.areEqual(this.footer, stepContentReady.footer) && this.step == stepContentReady.step;
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady copy(java.util.List<? extends com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> content, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer, int step) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
                return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady(content, footer, step);
            }

            /* renamed from: component3, reason: from getter */
            public final int getStep() {
                return this.step;
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter getFooter() {
                return this.footer;
            }

            public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> component1() {
                return this.content;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady stepContentReady, java.util.List list, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    list = stepContentReady.content;
                }
                if ((i2 & 2) != 0) {
                    closeAccountUiFooter = stepContentReady.footer;
                }
                if ((i2 & 4) != 0) {
                    i = stepContentReady.step;
                }
                return stepContentReady.copy(list, closeAccountUiFooter, i);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$CloseAccountSucceeded;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CloseAccountSucceeded extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountSucceeded INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountSucceeded();

            public final int hashCode() {
                return -1159643716;
            }

            private CloseAccountSucceeded() {
                super(null);
            }

            public final java.lang.String toString() {
                return "CloseAccountSucceeded";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountSucceeded)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$CloseAccountFailed;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "error", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;)V", "component1", "()Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "copy", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$DataEvent$CloseAccountFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CloseAccountFailed extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CloseAccountFailed(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError closeAccountError) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountError, "");
                this.error = closeAccountError;
            }

            public final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError closeAccountError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountFailed(error=");
                sb.append(closeAccountError);
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
                return (other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountFailed) other).error);
            }

            public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountFailed copy(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountFailed(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountFailed copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountFailed closeAccountFailed, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError closeAccountError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    closeAccountError = closeAccountFailed.error;
                }
                return closeAccountFailed.copy(closeAccountError);
            }
        }

        public /* synthetic */ DataEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CloseAccountEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
