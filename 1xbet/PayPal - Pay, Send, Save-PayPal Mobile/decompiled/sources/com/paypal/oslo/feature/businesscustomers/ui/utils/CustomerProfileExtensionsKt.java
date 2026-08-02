package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "onCallClick", "onEmailClick", "onMessageClick", "Lkotlin/Function0;", "onAddPhoneClick", "onAddEmailClick", "", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/ContactAction;", "getContactActions", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerProfileExtensionsKt {
    public static /* synthetic */ java.util.List getContactActions$default(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt.m12877$r8$lambda$Cy3G8jr46enJ8rJpPPz3vHjLU((java.lang.String) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt.$r8$lambda$OXqZMhPrhoE0a7mUoZ4fXs8E8D8((java.lang.String) obj2);
                }
            };
        }
        kotlin.jvm.functions.Function1 function14 = function12;
        if ((i & 4) != 0) {
            function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt.m12878$r8$lambda$Gn7IlTuhO0jidsFTCxrYzff4As((java.lang.String) obj2);
                }
            };
        }
        kotlin.jvm.functions.Function1 function15 = function13;
        if ((i & 8) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 16) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        return getContactActions(customer, function1, function14, function15, function03, function02);
    }

    public static final java.util.List<com.paypal.oslo.feature.businesscustomers.ui.model.ContactAction> getContactActions(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        final java.lang.String format;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer.getPhoneNumbers());
        if (customerPhoneNumber != null && (format = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.format(customerPhoneNumber)) != null) {
            createListBuilder.add(new com.paypal.oslo.feature.businesscustomers.ui.model.ContactAction(com.paypal.pds.core.Icon.Mobile.INSTANCE, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt.m12876$r8$lambda$4Ft93KLZ_wDOtwzge60cxFHGBU(kotlin.jvm.functions.Function1.this, format);
                }
            }, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt.CustomerProfileScreenCallTestTag, new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item(com.paypal.oslo.feature.businesscustomers.analytics.UiContextValues.ItemName.CustomerProfile.CallButton, "customer_profile", com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.ContactCustomer, null, 8, null)));
            createListBuilder.add(new com.paypal.oslo.feature.businesscustomers.ui.model.ContactAction(com.paypal.pds.core.Icon.MessageText.INSTANCE, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt.$r8$lambda$3wEfrMdoDMlF4FluMBK98W0EZ5g(kotlin.jvm.functions.Function1.this, format);
                }
            }, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt.CustomerProfileScreenMessageTestTag, new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item(com.paypal.oslo.feature.businesscustomers.analytics.UiContextValues.ItemName.CustomerProfile.MessageButton, "customer_profile", com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.ContactCustomer, null, 8, null)));
        }
        final java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer.getEmails());
        if (str != null) {
            createListBuilder.add(new com.paypal.oslo.feature.businesscustomers.ui.model.ContactAction(com.paypal.pds.core.Icon.Envelope.INSTANCE, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerProfileExtensionsKt.m12879$r8$lambda$jONQI7poIsOpByzUtCmPbhHwt8(kotlin.jvm.functions.Function1.this, str);
                }
            }, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt.CustomerProfileScreenEmailTestTag, new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item(com.paypal.oslo.feature.businesscustomers.analytics.UiContextValues.ItemName.CustomerProfile.EmailButton, "customer_profile", com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.ContactCustomer, null, 8, null)));
        }
        if (customer.getPhoneNumbers().isEmpty()) {
            createListBuilder.add(new com.paypal.oslo.feature.businesscustomers.ui.model.ContactAction(com.paypal.pds.core.Icon.Plus.INSTANCE, function0, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt.CustomerProfileScreenAddPhoneTestTag, new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item("add_phone_button", "customer_profile", "add_phone", null, 8, null)));
        }
        if (customer.getEmails().isEmpty()) {
            createListBuilder.add(new com.paypal.oslo.feature.businesscustomers.ui.model.ContactAction(com.paypal.pds.core.Icon.Plus.INSTANCE, function02, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt.CustomerProfileScreenAddEmailTestTag, null, 8, null));
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3wEfrMdoDMlF4FluMBK98W0EZ5g(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4Ft93KLZ_wDOtwzge60cx-FHGBU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12876$r8$lambda$4Ft93KLZ_wDOtwzge60cxFHGBU(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Cy3G8jr46-e-nJ8rJpPPz3vHjLU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12877$r8$lambda$Cy3G8jr46enJ8rJpPPz3vHjLU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Gn7IlTuhO0jidsFTC-xrYzff4As, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12878$r8$lambda$Gn7IlTuhO0jidsFTCxrYzff4As(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OXqZMhPrhoE0a7mUoZ4fXs8E8D8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jONQI7-poIsOpByzUtCmPbhHwt8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12879$r8$lambda$jONQI7poIsOpByzUtCmPbhHwt8(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }
}
