package com.paypal.oslo.feature.revolvingcreditservicing.domain.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/PinValidatorImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/PinValidator;", "<init>", "()V", "", "pin", "confirmation", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinField;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinValidationError;", "validatePin", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinValidatorImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.PinValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PinValidatorImpl() {
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.PinValidator
    public final java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> validatePin(java.lang.String pin, java.lang.String confirmation) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmation, "");
        boolean z2 = true;
        if (pin.length() < 4 && confirmation.length() < 4) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.PIN, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.TOO_SHORT), kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.CONFIRMATION, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.TOO_SHORT));
        }
        if (pin.length() == 4 && confirmation.length() < 4) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.CONFIRMATION, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.TOO_SHORT));
        }
        if (pin.length() < 4 && confirmation.length() == 4) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.PIN, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.TOO_SHORT));
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(pin, confirmation)) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.PIN, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.MISMATCH), kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.CONFIRMATION, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.MISMATCH));
        }
        if (pin.length() >= 2) {
            java.lang.String str = pin;
            java.util.List<java.lang.String> windowed$default = kotlin.text.StringsKt.windowed$default(str, 2, 0, false, 6, null);
            if (!(windowed$default instanceof java.util.Collection) || !windowed$default.isEmpty()) {
                for (java.lang.String str2 : windowed$default) {
                    if (kotlin.text.CharsKt.digitToInt(str2.charAt(1)) != kotlin.text.CharsKt.digitToInt(str2.charAt(0)) + 1) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            java.util.List windowed$default2 = kotlin.text.StringsKt.windowed$default(str, 2, 0, false, 6, null);
            if (!(windowed$default2 instanceof java.util.Collection) || !windowed$default2.isEmpty()) {
                java.util.Iterator it = windowed$default2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String str3 = (java.lang.String) it.next();
                    if (kotlin.text.CharsKt.digitToInt(str3.charAt(1)) != kotlin.text.CharsKt.digitToInt(str3.charAt(0)) - 1) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z || z2) {
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.PIN, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.SEQUENTIAL_DIGITS));
            }
        }
        java.lang.String str4 = pin;
        if (str4.length() == 0) {
            return null;
        }
        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) != kotlin.text.StringsKt.first(str4)) {
                return null;
            }
        }
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.PIN, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.SAME_DIGITS));
    }
}
