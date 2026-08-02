package com.paypal.oslo.feature.businessinventory.domain.validator;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\tJ+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/ItemLibraryEntityValidatorImpl;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/ItemLibraryEntityValidator;", "<init>", "()V", "", "name", "", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError$NameError;", "validateName", "(Ljava/lang/String;)Ljava/util/Set;", "", "price", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError$PriceError;", "validatePrice", "(J)Ljava/util/Set;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError$DescriptionError;", "validateDescription", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/UniquenessValidationSubject;", "item", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "items", "validateUniqueness", "(Lcom/paypal/oslo/feature/businessinventory/domain/validator/UniquenessValidationSubject;Ljava/util/List;)Ljava/util/Set;", "p0", "", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemLibraryEntityValidatorImpl implements com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ItemLibraryEntityValidatorImpl() {
    }

    @Override // com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator
    public final java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError> validateName(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        if (kotlin.text.StringsKt.isBlank(name2)) {
            createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError.Missing);
        } else if (name2.length() > 80) {
            createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError.TooLong);
        }
        if (Camera2StreamConfigurationMap(name2)) {
            createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError.ContainsLink);
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }

    @Override // com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator
    public final java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError> validatePrice(long price) {
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        if (price == 0) {
            createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError.Missing);
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }

    @Override // com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator
    public final java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError> validateDescription(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        if (description.length() > 1000) {
            createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError.TooLong);
        }
        if (Camera2StreamConfigurationMap(description)) {
            createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError.ContainsLink);
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }

    @Override // com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator
    public final java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError> validateUniqueness(com.paypal.oslo.feature.businessinventory.domain.validator.UniquenessValidationSubject item, java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj).getId(), item.getItemId())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) it.next();
                if (kotlin.text.StringsKt.equals(libraryItem.getName(), item.getName(), true) && kotlin.jvm.internal.Intrinsics.areEqual(libraryItem.getPrice().getCurrencyCode(), item.getCurrencyCode())) {
                    createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError.NotUnique);
                    break;
                }
            }
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String p0) {
        if (p0 != null) {
            java.util.List<java.lang.String> split = new kotlin.text.Regex("\\s+").split(p0, 0);
            if (split != null) {
                java.util.List<java.lang.String> list = split;
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    return false;
                }
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (androidx.core.util.PatternsCompat.WEB_URL.matcher((java.lang.String) it.next()).matches()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
