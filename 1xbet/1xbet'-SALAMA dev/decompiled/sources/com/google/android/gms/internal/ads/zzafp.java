package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
final class zzafp {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzafl zza(String str) {
        long j;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzeo.zzc(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzaz.zza("Couldn't find xmp metadata", null);
            }
            zzfwh zzfwhVarZzn = zzfwh.zzn();
            long j3 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzeo.zzc(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i7 = 0;
                    for (int i8 = 0; i8 < 4; i8++) {
                        String strZza = zzeo.zza(xmlPullParserNewPullParser, strArr[i8]);
                        if (strZza != null) {
                            if (Integer.parseInt(strZza) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i9 = 0;
                            while (true) {
                                if (i9 < 4) {
                                    String strZza2 = zzeo.zza(xmlPullParserNewPullParser, strArr2[i9]);
                                    if (strZza2 != null) {
                                        j = Long.parseLong(strZza2);
                                        if (j != -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    i9++;
                                }
                                j = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i7 >= 2) {
                                    zzfwhVarZzn = zzfwh.zzn();
                                    break;
                                }
                                String strZza3 = zzeo.zza(xmlPullParserNewPullParser, strArr3[i7]);
                                if (strZza3 != null) {
                                    zzfwhVarZzn = zzfwh.zzp(new zzafk("image/jpeg", "Primary", 0L, 0L), new zzafk("video/mp4", "MotionPhoto", Long.parseLong(strZza3), 0L));
                                    break;
                                }
                                i7++;
                            }
                            j3 = j;
                        }
                    }
                    return null;
                }
                if (zzeo.zzc(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzfwhVarZzn = zzb(xmlPullParserNewPullParser, "Container", "Item");
                } else if (zzeo.zzc(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzfwhVarZzn = zzb(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzeo.zzb(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzfwhVarZzn.isEmpty()) {
                return null;
            }
            return new zzafl(j3, zzfwhVarZzn);
        } catch (zzaz | NumberFormatException | XmlPullParserException unused) {
            zzdq.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfwh zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i7 = zzfwh.zzd;
        zzfwe zzfweVar = new zzfwe();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzeo.zzc(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZza = zzeo.zza(xmlPullParser, strConcat2);
                String strZza2 = zzeo.zza(xmlPullParser, strConcat3);
                String strZza3 = zzeo.zza(xmlPullParser, strConcat4);
                String strZza4 = zzeo.zza(xmlPullParser, strConcat5);
                if (strZza == null || strZza2 == null) {
                    return zzfwh.zzn();
                }
                zzfweVar.zzf(new zzafk(strZza, strZza2, strZza3 != null ? Long.parseLong(strZza3) : 0L, strZza4 != null ? Long.parseLong(strZza4) : 0L));
            }
        } while (!zzeo.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfweVar.zzi();
    }
}
