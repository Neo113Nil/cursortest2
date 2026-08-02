package com.paypal.oslo.feature.identity.challenges.stepupsna.data.parser;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/data/parser/EvUrlResponseParser;", "", "<init>", "()V", "", "response", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "parse", "(Ljava/lang/String;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EvUrlResponseParser {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.challenges.stepupsna.data.parser.EvUrlResponseParser INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupsna.data.parser.EvUrlResponseParser();

    private EvUrlResponseParser() {
    }

    public final arrow.core.Either<com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError, java.lang.String> parse(java.lang.String response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) response, new java.lang.String[]{"&"}, false, 0, 6, (java.lang.Object) null);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10)), 16));
            java.util.Iterator it = split$default.iterator();
            while (it.hasNext()) {
                java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{"="}, false, 2, 2, (java.lang.Object) null);
                kotlin.Pair pair = split$default2.size() == 2 ? kotlin.TuplesKt.to(split$default2.get(0), split$default2.get(1)) : kotlin.TuplesKt.to(split$default2.get(0), "");
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            java.lang.String str = (java.lang.String) linkedHashMap.get("ErrorCode");
            java.lang.Integer intOrNull = str != null ? kotlin.text.StringsKt.toIntOrNull(str) : null;
            java.lang.String str2 = (java.lang.String) linkedHashMap.get("ErrorDescription");
            if (intOrNull != null && intOrNull.intValue() == 0) {
                java.lang.String str3 = (java.lang.String) linkedHashMap.get("Verify");
                java.lang.String str4 = str3;
                if (str4 == null || str4.length() == 0) {
                    defaultRaise2.raise(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MissingVerifyId.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise.complete();
                return new arrow.core.Either.Right(str3);
            }
            defaultRaise2.raise(new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.EvUrlVerificationFailed(intOrNull, str2));
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
