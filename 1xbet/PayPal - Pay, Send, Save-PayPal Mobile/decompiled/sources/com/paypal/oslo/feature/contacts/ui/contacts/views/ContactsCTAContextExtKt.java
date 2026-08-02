package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;", "ctaType", "Lcom/paypal/oslo/feature/contacts/api/configs/CTALabels;", "labelOverridesFor", "(Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/contacts/api/configs/CTALabels;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactsCTAContextExtKt {
    public static final com.paypal.oslo.feature.contacts.api.configs.CTALabels labelOverridesFor(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext contactsCTAContext, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType contactsCTAType, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.feature.contacts.api.configs.CTALabels cTALabels;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsCTAContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsCTAType, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-738903776, i, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.labelOverridesFor (ContactsCTAContextExt.kt:27)");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(contactsCTAType, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE)) {
            composer.startReplaceGroup(-974847472);
            if (kotlin.jvm.internal.Intrinsics.areEqual(contactsCTAContext, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.NoQuery.INSTANCE)) {
                composer.startReplaceGroup(-1416918575);
                cTALabels = new com.paypal.oslo.feature.contacts.api.configs.CTALabels(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_contacts_pay_link_primary_text, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_contacts_pay_link_secondary_text, composer, 0), 1, null);
                composer.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(contactsCTAContext, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.ThresholdExceeded.INSTANCE)) {
                    composer.startReplaceGroup(-1416920014);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1416909174);
                cTALabels = new com.paypal.oslo.feature.contacts.api.configs.CTALabels(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_cant_find_pay_with_link, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_contacts_pay_link_secondary_text, composer, 0), 1, null);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(contactsCTAType, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SYNC.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(contactsCTAType, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SCAN.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(contactsCTAType, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.ADDCONTACT.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(contactsCTAType, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.UNILATERAL.INSTANCE)) {
                composer.startReplaceGroup(-1416921388);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-974142595);
            composer.endReplaceGroup();
            cTALabels = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cTALabels;
    }
}
