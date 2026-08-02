package util.h.xy.ev;

/* loaded from: classes18.dex */
final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static long getHighSpeedVideoSizes = 0;
    private static int getInputSizeshNQ4ISI = 1;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizes ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizes ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor + 57;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 51) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizes = -3223911149440431512L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a9, code lost:
    
        r0 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("家寃\ue900ᒅ躣\udb74哻揲쓭\uee76稥艀方佐\u1ae9⅑虘가말䇘✍\u0df8墖\ue0ec䟆檨ｫߵ", android.widget.ExpandableListView.getPackedPositionType(0) + 1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c4, code lost:
    
        throw new java.lang.IllegalArgumentException(((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r10 = r10.m26730();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r1 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ጊ⒡\ue6c2峸፠嚀ȴਖ਼\uda24ᾒ䬧䍛腿ₓ逫둌䡳\ue9cf\ud909\ued5d㝳", android.graphics.Color.rgb(0, 0, 0) + 16777216, r1);
        r0 = java.lang.Class.forName((java.lang.String) r1[0]);
        r4 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䄹䈯鑼蘜䅞《炈킙街礌㦓馸퍜䘋", android.graphics.Color.rgb(0, 0, 0) + 16777216, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        return (byte[]) r0.getMethod((java.lang.String) r4[0], null).invoke(r10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        r0 = r10.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (java.lang.Class.forName((java.lang.String) r9[0]).isInstance(r0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (java.lang.Class.forName((java.lang.String) r9[0]).isInstance(r0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0093, code lost:
    
        if ((r10.m26730() instanceof byte[]) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0095, code lost:
    
        r0 = util.h.xy.ev.a.getInputSizeshNQ4ISI + 87;
        util.h.xy.ev.a.Camera2StreamConfigurationMap = r0 % 128;
        r10 = (byte[]) r10.m26730();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a5, code lost:
    
        if ((r0 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a7, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ew.rc rcVar) {
        int i = Camera2StreamConfigurationMap + 115;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            java.lang.Object m26730 = rcVar.m26730();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ጊ⒡\ue6c2峸፠嚀ȴਖ਼\uda24ᾒ䬧䍛腿ₓ逫둌䡳\ue9cf\ud909\ued5d㝳", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1, objArr);
        } else {
            java.lang.Object m267302 = rcVar.m26730();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ጊ⒡\ue6c2峸፠嚀ȴਖ਼\uda24ᾒ䬧䍛腿ₓ逫둌䡳\ue9cf\ud909\ued5d㝳", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        }
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighResolutionOutputSizeshNQ4ISI = -7885213718033031195L;
    }

    a() {
    }
}
