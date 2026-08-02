package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class SpecialDay implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.SpecialDay build();

        public abstract com.google.android.libraries.places.api.model.LocalDate getDate();

        public abstract boolean isExceptional();

        public abstract com.google.android.libraries.places.api.model.SpecialDay.Builder setDate(com.google.android.libraries.places.api.model.LocalDate localDate);

        public abstract com.google.android.libraries.places.api.model.SpecialDay.Builder setExceptional(boolean z);
    }

    public static com.google.android.libraries.places.api.model.SpecialDay.Builder builder(com.google.android.libraries.places.api.model.LocalDate localDate) {
        com.google.android.libraries.places.api.model.zzby zzbyVar = new com.google.android.libraries.places.api.model.zzby();
        zzbyVar.setDate(localDate);
        zzbyVar.setExceptional(false);
        return zzbyVar;
    }

    public abstract com.google.android.libraries.places.api.model.LocalDate getDate();

    public abstract boolean isExceptional();
}
