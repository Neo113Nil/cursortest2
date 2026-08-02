package util.h.xy.bv;

/* loaded from: classes5.dex */
public class mc extends util.h.xy.bv.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static long getHighSpeedVideoSizes = 8969957940274282164L;
    private static char[] getOutputFormats = {42351, 42293, 42288, 42300, 42243, 42288, 42281, 42287, 42290, 42340, 42242, 42251, 42298, 42295, 42291, 42294, 42297, 42299, 42288, 42281, 42289, 42252, 42432, 42493, 42488, 42448, 42449, 42488, 42494, 42492, 42485, 42489, 42432, 42432, 42432, 42492, 42336, 42290, 42292, 42290, 42294, 42290, 42299, 42299, 42281, 42286, 42289, 42298, 42292, 42246, 42246, 42287, 42276, 42242, 42241, 42294, 42247, 42246, 42287, 42472, 42477, 42454, 42479, 42479, 42462, 42489, 42468, 42470, 42490, 42448, 42490, 42488, 42477, 42494, 42475, 42244, 42486, 42457, 42445, 42478, 42433, 42433, 42485, 42481, 42486, 42483, 42474, 42473, 42434, 42493, 42473, 42433, 42440, 42477, 42450, 42451, 42477, 42487, 42458, 42454, 42472, 42451, 42454, 42479, 42472, 42479, 42452, 42459, 42477, 42475, 42480, 42481, 42449, 42454, 42472, 42451, 42459, 42485, 42481, 42483, 42484, 42442, 42433, 42472, 42477, 42486, 42455, 42459, 42287, 42296, 42299, 42297, 42241};
    private final byte[] getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;
    private final java.lang.String getOutputMinFrameDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mc(java.lang.String str, java.lang.String str2, byte[] bArr, byte[] bArr2) {
        super(((java.lang.String) r1[0]).intern());
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("仆ヹ仩\uf613꯫⛡ᆨ䉓品톔脥羀穃쯱\ue48a餳ǰ╼輻닥❵Í큜걒쪄穚㟥지퀋喠ൗ\ue3a8", android.text.TextUtils.indexOf("", ""), objArr);
        this.getInputFormats = str;
        this.getOutputMinFrameDuration = str2;
        this.getHighSpeedVideoSizesFor = (byte[]) bArr.clone();
        this.getInputSizeshNQ4ISI = (byte[]) bArr2.clone();
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˎ */
    protected java.util.Map<java.lang.String, java.lang.String> mo25690() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.Map<java.lang.String, java.lang.String> mo25690 = super.mo25690();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(true, new int[]{0, 9, 0, 8}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000", objArr);
        mo25690.put(((java.lang.String) objArr[0]).intern(), this.getInputFormats);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{9, 12, 0, 9}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000", objArr2);
        mo25690.put(((java.lang.String) objArr2[0]).intern(), this.getOutputMinFrameDuration);
        java.lang.String str = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(this.getHighSpeedVideoSizesFor));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("掐\uf3d7揧㔩\ue752樹㨕榵禁ኯ췸吲圻࣎ꡘ닥ⲩ\ue64d뛔饃ਣ쏢鲧蟨\ue7c5륩", android.text.TextUtils.indexOf("", ""), objArr3);
        mo25690.put(((java.lang.String) objArr3[0]).intern(), str);
        java.lang.String str2 = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(this.getInputSizeshNQ4ISI));
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{21, 15, 54, 0}, "\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", objArr4);
        mo25690.put(((java.lang.String) objArr4[0]).intern(), str2);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
        return mo25690;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = i2 + 15;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoFpsRanges = (i2 + 49) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizes ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizes ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 51) % 128;
        objArr[0] = str2;
    }

    @Override // util.h.xy.bv.mb
    @util.h.xy.a.a
    /* renamed from: ˏ */
    protected com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> mo25691(util.h.xy.bv.rb rbVar) {
        util.h.xy.bv.d dVar = new util.h.xy.bv.d(rbVar.m25751());
        dVar.m25744(rbVar.m25745());
        dVar.m25748(rbVar.m25742());
        dVar.m25743(rbVar.m25749());
        if (rbVar.m25745() == util.h.xy.bv.rb.ra.f1062) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 57) % 128;
            try {
                java.util.Map<java.lang.String, java.lang.String> m25747 = rbVar.m25747();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(false, new int[]{36, 23, 3, 0}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", objArr);
                byte[] mo25943 = util.h.xy.ck.ra.f1116.m25945().mo25943(util.h.xy.bx.ra.f1063.m25786(m25747.get(((java.lang.String) objArr[0]).intern())));
                java.util.Map<java.lang.String, java.lang.String> m257472 = rbVar.m25747();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("螴㨍蟃ﳰ８牌羕Ⱝ鶡\udb75햷ᆥ댻섃뀵\uf746좁⾪꺡\udcc8\uee07", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr2);
                byte[] m25787 = util.h.xy.bx.ra.f1063.m25787(mo25943, util.h.xy.bx.ra.f1063.m25786(m257472.get(((java.lang.String) objArr2[0]).intern())));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(true, new int[]{59, 16, 66, 8}, null, objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("瀏絀灢뮽ؙ譖鋻셄", android.view.MotionEvent.axisFromString("") + 1, objArr4);
                byte[][] m25035 = util.h.xy.ao.mb.m25035(m25787, java.util.Arrays.asList(((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()));
                if (m25035.length == 2 && m25035[0] != null) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
                    if (m25035[1] != null) {
                        byte[] m25789 = util.h.xy.bx.ra.f1063.m25789(m25035[0]);
                        byte[] m257892 = util.h.xy.bx.ra.f1063.m25789(m25035[1]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(true, new int[]{128, 5, 27, 1}, null, objArr5);
                        util.h.xy.am.ma.m25030(((java.lang.String) objArr5[0]).intern(), m25789);
                        dVar.m25688(m25789);
                        dVar.m25687(m257892);
                        util.h.xy.ar.b.m25100(m25035[0], m25035[1], m25787, m25789, m257892);
                        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
                    }
                }
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes(true, new int[]{75, 53, 68, 47}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000", objArr6);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr6[0]).intern());
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | java.io.IOException | util.h.xy.ck.rc e) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("燃䴝熅评僸\udd8b\uf7c0ꑐ毵", android.text.TextUtils.indexOf("", "", 0), objArr7);
                util.h.xy.am.ma.m25029(((java.lang.String) objArr7[0]).intern(), util.h.xy.al.rc.m25022(e));
                e.getMessage();
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䤶䤐䥳迾⡥ꔯ蕬훗匴\ua83cˮ\ueb46緶눈杒රؔ岅秗☼\u209f礢厰㣘쵱ε됳崀ힶⱭ躤睕\uf006㛏\ue302觻髅퍥엸ꉖꓦﷷ\ude62쓑", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8);
                return new util.h.xy.an.ra(dVar, false, ((java.lang.String) objArr8[0]).intern());
            }
        }
        return new util.h.xy.an.ra(dVar, true, null);
    }

    private static void getHighSpeedVideoSizes(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 15) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr2 != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                int i6 = Camera2StreamConfigurationMap + 45;
                getHighSpeedVideoFpsRanges = i6 % 128;
                if (i6 % 2 == 0 ? bArr2[maVar.f2631] != 1 : bArr2[maVar.f2631] != 0) {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                } else {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 1) % 128;
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i7 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i7);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 5) % 128;
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        java.lang.String str3 = new java.lang.String(cArr3);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 21) % 128;
        objArr[0] = str3;
    }
}
