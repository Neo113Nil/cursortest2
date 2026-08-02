package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzlt {
    private com.google.android.libraries.places.internal.zzlt.zza[] addressComponents;
    private java.lang.String businessStatus;
    private java.lang.Boolean curbsidePickup;
    private com.google.android.libraries.places.internal.zzlt.zzd currentOpeningHours;
    private java.lang.Boolean delivery;
    private java.lang.Boolean dineIn;
    private com.google.android.libraries.places.internal.zzlt.zzb editorialSummary;
    private java.lang.String formattedAddress;
    private com.google.android.libraries.places.internal.zzlt.zzc geometry;
    private java.lang.String icon;
    private java.lang.String iconBackgroundColor;
    private java.lang.String iconMaskBaseUri;
    private java.lang.String internationalPhoneNumber;

    /* renamed from: name, reason: collision with root package name */
    private java.lang.String f3780name;
    private com.google.android.libraries.places.internal.zzlt.zzd openingHours;
    private com.google.android.libraries.places.internal.zzlt.zze[] photos;
    private java.lang.String placeId;
    private com.google.android.libraries.places.internal.zzlt.zzf plusCode;
    private java.lang.Integer priceLevel;
    private java.lang.Double rating;
    private java.lang.Boolean reservable;
    private com.google.android.libraries.places.internal.zzlt.zzd[] secondaryOpeningHours;
    private java.lang.Boolean servesBeer;
    private java.lang.Boolean servesBreakfast;
    private java.lang.Boolean servesBrunch;
    private java.lang.Boolean servesDinner;
    private java.lang.Boolean servesLunch;
    private java.lang.Boolean servesVegetarianFood;
    private java.lang.Boolean servesWine;
    private java.lang.Boolean takeout;
    private java.lang.String[] types;
    private java.lang.Integer userRatingsTotal;
    private java.lang.Integer utcOffset;
    private java.lang.String website;
    private java.lang.Boolean wheelchairAccessibleEntrance;

    final com.google.common.collect.ImmutableList zzC() {
        java.lang.String[] strArr = this.types;
        return strArr != null ? com.google.common.collect.ImmutableList.copyOf(strArr) : com.google.common.collect.ImmutableList.of();
    }

    final com.google.common.collect.ImmutableList zza() {
        com.google.android.libraries.places.internal.zzlt.zza[] zzaVarArr = this.addressComponents;
        return zzaVarArr != null ? com.google.common.collect.ImmutableList.copyOf(zzaVarArr) : com.google.common.collect.ImmutableList.of();
    }

    final com.google.common.collect.ImmutableList zzo() {
        com.google.android.libraries.places.internal.zzlt.zze[] zzeVarArr = this.photos;
        return zzeVarArr != null ? com.google.common.collect.ImmutableList.copyOf(zzeVarArr) : com.google.common.collect.ImmutableList.of();
    }

    final com.google.common.collect.ImmutableList zzu() {
        com.google.android.libraries.places.internal.zzlt.zzd[] zzdVarArr = this.secondaryOpeningHours;
        return zzdVarArr != null ? com.google.common.collect.ImmutableList.copyOf(zzdVarArr) : com.google.common.collect.ImmutableList.of();
    }

    final java.lang.Boolean zzz() {
        return this.servesVegetarianFood;
    }

    final java.lang.Boolean zzy() {
        return this.servesLunch;
    }

    final java.lang.Boolean zzx() {
        return this.servesDinner;
    }

    final java.lang.Boolean zzw() {
        return this.servesBreakfast;
    }

    final java.lang.Boolean zzv() {
        return this.servesBeer;
    }

    final java.lang.Boolean zzt() {
        return this.reservable;
    }

    final java.lang.Double zzs() {
        return this.rating;
    }

    final java.lang.Integer zzr() {
        return this.priceLevel;
    }

    final com.google.android.libraries.places.internal.zzlt.zzf zzq() {
        return this.plusCode;
    }

    final java.lang.String zzp() {
        return this.placeId;
    }

    final com.google.android.libraries.places.internal.zzlt.zzd zzn() {
        return this.openingHours;
    }

    final java.lang.String zzm() {
        return this.f3780name;
    }

    final java.lang.String zzl() {
        return this.internationalPhoneNumber;
    }

    final java.lang.String zzk() {
        return this.iconMaskBaseUri;
    }

    final java.lang.String zzj() {
        return this.iconBackgroundColor;
    }

    final com.google.android.libraries.places.internal.zzlt.zzc zzi() {
        return this.geometry;
    }

    final java.lang.String zzh() {
        return this.formattedAddress;
    }

    final com.google.android.libraries.places.internal.zzlt.zzb zzg() {
        return this.editorialSummary;
    }

    final java.lang.Boolean zzf() {
        return this.dineIn;
    }

    final java.lang.Boolean zze() {
        return this.delivery;
    }

    final com.google.android.libraries.places.internal.zzlt.zzd zzd() {
        return this.currentOpeningHours;
    }

    final java.lang.Boolean zzc() {
        return this.curbsidePickup;
    }

    class zzd {
        private com.google.android.libraries.places.internal.zzlt.zzd.zza[] periods;
        private com.google.android.libraries.places.internal.zzlt.zzd.zzb[] specialDays;
        private java.lang.String type;
        private java.lang.String[] weekdayText;

        final com.google.common.collect.ImmutableList zza() {
            com.google.android.libraries.places.internal.zzlt.zzd.zza[] zzaVarArr = this.periods;
            return zzaVarArr != null ? com.google.common.collect.ImmutableList.copyOf(zzaVarArr) : com.google.common.collect.ImmutableList.of();
        }

        final com.google.common.collect.ImmutableList zzb() {
            java.lang.String[] strArr = this.weekdayText;
            return strArr != null ? com.google.common.collect.ImmutableList.copyOf(strArr) : com.google.common.collect.ImmutableList.of();
        }

        final com.google.common.collect.ImmutableList zzd() {
            com.google.android.libraries.places.internal.zzlt.zzd.zzb[] zzbVarArr = this.specialDays;
            return zzbVarArr != null ? com.google.common.collect.ImmutableList.copyOf(zzbVarArr) : com.google.common.collect.ImmutableList.of();
        }

        class zzc {
            private java.lang.String date;
            private java.lang.Integer day;
            private java.lang.String time;
            private java.lang.Boolean truncated;

            final java.lang.Boolean zzd() {
                return this.truncated;
            }

            final java.lang.String zzc() {
                return this.date;
            }

            final java.lang.String zzb() {
                return this.time;
            }

            final java.lang.Integer zza() {
                return this.day;
            }

            zzc() {
            }
        }

        class zza {
            private com.google.android.libraries.places.internal.zzlt.zzd.zzc close;
            private com.google.android.libraries.places.internal.zzlt.zzd.zzc open;

            final com.google.android.libraries.places.internal.zzlt.zzd.zzc zzb() {
                return this.open;
            }

            final com.google.android.libraries.places.internal.zzlt.zzd.zzc zza() {
                return this.close;
            }

            zza() {
            }
        }

        class zzb {
            private java.lang.String date;
            private java.lang.Boolean exceptionalHours;

            final java.lang.Boolean zzb() {
                return this.exceptionalHours;
            }

            final java.lang.String zza() {
                return this.date;
            }

            zzb() {
            }
        }

        final java.lang.String zzc() {
            return this.type;
        }

        zzd() {
        }
    }

    final java.lang.String zzb() {
        return this.businessStatus;
    }

    final java.lang.String zzF() {
        return this.website;
    }

    class zzc {
        private com.google.android.libraries.places.internal.zzlt.zzc.zza location;
        private com.google.android.libraries.places.internal.zzlt.zzc.zzb viewport;

        class zza {
            private java.lang.Double lat;
            private java.lang.Double lng;

            final java.lang.Double zzb() {
                return this.lng;
            }

            final java.lang.Double zza() {
                return this.lat;
            }

            zza() {
            }
        }

        class zzb {
            private com.google.android.libraries.places.internal.zzlt.zzc.zza northeast;
            private com.google.android.libraries.places.internal.zzlt.zzc.zza southwest;

            final com.google.android.libraries.places.internal.zzlt.zzc.zza zzb() {
                return this.southwest;
            }

            final com.google.android.libraries.places.internal.zzlt.zzc.zza zza() {
                return this.northeast;
            }

            zzb() {
            }
        }

        final com.google.android.libraries.places.internal.zzlt.zzc.zzb zzb() {
            return this.viewport;
        }

        final com.google.android.libraries.places.internal.zzlt.zzc.zza zza() {
            return this.location;
        }

        zzc() {
        }
    }

    class zze {
        private java.lang.Integer height;
        private java.lang.String[] htmlAttributions;
        private java.lang.String photoReference;
        private java.lang.Integer width;

        final com.google.common.collect.ImmutableList zzd() {
            java.lang.String[] strArr = this.htmlAttributions;
            return strArr != null ? com.google.common.collect.ImmutableList.copyOf(strArr) : com.google.common.collect.ImmutableList.of();
        }

        final java.lang.String zzc() {
            return this.photoReference;
        }

        final java.lang.Integer zzb() {
            return this.width;
        }

        final java.lang.Integer zza() {
            return this.height;
        }

        zze() {
        }
    }

    final java.lang.Integer zzE() {
        return this.utcOffset;
    }

    class zza {
        private java.lang.String longName;
        private java.lang.String shortName;
        private java.lang.String[] types;

        final com.google.common.collect.ImmutableList zzc() {
            java.lang.String[] strArr = this.types;
            return strArr != null ? com.google.common.collect.ImmutableList.copyOf(strArr) : com.google.common.collect.ImmutableList.of();
        }

        final java.lang.String zzb() {
            return this.shortName;
        }

        final java.lang.String zza() {
            return this.longName;
        }

        zza() {
        }
    }

    class zzb {
        private java.lang.String language;
        private java.lang.String overview;

        final java.lang.String zzb() {
            return this.overview;
        }

        final java.lang.String zza() {
            return this.language;
        }

        zzb() {
        }
    }

    class zzf {
        private java.lang.String compoundCode;
        private java.lang.String globalCode;

        final java.lang.String zzb() {
            return this.globalCode;
        }

        final java.lang.String zza() {
            return this.compoundCode;
        }

        zzf() {
        }
    }

    final java.lang.Integer zzD() {
        return this.userRatingsTotal;
    }

    final java.lang.Boolean zzB() {
        return this.takeout;
    }

    final java.lang.Boolean zzA() {
        return this.servesWine;
    }

    zzlt() {
    }
}
