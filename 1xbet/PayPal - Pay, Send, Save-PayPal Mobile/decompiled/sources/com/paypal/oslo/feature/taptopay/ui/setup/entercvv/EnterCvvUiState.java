package com.paypal.oslo.feature.taptopay.ui.setup.entercvv;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvUiState;", "", "Loading", "Content", "Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvUiState$Content;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface EnterCvvUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvUiState$Loading;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Loading INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Loading();

        public final int hashCode() {
            return -1565082219;
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
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b\u000b\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b+\u0010\u0015R\u0011\u0010,\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvUiState$Content;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvUiState;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "", "maxCvvLength", "minCvvLength", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "cardTitle", "cardDescription", "", "isLoading", "errorMessage", "<init>", "(Ljava/lang/String;IILcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;ZLcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component5", "component6", "()Z", "component7", "copy", "(Ljava/lang/String;IILcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;ZLcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvUiState$Content;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCvv", com.visa.cbp.getEncExpo.warmup, "getMaxCvvLength", "getMinCvvLength", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getCardTitle", "getCardDescription", "Z", "getErrorMessage", "isCvvValid"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content implements com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState {
        public static final int $stable;
        private final java.lang.String cardDescription;
        private final com.paypal.oslo.core.commonui.utils.RefText cardTitle;
        private final java.lang.String cvv;
        private final com.paypal.oslo.core.commonui.utils.RefText errorMessage;
        private final boolean isLoading;
        private final int maxCvvLength;
        private final int minCvvLength;

        public Content(java.lang.String str, int i, int i2, com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str2, boolean z, com.paypal.oslo.core.commonui.utils.RefText refText2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.cvv = str;
            this.maxCvvLength = i;
            this.minCvvLength = i2;
            this.cardTitle = refText;
            this.cardDescription = str2;
            this.isLoading = z;
            this.errorMessage = refText2;
        }

        public /* synthetic */ Content(java.lang.String str, int i, int i2, com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str2, boolean z, com.paypal.oslo.core.commonui.utils.RefText refText2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Default.INSTANCE.getCvvLength() : i, (i3 & 4) != 0 ? com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Default.INSTANCE.getCvvLength() : i2, (i3 & 8) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("") : refText, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? null : refText2);
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final int getMaxCvvLength() {
            return this.maxCvvLength;
        }

        public final int getMinCvvLength() {
            return this.minCvvLength;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getCardTitle() {
            return this.cardTitle;
        }

        public final java.lang.String getCardDescription() {
            return this.cardDescription;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean isCvvValid() {
            int i = this.minCvvLength;
            int i2 = this.maxCvvLength;
            int length = this.cvv.length();
            return i <= length && length <= i2;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            int i = this.maxCvvLength;
            int i2 = this.minCvvLength;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.cardTitle;
            java.lang.String str2 = this.cardDescription;
            boolean z = this.isLoading;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(cvv=");
            sb.append(str);
            sb.append(", maxCvvLength=");
            sb.append(i);
            sb.append(", minCvvLength=");
            sb.append(i2);
            sb.append(", cardTitle=");
            sb.append(refText);
            sb.append(", cardDescription=");
            sb.append(str2);
            sb.append(", isLoading=");
            sb.append(z);
            sb.append(", errorMessage=");
            sb.append(refText2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cvv.hashCode();
            int hashCode2 = java.lang.Integer.hashCode(this.maxCvvLength);
            int hashCode3 = java.lang.Integer.hashCode(this.minCvvLength);
            int hashCode4 = this.cardTitle.hashCode();
            java.lang.String str = this.cardDescription;
            int hashCode5 = str == null ? 0 : str.hashCode();
            int hashCode6 = java.lang.Boolean.hashCode(this.isLoading);
            com.paypal.oslo.core.commonui.utils.RefText refText = this.errorMessage;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (refText != null ? refText.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content content = (com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, content.cvv) && this.maxCvvLength == content.maxCvvLength && this.minCvvLength == content.minCvvLength && kotlin.jvm.internal.Intrinsics.areEqual(this.cardTitle, content.cardTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDescription, content.cardDescription) && this.isLoading == content.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, content.errorMessage);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content copy(java.lang.String cvv, int maxCvvLength, int minCvvLength, com.paypal.oslo.core.commonui.utils.RefText cardTitle, java.lang.String cardDescription, boolean isLoading, com.paypal.oslo.core.commonui.utils.RefText errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardTitle, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content(cvv, maxCvvLength, minCvvLength, cardTitle, cardDescription, isLoading, errorMessage);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCardDescription() {
            return this.cardDescription;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getCardTitle() {
            return this.cardTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMinCvvLength() {
            return this.minCvvLength;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxCvvLength() {
            return this.maxCvvLength;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content copy$default(com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content content, java.lang.String str, int i, int i2, com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str2, boolean z, com.paypal.oslo.core.commonui.utils.RefText refText2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = content.cvv;
            }
            if ((i3 & 2) != 0) {
                i = content.maxCvvLength;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = content.minCvvLength;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                refText = content.cardTitle;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText3 = refText;
            if ((i3 & 16) != 0) {
                str2 = content.cardDescription;
            }
            java.lang.String str3 = str2;
            if ((i3 & 32) != 0) {
                z = content.isLoading;
            }
            boolean z2 = z;
            if ((i3 & 64) != 0) {
                refText2 = content.errorMessage;
            }
            return content.copy(str, i4, i5, refText3, str3, z2, refText2);
        }

        public Content() {
            this(null, 0, 0, null, null, false, null, 127, null);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i;
        }
    }
}
