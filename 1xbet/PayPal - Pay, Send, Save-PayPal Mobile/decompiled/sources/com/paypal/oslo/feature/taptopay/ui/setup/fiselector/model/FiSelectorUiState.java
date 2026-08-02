package com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState;", "", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState$Error;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState$Loading;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface FiSelectorUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState$Loading;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Loading INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Loading();

        public final int hashCode() {
            return -60880144;
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
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState$Success;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState;", "", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSectionType;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection;", "sections", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getSections"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState {
        public static final int $stable = 8;
        private final java.util.Map<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection> sections;

        /* JADX WARN: Multi-variable type inference failed */
        public Success(java.util.Map<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType, ? extends com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.sections = map;
        }

        public final java.util.Map<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection> getSections() {
            return this.sections;
        }

        public final java.lang.String toString() {
            java.util.Map<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection> map = this.sections;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(sections=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sections.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.sections, ((com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Success) other).sections);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Success copy(java.util.Map<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType, ? extends com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection> sections) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Success(sections);
        }

        public final java.util.Map<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection> component1() {
            return this.sections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Success copy$default(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Success success, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = success.sections;
            }
            return success.copy(map);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState$Error;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "message", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;", "errorType", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;)Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getMessage", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType errorType;
        private final com.paypal.oslo.core.commonui.utils.RefText message;

        public Error(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiSelectorErrorType, "");
            this.message = refText;
            this.errorType = fiSelectorErrorType;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getMessage() {
            return this.message;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.message;
            com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(refText);
            sb.append(", errorType=");
            sb.append(fiSelectorErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.message;
            return ((refText == null ? 0 : refText.hashCode()) * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error error = (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && this.errorType == error.errorType;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error copy(com.paypal.oslo.core.commonui.utils.RefText message, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(message, errorType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error copy$default(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error error, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = error.message;
            }
            if ((i & 2) != 0) {
                fiSelectorErrorType = error.errorType;
            }
            return error.copy(refText, fiSelectorErrorType);
        }
    }
}
