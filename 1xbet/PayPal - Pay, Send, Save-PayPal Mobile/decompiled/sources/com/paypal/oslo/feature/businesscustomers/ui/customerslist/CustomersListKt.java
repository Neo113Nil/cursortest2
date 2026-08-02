package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aw\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001aI\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0001¢\u0006\u0002\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010 \u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010!\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"CustomersListLoadMoreTestTag", "", "CustomersListCustomerItemTestTag", "CustomersListLazyColumnTestTag", "CustomersList", "", "modifier", "Landroidx/compose/ui/Modifier;", "customers", "", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "isLoadingMore", "", "displayInfoButton", "onSelectCustomer", "Lkotlin/Function1;", "onClickInfo", "onReachEndOfList", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CustomerListItem", "customer", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LoadMoreListItem", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CustomerName", "displayName", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerDisplayName;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerDisplayName;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CustomerItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "LoadMoreListItemPreview", "CustomersListPreview", "CustomersListSelectPreview", "business-customers_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomersListKt {
    public static final java.lang.String CustomersListCustomerItemTestTag = "CustomersList_CustomerItem";
    public static final java.lang.String CustomersListLazyColumnTestTag = "CustomersList_LazyColumnTestTag";
    public static final java.lang.String CustomersListLoadMoreTestTag = "CustomersList_LoadMore";

    /* JADX WARN: Removed duplicated region for block: B:103:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomersList(androidx.compose.ui.Modifier modifier, java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> list, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function13;
        int i7;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function14;
        int i8;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.ui.Modifier modifier2;
        final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> list2;
        final boolean z5;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final boolean z6;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function15;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function16;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function17;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function18;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(275360058);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function13 = function1;
                        i3 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function14 = function12;
                        } else {
                            function14 = function12;
                            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i3 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
                            }
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            function02 = function0;
                        } else {
                            function02 = function0;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                            }
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            list2 = list;
                            z5 = z3;
                            function03 = function02;
                            z6 = z4;
                            function15 = function14;
                            function16 = function13;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            list2 = i10 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
                            boolean z7 = i4 != 0 ? false : z3;
                            boolean z8 = i5 != 0 ? false : z4;
                            if (i6 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$1OHpN3zznAoQq2UfgF6b5IG9Q8s((com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function17 = (kotlin.jvm.functions.Function1) rememberedValue;
                            } else {
                                function17 = function13;
                            }
                            if (i7 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$hPW3pD6sho1WjPnT1vbtIzXfX4M((com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function18 = (kotlin.jvm.functions.Function1) rememberedValue2;
                            } else {
                                function18 = function14;
                            }
                            if (i8 != 0) {
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function04 = (kotlin.jvm.functions.Function0) rememberedValue3;
                            } else {
                                function04 = function02;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(275360058, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersList (CustomersList.kt:74)");
                            }
                            int size = list2.size();
                            if (z7) {
                                size++;
                            }
                            androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            boolean isAtBottom = com.paypal.oslo.feature.businesscustomers.ui.utils.ComposableUtilsKt.isAtBottom(rememberLazyListState, startRestartGroup, 0);
                            boolean changed = startRestartGroup.changed(isAtBottom);
                            boolean z9 = (3670016 & i3) == 1048576;
                            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$CustomersList$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                            if ((changed | z9) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$CustomersList$4$1(isAtBottom, function04, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isAtBottom), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
                            androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.platform.TestTagKt.testTag(companion, CustomersListLazyColumnTestTag), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("customers_list", 0, null, null, 14, null));
                            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                            boolean changed2 = startRestartGroup.changed(size);
                            boolean changedInstance = startRestartGroup.changedInstance(list2);
                            modifier2 = companion;
                            boolean z10 = (i3 & 7168) == 2048;
                            boolean z11 = z7;
                            boolean z12 = (57344 & i3) == 16384;
                            boolean z13 = (i3 & 458752) == 131072;
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if ((z10 | changed2 | changedInstance | z12 | z13) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                final int i11 = size;
                                final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> list3 = list2;
                                final boolean z14 = z8;
                                final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function19 = function17;
                                final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function110 = function18;
                                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$eKyfa2PI1Yv_SMkEGSxMr4NLILk(i11, list3, z14, function19, function110, (androidx.compose.foundation.lazy.LazyListScope) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(module, rememberLazyListState, null, false, null, centerHorizontally, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 476);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z6 = z8;
                            function16 = function17;
                            function15 = function18;
                            z5 = z11;
                            function03 = function05;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$IUlhX5L9jN9vujMKQwWWR2iEVkE(androidx.compose.ui.Modifier.this, list2, z5, z6, function16, function15, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function13 = function1;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function13 = function1;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function13 = function1;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function13 = function1;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomerListItem(final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final boolean z3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1631756794);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(customer) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function03 = function0;
                    i3 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            function04 = function02;
                            z3 = z2;
                            function05 = function03;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            boolean z4 = i4 != 0 ? false : z2;
                            if (i5 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                            }
                            if (i6 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            } else {
                                function06 = function02;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1631756794, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListItem (CustomersList.kt:124)");
                            }
                            androidx.compose.ui.Modifier component = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(companion, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.businesscustomers.analytics.UiContextValues.ComponentName.CustomersList.ListItem, 0, null, null, 14, null));
                            if (!z4) {
                                str = com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.ViewCustomerInfo;
                            } else {
                                str = com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.SelectCustomerToInvoice;
                            }
                            androidx.compose.ui.Modifier userIntent = com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.userIntent(component, "customers_list", str);
                            boolean z5 = (i3 & 7168) == 2048;
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.m12853$r8$lambda$pgr6m5IB4_lhM1VT9mjLM__5aE(kotlin.jvm.functions.Function0.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function03;
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(userIntent, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 31), CustomersListCustomerItemTestTag.concat(java.lang.String.valueOf(customer.getId())));
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                            int i8 = i3 & 14;
                            com.paypal.pds.components.AvatarSource buildAvatar = com.paypal.oslo.feature.businesscustomers.ui.utils.AvatarUtilKt.buildAvatar(customer, startRestartGroup, i8);
                            boolean z6 = i8 == 4;
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (z6 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.getCustomerDisplayName(customer);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            com.paypal.pds.components.AvatarKt.Avatar(buildAvatar, null, com.paypal.pds.components.AvatarSize.Medium.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 58);
                            CustomerName((com.paypal.oslo.feature.businesscustomers.ui.model.CustomerDisplayName) rememberedValue4, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0, 0);
                            if (z4) {
                                startRestartGroup.startReplaceGroup(306109417);
                                com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Info.INSTANCE, function06, com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businesscustomers.analytics.UiContextValues.ItemName.CustomersList.CustomerInfoButton, 0, 2, null)), "customers_list", com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.ViewCustomerInfo), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_open_details, startRestartGroup, 0), null, false, false, startRestartGroup, ((i3 >> 9) & 112) | 3078, 464);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(306746994);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z3 = z4;
                            function04 = function06;
                            function05 = function07;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.m12852$r8$lambda$oJ22OJla5EA5_6gDy_7HZiD2lk(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, modifier3, z3, function05, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function03 = function0;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function03 = function0;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function03 = function0;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void LoadMoreListItem(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(21689393);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(21689393, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.LoadMoreListItem (CustomersList.kt:174)");
            }
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(modifier, com.paypal.pds.core.ConstantsKt.getSpacing16()), CustomersListLoadMoreTestTag), com.paypal.pds.components.LoaderSize.Small.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Small.$stable << 3, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$F8xQ508C0q5Cjb2r_R4KMJUcyZc(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomerName(final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerDisplayName customerDisplayName, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerDisplayName, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1675364497);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(customerDisplayName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1675364497, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerName (CustomersList.kt:187)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.lang.String title = customerDisplayName.getTitle();
                if (title != null) {
                    startRestartGroup.startReplaceGroup(894803609);
                    modifier3 = modifier4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(title, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(894803608);
                    startRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                    composer2 = startRestartGroup;
                }
                java.lang.String businessName = customerDisplayName.getBusinessName();
                if (businessName != null) {
                    composer2.startReplaceGroup(895126009);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(businessName, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(895126008);
                    composer2.endReplaceGroup();
                }
                java.lang.String subtitle = customerDisplayName.getSubtitle();
                if (subtitle != null) {
                    composer2.startReplaceGroup(895442736);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(subtitle, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, 384, 6, 1016);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(895442735);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.m12850$r8$lambda$MkkGadn54NudIJUh2C2Zp5y8Cc(com.paypal.oslo.feature.businesscustomers.ui.model.CustomerDisplayName.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CustomerItemPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-969240181);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-969240181, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerItemPreview (CustomersList.kt:220)");
            }
            CustomerListItem(com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.createCustomerForPreview("Robert California"), null, false, null, null, startRestartGroup, 0, 30);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$jLMTN1XMFHlcqPx6TTO_l9KQOYw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LoadMoreListItemPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1070735110);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1070735110, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.LoadMoreListItemPreview (CustomersList.kt:230)");
            }
            LoadMoreListItem(null, startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$gbCw95vrRPg7uY8XQgzKcZc68no(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomersListPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(814733553);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(814733553, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListPreview (CustomersList.kt:238)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Noop", "Jim Halpert", "Pam Beesly", "Dwight Schrute", "Michael Scott", "Stanley Hudson", "Phyllis Vance"});
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.createCustomerForPreview((java.lang.String) it.next()));
            }
            CustomersList(null, arrayList, true, false, null, null, null, startRestartGroup, 384, 121);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.m12849$r8$lambda$1rjFHOOHR1Avsn5YxaF8CuF6No(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomersListSelectPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1852673203);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1852673203, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListSelectPreview (CustomersList.kt:257)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Noop", "Jim Halpert", "Pam Beesly", "Dwight Schrute", "Michael Scott", "Stanley Hudson", "Phyllis Vance"});
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.createCustomerForPreview((java.lang.String) it.next()));
            }
            CustomersList(null, arrayList, true, true, null, null, null, startRestartGroup, 3456, 113);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$socl4FhCerlfWO74NnAT8IULIPw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0Pwdy18MClyC7RC_Eo39p5oksP8(java.util.List list, boolean z, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = (composer.changed(i) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1532629464, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersList.<anonymous>.<anonymous>.<anonymous> (CustomersList.kt:100)");
            }
            if (i >= list.size()) {
                composer.startReplaceGroup(-1232907283);
                LoadMoreListItem(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1232798659);
                final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) list.get(i);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(customer);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$t5VrTzSUZ3DBJxho9kIEng84LDY(kotlin.jvm.functions.Function1.this, customer);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean changed3 = composer.changed(function12);
                boolean changed4 = composer.changed(customer);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if ((changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.m12851$r8$lambda$OrcJGEorQaPE1chu4IMCGWKKqM(kotlin.jvm.functions.Function1.this, customer);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                CustomerListItem(customer, fillMaxWidth$default, z, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 48, 0);
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

    /* renamed from: $r8$lambda$0yvEQz00qLG3bd2i6h3PHIqmE-k, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m12848$r8$lambda$0yvEQz00qLG3bd2i6h3PHIqmEk(java.util.List list, int i) {
        if (i == list.size()) {
            return com.paypal.oslo.feature.businesscustomers.ui.model.CustomerListItemType.LoadingItem.INSTANCE;
        }
        return com.paypal.oslo.feature.businesscustomers.ui.model.CustomerListItemType.CustomerItem.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1OHpN3zznAoQq2UfgF6b5IG9Q8s(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1rjFHOOHR1Avsn5YxaF8Cu-F6No, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12849$r8$lambda$1rjFHOOHR1Avsn5YxaF8CuF6No(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomersListPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F8xQ508C0q5Cjb2r_R4KMJUcyZc(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LoadMoreListItem(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IUlhX5L9jN9vujMKQwWWR2iEVkE(androidx.compose.ui.Modifier modifier, java.util.List list, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomersList(modifier, list, z, z2, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MkkGadn54NudIJ-Uh2C2Zp5y8Cc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12850$r8$lambda$MkkGadn54NudIJUh2C2Zp5y8Cc(com.paypal.oslo.feature.businesscustomers.ui.model.CustomerDisplayName customerDisplayName, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomerName(customerDisplayName, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OrcJGEo-rQaPE1chu4IMCGWKKqM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12851$r8$lambda$OrcJGEorQaPE1chu4IMCGWKKqM(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        function1.invoke(customer);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eKyfa2PI1Yv_SMkEGSxMr4NLILk(int i, final java.util.List list, final boolean z, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, i, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.m12848$r8$lambda$0yvEQz00qLG3bd2i6h3PHIqmEk(list, ((java.lang.Integer) obj).intValue());
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1532629464, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.$r8$lambda$0Pwdy18MClyC7RC_Eo39p5oksP8(list, z, function1, function12, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gbCw95vrRPg7uY8XQgzKcZc68no(int i, androidx.compose.runtime.Composer composer, int i2) {
        LoadMoreListItemPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hPW3pD6sho1WjPnT1vbtIzXfX4M(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jLMTN1XMFHlcqPx6TTO_l9KQOYw(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomerItemPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oJ22O-Jla5EA5_6gDy_7HZiD2lk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12852$r8$lambda$oJ22OJla5EA5_6gDy_7HZiD2lk(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomerListItem(customer, modifier, z, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pgr6m5IB4_lh-M1VT9mjLM__5aE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12853$r8$lambda$pgr6m5IB4_lhM1VT9mjLM__5aE(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$socl4FhCerlfWO74NnAT8IULIPw(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomersListSelectPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t5VrTzSUZ3DBJxho9kIEng84LDY(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        function1.invoke(customer);
        return kotlin.Unit.INSTANCE;
    }
}
