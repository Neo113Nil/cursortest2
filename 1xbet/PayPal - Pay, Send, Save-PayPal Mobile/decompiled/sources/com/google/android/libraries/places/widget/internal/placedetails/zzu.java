package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzu {
    public static final java.lang.String zza(java.util.List list, android.content.Context context, java.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (instant == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.time.Instant availabilityLastUpdateTime = ((com.google.android.libraries.places.api.model.ConnectorAggregation) it.next()).getAvailabilityLastUpdateTime();
            if (availabilityLastUpdateTime != null) {
                arrayList.add(availabilityLastUpdateTime);
            }
        }
        java.time.Instant instant2 = (java.time.Instant) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList);
        if (instant2 == null) {
            return null;
        }
        java.time.Duration between = java.time.Duration.between(instant2, instant);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(between, "");
        if (between.toDays() > 0) {
            return context.getString(com.google.android.libraries.places.R.string.places_ev_charging_last_updated_days, java.lang.Long.valueOf(between.toDays()));
        }
        if (between.toHours() > 0) {
            return context.getString(com.google.android.libraries.places.R.string.places_ev_charging_last_updated_hours, java.lang.Long.valueOf(between.toHours()));
        }
        if (between.toMinutes() > 0) {
            return context.getString(com.google.android.libraries.places.R.string.places_ev_charging_last_updated_minutes, java.lang.Long.valueOf(between.toMinutes()));
        }
        if (between.toMillis() / 1000 < 0) {
            return null;
        }
        return context.getString(com.google.android.libraries.places.R.string.places_ev_charging_last_updated_now);
    }
}
