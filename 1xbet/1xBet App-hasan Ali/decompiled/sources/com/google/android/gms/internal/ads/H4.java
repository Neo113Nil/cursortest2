package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class H4 implements E4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J4 f9323b;

    public /* synthetic */ H4(J4 j42, int i) {
        this.f9322a = i;
        this.f9323b = j42;
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        J4 j42 = this.f9323b;
        int i = j42.f9716K1;
        int i5 = j42.f9730P0;
        int i6 = (~i5) & i;
        j42.f9794j0 = i6;
        int i7 = (~i6) & i;
        j42.f9792i2 = i7;
        int i8 = j42.f9830s1;
        int i9 = j42.e1;
        int i10 = ~i9;
        int i11 = j42.f9746U1 ^ i6;
        j42.f9746U1 = i11;
        int i12 = ((i8 | i7) & i10) ^ i11;
        j42.f9805m = i12;
        int i13 = i12 ^ j42.f9820p2;
        j42.f9820p2 = i13;
        int i14 = j42.f9684A2 ^ i11;
        int i15 = j42.f9690C1;
        int i16 = (i14 & i15) ^ j42.f9736R0;
        j42.f9684A2 = i16;
        int i17 = ((i6 ^ i8) & i9) ^ j42.f9689C0;
        j42.f9736R0 = i17;
        int i18 = j42.f9806m0;
        int i19 = (i16 ^ ((i17 ^ (i15 & i17)) | i18)) ^ j42.f9847x;
        j42.f9847x = i19;
        int i20 = i8 | i6;
        int i21 = ((~((i ^ i20) ^ j42.f9832t0)) & i15) ^ j42.f9724N0;
        int i22 = ~i18;
        int i23 = ~i8;
        int i24 = (~(i5 ^ (i6 & i23))) & i9;
        int i25 = (~(j42.f9699F ^ i20)) & i9;
        int i26 = (j42.f9688C & (~i)) ^ j42.f9826r0;
        j42.f9688C = i26;
        int i27 = (i26 ^ j42.J) ^ j42.f9705G1;
        int i28 = j42.f9837u1;
        int i29 = i28 | i27;
        int i30 = j42.f9749V1;
        int i31 = i30 ^ i29;
        j42.J = i31;
        int i32 = i31 ^ j42.f9802l0;
        j42.f9802l0 = i32;
        int i33 = j42.f9767b0 ^ (i30 ^ (i28 & i27));
        j42.f9767b0 = i33;
        int i34 = i5 ^ i;
        j42.f9716K1 = i34;
        int i35 = (~((i6 ^ (i23 & i34)) ^ i24)) & i15;
        int i36 = (i8 | i34) ^ i34;
        j42.f9705G1 = i36;
        int i37 = (((((j42.f9773c2 ^ i34) & i9) & i15) ^ i7) | i18) ^ i13;
        j42.f9773c2 = i37;
        int i38 = i37 ^ j42.f;
        j42.f = i38;
        int i39 = i8 ^ i34;
        j42.f9830s1 = i39;
        int i40 = j42.f9817p ^ i39;
        j42.f9817p = i40;
        int i41 = i40 ^ i35;
        j42.f9724N0 = i41;
        int i42 = i41 ^ j42.f9691C2;
        j42.f9691C2 = i42;
        int i43 = ~(i42 ^ j42.f9811n1);
        j42.f9811n1 = i43;
        int i44 = i39 ^ ((i34 ^ j42.f9810n0) & i9);
        j42.f9810n0 = i44;
        int i45 = i44 ^ ((i36 ^ i25) & i15);
        j42.f9689C0 = i45;
        int i46 = (i21 & i22) ^ i45;
        j42.f9832t0 = i46;
        int i47 = i46 ^ j42.f9803l1;
        j42.f9803l1 = i47;
        int i48 = j42.f9718L0;
        bArr2[0] = (byte) (i48 & 255);
        bArr2[1] = (byte) ((i48 >>> 8) & 255);
        bArr2[2] = (byte) ((i48 >>> 16) & 255);
        bArr2[3] = (byte) (i48 >> 24);
        int i49 = j42.f9780e2;
        bArr2[4] = (byte) (i49 & 255);
        bArr2[5] = (byte) ((i49 >>> 8) & 255);
        bArr2[6] = (byte) ((i49 >>> 16) & 255);
        bArr2[7] = (byte) (i49 >> 24);
        bArr2[8] = (byte) (i43 & 255);
        bArr2[9] = (byte) ((i43 >>> 8) & 255);
        bArr2[10] = (byte) ((i43 >>> 16) & 255);
        bArr2[11] = (byte) (i43 >> 24);
        int i50 = j42.f9776d1;
        bArr2[12] = (byte) (i50 & 255);
        bArr2[13] = (byte) ((i50 >>> 8) & 255);
        bArr2[14] = (byte) ((i50 >>> 16) & 255);
        bArr2[15] = (byte) (i50 >> 24);
        bArr2[16] = (byte) (i38 & 255);
        bArr2[17] = (byte) ((i38 >>> 8) & 255);
        bArr2[18] = (byte) ((i38 >>> 16) & 255);
        bArr2[19] = (byte) (i38 >> 24);
        int i51 = j42.f9778e;
        bArr2[20] = (byte) (i51 & 255);
        bArr2[21] = (byte) ((i51 >>> 8) & 255);
        bArr2[22] = (byte) ((i51 >>> 16) & 255);
        bArr2[23] = (byte) (i51 >> 24);
        int i52 = j42.f9788h;
        bArr2[24] = (byte) (i52 & 255);
        bArr2[25] = (byte) ((i52 >>> 8) & 255);
        bArr2[26] = (byte) ((i52 >>> 16) & 255);
        bArr2[27] = (byte) (i52 >> 24);
        bArr2[28] = (byte) (i15 & 255);
        bArr2[29] = (byte) ((i15 >>> 8) & 255);
        bArr2[30] = (byte) ((i15 >>> 16) & 255);
        bArr2[31] = (byte) (i15 >> 24);
        int i53 = j42.f9793j;
        bArr2[32] = (byte) (i53 & 255);
        bArr2[33] = (byte) ((i53 >>> 8) & 255);
        bArr2[34] = (byte) ((i53 >>> 16) & 255);
        bArr2[35] = (byte) (i53 >> 24);
        int i54 = j42.f9846w2;
        bArr2[36] = (byte) (i54 & 255);
        bArr2[37] = (byte) ((i54 >>> 8) & 255);
        bArr2[38] = (byte) ((i54 >>> 16) & 255);
        bArr2[39] = (byte) (i54 >> 24);
        int i55 = j42.f9857z1;
        bArr2[40] = (byte) (i55 & 255);
        bArr2[41] = (byte) ((i55 >>> 8) & 255);
        bArr2[42] = (byte) ((i55 >>> 16) & 255);
        bArr2[43] = (byte) (i55 >> 24);
        int i56 = j42.f9797k;
        bArr2[44] = (byte) (i56 & 255);
        bArr2[45] = (byte) ((i56 >>> 8) & 255);
        bArr2[46] = (byte) ((i56 >>> 16) & 255);
        bArr2[47] = (byte) (i56 >> 24);
        int i57 = j42.f9704G0;
        bArr2[48] = (byte) (i57 & 255);
        bArr2[49] = (byte) ((i57 >>> 8) & 255);
        bArr2[50] = (byte) ((i57 >>> 16) & 255);
        bArr2[51] = (byte) (i57 >> 24);
        int i58 = j42.f9694D1;
        bArr2[52] = (byte) (i58 & 255);
        bArr2[53] = (byte) ((i58 >>> 8) & 255);
        bArr2[54] = (byte) ((i58 >>> 16) & 255);
        bArr2[55] = (byte) (i58 >> 24);
        int i59 = j42.f9754X0;
        bArr2[56] = (byte) (i59 & 255);
        bArr2[57] = (byte) ((i59 >>> 8) & 255);
        bArr2[58] = (byte) ((i59 >>> 16) & 255);
        bArr2[59] = (byte) (i59 >> 24);
        int i60 = j42.f9813o;
        bArr2[60] = (byte) (i60 & 255);
        bArr2[61] = (byte) ((i60 >>> 8) & 255);
        bArr2[62] = (byte) ((i60 >>> 16) & 255);
        bArr2[63] = (byte) (i60 >> 24);
        bArr2[64] = (byte) (i47 & 255);
        bArr2[65] = (byte) ((i47 >>> 8) & 255);
        bArr2[66] = (byte) ((i47 >>> 16) & 255);
        bArr2[67] = (byte) (i47 >> 24);
        int i61 = j42.f9772c1;
        bArr2[68] = (byte) (i61 & 255);
        bArr2[69] = (byte) ((i61 >>> 8) & 255);
        bArr2[70] = (byte) ((i61 >>> 16) & 255);
        bArr2[71] = (byte) (i61 >> 24);
        int i62 = j42.f9818p0;
        bArr2[72] = (byte) (i62 & 255);
        bArr2[73] = (byte) ((i62 >>> 8) & 255);
        bArr2[74] = (byte) ((i62 >>> 16) & 255);
        bArr2[75] = (byte) (i62 >> 24);
        int i63 = j42.f9768b1;
        bArr2[76] = (byte) (i63 & 255);
        bArr2[77] = (byte) ((i63 >>> 8) & 255);
        bArr2[78] = (byte) ((i63 >>> 16) & 255);
        bArr2[79] = (byte) (i63 >> 24);
        int i64 = j42.f9839v;
        bArr2[80] = (byte) (i64 & 255);
        bArr2[81] = (byte) ((i64 >>> 8) & 255);
        bArr2[82] = (byte) ((i64 >>> 16) & 255);
        bArr2[83] = (byte) (i64 >> 24);
        int i65 = j42.f9835u;
        bArr2[84] = (byte) (i65 & 255);
        bArr2[85] = (byte) ((i65 >>> 8) & 255);
        bArr2[86] = (byte) ((i65 >>> 16) & 255);
        bArr2[87] = (byte) (i65 >> 24);
        bArr2[88] = (byte) (i19 & 255);
        bArr2[89] = (byte) ((i19 >>> 8) & 255);
        bArr2[90] = (byte) ((i19 >>> 16) & 255);
        bArr2[91] = (byte) (i19 >> 24);
        int i66 = j42.f9843w;
        bArr2[92] = (byte) (i66 & 255);
        bArr2[93] = (byte) ((i66 >>> 8) & 255);
        bArr2[94] = (byte) ((i66 >>> 16) & 255);
        bArr2[95] = (byte) (i66 >> 24);
        int i67 = j42.f9697E1;
        bArr2[96] = (byte) (i67 & 255);
        bArr2[97] = (byte) ((i67 >>> 8) & 255);
        bArr2[98] = (byte) ((i67 >>> 16) & 255);
        bArr2[99] = (byte) (i67 >> 24);
        int i68 = j42.f9725N1;
        bArr2[100] = (byte) (i68 & 255);
        bArr2[101] = (byte) ((i68 >>> 8) & 255);
        bArr2[102] = (byte) ((i68 >>> 16) & 255);
        bArr2[103] = (byte) (i68 >> 24);
        int i69 = j42.f9700F0;
        bArr2[104] = (byte) (i69 & 255);
        bArr2[105] = (byte) ((i69 >>> 8) & 255);
        bArr2[106] = (byte) ((i69 >>> 16) & 255);
        bArr2[107] = (byte) (i69 >> 24);
        int i70 = j42.f9681A;
        bArr2[108] = (byte) (i70 & 255);
        bArr2[109] = (byte) ((i70 >>> 8) & 255);
        bArr2[110] = (byte) ((i70 >>> 16) & 255);
        bArr2[111] = (byte) (i70 >> 24);
        int i71 = j42.f9692D;
        bArr2[112] = (byte) (i71 & 255);
        bArr2[113] = (byte) ((i71 >>> 8) & 255);
        bArr2[114] = (byte) ((i71 >>> 16) & 255);
        bArr2[115] = (byte) (i71 >> 24);
        int i72 = j42.f9744U;
        bArr2[116] = (byte) (i72 & 255);
        bArr2[117] = (byte) ((i72 >>> 8) & 255);
        bArr2[118] = (byte) ((i72 >>> 16) & 255);
        bArr2[119] = (byte) (i72 >> 24);
        int i73 = j42.f9709H1;
        bArr2[120] = (byte) (i73 & 255);
        bArr2[121] = (byte) ((i73 >>> 8) & 255);
        bArr2[122] = (byte) ((i73 >>> 16) & 255);
        bArr2[123] = (byte) (i73 >> 24);
        int i74 = j42.h1;
        bArr2[124] = (byte) (i74 & 255);
        bArr2[125] = (byte) ((i74 >>> 8) & 255);
        bArr2[126] = (byte) ((i74 >>> 16) & 255);
        bArr2[127] = (byte) (i74 >> 24);
        int i75 = j42.i1;
        bArr2[128] = (byte) (i75 & 255);
        bArr2[129] = (byte) ((i75 >>> 8) & 255);
        bArr2[130] = (byte) ((i75 >>> 16) & 255);
        bArr2[131] = (byte) (i75 >> 24);
        int i76 = j42.f9703G;
        bArr2[132] = (byte) (i76 & 255);
        bArr2[133] = (byte) ((i76 >>> 8) & 255);
        bArr2[134] = (byte) ((i76 >>> 16) & 255);
        bArr2[135] = (byte) (i76 >> 24);
        int i77 = j42.f9742T0;
        bArr2[136] = (byte) (i77 & 255);
        bArr2[137] = (byte) ((i77 >>> 8) & 255);
        bArr2[138] = (byte) ((i77 >>> 16) & 255);
        bArr2[139] = (byte) (i77 >> 24);
        int i78 = j42.f9808m2;
        bArr2[140] = (byte) (i78 & 255);
        bArr2[141] = (byte) ((i78 >>> 8) & 255);
        bArr2[142] = (byte) ((i78 >>> 16) & 255);
        bArr2[143] = (byte) (i78 >> 24);
        int i79 = j42.f9717L;
        bArr2[144] = (byte) (i79 & 255);
        bArr2[145] = (byte) ((i79 >>> 8) & 255);
        bArr2[146] = (byte) ((i79 >>> 16) & 255);
        bArr2[147] = (byte) (i79 >> 24);
        int i80 = j42.f9804l2;
        bArr2[148] = (byte) (i80 & 255);
        bArr2[149] = (byte) ((i80 >>> 8) & 255);
        bArr2[150] = (byte) ((i80 >>> 16) & 255);
        bArr2[151] = (byte) (i80 >> 24);
        int i81 = j42.f9737R1;
        bArr2[152] = (byte) (i81 & 255);
        bArr2[153] = (byte) ((i81 >>> 8) & 255);
        bArr2[154] = (byte) ((i81 >>> 16) & 255);
        bArr2[155] = (byte) (i81 >> 24);
        int i82 = j42.f9753X;
        bArr2[156] = (byte) (i82 & 255);
        bArr2[157] = (byte) ((i82 >>> 8) & 255);
        bArr2[158] = (byte) ((i82 >>> 16) & 255);
        bArr2[159] = (byte) (i82 >> 24);
        int i83 = j42.f9729P;
        bArr2[160] = (byte) (i83 & 255);
        bArr2[161] = (byte) ((i83 >>> 8) & 255);
        bArr2[162] = (byte) ((i83 >>> 16) & 255);
        bArr2[163] = (byte) (i83 >> 24);
        int i84 = j42.i;
        bArr2[164] = (byte) (i84 & 255);
        bArr2[165] = (byte) ((i84 >>> 8) & 255);
        bArr2[166] = (byte) ((i84 >>> 16) & 255);
        bArr2[167] = (byte) (i84 >> 24);
        int i85 = j42.f9779e0;
        bArr2[168] = (byte) (i85 & 255);
        bArr2[169] = (byte) ((i85 >>> 8) & 255);
        bArr2[170] = (byte) ((i85 >>> 16) & 255);
        bArr2[171] = (byte) (i85 >> 24);
        int i86 = j42.f9763a0;
        bArr2[172] = (byte) (i86 & 255);
        bArr2[173] = (byte) ((i86 >>> 8) & 255);
        bArr2[174] = (byte) ((i86 >>> 16) & 255);
        bArr2[175] = (byte) (i86 >> 24);
        int i87 = j42.f9741T;
        bArr2[176] = (byte) (i87 & 255);
        bArr2[177] = (byte) ((i87 >>> 8) & 255);
        bArr2[178] = (byte) ((i87 >>> 16) & 255);
        bArr2[179] = (byte) (i87 >> 24);
        bArr2[180] = (byte) (i5 & 255);
        bArr2[181] = (byte) ((i5 >>> 8) & 255);
        bArr2[182] = (byte) ((i5 >>> 16) & 255);
        bArr2[183] = (byte) (i5 >> 24);
        int i88 = j42.f9747V;
        bArr2[184] = (byte) (i88 & 255);
        bArr2[185] = (byte) ((i88 >>> 8) & 255);
        bArr2[186] = (byte) ((i88 >>> 16) & 255);
        bArr2[187] = (byte) (i88 >> 24);
        int i89 = j42.f9829s0;
        bArr2[188] = (byte) (i89 & 255);
        bArr2[189] = (byte) ((i89 >>> 8) & 255);
        bArr2[190] = (byte) ((i89 >>> 16) & 255);
        bArr2[191] = (byte) (i89 >> 24);
        int i90 = j42.f9801l;
        bArr2[192] = (byte) (i90 & 255);
        bArr2[193] = (byte) ((i90 >>> 8) & 255);
        bArr2[194] = (byte) ((i90 >>> 16) & 255);
        bArr2[195] = (byte) (i90 >> 24);
        int i91 = j42.f9713J0;
        bArr2[196] = (byte) (i91 & 255);
        bArr2[197] = (byte) ((i91 >>> 8) & 255);
        bArr2[198] = (byte) ((i91 >>> 16) & 255);
        bArr2[199] = (byte) (i91 >> 24);
        int i92 = j42.f9759Z;
        bArr2[200] = (byte) (i92 & 255);
        bArr2[201] = (byte) ((i92 >>> 8) & 255);
        bArr2[202] = (byte) ((i92 >>> 16) & 255);
        bArr2[203] = (byte) (i92 >> 24);
        int i93 = j42.f9693D0;
        bArr2[204] = (byte) (i93 & 255);
        bArr2[205] = (byte) ((i93 >>> 8) & 255);
        bArr2[206] = (byte) ((i93 >>> 16) & 255);
        bArr2[207] = (byte) (i93 >> 24);
        bArr2[208] = (byte) (i33 & 255);
        bArr2[209] = (byte) ((i33 >>> 8) & 255);
        bArr2[210] = (byte) ((i33 >>> 16) & 255);
        bArr2[211] = (byte) (i33 >> 24);
        bArr2[212] = (byte) (i9 & 255);
        bArr2[213] = (byte) ((i9 >>> 8) & 255);
        bArr2[214] = (byte) ((i9 >>> 16) & 255);
        bArr2[215] = (byte) (i9 >> 24);
        int i94 = j42.f9775d0;
        bArr2[216] = (byte) (i94 & 255);
        bArr2[217] = (byte) ((i94 >>> 8) & 255);
        bArr2[218] = (byte) ((i94 >>> 16) & 255);
        bArr2[219] = (byte) (i94 >> 24);
        int i95 = j42.f9738S;
        bArr2[220] = (byte) (i95 & 255);
        bArr2[221] = (byte) ((i95 >>> 8) & 255);
        bArr2[222] = (byte) ((i95 >>> 16) & 255);
        bArr2[223] = (byte) (i95 >> 24);
        int i96 = j42.f9783f2;
        bArr2[224] = (byte) (i96 & 255);
        bArr2[225] = (byte) ((i96 >>> 8) & 255);
        bArr2[226] = (byte) ((i96 >>> 16) & 255);
        bArr2[227] = (byte) (i96 >> 24);
        int i97 = j42.f9701F1;
        bArr2[228] = (byte) (i97 & 255);
        bArr2[229] = (byte) ((i97 >>> 8) & 255);
        bArr2[230] = (byte) ((i97 >>> 16) & 255);
        bArr2[231] = (byte) (i97 >> 24);
        int i98 = j42.r1;
        bArr2[232] = (byte) (i98 & 255);
        bArr2[233] = (byte) ((i98 >>> 8) & 255);
        bArr2[234] = (byte) ((i98 >>> 16) & 255);
        bArr2[235] = (byte) (i98 >> 24);
        int i99 = j42.s2;
        bArr2[236] = (byte) (i99 & 255);
        bArr2[237] = (byte) ((i99 >>> 8) & 255);
        bArr2[238] = (byte) ((i99 >>> 16) & 255);
        bArr2[239] = (byte) (i99 >> 24);
        int i100 = j42.f9769b2;
        bArr2[240] = (byte) (i100 & 255);
        bArr2[241] = (byte) ((i100 >>> 8) & 255);
        bArr2[242] = (byte) ((i100 >>> 16) & 255);
        bArr2[243] = (byte) (i100 >> 24);
        int i101 = j42.E0;
        bArr2[244] = (byte) (i101 & 255);
        bArr2[245] = (byte) ((i101 >>> 8) & 255);
        bArr2[246] = (byte) ((i101 >>> 16) & 255);
        bArr2[247] = (byte) (i101 >> 24);
        bArr2[248] = (byte) (i32 & 255);
        bArr2[249] = (byte) ((i32 >>> 8) & 255);
        bArr2[250] = (byte) ((i32 >>> 16) & 255);
        bArr2[251] = (byte) (i32 >> 24);
        int i102 = j42.f9715K0;
        bArr2[252] = (byte) (i102 & 255);
        bArr2[253] = (byte) ((i102 >>> 8) & 255);
        bArr2[254] = (byte) ((i102 >>> 16) & 255);
        bArr2[255] = (byte) (i102 >> 24);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r5v12 ?? I:??[int, boolean, short, byte, char]), method size: 2838
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final void c(byte[] r139, byte[] r140) {
        /*
            Method dump skipped, instructions count: 2838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H4.c(byte[], byte[]):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r2v29 ?? I:??[int, boolean]), method size: 3002
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.E4
    public final void a(byte[] r95, byte[] r96) {
        /*
            Method dump skipped, instructions count: 3002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H4.a(byte[], byte[]):void");
    }
}
