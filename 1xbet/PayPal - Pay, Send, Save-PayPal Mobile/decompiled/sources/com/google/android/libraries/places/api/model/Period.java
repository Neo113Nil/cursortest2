package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class Period implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.Period build();

        public abstract com.google.android.libraries.places.api.model.TimeOfWeek getClose();

        public abstract com.google.android.libraries.places.api.model.TimeOfWeek getOpen();

        public abstract com.google.android.libraries.places.api.model.Period.Builder setClose(com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek);

        public abstract com.google.android.libraries.places.api.model.Period.Builder setOpen(com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek);
    }

    public abstract com.google.android.libraries.places.api.model.TimeOfWeek getClose();

    public abstract com.google.android.libraries.places.api.model.TimeOfWeek getOpen();

    public static com.google.android.libraries.places.api.model.Period.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzba();
    }
}
