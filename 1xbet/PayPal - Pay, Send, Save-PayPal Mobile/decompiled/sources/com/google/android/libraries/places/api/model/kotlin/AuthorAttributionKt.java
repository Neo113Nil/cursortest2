package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "name", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/AuthorAttribution$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/model/AuthorAttribution;", "authorAttribution", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/AuthorAttribution;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AuthorAttributionKt {
    public static final com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution(java.lang.String str, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.model.AuthorAttribution.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.google.android.libraries.places.api.model.AuthorAttribution.Builder builder = com.google.android.libraries.places.api.model.AuthorAttribution.builder(str);
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.model.AuthorAttribution build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution$default(java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return authorAttribution(str, function1);
    }
}
