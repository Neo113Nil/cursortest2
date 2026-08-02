package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"CustomerView", "", "customer", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CustomerViewPreview", "(Landroidx/compose/runtime/Composer;I)V", "CustomerEmailOnlyViewPreview", "business-pay-and-get-paid_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0049  */
    /* JADX WARN: Type inference failed for: r3v15, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomerView(final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2 function2;
        androidx.compose.ui.Modifier modifier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1039008724);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(customer) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                kotlin.jvm.functions.Function0<kotlin.Unit> function03 = i4 != 0 ? null : function02;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1039008724, i3, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerView (CustomerView.kt:37)");
                }
                startRestartGroup.startReplaceGroup(-2054965548);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                if (function03 == null) {
                    startRestartGroup.startReplaceGroup(237318162);
                    startRestartGroup.endReplaceGroup();
                    modifier = fillMaxWidth$default;
                    function2 = 0;
                } else {
                    startRestartGroup.startReplaceGroup(237372629);
                    function2 = 0;
                    androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxWidth$default, null, null, false, null, null, function03, startRestartGroup, (i3 << 15) & 3670016, 31);
                    startRestartGroup.endReplaceGroup();
                    modifier = m22100clickable_mRqjOc;
                }
                startRestartGroup.endReplaceGroup();
                java.lang.String name2 = customer.getName();
                java.lang.String str = name2;
                if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                    name2 = function2;
                }
                java.lang.String email = name2 == null ? customer.getEmail() : name2;
                java.lang.String name3 = customer.getName();
                java.lang.String str2 = name3;
                if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
                    name3 = function2;
                }
                java.lang.String email2 = name3 != null ? customer.getEmail() : function2;
                if (function03 != null) {
                    function2 = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.ComposableSingletons$CustomerViewKt.INSTANCE.getLambda$1861473322$business_pay_and_get_paid_prodRelease();
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(email, modifier, email2, null, null, false, false, function2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1468128425, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerViewKt.$r8$lambda$rvsDqddKM_vUzwV0sJVWXhHcIR0(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, null, null, false, null, null, null, null, null, false, composer2, 100663296, 0, 523896);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function02 = function03;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerViewKt.m13219$r8$lambda$_Kf7YBi0X1BDaNte4UmTMgh_LE(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer.this, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CustomerViewPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2090342980);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2090342980, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerViewPreview (CustomerView.kt:81)");
            }
            CustomerView(new com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer((java.lang.String) null, "John Doe", "john.doe@example.com", (java.lang.String) null, (java.lang.String) null, 25, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerViewKt.$r8$lambda$ItuAVkR7V3H1vUj24sRIPqE5Fqc(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomerEmailOnlyViewPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1080540012);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1080540012, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerEmailOnlyViewPreview (CustomerView.kt:94)");
            }
            CustomerView(new com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer((java.lang.String) null, (java.lang.String) null, "john.doe@example.com", (java.lang.String) null, (java.lang.String) null, 27, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerViewKt.$r8$lambda$ptNxIaMTm7vigwlaU6KOheE8xD0(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ItuAVkR7V3H1vUj24sRIPqE5Fqc(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomerViewPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_Kf7Y-Bi0X1BDaNte4UmTMgh_LE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13219$r8$lambda$_Kf7YBi0X1BDaNte4UmTMgh_LE(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomerView(customer, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ptNxIaMTm7vigwlaU6KOheE8xD0(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomerEmailOnlyViewPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rvsDqddKM_vUzwV0sJVWXhHcIR0(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1468128425, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.CustomerView.<anonymous> (CustomerView.kt:49)");
            }
            java.lang.String photoUrl = customer.getPhotoUrl();
            if (photoUrl == null) {
                composer.startReplaceGroup(-1361885615);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1361885614);
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).scale(com.paypal.oslo.core.commonui.components.Scale.FIT).data(photoUrl).build(), null, null, null, null, composer, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), null, 2, null), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 11, null), null, null, null, null, composer, 0, 60);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
