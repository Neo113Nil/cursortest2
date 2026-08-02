package androidx.glance.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Text", "", "text", "", "modifier", "Landroidx/glance/GlanceModifier;", "style", "Landroidx/glance/text/TextStyle;", "maxLines", "", "(Ljava/lang/String;Landroidx/glance/GlanceModifier;Landroidx/glance/text/TextStyle;ILandroidx/compose/runtime/Composer;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/glance/text/TextKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,79:1\n34#2:80\n35#2:97\n251#3,8:81\n259#3,2:95\n3844#4,6:89\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/glance/text/TextKt\n*L\n45#1:80\n45#1:97\n45#1:81,8\n45#1:95,2\n51#1:89,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextKt {
    @Composable
    public static final void Text(final String str, GlanceModifier glanceModifier, TextStyle textStyle, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-192911377);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(glanceModifier) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(textStyle)) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i4 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    glanceModifier = GlanceModifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    textStyle = TextDefaults.INSTANCE.getDefaultTextStyle();
                }
                if (i6 != 0) {
                    i = Integer.MAX_VALUE;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-192911377, i2, -1, "androidx.glance.text.Text (Text.kt:38)");
            }
            TextKt$Text$1 textKt$Text$1 = TextKt$Text$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1115894518);
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(textKt$Text$1));
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, str, new Function2<EmittableText, String, Unit>() { // from class: androidx.glance.text.TextKt$Text$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableText emittableText, String str2) {
                    invoke2(emittableText, str2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableText emittableText, String str2) {
                    emittableText.setText(str2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, glanceModifier, new Function2<EmittableText, GlanceModifier, Unit>() { // from class: androidx.glance.text.TextKt$Text$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableText emittableText, GlanceModifier glanceModifier2) {
                    invoke2(emittableText, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableText emittableText, GlanceModifier glanceModifier2) {
                    emittableText.setModifier(glanceModifier2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, textStyle, new Function2<EmittableText, TextStyle, Unit>() { // from class: androidx.glance.text.TextKt$Text$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableText emittableText, TextStyle textStyle2) {
                    invoke2(emittableText, textStyle2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableText emittableText, TextStyle textStyle2) {
                    emittableText.setStyle(textStyle2);
                }
            });
            TextKt$Text$2$4 textKt$Text$2$4 = new Function2<EmittableText, Integer, Unit>() { // from class: androidx.glance.text.TextKt$Text$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableText emittableText, Integer num) {
                    invoke(emittableText, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(EmittableText emittableText, int i7) {
                    emittableText.setMaxLines(i7);
                }
            };
            if (m108constructorimpl.getInserting() || !Intrinsics.areEqual(m108constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                m108constructorimpl.updateRememberedValue(Integer.valueOf(i));
                m108constructorimpl.apply(Integer.valueOf(i), textKt$Text$2$4);
            }
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        final TextStyle textStyle2 = textStyle;
        final int i7 = i;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.text.TextKt$Text$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                TextKt.Text(str, glanceModifier2, textStyle2, i7, composer2, i2 | 1, i3);
            }
        });
    }
}
