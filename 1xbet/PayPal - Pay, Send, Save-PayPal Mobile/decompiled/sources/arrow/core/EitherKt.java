package arrow.core;

@kotlin.Metadata(d1 = {"arrow/core/EitherKt__EitherKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EitherKt {
    public static final java.lang.String NicheAPI = "This API is niche and will be removed in the future. If this method is crucial for you, please let us know on the Arrow Github. Thanks!\n https://github.com/arrow-kt/arrow/issues\n";
    public static final java.lang.String RedundantAPI = "This API is considered redundant. If this method is crucial for you, please let us know on the Arrow Github. Thanks!\n https://github.com/arrow-kt/arrow/issues\n";

    public static final <A, B> arrow.core.Either<A, B> combine(arrow.core.Either<? extends A, ? extends B> either, arrow.core.Either<? extends A, ? extends B> either2, kotlin.jvm.functions.Function2<? super A, ? super A, ? extends A> function2, kotlin.jvm.functions.Function2<? super B, ? super B, ? extends B> function22) {
        return arrow.core.EitherKt__EitherKt.combine(either, either2, function2, function22);
    }

    public static final <A extends java.lang.Comparable<? super A>, B extends java.lang.Comparable<? super B>> int compareTo(arrow.core.Either<? extends A, ? extends B> either, arrow.core.Either<? extends A, ? extends B> either2) {
        return arrow.core.EitherKt__EitherKt.compareTo(either, either2);
    }

    public static final <A, B, C> arrow.core.Either<A, C> flatMap(arrow.core.Either<? extends A, ? extends B> either, kotlin.jvm.functions.Function1<? super B, ? extends arrow.core.Either<? extends A, ? extends C>> function1) {
        return arrow.core.EitherKt__EitherKt.flatMap(either, function1);
    }

    public static final <A, B> arrow.core.Either<A, B> flatten(arrow.core.Either<? extends A, ? extends arrow.core.Either<? extends A, ? extends B>> either) {
        return arrow.core.EitherKt__EitherKt.flatten(either);
    }

    public static final <A, B> B getOrElse(arrow.core.Either<? extends A, ? extends B> either, kotlin.jvm.functions.Function1<? super A, ? extends B> function1) {
        return (B) arrow.core.EitherKt__EitherKt.getOrElse(either, function1);
    }

    public static final <A, B, C> arrow.core.Either<C, B> handleErrorWith(arrow.core.Either<? extends A, ? extends B> either, kotlin.jvm.functions.Function1<? super A, ? extends arrow.core.Either<? extends C, ? extends B>> function1) {
        return arrow.core.EitherKt__EitherKt.handleErrorWith(either, function1);
    }

    public static final <A> arrow.core.Either left(A a2) {
        return arrow.core.EitherKt__EitherKt.left(a2);
    }

    public static final <E> arrow.core.Either leftNel(E e) {
        return arrow.core.EitherKt__EitherKt.leftNel(e);
    }

    public static final <A> A merge(arrow.core.Either<? extends A, ? extends A> either) {
        return (A) arrow.core.EitherKt__EitherKt.merge(either);
    }

    public static final <E, EE, A> arrow.core.Either<EE, A> recover(arrow.core.Either<? extends E, ? extends A> either, kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super EE>, ? super E, ? extends A> function2) {
        return arrow.core.EitherKt__EitherKt.recover(either, function2);
    }

    public static final <A> arrow.core.Either right(A a2) {
        return arrow.core.EitherKt__EitherKt.right(a2);
    }

    public static final <E, A> arrow.core.Either<arrow.core.NonEmptyList<E>, A> toEitherNel(arrow.core.Either<? extends E, ? extends A> either) {
        return arrow.core.EitherKt__EitherKt.toEitherNel(either);
    }
}
