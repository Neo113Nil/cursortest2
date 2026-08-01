package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.media3.common.MimeTypes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzagd implements zzagn {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzagc zzc = new zzagc(zzaga.zza);
    private static final zzagc zzd = new zzagc(zzafz.zza);
    private zzgxm zze;
    private final zzanx zzf = new zzans();

    @Override // com.google.android.gms.internal.ads.zzagn
    public final synchronized zzagh[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01fa A[Catch: all -> 0x03e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fa, B:15:0x01fd, B:20:0x03c2, B:21:0x03c5, B:23:0x03ca, B:26:0x03d0, B:28:0x03d3, B:32:0x03d6, B:37:0x0206, B:39:0x020e, B:42:0x0218, B:45:0x0224, B:47:0x022c, B:50:0x0236, B:53:0x0241, B:56:0x024c, B:59:0x0257, B:61:0x025f, B:63:0x0267, B:66:0x0271, B:68:0x027f, B:71:0x0289, B:74:0x0294, B:76:0x029c, B:78:0x02aa, B:80:0x02b8, B:83:0x02c8, B:85:0x02d6, B:88:0x02e0, B:90:0x02e8, B:92:0x02f0, B:94:0x02f8, B:97:0x0302, B:99:0x030a, B:102:0x031a, B:104:0x0322, B:107:0x032c, B:109:0x0334, B:112:0x033e, B:114:0x0346, B:117:0x034f, B:120:0x035b, B:123:0x0367, B:126:0x0373, B:128:0x037b, B:131:0x0384, B:133:0x038c, B:136:0x0395, B:152:0x0047, B:153:0x004f, B:156:0x01c0, B:179:0x0054, B:182:0x0060, B:185:0x006b, B:188:0x0077, B:191:0x0083, B:194:0x008e, B:197:0x009a, B:200:0x00a5, B:203:0x00b1, B:206:0x00bd, B:209:0x00c8, B:212:0x00d4, B:215:0x00df, B:218:0x00ea, B:221:0x00f5, B:224:0x0101, B:227:0x010c, B:230:0x0118, B:233:0x0124, B:236:0x0130, B:239:0x013c, B:242:0x0148, B:245:0x0154, B:248:0x0160, B:251:0x016b, B:254:0x0176, B:257:0x0181, B:260:0x018c, B:263:0x0197, B:266:0x01a1, B:269:0x01ab, B:272:0x01b5), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0047 A[Catch: all -> 0x03e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fa, B:15:0x01fd, B:20:0x03c2, B:21:0x03c5, B:23:0x03ca, B:26:0x03d0, B:28:0x03d3, B:32:0x03d6, B:37:0x0206, B:39:0x020e, B:42:0x0218, B:45:0x0224, B:47:0x022c, B:50:0x0236, B:53:0x0241, B:56:0x024c, B:59:0x0257, B:61:0x025f, B:63:0x0267, B:66:0x0271, B:68:0x027f, B:71:0x0289, B:74:0x0294, B:76:0x029c, B:78:0x02aa, B:80:0x02b8, B:83:0x02c8, B:85:0x02d6, B:88:0x02e0, B:90:0x02e8, B:92:0x02f0, B:94:0x02f8, B:97:0x0302, B:99:0x030a, B:102:0x031a, B:104:0x0322, B:107:0x032c, B:109:0x0334, B:112:0x033e, B:114:0x0346, B:117:0x034f, B:120:0x035b, B:123:0x0367, B:126:0x0373, B:128:0x037b, B:131:0x0384, B:133:0x038c, B:136:0x0395, B:152:0x0047, B:153:0x004f, B:156:0x01c0, B:179:0x0054, B:182:0x0060, B:185:0x006b, B:188:0x0077, B:191:0x0083, B:194:0x008e, B:197:0x009a, B:200:0x00a5, B:203:0x00b1, B:206:0x00bd, B:209:0x00c8, B:212:0x00d4, B:215:0x00df, B:218:0x00ea, B:221:0x00f5, B:224:0x0101, B:227:0x010c, B:230:0x0118, B:233:0x0124, B:236:0x0130, B:239:0x013c, B:242:0x0148, B:245:0x0154, B:248:0x0160, B:251:0x016b, B:254:0x0176, B:257:0x0181, B:260:0x018c, B:263:0x0197, B:266:0x01a1, B:269:0x01ab, B:272:0x01b5), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03ca A[Catch: all -> 0x03e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fa, B:15:0x01fd, B:20:0x03c2, B:21:0x03c5, B:23:0x03ca, B:26:0x03d0, B:28:0x03d3, B:32:0x03d6, B:37:0x0206, B:39:0x020e, B:42:0x0218, B:45:0x0224, B:47:0x022c, B:50:0x0236, B:53:0x0241, B:56:0x024c, B:59:0x0257, B:61:0x025f, B:63:0x0267, B:66:0x0271, B:68:0x027f, B:71:0x0289, B:74:0x0294, B:76:0x029c, B:78:0x02aa, B:80:0x02b8, B:83:0x02c8, B:85:0x02d6, B:88:0x02e0, B:90:0x02e8, B:92:0x02f0, B:94:0x02f8, B:97:0x0302, B:99:0x030a, B:102:0x031a, B:104:0x0322, B:107:0x032c, B:109:0x0334, B:112:0x033e, B:114:0x0346, B:117:0x034f, B:120:0x035b, B:123:0x0367, B:126:0x0373, B:128:0x037b, B:131:0x0384, B:133:0x038c, B:136:0x0395, B:152:0x0047, B:153:0x004f, B:156:0x01c0, B:179:0x0054, B:182:0x0060, B:185:0x006b, B:188:0x0077, B:191:0x0083, B:194:0x008e, B:197:0x009a, B:200:0x00a5, B:203:0x00b1, B:206:0x00bd, B:209:0x00c8, B:212:0x00d4, B:215:0x00df, B:218:0x00ea, B:221:0x00f5, B:224:0x0101, B:227:0x010c, B:230:0x0118, B:233:0x0124, B:236:0x0130, B:239:0x013c, B:242:0x0148, B:245:0x0154, B:248:0x0160, B:251:0x016b, B:254:0x0176, B:257:0x0181, B:260:0x018c, B:263:0x0197, B:266:0x01a1, B:269:0x01ab, B:272:0x01b5), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0206 A[Catch: all -> 0x03e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fa, B:15:0x01fd, B:20:0x03c2, B:21:0x03c5, B:23:0x03ca, B:26:0x03d0, B:28:0x03d3, B:32:0x03d6, B:37:0x0206, B:39:0x020e, B:42:0x0218, B:45:0x0224, B:47:0x022c, B:50:0x0236, B:53:0x0241, B:56:0x024c, B:59:0x0257, B:61:0x025f, B:63:0x0267, B:66:0x0271, B:68:0x027f, B:71:0x0289, B:74:0x0294, B:76:0x029c, B:78:0x02aa, B:80:0x02b8, B:83:0x02c8, B:85:0x02d6, B:88:0x02e0, B:90:0x02e8, B:92:0x02f0, B:94:0x02f8, B:97:0x0302, B:99:0x030a, B:102:0x031a, B:104:0x0322, B:107:0x032c, B:109:0x0334, B:112:0x033e, B:114:0x0346, B:117:0x034f, B:120:0x035b, B:123:0x0367, B:126:0x0373, B:128:0x037b, B:131:0x0384, B:133:0x038c, B:136:0x0395, B:152:0x0047, B:153:0x004f, B:156:0x01c0, B:179:0x0054, B:182:0x0060, B:185:0x006b, B:188:0x0077, B:191:0x0083, B:194:0x008e, B:197:0x009a, B:200:0x00a5, B:203:0x00b1, B:206:0x00bd, B:209:0x00c8, B:212:0x00d4, B:215:0x00df, B:218:0x00ea, B:221:0x00f5, B:224:0x0101, B:227:0x010c, B:230:0x0118, B:233:0x0124, B:236:0x0130, B:239:0x013c, B:242:0x0148, B:245:0x0154, B:248:0x0160, B:251:0x016b, B:254:0x0176, B:257:0x0181, B:260:0x018c, B:263:0x0197, B:266:0x01a1, B:269:0x01ab, B:272:0x01b5), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzagn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzagh[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        char c;
        int i;
        String lastPathSegment;
        int i2;
        int i3;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
            if (str != null) {
                String zzh = zzas.zzh(str);
                switch (zzh.hashCode()) {
                    case -2123537834:
                        if (zzh.equals("audio/eac3-joc")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384011:
                        if (zzh.equals("video/mp2p")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384007:
                        if (zzh.equals("video/mp2t")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662095187:
                        if (zzh.equals("video/webm")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1606874997:
                        if (zzh.equals("audio/amr-wb")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487656890:
                        if (zzh.equals(MimeTypes.IMAGE_AVIF)) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487464693:
                        if (zzh.equals("image/heic")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487464690:
                        if (zzh.equals("image/heif")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487394660:
                        if (zzh.equals("image/jpeg")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487018032:
                        if (zzh.equals("image/webp")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1248337486:
                        if (zzh.equals("application/mp4")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1079884372:
                        if (zzh.equals("video/x-msvideo")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1004728940:
                        if (zzh.equals("text/vtt")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879272239:
                        if (zzh.equals(MimeTypes.IMAGE_BMP)) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879258763:
                        if (zzh.equals(MimeTypes.IMAGE_PNG)) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -387023398:
                        if (zzh.equals("audio/x-matroska")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -43467528:
                        if (zzh.equals("application/webm")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 13915911:
                        if (zzh.equals("video/x-flv")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078296:
                        if (zzh.equals("audio/ac3")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078297:
                        if (zzh.equals("audio/ac4")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078669:
                        if (zzh.equals("audio/amr")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187090232:
                        if (zzh.equals("audio/mp4")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187091926:
                        if (zzh.equals("audio/ogg")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187099443:
                        if (zzh.equals("audio/wav")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1331848029:
                        if (zzh.equals("video/mp4")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1503095341:
                        if (zzh.equals("audio/3gpp")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504578661:
                        if (zzh.equals("audio/eac3")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504619009:
                        if (zzh.equals("audio/flac")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504824762:
                        if (zzh.equals("audio/midi")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504831518:
                        if (zzh.equals("audio/mpeg")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1505118770:
                        if (zzh.equals("audio/webm")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2039520277:
                        if (zzh.equals("video/x-matroska")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i = 3;
                        break;
                    case 7:
                        i = 4;
                        break;
                    case '\b':
                        i = 5;
                        break;
                    case '\t':
                        i = 15;
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                        i = 6;
                        break;
                    case 15:
                        i = 7;
                        break;
                    case 16:
                    case 17:
                    case 18:
                        i = 8;
                        break;
                    case 19:
                        i = 9;
                        break;
                    case 20:
                        i = 10;
                        break;
                    case 21:
                        i = 11;
                        break;
                    case 22:
                        i = 12;
                        break;
                    case 23:
                        i = 13;
                        break;
                    case 24:
                        i = 14;
                        break;
                    case 25:
                        i = 16;
                        break;
                    case 26:
                        i = 17;
                        break;
                    case 27:
                        i = 18;
                        break;
                    case 28:
                        i = 19;
                        break;
                    case 29:
                    case 30:
                        i = 20;
                        break;
                    case 31:
                        i = 21;
                        break;
                }
                if (i != -1) {
                    zzc(i, arrayList);
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
                            zzc(i2, arrayList);
                        }
                        int[] iArr = zzb;
                        for (i3 = 0; i3 < 21; i3++) {
                            int i4 = iArr[i3];
                            if (i4 != i && i4 != i2) {
                                zzc(i4, arrayList);
                            }
                        }
                    }
                    i2 = 0;
                    if (i2 != -1) {
                        zzc(i2, arrayList);
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
        }
        str = null;
        if (str != null) {
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
        int[] iArr2222 = zzb;
        while (i3 < 21) {
        }
        return (zzagh[]) arrayList.toArray(new zzagh[0]);
    }

    private final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzapw());
                break;
            case 1:
                list.add(new zzapz());
                break;
            case 2:
                list.add(new zzaqc(0));
                break;
            case 3:
                list.add(new zzahy(0));
                break;
            case 4:
                zzagh zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzaip(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzais());
                break;
            case 6:
                list.add(new zzakt(this.zzf, 0));
                break;
            case 7:
                list.add(new zzalb(0));
                break;
            case 8:
                zzanx zzanxVar = this.zzf;
                list.add(new zzamd(zzanxVar, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED, null, null, zzgxm.zzi(), null));
                list.add(new zzamp(zzanxVar, 160));
                break;
            case 9:
                list.add(new zzang());
                break;
            case 10:
                list.add(new zzarg());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgxm.zzi();
                }
                list.add(new zzarr(1, 0, this.zzf, new zzfj(0L), new zzaqe(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzase());
                break;
            case 14:
                list.add(new zzaja(0));
                break;
            case 15:
                zzagh zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzaic(0, this.zzf));
                break;
            case 17:
                list.add(new zzanq());
                break;
            case 18:
                list.add(new zzasj());
                break;
            case 19:
                list.add(new zzaik());
                break;
            case 20:
                list.add(new zzaiy(0));
                break;
            case 21:
                list.add(new zzaij());
                break;
        }
    }
}
