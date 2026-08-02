package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzcj {
    public static final boolean zza(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue dineIn = place.getDineIn();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dineIn, "");
        if (zzm(dineIn)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue outdoorSeating = place.getOutdoorSeating();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outdoorSeating, "");
        if (zzm(outdoorSeating)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue reservable = place.getReservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(reservable, "");
        if (zzm(reservable)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue takeout = place.getTakeout();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(takeout, "");
        if (zzm(takeout)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue delivery = place.getDelivery();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(delivery, "");
        if (zzm(delivery)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue curbsidePickup = place.getCurbsidePickup();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(curbsidePickup, "");
        return zzm(curbsidePickup);
    }

    public static final boolean zzb(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesBreakfast = place.getServesBreakfast();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesBreakfast, "");
        if (zzm(servesBreakfast)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesLunch = place.getServesLunch();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesLunch, "");
        if (zzm(servesLunch)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesBrunch = place.getServesBrunch();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesBrunch, "");
        if (zzm(servesBrunch)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesDinner = place.getServesDinner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesDinner, "");
        if (zzm(servesDinner)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesDessert = place.getServesDessert();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesDessert, "");
        return zzm(servesDessert);
    }

    public static final boolean zzc(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.AccessibilityOptions accessibilityOptions = place.getAccessibilityOptions();
        if (accessibilityOptions == null) {
            return false;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue wheelchairAccessibleEntrance = accessibilityOptions.getWheelchairAccessibleEntrance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleEntrance, "");
        if (!zzm(wheelchairAccessibleEntrance)) {
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue wheelchairAccessibleParking = accessibilityOptions.getWheelchairAccessibleParking();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleParking, "");
            if (!zzm(wheelchairAccessibleParking)) {
                com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue wheelchairAccessibleSeating = accessibilityOptions.getWheelchairAccessibleSeating();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleSeating, "");
                if (!zzm(wheelchairAccessibleSeating)) {
                    com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue wheelchairAccessibleRestroom = accessibilityOptions.getWheelchairAccessibleRestroom();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleRestroom, "");
                    return zzm(wheelchairAccessibleRestroom);
                }
            }
        }
        return true;
    }

    public static final boolean zzd(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesBeer = place.getServesBeer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesBeer, "");
        if (zzm(servesBeer)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesWine = place.getServesWine();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesWine, "");
        if (zzm(servesWine)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesCoffee = place.getServesCoffee();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesCoffee, "");
        if (zzm(servesCoffee)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesCocktails = place.getServesCocktails();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesCocktails, "");
        if (zzm(servesCocktails)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue servesVegetarianFood = place.getServesVegetarianFood();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(servesVegetarianFood, "");
        return zzm(servesVegetarianFood);
    }

    public static final boolean zze(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue restroom = place.getRestroom();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(restroom, "");
        return zzm(restroom);
    }

    public static final boolean zzf(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue goodForGroups = place.getGoodForGroups();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goodForGroups, "");
        if (zzm(goodForGroups)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue goodForWatchingSports = place.getGoodForWatchingSports();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goodForWatchingSports, "");
        if (zzm(goodForWatchingSports)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue liveMusic = place.getLiveMusic();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(liveMusic, "");
        return zzm(liveMusic);
    }

    public static final boolean zzg(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.PaymentOptions paymentOptions = place.getPaymentOptions();
        if (paymentOptions == null) {
            return false;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue acceptsCreditCards = paymentOptions.getAcceptsCreditCards();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptsCreditCards, "");
        if (!zzm(acceptsCreditCards)) {
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue acceptsCashOnly = paymentOptions.getAcceptsCashOnly();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptsCashOnly, "");
            if (!zzm(acceptsCashOnly)) {
                com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue acceptsDebitCards = paymentOptions.getAcceptsDebitCards();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptsDebitCards, "");
                if (!zzm(acceptsDebitCards)) {
                    com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue acceptsNfc = paymentOptions.getAcceptsNfc();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptsNfc, "");
                    return zzm(acceptsNfc);
                }
            }
        }
        return true;
    }

    public static final boolean zzh(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue goodForChildren = place.getGoodForChildren();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goodForChildren, "");
        if (zzm(goodForChildren)) {
            return true;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue menuForChildren = place.getMenuForChildren();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(menuForChildren, "");
        return zzm(menuForChildren);
    }

    public static final boolean zzi(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue allowsDogs = place.getAllowsDogs();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowsDogs, "");
        return zzm(allowsDogs);
    }

    public static final boolean zzj(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.api.model.ParkingOptions parkingOptions = place.getParkingOptions();
        if (parkingOptions == null) {
            return false;
        }
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue freeParkingLot = parkingOptions.getFreeParkingLot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(freeParkingLot, "");
        if (!zzm(freeParkingLot)) {
            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue paidParkingLot = parkingOptions.getPaidParkingLot();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paidParkingLot, "");
            if (!zzm(paidParkingLot)) {
                com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue freeStreetParking = parkingOptions.getFreeStreetParking();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(freeStreetParking, "");
                if (!zzm(freeStreetParking)) {
                    com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue paidStreetParking = parkingOptions.getPaidStreetParking();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paidStreetParking, "");
                    if (!zzm(paidStreetParking)) {
                        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue valetParking = parkingOptions.getValetParking();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valetParking, "");
                        if (!zzm(valetParking)) {
                            com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue freeGarageParking = parkingOptions.getFreeGarageParking();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(freeGarageParking, "");
                            if (!zzm(freeGarageParking)) {
                                com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue paidGarageParking = parkingOptions.getPaidGarageParking();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paidGarageParking, "");
                                return zzm(paidGarageParking);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final boolean zzk(com.google.android.libraries.places.api.model.Place place, android.content.Context context, boolean z) {
        java.util.ArrayList arrayList;
        java.lang.String formattedAddress;
        java.lang.String internationalPhoneNumber;
        java.lang.String zzc;
        java.util.List<com.google.android.libraries.places.api.model.FuelPrice> fuelPrices;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.google.android.libraries.places.api.model.EVChargeOptions evChargeOptions = place.getEvChargeOptions();
        java.util.List<com.google.android.libraries.places.api.model.ConnectorAggregation> connectorAggregations = evChargeOptions != null ? evChargeOptions.getConnectorAggregations() : null;
        boolean z2 = (connectorAggregations == null || connectorAggregations.isEmpty()) ? false : true;
        com.google.android.libraries.places.api.model.FuelOptions fuelOptions = place.getFuelOptions();
        if (fuelOptions == null || (fuelPrices = fuelOptions.getFuelPrices()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : fuelPrices) {
                com.google.android.libraries.places.api.model.FuelPrice.FuelType type = ((com.google.android.libraries.places.api.model.FuelPrice) obj).getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                if (com.google.android.libraries.places.widget.internal.placedetails.zzz.zza(type)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        boolean z4 = (!z || (zzc = com.google.android.libraries.places.widget.internal.placedetails.zzag.zzc(place, context)) == null || kotlin.text.StringsKt.isBlank(zzc)) ? false : true;
        if (!z2 && !z3 && (((formattedAddress = place.getFormattedAddress()) == null || kotlin.text.StringsKt.isBlank(formattedAddress)) && !z4 && (((internationalPhoneNumber = place.getInternationalPhoneNumber()) == null || kotlin.text.StringsKt.isBlank(internationalPhoneNumber)) && zzl(place.getWebsiteUri())))) {
            com.google.android.libraries.places.api.model.PlusCode plusCode = place.getPlusCode();
            java.lang.String compoundCode = plusCode != null ? plusCode.getCompoundCode() : null;
            if ((compoundCode == null || kotlin.text.StringsKt.isBlank(compoundCode)) && place.getConsumerAlert() == null) {
                return false;
            }
        }
        return true;
    }

    private static final boolean zzl(android.net.Uri uri) {
        if (uri == null) {
            return true;
        }
        java.lang.String obj = uri.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return kotlin.text.StringsKt.isBlank(obj);
    }

    private static final boolean zzm(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        return booleanPlaceAttributeValue == com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.TRUE;
    }
}
