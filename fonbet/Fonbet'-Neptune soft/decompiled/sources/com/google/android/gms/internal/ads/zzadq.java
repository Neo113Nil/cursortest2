package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzadq implements zzaea {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzadp zzc = new zzadp(new zzado() { // from class: com.google.android.gms.internal.ads.zzadm
        @Override // com.google.android.gms.internal.ads.zzado
        public final Constructor zza() {
            int i = zzadq.zza;
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzadv.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzadp zzd = new zzadp(new zzado() { // from class: com.google.android.gms.internal.ads.zzadn
        @Override // com.google.android.gms.internal.ads.zzado
        public final Constructor zza() {
            int i = zzadq.zza;
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzadv.class).getConstructor(null);
        }
    });
    private zzfyq zze;
    private final zzakr zzf = new zzakm();

    /* JADX WARN: Code restructure failed: missing block: B:223:0x0139, code lost:
    
        if (r4.equals("application/mp4") != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0163, code lost:
    
        if (r4.equals("image/heic") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0178, code lost:
    
        if (r4.equals("audio/amr-wb") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0182, code lost:
    
        if (r4.equals("video/webm") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01a3, code lost:
    
        if (r4.equals("audio/eac3-joc") != false) goto L111;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a8 A[Catch: all -> 0x038f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01a8, B:15:0x01ab, B:20:0x036d, B:21:0x0370, B:23:0x0375, B:26:0x037b, B:28:0x037e, B:32:0x0381, B:37:0x01b4, B:39:0x01bc, B:42:0x01c6, B:45:0x01d1, B:47:0x01d9, B:50:0x01e3, B:53:0x01ee, B:56:0x01f9, B:59:0x0204, B:61:0x020c, B:63:0x0214, B:66:0x021e, B:68:0x022c, B:71:0x0236, B:74:0x0241, B:76:0x0249, B:78:0x0257, B:80:0x0265, B:83:0x0275, B:85:0x0283, B:88:0x028d, B:90:0x0295, B:92:0x029d, B:94:0x02a5, B:97:0x02af, B:99:0x02b7, B:102:0x02c7, B:104:0x02cf, B:107:0x02d9, B:109:0x02e1, B:112:0x02eb, B:114:0x02f3, B:117:0x02fc, B:120:0x0307, B:123:0x0313, B:126:0x031e, B:128:0x0326, B:131:0x032f, B:133:0x0337, B:136:0x0340, B:152:0x0048, B:153:0x0050, B:155:0x0054, B:159:0x005e, B:162:0x0068, B:165:0x0073, B:168:0x007f, B:171:0x008a, B:175:0x0094, B:179:0x009e, B:183:0x00a8, B:186:0x00b3, B:189:0x00be, B:192:0x00c8, B:195:0x00d2, B:198:0x00dd, B:201:0x00e7, B:204:0x00f2, B:207:0x00fc, B:210:0x0106, B:213:0x0112, B:216:0x011d, B:219:0x0128, B:222:0x0133, B:224:0x013f, B:227:0x014a, B:230:0x0154, B:234:0x015d, B:236:0x0168, B:239:0x0172, B:241:0x017c, B:243:0x0187, B:246:0x0192, B:249:0x019d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x036b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0375 A[Catch: all -> 0x038f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01a8, B:15:0x01ab, B:20:0x036d, B:21:0x0370, B:23:0x0375, B:26:0x037b, B:28:0x037e, B:32:0x0381, B:37:0x01b4, B:39:0x01bc, B:42:0x01c6, B:45:0x01d1, B:47:0x01d9, B:50:0x01e3, B:53:0x01ee, B:56:0x01f9, B:59:0x0204, B:61:0x020c, B:63:0x0214, B:66:0x021e, B:68:0x022c, B:71:0x0236, B:74:0x0241, B:76:0x0249, B:78:0x0257, B:80:0x0265, B:83:0x0275, B:85:0x0283, B:88:0x028d, B:90:0x0295, B:92:0x029d, B:94:0x02a5, B:97:0x02af, B:99:0x02b7, B:102:0x02c7, B:104:0x02cf, B:107:0x02d9, B:109:0x02e1, B:112:0x02eb, B:114:0x02f3, B:117:0x02fc, B:120:0x0307, B:123:0x0313, B:126:0x031e, B:128:0x0326, B:131:0x032f, B:133:0x0337, B:136:0x0340, B:152:0x0048, B:153:0x0050, B:155:0x0054, B:159:0x005e, B:162:0x0068, B:165:0x0073, B:168:0x007f, B:171:0x008a, B:175:0x0094, B:179:0x009e, B:183:0x00a8, B:186:0x00b3, B:189:0x00be, B:192:0x00c8, B:195:0x00d2, B:198:0x00dd, B:201:0x00e7, B:204:0x00f2, B:207:0x00fc, B:210:0x0106, B:213:0x0112, B:216:0x011d, B:219:0x0128, B:222:0x0133, B:224:0x013f, B:227:0x014a, B:230:0x0154, B:234:0x015d, B:236:0x0168, B:239:0x0172, B:241:0x017c, B:243:0x0187, B:246:0x0192, B:249:0x019d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b4 A[Catch: all -> 0x038f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01a8, B:15:0x01ab, B:20:0x036d, B:21:0x0370, B:23:0x0375, B:26:0x037b, B:28:0x037e, B:32:0x0381, B:37:0x01b4, B:39:0x01bc, B:42:0x01c6, B:45:0x01d1, B:47:0x01d9, B:50:0x01e3, B:53:0x01ee, B:56:0x01f9, B:59:0x0204, B:61:0x020c, B:63:0x0214, B:66:0x021e, B:68:0x022c, B:71:0x0236, B:74:0x0241, B:76:0x0249, B:78:0x0257, B:80:0x0265, B:83:0x0275, B:85:0x0283, B:88:0x028d, B:90:0x0295, B:92:0x029d, B:94:0x02a5, B:97:0x02af, B:99:0x02b7, B:102:0x02c7, B:104:0x02cf, B:107:0x02d9, B:109:0x02e1, B:112:0x02eb, B:114:0x02f3, B:117:0x02fc, B:120:0x0307, B:123:0x0313, B:126:0x031e, B:128:0x0326, B:131:0x032f, B:133:0x0337, B:136:0x0340, B:152:0x0048, B:153:0x0050, B:155:0x0054, B:159:0x005e, B:162:0x0068, B:165:0x0073, B:168:0x007f, B:171:0x008a, B:175:0x0094, B:179:0x009e, B:183:0x00a8, B:186:0x00b3, B:189:0x00be, B:192:0x00c8, B:195:0x00d2, B:198:0x00dd, B:201:0x00e7, B:204:0x00f2, B:207:0x00fc, B:210:0x0106, B:213:0x0112, B:216:0x011d, B:219:0x0128, B:222:0x0133, B:224:0x013f, B:227:0x014a, B:230:0x0154, B:234:0x015d, B:236:0x0168, B:239:0x0172, B:241:0x017c, B:243:0x0187, B:246:0x0192, B:249:0x019d), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzaea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzadv[] zza(Uri uri, Map map) {
        ArrayList arrayList;
        int i;
        String lastPathSegment;
        int i2;
        int i3;
        arrayList = new ArrayList(21);
        List list = (List) map.get(HttpHeaders.CONTENT_TYPE);
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        if (str != null) {
            String zze = zzay.zze(str);
            switch (zze.hashCode()) {
                case -2123537834:
                    break;
                case -1662384011:
                    if (zze.equals("video/mp2p")) {
                        i = 10;
                        break;
                    }
                    break;
                case -1662384007:
                    if (zze.equals("video/mp2t")) {
                        i = 11;
                        break;
                    }
                    break;
                case -1662095187:
                    break;
                case -1606874997:
                    break;
                case -1487656890:
                    if (zze.equals("image/avif")) {
                        i = 21;
                        break;
                    }
                    break;
                case -1487464693:
                    break;
                case -1487464690:
                    if (zze.equals("image/heif")) {
                        i = 20;
                        break;
                    }
                    break;
                case -1487394660:
                    if (zze.equals("image/jpeg")) {
                        i = 14;
                        break;
                    }
                    break;
                case -1487018032:
                    if (zze.equals("image/webp")) {
                        i = 18;
                        break;
                    }
                    break;
                case -1248337486:
                    break;
                case -1079884372:
                    if (zze.equals("video/x-msvideo")) {
                        i = 16;
                        break;
                    }
                    break;
                case -1004728940:
                    if (zze.equals("text/vtt")) {
                        i = 13;
                        break;
                    }
                    break;
                case -879272239:
                    if (zze.equals("image/bmp")) {
                        i = 19;
                        break;
                    }
                    break;
                case -879258763:
                    if (zze.equals("image/png")) {
                        i = 17;
                        break;
                    }
                    break;
                case -387023398:
                    if (zze.equals("audio/x-matroska")) {
                        i = 6;
                        break;
                    }
                    break;
                case -43467528:
                    if (zze.equals("application/webm")) {
                        i = 6;
                        break;
                    }
                    break;
                case 13915911:
                    if (zze.equals("video/x-flv")) {
                        i = 5;
                        break;
                    }
                    break;
                case 187078296:
                    if (zze.equals("audio/ac3")) {
                        i = 0;
                        break;
                    }
                    break;
                case 187078297:
                    if (zze.equals("audio/ac4")) {
                        i = 1;
                        break;
                    }
                    break;
                case 187078669:
                    if (zze.equals("audio/amr")) {
                        i = 3;
                        break;
                    }
                    break;
                case 187090232:
                    if (zze.equals("audio/mp4")) {
                        i = 8;
                        break;
                    }
                    break;
                case 187091926:
                    if (zze.equals("audio/ogg")) {
                        i = 9;
                        break;
                    }
                    break;
                case 187099443:
                    if (zze.equals("audio/wav")) {
                        i = 12;
                        break;
                    }
                    break;
                case 1331848029:
                    if (zze.equals("video/mp4")) {
                        i = 8;
                        break;
                    }
                    break;
                case 1503095341:
                    if (zze.equals("audio/3gpp")) {
                        i = 3;
                        break;
                    }
                    break;
                case 1504578661:
                    if (zze.equals("audio/eac3")) {
                        i = 0;
                        break;
                    }
                    break;
                case 1504619009:
                    if (zze.equals("audio/flac")) {
                        i = 4;
                        break;
                    }
                    break;
                case 1504824762:
                    if (zze.equals("audio/midi")) {
                        i = 15;
                        break;
                    }
                    break;
                case 1504831518:
                    if (zze.equals("audio/mpeg")) {
                        i = 7;
                        break;
                    }
                    break;
                case 1505118770:
                    if (zze.equals("audio/webm")) {
                        i = 6;
                        break;
                    }
                    break;
                case 2039520277:
                    if (zze.equals("video/x-matroska")) {
                        i = 6;
                        break;
                    }
                    break;
            }
            if (i != -1) {
                zzb(i, arrayList);
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                    if (lastPathSegment.endsWith(".ac4")) {
                        i2 = 1;
                    } else {
                        if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                            if (lastPathSegment.endsWith(".amr")) {
                                i2 = 3;
                            } else if (lastPathSegment.endsWith(".flac")) {
                                i2 = 4;
                            } else if (lastPathSegment.endsWith(".flv")) {
                                i2 = 5;
                            } else {
                                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                        if (lastPathSegment.endsWith(".mp3")) {
                                            i2 = 7;
                                        } else {
                                            if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                                if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                    if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                        if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                            if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                                if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                    if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                                        if (lastPathSegment.endsWith(".avi")) {
                                                                            i2 = 16;
                                                                        } else if (lastPathSegment.endsWith(".png")) {
                                                                            i2 = 17;
                                                                        } else if (lastPathSegment.endsWith(".webp")) {
                                                                            i2 = 18;
                                                                        } else {
                                                                            if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                                                if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                                                    if (lastPathSegment.endsWith(".avif")) {
                                                                                        i2 = 21;
                                                                                    }
                                                                                }
                                                                                i2 = 20;
                                                                            }
                                                                            i2 = 19;
                                                                        }
                                                                    }
                                                                    i2 = 14;
                                                                }
                                                                i2 = 13;
                                                            }
                                                            i2 = 12;
                                                        }
                                                        i2 = 11;
                                                    }
                                                    i2 = 10;
                                                }
                                                i2 = 9;
                                            }
                                            i2 = 8;
                                        }
                                    }
                                    i2 = 6;
                                }
                                i2 = 15;
                            }
                        }
                        i2 = 2;
                    }
                    if (i2 != -1 && i2 != i) {
                        zzb(i2, arrayList);
                    }
                    int[] iArr = zzb;
                    for (i3 = 0; i3 < 21; i3++) {
                        int i4 = iArr[i3];
                        if (i4 != i && i4 != i2) {
                            zzb(i4, arrayList);
                        }
                    }
                }
                i2 = 0;
                if (i2 != -1) {
                    zzb(i2, arrayList);
                }
                int[] iArr2 = zzb;
                while (i3 < 21) {
                }
            }
            i2 = -1;
            if (i2 != -1) {
            }
            int[] iArr22 = zzb;
            while (i3 < 21) {
            }
        }
        i = -1;
        if (i != -1) {
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
        }
        i2 = -1;
        if (i2 != -1) {
        }
        int[] iArr222 = zzb;
        while (i3 < 21) {
        }
        return (zzadv[]) arrayList.toArray(new zzadv[arrayList.size()]);
    }

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzamq());
                break;
            case 1:
                list.add(new zzams());
                break;
            case 2:
                list.add(new zzamu(0));
                break;
            case 3:
                list.add(new zzafi(0));
                break;
            case 4:
                zzadv zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzaga(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzagc());
                break;
            case 6:
                list.add(new zzahy(this.zzf, 0));
                break;
            case 7:
                list.add(new zzaie(0));
                break;
            case 8:
                zzakr zzakrVar = this.zzf;
                list.add(new zzajd(zzakrVar, 0, null, null, zzfyq.zzn(), null));
                list.add(new zzajj(zzakrVar, 0));
                break;
            case 9:
                list.add(new zzajz());
                break;
            case 10:
                list.add(new zzanz());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfyq.zzn();
                }
                list.add(new zzaoj(1, 0, this.zzf, new zzeu(0L), new zzamw(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaov());
                break;
            case 14:
                list.add(new zzagi(0));
                break;
            case 15:
                zzadv zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzafn(0, this.zzf));
                break;
            case 17:
                list.add(new zzakk());
                break;
            case 18:
                list.add(new zzapa());
                break;
            case 19:
                list.add(new zzafv());
                break;
            case 20:
                list.add(new zzagh());
                break;
            case 21:
                list.add(new zzafu());
                break;
        }
    }
}
