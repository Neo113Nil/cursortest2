package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectionContainer.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\t\u001aJ\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"DisableSelection", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionContainer", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "onSelectionChange", "Lkotlin/Function1;", "children", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/Selection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionContainerKt {
    public static final void SelectionContainer(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1075498320);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectionContainer)P(1)42@1741L45,46@1899L38,43@1791L180:SelectionContainer.kt#eksfi3");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) rememberedValue;
            Selection m798SelectionContainer$lambda1 = m798SelectionContainer$lambda1(mutableState);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
                        invoke2(selection);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Selection selection) {
                        mutableState.setValue(selection);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            SelectionContainer(modifier, m798SelectionContainer$lambda1, (Function1) rememberedValue2, content, startRestartGroup, (i3 & 14) | ((i3 << 6) & 7168), 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$2
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

            public final void invoke(Composer composer2, int i5) {
                SelectionContainerKt.SelectionContainer(Modifier.this, content, composer2, i | 1, i2);
            }
        });
    }

    /* renamed from: SelectionContainer$lambda-1, reason: not valid java name */
    private static final Selection m798SelectionContainer$lambda1(MutableState<Selection> mutableState) {
        return mutableState.getValue();
    }

    public static final void DisableSelection(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(336063542);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisableSelection)61@2266L104:SelectionContainer.kt#eksfi3");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null)}, content, startRestartGroup, ((i2 << 3) & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$DisableSelection$1
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

            public final void invoke(Composer composer2, int i3) {
                SelectionContainerKt.DisableSelection(content, composer2, i | 1);
            }
        });
    }

    public static final void SelectionContainer(Modifier modifier, final Selection selection, final Function1<? super Selection, Unit> onSelectionChange, final Function2<? super Composer, ? super Integer, Unit> children, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(onSelectionChange, "onSelectionChange");
        Intrinsics.checkNotNullParameter(children, "children");
        Composer startRestartGroup = composer.startRestartGroup(2078139907);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectionContainer)P(1,3,2)84@2971L37,85@3027L44,87@3122L7,88@3183L7,89@3234L7,94@3369L1952,137@5327L106:SelectionContainer.kt#eksfi3");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(selection) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(onSelectionChange) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(children) ? 2048 : 1024;
        }
        final int i5 = i3;
        if ((i5 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SelectionRegistrarImpl();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new SelectionManager(selectionRegistrarImpl);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            final SelectionManager selectionManager = (SelectionManager) rememberedValue2;
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localHapticFeedback);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionManager.setHapticFeedBack((HapticFeedback) consume);
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localClipboardManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionManager.setClipboardManager((ClipboardManager) consume2);
            ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localTextToolbar);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionManager.setTextToolbar((TextToolbar) consume3);
            selectionManager.setOnSelectionChange(onSelectionChange);
            selectionManager.setSelection(selection);
            selectionManager.setTouchMode(TouchMode_androidKt.isInTouchMode());
            final Modifier modifier3 = companion;
            ContextMenu_androidKt.ContextMenuArea(selectionManager, ComposableLambdaKt.composableLambda(startRestartGroup, -123806316, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3
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

                public final void invoke(Composer composer2, int i6) {
                    ComposerKt.sourceInformation(composer2, "C95@3404L1911:SelectionContainer.kt#eksfi3");
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        ProvidedValue[] providedValueArr = {SelectionRegistrarKt.getLocalSelectionRegistrar().provides(SelectionRegistrarImpl.this)};
                        final Modifier modifier4 = modifier3;
                        final SelectionManager selectionManager2 = selectionManager;
                        final Function2<Composer, Integer, Unit> function2 = children;
                        final int i7 = i5;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 935424596, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                ComposerKt.sourceInformation(composer3, "C98@3628L1677:SelectionContainer.kt#eksfi3");
                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier then = Modifier.this.then(selectionManager2.getModifier());
                                    final Function2<Composer, Integer, Unit> function22 = function2;
                                    final int i9 = i7;
                                    final SelectionManager selectionManager3 = selectionManager2;
                                    SimpleLayoutKt.SimpleLayout(then, ComposableLambdaKt.composableLambda(composer3, 1375295262, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.3.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i10) {
                                            Selection selection2;
                                            Offset m833getEndHandlePosition_m7T9E;
                                            ResolvedTextDirection direction;
                                            ComposerKt.sourceInformation(composer4, "C99@3703L10,*103@3934L129,119@4631L564:SelectionContainer.kt#eksfi3");
                                            if ((i10 & 11) != 2 || !composer4.getSkipping()) {
                                                function22.invoke(composer4, Integer.valueOf((i9 >> 9) & 14));
                                                if (TouchMode_androidKt.isInTouchMode() && selectionManager3.getHasFocus() && (selection2 = selectionManager3.getSelection()) != null) {
                                                    SelectionManager selectionManager4 = selectionManager3;
                                                    List listOf = CollectionsKt.listOf((Object[]) new Boolean[]{true, false});
                                                    int size = listOf.size();
                                                    for (int i11 = 0; i11 < size; i11++) {
                                                        boolean booleanValue = ((Boolean) listOf.get(i11)).booleanValue();
                                                        Boolean valueOf = Boolean.valueOf(booleanValue);
                                                        composer4.startReplaceableGroup(1157296644);
                                                        ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                                        boolean changed = composer4.changed(valueOf);
                                                        Object rememberedValue3 = composer4.rememberedValue();
                                                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = selectionManager4.handleDragObserver(booleanValue);
                                                            composer4.updateRememberedValue(rememberedValue3);
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        TextDragObserver textDragObserver = (TextDragObserver) rememberedValue3;
                                                        if (booleanValue) {
                                                            m833getEndHandlePosition_m7T9E = selectionManager4.m834getStartHandlePosition_m7T9E();
                                                        } else {
                                                            m833getEndHandlePosition_m7T9E = selectionManager4.m833getEndHandlePosition_m7T9E();
                                                        }
                                                        if (booleanValue) {
                                                            direction = selection2.getStart().getDirection();
                                                        } else {
                                                            direction = selection2.getEnd().getDirection();
                                                        }
                                                        if (m833getEndHandlePosition_m7T9E != null) {
                                                            AndroidSelectionHandles_androidKt.m778SelectionHandle8fL75g(m833getEndHandlePosition_m7T9E.getPackedValue(), booleanValue, direction, selection2.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(textDragObserver, null)), null, composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 48, 0);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 56);
            EffectsKt.DisposableEffect(selectionManager, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final SelectionManager selectionManager2 = SelectionManager.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            SelectionManager.this.hideSelectionToolbar$foundation_release();
                        }
                    };
                }
            }, startRestartGroup, 8);
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5
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

            public final void invoke(Composer composer2, int i6) {
                SelectionContainerKt.SelectionContainer(Modifier.this, selection, onSelectionChange, children, composer2, i | 1, i2);
            }
        });
    }
}
