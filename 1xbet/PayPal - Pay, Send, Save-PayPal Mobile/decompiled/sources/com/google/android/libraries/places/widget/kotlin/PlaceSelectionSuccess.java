package com.google.android.libraries.places.widget.kotlin;

@kotlin.Deprecated(message = "Use PlaceAutocomplete and PredictionSelectionListener instead.", replaceWith = @kotlin.ReplaceWith(expression = "PredictionSelectionListener", imports = {"com.google.android.libraries.places.widget.PlaceAutocomplete", "com.google.android.libraries.places.widget.listener.PredictionSelectionListener"}))
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionSuccess;", "Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionResult;", "place", "Lcom/google/android/libraries/places/api/model/Place;", "<init>", "(Lcom/google/android/libraries/places/api/model/Place;)V", "getPlace", "()Lcom/google/android/libraries/places/api/model/Place;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "java.com.google.android.libraries.places.widget.kotlin_kotlin_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PlaceSelectionSuccess extends com.google.android.libraries.places.widget.kotlin.PlaceSelectionResult {
    private final com.google.android.libraries.places.api.model.Place zza;

    public final java.lang.String toString() {
        com.google.android.libraries.places.api.model.Place place = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(place).length() + 29);
        sb.append("PlaceSelectionSuccess(place=");
        sb.append(place);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final com.google.android.libraries.places.api.model.Place getPlace() {
        return this.zza;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.google.android.libraries.places.widget.kotlin.PlaceSelectionSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.zza, ((com.google.android.libraries.places.widget.kotlin.PlaceSelectionSuccess) other).zza);
    }

    public final com.google.android.libraries.places.widget.kotlin.PlaceSelectionSuccess copy(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        return new com.google.android.libraries.places.widget.kotlin.PlaceSelectionSuccess(place);
    }

    /* renamed from: component1, reason: from getter */
    public final com.google.android.libraries.places.api.model.Place getZza() {
        return this.zza;
    }

    public static /* synthetic */ com.google.android.libraries.places.widget.kotlin.PlaceSelectionSuccess copy$default(com.google.android.libraries.places.widget.kotlin.PlaceSelectionSuccess placeSelectionSuccess, com.google.android.libraries.places.api.model.Place place, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            place = placeSelectionSuccess.zza;
        }
        return placeSelectionSuccess.copy(place);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceSelectionSuccess(com.google.android.libraries.places.api.model.Place place) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        this.zza = place;
    }
}
