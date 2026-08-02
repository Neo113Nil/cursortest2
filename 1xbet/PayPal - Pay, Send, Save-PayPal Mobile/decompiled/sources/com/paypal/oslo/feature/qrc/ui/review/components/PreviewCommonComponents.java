package com.paypal.oslo.feature.qrc.ui.review.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/components/PreviewCommonComponents;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderConfig;", "config", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks;", "callbacks", "Landroidx/compose/ui/Modifier;", "modifier", "", "Header", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderConfig;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderData;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PreviewCommonComponents implements com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents();

    private PreviewCommonComponents() {
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents
    public final void Header(com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig headerConfig, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData headerData, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks headerCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(-1889315596);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1889315596, i, -1, "com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.Header (Header.kt:92)");
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount = headerData.getAmount();
        if (amount == null) {
            str = null;
        } else if (amount.getType() == com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH) {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = amount.getFiat();
            java.lang.String quantity = fiat != null ? fiat.getQuantity() : null;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat2 = amount.getFiat();
            java.lang.String currencyCode = fiat2 != null ? fiat2.getCurrencyCode() : null;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
            sb.append(quantity);
            sb.append(" ");
            sb.append(currencyCode);
            str = sb.toString();
        } else {
            str = amount.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Pay ");
        sb2.append(str);
        sb2.append(" to");
        java.lang.String obj = sb2.toString();
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination destination = headerData.getDestination();
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact contact = destination instanceof com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact ? (com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact) destination : null;
        java.lang.String name2 = contact != null ? contact.getName() : null;
        java.lang.String str2 = name2 == null ? "" : name2;
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination destination2 = headerData.getDestination();
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact contact2 = destination2 instanceof com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact ? (com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact) destination2 : null;
        java.lang.String initials = contact2 != null ? contact2.getInitials() : null;
        java.lang.String str3 = initials == null ? "" : initials;
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
        java.lang.String str4 = str3;
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(obj, null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
        com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Initials(str4), null, com.paypal.pds.components.AvatarSize.Small.INSTANCE, null, null, null, composer, com.paypal.pds.components.AvatarSize.Small.$stable << 6, 58);
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 0, 6, 1020);
        composer.endNode();
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
