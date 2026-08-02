package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u0003H\u0080@¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\b*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"textFieldMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "addBasicTextFieldTextContextMenuComponents", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "hasAvailableTextToPaste", "", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSelectionHandleInVisibleBound", "isStartHandle", "foundation", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldSelectionManager_androidKt {
    public static final androidx.compose.ui.Modifier textFieldMagnifier(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        return !androidx.compose.foundation.Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$J844BXxt9qkPvvvf9RaOl10pLK0(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, 1, null);
    }

    public static final androidx.compose.ui.Modifier addBasicTextFieldTextContextMenuComponents(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, final kotlinx.coroutines.CoroutineScope coroutineScope) {
        return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifier_androidKt.addTextContextMenuComponentsWithContext(modifier, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.m2458$r8$lambda$zi7FQzbY1hZPVe0QBZYbgp_NNo(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, coroutineScope, (androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope) obj, (android.content.Context) obj2);
            }
        });
    }

    public static final java.lang.Object hasAvailableTextToPaste(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.ui.platform.Clipboard clipboard = textFieldSelectionManager.getClipboard();
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(clipboard != null ? androidx.compose.foundation.internal.ClipboardUtils.hasText(clipboard) : false);
    }

    public static final boolean isSelectionHandleInVisibleBound(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        return androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBoundDefault(textFieldSelectionManager, z);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4zMkYZkzJ3JUI3nG7OUxsOrPwgw(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession) {
        function0.invoke();
        if (function02 == null || ((java.lang.Boolean) function02.invoke()).booleanValue()) {
            textContextMenuSession.close();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B5fjhVanZ-pzUqFRYI2LUFYsfhQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2455$r8$lambda$B5fjhVanZpzUqFRYI2LUFYsfhQ(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.autofill$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.Modifier $r8$lambda$J844BXxt9qkPvvvf9RaOl10pLK0(final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(1980580247);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1980580247, i, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:54)");
        }
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(textFieldSelectionManager);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.ui.geometry.Offset m5741boximpl;
                    m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.m2454calculateSelectionMagnifierCenterAndroidO0kMr_c(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, ((androidx.compose.ui.unit.IntSize) mutableState.getValue()).m8776unboximpl()));
                    return m5741boximpl;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed = composer.changed(density);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.ui.Modifier m1349magnifierjPUL71Q$default;
                    m1349magnifierjPUL71Q$default = androidx.compose.foundation.Magnifier_androidKt.m1349magnifierjPUL71Q$default(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$JpY2BEdbaYXXBlfmIIL3PhNMq2k(kotlin.jvm.functions.Function0.this, (androidx.compose.ui.unit.Density) obj2);
                        }
                    }, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$Pl73b0Aa9OwO3CbZLOenA9hM92w(androidx.compose.ui.unit.Density.this, r2, (androidx.compose.ui.unit.DpSize) obj2);
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

    public static /* synthetic */ androidx.compose.ui.geometry.Offset $r8$lambda$JpY2BEdbaYXXBlfmIIL3PhNMq2k(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.unit.Density density) {
        return (androidx.compose.ui.geometry.Offset) function0.invoke();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O3gpt9U0UUPSLBiYKD4JSGqgvbU(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.selectAll$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Pl73b0Aa9OwO3CbZLOenA9hM92w(androidx.compose.ui.unit.Density density, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.unit.DpSize dpSize) {
        mutableState.setValue(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.m8767constructorimpl((density.mo1412roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(dpSize.getGetHighSpeedVideoSizes())) << 32) | (density.mo1412roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(dpSize.getGetHighSpeedVideoSizes())) & 4294967295L))));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gCl98yKeJHmQGrt_JNRFlbG_UYg(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1 function1) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(function1, null), 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$iWAPEYVpjDgvImG1NlfXwlLzccY(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        return !textFieldSelectionManager.getTextToolbarShown$foundation();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$odeuMv56G2j37D6NWQQDhNLJ6OY(final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, final kotlinx.coroutines.CoroutineScope coroutineScope, android.content.Context context, androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope) {
        textContextMenuBuilderScope.separator();
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems = androidx.compose.foundation.text.TextContextMenuItems.Cut;
        boolean canShowCutMenuItem$foundation = textFieldSelectionManager.canShowCutMenuItem$foundation();
        final kotlin.jvm.functions.Function0 function0 = null;
        final androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1(textFieldSelectionManager, null);
        final kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$gCl98yKeJHmQGrt_JNRFlbG_UYg(kotlinx.coroutines.CoroutineScope.this, textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1);
            }
        };
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems, canShowCutMenuItem$foundation, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$4zMkYZkzJ3JUI3nG7OUxsOrPwgw(kotlin.jvm.functions.Function0.this, function0, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems2 = androidx.compose.foundation.text.TextContextMenuItems.Copy;
        boolean canShowCopyMenuItem$foundation = textFieldSelectionManager.canShowCopyMenuItem$foundation();
        final androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(textFieldSelectionManager, null);
        final kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$gCl98yKeJHmQGrt_JNRFlbG_UYg(kotlinx.coroutines.CoroutineScope.this, textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2);
            }
        };
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems2, canShowCopyMenuItem$foundation, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$4zMkYZkzJ3JUI3nG7OUxsOrPwgw(kotlin.jvm.functions.Function0.this, function0, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems3 = androidx.compose.foundation.text.TextContextMenuItems.Paste;
        boolean canShowPasteMenuItem$foundation = textFieldSelectionManager.canShowPasteMenuItem$foundation();
        final androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3(textFieldSelectionManager, null);
        final kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$gCl98yKeJHmQGrt_JNRFlbG_UYg(kotlinx.coroutines.CoroutineScope.this, textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3);
            }
        };
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems3, canShowPasteMenuItem$foundation, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$4zMkYZkzJ3JUI3nG7OUxsOrPwgw(kotlin.jvm.functions.Function0.this, function0, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems4 = androidx.compose.foundation.text.TextContextMenuItems.SelectAll;
        boolean canShowSelectAllMenuItem$foundation = textFieldSelectionManager.canShowSelectAllMenuItem$foundation();
        final kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$iWAPEYVpjDgvImG1NlfXwlLzccY(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this));
            }
        };
        final kotlin.jvm.functions.Function0 function06 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$O3gpt9U0UUPSLBiYKD4JSGqgvbU(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
            }
        };
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems4, canShowSelectAllMenuItem$foundation, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$4zMkYZkzJ3JUI3nG7OUxsOrPwgw(kotlin.jvm.functions.Function0.this, function05, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems5 = androidx.compose.foundation.text.TextContextMenuItems.Autofill;
        boolean canShowAutofillMenuItem$foundation = textFieldSelectionManager.canShowAutofillMenuItem$foundation();
        final kotlin.jvm.functions.Function0 function07 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.m2455$r8$lambda$B5fjhVanZpzUqFRYI2LUFYsfhQ(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
            }
        };
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems5, canShowAutofillMenuItem$foundation, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$4zMkYZkzJ3JUI3nG7OUxsOrPwgw(kotlin.jvm.functions.Function0.this, function0, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        textContextMenuBuilderScope.separator();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zi7FQzbY1hZPVe0Q-BZYbgp_NNo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2458$r8$lambda$zi7FQzbY1hZPVe0QBZYbgp_NNo(final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, final kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, final android.content.Context context) {
        androidx.compose.ui.text.TextRange textRange;
        boolean editable = textFieldSelectionManager.getEditable();
        androidx.compose.ui.text.AnnotatedString transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation();
        java.lang.String text = transformedText$foundation != null ? transformedText$foundation.getText() : null;
        androidx.compose.ui.text.TextRange latestSelection = textFieldSelectionManager.getLatestSelection();
        if (latestSelection != null) {
            long getHighResolutionOutputSizeshNQ4ISI = latestSelection.getGetHighResolutionOutputSizeshNQ4ISI();
            androidx.compose.ui.text.input.OffsetMapping offsetMapping = textFieldSelectionManager.getOffsetMapping();
            textRange = androidx.compose.ui.text.TextRange.m8027boximpl(androidx.compose.ui.text.TextRangeKt.TextRange(offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8039getStartimpl(getHighResolutionOutputSizeshNQ4ISI)), offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(getHighResolutionOutputSizeshNQ4ISI))));
        } else {
            textRange = null;
        }
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt.m2387addPlatformTextContextMenuItems71BSaZU(textContextMenuBuilderScope, context, editable, text, textRange, textFieldSelectionManager.getPlatformSelectionBehaviors(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.$r8$lambda$odeuMv56G2j37D6NWQQDhNLJ6OY(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, coroutineScope, context, (androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
