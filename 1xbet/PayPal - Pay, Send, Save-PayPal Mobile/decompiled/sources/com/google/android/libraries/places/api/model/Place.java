package com.google.android.libraries.places.api.model;

/* loaded from: classes.dex */
public abstract class Place implements android.os.Parcelable {
    public static final int PRICE_LEVEL_MAX_VALUE = 4;
    public static final int PRICE_LEVEL_MIN_VALUE = 0;
    public static final double RATING_MAX_VALUE = 5.0d;
    public static final double RATING_MIN_VALUE = 1.0d;

    /* loaded from: classes8.dex */
    public enum BooleanPlaceAttributeValue implements android.os.Parcelable {
        UNKNOWN,
        TRUE,
        FALSE;

        public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue> CREATOR = new com.google.android.libraries.places.api.model.zzgb();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.Place build() {
            com.google.android.libraries.places.api.model.Place zzb = zzb();
            java.util.List<java.lang.String> attributions = zzb.getAttributions();
            if (attributions != null) {
                java.util.Iterator<java.lang.String> it = attributions.iterator();
                while (it.hasNext()) {
                    com.google.common.base.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(it.next()), "Attributions must not contain null or empty values.");
                }
            }
            java.lang.Integer priceLevel = zzb.getPriceLevel();
            if (priceLevel != null) {
                com.google.common.base.Preconditions.checkArgument(com.google.common.collect.Range.closed(0, 4).contains(priceLevel), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, priceLevel);
            }
            java.lang.Double rating = zzb.getRating();
            if (rating != null) {
                java.lang.Double valueOf = java.lang.Double.valueOf(1.0d);
                java.lang.Double valueOf2 = java.lang.Double.valueOf(5.0d);
                com.google.common.base.Preconditions.checkArgument(com.google.common.collect.Range.closed(valueOf, valueOf2).contains(rating), "Rating must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, rating);
            }
            java.lang.Integer userRatingCount = zzb.getUserRatingCount();
            if (userRatingCount != null) {
                com.google.common.base.Preconditions.checkArgument(com.google.common.collect.Range.atLeast(0).contains(userRatingCount), "User Ratings Total must not be < 0, but was: %s.", userRatingCount);
            }
            if (attributions != null) {
                setAttributions(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) attributions));
            }
            java.util.List<com.google.android.libraries.places.api.model.PhotoMetadata> photoMetadatas = zzb.getPhotoMetadatas();
            if (photoMetadatas != null) {
                setPhotoMetadatas(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) photoMetadatas));
            }
            java.util.List<java.lang.String> placeTypes = zzb.getPlaceTypes();
            if (placeTypes != null) {
                setPlaceTypes(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) placeTypes));
            }
            java.util.List<com.google.android.libraries.places.api.model.OpeningHours> secondaryOpeningHours = zzb.getSecondaryOpeningHours();
            if (secondaryOpeningHours != null) {
                setSecondaryOpeningHours(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) secondaryOpeningHours));
            }
            java.util.List<com.google.android.libraries.places.api.model.Review> reviews = zzb.getReviews();
            if (reviews != null) {
                setReviews(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) reviews));
            }
            return zzb();
        }

        public abstract com.google.android.libraries.places.api.model.AccessibilityOptions getAccessibilityOptions();

        public abstract com.google.android.libraries.places.api.model.AddressComponents getAddressComponents();

        public abstract java.lang.String getAdrFormatAddress();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAllowsDogs();

        public abstract java.util.List<java.lang.String> getAttributions();

        public abstract com.google.android.libraries.places.api.model.Place.BusinessStatus getBusinessStatus();

        public abstract com.google.android.libraries.places.api.model.ConsumerAlert getConsumerAlert();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getCurbsidePickup();

        public abstract com.google.android.libraries.places.api.model.OpeningHours getCurrentOpeningHours();

        public abstract java.util.List<com.google.android.libraries.places.api.model.OpeningHours> getCurrentSecondaryOpeningHours();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getDelivery();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getDineIn();

        public abstract java.lang.String getDisplayName();

        public abstract java.lang.String getDisplayNameLanguageCode();

        public abstract java.lang.String getEditorialSummary();

        public abstract java.lang.String getEditorialSummaryLanguageCode();

        public abstract com.google.android.libraries.places.api.model.EvChargeAmenitySummary getEvChargeAmenitySummary();

        public abstract com.google.android.libraries.places.api.model.EVChargeOptions getEvChargeOptions();

        public abstract java.lang.String getFormattedAddress();

        public abstract com.google.android.libraries.places.api.model.FuelOptions getFuelOptions();

        public abstract com.google.android.libraries.places.api.model.GenerativeSummary getGenerativeSummary();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getGoodForChildren();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getGoodForGroups();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getGoodForWatchingSports();

        public abstract com.google.android.libraries.places.api.model.GoogleMapsLinks getGoogleMapsLinks();

        public abstract android.net.Uri getGoogleMapsUri();

        public abstract java.lang.Integer getIconBackgroundColor();

        public abstract java.lang.String getIconMaskUrl();

        public abstract java.lang.String getId();

        public abstract java.lang.String getInternationalPhoneNumber();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getLiveMusic();

        public abstract com.google.android.gms.maps.model.LatLng getLocation();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getMenuForChildren();

        public abstract java.lang.String getNationalPhoneNumber();

        public abstract com.google.android.libraries.places.api.model.NeighborhoodSummary getNeighborhoodSummary();

        public abstract com.google.android.libraries.places.api.model.OpeningHours getOpeningHours();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getOutdoorSeating();

        public abstract com.google.android.libraries.places.api.model.ParkingOptions getParkingOptions();

        public abstract com.google.android.libraries.places.api.model.PaymentOptions getPaymentOptions();

        public abstract java.util.List<com.google.android.libraries.places.api.model.PhotoMetadata> getPhotoMetadatas();

        public abstract java.util.List<java.lang.String> getPlaceTypes();

        public abstract com.google.android.libraries.places.api.model.PlusCode getPlusCode();

        public abstract java.lang.Integer getPriceLevel();

        public abstract java.lang.String getPrimaryType();

        public abstract java.lang.String getPrimaryTypeDisplayName();

        public abstract java.lang.String getPrimaryTypeDisplayNameLanguageCode();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPureServiceAreaBusiness();

        public abstract java.lang.Double getRating();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getReservable();

        public abstract java.lang.String getResourceName();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getRestroom();

        public abstract com.google.android.libraries.places.api.model.ReviewSummary getReviewSummary();

        public abstract java.util.List<com.google.android.libraries.places.api.model.Review> getReviews();

        public abstract java.util.List<com.google.android.libraries.places.api.model.OpeningHours> getSecondaryOpeningHours();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesBeer();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesBreakfast();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesBrunch();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesCocktails();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesCoffee();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesDessert();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesDinner();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesLunch();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesVegetarianFood();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesWine();

        public abstract java.lang.String getShortFormattedAddress();

        public abstract java.util.List<com.google.android.libraries.places.api.model.SubDestination> getSubDestinations();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getTakeout();

        public abstract java.lang.Integer getUserRatingCount();

        public abstract java.lang.Integer getUtcOffsetMinutes();

        public abstract com.google.android.gms.maps.model.LatLngBounds getViewport();

        public abstract android.net.Uri getWebsiteUri();

        public abstract com.google.android.libraries.places.api.model.Place.Builder setAccessibilityOptions(com.google.android.libraries.places.api.model.AccessibilityOptions accessibilityOptions);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setAddressComponents(com.google.android.libraries.places.api.model.AddressComponents addressComponents);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setAdrFormatAddress(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setAllowsDogs(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setAttributions(java.util.List<java.lang.String> list);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setBusinessStatus(com.google.android.libraries.places.api.model.Place.BusinessStatus businessStatus);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setConsumerAlert(com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setCurbsidePickup(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setCurrentOpeningHours(com.google.android.libraries.places.api.model.OpeningHours openingHours);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setCurrentSecondaryOpeningHours(java.util.List<com.google.android.libraries.places.api.model.OpeningHours> list);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setDelivery(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setDineIn(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setDisplayName(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setDisplayNameLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setEditorialSummary(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setEditorialSummaryLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setEvChargeAmenitySummary(com.google.android.libraries.places.api.model.EvChargeAmenitySummary evChargeAmenitySummary);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setEvChargeOptions(com.google.android.libraries.places.api.model.EVChargeOptions eVChargeOptions);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setFormattedAddress(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setFuelOptions(com.google.android.libraries.places.api.model.FuelOptions fuelOptions);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setGenerativeSummary(com.google.android.libraries.places.api.model.GenerativeSummary generativeSummary);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setGoodForChildren(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setGoodForGroups(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setGoodForWatchingSports(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setGoogleMapsLinks(com.google.android.libraries.places.api.model.GoogleMapsLinks googleMapsLinks);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setGoogleMapsUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setIconBackgroundColor(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setIconMaskUrl(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setId(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setInternationalPhoneNumber(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setLiveMusic(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setLocation(com.google.android.gms.maps.model.LatLng latLng);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setMenuForChildren(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setNationalPhoneNumber(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setNeighborhoodSummary(com.google.android.libraries.places.api.model.NeighborhoodSummary neighborhoodSummary);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setOpeningHours(com.google.android.libraries.places.api.model.OpeningHours openingHours);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setOutdoorSeating(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setParkingOptions(com.google.android.libraries.places.api.model.ParkingOptions parkingOptions);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setPaymentOptions(com.google.android.libraries.places.api.model.PaymentOptions paymentOptions);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setPhotoMetadatas(java.util.List<com.google.android.libraries.places.api.model.PhotoMetadata> list);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setPlaceTypes(java.util.List<java.lang.String> list);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setPlusCode(com.google.android.libraries.places.api.model.PlusCode plusCode);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setPriceLevel(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setPrimaryType(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setPrimaryTypeDisplayName(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setPrimaryTypeDisplayNameLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setPureServiceAreaBusiness(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setRating(java.lang.Double d);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setReservable(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setResourceName(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setRestroom(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setReviewSummary(com.google.android.libraries.places.api.model.ReviewSummary reviewSummary);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setReviews(java.util.List<com.google.android.libraries.places.api.model.Review> list);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setSecondaryOpeningHours(java.util.List<com.google.android.libraries.places.api.model.OpeningHours> list);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesBeer(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesBreakfast(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesBrunch(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesCocktails(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesCoffee(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesDessert(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesDinner(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesLunch(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesVegetarianFood(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setServesWine(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setShortFormattedAddress(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setSubDestinations(java.util.List<com.google.android.libraries.places.api.model.SubDestination> list);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setTakeout(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setUserRatingCount(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setUtcOffsetMinutes(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setViewport(com.google.android.gms.maps.model.LatLngBounds latLngBounds);

        public abstract com.google.android.libraries.places.api.model.Place.Builder setWebsiteUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.Place.Builder zza(com.google.android.libraries.places.api.model.zzgf zzgfVar);

        abstract com.google.android.libraries.places.api.model.Place zzb();
    }

    /* loaded from: classes4.dex */
    public enum BusinessStatus implements android.os.Parcelable {
        OPERATIONAL,
        CLOSED_TEMPORARILY,
        CLOSED_PERMANENTLY;

        public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.Place.BusinessStatus> CREATOR = new com.google.android.libraries.places.api.model.zzgc();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public enum Field implements android.os.Parcelable {
        ACCESSIBILITY_OPTIONS,
        ADDRESS_COMPONENTS,
        ADR_FORMAT_ADDRESS,
        ALLOWS_DOGS,
        BUSINESS_STATUS,
        CONSUMER_ALERT,
        CURBSIDE_PICKUP,
        CURRENT_OPENING_HOURS,
        CURRENT_SECONDARY_OPENING_HOURS,
        DELIVERY,
        DINE_IN,
        DISPLAY_NAME,
        EDITORIAL_SUMMARY,
        EV_CHARGE_AMENITY_SUMMARY,
        EV_CHARGE_OPTIONS,
        FORMATTED_ADDRESS,
        FUEL_OPTIONS,
        GENERATIVE_SUMMARY,
        GOOD_FOR_CHILDREN,
        GOOD_FOR_GROUPS,
        GOOD_FOR_WATCHING_SPORTS,
        GOOGLE_MAPS_LINKS,
        GOOGLE_MAPS_URI,
        ICON_BACKGROUND_COLOR,
        ICON_MASK_URL,
        ID,
        INTERNATIONAL_PHONE_NUMBER,
        LIVE_MUSIC,
        LOCATION,
        MENU_FOR_CHILDREN,
        NATIONAL_PHONE_NUMBER,
        NEIGHBORHOOD_SUMMARY,
        OPENING_HOURS,
        OUTDOOR_SEATING,
        PARKING_OPTIONS,
        PAYMENT_OPTIONS,
        PHOTO_METADATAS,
        PLUS_CODE,
        PRICE_LEVEL,
        PRIMARY_TYPE,
        PRIMARY_TYPE_DISPLAY_NAME,
        PURE_SERVICE_AREA_BUSINESS,
        RATING,
        RESERVABLE,
        RESOURCE_NAME,
        RESTROOM,
        REVIEWS,
        REVIEW_SUMMARY,
        SECONDARY_OPENING_HOURS,
        SERVES_BEER,
        SERVES_BREAKFAST,
        SERVES_BRUNCH,
        SERVES_COCKTAILS,
        SERVES_COFFEE,
        SERVES_DESSERT,
        SERVES_DINNER,
        SERVES_LUNCH,
        SERVES_VEGETARIAN_FOOD,
        SERVES_WINE,
        SHORT_FORMATTED_ADDRESS,
        SUB_DESTINATIONS,
        TAKEOUT,
        TYPES,
        USER_RATING_COUNT,
        UTC_OFFSET,
        VIEWPORT,
        WEBSITE_URI,
        PRICE_RANGE;

        public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.Place.Field> CREATOR = new com.google.android.libraries.places.api.model.zzgd();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static com.google.android.libraries.places.api.model.Place.Builder builder() {
        com.google.android.libraries.places.api.model.zzbe zzbeVar = new com.google.android.libraries.places.api.model.zzbe();
        zzbeVar.setCurbsidePickup(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setDelivery(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setDineIn(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setReservable(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesBeer(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesBreakfast(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesBrunch(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesDinner(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesLunch(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesVegetarianFood(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesWine(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setTakeout(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setOutdoorSeating(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setLiveMusic(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setMenuForChildren(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesCocktails(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesDessert(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setServesCoffee(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setGoodForChildren(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setAllowsDogs(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setRestroom(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setGoodForGroups(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setGoodForWatchingSports(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzbeVar.setPureServiceAreaBusiness(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        return zzbeVar;
    }

    public abstract com.google.android.libraries.places.api.model.AccessibilityOptions getAccessibilityOptions();

    public abstract com.google.android.libraries.places.api.model.AddressComponents getAddressComponents();

    public abstract java.lang.String getAdrFormatAddress();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAllowsDogs();

    public abstract java.util.List<java.lang.String> getAttributions();

    public abstract com.google.android.libraries.places.api.model.Place.BusinessStatus getBusinessStatus();

    public abstract com.google.android.libraries.places.api.model.ConsumerAlert getConsumerAlert();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getCurbsidePickup();

    public abstract com.google.android.libraries.places.api.model.OpeningHours getCurrentOpeningHours();

    public abstract java.util.List<com.google.android.libraries.places.api.model.OpeningHours> getCurrentSecondaryOpeningHours();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getDelivery();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getDineIn();

    public abstract java.lang.String getDisplayName();

    public abstract java.lang.String getDisplayNameLanguageCode();

    public abstract java.lang.String getEditorialSummary();

    public abstract java.lang.String getEditorialSummaryLanguageCode();

    public abstract com.google.android.libraries.places.api.model.EvChargeAmenitySummary getEvChargeAmenitySummary();

    public abstract com.google.android.libraries.places.api.model.EVChargeOptions getEvChargeOptions();

    public abstract java.lang.String getFormattedAddress();

    public abstract com.google.android.libraries.places.api.model.FuelOptions getFuelOptions();

    public abstract com.google.android.libraries.places.api.model.GenerativeSummary getGenerativeSummary();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getGoodForChildren();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getGoodForGroups();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getGoodForWatchingSports();

    public abstract com.google.android.libraries.places.api.model.GoogleMapsLinks getGoogleMapsLinks();

    public abstract android.net.Uri getGoogleMapsUri();

    public abstract java.lang.Integer getIconBackgroundColor();

    public abstract java.lang.String getIconMaskUrl();

    public abstract java.lang.String getId();

    public abstract java.lang.String getInternationalPhoneNumber();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getLiveMusic();

    public abstract com.google.android.gms.maps.model.LatLng getLocation();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getMenuForChildren();

    public abstract java.lang.String getNationalPhoneNumber();

    public abstract com.google.android.libraries.places.api.model.NeighborhoodSummary getNeighborhoodSummary();

    public abstract com.google.android.libraries.places.api.model.OpeningHours getOpeningHours();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getOutdoorSeating();

    public abstract com.google.android.libraries.places.api.model.ParkingOptions getParkingOptions();

    public abstract com.google.android.libraries.places.api.model.PaymentOptions getPaymentOptions();

    public abstract java.util.List<com.google.android.libraries.places.api.model.PhotoMetadata> getPhotoMetadatas();

    public abstract java.util.List<java.lang.String> getPlaceTypes();

    public abstract com.google.android.libraries.places.api.model.PlusCode getPlusCode();

    public abstract java.lang.Integer getPriceLevel();

    public abstract java.lang.String getPrimaryType();

    public abstract java.lang.String getPrimaryTypeDisplayName();

    public abstract java.lang.String getPrimaryTypeDisplayNameLanguageCode();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPureServiceAreaBusiness();

    public abstract java.lang.Double getRating();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getReservable();

    public abstract java.lang.String getResourceName();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getRestroom();

    public abstract com.google.android.libraries.places.api.model.ReviewSummary getReviewSummary();

    public abstract java.util.List<com.google.android.libraries.places.api.model.Review> getReviews();

    public abstract java.util.List<com.google.android.libraries.places.api.model.OpeningHours> getSecondaryOpeningHours();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesBeer();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesBreakfast();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesBrunch();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesCocktails();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesCoffee();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesDessert();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesDinner();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesLunch();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesVegetarianFood();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesWine();

    public abstract java.lang.String getShortFormattedAddress();

    public abstract java.util.List<com.google.android.libraries.places.api.model.SubDestination> getSubDestinations();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getTakeout();

    public abstract java.lang.Integer getUserRatingCount();

    public abstract java.lang.Integer getUtcOffsetMinutes();

    public abstract com.google.android.gms.maps.model.LatLngBounds getViewport();

    public abstract android.net.Uri getWebsiteUri();

    public abstract com.google.android.libraries.places.api.model.zzgf zza();
}
