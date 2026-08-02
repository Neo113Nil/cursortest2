package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class isOpenInternal implements com.payair.hce.getAutoMigrationSpecs, com.payair.hce.isUserRecoverableError {
    private static long[] SdkCoreBusinessLogicModuleImpl = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    private static int getCardLayoutDescription = 97;
    private static int getDualTapResetTimeout;
    protected long AlternateContactlessPaymentDataJson;
    protected long DigitizedCardProfile;
    protected long IccPrivateKeyCrtComponentsJson;
    protected long RecordsJson;
    protected long SdkCoreAlternateContactlessPaymentDataImpl;
    private int getAid;
    private long getCiacDecline;
    private int getCvrMaskAnd;
    private long[] getGpoResponse;
    private long getPaymentFci;
    private byte[] getProfileVersion;
    protected long valueOf;
    protected long values;
    protected long writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 319) + (i2 * (-317)) + (((~((~i) | i3)) | i4) * (-318)) + (((~(i4 | i3)) | (~(i5 | i | i2))) * 318) + (((~(i | i4 | i5)) | (~(i2 | i | i3))) * 318);
        int i7 = 128;
        int i8 = 1;
        switch (i6) {
            case 1:
                return valueOf(objArr);
            case 2:
                com.payair.hce.isOpenInternal isopeninternal = (com.payair.hce.isOpenInternal) objArr[0];
                getCardLayoutDescription = (getDualTapResetTimeout + 51) % 128;
                AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal}, 1024869998, -1024869998, java.lang.System.identityHashCode(isopeninternal));
                int i9 = getCardLayoutDescription;
                int i10 = i9 & 79;
                int i11 = ((i9 ^ 79) | i10) << 1;
                int i12 = -((i9 | 79) & (~i10));
                getDualTapResetTimeout = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                int i13 = 16;
                for (int i14 = 79; i13 <= i14; i14 = 79) {
                    int i15 = getDualTapResetTimeout;
                    int i16 = ((i15 ^ 1) | (i15 & 1)) << i8;
                    int i17 = -((i15 & (-2)) | ((~i15) & i8));
                    getCardLayoutDescription = (((i16 | i17) << i8) - (i17 ^ i16)) % i7;
                    long[] jArr = isopeninternal.getGpoResponse;
                    int identityHashCode = java.lang.System.identityHashCode(isopeninternal);
                    int i18 = i13 * (-271);
                    int i19 = ~i13;
                    int i20 = (i19 ^ 1) | (i19 & 1);
                    int i21 = ~identityHashCode;
                    int i22 = i21 & (i21 | identityHashCode);
                    int i23 = i20 & i22;
                    int i24 = (i20 | i22) & (~i23);
                    int i25 = (i24 ^ i23) | (i24 & i23);
                    int i26 = ~i25;
                    int i27 = (i25 | i26) & i26;
                    int i28 = (i13 ^ (-2)) | (i13 & (-2));
                    int i29 = i28 & identityHashCode;
                    int i30 = (i28 | identityHashCode) & (~i29);
                    int i31 = (i30 ^ i29) | (i30 & i29);
                    int i32 = ~i31;
                    int i33 = (i31 | i32) & i32;
                    int i34 = (((((i18 ^ (-546)) | (i18 & (-546))) << i8) - ((i18 & 545) | ((~i18) & (-546)))) - (~(((i27 & i33) | (i27 ^ i33)) * (-272)))) - i8;
                    int i35 = i13 ^ 1;
                    int i36 = i13 & 1;
                    int i37 = ~((i35 ^ i36) | (i35 & i36));
                    int i38 = ~((identityHashCode ^ 1) | (identityHashCode & 1));
                    int i39 = (((~i37) & i38) | ((~i38) & i37) | (i37 & i38)) * (-272);
                    int i40 = i34 | i39;
                    int i41 = ((i40 << 1) - (~(-((~(i39 & i34)) & i40)))) - i8;
                    int i42 = ~(identityHashCode | (-2));
                    int i43 = i13 & i42;
                    int i44 = (i42 | i13) & (~i43);
                    int i45 = ((i44 ^ i43) | (i44 & i43)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE;
                    long longValue = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(jArr[((i41 | i45) << i8) - (i45 ^ i41)])}, 438340949, -438340942, (int) java.lang.System.currentTimeMillis())).longValue();
                    long[] jArr2 = isopeninternal.getGpoResponse;
                    int identityHashCode2 = java.lang.System.identityHashCode(isopeninternal);
                    int i46 = -(~(i13 * (-49)));
                    int i47 = (i46 ^ (-357)) + ((i46 & (-357)) << i8);
                    int i48 = (~i47) + (i47 << i8);
                    int i49 = ~identityHashCode2;
                    int i50 = (i49 & (-7)) | (identityHashCode2 & 6);
                    int i51 = identityHashCode2 & (-7);
                    int i52 = -(-(((i50 ^ i51) | (i50 & i51)) * (-50)));
                    int i53 = i48 & i52;
                    int i54 = -(-(i52 | i48));
                    int i55 = (i53 ^ i54) + ((i53 & i54) << i8);
                    int i56 = (i19 | i13) & i19;
                    int i57 = i56 & 6;
                    int i58 = (~i57) & (i56 | 6);
                    int i59 = (i58 ^ i57) | (i57 & i58);
                    int i60 = ((~i59) & identityHashCode2) | (i59 & i49);
                    int i61 = i59 & identityHashCode2;
                    int i62 = (i60 ^ i61) | (i61 & i60);
                    int i63 = ~i62;
                    int i64 = (i62 | i63) & i63;
                    int i65 = i56 & i49;
                    int i66 = (~i65) & (i56 | i49);
                    int i67 = (i66 ^ i65) | (i66 & i65);
                    int i68 = i67 & (-7);
                    int i69 = (i67 | (-7)) & (~i68);
                    int i70 = ~((i68 ^ i69) | (i69 & i68));
                    int i71 = i64 & i70;
                    int i72 = (((i70 | i64) & (~i71)) | i71) * 50;
                    int i73 = i55 & i72;
                    int i74 = ((i55 ^ i72) | i73) << 1;
                    int i75 = -((i72 | i55) & (~i73));
                    int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                    int i77 = (i56 ^ i49) | i65;
                    int i78 = ~i77;
                    int i79 = (i77 | i78) & i78;
                    int i80 = ~i19;
                    int i81 = (i19 & 6) | (i80 & (-7));
                    int i82 = i19 & (-7);
                    int i83 = ~((i81 & i82) | (i81 ^ i82));
                    int i84 = ((~i79) & i83) | ((~i83) & i79);
                    int i85 = i79 & i83;
                    int i86 = (i85 ^ i84) | (i85 & i84);
                    int i87 = (i49 | identityHashCode2) & i49;
                    int i88 = i87 & (-7);
                    int i89 = ~(((i87 | (-7)) & (~i88)) | i88);
                    int i90 = -(-(((i86 ^ i89) | (i86 & i89)) * 50));
                    int i91 = i76 & i90;
                    long j = jArr2[(((i90 | i76) & (~i91)) - (~(-(-(i91 << 1))))) - 1];
                    long[] jArr3 = isopeninternal.getGpoResponse;
                    int identityHashCode3 = java.lang.System.identityHashCode(isopeninternal);
                    int i92 = 4753 - (~(-(~(-(-(i13 * 319))))));
                    int i93 = i19 & 14;
                    int i94 = ((~i93) & (i19 | 14)) | i93;
                    int i95 = i94 ^ identityHashCode3;
                    int i96 = i94 & identityHashCode3;
                    int i97 = ~identityHashCode3;
                    int i98 = (i97 & (-15)) | (i97 ^ (-15));
                    int i99 = i98 ^ i13;
                    int i100 = i98 & i13;
                    int i101 = -(~(((~((i99 ^ i100) | (i100 & i99))) | (~((i96 & i95) | (i96 ^ i95)))) * (-318)));
                    int i102 = (i92 ^ i101) + ((i101 & i92) << 1);
                    int i103 = (i80 & (-15)) | i93;
                    int i104 = i19 & (-15);
                    int i105 = (i103 ^ i104) | (i104 & i103);
                    int i106 = ~i105;
                    int i107 = (i105 | i106) & i106;
                    int i108 = ~((identityHashCode3 ^ (-15)) | (identityHashCode3 & (-15)));
                    int i109 = ((~i108) & i107) | ((~i107) & i108);
                    int i110 = i107 & i108;
                    int i111 = (((~i102) + (i102 << 1)) - (~(-(-(((i110 ^ i109) | (i110 & i109)) * (-318)))))) - 1;
                    int i112 = ~((identityHashCode3 & 14) | (identityHashCode3 ^ 14));
                    int i113 = i56 & i112;
                    int i114 = (i112 | i56) & (~i113);
                    int i115 = -(-(((i114 ^ i113) | (i114 & i113)) * 318));
                    int i116 = i111 ^ i115;
                    int i117 = (i115 & i111) << 1;
                    long longValue2 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(jArr3[(i116 ^ i117) + ((i117 & i116) << 1)])}, 1322370335, -1322370324, (int) java.lang.System.currentTimeMillis())).longValue();
                    long[] jArr4 = isopeninternal.getGpoResponse;
                    int identityHashCode4 = java.lang.System.identityHashCode(isopeninternal);
                    int i118 = 2543 - (~(i13 * (-159)));
                    int i119 = i13 & (-16);
                    int i120 = (i19 & 15) | i119;
                    int i121 = i13 & 15;
                    int i122 = -(~(-(-(((i120 & i121) | (i120 ^ i121)) * 160))));
                    int i123 = (i118 ^ i122) + ((i118 & i122) << 1);
                    int i124 = (~i123) + (i123 << 1);
                    int i125 = ~identityHashCode4;
                    int i126 = (i125 & (-16)) | (i125 ^ (-16));
                    int i127 = ~i126;
                    int i128 = (i126 | i127) & i127;
                    int i129 = (i19 & (-16)) | i121;
                    int i130 = (i129 ^ i119) | (i129 & i119);
                    int i131 = ~i130;
                    int i132 = (i130 | i131) & i131;
                    int i133 = i128 & i132;
                    int i134 = (i128 | i132) & (~i133);
                    int i135 = -(-(((i134 ^ i133) | (i134 & i133)) * (-160)));
                    int i136 = i124 & i135;
                    int i137 = (i124 ^ i135) | i136;
                    int i138 = (i136 & i137) + (i137 | i136);
                    int i139 = i56 ^ i125;
                    int i140 = i125 & i56;
                    int i141 = ~((i140 ^ i139) | (i140 & i139));
                    int i142 = -(-(((i141 & 15) | ((~i141) & (-16)) | (i141 & (-16))) * 160));
                    int i143 = i138 & i142;
                    int i144 = (i142 | i138) & (~i143);
                    int i145 = i143 << 1;
                    jArr[i13] = longValue + j + longValue2 + jArr4[(i144 & i145) + (i144 | i145)];
                    int i146 = i13 & 70;
                    int i147 = (i13 ^ 70) | i146;
                    int i148 = ((i146 | i147) << 1) - (i146 ^ i147);
                    int i149 = i148 & (-69);
                    int i150 = -(-(i148 | (-69)));
                    i13 = ((i149 | i150) << 1) - (i149 ^ i150);
                    int i151 = getDualTapResetTimeout;
                    int i152 = ((i151 & 44) + (i151 | 44)) - 1;
                    getCardLayoutDescription = i152 % 128;
                    int i153 = i152 % 2;
                    i7 = 128;
                    i8 = 1;
                }
                long j2 = isopeninternal.AlternateContactlessPaymentDataJson;
                long j3 = isopeninternal.values;
                long j4 = isopeninternal.writeReplace;
                long j5 = isopeninternal.valueOf;
                long j6 = isopeninternal.DigitizedCardProfile;
                long j7 = isopeninternal.SdkCoreAlternateContactlessPaymentDataImpl;
                long j8 = isopeninternal.RecordsJson;
                long j9 = isopeninternal.IccPrivateKeyCrtComponentsJson;
                getCardLayoutDescription = (getDualTapResetTimeout + 47) % 128;
                long j10 = j2;
                int i154 = 0;
                int i155 = 0;
                long j11 = j4;
                while (i154 < 10) {
                    int i156 = getCardLayoutDescription;
                    getDualTapResetTimeout = (((i156 ^ 18) + ((i156 & 18) << 1)) - 1) % 128;
                    long j12 = j3;
                    long longValue3 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j6)}, -600066994, 600067002, (int) java.lang.System.currentTimeMillis())).longValue();
                    long longValue4 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j6), java.lang.Long.valueOf(j7), java.lang.Long.valueOf(j8)}, 1762225089, -1762225085, (int) java.lang.System.currentTimeMillis())).longValue();
                    long j13 = SdkCoreBusinessLogicModuleImpl[i155];
                    long[] jArr5 = isopeninternal.getGpoResponse;
                    int i157 = ~(i155 + 2);
                    int i158 = (-2) - i157;
                    long j14 = j9 + longValue3 + longValue4 + j13 + jArr5[i155];
                    long j15 = j5 + j14;
                    int i159 = i154;
                    long j16 = j10;
                    long longValue5 = j14 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j10)}, -1051110007, 1051110021, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j10), java.lang.Long.valueOf(j12), java.lang.Long.valueOf(j11)}, 1541008055, -1541008046, (int) java.lang.System.currentTimeMillis())).longValue();
                    int i160 = (-1) - i157;
                    long longValue6 = j8 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j15)}, -600066994, 600067002, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j15), java.lang.Long.valueOf(j6), java.lang.Long.valueOf(j7)}, 1762225089, -1762225085, (int) java.lang.System.currentTimeMillis())).longValue() + SdkCoreBusinessLogicModuleImpl[i158] + isopeninternal.getGpoResponse[i158];
                    long j17 = j11 + longValue6;
                    com.payair.hce.isOpenInternal isopeninternal2 = isopeninternal;
                    long longValue7 = longValue6 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue5)}, -1051110007, 1051110021, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue5), java.lang.Long.valueOf(j16), java.lang.Long.valueOf(j12)}, 1541008055, -1541008046, (int) java.lang.System.currentTimeMillis())).longValue();
                    int i161 = (i160 ^ (-63)) + ((i160 & (-63)) << 1);
                    int i162 = ((i161 | 64) << 1) - (i161 ^ 64);
                    long longValue8 = j7 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j17)}, -600066994, 600067002, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j15), java.lang.Long.valueOf(j6)}, 1762225089, -1762225085, (int) java.lang.System.currentTimeMillis())).longValue() + SdkCoreBusinessLogicModuleImpl[i160] + isopeninternal2.getGpoResponse[i160];
                    long j18 = j12 + longValue8;
                    long longValue9 = longValue8 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue7)}, -1051110007, 1051110021, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue7), java.lang.Long.valueOf(longValue5), java.lang.Long.valueOf(j16)}, 1541008055, -1541008046, (int) java.lang.System.currentTimeMillis())).longValue();
                    int i163 = i162 ^ 1;
                    int i164 = (i163 | (i162 & 1)) << 1;
                    int i165 = -i163;
                    int i166 = (i164 & i165) + (i164 | i165);
                    long longValue10 = j6 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j18)}, -600066994, 600067002, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j15)}, 1762225089, -1762225085, (int) java.lang.System.currentTimeMillis())).longValue() + SdkCoreBusinessLogicModuleImpl[i162] + isopeninternal2.getGpoResponse[i162];
                    long j19 = j16 + longValue10;
                    long longValue11 = longValue10 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue9)}, -1051110007, 1051110021, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue9), java.lang.Long.valueOf(longValue7), java.lang.Long.valueOf(longValue5)}, 1541008055, -1541008046, (int) java.lang.System.currentTimeMillis())).longValue();
                    long longValue12 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j19)}, -600066994, 600067002, (int) java.lang.System.currentTimeMillis())).longValue();
                    long longValue13 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17)}, 1762225089, -1762225085, (int) java.lang.System.currentTimeMillis())).longValue();
                    long j20 = SdkCoreBusinessLogicModuleImpl[i166];
                    long[] jArr6 = isopeninternal2.getGpoResponse;
                    int i167 = 31 - (~((i166 ^ (-31)) + ((i166 & (-31)) << 1)));
                    long j21 = j15 + longValue12 + longValue13 + j20 + jArr6[i166];
                    j9 = longValue5 + j21;
                    j5 = j21 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue11)}, -1051110007, 1051110021, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue11), java.lang.Long.valueOf(longValue9), java.lang.Long.valueOf(longValue7)}, 1541008055, -1541008046, (int) java.lang.System.currentTimeMillis())).longValue();
                    long longValue14 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j9)}, -600066994, 600067002, (int) java.lang.System.currentTimeMillis())).longValue();
                    long longValue15 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j9), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j18)}, 1762225089, -1762225085, (int) java.lang.System.currentTimeMillis())).longValue();
                    long j22 = SdkCoreBusinessLogicModuleImpl[i167];
                    long[] jArr7 = isopeninternal2.getGpoResponse;
                    int i168 = (((i167 ^ 1) | (i167 & 1)) << 1) - (((~i167) & 1) | (i167 & (-2)));
                    long j23 = j17 + longValue14 + longValue15 + j22 + jArr7[i167];
                    j8 = longValue7 + j23;
                    j11 = j23 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j5)}, -1051110007, 1051110021, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j5), java.lang.Long.valueOf(longValue11), java.lang.Long.valueOf(longValue9)}, 1541008055, -1541008046, (int) java.lang.System.currentTimeMillis())).longValue();
                    long longValue16 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j8)}, -600066994, 600067002, (int) java.lang.System.currentTimeMillis())).longValue();
                    long longValue17 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j8), java.lang.Long.valueOf(j9), java.lang.Long.valueOf(j19)}, 1762225089, -1762225085, (int) java.lang.System.currentTimeMillis())).longValue();
                    int i169 = ((i168 | (-66)) << 1) - (i168 ^ (-66));
                    int i170 = i169 + 67;
                    long j24 = j18 + longValue16 + longValue17 + SdkCoreBusinessLogicModuleImpl[i168] + isopeninternal2.getGpoResponse[i168];
                    j7 = longValue9 + j24;
                    long longValue18 = ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j11)}, -1051110007, 1051110021, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j11), java.lang.Long.valueOf(j5), java.lang.Long.valueOf(longValue11)}, 1541008055, -1541008046, (int) java.lang.System.currentTimeMillis())).longValue() + j24;
                    long longValue19 = j19 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j7)}, -600066994, 600067002, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j7), java.lang.Long.valueOf(j8), java.lang.Long.valueOf(j9)}, 1762225089, -1762225085, (int) java.lang.System.currentTimeMillis())).longValue() + SdkCoreBusinessLogicModuleImpl[i170] + isopeninternal2.getGpoResponse[i170];
                    long j25 = longValue11 + longValue19;
                    j10 = longValue19 + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue18)}, -1051110007, 1051110021, (int) java.lang.System.currentTimeMillis())).longValue() + ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(longValue18), java.lang.Long.valueOf(j11), java.lang.Long.valueOf(j5)}, 1541008055, -1541008046, (int) java.lang.System.currentTimeMillis())).longValue();
                    int i171 = i159 & 53;
                    int i172 = (i171 - (~(-(-((i159 ^ 53) | i171))))) - 1;
                    int i173 = ((i172 ^ (-52)) | (i172 & (-52))) << 1;
                    int i174 = -((i172 & 51) | ((~i172) & (-52)));
                    i154 = (i173 ^ i174) + ((i174 & i173) << 1);
                    getDualTapResetTimeout = (getCardLayoutDescription + 81) % 128;
                    i155 = i169 + 68;
                    isopeninternal = isopeninternal2;
                    j6 = j25;
                    j3 = longValue18;
                }
                com.payair.hce.isOpenInternal isopeninternal3 = isopeninternal;
                isopeninternal3.AlternateContactlessPaymentDataJson += j10;
                isopeninternal3.values += j3;
                isopeninternal3.writeReplace += j11;
                isopeninternal3.valueOf += j5;
                isopeninternal3.DigitizedCardProfile += j6;
                isopeninternal3.SdkCoreAlternateContactlessPaymentDataImpl += j7;
                isopeninternal3.RecordsJson += j8;
                isopeninternal3.IccPrivateKeyCrtComponentsJson += j9;
                isopeninternal3.getCvrMaskAnd = 0;
                int i175 = getDualTapResetTimeout;
                int i176 = i175 & 37;
                int i177 = i176 + ((i175 ^ 37) | i176);
                getCardLayoutDescription = i177 % 128;
                if (i177 % 2 == 0) {
                    int i178 = 2 / 4;
                }
                int i179 = 0;
                while (i179 < 16) {
                    int i180 = getDualTapResetTimeout + 49;
                    getCardLayoutDescription = i180 % 128;
                    if (i180 % 2 == 0) {
                        isopeninternal3.getGpoResponse[i179] = 1;
                        int i181 = i179 - 76;
                        i179 = (-2) - (~((i181 & 78) + (i181 | 78)));
                    } else {
                        isopeninternal3.getGpoResponse[i179] = 0;
                        int i182 = (i179 & (-2)) | ((~i179) & 1);
                        int i183 = (i179 & 1) << 1;
                        i179 = (i182 ^ i183) + ((i182 & i183) << 1);
                    }
                }
                int i184 = getCardLayoutDescription;
                getDualTapResetTimeout = ((-2) - (~((i184 & 72) + (i184 | 72)))) % 128;
                return null;
            case 3:
                int i185 = getDualTapResetTimeout;
                int i186 = ((i185 ^ 39) | (i185 & 39)) << 1;
                int i187 = -((i185 & (-40)) | ((~i185) & 39));
                int i188 = ((i186 | i187) << 1) - (i186 ^ i187);
                getCardLayoutDescription = i188 % 128;
                int i189 = i188 % 2 == 0 ? 62 : 128;
                getCardLayoutDescription = ((i185 & 23) + (i185 | 23)) % 128;
                return java.lang.Integer.valueOf(i189);
            case 4:
                return writeReplace(objArr);
            case 5:
                com.payair.hce.isOpenInternal isopeninternal4 = (com.payair.hce.isOpenInternal) objArr[0];
                byte byteValue = ((java.lang.Byte) objArr[1]).byteValue();
                int i190 = getDualTapResetTimeout;
                int i191 = i190 ^ 59;
                int i192 = -(-((i190 & 59) << 1));
                getCardLayoutDescription = ((i191 ^ i192) + ((i192 & i191) << 1)) % 128;
                byte[] bArr = isopeninternal4.getProfileVersion;
                int i193 = isopeninternal4.getAid;
                int identityHashCode5 = java.lang.System.identityHashCode(isopeninternal4);
                int i194 = ~identityHashCode5;
                int i195 = i194 & 1;
                int i196 = (i194 | 1) & (~i195);
                int i197 = ~((i196 & i195) | (i196 ^ i195));
                int i198 = ~i193;
                int i199 = (i198 & 1) | (i193 & (-2));
                int i200 = i193 & 1;
                int i201 = ~((i199 & i200) | (i199 ^ i200));
                int i202 = i197 ^ i201;
                int i203 = i197 & i201;
                int i204 = (1587 - (~(i193 * 530))) + (((i203 ^ i202) | (i203 & i202)) * 529);
                int i205 = (i198 | i193) & i198;
                int i206 = ~((identityHashCode5 & 1) | i195 | (identityHashCode5 & (-2)));
                int i207 = -(-(((i206 & (~i205)) | ((~i206) & i205) | (i205 & i206)) * 529));
                int i208 = ((i204 | i207) << 1) - (i207 ^ i204);
                isopeninternal4.getAid = i208;
                bArr[i193] = byteValue;
                byte[] bArr2 = isopeninternal4.getProfileVersion;
                if (i208 == bArr2.length) {
                    int i209 = getDualTapResetTimeout;
                    int i210 = i209 & 5;
                    int i211 = (i210 - (~(-(-((i209 ^ 5) | i210))))) - 1;
                    getCardLayoutDescription = i211 % 128;
                    if (i211 % 2 == 0) {
                        AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal4, bArr2, 1}, -1590976425, 1590976438, 1);
                    } else {
                        AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal4, bArr2, 0}, -1590976425, 1590976438, 0);
                    }
                    isopeninternal4.getAid = 0;
                    int i212 = getDualTapResetTimeout;
                    int i213 = i212 & 109;
                    int i214 = (i212 ^ 109) | i213;
                    getCardLayoutDescription = ((i213 ^ i214) + ((i214 & i213) << 1)) % 128;
                }
                isopeninternal4.getCiacDecline++;
                int i215 = getCardLayoutDescription;
                getDualTapResetTimeout = (((i215 | 75) << 1) - (i215 ^ 75)) % 128;
                return null;
            case 6:
                com.payair.hce.isOpenInternal isopeninternal5 = (com.payair.hce.isOpenInternal) objArr[0];
                com.payair.hce.isOpenInternal isopeninternal6 = (com.payair.hce.isOpenInternal) objArr[1];
                getDualTapResetTimeout = (getCardLayoutDescription + 41) % 128;
                byte[] bArr3 = isopeninternal6.getProfileVersion;
                java.lang.System.arraycopy(bArr3, 0, isopeninternal5.getProfileVersion, 0, bArr3.length);
                isopeninternal5.getAid = isopeninternal6.getAid;
                isopeninternal5.getCiacDecline = isopeninternal6.getCiacDecline;
                isopeninternal5.getPaymentFci = isopeninternal6.getPaymentFci;
                isopeninternal5.AlternateContactlessPaymentDataJson = isopeninternal6.AlternateContactlessPaymentDataJson;
                isopeninternal5.values = isopeninternal6.values;
                isopeninternal5.writeReplace = isopeninternal6.writeReplace;
                isopeninternal5.valueOf = isopeninternal6.valueOf;
                isopeninternal5.DigitizedCardProfile = isopeninternal6.DigitizedCardProfile;
                isopeninternal5.SdkCoreAlternateContactlessPaymentDataImpl = isopeninternal6.SdkCoreAlternateContactlessPaymentDataImpl;
                isopeninternal5.RecordsJson = isopeninternal6.RecordsJson;
                isopeninternal5.IccPrivateKeyCrtComponentsJson = isopeninternal6.IccPrivateKeyCrtComponentsJson;
                long[] jArr8 = isopeninternal6.getGpoResponse;
                java.lang.System.arraycopy(jArr8, 0, isopeninternal5.getGpoResponse, 0, jArr8.length);
                isopeninternal5.getCvrMaskAnd = isopeninternal6.getCvrMaskAnd;
                getDualTapResetTimeout = (getCardLayoutDescription + 35) % 128;
                return null;
            case 7:
                return values(objArr);
            case 8:
                long longValue20 = ((java.lang.Number) objArr[0]).longValue();
                int i216 = getDualTapResetTimeout;
                int i217 = ((((i216 ^ 87) | (i216 & 87)) << 1) - (~(-((i216 & (-88)) | ((~i216) & 87))))) - 1;
                getCardLayoutDescription = i217 % 128;
                return java.lang.Long.valueOf(i217 % 2 == 0 ? ((longValue20 << 122) ^ (longValue20 << 60)) ^ (((longValue20 >>> 45) % (longValue20 >>> 24)) % ((longValue20 >> 5) * (longValue20 >> 114))) : (((longValue20 >>> 14) | (longValue20 << 50)) ^ ((longValue20 >>> 18) | (longValue20 << 46))) ^ ((longValue20 >>> 41) | (longValue20 << 23)));
            case 9:
                long longValue21 = ((java.lang.Number) objArr[0]).longValue();
                long longValue22 = ((java.lang.Number) objArr[1]).longValue();
                long longValue23 = ((java.lang.Number) objArr[2]).longValue();
                int i218 = getDualTapResetTimeout;
                int i219 = ((i218 & (-76)) | ((~i218) & 75)) + ((i218 & 75) << 1);
                int i220 = i219 % 128;
                getCardLayoutDescription = i220;
                long j26 = i219 % 2 == 0 ? ((longValue21 % longValue22) / (longValue21 % longValue23)) + (longValue22 & longValue23) : ((longValue21 & longValue23) ^ (longValue21 & longValue22)) ^ (longValue22 & longValue23);
                getDualTapResetTimeout = (((i220 & (-124)) | ((~i220) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) + ((i220 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
                return java.lang.Long.valueOf(j26);
            case 10:
                return DigitizedCardProfile(objArr);
            case 11:
                long longValue24 = ((java.lang.Number) objArr[0]).longValue();
                int i221 = getCardLayoutDescription;
                int i222 = i221 & 43;
                int i223 = ((i221 ^ 43) | i222) << 1;
                int i224 = -((i221 | 43) & (~i222));
                int i225 = ((i223 & i224) + (i224 | i223)) % 128;
                getDualTapResetTimeout = i225;
                getCardLayoutDescription = (((i225 | 55) << 1) - (i225 ^ 55)) % 128;
                return java.lang.Long.valueOf((((longValue24 >>> 8) | (longValue24 << 56)) ^ ((longValue24 << 63) | (longValue24 >>> 1))) ^ (longValue24 >>> 7));
            case 12:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 13:
                return getAid(objArr);
            case 14:
                return IccPrivateKeyCrtComponentsJson(objArr);
            default:
                return AlternateContactlessPaymentDataJson(objArr);
        }
    }

    protected isOpenInternal() {
        this.getProfileVersion = new byte[8];
        this.getGpoResponse = new long[80];
        this.getAid = 0;
        valueOf();
    }

    protected isOpenInternal(com.payair.hce.isOpenInternal isopeninternal) {
        this.getProfileVersion = new byte[8];
        this.getGpoResponse = new long[80];
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, isopeninternal}, 994738970, -994738964, java.lang.System.identityHashCode(this));
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.isOpenInternal isopeninternal = (com.payair.hce.isOpenInternal) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = 2;
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int intValue2 = ((java.lang.Number) objArr[3]).intValue();
        int i2 = getCardLayoutDescription;
        int i3 = i2 & 33;
        int i4 = (i2 ^ 33) | i3;
        getDualTapResetTimeout = ((i3 & i4) + (i4 | i3)) % 128;
        int i5 = ~((intValue ^ 2144467309) | (intValue & 2144467309));
        int i6 = i5 ^ (-330770539);
        int i7 = i5 & (-330770539);
        int i8 = (((i7 ^ i6) | (i7 & i6)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 960214705;
        int i9 = i8 & (-413410848);
        int i10 = -(-((i8 ^ (-413410848)) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        int i12 = ~intValue;
        int i13 = ~((2144467309 ^ i12) | (i12 & 2144467309));
        int i14 = i13 & 1816187141;
        int i15 = (i13 | 1816187141) & (~i14);
        int i16 = (i15 ^ i14) | (i15 & i14);
        int i17 = (2146957679 & i16) | ((~i16) & (-2146957680));
        int i18 = i16 & (-2146957680);
        int i19 = -(~(((i18 ^ i17) | (i18 & i17)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
        int i20 = i12 & 1206488371;
        int i21 = (~i20) & (i12 | 1206488371);
        int i22 = -(-(((i21 ^ i20) | (i20 & i21)) * 495));
        int i23 = (i22 & 708213166) + (i22 | 708213166);
        int i24 = ~i12;
        int i25 = (1206488371 & i24) | ((-1206488372) & i12);
        int i26 = ~((i25 ^ i20) | (i20 & i25));
        int i27 = ((i26 ^ 115936288) | (i26 & 115936288)) * 495;
        if ((-2) - (~((i11 & i19) + (i19 | i11))) <= ((i23 | i27) << 1) - (i27 ^ i23)) {
            int i28 = 5 / 3;
        }
        int i29 = intValue;
        while (isopeninternal.getAid != 0) {
            int i30 = getCardLayoutDescription;
            int i31 = i30 & 35;
            int i32 = -(-((i30 ^ 35) | i31));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            getDualTapResetTimeout = i33 % 128;
            if (i33 % 2 != 0) {
                throw null;
            }
            if (intValue2 <= 0) {
                break;
            }
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal, java.lang.Byte.valueOf(bArr[i29])}, -574689542, 574689547, java.lang.System.identityHashCode(isopeninternal));
            int i34 = i29 & 9;
            int i35 = (i29 ^ 9) | i34;
            i29 = ((i34 & i35) + (i35 | i34)) - 8;
            int i36 = ~intValue2;
            int i37 = intValue2 << 1;
            intValue2 = (i37 ^ i36) + ((i37 & i36) << 1);
            int i38 = getDualTapResetTimeout;
            int i39 = i38 ^ 17;
            int i40 = (i38 & 17) << 1;
            getCardLayoutDescription = (((i39 | i40) << 1) - (i40 ^ i39)) % 128;
        }
        while (intValue2 > isopeninternal.getProfileVersion.length) {
            int i41 = getDualTapResetTimeout;
            getCardLayoutDescription = (((i41 ^ 2) + ((i41 & i) << 1)) - 1) % 128;
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal, bArr, java.lang.Integer.valueOf(i29)}, -1590976425, 1590976438, i29);
            byte[] bArr2 = isopeninternal.getProfileVersion;
            int length = bArr2.length;
            int i42 = length * (-919);
            int i43 = -(-(i29 * (-919)));
            int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
            int i45 = ~length;
            int i46 = (i45 | length) & i45;
            int i47 = ~i29;
            int i48 = i46 & i47;
            int i49 = i46 | i47;
            int i50 = ((~i48) & i49) | i48;
            int i51 = ((~i50) & intValue) | (i50 & i12);
            int i52 = i50 & intValue;
            int i53 = ~((i52 & i51) | (i52 ^ i51));
            int i54 = (i47 ^ i12) | (i47 & i12);
            int i55 = i54 ^ length;
            int i56 = i54 & length;
            int i57 = ~((i55 ^ i56) | (i55 & i56));
            int i58 = -(-(((i53 ^ i57) | (i53 & i57)) * 920));
            int i59 = i44 & i58;
            int i60 = (i59 - (~(-(-((i58 ^ i44) | i59))))) - 1;
            int i61 = ~((i46 ^ i47) | i48);
            int i62 = (i24 & i45) | ((~i45) & i12);
            int i63 = i45 & i12;
            int i64 = (i62 & i63) | (i62 ^ i63);
            int i65 = ~i64;
            int i66 = (i64 | i65) & i65;
            int i67 = i61 & i66;
            int i68 = (((i61 | i66) & (~i67)) | i67) * 920;
            int i69 = ((i60 ^ i68) | (i60 & i68)) << 1;
            int i70 = -(((~i68) & i60) | ((~i60) & i68));
            int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
            int i72 = ~((i49 & i12) | (i49 ^ i12));
            int i73 = (i29 & i45) | (i45 ^ i29);
            int i74 = ~((i73 ^ intValue) | (i73 & intValue));
            int i75 = (i74 ^ i72) | (i72 & i74);
            int i76 = (i47 & length) | (i47 ^ length);
            int i77 = i76 ^ intValue;
            int i78 = i76 & intValue;
            int i79 = ~((i78 ^ i77) | (i78 & i77));
            int i80 = i75 ^ i79;
            int i81 = i79 & i75;
            int i82 = -(-(((i81 ^ i80) | (i81 & i80)) * 920));
            int i83 = ((i71 ^ i82) | (i71 & i82)) << 1;
            int i84 = -(((~i82) & i71) | ((~i71) & i82));
            i29 = (i83 & i84) + (i84 | i83);
            int i85 = -bArr2.length;
            intValue2 = (intValue2 & i85) + (i85 | intValue2);
            isopeninternal.getCiacDecline += bArr2.length;
            int i86 = getCardLayoutDescription;
            int i87 = i86 & 41;
            getDualTapResetTimeout = (i87 + ((i86 ^ 41) | i87)) % 128;
            i = 2;
        }
        while (intValue2 > 0) {
            int i88 = getDualTapResetTimeout + 114;
            getCardLayoutDescription = ((~i88) + (i88 << 1)) % 128;
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal, java.lang.Byte.valueOf(bArr[i29])}, -574689542, 574689547, java.lang.System.identityHashCode(isopeninternal));
            i29 = (i29 & 1) + (i29 | 1);
            intValue2 = (~intValue2) + (intValue2 << 1);
            int i89 = getCardLayoutDescription;
            getDualTapResetTimeout = ((((i89 | 66) << 1) - (i89 ^ 66)) - 1) % 128;
        }
        getCardLayoutDescription = (getDualTapResetTimeout + 119) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        long j;
        long j2;
        com.payair.hce.isOpenInternal isopeninternal = (com.payair.hce.isOpenInternal) objArr[0];
        int i = getDualTapResetTimeout;
        int i2 = i ^ 51;
        int i3 = ((i & 51) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        getCardLayoutDescription = i5 % 128;
        if (i5 % 2 == 0) {
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal}, 1024869998, -1024869998, java.lang.System.identityHashCode(isopeninternal));
            j = isopeninternal.getCiacDecline << 3;
            j2 = isopeninternal.getPaymentFci;
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal, java.lang.Byte.valueOf(com.google.common.base.Ascii.US)}, -574689542, 574689547, java.lang.System.identityHashCode(isopeninternal));
        } else {
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal}, 1024869998, -1024869998, java.lang.System.identityHashCode(isopeninternal));
            j = isopeninternal.getCiacDecline << 3;
            j2 = isopeninternal.getPaymentFci;
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal, Byte.MIN_VALUE}, -574689542, 574689547, java.lang.System.identityHashCode(isopeninternal));
        }
        while (isopeninternal.getAid != 0) {
            int i6 = getCardLayoutDescription;
            int i7 = i6 & 121;
            getDualTapResetTimeout = ((((i6 ^ 121) | i7) << 1) - ((i6 | 121) & (~i7))) % 128;
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal, (byte) 0}, -574689542, 574689547, java.lang.System.identityHashCode(isopeninternal));
            int i8 = getCardLayoutDescription;
            int i9 = i8 & 119;
            getDualTapResetTimeout = (i9 + ((i8 ^ 119) | i9)) % 128;
        }
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)}, -1378102209, 1378102219, java.lang.System.identityHashCode(isopeninternal));
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal}, -1202221799, 1202221801, java.lang.System.identityHashCode(isopeninternal));
        int i10 = getCardLayoutDescription;
        int i11 = i10 & 75;
        int i12 = -(-(i10 | 75));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        getDualTapResetTimeout = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getTransactionExecutor
    public void valueOf() {
        int i = getCardLayoutDescription;
        int i2 = i & 55;
        int i3 = ((i ^ 55) | i2) << 1;
        int i4 = -((i | 55) & (~i2));
        int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        getDualTapResetTimeout = i5;
        this.getCiacDecline = 0L;
        this.getPaymentFci = 0L;
        int i6 = 0;
        this.getAid = 0;
        int i7 = i5 & 101;
        getCardLayoutDescription = ((i7 - (~((i5 ^ 101) | i7))) - 1) % 128;
        int i8 = 0;
        while (true) {
            byte[] bArr = this.getProfileVersion;
            if (i8 >= bArr.length) {
                break;
            }
            int i9 = getCardLayoutDescription;
            int i10 = i9 & 45;
            int i11 = (i9 ^ 45) | i10;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            getDualTapResetTimeout = i12 % 128;
            if (i12 % 2 != 0) {
                bArr[i8] = 0;
                int i13 = i8 & (-92);
                int i14 = (i13 - (~(-(-((i8 ^ (-92)) | i13))))) - 1;
                int i15 = (i14 & (-93)) | ((~i14) & 92);
                int i16 = (i14 & 92) << 1;
                i8 = ((i15 & i16) << 1) + (i15 ^ i16);
            } else {
                bArr[i8] = 0;
                int i17 = i8 & 1;
                i8 = ((i8 ^ 1) | i17) + i17;
            }
        }
        this.getCvrMaskAnd = 0;
        int i18 = getCardLayoutDescription + 62;
        getDualTapResetTimeout = ((~i18) + (i18 << 1)) % 128;
        while (true) {
            long[] jArr = this.getGpoResponse;
            if (i6 == jArr.length) {
                break;
            }
            int i19 = getDualTapResetTimeout;
            int i20 = (((i19 | 115) << 1) - (i19 ^ 115)) % 128;
            getCardLayoutDescription = i20;
            jArr[i6] = 0;
            int i21 = i6 & 88;
            i6 = (-2) - (~((i21 - (~(-(-((i6 ^ 88) | i21))))) - 87));
            getDualTapResetTimeout = (i20 + 67) % 128;
        }
        int i22 = getDualTapResetTimeout;
        int i23 = ((i22 ^ 103) | (i22 & 103)) << 1;
        int i24 = -((i22 & (-104)) | ((~i22) & 103));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        getCardLayoutDescription = i25 % 128;
        if (i25 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.isOpenInternal isopeninternal = (com.payair.hce.isOpenInternal) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int i = getCardLayoutDescription;
        getDualTapResetTimeout = (((i | 9) << 1) - (i ^ 9)) % 128;
        isopeninternal.getGpoResponse[isopeninternal.getCvrMaskAnd] = ((java.lang.Long) com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{bArr, java.lang.Integer.valueOf(intValue)}, -2006018601, 2006018603, intValue)).longValue();
        int i2 = isopeninternal.getCvrMaskAnd;
        int i3 = -(-(i2 * 965));
        int i4 = i3 | (-1927);
        int i5 = ~i2;
        int i6 = (i2 | i5) & i5;
        int i7 = i6 & intValue;
        int i8 = ((i6 | intValue) & (~i7)) | i7;
        int i9 = ~i8;
        int i10 = (i8 | i9) & i9;
        int i11 = ((~i10) & (-2)) | (i10 & 1);
        int i12 = i10 & (-2);
        int i13 = ~intValue;
        int i14 = ~((i13 ^ i5) | (i13 & i5));
        int i15 = (i5 & (-2)) | ((~i5) & 1);
        int i16 = i5 & 1;
        int i17 = ~((i16 ^ i15) | (i15 & i16));
        int i18 = ((((i4 << 1) - ((~(i3 & (-1927))) & i4)) - (~(((i12 ^ i11) | (i12 & i11)) * (-964)))) - 1) + (((i14 ^ i17) | (i14 & i17)) * (-964));
        isopeninternal.getCvrMaskAnd = i18;
        if (i18 == 16) {
            int i19 = getCardLayoutDescription;
            int i20 = i19 | 49;
            int i21 = i20 << 1;
            int i22 = -((~(i19 & 49)) & i20);
            getDualTapResetTimeout = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal}, -1202221799, 1202221801, java.lang.System.identityHashCode(isopeninternal));
            int i23 = getDualTapResetTimeout;
            int i24 = i23 & 55;
            int i25 = (((i23 ^ 55) | i24) << 1) - ((i23 | 55) & (~i24));
            getCardLayoutDescription = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = getCardLayoutDescription + 49;
        getDualTapResetTimeout = i27 % 128;
        if (i27 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        long j;
        com.payair.hce.isOpenInternal isopeninternal = (com.payair.hce.isOpenInternal) objArr[0];
        int i = getCardLayoutDescription + 27;
        int i2 = i % 128;
        getDualTapResetTimeout = i2;
        if (i % 2 == 0) {
            long j2 = isopeninternal.getCiacDecline;
            if (j2 > 2305843009213693951L) {
                int i3 = (i2 & 79) + (i2 | 79);
                getCardLayoutDescription = i3 % 128;
                if (i3 % 2 == 0) {
                    isopeninternal.getPaymentFci += j2 >> 108;
                    j = j2 / 2305843009213693951L;
                } else {
                    isopeninternal.getPaymentFci += j2 >>> 61;
                    j = j2 & 2305843009213693951L;
                }
                isopeninternal.getCiacDecline = j;
            }
            int i4 = i2 & 79;
            int i5 = (~i4) & (i2 | 79);
            int i6 = i4 << 1;
            getCardLayoutDescription = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            return null;
        }
        long j3 = isopeninternal.getCiacDecline;
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.isOpenInternal isopeninternal = (com.payair.hce.isOpenInternal) objArr[0];
        long longValue = ((java.lang.Number) objArr[1]).longValue();
        long longValue2 = ((java.lang.Number) objArr[2]).longValue();
        int i = getDualTapResetTimeout;
        int i2 = i & 57;
        getCardLayoutDescription = (i2 + ((i ^ 57) | i2)) % 128;
        if (isopeninternal.getCvrMaskAnd > 14) {
            int i3 = ((i | 15) << 1) - (i ^ 15);
            getCardLayoutDescription = i3 % 128;
            if (i3 % 2 != 0) {
                AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal}, -1202221799, 1202221801, java.lang.System.identityHashCode(isopeninternal));
                int i4 = getDualTapResetTimeout;
                int i5 = (i4 & (-126)) | ((~i4) & 125);
                int i6 = -(-((i4 & 125) << 1));
                getCardLayoutDescription = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            } else {
                AlternateContactlessPaymentDataJson(new java.lang.Object[]{isopeninternal}, -1202221799, 1202221801, java.lang.System.identityHashCode(isopeninternal));
                throw new java.lang.ArithmeticException();
            }
        }
        long[] jArr = isopeninternal.getGpoResponse;
        jArr[14] = longValue2;
        jArr[15] = longValue;
        int i7 = getDualTapResetTimeout;
        int i8 = i7 | 5;
        getCardLayoutDescription = ((i8 << 1) - ((~(i7 & 5)) & i8)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        long longValue2 = ((java.lang.Number) objArr[1]).longValue();
        long longValue3 = ((java.lang.Number) objArr[2]).longValue();
        int i = getDualTapResetTimeout;
        int i2 = (i & (-60)) | ((~i) & 59);
        int i3 = (i & 59) << 1;
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        getCardLayoutDescription = i4 % 128;
        long j = i4 % 2 == 0 ? (longValue2 + longValue) * ((longValue / (-1)) - longValue3) : (longValue2 & longValue) ^ ((~longValue) & longValue3);
        int i5 = i & 89;
        int i6 = ((i ^ 89) | i5) << 1;
        int i7 = -((i | 89) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        getCardLayoutDescription = i8 % 128;
        if (i8 % 2 != 0) {
            return java.lang.Long.valueOf(j);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i = getCardLayoutDescription;
        int i2 = (((i ^ 117) - (~((i & 117) << 1))) - 1) % 128;
        getDualTapResetTimeout = i2;
        int i3 = i2 + 101;
        getCardLayoutDescription = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        return java.lang.Long.valueOf((((longValue >>> 34) | (longValue << 30)) ^ ((longValue << 36) | (longValue >>> 28))) ^ ((longValue >>> 39) | (longValue << 25)));
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i = getDualTapResetTimeout;
        int i2 = (i & (-8)) | ((~i) & 7);
        int i3 = (i & 7) << 1;
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getCardLayoutDescription = i4;
        int i5 = i4 & 41;
        int i6 = (i4 ^ 41) | i5;
        int i7 = (i5 & i6) + (i5 | i6);
        getDualTapResetTimeout = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        return java.lang.Long.valueOf((((longValue >>> 61) | (longValue << 3)) ^ ((longValue << 45) | (longValue >>> 19))) ^ (longValue >>> 6));
    }

    static {
        int i = 97 % 2;
    }

    private static long values(long j) {
        return ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j)}, 438340949, -438340942, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    private static long AlternateContactlessPaymentDataJson(long j) {
        return ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j)}, 1322370335, -1322370324, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    private static long DigitizedCardProfile(long j) {
        return ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -600066994, 600067002, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    private static long writeReplace(long j) {
        return ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -1051110007, 1051110021, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    private static long values(long j, long j2, long j3) {
        return ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)}, 1541008055, -1541008046, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    private static long DigitizedCardProfile(long j, long j2, long j3) {
        return ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)}, 1762225089, -1762225085, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    private void IccPrivateKeyCrtComponentsJson() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1202221799, 1202221801, java.lang.System.identityHashCode(this));
    }

    private void valueOf(long j, long j2) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)}, -1378102209, 1378102219, java.lang.System.identityHashCode(this));
    }

    private void getAid() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1024869998, -1024869998, java.lang.System.identityHashCode(this));
    }

    private void values(byte[] bArr, int i) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i)}, -1590976425, 1590976438, i);
    }

    @Override // com.payair.hce.getAutoMigrationSpecs
    public final int DigitizedCardProfile() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 538571059, -538571056, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void writeReplace() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -337615946, 337615947, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final void DigitizedCardProfile(byte[] bArr, int i, int i2) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, -823832901, 823832913, i);
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final void DigitizedCardProfile(byte b) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Byte.valueOf(b)}, -574689542, 574689547, java.lang.System.identityHashCode(this));
    }

    protected final void writeReplace(com.payair.hce.isOpenInternal isopeninternal) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, isopeninternal}, 994738970, -994738964, java.lang.System.identityHashCode(this));
    }
}
