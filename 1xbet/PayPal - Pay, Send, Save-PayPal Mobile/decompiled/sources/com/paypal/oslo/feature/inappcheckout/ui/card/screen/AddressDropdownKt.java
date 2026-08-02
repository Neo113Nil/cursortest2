package com.paypal.oslo.feature.inappcheckout.ui.card.screen;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"AddressDropdown", "", "dropdownState", "Lcom/paypal/pds/components/DropdownState;", "addresses", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/SavedAddress;", "selectedAddressId", "", "onAddressSelect", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "isLoading", "", "(Lcom/paypal/pds/components/DropdownState;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressDropdownKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressDropdown(final com.paypal.pds.components.DropdownState dropdownState, final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> list, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        boolean z3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final java.util.List emptyList;
        final com.paypal.pds.components.MenuItem menuItem;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(931141588);
        int i5 = (i & 6) == 0 ? ((i & 8) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i5 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i3 = i2 & 32;
            if (i3 == 0) {
                i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z2 = z;
                i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                i4 = i5;
                if (!startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    z3 = z2;
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    z3 = i3 != 0 ? false : z2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(931141588, i4, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdown (AddressDropdown.kt:36)");
                    }
                    final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    if (list != null) {
                        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> list2 = list;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress savedAddress : list2) {
                            arrayList.add(new com.paypal.pds.components.MenuItem(null, savedAddress.getDisplayName(), savedAddress.getId(), null, null, 25, null));
                        }
                        emptyList = arrayList;
                    } else {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    if (str != null) {
                        java.util.Iterator it = emptyList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.MenuItem) obj).getKey(), str)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        com.paypal.pds.components.MenuItem menuItem2 = (com.paypal.pds.components.MenuItem) obj;
                        if (menuItem2 != null) {
                            menuItem = menuItem2;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.ShimmerKt.Shimmer(com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z3, modifier4, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(104923841, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt.m15472$r8$lambda$RvvK6EMa6EIHfeTfsTNfximhgg(context, dropdownState, menuItem, emptyList, function1, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 12) & 112) | 3078 | ((i4 >> 6) & 896), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                        }
                    }
                    menuItem = (com.paypal.pds.components.MenuItem) kotlin.collections.CollectionsKt.firstOrNull(emptyList);
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ShimmerKt.Shimmer(com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z3, modifier4, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(104923841, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt.m15472$r8$lambda$RvvK6EMa6EIHfeTfsTNfximhgg(context, dropdownState, menuItem, emptyList, function1, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i4 >> 12) & 112) | 3078 | ((i4 >> 6) & 896), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final boolean z4 = z3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt.$r8$lambda$srHfsQkD_WiYIuh9FsFb_YrrIxY(com.paypal.pds.components.DropdownState.this, list, str, function1, modifier3, z4, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            i4 = i5;
            if (!startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        z2 = z;
        i4 = i5;
        if (!startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KZwmxC_OfwrMODdWjlvB5YzruHY(kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        function1.invoke(menuItem.getKey().toString());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RvvK6EMa6EIHfeTfsTN-fximhgg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15472$r8$lambda$RvvK6EMa6EIHfeTfsTNfximhgg(android.content.Context context, com.paypal.pds.components.DropdownState dropdownState, com.paypal.pds.components.MenuItem menuItem, java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(104923841, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdown.<anonymous> (AddressDropdown.kt:54)");
            }
            java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_billing_address_label, new java.lang.Object[0], composer, 0);
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt.$r8$lambda$KZwmxC_OfwrMODdWjlvB5YzruHY(kotlin.jvm.functions.Function1.this, (com.paypal.pds.components.MenuItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt.$r8$lambda$VrFxGQ7cHPxH3yS4njbOWkrMY0Y((com.paypal.pds.components.MenuItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.DropdownKt.Dropdown(dropdownState, menuItem, list, function12, (kotlin.jvm.functions.Function1) rememberedValue2, rememberStringValue, false, null, null, null, null, false, composer, com.paypal.pds.components.DropdownState.$stable | 24576, 0, 4032);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VrFxGQ7cHPxH3yS4njbOWkrMY0Y(com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$srHfsQkD_WiYIuh9FsFb_YrrIxY(com.paypal.pds.components.DropdownState dropdownState, java.util.List list, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressDropdown(dropdownState, list, str, function1, modifier, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
