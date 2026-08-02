package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class AddressComponent implements android.os.Parcelable {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.AddressComponent build() {
            com.google.android.libraries.places.api.model.AddressComponent zzc = zzc();
            com.google.common.base.Preconditions.checkArgument(!zzc.getName().isEmpty(), "Name must not be empty.");
            java.util.List<java.lang.String> types = zzc.getTypes();
            java.util.Iterator<java.lang.String> it = types.iterator();
            while (it.hasNext()) {
                com.google.common.base.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(it.next()), "Types must not contain null or empty values.");
            }
            zzb(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) types));
            return zzc();
        }

        public abstract java.lang.String getShortName();

        public abstract com.google.android.libraries.places.api.model.AddressComponent.Builder setShortName(java.lang.String str);

        abstract com.google.android.libraries.places.api.model.AddressComponent.Builder zzb(java.util.List list);

        abstract com.google.android.libraries.places.api.model.AddressComponent zzc();
    }

    public static com.google.android.libraries.places.api.model.AddressComponent.Builder builder(java.lang.String str, java.util.List<java.lang.String> list) {
        com.google.android.libraries.places.api.model.zzc zzcVar = new com.google.android.libraries.places.api.model.zzc();
        zzcVar.zza(str);
        zzcVar.zzb(list);
        return zzcVar;
    }

    public abstract java.lang.String getName();

    public abstract java.lang.String getShortName();

    public abstract java.util.List<java.lang.String> getTypes();
}
