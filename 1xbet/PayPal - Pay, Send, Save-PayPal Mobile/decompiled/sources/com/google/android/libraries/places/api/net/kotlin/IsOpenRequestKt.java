package com.google.android.libraries.places.api.net.kotlin;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000e"}, d2 = {"", "placeId", "", "utcTimeMillis", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/IsOpenRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "isOpenRequest", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "Lcom/google/android/libraries/places/api/model/Place;", "place", "(Lcom/google/android/libraries/places/api/model/Place;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/IsOpenRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IsOpenRequestKt {
    public static final com.google.android.libraries.places.api.net.IsOpenRequest isOpenRequest(com.google.android.libraries.places.api.model.Place place, java.lang.Long l, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.IsOpenRequest.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.net.IsOpenRequest.Builder builder = l == null ? com.google.android.libraries.places.api.net.IsOpenRequest.builder(place) : com.google.android.libraries.places.api.net.IsOpenRequest.builder(place, l.longValue());
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.net.IsOpenRequest build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.net.IsOpenRequest isOpenRequest$default(com.google.android.libraries.places.api.model.Place place, java.lang.Long l, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isOpenRequest(place, l, (kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.IsOpenRequest.Builder, kotlin.Unit>) function1);
    }

    public static /* synthetic */ com.google.android.libraries.places.api.net.IsOpenRequest isOpenRequest$default(java.lang.String str, java.lang.Long l, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isOpenRequest(str, l, (kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.IsOpenRequest.Builder, kotlin.Unit>) function1);
    }

    public static final com.google.android.libraries.places.api.net.IsOpenRequest isOpenRequest(java.lang.String str, java.lang.Long l, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.IsOpenRequest.Builder, kotlin.Unit> function1) {
        com.google.android.libraries.places.api.net.IsOpenRequest.Builder builder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (l == null) {
            builder = com.google.android.libraries.places.api.net.IsOpenRequest.builder(str);
        } else {
            builder = com.google.android.libraries.places.api.net.IsOpenRequest.builder(str, l.longValue());
        }
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.net.IsOpenRequest build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
