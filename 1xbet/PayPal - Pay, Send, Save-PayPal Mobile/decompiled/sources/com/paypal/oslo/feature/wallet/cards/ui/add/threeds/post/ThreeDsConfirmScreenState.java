package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState;", "", "Loading", "Error", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState$Error;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ThreeDsConfirmScreenState {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState$Loading;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "", "shouldShowClose", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Z)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Z)Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "Z", "getShouldShowClose"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final boolean shouldShowClose;
        private final com.paypal.oslo.core.commonui.utils.RefText title;

        public Loading(com.paypal.oslo.core.commonui.utils.RefText refText, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.title = refText;
            this.shouldShowClose = z;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public final boolean getShouldShowClose() {
            return this.shouldShowClose;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
            boolean z = this.shouldShowClose;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(title=");
            sb.append(refText);
            sb.append(", shouldShowClose=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldShowClose);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading loading = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, loading.title) && this.shouldShowClose == loading.shouldShowClose;
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading copy(com.paypal.oslo.core.commonui.utils.RefText title, boolean shouldShowClose) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading(title, shouldShowClose);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldShowClose() {
            return this.shouldShowClose;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading copy$default(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading loading, com.paypal.oslo.core.commonui.utils.RefText refText, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = loading.title;
            }
            if ((i & 2) != 0) {
                z = loading.shouldShowClose;
            }
            return loading.copy(refText, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019Jb\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0017R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u0019R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b1\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState$Error;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState;", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "buttonText", "", "shouldShowClose", "Lkotlin/Function0;", "", "onCloseClick", "onActionClick", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component3", "component4", "component5", "()Z", "component6", "()Lkotlin/jvm/functions/Function0;", "component7", "copy", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getDescription", "getButtonText", "Z", "getShouldShowClose", "Lkotlin/jvm/functions/Function0;", "getOnCloseClick", "getOnActionClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText buttonText;
        private final com.paypal.oslo.core.commonui.utils.RefText description;
        private final com.paypal.pds.core.Icon icon;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onActionClick;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onCloseClick;
        private final boolean shouldShowClose;
        private final com.paypal.oslo.core.commonui.utils.RefText title;

        public Error(com.paypal.pds.core.Icon icon, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
            this.icon = icon;
            this.title = refText;
            this.description = refText2;
            this.buttonText = refText3;
            this.shouldShowClose = z;
            this.onCloseClick = function0;
            this.onActionClick = function02;
        }

        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getButtonText() {
            return this.buttonText;
        }

        public final boolean getShouldShowClose() {
            return this.shouldShowClose;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCloseClick() {
            return this.onCloseClick;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnActionClick() {
            return this.onActionClick;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.icon;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.description;
            com.paypal.oslo.core.commonui.utils.RefText refText3 = this.buttonText;
            boolean z = this.shouldShowClose;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onCloseClick;
            kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onActionClick;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(icon=");
            sb.append(icon);
            sb.append(", title=");
            sb.append(refText);
            sb.append(", description=");
            sb.append(refText2);
            sb.append(", buttonText=");
            sb.append(refText3);
            sb.append(", shouldShowClose=");
            sb.append(z);
            sb.append(", onCloseClick=");
            sb.append(function0);
            sb.append(", onActionClick=");
            sb.append(function02);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.icon.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldShowClose)) * 31) + this.onCloseClick.hashCode()) * 31) + this.onActionClick.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error error = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, error.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, error.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, error.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, error.buttonText) && this.shouldShowClose == error.shouldShowClose && kotlin.jvm.internal.Intrinsics.areEqual(this.onCloseClick, error.onCloseClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onActionClick, error.onActionClick);
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error copy(com.paypal.pds.core.Icon icon, com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText description, com.paypal.oslo.core.commonui.utils.RefText buttonText, boolean shouldShowClose, kotlin.jvm.functions.Function0<kotlin.Unit> onCloseClick, kotlin.jvm.functions.Function0<kotlin.Unit> onActionClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCloseClick, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onActionClick, "");
            return new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error(icon, title, description, buttonText, shouldShowClose, onCloseClick, onActionClick);
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component7() {
            return this.onActionClick;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component6() {
            return this.onCloseClick;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldShowClose() {
            return this.shouldShowClose;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error copy$default(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error error, com.paypal.pds.core.Icon icon, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon = error.icon;
            }
            if ((i & 2) != 0) {
                refText = error.title;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText4 = refText;
            if ((i & 4) != 0) {
                refText2 = error.description;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText5 = refText2;
            if ((i & 8) != 0) {
                refText3 = error.buttonText;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText6 = refText3;
            if ((i & 16) != 0) {
                z = error.shouldShowClose;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                function0 = error.onCloseClick;
            }
            kotlin.jvm.functions.Function0 function03 = function0;
            if ((i & 64) != 0) {
                function02 = error.onActionClick;
            }
            return error.copy(icon, refText4, refText5, refText6, z2, function03, function02);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }
}
