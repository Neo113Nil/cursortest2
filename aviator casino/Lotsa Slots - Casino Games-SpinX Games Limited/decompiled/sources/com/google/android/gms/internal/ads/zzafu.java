package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafu implements com.google.android.gms.internal.ads.zzage {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final com.google.android.gms.internal.ads.zzaft zzc = new com.google.android.gms.internal.ads.zzaft(com.google.android.gms.internal.ads.zzafr.zza);
    private static final com.google.android.gms.internal.ads.zzaft zzd = new com.google.android.gms.internal.ads.zzaft(com.google.android.gms.internal.ads.zzafq.zza);
    private com.google.android.gms.internal.ads.zzgwm zze;
    private final com.google.android.gms.internal.ads.zzanj zzf = new com.google.android.gms.internal.ads.zzane();

    @Override // com.google.android.gms.internal.ads.zzage
    public final synchronized com.google.android.gms.internal.ads.zzafy[] zza() {
        return zzb(android.net.Uri.EMPTY, new java.util.HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0202 A[Catch: all -> 0x03eb, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0202, B:15:0x0205, B:20:0x03cd, B:21:0x03d0, B:23:0x03d5, B:26:0x03db, B:28:0x03de, B:32:0x03e1, B:37:0x020e, B:39:0x0216, B:42:0x0220, B:45:0x022b, B:47:0x0233, B:50:0x023d, B:53:0x0248, B:56:0x0253, B:59:0x025e, B:61:0x0266, B:63:0x026e, B:66:0x0278, B:68:0x0286, B:71:0x0290, B:74:0x029b, B:76:0x02a3, B:78:0x02b1, B:80:0x02bf, B:83:0x02cf, B:85:0x02dd, B:88:0x02e7, B:90:0x02ef, B:92:0x02f7, B:94:0x02ff, B:97:0x0309, B:99:0x0311, B:102:0x0321, B:104:0x0329, B:107:0x0333, B:109:0x033b, B:112:0x0345, B:114:0x034d, B:117:0x0356, B:120:0x0362, B:123:0x036e, B:126:0x0379, B:128:0x0381, B:131:0x038a, B:133:0x0392, B:136:0x039b, B:152:0x0047, B:153:0x004f, B:156:0x01c4, B:179:0x0054, B:182:0x0060, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009a, B:200:0x00a5, B:203:0x00b1, B:206:0x00bd, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010e, B:230:0x011a, B:233:0x0126, B:236:0x0132, B:239:0x013e, B:242:0x014a, B:245:0x0156, B:248:0x0162, B:251:0x016d, B:254:0x0178, B:257:0x0183, B:260:0x018e, B:263:0x0198, B:266:0x01a3, B:269:0x01ae, B:272:0x01b9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0047 A[Catch: all -> 0x03eb, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0202, B:15:0x0205, B:20:0x03cd, B:21:0x03d0, B:23:0x03d5, B:26:0x03db, B:28:0x03de, B:32:0x03e1, B:37:0x020e, B:39:0x0216, B:42:0x0220, B:45:0x022b, B:47:0x0233, B:50:0x023d, B:53:0x0248, B:56:0x0253, B:59:0x025e, B:61:0x0266, B:63:0x026e, B:66:0x0278, B:68:0x0286, B:71:0x0290, B:74:0x029b, B:76:0x02a3, B:78:0x02b1, B:80:0x02bf, B:83:0x02cf, B:85:0x02dd, B:88:0x02e7, B:90:0x02ef, B:92:0x02f7, B:94:0x02ff, B:97:0x0309, B:99:0x0311, B:102:0x0321, B:104:0x0329, B:107:0x0333, B:109:0x033b, B:112:0x0345, B:114:0x034d, B:117:0x0356, B:120:0x0362, B:123:0x036e, B:126:0x0379, B:128:0x0381, B:131:0x038a, B:133:0x0392, B:136:0x039b, B:152:0x0047, B:153:0x004f, B:156:0x01c4, B:179:0x0054, B:182:0x0060, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009a, B:200:0x00a5, B:203:0x00b1, B:206:0x00bd, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010e, B:230:0x011a, B:233:0x0126, B:236:0x0132, B:239:0x013e, B:242:0x014a, B:245:0x0156, B:248:0x0162, B:251:0x016d, B:254:0x0178, B:257:0x0183, B:260:0x018e, B:263:0x0198, B:266:0x01a3, B:269:0x01ae, B:272:0x01b9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03d5 A[Catch: all -> 0x03eb, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0202, B:15:0x0205, B:20:0x03cd, B:21:0x03d0, B:23:0x03d5, B:26:0x03db, B:28:0x03de, B:32:0x03e1, B:37:0x020e, B:39:0x0216, B:42:0x0220, B:45:0x022b, B:47:0x0233, B:50:0x023d, B:53:0x0248, B:56:0x0253, B:59:0x025e, B:61:0x0266, B:63:0x026e, B:66:0x0278, B:68:0x0286, B:71:0x0290, B:74:0x029b, B:76:0x02a3, B:78:0x02b1, B:80:0x02bf, B:83:0x02cf, B:85:0x02dd, B:88:0x02e7, B:90:0x02ef, B:92:0x02f7, B:94:0x02ff, B:97:0x0309, B:99:0x0311, B:102:0x0321, B:104:0x0329, B:107:0x0333, B:109:0x033b, B:112:0x0345, B:114:0x034d, B:117:0x0356, B:120:0x0362, B:123:0x036e, B:126:0x0379, B:128:0x0381, B:131:0x038a, B:133:0x0392, B:136:0x039b, B:152:0x0047, B:153:0x004f, B:156:0x01c4, B:179:0x0054, B:182:0x0060, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009a, B:200:0x00a5, B:203:0x00b1, B:206:0x00bd, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010e, B:230:0x011a, B:233:0x0126, B:236:0x0132, B:239:0x013e, B:242:0x014a, B:245:0x0156, B:248:0x0162, B:251:0x016d, B:254:0x0178, B:257:0x0183, B:260:0x018e, B:263:0x0198, B:266:0x01a3, B:269:0x01ae, B:272:0x01b9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020e A[Catch: all -> 0x03eb, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0202, B:15:0x0205, B:20:0x03cd, B:21:0x03d0, B:23:0x03d5, B:26:0x03db, B:28:0x03de, B:32:0x03e1, B:37:0x020e, B:39:0x0216, B:42:0x0220, B:45:0x022b, B:47:0x0233, B:50:0x023d, B:53:0x0248, B:56:0x0253, B:59:0x025e, B:61:0x0266, B:63:0x026e, B:66:0x0278, B:68:0x0286, B:71:0x0290, B:74:0x029b, B:76:0x02a3, B:78:0x02b1, B:80:0x02bf, B:83:0x02cf, B:85:0x02dd, B:88:0x02e7, B:90:0x02ef, B:92:0x02f7, B:94:0x02ff, B:97:0x0309, B:99:0x0311, B:102:0x0321, B:104:0x0329, B:107:0x0333, B:109:0x033b, B:112:0x0345, B:114:0x034d, B:117:0x0356, B:120:0x0362, B:123:0x036e, B:126:0x0379, B:128:0x0381, B:131:0x038a, B:133:0x0392, B:136:0x039b, B:152:0x0047, B:153:0x004f, B:156:0x01c4, B:179:0x0054, B:182:0x0060, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009a, B:200:0x00a5, B:203:0x00b1, B:206:0x00bd, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010e, B:230:0x011a, B:233:0x0126, B:236:0x0132, B:239:0x013e, B:242:0x014a, B:245:0x0156, B:248:0x0162, B:251:0x016d, B:254:0x0178, B:257:0x0183, B:260:0x018e, B:263:0x0198, B:266:0x01a3, B:269:0x01ae, B:272:0x01b9), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized com.google.android.gms.internal.ads.zzafy[] zzb(android.net.Uri uri, java.util.Map map) {
        java.util.ArrayList arrayList;
        java.lang.String str;
        char c;
        int i;
        java.lang.String lastPathSegment;
        int i2;
        int i3;
        arrayList = new java.util.ArrayList(21);
        java.util.List list = (java.util.List) map.get("Content-Type");
        if (list != null && !list.isEmpty()) {
            str = (java.lang.String) list.get(0);
            if (str != null) {
                java.lang.String zzh = com.google.android.gms.internal.ads.zzas.zzh(str);
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
                        if (zzh.equals(androidx.media3.common.MimeTypes.IMAGE_AVIF)) {
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
                        if (zzh.equals(androidx.media3.common.MimeTypes.IMAGE_BMP)) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879258763:
                        if (zzh.equals(androidx.media3.common.MimeTypes.IMAGE_PNG)) {
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
        return (com.google.android.gms.internal.ads.zzafy[]) arrayList.toArray(new com.google.android.gms.internal.ads.zzafy[0]);
    }

    private final void zzc(int i, java.util.List list) {
        switch (i) {
            case 0:
                list.add(new com.google.android.gms.internal.ads.zzapi());
                break;
            case 1:
                list.add(new com.google.android.gms.internal.ads.zzapl());
                break;
            case 2:
                list.add(new com.google.android.gms.internal.ads.zzapo(0));
                break;
            case 3:
                list.add(new com.google.android.gms.internal.ads.zzahp(0));
                break;
            case 4:
                com.google.android.gms.internal.ads.zzafy zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new com.google.android.gms.internal.ads.zzaig(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new com.google.android.gms.internal.ads.zzaij());
                break;
            case 6:
                list.add(new com.google.android.gms.internal.ads.zzakh(this.zzf, 0));
                break;
            case 7:
                list.add(new com.google.android.gms.internal.ads.zzakp(0));
                break;
            case 8:
                com.google.android.gms.internal.ads.zzanj zzanjVar = this.zzf;
                list.add(new com.google.android.gms.internal.ads.zzalr(zzanjVar, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED, null, null, com.google.android.gms.internal.ads.zzgwm.zzi(), null));
                list.add(new com.google.android.gms.internal.ads.zzamc(zzanjVar, 160));
                break;
            case 9:
                list.add(new com.google.android.gms.internal.ads.zzams());
                break;
            case 10:
                list.add(new com.google.android.gms.internal.ads.zzaqs());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = com.google.android.gms.internal.ads.zzgwm.zzi();
                }
                list.add(new com.google.android.gms.internal.ads.zzard(1, 0, this.zzf, new com.google.android.gms.internal.ads.zzfi(0L), new com.google.android.gms.internal.ads.zzapq(0, this.zze), 112800));
                break;
            case 12:
                list.add(new com.google.android.gms.internal.ads.zzarq());
                break;
            case 14:
                list.add(new com.google.android.gms.internal.ads.zzaiq(0));
                break;
            case 15:
                com.google.android.gms.internal.ads.zzafy zza3 = zzd.zza(new java.lang.Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new com.google.android.gms.internal.ads.zzaht(0, this.zzf));
                break;
            case 17:
                list.add(new com.google.android.gms.internal.ads.zzanc());
                break;
            case 18:
                list.add(new com.google.android.gms.internal.ads.zzarv());
                break;
            case 19:
                list.add(new com.google.android.gms.internal.ads.zzaib());
                break;
            case 20:
                list.add(new com.google.android.gms.internal.ads.zzaip(0));
                break;
            case 21:
                list.add(new com.google.android.gms.internal.ads.zzaia());
                break;
        }
    }
}
