package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006e  */
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m682BasicTextBpD7jsM(final String text, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1<? super TextLayoutResult, Unit> function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        SelectionRegistrar selectionRegistrar;
        Modifier modifier3;
        SelectionRegistrar selectionRegistrar2;
        int i14;
        boolean z3;
        Function1<? super TextLayoutResult, Unit> function13;
        String str;
        final boolean z4;
        final int i15;
        final Modifier modifier4;
        final int i16;
        final Function1<? super TextLayoutResult, Unit> function14;
        final TextStyle textStyle3;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(1022429478);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)73@3673L7,74@3712L7,75@3773L7,88@4485L193,92@4701L473,129@5872L69:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i17 = i4 & 2;
        if (i17 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changed(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((57344 & i3) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((458752 & i3) == 0) {
                            z2 = z;
                            i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i11 = i4 & 64;
                            if (i11 == 0) {
                                i5 |= 1572864;
                            } else if ((3670016 & i3) == 0) {
                                i12 = i2;
                                i5 |= startRestartGroup.changed(i12) ? 1048576 : 524288;
                                if ((i5 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                                    Modifier modifier5 = i17 != 0 ? Modifier.INSTANCE : modifier;
                                    TextStyle textStyle4 = i6 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                                    if (i7 != 0) {
                                        function12 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                    }
                                    if (i8 != 0) {
                                        i9 = TextOverflow.INSTANCE.m3781getClipgIe3tQ8();
                                    }
                                    if (i10 != 0) {
                                        z2 = true;
                                    }
                                    i13 = i11 != 0 ? Integer.MAX_VALUE : i12;
                                    if (i13 <= 0) {
                                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                                    }
                                    ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localSelectionRegistrar);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final SelectionRegistrar selectionRegistrar3 = (SelectionRegistrar) consume;
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Density density = (Density) consume2;
                                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    FontFamily.Resolver resolver = (FontFamily.Resolver) consume3;
                                    long longValue = ((Number) RememberSaveableKt.m1296rememberSaveable(new Object[]{text, selectionRegistrar3}, (Saver) selectionIdSaver(selectionRegistrar3), (String) null, (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Long invoke() {
                                            SelectionRegistrar selectionRegistrar4 = SelectionRegistrar.this;
                                            return Long.valueOf(selectionRegistrar4 != null ? selectionRegistrar4.nextSelectableId() : 0L);
                                        }
                                    }, startRestartGroup, 72, 4)).longValue();
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        modifier2 = modifier5;
                                        selectionRegistrar = selectionRegistrar3;
                                        TextController textController = new TextController(new TextState(new TextDelegate(new AnnotatedString(text, null, null, 6, null), textStyle4, i13, z2, i9, density, resolver, null, 128, null), longValue));
                                        startRestartGroup.updateRememberedValue(textController);
                                        rememberedValue = textController;
                                    } else {
                                        modifier2 = modifier5;
                                        selectionRegistrar = selectionRegistrar3;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TextController textController2 = (TextController) rememberedValue;
                                    TextState state = textController2.getState();
                                    if (!startRestartGroup.getInserting()) {
                                        selectionRegistrar2 = selectionRegistrar;
                                        modifier3 = modifier2;
                                        boolean z5 = z2;
                                        z3 = z2;
                                        function13 = function12;
                                        int i18 = i9;
                                        i14 = i9;
                                        str = "C:CompositionLocal.kt#9igjgp";
                                        textController2.setTextDelegate(CoreTextKt.m693updateTextDelegatey0kMQk(state.getTextDelegate(), text, textStyle4, density, resolver, z5, i18, i13));
                                    } else {
                                        modifier3 = modifier2;
                                        selectionRegistrar2 = selectionRegistrar;
                                        i14 = i9;
                                        z3 = z2;
                                        function13 = function12;
                                        str = "C:CompositionLocal.kt#9igjgp";
                                    }
                                    state.setOnTextLayout(function13);
                                    textController2.update(selectionRegistrar2);
                                    startRestartGroup.startReplaceableGroup(959239573);
                                    ComposerKt.sourceInformation(startRestartGroup, "126@5837L7");
                                    if (selectionRegistrar2 != null) {
                                        ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                                        Object consume4 = startRestartGroup.consume(localTextSelectionColors);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        state.m776setSelectionBackgroundColor8_81llA(((TextSelectionColors) consume4).getBackgroundColor());
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    Modifier then = modifier3.then(textController2.getModifiers());
                                    MeasurePolicy measurePolicy = textController2.getMeasurePolicy();
                                    startRestartGroup.startReplaceableGroup(544976794);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(1)120@4597L7,121@4652L7,122@4711L7,124@4784L439:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                                    Object consume5 = startRestartGroup.consume(localDensity2);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Density density2 = (Density) consume5;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                                    Object consume6 = startRestartGroup.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume6;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                                    Object consume7 = startRestartGroup.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume7;
                                    Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, then);
                                    final Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    startRestartGroup.startReplaceableGroup(1405779621);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(ReusableComposeNode):Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final ComposeUiNode invoke() {
                                                return Function0.this.invoke();
                                            }
                                        });
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    startRestartGroup.disableReusing();
                                    Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
                                    Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1290setimpl(m1283constructorimpl, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    Updater.m1290setimpl(m1283constructorimpl, materialize, ComposeUiNode.INSTANCE.getSetModifier());
                                    startRestartGroup.enableReusing();
                                    startRestartGroup.endNode();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    z4 = z3;
                                    i15 = i14;
                                    modifier4 = modifier3;
                                    i16 = i13;
                                    function14 = function13;
                                    textStyle3 = textStyle4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier4 = modifier;
                                    textStyle3 = textStyle2;
                                    function14 = function12;
                                    i15 = i9;
                                    z4 = z2;
                                    i16 = i12;
                                }
                                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i19) {
                                        BasicTextKt.m682BasicTextBpD7jsM(text, modifier4, textStyle3, function14, i15, z4, i16, composer2, i3 | 1, i4);
                                    }
                                });
                                return;
                            }
                            i12 = i2;
                            if ((i5 & 2995931) == 599186) {
                            }
                            if (i17 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i13 <= 0) {
                            }
                        }
                        z2 = z;
                        i11 = i4 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i2;
                        if ((i5 & 2995931) == 599186) {
                        }
                        if (i17 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i13 <= 0) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i4 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i2;
                    if ((i5 & 2995931) == 599186) {
                    }
                    if (i17 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 <= 0) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                i12 = i2;
                if ((i5 & 2995931) == 599186) {
                }
                if (i17 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 <= 0) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            i12 = i2;
            if ((i5 & 2995931) == 599186) {
            }
            if (i17 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 <= 0) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        i12 = i2;
        if ((i5 & 2995931) == 599186) {
        }
        if (i17 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 <= 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cd  */
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m681BasicText4YKlhWE(final AnnotatedString text, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, Map<String, InlineTextContent> map, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        Function1<? super TextLayoutResult, Unit> function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        Function1<? super TextLayoutResult, Unit> function13;
        boolean z3;
        Map<String, InlineTextContent> map2;
        int i15;
        TextStyle textStyle2;
        List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> list;
        long j;
        SelectionRegistrar selectionRegistrar;
        String str;
        int i16;
        Map<String, InlineTextContent> map3;
        Function1<? super TextLayoutResult, Unit> function14;
        Modifier modifier3;
        ComposableLambda composableLambda;
        final Modifier modifier4;
        final Function1<? super TextLayoutResult, Unit> function15;
        final TextStyle textStyle3;
        final int i17;
        final boolean z4;
        final int i18;
        final Map<String, InlineTextContent> map4;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-648605928);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)169@8152L7,170@8191L7,171@8252L7,172@8320L7,187@9135L193,191@9351L504,229@10527L270:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i19 = i4 & 2;
        if (i19 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                i5 |= startRestartGroup.changed(textStyle) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changed(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((57344 & i3) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((458752 & i3) == 0) {
                            z2 = z;
                            i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i11 = i4 & 64;
                            if (i11 == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 3670016) == 0) {
                                i5 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i12 = i4 & 128;
                            if (i12 != 0) {
                                i5 |= 4194304;
                            }
                            if (i12 == 128 || (23967451 & i5) != 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i19 == 0 ? Modifier.INSTANCE : modifier;
                                    TextStyle textStyle4 = i6 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                    if (i7 != 0) {
                                        function12 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                    }
                                    int m3781getClipgIe3tQ8 = i8 == 0 ? TextOverflow.INSTANCE.m3781getClipgIe3tQ8() : i;
                                    if (i10 != 0) {
                                        z2 = true;
                                    }
                                    int i20 = i11 == 0 ? Integer.MAX_VALUE : i2;
                                    if (i12 == 0) {
                                        modifier2 = companion;
                                        i13 = m3781getClipgIe3tQ8;
                                        i14 = i20;
                                        function13 = function12;
                                        z3 = z2;
                                        i15 = i5 & (-29360129);
                                        map2 = MapsKt.emptyMap();
                                    } else {
                                        modifier2 = companion;
                                        i13 = m3781getClipgIe3tQ8;
                                        i14 = i20;
                                        function13 = function12;
                                        z3 = z2;
                                        map2 = map;
                                        i15 = i5;
                                    }
                                    textStyle2 = textStyle4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if (i12 != 0) {
                                        i5 &= -29360129;
                                    }
                                    modifier2 = modifier;
                                    i13 = i;
                                    i14 = i2;
                                    i15 = i5;
                                    function13 = function12;
                                    z3 = z2;
                                    textStyle2 = textStyle;
                                    map2 = map;
                                }
                                startRestartGroup.endDefaults();
                                if (i14 > 0) {
                                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                                }
                                ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localSelectionRegistrar);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final SelectionRegistrar selectionRegistrar2 = (SelectionRegistrar) consume;
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Density density = (Density) consume2;
                                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                FontFamily.Resolver resolver = (FontFamily.Resolver) consume3;
                                ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = startRestartGroup.consume(localTextSelectionColors);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long backgroundColor = ((TextSelectionColors) consume4).getBackgroundColor();
                                Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> resolveInlineContent = CoreTextKt.resolveInlineContent(text, map2);
                                List<AnnotatedString.Range<Placeholder>> component1 = resolveInlineContent.component1();
                                List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> component2 = resolveInlineContent.component2();
                                long longValue = ((Number) RememberSaveableKt.m1296rememberSaveable(new Object[]{text, selectionRegistrar2}, (Saver) selectionIdSaver(selectionRegistrar2), (String) null, (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Long invoke() {
                                        SelectionRegistrar selectionRegistrar3 = SelectionRegistrar.this;
                                        return Long.valueOf(selectionRegistrar3 != null ? selectionRegistrar3.nextSelectableId() : 0L);
                                    }
                                }, startRestartGroup, 72, 4)).longValue();
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    list = component2;
                                    j = backgroundColor;
                                    selectionRegistrar = selectionRegistrar2;
                                    str = "C:CompositionLocal.kt#9igjgp";
                                    i16 = i15;
                                    map3 = map2;
                                    function14 = function13;
                                    modifier3 = modifier2;
                                    TextController textController = new TextController(new TextState(new TextDelegate(text, textStyle2, i14, z3, i13, density, resolver, component1, null), longValue));
                                    startRestartGroup.updateRememberedValue(textController);
                                    rememberedValue = textController;
                                } else {
                                    list = component2;
                                    j = backgroundColor;
                                    selectionRegistrar = selectionRegistrar2;
                                    str = "C:CompositionLocal.kt#9igjgp";
                                    i16 = i15;
                                    map3 = map2;
                                    function14 = function13;
                                    modifier3 = modifier2;
                                }
                                startRestartGroup.endReplaceableGroup();
                                TextController textController2 = (TextController) rememberedValue;
                                TextState state = textController2.getState();
                                if (!startRestartGroup.getInserting()) {
                                    textController2.setTextDelegate(CoreTextKt.m691updateTextDelegatex_uQXYA(state.getTextDelegate(), text, textStyle2, density, resolver, z3, i13, i14, component1));
                                }
                                Function1<? super TextLayoutResult, Unit> function16 = function14;
                                state.setOnTextLayout(function16);
                                state.m776setSelectionBackgroundColor8_81llA(j);
                                textController2.update(selectionRegistrar);
                                if (list.isEmpty()) {
                                    composableLambda = ComposableSingletons$BasicTextKt.INSTANCE.m687getLambda1$foundation_release();
                                } else {
                                    final List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> list2 = list;
                                    final int i21 = i16;
                                    composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1892283635, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i22) {
                                            ComposerKt.sourceInformation(composer2, "C233@10634L39:BasicText.kt#423gt5");
                                            if ((i22 & 11) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                            } else {
                                                CoreTextKt.InlineChildren(AnnotatedString.this, list2, composer2, (i21 & 14) | 64);
                                            }
                                        }
                                    });
                                }
                                Modifier modifier5 = modifier3;
                                Modifier then = modifier5.then(textController2.getModifiers());
                                MeasurePolicy measurePolicy = textController2.getMeasurePolicy();
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                String str2 = str;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str2);
                                Object consume5 = startRestartGroup.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Density density2 = (Density) consume5;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str2);
                                Object consume6 = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                LayoutDirection layoutDirection = (LayoutDirection) consume6;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str2);
                                Object consume7 = startRestartGroup.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume7;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                startRestartGroup.disableReusing();
                                Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
                                Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1290setimpl(m1283constructorimpl, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                startRestartGroup.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                composableLambda.invoke(startRestartGroup, 0);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                modifier4 = modifier5;
                                function15 = function16;
                                textStyle3 = textStyle2;
                                i17 = i13;
                                z4 = z3;
                                i18 = i14;
                                map4 = map3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier4 = modifier;
                                textStyle3 = textStyle;
                                map4 = map;
                                function15 = function12;
                                i17 = i9;
                                z4 = z2;
                                i18 = i2;
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i22) {
                                    BasicTextKt.m681BasicText4YKlhWE(AnnotatedString.this, modifier4, textStyle3, function15, i17, z4, i18, map4, composer2, i3 | 1, i4);
                                }
                            });
                            return;
                        }
                        z2 = z;
                        i11 = i4 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i4 & 128;
                        if (i12 != 0) {
                        }
                        if (i12 == 128) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        textStyle2 = textStyle4;
                        startRestartGroup.endDefaults();
                        if (i14 > 0) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i4 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                    }
                    if (i12 == 128) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    textStyle2 = textStyle4;
                    startRestartGroup.endDefaults();
                    if (i14 > 0) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                }
                if (i12 == 128) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i19 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                textStyle2 = textStyle4;
                startRestartGroup.endDefaults();
                if (i14 > 0) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            i12 = i4 & 128;
            if (i12 != 0) {
            }
            if (i12 == 128) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i19 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i10 != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            textStyle2 = textStyle4;
            startRestartGroup.endDefaults();
            if (i14 > 0) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        i12 = i4 & 128;
        if (i12 != 0) {
        }
        if (i12 == 128) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i19 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i10 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        textStyle2 = textStyle4;
        startRestartGroup.endDefaults();
        if (i14 > 0) {
        }
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l) {
                return invoke(saverScope, l.longValue());
            }

            public final Long invoke(SaverScope Saver, long j) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                if (SelectionRegistrarKt.hasSelection(SelectionRegistrar.this, j)) {
                    return Long.valueOf(j);
                }
                return null;
            }
        }, new Function1<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l) {
                return invoke(l.longValue());
            }

            public final Long invoke(long j) {
                return Long.valueOf(j);
            }
        });
    }
}
