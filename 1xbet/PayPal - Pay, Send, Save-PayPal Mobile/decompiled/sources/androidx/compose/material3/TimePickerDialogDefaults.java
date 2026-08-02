package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u00020\r¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/TimePickerDialogDefaults;", "", "<init>", "()V", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "MinHeightForTimePicker", "Landroidx/compose/ui/unit/Dp;", "getMinHeightForTimePicker-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "DisplayModeToggle", "", "onDisplayModeChange", "Lkotlin/Function0;", "displayMode", "Landroidx/compose/material3/TimePickerDisplayMode;", "modifier", "Landroidx/compose/ui/Modifier;", "DisplayModeToggle-S7Bxtbk", "(Lkotlin/jvm/functions/Function0;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Title", "Title-pK_nZyw", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimePickerDialogDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.TimePickerDialogDefaults INSTANCE = new androidx.compose.material3.TimePickerDialogDefaults();
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(300.0f);

    private TimePickerDialogDefaults() {
    }

    public final long getContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-443775449, i, -1, "androidx.compose.material3.TimePickerDialogDefaults.<get-containerColor> (TimePickerDialog.kt:242)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1241096723, i, -1, "androidx.compose.material3.TimePickerDialogDefaults.<get-shape> (TimePickerDialog.kt:246)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getMinHeightForTimePicker-D9Ej5fM, reason: not valid java name */
    public final float m4013getMinHeightForTimePickerD9Ej5fM() {
        return getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* renamed from: DisplayModeToggle-S7Bxtbk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4011DisplayModeToggleS7Bxtbk(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final int i, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1283607635);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1283607635, i4, -1, "androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle (TimePickerDialog.kt:264)");
                }
                androidx.compose.material3.IconButtonKt.IconButton(function0, modifier4, false, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-698026161, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.TimePickerDialogDefaults$DisplayModeToggle$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        androidx.compose.ui.graphics.vector.ImageVector schedule;
                        int m4304constructorimpl;
                        androidx.compose.runtime.Composer composer3 = composer2;
                        int intValue = num.intValue();
                        if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                            composer3.skipToGroupEnd();
                        } else {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-698026161, intValue, -1, "androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle.<anonymous> (TimePickerDialog.kt:266)");
                            }
                            if (androidx.compose.material3.TimePickerDisplayMode.m4019equalsimpl0(i, androidx.compose.material3.TimePickerDisplayMode.INSTANCE.m4024getPickerONbchU())) {
                                schedule = androidx.compose.material3.internal.Icons.Outlined.INSTANCE.getKeyboard();
                            } else {
                                schedule = androidx.compose.material3.internal.Icons.Outlined.INSTANCE.getSchedule();
                            }
                            androidx.compose.ui.graphics.vector.ImageVector imageVector = schedule;
                            if (androidx.compose.material3.TimePickerDisplayMode.m4019equalsimpl0(i, androidx.compose.material3.TimePickerDisplayMode.INSTANCE.m4024getPickerONbchU())) {
                                androidx.compose.material3.internal.Strings.Companion companion = androidx.compose.material3.internal.Strings.INSTANCE;
                                m4304constructorimpl = androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_time_picker_toggle_touch);
                            } else {
                                androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
                                m4304constructorimpl = androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_time_picker_toggle_keyboard);
                            }
                            androidx.compose.material3.IconKt.m3375Iconww6aTOc(imageVector, androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(m4304constructorimpl, composer3, 0), (androidx.compose.ui.Modifier) null, 0L, composer3, 0, 12);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, startRestartGroup, 54), startRestartGroup, (i4 & 14) | 1572864 | ((i4 >> 3) & 112), 60);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.TimePickerDialogDefaults$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.TimePickerDialogDefaults.$r8$lambda$sa6LcZDBnuUlaRHz5hkmAkA6T6g(androidx.compose.material3.TimePickerDialogDefaults.this, function0, i, modifier3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* renamed from: Title-pK_nZyw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4012TitlepK_nZyw(final int i, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int m4304constructorimpl;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1546564986);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(i) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1546564986, i4, -1, "androidx.compose.material3.TimePickerDialogDefaults.Title (TimePickerDialog.kt:294)");
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f), 7, null);
                androidx.compose.ui.text.TextStyle labelMedium = androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getLabelMedium();
                if (androidx.compose.material3.TimePickerDisplayMode.m4019equalsimpl0(i, androidx.compose.material3.TimePickerDisplayMode.INSTANCE.m4024getPickerONbchU())) {
                    androidx.compose.material3.internal.Strings.Companion companion = androidx.compose.material3.internal.Strings.INSTANCE;
                    m4304constructorimpl = androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_time_picker_dialog_title);
                } else {
                    androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
                    m4304constructorimpl = androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_time_input_dialog_title);
                }
                androidx.compose.material3.TextKt.m3985TextNvy7gAk(androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(m4304constructorimpl, startRestartGroup, 0), m1710paddingqDBjuR0$default, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelMedium, startRestartGroup, 0, 0, 131068);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.TimePickerDialogDefaults$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.TimePickerDialogDefaults.$r8$lambda$PVyeTDWlR8ZyylJwHlF70xYRllU(androidx.compose.material3.TimePickerDialogDefaults.this, i, modifier3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PVyeTDWlR8ZyylJwHlF70xYRllU(androidx.compose.material3.TimePickerDialogDefaults timePickerDialogDefaults, int i, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        timePickerDialogDefaults.m4012TitlepK_nZyw(i, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sa6LcZDBnuUlaRHz5hkmAkA6T6g(androidx.compose.material3.TimePickerDialogDefaults timePickerDialogDefaults, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        timePickerDialogDefaults.m4011DisplayModeToggleS7Bxtbk(function0, i, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }
}
