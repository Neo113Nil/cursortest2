package androidx.glance;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.action.Action;
import androidx.glance.action.ActionKt;
import androidx.glance.action.LambdaActionKt;
import androidx.glance.text.EmittableText;
import androidx.glance.text.TextStyle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.ws.WebSocketProtocol;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0012\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014\u001aQ\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0014\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0007¨\u0006\u0019"}, d2 = {"Button", "", "text", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/glance/GlanceModifier;", "enabled", "", "style", "Landroidx/glance/text/TextStyle;", "colors", "Landroidx/glance/ButtonColors;", "maxLines", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/glance/GlanceModifier;ZLandroidx/glance/text/TextStyle;Landroidx/glance/ButtonColors;ILandroidx/compose/runtime/Composer;II)V", Constants.KEY, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/glance/GlanceModifier;ZLandroidx/glance/text/TextStyle;Landroidx/glance/ButtonColors;ILjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Landroidx/glance/action/Action;", "(Ljava/lang/String;Landroidx/glance/action/Action;Landroidx/glance/GlanceModifier;ZLandroidx/glance/text/TextStyle;Landroidx/glance/ButtonColors;ILandroidx/compose/runtime/Composer;II)V", "ButtonElement", "toEmittableText", "Landroidx/glance/text/EmittableText;", "Landroidx/glance/EmittableButton;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/glance/ButtonKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,206:1\n34#2:207\n35#2:224\n251#3,8:208\n259#3,2:222\n3844#4,6:216\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/glance/ButtonKt\n*L\n118#1:207\n118#1:224\n118#1:208,8\n118#1:222,2\n126#1:216,6\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0065  */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final String str, final Action action, GlanceModifier glanceModifier, boolean z, TextStyle textStyle, ButtonColors buttonColors, int i, Composer composer, final int i2, final int i3) {
        String str2;
        int i4;
        Action action2;
        final GlanceModifier glanceModifier2;
        int i5;
        boolean z2;
        int i6;
        TextStyle textStyle2;
        ButtonColors buttonColors2;
        int i7;
        int i8;
        int i9;
        TextStyle textStyle3;
        GlanceModifier glanceModifier3;
        int i10;
        int i11;
        ButtonColors buttonColors3;
        boolean z3;
        Composer composer2;
        final boolean z4;
        final TextStyle textStyle4;
        final ButtonColors buttonColors4;
        final int i12;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(81945084);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i2 & 14) == 0) {
                i4 = (startRestartGroup.changed(str2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            action2 = action;
        } else {
            action2 = action;
            if ((i2 & 112) == 0) {
                i4 |= startRestartGroup.changed(action2) ? 32 : 16;
            }
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            glanceModifier2 = glanceModifier;
            i4 |= startRestartGroup.changed(glanceModifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    textStyle2 = textStyle;
                    i4 |= startRestartGroup.changed(textStyle2) ? 16384 : 8192;
                    if ((458752 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            buttonColors2 = buttonColors;
                            if (startRestartGroup.changed(buttonColors2)) {
                                i13 = 131072;
                                i4 |= i13;
                            }
                        } else {
                            buttonColors2 = buttonColors;
                        }
                        i13 = 65536;
                        i4 |= i13;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        i8 = i;
                        i4 |= startRestartGroup.changed(i8) ? 1048576 : 524288;
                        i9 = i4;
                        if ((2995931 & i9) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                GlanceModifier glanceModifier4 = i14 != 0 ? GlanceModifier.INSTANCE : glanceModifier2;
                                boolean z5 = i5 != 0 ? true : z2;
                                if (i6 != 0) {
                                    textStyle2 = null;
                                }
                                if ((i3 & 32) != 0) {
                                    i9 &= -458753;
                                    buttonColors2 = ButtonDefaults.INSTANCE.buttonColors(null, null, startRestartGroup, 384, 3);
                                }
                                if (i7 != 0) {
                                    textStyle3 = textStyle2;
                                    buttonColors3 = buttonColors2;
                                    z3 = z5;
                                    glanceModifier3 = glanceModifier4;
                                    i10 = i9;
                                    i11 = Integer.MAX_VALUE;
                                } else {
                                    textStyle3 = textStyle2;
                                    glanceModifier3 = glanceModifier4;
                                    i10 = i9;
                                    i11 = i8;
                                    buttonColors3 = buttonColors2;
                                    z3 = z5;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i9 &= -458753;
                                }
                                textStyle3 = textStyle2;
                                i10 = i9;
                                glanceModifier3 = glanceModifier2;
                                i11 = i8;
                                buttonColors3 = buttonColors2;
                                z3 = z2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(81945084, i10, -1, "androidx.glance.Button (Button.kt:40)");
                            }
                            ButtonElement(str2, action2, glanceModifier3, z3, textStyle3, buttonColors3, i11, startRestartGroup, i10 & 4194302, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            glanceModifier2 = glanceModifier3;
                            z4 = z3;
                            textStyle4 = textStyle3;
                            buttonColors4 = buttonColors3;
                            i12 = i11;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            z4 = z2;
                            textStyle4 = textStyle2;
                            buttonColors4 = buttonColors2;
                            i12 = i8;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.ButtonKt$Button$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i15) {
                                ButtonKt.Button(str, action, glanceModifier2, z4, textStyle4, buttonColors4, i12, composer3, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    i8 = i;
                    i9 = i4;
                    if ((2995931 & i9) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ButtonElement(str2, action2, glanceModifier3, z3, textStyle3, buttonColors3, i11, startRestartGroup, i10 & 4194302, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    glanceModifier2 = glanceModifier3;
                    z4 = z3;
                    textStyle4 = textStyle3;
                    buttonColors4 = buttonColors3;
                    i12 = i11;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                textStyle2 = textStyle;
                if ((458752 & i2) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i;
                i9 = i4;
                if ((2995931 & i9) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i14 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ButtonElement(str2, action2, glanceModifier3, z3, textStyle3, buttonColors3, i11, startRestartGroup, i10 & 4194302, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                glanceModifier2 = glanceModifier3;
                z4 = z3;
                textStyle4 = textStyle3;
                buttonColors4 = buttonColors3;
                i12 = i11;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            textStyle2 = textStyle;
            if ((458752 & i2) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i;
            i9 = i4;
            if ((2995931 & i9) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ButtonElement(str2, action2, glanceModifier3, z3, textStyle3, buttonColors3, i11, startRestartGroup, i10 & 4194302, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            glanceModifier2 = glanceModifier3;
            z4 = z3;
            textStyle4 = textStyle3;
            buttonColors4 = buttonColors3;
            i12 = i11;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        glanceModifier2 = glanceModifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        textStyle2 = textStyle;
        if ((458752 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i4;
        if ((2995931 & i9) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ButtonElement(str2, action2, glanceModifier3, z3, textStyle3, buttonColors3, i11, startRestartGroup, i10 & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        glanceModifier2 = glanceModifier3;
        z4 = z3;
        textStyle4 = textStyle3;
        buttonColors4 = buttonColors3;
        i12 = i11;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0205 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00aa  */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonElement(final String str, final Action action, GlanceModifier glanceModifier, boolean z, TextStyle textStyle, ButtonColors buttonColors, int i, Composer composer, final int i2, final int i3) {
        int i4;
        GlanceModifier glanceModifier2;
        int i5;
        boolean z2;
        int i6;
        TextStyle textStyle2;
        ButtonColors buttonColors2;
        int i7;
        int i8;
        final GlanceModifier glanceModifier3;
        int i9;
        TextStyle textStyle3;
        Composer m108constructorimpl;
        final boolean z3;
        final int i10;
        final TextStyle textStyle4;
        ScopeUpdateScope endRestartGroup;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(507525656);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(action) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            glanceModifier2 = glanceModifier;
            i4 |= startRestartGroup.changed(glanceModifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    textStyle2 = textStyle;
                    i4 |= startRestartGroup.changed(textStyle2) ? 16384 : 8192;
                    if ((458752 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            buttonColors2 = buttonColors;
                            if (startRestartGroup.changed(buttonColors2)) {
                                i11 = 131072;
                                i4 |= i11;
                            }
                        } else {
                            buttonColors2 = buttonColors;
                        }
                        i11 = 65536;
                        i4 |= i11;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        i8 = i;
                        i4 |= startRestartGroup.changed(i8) ? 1048576 : 524288;
                        if ((i4 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                glanceModifier3 = i12 != 0 ? GlanceModifier.INSTANCE : glanceModifier2;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                TextStyle textStyle5 = i6 != 0 ? null : textStyle2;
                                if ((i3 & 32) != 0) {
                                    buttonColors2 = ButtonDefaults.INSTANCE.buttonColors(null, null, startRestartGroup, 384, 3);
                                }
                                i9 = i7 != 0 ? Integer.MAX_VALUE : i;
                                textStyle3 = textStyle5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                glanceModifier3 = glanceModifier2;
                                i9 = i8;
                                textStyle3 = textStyle2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(507525656, i2, -1, "androidx.glance.ButtonElement (Button.kt:103)");
                            }
                            GlanceModifier background = BackgroundKt.background(z2 ? ActionKt.clickable(glanceModifier3, action) : glanceModifier3, buttonColors2.getBackgroundColor());
                            if (textStyle3 != null || (r4 = TextStyle.m1498copyKmPxOYk$default(textStyle3, buttonColors2.getContentColor(), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null)) == null) {
                                TextStyle textStyle6 = new TextStyle(buttonColors2.getContentColor(), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
                            }
                            ButtonKt$ButtonElement$1 buttonKt$ButtonElement$1 = ButtonKt$ButtonElement$1.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-1115894518);
                            startRestartGroup.startReplaceableGroup(1886828752);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(buttonKt$ButtonElement$1));
                            } else {
                                startRestartGroup.useNode();
                            }
                            m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
                            Updater.m115setimpl(m108constructorimpl, str, new Function2<EmittableButton, String, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, String str2) {
                                    invoke2(emittableButton, str2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(EmittableButton emittableButton, String str2) {
                                    emittableButton.setText(str2);
                                }
                            });
                            Updater.m115setimpl(m108constructorimpl, background, new Function2<EmittableButton, GlanceModifier, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                                    invoke2(emittableButton, glanceModifier4);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                                    emittableButton.setModifier(glanceModifier4);
                                }
                            });
                            Updater.m115setimpl(m108constructorimpl, textStyle6, new Function2<EmittableButton, TextStyle, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, TextStyle textStyle7) {
                                    invoke2(emittableButton, textStyle7);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(EmittableButton emittableButton, TextStyle textStyle7) {
                                    emittableButton.setStyle(textStyle7);
                                }
                            });
                            Updater.m115setimpl(m108constructorimpl, buttonColors2, new Function2<EmittableButton, ButtonColors, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, ButtonColors buttonColors3) {
                                    invoke2(emittableButton, buttonColors3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(EmittableButton emittableButton, ButtonColors buttonColors3) {
                                    emittableButton.setColors(buttonColors3);
                                }
                            });
                            Updater.m115setimpl(m108constructorimpl, Boolean.valueOf(z2), new Function2<EmittableButton, Boolean, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Boolean bool) {
                                    invoke(emittableButton, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(EmittableButton emittableButton, boolean z4) {
                                    emittableButton.setEnabled(z4);
                                }
                            });
                            ButtonKt$ButtonElement$2$6 buttonKt$ButtonElement$2$6 = new Function2<EmittableButton, Integer, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Integer num) {
                                    invoke(emittableButton, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(EmittableButton emittableButton, int i13) {
                                    emittableButton.setMaxLines(i13);
                                }
                            };
                            if (!m108constructorimpl.getInserting() || !Intrinsics.areEqual(m108constructorimpl.rememberedValue(), Integer.valueOf(i9))) {
                                m108constructorimpl.updateRememberedValue(Integer.valueOf(i9));
                                m108constructorimpl.apply(Integer.valueOf(i9), buttonKt$ButtonElement$2$6);
                            }
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z2;
                            i10 = i9;
                            textStyle4 = textStyle3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            glanceModifier3 = glanceModifier2;
                            z3 = z2;
                            textStyle4 = textStyle2;
                            i10 = i8;
                        }
                        final ButtonColors buttonColors3 = buttonColors2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i13) {
                                ButtonKt.ButtonElement(str, action, glanceModifier3, z3, textStyle4, buttonColors3, i10, composer2, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    i8 = i;
                    if ((i4 & 2995931) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    textStyle3 = textStyle5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    GlanceModifier background2 = BackgroundKt.background(z2 ? ActionKt.clickable(glanceModifier3, action) : glanceModifier3, buttonColors2.getBackgroundColor());
                    if (textStyle3 != null) {
                    }
                    TextStyle textStyle62 = new TextStyle(buttonColors2.getContentColor(), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
                    ButtonKt$ButtonElement$1 buttonKt$ButtonElement$12 = ButtonKt$ButtonElement$1.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-1115894518);
                    startRestartGroup.startReplaceableGroup(1886828752);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
                    Updater.m115setimpl(m108constructorimpl, str, new Function2<EmittableButton, String, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, String str2) {
                            invoke2(emittableButton, str2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(EmittableButton emittableButton, String str2) {
                            emittableButton.setText(str2);
                        }
                    });
                    Updater.m115setimpl(m108constructorimpl, background2, new Function2<EmittableButton, GlanceModifier, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                            invoke2(emittableButton, glanceModifier4);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                            emittableButton.setModifier(glanceModifier4);
                        }
                    });
                    Updater.m115setimpl(m108constructorimpl, textStyle62, new Function2<EmittableButton, TextStyle, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, TextStyle textStyle7) {
                            invoke2(emittableButton, textStyle7);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(EmittableButton emittableButton, TextStyle textStyle7) {
                            emittableButton.setStyle(textStyle7);
                        }
                    });
                    Updater.m115setimpl(m108constructorimpl, buttonColors2, new Function2<EmittableButton, ButtonColors, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, ButtonColors buttonColors32) {
                            invoke2(emittableButton, buttonColors32);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(EmittableButton emittableButton, ButtonColors buttonColors32) {
                            emittableButton.setColors(buttonColors32);
                        }
                    });
                    Updater.m115setimpl(m108constructorimpl, Boolean.valueOf(z2), new Function2<EmittableButton, Boolean, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Boolean bool) {
                            invoke(emittableButton, bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(EmittableButton emittableButton, boolean z4) {
                            emittableButton.setEnabled(z4);
                        }
                    });
                    ButtonKt$ButtonElement$2$6 buttonKt$ButtonElement$2$62 = new Function2<EmittableButton, Integer, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Integer num) {
                            invoke(emittableButton, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(EmittableButton emittableButton, int i13) {
                            emittableButton.setMaxLines(i13);
                        }
                    };
                    if (!m108constructorimpl.getInserting()) {
                    }
                    m108constructorimpl.updateRememberedValue(Integer.valueOf(i9));
                    m108constructorimpl.apply(Integer.valueOf(i9), buttonKt$ButtonElement$2$62);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z2;
                    i10 = i9;
                    textStyle4 = textStyle3;
                    final ButtonColors buttonColors32 = buttonColors2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                textStyle2 = textStyle;
                if ((458752 & i2) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i;
                if ((i4 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                textStyle3 = textStyle5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                GlanceModifier background22 = BackgroundKt.background(z2 ? ActionKt.clickable(glanceModifier3, action) : glanceModifier3, buttonColors2.getBackgroundColor());
                if (textStyle3 != null) {
                }
                TextStyle textStyle622 = new TextStyle(buttonColors2.getContentColor(), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
                ButtonKt$ButtonElement$1 buttonKt$ButtonElement$122 = ButtonKt$ButtonElement$1.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1115894518);
                startRestartGroup.startReplaceableGroup(1886828752);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startNode();
                if (startRestartGroup.getInserting()) {
                }
                m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
                Updater.m115setimpl(m108constructorimpl, str, new Function2<EmittableButton, String, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, String str2) {
                        invoke2(emittableButton, str2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EmittableButton emittableButton, String str2) {
                        emittableButton.setText(str2);
                    }
                });
                Updater.m115setimpl(m108constructorimpl, background22, new Function2<EmittableButton, GlanceModifier, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                        invoke2(emittableButton, glanceModifier4);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                        emittableButton.setModifier(glanceModifier4);
                    }
                });
                Updater.m115setimpl(m108constructorimpl, textStyle622, new Function2<EmittableButton, TextStyle, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, TextStyle textStyle7) {
                        invoke2(emittableButton, textStyle7);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EmittableButton emittableButton, TextStyle textStyle7) {
                        emittableButton.setStyle(textStyle7);
                    }
                });
                Updater.m115setimpl(m108constructorimpl, buttonColors2, new Function2<EmittableButton, ButtonColors, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, ButtonColors buttonColors322) {
                        invoke2(emittableButton, buttonColors322);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EmittableButton emittableButton, ButtonColors buttonColors322) {
                        emittableButton.setColors(buttonColors322);
                    }
                });
                Updater.m115setimpl(m108constructorimpl, Boolean.valueOf(z2), new Function2<EmittableButton, Boolean, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Boolean bool) {
                        invoke(emittableButton, bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(EmittableButton emittableButton, boolean z4) {
                        emittableButton.setEnabled(z4);
                    }
                });
                ButtonKt$ButtonElement$2$6 buttonKt$ButtonElement$2$622 = new Function2<EmittableButton, Integer, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Integer num) {
                        invoke(emittableButton, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(EmittableButton emittableButton, int i13) {
                        emittableButton.setMaxLines(i13);
                    }
                };
                if (!m108constructorimpl.getInserting()) {
                }
                m108constructorimpl.updateRememberedValue(Integer.valueOf(i9));
                m108constructorimpl.apply(Integer.valueOf(i9), buttonKt$ButtonElement$2$622);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z2;
                i10 = i9;
                textStyle4 = textStyle3;
                final ButtonColors buttonColors322 = buttonColors2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            textStyle2 = textStyle;
            if ((458752 & i2) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i;
            if ((i4 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            textStyle3 = textStyle5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            GlanceModifier background222 = BackgroundKt.background(z2 ? ActionKt.clickable(glanceModifier3, action) : glanceModifier3, buttonColors2.getBackgroundColor());
            if (textStyle3 != null) {
            }
            TextStyle textStyle6222 = new TextStyle(buttonColors2.getContentColor(), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
            ButtonKt$ButtonElement$1 buttonKt$ButtonElement$1222 = ButtonKt$ButtonElement$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1115894518);
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
            }
            m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, str, new Function2<EmittableButton, String, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, String str2) {
                    invoke2(emittableButton, str2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableButton emittableButton, String str2) {
                    emittableButton.setText(str2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, background222, new Function2<EmittableButton, GlanceModifier, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                    invoke2(emittableButton, glanceModifier4);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                    emittableButton.setModifier(glanceModifier4);
                }
            });
            Updater.m115setimpl(m108constructorimpl, textStyle6222, new Function2<EmittableButton, TextStyle, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, TextStyle textStyle7) {
                    invoke2(emittableButton, textStyle7);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableButton emittableButton, TextStyle textStyle7) {
                    emittableButton.setStyle(textStyle7);
                }
            });
            Updater.m115setimpl(m108constructorimpl, buttonColors2, new Function2<EmittableButton, ButtonColors, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, ButtonColors buttonColors3222) {
                    invoke2(emittableButton, buttonColors3222);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableButton emittableButton, ButtonColors buttonColors3222) {
                    emittableButton.setColors(buttonColors3222);
                }
            });
            Updater.m115setimpl(m108constructorimpl, Boolean.valueOf(z2), new Function2<EmittableButton, Boolean, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Boolean bool) {
                    invoke(emittableButton, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(EmittableButton emittableButton, boolean z4) {
                    emittableButton.setEnabled(z4);
                }
            });
            ButtonKt$ButtonElement$2$6 buttonKt$ButtonElement$2$6222 = new Function2<EmittableButton, Integer, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Integer num) {
                    invoke(emittableButton, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(EmittableButton emittableButton, int i13) {
                    emittableButton.setMaxLines(i13);
                }
            };
            if (!m108constructorimpl.getInserting()) {
            }
            m108constructorimpl.updateRememberedValue(Integer.valueOf(i9));
            m108constructorimpl.apply(Integer.valueOf(i9), buttonKt$ButtonElement$2$6222);
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z2;
            i10 = i9;
            textStyle4 = textStyle3;
            final ButtonColors buttonColors3222 = buttonColors2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        glanceModifier2 = glanceModifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        textStyle2 = textStyle;
        if ((458752 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i;
        if ((i4 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        textStyle3 = textStyle5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        GlanceModifier background2222 = BackgroundKt.background(z2 ? ActionKt.clickable(glanceModifier3, action) : glanceModifier3, buttonColors2.getBackgroundColor());
        if (textStyle3 != null) {
        }
        TextStyle textStyle62222 = new TextStyle(buttonColors2.getContentColor(), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        ButtonKt$ButtonElement$1 buttonKt$ButtonElement$12222 = ButtonKt$ButtonElement$1.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1115894518);
        startRestartGroup.startReplaceableGroup(1886828752);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
        }
        m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
        Updater.m115setimpl(m108constructorimpl, str, new Function2<EmittableButton, String, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, String str2) {
                invoke2(emittableButton, str2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableButton emittableButton, String str2) {
                emittableButton.setText(str2);
            }
        });
        Updater.m115setimpl(m108constructorimpl, background2222, new Function2<EmittableButton, GlanceModifier, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                invoke2(emittableButton, glanceModifier4);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableButton emittableButton, GlanceModifier glanceModifier4) {
                emittableButton.setModifier(glanceModifier4);
            }
        });
        Updater.m115setimpl(m108constructorimpl, textStyle62222, new Function2<EmittableButton, TextStyle, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, TextStyle textStyle7) {
                invoke2(emittableButton, textStyle7);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableButton emittableButton, TextStyle textStyle7) {
                emittableButton.setStyle(textStyle7);
            }
        });
        Updater.m115setimpl(m108constructorimpl, buttonColors2, new Function2<EmittableButton, ButtonColors, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, ButtonColors buttonColors32222) {
                invoke2(emittableButton, buttonColors32222);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableButton emittableButton, ButtonColors buttonColors32222) {
                emittableButton.setColors(buttonColors32222);
            }
        });
        Updater.m115setimpl(m108constructorimpl, Boolean.valueOf(z2), new Function2<EmittableButton, Boolean, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Boolean bool) {
                invoke(emittableButton, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(EmittableButton emittableButton, boolean z4) {
                emittableButton.setEnabled(z4);
            }
        });
        ButtonKt$ButtonElement$2$6 buttonKt$ButtonElement$2$62222 = new Function2<EmittableButton, Integer, Unit>() { // from class: androidx.glance.ButtonKt$ButtonElement$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableButton emittableButton, Integer num) {
                invoke(emittableButton, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(EmittableButton emittableButton, int i13) {
                emittableButton.setMaxLines(i13);
            }
        };
        if (!m108constructorimpl.getInserting()) {
        }
        m108constructorimpl.updateRememberedValue(Integer.valueOf(i9));
        m108constructorimpl.apply(Integer.valueOf(i9), buttonKt$ButtonElement$2$62222);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z2;
        i10 = i9;
        textStyle4 = textStyle3;
        final ButtonColors buttonColors32222 = buttonColors2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final EmittableText toEmittableText(EmittableButton emittableButton) {
        EmittableText emittableText = new EmittableText();
        emittableText.setModifier(emittableButton.getModifier());
        emittableText.setText(emittableButton.getText());
        emittableText.setStyle(emittableButton.getStyle());
        emittableText.setMaxLines(emittableButton.getMaxLines());
        return emittableText;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0066  */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final String str, final Function0<Unit> function0, GlanceModifier glanceModifier, boolean z, TextStyle textStyle, ButtonColors buttonColors, int i, Composer composer, final int i2, final int i3) {
        String str2;
        int i4;
        GlanceModifier glanceModifier2;
        int i5;
        boolean z2;
        int i6;
        TextStyle textStyle2;
        ButtonColors buttonColors2;
        int i7;
        int i8;
        int i9;
        String str3;
        ButtonColors buttonColors3;
        int i10;
        GlanceModifier glanceModifier3;
        TextStyle textStyle3;
        ButtonColors buttonColors4;
        final boolean z3;
        final GlanceModifier glanceModifier4;
        final TextStyle textStyle4;
        final ButtonColors buttonColors5;
        final int i11;
        ScopeUpdateScope endRestartGroup;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-650085672);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            str2 = str;
        } else if ((i2 & 14) == 0) {
            str2 = str;
            i4 = (startRestartGroup.changed(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
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
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    textStyle2 = textStyle;
                    i4 |= startRestartGroup.changed(textStyle2) ? 16384 : 8192;
                    if ((458752 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            buttonColors2 = buttonColors;
                            if (startRestartGroup.changed(buttonColors2)) {
                                i12 = 131072;
                                i4 |= i12;
                            }
                        } else {
                            buttonColors2 = buttonColors;
                        }
                        i12 = 65536;
                        i4 |= i12;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        i8 = i;
                        i4 |= startRestartGroup.changed(i8) ? 1048576 : 524288;
                        if ((2995931 & i4) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                ButtonColors buttonColors6 = buttonColors2;
                                glanceModifier3 = glanceModifier2;
                                str3 = null;
                                buttonColors4 = buttonColors6;
                                i9 = 1;
                                i10 = i8;
                                textStyle3 = textStyle;
                            } else {
                                GlanceModifier glanceModifier5 = i13 != 0 ? GlanceModifier.INSTANCE : glanceModifier2;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                TextStyle textStyle5 = i6 != 0 ? null : textStyle;
                                if ((i3 & 32) != 0) {
                                    str3 = null;
                                    i9 = 1;
                                    buttonColors3 = ButtonDefaults.INSTANCE.buttonColors(null, null, startRestartGroup, 384, 3);
                                    i4 &= -458753;
                                } else {
                                    i9 = 1;
                                    str3 = null;
                                    buttonColors3 = buttonColors2;
                                }
                                if (i7 != 0) {
                                    glanceModifier3 = glanceModifier5;
                                    textStyle3 = textStyle5;
                                    buttonColors4 = buttonColors3;
                                    i10 = Integer.MAX_VALUE;
                                } else {
                                    i10 = i;
                                    glanceModifier3 = glanceModifier5;
                                    textStyle3 = textStyle5;
                                    buttonColors4 = buttonColors3;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-650085672, i4, -1, "androidx.glance.Button (Button.kt:63)");
                            }
                            ButtonElement(str2, LambdaActionKt.action(str3, function0, startRestartGroup, i4 & 112, i9), glanceModifier3, z2, textStyle3, buttonColors4, i10, startRestartGroup, i4 & 4194190, 0);
                            startRestartGroup = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z2;
                            glanceModifier4 = glanceModifier3;
                            textStyle4 = textStyle3;
                            buttonColors5 = buttonColors4;
                            i11 = i10;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            glanceModifier4 = glanceModifier2;
                            z3 = z2;
                            textStyle4 = textStyle2;
                            buttonColors5 = buttonColors2;
                            i11 = i8;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.ButtonKt$Button$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i14) {
                                ButtonKt.Button(str, function0, glanceModifier4, z3, textStyle4, buttonColors5, i11, composer2, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    i8 = i;
                    if ((2995931 & i4) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ButtonElement(str2, LambdaActionKt.action(str3, function0, startRestartGroup, i4 & 112, i9), glanceModifier3, z2, textStyle3, buttonColors4, i10, startRestartGroup, i4 & 4194190, 0);
                    startRestartGroup = startRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z2;
                    glanceModifier4 = glanceModifier3;
                    textStyle4 = textStyle3;
                    buttonColors5 = buttonColors4;
                    i11 = i10;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                textStyle2 = textStyle;
                if ((458752 & i2) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i;
                if ((2995931 & i4) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                }
                if (i13 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ButtonElement(str2, LambdaActionKt.action(str3, function0, startRestartGroup, i4 & 112, i9), glanceModifier3, z2, textStyle3, buttonColors4, i10, startRestartGroup, i4 & 4194190, 0);
                startRestartGroup = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z2;
                glanceModifier4 = glanceModifier3;
                textStyle4 = textStyle3;
                buttonColors5 = buttonColors4;
                i11 = i10;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            textStyle2 = textStyle;
            if ((458752 & i2) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i;
            if ((2995931 & i4) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
            }
            if (i13 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ButtonElement(str2, LambdaActionKt.action(str3, function0, startRestartGroup, i4 & 112, i9), glanceModifier3, z2, textStyle3, buttonColors4, i10, startRestartGroup, i4 & 4194190, 0);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z2;
            glanceModifier4 = glanceModifier3;
            textStyle4 = textStyle3;
            buttonColors5 = buttonColors4;
            i11 = i10;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        glanceModifier2 = glanceModifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        textStyle2 = textStyle;
        if ((458752 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i;
        if ((2995931 & i4) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) == 0) {
        }
        if (i13 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ButtonElement(str2, LambdaActionKt.action(str3, function0, startRestartGroup, i4 & 112, i9), glanceModifier3, z2, textStyle3, buttonColors4, i10, startRestartGroup, i4 & 4194190, 0);
        startRestartGroup = startRestartGroup;
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z2;
        glanceModifier4 = glanceModifier3;
        textStyle4 = textStyle3;
        buttonColors5 = buttonColors4;
        i11 = i10;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0080  */
    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    @ExperimentalGlanceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final String str, final Function0<Unit> function0, GlanceModifier glanceModifier, boolean z, TextStyle textStyle, ButtonColors buttonColors, int i, String str2, Composer composer, final int i2, final int i3) {
        String str3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        TextStyle textStyle2;
        ButtonColors buttonColors2;
        int i7;
        int i8;
        int i9;
        String str4;
        int i10;
        ButtonColors buttonColors3;
        boolean z3;
        GlanceModifier glanceModifier2;
        int i11;
        int i12;
        final String str5;
        Composer composer2;
        final GlanceModifier glanceModifier3;
        final boolean z4;
        final TextStyle textStyle3;
        final ButtonColors buttonColors4;
        final int i13;
        ScopeUpdateScope endRestartGroup;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-1113587393);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i2 & 14) == 0) {
                i4 = (startRestartGroup.changed(str3) ? 4 : 2) | i2;
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
            i4 |= startRestartGroup.changed(glanceModifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    textStyle2 = textStyle;
                    i4 |= startRestartGroup.changed(textStyle2) ? 16384 : 8192;
                    if ((458752 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            buttonColors2 = buttonColors;
                            if (startRestartGroup.changed(buttonColors2)) {
                                i14 = 131072;
                                i4 |= i14;
                            }
                        } else {
                            buttonColors2 = buttonColors;
                        }
                        i14 = 65536;
                        i4 |= i14;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        i8 = i;
                        i4 |= startRestartGroup.changed(i8) ? 1048576 : 524288;
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                            str4 = str2;
                        } else {
                            str4 = str2;
                            if ((i2 & 29360128) == 0) {
                                i4 |= startRestartGroup.changed(str4) ? 8388608 : 4194304;
                            }
                        }
                        int i16 = i4;
                        if ((i4 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                i10 = (i3 & 32) != 0 ? i16 & (-458753) : i16;
                                z3 = z2;
                                buttonColors3 = buttonColors2;
                                i11 = i8;
                                i12 = -1113587393;
                                glanceModifier2 = glanceModifier;
                            } else {
                                GlanceModifier glanceModifier4 = i15 != 0 ? GlanceModifier.INSTANCE : glanceModifier;
                                boolean z5 = i5 != 0 ? true : z2;
                                if (i6 != 0) {
                                    textStyle2 = null;
                                }
                                if ((i3 & 32) != 0) {
                                    i10 = i16 & (-458753);
                                    buttonColors2 = ButtonDefaults.INSTANCE.buttonColors(null, null, startRestartGroup, 384, 3);
                                } else {
                                    i10 = i16;
                                }
                                if (i7 != 0) {
                                    i8 = Integer.MAX_VALUE;
                                }
                                if (i9 != 0) {
                                    buttonColors3 = buttonColors2;
                                    z3 = z5;
                                    str4 = null;
                                } else {
                                    str4 = str2;
                                    buttonColors3 = buttonColors2;
                                    z3 = z5;
                                }
                                glanceModifier2 = glanceModifier4;
                                i11 = i8;
                                i12 = -1113587393;
                            }
                            TextStyle textStyle4 = textStyle2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i12, i10, -1, "androidx.glance.Button (Button.kt:91)");
                            }
                            ButtonElement(str3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i10 >> 21) & 14) | (i10 & 112), 0), glanceModifier2, z3, textStyle4, buttonColors3, i11, startRestartGroup, i10 & 4194190, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str5 = str4;
                            composer2 = startRestartGroup;
                            glanceModifier3 = glanceModifier2;
                            z4 = z3;
                            textStyle3 = textStyle4;
                            buttonColors4 = buttonColors3;
                            i13 = i11;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            glanceModifier3 = glanceModifier;
                            str5 = str4;
                            composer2 = startRestartGroup;
                            z4 = z2;
                            textStyle3 = textStyle2;
                            buttonColors4 = buttonColors2;
                            i13 = i8;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.ButtonKt$Button$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i17) {
                                ButtonKt.Button(str, function0, glanceModifier3, z4, textStyle3, buttonColors4, i13, str5, composer3, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    i8 = i;
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    int i162 = i4;
                    if ((i4 & 23967451) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    glanceModifier2 = glanceModifier4;
                    i11 = i8;
                    i12 = -1113587393;
                    TextStyle textStyle42 = textStyle2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ButtonElement(str3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i10 >> 21) & 14) | (i10 & 112), 0), glanceModifier2, z3, textStyle42, buttonColors3, i11, startRestartGroup, i10 & 4194190, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str5 = str4;
                    composer2 = startRestartGroup;
                    glanceModifier3 = glanceModifier2;
                    z4 = z3;
                    textStyle3 = textStyle42;
                    buttonColors4 = buttonColors3;
                    i13 = i11;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                textStyle2 = textStyle;
                if ((458752 & i2) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i;
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                int i1622 = i4;
                if ((i4 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                }
                if (i15 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                glanceModifier2 = glanceModifier4;
                i11 = i8;
                i12 = -1113587393;
                TextStyle textStyle422 = textStyle2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ButtonElement(str3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i10 >> 21) & 14) | (i10 & 112), 0), glanceModifier2, z3, textStyle422, buttonColors3, i11, startRestartGroup, i10 & 4194190, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                str5 = str4;
                composer2 = startRestartGroup;
                glanceModifier3 = glanceModifier2;
                z4 = z3;
                textStyle3 = textStyle422;
                buttonColors4 = buttonColors3;
                i13 = i11;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            textStyle2 = textStyle;
            if ((458752 & i2) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i;
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            int i16222 = i4;
            if ((i4 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
            }
            if (i15 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            glanceModifier2 = glanceModifier4;
            i11 = i8;
            i12 = -1113587393;
            TextStyle textStyle4222 = textStyle2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ButtonElement(str3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i10 >> 21) & 14) | (i10 & 112), 0), glanceModifier2, z3, textStyle4222, buttonColors3, i11, startRestartGroup, i10 & 4194190, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            str5 = str4;
            composer2 = startRestartGroup;
            glanceModifier3 = glanceModifier2;
            z4 = z3;
            textStyle3 = textStyle4222;
            buttonColors4 = buttonColors3;
            i13 = i11;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        textStyle2 = textStyle;
        if ((458752 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        int i162222 = i4;
        if ((i4 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) == 0) {
        }
        if (i15 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        glanceModifier2 = glanceModifier4;
        i11 = i8;
        i12 = -1113587393;
        TextStyle textStyle42222 = textStyle2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ButtonElement(str3, LambdaActionKt.action(str4, function0, startRestartGroup, ((i10 >> 21) & 14) | (i10 & 112), 0), glanceModifier2, z3, textStyle42222, buttonColors3, i11, startRestartGroup, i10 & 4194190, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        str5 = str4;
        composer2 = startRestartGroup;
        glanceModifier3 = glanceModifier2;
        z4 = z3;
        textStyle3 = textStyle42222;
        buttonColors4 = buttonColors3;
        i13 = i11;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
