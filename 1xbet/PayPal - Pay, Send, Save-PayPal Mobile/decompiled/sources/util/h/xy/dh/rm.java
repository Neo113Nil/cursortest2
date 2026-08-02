package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class rm {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = -4082723718039672725L;
    private final java.io.InputStream getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final byte[][] getOutputFormats;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 19) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizes ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i3 = getHighSpeedVideoFpsRangesFor + 59;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 >> 1;
            } else {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    final util.h.xy.dh.d getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        int read = this.getHighSpeedVideoSizesFor.read();
        if (read < 0) {
            return new util.h.xy.dh.d(0);
        }
        util.h.xy.dh.d dVar = new util.h.xy.dh.d();
        do {
            util.h.xy.dh.c highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(read);
            if (highSpeedVideoFpsRangesFor instanceof util.h.xy.dh.aw) {
                dVar.m26290(((util.h.xy.dh.aw) highSpeedVideoFpsRangesFor).mo26278());
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
            } else {
                dVar.m26290(highSpeedVideoFpsRangesFor.mo26279());
            }
            read = this.getHighSpeedVideoSizesFor.read();
        } while (read >= 0);
        int i = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
        getHighSpeedVideoFpsRanges = i;
        getHighResolutionOutputSizeshNQ4ISI = (i + 5) % 128;
        return dVar;
    }

    private util.h.xy.dh.c Camera2StreamConfigurationMap(int i, util.h.xy.dh.ba baVar) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
        if (i == 3) {
            util.h.xy.dh.ap apVar = new util.h.xy.dh.ap(baVar);
            int i2 = getHighSpeedVideoFpsRanges + 81;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                return apVar;
            }
            throw null;
        }
        if (i == 4) {
            return new util.h.xy.dh.ab(baVar);
        }
        if (i == 8) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\udb95頡峖ᅮ픦觓乧ȃ웋묡缇㏆\uf06f됑森ⵢ\ue113ꖬᨲ\ude18銫坃ଅ쾫豚䀄ҹ綾뷩熱㘞\ueae2꺾捚⟭鮏塝ᳳ킁镯䦰ඒ숯蛶竜㼝\uf380럁瑹⢙\uecd2ꅣ斊\uda3c鹮劖", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17322, objArr);
            throw new util.h.xy.dh.re(((java.lang.String) objArr[0]).intern());
        }
        if (i == 16) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\udb83瘔肆팀淔렘쪃攄람쉙\u1c8f꼈蓮ᑝꚝ\uf110Ύ帒\ue896㬑喑\ue006㊒䴂龌⩉䒏霅\u218f簂躊\ud906殾蘶탲捻붧젰᪳땷잀ቷ곬｢৬ꑽ\uf6e6ű叱\uee70㣬䭲\ue5ebぽ䋨鵶⿺穧铻❢", 44417 - android.text.TextUtils.indexOf("", "", 0, 0), objArr2);
            throw new util.h.xy.dh.re(((java.lang.String) objArr2[0]).intern());
        }
        if (i == 17) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\udb83Ċ溿员뇩麅쐩⇌ཻ瑇冫뽐\ue4f7솗⽢ᓔ牳弚蓾\ue25e쿳㒕ሩ翍ꕪ舂\uefb5핁㋱ᾗ䕲ꋔ衾\uf5ec튁㠩旅䍥ꠍ闩\uf300\ud8f4փ挠䢄뙛鍌\uf8f7☙ί棞噥뎒餢왔⏨ग皯变륤\ue684창⥃ᛸ", 55967 - android.view.View.combineMeasuredStates(0, 0), objArr3);
            throw new util.h.xy.dh.re(((java.lang.String) objArr3[0]).intern());
        }
        try {
            return util.h.xy.dh.mf.getHighSpeedVideoFpsRangesFor(i, baVar, this.getOutputFormats);
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\udb93\ue13a껈瑭ㄑﺹ葚䄖ຼ퐝釱库搾⇴\uee97됶熀㽡쐏膻佱ᐚ톪齆ꓬ", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 15013, objArr4);
            throw new util.h.xy.dh.re(((java.lang.String) objArr4[0]).intern(), e);
        }
    }

    private util.h.xy.dh.c getHighSpeedVideoFpsRanges(int i) throws java.io.IOException {
        if (i == 3) {
            return new util.h.xy.dh.mr(this);
        }
        if (i == 4) {
            return new util.h.xy.dh.t(this);
        }
        if (i == 8) {
            return new util.h.xy.dh.w(this);
        }
        if (i == 16) {
            util.h.xy.dh.mt mtVar = new util.h.xy.dh.mt(this);
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 57;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return mtVar;
            }
            throw new java.lang.ArithmeticException();
        }
        if (i == 17) {
            util.h.xy.dh.rt rtVar = new util.h.xy.dh.rt(this);
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 91;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                return rtVar;
            }
            throw null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\udb85爯裹⚍絛诲↸砇阺Ⲍ筈酋⿓䙯鰴⫊䂃齅㖢䎶驊〖亩\ue562㌆䧍\ue06f㸩哉\ue299㥴垿\uede0љ", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43440, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(java.lang.Integer.toHexString(i));
        throw new util.h.xy.dh.re(sb.toString());
    }

    final util.h.xy.dh.mi getHighResolutionOutputSizeshNQ4ISI(int i, int i2) throws java.io.IOException {
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 11;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            util.h.xy.dh.mm.getHighSpeedVideoSizes(i, i2, getHighSpeedVideoFpsRangesFor());
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.mi highSpeedVideoSizes = util.h.xy.dh.mm.getHighSpeedVideoSizes(i, i2, getHighSpeedVideoFpsRangesFor());
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 51;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            return highSpeedVideoSizes;
        }
        throw null;
    }

    final util.h.xy.dh.mi getHighResolutionOutputSizeshNQ4ISI(int i, int i2, boolean z) throws java.io.IOException {
        if (z) {
            util.h.xy.dh.mi highSpeedVideoFpsRangesFor = util.h.xy.dh.mm.getHighSpeedVideoFpsRangesFor(i, i2, getHighSpeedVideoFpsRangesFor());
            int i3 = getHighSpeedVideoFpsRanges + 121;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                return highSpeedVideoFpsRangesFor;
            }
            throw null;
        }
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
        util.h.xy.dh.mi highSpeedVideoFpsRangesFor2 = util.h.xy.dh.mm.getHighSpeedVideoFpsRangesFor(i, i2, ((util.h.xy.dh.ba) this.getHighSpeedVideoSizesFor).getHighSpeedVideoSizes());
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 43;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            return highSpeedVideoFpsRangesFor2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private util.h.xy.dh.c getHighSpeedVideoFpsRangesFor(int i) throws java.io.IOException {
        boolean z;
        int highSpeedVideoSizes;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i2 + 51) % 128;
        int i3 = (i2 + 47) % 128;
        getHighSpeedVideoFpsRanges = i3;
        java.io.InputStream inputStream = this.getHighSpeedVideoSizesFor;
        if (inputStream instanceof util.h.xy.dh.ay) {
            int i4 = i3 + 65;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            ((util.h.xy.dh.ay) inputStream).getHighSpeedVideoFpsRangesFor(false);
            if (i4 % 2 != 0) {
                throw null;
            }
        }
        int Camera2StreamConfigurationMap2 = util.h.xy.dh.mf.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor, i);
        java.io.InputStream inputStream2 = this.getHighSpeedVideoSizesFor;
        int i5 = this.getInputFormats;
        if (Camera2StreamConfigurationMap2 != 3) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = (i6 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            if (Camera2StreamConfigurationMap2 != 4 && Camera2StreamConfigurationMap2 != 16) {
                int i7 = i6 + 125;
                getHighSpeedVideoFpsRanges = i7 % 128;
                if (i7 % 2 != 0 ? Camera2StreamConfigurationMap2 != 17 : Camera2StreamConfigurationMap2 != 104) {
                    if (Camera2StreamConfigurationMap2 != 8) {
                        z = false;
                        highSpeedVideoSizes = util.h.xy.dh.mf.getHighSpeedVideoSizes(inputStream2, i5, z);
                        if (highSpeedVideoSizes >= 0) {
                            if ((i & 32) == 0) {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("\udb99褟纖Ⱆ醒䜜㒘騞侌㴜\ue2d7倗֙\ueb13墙ซ\uf388ꅁᚒ쐑ꦍἈ첏눓极픟몏桋\udd89范炍☀讴礸⺼鰴䇴㜰\ue4b8䨴㾷\ued2c労/\uf5b9嬯ࢻ︻", 21120 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr);
                                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
                            }
                            util.h.xy.dh.rm rmVar = new util.h.xy.dh.rm(new util.h.xy.dh.ay(this.getHighSpeedVideoSizesFor, this.getInputFormats), this.getInputFormats, this.getOutputFormats);
                            int i8 = i & 192;
                            if (i8 != 0) {
                                return 64 == i8 ? new util.h.xy.dh.s(Camera2StreamConfigurationMap2, rmVar) : new util.h.xy.dh.mv(i8, Camera2StreamConfigurationMap2, rmVar);
                            }
                            util.h.xy.dh.c highSpeedVideoFpsRanges = rmVar.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2);
                            int i9 = getHighResolutionOutputSizeshNQ4ISI + 41;
                            getHighSpeedVideoFpsRanges = i9 % 128;
                            if (i9 % 2 != 0) {
                                return highSpeedVideoFpsRanges;
                            }
                            throw null;
                        }
                        util.h.xy.dh.ba baVar = new util.h.xy.dh.ba(this.getHighSpeedVideoSizesFor, highSpeedVideoSizes, this.getInputFormats);
                        if ((i & 224) == 0) {
                            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
                            return Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, baVar);
                        }
                        util.h.xy.dh.rm rmVar2 = new util.h.xy.dh.rm(baVar, baVar.Camera2StreamConfigurationMap(), this.getOutputFormats);
                        int i10 = i & 192;
                        if (i10 != 0) {
                            boolean z2 = (i & 32) != 0;
                            return 64 == i10 ? (util.h.xy.dh.ah) rmVar2.getHighResolutionOutputSizeshNQ4ISI(i10, Camera2StreamConfigurationMap2, z2) : new util.h.xy.dh.ar(i10, Camera2StreamConfigurationMap2, z2, rmVar2);
                        }
                        int i11 = getHighSpeedVideoFpsRanges + 7;
                        getHighResolutionOutputSizeshNQ4ISI = i11 % 128;
                        if (i11 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        if (Camera2StreamConfigurationMap2 == 3) {
                            return new util.h.xy.dh.mr(rmVar2);
                        }
                        if (Camera2StreamConfigurationMap2 == 4) {
                            return new util.h.xy.dh.t(rmVar2);
                        }
                        if (Camera2StreamConfigurationMap2 == 8) {
                            util.h.xy.dh.w wVar = new util.h.xy.dh.w(rmVar2);
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 17) % 128;
                            return wVar;
                        }
                        if (Camera2StreamConfigurationMap2 == 16) {
                            return new util.h.xy.dh.as(rmVar2);
                        }
                        if (Camera2StreamConfigurationMap2 == 17) {
                            return new util.h.xy.dh.au(rmVar2);
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\udb85塡\udc65偣푣䡼챤䀩쑌硋ﰦ灪\uf466桩\uec67恢\ue474ᠿ鱻ၳ鑿ࡴ豯w葬㡲뱤ば둰⠩갲‡ꑨ", 33791 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                        sb.append(((java.lang.String) objArr2[0]).intern());
                        sb.append(java.lang.Integer.toHexString(Camera2StreamConfigurationMap2));
                        throw new util.h.xy.dh.re(sb.toString());
                    }
                }
            }
        }
        z = true;
        highSpeedVideoSizes = util.h.xy.dh.mf.getHighSpeedVideoSizes(inputStream2, i5, z);
        if (highSpeedVideoSizes >= 0) {
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dh.c m26346() throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
        int read = this.getHighSpeedVideoSizesFor.read();
        if (read >= 0) {
            util.h.xy.dh.c highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(read);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 77) % 128;
            return highSpeedVideoFpsRangesFor;
        }
        int i = getHighSpeedVideoFpsRanges + 51;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    rm(java.io.InputStream inputStream, int i, byte[][] bArr) {
        this.getHighSpeedVideoSizesFor = inputStream;
        this.getInputFormats = i;
        this.getOutputFormats = bArr;
    }
}
