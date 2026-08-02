package com.paypal.oslo.feature.helpcenter.ui.components;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2P\u0010\t\u001aL\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u0011H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"ExpandableList", "", "T", "items", "", "modifier", "Landroidx/compose/ui/Modifier;", "initialVisibleCount", "", "itemContent", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "item", "index", "", "isLastVisible", "Landroidx/compose/runtime/Composable;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "helpcenter_prodRelease", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpandableListKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void ExpandableList(final java.util.List<? extends T> list, androidx.compose.ui.Modifier modifier, java.lang.Integer num, final kotlin.jvm.functions.Function5<? super T, ? super java.lang.Integer, ? super java.lang.Boolean, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.lang.Integer num2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.Integer num3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2073029877);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                num2 = num;
                i5 |= startRestartGroup.changed(num2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i5 |= startRestartGroup.changedInstance(function5) ? 2048 : 1024;
                }
                i4 = i5;
                boolean z = false;
                if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    num3 = num2;
                } else {
                    androidx.compose.ui.Modifier modifier5 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.Integer num4 = i3 != 0 ? null : num2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2073029877, i4, -1, "com.paypal.oslo.feature.helpcenter.ui.components.ExpandableList (ExpandableList.kt:46)");
                    }
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ExpandableListKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                androidx.compose.runtime.MutableState mutableStateOf$default;
                                mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                return mutableStateOf$default;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                    boolean z2 = num4 != null && list.size() > num4.intValue();
                    java.util.List<? extends T> take = (num4 == null || ((java.lang.Boolean) mutableState.getValue()).booleanValue()) ? list : kotlin.collections.CollectionsKt.take(list, num4.intValue());
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    startRestartGroup.startReplaceGroup(-1107196167);
                    int i7 = 0;
                    for (T t : take) {
                        if (i7 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        function5.invoke(t, java.lang.Integer.valueOf(i7), java.lang.Boolean.valueOf(i7 == take.size() - 1 ? true : z), startRestartGroup, java.lang.Integer.valueOf(i4 & 7168));
                        i7++;
                        z = false;
                    }
                    startRestartGroup.endReplaceGroup();
                    if (z2) {
                        startRestartGroup.startReplaceGroup(36802986);
                        java.lang.String str = ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? "Show Less" : "Show More";
                        com.paypal.pds.core.Typography.LinkMedium linkMedium = com.paypal.pds.core.Typography.LinkMedium.INSTANCE;
                        com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                        androidx.compose.ui.text.style.TextDecoration underline = androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline();
                        int m8444getEnde0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk();
                        androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        boolean changed = startRestartGroup.changed(mutableState);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ExpandableListKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.helpcenter.ui.components.ExpandableListKt.$r8$lambda$6ptRS9y9T9frI0GdiqMjQAxX45c(androidx.compose.runtime.MutableState.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        modifier4 = modifier5;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxWidth$default2, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, composer2, 6, 31), contentBase, underline, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8444getEnde0LSkKk), null, false, 0, 0, null, linkMedium, composer2, 3456, 6, 992);
                        composer2.endReplaceGroup();
                    } else {
                        modifier4 = modifier5;
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(37276759);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    num3 = num4;
                    modifier3 = modifier4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ExpandableListKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.helpcenter.ui.components.ExpandableListKt.$r8$lambda$toR9meJ9WREF5RnMb8hM5rv4L0w(list, modifier3, num3, function5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            num2 = num;
            if ((i & 3072) == 0) {
            }
            i4 = i5;
            boolean z3 = false;
            if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        num2 = num;
        if ((i & 3072) == 0) {
        }
        i4 = i5;
        boolean z32 = false;
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$6ptRS9y9T9frI0GdiqMjQAxX45c(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$toR9meJ9WREF5RnMb8hM5rv4L0w(java.util.List list, androidx.compose.ui.Modifier modifier, java.lang.Integer num, kotlin.jvm.functions.Function5 function5, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ExpandableList(list, modifier, num, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
