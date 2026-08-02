package com.paypal.oslo.feature.publicprofile.ui.publicprofile.event;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0016\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0016 !\"#$%&'()*+,-./012345"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnLoad", "OnMoreOptionsClicked", "OnRemoveClicked", "OnReportClicked", "OnBlockClicked", "OnUnblockClicked", "OnRemoveConfirmed", "OnReportConfirmed", "OnBlockConfirmed", "OnUnblockConfirmed", "OnFavoriteClicked", "OnOperationErrorDismissed", "DataLoaded", "LoadFailed", "FavoriteToggled", "FavoriteToggleFailed", "RemoveContactSucceeded", "RemoveContactFailed", "BlockContactSucceeded", "BlockContactFailed", "UnblockContactSucceeded", "UnblockContactFailed", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$BlockContactFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$BlockContactSucceeded;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$DataLoaded;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$FavoriteToggleFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$FavoriteToggled;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$LoadFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnBlockClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnBlockConfirmed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnFavoriteClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnLoad;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnMoreOptionsClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnOperationErrorDismissed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnRemoveClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnRemoveConfirmed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnReportClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnReportConfirmed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnUnblockClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnUnblockConfirmed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$RemoveContactFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$RemoveContactSucceeded;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$UnblockContactFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$UnblockContactSucceeded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PublicProfileEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnLoad;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "", "accountId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnLoad;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", "getContactId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoad extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final java.lang.String accountId;
        private final java.lang.String contactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoad(java.lang.String str, java.lang.String str2) {
            super("OnLoad", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.accountId = str;
            this.contactId = str2;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.String str2 = this.contactId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoad(accountId=");
            sb.append(str);
            sb.append(", contactId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.accountId.hashCode() * 31) + this.contactId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad onLoad = (com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, onLoad.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, onLoad.contactId);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad copy(java.lang.String accountId, java.lang.String contactId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad(accountId, contactId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContactId() {
            return this.contactId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad onLoad, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onLoad.accountId;
            }
            if ((i & 2) != 0) {
                str2 = onLoad.contactId;
            }
            return onLoad.copy(str, str2);
        }
    }

    private PublicProfileEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnMoreOptionsClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoreOptionsClicked extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnMoreOptionsClicked INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnMoreOptionsClicked();

        public final int hashCode() {
            return -13078572;
        }

        private OnMoreOptionsClicked() {
            super("OnMoreOptionsClicked", null);
        }

        public final java.lang.String toString() {
            return "OnMoreOptionsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnMoreOptionsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnRemoveClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRemoveClicked extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveClicked INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveClicked();

        public final int hashCode() {
            return -700484659;
        }

        private OnRemoveClicked() {
            super("OnRemoveClicked", null);
        }

        public final java.lang.String toString() {
            return "OnRemoveClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnReportClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReportClicked extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnReportClicked INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnReportClicked();

        public final int hashCode() {
            return 1510830365;
        }

        private OnReportClicked() {
            super("OnReportClicked", null);
        }

        public final java.lang.String toString() {
            return "OnReportClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnReportClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnBlockClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBlockClicked extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockClicked INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockClicked();

        public final int hashCode() {
            return -1228064560;
        }

        private OnBlockClicked() {
            super("OnBlockClicked", null);
        }

        public final java.lang.String toString() {
            return "OnBlockClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnUnblockClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUnblockClicked extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockClicked INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockClicked();

        public final int hashCode() {
            return -674790295;
        }

        private OnUnblockClicked() {
            super("OnUnblockClicked", null);
        }

        public final java.lang.String toString() {
            return "OnUnblockClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnRemoveConfirmed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnRemoveConfirmed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContactId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRemoveConfirmed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final java.lang.String contactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRemoveConfirmed(java.lang.String str) {
            super("OnRemoveConfirmed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.contactId = str;
        }

        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contactId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRemoveConfirmed(contactId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contactId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveConfirmed) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveConfirmed) other).contactId);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveConfirmed copy(java.lang.String contactId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveConfirmed(contactId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveConfirmed copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveConfirmed onRemoveConfirmed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onRemoveConfirmed.contactId;
            }
            return onRemoveConfirmed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnReportConfirmed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReportConfirmed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnReportConfirmed INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnReportConfirmed();

        public final int hashCode() {
            return 1369489109;
        }

        private OnReportConfirmed() {
            super("OnReportConfirmed", null);
        }

        public final java.lang.String toString() {
            return "OnReportConfirmed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnReportConfirmed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnBlockConfirmed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnBlockConfirmed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContactId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBlockConfirmed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final java.lang.String contactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBlockConfirmed(java.lang.String str) {
            super("OnBlockConfirmed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.contactId = str;
        }

        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contactId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBlockConfirmed(contactId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contactId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockConfirmed) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockConfirmed) other).contactId);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockConfirmed copy(java.lang.String contactId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockConfirmed(contactId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockConfirmed copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockConfirmed onBlockConfirmed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBlockConfirmed.contactId;
            }
            return onBlockConfirmed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnUnblockConfirmed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnUnblockConfirmed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContactId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUnblockConfirmed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final java.lang.String contactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUnblockConfirmed(java.lang.String str) {
            super("OnUnblockConfirmed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.contactId = str;
        }

        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contactId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUnblockConfirmed(contactId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contactId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockConfirmed) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockConfirmed) other).contactId);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockConfirmed copy(java.lang.String contactId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockConfirmed(contactId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockConfirmed copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockConfirmed onUnblockConfirmed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onUnblockConfirmed.contactId;
            }
            return onUnblockConfirmed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnFavoriteClicked;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnFavoriteClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContactId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFavoriteClicked extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final java.lang.String contactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFavoriteClicked(java.lang.String str) {
            super("OnFavoriteClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.contactId = str;
        }

        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contactId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFavoriteClicked(contactId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contactId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnFavoriteClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnFavoriteClicked) other).contactId);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnFavoriteClicked copy(java.lang.String contactId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnFavoriteClicked(contactId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnFavoriteClicked copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnFavoriteClicked onFavoriteClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onFavoriteClicked.contactId;
            }
            return onFavoriteClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$OnOperationErrorDismissed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOperationErrorDismissed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnOperationErrorDismissed INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnOperationErrorDismissed();

        public final int hashCode() {
            return -1407768302;
        }

        private OnOperationErrorDismissed() {
            super("OnOperationErrorDismissed", null);
        }

        public final java.lang.String toString() {
            return "OnOperationErrorDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnOperationErrorDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$DataLoaded;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;", "profile", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$DataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;", "getProfile"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoaded extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile profile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataLoaded(com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile publicProfile) {
            super("DataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfile, "");
            this.profile = publicProfile;
        }

        public final com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile getProfile() {
            return this.profile;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile publicProfile = this.profile;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLoaded(profile=");
            sb.append(publicProfile);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.profile.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.DataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.profile, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.DataLoaded) other).profile);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.DataLoaded copy(com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile profile) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profile, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.DataLoaded(profile);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile getProfile() {
            return this.profile;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.DataLoaded copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.DataLoaded dataLoaded, com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile publicProfile, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicProfile = dataLoaded.profile;
            }
            return dataLoaded.copy(publicProfile);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$LoadFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "error", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$LoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadFailed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadFailed(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError) {
            super("LoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileError, "");
            this.error = publicProfileError;
        }

        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadFailed(error=");
            sb.append(publicProfileError);
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
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.LoadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.LoadFailed) other).error);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.LoadFailed copy(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.LoadFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.LoadFailed copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.LoadFailed loadFailed, com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicProfileError = loadFailed.error;
            }
            return loadFailed.copy(publicProfileError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$FavoriteToggled;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FavoriteToggled extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggled INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggled();

        public final int hashCode() {
            return -1691946307;
        }

        private FavoriteToggled() {
            super("FavoriteToggled", null);
        }

        public final java.lang.String toString() {
            return "FavoriteToggled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$FavoriteToggleFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "error", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$FavoriteToggleFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FavoriteToggleFailed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FavoriteToggleFailed(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError) {
            super("FavoriteToggleFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileError, "");
            this.error = publicProfileError;
        }

        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FavoriteToggleFailed(error=");
            sb.append(publicProfileError);
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
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggleFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggleFailed) other).error);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggleFailed copy(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggleFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggleFailed copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggleFailed favoriteToggleFailed, com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicProfileError = favoriteToggleFailed.error;
            }
            return favoriteToggleFailed.copy(publicProfileError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$RemoveContactSucceeded;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveContactSucceeded extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactSucceeded INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactSucceeded();

        public final int hashCode() {
            return 327270972;
        }

        private RemoveContactSucceeded() {
            super("RemoveContactSucceeded", null);
        }

        public final java.lang.String toString() {
            return "RemoveContactSucceeded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactSucceeded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$RemoveContactFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "error", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$RemoveContactFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveContactFailed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveContactFailed(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError) {
            super("RemoveContactFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileError, "");
            this.error = publicProfileError;
        }

        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveContactFailed(error=");
            sb.append(publicProfileError);
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
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactFailed) other).error);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactFailed copy(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactFailed copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactFailed removeContactFailed, com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicProfileError = removeContactFailed.error;
            }
            return removeContactFailed.copy(publicProfileError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$BlockContactSucceeded;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockContactSucceeded extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactSucceeded INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactSucceeded();

        public final int hashCode() {
            return 954808951;
        }

        private BlockContactSucceeded() {
            super("BlockContactSucceeded", null);
        }

        public final java.lang.String toString() {
            return "BlockContactSucceeded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactSucceeded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$BlockContactFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "error", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$BlockContactFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockContactFailed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlockContactFailed(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError) {
            super("BlockContactFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileError, "");
            this.error = publicProfileError;
        }

        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockContactFailed(error=");
            sb.append(publicProfileError);
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
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed) other).error);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed copy(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed blockContactFailed, com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicProfileError = blockContactFailed.error;
            }
            return blockContactFailed.copy(publicProfileError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$UnblockContactSucceeded;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnblockContactSucceeded extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactSucceeded INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactSucceeded();

        public final int hashCode() {
            return 1204727614;
        }

        private UnblockContactSucceeded() {
            super("UnblockContactSucceeded", null);
        }

        public final java.lang.String toString() {
            return "UnblockContactSucceeded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactSucceeded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$UnblockContactFailed;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "error", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent$UnblockContactFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnblockContactFailed extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnblockContactFailed(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError) {
            super("UnblockContactFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileError, "");
            this.error = publicProfileError;
        }

        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnblockContactFailed(error=");
            sb.append(publicProfileError);
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
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactFailed) other).error);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactFailed copy(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactFailed copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactFailed unblockContactFailed, com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicProfileError = unblockContactFailed.error;
            }
            return unblockContactFailed.copy(publicProfileError);
        }
    }

    public /* synthetic */ PublicProfileEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
