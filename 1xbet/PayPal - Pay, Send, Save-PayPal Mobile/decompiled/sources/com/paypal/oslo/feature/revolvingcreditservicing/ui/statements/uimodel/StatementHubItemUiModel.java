package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel;", "", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "Header", "Content", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Header;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class StatementHubItemUiModel {
    public static final int $stable = 0;

    public abstract java.lang.String getId();

    private StatementHubItemUiModel() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Header;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel;", "", "id", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "title", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Header;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Header extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            this.id = str;
            this.title = uiString;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel
        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
            return this.title;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.title;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Header(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(uiString);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.title.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header header = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, header.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, header.title);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header copy(java.lang.String id, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header(id, title);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header header, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = header.id;
            }
            if ((i & 2) != 0) {
                uiString = header.title;
            }
            return header.copy(str, uiString);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel;", "", "id", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "month", "dateRange", "amount", "type", com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;", com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getMonth", "getDateRange", "getAmount", "getType", "getWarning", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;", "getRawData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString amount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString dateRange;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString month;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem rawData;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString type;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString warning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem statementItem) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementItem, "");
            this.id = str;
            this.month = uiString;
            this.dateRange = uiString2;
            this.amount = uiString3;
            this.type = uiString4;
            this.warning = uiString5;
            this.rawData = statementItem;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel
        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getMonth() {
            return this.month;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDateRange() {
            return this.dateRange;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getWarning() {
            return this.warning;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem getRawData() {
            return this.rawData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.month;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.dateRange;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.amount;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4 = this.type;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5 = this.warning;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem statementItem = this.rawData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(id=");
            sb.append(str);
            sb.append(", month=");
            sb.append(uiString);
            sb.append(", dateRange=");
            sb.append(uiString2);
            sb.append(", amount=");
            sb.append(uiString3);
            sb.append(", type=");
            sb.append(uiString4);
            sb.append(", warning=");
            sb.append(uiString5);
            sb.append(", rawData=");
            sb.append(statementItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.month.hashCode()) * 31) + this.dateRange.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.type.hashCode()) * 31) + this.warning.hashCode()) * 31) + this.rawData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content content = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, content.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.month, content.month) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateRange, content.dateRange) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, content.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, content.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.warning, content.warning) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawData, content.rawData);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content copy(java.lang.String id, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString month, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString dateRange, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString amount, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString type, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString warning, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem rawData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateRange, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(warning, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawData, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content(id, month, dateRange, amount, type, warning, rawData);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem getRawData() {
            return this.rawData;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getWarning() {
            return this.warning;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDateRange() {
            return this.dateRange;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getMonth() {
            return this.month;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content content, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem statementItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = content.id;
            }
            if ((i & 2) != 0) {
                uiString = content.month;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString6 = uiString;
            if ((i & 4) != 0) {
                uiString2 = content.dateRange;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString7 = uiString2;
            if ((i & 8) != 0) {
                uiString3 = content.amount;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString8 = uiString3;
            if ((i & 16) != 0) {
                uiString4 = content.type;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString9 = uiString4;
            if ((i & 32) != 0) {
                uiString5 = content.warning;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString10 = uiString5;
            if ((i & 64) != 0) {
                statementItem = content.rawData;
            }
            return content.copy(str, uiString6, uiString7, uiString8, uiString9, uiString10, statementItem);
        }
    }

    public /* synthetic */ StatementHubItemUiModel(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
