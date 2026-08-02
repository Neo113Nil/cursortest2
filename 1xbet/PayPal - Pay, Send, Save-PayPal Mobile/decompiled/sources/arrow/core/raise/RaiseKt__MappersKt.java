package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\u001ae\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\t\u0010\n\u001aP\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\r\u001ae\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\u000f\u0010\n\u001aP\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a[\u0010\u0011\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\u0011\u0010\n\u001aF\u0010\u0011\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008e\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006¢\u0006\u0002\b\u00072-\u0010\u0015\u001a)\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001ao\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f¢\u0006\u0002\b\u00072\u001d\u0010\u0015\u001a\u0019\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0018\u001a\u008e\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006¢\u0006\u0002\b\u00072-\u0010\u0015\u001a)\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\u001a\u0010\u0017\u001ao\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f¢\u0006\u0002\b\u00072\u001d\u0010\u0015\u001a\u0019\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aY\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u0001*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0010\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000`\u0006¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\u001a\u0010\n\u001aD\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u0001*)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\u0004\u0012\u00028\u00000\u000bj\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000`\f¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u001a\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Error", "A", "Lkotlin/Function2;", "Larrow/core/raise/Raise;", "Lkotlin/coroutines/Continuation;", "", "Larrow/core/raise/Effect;", "Lkotlin/ExtensionFunctionType;", "Larrow/core/Either;", "toEither", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Larrow/core/raise/EagerEffect;", "(Lkotlin/jvm/functions/Function1;)Larrow/core/Either;", "Larrow/core/Ior;", "toIor", "(Lkotlin/jvm/functions/Function1;)Larrow/core/Ior;", "getOrNull", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/ParameterName;", "Larrow/core/Option;", "p0", "toOption", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Larrow/core/Option;", "Lkotlin/Result;", "toResult", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", ""}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/raise/RaiseKt")
/* loaded from: classes.dex */
final /* synthetic */ class RaiseKt__MappersKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Error, A> java.lang.Object toEither(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends Error, ? extends A>> continuation) {
        arrow.core.raise.RaiseKt__MappersKt$toEither$1 raiseKt__MappersKt$toEither$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        if (continuation instanceof arrow.core.raise.RaiseKt__MappersKt$toEither$1) {
            raiseKt__MappersKt$toEither$1 = (arrow.core.raise.RaiseKt__MappersKt$toEither$1) continuation;
            if ((raiseKt__MappersKt$toEither$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                raiseKt__MappersKt$toEither$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = raiseKt__MappersKt$toEither$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = raiseKt__MappersKt$toEither$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        raiseKt__MappersKt$toEither$1.getHighSpeedVideoFpsRangesFor = defaultRaise;
                        raiseKt__MappersKt$toEither$1.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object invoke = defaultRaise.invoke(function2, raiseKt__MappersKt$toEither$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = invoke;
                        defaultRaise2 = defaultRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) raiseKt__MappersKt$toEither$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        defaultRaise = defaultRaise2;
                        e = e2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        defaultRaise = defaultRaise2;
                        th = th2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right(obj);
            }
        }
        raiseKt__MappersKt$toEither$1 = new arrow.core.raise.RaiseKt__MappersKt$toEither$1(continuation);
        java.lang.Object obj2 = raiseKt__MappersKt$toEither$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = raiseKt__MappersKt$toEither$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        defaultRaise2.complete();
        return new arrow.core.Either.Right(obj2);
    }

    public static final <Error, A> java.lang.Object toIor(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends Error, ? extends A>> continuation) {
        return arrow.core.raise.RaiseKt.fold(function2, new arrow.core.raise.RaiseKt__MappersKt$toIor$2(null), new arrow.core.raise.RaiseKt__MappersKt$toIor$3(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Error, A> java.lang.Object getOrNull(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        arrow.core.raise.RaiseKt__MappersKt$getOrNull$1 raiseKt__MappersKt$getOrNull$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        if (continuation instanceof arrow.core.raise.RaiseKt__MappersKt$getOrNull$1) {
            raiseKt__MappersKt$getOrNull$1 = (arrow.core.raise.RaiseKt__MappersKt$getOrNull$1) continuation;
            if ((raiseKt__MappersKt$getOrNull$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                raiseKt__MappersKt$getOrNull$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = raiseKt__MappersKt$getOrNull$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = raiseKt__MappersKt$getOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        raiseKt__MappersKt$getOrNull$1.getHighSpeedVideoSizes = defaultRaise;
                        raiseKt__MappersKt$getOrNull$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object invoke = defaultRaise.invoke(function2, raiseKt__MappersKt$getOrNull$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = invoke;
                        defaultRaise2 = defaultRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        return null;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) raiseKt__MappersKt$getOrNull$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        defaultRaise = defaultRaise2;
                        e = e2;
                        defaultRaise.complete();
                        arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        return null;
                    } catch (java.lang.Throwable th2) {
                        defaultRaise = defaultRaise2;
                        th = th2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                defaultRaise2.complete();
                return obj;
            }
        }
        raiseKt__MappersKt$getOrNull$1 = new arrow.core.raise.RaiseKt__MappersKt$getOrNull$1(continuation);
        java.lang.Object obj2 = raiseKt__MappersKt$getOrNull$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = raiseKt__MappersKt$getOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        defaultRaise2.complete();
        return obj2;
    }

    public static final <Error, A> java.lang.Object toOption(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super arrow.core.Option<? extends A>>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super arrow.core.Option<? extends A>> continuation) {
        return arrow.core.raise.RaiseKt.fold(function2, function22, new arrow.core.raise.RaiseKt__MappersKt$toOption$2(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Error, A> java.lang.Object toResult(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>> continuation) {
        arrow.core.raise.RaiseKt__MappersKt$toResult$1 raiseKt__MappersKt$toResult$1;
        int i;
        if (continuation instanceof arrow.core.raise.RaiseKt__MappersKt$toResult$1) {
            raiseKt__MappersKt$toResult$1 = (arrow.core.raise.RaiseKt__MappersKt$toResult$1) continuation;
            if ((raiseKt__MappersKt$toResult$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                raiseKt__MappersKt$toResult$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = raiseKt__MappersKt$toResult$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = raiseKt__MappersKt$toResult$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.raise.RaiseKt__MappersKt$toResult$2 raiseKt__MappersKt$toResult$2 = new arrow.core.raise.RaiseKt__MappersKt$toResult$2(null);
                    arrow.core.raise.RaiseKt__MappersKt$toResult$3 raiseKt__MappersKt$toResult$3 = new arrow.core.raise.RaiseKt__MappersKt$toResult$3(function22, null);
                    arrow.core.raise.RaiseKt__MappersKt$toResult$4 raiseKt__MappersKt$toResult$4 = new arrow.core.raise.RaiseKt__MappersKt$toResult$4(null);
                    raiseKt__MappersKt$toResult$1.getHighSpeedVideoSizes = 1;
                    obj = arrow.core.raise.RaiseKt.fold(function2, raiseKt__MappersKt$toResult$2, raiseKt__MappersKt$toResult$3, raiseKt__MappersKt$toResult$4, raiseKt__MappersKt$toResult$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
            }
        }
        raiseKt__MappersKt$toResult$1 = new arrow.core.raise.RaiseKt__MappersKt$toResult$1(continuation);
        java.lang.Object obj2 = raiseKt__MappersKt$toResult$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = raiseKt__MappersKt$toResult$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return ((kotlin.Result) obj2).getCamera2StreamConfigurationMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <A> java.lang.Object toResult(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super java.lang.Throwable>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>> continuation) {
        arrow.core.raise.RaiseKt__MappersKt$toResult$8 raiseKt__MappersKt$toResult$8;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Throwable nonFatalOrThrow;
        if (continuation instanceof arrow.core.raise.RaiseKt__MappersKt$toResult$8) {
            raiseKt__MappersKt$toResult$8 = (arrow.core.raise.RaiseKt__MappersKt$toResult$8) continuation;
            if ((raiseKt__MappersKt$toResult$8.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                raiseKt__MappersKt$toResult$8.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = raiseKt__MappersKt$toResult$8.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = raiseKt__MappersKt$toResult$8.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.ResultRaise resultRaise = new arrow.core.raise.ResultRaise(defaultRaise);
                        raiseKt__MappersKt$toResult$8.getHighSpeedVideoFpsRangesFor = defaultRaise;
                        raiseKt__MappersKt$toResult$8.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object invoke = resultRaise.invoke(function2, raiseKt__MappersKt$toResult$8);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = invoke;
                        defaultRaise2 = defaultRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        nonFatalOrThrow = (java.lang.Throwable) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(nonFatalOrThrow));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(nonFatalOrThrow));
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) raiseKt__MappersKt$toResult$8.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        defaultRaise = defaultRaise2;
                        e = e2;
                        defaultRaise.complete();
                        nonFatalOrThrow = (java.lang.Throwable) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(nonFatalOrThrow));
                    } catch (java.lang.Throwable th2) {
                        defaultRaise = defaultRaise2;
                        th = th2;
                        defaultRaise.complete();
                        nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(nonFatalOrThrow));
                    }
                }
                defaultRaise2.complete();
                return kotlin.Result.m23436constructorimpl(obj);
            }
        }
        raiseKt__MappersKt$toResult$8 = new arrow.core.raise.RaiseKt__MappersKt$toResult$8(continuation);
        java.lang.Object obj2 = raiseKt__MappersKt$toResult$8.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = raiseKt__MappersKt$toResult$8.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        defaultRaise2.complete();
        return kotlin.Result.m23436constructorimpl(obj2);
    }

    public static final <Error, A> arrow.core.Either<Error, A> toEither(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            java.lang.Object invoke = defaultRaise.invoke(function1);
            defaultRaise.complete();
            return new arrow.core.Either.Right(invoke);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final <Error, A> arrow.core.Ior<Error, A> toIor(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A invoke = function1.invoke(defaultRaise);
            defaultRaise.complete();
            return new arrow.core.Ior.Right(invoke);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Ior.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final <Error, A> A getOrNull(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A a2 = (A) defaultRaise.invoke(function1);
            defaultRaise.complete();
            return a2;
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
            return null;
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final <Error, A> arrow.core.Option<A> toOption(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends arrow.core.Option<? extends A>> function12) {
        arrow.core.Option<? extends A> invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A invoke2 = function1.invoke(defaultRaise);
            defaultRaise.complete();
            invoke = new arrow.core.Some(invoke2);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            invoke = function12.invoke((java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        return invoke;
    }

    public static final <Error, A> java.lang.Object toResult(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends kotlin.Result<? extends A>> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A invoke = function1.invoke(defaultRaise);
            defaultRaise.complete();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(invoke);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return function12.invoke((java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise)).getCamera2StreamConfigurationMap();
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(nonFatalOrThrow));
        }
    }

    public static final <A> java.lang.Object toResult(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super java.lang.Throwable>, ? extends A> function1) {
        java.lang.Throwable nonFatalOrThrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            java.lang.Object invoke = new arrow.core.raise.ResultRaise(defaultRaise).invoke(function1);
            defaultRaise.complete();
            return kotlin.Result.m23436constructorimpl(invoke);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            nonFatalOrThrow = (java.lang.Throwable) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
            return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(nonFatalOrThrow));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(nonFatalOrThrow));
        }
    }
}
