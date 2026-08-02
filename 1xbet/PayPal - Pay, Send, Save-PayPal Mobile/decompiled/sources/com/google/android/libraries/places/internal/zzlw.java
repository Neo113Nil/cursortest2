package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzlw {
    private static final com.google.common.collect.ImmutableMap zza = com.google.common.collect.ImmutableMap.builder().put(com.google.android.libraries.places.api.model.Place.Field.ADDRESS_COMPONENTS, "address_components").put(com.google.android.libraries.places.api.model.Place.Field.BUSINESS_STATUS, "business_status").put(com.google.android.libraries.places.api.model.Place.Field.CURBSIDE_PICKUP, "curbside_pickup").put(com.google.android.libraries.places.api.model.Place.Field.CURRENT_OPENING_HOURS, "current_opening_hours").put(com.google.android.libraries.places.api.model.Place.Field.DELIVERY, "delivery").put(com.google.android.libraries.places.api.model.Place.Field.DINE_IN, "dine_in").put(com.google.android.libraries.places.api.model.Place.Field.DISPLAY_NAME, "name").put(com.google.android.libraries.places.api.model.Place.Field.EDITORIAL_SUMMARY, "editorial_summary").put(com.google.android.libraries.places.api.model.Place.Field.FORMATTED_ADDRESS, "formatted_address").put(com.google.android.libraries.places.api.model.Place.Field.ICON_BACKGROUND_COLOR, "icon_background_color").put(com.google.android.libraries.places.api.model.Place.Field.ICON_MASK_URL, "icon_mask_base_uri").put(com.google.android.libraries.places.api.model.Place.Field.ID, "place_id").put(com.google.android.libraries.places.api.model.Place.Field.INTERNATIONAL_PHONE_NUMBER, "international_phone_number").put(com.google.android.libraries.places.api.model.Place.Field.LOCATION, "geometry/location").put(com.google.android.libraries.places.api.model.Place.Field.OPENING_HOURS, "opening_hours").put(com.google.android.libraries.places.api.model.Place.Field.PHOTO_METADATAS, "photos").put(com.google.android.libraries.places.api.model.Place.Field.PLUS_CODE, com.google.android.libraries.places.api.model.PlaceTypes.PLUS_CODE).put(com.google.android.libraries.places.api.model.Place.Field.PRICE_LEVEL, "price_level").put(com.google.android.libraries.places.api.model.Place.Field.RATING, "rating").put(com.google.android.libraries.places.api.model.Place.Field.RESERVABLE, "reservable").put(com.google.android.libraries.places.api.model.Place.Field.SECONDARY_OPENING_HOURS, "secondary_opening_hours").put(com.google.android.libraries.places.api.model.Place.Field.SERVES_BEER, "serves_beer").put(com.google.android.libraries.places.api.model.Place.Field.SERVES_BREAKFAST, "serves_breakfast").put(com.google.android.libraries.places.api.model.Place.Field.SERVES_BRUNCH, "serves_brunch").put(com.google.android.libraries.places.api.model.Place.Field.SERVES_DINNER, "serves_dinner").put(com.google.android.libraries.places.api.model.Place.Field.SERVES_LUNCH, "serves_lunch").put(com.google.android.libraries.places.api.model.Place.Field.SERVES_VEGETARIAN_FOOD, "serves_vegetarian_food").put(com.google.android.libraries.places.api.model.Place.Field.SERVES_WINE, "serves_wine").put(com.google.android.libraries.places.api.model.Place.Field.TAKEOUT, "takeout").put(com.google.android.libraries.places.api.model.Place.Field.TYPES, "types").put(com.google.android.libraries.places.api.model.Place.Field.USER_RATING_COUNT, "user_ratings_total").put(com.google.android.libraries.places.api.model.Place.Field.UTC_OFFSET, "utc_offset").put(com.google.android.libraries.places.api.model.Place.Field.VIEWPORT, "geometry/viewport").put(com.google.android.libraries.places.api.model.Place.Field.WEBSITE_URI, com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.IDV_WEBSITE).buildOrThrow();

    public static java.util.List zza(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) zza.get((com.google.android.libraries.places.api.model.Place.Field) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static java.lang.String zzb(java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) zza.get((com.google.android.libraries.places.api.model.Place.Field) it.next());
            if (!android.text.TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
