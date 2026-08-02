package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class i extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static long getHighSpeedVideoSizes = -8312505405318818261L;
    private util.h.xy.dh.rh getHighSpeedVideoSizesFor;
    private util.h.xy.dh.me getInputFormats;
    private util.h.xy.dj.f getOutputMinFrameDuration;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(3);
        dVar.m26290(this.getHighSpeedVideoSizesFor);
        util.h.xy.dh.me meVar = this.getInputFormats;
        if (meVar != null) {
            dVar.m26290(meVar);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 59) % 128;
        }
        util.h.xy.dj.f fVar = this.getOutputMinFrameDuration;
        if (fVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 59) % 128;
            dVar.m26290(fVar);
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
        }
        return new util.h.xy.dh.aa(dVar);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dh.rh m26381() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 89) % 128;
        util.h.xy.dh.rh rhVar = this.getHighSpeedVideoSizesFor;
        int i2 = i + 19;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return rhVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dj.i m26379(java.lang.Object obj) {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        if (!(obj instanceof util.h.xy.dj.i)) {
            if (obj != null) {
                return new util.h.xy.dj.i(util.h.xy.dh.l.m26303(obj));
            }
            return null;
        }
        int i2 = i + 43;
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        util.h.xy.dj.i iVar = (util.h.xy.dj.i) obj;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = i3 + 5;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            return iVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dj.i m26380(util.h.xy.dh.mm mmVar, boolean z) {
        int i = getHighSpeedVideoFpsRangesFor + 63;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.dh.l m26304 = util.h.xy.dh.l.m26304(mmVar, z);
        if (i % 2 != 0) {
            m26379(m26304);
            throw null;
        }
        util.h.xy.dj.i m26379 = m26379(m26304);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 19) % 128;
        return m26379;
    }

    private i(util.h.xy.dh.l lVar) {
        this.getHighSpeedVideoSizesFor = util.h.xy.dh.rh.m26335(lVar.mo26287(0));
        int mo26286 = lVar.mo26286();
        if (mo26286 != 1) {
            if (mo26286 == 2) {
                if (lVar.mo26287(1) instanceof util.h.xy.dh.me) {
                    this.getInputFormats = util.h.xy.dh.me.m26311(lVar.mo26287(1));
                    return;
                } else {
                    this.getOutputMinFrameDuration = util.h.xy.dj.f.m26372(lVar.mo26287(2));
                    return;
                }
            }
            if (mo26286 == 3) {
                this.getInputFormats = util.h.xy.dh.me.m26311(lVar.mo26287(1));
                this.getOutputMinFrameDuration = util.h.xy.dj.f.m26372(lVar.mo26287(2));
                return;
            }
            int i = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
            java.lang.Object[] objArr = new java.lang.Object[1];
            int i2 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = (i2 + 77) % 128;
            int i3 = i2 + 17;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            char[] charArray = "鄵饴酼眙꽬鵭⥕㼒\ue76a猜圅픰\ue17f윊㽡浍륡輺睓ꕆ煱圌콏﵅ीἯܻ㔮섉Ꝗ弴䴽餄潑".toCharArray();
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 77) % 128;
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizes ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 51) % 128;
            while (aVar.f2623 < m27721.length) {
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizes ^ 7817488252581312552L)));
                aVar.f2623++;
            }
            objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
    }
}
