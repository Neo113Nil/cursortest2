package com.paypal.oslo.feature.contacts.ui.contacts.state;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\n\"\u0015\u0010\u0011\u001a\u00020\u0005*\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "", "id", "(Lcom/paypal/oslo/feature/contacts/api/RecentSearch;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchCustomActionItem;", "Lcom/paypal/pds/core/Icon;", "getIconRes", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchCustomActionItem;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/core/Icon;", "iconRes", "getTitle", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchCustomActionItem;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "title", "getSubtitle", "subtitle", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "getActionIcon", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/core/Icon;", "actionIcon", "getActionContentDescription", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "actionContentDescription", "getAvatarContentDescription", "avatarContentDescription"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactSearchExtensionsKt {
    public static final com.paypal.pds.core.Icon getIconRes(com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem contactSearchCustomActionItem, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.pds.core.Icon.Link link;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchCustomActionItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1063483192, i, -1, "com.paypal.oslo.feature.contacts.ui.contacts.state.<get-iconRes> (ContactSearchExtensions.kt:29)");
        }
        int i2 = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactSearchExtensionsKt.WhenMappings.$EnumSwitchMapping$0[contactSearchCustomActionItem.getType().ordinal()];
        if (i2 == 1) {
            link = com.paypal.pds.core.Icon.Link.INSTANCE;
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            link = com.paypal.pds.core.Icon.ContactBook.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return link;
    }

    public static final java.lang.String getTitle(com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem contactSearchCustomActionItem, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchCustomActionItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1966451248, i, -1, "com.paypal.oslo.feature.contacts.ui.contacts.state.<get-title> (ContactSearchExtensions.kt:34)");
        }
        int i2 = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactSearchExtensionsKt.WhenMappings.$EnumSwitchMapping$0[contactSearchCustomActionItem.getType().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(25963376);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_custom_action_payment_link_title, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(25961848);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(25967825);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_custom_action_read_contacts_title, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String getSubtitle(com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem contactSearchCustomActionItem, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchCustomActionItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1420288356, i, -1, "com.paypal.oslo.feature.contacts.ui.contacts.state.<get-subtitle> (ContactSearchExtensions.kt:45)");
        }
        int i2 = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactSearchExtensionsKt.WhenMappings.$EnumSwitchMapping$0[contactSearchCustomActionItem.getType().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-902487545);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_custom_action_payment_link_subtitle, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(-902489070);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-902483000);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_custom_action_read_contacts_subtitle, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final com.paypal.pds.core.Icon getActionIcon(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.pds.core.Icon.Close close;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-143583527, i, -1, "com.paypal.oslo.feature.contacts.ui.contacts.state.<get-actionIcon> (ContactSearchExtensions.kt:56)");
        }
        int i2 = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactSearchExtensionsKt.WhenMappings.$EnumSwitchMapping$1[contactSearchContactItem.getActionType().ordinal()];
        if (i2 == 1) {
            close = com.paypal.pds.core.Icon.Close.INSTANCE;
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            close = com.paypal.pds.core.Icon.Information.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return close;
    }

    public static final java.lang.String getActionContentDescription(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1141989533, i, -1, "com.paypal.oslo.feature.contacts.ui.contacts.state.<get-actionContentDescription> (ContactSearchExtensions.kt:62)");
        }
        int i2 = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactSearchExtensionsKt.WhenMappings.$EnumSwitchMapping$1[contactSearchContactItem.getActionType().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-2059684026);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_contact_action_delete_content_description, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(-2059685624);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-2059679523);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_contact_info_content_description, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String id(com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearch, "");
        if (recentSearch instanceof com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem) {
            return ((com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem) recentSearch).getId();
        }
        if (recentSearch instanceof com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString) {
            return ((com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString) recentSearch).getId();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String getAvatarContentDescription(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1809402665, i, -1, "com.paypal.oslo.feature.contacts.ui.contacts.state.<get-avatarContentDescription> (ContactSearchExtensions.kt:78)");
        }
        int i2 = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactSearchExtensionsKt.WhenMappings.$EnumSwitchMapping$2[contactSearchContactItem.getContactNameType().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(625796937);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_business_avatar_content_description, new java.lang.Object[]{com.paypal.oslo.feature.contacts.ui.contacts.views.ContactSearchContactItemExtKt.contactPrimaryText(contactSearchContactItem)}, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(625794872);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(625803143);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_person_avatar_content_description, new java.lang.Object[]{com.paypal.oslo.feature.contacts.ui.contacts.views.ContactSearchContactItemExtKt.contactPrimaryText(contactSearchContactItem)}, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.contacts.api.CustomActionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.contacts.api.CustomActionType.PaymentLink.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.contacts.api.CustomActionType.ReadContacts.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.contacts.api.ContactActionType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.ContactActionType.Delete.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.ContactActionType.Info.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.contacts.api.ContactNameType.values().length];
            try {
                iArr3[com.paypal.oslo.feature.contacts.api.ContactNameType.BUSINESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[com.paypal.oslo.feature.contacts.api.ContactNameType.PERSON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
