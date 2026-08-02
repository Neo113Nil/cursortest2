package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class PlusCode implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.PlusCode build();

        public abstract java.lang.String getCompoundCode();

        public abstract java.lang.String getGlobalCode();

        public abstract com.google.android.libraries.places.api.model.PlusCode.Builder setCompoundCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.PlusCode.Builder setGlobalCode(java.lang.String str);
    }

    public abstract java.lang.String getCompoundCode();

    public abstract java.lang.String getGlobalCode();

    public static com.google.android.libraries.places.api.model.PlusCode.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzbh();
    }
}
