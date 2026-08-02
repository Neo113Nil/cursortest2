package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "rating", "Lcom/google/android/libraries/places/api/model/AuthorAttribution;", "authorAttribution", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/Review$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/model/Review;", "review", "(DLcom/google/android/libraries/places/api/model/AuthorAttribution;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/Review;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReviewKt {
    public static final com.google.android.libraries.places.api.model.Review review(double d, com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.model.Review.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorAttribution, "");
        com.google.android.libraries.places.api.model.Review.Builder builder = com.google.android.libraries.places.api.model.Review.builder(java.lang.Double.valueOf(d), authorAttribution);
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.model.Review build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.model.Review review$default(double d, com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return review(d, authorAttribution, function1);
    }
}
