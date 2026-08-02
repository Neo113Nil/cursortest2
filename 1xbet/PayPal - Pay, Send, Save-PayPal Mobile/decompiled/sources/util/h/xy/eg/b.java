package util.h.xy.eg;

/* loaded from: classes18.dex */
final class b {
    protected static final java.util.Map Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    protected static final java.util.Map getHighSpeedVideoSizes;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static char[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputFormats;
    private static final java.util.Set getOutputMinFrameDuration;
    private static boolean getOutputSizes;
    private static final java.util.Map getOutputStallDurationlomOqCM;

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 75;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getOutputFormats);
        if (!getHighSpeedVideoSizesFor) {
            if (!getOutputSizes) {
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 55) % 128;
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap2;
        java.util.HashSet hashSet = new java.util.HashSet();
        getOutputMinFrameDuration = hashSet;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put(util.h.xy.du.ra.f1593, new java.lang.Object() { // from class: util.h.xy.eg.b.5
        });
        hashMap3.put(util.h.xy.du.ra.f1618, new java.lang.Object() { // from class: util.h.xy.eg.b.3
        });
        hashMap3.put(util.h.xy.du.ra.f1607, new java.lang.Object() { // from class: util.h.xy.eg.b.1
        });
        hashMap3.put(util.h.xy.du.ra.f1638, new java.lang.Object() { // from class: util.h.xy.eg.b.4
        });
        hashMap3.put(util.h.xy.du.ra.f1648, new java.lang.Object() { // from class: util.h.xy.eg.b.2
        });
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap3);
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 117) % 128;
        getOutputStallDurationlomOqCM = unmodifiableMap;
        util.h.xy.dh.i iVar = util.h.xy.ea.mb.f1925;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0082\u0081\u0082\u0083\u0082\u0081", objArr);
        hashMap.put(iVar, ((java.lang.String) objArr[0]).intern());
        util.h.xy.dh.i iVar2 = util.h.xy.ea.mb.f1913;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0083\u0082\u0084", objArr2);
        hashMap.put(iVar2, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.dh.i iVar3 = util.h.xy.ea.mb.f1911;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(175 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0083\u0082\u0084", objArr3);
        hashMap.put(iVar3, ((java.lang.String) objArr3[0]).intern());
        util.h.xy.dh.i iVar4 = util.h.xy.ea.mb.f1912;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0083\u0082\u0084", objArr4);
        hashMap.put(iVar4, ((java.lang.String) objArr4[0]).intern());
        util.h.xy.dh.i iVar5 = util.h.xy.ea.mb.f1925;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0087\u0086\u0085\u0082\u0081\u0082\u0083\u0082\u0081", objArr5);
        hashMap2.put(iVar5, ((java.lang.String) objArr5[0]).intern());
        util.h.xy.dh.i iVar6 = util.h.xy.ea.mb.f1913;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0087\u0086\u0085\u0083\u0082\u0084", objArr6);
        hashMap2.put(iVar6, ((java.lang.String) objArr6[0]).intern());
        util.h.xy.dh.i iVar7 = util.h.xy.ea.mb.f1911;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, "\u0087\u0086\u0085\u0083\u0082\u0084", objArr7);
        hashMap2.put(iVar7, ((java.lang.String) objArr7[0]).intern());
        util.h.xy.dh.i iVar8 = util.h.xy.ea.mb.f1912;
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - android.view.KeyEvent.getDeadChar(0, 0), "\u0087\u0086\u0085\u0083\u0082\u0084", objArr8);
        hashMap2.put(iVar8, ((java.lang.String) objArr8[0]).intern());
        util.h.xy.dh.i iVar9 = util.h.xy.ea.mb.f1924;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u0087\u0086\u0085\u008a\u0089\u0088", objArr9);
        hashMap2.put(iVar9, ((java.lang.String) objArr9[0]).intern());
        hashSet.add(util.h.xy.dq.mb.f1507);
        hashSet.add(util.h.xy.dq.mb.f1457);
        hashSet.add(util.h.xy.dq.mb.f1490);
        hashSet.add(util.h.xy.dq.mb.f1503);
        hashSet.add(util.h.xy.dq.mb.f1476);
        hashSet.add(util.h.xy.dq.mb.f1511);
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 45) % 128;
    }

    static boolean getHighSpeedVideoSizes(util.h.xy.dh.i iVar) {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 61) % 128;
        boolean contains = getOutputMinFrameDuration.contains(iVar);
        int i = getInputSizeshNQ4ISI + 55;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return contains;
        }
        throw null;
    }

    static util.h.xy.ef.a getHighSpeedVideoFpsRanges(util.h.xy.dh.i iVar, java.security.SecureRandom secureRandom) throws util.h.xy.ea.d {
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 21) % 128;
        try {
            util.h.xy.ef.a m26687 = util.h.xy.eq.b.m26687(iVar, secureRandom);
            int i = getHighSpeedVideoFpsRanges + 105;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return m26687;
            }
            throw null;
        } catch (java.lang.IllegalArgumentException e) {
            throw new util.h.xy.ea.d(e.getMessage(), e);
        }
    }

    static util.h.xy.ed.a getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.i iVar, util.h.xy.ep.mc mcVar, java.security.SecureRandom secureRandom) throws util.h.xy.ea.d {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 57) % 128;
        try {
            util.h.xy.ed.a m26688 = util.h.xy.eq.ma.m26688(iVar, mcVar.m26663().length * 8, secureRandom);
            int i = getHighSpeedVideoFpsRanges + 109;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return m26688;
            }
            throw null;
        } catch (java.lang.IllegalArgumentException e) {
            throw new util.h.xy.ea.d(e.getMessage(), e);
        }
    }

    static java.lang.Object getHighSpeedVideoFpsRangesFor(util.h.xy.ef.mb mbVar, util.h.xy.ed.a aVar) throws util.h.xy.ea.d {
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 25) % 128;
        try {
            java.lang.Object m26685 = util.h.xy.eq.a.m26685(true, mbVar, aVar);
            int i = getHighSpeedVideoFpsRanges + 117;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return m26685;
            }
            throw null;
        } catch (java.lang.IllegalArgumentException e) {
            throw new util.h.xy.ea.d(e.getMessage(), e);
        }
    }

    b() {
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputFormats = new char[]{64267, 64266, 64248, 64270, 64242, 64238, 64232, 64249, 64264, 64281};
        getOutputFormats = -1074857137;
        getOutputSizes = true;
        getHighSpeedVideoSizesFor = true;
    }
}
