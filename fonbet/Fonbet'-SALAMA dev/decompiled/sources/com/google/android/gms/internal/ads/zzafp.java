package com.google.android.gms.internal.ads;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
final class zzafp {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzafl zza(String str) {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!zzeo.zzc(newPullParser, "x:xmpmeta")) {
                throw zzaz.zza("Couldn't find xmp metadata", null);
            }
            zzfwh zzn = zzfwh.zzn();
            long j3 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (zzeo.zzc(newPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i7 = 0;
                    for (int i8 = 0; i8 < 4; i8++) {
                        String zza2 = zzeo.zza(newPullParser, strArr[i8]);
                        if (zza2 != null) {
                            if (Integer.parseInt(zza2) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= 4) {
                                    break;
                                }
                                String zza3 = zzeo.zza(newPullParser, strArr2[i9]);
                                if (zza3 != null) {
                                    j = Long.parseLong(zza3);
                                } else {
                                    i9++;
                                }
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i7 >= 2) {
                                    zzn = zzfwh.zzn();
                                    break;
                                }
                                String zza4 = zzeo.zza(newPullParser, strArr3[i7]);
                                if (zza4 != null) {
                                    zzn = zzfwh.zzp(new zzafk("image/jpeg", "Primary", 0L, 0L), new zzafk("video/mp4", "MotionPhoto", Long.parseLong(zza4), 0L));
                                    break;
                                }
                                i7++;
                            }
                            j3 = j;
                        }
                    }
                    return null;
                }
                if (zzeo.zzc(newPullParser, "Container:Directory")) {
                    zzn = zzb(newPullParser, "Container", "Item");
                } else if (zzeo.zzc(newPullParser, "GContainer:Directory")) {
                    zzn = zzb(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzeo.zzb(newPullParser, "x:xmpmeta"));
            if (zzn.isEmpty()) {
                return null;
            }
            return new zzafl(j3, zzn);
        } catch (zzaz | NumberFormatException | XmlPullParserException unused) {
            zzdq.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfwh zzb(XmlPullParser xmlPullParser, String str, String str2) {
        int i7 = zzfwh.zzd;
        zzfwe zzfweVar = new zzfwe();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzeo.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzeo.zza(xmlPullParser, concat2);
                String zza3 = zzeo.zza(xmlPullParser, concat3);
                String zza4 = zzeo.zza(xmlPullParser, concat4);
                String zza5 = zzeo.zza(xmlPullParser, concat5);
                if (zza2 == null || zza3 == null) {
                    return zzfwh.zzn();
                }
                zzfweVar.zzf(new zzafk(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
            }
        } while (!zzeo.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfweVar.zzi();
    }
}
