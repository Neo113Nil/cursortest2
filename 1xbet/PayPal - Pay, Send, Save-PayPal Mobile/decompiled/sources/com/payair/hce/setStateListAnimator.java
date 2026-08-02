package com.payair.hce;

/* loaded from: classes4.dex */
final class setStateListAnimator extends android.content.BroadcastReceiver {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static long valueOf;
    private static int values;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = (s2 * 2) + 107;
        int i4 = s + 4;
        int i5 = i * 3;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            int i8 = 0;
            int i9 = i4 + i6;
            i2 = i8;
            int i10 = i7;
            i3 = i9;
            i4 = i10;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4 + 1;
            int i12 = i3;
            i7 = i11;
            i4 = bArr[i11];
            i6 = i12;
            int i92 = i4 + i6;
            i2 = i8;
            int i102 = i7;
            i3 = i92;
            i4 = i102;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = s + 4;
        int i5 = b + 6;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        ?? r9 = 119 - s2;
        if (bArr == null) {
            byte b2 = r9;
            i3 = 0;
            i2 = i4;
            i4 = (i4 + (-b2)) - 2;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i2];
            i4 = (i4 + (-b2)) - 2;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i2 = i4;
            i4 = r9;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 475 - i;
        ?? r6 = s + 65;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[b + 6];
        int i5 = b + 5;
        if (bArr == null) {
            byte b2 = r6;
            int i6 = i5;
            i2 = 0;
            i3 = i6 + (-b2) + 7;
            i4++;
            bArr2[i2] = i3 == true ? (byte) 1 : (byte) 0;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i4];
            i2++;
            i6 = i3;
            i3 = i6 + (-b2) + 7;
            i4++;
            bArr2[i2] = i3 == true ? (byte) 1 : (byte) 0;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = r6;
            i4++;
            bArr2[i2] = i3 == true ? (byte) 1 : (byte) 0;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    setStateListAnimator() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x2bfc, code lost:
    
        if ((r4 + 1897) >= ((java.lang.Long) java.lang.Class.forName(r9).getDeclaredMethod(r10, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x2427, code lost:
    
        if ((r5 + 4611686018427387953L) >= ((java.lang.Long) java.lang.Class.forName(r9).getDeclaredMethod(r10, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L342;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x177d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x1bbc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x1d69  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x2117  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x23d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x26ce  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x2736  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x29f1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x2bad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0455 A[Catch: all -> 0x3187, TryCatch #4 {all -> 0x3187, blocks: (B:11:0x0195, B:13:0x01b6, B:14:0x0218, B:16:0x0446, B:18:0x0455, B:19:0x0486, B:21:0x04a4, B:22:0x04d9, B:24:0x04e8, B:26:0x04f7, B:27:0x0529, B:29:0x0555, B:30:0x05b8, B:39:0x07dc, B:41:0x07fd, B:42:0x083c, B:43:0x08f4, B:49:0x0aa2, B:51:0x0abf, B:52:0x0b01, B:65:0x0e1f, B:67:0x0e40, B:68:0x0e86, B:75:0x102d, B:77:0x1049, B:78:0x108b, B:86:0x12af, B:88:0x12d0, B:89:0x130f, B:96:0x157d, B:98:0x159a, B:99:0x15da, B:108:0x18c2, B:110:0x18e3, B:111:0x1928, B:112:0x19e2, B:118:0x1bc4, B:120:0x1be0, B:121:0x1c1d, B:132:0x1ec6, B:134:0x1ee7, B:135:0x1f26, B:136:0x1fd1, B:143:0x2134, B:145:0x2150, B:146:0x2192, B:155:0x2465, B:157:0x2486, B:158:0x24c8, B:170:0x27ac, B:172:0x27cd, B:173:0x280f, B:174:0x28c5, B:179:0x2a06, B:181:0x2a23, B:182:0x2a63, B:194:0x2c46, B:196:0x2c67, B:197:0x2ca6, B:204:0x2f39, B:206:0x2f56, B:207:0x2f97, B:211:0x2fa8, B:213:0x2fc5, B:214:0x3002, B:219:0x30be, B:221:0x30db, B:222:0x311c, B:233:0x2ce5, B:235:0x2d0a, B:236:0x2d5c, B:252:0x2b08, B:254:0x2b25, B:255:0x2b67, B:258:0x285d, B:260:0x287e, B:261:0x28be, B:263:0x28eb, B:265:0x2906, B:266:0x293f, B:306:0x21a3, B:308:0x21c0, B:309:0x2206, B:311:0x2213, B:313:0x2226, B:314:0x225e, B:316:0x2268, B:318:0x227b, B:319:0x22b5, B:323:0x2334, B:325:0x2351, B:326:0x2392, B:328:0x1f6f, B:330:0x1f90, B:331:0x1fca, B:349:0x1cad, B:351:0x1cc9, B:352:0x1d0b, B:355:0x1978, B:357:0x1999, B:358:0x19db, B:376:0x15e9, B:378:0x1606, B:379:0x1643, B:383:0x16dc, B:385:0x16f9, B:386:0x1737, B:390:0x133a, B:392:0x135c, B:393:0x13b0, B:402:0x109b, B:404:0x10b8, B:405:0x10fa, B:409:0x1174, B:411:0x1191, B:412:0x11d2, B:439:0x0b84, B:441:0x0ba1, B:442:0x0bdc, B:444:0x088b, B:446:0x08ac, B:447:0x08ed, B:472:0x0657, B:474:0x0666, B:475:0x0698, B:477:0x06c4, B:478:0x0724, B:480:0x026c, B:482:0x028d, B:483:0x02ee, B:487:0x0321, B:489:0x0343, B:490:0x03a1), top: B:2:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x2e1d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x3009  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x04a4 A[Catch: all -> 0x3187, TryCatch #4 {all -> 0x3187, blocks: (B:11:0x0195, B:13:0x01b6, B:14:0x0218, B:16:0x0446, B:18:0x0455, B:19:0x0486, B:21:0x04a4, B:22:0x04d9, B:24:0x04e8, B:26:0x04f7, B:27:0x0529, B:29:0x0555, B:30:0x05b8, B:39:0x07dc, B:41:0x07fd, B:42:0x083c, B:43:0x08f4, B:49:0x0aa2, B:51:0x0abf, B:52:0x0b01, B:65:0x0e1f, B:67:0x0e40, B:68:0x0e86, B:75:0x102d, B:77:0x1049, B:78:0x108b, B:86:0x12af, B:88:0x12d0, B:89:0x130f, B:96:0x157d, B:98:0x159a, B:99:0x15da, B:108:0x18c2, B:110:0x18e3, B:111:0x1928, B:112:0x19e2, B:118:0x1bc4, B:120:0x1be0, B:121:0x1c1d, B:132:0x1ec6, B:134:0x1ee7, B:135:0x1f26, B:136:0x1fd1, B:143:0x2134, B:145:0x2150, B:146:0x2192, B:155:0x2465, B:157:0x2486, B:158:0x24c8, B:170:0x27ac, B:172:0x27cd, B:173:0x280f, B:174:0x28c5, B:179:0x2a06, B:181:0x2a23, B:182:0x2a63, B:194:0x2c46, B:196:0x2c67, B:197:0x2ca6, B:204:0x2f39, B:206:0x2f56, B:207:0x2f97, B:211:0x2fa8, B:213:0x2fc5, B:214:0x3002, B:219:0x30be, B:221:0x30db, B:222:0x311c, B:233:0x2ce5, B:235:0x2d0a, B:236:0x2d5c, B:252:0x2b08, B:254:0x2b25, B:255:0x2b67, B:258:0x285d, B:260:0x287e, B:261:0x28be, B:263:0x28eb, B:265:0x2906, B:266:0x293f, B:306:0x21a3, B:308:0x21c0, B:309:0x2206, B:311:0x2213, B:313:0x2226, B:314:0x225e, B:316:0x2268, B:318:0x227b, B:319:0x22b5, B:323:0x2334, B:325:0x2351, B:326:0x2392, B:328:0x1f6f, B:330:0x1f90, B:331:0x1fca, B:349:0x1cad, B:351:0x1cc9, B:352:0x1d0b, B:355:0x1978, B:357:0x1999, B:358:0x19db, B:376:0x15e9, B:378:0x1606, B:379:0x1643, B:383:0x16dc, B:385:0x16f9, B:386:0x1737, B:390:0x133a, B:392:0x135c, B:393:0x13b0, B:402:0x109b, B:404:0x10b8, B:405:0x10fa, B:409:0x1174, B:411:0x1191, B:412:0x11d2, B:439:0x0b84, B:441:0x0ba1, B:442:0x0bdc, B:444:0x088b, B:446:0x08ac, B:447:0x08ed, B:472:0x0657, B:474:0x0666, B:475:0x0698, B:477:0x06c4, B:478:0x0724, B:480:0x026c, B:482:0x028d, B:483:0x02ee, B:487:0x0321, B:489:0x0343, B:490:0x03a1), top: B:2:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x316d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x316e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x2d0a A[Catch: all -> 0x3187, TryCatch #4 {all -> 0x3187, blocks: (B:11:0x0195, B:13:0x01b6, B:14:0x0218, B:16:0x0446, B:18:0x0455, B:19:0x0486, B:21:0x04a4, B:22:0x04d9, B:24:0x04e8, B:26:0x04f7, B:27:0x0529, B:29:0x0555, B:30:0x05b8, B:39:0x07dc, B:41:0x07fd, B:42:0x083c, B:43:0x08f4, B:49:0x0aa2, B:51:0x0abf, B:52:0x0b01, B:65:0x0e1f, B:67:0x0e40, B:68:0x0e86, B:75:0x102d, B:77:0x1049, B:78:0x108b, B:86:0x12af, B:88:0x12d0, B:89:0x130f, B:96:0x157d, B:98:0x159a, B:99:0x15da, B:108:0x18c2, B:110:0x18e3, B:111:0x1928, B:112:0x19e2, B:118:0x1bc4, B:120:0x1be0, B:121:0x1c1d, B:132:0x1ec6, B:134:0x1ee7, B:135:0x1f26, B:136:0x1fd1, B:143:0x2134, B:145:0x2150, B:146:0x2192, B:155:0x2465, B:157:0x2486, B:158:0x24c8, B:170:0x27ac, B:172:0x27cd, B:173:0x280f, B:174:0x28c5, B:179:0x2a06, B:181:0x2a23, B:182:0x2a63, B:194:0x2c46, B:196:0x2c67, B:197:0x2ca6, B:204:0x2f39, B:206:0x2f56, B:207:0x2f97, B:211:0x2fa8, B:213:0x2fc5, B:214:0x3002, B:219:0x30be, B:221:0x30db, B:222:0x311c, B:233:0x2ce5, B:235:0x2d0a, B:236:0x2d5c, B:252:0x2b08, B:254:0x2b25, B:255:0x2b67, B:258:0x285d, B:260:0x287e, B:261:0x28be, B:263:0x28eb, B:265:0x2906, B:266:0x293f, B:306:0x21a3, B:308:0x21c0, B:309:0x2206, B:311:0x2213, B:313:0x2226, B:314:0x225e, B:316:0x2268, B:318:0x227b, B:319:0x22b5, B:323:0x2334, B:325:0x2351, B:326:0x2392, B:328:0x1f6f, B:330:0x1f90, B:331:0x1fca, B:349:0x1cad, B:351:0x1cc9, B:352:0x1d0b, B:355:0x1978, B:357:0x1999, B:358:0x19db, B:376:0x15e9, B:378:0x1606, B:379:0x1643, B:383:0x16dc, B:385:0x16f9, B:386:0x1737, B:390:0x133a, B:392:0x135c, B:393:0x13b0, B:402:0x109b, B:404:0x10b8, B:405:0x10fa, B:409:0x1174, B:411:0x1191, B:412:0x11d2, B:439:0x0b84, B:441:0x0ba1, B:442:0x0bdc, B:444:0x088b, B:446:0x08ac, B:447:0x08ed, B:472:0x0657, B:474:0x0666, B:475:0x0698, B:477:0x06c4, B:478:0x0724, B:480:0x026c, B:482:0x028d, B:483:0x02ee, B:487:0x0321, B:489:0x0343, B:490:0x03a1), top: B:2:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x2a85  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x04e8 A[Catch: all -> 0x3187, TryCatch #4 {all -> 0x3187, blocks: (B:11:0x0195, B:13:0x01b6, B:14:0x0218, B:16:0x0446, B:18:0x0455, B:19:0x0486, B:21:0x04a4, B:22:0x04d9, B:24:0x04e8, B:26:0x04f7, B:27:0x0529, B:29:0x0555, B:30:0x05b8, B:39:0x07dc, B:41:0x07fd, B:42:0x083c, B:43:0x08f4, B:49:0x0aa2, B:51:0x0abf, B:52:0x0b01, B:65:0x0e1f, B:67:0x0e40, B:68:0x0e86, B:75:0x102d, B:77:0x1049, B:78:0x108b, B:86:0x12af, B:88:0x12d0, B:89:0x130f, B:96:0x157d, B:98:0x159a, B:99:0x15da, B:108:0x18c2, B:110:0x18e3, B:111:0x1928, B:112:0x19e2, B:118:0x1bc4, B:120:0x1be0, B:121:0x1c1d, B:132:0x1ec6, B:134:0x1ee7, B:135:0x1f26, B:136:0x1fd1, B:143:0x2134, B:145:0x2150, B:146:0x2192, B:155:0x2465, B:157:0x2486, B:158:0x24c8, B:170:0x27ac, B:172:0x27cd, B:173:0x280f, B:174:0x28c5, B:179:0x2a06, B:181:0x2a23, B:182:0x2a63, B:194:0x2c46, B:196:0x2c67, B:197:0x2ca6, B:204:0x2f39, B:206:0x2f56, B:207:0x2f97, B:211:0x2fa8, B:213:0x2fc5, B:214:0x3002, B:219:0x30be, B:221:0x30db, B:222:0x311c, B:233:0x2ce5, B:235:0x2d0a, B:236:0x2d5c, B:252:0x2b08, B:254:0x2b25, B:255:0x2b67, B:258:0x285d, B:260:0x287e, B:261:0x28be, B:263:0x28eb, B:265:0x2906, B:266:0x293f, B:306:0x21a3, B:308:0x21c0, B:309:0x2206, B:311:0x2213, B:313:0x2226, B:314:0x225e, B:316:0x2268, B:318:0x227b, B:319:0x22b5, B:323:0x2334, B:325:0x2351, B:326:0x2392, B:328:0x1f6f, B:330:0x1f90, B:331:0x1fca, B:349:0x1cad, B:351:0x1cc9, B:352:0x1d0b, B:355:0x1978, B:357:0x1999, B:358:0x19db, B:376:0x15e9, B:378:0x1606, B:379:0x1643, B:383:0x16dc, B:385:0x16f9, B:386:0x1737, B:390:0x133a, B:392:0x135c, B:393:0x13b0, B:402:0x109b, B:404:0x10b8, B:405:0x10fa, B:409:0x1174, B:411:0x1191, B:412:0x11d2, B:439:0x0b84, B:441:0x0ba1, B:442:0x0bdc, B:444:0x088b, B:446:0x08ac, B:447:0x08ed, B:472:0x0657, B:474:0x0666, B:475:0x0698, B:477:0x06c4, B:478:0x0724, B:480:0x026c, B:482:0x028d, B:483:0x02ee, B:487:0x0321, B:489:0x0343, B:490:0x03a1), top: B:2:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x2906 A[Catch: all -> 0x3187, TryCatch #4 {all -> 0x3187, blocks: (B:11:0x0195, B:13:0x01b6, B:14:0x0218, B:16:0x0446, B:18:0x0455, B:19:0x0486, B:21:0x04a4, B:22:0x04d9, B:24:0x04e8, B:26:0x04f7, B:27:0x0529, B:29:0x0555, B:30:0x05b8, B:39:0x07dc, B:41:0x07fd, B:42:0x083c, B:43:0x08f4, B:49:0x0aa2, B:51:0x0abf, B:52:0x0b01, B:65:0x0e1f, B:67:0x0e40, B:68:0x0e86, B:75:0x102d, B:77:0x1049, B:78:0x108b, B:86:0x12af, B:88:0x12d0, B:89:0x130f, B:96:0x157d, B:98:0x159a, B:99:0x15da, B:108:0x18c2, B:110:0x18e3, B:111:0x1928, B:112:0x19e2, B:118:0x1bc4, B:120:0x1be0, B:121:0x1c1d, B:132:0x1ec6, B:134:0x1ee7, B:135:0x1f26, B:136:0x1fd1, B:143:0x2134, B:145:0x2150, B:146:0x2192, B:155:0x2465, B:157:0x2486, B:158:0x24c8, B:170:0x27ac, B:172:0x27cd, B:173:0x280f, B:174:0x28c5, B:179:0x2a06, B:181:0x2a23, B:182:0x2a63, B:194:0x2c46, B:196:0x2c67, B:197:0x2ca6, B:204:0x2f39, B:206:0x2f56, B:207:0x2f97, B:211:0x2fa8, B:213:0x2fc5, B:214:0x3002, B:219:0x30be, B:221:0x30db, B:222:0x311c, B:233:0x2ce5, B:235:0x2d0a, B:236:0x2d5c, B:252:0x2b08, B:254:0x2b25, B:255:0x2b67, B:258:0x285d, B:260:0x287e, B:261:0x28be, B:263:0x28eb, B:265:0x2906, B:266:0x293f, B:306:0x21a3, B:308:0x21c0, B:309:0x2206, B:311:0x2213, B:313:0x2226, B:314:0x225e, B:316:0x2268, B:318:0x227b, B:319:0x22b5, B:323:0x2334, B:325:0x2351, B:326:0x2392, B:328:0x1f6f, B:330:0x1f90, B:331:0x1fca, B:349:0x1cad, B:351:0x1cc9, B:352:0x1d0b, B:355:0x1978, B:357:0x1999, B:358:0x19db, B:376:0x15e9, B:378:0x1606, B:379:0x1643, B:383:0x16dc, B:385:0x16f9, B:386:0x1737, B:390:0x133a, B:392:0x135c, B:393:0x13b0, B:402:0x109b, B:404:0x10b8, B:405:0x10fa, B:409:0x1174, B:411:0x1191, B:412:0x11d2, B:439:0x0b84, B:441:0x0ba1, B:442:0x0bdc, B:444:0x088b, B:446:0x08ac, B:447:0x08ed, B:472:0x0657, B:474:0x0666, B:475:0x0698, B:477:0x06c4, B:478:0x0724, B:480:0x026c, B:482:0x028d, B:483:0x02ee, B:487:0x0321, B:489:0x0343, B:490:0x03a1), top: B:2:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x24e6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x2593  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x2502  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x220e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x1fdb  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x1fe0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x1c36  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x19ec  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1b03  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x1ba8  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x19fc  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x165a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x135c A[Catch: all -> 0x3187, TryCatch #4 {all -> 0x3187, blocks: (B:11:0x0195, B:13:0x01b6, B:14:0x0218, B:16:0x0446, B:18:0x0455, B:19:0x0486, B:21:0x04a4, B:22:0x04d9, B:24:0x04e8, B:26:0x04f7, B:27:0x0529, B:29:0x0555, B:30:0x05b8, B:39:0x07dc, B:41:0x07fd, B:42:0x083c, B:43:0x08f4, B:49:0x0aa2, B:51:0x0abf, B:52:0x0b01, B:65:0x0e1f, B:67:0x0e40, B:68:0x0e86, B:75:0x102d, B:77:0x1049, B:78:0x108b, B:86:0x12af, B:88:0x12d0, B:89:0x130f, B:96:0x157d, B:98:0x159a, B:99:0x15da, B:108:0x18c2, B:110:0x18e3, B:111:0x1928, B:112:0x19e2, B:118:0x1bc4, B:120:0x1be0, B:121:0x1c1d, B:132:0x1ec6, B:134:0x1ee7, B:135:0x1f26, B:136:0x1fd1, B:143:0x2134, B:145:0x2150, B:146:0x2192, B:155:0x2465, B:157:0x2486, B:158:0x24c8, B:170:0x27ac, B:172:0x27cd, B:173:0x280f, B:174:0x28c5, B:179:0x2a06, B:181:0x2a23, B:182:0x2a63, B:194:0x2c46, B:196:0x2c67, B:197:0x2ca6, B:204:0x2f39, B:206:0x2f56, B:207:0x2f97, B:211:0x2fa8, B:213:0x2fc5, B:214:0x3002, B:219:0x30be, B:221:0x30db, B:222:0x311c, B:233:0x2ce5, B:235:0x2d0a, B:236:0x2d5c, B:252:0x2b08, B:254:0x2b25, B:255:0x2b67, B:258:0x285d, B:260:0x287e, B:261:0x28be, B:263:0x28eb, B:265:0x2906, B:266:0x293f, B:306:0x21a3, B:308:0x21c0, B:309:0x2206, B:311:0x2213, B:313:0x2226, B:314:0x225e, B:316:0x2268, B:318:0x227b, B:319:0x22b5, B:323:0x2334, B:325:0x2351, B:326:0x2392, B:328:0x1f6f, B:330:0x1f90, B:331:0x1fca, B:349:0x1cad, B:351:0x1cc9, B:352:0x1d0b, B:355:0x1978, B:357:0x1999, B:358:0x19db, B:376:0x15e9, B:378:0x1606, B:379:0x1643, B:383:0x16dc, B:385:0x16f9, B:386:0x1737, B:390:0x133a, B:392:0x135c, B:393:0x13b0, B:402:0x109b, B:404:0x10b8, B:405:0x10fa, B:409:0x1174, B:411:0x1191, B:412:0x11d2, B:439:0x0b84, B:441:0x0ba1, B:442:0x0bdc, B:444:0x088b, B:446:0x08ac, B:447:0x08ed, B:472:0x0657, B:474:0x0666, B:475:0x0698, B:477:0x06c4, B:478:0x0724, B:480:0x026c, B:482:0x028d, B:483:0x02ee, B:487:0x0321, B:489:0x0343, B:490:0x03a1), top: B:2:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x1102  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0f49  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x1001  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0ebb  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0dab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x1013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x1228  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x1455  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i;
        com.payair.hce.setStateListAnimator setstatelistanimator;
        java.lang.Object invoke;
        java.lang.String str;
        byte b;
        java.lang.Object obj;
        int intValue;
        java.lang.Object obj2;
        int intValue2;
        byte b2;
        java.lang.String str2;
        java.lang.Throwable cause;
        long j;
        int i2;
        android.content.Context context;
        java.lang.Integer num;
        java.lang.String str3;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        int i3;
        int i4;
        java.lang.String str4;
        java.lang.String str5;
        long j2;
        java.lang.String str6;
        java.lang.Object obj3;
        android.content.Context context2;
        java.lang.String str7;
        java.lang.Object[] objArr4;
        int i5;
        long j3;
        java.lang.Object obj4;
        java.lang.Object[] objArr5;
        char c;
        char c2;
        int i6;
        int i7;
        byte b3;
        java.lang.String str8;
        long j4;
        int i8;
        android.content.Context context3;
        java.lang.String str9;
        java.lang.Object[] objArr6;
        java.lang.Object[] objArr7;
        int i9;
        long j5;
        java.lang.String str10;
        char c3;
        char c4;
        java.lang.Object[] objArr8;
        int i10;
        int i11;
        long j6;
        java.lang.Object obj5;
        android.content.Context context4;
        java.lang.Object[] objArr9;
        java.lang.reflect.Field field;
        java.lang.Long valueOf2;
        long j7;
        java.lang.String str11;
        java.lang.Object obj6;
        char c5;
        java.lang.Object[] objArr10;
        char c6;
        int i12;
        int i13;
        long j8;
        java.lang.Object obj7;
        java.lang.Object[] objArr11;
        char c7;
        int i14;
        int i15;
        int i16;
        java.lang.Object invoke2;
        int i17;
        java.lang.Object invoke3;
        java.lang.Object invoke4;
        java.lang.Object invoke5;
        byte b4;
        java.lang.String str12;
        com.payair.hce.setStateListAnimator setstatelistanimator2 = (com.payair.hce.setStateListAnimator) objArr[0];
        android.content.Context context5 = (android.content.Context) objArr[1];
        android.content.Intent intent = (android.content.Intent) objArr[2];
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001", true, new int[]{0, 22, 84, 9}, objArr12);
        java.lang.String str13 = (java.lang.String) objArr12[0];
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", false, new int[]{22, 15, 0, 10}, objArr13);
        java.lang.String str14 = (java.lang.String) objArr13[0];
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        b("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", true, new int[]{37, 16, 43, 6}, objArr14);
        java.lang.String str15 = (java.lang.String) objArr14[0];
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        b("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{53, 16, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 0}, objArr15);
        java.lang.String str16 = (java.lang.String) objArr15[0];
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        c("꣠ꢁꍈ焊\ue40b\ue507Ｔヲ됻샀\uda60ᜒ釫⎲뚦\ueb9cﺙ㹯锈캊\uda73\u1ada灎괤✁疁沠", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr16);
        java.lang.String str17 = (java.lang.String) objArr16[0];
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 754 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45559));
        byte[] bArr = $$a;
        byte b5 = bArr[50];
        byte b6 = (byte) (b5 | com.google.common.base.Ascii.GS);
        int i18 = $$b;
        byte b7 = (byte) (i18 >>> 2);
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        d(b5, b6, b7, objArr17);
        long j9 = cls.getField((java.lang.String) objArr17[0]).getLong(null);
        try {
            try {
                try {
                    try {
                        if (j9 != -1) {
                            int i19 = DigitizedCardProfile;
                            int i20 = i19 ^ 121;
                            int i21 = ((i19 & 121) | i20) << 1;
                            int i22 = -i20;
                            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                            values = i23 % 128;
                            if (i23 % 2 == 0 ? j9 + 4611686018427387769L >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j9 * 4611686018427387769L >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue()) {
                                int i24 = values;
                                int i25 = i24 & 31;
                                int i26 = (((i24 | 31) & (~i25)) - (~(-(-(i25 << 1))))) - 1;
                                DigitizedCardProfile = i26 % 128;
                                if (i26 % 2 == 0) {
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 754 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.graphics.Color.alpha(0) + 45560));
                                    i = i18;
                                    b4 = b7;
                                    str12 = str14;
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    d(bArr[85], bArr[19], bArr[50], objArr18);
                                    java.lang.Object[] objArr19 = {cls2.getField((java.lang.String) objArr18[0]).get(null), -2013076648, 1};
                                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj8 == null) {
                                        obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4789, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 40, 4750 - android.view.KeyEvent.getDeadChar(0, 0), (char) (33701 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj8);
                                    }
                                    invoke = ((java.lang.reflect.Method) obj8).invoke(null, objArr19);
                                } else {
                                    i = i18;
                                    b4 = b7;
                                    str12 = str14;
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 754, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45561));
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    d(bArr[85], bArr[19], bArr[50], objArr20);
                                    java.lang.Object[] objArr21 = {cls3.getField((java.lang.String) objArr20[0]).get(null), -2013076648, 0};
                                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj9 == null) {
                                        obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, android.view.View.combineMeasuredStates(0, 0) + 4790, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 4750, (char) (33701 - android.widget.ExpandableListView.getPackedPositionType(0L))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj9);
                                    }
                                    invoke = ((java.lang.reflect.Method) obj9).invoke(null, objArr21);
                                }
                                setstatelistanimator = setstatelistanimator2;
                                b = b4;
                                str = str12;
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                if (obj == null) {
                                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 40, android.graphics.Color.blue(0) + 4750, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33653))).getMethod("values", null);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj);
                                }
                                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(invoke, null)).intValue();
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 4750, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 33701))).getMethod("DigitizedCardProfile", null);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj2);
                                }
                                intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                                if (intValue2 != intValue) {
                                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                    if (obj10 == null) {
                                        obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 4750, (char) (33701 - android.graphics.Color.blue(0)))).getMethod("valueOf", null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj10);
                                    }
                                    java.lang.Object[] objArr22 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(invoke, null)).intValue()), 0};
                                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj11 == null) {
                                        b2 = b;
                                        obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4790, (char) (31152 - android.graphics.Color.red(0)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 4750 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (33701 - android.text.TextUtils.getOffsetBefore("", 0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj11);
                                    } else {
                                        b2 = b;
                                    }
                                    ((java.lang.reflect.Method) obj11).invoke(null, objArr22);
                                    values = (DigitizedCardProfile + 31) % 128;
                                    str2 = str16;
                                } else {
                                    b2 = b;
                                    long j10 = (intValue & (~intValue2)) | ((~intValue) & intValue2);
                                    int i27 = DigitizedCardProfile;
                                    int i28 = (i27 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i27) & 109);
                                    int i29 = (i27 & 109) << 1;
                                    values = ((i28 ^ i29) + ((i28 & i29) << 1)) % 128;
                                    values = (i27 + 105) % 128;
                                    try {
                                        java.lang.Object[] objArr23 = {java.lang.Long.valueOf(j10 ^ 8285747944192212992L), 1929178075L};
                                        str2 = str16;
                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                        e(472, (byte) (-$$d[243]), r3[19], objArr24);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        e(446, r3[198], r3[172], objArr25);
                                        cls4.getMethod((java.lang.String) objArr25[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr23);
                                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                        if (obj12 == null) {
                                            obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 4750, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33701))).getMethod("valueOf", null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj12);
                                        }
                                        java.lang.Object[] objArr26 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(invoke, null)).intValue()), 0};
                                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                        if (obj13 == null) {
                                            obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4790, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 40, 4750 - (android.os.Process.myPid() >> 22), (char) (33701 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj13);
                                        }
                                        ((java.lang.reflect.Method) obj13).invoke(null, objArr26);
                                    } catch (java.lang.Throwable th) {
                                        cause = th.getCause();
                                        if (cause == null) {
                                        }
                                    }
                                }
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 51, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 583, (char) (android.text.TextUtils.indexOf("", "") + 24291));
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                d((byte) (-bArr[4]), bArr[0], (short) 51, objArr27);
                                j = cls5.getField((java.lang.String) objArr27[0]).getLong(null);
                                try {
                                    if (j != -1 || j + 1958 < ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                        i2 = i;
                                        if (context5 == null) {
                                            int i30 = (-2) - (~(DigitizedCardProfile + 126));
                                            values = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                context5.getApplicationContext();
                                                throw new java.lang.ArithmeticException();
                                            }
                                            context = context5.getApplicationContext();
                                            int i31 = DigitizedCardProfile;
                                            int i32 = (((i31 | 20) << 1) - (i31 ^ 20)) - 1;
                                            values = i32 % 128;
                                            int i33 = i32 % 2;
                                        } else {
                                            context = context5;
                                        }
                                        java.lang.String str18 = str2;
                                        int intValue3 = ((java.lang.Integer) java.lang.Class.forName(str15).getMethod(str18, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                                        DigitizedCardProfile = (values + 19) % 128;
                                        java.lang.Object[] objArr28 = {context, java.lang.Integer.valueOf(intValue3), -829557893};
                                        byte[] bArr2 = $$d;
                                        num = 1;
                                        str3 = str18;
                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                        e(435, (byte) (-bArr2[243]), bArr2[72], objArr29);
                                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                        e(407, (byte) (bArr2[198] - 1), bArr2[106], objArr30);
                                        java.lang.Object[] objArr31 = (java.lang.Object[]) cls6.getMethod((java.lang.String) objArr30[0], java.lang.Class.forName(str17), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr28);
                                        if (context == null) {
                                            int i34 = values;
                                            int i35 = i34 & 19;
                                            DigitizedCardProfile = ((i35 - (~((i34 ^ 19) | i35))) - 1) % 128;
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 51, 584 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (24291 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                            d((byte) (i2 & 352), bArr[50], bArr[63], objArr32);
                                            cls7.getField((java.lang.String) objArr32[0]).set(null, objArr31);
                                            try {
                                                long longValue = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 51, 583 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24290));
                                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                d((byte) (-bArr[4]), bArr[0], (short) 51, objArr33);
                                                cls8.getField((java.lang.String) objArr33[0]).set(null, java.lang.Long.valueOf(longValue));
                                                objArr3 = objArr31;
                                                i3 = ((int[]) objArr3[1])[0];
                                                if (((int[]) objArr3[0])[0] != i3) {
                                                    java.lang.Object[] objArr34 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[0]), 0};
                                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                    if (obj14 == null) {
                                                        obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionType(0L) + 4830, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj14);
                                                    }
                                                    ((java.lang.reflect.Method) obj14).invoke(null, objArr34);
                                                    values = (DigitizedCardProfile + 97) % 128;
                                                } else {
                                                    java.lang.Object[] objArr35 = {java.lang.Long.valueOf(((i3 | r6) & (~(i3 & r6))) ^ 2995190439952252928L), 697372630L};
                                                    byte[] bArr3 = $$d;
                                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                    e(401, (byte) (-bArr3[243]), bArr3[26], objArr36);
                                                    java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr36[0]);
                                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                    e(361, (byte) (-bArr3[305]), bArr3[24], objArr37);
                                                    cls9.getMethod((java.lang.String) objArr37[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr35);
                                                    java.lang.Object[] objArr38 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[0]), 0};
                                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                    if (obj15 == null) {
                                                        obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 30, 4830 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj15);
                                                    }
                                                    ((java.lang.reflect.Method) obj15).invoke(null, objArr38);
                                                }
                                                if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
                                                    i4 = i2;
                                                    str4 = "valueOf";
                                                    str5 = str15;
                                                } else {
                                                    int i36 = ~java.lang.System.identityHashCode(setstatelistanimator);
                                                    int i37 = 1498835082 & i36;
                                                    int i38 = (1498835082 | i36) & (~i37);
                                                    int i39 = (i38 & i37) | (i38 ^ i37);
                                                    int i40 = ~i39;
                                                    int i41 = (i39 | i40) & i40;
                                                    int i42 = ((~i41) & (-895799348)) | (895799347 & i41);
                                                    int i43 = i41 & (-895799348);
                                                    int i44 = -(-(((i43 ^ i42) | (i43 & i42)) * 764));
                                                    int i45 = ((((1938573966 ^ i44) | (1938573966 & i44)) << 1) - (~(-(((~i44) & 1938573966) | ((-1938573967) & i44))))) - 1;
                                                    int i46 = (i36 & (-895799348)) | ((-895799348) ^ i36);
                                                    int i47 = ~i46;
                                                    int i48 = (i46 | i47) & i47;
                                                    int i49 = 289685506 ^ i48;
                                                    int i50 = i48 & 289685506;
                                                    int i51 = -(-(((i50 ^ i49) | (i50 & i49)) * (-1528)));
                                                    int i52 = i37 | i38;
                                                    int i53 = ~i52;
                                                    int i54 = (i52 | i53) & i53;
                                                    int i55 = (-1815263418) & i54;
                                                    int i56 = -(-((((i54 | (-1815263418)) & (~i55)) | i55) * 764));
                                                    int identityHashCode = java.lang.System.identityHashCode(setstatelistanimator);
                                                    int i57 = (-2029013272) ^ identityHashCode;
                                                    int i58 = ~identityHashCode;
                                                    int i59 = (-2029013272) & identityHashCode;
                                                    int i60 = ~((i57 & i59) | (i57 ^ i59));
                                                    int i61 = -(-(((i60 ^ 1218445319) | (i60 & 1218445319)) * (-814)));
                                                    int i62 = ((i61 & (-595684064)) - (~(i61 | (-595684064)))) - 1;
                                                    int i63 = (i58 | identityHashCode) & i58;
                                                    i4 = i2;
                                                    int i64 = ~((i63 & 928610672) | ((~i63) & 928610672) | (i63 & (-928610673)));
                                                    int i65 = (i64 & 118042720) | (118042720 ^ i64);
                                                    str5 = str15;
                                                    int i66 = ((-2029013272) | identityHashCode) & (~i59);
                                                    int i67 = ~((i66 ^ i59) | (i66 & i59));
                                                    str4 = "valueOf";
                                                    int i68 = ((~i65) & i67) | ((~i67) & i65);
                                                    int i69 = i65 & i67;
                                                    int i70 = -(-(((i69 ^ i68) | (i69 & i68)) * 407));
                                                    int i71 = i62 & i70;
                                                    int i72 = (i62 | i70) & (~i71);
                                                    int i73 = -(-(i71 << 1));
                                                    int i74 = (i72 & i73) + (i72 | i73);
                                                    int i75 = (2029013271 & i58) | i59;
                                                    int i76 = 2029013271 & identityHashCode;
                                                    int i77 = ~((i75 ^ i76) | (i76 & i75));
                                                    int i78 = ((~i77) & 118042720) | ((-118042721) & i77);
                                                    int i79 = i77 & 118042720;
                                                    int i80 = (i79 ^ i78) | (i79 & i78);
                                                    int i81 = (-928610673) & identityHashCode;
                                                    int i82 = ~(((identityHashCode | (-928610673)) & (~i81)) | i81);
                                                    int i83 = i80 ^ i82;
                                                    int i84 = i80 & i82;
                                                    int i85 = ((i84 ^ i83) | (i84 & i83)) * 407;
                                                    int i86 = i74 & i85;
                                                    int i87 = i85 | i74;
                                                    if ((((i45 & i51) + (i51 | i45)) - (~i56)) - 1 > (i86 ^ i87) + ((i87 & i86) << 1)) {
                                                        com.payair.hce.setTranslationX.valueOf(new java.lang.Object[]{0L}, -325243520, 325243521, (int) java.lang.System.currentTimeMillis());
                                                    } else {
                                                        com.payair.hce.setTranslationX.valueOf(new java.lang.Object[]{0L}, -325243520, 325243521, (int) java.lang.System.currentTimeMillis());
                                                    }
                                                    int i88 = DigitizedCardProfile;
                                                    int i89 = i88 ^ 85;
                                                    int i90 = ((i88 & 85) | i89) << 1;
                                                    int i91 = -i89;
                                                    values = (((i90 | i91) << 1) - (i90 ^ i91)) % 128;
                                                }
                                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 51, 584 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.os.Process.myTid() >> 22) + 24291));
                                                byte b8 = bArr[63];
                                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                d((short) 69, b8, b8, objArr39);
                                                j2 = cls10.getField((java.lang.String) objArr39[0]).getLong(null);
                                                if (j2 != -1) {
                                                    DigitizedCardProfile = (values + 121) % 128;
                                                    if (j2 + 2018 >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                        values = (DigitizedCardProfile + 21) % 128;
                                                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 584, (char) (24292 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                        java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                        d(bArr[85], bArr[19], bArr[50], objArr40);
                                                        java.lang.Object[] objArr41 = {cls11.getField((java.lang.String) objArr40[0]).get(null), -938241352, 0};
                                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                        if (obj16 == null) {
                                                            str6 = str4;
                                                            obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4831, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj16);
                                                        } else {
                                                            str6 = str4;
                                                        }
                                                        objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj16).invoke(null, objArr41);
                                                        str7 = str3;
                                                        i5 = ((int[]) objArr4[1])[0];
                                                        if (((int[]) objArr4[0])[0] == i5) {
                                                            int i92 = DigitizedCardProfile;
                                                            int i93 = (-2) - (~((i92 & 56) + (i92 | 56)));
                                                            values = i93 % 128;
                                                            if (i93 % 2 != 0) {
                                                                java.lang.Object[] objArr42 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), num};
                                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                if (obj17 == null) {
                                                                    obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 31, 4830 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj17);
                                                                }
                                                                ((java.lang.reflect.Method) obj17).invoke(null, objArr42);
                                                            } else {
                                                                java.lang.Object[] objArr43 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), 0};
                                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                if (obj18 == null) {
                                                                    obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.US, 4829 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj18);
                                                                }
                                                                ((java.lang.reflect.Method) obj18).invoke(null, objArr43);
                                                            }
                                                        } else {
                                                            java.lang.Object[] objArr44 = {java.lang.Long.valueOf((((~i5) & r7) | (i5 & (~r7))) ^ 7584905012011073536L), 1765998312L};
                                                            byte[] bArr4 = $$d;
                                                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                            e(320, (byte) (-bArr4[243]), (byte) (-bArr4[9]), objArr45);
                                                            java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr45[0]);
                                                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                            e(446, bArr4[198], bArr4[172], objArr46);
                                                            cls12.getMethod((java.lang.String) objArr46[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr44);
                                                            java.lang.Object[] objArr47 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), 0};
                                                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                            if (obj19 == null) {
                                                                obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 30, 4830 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj19);
                                                            }
                                                            ((java.lang.reflect.Method) obj19).invoke(null, objArr47);
                                                            int i94 = values;
                                                            DigitizedCardProfile = ((i94 ^ 105) + ((i94 & 105) << 1)) % 128;
                                                        }
                                                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.Color.alpha(0) + 584, (char) (24292 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                        byte b9 = bArr[50];
                                                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                        byte b10 = b2;
                                                        d(b9, (byte) (b9 | com.google.common.base.Ascii.GS), b10, objArr48);
                                                        j3 = cls13.getField((java.lang.String) objArr48[0]).getLong(null);
                                                        if (j3 != -1) {
                                                            int i95 = values + 107;
                                                            DigitizedCardProfile = i95 % 128;
                                                            if (i95 % 2 != 0 ? j3 + 1971 >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j3 - 1971 >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 51, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 583, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 24291));
                                                                byte b11 = (byte) (-bArr[62]);
                                                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                                d((short) 75, b11, b11, objArr49);
                                                                java.lang.Object[] objArr50 = {cls14.getField((java.lang.String) objArr49[0]).get(null), 1245734383, 0};
                                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                if (obj20 == null) {
                                                                    obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4831, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj20);
                                                                }
                                                                objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) obj20).invoke(null, objArr50);
                                                                c2 = 0;
                                                                c = 1;
                                                                i6 = ((int[]) objArr5[c])[c2];
                                                                i7 = ((int[]) objArr5[c2])[c2];
                                                                if (i7 != i6) {
                                                                    int identityHashCode2 = java.lang.System.identityHashCode(setstatelistanimator);
                                                                    int i96 = (~((2037035412 ^ identityHashCode2) | (2037035412 & identityHashCode2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                                                    int i97 = (((~i96) & 1046019964) | ((-1046019965) & i96)) + ((i96 & 1046019964) << 1);
                                                                    int i98 = ~identityHashCode2;
                                                                    int i99 = (-34670665) & i98;
                                                                    int i100 = (~i99) & ((-34670665) | i98);
                                                                    int i101 = -(-(((i99 ^ i100) | (i100 & i99)) * (-216)));
                                                                    int i102 = i97 & i101;
                                                                    int i103 = -(-((i97 ^ i101) | i102));
                                                                    int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                                                                    int i105 = (identityHashCode2 | i98) & i98;
                                                                    int i106 = ~(((~i105) & 2037035412) | ((-2037035413) & i105) | (2037035412 & i105));
                                                                    int i107 = 1651587528 ^ i106;
                                                                    int i108 = i106 & 1651587528;
                                                                    int i109 = ((i108 ^ i107) | (i108 & i107)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                                                    int i110 = i104 | i109;
                                                                    int i111 = i110 << 1;
                                                                    int i112 = -((~(i109 & i104)) & i110);
                                                                    int identityHashCode3 = java.lang.System.identityHashCode(setstatelistanimator);
                                                                    int i113 = ~identityHashCode3;
                                                                    int i114 = (587978452 & i113) | (587978452 ^ i113);
                                                                    int i115 = ~i114;
                                                                    int i116 = (i114 | i115) & i115;
                                                                    int i117 = identityHashCode3 & 366921928;
                                                                    int i118 = ((-366921929) & i113) | i117;
                                                                    int i119 = identityHashCode3 & (-366921929);
                                                                    int i120 = (i118 ^ i119) | (i119 & i118);
                                                                    b3 = b10;
                                                                    int i121 = ~i120;
                                                                    int i122 = i121 & (i120 | i121);
                                                                    str8 = str7;
                                                                    int i123 = ((~i116) & i122) | ((~i122) & i116);
                                                                    int i124 = i122 & i116;
                                                                    int i125 = -(-(((i124 ^ i123) | (i124 & i123)) * 1900));
                                                                    int i126 = (-670755279) ^ i125;
                                                                    int i127 = (((i125 & (-670755279)) | i126) << 1) - i126;
                                                                    int i128 = i113 & (i113 | identityHashCode3);
                                                                    int i129 = 366921928 ^ i128;
                                                                    int i130 = 366921928 & i128;
                                                                    int i131 = ~((i129 & i130) | (i129 ^ i130));
                                                                    int i132 = (-587978453) ^ identityHashCode3;
                                                                    int i133 = (-587978453) & identityHashCode3;
                                                                    int i134 = ~((i132 ^ i133) | (i132 & i133));
                                                                    int i135 = i131 ^ i134;
                                                                    int i136 = i131 & i134;
                                                                    int i137 = ((i136 ^ i135) | (i135 & i136)) * (-950);
                                                                    int i138 = i127 ^ i137;
                                                                    int i139 = ((i127 & i137) | i138) << 1;
                                                                    int i140 = -i138;
                                                                    int i141 = ((i139 | i140) << 1) - (i139 ^ i140);
                                                                    int i142 = (-587978453) & i128;
                                                                    int i143 = (i128 | (-587978453)) & (~i142);
                                                                    int i144 = ~((i142 ^ i143) | (i143 & i142));
                                                                    int i145 = identityHashCode3 ^ 366921928;
                                                                    int i146 = (i145 ^ i117) | (i117 & i145);
                                                                    int i147 = ~i146;
                                                                    int i148 = (i146 | i147) & i147;
                                                                    int i149 = ((~i148) & i144) | ((~i144) & i148);
                                                                    int i150 = i148 & i144;
                                                                    int i151 = -(-(((i150 ^ i149) | (i150 & i149)) * 950));
                                                                    int i152 = i141 | i151;
                                                                    int i153 = i152 << 1;
                                                                    int i154 = -((~(i151 & i141)) & i152);
                                                                    if ((i111 ^ i112) + ((i112 & i111) << 1) > (i153 & i154) + (i154 | i153)) {
                                                                        java.lang.Object[] objArr51 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[5])[1]), 0};
                                                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                        if (obj21 == null) {
                                                                            obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29, 4830 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.graphics.Color.green(0))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj21);
                                                                        }
                                                                        ((java.lang.reflect.Method) obj21).invoke(null, objArr51);
                                                                    } else {
                                                                        java.lang.Object[] objArr52 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), 0};
                                                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                        if (obj22 == null) {
                                                                            obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 30, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4831, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj22);
                                                                        }
                                                                        ((java.lang.reflect.Method) obj22).invoke(null, objArr52);
                                                                    }
                                                                    int i155 = DigitizedCardProfile;
                                                                    int i156 = i155 & 83;
                                                                    values = ((i156 - (~((i155 ^ 83) | i156))) - 1) % 128;
                                                                } else {
                                                                    b3 = b10;
                                                                    str8 = str7;
                                                                    new java.util.ArrayList().add((java.lang.String) objArr5[2]);
                                                                    int i157 = i6 & i7;
                                                                    java.lang.Object[] objArr53 = {java.lang.Long.valueOf((((i6 ^ i7) | i157) & (~i157)) ^ (-2947974391293542400L)), -686378759L};
                                                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                                    e(com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, (byte) (-$$d[243]), r4[73], objArr54);
                                                                    java.lang.Class<?> cls15 = java.lang.Class.forName((java.lang.String) objArr54[0]);
                                                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                                    e(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, r4[423], r4[73], objArr55);
                                                                    cls15.getMethod((java.lang.String) objArr55[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr53);
                                                                    java.lang.Object[] objArr56 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), 0};
                                                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                    if (obj23 == null) {
                                                                        obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 4830 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj23);
                                                                    }
                                                                    ((java.lang.reflect.Method) obj23).invoke(null, objArr56);
                                                                }
                                                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 27, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 429, (char) (31609 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                                java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                                d((byte) (-bArr[4]), bArr[0], (short) 51, objArr57);
                                                                j4 = cls16.getField((java.lang.String) objArr57[0]).getLong(null);
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (j4 != -1 || j4 + 4611686018427387853L < ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                i8 = i4;
                                                                                if (context5 == null) {
                                                                                    int i158 = DigitizedCardProfile;
                                                                                    values = ((i158 & 73) + (i158 | 73)) % 128;
                                                                                    context3 = context5.getApplicationContext();
                                                                                } else {
                                                                                    context3 = context5;
                                                                                }
                                                                                int intValue4 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                                                                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                                                b("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{69, 64, 0, 0}, objArr58);
                                                                                java.lang.String str19 = (java.lang.String) objArr58[0];
                                                                                str9 = str6;
                                                                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                                                b("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 64, 116, 0}, objArr59);
                                                                                java.lang.String str20 = (java.lang.String) objArr59[0];
                                                                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                                                b("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", false, new int[]{197, 64, 0, 8}, objArr60);
                                                                                java.lang.String str21 = (java.lang.String) objArr60[0];
                                                                                java.lang.String str22 = str;
                                                                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                                                b("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, 64, 74, 0}, objArr61);
                                                                                java.lang.Object[] objArr62 = {context3, new java.lang.String[]{str19, str20, str21, (java.lang.String) objArr61[0]}, java.lang.Integer.valueOf(intValue4), 0, -1188974917};
                                                                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                                                e(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, (byte) (-$$d[243]), r3[65], objArr63);
                                                                                java.lang.Class<?> cls17 = java.lang.Class.forName((java.lang.String) objArr63[0]);
                                                                                java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                                                e(446, r3[198], r3[172], objArr64);
                                                                                objArr6 = (java.lang.Object[]) cls17.getMethod((java.lang.String) objArr64[0], java.lang.Class.forName(str17), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr62);
                                                                                int i159 = ((int[]) objArr6[1])[0];
                                                                                int i160 = ((int[]) objArr6[0])[0];
                                                                                if (context3 == null) {
                                                                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 27, 428 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (31609 - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                                                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                                    d((byte) (i8 & 352), bArr[50], bArr[63], objArr65);
                                                                                    cls18.getField((java.lang.String) objArr65[0]).set(null, objArr6);
                                                                                    try {
                                                                                        str = str22;
                                                                                        long longValue2 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 27, android.text.TextUtils.getOffsetAfter("", 0) + 429, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 31610));
                                                                                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                                                        d((byte) (-bArr[4]), bArr[0], (short) 51, objArr66);
                                                                                        cls19.getField((java.lang.String) objArr66[0]).set(null, java.lang.Long.valueOf(longValue2));
                                                                                        i9 = ((int[]) objArr6[1])[0];
                                                                                        if (((int[]) objArr6[0])[0] != i9) {
                                                                                            java.lang.Object[] objArr67 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[2])[0]), 0};
                                                                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                                                            if (obj24 == null) {
                                                                                                obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.getOffsetAfter("", 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4619, (char) android.text.TextUtils.indexOf("", ""))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj24);
                                                                                            }
                                                                                            ((java.lang.reflect.Method) obj24).invoke(null, objArr67);
                                                                                            int i161 = DigitizedCardProfile;
                                                                                            int i162 = i161 & 99;
                                                                                            int i163 = (i161 ^ 99) | i162;
                                                                                            values = ((i162 ^ i163) + ((i163 & i162) << 1)) % 128;
                                                                                        } else {
                                                                                            java.lang.Object[] objArr68 = {java.lang.Long.valueOf((((~i9) & r6) | (i9 & (~r6))) ^ (-8074562800225091584L)), -1880005718L};
                                                                                            short s = (short) ($$e & 983);
                                                                                            byte[] bArr5 = $$d;
                                                                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                                                            e(s, (byte) (-bArr5[243]), (byte) (-bArr5[170]), objArr69);
                                                                                            java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr69[0]);
                                                                                            java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                                                            e(407, (byte) (bArr5[198] - 1), bArr5[106], objArr70);
                                                                                            cls20.getMethod((java.lang.String) objArr70[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr68);
                                                                                            java.lang.Object[] objArr71 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[2])[0]), 0};
                                                                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                                                            if (obj25 == null) {
                                                                                                obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 4618 - android.text.TextUtils.indexOf("", "", 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj25);
                                                                                            }
                                                                                            ((java.lang.reflect.Method) obj25).invoke(null, objArr71);
                                                                                            int i164 = values;
                                                                                            int i165 = i164 & 75;
                                                                                            int i166 = -(-(i164 | 75));
                                                                                            DigitizedCardProfile = (((i165 | i166) << 1) - (i166 ^ i165)) % 128;
                                                                                        }
                                                                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 667, (char) (40025 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                                                        byte b12 = bArr[50];
                                                                                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                                                        byte b13 = b3;
                                                                                        d(b12, (byte) (b12 | com.google.common.base.Ascii.GS), b13, objArr72);
                                                                                        j5 = cls21.getField((java.lang.String) objArr72[0]).getLong(null);
                                                                                        if (j5 != -1) {
                                                                                            int i167 = DigitizedCardProfile;
                                                                                            int i168 = i167 & 103;
                                                                                            int i169 = ((i167 | 103) & (~i168)) + (i168 << 1);
                                                                                            values = i169 % 128;
                                                                                            if (i169 % 2 == 0 ? j5 + 4611686018427387818L >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j5 + 4611686018427387818L >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                                int identityHashCode4 = java.lang.System.identityHashCode(setstatelistanimator);
                                                                                                int i170 = 341884962 & identityHashCode4;
                                                                                                int i171 = -(-((i170 | ((341884962 | identityHashCode4) & (~i170))) * 988));
                                                                                                int i172 = ((1993651366 | i171) << 1) - (i171 ^ 1993651366);
                                                                                                int i173 = ~identityHashCode4;
                                                                                                int i174 = (-161103766) ^ i173;
                                                                                                int i175 = (-161103766) & i173;
                                                                                                int i176 = ~((i174 ^ i175) | (i175 & i174));
                                                                                                int i177 = ((i176 & (-9576213)) | ((~i176) & 9576212) | (9576212 & i176)) * (-1976);
                                                                                                int i178 = i172 & i177;
                                                                                                int i179 = (((i172 | i177) & (~i178)) - (~(i178 << 1))) - 1;
                                                                                                int i180 = ~((identityHashCode4 ^ 493412515) | (493412515 & identityHashCode4));
                                                                                                int i181 = 341884962 ^ i180;
                                                                                                int i182 = i180 & 341884962;
                                                                                                int i183 = (i182 ^ i181) | (i182 & i181);
                                                                                                int i184 = ~((i173 ^ (-493412516)) | ((-493412516) & i173));
                                                                                                int i185 = -(-(((i183 ^ i184) | (i184 & i183)) * 988));
                                                                                                int i186 = i179 ^ i185;
                                                                                                int i187 = (i185 & i179) << 1;
                                                                                                int identityHashCode5 = java.lang.System.identityHashCode(setstatelistanimator);
                                                                                                int i188 = ~((438620730 ^ identityHashCode5) | (438620730 & identityHashCode5));
                                                                                                int i189 = 1623393472 ^ i188;
                                                                                                int i190 = i188 & 1623393472;
                                                                                                int i191 = ((i190 ^ i189) | (i190 & i189)) * 305;
                                                                                                int i192 = (-517545900) & i191;
                                                                                                int i193 = -(-((i191 ^ (-517545900)) | i192));
                                                                                                int i194 = ~identityHashCode5;
                                                                                                int i195 = ((-438620731) & i194) | ((~i194) & 438620730);
                                                                                                int i196 = i194 & 438620730;
                                                                                                int i197 = ~((i196 ^ i195) | (i196 & i195));
                                                                                                int i198 = 2026362072 & i197;
                                                                                                if ((i186 ^ i187) + ((i187 & i186) << 1) <= ((((i192 | i193) << 1) - (i193 ^ i192)) - (~((((2026362072 | i197) & (~i198)) | i198) * 305))) - 1) {
                                                                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 40, 667 - android.view.KeyEvent.normalizeMetaState(0), (char) ((-16737192) - android.graphics.Color.rgb(0, 0, 0)));
                                                                                                    byte b14 = bArr[63];
                                                                                                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                                                                    d((short) 69, b14, b14, objArr73);
                                                                                                    java.lang.Object[] objArr74 = {cls22.getField((java.lang.String) objArr73[0]).get(null), -506824212, 0};
                                                                                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                                                    if (obj26 == null) {
                                                                                                        obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 4684 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj26);
                                                                                                    }
                                                                                                    invoke3 = ((java.lang.reflect.Method) obj26).invoke(null, objArr74);
                                                                                                } else {
                                                                                                    java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 40, 668 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.os.Process.myTid() >> 22) + 40024));
                                                                                                    byte b15 = bArr[63];
                                                                                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                                                                    d((short) 69, b15, b15, objArr75);
                                                                                                    java.lang.Object[] objArr76 = {cls23.getField((java.lang.String) objArr75[0]).get(null), -506824212, 0};
                                                                                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                                                    if (obj27 == null) {
                                                                                                        obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 33, android.os.Process.getGidForName("") + 4685, (char) android.view.View.resolveSize(0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj27);
                                                                                                    }
                                                                                                    invoke3 = ((java.lang.reflect.Method) obj27).invoke(null, objArr76);
                                                                                                }
                                                                                                objArr8 = (java.lang.Object[]) invoke3;
                                                                                                str10 = str8;
                                                                                                c4 = 0;
                                                                                                c3 = 1;
                                                                                                i10 = ((int[]) objArr8[c3])[c4];
                                                                                                i11 = ((int[]) objArr8[c4])[c4];
                                                                                                if (i11 == i10) {
                                                                                                    int i199 = DigitizedCardProfile;
                                                                                                    int i200 = i199 & 1;
                                                                                                    int i201 = (((i199 ^ 1) | i200) << 1) - ((i199 | 1) & (~i200));
                                                                                                    values = i201 % 128;
                                                                                                    if (i201 % 2 != 0) {
                                                                                                        java.lang.Object[] objArr77 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[4])[1]), 0};
                                                                                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                                                        if (obj28 == null) {
                                                                                                            obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 4684, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj28);
                                                                                                        }
                                                                                                        ((java.lang.reflect.Method) obj28).invoke(null, objArr77);
                                                                                                    } else {
                                                                                                        java.lang.Object[] objArr78 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[4])[0]), 0};
                                                                                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                                                        if (obj29 == null) {
                                                                                                            obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 34, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4684, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj29);
                                                                                                        }
                                                                                                        ((java.lang.reflect.Method) obj29).invoke(null, objArr78);
                                                                                                    }
                                                                                                } else {
                                                                                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                                                                                    java.lang.Object[] objArr79 = {objArr8};
                                                                                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                                                                                    if (obj30 == null) {
                                                                                                        obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.indexOf("", ""), android.widget.ExpandableListView.getPackedPositionType(0L) + 4684, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("values", java.lang.Object[].class);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj30);
                                                                                                    }
                                                                                                    arrayList.add(((java.lang.reflect.Method) obj30).invoke(null, objArr79));
                                                                                                    java.lang.Object[] objArr80 = {objArr8};
                                                                                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                                                                                    if (obj31 == null) {
                                                                                                        obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.widget.ExpandableListView.getPackedPositionChild(0L), 4684 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod("writeReplace", java.lang.Object[].class);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj31);
                                                                                                    }
                                                                                                    arrayList.add(((java.lang.reflect.Method) obj31).invoke(null, objArr80));
                                                                                                    int i202 = (~i11) & i10;
                                                                                                    int i203 = (~i10) & i11;
                                                                                                    java.lang.Object[] objArr81 = {java.lang.Long.valueOf(((i203 ^ i202) | (i202 & i203)) ^ (-1557557185381138432L)), -362647050L};
                                                                                                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                                                                    e(115, (byte) (-$$d[243]), r3[69], objArr82);
                                                                                                    java.lang.Class<?> cls24 = java.lang.Class.forName((java.lang.String) objArr82[0]);
                                                                                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                                                                    e(446, r3[198], r3[172], objArr83);
                                                                                                    cls24.getMethod((java.lang.String) objArr83[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr81);
                                                                                                    java.lang.Object[] objArr84 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[4])[0]), 0};
                                                                                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                                                    if (obj32 == null) {
                                                                                                        obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 33, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4685, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj32);
                                                                                                    }
                                                                                                    ((java.lang.reflect.Method) obj32).invoke(null, objArr84);
                                                                                                }
                                                                                                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 1580 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                                                byte b16 = bArr[63];
                                                                                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                                                                d((short) 69, b16, b16, objArr85);
                                                                                                j6 = cls25.getField((java.lang.String) objArr85[0]).getLong(null);
                                                                                                if (j6 != -1) {
                                                                                                    int i204 = values + 51;
                                                                                                    DigitizedCardProfile = i204 % 128;
                                                                                                    if (i204 % 2 != 0) {
                                                                                                        i17 = 0;
                                                                                                    } else if (j6 * 4611686018427387953L >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                                                        i17 = 0;
                                                                                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.getCapsMode("", i17, i17), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1581, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                                                                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                                                        d((byte) (-bArr[4]), bArr[0], (short) 51, objArr86);
                                                                                                        java.lang.Object[] objArr87 = {cls26.getField((java.lang.String) objArr86[0]).get(null), -1735293288, 0};
                                                                                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                                                                                        if (obj33 == null) {
                                                                                                            obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 4905 - (android.os.Process.myPid() >> 22), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj33);
                                                                                                        }
                                                                                                        objArr9 = (java.lang.Object[]) ((java.lang.reflect.Method) obj33).invoke(null, objArr87);
                                                                                                        int i205 = DigitizedCardProfile;
                                                                                                        values = (((i205 & (-74)) | ((~i205) & 73)) + ((i205 & 73) << 1)) % 128;
                                                                                                        if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                                                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                                                                            arrayList2.add((java.lang.String) objArr9[2]);
                                                                                                            arrayList2.add((java.lang.String) objArr9[3]);
                                                                                                            int i206 = DigitizedCardProfile;
                                                                                                            int i207 = i206 ^ 75;
                                                                                                            int i208 = ((i206 & 75) | i207) << 1;
                                                                                                            int i209 = -i207;
                                                                                                            values = ((i208 & i209) + (i208 | i209)) % 128;
                                                                                                        }
                                                                                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 44, 923 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                                                        d((byte) (-bArr[4]), bArr[0], (short) 51, objArr88);
                                                                                                        j7 = cls27.getField((java.lang.String) objArr88[0]).getLong(null);
                                                                                                        if (j7 != -1 || j7 + 4611686018427387826L < ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                                            str11 = str9;
                                                                                                            int intValue5 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                                                                                                            java.lang.Object[] objArr89 = {-1853537683};
                                                                                                            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                                                            if (obj6 == null) {
                                                                                                                obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.MotionEvent.axisFromString(""), 873 - (android.os.Process.myPid() >> 22), (char) (15955 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)))).getDeclaredConstructor(java.lang.Integer.TYPE);
                                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj6);
                                                                                                            }
                                                                                                            java.lang.Object[] values$4956fc2a = com.payair.hce.readIdnImk.values$4956fc2a(intValue5, ((java.lang.reflect.Constructor) obj6).newInstance(objArr89));
                                                                                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, 922 - android.graphics.Color.green(0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                                                            d((byte) (i8 & 352), bArr[50], bArr[63], objArr90);
                                                                                                            cls28.getField((java.lang.String) objArr90[0]).set(null, values$4956fc2a);
                                                                                                            long longValue3 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                                            c5 = 0;
                                                                                                            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, 923 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                                                            d((byte) (-bArr[4]), bArr[0], (short) 51, objArr91);
                                                                                                            cls29.getField((java.lang.String) objArr91[0]).set(null, java.lang.Long.valueOf(longValue3));
                                                                                                            objArr10 = values$4956fc2a;
                                                                                                            c6 = 1;
                                                                                                        } else {
                                                                                                            int i210 = values;
                                                                                                            int i211 = i210 ^ 3;
                                                                                                            int i212 = ((((i210 & 3) | i211) << 1) - (~(-i211))) - 1;
                                                                                                            DigitizedCardProfile = i212 % 128;
                                                                                                            if (i212 % 2 == 0) {
                                                                                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, 922 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                                                                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                                                                d((byte) (i8 & 352), bArr[50], bArr[63], objArr92);
                                                                                                                java.lang.Object[] objArr93 = {cls30.getField((java.lang.String) objArr92[0]).get(null), 1916120371, 0};
                                                                                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                                                if (obj34 == null) {
                                                                                                                    str11 = str9;
                                                                                                                    obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.graphics.Color.green(0), 4860 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj34);
                                                                                                                } else {
                                                                                                                    str11 = str9;
                                                                                                                }
                                                                                                                invoke2 = ((java.lang.reflect.Method) obj34).invoke(null, objArr93);
                                                                                                            } else {
                                                                                                                str11 = str9;
                                                                                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 922, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                                                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                                                                                d((byte) (i8 & 352), bArr[50], bArr[63], objArr94);
                                                                                                                java.lang.Object[] objArr95 = {cls31.getField((java.lang.String) objArr94[0]).get(null), 1916120371, 0};
                                                                                                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                                                if (obj35 == null) {
                                                                                                                    obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 4860, (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj35);
                                                                                                                }
                                                                                                                invoke2 = ((java.lang.reflect.Method) obj35).invoke(null, objArr95);
                                                                                                            }
                                                                                                            objArr10 = (java.lang.Object[]) invoke2;
                                                                                                            c6 = 1;
                                                                                                            c5 = 0;
                                                                                                        }
                                                                                                        i12 = ((int[]) objArr10[c6])[c5];
                                                                                                        i13 = ((int[]) objArr10[c5])[c5];
                                                                                                        if (i13 != i12) {
                                                                                                            int i213 = values;
                                                                                                            DigitizedCardProfile = ((i213 ^ 29) + ((i213 & 29) << 1)) % 128;
                                                                                                            java.lang.Object[] objArr96 = {objArr10, java.lang.Integer.valueOf(((int[]) objArr10[3])[0]), 0};
                                                                                                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                                            if (obj36 == null) {
                                                                                                                obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 4860, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj36);
                                                                                                            }
                                                                                                            ((java.lang.reflect.Method) obj36).invoke(null, objArr96);
                                                                                                            int i214 = values;
                                                                                                            int i215 = i214 ^ 91;
                                                                                                            int i216 = ((i214 & 91) | i215) << 1;
                                                                                                            int i217 = -i215;
                                                                                                            int i218 = ((i216 | i217) << 1) - (i216 ^ i217);
                                                                                                            DigitizedCardProfile = i218 % 128;
                                                                                                            if (i218 % 2 == 0) {
                                                                                                                int i219 = 4 / 5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            new java.util.ArrayList().add((java.lang.String) objArr10[2]);
                                                                                                            int i220 = i12 & i13;
                                                                                                            java.lang.Object[] objArr97 = {java.lang.Long.valueOf((((i12 ^ i13) | i220) & (~i220)) ^ 2800007493726502912L), 651927545L};
                                                                                                            byte[] bArr6 = $$d;
                                                                                                            java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                                                            e((short) (-bArr6[449]), (byte) (-bArr6[243]), bArr6[123], objArr98);
                                                                                                            java.lang.Class<?> cls32 = java.lang.Class.forName((java.lang.String) objArr98[0]);
                                                                                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                                                            e(361, (byte) (-bArr6[305]), bArr6[24], objArr99);
                                                                                                            cls32.getMethod((java.lang.String) objArr99[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr97);
                                                                                                            java.lang.Object[] objArr100 = {objArr10, java.lang.Integer.valueOf(((int[]) objArr10[3])[0]), 0};
                                                                                                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                                            if (obj37 == null) {
                                                                                                                obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.graphics.Color.rgb(0, 0, 0) + 16782076, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj37);
                                                                                                            }
                                                                                                            ((java.lang.reflect.Method) obj37).invoke(null, objArr100);
                                                                                                        }
                                                                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 708, (char) (android.text.TextUtils.getTrimmedLength("") + 34284));
                                                                                                        byte b17 = bArr[63];
                                                                                                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                                                        d((short) 69, b17, b17, objArr101);
                                                                                                        j8 = cls33.getField((java.lang.String) objArr101[0]).getLong(null);
                                                                                                        if (j8 != -1) {
                                                                                                            int i221 = values;
                                                                                                            int i222 = ((i221 ^ 34) + ((i221 & 34) << 1)) - 1;
                                                                                                            DigitizedCardProfile = i222 % 128;
                                                                                                            if (i222 % 2 != 0) {
                                                                                                                i16 = 0;
                                                                                                            } else if (j8 + 1897 >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                                                                i16 = 0;
                                                                                                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.widget.ExpandableListView.getPackedPositionForGroup(i16) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i16) == 0L ? 0 : -1)), 706 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (34284 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                                                                                                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                                                                                d(bArr[85], bArr[19], bArr[50], objArr102);
                                                                                                                java.lang.Object[] objArr103 = {cls34.getField((java.lang.String) objArr102[0]).get(null), -1556082831, 0};
                                                                                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                                                                if (obj38 == null) {
                                                                                                                    obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32, android.view.View.resolveSizeAndState(0, 0, 0) + 4717, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj38);
                                                                                                                }
                                                                                                                objArr11 = (java.lang.Object[]) ((java.lang.reflect.Method) obj38).invoke(null, objArr103);
                                                                                                                int i223 = DigitizedCardProfile;
                                                                                                                values = ((((i223 & (-120)) | ((~i223) & 119)) - (~(-(-((i223 & 119) << 1))))) - 1) % 128;
                                                                                                                c7 = 1;
                                                                                                                i14 = ((int[]) objArr11[c7])[0];
                                                                                                                i15 = ((int[]) objArr11[0])[0];
                                                                                                                if (i15 != i14) {
                                                                                                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                                                                    arrayList3.add((java.lang.String) objArr11[2]);
                                                                                                                    arrayList3.add((java.lang.String) objArr11[3]);
                                                                                                                    arrayList3.add((java.lang.String) objArr11[4]);
                                                                                                                    arrayList3.add((java.lang.String) objArr11[5]);
                                                                                                                    arrayList3.add((java.lang.String) objArr11[6]);
                                                                                                                    arrayList3.add((java.lang.String) objArr11[7]);
                                                                                                                    arrayList3.add((java.lang.String) objArr11[8]);
                                                                                                                    int i224 = i14 & i15;
                                                                                                                    java.lang.Object[] objArr104 = {java.lang.Long.valueOf((((i14 ^ i15) | i224) & (~i224)) ^ 9138480625269866496L), 2127718327L};
                                                                                                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                                                                    e(r3[423], (byte) (-$$d[243]), r3[155], objArr105);
                                                                                                                    java.lang.Class<?> cls35 = java.lang.Class.forName((java.lang.String) objArr105[0]);
                                                                                                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                                                                    e(446, r3[198], r3[172], objArr106);
                                                                                                                    cls35.getMethod((java.lang.String) objArr106[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr104);
                                                                                                                    java.lang.Object[] objArr107 = {objArr11, java.lang.Integer.valueOf(((int[]) objArr11[9])[0]), 0};
                                                                                                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                                                                    if (obj39 == null) {
                                                                                                                        obj39 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4717, (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj39);
                                                                                                                    }
                                                                                                                    ((java.lang.reflect.Method) obj39).invoke(null, objArr107);
                                                                                                                    return null;
                                                                                                                }
                                                                                                                int identityHashCode6 = java.lang.System.identityHashCode(setstatelistanimator);
                                                                                                                int i225 = ~identityHashCode6;
                                                                                                                int i226 = i225 & (i225 | identityHashCode6);
                                                                                                                int i227 = 143070054 & i226;
                                                                                                                int i228 = ((i226 | 143070054) & (~i227)) | i227;
                                                                                                                int i229 = ~i228;
                                                                                                                int i230 = i229 & (i228 | i229);
                                                                                                                int i231 = ((~i230) & 1499390766) | ((-1499390767) & i230);
                                                                                                                int i232 = i230 & 1499390766;
                                                                                                                int i233 = -(-(((i232 ^ i231) | (i232 & i231)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                                                                                                int i234 = 1800508246 ^ i233;
                                                                                                                int i235 = ((i233 & 1800508246) | i234) << 1;
                                                                                                                int i236 = -i234;
                                                                                                                int i237 = (i235 & i236) + (i235 | i236);
                                                                                                                int i238 = 1499390766 & i228;
                                                                                                                int i239 = (i228 | 1499390766) & (~i238);
                                                                                                                int i240 = (i239 ^ i238) | (i239 & i238);
                                                                                                                int i241 = ~i240;
                                                                                                                int i242 = (i240 | i241) & i241;
                                                                                                                int i243 = ~(((-8458305) & identityHashCode6) | ((-8458305) ^ identityHashCode6));
                                                                                                                int i244 = ((i242 ^ i243) | (i242 & i243)) * (-519);
                                                                                                                int i245 = (((i237 ^ i244) | (i237 & i244)) << 1) - (((~i244) & i237) | ((~i237) & i244));
                                                                                                                int i246 = 1499390766 & identityHashCode6;
                                                                                                                int i247 = ((identityHashCode6 | 1499390766) & (~i246)) | i246;
                                                                                                                int i248 = ~i247;
                                                                                                                int i249 = (i247 | i248) & i248;
                                                                                                                int i250 = (-143070055) & i249;
                                                                                                                int i251 = (i249 | (-143070055)) & (~i250);
                                                                                                                int i252 = -(-(((i251 ^ i250) | (i251 & i250)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                                                                                                int i253 = i245 ^ i252;
                                                                                                                int i254 = ((i252 & i245) | i253) << 1;
                                                                                                                int i255 = -i253;
                                                                                                                int identityHashCode7 = java.lang.System.identityHashCode(setstatelistanimator);
                                                                                                                int i256 = 1165928669 & identityHashCode7;
                                                                                                                int i257 = ~identityHashCode7;
                                                                                                                int i258 = i256 | ((~i256) & (1165928669 | identityHashCode7));
                                                                                                                int i259 = ~i258;
                                                                                                                int i260 = -(-(((i258 | i259) & i259) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                                                                                                                int i261 = ((1084827493 ^ i260) | (1084827493 & i260)) << 1;
                                                                                                                int i262 = -(((~i260) & 1084827493) | ((-1084827494) & i260));
                                                                                                                int i263 = (i261 ^ i262) + ((i262 & i261) << 1);
                                                                                                                int i264 = (identityHashCode7 | i257) & i257;
                                                                                                                int i265 = 2004806399 & i264;
                                                                                                                int i266 = -(-((((i264 | 2004806399) & (~i265)) | i265) * (-216)));
                                                                                                                int i267 = i263 & i266;
                                                                                                                int i268 = ((i263 ^ i266) | i267) << 1;
                                                                                                                int i269 = -((i266 | i263) & (~i267));
                                                                                                                int i270 = (i268 ^ i269) + ((i269 & i268) << 1);
                                                                                                                int i271 = 1165928669 & i257;
                                                                                                                int i272 = (i257 | 1165928669) & (~i271);
                                                                                                                int i273 = ~((i271 ^ i272) | (i271 & i272));
                                                                                                                int i274 = -(-(((i273 ^ (-925813360)) | ((-925813360) & i273)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                                                                                                                int i275 = i270 ^ i274;
                                                                                                                int i276 = (i274 & i270) << 1;
                                                                                                                if ((i254 ^ i255) + ((i254 & i255) << 1) <= ((i275 | i276) << 1) - (i276 ^ i275)) {
                                                                                                                    java.lang.Object[] objArr108 = {objArr11, java.lang.Integer.valueOf(((int[]) objArr11[66])[1]), num};
                                                                                                                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                                                                    if (obj40 == null) {
                                                                                                                        obj40 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 4717 - android.graphics.Color.green(0), (char) (android.os.Process.getGidForName("") + 1))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj40);
                                                                                                                    }
                                                                                                                    ((java.lang.reflect.Method) obj40).invoke(null, objArr108);
                                                                                                                    return null;
                                                                                                                }
                                                                                                                java.lang.Object[] objArr109 = {objArr11, java.lang.Integer.valueOf(((int[]) objArr11[9])[0]), 0};
                                                                                                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                                                                if (obj41 == null) {
                                                                                                                    obj41 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 33, android.text.TextUtils.getOffsetAfter("", 0) + 4717, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj41);
                                                                                                                }
                                                                                                                ((java.lang.reflect.Method) obj41).invoke(null, objArr109);
                                                                                                                return null;
                                                                                                            }
                                                                                                        }
                                                                                                        java.lang.Object[] objArr110 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue()), 0, -1556082831};
                                                                                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                                                                        if (obj7 == null) {
                                                                                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 706 - android.os.Process.getGidForName(""), (char) (android.text.TextUtils.getOffsetBefore("", 0) + 34284));
                                                                                                            byte b18 = bArr[63];
                                                                                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                                                            d((short) 69, b18, b18, objArr111);
                                                                                                            obj7 = cls36.getMethod((java.lang.String) objArr111[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj7);
                                                                                                        }
                                                                                                        objArr11 = (java.lang.Object[]) ((java.lang.reflect.Method) obj7).invoke(null, objArr110);
                                                                                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, 706 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (34284 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                                                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                                        d(bArr[85], bArr[19], bArr[50], objArr112);
                                                                                                        cls37.getField((java.lang.String) objArr112[0]).set(null, objArr11);
                                                                                                        long longValue4 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, 706 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (34284 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                                                                        byte b19 = bArr[63];
                                                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                                                        d((short) 69, b19, b19, objArr113);
                                                                                                        cls38.getField((java.lang.String) objArr113[0]).set(null, java.lang.Long.valueOf(longValue4));
                                                                                                        int i277 = DigitizedCardProfile;
                                                                                                        int i278 = i277 & 27;
                                                                                                        c7 = 1;
                                                                                                        values = (((i277 | 27) & (~i278)) + (i278 << 1)) % 128;
                                                                                                        i14 = ((int[]) objArr11[c7])[0];
                                                                                                        i15 = ((int[]) objArr11[0])[0];
                                                                                                        if (i15 != i14) {
                                                                                                        }
                                                                                                    }
                                                                                                    cause = th.getCause();
                                                                                                    if (cause == null) {
                                                                                                        throw cause;
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                                if (context5 != null) {
                                                                                                    int i279 = DigitizedCardProfile;
                                                                                                    int i280 = ((i279 | 99) << 1) - (i279 ^ 99);
                                                                                                    values = i280 % 128;
                                                                                                    if (i280 % 2 != 0) {
                                                                                                        context5.getApplicationContext();
                                                                                                        throw null;
                                                                                                    }
                                                                                                    context4 = context5.getApplicationContext();
                                                                                                    obj5 = null;
                                                                                                } else {
                                                                                                    obj5 = null;
                                                                                                    context4 = context5;
                                                                                                }
                                                                                                java.lang.Object[] objArr114 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(obj5, setstatelistanimator)).intValue()), 0, -1735293288};
                                                                                                byte b20 = (byte) (-$$d[243]);
                                                                                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                                e(82, b20, (byte) (b20 - 2), objArr115);
                                                                                                java.lang.Class<?> cls39 = java.lang.Class.forName((java.lang.String) objArr115[0]);
                                                                                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                                                e(446, r1[198], r1[172], objArr116);
                                                                                                objArr9 = (java.lang.Object[]) cls39.getMethod((java.lang.String) objArr116[0], java.lang.Class.forName(str17), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr114);
                                                                                                if (context4 != null) {
                                                                                                    int i281 = DigitizedCardProfile + 49;
                                                                                                    values = i281 % 128;
                                                                                                    try {
                                                                                                        if (i281 % 2 != 0) {
                                                                                                            java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1580, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                                                            d((byte) (-bArr[4]), bArr[0], (short) 51, objArr117);
                                                                                                            cls40.getField((java.lang.String) objArr117[0]).set(null, objArr9);
                                                                                                            long longValue5 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                                            java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 48, android.graphics.Color.blue(0) + 1581, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                                                            byte b21 = bArr[63];
                                                                                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                                            d((short) 69, b21, b21, objArr118);
                                                                                                            field = cls41.getField((java.lang.String) objArr118[0]);
                                                                                                            valueOf2 = java.lang.Long.valueOf(longValue5);
                                                                                                        } else {
                                                                                                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 1581, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                                            d((byte) (-bArr[4]), bArr[0], (short) 51, objArr119);
                                                                                                            cls42.getField((java.lang.String) objArr119[0]).set(null, objArr9);
                                                                                                            long longValue6 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                                            java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.green(0), android.graphics.Color.argb(0, 0, 0, 0) + 1581, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                                                            byte b22 = bArr[63];
                                                                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                                                            d((short) 69, b22, b22, objArr120);
                                                                                                            field = cls43.getField((java.lang.String) objArr120[0]);
                                                                                                            valueOf2 = java.lang.Long.valueOf(longValue6);
                                                                                                        }
                                                                                                        field.set(null, valueOf2);
                                                                                                    } catch (java.lang.Exception unused) {
                                                                                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                                                    }
                                                                                                }
                                                                                                if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                                                                }
                                                                                                java.lang.Class cls272 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 44, 923 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                                                java.lang.Object[] objArr882 = new java.lang.Object[1];
                                                                                                d((byte) (-bArr[4]), bArr[0], (short) 51, objArr882);
                                                                                                j7 = cls272.getField((java.lang.String) objArr882[0]).getLong(null);
                                                                                                if (j7 != -1) {
                                                                                                }
                                                                                                str11 = str9;
                                                                                                int intValue52 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                                                                                                java.lang.Object[] objArr892 = {-1853537683};
                                                                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                                                if (obj6 == null) {
                                                                                                }
                                                                                                java.lang.Object[] values$4956fc2a2 = com.payair.hce.readIdnImk.values$4956fc2a(intValue52, ((java.lang.reflect.Constructor) obj6).newInstance(objArr892));
                                                                                                java.lang.Class cls282 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, 922 - android.graphics.Color.green(0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                                                java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                                                                d((byte) (i8 & 352), bArr[50], bArr[63], objArr902);
                                                                                                cls282.getField((java.lang.String) objArr902[0]).set(null, values$4956fc2a2);
                                                                                                long longValue32 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                                c5 = 0;
                                                                                                java.lang.Class cls292 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, 923 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                                                java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                                                                d((byte) (-bArr[4]), bArr[0], (short) 51, objArr912);
                                                                                                cls292.getField((java.lang.String) objArr912[0]).set(null, java.lang.Long.valueOf(longValue32));
                                                                                                objArr10 = values$4956fc2a2;
                                                                                                c6 = 1;
                                                                                                i12 = ((int[]) objArr10[c6])[c5];
                                                                                                i13 = ((int[]) objArr10[c5])[c5];
                                                                                                if (i13 != i12) {
                                                                                                }
                                                                                                java.lang.Class cls332 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 708, (char) (android.text.TextUtils.getTrimmedLength("") + 34284));
                                                                                                byte b172 = bArr[63];
                                                                                                java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                                                                                d((short) 69, b172, b172, objArr1012);
                                                                                                j8 = cls332.getField((java.lang.String) objArr1012[0]).getLong(null);
                                                                                                if (j8 != -1) {
                                                                                                }
                                                                                                java.lang.Object[] objArr1102 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue()), 0, -1556082831};
                                                                                                obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                                                                if (obj7 == null) {
                                                                                                }
                                                                                                objArr11 = (java.lang.Object[]) ((java.lang.reflect.Method) obj7).invoke(null, objArr1102);
                                                                                                java.lang.Class cls372 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, 706 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (34284 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                                                                                java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                                                                                d(bArr[85], bArr[19], bArr[50], objArr1122);
                                                                                                cls372.getField((java.lang.String) objArr1122[0]).set(null, objArr11);
                                                                                                long longValue42 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                                java.lang.Class cls382 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, 706 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (34284 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                                                                byte b192 = bArr[63];
                                                                                                java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                                                                                d((short) 69, b192, b192, objArr1132);
                                                                                                cls382.getField((java.lang.String) objArr1132[0]).set(null, java.lang.Long.valueOf(longValue42));
                                                                                                int i2772 = DigitizedCardProfile;
                                                                                                int i2782 = i2772 & 27;
                                                                                                c7 = 1;
                                                                                                values = (((i2772 | 27) & (~i2782)) + (i2782 << 1)) % 128;
                                                                                                i14 = ((int[]) objArr11[c7])[0];
                                                                                                i15 = ((int[]) objArr11[0])[0];
                                                                                                if (i15 != i14) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        str10 = str8;
                                                                                        java.lang.Object[] objArr121 = {context5 == null ? context5.getApplicationContext() : context5, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue()), 0, -506824212};
                                                                                        byte[] bArr7 = $$d;
                                                                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                        e(155, (byte) (-bArr7[243]), bArr7[242], objArr122);
                                                                                        java.lang.Class<?> cls44 = java.lang.Class.forName((java.lang.String) objArr122[0]);
                                                                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                        e((short) ($$e & 378), (byte) (bArr7[198] - 1), bArr7[423], objArr123);
                                                                                        java.lang.Object[] objArr124 = (java.lang.Object[]) cls44.getMethod((java.lang.String) objArr123[0], java.lang.Class.forName(str17), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr121);
                                                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, 667 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 40024));
                                                                                        byte b23 = bArr[63];
                                                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                        d((short) 69, b23, b23, objArr125);
                                                                                        cls45.getField((java.lang.String) objArr125[0]).set(null, objArr124);
                                                                                        long longValue7 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                        java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf("", ""), 667 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (40024 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                                                                                        byte b24 = bArr[50];
                                                                                        c3 = 1;
                                                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                        d(b24, (byte) (b24 | com.google.common.base.Ascii.GS), b13, objArr126);
                                                                                        c4 = 0;
                                                                                        cls46.getField((java.lang.String) objArr126[0]).set(null, java.lang.Long.valueOf(longValue7));
                                                                                        objArr8 = objArr124;
                                                                                        i10 = ((int[]) objArr8[c3])[c4];
                                                                                        i11 = ((int[]) objArr8[c4])[c4];
                                                                                        if (i11 == i10) {
                                                                                        }
                                                                                        java.lang.Class cls252 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 1580 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                                        byte b162 = bArr[63];
                                                                                        java.lang.Object[] objArr852 = new java.lang.Object[1];
                                                                                        d((short) 69, b162, b162, objArr852);
                                                                                        j6 = cls252.getField((java.lang.String) objArr852[0]).getLong(null);
                                                                                        if (j6 != -1) {
                                                                                        }
                                                                                        if (context5 != null) {
                                                                                        }
                                                                                        java.lang.Object[] objArr1142 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(obj5, setstatelistanimator)).intValue()), 0, -1735293288};
                                                                                        byte b202 = (byte) (-$$d[243]);
                                                                                        java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                                                        e(82, b202, (byte) (b202 - 2), objArr1152);
                                                                                        java.lang.Class<?> cls392 = java.lang.Class.forName((java.lang.String) objArr1152[0]);
                                                                                        java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                                                        e(446, r1[198], r1[172], objArr1162);
                                                                                        objArr9 = (java.lang.Object[]) cls392.getMethod((java.lang.String) objArr1162[0], java.lang.Class.forName(str17), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1142);
                                                                                        if (context4 != null) {
                                                                                        }
                                                                                        if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                                                        }
                                                                                        java.lang.Class cls2722 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 44, 923 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                                        java.lang.Object[] objArr8822 = new java.lang.Object[1];
                                                                                        d((byte) (-bArr[4]), bArr[0], (short) 51, objArr8822);
                                                                                        j7 = cls2722.getField((java.lang.String) objArr8822[0]).getLong(null);
                                                                                        if (j7 != -1) {
                                                                                        }
                                                                                        str11 = str9;
                                                                                        int intValue522 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                                                                                        java.lang.Object[] objArr8922 = {-1853537683};
                                                                                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                                        if (obj6 == null) {
                                                                                        }
                                                                                        java.lang.Object[] values$4956fc2a22 = com.payair.hce.readIdnImk.values$4956fc2a(intValue522, ((java.lang.reflect.Constructor) obj6).newInstance(objArr8922));
                                                                                        java.lang.Class cls2822 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, 922 - android.graphics.Color.green(0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                                        java.lang.Object[] objArr9022 = new java.lang.Object[1];
                                                                                        d((byte) (i8 & 352), bArr[50], bArr[63], objArr9022);
                                                                                        cls2822.getField((java.lang.String) objArr9022[0]).set(null, values$4956fc2a22);
                                                                                        long longValue322 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                        c5 = 0;
                                                                                        java.lang.Class cls2922 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, 923 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                                        java.lang.Object[] objArr9122 = new java.lang.Object[1];
                                                                                        d((byte) (-bArr[4]), bArr[0], (short) 51, objArr9122);
                                                                                        cls2922.getField((java.lang.String) objArr9122[0]).set(null, java.lang.Long.valueOf(longValue322));
                                                                                        objArr10 = values$4956fc2a22;
                                                                                        c6 = 1;
                                                                                        i12 = ((int[]) objArr10[c6])[c5];
                                                                                        i13 = ((int[]) objArr10[c5])[c5];
                                                                                        if (i13 != i12) {
                                                                                        }
                                                                                        java.lang.Class cls3322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 708, (char) (android.text.TextUtils.getTrimmedLength("") + 34284));
                                                                                        byte b1722 = bArr[63];
                                                                                        java.lang.Object[] objArr10122 = new java.lang.Object[1];
                                                                                        d((short) 69, b1722, b1722, objArr10122);
                                                                                        j8 = cls3322.getField((java.lang.String) objArr10122[0]).getLong(null);
                                                                                        if (j8 != -1) {
                                                                                        }
                                                                                        java.lang.Object[] objArr11022 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue()), 0, -1556082831};
                                                                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                                                        if (obj7 == null) {
                                                                                        }
                                                                                        objArr11 = (java.lang.Object[]) ((java.lang.reflect.Method) obj7).invoke(null, objArr11022);
                                                                                        java.lang.Class cls3722 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, 706 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (34284 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                                                                        java.lang.Object[] objArr11222 = new java.lang.Object[1];
                                                                                        d(bArr[85], bArr[19], bArr[50], objArr11222);
                                                                                        cls3722.getField((java.lang.String) objArr11222[0]).set(null, objArr11);
                                                                                        long longValue422 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                        java.lang.Class cls3822 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, 706 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (34284 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                                                        byte b1922 = bArr[63];
                                                                                        java.lang.Object[] objArr11322 = new java.lang.Object[1];
                                                                                        d((short) 69, b1922, b1922, objArr11322);
                                                                                        cls3822.getField((java.lang.String) objArr11322[0]).set(null, java.lang.Long.valueOf(longValue422));
                                                                                        int i27722 = DigitizedCardProfile;
                                                                                        int i27822 = i27722 & 27;
                                                                                        c7 = 1;
                                                                                        values = (((i27722 | 27) & (~i27822)) + (i27822 << 1)) % 128;
                                                                                        i14 = ((int[]) objArr11[c7])[0];
                                                                                        i15 = ((int[]) objArr11[0])[0];
                                                                                        if (i15 != i14) {
                                                                                        }
                                                                                    } catch (java.lang.Exception unused2) {
                                                                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                                    }
                                                                                } else {
                                                                                    str = str22;
                                                                                    objArr7 = objArr6;
                                                                                }
                                                                            } else {
                                                                                int identityHashCode8 = java.lang.System.identityHashCode(setstatelistanimator);
                                                                                int i282 = 623688484 & identityHashCode8;
                                                                                int i283 = i282 | ((623688484 | identityHashCode8) & (~i282));
                                                                                int i284 = ~i283;
                                                                                int i285 = (i283 | i284) & i284;
                                                                                int i286 = ((-538968097) & i285) | ((~i285) & 538968096);
                                                                                int i287 = i285 & 538968096;
                                                                                int i288 = (((i287 ^ i286) | (i287 & i286)) * (-502)) + 971783527;
                                                                                int i289 = ~identityHashCode8;
                                                                                int i290 = i289 & (i289 | identityHashCode8);
                                                                                int i291 = (i290 & (-623688485)) | ((~i290) & 623688484) | (623688484 & i290);
                                                                                int i292 = (-585254002) & i291;
                                                                                int i293 = (i291 | (-585254002)) & (~i292);
                                                                                int i294 = (~((i293 ^ i292) | (i293 & i292))) * (-502);
                                                                                int i295 = ((~i294) & i288) | ((~i288) & i294);
                                                                                int i296 = -(-((i288 & i294) << 1));
                                                                                int i297 = 585254001 ^ identityHashCode8;
                                                                                int i298 = identityHashCode8 & 585254001;
                                                                                int i299 = ~((i298 ^ i297) | (i298 & i297));
                                                                                int i300 = 623688484 ^ i299;
                                                                                int i301 = i299 & 623688484;
                                                                                int i302 = ~java.lang.System.identityHashCode(setstatelistanimator);
                                                                                int i303 = ~i302;
                                                                                int i304 = ((-483080832) & i302) | ((-483080832) & i303) | (483080831 & i302);
                                                                                int i305 = 1530000133 ^ i304;
                                                                                int i306 = i304 & 1530000133;
                                                                                int i307 = -(~((~((i306 ^ i305) | (i306 & i305))) * (-783)));
                                                                                int i308 = ((((-1986716924) | i307) << 1) - (i307 ^ (-1986716924))) - 1;
                                                                                int i309 = (i303 & 1530000133) | ((-1530000134) & i302);
                                                                                int i310 = i302 & 1530000133;
                                                                                int i311 = (i310 ^ i309) | (i310 & i309);
                                                                                int i312 = ~i311;
                                                                                int i313 = (i311 | i312) & i312;
                                                                                int i314 = ((~i313) & (-483080832)) | (483080831 & i313);
                                                                                int i315 = i313 & (-483080832);
                                                                                int i316 = -(-(((i315 ^ i314) | (i315 & i314)) * 783));
                                                                                if ((i295 ^ i296) + ((i296 & i295) << 1) + (((i301 ^ i300) | (i301 & i300)) * 502) > (((~i316) & i308) | ((~i308) & i316)) + ((i316 & i308) << 1)) {
                                                                                    java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.argb(0, 0, 0, 0), 429 - (android.os.Process.myPid() >> 22), (char) (31609 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                                    i8 = i4;
                                                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                                    d((byte) (i8 & 352), bArr[50], bArr[63], objArr127);
                                                                                    java.lang.Object[] objArr128 = {cls47.getField((java.lang.String) objArr127[0]).get(null), -1188974917, 0};
                                                                                    java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                                                    if (obj42 == null) {
                                                                                        obj42 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4619, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj42);
                                                                                    }
                                                                                    invoke4 = ((java.lang.reflect.Method) obj42).invoke(null, objArr128);
                                                                                } else {
                                                                                    i8 = i4;
                                                                                    java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 428, (char) (31610 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                                                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                                    d((byte) (i8 & 352), bArr[50], bArr[63], objArr129);
                                                                                    java.lang.Object[] objArr130 = {cls48.getField((java.lang.String) objArr129[0]).get(null), -1188974917, 0};
                                                                                    java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                                                    if (obj43 == null) {
                                                                                        obj43 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 33, 4618 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj43);
                                                                                    }
                                                                                    invoke4 = ((java.lang.reflect.Method) obj43).invoke(null, objArr130);
                                                                                }
                                                                                objArr7 = (java.lang.Object[]) invoke4;
                                                                                str9 = str6;
                                                                            }
                                                                            long longValue4222 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                            java.lang.Class cls38222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, 706 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (34284 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                                            byte b19222 = bArr[63];
                                                                            java.lang.Object[] objArr113222 = new java.lang.Object[1];
                                                                            d((short) 69, b19222, b19222, objArr113222);
                                                                            cls38222.getField((java.lang.String) objArr113222[0]).set(null, java.lang.Long.valueOf(longValue4222));
                                                                            int i277222 = DigitizedCardProfile;
                                                                            int i278222 = i277222 & 27;
                                                                            c7 = 1;
                                                                            values = (((i277222 | 27) & (~i278222)) + (i278222 << 1)) % 128;
                                                                            i14 = ((int[]) objArr11[c7])[0];
                                                                            i15 = ((int[]) objArr11[0])[0];
                                                                            if (i15 != i14) {
                                                                            }
                                                                        } catch (java.lang.Exception unused3) {
                                                                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                        }
                                                                        long longValue3222 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                        c5 = 0;
                                                                        java.lang.Class cls29222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, 923 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                        java.lang.Object[] objArr91222 = new java.lang.Object[1];
                                                                        d((byte) (-bArr[4]), bArr[0], (short) 51, objArr91222);
                                                                        cls29222.getField((java.lang.String) objArr91222[0]).set(null, java.lang.Long.valueOf(longValue3222));
                                                                        objArr10 = values$4956fc2a22;
                                                                        c6 = 1;
                                                                        i12 = ((int[]) objArr10[c6])[c5];
                                                                        i13 = ((int[]) objArr10[c5])[c5];
                                                                        if (i13 != i12) {
                                                                        }
                                                                        java.lang.Class cls33222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 708, (char) (android.text.TextUtils.getTrimmedLength("") + 34284));
                                                                        byte b17222 = bArr[63];
                                                                        java.lang.Object[] objArr101222 = new java.lang.Object[1];
                                                                        d((short) 69, b17222, b17222, objArr101222);
                                                                        j8 = cls33222.getField((java.lang.String) objArr101222[0]).getLong(null);
                                                                        if (j8 != -1) {
                                                                        }
                                                                        java.lang.Object[] objArr110222 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue()), 0, -1556082831};
                                                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                                        if (obj7 == null) {
                                                                        }
                                                                        objArr11 = (java.lang.Object[]) ((java.lang.reflect.Method) obj7).invoke(null, objArr110222);
                                                                        java.lang.Class cls37222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, 706 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (34284 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                                                        java.lang.Object[] objArr112222 = new java.lang.Object[1];
                                                                        d(bArr[85], bArr[19], bArr[50], objArr112222);
                                                                        cls37222.getField((java.lang.String) objArr112222[0]).set(null, objArr11);
                                                                    } catch (java.lang.Exception unused4) {
                                                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                    }
                                                                    long longValue72 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                    java.lang.Class cls462 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf("", ""), 667 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (40024 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                                                                    byte b242 = bArr[50];
                                                                    c3 = 1;
                                                                    java.lang.Object[] objArr1262 = new java.lang.Object[1];
                                                                    d(b242, (byte) (b242 | com.google.common.base.Ascii.GS), b13, objArr1262);
                                                                    c4 = 0;
                                                                    cls462.getField((java.lang.String) objArr1262[0]).set(null, java.lang.Long.valueOf(longValue72));
                                                                    objArr8 = objArr124;
                                                                    i10 = ((int[]) objArr8[c3])[c4];
                                                                    i11 = ((int[]) objArr8[c4])[c4];
                                                                    if (i11 == i10) {
                                                                    }
                                                                    java.lang.Class cls2522 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 1580 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                    byte b1622 = bArr[63];
                                                                    java.lang.Object[] objArr8522 = new java.lang.Object[1];
                                                                    d((short) 69, b1622, b1622, objArr8522);
                                                                    j6 = cls2522.getField((java.lang.String) objArr8522[0]).getLong(null);
                                                                    if (j6 != -1) {
                                                                    }
                                                                    if (context5 != null) {
                                                                    }
                                                                    java.lang.Object[] objArr11422 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(obj5, setstatelistanimator)).intValue()), 0, -1735293288};
                                                                    byte b2022 = (byte) (-$$d[243]);
                                                                    java.lang.Object[] objArr11522 = new java.lang.Object[1];
                                                                    e(82, b2022, (byte) (b2022 - 2), objArr11522);
                                                                    java.lang.Class<?> cls3922 = java.lang.Class.forName((java.lang.String) objArr11522[0]);
                                                                    java.lang.Object[] objArr11622 = new java.lang.Object[1];
                                                                    e(446, r1[198], r1[172], objArr11622);
                                                                    objArr9 = (java.lang.Object[]) cls3922.getMethod((java.lang.String) objArr11622[0], java.lang.Class.forName(str17), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr11422);
                                                                    if (context4 != null) {
                                                                    }
                                                                    if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                                    }
                                                                    java.lang.Class cls27222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 44, 923 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                    java.lang.Object[] objArr88222 = new java.lang.Object[1];
                                                                    d((byte) (-bArr[4]), bArr[0], (short) 51, objArr88222);
                                                                    j7 = cls27222.getField((java.lang.String) objArr88222[0]).getLong(null);
                                                                    if (j7 != -1) {
                                                                    }
                                                                    str11 = str9;
                                                                    int intValue5222 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                                                                    java.lang.Object[] objArr89222 = {-1853537683};
                                                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                    if (obj6 == null) {
                                                                    }
                                                                    java.lang.Object[] values$4956fc2a222 = com.payair.hce.readIdnImk.values$4956fc2a(intValue5222, ((java.lang.reflect.Constructor) obj6).newInstance(objArr89222));
                                                                    java.lang.Class cls28222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, 922 - android.graphics.Color.green(0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                    java.lang.Object[] objArr90222 = new java.lang.Object[1];
                                                                    d((byte) (i8 & 352), bArr[50], bArr[63], objArr90222);
                                                                    cls28222.getField((java.lang.String) objArr90222[0]).set(null, values$4956fc2a222);
                                                                } catch (java.lang.Exception unused5) {
                                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                }
                                                                objArr6 = objArr7;
                                                                i9 = ((int[]) objArr6[1])[0];
                                                                if (((int[]) objArr6[0])[0] != i9) {
                                                                }
                                                                java.lang.Class cls212 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 667, (char) (40025 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                                byte b122 = bArr[50];
                                                                java.lang.Object[] objArr722 = new java.lang.Object[1];
                                                                byte b132 = b3;
                                                                d(b122, (byte) (b122 | com.google.common.base.Ascii.GS), b132, objArr722);
                                                                j5 = cls212.getField((java.lang.String) objArr722[0]).getLong(null);
                                                                if (j5 != -1) {
                                                                }
                                                                str10 = str8;
                                                                java.lang.Object[] objArr1212 = {context5 == null ? context5.getApplicationContext() : context5, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str10, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue()), 0, -506824212};
                                                                byte[] bArr72 = $$d;
                                                                java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                                                e(155, (byte) (-bArr72[243]), bArr72[242], objArr1222);
                                                                java.lang.Class<?> cls442 = java.lang.Class.forName((java.lang.String) objArr1222[0]);
                                                                java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                                                e((short) ($$e & 378), (byte) (bArr72[198] - 1), bArr72[423], objArr1232);
                                                                java.lang.Object[] objArr1242 = (java.lang.Object[]) cls442.getMethod((java.lang.String) objArr1232[0], java.lang.Class.forName(str17), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1212);
                                                                java.lang.Class cls452 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, 667 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 40024));
                                                                byte b232 = bArr[63];
                                                                java.lang.Object[] objArr1252 = new java.lang.Object[1];
                                                                d((short) 69, b232, b232, objArr1252);
                                                                cls452.getField((java.lang.String) objArr1252[0]).set(null, objArr1242);
                                                            }
                                                        }
                                                        java.lang.Object[] objArr131 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str7, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue()), 1245734383};
                                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-532826744);
                                                        if (obj4 == null) {
                                                            java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.Process.myTid() >> 22), 4500 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                            byte[] bArr8 = $$d;
                                                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                            e(446, bArr8[198], bArr8[172], objArr132);
                                                            obj4 = cls49.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-532826744, obj4);
                                                        }
                                                        objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr131);
                                                        java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50, 584 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 24291));
                                                        byte b25 = (byte) (-bArr[62]);
                                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                        d((short) 75, b25, b25, objArr133);
                                                        cls50.getField((java.lang.String) objArr133[0]).set(null, objArr5);
                                                        long longValue8 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                        java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 51, android.graphics.Color.blue(0) + 584, (char) (24291 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                                                        byte b26 = bArr[50];
                                                        c = 1;
                                                        java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                        d(b26, (byte) (b26 | com.google.common.base.Ascii.GS), b10, objArr134);
                                                        c2 = 0;
                                                        cls51.getField((java.lang.String) objArr134[0]).set(null, java.lang.Long.valueOf(longValue8));
                                                        i6 = ((int[]) objArr5[c])[c2];
                                                        i7 = ((int[]) objArr5[c2])[c2];
                                                        if (i7 != i6) {
                                                        }
                                                        java.lang.Class cls162 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 27, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 429, (char) (31609 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                        java.lang.Object[] objArr572 = new java.lang.Object[1];
                                                        d((byte) (-bArr[4]), bArr[0], (short) 51, objArr572);
                                                        j4 = cls162.getField((java.lang.String) objArr572[0]).getLong(null);
                                                        if (j4 != -1) {
                                                        }
                                                        i8 = i4;
                                                        if (context5 == null) {
                                                        }
                                                        int intValue42 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                                                        java.lang.Object[] objArr582 = new java.lang.Object[1];
                                                        b("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{69, 64, 0, 0}, objArr582);
                                                        java.lang.String str192 = (java.lang.String) objArr582[0];
                                                        str9 = str6;
                                                        java.lang.Object[] objArr592 = new java.lang.Object[1];
                                                        b("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 64, 116, 0}, objArr592);
                                                        java.lang.String str202 = (java.lang.String) objArr592[0];
                                                        java.lang.Object[] objArr602 = new java.lang.Object[1];
                                                        b("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", false, new int[]{197, 64, 0, 8}, objArr602);
                                                        java.lang.String str212 = (java.lang.String) objArr602[0];
                                                        java.lang.String str222 = str;
                                                        java.lang.Object[] objArr612 = new java.lang.Object[1];
                                                        b("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, 64, 74, 0}, objArr612);
                                                        java.lang.Object[] objArr622 = {context3, new java.lang.String[]{str192, str202, str212, (java.lang.String) objArr612[0]}, java.lang.Integer.valueOf(intValue42), 0, -1188974917};
                                                        java.lang.Object[] objArr632 = new java.lang.Object[1];
                                                        e(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, (byte) (-$$d[243]), r3[65], objArr632);
                                                        java.lang.Class<?> cls172 = java.lang.Class.forName((java.lang.String) objArr632[0]);
                                                        java.lang.Object[] objArr642 = new java.lang.Object[1];
                                                        e(446, r3[198], r3[172], objArr642);
                                                        objArr6 = (java.lang.Object[]) cls172.getMethod((java.lang.String) objArr642[0], java.lang.Class.forName(str17), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr622);
                                                        int i1592 = ((int[]) objArr6[1])[0];
                                                        int i1602 = ((int[]) objArr6[0])[0];
                                                        if (context3 == null) {
                                                        }
                                                    }
                                                }
                                                str6 = str4;
                                                if (context5 == null) {
                                                    int i317 = DigitizedCardProfile;
                                                    int i318 = i317 | 51;
                                                    int i319 = ((i318 << 1) - (~(-((~(i317 & 51)) & i318)))) - 1;
                                                    values = i319 % 128;
                                                    if (i319 % 2 != 0) {
                                                        context5.getApplicationContext();
                                                        throw null;
                                                    }
                                                    context2 = context5.getApplicationContext();
                                                    obj3 = null;
                                                } else {
                                                    obj3 = null;
                                                    context2 = context5;
                                                }
                                                str7 = str3;
                                                java.lang.Object[] objArr135 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str7, java.lang.Object.class).invoke(obj3, setstatelistanimator)).intValue()), -938241352};
                                                byte[] bArr9 = $$d;
                                                java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                e(com.visa.cbp.getCertUsage.isReperso, (byte) (-bArr9[243]), (byte) (-bArr9[9]), objArr136);
                                                java.lang.Class<?> cls52 = java.lang.Class.forName((java.lang.String) objArr136[0]);
                                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                e(446, bArr9[198], bArr9[172], objArr137);
                                                objArr4 = (java.lang.Object[]) cls52.getMethod((java.lang.String) objArr137[0], java.lang.Class.forName(str17), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr135);
                                                if (context2 == null) {
                                                    int i320 = values;
                                                    DigitizedCardProfile = (((i320 ^ 78) + ((i320 & 78) << 1)) - 1) % 128;
                                                    java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 51, 583 - android.os.Process.getGidForName(""), (char) (android.view.View.combineMeasuredStates(0, 0) + 24291));
                                                    java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                    d(bArr[85], bArr[19], bArr[50], objArr138);
                                                    cls53.getField((java.lang.String) objArr138[0]).set(null, objArr4);
                                                    try {
                                                        long longValue9 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                        java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 52, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24291 - android.view.View.MeasureSpec.getSize(0)));
                                                        byte b27 = bArr[63];
                                                        java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                        d((short) 69, b27, b27, objArr139);
                                                        cls54.getField((java.lang.String) objArr139[0]).set(null, java.lang.Long.valueOf(longValue9));
                                                        int i321 = DigitizedCardProfile + 24;
                                                        values = ((~i321) + (i321 << 1)) % 128;
                                                        objArr4 = objArr4;
                                                    } catch (java.lang.Exception unused6) {
                                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                    }
                                                }
                                                i5 = ((int[]) objArr4[1])[0];
                                                if (((int[]) objArr4[0])[0] == i5) {
                                                }
                                                java.lang.Class cls132 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.Color.alpha(0) + 584, (char) (24292 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                byte b92 = bArr[50];
                                                java.lang.Object[] objArr482 = new java.lang.Object[1];
                                                byte b102 = b2;
                                                d(b92, (byte) (b92 | com.google.common.base.Ascii.GS), b102, objArr482);
                                                j3 = cls132.getField((java.lang.String) objArr482[0]).getLong(null);
                                                if (j3 != -1) {
                                                }
                                                java.lang.Object[] objArr1312 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str7, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue()), 1245734383};
                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-532826744);
                                                if (obj4 == null) {
                                                }
                                                objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr1312);
                                                java.lang.Class cls502 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50, 584 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 24291));
                                                byte b252 = (byte) (-bArr[62]);
                                                java.lang.Object[] objArr1332 = new java.lang.Object[1];
                                                d((short) 75, b252, b252, objArr1332);
                                                cls502.getField((java.lang.String) objArr1332[0]).set(null, objArr5);
                                                long longValue82 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls512 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 51, android.graphics.Color.blue(0) + 584, (char) (24291 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                                                byte b262 = bArr[50];
                                                c = 1;
                                                java.lang.Object[] objArr1342 = new java.lang.Object[1];
                                                d(b262, (byte) (b262 | com.google.common.base.Ascii.GS), b102, objArr1342);
                                                c2 = 0;
                                                cls512.getField((java.lang.String) objArr1342[0]).set(null, java.lang.Long.valueOf(longValue82));
                                                i6 = ((int[]) objArr5[c])[c2];
                                                i7 = ((int[]) objArr5[c2])[c2];
                                                if (i7 != i6) {
                                                }
                                                java.lang.Class cls1622 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 27, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 429, (char) (31609 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                java.lang.Object[] objArr5722 = new java.lang.Object[1];
                                                d((byte) (-bArr[4]), bArr[0], (short) 51, objArr5722);
                                                j4 = cls1622.getField((java.lang.String) objArr5722[0]).getLong(null);
                                                if (j4 != -1) {
                                                }
                                                i8 = i4;
                                                if (context5 == null) {
                                                }
                                                int intValue422 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                                                java.lang.Object[] objArr5822 = new java.lang.Object[1];
                                                b("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{69, 64, 0, 0}, objArr5822);
                                                java.lang.String str1922 = (java.lang.String) objArr5822[0];
                                                str9 = str6;
                                                java.lang.Object[] objArr5922 = new java.lang.Object[1];
                                                b("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 64, 116, 0}, objArr5922);
                                                java.lang.String str2022 = (java.lang.String) objArr5922[0];
                                                java.lang.Object[] objArr6022 = new java.lang.Object[1];
                                                b("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", false, new int[]{197, 64, 0, 8}, objArr6022);
                                                java.lang.String str2122 = (java.lang.String) objArr6022[0];
                                                java.lang.String str2222 = str;
                                                java.lang.Object[] objArr6122 = new java.lang.Object[1];
                                                b("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, 64, 74, 0}, objArr6122);
                                                java.lang.Object[] objArr6222 = {context3, new java.lang.String[]{str1922, str2022, str2122, (java.lang.String) objArr6122[0]}, java.lang.Integer.valueOf(intValue422), 0, -1188974917};
                                                java.lang.Object[] objArr6322 = new java.lang.Object[1];
                                                e(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, (byte) (-$$d[243]), r3[65], objArr6322);
                                                java.lang.Class<?> cls1722 = java.lang.Class.forName((java.lang.String) objArr6322[0]);
                                                java.lang.Object[] objArr6422 = new java.lang.Object[1];
                                                e(446, r3[198], r3[172], objArr6422);
                                                objArr6 = (java.lang.Object[]) cls1722.getMethod((java.lang.String) objArr6422[0], java.lang.Class.forName(str17), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr6222);
                                                int i15922 = ((int[]) objArr6[1])[0];
                                                int i16022 = ((int[]) objArr6[0])[0];
                                                if (context3 == null) {
                                                }
                                            } catch (java.lang.Exception unused7) {
                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                            }
                                        } else {
                                            objArr2 = objArr31;
                                        }
                                    } else {
                                        int i322 = values;
                                        int i323 = ((i322 & (-74)) | ((~i322) & 73)) + ((i322 & 73) << 1);
                                        DigitizedCardProfile = i323 % 128;
                                        if (i323 % 2 == 0) {
                                            java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.KeyEvent.keyCodeFromString("") + 584, (char) (24290 - android.os.Process.getGidForName("")));
                                            i2 = i;
                                            java.lang.Object[] objArr140 = new java.lang.Object[1];
                                            d((byte) (i2 & 352), bArr[50], bArr[63], objArr140);
                                            java.lang.Object[] objArr141 = {cls55.getField((java.lang.String) objArr140[0]).get(null), -829557893, 1};
                                            java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                            if (obj44 == null) {
                                                obj44 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.graphics.Color.red(0), 4830 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj44);
                                            }
                                            invoke5 = ((java.lang.reflect.Method) obj44).invoke(null, objArr141);
                                        } else {
                                            i2 = i;
                                            java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 583, (char) (android.view.KeyEvent.normalizeMetaState(0) + 24291));
                                            java.lang.Object[] objArr142 = new java.lang.Object[1];
                                            d((byte) (i2 & 352), bArr[50], bArr[63], objArr142);
                                            java.lang.Object[] objArr143 = {cls56.getField((java.lang.String) objArr142[0]).get(null), -829557893, 0};
                                            java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                            if (obj45 == null) {
                                                obj45 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30, (android.os.Process.myTid() >> 22) + 4830, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj45);
                                            }
                                            invoke5 = ((java.lang.reflect.Method) obj45).invoke(null, objArr143);
                                        }
                                        objArr2 = (java.lang.Object[]) invoke5;
                                        str3 = str2;
                                        num = 1;
                                    }
                                    long longValue822 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls5122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 51, android.graphics.Color.blue(0) + 584, (char) (24291 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                                    byte b2622 = bArr[50];
                                    c = 1;
                                    java.lang.Object[] objArr13422 = new java.lang.Object[1];
                                    d(b2622, (byte) (b2622 | com.google.common.base.Ascii.GS), b102, objArr13422);
                                    c2 = 0;
                                    cls5122.getField((java.lang.String) objArr13422[0]).set(null, java.lang.Long.valueOf(longValue822));
                                    i6 = ((int[]) objArr5[c])[c2];
                                    i7 = ((int[]) objArr5[c2])[c2];
                                    if (i7 != i6) {
                                    }
                                    java.lang.Class cls16222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 27, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 429, (char) (31609 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                    java.lang.Object[] objArr57222 = new java.lang.Object[1];
                                    d((byte) (-bArr[4]), bArr[0], (short) 51, objArr57222);
                                    j4 = cls16222.getField((java.lang.String) objArr57222[0]).getLong(null);
                                    if (j4 != -1) {
                                    }
                                    i8 = i4;
                                    if (context5 == null) {
                                    }
                                    int intValue4222 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                                    java.lang.Object[] objArr58222 = new java.lang.Object[1];
                                    b("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{69, 64, 0, 0}, objArr58222);
                                    java.lang.String str19222 = (java.lang.String) objArr58222[0];
                                    str9 = str6;
                                    java.lang.Object[] objArr59222 = new java.lang.Object[1];
                                    b("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 64, 116, 0}, objArr59222);
                                    java.lang.String str20222 = (java.lang.String) objArr59222[0];
                                    java.lang.Object[] objArr60222 = new java.lang.Object[1];
                                    b("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", false, new int[]{197, 64, 0, 8}, objArr60222);
                                    java.lang.String str21222 = (java.lang.String) objArr60222[0];
                                    java.lang.String str22222 = str;
                                    java.lang.Object[] objArr61222 = new java.lang.Object[1];
                                    b("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, 64, 74, 0}, objArr61222);
                                    java.lang.Object[] objArr62222 = {context3, new java.lang.String[]{str19222, str20222, str21222, (java.lang.String) objArr61222[0]}, java.lang.Integer.valueOf(intValue4222), 0, -1188974917};
                                    java.lang.Object[] objArr63222 = new java.lang.Object[1];
                                    e(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, (byte) (-$$d[243]), r3[65], objArr63222);
                                    java.lang.Class<?> cls17222 = java.lang.Class.forName((java.lang.String) objArr63222[0]);
                                    java.lang.Object[] objArr64222 = new java.lang.Object[1];
                                    e(446, r3[198], r3[172], objArr64222);
                                    objArr6 = (java.lang.Object[]) cls17222.getMethod((java.lang.String) objArr64222[0], java.lang.Class.forName(str17), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr62222);
                                    int i159222 = ((int[]) objArr6[1])[0];
                                    int i160222 = ((int[]) objArr6[0])[0];
                                    if (context3 == null) {
                                    }
                                } catch (java.lang.Exception unused8) {
                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                }
                                objArr3 = objArr2;
                                i3 = ((int[]) objArr3[1])[0];
                                if (((int[]) objArr3[0])[0] != i3) {
                                }
                                if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
                                }
                                java.lang.Class cls102 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 51, 584 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.os.Process.myTid() >> 22) + 24291));
                                byte b82 = bArr[63];
                                java.lang.Object[] objArr392 = new java.lang.Object[1];
                                d((short) 69, b82, b82, objArr392);
                                j2 = cls102.getField((java.lang.String) objArr392[0]).getLong(null);
                                if (j2 != -1) {
                                }
                                str6 = str4;
                                if (context5 == null) {
                                }
                                str7 = str3;
                                java.lang.Object[] objArr1352 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str7, java.lang.Object.class).invoke(obj3, setstatelistanimator)).intValue()), -938241352};
                                byte[] bArr92 = $$d;
                                java.lang.Object[] objArr1362 = new java.lang.Object[1];
                                e(com.visa.cbp.getCertUsage.isReperso, (byte) (-bArr92[243]), (byte) (-bArr92[9]), objArr1362);
                                java.lang.Class<?> cls522 = java.lang.Class.forName((java.lang.String) objArr1362[0]);
                                java.lang.Object[] objArr1372 = new java.lang.Object[1];
                                e(446, bArr92[198], bArr92[172], objArr1372);
                                objArr4 = (java.lang.Object[]) cls522.getMethod((java.lang.String) objArr1372[0], java.lang.Class.forName(str17), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1352);
                                if (context2 == null) {
                                }
                                i5 = ((int[]) objArr4[1])[0];
                                if (((int[]) objArr4[0])[0] == i5) {
                                }
                                java.lang.Class cls1322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.Color.alpha(0) + 584, (char) (24292 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                byte b922 = bArr[50];
                                java.lang.Object[] objArr4822 = new java.lang.Object[1];
                                byte b1022 = b2;
                                d(b922, (byte) (b922 | com.google.common.base.Ascii.GS), b1022, objArr4822);
                                j3 = cls1322.getField((java.lang.String) objArr4822[0]).getLong(null);
                                if (j3 != -1) {
                                }
                                java.lang.Object[] objArr13122 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str7, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue()), 1245734383};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-532826744);
                                if (obj4 == null) {
                                }
                                objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr13122);
                                java.lang.Class cls5022 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50, 584 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 24291));
                                byte b2522 = (byte) (-bArr[62]);
                                java.lang.Object[] objArr13322 = new java.lang.Object[1];
                                d((short) 75, b2522, b2522, objArr13322);
                                cls5022.getField((java.lang.String) objArr13322[0]).set(null, objArr5);
                            }
                        }
                        java.lang.Object[] objArr282 = {context, java.lang.Integer.valueOf(intValue3), -829557893};
                        byte[] bArr22 = $$d;
                        num = 1;
                        str3 = str18;
                        java.lang.Object[] objArr292 = new java.lang.Object[1];
                        e(435, (byte) (-bArr22[243]), bArr22[72], objArr292);
                        java.lang.Class<?> cls62 = java.lang.Class.forName((java.lang.String) objArr292[0]);
                        java.lang.Object[] objArr302 = new java.lang.Object[1];
                        e(407, (byte) (bArr22[198] - 1), bArr22[106], objArr302);
                        java.lang.Object[] objArr312 = (java.lang.Object[]) cls62.getMethod((java.lang.String) objArr302[0], java.lang.Class.forName(str17), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr282);
                        if (context == null) {
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                    str = str14;
                    long longValue10 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) + 754, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45559));
                    byte b28 = bArr[50];
                    java.lang.Object[] objArr144 = new java.lang.Object[1];
                    b = b7;
                    d(b28, (byte) (b28 | com.google.common.base.Ascii.GS), b, objArr144);
                    cls57.getField((java.lang.String) objArr144[0]).set(null, java.lang.Long.valueOf(longValue10));
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                    if (obj == null) {
                    }
                    intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(invoke, null)).intValue();
                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                    if (obj2 == null) {
                    }
                    intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                    if (intValue2 != intValue) {
                    }
                    java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 51, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 583, (char) (android.text.TextUtils.indexOf("", "") + 24291));
                    java.lang.Object[] objArr272 = new java.lang.Object[1];
                    d((byte) (-bArr[4]), bArr[0], (short) 51, objArr272);
                    j = cls58.getField((java.lang.String) objArr272[0]).getLong(null);
                    if (j != -1) {
                    }
                    i2 = i;
                    if (context5 == null) {
                    }
                    java.lang.String str182 = str2;
                    int intValue32 = ((java.lang.Integer) java.lang.Class.forName(str15).getMethod(str182, java.lang.Object.class).invoke(null, setstatelistanimator)).intValue();
                    DigitizedCardProfile = (values + 19) % 128;
                } catch (java.lang.Exception unused9) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            i = i18;
            java.lang.Object[] objArr145 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str15).getMethod(str16, java.lang.Object.class).invoke(null, setstatelistanimator2)).intValue()), -2013076648};
            java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
            if (obj46 == null) {
                java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 48, 754 - (android.os.Process.myTid() >> 22), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45559));
                setstatelistanimator = setstatelistanimator2;
                java.lang.Object[] objArr146 = new java.lang.Object[1];
                d(bArr[85], bArr[19], bArr[50], objArr146);
                obj46 = cls59.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj46);
            } else {
                setstatelistanimator = setstatelistanimator2;
            }
            invoke = ((java.lang.reflect.Method) obj46).invoke(null, objArr145);
            java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 47, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 754, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 45560));
            java.lang.Object[] objArr147 = new java.lang.Object[1];
            d(bArr[85], bArr[19], bArr[50], objArr147);
            cls60.getField((java.lang.String) objArr147[0]).set(null, invoke);
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 11) % 128;
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), cArr, i);
        int i2 = 4;
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $11 = ($10 + 31) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - i2;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % i2]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, android.view.View.getDefaultSize(0, 0) + 1921, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(0, (short) -1, $$g[0], objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 429 - (android.os.Process.myPid() >> 22), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31609));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(0, (short) -1, (short) 6, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i2 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    private static void b(java.lang.String str, boolean z, int[] iArr, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = writeReplace;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.combineMeasuredStates(0, 0), 2807 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.view.KeyEvent.getDeadChar(0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(0, (short) -1, (short) 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr2 != null) {
            $10 = ($11 + 17) % 128;
            char[] cArr4 = new char[i2];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i2) {
                int i6 = $11 + 117;
                $10 = i6 % 128;
                if (i6 % 2 == 0 ? bArr2[getaccounttype.writeReplace] != 1 : bArr2[getaccounttype.writeReplace] != 1) {
                    int i7 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.KeyEvent.normalizeMetaState(0), 2880 - android.view.View.combineMeasuredStates(0, 0), (char) android.graphics.Color.blue(0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(0, (short) -1, (short) 2, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj2);
                    }
                    cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    $10 = ($11 + 5) % 128;
                    int i8 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2835 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a(0, (short) -1, (short) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                    $11 = ($10 + 89) % 128;
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.resolveSize(0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i9 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                $10 = ($11 + 37) % 128;
                cArr6[getaccounttype.writeReplace] = cArr3[(i2 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                $11 = ($10 + 61) % 128;
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$2() {
        $$g = new byte[]{5, -66, -84, -78};
        $$h = 78;
    }

    static void valueOf() {
        writeReplace = new char[]{16815, 16748, 16723, 16756, 16654, 16650, 16753, 16755, 16757, 16756, 16757, 16755, 16655, 16741, 16738, 16755, 16654, 16649, 16644, 16756, 16730, 16746, 16892, 16810, 16789, 16789, 16813, 16808, 16830, 16800, 16805, 16807, 16811, 16806, 16808, 16806, 16831, 16773, 16822, 16828, 16728, 16728, 16734, 16728, 16730, 16729, 16720, 16751, 16735, 16805, 16827, 16731, 16732, 16712, 16578, 16607, 16591, 16691, 16603, 16604, 16690, 16582, 16592, 16600, 16600, 16599, 16607, 16578, 16576, 16895, 16812, 16770, 16893, 16773, 16770, 16893, 16773, 16768, 16891, 16891, 16769, 16813, 16770, 16891, 16888, 16886, 16770, 16770, 16888, 16771, 16770, 16893, 16888, 16888, 16773, 16770, 16771, 16771, 16890, 16773, 16810, 16811, 16773, 16892, 16893, 16773, 16813, 16810, 16768, 16768, 16810, 16773, 16770, 16770, 16891, 16890, 16895, 16772, 16813, 16813, 16812, 16768, 16769, 16811, 16773, 16894, 16894, 16772, 16810, 16770, 16772, 16815, 16773, 16792, 16652, 16663, 16660, 16663, 16663, 16665, 16664, 16655, 16652, 16753, 16743, 16738, 16738, 16745, 16754, 16752, 16753, 16663, 16652, 16743, 16655, 16655, 16740, 16745, 16746, 16744, 16752, 16655, 16740, 16655, 16655, 16740, 16655, 16755, 16747, 16753, 16663, 16654, 16744, 16753, 16653, 16742, 16752, 16652, 16654, 16755, 16743, 16741, 16652, 16652, 16743, 16740, 16743, 16743, 16741, 16655, 16655, 16743, 16753, 16753, 16742, 16742, 16753, 16853, 16773, 16770, 16890, 16892, 16888, 16886, 16769, 16811, 16813, 16813, 16811, 16768, 16890, 16775, 16770, 16893, 16893, 16891, 16892, 16895, 16773, 16810, 16771, 16891, 16893, 16773, 16770, 16771, 16771, 16768, 16813, 16815, 16813, 16810, 16771, 16889, 16886, 16770, 16770, 16889, 16768, 16773, 16890, 16768, 16768, 16889, 16893, 16894, 16775, 16772, 16888, 16888, 16893, 16893, 16892, 16892, 16892, 16772, 16811, 16770, 16892, 16775, 16812, 16792, 16729, 16729, 16728, 16816, 16731, 16739, 16732, 16731, 16726, 16729, 16731, 16728, 16726, 16729, 16739, 16741, 16728, 16719, 16726, 16727, 16719, 16816, 16818, 16819, 16719, 16716, 16719, 16718, 16818, 16818, 16817, 16816, 16821, 16730, 16737, 16728, 16728, 16729, 16819, 16819, 16729, 16726, 16729, 16739, 16736, 16729, 16719, 16717, 16817, 16730, 16729, 16816, 16818, 16818, 16821, 16819, 16818, 16818, 16816, 16718, 16816, 16819, 16816};
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        values = 0;
        DigitizedCardProfile = 1;
        valueOf();
        valueOf = 7176586025804051438L;
        DigitizedCardProfile = (values + 53) % 128;
    }

    static void init$1() {
        $$d = new byte[]{76, 48, 60, 63, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -62, com.google.common.base.Ascii.NAK, -8, 43, -18, -6, 14, 2, 35, 59, -6, 5, com.google.common.base.Ascii.FF, 16, -4, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, -12, -4, com.google.common.base.Ascii.VT, 18, 5, 5, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -62, com.google.common.base.Ascii.NAK, -8, 56, -27, -6, 5, 18, 10, 4, 13, 9, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, -4, -2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.GS, com.visa.cbp.getEncExpo.onUnminimized, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -46, -8, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, -12, com.google.common.base.Ascii.SYN, 41, -37, 8, com.google.common.base.Ascii.SI, 4, 9, -7, 10, com.google.common.base.Ascii.CAN, -12, 18, 1, 8, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -37, 8, 1, com.google.common.base.Ascii.SYN, -12, com.google.common.base.Ascii.VT, -30, 9, 5, -4, 18, -10, com.google.common.base.Ascii.FS, 8, 40, -23, -10, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, -27, 10, 16, 4, 4, 14, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -62, com.google.common.base.Ascii.NAK, -8, 36, -11, com.google.common.base.Ascii.FF, -9, 19, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -52, com.google.common.base.Ascii.FF, 6, -2, 1, 18, 10, -12, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -58, 6, 18, -2, 38, -28, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -40, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, -12, com.google.common.base.Ascii.SYN, 40, -22, -12, com.google.common.base.Ascii.SUB, 6, 8, -11, com.google.common.base.Ascii.NAK, -36, -1, com.google.common.base.Ascii.SYN, -6, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DC4, -12, com.google.common.base.Ascii.SYN, 41, -37, 8, 1, com.google.common.base.Ascii.SUB, 5, -10, com.google.common.base.Ascii.SI, 14, -7, 7, 42, -10, -17, 19, com.google.common.base.Ascii.SI, -2, 1, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -22, -12, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.RS, -34, com.google.common.base.Ascii.VT, 8, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -47, -10, com.google.common.base.Ascii.SI, 4, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -62, com.google.common.base.Ascii.NAK, -8, 58, -36, -4, com.google.common.base.Ascii.GS, -17, 13, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -39, com.google.common.base.Ascii.CAN, -15, 16, com.google.common.base.Ascii.RS, -11, -4, 19, 44, -23, 5, 2, 10, 39, -34, com.google.common.base.Ascii.DC4, 6, -3, 14, 8, 71, -76, com.google.common.base.Ascii.FF, 16, -4, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, -12, -4, com.google.common.base.Ascii.VT, 18, 5, 5, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -46, -8, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, -12, com.google.common.base.Ascii.SYN, 40, -26, -1, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -23, -10, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, -27, 10, 16, 4, 4, 14, com.google.common.base.Ascii.FS, -4, -2, com.google.common.base.Ascii.ETB, -7, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -46, -8, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, -12, com.google.common.base.Ascii.SYN, 40, -26, -10, com.google.common.base.Ascii.DC4, 13, 5, 41, -37, 8, 1, com.google.common.base.Ascii.SYN, -12, com.google.common.base.Ascii.VT, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -58, 8, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -37, 8, 1, com.google.common.base.Ascii.SYN, -12, com.google.common.base.Ascii.VT, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -36, com.google.common.base.Ascii.SYN, -1, 33, -11, 0, 14, 9, -10, com.google.common.base.Ascii.SYN, 8, 71, -7, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -62, com.google.common.base.Ascii.NAK, -8, 58, -45, 8, com.google.common.base.Ascii.FF, 35, -15, -10, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CAN, -10, -12, com.google.common.base.Ascii.VT, 39, -30, 16, 18, com.google.common.base.Ascii.NAK, -11, -4, 19, 43, -26, 6, com.google.common.base.Ascii.FF, -13, 16, -1, 8, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -62, com.google.common.base.Ascii.NAK, -8, 43, -27, com.google.common.base.Ascii.DC4, -7, 7, com.google.common.base.Ascii.NAK, 8};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{14, 101, 71, 43, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 3, 7, -13, 13, 17, -21, -13, 2, 9, -4, -4, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized, 19, -13, -11, 14, com.google.common.base.Ascii.DC4, -25, -19, -9, 38, -46, -5, com.google.common.base.Ascii.VT, 34, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.SYN, -38, -5, 2};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        writeReplace(new java.lang.Object[]{this, context, intent}, 354053020, -354053020, java.lang.System.identityHashCode(this));
    }
}
