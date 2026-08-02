package androidx.glance.appwidget;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.ExperimentalGlanceApi;
import androidx.glance.GlanceModifier;
import androidx.glance.action.Action;
import androidx.glance.action.ActionModifier;
import androidx.glance.action.LambdaActionKt;
import androidx.glance.appwidget.action.CompoundButtonAction;
import androidx.glance.text.TextStyle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u0012\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014\u001aS\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"CheckBox", "", "checked", "", "onCheckedChange", "Lkotlin/Function0;", "modifier", "Landroidx/glance/GlanceModifier;", "text", "", "style", "Landroidx/glance/text/TextStyle;", "colors", "Landroidx/glance/appwidget/CheckBoxColors;", "maxLines", "", "(ZLkotlin/jvm/functions/Function0;Landroidx/glance/GlanceModifier;Ljava/lang/String;Landroidx/glance/text/TextStyle;Landroidx/glance/appwidget/CheckBoxColors;ILandroidx/compose/runtime/Composer;II)V", Constants.KEY, "(ZLkotlin/jvm/functions/Function0;Landroidx/glance/GlanceModifier;Ljava/lang/String;Landroidx/glance/text/TextStyle;Landroidx/glance/appwidget/CheckBoxColors;ILjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Landroidx/glance/action/Action;", "(ZLandroidx/glance/action/Action;Landroidx/glance/GlanceModifier;Ljava/lang/String;Landroidx/glance/text/TextStyle;Landroidx/glance/appwidget/CheckBoxColors;ILandroidx/compose/runtime/Composer;II)V", "CheckBoxElement", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckBox.kt\nandroidx/glance/appwidget/CheckBoxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,256:1\n36#2:257\n251#2,8:265\n259#2,2:279\n1057#3,6:258\n34#4:264\n35#4:281\n3844#5,6:273\n*S KotlinDebug\n*F\n+ 1 CheckBox.kt\nandroidx/glance/appwidget/CheckBoxKt\n*L\n157#1:257\n156#1:265,8\n156#1:279,2\n157#1:258,6\n156#1:264\n156#1:281\n164#1:273,6\n*E\n"})
/* loaded from: classes.dex */
public final class CheckBoxKt {
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    public static final void CheckBox(final boolean z, final Action action, GlanceModifier glanceModifier, String str, TextStyle textStyle, CheckBoxColors checkBoxColors, int i, Composer composer, final int i2, final int i3) {
        CheckBoxColors checkBoxColors2;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(151986232);
        final GlanceModifier glanceModifier2 = (i3 & 4) != 0 ? GlanceModifier.INSTANCE : glanceModifier;
        final String str2 = (i3 & 8) != 0 ? "" : str;
        final TextStyle textStyle2 = (i3 & 16) != 0 ? null : textStyle;
        if ((i3 & 32) != 0) {
            i4 = i2 & (-458753);
            checkBoxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
        } else {
            checkBoxColors2 = checkBoxColors;
            i4 = i2;
        }
        int i5 = (i3 & 64) != 0 ? Integer.MAX_VALUE : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(151986232, i4, -1, "androidx.glance.appwidget.CheckBox (CheckBox.kt:62)");
        }
        CheckBoxElement(z, action, glanceModifier2, str2, textStyle2, checkBoxColors2, i5, startRestartGroup, (i4 & 14) | 64 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final CheckBoxColors checkBoxColors3 = checkBoxColors2;
        final int i6 = i5;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBox$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                CheckBoxKt.CheckBox(z, action, glanceModifier2, str2, textStyle2, checkBoxColors3, i6, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    public static final void CheckBoxElement(final boolean z, final Action action, GlanceModifier glanceModifier, String str, TextStyle textStyle, CheckBoxColors checkBoxColors, int i, Composer composer, final int i2, final int i3) {
        final CheckBoxColors checkBoxColors2;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-509269550);
        if ((i3 & 4) != 0) {
            glanceModifier = GlanceModifier.INSTANCE;
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        if ((i3 & 8) != 0) {
            str = "";
        }
        final String str2 = str;
        final TextStyle textStyle2 = (i3 & 16) != 0 ? null : textStyle;
        if ((i3 & 32) != 0) {
            i4 = i2 & (-458753);
            checkBoxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
        } else {
            checkBoxColors2 = checkBoxColors;
            i4 = i2;
        }
        final int i5 = (i3 & 64) != 0 ? Integer.MAX_VALUE : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-509269550, i4, -1, "androidx.glance.appwidget.CheckBoxElement (CheckBox.kt:141)");
        }
        GlanceModifier then = action != null ? glanceModifier2.then(new ActionModifier(new CompoundButtonAction(action, z))) : glanceModifier2;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(checkBoxColors2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0<EmittableCheckBox>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBoxElement$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final EmittableCheckBox invoke() {
                    return new EmittableCheckBox(CheckBoxColors.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final Function0 function0 = (Function0) rememberedValue;
        startRestartGroup.startReplaceableGroup(-1115894518);
        startRestartGroup.startReplaceableGroup(1886828752);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new Function0<EmittableCheckBox>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBoxElement$$inlined$GlanceNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.glance.appwidget.EmittableCheckBox, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final EmittableCheckBox invoke() {
                    return Function0.this.invoke();
                }
            });
        } else {
            startRestartGroup.useNode();
        }
        Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
        Updater.m115setimpl(m108constructorimpl, Boolean.valueOf(z), new Function2<EmittableCheckBox, Boolean, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBoxElement$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableCheckBox emittableCheckBox, Boolean bool) {
                invoke(emittableCheckBox, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(EmittableCheckBox emittableCheckBox, boolean z2) {
                emittableCheckBox.setChecked(z2);
            }
        });
        Updater.m115setimpl(m108constructorimpl, str2, new Function2<EmittableCheckBox, String, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBoxElement$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableCheckBox emittableCheckBox, String str3) {
                invoke2(emittableCheckBox, str3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableCheckBox emittableCheckBox, String str3) {
                emittableCheckBox.setText(str3);
            }
        });
        Updater.m115setimpl(m108constructorimpl, then, new Function2<EmittableCheckBox, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBoxElement$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableCheckBox emittableCheckBox, GlanceModifier glanceModifier3) {
                invoke2(emittableCheckBox, glanceModifier3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableCheckBox emittableCheckBox, GlanceModifier glanceModifier3) {
                emittableCheckBox.setModifier(glanceModifier3);
            }
        });
        Updater.m115setimpl(m108constructorimpl, textStyle2, new Function2<EmittableCheckBox, TextStyle, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBoxElement$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableCheckBox emittableCheckBox, TextStyle textStyle3) {
                invoke2(emittableCheckBox, textStyle3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableCheckBox emittableCheckBox, TextStyle textStyle3) {
                emittableCheckBox.setStyle(textStyle3);
            }
        });
        Updater.m115setimpl(m108constructorimpl, checkBoxColors2, new Function2<EmittableCheckBox, CheckBoxColors, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBoxElement$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableCheckBox emittableCheckBox, CheckBoxColors checkBoxColors3) {
                invoke2(emittableCheckBox, checkBoxColors3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableCheckBox emittableCheckBox, CheckBoxColors checkBoxColors3) {
                emittableCheckBox.setColors(checkBoxColors3);
            }
        });
        CheckBoxKt$CheckBoxElement$2$6 checkBoxKt$CheckBoxElement$2$6 = new Function2<EmittableCheckBox, Integer, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBoxElement$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableCheckBox emittableCheckBox, Integer num) {
                invoke(emittableCheckBox, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(EmittableCheckBox emittableCheckBox, int i6) {
                emittableCheckBox.setMaxLines(i6);
            }
        };
        if (m108constructorimpl.getInserting() || !Intrinsics.areEqual(m108constructorimpl.rememberedValue(), Integer.valueOf(i5))) {
            m108constructorimpl.updateRememberedValue(Integer.valueOf(i5));
            m108constructorimpl.apply(Integer.valueOf(i5), checkBoxKt$CheckBoxElement$2$6);
        }
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBoxElement$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                CheckBoxKt.CheckBoxElement(z, action, glanceModifier2, str2, textStyle2, checkBoxColors2, i5, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0063  */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckBox(final boolean z, final Function0<Unit> function0, GlanceModifier glanceModifier, String str, TextStyle textStyle, CheckBoxColors checkBoxColors, int i, Composer composer, final int i2, final int i3) {
        boolean z2;
        int i4;
        GlanceModifier glanceModifier2;
        int i5;
        String str2;
        int i6;
        TextStyle textStyle2;
        CheckBoxColors checkBoxColors2;
        int i7;
        int i8;
        int i9;
        int i10;
        GlanceModifier glanceModifier3;
        TextStyle textStyle3;
        Composer composer2;
        final GlanceModifier glanceModifier4;
        final String str3;
        final TextStyle textStyle4;
        final int i11;
        ScopeUpdateScope endRestartGroup;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(244940652);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i2 & 14) == 0) {
                i4 = (startRestartGroup.changed(z2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            glanceModifier2 = glanceModifier;
            i4 |= startRestartGroup.changed(glanceModifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                str2 = str;
                i4 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    textStyle2 = textStyle;
                    i4 |= startRestartGroup.changed(textStyle2) ? 16384 : 8192;
                    if ((i2 & 458752) != 0) {
                        if ((i3 & 32) == 0) {
                            checkBoxColors2 = checkBoxColors;
                            if (startRestartGroup.changed(checkBoxColors2)) {
                                i12 = 131072;
                                i4 |= i12;
                            }
                        } else {
                            checkBoxColors2 = checkBoxColors;
                        }
                        i12 = 65536;
                        i4 |= i12;
                    } else {
                        checkBoxColors2 = checkBoxColors;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        i8 = 57344;
                        i9 = i;
                    } else {
                        i8 = 57344;
                        i9 = i;
                        if ((i2 & 3670016) == 0) {
                            i4 |= startRestartGroup.changed(i9) ? 1048576 : 524288;
                        }
                    }
                    if ((i4 & 2995931) != 599186 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        glanceModifier4 = glanceModifier2;
                        str3 = str2;
                        i11 = i9;
                        textStyle4 = textStyle2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            i10 = i9;
                            textStyle3 = textStyle2;
                            glanceModifier3 = glanceModifier2;
                        } else {
                            GlanceModifier glanceModifier5 = i13 == 0 ? GlanceModifier.INSTANCE : glanceModifier2;
                            if (i5 != 0) {
                                str2 = "";
                            }
                            if (i6 != 0) {
                                textStyle2 = null;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                                checkBoxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            if (i7 == 0) {
                                glanceModifier3 = glanceModifier5;
                                i10 = Integer.MAX_VALUE;
                            } else {
                                i10 = i9;
                                glanceModifier3 = glanceModifier5;
                            }
                            textStyle3 = textStyle2;
                        }
                        String str4 = str2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(244940652, i4, -1, "androidx.glance.appwidget.CheckBox (CheckBox.kt:85)");
                        }
                        TextStyle textStyle5 = textStyle3;
                        composer2 = startRestartGroup;
                        CheckBoxElement(z2, LambdaActionKt.action(null, function0, startRestartGroup, i4 & 112, 1), glanceModifier3, str4, textStyle5, checkBoxColors2, i10, composer2, (i4 & 14) | 64 | (i4 & 896) | (i4 & 7168) | (i4 & i8) | (i4 & 458752) | (i4 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        glanceModifier4 = glanceModifier3;
                        str3 = str4;
                        textStyle4 = textStyle5;
                        i11 = i10;
                    }
                    final CheckBoxColors checkBoxColors3 = checkBoxColors2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i14) {
                            CheckBoxKt.CheckBox(z, function0, glanceModifier4, str3, textStyle4, checkBoxColors3, i11, composer3, i2 | 1, i3);
                        }
                    });
                    return;
                }
                textStyle2 = textStyle;
                if ((i2 & 458752) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i4 & 2995931) != 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                }
                if (i13 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i7 == 0) {
                }
                textStyle3 = textStyle2;
                String str42 = str2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                TextStyle textStyle52 = textStyle3;
                composer2 = startRestartGroup;
                CheckBoxElement(z2, LambdaActionKt.action(null, function0, startRestartGroup, i4 & 112, 1), glanceModifier3, str42, textStyle52, checkBoxColors2, i10, composer2, (i4 & 14) | 64 | (i4 & 896) | (i4 & 7168) | (i4 & i8) | (i4 & 458752) | (i4 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                glanceModifier4 = glanceModifier3;
                str3 = str42;
                textStyle4 = textStyle52;
                i11 = i10;
                final CheckBoxColors checkBoxColors32 = checkBoxColors2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str2 = str;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            textStyle2 = textStyle;
            if ((i2 & 458752) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i4 & 2995931) != 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
            }
            if (i13 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i7 == 0) {
            }
            textStyle3 = textStyle2;
            String str422 = str2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle textStyle522 = textStyle3;
            composer2 = startRestartGroup;
            CheckBoxElement(z2, LambdaActionKt.action(null, function0, startRestartGroup, i4 & 112, 1), glanceModifier3, str422, textStyle522, checkBoxColors2, i10, composer2, (i4 & 14) | 64 | (i4 & 896) | (i4 & 7168) | (i4 & i8) | (i4 & 458752) | (i4 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            glanceModifier4 = glanceModifier3;
            str3 = str422;
            textStyle4 = textStyle522;
            i11 = i10;
            final CheckBoxColors checkBoxColors322 = checkBoxColors2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        glanceModifier2 = glanceModifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        textStyle2 = textStyle;
        if ((i2 & 458752) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i4 & 2995931) != 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) == 0) {
        }
        if (i13 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i7 == 0) {
        }
        textStyle3 = textStyle2;
        String str4222 = str2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        TextStyle textStyle5222 = textStyle3;
        composer2 = startRestartGroup;
        CheckBoxElement(z2, LambdaActionKt.action(null, function0, startRestartGroup, i4 & 112, 1), glanceModifier3, str4222, textStyle5222, checkBoxColors2, i10, composer2, (i4 & 14) | 64 | (i4 & 896) | (i4 & 7168) | (i4 & i8) | (i4 & 458752) | (i4 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        glanceModifier4 = glanceModifier3;
        str3 = str4222;
        textStyle4 = textStyle5222;
        i11 = i10;
        final CheckBoxColors checkBoxColors3222 = checkBoxColors2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x016f, code lost:
    
        if (r14 == 0) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0083  */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    @ExperimentalGlanceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckBox(final boolean z, final Function0<Unit> function0, GlanceModifier glanceModifier, String str, TextStyle textStyle, CheckBoxColors checkBoxColors, int i, String str2, Composer composer, final int i2, final int i3) {
        boolean z2;
        int i4;
        GlanceModifier glanceModifier2;
        int i5;
        String str3;
        int i6;
        TextStyle textStyle2;
        CheckBoxColors checkBoxColors2;
        int i7;
        int i8;
        int i9;
        int i10;
        String str4;
        int i11;
        CheckBoxColors checkBoxColors3;
        String str5;
        int i12;
        Composer composer2;
        final String str6;
        final GlanceModifier glanceModifier3;
        final String str7;
        final TextStyle textStyle3;
        final CheckBoxColors checkBoxColors4;
        final int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-2100264997);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i2 & 14) == 0) {
                i4 = (startRestartGroup.changed(z2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            glanceModifier2 = glanceModifier;
            i4 |= startRestartGroup.changed(glanceModifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                str3 = str;
                i4 |= startRestartGroup.changed(str3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    textStyle2 = textStyle;
                    i4 |= startRestartGroup.changed(textStyle2) ? 16384 : 8192;
                    if ((i2 & 458752) != 0) {
                        if ((i3 & 32) == 0) {
                            checkBoxColors2 = checkBoxColors;
                            if (startRestartGroup.changed(checkBoxColors2)) {
                                i14 = 131072;
                                i4 |= i14;
                            }
                        } else {
                            checkBoxColors2 = checkBoxColors;
                        }
                        i14 = 65536;
                        i4 |= i14;
                    } else {
                        checkBoxColors2 = checkBoxColors;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        i8 = 57344;
                        i9 = i;
                    } else {
                        i8 = 57344;
                        i9 = i;
                        if ((i2 & 3670016) == 0) {
                            i4 |= startRestartGroup.changed(i9) ? 1048576 : 524288;
                        }
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i4 |= startRestartGroup.changed(str2) ? 8388608 : 4194304;
                    }
                    int i16 = i4;
                    if ((i4 & 23967451) != 4793490 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                        str6 = str2;
                        composer2 = startRestartGroup;
                        glanceModifier3 = glanceModifier2;
                        str7 = str3;
                        i13 = i9;
                        textStyle3 = textStyle2;
                        checkBoxColors4 = checkBoxColors2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i15 != 0) {
                                glanceModifier2 = GlanceModifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                str3 = "";
                            }
                            str4 = null;
                            if (i6 != 0) {
                                textStyle2 = null;
                            }
                            if ((i3 & 32) == 0) {
                                i11 = i16 & (-458753);
                                checkBoxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                            } else {
                                i11 = i16;
                            }
                            if (i7 != 0) {
                                i9 = Integer.MAX_VALUE;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 32) != 0) {
                                i11 = i16 & (-458753);
                            } else {
                                str4 = str2;
                                str5 = str3;
                                checkBoxColors3 = checkBoxColors2;
                                i12 = 3670016;
                                i11 = i16;
                                int i17 = i9;
                                TextStyle textStyle4 = textStyle2;
                                GlanceModifier glanceModifier4 = glanceModifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2100264997, i11, -1, "androidx.glance.appwidget.CheckBox (CheckBox.kt:121)");
                                }
                                composer2 = startRestartGroup;
                                CheckBoxElement(z2, LambdaActionKt.action(str4, function0, startRestartGroup, ((i11 >> 21) & 14) | (i11 & 112), 0), glanceModifier4, str5, textStyle4, checkBoxColors3, i17, composer2, (i11 & 14) | 64 | (i11 & 896) | (i11 & 7168) | (i11 & i8) | (i11 & 458752) | (i11 & i12), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str6 = str4;
                                glanceModifier3 = glanceModifier4;
                                str7 = str5;
                                textStyle3 = textStyle4;
                                checkBoxColors4 = checkBoxColors3;
                                i13 = i17;
                            }
                        }
                        str4 = str2;
                        str5 = str3;
                        checkBoxColors3 = checkBoxColors2;
                        i12 = 3670016;
                        int i172 = i9;
                        TextStyle textStyle42 = textStyle2;
                        GlanceModifier glanceModifier42 = glanceModifier2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        CheckBoxElement(z2, LambdaActionKt.action(str4, function0, startRestartGroup, ((i11 >> 21) & 14) | (i11 & 112), 0), glanceModifier42, str5, textStyle42, checkBoxColors3, i172, composer2, (i11 & 14) | 64 | (i11 & 896) | (i11 & 7168) | (i11 & i8) | (i11 & 458752) | (i11 & i12), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        str6 = str4;
                        glanceModifier3 = glanceModifier42;
                        str7 = str5;
                        textStyle3 = textStyle42;
                        checkBoxColors4 = checkBoxColors3;
                        i13 = i172;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.CheckBoxKt$CheckBox$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            CheckBoxKt.CheckBox(z, function0, glanceModifier3, str7, textStyle3, checkBoxColors4, i13, str6, composer3, i2 | 1, i3);
                        }
                    });
                    return;
                }
                textStyle2 = textStyle;
                if ((i2 & 458752) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                int i162 = i4;
                if ((i4 & 23967451) != 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if (i5 != 0) {
                }
                str4 = null;
                if (i6 != 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if (i7 != 0) {
                }
            }
            str3 = str;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            textStyle2 = textStyle;
            if ((i2 & 458752) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            int i1622 = i4;
            if ((i4 & 23967451) != 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i5 != 0) {
            }
            str4 = null;
            if (i6 != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if (i7 != 0) {
            }
        }
        glanceModifier2 = glanceModifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        str3 = str;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        textStyle2 = textStyle;
        if ((i2 & 458752) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        int i16222 = i4;
        if ((i4 & 23967451) != 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i5 != 0) {
        }
        str4 = null;
        if (i6 != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if (i7 != 0) {
        }
    }
}
