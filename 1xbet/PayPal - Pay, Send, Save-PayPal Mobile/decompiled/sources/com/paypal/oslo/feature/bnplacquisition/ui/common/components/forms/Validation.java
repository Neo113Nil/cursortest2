package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "", "Required", "ExactLength", "NoSpecialChars", "NoPOBox", "DateOfBirth", "PhoneViaFormatter", "Income", "AddressField", "SSN", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$AddressField;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$DateOfBirth;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$ExactLength;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$Income;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$NoPOBox;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$NoSpecialChars;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$PhoneViaFormatter;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$Required;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$SSN;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface Validation {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$Required;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "errorMessage", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$Required;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Required implements com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText errorMessage;

        public Required(com.paypal.oslo.core.commonui.utils.RefText refText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.errorMessage = refText;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required(errorMessage=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Required) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Required) other).errorMessage);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Required copy(com.paypal.oslo.core.commonui.utils.RefText errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Required(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Required copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Required required, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = required.errorMessage;
            }
            return required.copy(refText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$ExactLength;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "", "length", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "errorMessage", "<init>", "(ILcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(ILcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$ExactLength;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getLength", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExactLength implements com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText errorMessage;
        private final int length;

        public ExactLength(int i, com.paypal.oslo.core.commonui.utils.RefText refText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.length = i;
            this.errorMessage = refText;
        }

        public final int getLength() {
            return this.length;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            int i = this.length;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExactLength(length=");
            sb.append(i);
            sb.append(", errorMessage=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.length) * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.ExactLength)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.ExactLength exactLength = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.ExactLength) other;
            return this.length == exactLength.length && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, exactLength.errorMessage);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.ExactLength copy(int length, com.paypal.oslo.core.commonui.utils.RefText errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.ExactLength(length, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.ExactLength copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.ExactLength exactLength, int i, com.paypal.oslo.core.commonui.utils.RefText refText, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = exactLength.length;
            }
            if ((i2 & 2) != 0) {
                refText = exactLength.errorMessage;
            }
            return exactLength.copy(i, refText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$NoSpecialChars;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "errorMessage", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$NoSpecialChars;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoSpecialChars implements com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText errorMessage;

        public NoSpecialChars(com.paypal.oslo.core.commonui.utils.RefText refText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.errorMessage = refText;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoSpecialChars(errorMessage=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoSpecialChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoSpecialChars) other).errorMessage);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoSpecialChars copy(com.paypal.oslo.core.commonui.utils.RefText errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoSpecialChars(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoSpecialChars copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoSpecialChars noSpecialChars, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = noSpecialChars.errorMessage;
            }
            return noSpecialChars.copy(refText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$NoPOBox;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "errorMessage", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$NoPOBox;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoPOBox implements com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText errorMessage;

        public NoPOBox(com.paypal.oslo.core.commonui.utils.RefText refText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.errorMessage = refText;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoPOBox(errorMessage=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoPOBox) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoPOBox) other).errorMessage);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoPOBox copy(com.paypal.oslo.core.commonui.utils.RefText errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoPOBox(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoPOBox copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.NoPOBox noPOBox, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = noPOBox.errorMessage;
            }
            return noPOBox.copy(refText);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b%\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$DateOfBirth;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "", "dateFormat", "Ljava/util/Locale;", "locale", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "formatErrorMessage", "underAgeErrorMessage", "overAgeErrorMessage", "<init>", "(Ljava/lang/String;Ljava/util/Locale;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Locale;", "component3", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/Locale;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$DateOfBirth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDateFormat", "Ljava/util/Locale;", "getLocale", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getFormatErrorMessage", "getUnderAgeErrorMessage", "getOverAgeErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateOfBirth implements com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation {
        public static final int $stable;
        private final java.lang.String dateFormat;
        private final com.paypal.oslo.core.commonui.utils.RefText formatErrorMessage;
        private final java.util.Locale locale;
        private final com.paypal.oslo.core.commonui.utils.RefText overAgeErrorMessage;
        private final com.paypal.oslo.core.commonui.utils.RefText underAgeErrorMessage;

        public DateOfBirth(java.lang.String str, java.util.Locale locale, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
            this.dateFormat = str;
            this.locale = locale;
            this.formatErrorMessage = refText;
            this.underAgeErrorMessage = refText2;
            this.overAgeErrorMessage = refText3;
        }

        public final java.lang.String getDateFormat() {
            return this.dateFormat;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ DateOfBirth(java.lang.String str, java.util.Locale locale, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, locale, refText, refText2, refText3);
            if ((i & 2) != 0) {
                locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            }
        }

        public final java.util.Locale getLocale() {
            return this.locale;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getFormatErrorMessage() {
            return this.formatErrorMessage;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getUnderAgeErrorMessage() {
            return this.underAgeErrorMessage;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getOverAgeErrorMessage() {
            return this.overAgeErrorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.dateFormat;
            java.util.Locale locale = this.locale;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.formatErrorMessage;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.underAgeErrorMessage;
            com.paypal.oslo.core.commonui.utils.RefText refText3 = this.overAgeErrorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DateOfBirth(dateFormat=");
            sb.append(str);
            sb.append(", locale=");
            sb.append(locale);
            sb.append(", formatErrorMessage=");
            sb.append(refText);
            sb.append(", underAgeErrorMessage=");
            sb.append(refText2);
            sb.append(", overAgeErrorMessage=");
            sb.append(refText3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.dateFormat.hashCode() * 31) + this.locale.hashCode()) * 31) + this.formatErrorMessage.hashCode()) * 31) + this.underAgeErrorMessage.hashCode()) * 31) + this.overAgeErrorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.DateOfBirth)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.DateOfBirth dateOfBirth = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.DateOfBirth) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.dateFormat, dateOfBirth.dateFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, dateOfBirth.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.formatErrorMessage, dateOfBirth.formatErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.underAgeErrorMessage, dateOfBirth.underAgeErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.overAgeErrorMessage, dateOfBirth.overAgeErrorMessage);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.DateOfBirth copy(java.lang.String dateFormat, java.util.Locale locale, com.paypal.oslo.core.commonui.utils.RefText formatErrorMessage, com.paypal.oslo.core.commonui.utils.RefText underAgeErrorMessage, com.paypal.oslo.core.commonui.utils.RefText overAgeErrorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormat, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatErrorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(underAgeErrorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overAgeErrorMessage, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.DateOfBirth(dateFormat, locale, formatErrorMessage, underAgeErrorMessage, overAgeErrorMessage);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getOverAgeErrorMessage() {
            return this.overAgeErrorMessage;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getUnderAgeErrorMessage() {
            return this.underAgeErrorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getFormatErrorMessage() {
            return this.formatErrorMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final java.util.Locale getLocale() {
            return this.locale;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDateFormat() {
            return this.dateFormat;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.DateOfBirth copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.DateOfBirth dateOfBirth, java.lang.String str, java.util.Locale locale, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dateOfBirth.dateFormat;
            }
            if ((i & 2) != 0) {
                locale = dateOfBirth.locale;
            }
            java.util.Locale locale2 = locale;
            if ((i & 4) != 0) {
                refText = dateOfBirth.formatErrorMessage;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText4 = refText;
            if ((i & 8) != 0) {
                refText2 = dateOfBirth.underAgeErrorMessage;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText5 = refText2;
            if ((i & 16) != 0) {
                refText3 = dateOfBirth.overAgeErrorMessage;
            }
            return dateOfBirth.copy(str, locale2, refText4, refText5, refText3);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$PhoneViaFormatter;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "emptyErrorMessage", "invalidErrorMessage", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$PhoneViaFormatter;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getEmptyErrorMessage", "getInvalidErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneViaFormatter implements com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText emptyErrorMessage;
        private final com.paypal.oslo.core.commonui.utils.RefText invalidErrorMessage;

        public PhoneViaFormatter(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            this.emptyErrorMessage = refText;
            this.invalidErrorMessage = refText2;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getEmptyErrorMessage() {
            return this.emptyErrorMessage;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getInvalidErrorMessage() {
            return this.invalidErrorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.emptyErrorMessage;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.invalidErrorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneViaFormatter(emptyErrorMessage=");
            sb.append(refText);
            sb.append(", invalidErrorMessage=");
            sb.append(refText2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.emptyErrorMessage.hashCode() * 31) + this.invalidErrorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.PhoneViaFormatter)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.PhoneViaFormatter phoneViaFormatter = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.PhoneViaFormatter) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.emptyErrorMessage, phoneViaFormatter.emptyErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.invalidErrorMessage, phoneViaFormatter.invalidErrorMessage);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.PhoneViaFormatter copy(com.paypal.oslo.core.commonui.utils.RefText emptyErrorMessage, com.paypal.oslo.core.commonui.utils.RefText invalidErrorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emptyErrorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidErrorMessage, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.PhoneViaFormatter(emptyErrorMessage, invalidErrorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getInvalidErrorMessage() {
            return this.invalidErrorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getEmptyErrorMessage() {
            return this.emptyErrorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.PhoneViaFormatter copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.PhoneViaFormatter phoneViaFormatter, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = phoneViaFormatter.emptyErrorMessage;
            }
            if ((i & 2) != 0) {
                refText2 = phoneViaFormatter.invalidErrorMessage;
            }
            return phoneViaFormatter.copy(refText, refText2);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$Income;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "", "minAmount", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "emptyError", "invalidError", "zeroWarning", "<init>", "(JLcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()J", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component3", "component4", "copy", "(JLcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$Income;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getMinAmount", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getEmptyError", "getInvalidError", "getZeroWarning"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Income implements com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText emptyError;
        private final com.paypal.oslo.core.commonui.utils.RefText invalidError;
        private final long minAmount;
        private final com.paypal.oslo.core.commonui.utils.RefText zeroWarning;

        public Income(long j, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
            this.minAmount = j;
            this.emptyError = refText;
            this.invalidError = refText2;
            this.zeroWarning = refText3;
        }

        public final long getMinAmount() {
            return this.minAmount;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getEmptyError() {
            return this.emptyError;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getInvalidError() {
            return this.invalidError;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getZeroWarning() {
            return this.zeroWarning;
        }

        public final java.lang.String toString() {
            long j = this.minAmount;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.emptyError;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.invalidError;
            com.paypal.oslo.core.commonui.utils.RefText refText3 = this.zeroWarning;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Income(minAmount=");
            sb.append(j);
            sb.append(", emptyError=");
            sb.append(refText);
            sb.append(", invalidError=");
            sb.append(refText2);
            sb.append(", zeroWarning=");
            sb.append(refText3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Long.hashCode(this.minAmount) * 31) + this.emptyError.hashCode()) * 31) + this.invalidError.hashCode()) * 31) + this.zeroWarning.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Income)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Income income = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Income) other;
            return this.minAmount == income.minAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.emptyError, income.emptyError) && kotlin.jvm.internal.Intrinsics.areEqual(this.invalidError, income.invalidError) && kotlin.jvm.internal.Intrinsics.areEqual(this.zeroWarning, income.zeroWarning);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Income copy(long minAmount, com.paypal.oslo.core.commonui.utils.RefText emptyError, com.paypal.oslo.core.commonui.utils.RefText invalidError, com.paypal.oslo.core.commonui.utils.RefText zeroWarning) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emptyError, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidError, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zeroWarning, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Income(minAmount, emptyError, invalidError, zeroWarning);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getZeroWarning() {
            return this.zeroWarning;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getInvalidError() {
            return this.invalidError;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getEmptyError() {
            return this.emptyError;
        }

        /* renamed from: component1, reason: from getter */
        public final long getMinAmount() {
            return this.minAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Income copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.Income income, long j, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = income.minAmount;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                refText = income.emptyError;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText4 = refText;
            if ((i & 4) != 0) {
                refText2 = income.invalidError;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText5 = refText2;
            if ((i & 8) != 0) {
                refText3 = income.zeroWarning;
            }
            return income.copy(j2, refText4, refText5, refText3);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$AddressField;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "requiredErrorMessage", "invalidPatternErrorMessage", "invalidCharacterErrorMessage", "poBoxErrorMessage", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "component4", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$AddressField;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getRequiredErrorMessage", "getInvalidPatternErrorMessage", "getInvalidCharacterErrorMessage", "getPoBoxErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressField implements com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText invalidCharacterErrorMessage;
        private final com.paypal.oslo.core.commonui.utils.RefText invalidPatternErrorMessage;
        private final com.paypal.oslo.core.commonui.utils.RefText poBoxErrorMessage;
        private final com.paypal.oslo.core.commonui.utils.RefText requiredErrorMessage;

        public AddressField(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4) {
            this.requiredErrorMessage = refText;
            this.invalidPatternErrorMessage = refText2;
            this.invalidCharacterErrorMessage = refText3;
            this.poBoxErrorMessage = refText4;
        }

        public /* synthetic */ AddressField(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : refText, (i & 2) != 0 ? null : refText2, (i & 4) != 0 ? null : refText3, (i & 8) != 0 ? null : refText4);
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getRequiredErrorMessage() {
            return this.requiredErrorMessage;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getInvalidPatternErrorMessage() {
            return this.invalidPatternErrorMessage;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getInvalidCharacterErrorMessage() {
            return this.invalidCharacterErrorMessage;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getPoBoxErrorMessage() {
            return this.poBoxErrorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.requiredErrorMessage;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.invalidPatternErrorMessage;
            com.paypal.oslo.core.commonui.utils.RefText refText3 = this.invalidCharacterErrorMessage;
            com.paypal.oslo.core.commonui.utils.RefText refText4 = this.poBoxErrorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressField(requiredErrorMessage=");
            sb.append(refText);
            sb.append(", invalidPatternErrorMessage=");
            sb.append(refText2);
            sb.append(", invalidCharacterErrorMessage=");
            sb.append(refText3);
            sb.append(", poBoxErrorMessage=");
            sb.append(refText4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.requiredErrorMessage;
            int hashCode = refText == null ? 0 : refText.hashCode();
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.invalidPatternErrorMessage;
            int hashCode2 = refText2 == null ? 0 : refText2.hashCode();
            com.paypal.oslo.core.commonui.utils.RefText refText3 = this.invalidCharacterErrorMessage;
            int hashCode3 = refText3 == null ? 0 : refText3.hashCode();
            com.paypal.oslo.core.commonui.utils.RefText refText4 = this.poBoxErrorMessage;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (refText4 != null ? refText4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.AddressField)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.AddressField addressField = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.AddressField) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requiredErrorMessage, addressField.requiredErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.invalidPatternErrorMessage, addressField.invalidPatternErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.invalidCharacterErrorMessage, addressField.invalidCharacterErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.poBoxErrorMessage, addressField.poBoxErrorMessage);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.AddressField copy(com.paypal.oslo.core.commonui.utils.RefText requiredErrorMessage, com.paypal.oslo.core.commonui.utils.RefText invalidPatternErrorMessage, com.paypal.oslo.core.commonui.utils.RefText invalidCharacterErrorMessage, com.paypal.oslo.core.commonui.utils.RefText poBoxErrorMessage) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.AddressField(requiredErrorMessage, invalidPatternErrorMessage, invalidCharacterErrorMessage, poBoxErrorMessage);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getPoBoxErrorMessage() {
            return this.poBoxErrorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getInvalidCharacterErrorMessage() {
            return this.invalidCharacterErrorMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getInvalidPatternErrorMessage() {
            return this.invalidPatternErrorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getRequiredErrorMessage() {
            return this.requiredErrorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.AddressField copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.AddressField addressField, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = addressField.requiredErrorMessage;
            }
            if ((i & 2) != 0) {
                refText2 = addressField.invalidPatternErrorMessage;
            }
            if ((i & 4) != 0) {
                refText3 = addressField.invalidCharacterErrorMessage;
            }
            if ((i & 8) != 0) {
                refText4 = addressField.poBoxErrorMessage;
            }
            return addressField.copy(refText, refText2, refText3, refText4);
        }

        public AddressField() {
            this(null, null, null, null, 15, null);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$SSN;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation;", "", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;", "documentSubType", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "errorMessage", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;", "component4", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$SSN;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "getDocumentType", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;", "getDocumentSubType", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SSN implements com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final java.lang.String countryCode;
        private final com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType;
        private final com.paypal.oslo.core.i18n.domain.model.DocumentType documentType;
        private final com.paypal.oslo.core.commonui.utils.RefText errorMessage;

        public SSN(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType, com.paypal.oslo.core.commonui.utils.RefText refText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSubType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.countryCode = str;
            this.documentType = documentType;
            this.documentSubType = documentSubType;
            this.errorMessage = refText;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final com.paypal.oslo.core.i18n.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        public final com.paypal.oslo.core.i18n.domain.model.DocumentSubType getDocumentSubType() {
            return this.documentSubType;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            com.paypal.oslo.core.i18n.domain.model.DocumentType documentType = this.documentType;
            com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType = this.documentSubType;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SSN(countryCode=");
            sb.append(str);
            sb.append(", documentType=");
            sb.append(documentType);
            sb.append(", documentSubType=");
            sb.append(documentSubType);
            sb.append(", errorMessage=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.countryCode.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.documentSubType.hashCode()) * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.SSN)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.SSN ssn = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.SSN) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, ssn.countryCode) && this.documentType == ssn.documentType && this.documentSubType == ssn.documentSubType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ssn.errorMessage);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.SSN copy(java.lang.String countryCode, com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType, com.paypal.oslo.core.commonui.utils.RefText errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSubType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.SSN(countryCode, documentType, documentSubType, errorMessage);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.DocumentSubType getDocumentSubType() {
            return this.documentSubType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.SSN copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.SSN ssn, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ssn.countryCode;
            }
            if ((i & 2) != 0) {
                documentType = ssn.documentType;
            }
            if ((i & 4) != 0) {
                documentSubType = ssn.documentSubType;
            }
            if ((i & 8) != 0) {
                refText = ssn.errorMessage;
            }
            return ssn.copy(str, documentType, documentSubType, refText);
        }
    }
}
