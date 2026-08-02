package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class AutocompletePrediction implements android.os.Parcelable {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.AutocompletePrediction build() {
            com.google.android.libraries.places.api.model.AutocompletePrediction zze = zze();
            setTypes(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zze.getTypes()));
            zzb(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zze.zzd()));
            zzc(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zze.zze()));
            zzd(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zze.zzf()));
            return zze();
        }

        public abstract java.lang.Integer getDistanceMeters();

        public abstract java.lang.String getFullText();

        public abstract java.lang.String getPrimaryText();

        public abstract java.lang.String getSecondaryText();

        public abstract java.util.List<java.lang.String> getTypes();

        public abstract com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setDistanceMeters(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setFullText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setPrimaryText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setSecondaryText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setTypes(java.util.List<java.lang.String> list);

        abstract com.google.android.libraries.places.api.model.AutocompletePrediction.Builder zza(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.AutocompletePrediction.Builder zzb(java.util.List list);

        public abstract com.google.android.libraries.places.api.model.AutocompletePrediction.Builder zzc(java.util.List list);

        public abstract com.google.android.libraries.places.api.model.AutocompletePrediction.Builder zzd(java.util.List list);

        abstract com.google.android.libraries.places.api.model.AutocompletePrediction zze();
    }

    public static com.google.android.libraries.places.api.model.AutocompletePrediction.Builder builder(java.lang.String str) {
        com.google.android.libraries.places.api.model.zzi zziVar = new com.google.android.libraries.places.api.model.zzi();
        zziVar.zzb(new java.util.ArrayList());
        zziVar.zza(str);
        zziVar.zzc(new java.util.ArrayList());
        zziVar.zzd(new java.util.ArrayList());
        zziVar.setTypes(new java.util.ArrayList());
        zziVar.setFullText("");
        zziVar.setPrimaryText("");
        zziVar.setSecondaryText("");
        return zziVar;
    }

    private static final android.text.SpannableString zzg(java.lang.String str, java.util.List list, android.text.style.CharacterStyle characterStyle) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (str.length() != 0 && characterStyle != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.libraries.places.api.model.zzfs zzfsVar = (com.google.android.libraries.places.api.model.zzfs) it.next();
                spannableString.setSpan(android.text.style.CharacterStyle.wrap(characterStyle), zzfsVar.zza(), zzfsVar.zza() + zzfsVar.zzb(), 0);
            }
        }
        return spannableString;
    }

    public abstract java.lang.Integer getDistanceMeters();

    public android.text.SpannableString getFullText(android.text.style.CharacterStyle characterStyle) {
        return zzg(zza(), zzd(), characterStyle);
    }

    public abstract java.lang.String getPlaceId();

    public android.text.SpannableString getPrimaryText(android.text.style.CharacterStyle characterStyle) {
        return zzg(zzb(), zze(), characterStyle);
    }

    public android.text.SpannableString getSecondaryText(android.text.style.CharacterStyle characterStyle) {
        return zzg(zzc(), zzf(), characterStyle);
    }

    public abstract java.util.List<java.lang.String> getTypes();

    abstract java.lang.String zza();

    abstract java.lang.String zzb();

    abstract java.lang.String zzc();

    abstract java.util.List zzd();

    abstract java.util.List zze();

    abstract java.util.List zzf();
}
