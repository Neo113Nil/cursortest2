package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/UsNameLayoutProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;", "createUsNameLayout", "()Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UsNameLayoutProvider {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.UsNameLayoutProvider INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.UsNameLayoutProvider();

    private UsNameLayoutProvider() {
    }

    public final com.paypal.oslo.core.i18n.domain.model.NameLayout createUsNameLayout() {
        return new com.paypal.oslo.core.i18n.domain.model.NameLayout(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow[]{new com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent(com.paypal.oslo.core.i18n.domain.model.GivenName.m11413boximpl(com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl("")), "Legal first name", true))), new com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent(com.paypal.oslo.core.i18n.domain.model.Surname.m11522boximpl(com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl("")), "Legal last name", true)))}));
    }
}
