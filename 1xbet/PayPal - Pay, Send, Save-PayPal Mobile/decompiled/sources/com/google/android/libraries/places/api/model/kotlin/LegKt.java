package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/time/Duration;", "duration", "", "distanceMeters", "Lcom/google/android/libraries/places/api/model/Leg;", "leg", "(Ljava/time/Duration;I)Lcom/google/android/libraries/places/api/model/Leg;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LegKt {
    public static final com.google.android.libraries.places.api.model.Leg leg(java.time.Duration duration, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
        com.google.android.libraries.places.api.model.Leg newInstance = com.google.android.libraries.places.api.model.Leg.newInstance(duration, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }
}
