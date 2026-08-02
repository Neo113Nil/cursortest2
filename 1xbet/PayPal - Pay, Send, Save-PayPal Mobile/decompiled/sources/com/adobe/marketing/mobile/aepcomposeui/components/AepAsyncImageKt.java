package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"AepAsyncImage", "", "image", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepImage;", "imageStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;", "onSuccess", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "onError", "", "(Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepImage;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "messaging_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepAsyncImageKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133 A[LOOP:0: B:50:0x0130->B:52:0x0133, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AepAsyncImage(final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepImage aepImage, com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle aepImageStyle, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function13;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function14;
        com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle aepImageStyle2;
        kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function15;
        java.lang.String str;
        java.lang.String url;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.MutableState mutableState;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.MutableState mutableState2;
        int i5;
        boolean z;
        com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$3$1 rememberedValue3;
        androidx.compose.runtime.MutableState mutableState3;
        kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function16;
        kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function18;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-466579987);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(aepImage) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            function13 = function1;
            i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function14 = function12;
                i3 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
                if (i6 == 2 || (i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        aepImageStyle2 = i6 != 0 ? new com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle(null, null, null, null, null, null, 63, null) : aepImageStyle;
                        com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$1 aepAsyncImageKt$AepAsyncImage$1 = i7 != 0 ? new kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ kotlin.Unit invoke(android.graphics.Bitmap bitmap) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
                                return kotlin.Unit.INSTANCE;
                            }
                        } : function13;
                        if (i4 != 0) {
                            function14 = new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$2
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                                    return kotlin.Unit.INSTANCE;
                                }
                            };
                        }
                        function15 = aepAsyncImageKt$AepAsyncImage$1;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        aepImageStyle2 = aepImageStyle;
                        function15 = function13;
                    }
                    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function19 = function14;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-466579987, i, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImage (AepAsyncImage.kt:45)");
                    }
                    if (androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
                        if ((aepImage != null ? aepImage.getDarkUrl() : null) != null) {
                            url = aepImage.getDarkUrl();
                            str = url;
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                            java.lang.Object[] objArr = {str, mutableState2, mutableState, function15, function19};
                            startRestartGroup.startReplaceableGroup(-568225417);
                            z = false;
                            for (i5 = 0; i5 < 5; i5++) {
                                z |= startRestartGroup.changed(objArr[i5]);
                            }
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                mutableState3 = mutableState;
                                rememberedValue3 = new com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$3$1(str, mutableState2, function15, mutableState, function19, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                mutableState3 = mutableState;
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 64);
                            if (((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
                                startRestartGroup.startReplaceableGroup(1428167582);
                                androidx.compose.ui.Modifier modifier = aepImageStyle2.getModifier();
                                if (modifier == null) {
                                    modifier = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f));
                                }
                                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                                startRestartGroup.startReplaceableGroup(733328855);
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                function16 = function19;
                                function17 = function15;
                                androidx.compose.material3.ProgressIndicatorKt.m3616CircularProgressIndicatorLxG7B9w(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f)), 0L, androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f), 0L, 0, startRestartGroup, 390, 26);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                            } else {
                                function16 = function19;
                                function17 = function15;
                                startRestartGroup.startReplaceableGroup(1428167990);
                                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) mutableState3.getValue();
                                if (bitmap != null) {
                                    com.adobe.marketing.mobile.aepcomposeui.components.AepImageKt.AepImage(new androidx.compose.ui.graphics.painter.BitmapPainter(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, 0L, 6, null), aepImageStyle2, startRestartGroup, 72, 0);
                                }
                            }
                            startRestartGroup.endReplaceableGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function18 = function16;
                        }
                    }
                    if (aepImage != null) {
                        url = aepImage.getUrl();
                        str = url;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                        java.lang.Object[] objArr2 = {str, mutableState2, mutableState, function15, function19};
                        startRestartGroup.startReplaceableGroup(-568225417);
                        z = false;
                        while (i5 < 5) {
                        }
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z) {
                        }
                        mutableState3 = mutableState;
                        rememberedValue3 = new com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$3$1(str, mutableState2, function15, mutableState, function19, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 64);
                        if (((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        function18 = function16;
                    } else {
                        str = null;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                        java.lang.Object[] objArr22 = {str, mutableState2, mutableState, function15, function19};
                        startRestartGroup.startReplaceableGroup(-568225417);
                        z = false;
                        while (i5 < 5) {
                        }
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z) {
                        }
                        mutableState3 = mutableState;
                        rememberedValue3 = new com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$3$1(str, mutableState2, function15, mutableState, function19, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 64);
                        if (((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        function18 = function16;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    aepImageStyle2 = aepImageStyle;
                    function17 = function13;
                    function18 = function14;
                }
                androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                final com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle aepImageStyle3 = aepImageStyle2;
                final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function110 = function17;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$6
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt.AepAsyncImage(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepImage.this, aepImageStyle3, function110, function18, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                });
                return;
            }
            function14 = function12;
            if (i6 == 2) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            function15 = aepAsyncImageKt$AepAsyncImage$1;
            kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function192 = function14;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
            }
            if (aepImage != null) {
            }
        }
        function13 = function1;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function14 = function12;
        if (i6 == 2) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        function15 = aepAsyncImageKt$AepAsyncImage$1;
        kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1922 = function14;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        if (androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
        }
        if (aepImage != null) {
        }
    }
}
