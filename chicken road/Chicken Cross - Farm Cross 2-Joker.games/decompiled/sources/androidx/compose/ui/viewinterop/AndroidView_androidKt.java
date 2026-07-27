package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidView.android.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\u000e\"\"\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"NoOpUpdate", "Lkotlin/Function1;", "Landroid/view/View;", "", "Lkotlin/ExtensionFunctionType;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "AndroidView", "T", "factory", "Landroid/content/Context;", "modifier", "Landroidx/compose/ui/Modifier;", "update", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidView_androidKt {
    private static final Function1<View, Unit> NoOpUpdate = new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            Intrinsics.checkNotNullParameter(view, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends View> void AndroidView(final Function1<? super Context, ? extends T> factory, Modifier modifier, Function1<? super T, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Function1<? super T, Unit> function12;
        Object rememberedValue;
        Object rememberedValue2;
        final SaveableStateRegistry saveableStateRegistry;
        Object rememberedValue3;
        final Function1<? super T, Unit> function13;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Composer startRestartGroup = composer.startRestartGroup(-1783766393);
        ComposerKt.sourceInformation(startRestartGroup, "C(AndroidView)86@4146L7,89@4353L47,91@4503L37,98@5071L7,99@5126L7,100@5160L28,101@5240L7,102@5267L23,103@5333L40,109@5749L7,110@5820L7,112@5833L1313,140@7189L439:AndroidView.android.kt#z33iqn");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(factory) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changed(function12) ? 256 : 128;
                if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    Function1<? super T, Unit> function14 = i4 != 0 ? NoOpUpdate : function12;
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context = (Context) consume;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$noOpConnection$1$1
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt$AndroidView$noOpConnection$1$1 androidView_androidKt$AndroidView$noOpConnection$1$1 = (AndroidView_androidKt$AndroidView$noOpConnection$1$1) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new NestedScrollDispatcher();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    final NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) rememberedValue2;
                    Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, SemanticsModifierKt.semantics(modifier3.then(NestedScrollModifierKt.nestedScroll(Modifier.INSTANCE, androidView_androidKt$AndroidView$noOpConnection$1$1, nestedScrollDispatcher)), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }));
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density = (Density) consume2;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                    final CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                    ProvidableCompositionLocal<SaveableStateRegistry> localSaveableStateRegistry = SaveableStateRegistryKt.getLocalSaveableStateRegistry();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = startRestartGroup.consume(localSaveableStateRegistry);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    saveableStateRegistry = (SaveableStateRegistry) consume4;
                    final String valueOf = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0));
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Ref();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceableGroup();
                    final Ref ref = (Ref) rememberedValue3;
                    ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = startRestartGroup.consume(localLifecycleOwner);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) consume5;
                    ProvidableCompositionLocal<SavedStateRegistryOwner> localSavedStateRegistryOwner = AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume6 = startRestartGroup.consume(localSavedStateRegistryOwner);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) consume6;
                    final Function0<LayoutNode> function0 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final LayoutNode invoke() {
                            View typedView$ui_release;
                            ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context, rememberCompositionContext, nestedScrollDispatcher);
                            viewFactoryHolder.setFactory(factory);
                            SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                            Object consumeRestored = saveableStateRegistry2 != null ? saveableStateRegistry2.consumeRestored(valueOf) : null;
                            SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
                            if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                                typedView$ui_release.restoreHierarchyState(sparseArray);
                            }
                            ref.setValue(viewFactoryHolder);
                            return viewFactoryHolder.getLayoutNode();
                        }
                    };
                    startRestartGroup.startReplaceableGroup(1886828752);
                    ComposerKt.sourceInformation(startRestartGroup, "C(ComposeNode):Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            public final LayoutNode invoke() {
                                return Function0.this.invoke();
                            }
                        });
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
                    Updater.m1290setimpl(m1283constructorimpl, materialize, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier4) {
                            invoke2(layoutNode, modifier4);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutNode set, Modifier it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ((ViewFactoryHolder) value).setModifier(it);
                        }
                    });
                    Updater.m1290setimpl(m1283constructorimpl, density, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density2) {
                            invoke2(layoutNode, density2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutNode set, Density it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ((ViewFactoryHolder) value).setDensity(it);
                        }
                    });
                    Updater.m1290setimpl(m1283constructorimpl, lifecycleOwner, new Function2<LayoutNode, LifecycleOwner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner2) {
                            invoke2(layoutNode, lifecycleOwner2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutNode set, LifecycleOwner it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ((ViewFactoryHolder) value).setLifecycleOwner(it);
                        }
                    });
                    Updater.m1290setimpl(m1283constructorimpl, savedStateRegistryOwner, new Function2<LayoutNode, SavedStateRegistryOwner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner2) {
                            invoke2(layoutNode, savedStateRegistryOwner2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutNode set, SavedStateRegistryOwner it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ((ViewFactoryHolder) value).setSavedStateRegistryOwner(it);
                        }
                    });
                    Updater.m1290setimpl(m1283constructorimpl, function14, (Function2<? super T, ? super Function1<? super T, Unit>, Unit>) new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LayoutNode set, Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            ViewFactoryHolder<T> value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            value.setUpdateBlock(it);
                        }
                    });
                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                        /* compiled from: AndroidView.android.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[LayoutDirection.values().length];
                                iArr[LayoutDirection.Ltr.ordinal()] = 1;
                                iArr[LayoutDirection.Rtl.ordinal()] = 2;
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                            invoke2(layoutNode, layoutDirection2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutNode set, LayoutDirection it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) value;
                            int i6 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                            int i7 = 1;
                            if (i6 == 1) {
                                i7 = 0;
                            } else if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            viewFactoryHolder.setLayoutDirection(i7);
                        }
                    });
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    if (saveableStateRegistry != null) {
                        EffectsKt.DisposableEffect(saveableStateRegistry, valueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final Ref<ViewFactoryHolder<T>> ref2 = ref;
                                final SaveableStateRegistry.Entry registerProvider = SaveableStateRegistry.this.registerProvider(valueOf, new Function0<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final SparseArray<Parcelable> invoke() {
                                        SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                        Object value = ref2.getValue();
                                        Intrinsics.checkNotNull(value);
                                        View typedView$ui_release = ((ViewFactoryHolder) value).getTypedView$ui_release();
                                        if (typedView$ui_release != null) {
                                            typedView$ui_release.saveHierarchyState(sparseArray);
                                        }
                                        return sparseArray;
                                    }
                                });
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        SaveableStateRegistry.Entry.this.unregister();
                                    }
                                };
                            }
                        }, startRestartGroup, 8);
                    }
                    modifier2 = modifier3;
                    function13 = function14;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function13 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
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
                        AndroidView_androidKt.AndroidView(factory, modifier2, function13, composer2, i | 1, i2);
                    }
                });
                return;
            }
            function12 = function1;
            if ((i3 & 731) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context2 = (Context) consume7;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            AndroidView_androidKt$AndroidView$noOpConnection$1$1 androidView_androidKt$AndroidView$noOpConnection$1$12 = (AndroidView_androidKt$AndroidView$noOpConnection$1$1) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final NestedScrollDispatcher nestedScrollDispatcher2 = (NestedScrollDispatcher) rememberedValue2;
            Modifier materialize2 = ComposedModifierKt.materialize(startRestartGroup, SemanticsModifierKt.semantics(modifier3.then(NestedScrollModifierKt.nestedScroll(Modifier.INSTANCE, androidView_androidKt$AndroidView$noOpConnection$1$12, nestedScrollDispatcher2)), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }));
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume22;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume32;
            final CompositionContext rememberCompositionContext2 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            ProvidableCompositionLocal<SaveableStateRegistry> localSaveableStateRegistry2 = SaveableStateRegistryKt.getLocalSaveableStateRegistry();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(localSaveableStateRegistry2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            saveableStateRegistry = (SaveableStateRegistry) consume42;
            final String valueOf2 = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0));
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final Ref<ViewFactoryHolder<T>> ref2 = (Ref) rememberedValue3;
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner2 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume52 = startRestartGroup.consume(localLifecycleOwner2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) consume52;
            ProvidableCompositionLocal<SavedStateRegistryOwner> localSavedStateRegistryOwner2 = AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume62 = startRestartGroup.consume(localSavedStateRegistryOwner2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SavedStateRegistryOwner savedStateRegistryOwner2 = (SavedStateRegistryOwner) consume62;
            final Function0 function02 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final LayoutNode invoke() {
                    View typedView$ui_release;
                    ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context2, rememberCompositionContext2, nestedScrollDispatcher2);
                    viewFactoryHolder.setFactory(factory);
                    SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    Object consumeRestored = saveableStateRegistry2 != null ? saveableStateRegistry2.consumeRestored(valueOf2) : null;
                    SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
                    if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                        typedView$ui_release.restoreHierarchyState(sparseArray);
                    }
                    ref2.setValue(viewFactoryHolder);
                    return viewFactoryHolder.getLayoutNode();
                }
            };
            startRestartGroup.startReplaceableGroup(1886828752);
            ComposerKt.sourceInformation(startRestartGroup, "C(ComposeNode):Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
            }
            Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl2, materialize2, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier4) {
                    invoke2(layoutNode, modifier4);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode set, Modifier it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ((ViewFactoryHolder) value).setModifier(it);
                }
            });
            Updater.m1290setimpl(m1283constructorimpl2, density2, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density22) {
                    invoke2(layoutNode, density22);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode set, Density it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ((ViewFactoryHolder) value).setDensity(it);
                }
            });
            Updater.m1290setimpl(m1283constructorimpl2, lifecycleOwner2, new Function2<LayoutNode, LifecycleOwner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner22) {
                    invoke2(layoutNode, lifecycleOwner22);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode set, LifecycleOwner it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ((ViewFactoryHolder) value).setLifecycleOwner(it);
                }
            });
            Updater.m1290setimpl(m1283constructorimpl2, savedStateRegistryOwner2, new Function2<LayoutNode, SavedStateRegistryOwner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner22) {
                    invoke2(layoutNode, savedStateRegistryOwner22);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode set, SavedStateRegistryOwner it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ((ViewFactoryHolder) value).setSavedStateRegistryOwner(it);
                }
            });
            Updater.m1290setimpl(m1283constructorimpl2, function14, (Function2<? super T, ? super Function1<? super T, Unit>, Unit>) new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                    invoke(layoutNode, (Function1) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(LayoutNode set, Function1<? super T, Unit> it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ViewFactoryHolder<T> value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    value.setUpdateBlock(it);
                }
            });
            Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                /* compiled from: AndroidView.android.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[LayoutDirection.values().length];
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection22) {
                    invoke2(layoutNode, layoutDirection22);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode set, LayoutDirection it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) value;
                    int i6 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                    int i7 = 1;
                    if (i6 == 1) {
                        i7 = 0;
                    } else if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    viewFactoryHolder.setLayoutDirection(i7);
                }
            });
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (saveableStateRegistry != null) {
            }
            modifier2 = modifier3;
            function13 = function14;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((i3 & 731) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume72 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context22 = (Context) consume72;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        AndroidView_androidKt$AndroidView$noOpConnection$1$1 androidView_androidKt$AndroidView$noOpConnection$1$122 = (AndroidView_androidKt$AndroidView$noOpConnection$1$1) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final NestedScrollDispatcher nestedScrollDispatcher22 = (NestedScrollDispatcher) rememberedValue2;
        Modifier materialize22 = ComposedModifierKt.materialize(startRestartGroup, SemanticsModifierKt.semantics(modifier3.then(NestedScrollModifierKt.nestedScroll(Modifier.INSTANCE, androidView_androidKt$AndroidView$noOpConnection$1$122, nestedScrollDispatcher22)), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }));
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume222;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(localLayoutDirection22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection22 = (LayoutDirection) consume322;
        final CompositionContext rememberCompositionContext22 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        ProvidableCompositionLocal<SaveableStateRegistry> localSaveableStateRegistry22 = SaveableStateRegistryKt.getLocalSaveableStateRegistry();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(localSaveableStateRegistry22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        saveableStateRegistry = (SaveableStateRegistry) consume422;
        final String valueOf22 = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0));
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final Ref<ViewFactoryHolder<T>> ref22 = (Ref) rememberedValue3;
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner22 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume522 = startRestartGroup.consume(localLifecycleOwner22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LifecycleOwner lifecycleOwner22 = (LifecycleOwner) consume522;
        ProvidableCompositionLocal<SavedStateRegistryOwner> localSavedStateRegistryOwner22 = AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume622 = startRestartGroup.consume(localSavedStateRegistryOwner22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SavedStateRegistryOwner savedStateRegistryOwner22 = (SavedStateRegistryOwner) consume622;
        final Function0 function022 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutNode invoke() {
                View typedView$ui_release;
                ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context22, rememberCompositionContext22, nestedScrollDispatcher22);
                viewFactoryHolder.setFactory(factory);
                SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                Object consumeRestored = saveableStateRegistry2 != null ? saveableStateRegistry2.consumeRestored(valueOf22) : null;
                SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
                if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                    typedView$ui_release.restoreHierarchyState(sparseArray);
                }
                ref22.setValue(viewFactoryHolder);
                return viewFactoryHolder.getLayoutNode();
            }
        };
        startRestartGroup.startReplaceableGroup(1886828752);
        ComposerKt.sourceInformation(startRestartGroup, "C(ComposeNode):Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
        }
        Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl22, materialize22, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier4) {
                invoke2(layoutNode, modifier4);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode set, Modifier it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ((ViewFactoryHolder) value).setModifier(it);
            }
        });
        Updater.m1290setimpl(m1283constructorimpl22, density22, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density222) {
                invoke2(layoutNode, density222);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode set, Density it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ((ViewFactoryHolder) value).setDensity(it);
            }
        });
        Updater.m1290setimpl(m1283constructorimpl22, lifecycleOwner22, new Function2<LayoutNode, LifecycleOwner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner222) {
                invoke2(layoutNode, lifecycleOwner222);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode set, LifecycleOwner it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ((ViewFactoryHolder) value).setLifecycleOwner(it);
            }
        });
        Updater.m1290setimpl(m1283constructorimpl22, savedStateRegistryOwner22, new Function2<LayoutNode, SavedStateRegistryOwner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner222) {
                invoke2(layoutNode, savedStateRegistryOwner222);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode set, SavedStateRegistryOwner it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ((ViewFactoryHolder) value).setSavedStateRegistryOwner(it);
            }
        });
        Updater.m1290setimpl(m1283constructorimpl22, function14, (Function2<? super T, ? super Function1<? super T, Unit>, Unit>) new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                invoke(layoutNode, (Function1) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(LayoutNode set, Function1<? super T, Unit> it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                ViewFactoryHolder<T> value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                value.setUpdateBlock(it);
            }
        });
        Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

            /* compiled from: AndroidView.android.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    iArr[LayoutDirection.Ltr.ordinal()] = 1;
                    iArr[LayoutDirection.Rtl.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection222) {
                invoke2(layoutNode, layoutDirection222);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode set, LayoutDirection it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) value;
                int i6 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                int i7 = 1;
                if (i6 == 1) {
                    i7 = 0;
                } else if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewFactoryHolder.setLayoutDirection(i7);
            }
        });
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (saveableStateRegistry != null) {
        }
        modifier2 = modifier3;
        function13 = function14;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Function1<View, Unit> getNoOpUpdate() {
        return NoOpUpdate;
    }
}
