package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbbd;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzacp implements zzada {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzaco zzc = new zzaco(new zzacn() { // from class: com.google.android.gms.internal.ads.zzacl
        @Override // com.google.android.gms.internal.ads.zzacn
        public final Constructor zza() {
            int i7 = zzacp.zza;
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzacv.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzaco zzd = new zzaco(new zzacn() { // from class: com.google.android.gms.internal.ads.zzacm
        @Override // com.google.android.gms.internal.ads.zzacn
        public final Constructor zza() {
            int i7 = zzacp.zza;
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzacv.class).getConstructor(null);
        }
    });
    private zzfwh zze;
    private final zzajq zzf = new zzajl();

    private final void zzb(int i7, List list) {
        switch (i7) {
            case 0:
                list.add(new zzalp());
                break;
            case 1:
                list.add(new zzalr());
                break;
            case 2:
                list.add(new zzalt(0));
                break;
            case 3:
                list.add(new zzaei(0));
                break;
            case 4:
                zzacv zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzafa(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzafc());
                break;
            case 6:
                list.add(new zzagy(this.zzf, 0));
                break;
            case 7:
                list.add(new zzahe(0));
                break;
            case 8:
                list.add(new zzaic(this.zzf, 0, null, null, zzfwh.zzn(), null));
                list.add(new zzaii(this.zzf, 0));
                break;
            case 9:
                list.add(new zzaiy());
                break;
            case 10:
                list.add(new zzamy());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfwh.zzn();
                }
                list.add(new zzani(1, 0, this.zzf, new zzek(0L), new zzalv(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzant());
                break;
            case 14:
                list.add(new zzafi(0));
                break;
            case 15:
                zzacv zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzaen(0, this.zzf));
                break;
            case 17:
                list.add(new zzajj());
                break;
            case 18:
                list.add(new zzany());
                break;
            case 19:
                list.add(new zzaev());
                break;
            case 20:
                list.add(new zzafh());
                break;
            case zzbbd.zzt.zzm /* 21 */:
                list.add(new zzaeu());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01fb A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01fb, B:14:0x01fe, B:19:0x03b1, B:20:0x03b4, B:22:0x03b9, B:25:0x03bf, B:27:0x03c2, B:31:0x03c5, B:36:0x0207, B:38:0x020f, B:40:0x021a, B:43:0x0226, B:45:0x022e, B:47:0x0239, B:50:0x0244, B:53:0x024f, B:56:0x025a, B:58:0x0262, B:60:0x026a, B:62:0x0276, B:64:0x0284, B:66:0x028f, B:69:0x029a, B:71:0x02a2, B:73:0x02b0, B:75:0x02be, B:77:0x02d0, B:79:0x02de, B:81:0x02ea, B:83:0x02f2, B:85:0x02fa, B:87:0x0302, B:89:0x030e, B:91:0x0316, B:93:0x0327, B:95:0x032f, B:97:0x033a, B:99:0x0342, B:101:0x034e, B:103:0x0356, B:105:0x0360, B:108:0x036a, B:111:0x0374, B:114:0x037f, B:116:0x0387, B:118:0x0392, B:120:0x039a, B:122:0x03a4, B:138:0x004c, B:139:0x0054, B:142:0x01c3, B:165:0x0059, B:168:0x0065, B:171:0x0071, B:174:0x007d, B:177:0x0089, B:180:0x0094, B:183:0x00a0, B:186:0x00ab, B:189:0x00b6, B:192:0x00c2, B:195:0x00ce, B:198:0x00d9, B:201:0x00e4, B:204:0x00ef, B:207:0x00fa, B:210:0x0106, B:213:0x0111, B:216:0x011c, B:219:0x0128, B:222:0x0134, B:225:0x0140, B:228:0x014c, B:231:0x0158, B:234:0x0164, B:237:0x016f, B:240:0x017a, B:243:0x0185, B:246:0x0190, B:249:0x019a, B:252:0x01a4, B:255:0x01ae, B:258:0x01b8), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03b9 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01fb, B:14:0x01fe, B:19:0x03b1, B:20:0x03b4, B:22:0x03b9, B:25:0x03bf, B:27:0x03c2, B:31:0x03c5, B:36:0x0207, B:38:0x020f, B:40:0x021a, B:43:0x0226, B:45:0x022e, B:47:0x0239, B:50:0x0244, B:53:0x024f, B:56:0x025a, B:58:0x0262, B:60:0x026a, B:62:0x0276, B:64:0x0284, B:66:0x028f, B:69:0x029a, B:71:0x02a2, B:73:0x02b0, B:75:0x02be, B:77:0x02d0, B:79:0x02de, B:81:0x02ea, B:83:0x02f2, B:85:0x02fa, B:87:0x0302, B:89:0x030e, B:91:0x0316, B:93:0x0327, B:95:0x032f, B:97:0x033a, B:99:0x0342, B:101:0x034e, B:103:0x0356, B:105:0x0360, B:108:0x036a, B:111:0x0374, B:114:0x037f, B:116:0x0387, B:118:0x0392, B:120:0x039a, B:122:0x03a4, B:138:0x004c, B:139:0x0054, B:142:0x01c3, B:165:0x0059, B:168:0x0065, B:171:0x0071, B:174:0x007d, B:177:0x0089, B:180:0x0094, B:183:0x00a0, B:186:0x00ab, B:189:0x00b6, B:192:0x00c2, B:195:0x00ce, B:198:0x00d9, B:201:0x00e4, B:204:0x00ef, B:207:0x00fa, B:210:0x0106, B:213:0x0111, B:216:0x011c, B:219:0x0128, B:222:0x0134, B:225:0x0140, B:228:0x014c, B:231:0x0158, B:234:0x0164, B:237:0x016f, B:240:0x017a, B:243:0x0185, B:246:0x0190, B:249:0x019a, B:252:0x01a4, B:255:0x01ae, B:258:0x01b8), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0207 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01fb, B:14:0x01fe, B:19:0x03b1, B:20:0x03b4, B:22:0x03b9, B:25:0x03bf, B:27:0x03c2, B:31:0x03c5, B:36:0x0207, B:38:0x020f, B:40:0x021a, B:43:0x0226, B:45:0x022e, B:47:0x0239, B:50:0x0244, B:53:0x024f, B:56:0x025a, B:58:0x0262, B:60:0x026a, B:62:0x0276, B:64:0x0284, B:66:0x028f, B:69:0x029a, B:71:0x02a2, B:73:0x02b0, B:75:0x02be, B:77:0x02d0, B:79:0x02de, B:81:0x02ea, B:83:0x02f2, B:85:0x02fa, B:87:0x0302, B:89:0x030e, B:91:0x0316, B:93:0x0327, B:95:0x032f, B:97:0x033a, B:99:0x0342, B:101:0x034e, B:103:0x0356, B:105:0x0360, B:108:0x036a, B:111:0x0374, B:114:0x037f, B:116:0x0387, B:118:0x0392, B:120:0x039a, B:122:0x03a4, B:138:0x004c, B:139:0x0054, B:142:0x01c3, B:165:0x0059, B:168:0x0065, B:171:0x0071, B:174:0x007d, B:177:0x0089, B:180:0x0094, B:183:0x00a0, B:186:0x00ab, B:189:0x00b6, B:192:0x00c2, B:195:0x00ce, B:198:0x00d9, B:201:0x00e4, B:204:0x00ef, B:207:0x00fa, B:210:0x0106, B:213:0x0111, B:216:0x011c, B:219:0x0128, B:222:0x0134, B:225:0x0140, B:228:0x014c, B:231:0x0158, B:234:0x0164, B:237:0x016f, B:240:0x017a, B:243:0x0185, B:246:0x0190, B:249:0x019a, B:252:0x01a4, B:255:0x01ae, B:258:0x01b8), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzacv[] zza(Uri uri, Map map) {
        ArrayList arrayList;
        char c3;
        int i7;
        String lastPathSegment;
        int i8;
        int i9;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                String zze = zzay.zze(str);
                switch (zze.hashCode()) {
                    case -2123537834:
                        if (zze.equals("audio/eac3-joc")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1662384011:
                        if (zze.equals("video/mp2p")) {
                            c3 = 20;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1662384007:
                        if (zze.equals("video/mp2t")) {
                            c3 = 21;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1662095187:
                        if (zze.equals("video/webm")) {
                            c3 = '\f';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1606874997:
                        if (zze.equals("audio/amr-wb")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1487656890:
                        if (zze.equals("image/avif")) {
                            c3 = 31;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1487464693:
                        if (zze.equals("image/heic")) {
                            c3 = 30;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1487464690:
                        if (zze.equals("image/heif")) {
                            c3 = 29;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1487394660:
                        if (zze.equals("image/jpeg")) {
                            c3 = 24;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1487018032:
                        if (zze.equals("image/webp")) {
                            c3 = 27;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1248337486:
                        if (zze.equals("application/mp4")) {
                            c3 = 18;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1079884372:
                        if (zze.equals("video/x-msvideo")) {
                            c3 = 25;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1004728940:
                        if (zze.equals("text/vtt")) {
                            c3 = 23;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -879272239:
                        if (zze.equals("image/bmp")) {
                            c3 = 28;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -879258763:
                        if (zze.equals("image/png")) {
                            c3 = 26;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -387023398:
                        if (zze.equals("audio/x-matroska")) {
                            c3 = 11;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -43467528:
                        if (zze.equals("application/webm")) {
                            c3 = 14;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 13915911:
                        if (zze.equals("video/x-flv")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 187078296:
                        if (zze.equals("audio/ac3")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 187078297:
                        if (zze.equals("audio/ac4")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 187078669:
                        if (zze.equals("audio/amr")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 187090232:
                        if (zze.equals("audio/mp4")) {
                            c3 = 17;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 187091926:
                        if (zze.equals("audio/ogg")) {
                            c3 = 19;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 187099443:
                        if (zze.equals("audio/wav")) {
                            c3 = 22;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1331848029:
                        if (zze.equals("video/mp4")) {
                            c3 = 16;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1503095341:
                        if (zze.equals("audio/3gpp")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1504578661:
                        if (zze.equals("audio/eac3")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1504619009:
                        if (zze.equals("audio/flac")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1504824762:
                        if (zze.equals("audio/midi")) {
                            c3 = '\t';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1504831518:
                        if (zze.equals("audio/mpeg")) {
                            c3 = 15;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1505118770:
                        if (zze.equals("audio/webm")) {
                            c3 = '\r';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2039520277:
                        if (zze.equals("video/x-matroska")) {
                            c3 = '\n';
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                    case 1:
                    case 2:
                        i7 = 0;
                        break;
                    case 3:
                        i7 = 1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i7 = 3;
                        break;
                    case 7:
                        i7 = 4;
                        break;
                    case '\b':
                        i7 = 5;
                        break;
                    case '\t':
                        i7 = 15;
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                        i7 = 6;
                        break;
                    case 15:
                        i7 = 7;
                        break;
                    case 16:
                    case 17:
                    case 18:
                        i7 = 8;
                        break;
                    case 19:
                        i7 = 9;
                        break;
                    case 20:
                        i7 = 10;
                        break;
                    case zzbbd.zzt.zzm /* 21 */:
                        i7 = 11;
                        break;
                    case 22:
                        i7 = 12;
                        break;
                    case 23:
                        i7 = 13;
                        break;
                    case 24:
                        i7 = 14;
                        break;
                    case 25:
                        i7 = 16;
                        break;
                    case 26:
                        i7 = 17;
                        break;
                    case 27:
                        i7 = 18;
                        break;
                    case 28:
                        i7 = 19;
                        break;
                    case 29:
                    case 30:
                        i7 = 20;
                        break;
                    case 31:
                        i7 = 21;
                        break;
                }
                if (i7 != -1) {
                    zzb(i7, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                        i8 = 0;
                    } else if (lastPathSegment.endsWith(".ac4")) {
                        i8 = 1;
                    } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                        i8 = 2;
                    } else if (lastPathSegment.endsWith(".amr")) {
                        i8 = 3;
                    } else if (lastPathSegment.endsWith(".flac")) {
                        i8 = 4;
                    } else if (lastPathSegment.endsWith(".flv")) {
                        i8 = 5;
                    } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                        i8 = 15;
                    } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                        i8 = 6;
                    } else if (lastPathSegment.endsWith(".mp3")) {
                        i8 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i8 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i8 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i8 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i8 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i8 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i8 = 13;
                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                        i8 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i8 = 16;
                    } else if (lastPathSegment.endsWith(".png")) {
                        i8 = 17;
                    } else if (lastPathSegment.endsWith(".webp")) {
                        i8 = 18;
                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                        i8 = 19;
                    } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                        i8 = 20;
                    } else if (lastPathSegment.endsWith(".avif")) {
                        i8 = 21;
                    }
                    if (i8 != -1 && i8 != i7) {
                        zzb(i8, arrayList);
                    }
                    int[] iArr = zzb;
                    for (i9 = 0; i9 < 21; i9++) {
                        int i10 = iArr[i9];
                        if (i10 != i7 && i10 != i8) {
                            zzb(i10, arrayList);
                        }
                    }
                }
                i8 = -1;
                if (i8 != -1) {
                    zzb(i8, arrayList);
                }
                int[] iArr2 = zzb;
                while (i9 < 21) {
                }
            }
            i7 = -1;
            if (i7 != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i8 = -1;
            if (i8 != -1) {
            }
            int[] iArr22 = zzb;
            while (i9 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzacv[]) arrayList.toArray(new zzacv[arrayList.size()]);
    }
}
