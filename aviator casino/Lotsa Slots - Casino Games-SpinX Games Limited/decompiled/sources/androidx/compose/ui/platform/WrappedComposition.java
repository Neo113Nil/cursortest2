package androidx.compose.ui.platform;

/* compiled from: Wrapper.android.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u0012H\u0016J#\u0010\u001a\u001a\u0004\u0018\u0001H\u001b\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010$\u001a\u00020\u00122\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0002\u0010&R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u001b\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/compose/runtime/CompositionServices;", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "original", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/Composition;)V", "addedToLifecycle", "Landroidx/lifecycle/Lifecycle;", "disposed", "", "hasInvalidations", "getHasInvalidations", "()Z", "isDisposed", "lastContent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "getOriginal", "()Landroidx/compose/runtime/Composition;", "getOwner", "()Landroidx/compose/ui/platform/AndroidComposeView;", "dispose", "getCompositionService", "T", com.ironsource.X3.i.W, "Landroidx/compose/runtime/CompositionServiceKey;", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "setContent", "content", "(Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrappedComposition implements androidx.compose.runtime.Composition, androidx.lifecycle.LifecycleEventObserver, androidx.compose.runtime.CompositionServices {
    private androidx.lifecycle.Lifecycle addedToLifecycle;
    private boolean disposed;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lastContent = androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.INSTANCE.m3717getLambda1$ui_release();
    private final androidx.compose.runtime.Composition original;
    private final androidx.compose.ui.platform.AndroidComposeView owner;

    public WrappedComposition(androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.runtime.Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }

    public final androidx.compose.ui.platform.AndroidComposeView getOwner() {
        return this.owner;
    }

    public final androidx.compose.runtime.Composition getOriginal() {
        return this.original;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        this.owner.setOnViewTreeOwnersAvailable(new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners, kotlin.Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                invoke2(viewTreeOwners);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                boolean z;
                androidx.lifecycle.Lifecycle lifecycle;
                z = androidx.compose.ui.platform.WrappedComposition.this.disposed;
                if (z) {
                    return;
                }
                androidx.lifecycle.Lifecycle lifecycle2 = viewTreeOwners.getLifecycleOwner().getLifecycle();
                androidx.compose.ui.platform.WrappedComposition.this.lastContent = content;
                lifecycle = androidx.compose.ui.platform.WrappedComposition.this.addedToLifecycle;
                if (lifecycle == null) {
                    androidx.compose.ui.platform.WrappedComposition.this.addedToLifecycle = lifecycle2;
                    lifecycle2.addObserver(androidx.compose.ui.platform.WrappedComposition.this);
                } else if (lifecycle2.getState().isAtLeast(androidx.lifecycle.Lifecycle.State.CREATED)) {
                    androidx.compose.runtime.Composition original = androidx.compose.ui.platform.WrappedComposition.this.getOriginal();
                    final androidx.compose.ui.platform.WrappedComposition wrappedComposition = androidx.compose.ui.platform.WrappedComposition.this;
                    final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                    original.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                            invoke(composer, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C135@5473L56,137@5555L176:Wrapper.android.kt#itgzvw");
                            if ((i & 11) != 2 || !composer.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
                                }
                                java.lang.Object tag = androidx.compose.ui.platform.WrappedComposition.this.getOwner().getTag(androidx.compose.ui.R.id.inspection_slot_table_set);
                                java.util.Set<androidx.compose.runtime.tooling.CompositionData> set = kotlin.jvm.internal.TypeIntrinsics.isMutableSet(tag) ? (java.util.Set) tag : null;
                                if (set == null) {
                                    java.lang.Object parent = androidx.compose.ui.platform.WrappedComposition.this.getOwner().getParent();
                                    android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                                    java.lang.Object tag2 = view != null ? view.getTag(androidx.compose.ui.R.id.inspection_slot_table_set) : null;
                                    set = kotlin.jvm.internal.TypeIntrinsics.isMutableSet(tag2) ? (java.util.Set) tag2 : null;
                                }
                                if (set != null) {
                                    set.add(composer.getCompositionData());
                                    composer.collectParameterInformation();
                                }
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(androidx.compose.ui.platform.WrappedComposition.this.getOwner(), new androidx.compose.ui.platform.WrappedComposition$setContent$1.AnonymousClass1.C00571(androidx.compose.ui.platform.WrappedComposition.this, null), composer, 72);
                                androidx.compose.runtime.ProvidedValue<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> provides = androidx.compose.runtime.tooling.InspectionTablesKt.getLocalInspectionTables().provides(set);
                                final androidx.compose.ui.platform.WrappedComposition wrappedComposition2 = androidx.compose.ui.platform.WrappedComposition.this;
                                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = function2;
                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(provides, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -1193460702, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                        invoke(composer2, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C138@5658L47:Wrapper.android.kt#itgzvw");
                                        if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(-1193460702, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:138)");
                                        }
                                        androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(androidx.compose.ui.platform.WrappedComposition.this.getOwner(), function22, composer2, 8);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer, 56);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }

                        /* compiled from: Wrapper.android.kt */
                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C00571 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                            int label;
                            final /* synthetic */ androidx.compose.ui.platform.WrappedComposition this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00571(androidx.compose.ui.platform.WrappedComposition wrappedComposition, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.WrappedComposition$setContent$1.AnonymousClass1.C00571> continuation) {
                                super(2, continuation);
                                this.this$0 = wrappedComposition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                return new androidx.compose.ui.platform.WrappedComposition$setContent$1.AnonymousClass1.C00571(this.this$0, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                return ((androidx.compose.ui.platform.WrappedComposition$setContent$1.AnonymousClass1.C00571) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.this$0.getOwner().boundsUpdatesEventLoop(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    }));
                }
            }
        });
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(androidx.compose.ui.R.id.wrapped_composition_tag, null);
            androidx.lifecycle.Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    @Override // androidx.compose.runtime.Composition
    /* renamed from: isDisposed */
    public boolean getDisposed() {
        return this.original.getDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != androidx.lifecycle.Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(androidx.compose.runtime.CompositionServiceKey<T> key) {
        androidx.compose.runtime.Composition composition = this.original;
        androidx.compose.runtime.CompositionServices compositionServices = composition instanceof androidx.compose.runtime.CompositionServices ? (androidx.compose.runtime.CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(key);
        }
        return null;
    }
}
