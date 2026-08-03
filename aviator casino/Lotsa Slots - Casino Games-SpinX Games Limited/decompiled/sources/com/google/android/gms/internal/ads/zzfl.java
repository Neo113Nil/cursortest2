package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfl {
    public static final java.lang.String zza;
    public static final byte[] zzb;
    private static final java.util.regex.Pattern zzc;
    private static java.util.HashMap zzd;
    private static final java.lang.String[] zze;
    private static final java.lang.String[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;

    static {
        java.lang.String str = android.os.Build.DEVICE;
        java.lang.String str2 = android.os.Build.MODEL;
        java.lang.String str3 = android.os.Build.MANUFACTURER;
        int i = android.os.Build.VERSION.SDK_INT;
        int length = java.lang.String.valueOf(str).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 2 + java.lang.String.valueOf(str2).length() + 2 + java.lang.String.valueOf(str3).length() + 2 + java.lang.String.valueOf(i).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        zza = sb.toString();
        zzb = new byte[0];
        zzc = java.util.regex.Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zze = new java.lang.String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", com.unity3d.services.ads.gmascar.utils.ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzf = new java.lang.String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzg = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzh = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzi = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 196, 195, 202, 205, 144, 151, 158, 153, 140, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 130, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 228, 237, 234, 183, 176, 185, com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, androidx.compose.material.TextFieldImplKt.AnimationDuration, 145, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 159, 138, 141, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    public static com.google.android.gms.internal.ads.zzv zzA(int i, int i2, int i3) {
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zzo("audio/raw");
        zztVar.zzG(i2);
        zztVar.zzH(i3);
        zztVar.zzI(i);
        return zztVar.zzO();
    }

    public static int zzC(int i) {
        if (i != 32) {
            return i != 64 ? 0 : 1879048192;
        }
        return 4;
    }

    public static boolean zzD(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192;
    }

    public static int zzE(int i) {
        int i2;
        int i3 = 6396;
        if (i != 10) {
            if (i == 16) {
                i2 = 205215996;
            } else if (i != 24) {
                switch (i) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i) {
                            case 12:
                                return 743676;
                            case 13:
                                i2 = 30136348;
                                break;
                            case 14:
                                i2 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                }
            } else {
                i2 = 67108860;
            }
            i3 = 0;
        } else {
            i2 = 737532;
        }
        return android.os.Build.VERSION.SDK_INT >= 32 ? i2 : i3;
    }

    public static int zzF(int i) {
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int zzG(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    if (i == 1879048192) {
                                        return 8;
                                    }
                                    throw new java.lang.IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzH(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzI(android.net.Uri uri) {
        char c;
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && (com.google.android.gms.internal.ads.zzgss.zze("rtsp", scheme) || com.google.android.gms.internal.ads.zzgss.zze("rtspt", scheme))) {
            return 3;
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            java.lang.String zza2 = com.google.android.gms.internal.ads.zzgss.zza(lastPathSegment.substring(lastIndexOf + 1));
            switch (zza2.hashCode()) {
                case 104579:
                    if (zza2.equals("ism")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 108321:
                    if (zza2.equals("mpd")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3242057:
                    if (zza2.equals("isml")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3299913:
                    if (zza2.equals("m3u8")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            int i = c != 0 ? c != 1 ? (c == 2 || c == 3) ? 1 : 4 : 2 : 0;
            if (i != 4) {
                return i;
            }
        }
        java.util.regex.Pattern pattern = zzc;
        java.lang.String path = uri.getPath();
        path.getClass();
        java.util.regex.Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        java.lang.String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int zzJ(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = zzg[(i3 >>> 24) ^ (bArr[i] & 255)] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int zzK(byte[] bArr, int i, int i2, int i3) {
        int i4 = 65535;
        for (int i5 = 0; i5 < i2; i5++) {
            int m = com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(bArr[i5]);
            i4 = zzW(m & 15, zzW(m >> 4, i4));
        }
        return i4;
    }

    public static int zzL(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = zzi[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    public static int zzM(java.nio.ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i2 : java.lang.Integer.reverseBytes(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        r4.zzf(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzN(com.google.android.gms.internal.ads.zzet zzetVar, com.google.android.gms.internal.ads.zzet zzetVar2, java.util.zip.Inflater inflater) {
        boolean z = false;
        if (zzetVar.zzd() == 0) {
            return false;
        }
        if (zzetVar2.zzj() < zzetVar.zzd()) {
            int zzd2 = zzetVar.zzd();
            zzetVar2.zzc(zzd2 + zzd2);
        }
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
        }
        inflater.setInput(zzetVar.zzi(), zzetVar.zzg(), zzetVar.zzd());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(zzetVar2.zzi(), i, zzetVar2.zzj() - i);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i == zzetVar2.zzj()) {
                        int zzj = zzetVar2.zzj();
                        zzetVar2.zzc(zzj + zzj);
                    }
                } else {
                    break;
                }
            } catch (java.util.zip.DataFormatException unused) {
            } catch (java.lang.Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z;
    }

    public static boolean zzO(com.google.android.gms.internal.ads.zzet zzetVar, com.google.android.gms.internal.ads.zzet zzetVar2, java.util.zip.Inflater inflater) {
        return zzetVar.zzd() > 0 && zzetVar.zzn() == 120 && zzN(zzetVar, zzetVar2, inflater);
    }

    public static boolean zzP(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzQ(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static android.graphics.Point zzR(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzP(context)) {
            java.lang.String zzX = android.os.Build.VERSION.SDK_INT < 28 ? zzX("sys.display-size") : zzX("vendor.display-size");
            if (!android.text.TextUtils.isEmpty(zzX)) {
                try {
                    java.lang.String[] split = zzX.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = java.lang.Integer.parseInt(split[0]);
                        int parseInt2 = java.lang.Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new android.graphics.Point(parseInt, parseInt2);
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                java.lang.String.valueOf(zzX);
                com.google.android.gms.internal.ads.zzeg.zze("Util", "Invalid display size: ".concat(java.lang.String.valueOf(zzX)));
            }
            if ("Sony".equals(android.os.Build.MANUFACTURER) && android.os.Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new android.graphics.Point(3840, 2160);
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        android.view.Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static java.lang.String zzS(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return com.unity3d.ads.BuildConfig.FLAVOR;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static int zzT(java.lang.String str) {
        java.lang.String[] split;
        int length;
        int i = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        java.lang.String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length + (-2)]);
        str2.getClass();
        try {
            java.lang.String str3 = str2;
            i = java.lang.Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return i;
    }

    public static boolean zzU(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT == 30 && (com.google.android.gms.internal.ads.zzgss.zze(android.os.Build.MODEL, "moto g(20)") || com.google.android.gms.internal.ads.zzgss.zze(android.os.Build.MODEL, "rmx3231"))) {
            return true;
        }
        return android.os.Build.VERSION.SDK_INT == 34 && com.google.android.gms.internal.ads.zzgss.zze(android.os.Build.MODEL, "sm-x200");
    }

    private static long zzV(long j, long j2, long j3, java.math.RoundingMode roundingMode) {
        long zzc2 = com.google.android.gms.internal.ads.zzhab.zzc(j, j2);
        if (zzc2 != Long.MAX_VALUE && zzc2 != Long.MIN_VALUE) {
            return com.google.android.gms.internal.ads.zzhab.zza(zzc2, j3, roundingMode);
        }
        long zzb2 = com.google.android.gms.internal.ads.zzhab.zzb(java.lang.Math.abs(j2), java.lang.Math.abs(j3));
        long zza2 = com.google.android.gms.internal.ads.zzhab.zza(j2, zzb2, java.math.RoundingMode.UNNECESSARY);
        long zza3 = com.google.android.gms.internal.ads.zzhab.zza(j3, zzb2, java.math.RoundingMode.UNNECESSARY);
        long zzb3 = com.google.android.gms.internal.ads.zzhab.zzb(java.lang.Math.abs(j), java.lang.Math.abs(zza3));
        long zza4 = com.google.android.gms.internal.ads.zzhab.zza(j, zzb3, java.math.RoundingMode.UNNECESSARY);
        long zza5 = com.google.android.gms.internal.ads.zzhab.zza(zza3, zzb3, java.math.RoundingMode.UNNECESSARY);
        long zzc3 = com.google.android.gms.internal.ads.zzhab.zzc(zza4, zza2);
        if (zzc3 != Long.MAX_VALUE && zzc3 != Long.MIN_VALUE) {
            return com.google.android.gms.internal.ads.zzhab.zza(zzc3, zza5, roundingMode);
        }
        double d = zza4 * (zza2 / zza5);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return com.google.android.gms.internal.ads.zzgzw.zza(d, roundingMode);
    }

    private static int zzW(int i, int i2) {
        return (char) (zzh[(i ^ (i2 >> 12)) & 255] ^ ((char) (i2 << 4)));
    }

    private static java.lang.String zzX(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.ads.zzeg.zzf("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    private static java.util.HashMap zzY() {
        java.lang.String[] iSOLanguages = java.util.Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        java.util.HashMap hashMap = new java.util.HashMap(length + 88);
        int i = 0;
        for (java.lang.String str : iSOLanguages) {
            try {
                java.lang.String iSO3Language = new java.util.Locale(str).getISO3Language();
                if (!android.text.TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (java.util.MissingResourceException unused) {
            }
        }
        while (true) {
            java.lang.String[] strArr = zze;
            int length3 = strArr.length;
            if (i >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static boolean zza(android.util.SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static java.lang.Object[] zzb(java.lang.Object[] objArr, int i) {
        com.google.android.gms.internal.ads.zzgtj.zza(i <= objArr.length);
        return java.util.Arrays.copyOf(objArr, i);
    }

    public static void zzc(java.util.List list, java.lang.Object[] objArr) {
        com.google.android.gms.internal.ads.zzgtj.zzi(list.size() == objArr.length);
        list.toArray(objArr);
    }

    public static android.os.Handler zzd(android.os.Handler.Callback callback) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        myLooper.getClass();
        return new android.os.Handler(myLooper, null);
    }

    public static boolean zze(android.os.Handler handler, java.lang.Runnable runnable) {
        android.os.Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != android.os.Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static android.os.Looper zzf() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null ? myLooper : android.os.Looper.getMainLooper();
    }

    public static java.util.concurrent.ExecutorService zzg(final java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzfk
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                return new java.lang.Thread(runnable, str);
            }
        });
    }

    public static java.util.concurrent.ScheduledExecutorService zzh(java.lang.String str) {
        final java.lang.String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new java.util.concurrent.ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzfj
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
                return new java.lang.Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static java.lang.String zzi(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        java.lang.String zza2 = com.google.android.gms.internal.ads.zzgss.zza(str);
        int i = 0;
        java.lang.String str2 = zza2.split("-", 2)[0];
        if (zzd == null) {
            zzd = zzY();
        }
        java.lang.String str3 = (java.lang.String) zzd.get(str2);
        if (str3 != null) {
            java.lang.String substring = zza2.substring(str2.length());
            java.lang.String.valueOf(substring);
            zza2 = str3.concat(java.lang.String.valueOf(substring));
            str2 = str3;
        }
        if (!"no".equals(str2) && !androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) && !"zh".equals(str2)) {
            return zza2;
        }
        while (true) {
            java.lang.String[] strArr = zzf;
            int length = strArr.length;
            if (i >= 18) {
                return zza2;
            }
            if (zza2.startsWith(strArr[i])) {
                java.lang.String str4 = strArr[i + 1];
                java.lang.String substring2 = zza2.substring(strArr[i].length());
                java.lang.String.valueOf(str4);
                java.lang.String.valueOf(substring2);
                return java.lang.String.valueOf(str4).concat(java.lang.String.valueOf(substring2));
            }
            i += 2;
        }
    }

    public static java.lang.String zzj(byte[] bArr) {
        return new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.lang.String zzk(byte[] bArr, int i, int i2) {
        return new java.lang.String(bArr, i, i2, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static boolean zzl(int i) {
        return i == 10 || i == 13;
    }

    public static double zzm(double d, double d2, double d3) {
        return java.lang.Math.max(-1.0d, java.lang.Math.min(d, 1.0d));
    }

    public static int zzn(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = java.util.Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? java.lang.Math.max(0, i3) : i3;
    }

    public static int zzo(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                int i2 = binarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                binarySearch = i2;
            }
            i = binarySearch;
        }
        return z2 ? java.lang.Math.max(0, i) : i;
    }

    public static int zzp(com.google.android.gms.internal.ads.zzeh zzehVar, long j, boolean z, boolean z2) {
        int zzd2 = zzehVar.zzd() - 1;
        int i = 0;
        while (i <= zzd2) {
            int i2 = (i + zzd2) >>> 1;
            if (zzehVar.zzc(i2) < j) {
                i = i2 + 1;
            } else {
                zzd2 = i2 - 1;
            }
        }
        int i3 = zzd2 + 1;
        if (i3 < zzehVar.zzd() && zzehVar.zzc(i3) == j) {
            return i3;
        }
        if (zzd2 == -1) {
            return 0;
        }
        return zzd2;
    }

    public static int zzq(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i = binarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            binarySearch = i;
        }
        return !z ? i : binarySearch;
    }

    public static long zzr(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long zzs(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long zzt(long j, int i) {
        return zzv(j, 1000000L, i, java.math.RoundingMode.DOWN);
    }

    public static long zzu(long j, int i) {
        return zzv(j, i, 1000000L, java.math.RoundingMode.UP);
    }

    public static long zzv(long j, long j2, long j3, java.math.RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? zzV(j, j2, j3, roundingMode) : com.google.android.gms.internal.ads.zzhab.zzc(j2, com.google.android.gms.internal.ads.zzhab.zza(j, j3, java.math.RoundingMode.UNNECESSARY)) : com.google.android.gms.internal.ads.zzhab.zza(j2, com.google.android.gms.internal.ads.zzhab.zza(j3, j, java.math.RoundingMode.UNNECESSARY), roundingMode) : com.google.android.gms.internal.ads.zzhab.zzc(j, com.google.android.gms.internal.ads.zzhab.zza(j2, j3, java.math.RoundingMode.UNNECESSARY)) : com.google.android.gms.internal.ads.zzhab.zza(j, com.google.android.gms.internal.ads.zzhab.zza(j3, j2, java.math.RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void zzw(long[] jArr, long j, long j2) {
        int i = 0;
        java.math.RoundingMode roundingMode = java.math.RoundingMode.DOWN;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long zza2 = com.google.android.gms.internal.ads.zzhab.zza(j2, 1000000L, java.math.RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = com.google.android.gms.internal.ads.zzhab.zza(jArr[i], zza2, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long zza3 = com.google.android.gms.internal.ads.zzhab.zza(1000000L, j2, java.math.RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = com.google.android.gms.internal.ads.zzhab.zzc(jArr[i], zza3);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = com.google.android.gms.internal.ads.zzhab.zza(1000000L, com.google.android.gms.internal.ads.zzhab.zza(j2, j3, java.math.RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j3 || j3 % j2 != 0) {
                    jArr[i2] = zzV(j3, 1000000L, j2, roundingMode);
                } else {
                    jArr[i2] = com.google.android.gms.internal.ads.zzhab.zzc(1000000L, com.google.android.gms.internal.ads.zzhab.zza(j3, j2, java.math.RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static long zzx(long j, float f) {
        return f == 1.0f ? j : java.lang.Math.round(j * f);
    }

    public static long zzy(long j, float f) {
        return f == 1.0f ? j : java.lang.Math.round(j / f);
    }

    public static java.lang.String zzz(int i) {
        return new java.lang.String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, java.nio.charset.StandardCharsets.US_ASCII);
    }

    public static int zzB(int i, java.nio.ByteOrder byteOrder) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            if (byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN)) {
                return 21;
            }
            return androidx.media3.common.C.ENCODING_PCM_24BIT_BIG_ENDIAN;
        }
        if (i != 32) {
            return 0;
        }
        if (byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN)) {
            return 22;
        }
        return androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN;
    }
}
