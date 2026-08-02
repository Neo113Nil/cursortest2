package com.paypal.oslo.feature.bnplservicing.ui.common.content;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0003\u0010\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "p0", "p1", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDescription", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "buttonTitle", "getButtonTitle", "PrequalAmountErrorContent", "PlanSectionErrorContent", "GenericErrorContent", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$GenericErrorContent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PlanSectionErrorContent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PrequalAmountErrorContent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ErrorContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText buttonTitle;
    private final com.paypal.oslo.core.commonui.utils.RefText description;

    private ErrorContentProvider(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
        this.description = refText;
        this.buttonTitle = refText2;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
        return this.description;
    }

    public /* synthetic */ ErrorContentProvider(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(refText, (i & 2) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_error_try_again, new java.lang.Object[0]) : refText2, null);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getButtonTitle() {
        return this.buttonTitle;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PrequalAmountErrorContent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "desc", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PrequalAmountErrorContent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDesc"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrequalAmountErrorContent extends com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText desc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PrequalAmountErrorContent(com.paypal.oslo.core.commonui.utils.RefText refText) {
            super(refText, null, 2, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.desc = refText;
        }

        public /* synthetic */ PrequalAmountErrorContent(com.paypal.oslo.core.commonui.utils.RefText refText, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_error_prequal_description, new java.lang.Object[0]) : refText);
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getDesc() {
            return this.desc;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.desc;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrequalAmountErrorContent(desc=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.desc.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.desc, ((com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent) other).desc);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent copy(com.paypal.oslo.core.commonui.utils.RefText desc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent(desc);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getDesc() {
            return this.desc;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent copy$default(com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent prequalAmountErrorContent, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = prequalAmountErrorContent.desc;
            }
            return prequalAmountErrorContent.copy(refText);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PrequalAmountErrorContent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PlanSectionErrorContent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "desc", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PlanSectionErrorContent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDesc"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PlanSectionErrorContent extends com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText desc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PlanSectionErrorContent(com.paypal.oslo.core.commonui.utils.RefText refText) {
            super(refText, null, 2, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.desc = refText;
        }

        public /* synthetic */ PlanSectionErrorContent(com.paypal.oslo.core.commonui.utils.RefText refText, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_error_state_view_info_not_displayed, new java.lang.Object[0]) : refText);
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getDesc() {
            return this.desc;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.desc;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanSectionErrorContent(desc=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.desc.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PlanSectionErrorContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.desc, ((com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PlanSectionErrorContent) other).desc);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PlanSectionErrorContent copy(com.paypal.oslo.core.commonui.utils.RefText desc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PlanSectionErrorContent(desc);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getDesc() {
            return this.desc;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PlanSectionErrorContent copy$default(com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PlanSectionErrorContent planSectionErrorContent, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = planSectionErrorContent.desc;
            }
            return planSectionErrorContent.copy(refText);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PlanSectionErrorContent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$GenericErrorContent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "desc", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$GenericErrorContent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDesc"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GenericErrorContent extends com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText desc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public GenericErrorContent(com.paypal.oslo.core.commonui.utils.RefText refText) {
            super(refText, null, 2, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.desc = refText;
        }

        public /* synthetic */ GenericErrorContent(com.paypal.oslo.core.commonui.utils.RefText refText, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_error_something_went_wrong, new java.lang.Object[0]) : refText);
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getDesc() {
            return this.desc;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.desc;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GenericErrorContent(desc=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.desc.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.GenericErrorContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.desc, ((com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.GenericErrorContent) other).desc);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.GenericErrorContent copy(com.paypal.oslo.core.commonui.utils.RefText desc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.GenericErrorContent(desc);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getDesc() {
            return this.desc;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.GenericErrorContent copy$default(com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.GenericErrorContent genericErrorContent, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = genericErrorContent.desc;
            }
            return genericErrorContent.copy(refText);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GenericErrorContent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    public /* synthetic */ ErrorContentProvider(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(refText, refText2);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
