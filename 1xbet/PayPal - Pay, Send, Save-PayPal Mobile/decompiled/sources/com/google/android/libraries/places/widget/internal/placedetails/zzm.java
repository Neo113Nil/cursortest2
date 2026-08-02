package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzm {
    public static final java.util.List zza(com.google.android.libraries.places.api.model.Place place, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zza(place)) {
            java.lang.String string = context.getString(com.google.android.libraries.places.R.string.place_details_about_service_options);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue dineIn = place.getDineIn();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dineIn, "");
            if (zzb(dineIn)) {
                java.lang.String string2 = context.getString(com.google.android.libraries.places.R.string.place_details_dine_in_service_option);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string2));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue outdoorSeating = place.getOutdoorSeating();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outdoorSeating, "");
            if (zzb(outdoorSeating)) {
                java.lang.String string3 = context.getString(com.google.android.libraries.places.R.string.place_details_outdoor_seating_service_option);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string3));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue reservable = place.getReservable();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(reservable, "");
            if (zzb(reservable)) {
                java.lang.String string4 = context.getString(com.google.android.libraries.places.R.string.place_details_takes_reservations_service_option);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string4));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue takeout = place.getTakeout();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(takeout, "");
            if (zzb(takeout)) {
                java.lang.String string5 = context.getString(com.google.android.libraries.places.R.string.place_details_takeout_service_option);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string5));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue delivery = place.getDelivery();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(delivery, "");
            if (zzb(delivery)) {
                java.lang.String string6 = context.getString(com.google.android.libraries.places.R.string.place_details_delivery_service_option);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string6));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue curbsidePickup = place.getCurbsidePickup();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(curbsidePickup, "");
            if (zzb(curbsidePickup)) {
                java.lang.String string7 = context.getString(com.google.android.libraries.places.R.string.place_details_curbside_pickup_service_option);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string7));
            }
        }
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzb(place)) {
            java.lang.String string8 = context.getString(com.google.android.libraries.places.R.string.place_details_about_popular_for);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string8));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesBreakfast = place.getServesBreakfast();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesBreakfast, "");
            if (zzb(servesBreakfast)) {
                java.lang.String string9 = context.getString(com.google.android.libraries.places.R.string.place_details_popular_for_breakfast);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string9));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesLunch = place.getServesLunch();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesLunch, "");
            if (zzb(servesLunch)) {
                java.lang.String string10 = context.getString(com.google.android.libraries.places.R.string.place_details_popular_for_lunch);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string10));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesBrunch = place.getServesBrunch();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesBrunch, "");
            if (zzb(servesBrunch)) {
                java.lang.String string11 = context.getString(com.google.android.libraries.places.R.string.place_details_popular_for_brunch);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string11));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesDinner = place.getServesDinner();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesDinner, "");
            if (zzb(servesDinner)) {
                java.lang.String string12 = context.getString(com.google.android.libraries.places.R.string.place_details_popular_for_dinner);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string12));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesDessert = place.getServesDessert();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesDessert, "");
            if (zzb(servesDessert)) {
                java.lang.String string13 = context.getString(com.google.android.libraries.places.R.string.place_details_popular_for_dessert);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string13));
            }
        }
        com.google.android.libraries.places.api.model.AccessibilityOptions accessibilityOptions = place.getAccessibilityOptions();
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzc(place) && accessibilityOptions != null) {
            java.lang.String string14 = context.getString(com.google.android.libraries.places.R.string.place_details_about_accessibility);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string14, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string14));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue wheelchairAccessibleEntrance = accessibilityOptions.getWheelchairAccessibleEntrance();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleEntrance, "");
            if (zzb(wheelchairAccessibleEntrance)) {
                java.lang.String string15 = context.getString(com.google.android.libraries.places.R.string.place_details_accessibility_entrance);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string15, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string15));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue wheelchairAccessibleParking = accessibilityOptions.getWheelchairAccessibleParking();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleParking, "");
            if (zzb(wheelchairAccessibleParking)) {
                java.lang.String string16 = context.getString(com.google.android.libraries.places.R.string.place_details_accessibility_parking_lot);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string16, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string16));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue wheelchairAccessibleSeating = accessibilityOptions.getWheelchairAccessibleSeating();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleSeating, "");
            if (zzb(wheelchairAccessibleSeating)) {
                java.lang.String string17 = context.getString(com.google.android.libraries.places.R.string.place_details_accessibility_seating);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string17, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string17));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue wheelchairAccessibleRestroom = accessibilityOptions.getWheelchairAccessibleRestroom();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleRestroom, "");
            if (zzb(wheelchairAccessibleRestroom)) {
                java.lang.String string18 = context.getString(com.google.android.libraries.places.R.string.place_details_accessibility_restroom);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string18, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string18));
            }
        }
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzd(place)) {
            java.lang.String string19 = context.getString(com.google.android.libraries.places.R.string.place_details_about_offerings);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string19, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string19));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesBeer = place.getServesBeer();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesBeer, "");
            if (zzb(servesBeer)) {
                java.lang.String string20 = context.getString(com.google.android.libraries.places.R.string.place_details_offerings_beer);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string20, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string20));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesWine = place.getServesWine();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesWine, "");
            if (zzb(servesWine)) {
                java.lang.String string21 = context.getString(com.google.android.libraries.places.R.string.place_details_offerings_wine);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string21, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string21));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesCoffee = place.getServesCoffee();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesCoffee, "");
            if (zzb(servesCoffee)) {
                java.lang.String string22 = context.getString(com.google.android.libraries.places.R.string.place_details_offerings_coffee);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string22, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string22));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesCocktails = place.getServesCocktails();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesCocktails, "");
            if (zzb(servesCocktails)) {
                java.lang.String string23 = context.getString(com.google.android.libraries.places.R.string.place_details_offerings_cocktails);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string23, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string23));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesVegetarianFood = place.getServesVegetarianFood();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesVegetarianFood, "");
            if (zzb(servesVegetarianFood)) {
                java.lang.String string24 = context.getString(com.google.android.libraries.places.R.string.place_details_offerings_vegetarian_options);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string24, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string24));
            }
        }
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zze(place)) {
            java.lang.String string25 = context.getString(com.google.android.libraries.places.R.string.place_details_about_amenities);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string25, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string25));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue restroom = place.getRestroom();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(restroom, "");
            if (zzb(restroom)) {
                java.lang.String string26 = context.getString(com.google.android.libraries.places.R.string.place_details_amenities_restroom);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string26, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string26));
            }
        }
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzf(place)) {
            java.lang.String string27 = context.getString(com.google.android.libraries.places.R.string.place_details_about_known_for);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string27, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string27));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue goodForGroups = place.getGoodForGroups();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goodForGroups, "");
            if (zzb(goodForGroups)) {
                java.lang.String string28 = context.getString(com.google.android.libraries.places.R.string.place_details_known_for_groups);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string28, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string28));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue goodForWatchingSports = place.getGoodForWatchingSports();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goodForWatchingSports, "");
            if (zzb(goodForWatchingSports)) {
                java.lang.String string29 = context.getString(com.google.android.libraries.places.R.string.place_details_known_for_sports);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string29, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string29));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue liveMusic = place.getLiveMusic();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(liveMusic, "");
            if (zzb(liveMusic)) {
                java.lang.String string30 = context.getString(com.google.android.libraries.places.R.string.place_details_known_for_live_music);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string30, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string30));
            }
        }
        com.google.android.libraries.places.api.model.PaymentOptions paymentOptions = place.getPaymentOptions();
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzg(place) && paymentOptions != null) {
            java.lang.String string31 = context.getString(com.google.android.libraries.places.R.string.place_details_about_payments);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string31, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string31));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue acceptsCreditCards = paymentOptions.getAcceptsCreditCards();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptsCreditCards, "");
            if (zzb(acceptsCreditCards)) {
                java.lang.String string32 = context.getString(com.google.android.libraries.places.R.string.place_details_payments_credit_cards);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string32, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string32));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue acceptsDebitCards = paymentOptions.getAcceptsDebitCards();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptsDebitCards, "");
            if (zzb(acceptsDebitCards)) {
                java.lang.String string33 = context.getString(com.google.android.libraries.places.R.string.place_details_payments_debit_cards);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string33, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string33));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue acceptsNfc = paymentOptions.getAcceptsNfc();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptsNfc, "");
            if (zzb(acceptsNfc)) {
                java.lang.String string34 = context.getString(com.google.android.libraries.places.R.string.place_details_payments_nfc);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string34, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string34));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue acceptsCashOnly = paymentOptions.getAcceptsCashOnly();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptsCashOnly, "");
            if (zzb(acceptsCashOnly)) {
                java.lang.String string35 = context.getString(com.google.android.libraries.places.R.string.place_details_payments_cash_only);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string35, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string35));
            }
        }
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzh(place)) {
            java.lang.String string36 = context.getString(com.google.android.libraries.places.R.string.place_details_about_children);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string36, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string36));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue goodForChildren = place.getGoodForChildren();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goodForChildren, "");
            if (zzb(goodForChildren)) {
                java.lang.String string37 = context.getString(com.google.android.libraries.places.R.string.place_details_children_good_for_kids);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string37, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string37));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue menuForChildren = place.getMenuForChildren();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(menuForChildren, "");
            if (zzb(menuForChildren)) {
                java.lang.String string38 = context.getString(com.google.android.libraries.places.R.string.place_details_children_kids_menu);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string38, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string38));
            }
        }
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzi(place)) {
            java.lang.String string39 = context.getString(com.google.android.libraries.places.R.string.place_details_about_pets);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string39, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string39));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue allowsDogs = place.getAllowsDogs();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowsDogs, "");
            if (zzb(allowsDogs)) {
                java.lang.String string40 = context.getString(com.google.android.libraries.places.R.string.place_details_pets_dogs);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string40, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string40));
            }
        }
        com.google.android.libraries.places.api.model.ParkingOptions parkingOptions = place.getParkingOptions();
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzj(place) && parkingOptions != null) {
            java.lang.String string41 = context.getString(com.google.android.libraries.places.R.string.place_details_about_parking);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string41, "");
            arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzh(string41));
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue freeParkingLot = parkingOptions.getFreeParkingLot();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(freeParkingLot, "");
            if (zzb(freeParkingLot)) {
                java.lang.String string42 = context.getString(com.google.android.libraries.places.R.string.place_details_parking_free_parking_lot);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string42, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string42));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue paidParkingLot = parkingOptions.getPaidParkingLot();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paidParkingLot, "");
            if (zzb(paidParkingLot)) {
                java.lang.String string43 = context.getString(com.google.android.libraries.places.R.string.place_details_parking_paid_parking_lot);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string43, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string43));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue freeStreetParking = parkingOptions.getFreeStreetParking();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(freeStreetParking, "");
            if (zzb(freeStreetParking)) {
                java.lang.String string44 = context.getString(com.google.android.libraries.places.R.string.place_details_parking_free_street_parking);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string44, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string44));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue paidStreetParking = parkingOptions.getPaidStreetParking();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paidStreetParking, "");
            if (zzb(paidStreetParking)) {
                java.lang.String string45 = context.getString(com.google.android.libraries.places.R.string.place_details_parking_paid_street_parking);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string45, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string45));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue valetParking = parkingOptions.getValetParking();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valetParking, "");
            if (zzb(valetParking)) {
                java.lang.String string46 = context.getString(com.google.android.libraries.places.R.string.place_details_parking_valet);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string46, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string46));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue freeGarageParking = parkingOptions.getFreeGarageParking();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(freeGarageParking, "");
            if (zzb(freeGarageParking)) {
                java.lang.String string47 = context.getString(com.google.android.libraries.places.R.string.place_details_parking_free_garage_parking);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string47, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string47));
            }
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue paidGarageParking = parkingOptions.getPaidGarageParking();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paidGarageParking, "");
            if (zzb(paidGarageParking)) {
                java.lang.String string48 = context.getString(com.google.android.libraries.places.R.string.place_details_parking_paid_garage_parking);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string48, "");
                arrayList.add(new com.google.android.libraries.places.widget.internal.placedetails.zzg(string48));
            }
        }
        return arrayList;
    }

    private static final boolean zzb(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        return booleanPlaceAttributeValue == com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.TRUE;
    }
}
