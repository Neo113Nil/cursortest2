package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static final java.util.Set getHighSpeedVideoSizesFor;
    private java.util.Hashtable getInputFormats = new java.util.Hashtable();
    private java.util.Vector getOutputMinFrameDuration = new java.util.Vector();

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoFpsRanges ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i2 = getHighSpeedVideoSizes + 31;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            int i3 = i2 % 2;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(util.h.xy.ed.ma.f2093);
        hashSet.add(util.h.xy.ed.ma.f2086);
        hashSet.add(util.h.xy.ed.ma.f2094);
        hashSet.add(util.h.xy.ed.ma.f2091);
        getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableSet(hashSet);
        int i = Camera2StreamConfigurationMap + 111;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.ed.ra m26496() {
        util.h.xy.ed.ma[] maVarArr;
        int i;
        int i2 = Camera2StreamConfigurationMap + 45;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            maVarArr = new util.h.xy.ed.ma[this.getOutputMinFrameDuration.size()];
            i = 1;
        } else {
            maVarArr = new util.h.xy.ed.ma[this.getOutputMinFrameDuration.size()];
            i = 0;
        }
        while (i != this.getOutputMinFrameDuration.size()) {
            int i3 = getHighSpeedVideoFpsRangesFor + 45;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                maVarArr[i] = (util.h.xy.ed.ma) this.getInputFormats.get(this.getOutputMinFrameDuration.elementAt(i));
                i += 80;
            } else {
                maVarArr[i] = (util.h.xy.ed.ma) this.getInputFormats.get(this.getOutputMinFrameDuration.elementAt(i));
                i++;
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        }
        return new util.h.xy.ed.ra(maVarArr);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final boolean m26498() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 7) % 128;
        boolean isEmpty = this.getOutputMinFrameDuration.isEmpty();
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 117) % 128;
        return isEmpty;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26497(util.h.xy.dh.i iVar, boolean z, byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 65;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            this.getInputFormats.containsKey(iVar);
            throw null;
        }
        if (!this.getInputFormats.containsKey(iVar)) {
            this.getOutputMinFrameDuration.addElement(iVar);
            this.getInputFormats.put(iVar, new util.h.xy.ed.ma(iVar, z, new util.h.xy.dh.mz(util.h.xy.fb.a.m26821(bArr))));
            return;
        }
        if (!getHighSpeedVideoSizesFor.contains(iVar)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("麄캂㺣滕\udee3ต縪긳ṗ串", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20507, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(iVar);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("黁蠯돓\uda9e쐸\uefeb\u169fQ⮹劧籓最躰롦", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5808, objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        util.h.xy.dh.l m26303 = util.h.xy.dh.l.m26303(util.h.xy.dh.mz.m26335(((util.h.xy.ed.ma) this.getInputFormats.get(iVar)).m26509()).m26337());
        util.h.xy.dh.l m263032 = util.h.xy.dh.l.m26303(bArr);
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(m26303.mo26286() + m263032.mo26286());
        java.util.Enumeration mo26285 = m26303.mo26285();
        while (mo26285.hasMoreElements()) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 87) % 128;
            dVar.m26290((util.h.xy.dh.c) mo26285.nextElement());
        }
        java.util.Enumeration mo262852 = m263032.mo26285();
        while (mo262852.hasMoreElements()) {
            int i2 = getHighSpeedVideoFpsRangesFor + 21;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                dVar.m26290((util.h.xy.dh.c) mo262852.nextElement());
                throw null;
            }
            dVar.m26290((util.h.xy.dh.c) mo262852.nextElement());
        }
        try {
            this.getInputFormats.put(iVar, new util.h.xy.ed.ma(iVar, z, new util.h.xy.dh.aa(dVar).mo25969()));
        } catch (java.io.IOException e) {
            throw new util.h.xy.dh.ri(e.getMessage(), e);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26495(util.h.xy.dh.i iVar, boolean z, util.h.xy.dh.c cVar) throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 7) % 128;
        util.h.xy.dh.mi mo26279 = cVar.mo26279();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("麥追밁", 4440 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
        m26497(iVar, z, mo26279.m26322(((java.lang.String) objArr[0]).intern()));
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 91) % 128;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges = -2712763061618233990L;
    }
}
