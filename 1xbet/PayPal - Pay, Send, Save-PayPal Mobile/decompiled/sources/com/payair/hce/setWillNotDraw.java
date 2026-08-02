package com.payair.hce;

/* loaded from: classes4.dex */
public class setWillNotDraw {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static java.lang.Object SdkCoreCardRiskManagementDataImpl;
    private static long SdkCoreContactlessPaymentDataImpl;
    private static int buildRecords;
    private static byte[] getAdditionalCheckTable;
    public static final java.util.Map getCardLayoutDescription;
    private static java.lang.Object getCardholderValidators;
    private static long getCdol1RelatedDataLength;
    private static long getCrmCountryCode;
    private static byte[] getMagstripeCvmIssuerOptions;
    public static final java.util.Map getMchipCvmIssuerOptions;

    /* JADX WARN: Can't wrap try/catch for region: R(37:7|8|(1:10)(1:887)|11|(2:12|13)|(31:15|(2:874|875)|(29:870|871|(29:20|21|(1:23)(1:867)|24|(25:862|863|27|(1:29)(1:(1:852)(3:853|854|855))|(5:31|32|33|35|36)|(4:52|53|54|55)|63|64|65|66|67|(1:69)(1:848)|70|(2:72|(11:74|75|76|(1:78)(1:845)|79|(1:81)(1:844)|82|83|(7:85|(2:87|(2:835|836))(2:837|(2:839|840))|89|(30:91|92|93|(6:(2:96|(2:98|99)(3:108|109|110))|111|112|113|114|116)|(12:679|680|681|682|683|684|685|686|687|(16:(2:690|(1:692)(1:810))(2:811|(1:813)(1:(1:815)(1:816)))|693|694|695|696|697|698|699|700|(2:(6:703|(1:705)(3:711|712|713)|706|707|708|709)(2:719|720)|710)|721|722|(2:790|791)(1:(3:780|781|782)(13:(3:768|769|770)(9:726|727|729|730|731|732|733|734|735)|828|717|718|678|647|648|(1:(3:650|651|(3:654|655|(2:657|658)(1:661))(1:653))(1:674))|662|663|664|665|666))|771|772|735)|817|818)(1:124)|125|126|127|128|129|130|131|132|133|134|136|137|138|139|140|141|142|143|144|145|146|147|148|149|(24:150|151|(3:153|154|155)|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|(5:574|575|576|577|578)(9:187|188|189|190|191|192|193|194|195)|196|(29:418|419|(1:421)(1:559)|(1:423)(1:558)|424|425|426|427|(2:429|(2:431|432)(3:440|441|442))|443|444|(3:446|447|(2:449|450)(1:451))|510|452|453|454|455|456|457|458|459|460|461|462|463|464|465|466|(2:468|(4:470|471|472|473)(3:480|481|482)))(36:198|199|200|201|202|203|204|205|206|207|(2:208|(2:210|(4:212|213|214|(3:216|217|218)(1:219))(4:405|(1:407)|217|218))(1:408))|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|236|237|238|239|(3:241|242|243)|259|260|261|(1:263)|264)|(14:346|347|348|349|350|351|352|353|354|355|356|357|(1:359)|360)(4:266|267|268|269)|(22:271|272|273|274|275|276|277|278|279|281|282|283|284|285|286|287|288|289|290|291|292|293)(1:330)))(1:834)|659|660|336)|841|842))|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842)|26|27|(0)(0)|(0)|(4:52|53|54|55)|63|64|65|66|67|(0)(0)|70|(0)|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842)|869|(0)|26|27|(0)(0)|(0)|(0)|63|64|65|66|67|(0)(0)|70|(0)|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842)|18|(0)|869|(0)|26|27|(0)(0)|(0)|(0)|63|64|65|66|67|(0)(0)|70|(0)|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842)|881|882|(0)|18|(0)|869|(0)|26|27|(0)(0)|(0)|(0)|63|64|65|66|67|(0)(0)|70|(0)|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842) */
    /* JADX WARN: Can't wrap try/catch for region: R(39:6|7|8|(1:10)(1:887)|11|12|13|(31:15|(2:874|875)|(29:870|871|(29:20|21|(1:23)(1:867)|24|(25:862|863|27|(1:29)(1:(1:852)(3:853|854|855))|(5:31|32|33|35|36)|(4:52|53|54|55)|63|64|65|66|67|(1:69)(1:848)|70|(2:72|(11:74|75|76|(1:78)(1:845)|79|(1:81)(1:844)|82|83|(7:85|(2:87|(2:835|836))(2:837|(2:839|840))|89|(30:91|92|93|(6:(2:96|(2:98|99)(3:108|109|110))|111|112|113|114|116)|(12:679|680|681|682|683|684|685|686|687|(16:(2:690|(1:692)(1:810))(2:811|(1:813)(1:(1:815)(1:816)))|693|694|695|696|697|698|699|700|(2:(6:703|(1:705)(3:711|712|713)|706|707|708|709)(2:719|720)|710)|721|722|(2:790|791)(1:(3:780|781|782)(13:(3:768|769|770)(9:726|727|729|730|731|732|733|734|735)|828|717|718|678|647|648|(1:(3:650|651|(3:654|655|(2:657|658)(1:661))(1:653))(1:674))|662|663|664|665|666))|771|772|735)|817|818)(1:124)|125|126|127|128|129|130|131|132|133|134|136|137|138|139|140|141|142|143|144|145|146|147|148|149|(24:150|151|(3:153|154|155)|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|(5:574|575|576|577|578)(9:187|188|189|190|191|192|193|194|195)|196|(29:418|419|(1:421)(1:559)|(1:423)(1:558)|424|425|426|427|(2:429|(2:431|432)(3:440|441|442))|443|444|(3:446|447|(2:449|450)(1:451))|510|452|453|454|455|456|457|458|459|460|461|462|463|464|465|466|(2:468|(4:470|471|472|473)(3:480|481|482)))(36:198|199|200|201|202|203|204|205|206|207|(2:208|(2:210|(4:212|213|214|(3:216|217|218)(1:219))(4:405|(1:407)|217|218))(1:408))|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|236|237|238|239|(3:241|242|243)|259|260|261|(1:263)|264)|(14:346|347|348|349|350|351|352|353|354|355|356|357|(1:359)|360)(4:266|267|268|269)|(22:271|272|273|274|275|276|277|278|279|281|282|283|284|285|286|287|288|289|290|291|292|293)(1:330)))(1:834)|659|660|336)|841|842))|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842)|26|27|(0)(0)|(0)|(4:52|53|54|55)|63|64|65|66|67|(0)(0)|70|(0)|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842)|869|(0)|26|27|(0)(0)|(0)|(0)|63|64|65|66|67|(0)(0)|70|(0)|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842)|18|(0)|869|(0)|26|27|(0)(0)|(0)|(0)|63|64|65|66|67|(0)(0)|70|(0)|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842)|881|882|(0)|18|(0)|869|(0)|26|27|(0)(0)|(0)|(0)|63|64|65|66|67|(0)(0)|70|(0)|847|75|76|(0)(0)|79|(0)(0)|82|83|(0)|841|842) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x051e, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r5, (byte) (-com.payair.hce.setWillNotDraw.$$a[223(0xdf, float:3.12E-43)]), r6[327(0x147, float:4.58E-43)])).getMethod($$c(873, r6[19], r6[246(0xf6, float:3.45E-43)]), r9).invoke(r15, r9)).booleanValue() != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x1aac, code lost:
    
        r1 = r43.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
        com.payair.hce.setWillNotDraw.SdkCoreCardRiskManagementDataImpl = r1.newInstance(r2, java.lang.Boolean.valueOf(!r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x1ada, code lost:
    
        r39.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x1add, code lost:
    
        com.payair.hce.setWillNotDraw.$11 = (com.payair.hce.setWillNotDraw.$10 + 33) % 128;
        r7 = r37;
        r3 = null;
        r4 = 970;
        r8 = false;
        r10 = true;
        r26 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x1c5f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x04b3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x033d A[Catch: Exception -> 0x1e28, TRY_ENTER, TRY_LEAVE, TryCatch #58 {Exception -> 0x1e28, blocks: (B:8:0x01d8, B:10:0x01ec, B:31:0x033d, B:40:0x03a0, B:42:0x03a6, B:44:0x03a7, B:46:0x03a9, B:48:0x03b0, B:49:0x03b1, B:53:0x03be, B:59:0x0406, B:61:0x040c, B:62:0x040d, B:63:0x040e, B:66:0x044a, B:76:0x049d, B:79:0x04a6, B:82:0x04af, B:89:0x04cf, B:647:0x1c84, B:651:0x1cdb, B:658:0x1d7d, B:336:0x1dff, B:653:0x1d89, B:662:0x1d8e, B:670:0x1ddb, B:672:0x1de1, B:673:0x1de2, B:853:0x02fd, B:858:0x1e1f, B:860:0x1e26, B:861:0x1e27, B:33:0x034c, B:665:0x1daa, B:666:0x1dd8, B:55:0x03d0, B:855:0x031a, B:36:0x037c), top: B:7:0x01d8, inners: #7, #32, #65, #91, #94 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x1cce  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x1d8e A[EDGE_INSN: B:674:0x1d8e->B:662:0x1d8e BREAK  A[LOOP:6: B:649:0x1ccc->B:653:0x1d89, LOOP_LABEL: LOOP:0: B:84:0x04b6->B:336:0x1dff], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:851:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:870:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v110, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v11, types: [long] */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v23 */
    /* JADX WARN: Type inference failed for: r29v24 */
    /* JADX WARN: Type inference failed for: r29v27 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v30 */
    /* JADX WARN: Type inference failed for: r29v31 */
    /* JADX WARN: Type inference failed for: r29v32 */
    /* JADX WARN: Type inference failed for: r29v33 */
    /* JADX WARN: Type inference failed for: r29v34 */
    /* JADX WARN: Type inference failed for: r29v35 */
    /* JADX WARN: Type inference failed for: r29v36 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r2v150, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v151, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r2v157, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v258, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v217, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v176, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v112, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v226, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v112, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v130, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v181 */
    /* JADX WARN: Type inference failed for: r7v209, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r7v225, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v227, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v230 */
    /* JADX WARN: Type inference failed for: r7v232, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v241 */
    /* JADX WARN: Type inference failed for: r7v244 */
    /* JADX WARN: Type inference failed for: r7v252 */
    /* JADX WARN: Type inference failed for: r7v263 */
    /* JADX WARN: Type inference failed for: r7v297 */
    /* JADX WARN: Type inference failed for: r7v298 */
    /* JADX WARN: Type inference failed for: r7v299 */
    /* JADX WARN: Type inference failed for: r7v300 */
    /* JADX WARN: Type inference failed for: r7v83, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v96, types: [int] */
    /* JADX WARN: Type inference failed for: r7v98, types: [java.lang.Object[]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        java.lang.Object obj;
        java.lang.Object invoke;
        java.lang.Object obj2;
        java.lang.Object invoke2;
        boolean z;
        boolean z2;
        java.lang.Class<byte[]> cls;
        ?? r29;
        boolean[] zArr;
        boolean[] zArr2;
        java.lang.String str;
        java.lang.Class<?>[] clsArr;
        boolean z3;
        java.lang.Object[] objArr;
        boolean z4;
        int i;
        char c;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        java.lang.Object obj3;
        int i3;
        boolean z8;
        java.lang.Object obj4;
        boolean z9;
        java.lang.Object obj5;
        java.util.Random random;
        boolean[] zArr3;
        boolean[] zArr4;
        boolean[] zArr5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        java.lang.Object obj14;
        int i4;
        java.lang.String obj15;
        int i5;
        int i6;
        boolean z10;
        java.lang.Throwable th;
        java.util.zip.ZipFile zipFile;
        java.util.zip.ZipFile zipFile2;
        long j;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        java.lang.Object newInstance;
        java.lang.Object invoke3;
        java.lang.Class cls2;
        java.util.zip.ZipFile zipFile3;
        java.lang.Exception exc;
        int i15;
        java.lang.reflect.Method method;
        int i16;
        boolean z11;
        java.lang.Class<byte[]> cls3 = byte[].class;
        init$0();
        try {
            boolean z12 = true;
            byte[] bArr = $$a;
            java.lang.Class<?> cls4 = java.lang.Class.forName($$c((short) 1161, bArr[36], bArr[289]));
            byte b = bArr[1067];
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i17 = b * (-1187);
            int i18 = (i17 ^ 595) + ((i17 & 595) << 1);
            int i19 = ~((b ^ (-2)) | (b & (-2)));
            int i20 = ~currentTimeMillis;
            int i21 = ~((i20 ^ b) | (i20 & b));
            int i22 = ((i21 & i19) | (i19 ^ i21)) * (-1188);
            int i23 = (i18 ^ i22) + ((i18 & i22) << 1);
            int i24 = ~b;
            int i25 = ~((currentTimeMillis & i24) | (i24 ^ currentTimeMillis));
            int i26 = (i25 & i19) | (i19 ^ i25);
            int i27 = ~(i20 | 1);
            int i28 = -(-(((i26 & i27) | (i26 ^ i27)) * 594));
            int i29 = ((i23 | i28) << 1) - (i28 ^ i23);
            int i30 = ~(i24 | i20);
            int i31 = ~((i24 & 1) | (i24 ^ 1));
            int i32 = ((i31 ^ i30) | (i30 & i31) | (~((i20 ^ 1) | (i20 & 1)))) * 594;
            java.lang.reflect.Method method2 = cls4.getMethod($$c((short) 1140, (byte) ((i29 ^ i32) + ((i32 & i29) << 1)), bArr[134]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            java.lang.Class<?>[] clsArr2 = null;
            int intValue = ((java.lang.Integer) method2.invoke(null, 95, 101, 193)).intValue();
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i33 = ~currentTimeMillis2;
            int i34 = ~((i33 ^ 1330530716) | (1330530716 & i33));
            int i35 = (((i34 ^ 807510016) | (807510016 & i34)) * 529) - 1473514704;
            int i36 = -(-(((~((currentTimeMillis2 ^ 1330530716) | (1330530716 & currentTimeMillis2))) | 1965400460) * 529));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            int i38 = (1310329143 ^ intValue) | (1310329143 & intValue);
            int i39 = (i38 ^ 1459078579) | (1459078579 & i38);
            int i40 = i39 * (-676);
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i41 = ~i37;
            int i42 = ~((i41 ^ i40) | (i41 & i40));
            int i43 = ~((currentTimeMillis3 & i37) | (i37 ^ currentTimeMillis3));
            int i44 = ((((i39 * 264316) + (i37 * (-195))) - (~(-(-(((i42 & i43) | (i42 ^ i43)) * (-196)))))) - 1) + ((i37 | i40) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY);
            int i45 = ~i40;
            int i46 = ~((i45 ^ i41) | (i45 & i41));
            int i47 = ((i46 ^ i43) | (i46 & i43)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE;
            int i48 = ~intValue;
            int i49 = ~(1310329143 | i48);
            int i50 = (((i44 | i47) << 1) - (i44 ^ i47)) + ((((-1593822648) & i49) | ((-1593822648) ^ i49)) * 676);
            int i51 = (~((1459078579 & i48) | (1459078579 ^ i48))) | 134744068;
            int i52 = ~((intValue ^ (-283493505)) | ((-283493505) & intValue));
            int i53 = (i52 ^ i51) | (i52 & i51);
            int i54 = i53 * 676;
            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
            int i55 = i53 * 326508;
            int i56 = i50 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
            int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
            int i58 = ~i54;
            int i59 = ~i50;
            int i60 = ~((i59 & i58) | (i58 ^ i59));
            int i61 = ~currentTimeMillis4;
            int i62 = (i58 ^ i61) | (i61 & i58);
            int i63 = ~i62;
            int i64 = ((i63 ^ i60) | (i60 & i63)) * (-241);
            int i65 = (((i57 ^ i64) + ((i64 & i57) << 1)) - (~(-(-(((i54 ^ i50) | (i54 & i50)) * (-482)))))) - 1;
            int i66 = ~((i54 ^ i59) | (i54 & i59));
            int i67 = ~((i62 ^ i50) | (i62 & i50));
            int i68 = -(-(((i67 ^ i66) | (i67 & i66)) * 241));
            if (((i65 | i68) << 1) - (i68 ^ i65) != 0) {
                getCdol1RelatedDataLength = 8623852877026357651L;
                buildRecords = 3;
                getCardLayoutDescription = new java.util.HashMap();
                getMchipCvmIssuerOptions = new java.util.HashMap();
                try {
                    java.lang.String $$c = $$c((short) 1138, bArr[19], bArr[9]);
                    java.lang.String $$c2 = SdkCoreCardRiskManagementDataImpl == null ? $$c((short) 1100, bArr[19], bArr[48]) : null;
                    try {
                        obj = java.lang.Class.forName($$c((short) 1087, bArr[36], (byte) (-bArr[27]))).getMethod($$c((short) 1062, bArr[19], (byte) (-bArr[98])), new java.lang.Class[0]).invoke(null, null);
                    } catch (java.lang.Exception unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int i69 = $10 + 17;
                        $11 = i69 % 128;
                        if (i69 % 2 == 0) {
                            try {
                                throw null;
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                        if (obj != null) {
                            try {
                                invoke = obj.getClass().getMethod($$c((short) 1004, (byte) 70, $$a[56]), null).invoke(obj, null);
                            } catch (java.lang.Exception unused3) {
                            }
                            if (obj != null) {
                                int i70 = $11 + 51;
                                $10 = i70 % 128;
                                try {
                                    obj2 = (i70 % 2 != 0 ? obj.getClass().getMethod($$c((short) 30355, (byte) 57, $$a[3]), null) : obj.getClass().getMethod($$c((short) 994, (byte) 70, $$a[2]), null)).invoke(obj, null);
                                } catch (java.lang.Exception unused4) {
                                }
                                if (obj != null) {
                                    try {
                                        invoke2 = obj.getClass().getMethod($$c((short) 980, (byte) 70, $$a[56]), null).invoke(obj, null);
                                    } catch (java.lang.Exception unused5) {
                                    }
                                    char c2 = 970;
                                    short s = 960;
                                    if (invoke != null) {
                                        int i71 = $11;
                                        $10 = (((i71 | 5) << 1) - (i71 ^ 5)) % 128;
                                    } else if ($$c2 == null) {
                                        invoke = null;
                                    } else {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        byte[] bArr2 = $$a;
                                        sb.append($$c((short) 970, bArr2[13], bArr2[56]));
                                        sb.append($$c2);
                                        try {
                                            invoke = java.lang.Class.forName($$c((short) 960, (byte) (-bArr2[223]), bArr2[327])).getDeclaredConstructor(java.lang.String.class).newInstance(sb.toString());
                                        } catch (java.lang.Throwable th2) {
                                            java.lang.Throwable cause = th2.getCause();
                                            if (cause == null) {
                                                throw th2;
                                            }
                                            throw cause;
                                        }
                                    }
                                    if (invoke2 == null) {
                                        byte[] bArr3 = $$a;
                                        try {
                                            try {
                                                invoke2 = java.lang.Class.forName($$c((short) 960, (byte) (-bArr3[223]), bArr3[327])).getDeclaredConstructor(java.lang.String.class).newInstance(java.lang.Class.forName($$c((short) 936, (byte) (-bArr3[223]), bArr3[961])).getMethod($$c((short) 921, (byte) 70, bArr3[56]), java.lang.String.class).invoke(null, $$c((short) 949, (byte) (-bArr3[223]), bArr3[48])));
                                            } catch (java.lang.Throwable th3) {
                                                java.lang.Throwable cause2 = th3.getCause();
                                                if (cause2 == null) {
                                                    throw th3;
                                                }
                                                throw cause2;
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            java.lang.Throwable cause3 = th4.getCause();
                                            if (cause3 == null) {
                                                throw th4;
                                            }
                                            throw cause3;
                                        }
                                    }
                                    if (obj2 == null && invoke != null) {
                                        $11 = ($10 + 75) % 128;
                                        byte[] bArr4 = $$a;
                                        try {
                                            obj2 = java.lang.Class.forName($$c((short) 960, (byte) (-bArr4[223]), bArr4[327])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 960, (byte) (-bArr4[223]), bArr4[327])), java.lang.String.class).newInstance(invoke, $$c((short) 911, bArr4[19], bArr4[177]));
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause4 = th5.getCause();
                                            if (cause4 == null) {
                                                throw th5;
                                            }
                                            throw cause4;
                                        }
                                    }
                                    java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName($$c((short) 960, (byte) (-$$a[223]), r10[327])), 7);
                                    objArr2[0] = null;
                                    objArr2[1] = obj2;
                                    objArr2[2] = invoke;
                                    objArr2[3] = invoke2;
                                    objArr2[4] = obj2;
                                    objArr2[5] = invoke;
                                    objArr2[6] = invoke2;
                                    boolean[] zArr6 = {false, true, true, true, true, true, true};
                                    boolean[] zArr7 = {false, false, false, false, true, true, true};
                                    boolean[] zArr8 = {false, false, true, true, false, true, true};
                                    java.lang.Class<?> cls5 = java.lang.Class.forName($$c((short) 902, r10[36], r10[63]));
                                    i16 = cls5.getDeclaredField($$c((short) 879, r10[872], r10[97])).getInt(cls5);
                                    if (i16 >= 34) {
                                        int i72 = $10;
                                        $11 = ((i72 & 103) + (i72 | 103)) % 128;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i16 >= 26) {
                                        int i73 = $10;
                                        int i74 = ((i73 | 57) << 1) - (i73 ^ 57);
                                        $11 = i74 % 128;
                                        if (i74 % 2 != 0) {
                                            z11 = true;
                                            zArr8[0] = z11;
                                            zArr8[1] = i16 < 21;
                                            zArr8[4] = i16 < 21;
                                            z2 = false;
                                            int i75 = 0;
                                            loop0: while (!z2) {
                                                int i76 = $11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                                int i77 = i76 % 128;
                                                $10 = i77;
                                                if (i76 % 2 != 0) {
                                                    if (i75 >= 37) {
                                                        return;
                                                    }
                                                } else if (i75 >= 9) {
                                                    return;
                                                }
                                                if (zArr8[i75]) {
                                                    try {
                                                        z8 = zArr6[i75];
                                                        obj4 = objArr2[i75];
                                                        z9 = zArr7[i75];
                                                        if (z8) {
                                                            if (obj4 != null) {
                                                                int i78 = ((i77 | 9) << 1) - (i77 ^ 9);
                                                                $11 = i78 % 128;
                                                                if (i78 % 2 == 0) {
                                                                    throw new java.lang.ArithmeticException();
                                                                }
                                                                try {
                                                                } catch (java.lang.Throwable th6) {
                                                                    java.lang.Throwable cause5 = th6.getCause();
                                                                    if (cause5 == null) {
                                                                        throw th6;
                                                                    }
                                                                    throw cause5;
                                                                }
                                                            }
                                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                            byte[] bArr5 = $$a;
                                                            byte b2 = bArr5[726];
                                                            sb2.append($$c((short) 866, b2, b2));
                                                            sb2.append(obj4);
                                                            sb2.append($$c((short) 862, bArr5[25], bArr5[143]));
                                                            try {
                                                                throw ((java.lang.Throwable) java.lang.Class.forName($$c((short) 862, (byte) (-bArr5[223]), bArr5[970])).getDeclaredConstructor(java.lang.String.class).newInstance(sb2.toString()));
                                                            } catch (java.lang.Throwable th7) {
                                                                java.lang.Throwable cause6 = th7.getCause();
                                                                if (cause6 == null) {
                                                                    throw th7;
                                                                }
                                                                throw cause6;
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th8) {
                                                        th = th8;
                                                        cls = cls3;
                                                        r29 = zArr6;
                                                        zArr = zArr7;
                                                        zArr2 = zArr8;
                                                        str = $$c;
                                                        z3 = z2;
                                                        objArr = objArr2;
                                                        z4 = z;
                                                        i2 = i75;
                                                        obj3 = th;
                                                        z7 = r29;
                                                        int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                                                        i = i2;
                                                        int i79 = (-712) - (~(-(-(i * 713))));
                                                        int i80 = ~i;
                                                        int i81 = ~((i80 ^ 1) | (i80 & 1));
                                                        int i82 = ~currentTimeMillis5;
                                                        int i83 = ~((i82 & 1) | (i82 ^ 1));
                                                        int i84 = -(-(((i81 ^ i83) | (i81 & i83)) * (-712)));
                                                        int i85 = (i82 ^ i80) | (i80 & i82);
                                                        i3 = (((i79 | i84) << 1) - (i79 ^ i84)) + (((~(currentTimeMillis5 | (i ^ 1) | (i & 1))) | (~((i85 & 1) | (i85 ^ 1)))) * (-712)) + (((i80 & i83) | (i80 ^ i83)) * 712);
                                                        while (true) {
                                                            if (i3 >= 7) {
                                                            }
                                                            i3++;
                                                        }
                                                        byte[] bArr6 = $$a;
                                                        java.lang.String $$c3 = $$c((short) (-bArr6[195]), bArr6[726], bArr6[207]);
                                                        $11 = ($10 + 5) % 128;
                                                        try {
                                                            throw ((java.lang.Throwable) java.lang.Class.forName($$c((short) 862, (byte) (-bArr6[223]), bArr6[970])).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance($$c3, obj3));
                                                        } catch (java.lang.Throwable th9) {
                                                            java.lang.Throwable cause7 = th9.getCause();
                                                            if (cause7 == null) {
                                                                throw th9;
                                                            }
                                                            throw cause7;
                                                        }
                                                    }
                                                    if (z8) {
                                                        try {
                                                            random = new java.util.Random();
                                                            int i86 = $10;
                                                            $11 = ((i86 ^ 45) + ((i86 & 45) << 1)) % 128;
                                                            try {
                                                                r29 = ((java.lang.Long) java.lang.Class.forName($$c((short) 936, (byte) (-$$a[223]), r7[961])).getMethod($$c((short) 844, r7[19], r7[450]), null).invoke(null, null)).longValue();
                                                                zArr3 = zArr6;
                                                                zArr4 = zArr7;
                                                                try {
                                                                    random.setSeed(r29 ^ 927139623);
                                                                    obj6 = null;
                                                                    obj7 = null;
                                                                    obj8 = null;
                                                                    obj9 = null;
                                                                } catch (java.lang.Throwable th10) {
                                                                    th = th10;
                                                                    zArr2 = zArr8;
                                                                    zArr5 = zArr3;
                                                                }
                                                            } catch (java.lang.Throwable th11) {
                                                                java.lang.Throwable cause8 = th11.getCause();
                                                                if (cause8 == null) {
                                                                    throw th11;
                                                                }
                                                                throw cause8;
                                                            }
                                                        } catch (java.lang.Throwable th12) {
                                                            th = th12;
                                                            r29 = zArr6;
                                                            zArr = zArr7;
                                                            zArr2 = zArr8;
                                                            str = $$c;
                                                            z3 = z2;
                                                            objArr = objArr2;
                                                        }
                                                        while (obj6 == null) {
                                                            if (obj7 == null) {
                                                                int i87 = $11;
                                                                obj14 = obj6;
                                                                int i88 = (i87 ^ 93) + ((i87 & 93) << 1);
                                                                boolean[] zArr9 = zArr3;
                                                                $10 = i88 % 128;
                                                                if (i88 % 2 != 0) {
                                                                    i4 = 57;
                                                                    r29 = zArr9;
                                                                } else {
                                                                    i4 = 6;
                                                                    r29 = zArr9;
                                                                }
                                                            } else {
                                                                obj14 = obj6;
                                                                boolean[] zArr10 = zArr3;
                                                                if (obj8 == null) {
                                                                    i4 = 5;
                                                                    r29 = zArr10;
                                                                } else if (obj9 == null) {
                                                                    i4 = 4;
                                                                    r29 = zArr10;
                                                                } else {
                                                                    i4 = 3;
                                                                    r29 = zArr10;
                                                                }
                                                            }
                                                            try {
                                                                zArr = zArr4;
                                                                str = $$c;
                                                                try {
                                                                    int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                                                                    int i89 = i4 * 131;
                                                                    z3 = z2;
                                                                    int i90 = (i89 & (-129)) + (i89 | (-129));
                                                                    int i91 = ~i4;
                                                                    objArr = objArr2;
                                                                    int i92 = ~currentTimeMillis6;
                                                                    int i93 = -(-((~((i91 ^ i92) | (i92 & i91) | 1)) * 130));
                                                                    int i94 = (i90 ^ i93) + ((i90 & i93) << 1);
                                                                    int i95 = (i91 & 1) | (i91 ^ 1);
                                                                    int i96 = (~i95) * (-260);
                                                                    int i97 = ~((i4 ^ (-2)) | (i4 & (-2)));
                                                                    int i98 = ~(currentTimeMillis6 | i95);
                                                                    try {
                                                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder((i94 & i96) + (i94 | i96) + (((i98 & i97) | (i97 ^ i98)) * 130));
                                                                        sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                                                                        int i99 = 0;
                                                                        while (i99 < i4) {
                                                                            if (z9) {
                                                                                int nextInt = random.nextInt(26);
                                                                                if (random.nextBoolean()) {
                                                                                    int i100 = -(-nextInt);
                                                                                    $10 = ($11 + 23) % 128;
                                                                                    i6 = ((i100 | 65) << 1) - (i100 ^ 65);
                                                                                    i5 = i4;
                                                                                    zArr2 = zArr8;
                                                                                } else {
                                                                                    try {
                                                                                        int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                                                                                        int i101 = (nextInt * (-380)) + 36672;
                                                                                        int i102 = (currentTimeMillis7 ^ 96) | (currentTimeMillis7 & 96);
                                                                                        i5 = i4;
                                                                                        int i103 = ~nextInt;
                                                                                        i2 = i102 ^ i103;
                                                                                        zArr2 = zArr8;
                                                                                        int i104 = -(-((i2 | (i102 & i103)) * (-381)));
                                                                                        int i105 = (i101 & i104) + (i104 | i101);
                                                                                        int i106 = ~((i103 ^ (-97)) | (i103 & (-97)));
                                                                                        int i107 = ~currentTimeMillis7;
                                                                                        int i108 = ~((i107 ^ 96) | (i107 & 96));
                                                                                        int i109 = (i106 ^ i108) | (i106 & i108);
                                                                                        int i110 = ~((nextInt ^ 96) | (nextInt & 96));
                                                                                        int i111 = ((i109 ^ i110) | (i109 & i110)) * 381;
                                                                                        int i112 = (i105 ^ i111) + ((i105 & i111) << 1);
                                                                                        int i113 = (~((i103 & 96) | (i103 ^ 96))) * 381;
                                                                                        i6 = ((i113 & i112) << 1) + (i113 ^ i112);
                                                                                    } catch (java.lang.Throwable th13) {
                                                                                        th = th13;
                                                                                        zArr2 = zArr8;
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    sb3.append((char) i6);
                                                                                } catch (java.lang.Throwable th14) {
                                                                                    th = th14;
                                                                                }
                                                                            } else {
                                                                                i5 = i4;
                                                                                zArr2 = zArr8;
                                                                                int nextInt2 = random.nextInt(12);
                                                                                sb3.append((char) ((nextInt2 & 8192) + (nextInt2 | 8192)));
                                                                            }
                                                                            i99++;
                                                                            i4 = i5;
                                                                            zArr8 = zArr2;
                                                                        }
                                                                        zArr2 = zArr8;
                                                                        obj15 = sb3.toString();
                                                                    } catch (java.lang.Throwable th15) {
                                                                        th = th15;
                                                                        zArr2 = zArr8;
                                                                    }
                                                                } catch (java.lang.Throwable th16) {
                                                                    th = th16;
                                                                    zArr2 = zArr8;
                                                                    r29 = r29;
                                                                    z3 = z2;
                                                                    objArr = objArr2;
                                                                    obj5 = th;
                                                                    cls = cls3;
                                                                    z4 = z;
                                                                    i2 = i75;
                                                                    z10 = r29;
                                                                    obj3 = obj5;
                                                                    z7 = z10;
                                                                    int currentTimeMillis52 = (int) java.lang.System.currentTimeMillis();
                                                                    i = i2;
                                                                    int i792 = (-712) - (~(-(-(i * 713))));
                                                                    int i802 = ~i;
                                                                    int i812 = ~((i802 ^ 1) | (i802 & 1));
                                                                    int i822 = ~currentTimeMillis52;
                                                                    int i832 = ~((i822 & 1) | (i822 ^ 1));
                                                                    int i842 = -(-(((i812 ^ i832) | (i812 & i832)) * (-712)));
                                                                    int i852 = (i822 ^ i802) | (i802 & i822);
                                                                    i3 = (((i792 | i842) << 1) - (i792 ^ i842)) + (((~(currentTimeMillis52 | (i ^ 1) | (i & 1))) | (~((i852 & 1) | (i852 ^ 1)))) * (-712)) + (((i802 & i832) | (i802 ^ i832)) * 712);
                                                                    while (true) {
                                                                        if (i3 >= 7) {
                                                                        }
                                                                        i3++;
                                                                    }
                                                                    byte[] bArr62 = $$a;
                                                                    java.lang.String $$c32 = $$c((short) (-bArr62[195]), bArr62[726], bArr62[207]);
                                                                    $11 = ($10 + 5) % 128;
                                                                    throw ((java.lang.Throwable) java.lang.Class.forName($$c((short) 862, (byte) (-bArr62[223]), bArr62[970])).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance($$c32, obj3));
                                                                }
                                                            } catch (java.lang.Throwable th17) {
                                                                th = th17;
                                                                zArr2 = zArr8;
                                                                zArr5 = r29;
                                                                zArr = zArr4;
                                                                str = $$c;
                                                                r29 = zArr5;
                                                                z3 = z2;
                                                                objArr = objArr2;
                                                                obj5 = th;
                                                                cls = cls3;
                                                                z4 = z;
                                                                i2 = i75;
                                                                z10 = r29;
                                                                obj3 = obj5;
                                                                z7 = z10;
                                                                int currentTimeMillis522 = (int) java.lang.System.currentTimeMillis();
                                                                i = i2;
                                                                int i7922 = (-712) - (~(-(-(i * 713))));
                                                                int i8022 = ~i;
                                                                int i8122 = ~((i8022 ^ 1) | (i8022 & 1));
                                                                int i8222 = ~currentTimeMillis522;
                                                                int i8322 = ~((i8222 & 1) | (i8222 ^ 1));
                                                                int i8422 = -(-(((i8122 ^ i8322) | (i8122 & i8322)) * (-712)));
                                                                int i8522 = (i8222 ^ i8022) | (i8022 & i8222);
                                                                i3 = (((i7922 | i8422) << 1) - (i7922 ^ i8422)) + (((~(currentTimeMillis522 | (i ^ 1) | (i & 1))) | (~((i8522 & 1) | (i8522 ^ 1)))) * (-712)) + (((i8022 & i8322) | (i8022 ^ i8322)) * 712);
                                                                while (true) {
                                                                    if (i3 >= 7) {
                                                                    }
                                                                    i3++;
                                                                }
                                                                byte[] bArr622 = $$a;
                                                                java.lang.String $$c322 = $$c((short) (-bArr622[195]), bArr622[726], bArr622[207]);
                                                                $11 = ($10 + 5) % 128;
                                                                throw ((java.lang.Throwable) java.lang.Class.forName($$c((short) 862, (byte) (-bArr622[223]), bArr622[970])).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance($$c322, obj3));
                                                            }
                                                            if (obj7 == null) {
                                                                try {
                                                                    byte[] bArr7 = $$a;
                                                                    obj7 = java.lang.Class.forName($$c((short) 960, (byte) (-bArr7[223]), bArr7[327])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 960, (byte) (-bArr7[223]), bArr7[327])), java.lang.String.class).newInstance(obj4, obj15);
                                                                } catch (java.lang.Throwable th18) {
                                                                    java.lang.Throwable cause9 = th18.getCause();
                                                                    if (cause9 == null) {
                                                                        throw th18;
                                                                    }
                                                                    throw cause9;
                                                                }
                                                            } else {
                                                                if (obj8 != null) {
                                                                    if (obj9 == null) {
                                                                        try {
                                                                            byte[] bArr8 = $$a;
                                                                            obj9 = java.lang.Class.forName($$c((short) 960, (byte) (-bArr8[223]), bArr8[327])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 960, (byte) (-bArr8[223]), bArr8[327])), java.lang.String.class).newInstance(obj4, obj15);
                                                                        } catch (java.lang.Throwable th19) {
                                                                            java.lang.Throwable cause10 = th19.getCause();
                                                                            if (cause10 == null) {
                                                                                throw th19;
                                                                            }
                                                                            throw cause10;
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            try {
                                                                                byte[] bArr9 = $$a;
                                                                                obj6 = java.lang.Class.forName($$c((short) 960, (byte) (-bArr9[223]), bArr9[327])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 960, (byte) (-bArr9[223]), bArr9[327])), java.lang.String.class).newInstance(obj4, obj15);
                                                                                try {
                                                                                    java.lang.Object obj16 = obj7;
                                                                                    try {
                                                                                        java.lang.Class.forName($$c((short) 828, (byte) (-bArr9[223]), bArr9[63])).getMethod($$c((short) 805, bArr9[19], bArr9[726]), null).invoke(java.lang.Class.forName($$c((short) 828, (byte) (-bArr9[223]), bArr9[63])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 960, (byte) (-bArr9[223]), bArr9[327]))).newInstance(obj6), null);
                                                                                        zArr3 = r29;
                                                                                        $$c = str;
                                                                                        zArr4 = zArr;
                                                                                        z2 = z3;
                                                                                        objArr2 = objArr;
                                                                                        obj7 = obj16;
                                                                                        zArr8 = zArr2;
                                                                                    } catch (java.lang.Throwable th20) {
                                                                                        java.lang.Throwable cause11 = th20.getCause();
                                                                                        if (cause11 == null) {
                                                                                            throw th20;
                                                                                        }
                                                                                        throw cause11;
                                                                                    }
                                                                                } catch (java.lang.Throwable th21) {
                                                                                    java.lang.Throwable cause12 = th21.getCause();
                                                                                    if (cause12 == null) {
                                                                                        throw th21;
                                                                                    }
                                                                                    throw cause12;
                                                                                }
                                                                            } catch (java.lang.Throwable th22) {
                                                                                java.lang.Throwable cause13 = th22.getCause();
                                                                                if (cause13 == null) {
                                                                                    throw th22;
                                                                                }
                                                                                throw cause13;
                                                                            }
                                                                        } catch (java.lang.Exception e) {
                                                                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                                                            byte[] bArr10 = $$a;
                                                                            byte b3 = bArr10[726];
                                                                            sb4.append($$c((short) 801, b3, b3));
                                                                            sb4.append((java.lang.Object) obj15);
                                                                            sb4.append($$c((short) 862, bArr10[25], bArr10[143]));
                                                                            try {
                                                                                throw ((java.lang.Throwable) java.lang.Class.forName($$c((short) 862, (byte) (-bArr10[223]), bArr10[970])).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb4.toString(), e));
                                                                            } catch (java.lang.Throwable th23) {
                                                                                java.lang.Throwable cause14 = th23.getCause();
                                                                                if (cause14 == null) {
                                                                                    throw th23;
                                                                                }
                                                                                throw cause14;
                                                                            }
                                                                        }
                                                                    }
                                                                    th = th14;
                                                                    obj5 = th;
                                                                    cls = cls3;
                                                                    z4 = z;
                                                                    i2 = i75;
                                                                    z10 = r29;
                                                                    obj3 = obj5;
                                                                    z7 = z10;
                                                                    int currentTimeMillis5222 = (int) java.lang.System.currentTimeMillis();
                                                                    i = i2;
                                                                    int i79222 = (-712) - (~(-(-(i * 713))));
                                                                    int i80222 = ~i;
                                                                    int i81222 = ~((i80222 ^ 1) | (i80222 & 1));
                                                                    int i82222 = ~currentTimeMillis5222;
                                                                    int i83222 = ~((i82222 & 1) | (i82222 ^ 1));
                                                                    int i84222 = -(-(((i81222 ^ i83222) | (i81222 & i83222)) * (-712)));
                                                                    int i85222 = (i82222 ^ i80222) | (i80222 & i82222);
                                                                    i3 = (((i79222 | i84222) << 1) - (i79222 ^ i84222)) + (((~(currentTimeMillis5222 | (i ^ 1) | (i & 1))) | (~((i85222 & 1) | (i85222 ^ 1)))) * (-712)) + (((i80222 & i83222) | (i80222 ^ i83222)) * 712);
                                                                    while (true) {
                                                                        if (i3 >= 7) {
                                                                            break loop0;
                                                                        }
                                                                        int i114 = $11;
                                                                        $10 = ((i114 ^ 109) + ((i114 & 109) << 1)) % 128;
                                                                        if (zArr2[i3]) {
                                                                            int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                                                                            int i115 = ~currentTimeMillis8;
                                                                            int i116 = (i115 ^ (-510871419)) | ((-510871419) & i115);
                                                                            int i117 = ~((i116 ^ (-1141119469)) | ((-1141119469) & i116));
                                                                            int i118 = ~(((-1074010245) & currentTimeMillis8) | ((-1074010245) ^ currentTimeMillis8));
                                                                            int i119 = ~(((-1141119469) & currentTimeMillis8) | ((-1141119469) ^ currentTimeMillis8));
                                                                            int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                                                                            int i120 = ~(((-1349195108) & currentTimeMillis9) | ((-1349195108) ^ currentTimeMillis9));
                                                                            int i121 = ~currentTimeMillis9;
                                                                            int i122 = ~((i121 ^ 940521371) | (940521371 & i121));
                                                                            int i123 = ~(((-940521372) & currentTimeMillis9) | ((-940521372) ^ currentTimeMillis9));
                                                                            if ((((i117 ^ i118) | (i117 & i118)) * (-302)) + 54793487 + ((~((currentTimeMillis8 ^ (-67109225)) | ((-67109225) & currentTimeMillis8))) * (-604)) + ((((-1584881663) & i119) | ((-1584881663) ^ i119)) * 302) > (((((~((2020554747 & currentTimeMillis9) | (2020554747 ^ currentTimeMillis9))) * (-301)) + 746459430) + (((i120 & i122) | (i120 ^ i122)) * (-301))) - (~((((-1349195108) & i123) | ((-1349195108) ^ i123)) * 301))) - 1) {
                                                                                clsArr = null;
                                                                                SdkCoreCardRiskManagementDataImpl = null;
                                                                                getCardholderValidators = null;
                                                                                c = 970;
                                                                                z5 = false;
                                                                                z6 = true;
                                                                                r29 = z7;
                                                                            }
                                                                        } else {
                                                                            i3++;
                                                                        }
                                                                    }
                                                                    byte[] bArr6222 = $$a;
                                                                    java.lang.String $$c3222 = $$c((short) (-bArr6222[195]), bArr6222[726], bArr6222[207]);
                                                                    $11 = ($10 + 5) % 128;
                                                                    throw ((java.lang.Throwable) java.lang.Class.forName($$c((short) 862, (byte) (-bArr6222[223]), bArr6222[970])).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance($$c3222, obj3));
                                                                }
                                                                try {
                                                                    byte[] bArr11 = $$a;
                                                                    obj8 = java.lang.Class.forName($$c((short) 960, (byte) (-bArr11[223]), bArr11[327])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 960, (byte) (-bArr11[223]), bArr11[327])), java.lang.String.class).newInstance(obj4, obj15);
                                                                } catch (java.lang.Throwable th24) {
                                                                    java.lang.Throwable cause15 = th24.getCause();
                                                                    if (cause15 == null) {
                                                                        throw th24;
                                                                    }
                                                                    throw cause15;
                                                                }
                                                            }
                                                            zArr3 = r29;
                                                            $$c = str;
                                                            obj6 = obj14;
                                                            zArr4 = zArr;
                                                            z2 = z3;
                                                            objArr2 = objArr;
                                                            zArr8 = zArr2;
                                                        }
                                                        obj10 = obj6;
                                                        obj11 = obj7;
                                                        zArr2 = zArr8;
                                                        r29 = zArr3;
                                                        zArr = zArr4;
                                                        str = $$c;
                                                        z3 = z2;
                                                        objArr = objArr2;
                                                        obj12 = obj8;
                                                        obj13 = obj9;
                                                    } else {
                                                        r29 = zArr6;
                                                        zArr = zArr7;
                                                        zArr2 = zArr8;
                                                        str = $$c;
                                                        z3 = z2;
                                                        objArr = objArr2;
                                                        obj12 = null;
                                                        obj13 = null;
                                                        obj10 = null;
                                                        obj11 = null;
                                                    }
                                                    try {
                                                        byte[] bArr12 = $$a;
                                                        java.lang.String $$c4 = $$c((short) 797, bArr12[13], bArr12[7]);
                                                        try {
                                                            try {
                                                                java.lang.String str2 = (java.lang.String) java.lang.Class.forName($$c((short) 747, (byte) (-bArr12[223]), bArr12[327])).getMethod($$c((short) 736, (byte) 70, bArr12[97]), null).invoke(java.lang.Class.class.getMethod($$c((short) 757, (byte) 70, bArr12[56]), java.lang.String.class).invoke(com.payair.hce.setWillNotDraw.class, $$c4), null);
                                                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                                                sb5.append($$c((short) 730, bArr12[7], bArr12[143]));
                                                                sb5.append($$c4);
                                                                ?? zipFile4 = new java.util.zip.ZipFile(str2.substring(5, str2.lastIndexOf(sb5.toString())));
                                                                try {
                                                                    byte[] bArr13 = new byte[10160];
                                                                    try {
                                                                        try {
                                                                            java.lang.Object newInstance2 = java.lang.Class.forName($$c((short) 686, (byte) (-bArr12[223]), bArr12[207])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 704, (byte) (-bArr12[223]), bArr12[970]))).newInstance(java.lang.Class.forName($$c((short) 730, (byte) (-bArr12[223]), bArr12[13])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 704, (byte) (-bArr12[223]), bArr12[970]))).newInstance(zipFile4.getInputStream(zipFile4.getEntry($$c4.substring(1)))));
                                                                            try {
                                                                                java.lang.Class<?> cls6 = java.lang.Class.forName($$c((short) 686, (byte) (-bArr12[223]), bArr12[207]));
                                                                                byte b4 = bArr12[1067];
                                                                                int currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                                                                                int i124 = -(-(b4 * (-475)));
                                                                                int i125 = ((i124 | 477) << 1) - (i124 ^ 477);
                                                                                int i126 = ~(b4 | (-2));
                                                                                int i127 = ~b4;
                                                                                int i128 = (i127 ^ 1) | (i127 & 1);
                                                                                java.lang.Object obj17 = obj12;
                                                                                int i129 = ~((i128 ^ currentTimeMillis10) | (i128 & currentTimeMillis10));
                                                                                i2 = i126 ^ i129;
                                                                                int i130 = -(-((i2 | (i129 & i126)) * (-476)));
                                                                                int i131 = (i125 ^ i130) + ((i130 & i125) << 1);
                                                                                int i132 = -(-((~(i128 | currentTimeMillis10)) * 952));
                                                                                int i133 = ((i131 | i132) << 1) - (i132 ^ i131);
                                                                                int i134 = ~currentTimeMillis10;
                                                                                int i135 = (i134 ^ i127) | (i127 & i134);
                                                                                int i136 = (~((i135 ^ 1) | (i135 & 1))) * 476;
                                                                                cls6.getMethod($$c((short) 664, (byte) ((i133 ^ i136) + ((i133 & i136) << 1)), bArr12[898]), cls3).invoke(newInstance2, bArr13);
                                                                                try {
                                                                                    try {
                                                                                        java.lang.Class.forName($$c((short) 686, (byte) (-bArr12[223]), bArr12[207])).getMethod($$c((short) 805, bArr12[19], bArr12[726]), null).invoke(newInstance2, null);
                                                                                        int i137 = 10115;
                                                                                        int i138 = 16;
                                                                                        java.lang.String str3 = str;
                                                                                        java.lang.Class cls7 = null;
                                                                                        java.util.zip.ZipFile zipFile5 = zipFile4;
                                                                                        while (true) {
                                                                                            long j2 = 1;
                                                                                            int i139 = 0;
                                                                                            for (int length = bArr13.length; i139 < length; length = length) {
                                                                                                try {
                                                                                                    j2 = ((bArr13[i139] + (j2 << 6)) + (j2 << 16)) - j2;
                                                                                                    i139 = (i139 & 1) + (i139 | 1);
                                                                                                    obj13 = obj13;
                                                                                                } catch (java.lang.Throwable th25) {
                                                                                                    th = th25;
                                                                                                    cls = cls3;
                                                                                                    zipFile2 = zipFile5;
                                                                                                    z4 = z;
                                                                                                    i2 = i75;
                                                                                                    th = th;
                                                                                                    zipFile = zipFile2;
                                                                                                    try {
                                                                                                        zipFile.close();
                                                                                                        throw th;
                                                                                                    } catch (java.lang.Throwable th26) {
                                                                                                        th.addSuppressed(th26);
                                                                                                        throw th;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            java.lang.Object obj18 = obj13;
                                                                                            int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                                                                                            int i140 = -(-(i138 * (-858)));
                                                                                            int i141 = (70520 & i140) + (i140 | 70520);
                                                                                            int i142 = -(-(((currentTimeMillis11 ^ 82) | (currentTimeMillis11 & 82)) * (-859)));
                                                                                            int i143 = ~currentTimeMillis11;
                                                                                            int i144 = i137;
                                                                                            int i145 = ~((i143 ^ 82) | (i143 & 82));
                                                                                            i2 = i75;
                                                                                            int i146 = ~i138;
                                                                                            int i147 = (i146 ^ (-83)) | (i146 & (-83));
                                                                                            int i148 = ~((i147 ^ currentTimeMillis11) | (i147 & currentTimeMillis11));
                                                                                            java.lang.String str4 = str3;
                                                                                            zipFile2 = zipFile5;
                                                                                            try {
                                                                                                int currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
                                                                                                int i149 = i138 * (-575);
                                                                                                java.lang.Class cls8 = cls7;
                                                                                                z4 = z;
                                                                                                int i150 = ~((i146 ^ (-10144)) | (i146 & (-10144)));
                                                                                                int i151 = ~((i146 ^ currentTimeMillis12) | (i146 & currentTimeMillis12));
                                                                                                int i152 = ~currentTimeMillis12;
                                                                                                int i153 = (i152 ^ i146) | (i146 & i152);
                                                                                                int i154 = (((((((-5832225) | i149) << 1) - (i149 ^ (-5832225))) - (~(-(-(((i150 ^ i151) | (i150 & i151)) * 576))))) - 1) - (~(((~((i138 ^ (-10144)) | (i138 & (-10144)))) | (~((i153 ^ 10143) | (i153 & 10143)))) * 576))) - 1;
                                                                                                int i155 = -(-((~(i146 | (-10144))) * 576));
                                                                                                try {
                                                                                                    byte b5 = bArr13[(i154 & i155) + (i155 | i154)];
                                                                                                    int currentTimeMillis13 = (int) java.lang.System.currentTimeMillis();
                                                                                                    int i156 = b5 * 85;
                                                                                                    int i157 = ~currentTimeMillis13;
                                                                                                    j = j2;
                                                                                                    int i158 = ~b5;
                                                                                                    cls = cls3;
                                                                                                    int i159 = (~((i157 ^ (-47)) | (i157 & (-47)))) | (~(i158 | (-47)));
                                                                                                    int i160 = ~((i158 ^ i157) | (i158 & i157));
                                                                                                    i7 = (i159 ^ i160) | (i159 & i160);
                                                                                                    int i161 = (b5 ^ 46) | (b5 & 46);
                                                                                                    i8 = i138;
                                                                                                    i9 = ~(i161 | currentTimeMillis13);
                                                                                                    i10 = ~((i158 ^ currentTimeMillis13) | (currentTimeMillis13 & i158));
                                                                                                    i11 = ~((b5 & i157) | (i157 ^ b5));
                                                                                                    i12 = ~i161;
                                                                                                    i13 = ((((i141 & i142) + (i142 | i141)) + (((i145 & i148) | (i145 ^ i148)) * 859)) - (~(((~((i143 & i146) | (i146 ^ i143))) | (~(i146 | 82))) * 859))) - 1;
                                                                                                    i14 = i156 ^ 3910;
                                                                                                    zipFile4 = (i156 & 3910) << 1;
                                                                                                } catch (java.lang.Throwable th27) {
                                                                                                    th = th27;
                                                                                                    cls = cls3;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th28) {
                                                                                                th = th28;
                                                                                                cls = cls3;
                                                                                                z4 = z;
                                                                                            }
                                                                                            try {
                                                                                                bArr13[i13] = (byte) (((((i14 + zipFile4) + (((i7 & i9) | (i7 ^ i9)) * (-84))) + ((((i10 & 46) | (i10 ^ 46)) | i11) * (-84))) - (~(((i12 & i11) | (i11 ^ i12)) * 84))) - 1);
                                                                                                int length2 = bArr13.length;
                                                                                                int i162 = -i8;
                                                                                                try {
                                                                                                    zipFile4 = new java.lang.Object[]{bArr13, java.lang.Integer.valueOf(i8), java.lang.Integer.valueOf(((length2 | i162) << 1) - (length2 ^ i162))};
                                                                                                    byte[] bArr14 = $$a;
                                                                                                    java.lang.Object newInstance3 = java.lang.Class.forName($$c((short) 656, (byte) (-bArr14[223]), bArr14[664])).getDeclaredConstructor(cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE).newInstance(zipFile4);
                                                                                                    java.lang.Object obj19 = SdkCoreCardRiskManagementDataImpl;
                                                                                                    if (obj19 == null) {
                                                                                                        try {
                                                                                                            SdkCoreContactlessPaymentDataImpl = j;
                                                                                                            int uptimeMillis = (int) (j ^ (6255588601321348519L - (android.os.SystemClock.uptimeMillis() >> 48)));
                                                                                                            int elapsedCpuTime = (int) (SdkCoreContactlessPaymentDataImpl ^ ((android.os.Process.getElapsedCpuTime() >> 48) + 6255588599793007319L));
                                                                                                            int[] iArr = new int[1 - (~android.graphics.Color.argb(0, 0, 0, 0))];
                                                                                                            int elapsedCpuTime2 = (int) (SdkCoreContactlessPaymentDataImpl ^ (6255588601321348518L - (android.os.Process.getElapsedCpuTime() >> 48)));
                                                                                                            int i163 = (int) (getCdol1RelatedDataLength >>> ((byte) (31 - (~(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))))));
                                                                                                            int i164 = ~elapsedCpuTime;
                                                                                                            iArr[elapsedCpuTime2] = ((~i163) & elapsedCpuTime) | (i163 & i164);
                                                                                                            int globalActionKeyTimeout = (int) (SdkCoreContactlessPaymentDataImpl ^ ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() >> 32) + 6255588601321348519L));
                                                                                                            int i165 = (int) getCdol1RelatedDataLength;
                                                                                                            iArr[globalActionKeyTimeout] = (elapsedCpuTime & (~i165)) | (i165 & i164);
                                                                                                            try {
                                                                                                                newInstance = java.lang.Class.forName($$c((short) 629, bArr14[19], bArr14[8])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 704, (byte) (-bArr14[223]), bArr14[970])), int[].class, cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE).newInstance(newInstance3, iArr, null, java.lang.Integer.valueOf(buildRecords), java.lang.Boolean.valueOf((boolean) ((int) (SdkCoreContactlessPaymentDataImpl ^ ((android.os.SystemClock.elapsedRealtimeNanos() >> 60) + 6255588601321348518L)))), java.lang.Integer.valueOf(uptimeMillis));
                                                                                                            } catch (java.lang.Throwable th29) {
                                                                                                                java.lang.Throwable cause16 = th29.getCause();
                                                                                                                if (cause16 == null) {
                                                                                                                    throw th29;
                                                                                                                }
                                                                                                                throw cause16;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th30) {
                                                                                                            th = th30;
                                                                                                            th = th;
                                                                                                            zipFile = zipFile2;
                                                                                                            zipFile.close();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } else {
                                                                                                        getCrmCountryCode = j;
                                                                                                        int globalActionKeyTimeout2 = (int) (j ^ ((-992595435456948063L) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() >> 32)));
                                                                                                        int currentThreadTimeMillis = (int) (getCrmCountryCode ^ (992595436557196477L - (android.os.SystemClock.currentThreadTimeMillis() >> 48)));
                                                                                                        int i166 = $10;
                                                                                                        $11 = ((i166 & 105) + (i166 | 105)) % 128;
                                                                                                        try {
                                                                                                        } catch (java.lang.Throwable th31) {
                                                                                                            th = th31;
                                                                                                        }
                                                                                                        try {
                                                                                                            newInstance = java.lang.Class.forName($$c((short) 592, bArr14[19], bArr14[9]), true, (java.lang.ClassLoader) getCardholderValidators).getMethod($$c((short) 554, (byte) 86, bArr14[327]), java.lang.Class.forName($$c((short) 704, (byte) (-bArr14[223]), bArr14[970])), cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(obj19, newInstance3, null, java.lang.Integer.valueOf(globalActionKeyTimeout2), java.lang.Integer.valueOf(currentThreadTimeMillis));
                                                                                                        } catch (java.lang.Throwable th32) {
                                                                                                            th = th32;
                                                                                                            java.lang.Throwable th33 = th;
                                                                                                            java.lang.Throwable cause17 = th33.getCause();
                                                                                                            if (cause17 == null) {
                                                                                                                throw th33;
                                                                                                            }
                                                                                                            throw cause17;
                                                                                                        }
                                                                                                    }
                                                                                                    java.lang.Class.forName($$c((short) 704, (byte) (-bArr14[223]), bArr14[970])).getMethod($$c((short) 543, (byte) 82, (byte) (-bArr14[90])), java.lang.Long.TYPE).invoke(newInstance, 22);
                                                                                                    if (z8) {
                                                                                                        try {
                                                                                                            java.lang.Object obj20 = SdkCoreCardRiskManagementDataImpl;
                                                                                                            java.lang.Object obj21 = obj20 == null ? obj11 : obj17;
                                                                                                            java.lang.Object obj22 = obj20 == null ? obj18 : obj10;
                                                                                                            ?? cls9 = java.lang.Class.forName($$c((short) 704, (byte) (-bArr14[223]), bArr14[970]));
                                                                                                            byte b6 = bArr14[1067];
                                                                                                            java.lang.reflect.Method method3 = cls9.getMethod($$c((short) 540, (byte) ((b6 ^ 1) + ((b6 & 1) << 1)), (byte) (-bArr14[90])), cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                            ?? cls10 = java.lang.Class.forName($$c((short) 828, (byte) (-bArr14[223]), bArr14[63]));
                                                                                                            try {
                                                                                                                try {
                                                                                                                    java.lang.Object newInstance4 = cls10.getConstructor(java.lang.Class.forName($$c((short) 960, (byte) (-bArr14[223]), bArr14[327]))).newInstance(obj21);
                                                                                                                    if (z4) {
                                                                                                                        int i167 = $11;
                                                                                                                        int i168 = (i167 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i167 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                                                                                        $10 = i168 % 128;
                                                                                                                        if (i168 % 2 != 0) {
                                                                                                                            throw new java.lang.NullPointerException();
                                                                                                                        }
                                                                                                                        try {
                                                                                                                        } catch (java.lang.Throwable th34) {
                                                                                                                            java.lang.Throwable cause18 = th34.getCause();
                                                                                                                            if (cause18 == null) {
                                                                                                                                throw th34;
                                                                                                                            }
                                                                                                                            throw cause18;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    int i169 = $11;
                                                                                                                    $10 = ((i169 & 19) + (i169 | 19)) % 128;
                                                                                                                    byte[] bArr15 = new byte[1024];
                                                                                                                    java.lang.reflect.Method method4 = cls10.getMethod($$c((short) 523, (byte) 86, bArr14[726]), cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                    int i170 = i144;
                                                                                                                    while (i170 > 0) {
                                                                                                                        int intValue2 = ((java.lang.Integer) method3.invoke(newInstance, bArr15, 0, java.lang.Integer.valueOf(java.lang.Math.min(1024, i170)))).intValue();
                                                                                                                        if (intValue2 == -1) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        $11 = ($10 + 37) % 128;
                                                                                                                        method4.invoke(newInstance4, bArr15, 0, java.lang.Integer.valueOf(intValue2));
                                                                                                                        int i171 = -intValue2;
                                                                                                                        int currentTimeMillis14 = (int) java.lang.System.currentTimeMillis();
                                                                                                                        int i172 = i171 * 165;
                                                                                                                        int i173 = -(-(i170 * (-163)));
                                                                                                                        int i174 = (i172 & i173) + (i172 | i173);
                                                                                                                        int i175 = ~currentTimeMillis14;
                                                                                                                        int i176 = ((~((i175 & i170) | (i175 ^ i170))) | i171) * (-328);
                                                                                                                        int i177 = (i174 & i176) + (i174 | i176) + ((i171 | currentTimeMillis14) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
                                                                                                                        int i178 = ~i171;
                                                                                                                        int i179 = ~i170;
                                                                                                                        int i180 = ~((i178 ^ i179) | (i178 & i179));
                                                                                                                        int i181 = ~(i179 | currentTimeMillis14);
                                                                                                                        int i182 = (i181 & i180) | (i180 ^ i181);
                                                                                                                        int i183 = (i171 & i175) | (i175 ^ i171);
                                                                                                                        int i184 = ~((i170 ^ i183) | (i183 & i170));
                                                                                                                        int i185 = ((i184 ^ i182) | (i182 & i184)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                                                                                                        i170 = ((i185 & i177) << 1) + (i177 ^ i185);
                                                                                                                    }
                                                                                                                    byte[] bArr16 = $$a;
                                                                                                                    java.lang.Class.forName($$c((short) 515, (byte) (-bArr16[223]), bArr16[289])).getMethod($$c((short) 494, (byte) 82, (byte) (-bArr16[90])), new java.lang.Class[0]).invoke(cls10.getMethod($$c((short) 519, (byte) 70, bArr16[726]), new java.lang.Class[0]).invoke(newInstance4, new java.lang.Object[0]), new java.lang.Object[0]);
                                                                                                                    cls10.getMethod($$c((short) 805, bArr16[19], bArr16[726]), new java.lang.Class[0]).invoke(newInstance4, new java.lang.Object[0]);
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            invoke3 = java.lang.Class.forName($$c((short) 491, bArr16[425], bArr16[294])).getDeclaredMethod($$c((short) 471, (byte) (-bArr16[1068]), bArr16[97]), java.lang.String.class, java.lang.String.class, java.lang.Integer.TYPE).invoke(null, java.lang.Class.forName($$c((short) 960, (byte) (-bArr16[223]), bArr16[327])).getMethod($$c((short) 465, (byte) 70, bArr16[2]), null).invoke(obj21, null), java.lang.Class.forName($$c((short) 960, (byte) (-bArr16[223]), bArr16[327])).getMethod($$c((short) 465, (byte) 70, bArr16[2]), null).invoke(obj22, null), 0);
                                                                                                                            try {
                                                                                                                                int i186 = $10;
                                                                                                                                $11 = (((i186 | 87) << 1) - (i186 ^ 87)) % 128;
                                                                                                                                try {
                                                                                                                                    int i187 = $10;
                                                                                                                                    int i188 = (((i187 | 7) << 1) - (i187 ^ 7)) % 128;
                                                                                                                                    $11 = i188;
                                                                                                                                    try {
                                                                                                                                        if (getCardholderValidators == null) {
                                                                                                                                            int i189 = i188 + 13;
                                                                                                                                            $10 = i189 % 128;
                                                                                                                                            if (i189 % 2 != 0) {
                                                                                                                                                throw new java.lang.ArithmeticException();
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                int i190 = $$b;
                                                                                                                                                getCardholderValidators = java.lang.Class.class.getMethod($$c((short) ((i190 ^ 256) | (i190 & 256)), (byte) 70, bArr16[48]), null).invoke(com.payair.hce.setWillNotDraw.class, null);
                                                                                                                                            } catch (java.lang.Throwable th35) {
                                                                                                                                                java.lang.Throwable cause19 = th35.getCause();
                                                                                                                                                if (cause19 == null) {
                                                                                                                                                    throw th35;
                                                                                                                                                }
                                                                                                                                                throw cause19;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (java.lang.Throwable th36) {
                                                                                                                                        th = th36;
                                                                                                                                        zipFile = zipFile2;
                                                                                                                                        zipFile.close();
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (java.lang.Throwable th37) {
                                                                                                                                    java.lang.Throwable cause20 = th37.getCause();
                                                                                                                                    if (cause20 == null) {
                                                                                                                                        throw th37;
                                                                                                                                    }
                                                                                                                                    throw cause20;
                                                                                                                                }
                                                                                                                            } catch (java.lang.Throwable th38) {
                                                                                                                                java.lang.Throwable cause21 = th38.getCause();
                                                                                                                                if (cause21 == null) {
                                                                                                                                    throw th38;
                                                                                                                                }
                                                                                                                                throw cause21;
                                                                                                                            }
                                                                                                                        } catch (java.lang.Throwable th39) {
                                                                                                                            java.lang.Throwable cause22 = th39.getCause();
                                                                                                                            if (cause22 == null) {
                                                                                                                                throw th39;
                                                                                                                            }
                                                                                                                            throw cause22;
                                                                                                                        }
                                                                                                                    } catch (java.lang.Throwable th40) {
                                                                                                                        java.lang.Throwable cause23 = th40.getCause();
                                                                                                                        if (cause23 == null) {
                                                                                                                            throw th40;
                                                                                                                        }
                                                                                                                        throw cause23;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th41) {
                                                                                                                    try {
                                                                                                                        byte[] bArr17 = $$a;
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    throw th41;
                                                                                                                                } catch (java.lang.Throwable th42) {
                                                                                                                                    th = th42;
                                                                                                                                    java.lang.Throwable th43 = th;
                                                                                                                                    java.lang.Throwable cause24 = th43.getCause();
                                                                                                                                    if (cause24 == null) {
                                                                                                                                        throw th43;
                                                                                                                                    }
                                                                                                                                    throw cause24;
                                                                                                                                }
                                                                                                                            } catch (java.lang.Throwable th44) {
                                                                                                                                th = th44;
                                                                                                                            }
                                                                                                                        } catch (java.lang.Throwable th45) {
                                                                                                                            th = th45;
                                                                                                                            java.lang.Throwable th46 = th;
                                                                                                                            java.lang.Throwable cause25 = th46.getCause();
                                                                                                                            if (cause25 == null) {
                                                                                                                                throw th46;
                                                                                                                            }
                                                                                                                            throw cause25;
                                                                                                                        }
                                                                                                                    } catch (java.lang.Throwable th47) {
                                                                                                                        th = th47;
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (java.lang.Exception e2) {
                                                                                                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                                                                                                byte[] bArr18 = $$a;
                                                                                                                byte b7 = bArr18[726];
                                                                                                                sb6.append($$c((short) 527, b7, b7));
                                                                                                                sb6.append(obj21);
                                                                                                                sb6.append($$c((short) 862, bArr18[25], bArr18[143]));
                                                                                                                try {
                                                                                                                    throw ((java.lang.Throwable) java.lang.Class.forName($$c((short) 862, (byte) (-bArr18[223]), bArr18[970])).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb6.toString(), e2));
                                                                                                                } catch (java.lang.Throwable th48) {
                                                                                                                    java.lang.Throwable cause26 = th48.getCause();
                                                                                                                    if (cause26 == null) {
                                                                                                                        throw th48;
                                                                                                                    }
                                                                                                                    throw cause26;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th49) {
                                                                                                            th = th49;
                                                                                                            th = th;
                                                                                                            zipFile = zipFile2;
                                                                                                            zipFile.close();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } else {
                                                                                                        java.lang.Class<?> cls11 = java.lang.Class.forName($$c((short) 433, (byte) (-bArr14[223]), bArr14[664]));
                                                                                                        java.lang.Class<?> cls12 = java.lang.Class.forName($$c((short) 704, (byte) (-bArr14[223]), bArr14[970]));
                                                                                                        java.lang.Object newInstance5 = cls11.getConstructor(cls12).newInstance(newInstance);
                                                                                                        java.lang.Object invoke4 = cls11.getMethod($$c((short) 406, (byte) 70, bArr14[327]), new java.lang.Class[0]).invoke(newInstance5, new java.lang.Object[0]);
                                                                                                        zipFile4 = java.lang.Class.forName($$c((short) 395, (byte) (-bArr14[223]), bArr14[289])).getMethod($$c((short) 374, (byte) 70, bArr14[97]), new java.lang.Class[0]);
                                                                                                        byte b8 = bArr14[1067];
                                                                                                        int currentTimeMillis15 = (int) java.lang.System.currentTimeMillis();
                                                                                                        int i191 = -(-(b8 * 832));
                                                                                                        int i192 = ~b8;
                                                                                                        int i193 = ~currentTimeMillis15;
                                                                                                        int i194 = ~((i192 ^ i193) | (i192 & i193));
                                                                                                        int i195 = (b8 ^ 1) | (b8 & 1);
                                                                                                        int i196 = ~((i195 ^ currentTimeMillis15) | (i195 & currentTimeMillis15));
                                                                                                        int i197 = i192 | 1;
                                                                                                        int i198 = ((((((i191 | (-830)) << 1) - (i191 ^ (-830))) - (~(-(-(((i194 ^ i196) | (i194 & i196)) * (-831)))))) - 1) - (~((~((i197 & currentTimeMillis15) | (i197 ^ currentTimeMillis15))) * (-1662)))) - 1;
                                                                                                        int i199 = ~(i193 | (-2));
                                                                                                        int i200 = ~(currentTimeMillis15 | 1);
                                                                                                        int i201 = (i199 ^ i200) | (i199 & i200);
                                                                                                        int i202 = ~(b8 | currentTimeMillis15);
                                                                                                        int i203 = ((i202 ^ i201) | (i202 & i201)) * 831;
                                                                                                        java.lang.reflect.Method method5 = cls12.getMethod($$c((short) 540, (byte) ((i198 ^ i203) + ((i198 & i203) << 1)), (byte) (-bArr14[90])), cls);
                                                                                                        try {
                                                                                                            java.lang.Object newInstance6 = java.lang.Class.forName($$c((short) 730, (byte) (-bArr14[223]), bArr14[13])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 704, (byte) (-bArr14[223]), bArr14[970]))).newInstance(newInstance5);
                                                                                                            ?? cls13 = java.lang.Class.forName($$c((short) 368, (byte) (-bArr14[223]), bArr14[31]));
                                                                                                            java.lang.Object newInstance7 = cls13.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                                                                                                            java.lang.reflect.Method method6 = cls13.getMethod($$c((short) 523, (byte) 86, bArr14[726]), cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                            java.lang.reflect.Method method7 = cls13.getMethod($$c((short) 340, (byte) 83, bArr14[56]), new java.lang.Class[0]);
                                                                                                            try {
                                                                                                                java.lang.reflect.Method method8 = java.lang.Class.forName($$c((short) 330, (byte) (-bArr14[223]), bArr14[450])).getMethod($$c((short) 805, bArr14[19], bArr14[726]), new java.lang.Class[0]);
                                                                                                                byte[] bArr19 = new byte[1024];
                                                                                                                int i204 = 0;
                                                                                                                zipFile4 = zipFile4;
                                                                                                                while (true) {
                                                                                                                    int intValue3 = ((java.lang.Integer) method5.invoke(newInstance6, bArr19)).intValue();
                                                                                                                    if (intValue3 <= 0) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    int currentTimeMillis16 = (int) java.lang.System.currentTimeMillis();
                                                                                                                    int i205 = ~currentTimeMillis16;
                                                                                                                    int i206 = ~((i205 ^ (-1960391989)) | (i205 & (-1960391989)));
                                                                                                                    int i207 = -(-(((i206 ^ 542127120) | (i206 & 542127120)) * 529));
                                                                                                                    int i208 = ~((currentTimeMillis16 & (-1960391989)) | (currentTimeMillis16 ^ (-1960391989)));
                                                                                                                    int i209 = i204;
                                                                                                                    int currentTimeMillis17 = (int) java.lang.System.currentTimeMillis();
                                                                                                                    int i210 = ~currentTimeMillis17;
                                                                                                                    int i211 = -(-(((i210 ^ (-544061168)) | (i210 & (-544061168))) * (-490)));
                                                                                                                    int i212 = (i211 & 196483294) + (i211 | 196483294);
                                                                                                                    int i213 = ~((currentTimeMillis17 & (-619689712)) | ((-619689712) ^ currentTimeMillis17));
                                                                                                                    int i214 = -(-(((i213 & 75628544) | (75628544 ^ i213)) * 490));
                                                                                                                    int i215 = (i212 & i214) + (i212 | i214);
                                                                                                                    if (((((662361090 | i207) << 1) - (i207 ^ 662361090)) - (~(-(-(((i208 ^ 728790618) | (i208 & 728790618)) * 529))))) - 1 <= (1591963296 ^ i215) + ((i215 & 1591963296) << 1)) {
                                                                                                                        i15 = i209;
                                                                                                                        method = method5;
                                                                                                                        try {
                                                                                                                            if (i15 >= ((java.lang.Long) zipFile4.invoke(invoke4, new java.lang.Object[0])).longValue()) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            method6.invoke(newInstance7, bArr19, 0, java.lang.Integer.valueOf(intValue3));
                                                                                                                            int currentTimeMillis18 = (int) java.lang.System.currentTimeMillis();
                                                                                                                            int i216 = (intValue3 * (-317)) + (i15 * 319);
                                                                                                                            int i217 = ~intValue3;
                                                                                                                            int i218 = ~i15;
                                                                                                                            java.lang.Object obj23 = invoke4;
                                                                                                                            int i219 = ~((i217 ^ i218) | (i217 & i218) | currentTimeMillis18);
                                                                                                                            java.lang.Object obj24 = zipFile4;
                                                                                                                            int i220 = ~currentTimeMillis18;
                                                                                                                            int i221 = (i220 ^ intValue3) | (i220 & intValue3);
                                                                                                                            int i222 = ~((i221 ^ i15) | (i221 & i15));
                                                                                                                            int i223 = ((i219 ^ i222) | (i219 & i222)) * (-318);
                                                                                                                            int i224 = ~((i218 ^ intValue3) | (i218 & intValue3));
                                                                                                                            int i225 = ~((intValue3 ^ currentTimeMillis18) | (intValue3 & currentTimeMillis18));
                                                                                                                            int i226 = ~(currentTimeMillis18 | i217);
                                                                                                                            i204 = (i216 ^ i223) + ((i223 & i216) << 1) + (((i224 ^ i225) | (i224 & i225)) * (-318)) + (((i218 & i226) | (i218 ^ i226)) * 318);
                                                                                                                            method5 = method;
                                                                                                                            zipFile4 = obj24;
                                                                                                                            invoke4 = obj23;
                                                                                                                        } catch (java.lang.Throwable th50) {
                                                                                                                            th = th50;
                                                                                                                            zipFile = zipFile2;
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i15 = i209;
                                                                                                                        method = method5;
                                                                                                                        if (i15 >= ((java.lang.Long) zipFile4.invoke(invoke4, new java.lang.Object[0])).longValue()) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        method6.invoke(newInstance7, bArr19, 0, java.lang.Integer.valueOf(intValue3));
                                                                                                                        int currentTimeMillis182 = (int) java.lang.System.currentTimeMillis();
                                                                                                                        int i2162 = (intValue3 * (-317)) + (i15 * 319);
                                                                                                                        int i2172 = ~intValue3;
                                                                                                                        int i2182 = ~i15;
                                                                                                                        java.lang.Object obj232 = invoke4;
                                                                                                                        int i2192 = ~((i2172 ^ i2182) | (i2172 & i2182) | currentTimeMillis182);
                                                                                                                        java.lang.Object obj242 = zipFile4;
                                                                                                                        int i2202 = ~currentTimeMillis182;
                                                                                                                        int i2212 = (i2202 ^ intValue3) | (i2202 & intValue3);
                                                                                                                        int i2222 = ~((i2212 ^ i15) | (i2212 & i15));
                                                                                                                        int i2232 = ((i2192 ^ i2222) | (i2192 & i2222)) * (-318);
                                                                                                                        int i2242 = ~((i2182 ^ intValue3) | (i2182 & intValue3));
                                                                                                                        int i2252 = ~((intValue3 ^ currentTimeMillis182) | (intValue3 & currentTimeMillis182));
                                                                                                                        int i2262 = ~(currentTimeMillis182 | i2172);
                                                                                                                        i204 = (i2162 ^ i2232) + ((i2232 & i2162) << 1) + (((i2242 ^ i2252) | (i2242 & i2252)) * (-318)) + (((i2182 & i2262) | (i2182 ^ i2262)) * 318);
                                                                                                                        method5 = method;
                                                                                                                        zipFile4 = obj242;
                                                                                                                        invoke4 = obj232;
                                                                                                                    }
                                                                                                                }
                                                                                                                byte[] bArr20 = (byte[]) method7.invoke(newInstance7, new java.lang.Object[0]);
                                                                                                                try {
                                                                                                                    method8.invoke(newInstance6, new java.lang.Object[0]);
                                                                                                                    method8.invoke(newInstance7, new java.lang.Object[0]);
                                                                                                                } catch (java.lang.Exception unused6) {
                                                                                                                }
                                                                                                                $11 = ($10 + 13) % 128;
                                                                                                                try {
                                                                                                                    short s2 = (short) ($$b | 256);
                                                                                                                    byte[] bArr21 = $$a;
                                                                                                                    zipFile4 = 70;
                                                                                                                    java.lang.Object invoke5 = java.lang.Class.class.getMethod($$c(s2, (byte) 70, bArr21[48]), null).invoke(com.payair.hce.setWillNotDraw.class, null);
                                                                                                                    ?? cls14 = java.lang.Class.forName($$c((short) 314, bArr21[425], bArr21[15]));
                                                                                                                    zipFile4 = new java.lang.Class[]{java.lang.Class.forName($$c((short) 279, (byte) (-bArr21[223]), bArr21[970])), java.lang.Class.forName($$c((short) 261, (byte) (-bArr21[223]), bArr21[294]))};
                                                                                                                    java.lang.reflect.Constructor declaredConstructor = cls14.getDeclaredConstructor(zipFile4);
                                                                                                                    try {
                                                                                                                        zipFile4 = 0;
                                                                                                                        java.lang.Object newInstance8 = declaredConstructor.newInstance(java.lang.Class.forName($$c((short) 279, (byte) (-bArr21[223]), bArr21[970])).getMethod($$c((short) 241, (byte) 86, (byte) (-bArr21[90])), cls).invoke(null, bArr20), invoke5);
                                                                                                                        try {
                                                                                                                            java.lang.reflect.Field declaredField = java.lang.Class.forName($$c((short) 238, bArr21[425], bArr21[226])).getDeclaredField($$c((short) 207, (byte) (-bArr21[741]), bArr21[246]));
                                                                                                                            declaredField.setAccessible(true);
                                                                                                                            java.lang.Object obj25 = declaredField.get(invoke5);
                                                                                                                            java.lang.Class<?> cls15 = obj25.getClass();
                                                                                                                            java.lang.reflect.Field declaredField2 = cls15.getDeclaredField($$c((short) 200, (byte) (bArr21[1115] + 1), bArr21[63]));
                                                                                                                            declaredField2.setAccessible(true);
                                                                                                                            byte b9 = bArr21[1115];
                                                                                                                            int currentTimeMillis19 = (int) java.lang.System.currentTimeMillis();
                                                                                                                            int i227 = -(-(b9 * (-282)));
                                                                                                                            int i228 = ~((b9 ^ (-2)) | (b9 & (-2)));
                                                                                                                            int i229 = ~((currentTimeMillis19 ^ (-2)) | (currentTimeMillis19 & (-2)));
                                                                                                                            int i230 = ~b9;
                                                                                                                            int i231 = -(-((~((i230 ^ 1) | (i230 & 1))) * 283));
                                                                                                                            int i232 = (i230 ^ (-2)) | (i230 & (-2));
                                                                                                                            java.lang.reflect.Field declaredField3 = cls15.getDeclaredField($$c((short) 177, (byte) (((((((i227 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) + ((i227 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) << 1)) - (~(((i228 & i229) | (i228 ^ i229)) * (-283)))) - 1) - (~i231)) - 1) + ((~((i232 ^ currentTimeMillis19) | (i232 & currentTimeMillis19))) * 283)), bArr21[198]));
                                                                                                                            declaredField3.setAccessible(true);
                                                                                                                            java.lang.Object obj26 = declaredField2.get(obj25);
                                                                                                                            java.lang.Object obj27 = declaredField3.get(obj25);
                                                                                                                            java.lang.Object obj28 = declaredField.get(newInstance8);
                                                                                                                            java.util.ArrayList arrayList = new java.util.ArrayList((java.util.List) obj26);
                                                                                                                            try {
                                                                                                                                java.lang.Class cls16 = (java.lang.Class) java.lang.Class.class.getMethod($$c((short) 153, (byte) 70, bArr21[961]), null).invoke(obj27.getClass(), null);
                                                                                                                                int length3 = java.lang.reflect.Array.getLength(obj27);
                                                                                                                                java.lang.Object newInstance9 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls16, length3);
                                                                                                                                for (int i233 = 0; i233 < length3; i233++) {
                                                                                                                                    try {
                                                                                                                                        java.lang.reflect.Array.set(newInstance9, i233, java.lang.reflect.Array.get(obj27, i233));
                                                                                                                                    } catch (java.lang.Exception e3) {
                                                                                                                                        exc = e3;
                                                                                                                                        zipFile4 = zipFile2;
                                                                                                                                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                                                                                                                        short s3 = (short) ($$b & 971);
                                                                                                                                        byte[] bArr22 = $$a;
                                                                                                                                        byte b10 = bArr22[726];
                                                                                                                                        sb7.append($$c(s3, b10, b10));
                                                                                                                                        sb7.append(invoke5);
                                                                                                                                        sb7.append($$c((short) 862, bArr22[25], bArr22[143]));
                                                                                                                                        try {
                                                                                                                                            throw ((java.lang.Throwable) java.lang.Class.forName($$c((short) 862, (byte) (-bArr22[223]), bArr22[970])).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb7.toString(), exc));
                                                                                                                                        } catch (java.lang.Throwable th51) {
                                                                                                                                            java.lang.Throwable cause27 = th51.getCause();
                                                                                                                                            if (cause27 == null) {
                                                                                                                                                throw th51;
                                                                                                                                            }
                                                                                                                                            throw cause27;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                declaredField2.set(obj28, arrayList);
                                                                                                                                declaredField3.set(obj28, newInstance9);
                                                                                                                                if (getCardholderValidators == null) {
                                                                                                                                    getCardholderValidators = newInstance8;
                                                                                                                                }
                                                                                                                                invoke3 = newInstance8;
                                                                                                                            } catch (java.lang.Throwable th52) {
                                                                                                                                zipFile3 = zipFile2;
                                                                                                                                try {
                                                                                                                                    java.lang.Throwable cause28 = th52.getCause();
                                                                                                                                    if (cause28 == null) {
                                                                                                                                        throw th52;
                                                                                                                                    }
                                                                                                                                    throw cause28;
                                                                                                                                } catch (java.lang.Exception e4) {
                                                                                                                                    e = e4;
                                                                                                                                    exc = e;
                                                                                                                                    zipFile4 = zipFile3;
                                                                                                                                    java.lang.StringBuilder sb72 = new java.lang.StringBuilder();
                                                                                                                                    short s32 = (short) ($$b & 971);
                                                                                                                                    byte[] bArr222 = $$a;
                                                                                                                                    byte b102 = bArr222[726];
                                                                                                                                    sb72.append($$c(s32, b102, b102));
                                                                                                                                    sb72.append(invoke5);
                                                                                                                                    sb72.append($$c((short) 862, bArr222[25], bArr222[143]));
                                                                                                                                    throw ((java.lang.Throwable) java.lang.Class.forName($$c((short) 862, (byte) (-bArr222[223]), bArr222[970])).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb72.toString(), exc));
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (java.lang.Exception e5) {
                                                                                                                            e = e5;
                                                                                                                            zipFile3 = zipFile2;
                                                                                                                        }
                                                                                                                    } catch (java.lang.Throwable th53) {
                                                                                                                        java.lang.Throwable cause29 = th53.getCause();
                                                                                                                        if (cause29 == null) {
                                                                                                                            throw th53;
                                                                                                                        }
                                                                                                                        throw cause29;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th54) {
                                                                                                                    java.lang.Throwable cause30 = th54.getCause();
                                                                                                                    if (cause30 == null) {
                                                                                                                        throw th54;
                                                                                                                    }
                                                                                                                    throw cause30;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th55) {
                                                                                                                th = th55;
                                                                                                                zipFile4 = zipFile2;
                                                                                                                th = th;
                                                                                                                zipFile = zipFile4;
                                                                                                                zipFile.close();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th56) {
                                                                                                            java.lang.Throwable cause31 = th56.getCause();
                                                                                                            if (cause31 == null) {
                                                                                                                throw th56;
                                                                                                            }
                                                                                                            throw cause31;
                                                                                                        }
                                                                                                    }
                                                                                                    if (z8) {
                                                                                                        try {
                                                                                                            byte[] bArr23 = $$a;
                                                                                                            java.lang.Class<?> cls17 = java.lang.Class.forName($$c((short) 491, bArr23[425], bArr23[294]));
                                                                                                            int i234 = $$b;
                                                                                                            java.lang.reflect.Method declaredMethod = cls17.getDeclaredMethod($$c((short) (i234 & 967), (byte) (-bArr23[1068]), bArr23[898]), java.lang.String.class, java.lang.Class.forName($$c((short) 261, (byte) (-bArr23[223]), bArr23[294])));
                                                                                                            declaredMethod.setAccessible(true);
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        ?? invoke6 = declaredMethod.invoke(invoke3, str4, java.lang.Class.class.getMethod($$c((short) ((i234 ^ 256) | (i234 & 256)), (byte) 70, bArr23[48]), null).invoke(com.payair.hce.setWillNotDraw.class, null));
                                                                                                                        if (invoke6 != null) {
                                                                                                                            cls17.getDeclaredMethod($$c((short) 805, bArr23[19], bArr23[726]), new java.lang.Class[0]).invoke(invoke3, new java.lang.Object[0]);
                                                                                                                        }
                                                                                                                        cls2 = invoke6;
                                                                                                                    } catch (java.lang.Throwable th57) {
                                                                                                                        th = th57;
                                                                                                                        th = th;
                                                                                                                        zipFile = zipFile2;
                                                                                                                        zipFile.close();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th58) {
                                                                                                                    th = th58;
                                                                                                                    java.lang.Throwable th59 = th;
                                                                                                                    java.lang.Throwable cause32 = th59.getCause();
                                                                                                                    if (cause32 == null) {
                                                                                                                        throw th59;
                                                                                                                    }
                                                                                                                    throw cause32;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th60) {
                                                                                                                th = th60;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th61) {
                                                                                                            th = th61;
                                                                                                        }
                                                                                                    } else {
                                                                                                        byte[] bArr24 = $$a;
                                                                                                        java.lang.reflect.Method declaredMethod2 = java.lang.Class.forName($$c((short) 261, (byte) (-bArr24[223]), bArr24[294])).getDeclaredMethod($$c((short) ($$b & 967), (byte) (-bArr24[1068]), bArr24[898]), java.lang.String.class);
                                                                                                        try {
                                                                                                            declaredMethod2.setAccessible(true);
                                                                                                            cls2 = declaredMethod2.invoke(invoke3, str4);
                                                                                                        } catch (java.lang.reflect.InvocationTargetException e6) {
                                                                                                            try {
                                                                                                                throw ((java.lang.Exception) e6.getCause());
                                                                                                            } catch (java.lang.ClassNotFoundException unused7) {
                                                                                                                cls2 = null;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (cls2 == null) {
                                                                                                        break;
                                                                                                    }
                                                                                                    cls7 = cls2;
                                                                                                    byte[] bArr25 = $$a;
                                                                                                    try {
                                                                                                        str3 = $$c((short) 126, bArr25[19], bArr25[94]);
                                                                                                        java.lang.reflect.Constructor declaredConstructor2 = cls7.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
                                                                                                        declaredConstructor2.setAccessible(true);
                                                                                                        SdkCoreCardRiskManagementDataImpl = declaredConstructor2.newInstance(invoke3, java.lang.Boolean.valueOf(!z8));
                                                                                                        bArr13 = new byte[27512];
                                                                                                        zipFile4 = zipFile2;
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    java.lang.Object newInstance10 = java.lang.Class.forName($$c((short) 686, (byte) (-bArr25[223]), bArr25[207])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 704, (byte) (-bArr25[223]), bArr25[970]))).newInstance(java.lang.Class.forName($$c((short) 730, (byte) (-bArr25[223]), bArr25[13])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 704, (byte) (-bArr25[223]), bArr25[970]))).newInstance(zipFile4.getInputStream(zipFile4.getEntry($$c((short) 96, bArr25[13], bArr25[7]).substring(1)))));
                                                                                                                    try {
                                                                                                                        java.lang.Class<?> cls18 = java.lang.Class.forName($$c((short) 686, (byte) (-bArr25[223]), bArr25[207]));
                                                                                                                        byte b11 = bArr25[1067];
                                                                                                                        int currentTimeMillis20 = (int) java.lang.System.currentTimeMillis();
                                                                                                                        int i235 = (b11 * (-675)) + 677;
                                                                                                                        int i236 = (currentTimeMillis20 ^ 1) | (currentTimeMillis20 & 1);
                                                                                                                        int i237 = ~b11;
                                                                                                                        int i238 = -(-(((i236 ^ i237) | (i236 & i237)) * (-676)));
                                                                                                                        int i239 = (i235 & i238) + (i238 | i235);
                                                                                                                        int i240 = ~((i237 ^ 1) | (i237 & 1));
                                                                                                                        int i241 = ~currentTimeMillis20;
                                                                                                                        int i242 = ~((i241 ^ 1) | (i241 & 1));
                                                                                                                        int i243 = -(-(((i240 ^ i242) | (i240 & i242)) * 676));
                                                                                                                        int i244 = (i239 & i243) + (i239 | i243);
                                                                                                                        int i245 = ~((i237 ^ (-2)) | (i237 & (-2)));
                                                                                                                        int i246 = ~((i237 ^ i241) | (i237 & i241));
                                                                                                                        int i247 = (i246 & i245) | (i245 ^ i246);
                                                                                                                        int i248 = ~(b11 | 1 | currentTimeMillis20);
                                                                                                                        int i249 = -(-(((i247 ^ i248) | (i247 & i248)) * 676));
                                                                                                                        cls18.getMethod($$c((short) 664, (byte) ((i244 & i249) + (i249 | i244)), bArr25[898]), cls).invoke(newInstance10, bArr13);
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                java.lang.Class.forName($$c((short) 686, (byte) (-bArr25[223]), bArr25[207])).getMethod($$c((short) 805, bArr25[19], bArr25[726]), null).invoke(newInstance10, null);
                                                                                                                                try {
                                                                                                                                    i138 = java.lang.Math.abs(i8);
                                                                                                                                    i137 = 27473;
                                                                                                                                    obj13 = obj18;
                                                                                                                                    i75 = i2;
                                                                                                                                    z = z4;
                                                                                                                                    cls3 = cls;
                                                                                                                                    zipFile5 = zipFile4;
                                                                                                                                } catch (java.lang.Throwable th62) {
                                                                                                                                    th = th62;
                                                                                                                                    th = th;
                                                                                                                                    zipFile = zipFile4;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (java.lang.Throwable th63) {
                                                                                                                                th = th63;
                                                                                                                                java.lang.Throwable th64 = th;
                                                                                                                                java.lang.Throwable cause33 = th64.getCause();
                                                                                                                                if (cause33 == null) {
                                                                                                                                    throw th64;
                                                                                                                                }
                                                                                                                                throw cause33;
                                                                                                                            }
                                                                                                                        } catch (java.lang.Throwable th65) {
                                                                                                                            th = th65;
                                                                                                                        }
                                                                                                                    } catch (java.lang.Throwable th66) {
                                                                                                                        java.lang.Throwable cause34 = th66.getCause();
                                                                                                                        if (cause34 == null) {
                                                                                                                            throw th66;
                                                                                                                        }
                                                                                                                        throw cause34;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th67) {
                                                                                                                    java.lang.Throwable cause35 = th67.getCause();
                                                                                                                    if (cause35 == null) {
                                                                                                                        throw th67;
                                                                                                                    }
                                                                                                                    throw cause35;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th68) {
                                                                                                                java.lang.Throwable cause36 = th68.getCause();
                                                                                                                if (cause36 == null) {
                                                                                                                    throw th68;
                                                                                                                }
                                                                                                                throw cause36;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th69) {
                                                                                                            th = th69;
                                                                                                            zipFile4 = zipFile4;
                                                                                                            th = th;
                                                                                                            zipFile = zipFile4;
                                                                                                            zipFile.close();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th70) {
                                                                                                        th = th70;
                                                                                                        zipFile4 = zipFile2;
                                                                                                        th = th;
                                                                                                        zipFile = zipFile4;
                                                                                                        zipFile.close();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th71) {
                                                                                                    java.lang.Throwable cause37 = th71.getCause();
                                                                                                    if (cause37 == null) {
                                                                                                        throw th71;
                                                                                                    }
                                                                                                    throw cause37;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th72) {
                                                                                                th = th72;
                                                                                                zipFile4 = zipFile2;
                                                                                                th = th;
                                                                                                zipFile = zipFile4;
                                                                                                zipFile.close();
                                                                                                throw th;
                                                                                            }
                                                                                        }
                                                                                    } catch (java.lang.Throwable th73) {
                                                                                        th = th73;
                                                                                        java.lang.Throwable th74 = th;
                                                                                        java.lang.Throwable cause38 = th74.getCause();
                                                                                        if (cause38 == null) {
                                                                                            throw th74;
                                                                                        }
                                                                                        throw cause38;
                                                                                    }
                                                                                } catch (java.lang.Throwable th75) {
                                                                                    th = th75;
                                                                                }
                                                                            } catch (java.lang.Throwable th76) {
                                                                                java.lang.Throwable cause39 = th76.getCause();
                                                                                if (cause39 == null) {
                                                                                    throw th76;
                                                                                }
                                                                                throw cause39;
                                                                            }
                                                                        } catch (java.lang.Throwable th77) {
                                                                            java.lang.Throwable cause40 = th77.getCause();
                                                                            if (cause40 == null) {
                                                                                throw th77;
                                                                            }
                                                                            throw cause40;
                                                                        }
                                                                    } catch (java.lang.Throwable th78) {
                                                                        java.lang.Throwable cause41 = th78.getCause();
                                                                        if (cause41 == null) {
                                                                            throw th78;
                                                                        }
                                                                        throw cause41;
                                                                    }
                                                                } catch (java.lang.Throwable th79) {
                                                                    th = th79;
                                                                    cls = cls3;
                                                                    z4 = z;
                                                                    i2 = i75;
                                                                    zipFile4 = zipFile4;
                                                                }
                                                            } catch (java.lang.Throwable th80) {
                                                                java.lang.Throwable cause42 = th80.getCause();
                                                                if (cause42 == null) {
                                                                    throw th80;
                                                                }
                                                                throw cause42;
                                                            }
                                                        } catch (java.lang.Throwable th81) {
                                                            java.lang.Throwable cause43 = th81.getCause();
                                                            if (cause43 == null) {
                                                                throw th81;
                                                            }
                                                            throw cause43;
                                                        }
                                                    } catch (java.lang.Throwable th82) {
                                                        cls = cls3;
                                                        z4 = z;
                                                        i2 = i75;
                                                        obj5 = th82;
                                                        z10 = r29;
                                                    }
                                                } else {
                                                    cls = cls3;
                                                    r29 = zArr6;
                                                    zArr = zArr7;
                                                    zArr2 = zArr8;
                                                    str = $$c;
                                                    clsArr = clsArr2;
                                                    z3 = z2;
                                                    objArr = objArr2;
                                                    z4 = z;
                                                    i = i75;
                                                    c = c2;
                                                    z5 = false;
                                                    z6 = z12;
                                                }
                                                boolean z13 = z3;
                                                i75 = ((i & 59) + (i | 59)) - 58;
                                                clsArr2 = clsArr;
                                                c2 = c;
                                                z12 = z6;
                                                z2 = z13;
                                                zArr6 = r29;
                                                $$c = str;
                                                zArr7 = zArr;
                                                objArr2 = objArr;
                                                zArr8 = zArr2;
                                                z = z4;
                                                cls3 = cls;
                                                s = 960;
                                            }
                                        }
                                    }
                                    z11 = false;
                                    zArr8[0] = z11;
                                    zArr8[1] = i16 < 21;
                                    zArr8[4] = i16 < 21;
                                    z2 = false;
                                    int i752 = 0;
                                    loop0: while (!z2) {
                                    }
                                }
                                invoke2 = null;
                                char c22 = 970;
                                short s4 = 960;
                                if (invoke != null) {
                                }
                                if (invoke2 == null) {
                                }
                                if (obj2 == null) {
                                    $11 = ($10 + 75) % 128;
                                    byte[] bArr42 = $$a;
                                    obj2 = java.lang.Class.forName($$c((short) 960, (byte) (-bArr42[223]), bArr42[327])).getDeclaredConstructor(java.lang.Class.forName($$c((short) 960, (byte) (-bArr42[223]), bArr42[327])), java.lang.String.class).newInstance(invoke, $$c((short) 911, bArr42[19], bArr42[177]));
                                }
                                java.lang.Object[] objArr22 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName($$c((short) 960, (byte) (-$$a[223]), r10[327])), 7);
                                objArr22[0] = null;
                                objArr22[1] = obj2;
                                objArr22[2] = invoke;
                                objArr22[3] = invoke2;
                                objArr22[4] = obj2;
                                objArr22[5] = invoke;
                                objArr22[6] = invoke2;
                                boolean[] zArr62 = {false, true, true, true, true, true, true};
                                boolean[] zArr72 = {false, false, false, false, true, true, true};
                                boolean[] zArr82 = {false, false, true, true, false, true, true};
                                java.lang.Class<?> cls52 = java.lang.Class.forName($$c((short) 902, r10[36], r10[63]));
                                i16 = cls52.getDeclaredField($$c((short) 879, r10[872], r10[97])).getInt(cls52);
                                if (i16 >= 34) {
                                }
                                if (i16 >= 26) {
                                }
                                z11 = false;
                                zArr82[0] = z11;
                                zArr82[1] = i16 < 21;
                                zArr82[4] = i16 < 21;
                                z2 = false;
                                int i7522 = 0;
                                loop0: while (!z2) {
                                }
                            }
                            obj2 = null;
                            if (obj != null) {
                            }
                            invoke2 = null;
                            char c222 = 970;
                            short s42 = 960;
                            if (invoke != null) {
                            }
                            if (invoke2 == null) {
                            }
                            if (obj2 == null) {
                            }
                            java.lang.Object[] objArr222 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName($$c((short) 960, (byte) (-$$a[223]), r10[327])), 7);
                            objArr222[0] = null;
                            objArr222[1] = obj2;
                            objArr222[2] = invoke;
                            objArr222[3] = invoke2;
                            objArr222[4] = obj2;
                            objArr222[5] = invoke;
                            objArr222[6] = invoke2;
                            boolean[] zArr622 = {false, true, true, true, true, true, true};
                            boolean[] zArr722 = {false, false, false, false, true, true, true};
                            boolean[] zArr822 = {false, false, true, true, false, true, true};
                            java.lang.Class<?> cls522 = java.lang.Class.forName($$c((short) 902, r10[36], r10[63]));
                            i16 = cls522.getDeclaredField($$c((short) 879, r10[872], r10[97])).getInt(cls522);
                            if (i16 >= 34) {
                            }
                            if (i16 >= 26) {
                            }
                            z11 = false;
                            zArr822[0] = z11;
                            zArr822[1] = i16 < 21;
                            zArr822[4] = i16 < 21;
                            z2 = false;
                            int i75222 = 0;
                            loop0: while (!z2) {
                            }
                        }
                        invoke = null;
                        if (obj != null) {
                        }
                        obj2 = null;
                        if (obj != null) {
                        }
                        invoke2 = null;
                        char c2222 = 970;
                        short s422 = 960;
                        if (invoke != null) {
                        }
                        if (invoke2 == null) {
                        }
                        if (obj2 == null) {
                        }
                        java.lang.Object[] objArr2222 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName($$c((short) 960, (byte) (-$$a[223]), r10[327])), 7);
                        objArr2222[0] = null;
                        objArr2222[1] = obj2;
                        objArr2222[2] = invoke;
                        objArr2222[3] = invoke2;
                        objArr2222[4] = obj2;
                        objArr2222[5] = invoke;
                        objArr2222[6] = invoke2;
                        boolean[] zArr6222 = {false, true, true, true, true, true, true};
                        boolean[] zArr7222 = {false, false, false, false, true, true, true};
                        boolean[] zArr8222 = {false, false, true, true, false, true, true};
                        java.lang.Class<?> cls5222 = java.lang.Class.forName($$c((short) 902, r10[36], r10[63]));
                        i16 = cls5222.getDeclaredField($$c((short) 879, r10[872], r10[97])).getInt(cls5222);
                        if (i16 >= 34) {
                        }
                        if (i16 >= 26) {
                        }
                        z11 = false;
                        zArr8222[0] = z11;
                        zArr8222[1] = i16 < 21;
                        zArr8222[4] = i16 < 21;
                        z2 = false;
                        int i752222 = 0;
                        loop0: while (!z2) {
                        }
                    }
                    byte[] bArr26 = $$a;
                    obj = java.lang.Class.forName($$c((short) 1045, bArr26[36], bArr26[289])).getMethod($$c((short) 1024, (byte) 70, bArr26[294]), new java.lang.Class[0]).invoke(null, null);
                    if (obj != null) {
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    obj2 = null;
                    if (obj != null) {
                    }
                    invoke2 = null;
                    char c22222 = 970;
                    short s4222 = 960;
                    if (invoke != null) {
                    }
                    if (invoke2 == null) {
                    }
                    if (obj2 == null) {
                    }
                    java.lang.Object[] objArr22222 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName($$c((short) 960, (byte) (-$$a[223]), r10[327])), 7);
                    objArr22222[0] = null;
                    objArr22222[1] = obj2;
                    objArr22222[2] = invoke;
                    objArr22222[3] = invoke2;
                    objArr22222[4] = obj2;
                    objArr22222[5] = invoke;
                    objArr22222[6] = invoke2;
                    boolean[] zArr62222 = {false, true, true, true, true, true, true};
                    boolean[] zArr72222 = {false, false, false, false, true, true, true};
                    boolean[] zArr82222 = {false, false, true, true, false, true, true};
                    java.lang.Class<?> cls52222 = java.lang.Class.forName($$c((short) 902, r10[36], r10[63]));
                    i16 = cls52222.getDeclaredField($$c((short) 879, r10[872], r10[97])).getInt(cls52222);
                    if (i16 >= 34) {
                    }
                    if (i16 >= 26) {
                    }
                    z11 = false;
                    zArr82222[0] = z11;
                    zArr82222[1] = i16 < 21;
                    zArr82222[4] = i16 < 21;
                    z2 = false;
                    int i7522222 = 0;
                    loop0: while (!z2) {
                    }
                } catch (java.lang.Exception e7) {
                    throw new java.lang.RuntimeException(e7);
                }
            }
        } catch (java.lang.Throwable th83) {
            java.lang.Throwable cause44 = th83.getCause();
            if (cause44 == null) {
                throw th83;
            }
            throw cause44;
        }
    }

    public static int values(int i) {
        int i2 = $11;
        int i3 = i2 & 29;
        int i4 = (i2 | 29) + i3;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        java.lang.Object obj = SdkCoreCardRiskManagementDataImpl;
        $10 = ((i2 ^ 29) + (i3 << 1)) % 128;
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i)};
            byte[] bArr = $$a;
            int intValue = ((java.lang.Integer) java.lang.Class.forName($$c((short) 592, bArr[19], bArr[9]), true, (java.lang.ClassLoader) getCardholderValidators).getMethod($$c(bArr[97], bArr[898], bArr[205]), java.lang.Integer.TYPE).invoke(obj, objArr)).intValue();
            int i5 = $11 + 89;
            $10 = i5 % 128;
            if (i5 % 2 == 0) {
                return intValue;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        int i = $10;
        int i2 = (i & 89) + (i | 89);
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.Object obj2 = SdkCoreCardRiskManagementDataImpl;
        $11 = ((i & 37) + (i | 37)) % 128;
        try {
            byte[] bArr = $$a;
            int intValue = ((java.lang.Integer) java.lang.Class.forName($$c((short) 592, bArr[19], bArr[9]), true, (java.lang.ClassLoader) getCardholderValidators).getMethod($$c(bArr[7], bArr[761], bArr[33]), java.lang.Object.class).invoke(obj2, obj)).intValue();
            int i3 = $10;
            $11 = (((i3 | 15) << 1) - (i3 ^ 15)) % 128;
            return intValue;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        $11 = ($10 + 83) % 128;
        byte[] bArr = new byte[1184];
        java.lang.System.arraycopy("6\u0095\u001a\u009eð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBèÑ\u0000úú\b\u0002ñÿ;¼\få\u0015õô@Ä\u0002û3¹\u000bî\u001aëúý\u001bÜø.ßûø\u0000\u001eÏ\u000eç\u000bø\u0004\u0011ýñÿ<»\få\u0015õôAÃ\u0002ûð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;¼\få\u0015õô@Ä\u0002û3øýùýþÏ1ù\u0002Êú,þÏÿûø9ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<»\få\u0015õôAÃ\u0002û4Êëý\u0007ÿö\u0014óòý\u0004î\u001fêö\bê\fþ\u001dàê\u0010ñÿ<»\få\u0015õôAÃ\u0002û4¸\u000bî\u001aëúý\u001bÜø.ßûø\u0000\u001eÏ\u000eç\u000bø\u0004\u0011ý\u0002\u0006ò\f\u0010êò\u0001\bûû\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;¼\få\u0015õô@Ä\u0002û3¹\u000bî\u001aëúý\u001bÜø-Ï\u000eçPµËëý\u000bîþAÉñÿ;¼\få\u0015õô@Ä\u0002û3÷üÑú-ú\u0003þËý(Ñýý*ûÌ:\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHÒõ\fð\u0001\nê\f\u001fÑþ÷\u0010ûì\u0005\u0004ïý ìå\t\u0005ô÷-àê\u0010\u0014Ô\u0001þØÿûò\bì\u0012þ\u001eßì\u000b\u0011Û\u0000\u0006úú\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 1184);
        $$a = bArr;
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE;
        int i = $10 + 83;
        $11 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static java.lang.Object valueOf(char c, int i, int i2) {
        int i3 = $10;
        int i4 = (i3 ^ 89) + ((i3 & 89) << 1);
        int i5 = i4 % 128;
        $11 = i5;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.Object obj = SdkCoreCardRiskManagementDataImpl;
        $10 = ((i5 ^ 95) + ((i5 & 95) << 1)) % 128;
        try {
            java.lang.Object[] objArr = {java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
            byte[] bArr = $$a;
            java.lang.Object invoke = java.lang.Class.forName($$c((short) 592, bArr[19], bArr[9]), true, (java.lang.ClassLoader) getCardholderValidators).getMethod($$c(bArr[97], bArr[898], bArr[205]), java.lang.Character.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(obj, objArr);
            int i6 = $10;
            $11 = ((i6 & 115) + (i6 | 115)) % 128;
            return invoke;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0097 -> B:6:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, byte b, int i) {
        int i2;
        int i3;
        int i4 = $11;
        $10 = (i4 + 115) % 128;
        int i5 = -i;
        int i6 = (i5 & 41) + (i5 | 41);
        byte[] bArr = $$a;
        int i7 = (b & 71) + (b | 71);
        int i8 = (i7 & (-38)) + (i7 | (-38));
        int i9 = -s;
        int i10 = (i9 * (-518)) - 603470;
        int i11 = ~i9;
        int i12 = ~i;
        int i13 = (i11 ^ i12) | (i11 & i12);
        int i14 = -(-(((~i13) | 1165) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
        int i15 = (i10 & i14) + (i10 | i14);
        int i16 = ~((i13 & 1165) | (i13 ^ 1165));
        int i17 = (i9 ^ 1165) | (i9 & 1165);
        int i18 = ~((i17 ^ i) | (i17 & i));
        int i19 = -(-(((i16 ^ i18) | (i16 & i18)) * (-519)));
        int i20 = (i15 ^ i19) + ((i19 & i15) << 1);
        int i21 = ~((i ^ 1165) | (i & 1165));
        int i22 = ((i9 ^ i21) | (i9 & i21)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
        int i23 = (i20 & i22) + (i22 | i20);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i24 = (i4 ^ 35) + ((i4 & 35) << 1);
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            int i25 = i23;
            i2 = 0;
            int i26 = -i23;
            int i27 = i26 * 567;
            int i28 = i8 * (-565);
            int i29 = (i27 & i28) + (i27 | i28);
            int i30 = ~i26;
            int i31 = ~((i30 ^ i8) | (i30 & i8));
            int i32 = ~((i30 ^ i) | (i30 & i));
            int i33 = ((i31 ^ i32) | (i31 & i32)) * (-566);
            int i34 = ~i8;
            int i35 = -(-((~(i26 | i34)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
            int i36 = (i34 ^ i30) | (i34 & i30);
            int i37 = ((((i29 & i33) + (i33 | i29)) - (~i35)) - 1) + ((~((i36 ^ i) | (i36 & i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST);
            i8 = (i37 & (-3)) + (i37 | (-3));
            i23 = i25 + 1;
            int i38 = $11;
            $10 = ((i38 & 111) + (i38 | 111)) % 128;
            int i39 = (i2 ^ (-35)) + ((i2 & (-35)) << 1);
            i3 = ((i39 | 36) << 1) - (i39 ^ 36);
            bArr2[i2] = (byte) i8;
            if (i3 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            byte b2 = bArr[i23];
            $10 = ($11 + 15) % 128;
            i25 = i23;
            i23 = b2;
            i2 = i3;
            int i262 = -i23;
            int i272 = i262 * 567;
            int i282 = i8 * (-565);
            int i292 = (i272 & i282) + (i272 | i282);
            int i302 = ~i262;
            int i312 = ~((i302 ^ i8) | (i302 & i8));
            int i322 = ~((i302 ^ i) | (i302 & i));
            int i332 = ((i312 ^ i322) | (i312 & i322)) * (-566);
            int i342 = ~i8;
            int i352 = -(-((~(i262 | i342)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
            int i362 = (i342 ^ i302) | (i342 & i302);
            int i372 = ((((i292 & i332) + (i332 | i292)) - (~i352)) - 1) + ((~((i362 ^ i) | (i362 & i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST);
            i8 = (i372 & (-3)) + (i372 | (-3));
            i23 = i25 + 1;
            int i382 = $11;
            $10 = ((i382 & 111) + (i382 | 111)) % 128;
            int i392 = (i2 ^ (-35)) + ((i2 & (-35)) << 1);
            i3 = ((i392 | 36) << 1) - (i392 ^ 36);
            bArr2[i2] = (byte) i8;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i3922 = (i2 ^ (-35)) + ((i2 & (-35)) << 1);
            i3 = ((i3922 | 36) << 1) - (i3922 ^ 36);
            bArr2[i2] = (byte) i8;
            if (i3 == i6) {
            }
        }
    }

    private setWillNotDraw() {
    }
}
