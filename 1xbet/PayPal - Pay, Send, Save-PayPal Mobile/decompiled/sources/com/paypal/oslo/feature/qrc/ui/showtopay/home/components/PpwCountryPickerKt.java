package com.paypal.oslo.feature.qrc.ui.showtopay.home.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aQ\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "", "Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "countries", "", "selectedCountryCode", "Lkotlin/Function1;", "", "onCountrySelect", "Lkotlin/Function0;", "onDismiss", "PpwCountryPicker", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PpwCountryPickerKt {
    private static final java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail[]{new com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail("US", "United States", 1, ""), new com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail("GB", "United Kingdom", 44, ""), new com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail("IN", "India", 91, ""), new com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail("DE", "Germany", 49, ""), new com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail("FR", "France", 33, ""), new com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail("AU", "Australia", 61, "")});

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        if (r10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PpwCountryPicker(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> list, final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1380113620);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1380113620, i3, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPicker (PpwCountryPicker.kt:42)");
            }
            boolean changed = startRestartGroup.changed(list);
            java.util.ArrayList rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> list2 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (final com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail : list2) {
                    arrayList.add(new com.paypal.pds.components.MenuItem(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802599778, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt.m17946$r8$lambda$rVUCYh8kMxxxBamTmilprzYRAs(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail.this, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    }), countryPhoneDetail.getCountryName(), countryPhoneDetail.getCountryCode(), null, null, 24, null));
                }
                rememberedValue = arrayList;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.util.List list3 = (java.util.List) rememberedValue;
            boolean changed2 = startRestartGroup.changed(list);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
                obj = rememberedValue2;
            }
            java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> list4 = list;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
            for (java.lang.Object obj3 : list4) {
                linkedHashMap.put(((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj3).getCountryCode(), obj3);
            }
            startRestartGroup.updateRememberedValue(linkedHashMap);
            obj = linkedHashMap;
            final java.util.Map map = (java.util.Map) obj;
            boolean z = (i3 & 896) == 256;
            boolean changed3 = startRestartGroup.changed(list3);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.MenuItem) obj2).getKey(), str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                rememberedValue3 = (com.paypal.pds.components.MenuItem) obj2;
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.MenuItem menuItem = (com.paypal.pds.components.MenuItem) rememberedValue3;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_txt_country_region, startRestartGroup, 0);
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null);
            boolean changedInstance = startRestartGroup.changedInstance(map);
            boolean z2 = (i3 & 7168) == 2048;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance | z2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt.$r8$lambda$BMoJZWYI8bX9zbdfgDfV96QxVW0(map, function1, (com.paypal.pds.components.MenuItem) obj4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            boolean changedInstance2 = startRestartGroup.changedInstance(map);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt.m17944$r8$lambda$9Nkz2ekD_SuEftuj7ePUc9Ex2Y(map, (com.paypal.pds.components.MenuItem) obj4, (java.lang.String) obj5));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.MenuKt.Menu((java.util.List<com.paypal.pds.components.MenuItem>) list3, bottomSheetController, (java.lang.String) null, (java.lang.String) null, topNavConfig, menuItem, (kotlin.jvm.functions.Function1<? super com.paypal.pds.components.MenuItem, kotlin.Unit>) function12, function0, function0, (kotlin.jvm.functions.Function2<? super com.paypal.pds.components.MenuItem, ? super java.lang.String, java.lang.Boolean>) rememberedValue5, true, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) null, false, stringResource, "", (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, ((i3 << 12) & 234881024) | (com.paypal.pds.components.BottomSheetController.$stable << 3) | ((i3 << 3) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 12) | ((i3 << 9) & 29360128), 24582, 38924);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                    return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt.$r8$lambda$jRBJfNkWBxajGA4TwPvbCgB7UiA(com.paypal.pds.components.BottomSheetController.this, list, str, function1, function0, i, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2080584394);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2080584394, i2, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.components.CountryFlag (PpwCountryPicker.kt:93)");
            }
            com.paypal.pds.components.ImageKt.Image(com.paypal.pds.core.FlagKt.rememberFlagPainter(str, com.paypal.pds.core.FlagSize.Medium.INSTANCE, startRestartGroup, (i2 & 14) | (com.paypal.pds.core.FlagSize.Medium.$stable << 3), 0), "", androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), null, null, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 3120, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt.$r8$lambda$AIZ0pv2lqk3jjObxLfRQVHlLzDc(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$4D2tlfYc3GYvy-sf1SqeFvjwkjk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17943$r8$lambda$4D2tlfYc3GYvysf1SqeFvjwkjk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-989755680);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-989755680, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerPreview (PpwCountryPicker.kt:120)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            java.lang.Object obj = rememberedValue;
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
                bottomSheetController.showSheet();
                startRestartGroup.updateRememberedValue(bottomSheetController);
                obj = bottomSheetController;
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) obj;
            java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> list = getHighSpeedVideoFpsRanges;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt.m17945$r8$lambda$NNiPaJY7hLdYo5At0ahpYg3lQo((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            PpwCountryPicker(bottomSheetController2, list, "US", function1, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 28032);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt.m17943$r8$lambda$4D2tlfYc3GYvysf1SqeFvjwkjk(updateChangedFlags, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9Nkz2ekD_SuEftuj7ePUc9Ex-2Y, reason: not valid java name */
    public static /* synthetic */ boolean m17944$r8$lambda$9Nkz2ekD_SuEftuj7ePUc9Ex2Y(java.util.Map map, com.paypal.pds.components.MenuItem menuItem, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = kotlin.text.StringsKt.trim(str).toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String str2 = lowerCase;
        if (str2.length() == 0) {
            return true;
        }
        java.lang.Object key = menuItem.getKey();
        kotlin.jvm.internal.Intrinsics.checkNotNull(key, "");
        com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail = (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) map.get((java.lang.String) key);
        if (countryPhoneDetail != null) {
            java.lang.String lowerCase2 = countryPhoneDetail.getCountryName().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null)) {
                java.lang.String lowerCase3 = countryPhoneDetail.getCountryCode().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase3, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null)) {
                }
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AIZ0pv2lqk3jjObxLfRQVHlLzDc(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BMoJZWYI8bX9zbdfgDfV96QxVW0(java.util.Map map, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        java.lang.Object key = menuItem.getKey();
        kotlin.jvm.internal.Intrinsics.checkNotNull(key, "");
        com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail = (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) map.get((java.lang.String) key);
        if (countryPhoneDetail != null) {
            function1.invoke(countryPhoneDetail);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NNiPaJ-Y7hLdYo5At0ahpYg3lQo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17945$r8$lambda$NNiPaJY7hLdYo5At0ahpYg3lQo(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryPhoneDetail, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jRBJfNkWBxajGA4TwPvbCgB7UiA(com.paypal.pds.components.BottomSheetController bottomSheetController, java.util.List list, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PpwCountryPicker(bottomSheetController, list, str, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rVUCYh8kMxxxBamT-milprzYRAs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17946$r8$lambda$rVUCYh8kMxxxBamTmilprzYRAs(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(802599778, i, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.components.toMenuItem.<anonymous> (PpwCountryPicker.kt:87)");
            }
            getHighSpeedVideoFpsRangesFor(countryPhoneDetail.getCountryCode(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
