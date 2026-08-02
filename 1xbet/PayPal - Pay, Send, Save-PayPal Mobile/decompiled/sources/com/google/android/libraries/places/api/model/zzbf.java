package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbf extends com.google.android.libraries.places.api.model.Place {
    private final com.google.android.libraries.places.api.model.PlusCode zzA;
    private final java.lang.Integer zzB;
    private final com.google.android.libraries.places.api.model.zzgf zzC;
    private final java.lang.String zzD;
    private final java.lang.String zzE;
    private final java.lang.String zzF;
    private final java.lang.Double zzG;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzH;
    private final java.util.List zzI;
    private final java.util.List zzJ;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzK;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzL;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzM;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzN;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzO;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzP;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzQ;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzR;
    private final java.lang.Integer zzS;
    private final java.lang.Integer zzT;
    private final com.google.android.gms.maps.model.LatLngBounds zzU;
    private final android.net.Uri zzV;
    private final android.net.Uri zzW;
    private final com.google.android.libraries.places.api.model.AccessibilityOptions zzX;
    private final com.google.android.libraries.places.api.model.ParkingOptions zzY;
    private final com.google.android.libraries.places.api.model.PaymentOptions zzZ;
    private final java.lang.String zza;
    private final com.google.android.libraries.places.api.model.EVChargeOptions zzaa;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzab;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzac;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzad;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzae;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzaf;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzag;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzah;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzai;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzaj;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzak;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzal;
    private final java.util.List zzam;
    private final com.google.android.libraries.places.api.model.FuelOptions zzan;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzao;
    private final com.google.android.libraries.places.api.model.GenerativeSummary zzap;
    private final com.google.android.libraries.places.api.model.EvChargeAmenitySummary zzaq;
    private final com.google.android.libraries.places.api.model.NeighborhoodSummary zzar;
    private final com.google.android.libraries.places.api.model.ReviewSummary zzas;
    private final com.google.android.libraries.places.api.model.GoogleMapsLinks zzat;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final com.google.android.libraries.places.api.model.AddressComponents zzd;
    private final java.util.List zze;
    private final com.google.android.libraries.places.api.model.Place.BusinessStatus zzf;
    private final com.google.android.libraries.places.api.model.ConsumerAlert zzg;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzh;
    private final com.google.android.libraries.places.api.model.OpeningHours zzi;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzj;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzk;
    private final java.lang.String zzl;
    private final java.lang.String zzm;
    private final java.lang.Integer zzn;
    private final java.lang.String zzo;
    private final java.lang.String zzp;
    private final com.google.android.gms.maps.model.LatLng zzq;
    private final java.lang.String zzr;
    private final java.lang.String zzs;
    private final java.lang.String zzt;
    private final com.google.android.libraries.places.api.model.OpeningHours zzu;
    private final java.lang.String zzv;
    private final java.lang.String zzw;
    private final java.util.List zzx;
    private final java.util.List zzy;
    private final java.util.List zzz;

    zzbf(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.libraries.places.api.model.AddressComponents addressComponents, java.util.List list, com.google.android.libraries.places.api.model.Place.BusinessStatus businessStatus, com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, com.google.android.libraries.places.api.model.OpeningHours openingHours, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, java.lang.String str6, java.lang.String str7, com.google.android.gms.maps.model.LatLng latLng, java.lang.String str8, java.lang.String str9, java.lang.String str10, com.google.android.libraries.places.api.model.OpeningHours openingHours2, java.lang.String str11, java.lang.String str12, java.util.List list2, java.util.List list3, java.util.List list4, com.google.android.libraries.places.api.model.PlusCode plusCode, java.lang.Integer num2, com.google.android.libraries.places.api.model.zzgf zzgfVar, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.Double d, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, java.util.List list5, java.util.List list6, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, java.lang.Integer num3, java.lang.Integer num4, com.google.android.gms.maps.model.LatLngBounds latLngBounds, android.net.Uri uri, android.net.Uri uri2, com.google.android.libraries.places.api.model.AccessibilityOptions accessibilityOptions, com.google.android.libraries.places.api.model.ParkingOptions parkingOptions, com.google.android.libraries.places.api.model.PaymentOptions paymentOptions, com.google.android.libraries.places.api.model.EVChargeOptions eVChargeOptions, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23, java.util.List list7, com.google.android.libraries.places.api.model.FuelOptions fuelOptions, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24, com.google.android.libraries.places.api.model.GenerativeSummary generativeSummary, com.google.android.libraries.places.api.model.EvChargeAmenitySummary evChargeAmenitySummary, com.google.android.libraries.places.api.model.NeighborhoodSummary neighborhoodSummary, com.google.android.libraries.places.api.model.ReviewSummary reviewSummary, com.google.android.libraries.places.api.model.GoogleMapsLinks googleMapsLinks) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = addressComponents;
        this.zze = list;
        this.zzf = businessStatus;
        this.zzg = consumerAlert;
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null curbsidePickup");
        }
        this.zzh = booleanPlaceAttributeValue;
        this.zzi = openingHours;
        if (booleanPlaceAttributeValue2 == null) {
            throw new java.lang.NullPointerException("Null delivery");
        }
        this.zzj = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            throw new java.lang.NullPointerException("Null dineIn");
        }
        this.zzk = booleanPlaceAttributeValue3;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = num;
        this.zzo = str6;
        this.zzp = str7;
        this.zzq = latLng;
        this.zzr = str8;
        this.zzs = str9;
        this.zzt = str10;
        this.zzu = openingHours2;
        this.zzv = str11;
        this.zzw = str12;
        this.zzx = list2;
        this.zzy = list3;
        this.zzz = list4;
        this.zzA = plusCode;
        this.zzB = num2;
        this.zzC = zzgfVar;
        this.zzD = str13;
        this.zzE = str14;
        this.zzF = str15;
        this.zzG = d;
        if (booleanPlaceAttributeValue4 == null) {
            throw new java.lang.NullPointerException("Null reservable");
        }
        this.zzH = booleanPlaceAttributeValue4;
        this.zzI = list5;
        this.zzJ = list6;
        if (booleanPlaceAttributeValue5 == null) {
            throw new java.lang.NullPointerException("Null servesBeer");
        }
        this.zzK = booleanPlaceAttributeValue5;
        if (booleanPlaceAttributeValue6 == null) {
            throw new java.lang.NullPointerException("Null servesBreakfast");
        }
        this.zzL = booleanPlaceAttributeValue6;
        if (booleanPlaceAttributeValue7 == null) {
            throw new java.lang.NullPointerException("Null servesBrunch");
        }
        this.zzM = booleanPlaceAttributeValue7;
        if (booleanPlaceAttributeValue8 == null) {
            throw new java.lang.NullPointerException("Null servesDinner");
        }
        this.zzN = booleanPlaceAttributeValue8;
        if (booleanPlaceAttributeValue9 == null) {
            throw new java.lang.NullPointerException("Null servesLunch");
        }
        this.zzO = booleanPlaceAttributeValue9;
        if (booleanPlaceAttributeValue10 == null) {
            throw new java.lang.NullPointerException("Null servesVegetarianFood");
        }
        this.zzP = booleanPlaceAttributeValue10;
        if (booleanPlaceAttributeValue11 == null) {
            throw new java.lang.NullPointerException("Null servesWine");
        }
        this.zzQ = booleanPlaceAttributeValue11;
        if (booleanPlaceAttributeValue12 == null) {
            throw new java.lang.NullPointerException("Null takeout");
        }
        this.zzR = booleanPlaceAttributeValue12;
        this.zzS = num3;
        this.zzT = num4;
        this.zzU = latLngBounds;
        this.zzV = uri;
        this.zzW = uri2;
        this.zzX = accessibilityOptions;
        this.zzY = parkingOptions;
        this.zzZ = paymentOptions;
        this.zzaa = eVChargeOptions;
        if (booleanPlaceAttributeValue13 == null) {
            throw new java.lang.NullPointerException("Null outdoorSeating");
        }
        this.zzab = booleanPlaceAttributeValue13;
        if (booleanPlaceAttributeValue14 == null) {
            throw new java.lang.NullPointerException("Null liveMusic");
        }
        this.zzac = booleanPlaceAttributeValue14;
        if (booleanPlaceAttributeValue15 == null) {
            throw new java.lang.NullPointerException("Null menuForChildren");
        }
        this.zzad = booleanPlaceAttributeValue15;
        if (booleanPlaceAttributeValue16 == null) {
            throw new java.lang.NullPointerException("Null servesCocktails");
        }
        this.zzae = booleanPlaceAttributeValue16;
        if (booleanPlaceAttributeValue17 == null) {
            throw new java.lang.NullPointerException("Null servesDessert");
        }
        this.zzaf = booleanPlaceAttributeValue17;
        if (booleanPlaceAttributeValue18 == null) {
            throw new java.lang.NullPointerException("Null servesCoffee");
        }
        this.zzag = booleanPlaceAttributeValue18;
        if (booleanPlaceAttributeValue19 == null) {
            throw new java.lang.NullPointerException("Null goodForChildren");
        }
        this.zzah = booleanPlaceAttributeValue19;
        if (booleanPlaceAttributeValue20 == null) {
            throw new java.lang.NullPointerException("Null allowsDogs");
        }
        this.zzai = booleanPlaceAttributeValue20;
        if (booleanPlaceAttributeValue21 == null) {
            throw new java.lang.NullPointerException("Null restroom");
        }
        this.zzaj = booleanPlaceAttributeValue21;
        if (booleanPlaceAttributeValue22 == null) {
            throw new java.lang.NullPointerException("Null goodForGroups");
        }
        this.zzak = booleanPlaceAttributeValue22;
        if (booleanPlaceAttributeValue23 == null) {
            throw new java.lang.NullPointerException("Null goodForWatchingSports");
        }
        this.zzal = booleanPlaceAttributeValue23;
        this.zzam = list7;
        this.zzan = fuelOptions;
        if (booleanPlaceAttributeValue24 == null) {
            throw new java.lang.NullPointerException("Null pureServiceAreaBusiness");
        }
        this.zzao = booleanPlaceAttributeValue24;
        this.zzap = generativeSummary;
        this.zzaq = evChargeAmenitySummary;
        this.zzar = neighborhoodSummary;
        this.zzas = reviewSummary;
        this.zzat = googleMapsLinks;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.Place)) {
            return false;
        }
        com.google.android.libraries.places.api.model.Place place = (com.google.android.libraries.places.api.model.Place) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (place.getFormattedAddress() != null) {
                return false;
            }
        } else if (!str.equals(place.getFormattedAddress())) {
            return false;
        }
        java.lang.String str2 = this.zzb;
        if (str2 == null) {
            if (place.getShortFormattedAddress() != null) {
                return false;
            }
        } else if (!str2.equals(place.getShortFormattedAddress())) {
            return false;
        }
        java.lang.String str3 = this.zzc;
        if (str3 == null) {
            if (place.getAdrFormatAddress() != null) {
                return false;
            }
        } else if (!str3.equals(place.getAdrFormatAddress())) {
            return false;
        }
        com.google.android.libraries.places.api.model.AddressComponents addressComponents = this.zzd;
        if (addressComponents == null) {
            if (place.getAddressComponents() != null) {
                return false;
            }
        } else if (!addressComponents.equals(place.getAddressComponents())) {
            return false;
        }
        java.util.List list = this.zze;
        if (list == null) {
            if (place.getAttributions() != null) {
                return false;
            }
        } else if (!list.equals(place.getAttributions())) {
            return false;
        }
        com.google.android.libraries.places.api.model.Place.BusinessStatus businessStatus = this.zzf;
        if (businessStatus == null) {
            if (place.getBusinessStatus() != null) {
                return false;
            }
        } else if (!businessStatus.equals(place.getBusinessStatus())) {
            return false;
        }
        com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert = this.zzg;
        if (consumerAlert == null) {
            if (place.getConsumerAlert() != null) {
                return false;
            }
        } else if (!consumerAlert.equals(place.getConsumerAlert())) {
            return false;
        }
        if (!this.zzh.equals(place.getCurbsidePickup())) {
            return false;
        }
        com.google.android.libraries.places.api.model.OpeningHours openingHours = this.zzi;
        if (openingHours == null) {
            if (place.getCurrentOpeningHours() != null) {
                return false;
            }
        } else if (!openingHours.equals(place.getCurrentOpeningHours())) {
            return false;
        }
        if (!this.zzj.equals(place.getDelivery()) || !this.zzk.equals(place.getDineIn())) {
            return false;
        }
        java.lang.String str4 = this.zzl;
        if (str4 == null) {
            if (place.getEditorialSummary() != null) {
                return false;
            }
        } else if (!str4.equals(place.getEditorialSummary())) {
            return false;
        }
        java.lang.String str5 = this.zzm;
        if (str5 == null) {
            if (place.getEditorialSummaryLanguageCode() != null) {
                return false;
            }
        } else if (!str5.equals(place.getEditorialSummaryLanguageCode())) {
            return false;
        }
        java.lang.Integer num = this.zzn;
        if (num == null) {
            if (place.getIconBackgroundColor() != null) {
                return false;
            }
        } else if (!num.equals(place.getIconBackgroundColor())) {
            return false;
        }
        java.lang.String str6 = this.zzo;
        if (str6 == null) {
            if (place.getIconMaskUrl() != null) {
                return false;
            }
        } else if (!str6.equals(place.getIconMaskUrl())) {
            return false;
        }
        java.lang.String str7 = this.zzp;
        if (str7 == null) {
            if (place.getId() != null) {
                return false;
            }
        } else if (!str7.equals(place.getId())) {
            return false;
        }
        com.google.android.gms.maps.model.LatLng latLng = this.zzq;
        if (latLng == null) {
            if (place.getLocation() != null) {
                return false;
            }
        } else if (!latLng.equals(place.getLocation())) {
            return false;
        }
        java.lang.String str8 = this.zzr;
        if (str8 == null) {
            if (place.getDisplayName() != null) {
                return false;
            }
        } else if (!str8.equals(place.getDisplayName())) {
            return false;
        }
        java.lang.String str9 = this.zzs;
        if (str9 == null) {
            if (place.getDisplayNameLanguageCode() != null) {
                return false;
            }
        } else if (!str9.equals(place.getDisplayNameLanguageCode())) {
            return false;
        }
        java.lang.String str10 = this.zzt;
        if (str10 == null) {
            if (place.getResourceName() != null) {
                return false;
            }
        } else if (!str10.equals(place.getResourceName())) {
            return false;
        }
        com.google.android.libraries.places.api.model.OpeningHours openingHours2 = this.zzu;
        if (openingHours2 == null) {
            if (place.getOpeningHours() != null) {
                return false;
            }
        } else if (!openingHours2.equals(place.getOpeningHours())) {
            return false;
        }
        java.lang.String str11 = this.zzv;
        if (str11 == null) {
            if (place.getInternationalPhoneNumber() != null) {
                return false;
            }
        } else if (!str11.equals(place.getInternationalPhoneNumber())) {
            return false;
        }
        java.lang.String str12 = this.zzw;
        if (str12 == null) {
            if (place.getNationalPhoneNumber() != null) {
                return false;
            }
        } else if (!str12.equals(place.getNationalPhoneNumber())) {
            return false;
        }
        java.util.List list2 = this.zzx;
        if (list2 == null) {
            if (place.getPhotoMetadatas() != null) {
                return false;
            }
        } else if (!list2.equals(place.getPhotoMetadatas())) {
            return false;
        }
        java.util.List list3 = this.zzy;
        if (list3 == null) {
            if (place.getReviews() != null) {
                return false;
            }
        } else if (!list3.equals(place.getReviews())) {
            return false;
        }
        java.util.List list4 = this.zzz;
        if (list4 == null) {
            if (place.getPlaceTypes() != null) {
                return false;
            }
        } else if (!list4.equals(place.getPlaceTypes())) {
            return false;
        }
        com.google.android.libraries.places.api.model.PlusCode plusCode = this.zzA;
        if (plusCode == null) {
            if (place.getPlusCode() != null) {
                return false;
            }
        } else if (!plusCode.equals(place.getPlusCode())) {
            return false;
        }
        java.lang.Integer num2 = this.zzB;
        if (num2 == null) {
            if (place.getPriceLevel() != null) {
                return false;
            }
        } else if (!num2.equals(place.getPriceLevel())) {
            return false;
        }
        com.google.android.libraries.places.api.model.zzgf zzgfVar = this.zzC;
        if (zzgfVar == null) {
            if (place.zza() != null) {
                return false;
            }
        } else if (!zzgfVar.equals(place.zza())) {
            return false;
        }
        java.lang.String str13 = this.zzD;
        if (str13 == null) {
            if (place.getPrimaryType() != null) {
                return false;
            }
        } else if (!str13.equals(place.getPrimaryType())) {
            return false;
        }
        java.lang.String str14 = this.zzE;
        if (str14 == null) {
            if (place.getPrimaryTypeDisplayName() != null) {
                return false;
            }
        } else if (!str14.equals(place.getPrimaryTypeDisplayName())) {
            return false;
        }
        java.lang.String str15 = this.zzF;
        if (str15 == null) {
            if (place.getPrimaryTypeDisplayNameLanguageCode() != null) {
                return false;
            }
        } else if (!str15.equals(place.getPrimaryTypeDisplayNameLanguageCode())) {
            return false;
        }
        java.lang.Double d = this.zzG;
        if (d == null) {
            if (place.getRating() != null) {
                return false;
            }
        } else if (!d.equals(place.getRating())) {
            return false;
        }
        if (!this.zzH.equals(place.getReservable())) {
            return false;
        }
        java.util.List list5 = this.zzI;
        if (list5 == null) {
            if (place.getSecondaryOpeningHours() != null) {
                return false;
            }
        } else if (!list5.equals(place.getSecondaryOpeningHours())) {
            return false;
        }
        java.util.List list6 = this.zzJ;
        if (list6 == null) {
            if (place.getCurrentSecondaryOpeningHours() != null) {
                return false;
            }
        } else if (!list6.equals(place.getCurrentSecondaryOpeningHours())) {
            return false;
        }
        if (!this.zzK.equals(place.getServesBeer()) || !this.zzL.equals(place.getServesBreakfast()) || !this.zzM.equals(place.getServesBrunch()) || !this.zzN.equals(place.getServesDinner()) || !this.zzO.equals(place.getServesLunch()) || !this.zzP.equals(place.getServesVegetarianFood()) || !this.zzQ.equals(place.getServesWine()) || !this.zzR.equals(place.getTakeout())) {
            return false;
        }
        java.lang.Integer num3 = this.zzS;
        if (num3 == null) {
            if (place.getUserRatingCount() != null) {
                return false;
            }
        } else if (!num3.equals(place.getUserRatingCount())) {
            return false;
        }
        java.lang.Integer num4 = this.zzT;
        if (num4 == null) {
            if (place.getUtcOffsetMinutes() != null) {
                return false;
            }
        } else if (!num4.equals(place.getUtcOffsetMinutes())) {
            return false;
        }
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = this.zzU;
        if (latLngBounds == null) {
            if (place.getViewport() != null) {
                return false;
            }
        } else if (!latLngBounds.equals(place.getViewport())) {
            return false;
        }
        android.net.Uri uri = this.zzV;
        if (uri == null) {
            if (place.getWebsiteUri() != null) {
                return false;
            }
        } else if (!uri.equals(place.getWebsiteUri())) {
            return false;
        }
        android.net.Uri uri2 = this.zzW;
        if (uri2 == null) {
            if (place.getGoogleMapsUri() != null) {
                return false;
            }
        } else if (!uri2.equals(place.getGoogleMapsUri())) {
            return false;
        }
        com.google.android.libraries.places.api.model.AccessibilityOptions accessibilityOptions = this.zzX;
        if (accessibilityOptions == null) {
            if (place.getAccessibilityOptions() != null) {
                return false;
            }
        } else if (!accessibilityOptions.equals(place.getAccessibilityOptions())) {
            return false;
        }
        com.google.android.libraries.places.api.model.ParkingOptions parkingOptions = this.zzY;
        if (parkingOptions == null) {
            if (place.getParkingOptions() != null) {
                return false;
            }
        } else if (!parkingOptions.equals(place.getParkingOptions())) {
            return false;
        }
        com.google.android.libraries.places.api.model.PaymentOptions paymentOptions = this.zzZ;
        if (paymentOptions == null) {
            if (place.getPaymentOptions() != null) {
                return false;
            }
        } else if (!paymentOptions.equals(place.getPaymentOptions())) {
            return false;
        }
        com.google.android.libraries.places.api.model.EVChargeOptions eVChargeOptions = this.zzaa;
        if (eVChargeOptions == null) {
            if (place.getEvChargeOptions() != null) {
                return false;
            }
        } else if (!eVChargeOptions.equals(place.getEvChargeOptions())) {
            return false;
        }
        if (!this.zzab.equals(place.getOutdoorSeating()) || !this.zzac.equals(place.getLiveMusic()) || !this.zzad.equals(place.getMenuForChildren()) || !this.zzae.equals(place.getServesCocktails()) || !this.zzaf.equals(place.getServesDessert()) || !this.zzag.equals(place.getServesCoffee()) || !this.zzah.equals(place.getGoodForChildren()) || !this.zzai.equals(place.getAllowsDogs()) || !this.zzaj.equals(place.getRestroom()) || !this.zzak.equals(place.getGoodForGroups()) || !this.zzal.equals(place.getGoodForWatchingSports())) {
            return false;
        }
        java.util.List list7 = this.zzam;
        if (list7 == null) {
            if (place.getSubDestinations() != null) {
                return false;
            }
        } else if (!list7.equals(place.getSubDestinations())) {
            return false;
        }
        com.google.android.libraries.places.api.model.FuelOptions fuelOptions = this.zzan;
        if (fuelOptions == null) {
            if (place.getFuelOptions() != null) {
                return false;
            }
        } else if (!fuelOptions.equals(place.getFuelOptions())) {
            return false;
        }
        if (!this.zzao.equals(place.getPureServiceAreaBusiness())) {
            return false;
        }
        com.google.android.libraries.places.api.model.GenerativeSummary generativeSummary = this.zzap;
        if (generativeSummary == null) {
            if (place.getGenerativeSummary() != null) {
                return false;
            }
        } else if (!generativeSummary.equals(place.getGenerativeSummary())) {
            return false;
        }
        com.google.android.libraries.places.api.model.EvChargeAmenitySummary evChargeAmenitySummary = this.zzaq;
        if (evChargeAmenitySummary == null) {
            if (place.getEvChargeAmenitySummary() != null) {
                return false;
            }
        } else if (!evChargeAmenitySummary.equals(place.getEvChargeAmenitySummary())) {
            return false;
        }
        com.google.android.libraries.places.api.model.NeighborhoodSummary neighborhoodSummary = this.zzar;
        if (neighborhoodSummary == null) {
            if (place.getNeighborhoodSummary() != null) {
                return false;
            }
        } else if (!neighborhoodSummary.equals(place.getNeighborhoodSummary())) {
            return false;
        }
        com.google.android.libraries.places.api.model.ReviewSummary reviewSummary = this.zzas;
        if (reviewSummary == null) {
            if (place.getReviewSummary() != null) {
                return false;
            }
        } else if (!reviewSummary.equals(place.getReviewSummary())) {
            return false;
        }
        com.google.android.libraries.places.api.model.GoogleMapsLinks googleMapsLinks = this.zzat;
        if (googleMapsLinks == null) {
            if (place.getGoogleMapsLinks() != null) {
                return false;
            }
        } else if (!googleMapsLinks.equals(place.getGoogleMapsLinks())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.util.List list = this.zzJ;
        java.util.List list2 = this.zzI;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzH;
        com.google.android.libraries.places.api.model.zzgf zzgfVar = this.zzC;
        com.google.android.libraries.places.api.model.PlusCode plusCode = this.zzA;
        java.util.List list3 = this.zzz;
        java.util.List list4 = this.zzy;
        java.util.List list5 = this.zzx;
        com.google.android.libraries.places.api.model.OpeningHours openingHours = this.zzu;
        com.google.android.gms.maps.model.LatLng latLng = this.zzq;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2 = this.zzk;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3 = this.zzj;
        com.google.android.libraries.places.api.model.OpeningHours openingHours2 = this.zzi;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4 = this.zzh;
        com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert = this.zzg;
        com.google.android.libraries.places.api.model.Place.BusinessStatus businessStatus = this.zzf;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzd);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zze);
        java.lang.String valueOf3 = java.lang.String.valueOf(businessStatus);
        java.lang.String valueOf4 = java.lang.String.valueOf(consumerAlert);
        java.lang.String obj = booleanPlaceAttributeValue4.toString();
        java.lang.String valueOf5 = java.lang.String.valueOf(openingHours2);
        java.lang.String obj2 = booleanPlaceAttributeValue3.toString();
        java.lang.String obj3 = booleanPlaceAttributeValue2.toString();
        java.lang.String valueOf6 = java.lang.String.valueOf(latLng);
        java.lang.String valueOf7 = java.lang.String.valueOf(openingHours);
        java.lang.String valueOf8 = java.lang.String.valueOf(list5);
        java.lang.String valueOf9 = java.lang.String.valueOf(list4);
        java.lang.String valueOf10 = java.lang.String.valueOf(list3);
        java.lang.String valueOf11 = java.lang.String.valueOf(plusCode);
        java.lang.String valueOf12 = java.lang.String.valueOf(zzgfVar);
        java.lang.String obj4 = booleanPlaceAttributeValue.toString();
        java.lang.String valueOf13 = java.lang.String.valueOf(list2);
        java.lang.String valueOf14 = java.lang.String.valueOf(list);
        com.google.android.libraries.places.api.model.GoogleMapsLinks googleMapsLinks = this.zzat;
        com.google.android.libraries.places.api.model.ReviewSummary reviewSummary = this.zzas;
        com.google.android.libraries.places.api.model.NeighborhoodSummary neighborhoodSummary = this.zzar;
        com.google.android.libraries.places.api.model.EvChargeAmenitySummary evChargeAmenitySummary = this.zzaq;
        com.google.android.libraries.places.api.model.GenerativeSummary generativeSummary = this.zzap;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5 = this.zzao;
        com.google.android.libraries.places.api.model.FuelOptions fuelOptions = this.zzan;
        java.util.List list6 = this.zzam;
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        java.lang.String str3 = this.zzc;
        java.lang.String str4 = this.zzl;
        java.lang.String str5 = this.zzm;
        java.lang.Integer num = this.zzn;
        java.lang.String str6 = this.zzo;
        java.lang.String str7 = this.zzp;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6 = this.zzK;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7 = this.zzL;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8 = this.zzM;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9 = this.zzN;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10 = this.zzO;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11 = this.zzP;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12 = this.zzQ;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13 = this.zzR;
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = this.zzU;
        android.net.Uri uri = this.zzV;
        android.net.Uri uri2 = this.zzW;
        com.google.android.libraries.places.api.model.AccessibilityOptions accessibilityOptions = this.zzX;
        com.google.android.libraries.places.api.model.ParkingOptions parkingOptions = this.zzY;
        com.google.android.libraries.places.api.model.PaymentOptions paymentOptions = this.zzZ;
        com.google.android.libraries.places.api.model.EVChargeOptions eVChargeOptions = this.zzaa;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14 = this.zzab;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15 = this.zzac;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16 = this.zzad;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17 = this.zzae;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18 = this.zzaf;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19 = this.zzag;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20 = this.zzah;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21 = this.zzai;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22 = this.zzaj;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23 = this.zzak;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24 = this.zzal;
        java.lang.String obj5 = booleanPlaceAttributeValue6.toString();
        java.lang.String obj6 = booleanPlaceAttributeValue7.toString();
        java.lang.String obj7 = booleanPlaceAttributeValue8.toString();
        java.lang.String obj8 = booleanPlaceAttributeValue9.toString();
        java.lang.String obj9 = booleanPlaceAttributeValue10.toString();
        java.lang.String obj10 = booleanPlaceAttributeValue11.toString();
        java.lang.String obj11 = booleanPlaceAttributeValue12.toString();
        java.lang.String obj12 = booleanPlaceAttributeValue13.toString();
        java.lang.String valueOf15 = java.lang.String.valueOf(latLngBounds);
        java.lang.String valueOf16 = java.lang.String.valueOf(uri);
        java.lang.String valueOf17 = java.lang.String.valueOf(uri2);
        java.lang.String valueOf18 = java.lang.String.valueOf(accessibilityOptions);
        java.lang.String valueOf19 = java.lang.String.valueOf(parkingOptions);
        java.lang.String valueOf20 = java.lang.String.valueOf(paymentOptions);
        java.lang.String valueOf21 = java.lang.String.valueOf(eVChargeOptions);
        java.lang.String obj13 = booleanPlaceAttributeValue14.toString();
        java.lang.String obj14 = booleanPlaceAttributeValue15.toString();
        java.lang.String obj15 = booleanPlaceAttributeValue16.toString();
        java.lang.String obj16 = booleanPlaceAttributeValue17.toString();
        java.lang.String obj17 = booleanPlaceAttributeValue18.toString();
        java.lang.String obj18 = booleanPlaceAttributeValue19.toString();
        java.lang.String obj19 = booleanPlaceAttributeValue20.toString();
        java.lang.String obj20 = booleanPlaceAttributeValue21.toString();
        java.lang.String obj21 = booleanPlaceAttributeValue22.toString();
        java.lang.String obj22 = booleanPlaceAttributeValue23.toString();
        java.lang.String obj23 = booleanPlaceAttributeValue24.toString();
        java.lang.String valueOf22 = java.lang.String.valueOf(list6);
        java.lang.String valueOf23 = java.lang.String.valueOf(fuelOptions);
        java.lang.String obj24 = booleanPlaceAttributeValue5.toString();
        java.lang.String valueOf24 = java.lang.String.valueOf(generativeSummary);
        java.lang.String valueOf25 = java.lang.String.valueOf(evChargeAmenitySummary);
        java.lang.String valueOf26 = java.lang.String.valueOf(neighborhoodSummary);
        java.lang.String valueOf27 = java.lang.String.valueOf(reviewSummary);
        java.lang.String valueOf28 = java.lang.String.valueOf(googleMapsLinks);
        int length = java.lang.String.valueOf(str).length();
        int length2 = java.lang.String.valueOf(str2).length();
        int length3 = java.lang.String.valueOf(str3).length();
        int length4 = java.lang.String.valueOf(valueOf).length();
        int length5 = java.lang.String.valueOf(valueOf2).length();
        int length6 = java.lang.String.valueOf(valueOf3).length();
        int length7 = java.lang.String.valueOf(valueOf4).length();
        int length8 = obj.length();
        int length9 = java.lang.String.valueOf(valueOf5).length();
        int length10 = obj2.length();
        int length11 = obj3.length();
        int length12 = java.lang.String.valueOf(str4).length();
        int length13 = java.lang.String.valueOf(str5).length();
        int length14 = java.lang.String.valueOf(num).length();
        int length15 = java.lang.String.valueOf(str6).length();
        java.lang.Double d = this.zzG;
        java.lang.String str8 = this.zzF;
        java.lang.String str9 = this.zzE;
        java.lang.String str10 = this.zzD;
        java.lang.Integer num2 = this.zzB;
        java.lang.String str11 = this.zzw;
        java.lang.String str12 = this.zzv;
        java.lang.String str13 = this.zzt;
        java.lang.String str14 = this.zzs;
        java.lang.String str15 = this.zzr;
        int length16 = java.lang.String.valueOf(str7).length();
        int length17 = java.lang.String.valueOf(valueOf6).length();
        int length18 = java.lang.String.valueOf(str15).length();
        int length19 = java.lang.String.valueOf(str14).length();
        int length20 = java.lang.String.valueOf(str13).length();
        int length21 = java.lang.String.valueOf(valueOf7).length();
        int length22 = java.lang.String.valueOf(str12).length();
        int length23 = java.lang.String.valueOf(str11).length();
        int length24 = java.lang.String.valueOf(valueOf8).length();
        int length25 = java.lang.String.valueOf(valueOf9).length();
        int length26 = java.lang.String.valueOf(valueOf10).length();
        int length27 = java.lang.String.valueOf(valueOf11).length();
        int length28 = java.lang.String.valueOf(num2).length();
        int length29 = java.lang.String.valueOf(valueOf12).length();
        int length30 = java.lang.String.valueOf(str10).length();
        int length31 = java.lang.String.valueOf(str9).length();
        int length32 = java.lang.String.valueOf(str8).length();
        int length33 = java.lang.String.valueOf(d).length();
        int length34 = obj4.length();
        int length35 = java.lang.String.valueOf(valueOf13).length();
        int length36 = java.lang.String.valueOf(valueOf14).length();
        int length37 = obj5.length();
        int length38 = obj6.length();
        int length39 = obj7.length();
        int length40 = obj8.length();
        int length41 = obj9.length();
        int length42 = obj10.length();
        int length43 = obj11.length();
        int length44 = obj12.length();
        java.lang.Integer num3 = this.zzT;
        java.lang.Integer num4 = this.zzS;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + length2 + 19 + length3 + 20 + length4 + 15 + length5 + 17 + length6 + 16 + length7 + 17 + length8 + 22 + length9 + 11 + length10 + 9 + length11 + 19 + length12 + 31 + length13 + 22 + length14 + 14 + length15 + 5 + length16 + 11 + length17 + 14 + length18 + 26 + length19 + 15 + length20 + 15 + length21 + 27 + length22 + 22 + length23 + 17 + length24 + 10 + length25 + 13 + length26 + 11 + length27 + 13 + length28 + 13 + length29 + 14 + length30 + 25 + length31 + 37 + length32 + 9 + length33 + 13 + length34 + 24 + length35 + 31 + length36 + 13 + length37 + 18 + length38 + 15 + length39 + 15 + length40 + 14 + length41 + 23 + length42 + 13 + length43 + 10 + length44 + 18 + java.lang.String.valueOf(num4).length() + 19 + java.lang.String.valueOf(num3).length() + 11 + java.lang.String.valueOf(valueOf15).length() + 13 + java.lang.String.valueOf(valueOf16).length() + 16 + java.lang.String.valueOf(valueOf17).length() + 23 + java.lang.String.valueOf(valueOf18).length() + 17 + java.lang.String.valueOf(valueOf19).length() + 17 + java.lang.String.valueOf(valueOf20).length() + 18 + java.lang.String.valueOf(valueOf21).length() + 17 + obj13.length() + 12 + obj14.length() + 18 + obj15.length() + 18 + obj16.length() + 16 + obj17.length() + 15 + obj18.length() + 18 + obj19.length() + 13 + obj20.length() + 11 + obj21.length() + 16 + obj22.length() + 24 + obj23.length() + 18 + java.lang.String.valueOf(valueOf22).length() + 14 + java.lang.String.valueOf(valueOf23).length() + 26 + obj24.length() + 20 + java.lang.String.valueOf(valueOf24).length() + 25 + java.lang.String.valueOf(valueOf25).length() + 22 + java.lang.String.valueOf(valueOf26).length() + 16 + java.lang.String.valueOf(valueOf27).length() + 18 + java.lang.String.valueOf(valueOf28).length() + 1);
        sb.append("Place{formattedAddress=");
        sb.append(str);
        sb.append(", shortFormattedAddress=");
        sb.append(str2);
        sb.append(", adrFormatAddress=");
        sb.append(str3);
        sb.append(", addressComponents=");
        sb.append(valueOf);
        sb.append(", attributions=");
        sb.append(valueOf2);
        sb.append(", businessStatus=");
        sb.append(valueOf3);
        sb.append(", consumerAlert=");
        sb.append(valueOf4);
        sb.append(", curbsidePickup=");
        sb.append(obj);
        sb.append(", currentOpeningHours=");
        sb.append(valueOf5);
        sb.append(", delivery=");
        sb.append(obj2);
        sb.append(", dineIn=");
        sb.append(obj3);
        sb.append(", editorialSummary=");
        sb.append(str4);
        sb.append(", editorialSummaryLanguageCode=");
        sb.append(str5);
        sb.append(", iconBackgroundColor=");
        sb.append(num);
        sb.append(", iconMaskUrl=");
        sb.append(str6);
        sb.append(", id=");
        sb.append(str7);
        sb.append(", location=");
        sb.append(valueOf6);
        sb.append(", displayName=");
        sb.append(str15);
        sb.append(", displayNameLanguageCode=");
        sb.append(str14);
        sb.append(", resourceName=");
        sb.append(str13);
        sb.append(", openingHours=");
        sb.append(valueOf7);
        sb.append(", internationalPhoneNumber=");
        sb.append(str12);
        sb.append(", nationalPhoneNumber=");
        sb.append(str11);
        sb.append(", photoMetadatas=");
        sb.append(valueOf8);
        sb.append(", reviews=");
        sb.append(valueOf9);
        sb.append(", placeTypes=");
        sb.append(valueOf10);
        sb.append(", plusCode=");
        sb.append(valueOf11);
        sb.append(", priceLevel=");
        sb.append(num2);
        sb.append(", priceRange=");
        sb.append(valueOf12);
        sb.append(", primaryType=");
        sb.append(str10);
        sb.append(", primaryTypeDisplayName=");
        sb.append(str9);
        sb.append(", primaryTypeDisplayNameLanguageCode=");
        sb.append(str8);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", reservable=");
        sb.append(obj4);
        sb.append(", secondaryOpeningHours=");
        sb.append(valueOf13);
        sb.append(", currentSecondaryOpeningHours=");
        sb.append(valueOf14);
        sb.append(", servesBeer=");
        sb.append(obj5);
        sb.append(", servesBreakfast=");
        sb.append(obj6);
        sb.append(", servesBrunch=");
        sb.append(obj7);
        sb.append(", servesDinner=");
        sb.append(obj8);
        sb.append(", servesLunch=");
        sb.append(obj9);
        sb.append(", servesVegetarianFood=");
        sb.append(obj10);
        sb.append(", servesWine=");
        sb.append(obj11);
        sb.append(", takeout=");
        sb.append(obj12);
        sb.append(", userRatingCount=");
        sb.append(num4);
        sb.append(", utcOffsetMinutes=");
        sb.append(num3);
        sb.append(", viewport=");
        sb.append(valueOf15);
        sb.append(", websiteUri=");
        sb.append(valueOf16);
        sb.append(", googleMapsUri=");
        sb.append(valueOf17);
        sb.append(", accessibilityOptions=");
        sb.append(valueOf18);
        sb.append(", parkingOptions=");
        sb.append(valueOf19);
        sb.append(", paymentOptions=");
        sb.append(valueOf20);
        sb.append(", evChargeOptions=");
        sb.append(valueOf21);
        sb.append(", outdoorSeating=");
        sb.append(obj13);
        sb.append(", liveMusic=");
        sb.append(obj14);
        sb.append(", menuForChildren=");
        sb.append(obj15);
        sb.append(", servesCocktails=");
        sb.append(obj16);
        sb.append(", servesDessert=");
        sb.append(obj17);
        sb.append(", servesCoffee=");
        sb.append(obj18);
        sb.append(", goodForChildren=");
        sb.append(obj19);
        sb.append(", allowsDogs=");
        sb.append(obj20);
        sb.append(", restroom=");
        sb.append(obj21);
        sb.append(", goodForGroups=");
        sb.append(obj22);
        sb.append(", goodForWatchingSports=");
        sb.append(obj23);
        sb.append(", subDestinations=");
        sb.append(valueOf22);
        sb.append(", fuelOptions=");
        sb.append(valueOf23);
        sb.append(", pureServiceAreaBusiness=");
        sb.append(obj24);
        sb.append(", generativeSummary=");
        sb.append(valueOf24);
        sb.append(", evChargeAmenitySummary=");
        sb.append(valueOf25);
        sb.append(", neighborhoodSummary=");
        sb.append(valueOf26);
        sb.append(", reviewSummary=");
        sb.append(valueOf27);
        sb.append(", googleMapsLinks=");
        sb.append(valueOf28);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzb;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.zzc;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        com.google.android.libraries.places.api.model.AddressComponents addressComponents = this.zzd;
        int hashCode4 = addressComponents == null ? 0 : addressComponents.hashCode();
        java.util.List list = this.zze;
        int hashCode5 = list == null ? 0 : list.hashCode();
        com.google.android.libraries.places.api.model.Place.BusinessStatus businessStatus = this.zzf;
        int hashCode6 = businessStatus == null ? 0 : businessStatus.hashCode();
        com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert = this.zzg;
        int hashCode7 = consumerAlert == null ? 0 : consumerAlert.hashCode();
        int hashCode8 = this.zzh.hashCode();
        com.google.android.libraries.places.api.model.OpeningHours openingHours = this.zzi;
        int hashCode9 = openingHours == null ? 0 : openingHours.hashCode();
        int hashCode10 = this.zzj.hashCode();
        int hashCode11 = this.zzk.hashCode();
        java.lang.String str4 = this.zzl;
        int hashCode12 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.zzm;
        int hashCode13 = str5 == null ? 0 : str5.hashCode();
        java.lang.Integer num = this.zzn;
        int hashCode14 = num == null ? 0 : num.hashCode();
        java.lang.String str6 = this.zzo;
        int hashCode15 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.zzp;
        int hashCode16 = str7 == null ? 0 : str7.hashCode();
        com.google.android.gms.maps.model.LatLng latLng = this.zzq;
        int hashCode17 = latLng == null ? 0 : latLng.hashCode();
        java.lang.String str8 = this.zzr;
        int hashCode18 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.zzs;
        int hashCode19 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.zzt;
        int hashCode20 = str10 == null ? 0 : str10.hashCode();
        com.google.android.libraries.places.api.model.OpeningHours openingHours2 = this.zzu;
        int hashCode21 = openingHours2 == null ? 0 : openingHours2.hashCode();
        java.lang.String str11 = this.zzv;
        int hashCode22 = str11 == null ? 0 : str11.hashCode();
        java.lang.String str12 = this.zzw;
        int hashCode23 = str12 == null ? 0 : str12.hashCode();
        java.util.List list2 = this.zzx;
        int hashCode24 = list2 == null ? 0 : list2.hashCode();
        java.util.List list3 = this.zzy;
        int hashCode25 = list3 == null ? 0 : list3.hashCode();
        java.util.List list4 = this.zzz;
        int hashCode26 = list4 == null ? 0 : list4.hashCode();
        com.google.android.libraries.places.api.model.PlusCode plusCode = this.zzA;
        int hashCode27 = plusCode == null ? 0 : plusCode.hashCode();
        java.lang.Integer num2 = this.zzB;
        int hashCode28 = num2 == null ? 0 : num2.hashCode();
        com.google.android.libraries.places.api.model.zzgf zzgfVar = this.zzC;
        int hashCode29 = zzgfVar == null ? 0 : zzgfVar.hashCode();
        java.lang.String str13 = this.zzD;
        int hashCode30 = str13 == null ? 0 : str13.hashCode();
        java.lang.String str14 = this.zzE;
        int hashCode31 = str14 == null ? 0 : str14.hashCode();
        java.lang.String str15 = this.zzF;
        int hashCode32 = str15 == null ? 0 : str15.hashCode();
        java.lang.Double d = this.zzG;
        int hashCode33 = d == null ? 0 : d.hashCode();
        int hashCode34 = this.zzH.hashCode();
        java.util.List list5 = this.zzI;
        int hashCode35 = list5 == null ? 0 : list5.hashCode();
        java.util.List list6 = this.zzJ;
        int hashCode36 = list6 == null ? 0 : list6.hashCode();
        int hashCode37 = this.zzK.hashCode();
        int hashCode38 = this.zzL.hashCode();
        int hashCode39 = this.zzM.hashCode();
        int hashCode40 = this.zzN.hashCode();
        int hashCode41 = this.zzO.hashCode();
        int hashCode42 = this.zzP.hashCode();
        int hashCode43 = this.zzQ.hashCode();
        int hashCode44 = this.zzR.hashCode();
        java.lang.Integer num3 = this.zzS;
        int hashCode45 = num3 == null ? 0 : num3.hashCode();
        java.lang.Integer num4 = this.zzT;
        int hashCode46 = num4 == null ? 0 : num4.hashCode();
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = this.zzU;
        int hashCode47 = latLngBounds == null ? 0 : latLngBounds.hashCode();
        android.net.Uri uri = this.zzV;
        int hashCode48 = uri == null ? 0 : uri.hashCode();
        android.net.Uri uri2 = this.zzW;
        int hashCode49 = uri2 == null ? 0 : uri2.hashCode();
        com.google.android.libraries.places.api.model.AccessibilityOptions accessibilityOptions = this.zzX;
        int hashCode50 = accessibilityOptions == null ? 0 : accessibilityOptions.hashCode();
        com.google.android.libraries.places.api.model.ParkingOptions parkingOptions = this.zzY;
        int hashCode51 = parkingOptions == null ? 0 : parkingOptions.hashCode();
        com.google.android.libraries.places.api.model.PaymentOptions paymentOptions = this.zzZ;
        int hashCode52 = paymentOptions == null ? 0 : paymentOptions.hashCode();
        com.google.android.libraries.places.api.model.EVChargeOptions eVChargeOptions = this.zzaa;
        int hashCode53 = eVChargeOptions == null ? 0 : eVChargeOptions.hashCode();
        int hashCode54 = this.zzab.hashCode();
        int hashCode55 = this.zzac.hashCode();
        int hashCode56 = this.zzad.hashCode();
        int hashCode57 = this.zzae.hashCode();
        int hashCode58 = this.zzaf.hashCode();
        int hashCode59 = this.zzag.hashCode();
        int hashCode60 = this.zzah.hashCode();
        int hashCode61 = this.zzai.hashCode();
        int hashCode62 = this.zzaj.hashCode();
        int hashCode63 = this.zzak.hashCode();
        int hashCode64 = this.zzal.hashCode();
        java.util.List list7 = this.zzam;
        int hashCode65 = list7 == null ? 0 : list7.hashCode();
        com.google.android.libraries.places.api.model.FuelOptions fuelOptions = this.zzan;
        int hashCode66 = fuelOptions == null ? 0 : fuelOptions.hashCode();
        int hashCode67 = this.zzao.hashCode();
        com.google.android.libraries.places.api.model.GenerativeSummary generativeSummary = this.zzap;
        int hashCode68 = generativeSummary == null ? 0 : generativeSummary.hashCode();
        com.google.android.libraries.places.api.model.EvChargeAmenitySummary evChargeAmenitySummary = this.zzaq;
        int hashCode69 = evChargeAmenitySummary == null ? 0 : evChargeAmenitySummary.hashCode();
        com.google.android.libraries.places.api.model.NeighborhoodSummary neighborhoodSummary = this.zzar;
        int hashCode70 = neighborhoodSummary == null ? 0 : neighborhoodSummary.hashCode();
        com.google.android.libraries.places.api.model.ReviewSummary reviewSummary = this.zzas;
        int hashCode71 = reviewSummary == null ? 0 : reviewSummary.hashCode();
        com.google.android.libraries.places.api.model.GoogleMapsLinks googleMapsLinks = this.zzat;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ hashCode13) * 1000003) ^ hashCode14) * 1000003) ^ hashCode15) * 1000003) ^ hashCode16) * 1000003) ^ hashCode17) * 1000003) ^ hashCode18) * 1000003) ^ hashCode19) * 1000003) ^ hashCode20) * 1000003) ^ hashCode21) * 1000003) ^ hashCode22) * 1000003) ^ hashCode23) * 1000003) ^ hashCode24) * 1000003) ^ hashCode25) * 1000003) ^ hashCode26) * 1000003) ^ hashCode27) * 1000003) ^ hashCode28) * 1000003) ^ hashCode29) * 1000003) ^ hashCode30) * 1000003) ^ hashCode31) * 1000003) ^ hashCode32) * 1000003) ^ hashCode33) * 1000003) ^ hashCode34) * 1000003) ^ hashCode35) * 1000003) ^ hashCode36) * 1000003) ^ hashCode37) * 1000003) ^ hashCode38) * 1000003) ^ hashCode39) * 1000003) ^ hashCode40) * 1000003) ^ hashCode41) * 1000003) ^ hashCode42) * 1000003) ^ hashCode43) * 1000003) ^ hashCode44) * 1000003) ^ hashCode45) * 1000003) ^ hashCode46) * 1000003) ^ hashCode47) * 1000003) ^ hashCode48) * 1000003) ^ hashCode49) * 1000003) ^ hashCode50) * 1000003) ^ hashCode51) * 1000003) ^ hashCode52) * 1000003) ^ hashCode53) * 1000003) ^ hashCode54) * 1000003) ^ hashCode55) * 1000003) ^ hashCode56) * 1000003) ^ hashCode57) * 1000003) ^ hashCode58) * 1000003) ^ hashCode59) * 1000003) ^ hashCode60) * 1000003) ^ hashCode61) * 1000003) ^ hashCode62) * 1000003) ^ hashCode63) * 1000003) ^ hashCode64) * 1000003) ^ hashCode65) * 1000003) ^ hashCode66) * 1000003) ^ hashCode67) * 1000003) ^ hashCode68) * 1000003) ^ hashCode69) * 1000003) ^ hashCode70) * 1000003) ^ hashCode71) * 1000003) ^ (googleMapsLinks != null ? googleMapsLinks.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final com.google.android.libraries.places.api.model.zzgf zza() {
        return this.zzC;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public android.net.Uri getWebsiteUri() {
        return this.zzV;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.gms.maps.model.LatLngBounds getViewport() {
        return this.zzU;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.Integer getUtcOffsetMinutes() {
        return this.zzT;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.Integer getUserRatingCount() {
        return this.zzS;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getTakeout() {
        return this.zzR;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.util.List<com.google.android.libraries.places.api.model.SubDestination> getSubDestinations() {
        return this.zzam;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getShortFormattedAddress() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesWine() {
        return this.zzQ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesVegetarianFood() {
        return this.zzP;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesLunch() {
        return this.zzO;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesDinner() {
        return this.zzN;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesDessert() {
        return this.zzaf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesCoffee() {
        return this.zzag;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesCocktails() {
        return this.zzae;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesBrunch() {
        return this.zzM;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesBreakfast() {
        return this.zzL;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesBeer() {
        return this.zzK;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.util.List<com.google.android.libraries.places.api.model.OpeningHours> getSecondaryOpeningHours() {
        return this.zzI;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.util.List<com.google.android.libraries.places.api.model.Review> getReviews() {
        return this.zzy;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.ReviewSummary getReviewSummary() {
        return this.zzas;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getRestroom() {
        return this.zzaj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getResourceName() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getReservable() {
        return this.zzH;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.Double getRating() {
        return this.zzG;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPureServiceAreaBusiness() {
        return this.zzao;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getPrimaryTypeDisplayNameLanguageCode() {
        return this.zzF;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getPrimaryTypeDisplayName() {
        return this.zzE;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getPrimaryType() {
        return this.zzD;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.Integer getPriceLevel() {
        return this.zzB;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.PlusCode getPlusCode() {
        return this.zzA;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.util.List<java.lang.String> getPlaceTypes() {
        return this.zzz;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.util.List<com.google.android.libraries.places.api.model.PhotoMetadata> getPhotoMetadatas() {
        return this.zzx;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.PaymentOptions getPaymentOptions() {
        return this.zzZ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.ParkingOptions getParkingOptions() {
        return this.zzY;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getOutdoorSeating() {
        return this.zzab;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.OpeningHours getOpeningHours() {
        return this.zzu;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.NeighborhoodSummary getNeighborhoodSummary() {
        return this.zzar;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getNationalPhoneNumber() {
        return this.zzw;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getMenuForChildren() {
        return this.zzad;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.gms.maps.model.LatLng getLocation() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getLiveMusic() {
        return this.zzac;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getInternationalPhoneNumber() {
        return this.zzv;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getId() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getIconMaskUrl() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.Integer getIconBackgroundColor() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public android.net.Uri getGoogleMapsUri() {
        return this.zzW;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.GoogleMapsLinks getGoogleMapsLinks() {
        return this.zzat;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getGoodForWatchingSports() {
        return this.zzal;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getGoodForGroups() {
        return this.zzak;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getGoodForChildren() {
        return this.zzah;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.GenerativeSummary getGenerativeSummary() {
        return this.zzap;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.FuelOptions getFuelOptions() {
        return this.zzan;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getFormattedAddress() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.EVChargeOptions getEvChargeOptions() {
        return this.zzaa;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.EvChargeAmenitySummary getEvChargeAmenitySummary() {
        return this.zzaq;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getEditorialSummaryLanguageCode() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getEditorialSummary() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getDisplayNameLanguageCode() {
        return this.zzs;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getDisplayName() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getDineIn() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getDelivery() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.util.List<com.google.android.libraries.places.api.model.OpeningHours> getCurrentSecondaryOpeningHours() {
        return this.zzJ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.OpeningHours getCurrentOpeningHours() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getCurbsidePickup() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.ConsumerAlert getConsumerAlert() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BusinessStatus getBusinessStatus() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.util.List<java.lang.String> getAttributions() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAllowsDogs() {
        return this.zzai;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public java.lang.String getAdrFormatAddress() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.AddressComponents getAddressComponents() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public com.google.android.libraries.places.api.model.AccessibilityOptions getAccessibilityOptions() {
        return this.zzX;
    }
}
