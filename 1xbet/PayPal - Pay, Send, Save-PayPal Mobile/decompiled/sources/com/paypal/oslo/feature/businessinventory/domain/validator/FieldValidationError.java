package com.paypal.oslo.feature.businessinventory.domain.validator;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError;", "", "NameError", "PriceError", "DescriptionError", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError$DescriptionError;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError$NameError;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError$PriceError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FieldValidationError {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError$NameError;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "Missing", "TooLong", "NotUnique", "ContainsLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NameError implements com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError {
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError ContainsLink;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError Missing;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError NotUnique;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError TooLong;
        private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private NameError(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError nameError = new com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError("Missing", 0);
            Missing = nameError;
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError nameError2 = new com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError("TooLong", 1);
            TooLong = nameError2;
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError nameError3 = new com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError("NotUnique", 2);
            NotUnique = nameError3;
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError nameError4 = new com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError("ContainsLink", 3);
            ContainsLink = nameError4;
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError[] nameErrorArr = {nameError, nameError2, nameError3, nameError4};
            getHighSpeedVideoFpsRanges = nameErrorArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(nameErrorArr);
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError[] values() {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError$PriceError;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError;", "", "<init>", "(Ljava/lang/String;)V", "Missing"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PriceError implements com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError {
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError Missing;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError[] getHighSpeedVideoFpsRangesFor;

        private PriceError(java.lang.String str) {
        }

        static {
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError priceError = new com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError("Missing");
            Missing = priceError;
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError[] priceErrorArr = {priceError};
            getHighSpeedVideoFpsRangesFor = priceErrorArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(priceErrorArr);
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError[] values() {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError$DescriptionError;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "TooLong", "ContainsLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DescriptionError implements com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError {
        private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError[] Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError ContainsLink;
        public static final com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError TooLong;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private DescriptionError(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError descriptionError = new com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError("TooLong", 0);
            TooLong = descriptionError;
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError descriptionError2 = new com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError("ContainsLink", 1);
            ContainsLink = descriptionError2;
            com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError[] descriptionErrorArr = {descriptionError, descriptionError2};
            Camera2StreamConfigurationMap = descriptionErrorArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(descriptionErrorArr);
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError[] values() {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError[]) Camera2StreamConfigurationMap.clone();
        }

        public static com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }
}
