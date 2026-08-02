package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"isCopyKeyEvent", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "isCopyKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "selectionMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "addSelectionContainerTextContextMenuComponents", "selectionManager", "foundation", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionManager_androidKt {
    /* renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m2429isCopyKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        return androidx.compose.foundation.text.KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo2054mapZmokQxo(keyEvent) == androidx.compose.foundation.text.KeyCommand.COPY;
    }

    public static final androidx.compose.ui.Modifier selectionMagnifier(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        return !androidx.compose.foundation.Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.foundation.text.selection.SelectionManager_androidKt.m2427$r8$lambda$Csq4Y_0LDHicfyhqqConaU57Ws(androidx.compose.foundation.text.selection.SelectionManager.this, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, 1, null);
    }

    public static final androidx.compose.ui.Modifier addSelectionContainerTextContextMenuComponents(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifier_androidKt.addTextContextMenuComponentsWithContext(modifier, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.foundation.text.selection.SelectionManager_androidKt.$r8$lambda$6wpwoLuaA6JL8FML5VC9n3WJgy0(androidx.compose.foundation.text.selection.SelectionManager.this, (androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope) obj, (android.content.Context) obj2);
            }
        });
    }

    /* renamed from: $r8$lambda$2OsR-_1hldJzG06e_umVP2ufEtQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2426$r8$lambda$2OsR_1hldJzG06e_umVP2ufEtQ(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        selectionManager.selectAll$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$30DtrCaSPfEAjU_JPrTptEFKtz8(androidx.compose.ui.unit.Density density, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.unit.DpSize dpSize) {
        mutableState.setValue(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.m8767constructorimpl((density.mo1412roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(dpSize.getGetHighSpeedVideoSizes())) << 32) | (density.mo1412roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(dpSize.getGetHighSpeedVideoSizes())) & 4294967295L))));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6wpwoLuaA6JL8FML5VC9n3WJgy0(final androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, final android.content.Context context) {
        kotlin.Pair<androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextRange> contextTextAndSelection$foundation = selectionManager.getContextTextAndSelection$foundation();
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt.m2387addPlatformTextContextMenuItems71BSaZU(textContextMenuBuilderScope, context, false, contextTextAndSelection$foundation != null ? contextTextAndSelection$foundation.getFirst() : null, contextTextAndSelection$foundation != null ? contextTextAndSelection$foundation.getSecond() : null, selectionManager.getPlatformSelectionBehaviors(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager_androidKt.$r8$lambda$YanxVJCifIIW_G4GF71PoyMSH8w(androidx.compose.foundation.text.selection.SelectionManager.this, context, (androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Csq4Y_0LDHicfyhqq-ConaU57Ws, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m2427$r8$lambda$Csq4Y_0LDHicfyhqqConaU57Ws(final androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-1914520728);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1914520728, i, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:51)");
        }
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(selectionManager);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.ui.geometry.Offset m5741boximpl;
                    m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.foundation.text.selection.SelectionManagerKt.m2424calculateSelectionMagnifierCenterAndroidO0kMr_c(androidx.compose.foundation.text.selection.SelectionManager.this, ((androidx.compose.ui.unit.IntSize) mutableState.getValue()).m8776unboximpl()));
                    return m5741boximpl;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed = composer.changed(density);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.ui.Modifier m1349magnifierjPUL71Q$default;
                    m1349magnifierjPUL71Q$default = androidx.compose.foundation.Magnifier_androidKt.m1349magnifierjPUL71Q$default(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.compose.foundation.text.selection.SelectionManager_androidKt.$r8$lambda$Fpm2yjTSNI_8zm1zwbGGfV5RrgY(kotlin.jvm.functions.Function0.this, (androidx.compose.ui.unit.Density) obj2);
                        }
                    }, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.compose.foundation.text.selection.SelectionManager_androidKt.$r8$lambda$30DtrCaSPfEAjU_JPrTptEFKtz8(androidx.compose.ui.unit.Density.this, r2, (androidx.compose.ui.unit.DpSize) obj2);
                        }
                    }, 0.0f, true, 0L, 0.0f, 0.0f, false, androidx.compose.foundation.PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform(), 490, null);
                    return m1349magnifierjPUL71Q$default;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.ui.Modifier animatedSelectionMagnifier = androidx.compose.foundation.text.selection.SelectionMagnifierKt.animatedSelectionMagnifier(modifier, function0, (kotlin.jvm.functions.Function1) rememberedValue3);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return animatedSelectionMagnifier;
    }

    public static /* synthetic */ androidx.compose.ui.geometry.Offset $r8$lambda$Fpm2yjTSNI_8zm1zwbGGfV5RrgY(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.unit.Density density) {
        return (androidx.compose.ui.geometry.Offset) function0.invoke();
    }

    public static /* synthetic */ boolean $r8$lambda$XD53zag51HmnPtj4NJu8U3J8vXQ(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        return (selectionManager.getShowToolbar() && selectionManager.isInTouchMode()) ? false : true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YanxVJCifIIW_G4GF71PoyMSH8w(final androidx.compose.foundation.text.selection.SelectionManager selectionManager, android.content.Context context, androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope) {
        textContextMenuBuilderScope.separator();
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems = androidx.compose.foundation.text.TextContextMenuItems.Copy;
        boolean isNonEmptySelection$foundation = selectionManager.isNonEmptySelection$foundation();
        final kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.SelectionManager_androidKt.$r8$lambda$a0hwUcQKYICvwDn6MSUNp9mAO8E(androidx.compose.foundation.text.selection.SelectionManager.this);
            }
        };
        final kotlin.jvm.functions.Function0 function02 = null;
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems, isNonEmptySelection$foundation, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager_androidKt.$r8$lambda$jwPJcTIPkrNi5yJFQNf27Xk5TfE(kotlin.jvm.functions.Function0.this, function02, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems2 = androidx.compose.foundation.text.TextContextMenuItems.SelectAll;
        boolean z = !selectionManager.isEntireContainerSelected$foundation();
        final kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.selection.SelectionManager_androidKt.$r8$lambda$XD53zag51HmnPtj4NJu8U3J8vXQ(androidx.compose.foundation.text.selection.SelectionManager.this));
            }
        };
        final kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.SelectionManager_androidKt.m2426$r8$lambda$2OsR_1hldJzG06e_umVP2ufEtQ(androidx.compose.foundation.text.selection.SelectionManager.this);
            }
        };
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems2, z, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager_androidKt.$r8$lambda$jwPJcTIPkrNi5yJFQNf27Xk5TfE(kotlin.jvm.functions.Function0.this, function03, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        textContextMenuBuilderScope.separator();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a0hwUcQKYICvwDn6MSUNp9mAO8E(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        selectionManager.copy$foundation();
        if (selectionManager.isInTouchMode()) {
            selectionManager.onRelease();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jwPJcTIPkrNi5yJFQNf27Xk5TfE(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession) {
        function0.invoke();
        if (function02 == null || ((java.lang.Boolean) function02.invoke()).booleanValue()) {
            textContextMenuSession.close();
        }
        return kotlin.Unit.INSTANCE;
    }
}
