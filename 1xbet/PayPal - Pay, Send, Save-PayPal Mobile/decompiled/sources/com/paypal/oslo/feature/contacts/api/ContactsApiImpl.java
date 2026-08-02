package com.paypal.oslo.feature.contacts.api;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0016\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001c\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/ContactsApiImpl;", "Lcom/paypal/oslo/feature/contacts/api/ContactsApi;", "<init>", "()V", "Lcom/paypal/oslo/feature/contacts/api/configs/PreSearchContactViewConfig;", "config", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contacts", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "", "onEvent", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsPayloadConfig;", "payloadConfig", "Landroidx/compose/ui/Modifier;", "modifier", "PreSearchContactView", "(Lcom/paypal/oslo/feature/contacts/api/configs/PreSearchContactViewConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsPayloadConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;", "searchStrategy", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;", "ContactSearchScreen", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsPayloadConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "onClickListener", "", "placeholderText", "SearchContactsButton", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContactsApiImpl implements com.paypal.oslo.feature.contacts.api.ContactsApi {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ContactsApiImpl() {
    }

    @Override // com.paypal.oslo.feature.contacts.api.ContactsApi
    public final void PreSearchContactView(com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig preSearchContactViewConfig, java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig contactsPayloadConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preSearchContactViewConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsPayloadConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(2020072441);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2020072441, i, -1, "com.paypal.oslo.feature.contacts.api.ContactsApiImpl.PreSearchContactView (ContactsApiImpl.kt:59)");
        }
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, modifier);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
        com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.getHighSpeedVideoSizes(preSearchContactViewConfig.getSearchBarConfig().getPlaceholderText(), function1, composer, (i >> 3) & 112);
        com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.getHighSpeedVideoFpsRangesFor(preSearchContactViewConfig.getCtaGroupConfig(), !list.isEmpty(), function1, composer, i & 896);
        com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.Camera2StreamConfigurationMap(preSearchContactViewConfig.getContactsListConfig(), list, function1, composer, i & 1008);
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.contacts.api.ContactsApi
    public final void ContactSearchScreen(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig, com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig contactsPayloadConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsSearchStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsPayloadConfig, "");
        composer.startReplaceGroup(1498991655);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1498991655, i, -1, "com.paypal.oslo.feature.contacts.api.ContactsApiImpl.ContactSearchScreen (ContactsApiImpl.kt:87)");
        }
        com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt.SearchContactsScreen(contactsSearchStrategy, function1, contactSearchScreenConfig, contactsPayloadConfig.getContactSearchNetworkType(), modifier, null, composer, ((i >> 3) & 14) | ((i << 3) & 112) | (i & 896) | (i & 57344), 32);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.contacts.api.ContactsApi
    public final void SearchContactsButton(kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        composer.startReplaceGroup(338877875);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(338877875, i, -1, "com.paypal.oslo.feature.contacts.api.ContactsApiImpl.SearchContactsButton (ContactsApiImpl.kt:102)");
        }
        com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.Camera2StreamConfigurationMap(function0, str, modifier, composer, i & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
