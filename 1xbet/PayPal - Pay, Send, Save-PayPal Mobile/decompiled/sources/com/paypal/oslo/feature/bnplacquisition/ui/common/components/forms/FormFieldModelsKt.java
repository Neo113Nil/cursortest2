package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u0000*\u00020\u00002\n\u0010\u000b\u001a\u00020\t\"\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\b\u001a\u001d\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "", com.daon.sdk.face.license.License.FEATURE_MASK, "actualPattern", "addMask", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "dialingCode", "addDialingCode", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "", "", "chars", "addPasteFilter", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;[C)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "addPasteFilterOnlyDigits", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "addBreakLinePasteFilter", "addSensitive", "", "disableFractionalEntry", "addCurrency", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "validateOnChange", "validateOnBlur", "addValidationTiming", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;ZZ)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "formFieldId", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "addImeAction-Z1hltKU", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;I)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "addImeAction"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormFieldModelsKt {
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addMask$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return addMask(builder, str, str2);
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addMask(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        builder.set(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Mask.INSTANCE, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MaskFieldMetadata(str, str2));
        return builder;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addDialingCode(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        builder.set(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Phone.INSTANCE, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PhoneMetadata(str));
        return builder;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addPasteFilter(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, char... cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        builder.set(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter.INSTANCE, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata(false, kotlin.collections.ArraysKt.toSet(cArr), 1, null));
        return builder;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addPasteFilterOnlyDigits(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata pasteFilterMetadata = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata) builder.build().get(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter.INSTANCE);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter pasteFilter = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter.INSTANCE;
        java.util.Set<java.lang.Character> charsToFilter = pasteFilterMetadata != null ? pasteFilterMetadata.getCharsToFilter() : null;
        if (charsToFilter == null) {
            charsToFilter = kotlin.collections.SetsKt.emptySet();
        }
        builder.set(pasteFilter, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata(true, charsToFilter));
        return builder;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addBreakLinePasteFilter(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata pasteFilterMetadata = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata) builder.build().get(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter.INSTANCE);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter pasteFilter = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter.INSTANCE;
        boolean onlyDigits = pasteFilterMetadata != null ? pasteFilterMetadata.getOnlyDigits() : false;
        java.util.Set<java.lang.Character> charsToFilter = pasteFilterMetadata != null ? pasteFilterMetadata.getCharsToFilter() : null;
        if (charsToFilter == null) {
            charsToFilter = kotlin.collections.SetsKt.emptySet();
        }
        builder.set(pasteFilter, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata(onlyDigits, kotlin.collections.SetsKt.plus((java.util.Set) charsToFilter, (java.lang.Iterable) kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'\n', '\r'}))));
        return builder;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addSensitive(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        builder.set(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Sensitive.INSTANCE, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.SensitiveFieldMetadata(str));
        return builder;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addCurrency$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return addCurrency(builder, z);
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addCurrency(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.set(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Currency.INSTANCE, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.CurrencyFieldMetadata(z));
        return builder;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addValidationTiming$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return addValidationTiming(builder, z, z2);
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder addValidationTiming(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.set(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.ValidationTiming.INSTANCE, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.ValidationTimingMetadata(z, z2));
        return builder;
    }

    /* renamed from: addImeAction-Z1hltKU$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder m12363addImeActionZ1hltKU$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8216getNexteUduSuo();
        }
        return m12362addImeActionZ1hltKU(builder, formFieldId, i);
    }

    /* renamed from: addImeAction-Z1hltKU, reason: not valid java name */
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder m12362addImeActionZ1hltKU(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldId, "");
        java.lang.String lowerCase = formFieldId.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        builder.set(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.KeyboardNavigation.INSTANCE, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.KeyboardNavigationMetadata(i, "form_field_".concat(java.lang.String.valueOf(lowerCase)), null));
        return builder;
    }
}
