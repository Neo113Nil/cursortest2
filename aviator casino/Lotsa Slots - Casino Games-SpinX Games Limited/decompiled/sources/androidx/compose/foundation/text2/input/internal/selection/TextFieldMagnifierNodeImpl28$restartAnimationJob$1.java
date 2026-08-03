package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: AndroidTextFieldMagnifier.android.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class TextFieldMagnifierNodeImpl28$restartAnimationJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldMagnifierNodeImpl28$restartAnimationJob$1(androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1> continuation) {
        super(2, continuation);
        this.this$0 = textFieldMagnifierNodeImpl28;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1 textFieldMagnifierNodeImpl28$restartAnimationJob$1 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this.this$0, continuation);
        textFieldMagnifierNodeImpl28$restartAnimationJob$1.L$0 = obj;
        return textFieldMagnifierNodeImpl28$restartAnimationJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            final androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.this$0;
            kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke() {
                    return androidx.compose.ui.geometry.Offset.m1860boximpl(m1189invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m1189invokeF1C5BW0() {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
                    androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
                    long m1185getMagnifierSizeYbymL2g;
                    transformedTextFieldState = androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this.textFieldState;
                    textFieldSelectionState = androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this.textFieldSelectionState;
                    textLayoutState = androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this.textLayoutState;
                    m1185getMagnifierSizeYbymL2g = androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this.m1185getMagnifierSizeYbymL2g();
                    return androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierKt.m1182calculateSelectionMagnifierCenterAndroidhUlJWOE(transformedTextFieldState, textFieldSelectionState, textLayoutState, m1185getMagnifierSizeYbymL2g);
                }
            });
            final androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = this.this$0;
            this.label = 1;
            if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return m1190emit3MmeM6k(((androidx.compose.ui.geometry.Offset) obj2).getPackedValue(), continuation);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final java.lang.Object m1190emit3MmeM6k(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    androidx.compose.animation.core.Animatable animatable;
                    androidx.compose.animation.core.Animatable animatable2;
                    androidx.compose.animation.core.Animatable animatable3;
                    animatable = androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this.animatable;
                    if (androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(((androidx.compose.ui.geometry.Offset) animatable.getValue()).getPackedValue()) && androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(j)) {
                        animatable3 = androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this.animatable;
                        if (androidx.compose.ui.geometry.Offset.m1872getYimpl(((androidx.compose.ui.geometry.Offset) animatable3.getValue()).getPackedValue()) != androidx.compose.ui.geometry.Offset.m1872getYimpl(j)) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.AnonymousClass2.AnonymousClass1(androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this, j, null), 3, null);
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    animatable2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this.animatable;
                    java.lang.Object snapTo = animatable2.snapTo(androidx.compose.ui.geometry.Offset.m1860boximpl(j), continuation);
                    return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
                }

                /* compiled from: AndroidTextFieldMagnifier.android.kt */
                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ long $targetValue;
                    int label;
                    final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.AnonymousClass2.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = textFieldMagnifierNodeImpl28;
                        this.$targetValue = j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.AnonymousClass2.AnonymousClass1(this.this$0, this.$targetValue, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        androidx.compose.animation.core.Animatable animatable;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            animatable = this.this$0.animatable;
                            this.label = 1;
                            if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, androidx.compose.ui.geometry.Offset.m1860boximpl(this.$targetValue), androidx.compose.foundation.text.selection.SelectionMagnifierKt.getMagnifierSpringSpec(), null, null, this, 12, null) == coroutine_suspended) {
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
            }, this) == coroutine_suspended) {
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
