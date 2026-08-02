package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "", "<init>", "()V", "ReportProblem", "ReportP2PUser", "UnblockP2PUser", "BlockP2PUser", "ContactSeller", "RequestRefundOrCancel", "DescriptiveLinkClicked", "GetAnswers", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$BlockP2PUser;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$ContactSeller;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$DescriptiveLinkClicked;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$GetAnswers;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$ReportP2PUser;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$ReportProblem;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$RequestRefundOrCancel;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$UnblockP2PUser;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class HelpSectionEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$ReportProblem;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$ReportProblem;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportProblem extends com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public ReportProblem(java.lang.String str) {
            super(null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportProblem(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem) other).url);
        }

        public final com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem copy(java.lang.String url) {
            return new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem copy$default(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem reportProblem, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = reportProblem.url;
            }
            return reportProblem.copy(str);
        }
    }

    private HelpSectionEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$ReportP2PUser;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "", "accountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$ReportP2PUser;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportP2PUser extends com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent {
        public static final int $stable = 0;
        private final java.lang.String accountId;

        public ReportP2PUser(java.lang.String str) {
            super(null);
            this.accountId = str;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportP2PUser(accountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.accountId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportP2PUser) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportP2PUser) other).accountId);
        }

        public final com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportP2PUser copy(java.lang.String accountId) {
            return new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportP2PUser(accountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportP2PUser copy$default(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportP2PUser reportP2PUser, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = reportP2PUser.accountId;
            }
            return reportP2PUser.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$UnblockP2PUser;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "", "accountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$UnblockP2PUser;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnblockP2PUser extends com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent {
        public static final int $stable = 0;
        private final java.lang.String accountId;

        public UnblockP2PUser(java.lang.String str) {
            super(null);
            this.accountId = str;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnblockP2PUser(accountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.accountId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser) other).accountId);
        }

        public final com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser copy(java.lang.String accountId) {
            return new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser(accountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser copy$default(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser unblockP2PUser, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unblockP2PUser.accountId;
            }
            return unblockP2PUser.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$BlockP2PUser;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "Lcom/paypal/oslo/feature/activity/ui/detail/model/BlockP2PData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/activity/ui/detail/model/BlockP2PData;)V", "component1", "()Lcom/paypal/oslo/feature/activity/ui/detail/model/BlockP2PData;", "copy", "(Lcom/paypal/oslo/feature/activity/ui/detail/model/BlockP2PData;)Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$BlockP2PUser;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/ui/detail/model/BlockP2PData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockP2PUser extends com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlockP2PUser(com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData blockP2PData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockP2PData, "");
            this.data = blockP2PData;
        }

        public final com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData blockP2PData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockP2PUser(data=");
            sb.append(blockP2PData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.BlockP2PUser) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.BlockP2PUser) other).data);
        }

        public final com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.BlockP2PUser copy(com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.BlockP2PUser(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.BlockP2PUser copy$default(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.BlockP2PUser blockP2PUser, com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData blockP2PData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                blockP2PData = blockP2PUser.data;
            }
            return blockP2PUser.copy(blockP2PData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$ContactSeller;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "Lcom/paypal/oslo/feature/activity/ui/detail/model/ContactSellerData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/activity/ui/detail/model/ContactSellerData;)V", "component1", "()Lcom/paypal/oslo/feature/activity/ui/detail/model/ContactSellerData;", "copy", "(Lcom/paypal/oslo/feature/activity/ui/detail/model/ContactSellerData;)Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$ContactSeller;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/ui/detail/model/ContactSellerData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactSeller extends com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactSeller(com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData contactSellerData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSellerData, "");
            this.data = contactSellerData;
        }

        public final com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData contactSellerData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSeller(data=");
            sb.append(contactSellerData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ContactSeller) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ContactSeller) other).data);
        }

        public final com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ContactSeller copy(com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ContactSeller(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ContactSeller copy$default(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ContactSeller contactSeller, com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData contactSellerData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contactSellerData = contactSeller.data;
            }
            return contactSeller.copy(contactSellerData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$RequestRefundOrCancel;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "Lcom/paypal/oslo/feature/activity/ui/detail/model/RequestRefundData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/activity/ui/detail/model/RequestRefundData;)V", "component1", "()Lcom/paypal/oslo/feature/activity/ui/detail/model/RequestRefundData;", "copy", "(Lcom/paypal/oslo/feature/activity/ui/detail/model/RequestRefundData;)Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$RequestRefundOrCancel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/ui/detail/model/RequestRefundData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestRefundOrCancel extends com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestRefundOrCancel(com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData requestRefundData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestRefundData, "");
            this.data = requestRefundData;
        }

        public final com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData requestRefundData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestRefundOrCancel(data=");
            sb.append(requestRefundData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.RequestRefundOrCancel) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.RequestRefundOrCancel) other).data);
        }

        public final com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.RequestRefundOrCancel copy(com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.RequestRefundOrCancel(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.RequestRefundOrCancel copy$default(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.RequestRefundOrCancel requestRefundOrCancel, com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData requestRefundData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestRefundData = requestRefundOrCancel.data;
            }
            return requestRefundOrCancel.copy(requestRefundData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$DescriptiveLinkClicked;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$DescriptiveLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DescriptiveLinkClicked extends com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public DescriptiveLinkClicked(java.lang.String str) {
            super(null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DescriptiveLinkClicked(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked) other).url);
        }

        public final com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked copy(java.lang.String url) {
            return new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked copy$default(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked descriptiveLinkClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = descriptiveLinkClicked.url;
            }
            return descriptiveLinkClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent$GetAnswers;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GetAnswers extends com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.GetAnswers INSTANCE = new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.GetAnswers();

        public final int hashCode() {
            return 1327949187;
        }

        private GetAnswers() {
            super(null);
        }

        public final java.lang.String toString() {
            return "GetAnswers";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.GetAnswers)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ HelpSectionEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
