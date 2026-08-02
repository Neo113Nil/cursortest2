package com.ingo.sdk.kotlin.common.core.functional;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0002\u0010\u00012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0002\u0010\u00022\u0006\u0010\n\u001a\u00028\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018\u0082\u0001\u0002\u0007\u000b"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "L", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "<init>", "()V", "a", "Lcom/ingo/sdk/kotlin/common/core/functional/Either$Left;", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, "(Ljava/lang/Object;)Lcom/ingo/sdk/kotlin/common/core/functional/Either$Left;", util.h.xy.cb.b.f1091, "Lcom/ingo/sdk/kotlin/common/core/functional/Either$Right;", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "(Ljava/lang/Object;)Lcom/ingo/sdk/kotlin/common/core/functional/Either$Right;", "Lkotlin/Function1;", "fnL", "fnR", "fold", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "foldNothing", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "isRight", "()Z", "isLeft", "Left", "Right"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class Either<L, R> {
    private Either() {
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/functional/Either$Left;", "L", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "", "a", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/ingo/sdk/kotlin/common/core/functional/Either$Left;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getA"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Left<L> extends com.ingo.sdk.kotlin.common.core.functional.Either {
        private final L a;

        public Left(L l) {
            super(null);
            this.a = l;
        }

        public final L getA() {
            return this.a;
        }

        public final java.lang.String toString() {
            L l = this.a;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Left(a=");
            sb.append(l);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            L l = this.a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Left) && kotlin.jvm.internal.Intrinsics.areEqual(this.a, ((com.ingo.sdk.kotlin.common.core.functional.Either.Left) other).a);
        }

        public final com.ingo.sdk.kotlin.common.core.functional.Either.Left<L> copy(L a2) {
            return new com.ingo.sdk.kotlin.common.core.functional.Either.Left<>(a2);
        }

        public final L component1() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.ingo.sdk.kotlin.common.core.functional.Either.Left copy$default(com.ingo.sdk.kotlin.common.core.functional.Either.Left left, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = left.a;
            }
            return left.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/functional/Either$Right;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "", util.h.xy.cb.b.f1091, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/ingo/sdk/kotlin/common/core/functional/Either$Right;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getB"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Right<R> extends com.ingo.sdk.kotlin.common.core.functional.Either {
        private final R b;

        public Right(R r) {
            super(null);
            this.b = r;
        }

        public final R getB() {
            return this.b;
        }

        public final java.lang.String toString() {
            R r = this.b;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Right(b=");
            sb.append(r);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            R r = this.b;
            if (r == null) {
                return 0;
            }
            return r.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Right) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.ingo.sdk.kotlin.common.core.functional.Either.Right) other).b);
        }

        public final com.ingo.sdk.kotlin.common.core.functional.Either.Right<R> copy(R b) {
            return new com.ingo.sdk.kotlin.common.core.functional.Either.Right<>(b);
        }

        public final R component1() {
            return this.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.ingo.sdk.kotlin.common.core.functional.Either.Right copy$default(com.ingo.sdk.kotlin.common.core.functional.Either.Right right, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = right.b;
            }
            return right.copy(obj);
        }
    }

    public final boolean isRight() {
        return this instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Right;
    }

    public final boolean isLeft() {
        return this instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Left;
    }

    public final <L> com.ingo.sdk.kotlin.common.core.functional.Either.Left<L> left(L a2) {
        return new com.ingo.sdk.kotlin.common.core.functional.Either.Left<>(a2);
    }

    public final <R> com.ingo.sdk.kotlin.common.core.functional.Either.Right<R> right(R b) {
        return new com.ingo.sdk.kotlin.common.core.functional.Either.Right<>(b);
    }

    public final java.lang.Object fold(kotlin.jvm.functions.Function1<? super L, ? extends java.lang.Object> fnL, kotlin.jvm.functions.Function1<? super R, ? extends java.lang.Object> fnR) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fnL, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fnR, "");
        if (this instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Left) {
            return fnL.invoke((java.lang.Object) ((com.ingo.sdk.kotlin.common.core.functional.Either.Left) this).getA());
        }
        if (this instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Right) {
            return fnR.invoke((java.lang.Object) ((com.ingo.sdk.kotlin.common.core.functional.Either.Right) this).getB());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final void foldNothing(kotlin.jvm.functions.Function1<? super L, kotlin.Unit> fnL, kotlin.jvm.functions.Function1<? super R, kotlin.Unit> fnR) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fnL, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fnR, "");
        if (this instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Left) {
            fnL.invoke((java.lang.Object) ((com.ingo.sdk.kotlin.common.core.functional.Either.Left) this).getA());
        } else {
            if (!(this instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            fnR.invoke((java.lang.Object) ((com.ingo.sdk.kotlin.common.core.functional.Either.Right) this).getB());
        }
    }

    public /* synthetic */ Either(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
