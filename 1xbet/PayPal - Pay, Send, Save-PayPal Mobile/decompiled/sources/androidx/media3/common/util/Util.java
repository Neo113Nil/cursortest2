package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class Util {
    private static final java.util.regex.Pattern Camera2StreamConfigurationMap;
    public static final java.lang.String DEVICE_DEBUG_INFO;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final long[] EMPTY_LONG_ARRAY;
    private static final int[] getHighResolutionOutputSizeshNQ4ISI;
    private static final int[] getHighSpeedVideoFpsRanges;
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRangesFor;
    private static final int[] getHighSpeedVideoSizes;
    private static java.util.HashMap<java.lang.String, java.lang.String> getHighSpeedVideoSizesFor;
    private static final java.util.regex.Pattern getInputFormats;
    private static final java.util.regex.Pattern getInputSizeshNQ4ISI;
    private static final java.lang.String[] getOutputFormats;
    private static final java.lang.String[] getOutputMinFrameDuration;

    @java.lang.Deprecated
    public static final int SDK_INT = android.os.Build.VERSION.SDK_INT;

    @java.lang.Deprecated
    public static final java.lang.String DEVICE = android.os.Build.DEVICE;

    @java.lang.Deprecated
    public static final java.lang.String MANUFACTURER = android.os.Build.MANUFACTURER;

    @java.lang.Deprecated
    public static final java.lang.String MODEL = android.os.Build.MODEL;

    private static boolean Camera2StreamConfigurationMap(char c) {
        return c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?';
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T castNonNull(T t) {
        return t;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i) {
        if (i == 30) {
            return 34;
        }
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
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    @java.lang.Deprecated
    public static int getAudioContentTypeForStreamType(int i) {
        if (i != 0) {
            if (i == 1 || i == 2 || i == 4 || i == 5 || i == 8) {
                return 4;
            }
            if (i != 10) {
                return 2;
            }
        }
        return 1;
    }

    public static int getAudioUsageForStreamType(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 13;
        }
        if (i == 2) {
            return 6;
        }
        int i2 = 4;
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                if (i != 8) {
                    return i != 10 ? 1 : 11;
                }
                return 3;
            }
        }
        return i2;
    }

    public static int getBufferFlagsFromMediaCodecFlags(int i) {
        int i2 = (i & 1) != 1 ? 0 : 1;
        return (i & 4) == 4 ? i2 | 4 : i2;
    }

    public static int getErrorCodeForMediaDrmErrorCode(int i) {
        if (i == 2 || i == 4) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 7) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        switch (i) {
            case 15:
                return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
            case 16:
            case 18:
                return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
                    default:
                        return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    @java.lang.Deprecated
    public static int getStreamTypeForAudioUsage(int i) {
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static boolean isEncodingHighResolutionPcm(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean isEncodingLinearPcm(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean isLinebreak(int i) {
        return i == 10 || i == 13;
    }

    public static long msToUs(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static float percentFloat(long j, long j2) {
        if (j2 == 0 || j != j2) {
            return (j / j2) * 100.0f;
        }
        return 100.0f;
    }

    public static long toUnsignedLong(int i) {
        return i & 4294967295L;
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(android.os.Build.DEVICE);
        sb.append(", ");
        sb.append(android.os.Build.MODEL);
        sb.append(", ");
        sb.append(android.os.Build.MANUFACTURER);
        sb.append(", ");
        sb.append(android.os.Build.VERSION.SDK_INT);
        DEVICE_DEBUG_INFO = sb.toString();
        EMPTY_BYTE_ARRAY = new byte[0];
        EMPTY_LONG_ARRAY = new long[0];
        getInputSizeshNQ4ISI = java.util.regex.Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        getInputFormats = java.util.regex.Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Camera2StreamConfigurationMap = java.util.regex.Pattern.compile("%([A-Fa-f0-9]{2})");
        getHighSpeedVideoFpsRangesFor = java.util.regex.Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        getOutputMinFrameDuration = new java.lang.String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.SR_TRACK_NAME, "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        getOutputFormats = new java.lang.String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        getHighResolutionOutputSizeshNQ4ISI = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        getHighSpeedVideoSizes = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        getHighSpeedVideoFpsRanges = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 251, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 202, 205, 144, 151, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 153, 140, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 130, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 175, 166, 161, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 179, 186, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 199, 192, 201, 206, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 255, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 241, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 227, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 183, 176, 185, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 171, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 165, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 137, 142, 135, 128, 149, 146, 155, 156, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 163, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 247, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 226, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 236, 193, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 207, 200, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, 211, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 105, 110, 103, 96, 117, 114, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 160, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, 215, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, 197, 204, 203, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 225, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 239, 250, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE};
    }

    private Util() {
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.io.InputStream inputStream) throws java.io.IOException {
        return com.google.common.io.ByteStreams.toByteArray(inputStream);
    }

    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            bArr[i] = (byte) (i3 >> 24);
            bArr[i + 1] = (byte) (i3 >> 16);
            bArr[i + 2] = (byte) (i3 >> 8);
            bArr[i + 3] = (byte) i3;
            i2++;
            i += 4;
        }
        return bArr;
    }

    public static byte[] toByteArray(float f) {
        return com.google.common.primitives.Ints.toByteArray(java.lang.Float.floatToIntBits(f));
    }

    public static android.content.Intent registerReceiverNotExported(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static android.content.ComponentName startForegroundService(android.content.Context context, android.content.Intent intent) {
        return context.startForegroundService(intent);
    }

    public static void setForegroundServiceNotification(android.app.Service service, int i, android.app.Notification notification, int i2, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.media3.common.util.Util.Api29.getHighResolutionOutputSizeshNQ4ISI(service, i, notification, i2, str);
        } else {
            service.startForeground(i, notification);
        }
    }

    @java.lang.Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(android.app.Activity activity, android.net.Uri... uriArr) {
        for (android.net.Uri uri : uriArr) {
            if (getHighSpeedVideoSizes(activity, uri)) {
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    if (getHighResolutionOutputSizeshNQ4ISI(activity)) {
                        return true;
                    }
                } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    activity.requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(android.app.Activity activity, androidx.media3.common.MediaItem... mediaItemArr) {
        return maybeRequestReadStoragePermission(activity, mediaItemArr);
    }

    public static boolean maybeRequestReadStoragePermission(android.app.Activity activity, androidx.media3.common.MediaItem... mediaItemArr) {
        for (androidx.media3.common.MediaItem mediaItem : mediaItemArr) {
            if (mediaItem.localConfiguration != null) {
                if (getHighResolutionOutputSizeshNQ4ISI(activity, mediaItem.localConfiguration.uri)) {
                    return true;
                }
                com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem.SubtitleConfiguration> immutableList = mediaItem.localConfiguration.subtitleConfigurations;
                for (int i = 0; i < immutableList.size(); i++) {
                    if (getHighResolutionOutputSizeshNQ4ISI(activity, immutableList.get(i).uri)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.Activity activity, android.net.Uri uri) {
        if (!getHighSpeedVideoSizes(activity, uri)) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return getHighResolutionOutputSizeshNQ4ISI(activity);
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    private static boolean getHighSpeedVideoSizes(android.app.Activity activity, android.net.Uri uri) {
        if (isLocalFileUri(uri)) {
            return !Camera2StreamConfigurationMap(activity, uri);
        }
        if (java.util.Objects.equals(uri.getScheme(), "content") && java.util.Objects.equals(uri.getAuthority(), io.ktor.http.LinkHeader.Parameters.Media)) {
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (!pathSegments.isEmpty()) {
                java.lang.String str = pathSegments.get(0);
                if (com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL.equals(str) || "external_primary".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean Camera2StreamConfigurationMap(android.app.Activity activity, android.net.Uri uri) {
        try {
            java.lang.String path = uri.getPath();
            if (path == null) {
                return false;
            }
            java.lang.String canonicalPath = new java.io.File(path).getCanonicalPath();
            java.lang.String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            java.lang.String str = null;
            java.io.File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                str = externalFilesDir.getCanonicalPath();
            }
            if (canonicalPath.startsWith(canonicalPath2)) {
                return true;
            }
            if (str != null) {
                if (canonicalPath.startsWith(str)) {
                    return true;
                }
            }
            return false;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static boolean checkCleartextTrafficPermitted(androidx.media3.common.MediaItem... mediaItemArr) {
        for (androidx.media3.common.MediaItem mediaItem : mediaItemArr) {
            if (mediaItem.localConfiguration != null) {
                if (getHighSpeedVideoSizes(mediaItem.localConfiguration.uri)) {
                    return false;
                }
                for (int i = 0; i < mediaItem.localConfiguration.subtitleConfigurations.size(); i++) {
                    if (getHighSpeedVideoSizes(mediaItem.localConfiguration.subtitleConfigurations.get(i).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isLocalFileUri(android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        return android.text.TextUtils.isEmpty(scheme) || java.util.Objects.equals(scheme, "file");
    }

    public static boolean isRunningOnEmulator() {
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(android.os.Build.DEVICE);
        return lowerCase.contains("emulator") || lowerCase.contains("emu64a") || lowerCase.contains("emu64x") || lowerCase.contains("generic");
    }

    @java.lang.Deprecated
    public static boolean areEqual(java.lang.Object obj, java.lang.Object obj2) {
        return java.util.Objects.equals(obj, obj2);
    }

    public static <T> boolean contentEquals(android.util.SparseArray<T> sparseArray, android.util.SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!java.util.Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static <T> int contentHashCode(android.util.SparseArray<T> sparseArray) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i = 17;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            i = (((i * 31) + sparseArray.keyAt(i2)) * 31) + java.util.Objects.hashCode(sparseArray.valueAt(i2));
        }
        return i;
    }

    public static boolean contains(java.lang.Object[] objArr, java.lang.Object obj) {
        for (java.lang.Object obj2 : objArr) {
            if (java.util.Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean contains(android.util.SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static <T> void removeRange(java.util.List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i) {
        com.google.common.base.Preconditions.checkArgument(i <= tArr.length);
        return (T[]) java.util.Arrays.copyOf(tArr, i);
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i >= 0);
        com.google.common.base.Preconditions.checkArgument(i2 <= tArr.length);
        return (T[]) java.util.Arrays.copyOfRange(tArr, i, i2);
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t) {
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t;
        return (T[]) castNonNullTypeArray(copyOf);
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) java.util.Arrays.copyOf(tArr, tArr.length + tArr2.length);
        java.lang.System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> void nullSafeListToArray(java.util.List<T> list, T[] tArr) {
        com.google.common.base.Preconditions.checkState(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static android.os.Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    public static android.os.Handler createHandlerForCurrentLooper(android.os.Handler.Callback callback) {
        return createHandler((android.os.Looper) com.google.common.base.Preconditions.checkNotNull(android.os.Looper.myLooper()), callback);
    }

    public static android.os.Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    public static android.os.Handler createHandlerForCurrentOrMainLooper(android.os.Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    public static android.os.Handler createHandler(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new android.os.Handler(looper, callback);
    }

    public static boolean postOrRun(android.os.Handler handler, java.lang.Runnable runnable) {
        android.os.Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper == android.os.Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static boolean postOrRun(androidx.media3.common.util.HandlerWrapper handlerWrapper, java.lang.Runnable runnable) {
        android.os.Looper looper = handlerWrapper.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper == android.os.Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handlerWrapper.post(runnable);
    }

    public static <T> com.google.common.util.concurrent.ListenableFuture<T> postOrRunWithCompletion(android.os.Handler handler, final java.lang.Runnable runnable, final T t) {
        final com.google.common.util.concurrent.SettableFuture create = com.google.common.util.concurrent.SettableFuture.create();
        postOrRun(handler, new java.lang.Runnable() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.Util.getHighSpeedVideoFpsRangesFor(com.google.common.util.concurrent.SettableFuture.this, runnable, t);
            }
        });
        return create;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.google.common.util.concurrent.SettableFuture settableFuture, java.lang.Runnable runnable, java.lang.Object obj) {
        try {
            if (settableFuture.isCancelled()) {
                return;
            }
            runnable.run();
            settableFuture.set(obj);
        } catch (java.lang.Throwable th) {
            settableFuture.setException(th);
        }
    }

    public static <T, U> com.google.common.util.concurrent.ListenableFuture<T> transformFutureAsync(final com.google.common.util.concurrent.ListenableFuture<U> listenableFuture, final com.google.common.util.concurrent.AsyncFunction<U, T> asyncFunction) {
        final com.google.common.util.concurrent.SettableFuture create = com.google.common.util.concurrent.SettableFuture.create();
        create.addListener(new java.lang.Runnable() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.Util.Camera2StreamConfigurationMap(com.google.common.util.concurrent.SettableFuture.this, listenableFuture);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.Util.getHighSpeedVideoFpsRanges(com.google.common.util.concurrent.ListenableFuture.this, create, asyncFunction);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return create;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(com.google.common.util.concurrent.SettableFuture settableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        if (settableFuture.isCancelled()) {
            listenableFuture.cancel(false);
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.SettableFuture settableFuture, com.google.common.util.concurrent.AsyncFunction asyncFunction) {
        try {
            try {
                settableFuture.setFuture(asyncFunction.apply(com.google.common.util.concurrent.Futures.getDone(listenableFuture)));
            } catch (java.lang.Throwable th) {
                settableFuture.setException(th);
            }
        } catch (java.lang.Error e) {
            e = e;
            settableFuture.setException(e);
        } catch (java.util.concurrent.CancellationException unused) {
            settableFuture.cancel(false);
        } catch (java.lang.RuntimeException e2) {
            e = e2;
            settableFuture.setException(e);
        } catch (java.util.concurrent.ExecutionException e3) {
            e = e3;
            java.lang.Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            settableFuture.setException(e);
        }
    }

    public static android.os.Looper getCurrentOrMainLooper() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null ? myLooper : android.os.Looper.getMainLooper();
    }

    static /* synthetic */ java.lang.Thread getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, str);
    }

    public static java.util.concurrent.ExecutorService newSingleThreadExecutor(final java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return androidx.media3.common.util.Util.getHighResolutionOutputSizeshNQ4ISI(str, runnable);
            }
        });
    }

    static /* synthetic */ java.lang.Thread getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, str);
    }

    public static java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor(final java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new java.util.concurrent.ThreadFactory() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return androidx.media3.common.util.Util.getHighSpeedVideoFpsRangesFor(str, runnable);
            }
        });
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static boolean readBoolean(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void writeBoolean(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static java.lang.String getLocaleLanguageTag(java.util.Locale locale) {
        return locale.toLanguageTag();
    }

    public static java.lang.String normalizeLanguageCode(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        int i = 0;
        java.lang.String str2 = splitAtFirst(lowerCase, "-")[0];
        if (getHighSpeedVideoSizesFor == null) {
            getHighSpeedVideoSizesFor = getHighSpeedVideoSizes();
        }
        java.lang.String str3 = getHighSpeedVideoSizesFor.get(str2);
        if (str3 != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str3);
            sb.append(lowerCase.substring(str2.length()));
            lowerCase = sb.toString();
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return lowerCase;
        }
        while (true) {
            java.lang.String[] strArr = getOutputFormats;
            if (i >= strArr.length) {
                return lowerCase;
            }
            if (lowerCase.startsWith(strArr[i])) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(strArr[i + 1]);
                sb2.append(lowerCase.substring(strArr[i].length()));
                return sb2.toString();
            }
            i += 2;
        }
    }

    public static java.lang.String loadAsset(android.content.Context context, java.lang.String str) throws java.io.IOException {
        java.io.InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            return fromUtf8Bytes(com.google.common.io.ByteStreams.toByteArray(inputStream));
        } finally {
            closeQuietly(inputStream);
        }
    }

    public static java.lang.String fromUtf8Bytes(byte[] bArr) {
        return new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.lang.String fromUtf8Bytes(byte[] bArr, int i, int i2) {
        return new java.lang.String(bArr, i, i2, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static byte[] getUtf8Bytes(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.lang.String[] split(java.lang.String str, java.lang.String str2) {
        return str.split(str2, -1);
    }

    public static java.lang.String[] splitAtFirst(java.lang.String str, java.lang.String str2) {
        return str.split(str2, 2);
    }

    public static java.lang.String formatInvariant(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static int ceilDivide(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static long ceilDivide(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static int constrainValue(int i, int i2, int i3) {
        return java.lang.Math.max(i2, java.lang.Math.min(i, i3));
    }

    public static long constrainValue(long j, long j2, long j3) {
        return java.lang.Math.max(j2, java.lang.Math.min(j, j3));
    }

    public static float constrainValue(float f, float f2, float f3) {
        return java.lang.Math.max(f2, java.lang.Math.min(f, f3));
    }

    public static long addWithOverflowDefault(long j, long j2, long j3) {
        long saturatedAdd = com.google.common.math.LongMath.saturatedAdd(j, j2);
        return ((saturatedAdd != Long.MIN_VALUE || j + j2 == Long.MIN_VALUE) && (saturatedAdd != Long.MAX_VALUE || j + j2 == Long.MAX_VALUE)) ? saturatedAdd : j3;
    }

    public static long subtractWithOverflowDefault(long j, long j2, long j3) {
        long saturatedSubtract = com.google.common.math.LongMath.saturatedSubtract(j, j2);
        return ((saturatedSubtract != Long.MIN_VALUE || j - j2 == Long.MIN_VALUE) && (saturatedSubtract != Long.MAX_VALUE || j - j2 == Long.MAX_VALUE)) ? saturatedSubtract : j3;
    }

    public static int percentInt(long j, long j2) {
        long j3;
        long saturatedMultiply = com.google.common.math.LongMath.saturatedMultiply(j, 100L);
        if (saturatedMultiply != Long.MAX_VALUE && saturatedMultiply != Long.MIN_VALUE) {
            j3 = saturatedMultiply / j2;
        } else {
            j3 = j / (j2 / 100);
        }
        return com.google.common.primitives.Ints.saturatedCast(j3);
    }

    public static int linearSearch(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public static int linearSearch(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] == j) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchFloor(int[] iArr, int i, boolean z, boolean z2) {
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

    public static int binarySearchFloor(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int binarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                i = binarySearch - 1;
                if (i < 0 || jArr[i] != j) {
                    break;
                }
                binarySearch = i;
            }
            i2 = !z ? i : binarySearch;
        }
        return z2 ? java.lang.Math.max(0, i2) : i2;
    }

    public static <T extends java.lang.Comparable<? super T>> int binarySearchFloor(java.util.List<? extends java.lang.Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int i2;
        int binarySearch = java.util.Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                i = binarySearch - 1;
                if (i < 0 || list.get(i).compareTo(t) != 0) {
                    break;
                }
                binarySearch = i;
            }
            i2 = !z ? i : binarySearch;
        }
        return z2 ? java.lang.Math.max(0, i2) : i2;
    }

    public static int binarySearchFloor(androidx.media3.common.util.LongArray longArray, long j, boolean z, boolean z2) {
        int i;
        int size = longArray.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (longArray.get(i3) < j) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        if (z && (i = size + 1) < longArray.size() && longArray.get(i) == j) {
            return i;
        }
        if (z2 && size == -1) {
            return 0;
        }
        return size;
    }

    public static int binarySearchCeil(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = java.util.Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i3 = ~binarySearch;
        } else {
            while (true) {
                i2 = binarySearch + 1;
                if (i2 >= iArr.length || iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? java.lang.Math.min(iArr.length - 1, i3) : i3;
    }

    public static int binarySearchCeil(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int binarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            while (true) {
                i = binarySearch + 1;
                if (i >= jArr.length || jArr[i] != j) {
                    break;
                }
                binarySearch = i;
            }
            i2 = !z ? i : binarySearch;
        }
        return z2 ? java.lang.Math.min(jArr.length - 1, i2) : i2;
    }

    public static <T extends java.lang.Comparable<? super T>> int binarySearchCeil(java.util.List<? extends java.lang.Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int i2;
        int binarySearch = java.util.Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                i = binarySearch + 1;
                if (i >= size || list.get(i).compareTo(t) != 0) {
                    break;
                }
                binarySearch = i;
            }
            i2 = !z ? i : binarySearch;
        }
        return z2 ? java.lang.Math.min(list.size() - 1, i2) : i2;
    }

    public static boolean isSorted(long[] jArr) {
        int i = 0;
        while (i < jArr.length - 1) {
            long j = jArr[i];
            i++;
            if (j > jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @java.lang.Deprecated
    public static int compareLong(long j, long j2) {
        return java.lang.Long.compare(j, j2);
    }

    public static long minValue(android.util.SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new java.util.NoSuchElementException();
        }
        long j = Long.MAX_VALUE;
        for (int i = 0; i < sparseLongArray.size(); i++) {
            j = java.lang.Math.min(j, sparseLongArray.valueAt(i));
        }
        return j;
    }

    public static long maxValue(android.util.SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new java.util.NoSuchElementException();
        }
        long j = Long.MIN_VALUE;
        for (int i = 0; i < sparseLongArray.size(); i++) {
            j = java.lang.Math.max(j, sparseLongArray.valueAt(i));
        }
        return j;
    }

    public static long usToMs(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long sampleCountToDurationUs(long j, int i) {
        return scaleLargeValue(j, 1000000L, i, java.math.RoundingMode.DOWN);
    }

    public static long durationUsToSampleCount(long j, int i) {
        return scaleLargeValue(j, i, 1000000L, java.math.RoundingMode.UP);
    }

    public static long parseXsDuration(java.lang.String str) {
        java.util.regex.Matcher matcher = getInputFormats.matcher(str);
        if (matcher.matches()) {
            boolean isEmpty = android.text.TextUtils.isEmpty(matcher.group(1));
            java.lang.String group = matcher.group(3);
            double parseDouble = group != null ? java.lang.Double.parseDouble(group) * 3.1556908E7d : 0.0d;
            java.lang.String group2 = matcher.group(5);
            double parseDouble2 = group2 != null ? java.lang.Double.parseDouble(group2) * 2629739.0d : 0.0d;
            java.lang.String group3 = matcher.group(7);
            double parseDouble3 = group3 != null ? java.lang.Double.parseDouble(group3) * 86400.0d : 0.0d;
            java.lang.String group4 = matcher.group(10);
            double parseDouble4 = group4 != null ? java.lang.Double.parseDouble(group4) * 3600.0d : 0.0d;
            java.lang.String group5 = matcher.group(12);
            double parseDouble5 = group5 != null ? java.lang.Double.parseDouble(group5) * 60.0d : 0.0d;
            java.lang.String group6 = matcher.group(14);
            long parseDouble6 = (long) ((parseDouble + parseDouble2 + parseDouble3 + parseDouble4 + parseDouble5 + (group6 != null ? java.lang.Double.parseDouble(group6) : 0.0d)) * 1000.0d);
            return !isEmpty ? -parseDouble6 : parseDouble6;
        }
        return (long) (java.lang.Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    public static long parseXsDateTime(java.lang.String str) throws androidx.media3.common.ParserException {
        int i;
        java.util.regex.Matcher matcher = getInputSizeshNQ4ISI.matcher(str);
        if (!matcher.matches()) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid date/time format: ".concat(java.lang.String.valueOf(str)), null);
        }
        if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
            i = 0;
        } else {
            i = (java.lang.Integer.parseInt(matcher.group(12)) * 60) + java.lang.Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(java.lang.Integer.parseInt(matcher.group(1)), java.lang.Integer.parseInt(matcher.group(2)) - 1, java.lang.Integer.parseInt(matcher.group(3)), java.lang.Integer.parseInt(matcher.group(4)), java.lang.Integer.parseInt(matcher.group(5)), java.lang.Integer.parseInt(matcher.group(6)));
        if (!android.text.TextUtils.isEmpty(matcher.group(8))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("0.");
            sb.append(matcher.group(8));
            gregorianCalendar.set(14, new java.math.BigDecimal(sb.toString()).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    public static long scaleLargeValue(long j, long j2, long j3, java.math.RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return com.google.common.math.LongMath.divide(j, com.google.common.math.LongMath.divide(j3, j2, java.math.RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return com.google.common.math.LongMath.saturatedMultiply(j, com.google.common.math.LongMath.divide(j2, j3, java.math.RoundingMode.UNNECESSARY));
        }
        if (j3 >= j && j3 % j == 0) {
            return com.google.common.math.LongMath.divide(j2, com.google.common.math.LongMath.divide(j3, j, java.math.RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j && j % j3 == 0) {
            return com.google.common.math.LongMath.saturatedMultiply(j2, com.google.common.math.LongMath.divide(j, j3, java.math.RoundingMode.UNNECESSARY));
        }
        return getHighSpeedVideoFpsRangesFor(j, j2, j3, roundingMode);
    }

    public static long[] scaleLargeValues(java.util.List<java.lang.Long> list, long j, long j2, java.math.RoundingMode roundingMode) {
        int i;
        int size = list.size();
        long[] jArr = new long[size];
        if (j != 0) {
            int i2 = 0;
            if (j2 >= j && j2 % j == 0) {
                long divide = com.google.common.math.LongMath.divide(j2, j, java.math.RoundingMode.UNNECESSARY);
                while (i2 < size) {
                    jArr[i2] = com.google.common.math.LongMath.divide(list.get(i2).longValue(), divide, roundingMode);
                    i2++;
                }
            } else if (j2 >= j || j % j2 != 0) {
                int i3 = 0;
                while (i3 < size) {
                    long longValue = list.get(i3).longValue();
                    if (longValue != 0) {
                        if (j2 >= longValue && j2 % longValue == 0) {
                            jArr[i3] = com.google.common.math.LongMath.divide(j, com.google.common.math.LongMath.divide(j2, longValue, java.math.RoundingMode.UNNECESSARY), roundingMode);
                        } else if (j2 < longValue && longValue % j2 == 0) {
                            jArr[i3] = com.google.common.math.LongMath.saturatedMultiply(j, com.google.common.math.LongMath.divide(longValue, j2, java.math.RoundingMode.UNNECESSARY));
                        } else {
                            i = i3;
                            jArr[i] = getHighSpeedVideoFpsRangesFor(longValue, j, j2, roundingMode);
                            i3 = i + 1;
                        }
                    }
                    i = i3;
                    i3 = i + 1;
                }
            } else {
                long divide2 = com.google.common.math.LongMath.divide(j, j2, java.math.RoundingMode.UNNECESSARY);
                while (i2 < size) {
                    jArr[i2] = com.google.common.math.LongMath.saturatedMultiply(list.get(i2).longValue(), divide2);
                    i2++;
                }
            }
        }
        return jArr;
    }

    public static void scaleLargeValuesInPlace(long[] jArr, long j, long j2, java.math.RoundingMode roundingMode) {
        if (j == 0) {
            java.util.Arrays.fill(jArr, 0L);
            return;
        }
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long divide = com.google.common.math.LongMath.divide(j2, j, java.math.RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = com.google.common.math.LongMath.divide(jArr[i], divide, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < j && j % j2 == 0) {
            long divide2 = com.google.common.math.LongMath.divide(j, j2, java.math.RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = com.google.common.math.LongMath.saturatedMultiply(jArr[i], divide2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = com.google.common.math.LongMath.divide(j, com.google.common.math.LongMath.divide(j2, j3, java.math.RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 < j3 && j3 % j2 == 0) {
                    jArr[i2] = com.google.common.math.LongMath.saturatedMultiply(j, com.google.common.math.LongMath.divide(j3, j2, java.math.RoundingMode.UNNECESSARY));
                } else {
                    jArr[i2] = getHighSpeedVideoFpsRangesFor(j3, j, j2, roundingMode);
                }
            }
        }
    }

    private static long getHighSpeedVideoFpsRangesFor(long j, long j2, long j3, java.math.RoundingMode roundingMode) {
        long saturatedMultiply = com.google.common.math.LongMath.saturatedMultiply(j, j2);
        if (saturatedMultiply != Long.MAX_VALUE && saturatedMultiply != Long.MIN_VALUE) {
            return com.google.common.math.LongMath.divide(saturatedMultiply, j3, roundingMode);
        }
        long gcd = com.google.common.math.LongMath.gcd(java.lang.Math.abs(j2), java.lang.Math.abs(j3));
        long divide = com.google.common.math.LongMath.divide(j2, gcd, java.math.RoundingMode.UNNECESSARY);
        long divide2 = com.google.common.math.LongMath.divide(j3, gcd, java.math.RoundingMode.UNNECESSARY);
        long gcd2 = com.google.common.math.LongMath.gcd(java.lang.Math.abs(j), java.lang.Math.abs(divide2));
        long divide3 = com.google.common.math.LongMath.divide(j, gcd2, java.math.RoundingMode.UNNECESSARY);
        long divide4 = com.google.common.math.LongMath.divide(divide2, gcd2, java.math.RoundingMode.UNNECESSARY);
        long saturatedMultiply2 = com.google.common.math.LongMath.saturatedMultiply(divide3, divide);
        if (saturatedMultiply2 != Long.MAX_VALUE && saturatedMultiply2 != Long.MIN_VALUE) {
            return com.google.common.math.LongMath.divide(saturatedMultiply2, divide4, roundingMode);
        }
        double d = divide3 * (divide / divide4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return com.google.common.math.DoubleMath.roundToLong(d, roundingMode);
    }

    public static long scaleLargeTimestamp(long j, long j2, long j3) {
        return scaleLargeValue(j, j2, j3, java.math.RoundingMode.DOWN);
    }

    public static long[] scaleLargeTimestamps(java.util.List<java.lang.Long> list, long j, long j2) {
        return scaleLargeValues(list, j, j2, java.math.RoundingMode.DOWN);
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j, long j2) {
        scaleLargeValuesInPlace(jArr, j, j2, java.math.RoundingMode.DOWN);
    }

    public static long getMediaDurationForPlayoutDuration(long j, float f) {
        return f == 1.0f ? j : java.lang.Math.round(j * f);
    }

    public static long getPlayoutDurationForMediaDuration(long j, float f) {
        return f == 1.0f ? j : java.lang.Math.round(j / f);
    }

    public static int getIntegerCodeForString(java.lang.String str) {
        int length = str.length();
        com.google.common.base.Preconditions.checkArgument(length <= 4);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) | str.charAt(i2);
        }
        return i;
    }

    public static long toLong(int i, int i2) {
        return toUnsignedLong(i2) | (toUnsignedLong(i) << 32);
    }

    public static byte[] getBytesFromHexString(java.lang.String str) {
        return com.google.common.io.BaseEncoding.base16().ignoreCase().decode(str);
    }

    public static java.lang.String toHexString(byte[] bArr) {
        return com.google.common.io.BaseEncoding.base16().lowerCase().encode(bArr);
    }

    public static java.lang.String toFourccString(int i) {
        return new java.lang.String(com.google.common.primitives.Ints.toByteArray(i), java.nio.charset.StandardCharsets.US_ASCII);
    }

    public static java.lang.String getUserAgent(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str2 = com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(str2);
        sb.append(" (Linux;Android ");
        sb.append(android.os.Build.VERSION.RELEASE);
        sb.append(") AndroidXMedia3/1.9.0");
        return sb.toString();
    }

    public static int getCodecCountOfType(java.lang.String str, int i) {
        int i2 = 0;
        for (java.lang.String str2 : splitCodecs(str)) {
            if (i == androidx.media3.common.MimeTypes.getTrackTypeOfCodec(str2)) {
                i2++;
            }
        }
        return i2;
    }

    public static java.lang.String getCodecsOfType(java.lang.String str, int i) {
        java.lang.String[] splitCodecs = splitCodecs(str);
        if (splitCodecs.length == 0) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : splitCodecs) {
            if (i == androidx.media3.common.MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static java.lang.String getCodecsWithoutType(java.lang.String str, int i) {
        java.lang.String[] splitCodecs = splitCodecs(str);
        if (splitCodecs.length == 0) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : splitCodecs) {
            if (i != androidx.media3.common.MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static java.lang.String[] splitCodecs(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new java.lang.String[0];
        }
        return split(str.trim(), "(\\s*,\\s*)");
    }

    public static androidx.media3.common.Format getPcmFormat(int i, int i2, int i3) {
        return new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_RAW).setChannelCount(i2).setSampleRate(i3).setPcmEncoding(i).build();
    }

    public static androidx.media3.common.Format getPcmFormat(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        return getPcmFormat(audioFormat.encoding, audioFormat.channelCount, audioFormat.sampleRate);
    }

    public static int getPcmEncoding(int i) {
        return getPcmEncoding(i, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public static int getPcmEncoding(int i, java.nio.ByteOrder byteOrder) {
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

    public static int getAudioTrackChannelConfig(int i) {
        if (i == 10) {
            return android.os.Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i == 16) {
            return android.os.Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i == 24) {
            return android.os.Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
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
                return com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
            case 6:
                return com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                switch (i) {
                    case 12:
                        return 743676;
                    case 13:
                        return android.os.Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                    case 14:
                        return android.os.Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                    default:
                        return 0;
                }
        }
    }

    public static android.media.AudioFormat getAudioFormat(int i, int i2, int i3) {
        return new android.media.AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static int getPcmFrameSize(int i, int i2) {
        return getByteDepth(i) * i2;
    }

    public static int getByteDepth(int i) {
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

    public static int generateAudioSessionIdV21(android.content.Context context) {
        int generateAudioSessionId = androidx.media3.common.audio.AudioManagerCompat.getAudioManager(context).generateAudioSessionId();
        if (generateAudioSessionId != -1) {
            return generateAudioSessionId;
        }
        return 0;
    }

    public static java.util.UUID getDrmUuid(java.lang.String str) {
        char c;
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        lowerCase.hashCode();
        int hashCode = lowerCase.hashCode();
        if (hashCode == -1860423953) {
            if (lowerCase.equals("playready")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1400551171) {
            if (hashCode == 790309106 && lowerCase.equals("clearkey")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (lowerCase.equals("widevine")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return androidx.media3.common.C.PLAYREADY_UUID;
        }
        if (c == 1) {
            return androidx.media3.common.C.WIDEVINE_UUID;
        }
        if (c == 2) {
            return androidx.media3.common.C.CLEARKEY_UUID;
        }
        try {
            return java.util.UUID.fromString(str);
        } catch (java.lang.RuntimeException unused) {
            return null;
        }
    }

    @java.lang.Deprecated
    public static int inferContentType(android.net.Uri uri, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return inferContentType(uri);
        }
        return inferContentTypeForExtension(str);
    }

    public static int inferContentType(android.net.Uri uri) {
        int inferContentTypeForExtension;
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && (com.google.common.base.Ascii.equalsIgnoreCase("rtsp", scheme) || com.google.common.base.Ascii.equalsIgnoreCase("rtspt", scheme))) {
            return 3;
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (inferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return inferContentTypeForExtension;
        }
        java.util.regex.Matcher matcher = getHighSpeedVideoFpsRangesFor.matcher((java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(uri.getPath()));
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

    @java.lang.Deprecated
    public static int inferContentType(java.lang.String str) {
        return inferContentType(android.net.Uri.parse("file:///".concat(java.lang.String.valueOf(str))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int inferContentTypeForExtension(java.lang.String str) {
        char c;
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case 104579:
                if (lowerCase.equals("ism")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 108321:
                if (lowerCase.equals("mpd")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3242057:
                if (lowerCase.equals("isml")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3299913:
                if (lowerCase.equals("m3u8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                return 0;
            }
            if (c != 2) {
                return c != 3 ? 4 : 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int inferContentTypeForUriAndMimeType(android.net.Uri uri, java.lang.String str) {
        char c;
        if (str == null) {
            return inferContentType(uri);
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals(androidx.media3.common.MimeTypes.APPLICATION_M3U8)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -156749520:
                if (str.equals(androidx.media3.common.MimeTypes.APPLICATION_SS)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 64194685:
                if (str.equals(androidx.media3.common.MimeTypes.APPLICATION_MPD)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1154777587:
                if (str.equals(androidx.media3.common.MimeTypes.APPLICATION_RTSP)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 2;
        }
        if (c == 1) {
            return 1;
        }
        if (c != 2) {
            return c != 3 ? 4 : 3;
        }
        return 0;
    }

    public static java.lang.String getAdaptiveMimeTypeForContentType(int i) {
        if (i == 0) {
            return androidx.media3.common.MimeTypes.APPLICATION_MPD;
        }
        if (i == 1) {
            return androidx.media3.common.MimeTypes.APPLICATION_SS;
        }
        if (i != 2) {
            return null;
        }
        return androidx.media3.common.MimeTypes.APPLICATION_M3U8;
    }

    public static android.net.Uri fixSmoothStreamingIsmManifestUri(android.net.Uri uri) {
        java.lang.String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        java.util.regex.Matcher matcher = getHighSpeedVideoFpsRangesFor.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? android.net.Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static java.lang.String getStringForTime(java.lang.StringBuilder sb, java.util.Formatter formatter, long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = 0;
        }
        java.lang.String str = j < 0 ? "-" : "";
        long abs = (java.lang.Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j2)).toString();
        }
        return formatter.format("%s%02d:%02d", str, java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j2)).toString();
    }

    public static java.lang.String getStringForTime(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        return getStringForTime(sb, new java.util.Formatter(sb, java.util.Locale.getDefault()), j);
    }

    public static java.lang.String escapeFileName(java.lang.String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (Camera2StreamConfigurationMap(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i2 * 2) + length);
        while (i2 > 0) {
            char charAt = str.charAt(i);
            if (Camera2StreamConfigurationMap(charAt)) {
                sb.append('%');
                sb.append(java.lang.Integer.toHexString(charAt));
                i2--;
            } else {
                sb.append(charAt);
            }
            i++;
        }
        if (i < length) {
            sb.append((java.lang.CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public static java.lang.String unescapeFileName(java.lang.String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 * 2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i4);
        java.util.regex.Matcher matcher = Camera2StreamConfigurationMap.matcher(str);
        while (i2 > 0 && matcher.find()) {
            char parseInt = (char) java.lang.Integer.parseInt((java.lang.String) com.google.common.base.Preconditions.checkNotNull(matcher.group(1)), 16);
            sb.append((java.lang.CharSequence) str, i, matcher.start());
            sb.append(parseInt);
            i = matcher.end();
            i2--;
        }
        if (i < length) {
            sb.append((java.lang.CharSequence) str, i, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    public static android.net.Uri getDataUriForString(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("data:");
        sb.append(str);
        sb.append(";base64,");
        sb.append(android.util.Base64.encodeToString(str2.getBytes(), 2));
        return android.net.Uri.parse(sb.toString());
    }

    public static void recursiveDelete(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    public static java.io.File createTempDirectory(android.content.Context context, java.lang.String str) throws java.io.IOException {
        java.io.File createTempFile = createTempFile(context, str);
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    public static java.io.File createTempFile(android.content.Context context, java.lang.String str) throws java.io.IOException {
        return java.io.File.createTempFile(str, null, (java.io.File) com.google.common.base.Preconditions.checkNotNull(context.getCacheDir()));
    }

    public static int crc32(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = (i3 << 8) ^ getHighResolutionOutputSizeshNQ4ISI[((i3 >>> 24) ^ (bArr[i] & 255)) & 255];
            i++;
        }
        return i3;
    }

    public static int crc16(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = com.google.common.primitives.UnsignedBytes.toInt(bArr[i]);
            int[] iArr = getHighSpeedVideoSizes;
            int i5 = (((i3 << 4) & 65535) ^ iArr[((i4 >> 4) ^ ((i3 >> 12) & 255)) & 255]) & 65535;
            i3 = (((i5 << 4) & 65535) ^ iArr[((i4 & 15) ^ ((i5 >> 12) & 255)) & 255]) & 65535;
            i++;
        }
        return i3;
    }

    public static int crc8(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = getHighSpeedVideoFpsRanges[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    public static byte[] gzip(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static int getBigEndianInt(java.nio.ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i2 : java.lang.Integer.reverseBytes(i2);
    }

    public static java.nio.ByteBuffer createReadOnlyByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    public static java.lang.String getCountryCode(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) != null) {
            java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!android.text.TextUtils.isEmpty(networkCountryIso)) {
                return com.google.common.base.Ascii.toUpperCase(networkCountryIso);
            }
        }
        return com.google.common.base.Ascii.toUpperCase(java.util.Locale.getDefault().getCountry());
    }

    public static java.util.Locale getDefaultDisplayLocale() {
        return java.util.Locale.getDefault(java.util.Locale.Category.DISPLAY);
    }

    public static boolean inflate(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.common.util.ParsableByteArray parsableByteArray2, java.util.zip.Inflater inflater) {
        if (parsableByteArray.bytesLeft() == 0) {
            return false;
        }
        if (parsableByteArray2.capacity() < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
        }
        inflater.setInput(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(parsableByteArray2.getData(), i, parsableByteArray2.capacity() - i);
                if (inflater.finished()) {
                    parsableByteArray2.setLimit(i);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                if (i == parsableByteArray2.capacity()) {
                    parsableByteArray2.ensureCapacity(parsableByteArray2.capacity() * 2);
                }
            } catch (java.util.zip.DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean maybeInflate(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.common.util.ParsableByteArray parsableByteArray2, java.util.zip.Inflater inflater) {
        return parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 120 && inflate(parsableByteArray, parsableByteArray2, inflater);
    }

    public static boolean isTv(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean isAutomotive(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean isWear(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static android.graphics.Point getCurrentDisplayModeSize(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((android.view.WindowManager) com.google.common.base.Preconditions.checkNotNull((android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    public static android.graphics.Point getCurrentDisplayModeSize(android.content.Context context, android.view.Display display) {
        java.lang.String highSpeedVideoSizes;
        if (display.getDisplayId() == 0 && isTv(context)) {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                highSpeedVideoSizes = getHighSpeedVideoSizes("sys.display-size");
            } else {
                highSpeedVideoSizes = getHighSpeedVideoSizes("vendor.display-size");
            }
            if (!android.text.TextUtils.isEmpty(highSpeedVideoSizes)) {
                try {
                    java.lang.String[] split = split(highSpeedVideoSizes.trim(), "x");
                    if (split.length == 2) {
                        int parseInt = java.lang.Integer.parseInt(split[0]);
                        int parseInt2 = java.lang.Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new android.graphics.Point(parseInt, parseInt2);
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                androidx.media3.common.util.Log.e("Util", "Invalid display size: ".concat(java.lang.String.valueOf(highSpeedVideoSizes)));
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

    public static java.lang.String getTrackTypeString(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT;
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
            case 6:
                return "camera motion";
            default:
                if (i >= 10000) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("custom (");
                    sb.append(i);
                    sb.append(")");
                    return sb.toString();
                }
                return com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean isBitmapFactorySupportedMimeType(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1487656890:
                if (str.equals(androidx.media3.common.MimeTypes.IMAGE_AVIF)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1487464693:
                if (str.equals("image/heic")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1487464690:
                if (str.equals("image/heif")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1487018032:
                if (str.equals("image/webp")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -879272239:
                if (str.equals("image/bmp")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -879258763:
                if (str.equals(androidx.media3.common.MimeTypes.IMAGE_PNG)) {
                    c = 6;
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
                return android.os.Build.VERSION.SDK_INT >= 34;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public static java.util.List<java.lang.String> getSelectionFlagStrings(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i & 4) != 0) {
            arrayList.add(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        }
        if ((i & 1) != 0) {
            arrayList.add(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
        }
        if ((i & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static java.util.List<java.lang.String> getRoleFlagStrings(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("main");
        }
        if ((i & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static java.lang.String getAuxiliaryTrackTypeString(int i) {
        if (i == 0) {
            return "undefined";
        }
        if (i == 1) {
            return com.visa.cbp.DeviceInfo.valueOf;
        }
        if (i == 2) {
            return "depth-linear";
        }
        if (i == 3) {
            return "depth-inverse";
        }
        if (i == 4) {
            return "depth metadata";
        }
        throw new java.lang.IllegalStateException("Unsupported auxiliary track type");
    }

    public static long getNowUnixTimeMs(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return java.lang.System.currentTimeMillis();
        }
        return android.os.SystemClock.elapsedRealtime() + j;
    }

    public static int getInt24(java.nio.ByteBuffer byteBuffer, int i) {
        byte b = byteBuffer.get(byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i : i + 2);
        byte b2 = byteBuffer.get(i + 1);
        if (byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN) {
            i += 2;
        }
        return (((byteBuffer.get(i) << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (((b << com.google.common.base.Ascii.CAN) & (-16777216)) | ((b2 << 16) & 16711680))) >> 8;
    }

    public static void putInt24(java.nio.ByteBuffer byteBuffer, int i) {
        com.google.common.base.Preconditions.checkArgument(((-16777216) & i) == 0 || (i & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", java.lang.Integer.toHexString(i));
        com.google.common.base.Preconditions.checkArgument(byteBuffer.remaining() >= 3);
        byteBuffer.put((byte) (byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? (i & 16711680) >> 16 : i & 255)).put((byte) ((65280 & i) >> 8)).put((byte) (byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i & 255 : (i & 16711680) >> 16));
    }

    public static <T> void moveItems(java.util.List<T> list, int i, int i2, int i3) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(java.lang.Math.min(i3, list.size()), arrayDeque);
    }

    public static boolean tableExists(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        return android.database.DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new java.lang.String[]{str}) > 0;
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(java.lang.String str) {
        java.lang.String[] split;
        int length;
        int i = 0;
        if (str == null || (length = (split = split(str, "_")).length) < 2) {
            return 0;
        }
        java.lang.String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        try {
            i = java.lang.Integer.parseInt((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str2));
            if (z) {
                return -i;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return i;
    }

    public static boolean isFrameDropAllowedOnSurfaceInput(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT == 30 && (com.google.common.base.Ascii.equalsIgnoreCase(android.os.Build.MODEL, "moto g(20)") || com.google.common.base.Ascii.equalsIgnoreCase(android.os.Build.MODEL, "rmx3231"))) {
            return true;
        }
        return android.os.Build.VERSION.SDK_INT == 34 && com.google.common.base.Ascii.equalsIgnoreCase(android.os.Build.MODEL, "sm-x200");
    }

    public static int getMaxPendingFramesCountForMediaCodecDecoders(android.content.Context context) {
        return isFrameDropAllowedOnSurfaceInput(context) ? 1 : 5;
    }

    public static java.lang.String getFormatSupportString(int i) {
        if (i == 0) {
            return org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO;
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_YES;
        }
        throw new java.lang.IllegalStateException();
    }

    public static androidx.media3.common.Player.Commands getAvailableCommands(androidx.media3.common.Player player, androidx.media3.common.Player.Commands commands) {
        boolean isPlayingAd = player.isPlayingAd();
        boolean isCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean hasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean hasNextMediaItem = player.hasNextMediaItem();
        boolean isCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean isCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean isEmpty = player.getCurrentTimeline().isEmpty();
        boolean z = !isPlayingAd;
        boolean z2 = false;
        androidx.media3.common.Player.Commands.Builder addIf = new androidx.media3.common.Player.Commands.Builder().addAll(commands).addIf(4, z).addIf(5, isCurrentMediaItemSeekable && !isPlayingAd).addIf(6, hasPreviousMediaItem && !isPlayingAd).addIf(7, !isEmpty && (hasPreviousMediaItem || !isCurrentMediaItemLive || isCurrentMediaItemSeekable) && !isPlayingAd).addIf(8, hasNextMediaItem && !isPlayingAd).addIf(9, !isEmpty && (hasNextMediaItem || (isCurrentMediaItemLive && isCurrentMediaItemDynamic)) && !isPlayingAd).addIf(10, z).addIf(11, isCurrentMediaItemSeekable && !isPlayingAd);
        if (isCurrentMediaItemSeekable && !isPlayingAd) {
            z2 = true;
        }
        return addIf.addIf(12, z2).build();
    }

    public static long sum(long... jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        return j;
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, android.content.res.Resources resources, int i) {
        return resources.getDrawable(i, context.getTheme());
    }

    public static java.lang.String intToStringMaxRadix(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean shouldEnablePlayPauseButton(androidx.media3.common.Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        return (player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) ? false : true;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(androidx.media3.common.Player player) {
        return shouldShowPlayButton(player, true);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(androidx.media3.common.Player player, boolean z) {
        return player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4 || !(!z || player.getPlaybackSuppressionReason() == 0 || player.getPlaybackSuppressionReason() == 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean handlePlayButtonAction(androidx.media3.common.Player player) {
        boolean z = false;
        if (player == null) {
            return false;
        }
        int playbackState = player.getPlaybackState();
        if (playbackState == 1 && player.isCommandAvailable(2)) {
            player.prepare();
        } else {
            if (playbackState == 4 && player.isCommandAvailable(4)) {
                player.seekToDefaultPosition();
            }
            if (player.isCommandAvailable(1)) {
                return z;
            }
            player.play();
            return true;
        }
        z = true;
        if (player.isCommandAvailable(1)) {
        }
    }

    public static boolean handlePauseButtonAction(androidx.media3.common.Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        player.pause();
        return true;
    }

    public static boolean handlePlayPauseButtonAction(androidx.media3.common.Player player) {
        return handlePlayPauseButtonAction(player, true);
    }

    public static boolean handlePlayPauseButtonAction(androidx.media3.common.Player player, boolean z) {
        if (shouldShowPlayButton(player, z)) {
            return handlePlayButtonAction(player);
        }
        return handlePauseButtonAction(player);
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e) {
            androidx.media3.common.util.Log.e("Util", "Failed to read system property ".concat(java.lang.String.valueOf(str)), e);
            return null;
        }
    }

    private static java.util.HashMap<java.lang.String, java.lang.String> getHighSpeedVideoSizes() {
        java.lang.String[] iSOLanguages = java.util.Locale.getISOLanguages();
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>(iSOLanguages.length + getOutputMinFrameDuration.length);
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
            java.lang.String[] strArr = getOutputMinFrameDuration;
            if (i >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity.requestPermissions(new java.lang.String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    private static boolean getHighSpeedVideoSizes(android.net.Uri uri) {
        return "http".equals(uri.getScheme()) && !android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((java.lang.String) com.google.common.base.Preconditions.checkNotNull(uri.getHost()));
    }

    static class Api29 {
        public static void getHighResolutionOutputSizeshNQ4ISI(android.app.Service service, int i, android.app.Notification notification, int i2, java.lang.String str) {
            try {
                service.startForeground(i, notification, i2);
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.e("Util", "The service must be declared with a foregroundServiceType that includes ".concat(java.lang.String.valueOf(str)));
                throw e;
            }
        }

        private Api29() {
        }
    }

    public static java.lang.String[] getSystemLanguageCodes() {
        java.lang.String[] split = split(android.content.res.Resources.getSystem().getConfiguration().getLocales().toLanguageTags(), ",");
        for (int i = 0; i < split.length; i++) {
            split[i] = normalizeLanguageCode(split[i]);
        }
        return split;
    }

    public static void sneakyThrow(java.lang.Throwable th) {
        throw th;
    }
}
