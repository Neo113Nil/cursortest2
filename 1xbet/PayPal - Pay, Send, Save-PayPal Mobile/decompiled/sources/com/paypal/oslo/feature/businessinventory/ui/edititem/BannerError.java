package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "", "<init>", "()V", "SaveItemValidationError", "SaveProductException", "SaveServiceException", "DeleteProductError", "DeleteProductException", "DeleteServiceError", "DeleteServiceException", "LoadTaxesError", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$DeleteProductError;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$DeleteProductException;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$DeleteServiceError;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$DeleteServiceException;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$LoadTaxesError;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$SaveItemValidationError;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$SaveProductException;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$SaveServiceException;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BannerError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$SaveItemValidationError;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveItemValidationError extends com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveItemValidationError INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveItemValidationError();

        public final int hashCode() {
            return 2042238515;
        }

        private SaveItemValidationError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SaveItemValidationError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveItemValidationError)) {
                return false;
            }
            return true;
        }
    }

    private BannerError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$SaveProductException;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveProductException extends com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveProductException INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveProductException();

        public final int hashCode() {
            return -50098487;
        }

        private SaveProductException() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SaveProductException";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveProductException)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$SaveServiceException;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveServiceException extends com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveServiceException INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveServiceException();

        public final int hashCode() {
            return -809290813;
        }

        private SaveServiceException() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SaveServiceException";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveServiceException)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$DeleteProductError;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteProductError extends com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteProductError INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteProductError();

        public final int hashCode() {
            return 1657190832;
        }

        private DeleteProductError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DeleteProductError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteProductError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$DeleteProductException;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteProductException extends com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteProductException INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteProductException();

        public final int hashCode() {
            return 222667767;
        }

        private DeleteProductException() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DeleteProductException";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteProductException)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$DeleteServiceError;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteServiceError extends com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteServiceError INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteServiceError();

        public final int hashCode() {
            return 1002695594;
        }

        private DeleteServiceError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DeleteServiceError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteServiceError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$DeleteServiceException;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteServiceException extends com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteServiceException INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteServiceException();

        public final int hashCode() {
            return -536524559;
        }

        private DeleteServiceException() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DeleteServiceException";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteServiceException)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError$LoadTaxesError;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadTaxesError extends com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.LoadTaxesError INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.LoadTaxesError();

        public final int hashCode() {
            return -1558625919;
        }

        private LoadTaxesError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "LoadTaxesError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.LoadTaxesError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ BannerError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
