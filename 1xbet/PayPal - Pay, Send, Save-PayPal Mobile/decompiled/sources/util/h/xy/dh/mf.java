package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class mf extends java.io.FilterInputStream {
    private static int Camera2StreamConfigurationMap = 1;
    private static long getHighResolutionOutputSizeshNQ4ISI = -1133823995234196488L;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoFpsRangesFor = 368801645842702789L;
    private static int getHighSpeedVideoSizes;
    private static int getOutputFormats;
    private final int getHighSpeedVideoSizesFor;
    private final boolean getInputFormats;
    private final byte[][] getOutputMinFrameDuration;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = Camera2StreamConfigurationMap;
        int i4 = i3 + 93;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoSizes = (i3 + 53) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i5 = Camera2StreamConfigurationMap + 25;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 != 0) {
                jArr[dVar.f2629] = (charArray[dVar.f2629] + (dVar.f2629 * dVar.f2628)) | (getHighResolutionOutputSizeshNQ4ISI + 7508379876853140581L);
                i2 = dVar.f2629;
            } else {
                jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ ((-7508379876853140581L) ^ getHighResolutionOutputSizeshNQ4ISI);
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 109) % 128;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 5) % 128;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 55) % 128;
        objArr[0] = str2;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 7;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 59) % 128;
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 65) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    static util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(int i, util.h.xy.dh.ba baVar, byte[][] bArr) throws java.io.IOException {
        int i2 = 0;
        switch (i) {
            case 1:
                return util.h.xy.dh.rb.getHighSpeedVideoSizes(Camera2StreamConfigurationMap(baVar, bArr));
            case 2:
                return util.h.xy.dh.f.Camera2StreamConfigurationMap(baVar.getHighSpeedVideoSizes());
            case 3:
                return util.h.xy.dh.ma.getHighResolutionOutputSizeshNQ4ISI(baVar.getHighSpeedVideoSizes());
            case 4:
                return util.h.xy.dh.rh.getHighResolutionOutputSizeshNQ4ISI(baVar.getHighSpeedVideoSizes());
            case 5:
                return util.h.xy.dh.g.getHighResolutionOutputSizeshNQ4ISI(baVar.getHighSpeedVideoSizes());
            case 6:
                return util.h.xy.dh.i.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(baVar, bArr), true);
            case 7:
                return util.h.xy.dh.rg.getHighResolutionOutputSizeshNQ4ISI(baVar.getHighSpeedVideoSizes());
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("倖䑔確洆Ũ㖩⨛\ude2c\uf2df\ue723魾辐", 5209 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(i);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("偃倄倉倆倄倜倁候倖倃倒們", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2, objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    throw new java.io.IOException(sb.toString());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            case 10:
                return util.h.xy.dh.rc.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap(baVar, bArr), true);
            case 12:
                return util.h.xy.dh.o.getHighResolutionOutputSizeshNQ4ISI(baVar.getHighSpeedVideoSizes());
            case 13:
                return util.h.xy.dh.k.getHighSpeedVideoSizes(baVar.getHighSpeedVideoSizes());
            case 18:
                return util.h.xy.dh.h.getHighResolutionOutputSizeshNQ4ISI(baVar.getHighSpeedVideoSizes());
            case 19:
                return util.h.xy.dh.j.getHighSpeedVideoSizes(baVar.getHighSpeedVideoSizes());
            case 20:
                return util.h.xy.dh.rl.getHighSpeedVideoSizes(baVar.getHighSpeedVideoSizes());
            case 21:
                return util.h.xy.dh.mp.getHighSpeedVideoFpsRangesFor(baVar.getHighSpeedVideoSizes());
            case 22:
                return util.h.xy.dh.mg.getHighSpeedVideoFpsRanges(baVar.getHighSpeedVideoSizes());
            case 23:
                return util.h.xy.dh.ro.getHighSpeedVideoSizes(baVar.getHighSpeedVideoSizes());
            case 24:
                return util.h.xy.dh.me.Camera2StreamConfigurationMap(baVar.getHighSpeedVideoSizes());
            case 25:
                return util.h.xy.dh.rf.getHighSpeedVideoSizes(baVar.getHighSpeedVideoSizes());
            case 26:
                return util.h.xy.dh.rp.Camera2StreamConfigurationMap(baVar.getHighSpeedVideoSizes());
            case 27:
                return util.h.xy.dh.e.getHighResolutionOutputSizeshNQ4ISI(baVar.getHighSpeedVideoSizes());
            case 28:
                return util.h.xy.dh.mo.Camera2StreamConfigurationMap(baVar.getHighSpeedVideoSizes());
            case 30:
                int highSpeedVideoFpsRangesFor = baVar.getHighSpeedVideoFpsRangesFor();
                if ((highSpeedVideoFpsRangesFor & 1) != 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\uebb7\uebda憎宍ꌅ迁\ue83b艠豬㭚䁮\ufadfⒻ폼\ud88d劣\udcfb毓넏쭐甎ɚी⍶\ued56骖\ue1b0鯥藫㋅秱\uf459㹻픵툥民홸浱ꪙ쓒了ֺˆ㲾", 1 - android.view.View.resolveSize(0, 0), objArr3);
                    throw new java.io.IOException(((java.lang.String) objArr3[0]).intern());
                }
                int i3 = highSpeedVideoFpsRangesFor / 2;
                char[] cArr = new char[i3];
                byte[] bArr2 = new byte[8];
                int i4 = getOutputFormats + 101;
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 2;
                }
                int i6 = 0;
                while (highSpeedVideoFpsRangesFor >= 8) {
                    if (util.h.xy.ez.ma.m26744(baVar, bArr2, 0, 8) != 8) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("ឫ\u17ee蒿\udd73\udd1d\uea6a滯\ue78d灺䕰욞齾\ud8b6궄幅㜠\u20c5ᗓ㟡꺩褒籬迹䚐ᅆ\ue4aa杉﹍秶䲺．釳쉧ꬤ哸উ⩘ፆⱻꅤ늑箙", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4);
                        throw new java.io.EOFException(((java.lang.String) objArr4[0]).intern());
                    }
                    cArr[i6] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                    cArr[i6 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                    cArr[i6 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                    cArr[i6 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                    i6 += 4;
                    highSpeedVideoFpsRangesFor -= 8;
                }
                if (highSpeedVideoFpsRangesFor > 0) {
                    int i7 = getOutputFormats + 95;
                    getHighSpeedVideoFpsRanges = i7 % 128;
                    if (i7 % 2 != 0 ? util.h.xy.ez.ma.m26744(baVar, bArr2, 0, highSpeedVideoFpsRangesFor) != highSpeedVideoFpsRangesFor : util.h.xy.ez.ma.m26744(baVar, bArr2, 1, highSpeedVideoFpsRangesFor) != highSpeedVideoFpsRangesFor) {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("ឫ\u17ee蒿\udd73\udd1d\uea6a滯\ue78d灺䕰욞齾\ud8b6궄幅㜠\u20c5ᗓ㟡꺩褒籬迹䚐ᅆ\ue4aa杉﹍秶䲺．釳쉧ꬤ哸উ⩘ፆⱻꅤ늑箙", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr5);
                        throw new java.io.EOFException(((java.lang.String) objArr5[0]).intern());
                    }
                    while (true) {
                        int i8 = i2 + 2;
                        cArr[i6] = (char) ((bArr2[i2] << 8) | (bArr2[i2 + 1] & 255));
                        i6++;
                        if (i8 < highSpeedVideoFpsRangesFor) {
                            i2 = i8;
                        }
                    }
                }
                if (baVar.getHighSpeedVideoFpsRangesFor() == 0 && i3 == i6) {
                    return util.h.xy.dh.a.getHighSpeedVideoFpsRanges(cArr);
                }
                throw new java.lang.IllegalStateException();
        }
    }

    private static byte[] Camera2StreamConfigurationMap(util.h.xy.dh.ba baVar, byte[][] bArr) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 7) % 128;
        int highSpeedVideoFpsRangesFor = baVar.getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor >= bArr.length) {
            return baVar.getHighSpeedVideoSizes();
        }
        byte[] bArr2 = bArr[highSpeedVideoFpsRangesFor];
        if (bArr2 == null) {
            bArr2 = new byte[highSpeedVideoFpsRangesFor];
            bArr[highSpeedVideoFpsRangesFor] = bArr2;
        }
        baVar.getHighSpeedVideoFpsRanges(bArr2);
        getOutputFormats = (getHighSpeedVideoFpsRanges + 33) % 128;
        return bArr2;
    }

    static int getHighSpeedVideoSizes(java.io.InputStream inputStream, int i, boolean z) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 49) % 128;
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            int i2 = getOutputFormats + 71;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return -1;
            }
            throw null;
        }
        if (read < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("혯홪롒\ue400\ue1f0铹垜餞뇽禜\ufffb\ue1ecᤣ鄧朵䦾\ue156⤵໖큶䢚䂁뛍㠚탃\ud803帻胊롧瀒왱\uef72Φ韯", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            throw new java.io.EOFException(((java.lang.String) objArr[0]).intern());
        }
        if (255 == read) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("倊㔬驗罡쒋ꦯແ鎤礇\ude25ꍇ\u086f\uedcf犨ퟂ볾Ȟ\ue772䱕텵뚑ᮿ\ue0db䗽⬏뀿ᔔ充徚⒰觚滨\uf42b夂㸱莘梁췠", android.view.KeyEvent.keyCodeFromString("") + 25889, objArr2);
            throw new java.io.IOException(((java.lang.String) objArr2[0]).intern());
        }
        int i3 = 0;
        int i4 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("倦睳ẛ♞쵹铗밬䎔櫿㈔\ud9a7\ue113衶꿔眸ẜ◴촌钡밋䍡櫏㈽\ud982", android.view.KeyEvent.normalizeMetaState(0) + 10079, objArr3);
                throw new java.io.EOFException(((java.lang.String) objArr3[0]).intern());
            }
            if ((i3 >>> 23) != 0) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("倏\ue047゛䃥酯ⅲ燎舜퉖拠닩쌿ᎁꏅ\uf417ѯ咧\ue4fd㔈䖞闚☪癶蚪휃朐랐쟥ᠥ\ua879\uf889ं奫\ue9a9㧻䨂髜⪅筡譬\udbb2气뱞", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 45131, objArr4);
                throw new java.io.IOException(((java.lang.String) objArr4[0]).intern());
            }
            i3 = (i3 << 8) + read2;
            i4++;
        } while (i4 < (read & 127));
        int i5 = getOutputFormats + 45;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (i3 < i || z) {
            return i3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\uf6c3\uf6a0\udf5e\uf464蛜㸪䟌㎟鄂ẏ\uef9e䬴㧏\uf62b睕\ue371솭串ỳ窤栳⟎ꛮ鋒\uf032뽛业⨎额\u175b혔䖺⍚\uf0e9緆\uddea쭃䢿ջ産台\u206b괢贑ﮭ맄㓳⒋舛ᇍ\udcd2", 1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        sb.append(i3);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("偃츂泠譞", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 40543, objArr6);
        sb.append(((java.lang.String) objArr6[0]).intern());
        sb.append(i);
        throw new java.io.IOException(sb.toString());
    }

    static int Camera2StreamConfigurationMap(java.io.InputStream inputStream, int i) throws java.io.IOException {
        int read;
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = getOutputFormats + 17;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0 ? (read = inputStream.read()) < 31 : (read = inputStream.read()) < 95) {
            getHighSpeedVideoFpsRanges = (getOutputFormats + 69) % 128;
            if (read < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("缚罟\uea13뉱뎱⎔ǭ\u2e73ᣈ⯝ꦊ嚁뀖썦ㅚﻕ䡵筳壣朒\ue1eaዚ\ue0ba轤禾訔ࡎ㞳ᅗ≓遍", android.graphics.Color.red(0) + 1, objArr);
                throw new java.io.EOFException(((java.lang.String) objArr[0]).intern());
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("倀㍓隯稌\udd6aꃈЭ\ue79f䫿⸔놦ᔂ\uf865寕㼰芟斳줁곭〆鍦盏\uda21뷊ÿ\ue445䞢⭆蹩ᇕ\uf52c墀㯦鼮拝얢ꤟ೫遈猺훝먻ᶀ\ue0f8䑓", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 25439, objArr2);
            throw new java.io.IOException(((java.lang.String) objArr2[0]).intern());
        }
        int i4 = read & 127;
        if (i4 == 0) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("倀\ua7eb뿟랤辊螐齽靗\uef3f\ue75c６\uf6fa컅욽\udea0횇⸳☙㹽㘯กצᷘᗎ涢斈紵畖䵎䔯崙咺곷꓅벪듖豱葵鱄鐰\uec1e\ue3eeﮥ\uf3c8쮸쎍\udb8f퍮", 63463 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
            throw new java.io.IOException(((java.lang.String) objArr3[0]).intern());
        }
        while ((read & 128) != 0) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 69) % 128;
            if ((i4 >>> 24) != 0) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ue843\ue817ᗲ\ue0dd䱾偶占嶑辙퐦מּ╯❎㳕掿贴\udf30蒉\u0a4eᒵ盧\ued27눖ﲏ\ueee7疰媲䐝蘙\uddbe슻⯺", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4);
                throw new java.io.IOException(((java.lang.String) objArr4[0]).intern());
            }
            read = inputStream.read();
            if (read < 0) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes("缚罟\uea13뉱뎱⎔ǭ\u2e73ᣈ⯝ꦊ嚁뀖썦ㅚﻕ䡵筳壣朒\ue1eaዚ\ue0ba轤禾訔ࡎ㞳ᅗ≓遍", 1 - android.view.View.resolveSize(0, 0), objArr5);
                throw new java.io.EOFException(((java.lang.String) objArr5[0]).intern());
            }
            i4 = (i4 << 7) | (read & 127);
        }
        return i4;
    }

    private util.h.xy.dh.d getHighSpeedVideoSizes(util.h.xy.dh.ba baVar) throws java.io.IOException {
        int highSpeedVideoFpsRangesFor;
        int i = getHighSpeedVideoFpsRanges + 67;
        getOutputFormats = i % 128;
        if (i % 2 == 0 ? (highSpeedVideoFpsRangesFor = baVar.getHighSpeedVideoFpsRangesFor()) > 0 : (highSpeedVideoFpsRangesFor = baVar.getHighSpeedVideoFpsRangesFor()) > 0) {
            return new util.h.xy.dh.mf(baVar, highSpeedVideoFpsRangesFor, this.getInputFormats, this.getOutputMinFrameDuration).Camera2StreamConfigurationMap();
        }
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(0);
        int i2 = getOutputFormats + 25;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    final util.h.xy.dh.d Camera2StreamConfigurationMap() throws java.io.IOException {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 55) % 128;
        util.h.xy.dh.mi m26317 = m26317();
        if (m26317 == null) {
            return new util.h.xy.dh.d(0);
        }
        util.h.xy.dh.d dVar = new util.h.xy.dh.d();
        do {
            dVar.m26290(m26317);
            m26317 = m26317();
        } while (m26317 != null);
        int i = getHighSpeedVideoFpsRanges;
        getOutputFormats = (i + 115) % 128;
        int i2 = i + 65;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    private static util.h.xy.dh.rh getHighSpeedVideoSizes(util.h.xy.dh.d dVar) throws java.io.IOException {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 115) % 128;
        int m26288 = dVar.m26288();
        util.h.xy.dh.rh[] rhVarArr = new util.h.xy.dh.rh[m26288];
        for (int i = 0; i != m26288; i++) {
            util.h.xy.dh.c m26289 = dVar.m26289(i);
            if (!(m26289 instanceof util.h.xy.dh.rh)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("䑢䐗벁쇯\ue502꿼牞ꉕ⎹絗\uda0f\udaa7譥閶䋇状猝ⷼ⬹\ueb7a\udadc䑟錪̞䊈\udc84篔믅⨿瓀\ue3dd푪釠鍸䡊䰠禬⭿メ\ue4e9\ue143䎣颵ᲂ䤎\uda54ł땰り牭\ue92dⵟ顁誈凷䖂\b⋗㘫︷", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(m26289.getClass());
                throw new util.h.xy.dh.re(sb.toString());
            }
            int i2 = getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getOutputFormats = i2 % 128;
            util.h.xy.dh.rh rhVar = (util.h.xy.dh.rh) m26289;
            if (i2 % 2 != 0) {
                rhVarArr[i] = rhVar;
                throw null;
            }
            rhVarArr[i] = rhVar;
        }
        return new util.h.xy.dh.rr(rhVarArr);
    }

    private static util.h.xy.dh.ma Camera2StreamConfigurationMap(util.h.xy.dh.d dVar) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 35) % 128;
        int m26288 = dVar.m26288();
        util.h.xy.dh.ma[] maVarArr = new util.h.xy.dh.ma[m26288];
        for (int i = 0; i != m26288; i++) {
            util.h.xy.dh.c m26289 = dVar.m26289(i);
            if (!(m26289 instanceof util.h.xy.dh.ma)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("倖渄Ⱊ\uea16꠨昹\u243b\ue27cꁄ繐㱓贈롬癢㐽\uf281낝亙ಮ쪽袹䚪Ӏ싞胞廦Ჩ\udaf9飱坆ᔎ팛鄭꼹津⬪\ue952ꝍ敁⍙\ue16f뼲絛㮩僚럖疮㎐\uf181输䷯௯즍螞", 15881 - android.view.View.MeasureSpec.getSize(0), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(m26289.getClass());
                throw new util.h.xy.dh.re(sb.toString());
            }
            maVarArr[i] = (util.h.xy.dh.ma) m26289;
            getHighSpeedVideoFpsRanges = (getOutputFormats + 101) % 128;
        }
        return new util.h.xy.dh.rq(maVarArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dh.mi m26317() throws java.io.IOException {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 117) % 128;
        int read = read();
        if (read <= 0) {
            int i = getOutputFormats + 17;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (read != 0) {
                return null;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("倖劦啐堚媿嵑䀂䊺䕞䠄䫭䵟瀉犨甔砉窵紕怆抽救栐檴浐ဟኣᔝ᠇᪶ᵎ\u0002ʳձ", android.view.View.combineMeasuredStates(0, 0) + 683, objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this, read);
        int m26319 = m26319();
        if (m26319 >= 0) {
            int i2 = getHighSpeedVideoFpsRanges + 33;
            getOutputFormats = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    return m26318(read, Camera2StreamConfigurationMap2, m26319);
                }
                m26318(read, Camera2StreamConfigurationMap2, m26319);
                throw new java.lang.ArithmeticException();
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("倀홯峗쌸䦚쿼癅ﲳ挟\ue938濎陖Ჵ茁२迃㙳범⋰ꥎ⾺嘟\udc95䋣쥏", 34403 - android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
                throw new util.h.xy.dh.re(((java.lang.String) objArr2[0]).intern(), e);
            }
        }
        if ((read & 32) == 0) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes("㹻㸒뿏Ꙫ\ue64c톧ᗔ\udc05妩縇붊꒵\uf167雿┅\u0ce4ं⺨䳻锰ꃃ䝒\uf4b0終㢖\udfd3ᱝ얘倪瞜萝꩸\uebf2選⿏㉻ο⠫坾骧鬏䃫Ｊ拟㌜\ud94f曦쬜䪢焔躙區", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr3);
            throw new java.io.IOException(((java.lang.String) objArr3[0]).intern());
        }
        util.h.xy.dh.rm rmVar = new util.h.xy.dh.rm(new util.h.xy.dh.ay(this, this.getHighSpeedVideoSizesFor), this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration);
        int i3 = read & 192;
        if (i3 != 0) {
            return rmVar.getHighResolutionOutputSizeshNQ4ISI(i3, Camera2StreamConfigurationMap2);
        }
        if (Camera2StreamConfigurationMap2 == 3) {
            return util.h.xy.dh.mr.getHighSpeedVideoSizes(rmVar);
        }
        if (Camera2StreamConfigurationMap2 == 4) {
            return util.h.xy.dh.t.getHighSpeedVideoSizes(rmVar);
        }
        if (Camera2StreamConfigurationMap2 == 8) {
            util.h.xy.dh.an highSpeedVideoFpsRanges = util.h.xy.dh.w.getHighSpeedVideoFpsRanges(rmVar);
            int i4 = getHighSpeedVideoFpsRanges + 51;
            getOutputFormats = i4 % 128;
            if (i4 % 2 == 0) {
                return highSpeedVideoFpsRanges;
            }
            throw null;
        }
        if (Camera2StreamConfigurationMap2 == 16) {
            return util.h.xy.dh.mt.Camera2StreamConfigurationMap(rmVar);
        }
        if (Camera2StreamConfigurationMap2 == 17) {
            return util.h.xy.dh.rt.getHighResolutionOutputSizeshNQ4ISI(rmVar);
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoSizes("㯤㮑쩽⫈鏾좟饹씶尿\u0babㄨ뷄\uf4ce\ue36d꧘ᖐಗ嬖쁔谙ꕗ㊴硂摭㴎ꩯ郹\udca1喲Ȭࢿ댒\uee6d\ue5c0", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr4);
        throw new java.io.IOException(((java.lang.String) objArr4[0]).intern());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final util.h.xy.dh.mi m26318(int i, int i2, int i3) throws java.io.IOException {
        util.h.xy.dh.ba baVar = new util.h.xy.dh.ba(this, i3, this.getHighSpeedVideoSizesFor);
        if ((i & 224) == 0) {
            int i4 = getHighSpeedVideoFpsRanges + 35;
            getOutputFormats = i4 % 128;
            if (i4 % 2 == 0) {
                return getHighSpeedVideoFpsRangesFor(i2, baVar, this.getOutputMinFrameDuration);
            }
            getHighSpeedVideoFpsRangesFor(i2, baVar, this.getOutputMinFrameDuration);
            throw null;
        }
        int i5 = i & 192;
        if (i5 != 0) {
            int i6 = (getOutputFormats + 115) % 128;
            getHighSpeedVideoFpsRanges = i6;
            if ((i & 32) != 0) {
                util.h.xy.dh.mi highSpeedVideoFpsRangesFor = util.h.xy.dh.mm.getHighSpeedVideoFpsRangesFor(i5, i2, getHighSpeedVideoSizes(baVar));
                int i7 = getHighSpeedVideoFpsRanges + 43;
                getOutputFormats = i7 % 128;
                if (i7 % 2 == 0) {
                    return highSpeedVideoFpsRangesFor;
                }
                throw null;
            }
            int i8 = i6 + 121;
            getOutputFormats = i8 % 128;
            int i9 = i8 % 2;
            byte[] highSpeedVideoSizes = baVar.getHighSpeedVideoSizes();
            if (i9 == 0) {
                return util.h.xy.dh.mm.getHighSpeedVideoFpsRangesFor(i5, i2, highSpeedVideoSizes);
            }
            util.h.xy.dh.mm.getHighSpeedVideoFpsRangesFor(i5, i2, highSpeedVideoSizes);
            throw null;
        }
        if (i2 == 3) {
            util.h.xy.dh.ma Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(getHighSpeedVideoSizes(baVar));
            getHighSpeedVideoFpsRanges = (getOutputFormats + 19) % 128;
            return Camera2StreamConfigurationMap2;
        }
        if (i2 == 4) {
            return getHighSpeedVideoSizes(getHighSpeedVideoSizes(baVar));
        }
        if (i2 == 8) {
            return util.h.xy.dh.ao.getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes(baVar)).getInputSizeshNQ4ISI();
        }
        if (i2 == 16) {
            return baVar.getHighSpeedVideoFpsRangesFor() <= 0 ? util.h.xy.dh.ao.getHighSpeedVideoFpsRangesFor : this.getInputFormats ? new util.h.xy.dh.bd(baVar.getHighSpeedVideoSizes()) : util.h.xy.dh.ao.getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes(baVar));
        }
        if (i2 == 17) {
            return util.h.xy.dh.ao.getHighSpeedVideoSizes(getHighSpeedVideoSizes(baVar));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("倖䑔確洆Ũ㖩⨛\ude2c\uf2df\ue723魾辐", 5209 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(i2);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("偃倄倉倆倄倜倁候倖倃倒們", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        throw new java.io.IOException(sb.toString());
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final int m26319() throws java.io.IOException {
        int i = getOutputFormats + 45;
        getHighSpeedVideoFpsRanges = i % 128;
        return getHighSpeedVideoSizes(this, this.getHighSpeedVideoSizesFor, i % 2 == 0);
    }

    private mf(java.io.InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.getHighSpeedVideoSizesFor = i;
        this.getInputFormats = z;
        this.getOutputMinFrameDuration = bArr;
    }

    public mf(java.io.InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    public mf(java.io.InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public mf(byte[] bArr, boolean z) {
        this(new java.io.ByteArrayInputStream(bArr), bArr.length, z);
    }

    public mf(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr), bArr.length);
    }
}
