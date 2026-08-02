package com.paypal.oslo.app.deeplink;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/app/deeplink/DeeplinkResolverImpl;", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "<init>", "()V", "", "pathWithQuery", "Larrow/core/Either;", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error;", "Landroidx/navigation3/runtime/NavKey;", "resolve", "(Ljava/lang/String;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeeplinkResolverImpl implements com.paypal.oslo.core.deeplink.DeeplinkResolver {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DeeplinkResolverImpl() {
    }

    @Override // com.paypal.oslo.core.deeplink.DeeplinkResolver
    public final arrow.core.Either<com.paypal.oslo.core.deeplink.DeeplinkResolver.Error, androidx.navigation3.runtime.NavKey> resolve(java.lang.String pathWithQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathWithQuery, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (!kotlin.text.StringsKt.isBlank(pathWithQuery)) {
                if (kotlin.text.StringsKt.startsWith$default(pathWithQuery, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL);
                    sb.append(pathWithQuery);
                    com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult parseUrl = com.paypal.oslo.app.deeplink.DeeplinkParser.INSTANCE.parseUrl(sb.toString());
                    if (parseUrl != null) {
                        androidx.navigation3.runtime.NavKey destination = parseUrl.getDestination();
                        defaultRaise.complete();
                        return new arrow.core.Either.Right(destination);
                    }
                    defaultRaise2.raise(new com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath(pathWithQuery));
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise2.raise(new com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath(pathWithQuery));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise2.raise(new com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath(pathWithQuery));
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
