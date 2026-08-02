package util.h.xy.ek;

/* loaded from: classes5.dex */
public final class ra implements util.h.xy.ef.me {
    private static long Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static java.util.Hashtable getHighSpeedVideoSizes;
    private static long getHighSpeedVideoSizesFor;
    private static int getOutputFormats;
    private util.h.xy.ef.rd getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private util.h.xy.fb.c getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private util.h.xy.fb.c getOutputStallDurationlomOqCM;

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 51;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizesFor ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 17) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizesFor ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 5;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
        char[] cArr = charArray;
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (Camera2StreamConfigurationMap ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr2 = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 85) % 128;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    static {
        Camera2StreamConfigurationMap();
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoSizes = hashtable;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("Ꮫꥲ暍㰫狼뚍䱫\u09ca", android.view.View.getDefaultSize(0, 0) + 47777, objArr);
        hashtable.put(((java.lang.String) objArr[0]).intern(), util.h.xy.fb.b.m26828(32));
        java.util.Hashtable hashtable2 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("嵊崇찱鴜䳇\uee27㕃", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr2);
        hashtable2.put(((java.lang.String) objArr2[0]).intern(), util.h.xy.fb.b.m26828(16));
        java.util.Hashtable hashtable3 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ᏑƇ㜖", 4702 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
        hashtable3.put(((java.lang.String) objArr3[0]).intern(), util.h.xy.fb.b.m26828(64));
        java.util.Hashtable hashtable4 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("⣮⢣\ue9e1료㘽铚贫", android.graphics.Color.alpha(0) + 1, objArr4);
        hashtable4.put(((java.lang.String) objArr4[0]).intern(), util.h.xy.fb.b.m26828(64));
        java.util.Hashtable hashtable5 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("Ꮞ디幎\ue79a裕初שׂ鳩▬", 42689 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr5);
        hashtable5.put(((java.lang.String) objArr5[0]).intern(), util.h.xy.fb.b.m26828(64));
        java.util.Hashtable hashtable6 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ᒈᓚ\uf0a8ꆈ렩᪫¨\uf4d6兡㛁\uf2ec㥁鿰", 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr6);
        hashtable6.put(((java.lang.String) objArr6[0]).intern(), util.h.xy.fb.b.m26828(64));
        java.util.Hashtable hashtable7 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("Ꮟ핑黗䀾হ", 50820 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr7);
        hashtable7.put(((java.lang.String) objArr7[0]).intern(), util.h.xy.fb.b.m26828(64));
        java.util.Hashtable hashtable8 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("귃궐碂⦣\u0082ꈑ\ue366ᝰ\ue855뺜䩓", android.view.View.resolveSizeAndState(0, 0, 0) + 1, objArr8);
        hashtable8.put(((java.lang.String) objArr8[0]).intern(), util.h.xy.fb.b.m26828(64));
        java.util.Hashtable hashtable9 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("Ꮟ╟绋뀐즂̞哨", android.view.View.resolveSize(0, 0) + 13963, objArr9);
        hashtable9.put(((java.lang.String) objArr9[0]).intern(), util.h.xy.fb.b.m26828(64));
        java.util.Hashtable hashtable10 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("Ꮟ巃迳林⯳闗윢", android.text.TextUtils.getOffsetBefore("", 0) + 19991, objArr10);
        hashtable10.put(((java.lang.String) objArr10[0]).intern(), util.h.xy.fb.b.m26828(128));
        java.util.Hashtable hashtable11 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("Ꮟ锛ṃ蟜\u0895놦㭴", 34511 - android.view.View.MeasureSpec.getSize(0), objArr11);
        hashtable11.put(((java.lang.String) objArr11[0]).intern(), util.h.xy.fb.b.m26828(128));
        java.util.Hashtable hashtable12 = getHighSpeedVideoSizes;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("Ꮘ\ue12e\uf64d쭨\ud882", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62170, objArr12);
        hashtable12.put(((java.lang.String) objArr12[0]).intern(), util.h.xy.fb.b.m26828(64));
        java.util.Hashtable hashtable13 = getHighSpeedVideoSizes;
        int i = getHighSpeedVideoFpsRangesFor + 43;
        getOutputFormats = i % 128;
        int i2 = i % 2;
        try {
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("未杽\uf3dbꋚ嗞\uf765濴鮽⋢㖧ὼ噄\uec0e", 1 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr13);
            hashtable13.put(((java.lang.String) objArr13[0]).intern(), util.h.xy.fb.b.m26828(64));
            getOutputFormats = (getHighSpeedVideoFpsRangesFor + 61) % 128;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, byte b) {
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 117) % 128;
        int i2 = 0;
        while (i2 < i) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
            i2++;
            int i3 = getOutputFormats + 81;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 4;
            }
        }
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ᐝ */
    public final int mo26548(byte[] bArr, int i) {
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 93) % 128;
        this.getInputFormats.mo26563(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM);
        util.h.xy.fb.c cVar = this.getOutputMinFrameDuration;
        if (cVar != null) {
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 65) % 128;
            ((util.h.xy.fb.c) this.getInputFormats).mo26585(cVar);
            util.h.xy.ef.rd rdVar = this.getInputFormats;
            rdVar.mo26562(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, rdVar.mo26565());
        } else {
            util.h.xy.ef.rd rdVar2 = this.getInputFormats;
            byte[] bArr2 = this.getInputSizeshNQ4ISI;
            rdVar2.mo26562(bArr2, 0, bArr2.length);
        }
        int mo26563 = this.getInputFormats.mo26563(bArr, i);
        int i2 = this.getOutputMinFrameDurationlomOqCM;
        while (true) {
            byte[] bArr3 = this.getInputSizeshNQ4ISI;
            if (i2 >= bArr3.length) {
                break;
            }
            int i3 = getHighSpeedVideoFpsRangesFor + 51;
            getOutputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                bArr3[i2] = 0;
                i2 += 57;
            } else {
                bArr3[i2] = 0;
                i2++;
            }
        }
        util.h.xy.fb.c cVar2 = this.getOutputStallDurationlomOqCM;
        if (cVar2 != null) {
            ((util.h.xy.fb.c) this.getInputFormats).mo26585(cVar2);
            return mo26563;
        }
        util.h.xy.ef.rd rdVar3 = this.getInputFormats;
        byte[] bArr4 = this.getOutputSizeshNQ4ISI;
        rdVar3.mo26562(bArr4, 0, bArr4.length);
        return mo26563;
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ᐝ */
    public final void mo26550(byte[] bArr, int i, int i2) {
        int i3 = getOutputFormats + 45;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        this.getInputFormats.mo26562(bArr, i, i2);
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ᐝ */
    public final void mo26549(byte b) {
        int i = getHighSpeedVideoFpsRangesFor + 23;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            this.getInputFormats.mo26560(b);
            throw null;
        }
        this.getInputFormats.mo26560(b);
        int i2 = getOutputFormats + 93;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ᐝ */
    public final int mo26547() {
        int i = (getHighSpeedVideoFpsRangesFor + 5) % 128;
        getOutputFormats = i;
        int i2 = this.getOutputSizes;
        getHighSpeedVideoFpsRangesFor = (i + 33) % 128;
        return i2;
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ˊ */
    public final void mo26546(util.h.xy.ef.mb mbVar) {
        byte[] bArr;
        this.getInputFormats.mo26564();
        byte[] m26663 = ((util.h.xy.ep.mc) mbVar).m26663();
        int length = m26663.length;
        if (length > this.getOutputMinFrameDurationlomOqCM) {
            int i = getHighSpeedVideoFpsRangesFor + 121;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                this.getInputFormats.mo26562(m26663, 0, length);
                this.getInputFormats.mo26563(this.getOutputSizeshNQ4ISI, 0);
            } else {
                this.getInputFormats.mo26562(m26663, 0, length);
                this.getInputFormats.mo26563(this.getOutputSizeshNQ4ISI, 0);
            }
            length = this.getOutputSizes;
        } else {
            java.lang.System.arraycopy(m26663, 0, this.getOutputSizeshNQ4ISI, 0, length);
        }
        while (true) {
            bArr = this.getOutputSizeshNQ4ISI;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
            int i2 = getHighSpeedVideoFpsRangesFor + 95;
            getOutputFormats = i2 % 128;
            int i3 = i2 % 2;
        }
        java.lang.System.arraycopy(bArr, 0, this.getInputSizeshNQ4ISI, 0, this.getOutputMinFrameDurationlomOqCM);
        getHighSpeedVideoFpsRangesFor(this.getOutputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE);
        getHighSpeedVideoFpsRangesFor(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, (byte) 92);
        util.h.xy.ef.rd rdVar = this.getInputFormats;
        if (rdVar instanceof util.h.xy.fb.c) {
            int i4 = getOutputFormats + 97;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            util.h.xy.fb.c mo26581 = ((util.h.xy.fb.c) rdVar).mo26581();
            this.getOutputMinFrameDuration = mo26581;
            util.h.xy.ef.rd rdVar2 = (util.h.xy.ef.rd) mo26581;
            byte[] bArr2 = this.getInputSizeshNQ4ISI;
            if (i4 % 2 == 0) {
                rdVar2.mo26562(bArr2, 1, this.getOutputMinFrameDurationlomOqCM);
            } else {
                rdVar2.mo26562(bArr2, 0, this.getOutputMinFrameDurationlomOqCM);
            }
        }
        util.h.xy.ef.rd rdVar3 = this.getInputFormats;
        byte[] bArr3 = this.getOutputSizeshNQ4ISI;
        rdVar3.mo26562(bArr3, 0, bArr3.length);
        util.h.xy.ef.rd rdVar4 = this.getInputFormats;
        if (rdVar4 instanceof util.h.xy.fb.c) {
            this.getOutputStallDurationlomOqCM = ((util.h.xy.fb.c) rdVar4).mo26581();
        }
    }

    private ra(util.h.xy.ef.rd rdVar, int i) {
        this.getInputFormats = rdVar;
        int mo26565 = rdVar.mo26565();
        this.getOutputSizes = mo26565;
        this.getOutputMinFrameDurationlomOqCM = i;
        this.getOutputSizeshNQ4ISI = new byte[i];
        this.getInputSizeshNQ4ISI = new byte[i + mo26565];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra(util.h.xy.ef.rd rdVar) {
        this(rdVar, r0);
        int intValue;
        int i = getHighSpeedVideoFpsRangesFor + 55;
        int i2 = i % 128;
        getOutputFormats = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (rdVar instanceof util.h.xy.ef.e) {
            getHighSpeedVideoFpsRangesFor = (i2 + 109) % 128;
            intValue = ((util.h.xy.ef.e) rdVar).mo26541();
        } else {
            java.lang.Integer num = (java.lang.Integer) getHighSpeedVideoSizes.get(rdVar.mo26561());
            if (num == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("Ꮹ⫯懍뢥\uf787\u0e7a䕜鱷\udb10ᇰ⣙柆뺳\uf591ప䭟舭\ud902៥⻞於볇﯂", android.graphics.ImageFormat.getBitsPerPixel(0) + 14622, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(rdVar.mo26561());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            intValue = num.intValue();
            getOutputFormats = (getHighSpeedVideoFpsRangesFor + 5) % 128;
        }
    }

    static void Camera2StreamConfigurationMap() {
        Camera2StreamConfigurationMap = -3990424405591580665L;
        getHighSpeedVideoSizesFor = -6843925920476911295L;
    }
}
