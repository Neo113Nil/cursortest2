package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/TextContextMenuHelperApi28;", "", "<init>", "()V", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Landroid/content/Context;", "p0", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuTextClassificationItem;", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/contextmenu/ContextMenuScope;Landroid/content/Context;Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuTextClassificationItem;)V", "Landroid/graphics/drawable/Icon;", "(Landroid/graphics/drawable/Icon;Landroidx/compose/runtime/Composer;I)V", "Landroid/graphics/drawable/Drawable;", "getHighSpeedVideoFpsRanges", "(Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextContextMenuHelperApi28 {
    public static final androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28 INSTANCE = new androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28();

    private TextContextMenuHelperApi28() {
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.contextmenu.ContextMenuScope contextMenuScope, final android.content.Context context, androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem textContextMenuTextClassificationItem) {
        if (context == null) {
            return;
        }
        int index = textContextMenuTextClassificationItem.getIndex();
        final android.view.textclassifier.TextClassification textClassification = textContextMenuTextClassificationItem.getTextClassification();
        if (index < 0) {
            kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.String highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.getHighSpeedVideoFpsRangesFor(textClassification, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return highSpeedVideoFpsRangesFor;
                }
            };
            final android.graphics.drawable.Drawable icon = textClassification.getIcon();
            androidx.compose.foundation.contextmenu.ContextMenuScope.item$default(contextMenuScope, function2, null, false, icon != null ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1123224187, true, new kotlin.jvm.functions.Function3<androidx.compose.ui.graphics.Color, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$textClassificationItem$2$1
                public final void getHighSpeedVideoFpsRanges(long j, androidx.compose.runtime.Composer composer, int i) {
                    if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1123224187, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:247)");
                    }
                    androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.INSTANCE.getHighSpeedVideoFpsRanges(icon, composer, 48);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Color color, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    getHighSpeedVideoFpsRanges(color.m6006unboximpl(), composer, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }
            }) : null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.getHighSpeedVideoSizes(context, textClassification);
                    return highSpeedVideoSizes;
                }
            }, 6, null);
        } else {
            final android.app.RemoteAction remoteAction = textClassification.getActions().get(index);
            androidx.compose.foundation.contextmenu.ContextMenuScope.item$default(contextMenuScope, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.String highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.getHighSpeedVideoFpsRanges(remoteAction, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return highSpeedVideoFpsRanges;
                }
            }, null, false, ((index == 0) || remoteAction.shouldShowIcon()) ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1261173016, true, new kotlin.jvm.functions.Function3<androidx.compose.ui.graphics.Color, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$textClassificationItem$5
                public final void getHighSpeedVideoFpsRangesFor(long j, androidx.compose.runtime.Composer composer, int i) {
                    if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1261173016, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:257)");
                    }
                    androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(remoteAction.getIcon(), composer, 48);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Color color, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    getHighSpeedVideoFpsRangesFor(color.m6006unboximpl(), composer, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }
            }) : null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.getHighSpeedVideoSizes(remoteAction);
                    return highSpeedVideoSizes;
                }
            }, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighSpeedVideoFpsRangesFor(android.view.textclassifier.TextClassification textClassification, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(950061013);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(950061013, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:246)");
        }
        java.lang.String valueOf = java.lang.String.valueOf(textClassification.getLabel());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(android.content.Context context, android.view.textclassifier.TextClassification textClassification) {
        androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelperApi28.INSTANCE.sendLegacyIntent(context, textClassification);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighSpeedVideoFpsRanges(android.app.RemoteAction remoteAction, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-1376593684);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1376593684, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:254)");
        }
        java.lang.String obj = remoteAction.getTitle().toString();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(android.app.RemoteAction remoteAction) {
        androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelperApi28.INSTANCE.sendPendingIntent(remoteAction.getActionIntent());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(final android.graphics.drawable.Icon icon, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2116504409);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2116504409, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:267)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            boolean changed = startRestartGroup.changed(icon);
            boolean changed2 = startRestartGroup.changed(context);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = icon.loadDrawable(context);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) rememberedValue;
            if (drawable != null) {
                getHighSpeedVideoFpsRanges(drawable, startRestartGroup, i2 & 112);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            kotlin.Unit highSpeedVideoFpsRanges;
                            highSpeedVideoFpsRanges = androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.this, icon, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            return highSpeedVideoFpsRanges;
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.this, icon, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return highSpeedVideoFpsRangesFor;
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(final android.graphics.drawable.Drawable drawable, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(257732500);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(drawable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(257732500, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:274)");
            }
            androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.contextmenu.ContextMenuSpec.INSTANCE.m1394getIconSizeD9Ej5fM());
            boolean changedInstance = startRestartGroup.changedInstance(drawable);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.getHighSpeedVideoFpsRanges(drawable, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        return highSpeedVideoFpsRanges;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.DrawModifierKt.drawBehind(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.this, drawable, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable drawable, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        drawable.setBounds(0, 0, (int) java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)), (int) java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)));
        drawable.draw(androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28 textContextMenuHelperApi28, android.graphics.drawable.Drawable drawable, int i, androidx.compose.runtime.Composer composer, int i2) {
        textContextMenuHelperApi28.getHighSpeedVideoFpsRanges(drawable, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28 textContextMenuHelperApi28, android.graphics.drawable.Icon icon, int i, androidx.compose.runtime.Composer composer, int i2) {
        textContextMenuHelperApi28.getHighResolutionOutputSizeshNQ4ISI(icon, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28 textContextMenuHelperApi28, android.graphics.drawable.Icon icon, int i, androidx.compose.runtime.Composer composer, int i2) {
        textContextMenuHelperApi28.getHighResolutionOutputSizeshNQ4ISI(icon, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
