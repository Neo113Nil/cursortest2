package com.paypal.oslo.core.network.rest.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lretrofit2/Response;", "Ljava/lang/reflect/Type;", "paramType", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "toEither", "(Lretrofit2/Response;Ljava/lang/reflect/Type;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EitherExtensionKt {
    public static final <T> arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, T> toEither(retrofit2.Response<T> response, java.lang.reflect.Type type) {
        kotlin.Unit body;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (response.isSuccessful()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.Unit.class)) {
                    body = kotlin.Unit.INSTANCE;
                } else {
                    body = response.body();
                }
                defaultRaise.complete();
                return new arrow.core.Either.Right(body);
            }
            int code = response.code();
            java.lang.String message = response.message();
            okhttp3.ResponseBody errorBody = response.errorBody();
            defaultRaise2.raise(new com.paypal.oslo.core.network.http.error.NetworkError.HttpError(code, message, errorBody != null ? errorBody.string() : null, null, 8, null));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
