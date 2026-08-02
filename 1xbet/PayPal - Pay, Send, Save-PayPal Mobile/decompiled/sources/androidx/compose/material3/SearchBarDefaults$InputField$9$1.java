package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1", f = "SearchBar.kt", i = {}, l = {1442}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SearchBarDefaults$InputField$9$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.SearchBarState getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!androidx.compose.material3.SearchBarKt.access$isExpanded(this.getHighSpeedVideoFpsRanges)) {
                kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                intRef.element = this.getHighSpeedVideoFpsRangesFor.getText().length();
                final androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighSpeedVideoFpsRangesFor;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (kotlinx.coroutines.flow.FlowKt.onEach(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$9$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        java.lang.CharSequence text;
                        text = androidx.compose.foundation.text.input.TextFieldState.this.getText();
                        return text;
                    }
                }), new androidx.compose.material3.SearchBarDefaults$InputField$9$1.AnonymousClass2(intRef, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$9$1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1$2", f = "SearchBar.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.SearchBarDefaults$InputField$9$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.CharSequence, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.material3.SearchBarState Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef getHighSpeedVideoSizes;
        int getInputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean booleanValue;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getInputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            int length = ((java.lang.CharSequence) this.getHighSpeedVideoFpsRanges).length();
            if (length > this.getHighSpeedVideoSizes.element) {
                booleanValue = ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).booleanValue();
                if (booleanValue && !androidx.compose.material3.SearchBarKt.access$isExpanded(this.Camera2StreamConfigurationMap)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new androidx.compose.material3.SearchBarDefaults$InputField$9$1.AnonymousClass2.AnonymousClass1(this.Camera2StreamConfigurationMap, null), 3, null);
                }
            }
            this.getHighSpeedVideoSizes.element = length;
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1$2$1", f = "SearchBar.kt", i = {}, l = {1438}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.SearchBarDefaults$InputField$9$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int Camera2StreamConfigurationMap;
            final /* synthetic */ androidx.compose.material3.SearchBarState getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.Camera2StreamConfigurationMap;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.Camera2StreamConfigurationMap = 1;
                    if (this.getHighResolutionOutputSizeshNQ4ISI.animateToExpanded(this) == coroutine_suspended) {
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
                return ((androidx.compose.material3.SearchBarDefaults$InputField$9$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.material3.SearchBarDefaults$InputField$9$1.AnonymousClass2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(androidx.compose.material3.SearchBarState searchBarState, kotlin.coroutines.Continuation<? super androidx.compose.material3.SearchBarDefaults$InputField$9$1.AnonymousClass2.AnonymousClass1> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = searchBarState;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.CharSequence charSequence, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.SearchBarDefaults$InputField$9$1.AnonymousClass2) create(charSequence, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.material3.SearchBarDefaults$InputField$9$1.AnonymousClass2 anonymousClass2 = new androidx.compose.material3.SearchBarDefaults$InputField$9$1.AnonymousClass2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass2.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(kotlin.jvm.internal.Ref.IntRef intRef, androidx.compose.material3.SearchBarState searchBarState, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.State<java.lang.Boolean> state, kotlin.coroutines.Continuation<? super androidx.compose.material3.SearchBarDefaults$InputField$9$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = intRef;
            this.Camera2StreamConfigurationMap = searchBarState;
            this.getHighSpeedVideoFpsRangesFor = coroutineScope;
            this.getHighResolutionOutputSizeshNQ4ISI = state;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.SearchBarDefaults$InputField$9$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.SearchBarDefaults$InputField$9$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarDefaults$InputField$9$1(androidx.compose.material3.SearchBarState searchBarState, androidx.compose.foundation.text.input.TextFieldState textFieldState, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.State<java.lang.Boolean> state, kotlin.coroutines.Continuation<? super androidx.compose.material3.SearchBarDefaults$InputField$9$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = searchBarState;
        this.getHighSpeedVideoFpsRangesFor = textFieldState;
        this.Camera2StreamConfigurationMap = coroutineScope;
        this.getHighSpeedVideoSizes = state;
    }
}
