package arrow.core;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001as\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032#\u0010\u0006\u001a\u001f\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00030\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0007\u0010\b\u001an\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u00030\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\t\u0010\b\u001aA\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0003¢\u0006\u0004\b\n\u0010\u000b\u001aP\u0010\f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0086\fø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003\"\u0004\b\u0000\u0010\u0000*\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001aT\u0010\u0016\u001a\u00020\u0015\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u000e\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0014*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u009a\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00182\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0018H\u0086\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aK\u0010 \u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001f\"\u0004\b\u0000\u0010\u001d\"\u0004\b\u0001\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b \u0010\u000b\u001a9\u0010!\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u0004\u0012\u00020\u00100\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010`\u001f\"\u0004\b\u0000\u0010\u001d*\u00028\u0000¢\u0006\u0004\b!\u0010\u0012\u001as\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u001d\"\u0004\b\u0001\u0010\"\"\u0004\b\u0002\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032#\u0010\u0006\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010#\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0018¢\u0006\u0002\b$H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b%\u0010&\u001ay\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u001d\"\n\b\u0001\u0010(\u0018\u0001*\u00020'\"\u0004\b\u0002\u0010\u0000*\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00020\u00032#\u0010\u0006\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0018¢\u0006\u0002\b$H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b)\u0010&\"\u0014\u0010+\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010,*:\u0010.\u001a\u0004\b\u0000\u0010\u001d\u001a\u0004\b\u0001\u0010\u0000\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u0004\u0012\u00028\u00010\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Larrow/core/Either;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "p0", "flatMap", "(Larrow/core/Either;Lkotlin/jvm/functions/Function1;)Larrow/core/Either;", "handleErrorWith", "flatten", "(Larrow/core/Either;)Larrow/core/Either;", "getOrElse", "(Larrow/core/Either;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "merge", "(Larrow/core/Either;)Ljava/lang/Object;", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, "(Ljava/lang/Object;)Larrow/core/Either;", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "", "", "compareTo", "(Larrow/core/Either;Larrow/core/Either;)I", "Lkotlin/Function2;", "p1", "p2", "combine", "(Larrow/core/Either;Larrow/core/Either;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Larrow/core/Either;", "E", "Larrow/core/NonEmptyList;", "Larrow/core/EitherNel;", "toEitherNel", "leftNel", "EE", "Larrow/core/raise/Raise;", "Lkotlin/ExtensionFunctionType;", "recover", "(Larrow/core/Either;Lkotlin/jvm/functions/Function2;)Larrow/core/Either;", "", "T", "catch", "", "NicheAPI", "Ljava/lang/String;", "RedundantAPI", "EitherNel"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/EitherKt")
/* loaded from: classes3.dex */
final /* synthetic */ class EitherKt__EitherKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <A, B, C> arrow.core.Either<A, C> flatMap(arrow.core.Either<? extends A, ? extends B> either, kotlin.jvm.functions.Function1<? super B, ? extends arrow.core.Either<? extends A, ? extends C>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (either instanceof arrow.core.Either.Right) {
            return function1.invoke((java.lang.Object) ((arrow.core.Either.Right) either).getValue());
        }
        if (either instanceof arrow.core.Either.Left) {
            return either;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <A, B, C> arrow.core.Either<C, B> handleErrorWith(arrow.core.Either<? extends A, ? extends B> either, kotlin.jvm.functions.Function1<? super A, ? extends arrow.core.Either<? extends C, ? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (either instanceof arrow.core.Either.Left) {
            return function1.invoke((java.lang.Object) ((arrow.core.Either.Left) either).getValue());
        }
        if (either instanceof arrow.core.Either.Right) {
            return either;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <A, B> B getOrElse(arrow.core.Either<? extends A, ? extends B> either, kotlin.jvm.functions.Function1<? super A, ? extends B> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (either instanceof arrow.core.Either.Left) {
            return function1.invoke((java.lang.Object) ((arrow.core.Either.Left) either).getValue());
        }
        if (either instanceof arrow.core.Either.Right) {
            return (B) ((arrow.core.Either.Right) either).getValue();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <A> arrow.core.Either left(A a2) {
        return new arrow.core.Either.Left(a2);
    }

    public static final <A> arrow.core.Either right(A a2) {
        return new arrow.core.Either.Right(a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <A, B> arrow.core.Either<A, B> combine(arrow.core.Either<? extends A, ? extends B> either, arrow.core.Either<? extends A, ? extends B> either2, kotlin.jvm.functions.Function2<? super A, ? super A, ? extends A> function2, kotlin.jvm.functions.Function2<? super B, ? super B, ? extends B> function22) {
        arrow.core.Either.Left left;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        if (either instanceof arrow.core.Either.Left) {
            if (either2 instanceof arrow.core.Either.Left) {
                left = new arrow.core.Either.Left(function2.invoke((java.lang.Object) ((arrow.core.Either.Left) either).getValue(), (java.lang.Object) ((arrow.core.Either.Left) either2).getValue()));
            } else {
                if (!(either2 instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                left = (arrow.core.Either.Left) either;
            }
            return left;
        }
        if (!(either instanceof arrow.core.Either.Right)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (either2 instanceof arrow.core.Either.Left) {
            return either2;
        }
        if (either2 instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(function22.invoke((java.lang.Object) ((arrow.core.Either.Right) either).getValue(), (java.lang.Object) ((arrow.core.Either.Right) either2).getValue()));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <E> arrow.core.Either leftNel(E e) {
        return arrow.core.EitherKt.left(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyListKt.nonEmptyListOf(e, new java.lang.Object[0])));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E, EE, A> arrow.core.Either<EE, A> recover(arrow.core.Either<? extends E, ? extends A> either, kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super EE>, ? super E, ? extends A> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (!(either instanceof arrow.core.Either.Left)) {
            if (either instanceof arrow.core.Either.Right) {
                return either;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A invoke = function2.invoke(defaultRaise, (java.lang.Object) ((arrow.core.Either.Left) either).getValue());
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final <A, B> arrow.core.Either<A, B> flatten(arrow.core.Either<? extends A, ? extends arrow.core.Either<? extends A, ? extends B>> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        if (either instanceof arrow.core.Either.Right) {
            return (arrow.core.Either) ((arrow.core.Either.Right) either).getValue();
        }
        if (either instanceof arrow.core.Either.Left) {
            return either;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <A> A merge(arrow.core.Either<? extends A, ? extends A> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        if (either instanceof arrow.core.Either.Right) {
            return (A) ((arrow.core.Either.Right) either).getValue();
        }
        if (either instanceof arrow.core.Either.Left) {
            return (A) ((arrow.core.Either.Left) either).getValue();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <A extends java.lang.Comparable<? super A>, B extends java.lang.Comparable<? super B>> int compareTo(arrow.core.Either<? extends A, ? extends B> either, arrow.core.Either<? extends A, ? extends B> either2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either2, "");
        if (either instanceof arrow.core.Either.Right) {
            java.lang.Comparable comparable = (java.lang.Comparable) ((arrow.core.Either.Right) either).getValue();
            if (either2 instanceof arrow.core.Either.Right) {
                return comparable.compareTo((java.lang.Comparable) ((arrow.core.Either.Right) either2).getValue());
            }
            if (!(either2 instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return 1;
        }
        if (!(either instanceof arrow.core.Either.Left)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.Comparable comparable2 = (java.lang.Comparable) ((arrow.core.Either.Left) either).getValue();
        if (either2 instanceof arrow.core.Either.Right) {
            return -1;
        }
        if (either2 instanceof arrow.core.Either.Left) {
            return comparable2.compareTo((java.lang.Comparable) ((arrow.core.Either.Left) either2).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <E, A> arrow.core.Either<arrow.core.NonEmptyList<E>, A> toEitherNel(arrow.core.Either<? extends E, ? extends A> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        if (either instanceof arrow.core.Either.Left) {
            return new arrow.core.Either.Left(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyListKt.nonEmptyListOf(((arrow.core.Either.Left) either).getValue(), new java.lang.Object[0])));
        }
        if (either instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: catch, reason: not valid java name */
    public static final /* synthetic */ <E, T extends java.lang.Throwable, A> arrow.core.Either<E, A> m9551catch(arrow.core.Either<? extends java.lang.Throwable, ? extends A> either, kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super E>, ? super T, ? extends A> function2) {
        arrow.core.Either.Left left;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Throwable th;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (either instanceof arrow.core.Either.Left) {
            arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
            try {
                defaultRaise = defaultRaise2;
                th = (java.lang.Throwable) ((arrow.core.Either.Left) either).getValue();
                arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise2.complete();
                left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
            } catch (java.lang.Throwable th2) {
                defaultRaise2.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
            }
            if (!(th instanceof java.lang.Throwable)) {
                throw th;
            }
            A invoke = function2.invoke(defaultRaise, th);
            defaultRaise2.complete();
            left = new arrow.core.Either.Right(invoke);
            return left;
        }
        if (either instanceof arrow.core.Either.Right) {
            return either;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
