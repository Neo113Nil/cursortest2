package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/BottomSheetInfoUiModel;", "", "<init>", "()V", "Content", "Error", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/BottomSheetInfoUiModel$Content;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/BottomSheetInfoUiModel$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class BottomSheetInfoUiModel {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/BottomSheetInfoUiModel$Content;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/BottomSheetInfoUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/ContentUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/ContentUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/ContentUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/ContentUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/BottomSheetInfoUiModel$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/ContentUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel contentUiModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUiModel, "");
            this.model = contentUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel contentUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(model=");
            sb.append(contentUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Content) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Content) other).model);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Content copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Content(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Content copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Content content, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel contentUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contentUiModel = content.model;
            }
            return content.copy(contentUiModel);
        }
    }

    private BottomSheetInfoUiModel() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/BottomSheetInfoUiModel$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/BottomSheetInfoUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/BottomSheetInfoUiModel$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorUiModel, "");
            this.model = errorUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(model=");
            sb.append(errorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Error) other).model);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Error copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Error(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Error error, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorUiModel = error.model;
            }
            return error.copy(errorUiModel);
        }
    }

    public /* synthetic */ BottomSheetInfoUiModel(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
