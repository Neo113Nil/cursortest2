package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0092\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u00062(\u0010\u000e\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0080@¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"L", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "times", "", "delayMillis", "Lkotlin/Function1;", "", "shouldRetryForError", "", "beforeNewAttempt", "Lkotlin/coroutines/Continuation;", "Larrow/core/Either;", "", "block", "retryEither", "(IJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RetryKt {
    public static /* synthetic */ boolean $r8$lambda$0v5GkJnAti4fIkJS5if4KUXJMNI(java.lang.Object obj) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0111, code lost:
    
        r16 = r13;
        r13 = r0;
        r0 = r10;
        r9 = r8;
        r8 = r3;
        r3 = r12;
        r12 = r1;
        r1 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <L, R> java.lang.Object retryEither(int i, long j, kotlin.jvm.functions.Function1<? super L, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super L, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends L, ? extends R>>, ? extends java.lang.Object> function13, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends L, ? extends R>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt$retryEither$1 retryKt$retryEither$1;
        int i2;
        int i3;
        long j2;
        kotlin.jvm.functions.Function1<? super L, kotlin.Unit> function14;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends L, ? extends R>>, ? extends java.lang.Object> function15;
        com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt$retryEither$1 retryKt$retryEither$12;
        arrow.core.Either either;
        int i4;
        kotlin.jvm.functions.Function1<? super L, java.lang.Boolean> function16;
        kotlin.jvm.functions.Function1<? super L, java.lang.Boolean> function17;
        kotlin.jvm.functions.Function1<? super L, kotlin.Unit> function18;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends L, ? extends R>>, ? extends java.lang.Object> function19;
        int i5;
        int i6;
        arrow.core.Either either2;
        boolean z;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt$retryEither$1) {
            retryKt$retryEither$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt$retryEither$1) continuation;
            if ((retryKt$retryEither$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                retryKt$retryEither$1.getInputFormats -= 2147483648;
                java.lang.Object obj = retryKt$retryEither$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = retryKt$retryEither$1.getInputFormats;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (i <= 0) {
                        throw new java.lang.IllegalArgumentException("times must be greater than 0, was: ".concat(java.lang.String.valueOf(i)).toString());
                    }
                    i3 = i;
                    j2 = j;
                    function14 = function12;
                    function15 = function13;
                    retryKt$retryEither$12 = retryKt$retryEither$1;
                    either = null;
                    i4 = 0;
                    function16 = function1;
                    if (i4 < i3) {
                    }
                    if (either == null) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = retryKt$retryEither$1.getOutputFormats;
                        int i7 = retryKt$retryEither$1.getHighSpeedVideoFpsRangesFor;
                        long j3 = retryKt$retryEither$1.getHighSpeedVideoFpsRanges;
                        int i8 = retryKt$retryEither$1.Camera2StreamConfigurationMap;
                        arrow.core.Either either3 = (arrow.core.Either) retryKt$retryEither$1.getOutputMinFrameDuration;
                        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends L, ? extends R>>, ? extends java.lang.Object> function110 = (kotlin.jvm.functions.Function1) retryKt$retryEither$1.getHighSpeedVideoSizesFor;
                        kotlin.jvm.functions.Function1<? super L, kotlin.Unit> function111 = (kotlin.jvm.functions.Function1) retryKt$retryEither$1.getHighSpeedVideoSizes;
                        kotlin.jvm.functions.Function1<? super L, java.lang.Boolean> function112 = (kotlin.jvm.functions.Function1) retryKt$retryEither$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i3 = i8;
                        long j4 = j3;
                        int i9 = i7;
                        function14 = function111;
                        arrow.core.Either either4 = either3;
                        function19 = function110;
                        com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt$retryEither$1 retryKt$retryEither$13 = retryKt$retryEither$1;
                        function16 = function112;
                        arrow.core.Either either5 = either4;
                        i4 = i9 + 1;
                        j2 = j4;
                        function15 = function19;
                        retryKt$retryEither$12 = retryKt$retryEither$13;
                        either = either5;
                        if (i4 < i3) {
                            retryKt$retryEither$12.getHighResolutionOutputSizeshNQ4ISI = function16;
                            retryKt$retryEither$12.getHighSpeedVideoSizes = function14;
                            retryKt$retryEither$12.getHighSpeedVideoSizesFor = function15;
                            retryKt$retryEither$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                            retryKt$retryEither$12.getInputSizeshNQ4ISI = null;
                            retryKt$retryEither$12.Camera2StreamConfigurationMap = i3;
                            retryKt$retryEither$12.getHighSpeedVideoFpsRanges = j2;
                            retryKt$retryEither$12.getHighSpeedVideoFpsRangesFor = i4;
                            retryKt$retryEither$12.getInputFormats = 1;
                            java.lang.Object invoke = function15.invoke(retryKt$retryEither$12);
                            if (invoke != coroutine_suspended) {
                                kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends L, ? extends R>>, ? extends java.lang.Object> function113 = function15;
                                i5 = i3;
                                obj = invoke;
                                function18 = function14;
                                i6 = i4;
                                function17 = function16;
                                retryKt$retryEither$1 = retryKt$retryEither$12;
                                function19 = function113;
                                either2 = (arrow.core.Either) obj;
                                if (either2 instanceof arrow.core.Either.Right) {
                                    ((arrow.core.Either.Right) either2).getValue();
                                } else if (either2 instanceof arrow.core.Either.Left) {
                                    amex.AMEXKernel aMEXKernel = (java.lang.Object) ((arrow.core.Either.Left) either2).getValue();
                                    if (function17.invoke(aMEXKernel).booleanValue()) {
                                        if (i6 < i5 - 1) {
                                            function18.invoke(aMEXKernel);
                                        }
                                        z = false;
                                        if (z) {
                                            either = either2;
                                        } else {
                                            if (i6 < i5 - 1) {
                                                retryKt$retryEither$1.getHighResolutionOutputSizeshNQ4ISI = function17;
                                                retryKt$retryEither$1.getHighSpeedVideoSizes = function18;
                                                retryKt$retryEither$1.getHighSpeedVideoSizesFor = function19;
                                                retryKt$retryEither$1.getOutputMinFrameDuration = either2;
                                                retryKt$retryEither$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                                                retryKt$retryEither$1.Camera2StreamConfigurationMap = i5;
                                                retryKt$retryEither$1.getHighSpeedVideoFpsRanges = j2;
                                                retryKt$retryEither$1.getHighSpeedVideoFpsRangesFor = i6;
                                                retryKt$retryEither$1.getOutputFormats = z;
                                                retryKt$retryEither$1.getInputFormats = 2;
                                                if (kotlinx.coroutines.DelayKt.delay(j2, retryKt$retryEither$1) != coroutine_suspended) {
                                                }
                                            }
                                            kotlin.jvm.functions.Function1<? super L, java.lang.Boolean> function114 = function17;
                                            either4 = either2;
                                            i3 = i5;
                                            j4 = j2;
                                            i9 = i6;
                                            function14 = function18;
                                            retryKt$retryEither$13 = retryKt$retryEither$1;
                                            function16 = function114;
                                            arrow.core.Either either52 = either4;
                                            i4 = i9 + 1;
                                            j2 = j4;
                                            function15 = function19;
                                            retryKt$retryEither$12 = retryKt$retryEither$13;
                                            either = either52;
                                            if (i4 < i3) {
                                            }
                                        }
                                    }
                                } else {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                z = true;
                                if (z) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (either == null) {
                            return either;
                        }
                        throw new java.lang.IllegalStateException("No attempts were made".toString());
                    }
                    i6 = retryKt$retryEither$1.getHighSpeedVideoFpsRangesFor;
                    j2 = retryKt$retryEither$1.getHighSpeedVideoFpsRanges;
                    i5 = retryKt$retryEither$1.Camera2StreamConfigurationMap;
                    function19 = (kotlin.jvm.functions.Function1) retryKt$retryEither$1.getHighSpeedVideoSizesFor;
                    function18 = (kotlin.jvm.functions.Function1) retryKt$retryEither$1.getHighSpeedVideoSizes;
                    function17 = (kotlin.jvm.functions.Function1) retryKt$retryEither$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    either2 = (arrow.core.Either) obj;
                    if (either2 instanceof arrow.core.Either.Right) {
                    }
                    z = true;
                    if (z) {
                    }
                }
            }
        }
        retryKt$retryEither$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt$retryEither$1(continuation);
        java.lang.Object obj2 = retryKt$retryEither$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = retryKt$retryEither$1.getInputFormats;
        if (i2 != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object retryEither$default(int i, long j, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt.$r8$lambda$0v5GkJnAti4fIkJS5if4KUXJMNI(obj2));
                }
            };
        }
        kotlin.jvm.functions.Function1 function14 = function1;
        if ((i2 & 8) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        return retryEither(i3, j2, function14, function12, function13, continuation);
    }
}
