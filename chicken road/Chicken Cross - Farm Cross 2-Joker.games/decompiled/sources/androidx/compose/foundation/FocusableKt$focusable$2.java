package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.PinnableParent;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableKt$focusable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusableKt$focusable$2(MutableInteractionSource mutableInteractionSource, boolean z) {
        super(3);
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Modifier onPinnableParentAvailable;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1871352361);
        ComposerKt.sourceInformation(composer, "C73@3129L24,74@3183L58,75@3268L50,76@3340L34,77@3400L29,89@4173L37,90@4215L316,99@4536L390,114@5011L36:Focusable.kt#71ulvw");
        composer.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) rememberedValue3;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState3 = (MutableState) rememberedValue4;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new FocusRequester();
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        final FocusRequester focusRequester = (FocusRequester) rememberedValue5;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = BringIntoViewRequesterKt.BringIntoViewRequester();
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue6;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        final MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
        EffectsKt.DisposableEffect(mutableInteractionSource, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final MutableState<FocusInteraction.Focus> mutableState4 = mutableState;
                final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        FocusInteraction.Focus focus = (FocusInteraction.Focus) MutableState.this.getValue();
                        if (focus != null) {
                            FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                            if (mutableInteractionSource4 != null) {
                                mutableInteractionSource4.tryEmit(unfocus);
                            }
                            MutableState.this.setValue(null);
                        }
                    }
                };
            }
        }, composer, 0);
        Boolean valueOf = Boolean.valueOf(this.$enabled);
        final boolean z = this.$enabled;
        final MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
        EffectsKt.DisposableEffect(valueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (!z) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableInteractionSource3, null), 3, null);
                }
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }

            /* compiled from: Focusable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$focusedInteraction = mutableState;
                    this.$interactionSource = mutableInteractionSource;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    MutableState<FocusInteraction.Focus> mutableState;
                    MutableState<FocusInteraction.Focus> mutableState2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                        if (value != null) {
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            mutableState = this.$focusedInteraction;
                            FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                            if (mutableInteractionSource != null) {
                                this.L$0 = mutableState;
                                this.label = 1;
                                if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableState2 = mutableState;
                            }
                            mutableState.setValue(null);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState2 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableState = mutableState2;
                    mutableState.setValue(null);
                    return Unit.INSTANCE;
                }
            }
        }, composer, 0);
        if (this.$enabled) {
            if (m215invoke$lambda5(mutableState3)) {
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                Object rememberedValue7 = composer.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new FocusedBoundsModifier();
                    composer.updateRememberedValue(rememberedValue7);
                }
                composer.endReplaceableGroup();
                companion2 = (Modifier) rememberedValue7;
            } else {
                companion2 = Modifier.INSTANCE;
            }
            onPinnableParentAvailable = FocusableKt.onPinnableParentAvailable(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.setFocused(semantics, FocusableKt$focusable$2.m215invoke$lambda5(mutableState3));
                    final FocusRequester focusRequester2 = focusRequester;
                    final MutableState<Boolean> mutableState4 = mutableState3;
                    SemanticsPropertiesKt.requestFocus$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            FocusRequester.this.requestFocus();
                            return Boolean.valueOf(FocusableKt$focusable$2.m215invoke$lambda5(mutableState4));
                        }
                    }, 1, null);
                }
            }, 1, null), new Function1<PinnableParent, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PinnableParent pinnableParent) {
                    invoke2(pinnableParent);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PinnableParent pinnableParent) {
                    FocusableKt$focusable$2.m214invoke$lambda3(mutableState2, pinnableParent);
                }
            });
            Modifier then = FocusRequesterModifierKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(onPinnableParentAvailable, bringIntoViewRequester), focusRequester).then(companion2);
            final MutableInteractionSource mutableInteractionSource4 = this.$interactionSource;
            companion = FocusModifierKt.focusTarget(FocusChangedModifierKt.onFocusChanged(then, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                    invoke2(focusState);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(FocusState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    FocusableKt$focusable$2.m216invoke$lambda6(mutableState3, it.isFocused());
                    if (FocusableKt$focusable$2.m215invoke$lambda5(mutableState3)) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(bringIntoViewRequester, mutableState2, null), 1, null);
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass2(mutableState, mutableInteractionSource4, null), 3, null);
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass3(mutableState, mutableInteractionSource4, null), 3, null);
                    }
                }

                /* compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", i = {0}, l = {144}, m = "invokeSuspend", n = {"pinnedItemsHandle"}, s = {"L$0"})
                /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
                    final /* synthetic */ MutableState<PinnableParent> $pinnableParent$delegate;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BringIntoViewRequester bringIntoViewRequester, MutableState<PinnableParent> mutableState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$bringIntoViewRequester = bringIntoViewRequester;
                        this.$pinnableParent$delegate = mutableState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$bringIntoViewRequester, this.$pinnableParent$delegate, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        PinnableParent.PinnedItemsHandle pinnedItemsHandle;
                        Throwable th;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            try {
                                PinnableParent m213invoke$lambda2 = FocusableKt$focusable$2.m213invoke$lambda2(this.$pinnableParent$delegate);
                                PinnableParent.PinnedItemsHandle pinItems = m213invoke$lambda2 != null ? m213invoke$lambda2.pinItems() : null;
                                try {
                                    this.L$0 = pinItems;
                                    this.label = 1;
                                    if (BringIntoViewRequester.bringIntoView$default(this.$bringIntoViewRequester, null, this, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pinnedItemsHandle = pinItems;
                                } catch (Throwable th2) {
                                    th = th2;
                                    pinnedItemsHandle = pinItems;
                                    if (pinnedItemsHandle != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                pinnedItemsHandle = null;
                                th = th3;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            pinnedItemsHandle = (PinnableParent.PinnedItemsHandle) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (Throwable th4) {
                                th = th4;
                                if (pinnedItemsHandle != null) {
                                    pinnedItemsHandle.unpin();
                                }
                                throw th;
                            }
                        }
                        if (pinnedItemsHandle != null) {
                            pinnedItemsHandle.unpin();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", i = {1}, l = {152, 156}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$focusedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.$focusedInteraction, this.$interactionSource, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        MutableState<FocusInteraction.Focus> mutableState;
                        MutableState<FocusInteraction.Focus> mutableState2;
                        FocusInteraction.Focus focus;
                        MutableInteractionSource mutableInteractionSource;
                        FocusInteraction.Focus focus2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                            if (value != null) {
                                MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                                mutableState = this.$focusedInteraction;
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                if (mutableInteractionSource2 != null) {
                                    this.L$0 = mutableState;
                                    this.label = 1;
                                    if (mutableInteractionSource2.emit(unfocus, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutableState2 = mutableState;
                                }
                                mutableState.setValue(null);
                            }
                            focus = new FocusInteraction.Focus();
                            mutableInteractionSource = this.$interactionSource;
                            if (mutableInteractionSource != null) {
                                this.L$0 = focus;
                                this.label = 2;
                                if (mutableInteractionSource.emit(focus, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                focus2 = focus;
                                focus = focus2;
                            }
                            this.$focusedInteraction.setValue(focus);
                            return Unit.INSTANCE;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                focus2 = (FocusInteraction.Focus) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                focus = focus2;
                                this.$focusedInteraction.setValue(focus);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableState2 = (MutableState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutableState = mutableState2;
                        mutableState.setValue(null);
                        focus = new FocusInteraction.Focus();
                        mutableInteractionSource = this.$interactionSource;
                        if (mutableInteractionSource != null) {
                        }
                        this.$focusedInteraction.setValue(focus);
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$3", f = "Focusable.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$3, reason: invalid class name */
                static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.$focusedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass3(this.$focusedInteraction, this.$interactionSource, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        MutableState<FocusInteraction.Focus> mutableState;
                        MutableState<FocusInteraction.Focus> mutableState2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                            if (value != null) {
                                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                mutableState = this.$focusedInteraction;
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                if (mutableInteractionSource != null) {
                                    this.L$0 = mutableState;
                                    this.label = 1;
                                    if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutableState2 = mutableState;
                                }
                                mutableState.setValue(null);
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableState2 = (MutableState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutableState = mutableState2;
                        mutableState.setValue(null);
                        return Unit.INSTANCE;
                    }
                }
            }));
        } else {
            companion = Modifier.INSTANCE;
        }
        composer.endReplaceableGroup();
        return companion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2, reason: not valid java name */
    public static final PinnableParent m213invoke$lambda2(MutableState<PinnableParent> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-5, reason: not valid java name */
    public static final boolean m215invoke$lambda5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-6, reason: not valid java name */
    public static final void m216invoke$lambda6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-3, reason: not valid java name */
    public static final void m214invoke$lambda3(MutableState<PinnableParent> mutableState, PinnableParent pinnableParent) {
        mutableState.setValue(pinnableParent);
    }
}
