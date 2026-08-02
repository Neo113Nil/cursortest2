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
import androidx.glance.action.ActionKt;
import androidx.glance.action.LambdaActionKt;
import androidx.glance.text.TextStyle;
import androidx.profileinstaller.ProfileVerifier;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001am\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0015\u001a]\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0017\u001a]\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0017\u001a\n\u0010\u0019\u001a\u00020\u0002*\u00020\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u001a"}, d2 = {"isSelectableGroup", "", "Landroidx/glance/GlanceModifier;", "(Landroidx/glance/GlanceModifier;)Z", "RadioButton", "", "checked", "onClick", "Lkotlin/Function0;", "modifier", "enabled", "text", "", "style", "Landroidx/glance/text/TextStyle;", "colors", "Landroidx/glance/appwidget/RadioButtonColors;", "maxLines", "", "(ZLkotlin/jvm/functions/Function0;Landroidx/glance/GlanceModifier;ZLjava/lang/String;Landroidx/glance/text/TextStyle;Landroidx/glance/appwidget/RadioButtonColors;ILandroidx/compose/runtime/Composer;II)V", Constants.KEY, "(ZLkotlin/jvm/functions/Function0;Landroidx/glance/GlanceModifier;ZLjava/lang/String;Landroidx/glance/text/TextStyle;Landroidx/glance/appwidget/RadioButtonColors;ILjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Landroidx/glance/action/Action;", "(ZLandroidx/glance/action/Action;Landroidx/glance/GlanceModifier;ZLjava/lang/String;Landroidx/glance/text/TextStyle;Landroidx/glance/appwidget/RadioButtonColors;ILandroidx/compose/runtime/Composer;II)V", "RadioButtonElement", "selectableGroup", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/glance/appwidget/RadioButtonKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,278:1\n34#2:279\n35#2:296\n251#3,8:280\n259#3,2:294\n3844#4,6:288\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/glance/appwidget/RadioButtonKt\n*L\n253#1:279\n253#1:296\n253#1:280,8\n253#1:294,2\n260#1:288,6\n*E\n"})
/* loaded from: classes.dex */
public final class RadioButtonKt {
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    public static final void RadioButton(final boolean z, final Action action, GlanceModifier glanceModifier, boolean z2, String str, TextStyle textStyle, RadioButtonColors radioButtonColors, int i, Composer composer, final int i2, final int i3) {
        final RadioButtonColors radioButtonColors2;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1703226720);
        GlanceModifier glanceModifier2 = (i3 & 4) != 0 ? GlanceModifier.INSTANCE : glanceModifier;
        boolean z3 = (i3 & 8) != 0 ? true : z2;
        final String str2 = (i3 & 16) != 0 ? "" : str;
        final TextStyle textStyle2 = (i3 & 32) != 0 ? null : textStyle;
        if ((i3 & 64) != 0) {
            i4 = i2 & (-3670017);
            radioButtonColors2 = RadioButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
        } else {
            radioButtonColors2 = radioButtonColors;
            i4 = i2;
        }
        final int i5 = (i3 & 128) != 0 ? Integer.MAX_VALUE : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703226720, i4, -1, "androidx.glance.appwidget.RadioButton (RadioButton.kt:88)");
        }
        RadioButtonElement(z, action, glanceModifier2, z3, str2, textStyle2, radioButtonColors2, i5, startRestartGroup, (i4 & 14) | 64 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final GlanceModifier glanceModifier3 = glanceModifier2;
        final boolean z4 = z3;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButton$1
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
                RadioButtonKt.RadioButton(z, action, glanceModifier3, z4, str2, textStyle2, radioButtonColors2, i5, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    public static final void RadioButtonElement(final boolean z, final Action action, GlanceModifier glanceModifier, boolean z2, String str, TextStyle textStyle, RadioButtonColors radioButtonColors, int i, Composer composer, int i2, final int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(354884190);
        final GlanceModifier glanceModifier2 = (i3 & 4) != 0 ? GlanceModifier.INSTANCE : glanceModifier;
        final boolean z3 = (i3 & 8) != 0 ? true : z2;
        final String str2 = (i3 & 16) != 0 ? "" : str;
        final TextStyle textStyle2 = (i3 & 32) != 0 ? null : textStyle;
        final RadioButtonColors colors = (i3 & 64) != 0 ? RadioButtonDefaults.INSTANCE.colors(startRestartGroup, 6) : radioButtonColors;
        final int i5 = (i3 & 128) != 0 ? Integer.MAX_VALUE : i;
        if (ComposerKt.isTraceInProgress()) {
            i4 = i2;
            ComposerKt.traceEventStart(354884190, i4, -1, "androidx.glance.appwidget.RadioButtonElement (RadioButton.kt:241)");
        } else {
            i4 = i2;
        }
        GlanceModifier clickable = (!z3 || action == null) ? glanceModifier2 : ActionKt.clickable(glanceModifier2, action);
        final Function0<EmittableRadioButton> function0 = new Function0<EmittableRadioButton>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final EmittableRadioButton invoke() {
                return new EmittableRadioButton(RadioButtonColors.this);
            }
        };
        startRestartGroup.startReplaceableGroup(-1115894518);
        startRestartGroup.startReplaceableGroup(1886828752);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new Function0<EmittableRadioButton>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$$inlined$GlanceNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.glance.appwidget.EmittableRadioButton, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final EmittableRadioButton invoke() {
                    return Function0.this.invoke();
                }
            });
        } else {
            startRestartGroup.useNode();
        }
        Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
        Updater.m115setimpl(m108constructorimpl, Boolean.valueOf(z), new Function2<EmittableRadioButton, Boolean, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableRadioButton emittableRadioButton, Boolean bool) {
                invoke(emittableRadioButton, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(EmittableRadioButton emittableRadioButton, boolean z4) {
                emittableRadioButton.setChecked(z4);
            }
        });
        Updater.m115setimpl(m108constructorimpl, clickable, new Function2<EmittableRadioButton, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableRadioButton emittableRadioButton, GlanceModifier glanceModifier3) {
                invoke2(emittableRadioButton, glanceModifier3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableRadioButton emittableRadioButton, GlanceModifier glanceModifier3) {
                emittableRadioButton.setModifier(glanceModifier3);
            }
        });
        Updater.m115setimpl(m108constructorimpl, Boolean.valueOf(z3), new Function2<EmittableRadioButton, Boolean, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableRadioButton emittableRadioButton, Boolean bool) {
                invoke(emittableRadioButton, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(EmittableRadioButton emittableRadioButton, boolean z4) {
                emittableRadioButton.setEnabled(z4);
            }
        });
        Updater.m115setimpl(m108constructorimpl, str2, new Function2<EmittableRadioButton, String, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableRadioButton emittableRadioButton, String str3) {
                invoke2(emittableRadioButton, str3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableRadioButton emittableRadioButton, String str3) {
                emittableRadioButton.setText(str3);
            }
        });
        Updater.m115setimpl(m108constructorimpl, textStyle2, new Function2<EmittableRadioButton, TextStyle, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableRadioButton emittableRadioButton, TextStyle textStyle3) {
                invoke2(emittableRadioButton, textStyle3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableRadioButton emittableRadioButton, TextStyle textStyle3) {
                emittableRadioButton.setStyle(textStyle3);
            }
        });
        Updater.m115setimpl(m108constructorimpl, colors, new Function2<EmittableRadioButton, RadioButtonColors, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableRadioButton emittableRadioButton, RadioButtonColors radioButtonColors2) {
                invoke2(emittableRadioButton, radioButtonColors2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableRadioButton emittableRadioButton, RadioButtonColors radioButtonColors2) {
                emittableRadioButton.setColors(radioButtonColors2);
            }
        });
        RadioButtonKt$RadioButtonElement$2$7 radioButtonKt$RadioButtonElement$2$7 = new Function2<EmittableRadioButton, Integer, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableRadioButton emittableRadioButton, Integer num) {
                invoke(emittableRadioButton, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(EmittableRadioButton emittableRadioButton, int i6) {
                emittableRadioButton.setMaxLines(i6);
            }
        };
        if (m108constructorimpl.getInserting() || !Intrinsics.areEqual(m108constructorimpl.rememberedValue(), Integer.valueOf(i5))) {
            m108constructorimpl.updateRememberedValue(Integer.valueOf(i5));
            m108constructorimpl.apply(Integer.valueOf(i5), radioButtonKt$RadioButtonElement$2$7);
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
        final int i6 = i4;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButtonElement$3
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
                RadioButtonKt.RadioButtonElement(z, action, glanceModifier2, z3, str2, textStyle2, colors, i5, composer2, i6 | 1, i3);
            }
        });
    }

    public static final boolean isSelectableGroup(GlanceModifier glanceModifier) {
        return glanceModifier.any(new Function1<GlanceModifier.Element, Boolean>() { // from class: androidx.glance.appwidget.RadioButtonKt$isSelectableGroup$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(GlanceModifier.Element element) {
                return Boolean.valueOf(element instanceof SelectableGroupModifier);
            }
        });
    }

    public static final GlanceModifier selectableGroup(GlanceModifier glanceModifier) {
        return glanceModifier.then(SelectableGroupModifier.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0065  */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, GlanceModifier glanceModifier, boolean z2, String str, TextStyle textStyle, RadioButtonColors radioButtonColors, int i, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i4;
        GlanceModifier glanceModifier2;
        int i5;
        boolean z4;
        int i6;
        String str2;
        int i7;
        int i8;
        TextStyle textStyle2;
        int i9;
        RadioButtonColors radioButtonColors2;
        int i10;
        int i11;
        int i12;
        GlanceModifier glanceModifier3;
        int i13;
        RadioButtonColors radioButtonColors3;
        String str3;
        int i14;
        boolean z5;
        int i15;
        int i16;
        Composer composer2;
        final GlanceModifier glanceModifier4;
        final boolean z6;
        final String str4;
        final TextStyle textStyle3;
        final RadioButtonColors radioButtonColors4;
        final int i17;
        ScopeUpdateScope endRestartGroup;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(-641571976);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i2 & 14) == 0) {
                i4 = (startRestartGroup.changed(z3) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            glanceModifier2 = glanceModifier;
            i4 |= startRestartGroup.changed(glanceModifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z4 = z2;
                i4 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    str2 = str;
                    i4 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i8 = 57344;
                        textStyle2 = textStyle;
                    } else {
                        i8 = 57344;
                        textStyle2 = textStyle;
                        if ((i2 & 458752) == 0) {
                            i4 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 3670016) != 0) {
                        if ((i3 & 64) == 0) {
                            i9 = 458752;
                            radioButtonColors2 = radioButtonColors;
                            if (startRestartGroup.changed(radioButtonColors2)) {
                                i18 = 1048576;
                                i4 |= i18;
                            }
                        } else {
                            i9 = 458752;
                            radioButtonColors2 = radioButtonColors;
                        }
                        i18 = 524288;
                        i4 |= i18;
                    } else {
                        i9 = 458752;
                        radioButtonColors2 = radioButtonColors;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                        i12 = i4;
                        if ((i4 & 23967451) != 4793490 && startRestartGroup.getSkipping()) {
                            startRestartGroup.skipToGroupEnd();
                            i17 = i;
                            composer2 = startRestartGroup;
                            glanceModifier4 = glanceModifier2;
                            z6 = z4;
                            textStyle3 = textStyle2;
                            str4 = str2;
                            radioButtonColors4 = radioButtonColors2;
                        } else {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i19 != 0) {
                                    glanceModifier2 = GlanceModifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    str2 = "";
                                }
                                if (i7 != 0) {
                                    textStyle2 = null;
                                }
                                if ((i3 & 64) != 0) {
                                    radioButtonColors2 = RadioButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i12 &= -3670017;
                                }
                                if (i11 != 0) {
                                    String str5 = str2;
                                    glanceModifier3 = glanceModifier2;
                                    i13 = i9;
                                    radioButtonColors3 = radioButtonColors2;
                                    str3 = str5;
                                    i14 = Integer.MAX_VALUE;
                                    z5 = z4;
                                    i15 = 3670016;
                                    i16 = i12;
                                    TextStyle textStyle4 = textStyle2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-641571976, i16, -1, "androidx.glance.appwidget.RadioButton (RadioButton.kt:117)");
                                    }
                                    composer2 = startRestartGroup;
                                    RadioButtonElement(z3, LambdaActionKt.action(null, function0, startRestartGroup, i16 & 112, 1), glanceModifier3, z5, str3, textStyle4, radioButtonColors3, i14, composer2, (i16 & 14) | 64 | (i16 & 896) | (i16 & 7168) | (i16 & i8) | (i13 & i16) | (i15 & i16) | (i16 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    glanceModifier4 = glanceModifier3;
                                    z6 = z5;
                                    str4 = str3;
                                    textStyle3 = textStyle4;
                                    radioButtonColors4 = radioButtonColors3;
                                    i17 = i14;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 64) != 0) {
                                    i16 = i12 & (-3670017);
                                    String str6 = str2;
                                    glanceModifier3 = glanceModifier2;
                                    i13 = i9;
                                    radioButtonColors3 = radioButtonColors2;
                                    str3 = str6;
                                    i14 = i;
                                    z5 = z4;
                                    i15 = 3670016;
                                    TextStyle textStyle42 = textStyle2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer2 = startRestartGroup;
                                    RadioButtonElement(z3, LambdaActionKt.action(null, function0, startRestartGroup, i16 & 112, 1), glanceModifier3, z5, str3, textStyle42, radioButtonColors3, i14, composer2, (i16 & 14) | 64 | (i16 & 896) | (i16 & 7168) | (i16 & i8) | (i13 & i16) | (i15 & i16) | (i16 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    glanceModifier4 = glanceModifier3;
                                    z6 = z5;
                                    str4 = str3;
                                    textStyle3 = textStyle42;
                                    radioButtonColors4 = radioButtonColors3;
                                    i17 = i14;
                                }
                            }
                            String str7 = str2;
                            glanceModifier3 = glanceModifier2;
                            i13 = i9;
                            radioButtonColors3 = radioButtonColors2;
                            str3 = str7;
                            i14 = i;
                            z5 = z4;
                            i15 = 3670016;
                            i16 = i12;
                            TextStyle textStyle422 = textStyle2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            RadioButtonElement(z3, LambdaActionKt.action(null, function0, startRestartGroup, i16 & 112, 1), glanceModifier3, z5, str3, textStyle422, radioButtonColors3, i14, composer2, (i16 & 14) | 64 | (i16 & 896) | (i16 & 7168) | (i16 & i8) | (i13 & i16) | (i15 & i16) | (i16 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            glanceModifier4 = glanceModifier3;
                            z6 = z5;
                            str4 = str3;
                            textStyle3 = textStyle422;
                            radioButtonColors4 = radioButtonColors3;
                            i17 = i14;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i20) {
                                RadioButtonKt.RadioButton(z, function0, glanceModifier4, z6, str4, textStyle3, radioButtonColors4, i17, composer3, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    i11 = i10;
                    i12 = i4;
                    if ((i4 & 23967451) != 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    String str72 = str2;
                    glanceModifier3 = glanceModifier2;
                    i13 = i9;
                    radioButtonColors3 = radioButtonColors2;
                    str3 = str72;
                    i14 = i;
                    z5 = z4;
                    i15 = 3670016;
                    i16 = i12;
                    TextStyle textStyle4222 = textStyle2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    RadioButtonElement(z3, LambdaActionKt.action(null, function0, startRestartGroup, i16 & 112, 1), glanceModifier3, z5, str3, textStyle4222, radioButtonColors3, i14, composer2, (i16 & 14) | 64 | (i16 & 896) | (i16 & 7168) | (i16 & i8) | (i13 & i16) | (i15 & i16) | (i16 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    glanceModifier4 = glanceModifier3;
                    z6 = z5;
                    str4 = str3;
                    textStyle3 = textStyle4222;
                    radioButtonColors4 = radioButtonColors3;
                    i17 = i14;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                str2 = str;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i2 & 3670016) != 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i4;
                if ((i4 & 23967451) != 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i19 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i11 != 0) {
                }
                String str722 = str2;
                glanceModifier3 = glanceModifier2;
                i13 = i9;
                radioButtonColors3 = radioButtonColors2;
                str3 = str722;
                i14 = i;
                z5 = z4;
                i15 = 3670016;
                i16 = i12;
                TextStyle textStyle42222 = textStyle2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                RadioButtonElement(z3, LambdaActionKt.action(null, function0, startRestartGroup, i16 & 112, 1), glanceModifier3, z5, str3, textStyle42222, radioButtonColors3, i14, composer2, (i16 & 14) | 64 | (i16 & 896) | (i16 & 7168) | (i16 & i8) | (i13 & i16) | (i15 & i16) | (i16 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                glanceModifier4 = glanceModifier3;
                z6 = z5;
                str4 = str3;
                textStyle3 = textStyle42222;
                radioButtonColors4 = radioButtonColors3;
                i17 = i14;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str2 = str;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i2 & 3670016) != 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i4;
            if ((i4 & 23967451) != 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i19 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i11 != 0) {
            }
            String str7222 = str2;
            glanceModifier3 = glanceModifier2;
            i13 = i9;
            radioButtonColors3 = radioButtonColors2;
            str3 = str7222;
            i14 = i;
            z5 = z4;
            i15 = 3670016;
            i16 = i12;
            TextStyle textStyle422222 = textStyle2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            RadioButtonElement(z3, LambdaActionKt.action(null, function0, startRestartGroup, i16 & 112, 1), glanceModifier3, z5, str3, textStyle422222, radioButtonColors3, i14, composer2, (i16 & 14) | 64 | (i16 & 896) | (i16 & 7168) | (i16 & i8) | (i13 & i16) | (i15 & i16) | (i16 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            glanceModifier4 = glanceModifier3;
            z6 = z5;
            str4 = str3;
            textStyle3 = textStyle422222;
            radioButtonColors4 = radioButtonColors3;
            i17 = i14;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        glanceModifier2 = glanceModifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str2 = str;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i2 & 3670016) != 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i4;
        if ((i4 & 23967451) != 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i11 != 0) {
        }
        String str72222 = str2;
        glanceModifier3 = glanceModifier2;
        i13 = i9;
        radioButtonColors3 = radioButtonColors2;
        str3 = str72222;
        i14 = i;
        z5 = z4;
        i15 = 3670016;
        i16 = i12;
        TextStyle textStyle4222222 = textStyle2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        RadioButtonElement(z3, LambdaActionKt.action(null, function0, startRestartGroup, i16 & 112, 1), glanceModifier3, z5, str3, textStyle4222222, radioButtonColors3, i14, composer2, (i16 & 14) | 64 | (i16 & 896) | (i16 & 7168) | (i16 & i8) | (i13 & i16) | (i15 & i16) | (i16 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        glanceModifier4 = glanceModifier3;
        z6 = z5;
        str4 = str3;
        textStyle3 = textStyle4222222;
        radioButtonColors4 = radioButtonColors3;
        i17 = i14;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ec  */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    @ExperimentalGlanceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, GlanceModifier glanceModifier, boolean z2, String str, TextStyle textStyle, RadioButtonColors radioButtonColors, int i, String str2, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i4;
        GlanceModifier glanceModifier2;
        int i5;
        boolean z4;
        int i6;
        String str3;
        int i7;
        int i8;
        TextStyle textStyle2;
        int i9;
        RadioButtonColors radioButtonColors2;
        int i10;
        int i11;
        int i12;
        int i13;
        RadioButtonColors radioButtonColors3;
        int i14;
        String str4;
        RadioButtonColors radioButtonColors4;
        GlanceModifier glanceModifier3;
        boolean z5;
        int i15;
        int i16;
        int i17;
        int i18;
        String str5;
        int i19;
        TextStyle textStyle3;
        Composer composer2;
        final String str6;
        final GlanceModifier glanceModifier4;
        final boolean z6;
        final String str7;
        final TextStyle textStyle4;
        final RadioButtonColors radioButtonColors5;
        final int i20;
        ScopeUpdateScope endRestartGroup;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(1720778013);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i2 & 14) == 0) {
                i4 = (startRestartGroup.changed(z3) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        int i22 = i3 & 4;
        if (i22 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            glanceModifier2 = glanceModifier;
            i4 |= startRestartGroup.changed(glanceModifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z4 = z2;
                i4 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    str3 = str;
                    i4 |= startRestartGroup.changed(str3) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i8 = 57344;
                        textStyle2 = textStyle;
                    } else {
                        i8 = 57344;
                        textStyle2 = textStyle;
                        if ((i2 & 458752) == 0) {
                            i4 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 3670016) != 0) {
                        if ((i3 & 64) == 0) {
                            i9 = 458752;
                            radioButtonColors2 = radioButtonColors;
                            if (startRestartGroup.changed(radioButtonColors2)) {
                                i21 = 1048576;
                                i4 |= i21;
                            }
                        } else {
                            i9 = 458752;
                            radioButtonColors2 = radioButtonColors;
                        }
                        i21 = 524288;
                        i4 |= i21;
                    } else {
                        i9 = 458752;
                        radioButtonColors2 = radioButtonColors;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                        i12 = i3 & 256;
                        if (i12 != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 234881024) == 0) {
                            i13 = i12;
                            i4 |= startRestartGroup.changed(str2) ? 67108864 : 33554432;
                            int i23 = i4;
                            if ((i4 & 191739611) != 38347922 && startRestartGroup.getSkipping()) {
                                startRestartGroup.skipToGroupEnd();
                                i20 = i;
                                composer2 = startRestartGroup;
                                glanceModifier4 = glanceModifier2;
                                z6 = z4;
                                textStyle4 = textStyle2;
                                str7 = str3;
                                radioButtonColors5 = radioButtonColors2;
                                str6 = str2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i22 != 0) {
                                        glanceModifier2 = GlanceModifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        z4 = true;
                                    }
                                    if (i6 != 0) {
                                        str3 = "";
                                    }
                                    if (i7 != 0) {
                                        textStyle2 = null;
                                    }
                                    if ((i3 & 64) == 0) {
                                        radioButtonColors3 = RadioButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        i14 = i23 & (-3670017);
                                    } else {
                                        radioButtonColors3 = radioButtonColors2;
                                        i14 = i23;
                                    }
                                    int i24 = i11 == 0 ? Integer.MAX_VALUE : i;
                                    str4 = i13 == 0 ? str2 : null;
                                    radioButtonColors4 = radioButtonColors3;
                                    glanceModifier3 = glanceModifier2;
                                    z5 = z4;
                                    i15 = 3670016;
                                    i16 = 29360128;
                                    i17 = 1720778013;
                                    i18 = i24;
                                    str5 = str3;
                                    i19 = i9;
                                    textStyle3 = textStyle2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i14 = i23 & (-3670017);
                                        str4 = str2;
                                        glanceModifier3 = glanceModifier2;
                                        radioButtonColors4 = radioButtonColors2;
                                        i15 = 3670016;
                                        i19 = i9;
                                        i16 = 29360128;
                                    } else {
                                        str4 = str2;
                                        glanceModifier3 = glanceModifier2;
                                        radioButtonColors4 = radioButtonColors2;
                                        i15 = 3670016;
                                        i19 = i9;
                                        i16 = 29360128;
                                        i14 = i23;
                                    }
                                    i18 = i;
                                    z5 = z4;
                                    textStyle3 = textStyle2;
                                    str5 = str3;
                                    i17 = 1720778013;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i17, i14, -1, "androidx.glance.appwidget.RadioButton (RadioButton.kt:160)");
                                }
                                composer2 = startRestartGroup;
                                RadioButtonElement(z3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i14 >> 24) & 14) | (i14 & 112), 0), glanceModifier3, z5, str5, textStyle3, radioButtonColors4, i18, composer2, (i15 & i14) | (i19 & i14) | (i14 & 14) | 64 | (i14 & 896) | (i14 & 7168) | (i14 & i8) | (i14 & i16), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str6 = str4;
                                glanceModifier4 = glanceModifier3;
                                z6 = z5;
                                str7 = str5;
                                textStyle4 = textStyle3;
                                radioButtonColors5 = radioButtonColors4;
                                i20 = i18;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.RadioButtonKt$RadioButton$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i25) {
                                    RadioButtonKt.RadioButton(z, function0, glanceModifier4, z6, str7, textStyle4, radioButtonColors5, i20, str6, composer3, i2 | 1, i3);
                                }
                            });
                            return;
                        }
                        i13 = i12;
                        int i232 = i4;
                        if ((i4 & 191739611) != 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        radioButtonColors4 = radioButtonColors3;
                        glanceModifier3 = glanceModifier2;
                        z5 = z4;
                        i15 = 3670016;
                        i16 = 29360128;
                        i17 = 1720778013;
                        i18 = i24;
                        str5 = str3;
                        i19 = i9;
                        textStyle3 = textStyle2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        RadioButtonElement(z3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i14 >> 24) & 14) | (i14 & 112), 0), glanceModifier3, z5, str5, textStyle3, radioButtonColors4, i18, composer2, (i15 & i14) | (i19 & i14) | (i14 & 14) | 64 | (i14 & 896) | (i14 & 7168) | (i14 & i8) | (i14 & i16), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        str6 = str4;
                        glanceModifier4 = glanceModifier3;
                        z6 = z5;
                        str7 = str5;
                        textStyle4 = textStyle3;
                        radioButtonColors5 = radioButtonColors4;
                        i20 = i18;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    int i2322 = i4;
                    if ((i4 & 191739611) != 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    radioButtonColors4 = radioButtonColors3;
                    glanceModifier3 = glanceModifier2;
                    z5 = z4;
                    i15 = 3670016;
                    i16 = 29360128;
                    i17 = 1720778013;
                    i18 = i24;
                    str5 = str3;
                    i19 = i9;
                    textStyle3 = textStyle2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    RadioButtonElement(z3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i14 >> 24) & 14) | (i14 & 112), 0), glanceModifier3, z5, str5, textStyle3, radioButtonColors4, i18, composer2, (i15 & i14) | (i19 & i14) | (i14 & 14) | 64 | (i14 & 896) | (i14 & 7168) | (i14 & i8) | (i14 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str6 = str4;
                    glanceModifier4 = glanceModifier3;
                    z6 = z5;
                    str7 = str5;
                    textStyle4 = textStyle3;
                    radioButtonColors5 = radioButtonColors4;
                    i20 = i18;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str3 = str;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i2 & 3670016) != 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                int i23222 = i4;
                if ((i4 & 191739611) != 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i22 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if (i11 == 0) {
                }
                if (i13 == 0) {
                }
                radioButtonColors4 = radioButtonColors3;
                glanceModifier3 = glanceModifier2;
                z5 = z4;
                i15 = 3670016;
                i16 = 29360128;
                i17 = 1720778013;
                i18 = i24;
                str5 = str3;
                i19 = i9;
                textStyle3 = textStyle2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                RadioButtonElement(z3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i14 >> 24) & 14) | (i14 & 112), 0), glanceModifier3, z5, str5, textStyle3, radioButtonColors4, i18, composer2, (i15 & i14) | (i19 & i14) | (i14 & 14) | 64 | (i14 & 896) | (i14 & 7168) | (i14 & i8) | (i14 & i16), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                str6 = str4;
                glanceModifier4 = glanceModifier3;
                z6 = z5;
                str7 = str5;
                textStyle4 = textStyle3;
                radioButtonColors5 = radioButtonColors4;
                i20 = i18;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str3 = str;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i2 & 3670016) != 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            int i232222 = i4;
            if ((i4 & 191739611) != 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            radioButtonColors4 = radioButtonColors3;
            glanceModifier3 = glanceModifier2;
            z5 = z4;
            i15 = 3670016;
            i16 = 29360128;
            i17 = 1720778013;
            i18 = i24;
            str5 = str3;
            i19 = i9;
            textStyle3 = textStyle2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            RadioButtonElement(z3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i14 >> 24) & 14) | (i14 & 112), 0), glanceModifier3, z5, str5, textStyle3, radioButtonColors4, i18, composer2, (i15 & i14) | (i19 & i14) | (i14 & 14) | 64 | (i14 & 896) | (i14 & 7168) | (i14 & i8) | (i14 & i16), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            str6 = str4;
            glanceModifier4 = glanceModifier3;
            z6 = z5;
            str7 = str5;
            textStyle4 = textStyle3;
            radioButtonColors5 = radioButtonColors4;
            i20 = i18;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        glanceModifier2 = glanceModifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str3 = str;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i2 & 3670016) != 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        int i2322222 = i4;
        if ((i4 & 191739611) != 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if (i11 == 0) {
        }
        if (i13 == 0) {
        }
        radioButtonColors4 = radioButtonColors3;
        glanceModifier3 = glanceModifier2;
        z5 = z4;
        i15 = 3670016;
        i16 = 29360128;
        i17 = 1720778013;
        i18 = i24;
        str5 = str3;
        i19 = i9;
        textStyle3 = textStyle2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        RadioButtonElement(z3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i14 >> 24) & 14) | (i14 & 112), 0), glanceModifier3, z5, str5, textStyle3, radioButtonColors4, i18, composer2, (i15 & i14) | (i19 & i14) | (i14 & 14) | 64 | (i14 & 896) | (i14 & 7168) | (i14 & i8) | (i14 & i16), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        str6 = str4;
        glanceModifier4 = glanceModifier3;
        z6 = z5;
        str7 = str5;
        textStyle4 = textStyle3;
        radioButtonColors5 = radioButtonColors4;
        i20 = i18;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
