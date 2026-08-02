package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzbk {
    private final java.util.List zza = kotlin.collections.CollectionsKt.mutableListOf(com.google.android.libraries.places.api.model.Place.Field.ID, com.google.android.libraries.places.api.model.Place.Field.LOCATION, com.google.android.libraries.places.api.model.Place.Field.VIEWPORT, com.google.android.libraries.places.api.model.Place.Field.DISPLAY_NAME, com.google.android.libraries.places.api.model.Place.Field.GOOGLE_MAPS_URI);

    public final void zza() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.PHOTO_METADATAS);
    }

    public final void zzb() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.FORMATTED_ADDRESS);
    }

    public final void zzc() {
        java.util.List list = this.zza;
        list.add(com.google.android.libraries.places.api.model.Place.Field.USER_RATING_COUNT);
        list.add(com.google.android.libraries.places.api.model.Place.Field.RATING);
        zzn();
    }

    public final void zzd() {
        java.util.List list = this.zza;
        list.add(com.google.android.libraries.places.api.model.Place.Field.PRICE_LEVEL);
        list.add(com.google.android.libraries.places.api.model.Place.Field.PRICE_RANGE);
    }

    public final void zze() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.PRIMARY_TYPE_DISPLAY_NAME);
    }

    public final void zzf() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.ACCESSIBILITY_OPTIONS);
    }

    public final void zzg() {
        java.util.List list = this.zza;
        list.add(com.google.android.libraries.places.api.model.Place.Field.CURRENT_OPENING_HOURS);
        list.add(com.google.android.libraries.places.api.model.Place.Field.UTC_OFFSET);
        list.add(com.google.android.libraries.places.api.model.Place.Field.BUSINESS_STATUS);
    }

    public final void zzh() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.EDITORIAL_SUMMARY);
    }

    public final void zzi() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.WEBSITE_URI);
    }

    public final void zzj() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.INTERNATIONAL_PHONE_NUMBER);
    }

    public final void zzk() {
        java.util.List list = this.zza;
        list.add(com.google.android.libraries.places.api.model.Place.Field.EV_CHARGE_OPTIONS);
        list.add(com.google.android.libraries.places.api.model.Place.Field.FUEL_OPTIONS);
    }

    public final void zzl() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.REVIEWS);
    }

    public final void zzm() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.PLUS_CODE);
    }

    public final void zzn() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.CONSUMER_ALERT);
    }

    public final void zzo() {
        java.util.List list = this.zza;
        com.google.android.libraries.places.api.model.Place.Field field = com.google.android.libraries.places.api.model.Place.Field.DINE_IN;
        com.google.android.libraries.places.api.model.Place.Field field2 = com.google.android.libraries.places.api.model.Place.Field.OUTDOOR_SEATING;
        com.google.android.libraries.places.api.model.Place.Field field3 = com.google.android.libraries.places.api.model.Place.Field.RESERVABLE;
        com.google.android.libraries.places.api.model.Place.Field field4 = com.google.android.libraries.places.api.model.Place.Field.TAKEOUT;
        com.google.android.libraries.places.api.model.Place.Field field5 = com.google.android.libraries.places.api.model.Place.Field.DELIVERY;
        com.google.android.libraries.places.api.model.Place.Field field6 = com.google.android.libraries.places.api.model.Place.Field.CURBSIDE_PICKUP;
        com.google.android.libraries.places.api.model.Place.Field field7 = com.google.android.libraries.places.api.model.Place.Field.SERVES_BREAKFAST;
        com.google.android.libraries.places.api.model.Place.Field field8 = com.google.android.libraries.places.api.model.Place.Field.SERVES_LUNCH;
        com.google.android.libraries.places.api.model.Place.Field field9 = com.google.android.libraries.places.api.model.Place.Field.SERVES_BRUNCH;
        com.google.android.libraries.places.api.model.Place.Field field10 = com.google.android.libraries.places.api.model.Place.Field.SERVES_DINNER;
        com.google.android.libraries.places.api.model.Place.Field field11 = com.google.android.libraries.places.api.model.Place.Field.SERVES_DESSERT;
        com.google.android.libraries.places.api.model.Place.Field field12 = com.google.android.libraries.places.api.model.Place.Field.SERVES_BEER;
        com.google.android.libraries.places.api.model.Place.Field field13 = com.google.android.libraries.places.api.model.Place.Field.SERVES_WINE;
        com.google.android.libraries.places.api.model.Place.Field field14 = com.google.android.libraries.places.api.model.Place.Field.SERVES_COFFEE;
        com.google.android.libraries.places.api.model.Place.Field field15 = com.google.android.libraries.places.api.model.Place.Field.SERVES_COCKTAILS;
        com.google.android.libraries.places.api.model.Place.Field field16 = com.google.android.libraries.places.api.model.Place.Field.SERVES_VEGETARIAN_FOOD;
        com.google.android.libraries.places.api.model.Place.Field field17 = com.google.android.libraries.places.api.model.Place.Field.RESTROOM;
        com.google.android.libraries.places.api.model.Place.Field field18 = com.google.android.libraries.places.api.model.Place.Field.GOOD_FOR_GROUPS;
        com.google.android.libraries.places.api.model.Place.Field field19 = com.google.android.libraries.places.api.model.Place.Field.GOOD_FOR_WATCHING_SPORTS;
        com.google.android.libraries.places.api.model.Place.Field field20 = com.google.android.libraries.places.api.model.Place.Field.LIVE_MUSIC;
        list.addAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.google.android.libraries.places.api.model.Place.Field[]{com.google.android.libraries.places.api.model.Place.Field.ACCESSIBILITY_OPTIONS, field, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, com.google.android.libraries.places.api.model.Place.Field.PAYMENT_OPTIONS, com.google.android.libraries.places.api.model.Place.Field.GOOD_FOR_CHILDREN, com.google.android.libraries.places.api.model.Place.Field.MENU_FOR_CHILDREN, com.google.android.libraries.places.api.model.Place.Field.ALLOWS_DOGS, com.google.android.libraries.places.api.model.Place.Field.PARKING_OPTIONS}));
    }

    public final void zzp() {
        this.zza.add(com.google.android.libraries.places.api.model.Place.Field.GENERATIVE_SUMMARY);
    }

    public final java.util.List zzq() {
        return kotlin.collections.CollectionsKt.distinct(this.zza);
    }
}
