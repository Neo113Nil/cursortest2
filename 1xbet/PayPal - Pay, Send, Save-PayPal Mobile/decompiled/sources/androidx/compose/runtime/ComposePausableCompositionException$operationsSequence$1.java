package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", i = {0, 0, 0, 0}, l = {579}, m = "invokeSuspend", n = {"$this$sequence", "currentOperation", "currentInstance", "currentReused"}, s = {"L$0", "I$0", "I$1", "I$2"}, v = 1)
/* loaded from: classes6.dex */
final class ComposePausableCompositionException$operationsSequence$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.ComposePausableCompositionException getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        int i;
        int i2;
        int i3;
        int i4;
        androidx.collection.IntList intList;
        androidx.collection.IntList intList2;
        java.lang.String str;
        androidx.collection.ObjectList objectList;
        androidx.collection.IntList intList3;
        androidx.collection.IntList intList4;
        androidx.collection.IntList intList5;
        androidx.collection.IntList intList6;
        androidx.collection.IntList intList7;
        androidx.collection.IntList intList8;
        int i5;
        androidx.collection.ObjectList objectList2;
        int i6;
        androidx.collection.IntList intList9;
        androidx.collection.ObjectList objectList3;
        androidx.collection.ObjectList objectList4;
        androidx.collection.ObjectList objectList5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.getHighSpeedVideoFpsRanges;
        if (i7 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputFormats;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i7 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.getHighResolutionOutputSizeshNQ4ISI;
            i2 = this.Camera2StreamConfigurationMap;
            i3 = this.getHighSpeedVideoSizes;
            sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (true) {
            i4 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            intList = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            if (i3 < java.lang.Math.min(i4 + 10, intList._size)) {
                intList2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                int i8 = i3 + 1;
                int i9 = intList2.get(i3);
                switch (i9) {
                    case 0:
                        str = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP;
                        break;
                    case 1:
                        objectList = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                        str = "down ".concat(java.lang.String.valueOf(objectList.get(i2)));
                        i2++;
                        break;
                    case 2:
                        intList3 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                        int i10 = intList3.get(i8);
                        intList4 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                        int i11 = intList4.get(i3 + 2);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("remove ");
                        sb.append(i10);
                        sb.append(' ');
                        sb.append(i11);
                        str = sb.toString();
                        i8 = i3 + 3;
                        break;
                    case 3:
                        intList5 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                        int i12 = intList5.get(i8);
                        intList6 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                        int i13 = intList6.get(i3 + 2);
                        intList7 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                        int i14 = intList7.get(i3 + 3);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("move ");
                        sb2.append(i12);
                        sb2.append(' ');
                        sb2.append(i13);
                        sb2.append(' ');
                        sb2.append(i14);
                        str = sb2.toString();
                        i8 = i3 + 4;
                        break;
                    case 4:
                        str = "clear";
                        break;
                    case 5:
                        intList8 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                        i5 = i3 + 2;
                        int i15 = intList8.get(i8);
                        objectList2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                        i6 = i2 + 1;
                        java.lang.Object obj2 = objectList2.get(i2);
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("insertBottomUp ");
                        sb3.append(i15);
                        sb3.append(' ');
                        sb3.append(obj2);
                        str = sb3.toString();
                        i8 = i5;
                        i2 = i6;
                        break;
                    case 6:
                        intList9 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                        i5 = i3 + 2;
                        int i16 = intList9.get(i8);
                        objectList3 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                        i6 = i2 + 1;
                        java.lang.Object obj3 = objectList3.get(i2);
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("insertTopDown ");
                        sb4.append(i16);
                        sb4.append(' ');
                        sb4.append(obj3);
                        str = sb4.toString();
                        i8 = i5;
                        i2 = i6;
                        break;
                    case 7:
                        objectList4 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object obj4 = objectList4.get(i2);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "");
                        i2 += 2;
                        str = "apply ".concat(java.lang.String.valueOf((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj4, 2)));
                        break;
                    case 8:
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("reuse ");
                        objectList5 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                        sb5.append(objectList5.get(i));
                        str = sb5.toString();
                        i++;
                        break;
                    case 9:
                        str = "recompose pending";
                        break;
                    default:
                        str = "unknown op: ".concat(java.lang.String.valueOf(i9));
                        break;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i3);
                sb6.append(": ");
                sb6.append(str);
                this.getOutputFormats = sequenceScope;
                this.getHighSpeedVideoSizes = i8;
                this.Camera2StreamConfigurationMap = i2;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                this.getHighSpeedVideoFpsRanges = 1;
                if (sequenceScope.yield(sb6.toString(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = i8;
            } else {
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.String> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1 composePausableCompositionException$operationsSequence$1 = new androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        composePausableCompositionException$operationsSequence$1.getOutputFormats = obj;
        return composePausableCompositionException$operationsSequence$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposePausableCompositionException$operationsSequence$1(androidx.compose.runtime.ComposePausableCompositionException composePausableCompositionException, kotlin.coroutines.Continuation<? super androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = composePausableCompositionException;
    }
}
