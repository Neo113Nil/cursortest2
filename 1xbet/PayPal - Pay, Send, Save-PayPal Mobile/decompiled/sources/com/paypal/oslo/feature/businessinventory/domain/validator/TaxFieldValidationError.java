package com.paypal.oslo.feature.businessinventory.domain.validator;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError;", "Landroid/os/Parcelable;", "NameError", "TaxError", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError$NameError;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError$TaxError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TaxFieldValidationError extends android.os.Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError$NameError;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Missing", "TooLong", "NotUnique", "ContainsLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NameError implements com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError {
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError> CREATOR;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError ContainsLink;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError Missing;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError NotUnique;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError TooLong;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError[] getHighSpeedVideoSizes;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private NameError(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError nameError = new com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError("Missing", 0);
            Missing = nameError;
            com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError nameError2 = new com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError("TooLong", 1);
            TooLong = nameError2;
            com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError nameError3 = new com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError("NotUnique", 2);
            NotUnique = nameError3;
            com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError nameError4 = new com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError("ContainsLink", 3);
            ContainsLink = nameError4;
            com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError[] nameErrorArr = {nameError, nameError2, nameError3, nameError4};
            getHighSpeedVideoSizes = nameErrorArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(nameErrorArr);
            CREATOR = new com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.Creator();
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError[] newArray(int i) {
                return new com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.valueOf(parcel.readString());
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(name());
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError[] values() {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError$TaxError;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError;", "", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Missing"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TaxError implements com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError {
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError> CREATOR;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError Missing;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError[] getHighSpeedVideoFpsRangesFor;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private TaxError(java.lang.String str) {
        }

        static {
            com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError taxError = new com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError("Missing");
            Missing = taxError;
            com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError[] taxErrorArr = {taxError};
            getHighSpeedVideoFpsRangesFor = taxErrorArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(taxErrorArr);
            CREATOR = new com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError.Creator();
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError[] newArray(int i) {
                return new com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError.valueOf(parcel.readString());
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(name());
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError[] values() {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
