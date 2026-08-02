package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/google/android/libraries/places/api/model/DayOfWeek;", "day", "Lcom/google/android/libraries/places/api/model/LocalTime;", "localTime", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/TimeOfWeek$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/model/TimeOfWeek;", "timeOfWeek", "(Lcom/google/android/libraries/places/api/model/DayOfWeek;Lcom/google/android/libraries/places/api/model/LocalTime;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/TimeOfWeek;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TimeOfWeekKt {
    public static final com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek(com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek, com.google.android.libraries.places.api.model.LocalTime localTime, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.model.TimeOfWeek.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        com.google.android.libraries.places.api.model.TimeOfWeek.Builder builder = com.google.android.libraries.places.api.model.TimeOfWeek.builder(dayOfWeek, localTime);
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.model.TimeOfWeek build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek$default(com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek, com.google.android.libraries.places.api.model.LocalTime localTime, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return timeOfWeek(dayOfWeek, localTime, function1);
    }
}
