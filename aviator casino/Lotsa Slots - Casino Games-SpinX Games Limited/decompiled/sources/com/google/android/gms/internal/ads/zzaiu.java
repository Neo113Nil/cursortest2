package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaiu {
    private static final java.lang.String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final java.lang.String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final java.lang.String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzait zza(java.lang.String str) throws java.io.IOException {
        long j;
        try {
            org.xmlpull.v1.XmlPullParser newPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new java.io.StringReader(str));
            newPullParser.next();
            if (!com.google.android.gms.internal.ads.zzft.zzb(newPullParser, "x:xmpmeta")) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Couldn't find xmp metadata", null);
            }
            com.google.android.gms.internal.ads.zzgwm zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
            long j2 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (com.google.android.gms.internal.ads.zzft.zzb(newPullParser, "rdf:Description")) {
                    java.lang.String[] strArr = zza;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        java.lang.String zzc2 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, strArr[i2]);
                        if (zzc2 != null) {
                            if (java.lang.Integer.parseInt(zzc2) != 1) {
                                return null;
                            }
                            java.lang.String[] strArr2 = zzb;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 4) {
                                    break;
                                }
                                java.lang.String zzc3 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, strArr2[i3]);
                                if (zzc3 != null) {
                                    j = java.lang.Long.parseLong(zzc3);
                                    if (j == -1) {
                                    }
                                } else {
                                    i3++;
                                }
                            }
                            java.lang.String[] strArr3 = zzc;
                            while (true) {
                                if (i >= 2) {
                                    zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
                                    break;
                                }
                                java.lang.String zzc4 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, strArr3[i]);
                                if (zzc4 != null) {
                                    zzi = com.google.android.gms.internal.ads.zzgwm.zzk(new com.google.android.gms.internal.ads.zzais("image/jpeg", "Primary", 0L, 0L), new com.google.android.gms.internal.ads.zzais("video/mp4", "MotionPhoto", java.lang.Long.parseLong(zzc4), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (com.google.android.gms.internal.ads.zzft.zzb(newPullParser, "Container:Directory")) {
                    zzi = zzc(newPullParser, "Container", "Item");
                } else if (com.google.android.gms.internal.ads.zzft.zzb(newPullParser, "GContainer:Directory")) {
                    zzi = zzc(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!com.google.android.gms.internal.ads.zzft.zza(newPullParser, "x:xmpmeta"));
            if (zzi.isEmpty()) {
                return null;
            }
            return new com.google.android.gms.internal.ads.zzait(j2, zzi);
        } catch (com.google.android.gms.internal.ads.zzat | java.lang.NumberFormatException | org.xmlpull.v1.XmlPullParserException unused) {
            com.google.android.gms.internal.ads.zzeg.zzc("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static boolean zzb(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String[] strArr = zza;
        for (int i = 0; i < 4; i++) {
            java.lang.String str2 = strArr[i];
            java.lang.String.valueOf(str2);
            if (str.contains(java.lang.String.valueOf(str2).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static com.google.android.gms.internal.ads.zzgwm zzc(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i = com.google.android.gms.internal.ads.zzgwm.zzd;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        do {
            java.lang.String concat = str.concat(":Item");
            xmlPullParser.next();
            if (com.google.android.gms.internal.ads.zzft.zzb(xmlPullParser, concat)) {
                java.lang.String concat2 = str2.concat(":Mime");
                java.lang.String concat3 = str2.concat(":Semantic");
                java.lang.String concat4 = str2.concat(":Length");
                java.lang.String concat5 = str2.concat(":Padding");
                java.lang.String zzc2 = com.google.android.gms.internal.ads.zzft.zzc(xmlPullParser, concat2);
                java.lang.String zzc3 = com.google.android.gms.internal.ads.zzft.zzc(xmlPullParser, concat3);
                java.lang.String zzc4 = com.google.android.gms.internal.ads.zzft.zzc(xmlPullParser, concat4);
                java.lang.String zzc5 = com.google.android.gms.internal.ads.zzft.zzc(xmlPullParser, concat5);
                if (zzc2 == null || zzc3 == null) {
                    return com.google.android.gms.internal.ads.zzgwm.zzi();
                }
                zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzais(zzc2, zzc3, zzc4 != null ? java.lang.Long.parseLong(zzc4) : 0L, zzc5 != null ? java.lang.Long.parseLong(zzc5) : 0L));
            }
        } while (!com.google.android.gms.internal.ads.zzft.zza(xmlPullParser, str.concat(":Directory")));
        return zzgwjVar.zzi();
    }
}
