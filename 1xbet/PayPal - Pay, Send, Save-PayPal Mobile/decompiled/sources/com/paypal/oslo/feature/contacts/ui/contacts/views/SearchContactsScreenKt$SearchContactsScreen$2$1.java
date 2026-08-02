package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1", f = "SearchContactsScreen.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, nl = {154}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class SearchContactsScreenKt$SearchContactsScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.view.LifecycleOwner getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1$1", f = "SearchContactsScreen.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, nl = {153}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel getHighSpeedVideoSizes;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1$1$1", f = "SearchContactsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01211 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel Camera2StreamConfigurationMap;
            /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
            int getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect contactsEffect = (com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect) this.getHighSpeedVideoFpsRanges;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoFpsRangesFor != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (contactsEffect instanceof com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected) {
                    com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected contactSelected = (com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected) contactsEffect;
                    com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.createContactRecentSearch$default(contactsViewModel, contactSelected.getContact().getId(), null, 2, null);
                    contactsViewModel.processEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded(contactSelected.getContact()));
                    this.getHighSpeedVideoSizes.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked(contactSelected.getContact()));
                } else {
                    if (!(contactsEffect instanceof com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.RecentSearchSelected)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch = ((com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.RecentSearchSelected) contactsEffect).getRecentSearch();
                    if (recentSearch instanceof com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem) {
                        this.getHighSpeedVideoSizes.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked(((com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem) recentSearch).getContact()));
                    } else {
                        if (!(recentSearch instanceof com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged(((com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString) recentSearch).getValue()));
                    }
                }
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect contactsEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1.AnonymousClass1.C01211) create(contactsEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1.AnonymousClass1.C01211 c01211 = new com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1.AnonymousClass1.C01211(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
                c01211.getHighSpeedVideoFpsRanges = obj;
                return c01211;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01211(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1.AnonymousClass1.C01211> continuation) {
                super(2, continuation);
                this.Camera2StreamConfigurationMap = contactsViewModel;
                this.getHighSpeedVideoSizes = function1;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getEffect(), new com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1.AnonymousClass1.C01211(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = contactsViewModel;
            this.getHighSpeedVideoFpsRanges = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.getHighSpeedVideoFpsRangesFor, androidx.lifecycle.Lifecycle.State.STARTED, new com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SearchContactsScreenKt$SearchContactsScreen$2$1(androidx.view.LifecycleOwner lifecycleOwner, com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactsScreenKt$SearchContactsScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = lifecycleOwner;
        this.getHighSpeedVideoFpsRanges = contactsViewModel;
        this.Camera2StreamConfigurationMap = function1;
    }
}
