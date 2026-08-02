package com.paypal.oslo.feature.helpcenter.ui.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"TopicListSection", "", "heading", "", "topics", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/TopicUiData;", "onTopicClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TopicListWithIconsPreview", "(Landroidx/compose/runtime/Composer;I)V", "TopicListWithoutIconsPreview", "helpcenter_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TopicListSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopicListSection(final java.lang.String str, final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2004751534);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i5;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                androidx.compose.runtime.Composer composer3 = startRestartGroup;
                composer3.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composer3;
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2004751534, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.components.TopicListSection (TopicListSection.kt:49)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier4, "topic_list_section");
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                int i7 = i3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "topic_list_heading"), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, (i3 & 14) | 48, 6, 1020);
                androidx.compose.runtime.Composer composer4 = startRestartGroup;
                composer4.startReplaceGroup(1496214661);
                int i8 = 0;
                for (java.lang.Object obj : list) {
                    if (i8 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    final com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData topicUiData = (com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData) obj;
                    java.lang.String title = topicUiData.getTitle();
                    final com.paypal.pds.core.Icon icon = topicUiData.getIcon();
                    if (icon != null) {
                        composer4.startReplaceGroup(-394735191);
                        i4 = 1;
                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1750101361, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt.m14808$r8$lambda$i2CwPLsXDcgx20Pa49VCYUqk(com.paypal.pds.core.Icon.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, composer4, 54);
                        composer4.endReplaceGroup();
                        composableLambda = rememberComposableLambda;
                    } else {
                        composer4.startReplaceGroup(-394735192);
                        composer4.endReplaceGroup();
                        composableLambda = null;
                        i4 = 1;
                    }
                    float spacing24 = com.paypal.pds.core.ConstantsKt.getSpacing24();
                    float spacing242 = com.paypal.pds.core.ConstantsKt.getSpacing24();
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), "topic_item_".concat(java.lang.String.valueOf(topicUiData.getId())));
                    int i9 = i7;
                    int i10 = (i9 & 896) == 256 ? i4 : 0;
                    boolean changedInstance = composer4.changedInstance(topicUiData);
                    java.lang.Object rememberedValue = composer4.rememberedValue();
                    if ((i10 | (changedInstance ? 1 : 0)) != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt.$r8$lambda$JZeGX9iiLINvsQLMYVm6QCI8CsM(kotlin.jvm.functions.Function1.this, topicUiData);
                            }
                        };
                        composer4.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(title, testTag2, null, null, null, true, true, null, composableLambda, null, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.unit.Dp.m8599boximpl(spacing24), androidx.compose.ui.unit.Dp.m8599boximpl(spacing242), null, null, false, composer4, 1769472, 0, 466588);
                    i8++;
                    i7 = i9;
                }
                composer4.endReplaceGroup();
                composer4.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                composer2 = composer4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt.m14806$r8$lambda$Wrq9wDe3pEzGA0X2Tnne83p0do(str, list, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i5;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JZeGX9iiLINvsQLMYVm6QCI8CsM(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData topicUiData) {
        function1.invoke(topicUiData);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$L-oEDnxLtq9tG4Y4tWMdafV34N0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14804$r8$lambda$LoEDnxLtq9tG4Y4tWMdafV34N0(com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData topicUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topicUiData, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QdlPggKhCbf-WUjsj_5whv8zfBk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14805$r8$lambda$QdlPggKhCbfWUjsj_5whv8zfBk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1312652316);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1312652316, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.components.TopicListWithIconsPreview (TopicListSection.kt:90)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData[]{new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData("1", "Payments & Transfers", com.paypal.pds.core.Icon.ArrowsLeftRight.INSTANCE, null, 8, null), new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Disputes & Limitations", com.paypal.pds.core.Icon.Warning.INSTANCE, null, 8, null), new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "My Account", com.paypal.pds.core.Icon.Person.INSTANCE, null, 8, null), new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData("4", "My Wallet", com.paypal.pds.core.Icon.Wallet.INSTANCE, null, 8, null), new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData("5", "Login & Security", com.paypal.pds.core.Icon.LockLocked.INSTANCE, null, 8, null), new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData("6", "Seller Tools", com.paypal.pds.core.Icon.Store.INSTANCE, null, 8, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt.m14807$r8$lambda$ZAAZ38vYcM3PjaWBQqymFKJ0kE((com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TopicListSection("All Topics", listOf, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 390, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt.m14805$r8$lambda$QdlPggKhCbfWUjsj_5whv8zfBk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Wrq9wDe3pEzGA0X2Tn-ne83p0do, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14806$r8$lambda$Wrq9wDe3pEzGA0X2Tnne83p0do(java.lang.String str, java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TopicListSection(str, list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZAAZ38vYcM3PjaW-BQqymFKJ0kE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14807$r8$lambda$ZAAZ38vYcM3PjaWBQqymFKJ0kE(com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData topicUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topicUiData, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gpjZjPKkxqCCuK7PQgtlLmHkqsA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-64357504);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-64357504, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.components.TopicListWithoutIconsPreview (TopicListSection.kt:113)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData[]{new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData("1", "General Information", null, null, 12, null), new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "1099-K and B-Notice", null, null, 12, null), new com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "FATCA", null, null, 12, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt.m14804$r8$lambda$LoEDnxLtq9tG4Y4tWMdafV34N0((com.paypal.oslo.feature.helpcenter.ui.models.TopicUiData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TopicListSection("Tax Information", listOf, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 390, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.TopicListSectionKt.$r8$lambda$gpjZjPKkxqCCuK7PQgtlLmHkqsA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i2-C-wPLs-XDcgx20Pa49VCYUqk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14808$r8$lambda$i2CwPLsXDcgx20Pa49VCYUqk(com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1750101361, i, -1, "com.paypal.oslo.feature.helpcenter.ui.components.TopicListSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TopicListSection.kt:64)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(icon), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, composer, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 58);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
