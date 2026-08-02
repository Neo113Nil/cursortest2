package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes17.dex */
class QTesla1p {
    private static int getHighResolutionOutputSizeshNQ4ISI = 56;
    private static int getHighSpeedVideoFpsRangesFor = 3;

    private static boolean getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i) {
        int i2;
        int i3 = 1024;
        int[] iArr2 = new int[1024];
        for (int i4 = 0; i4 < 1024; i4++) {
            int i5 = iArr[i + i4];
            int i6 = i5 >> 31;
            iArr2[i4] = (i5 ^ i6) - i6;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < 25; i8++) {
            int i9 = 0;
            while (true) {
                i2 = i3 - 1;
                if (i9 < i2) {
                    int i10 = iArr2[i9];
                    int i11 = i9 + 1;
                    int i12 = iArr2[i11];
                    int i13 = (i12 - i10) >> 31;
                    int i14 = ~i13;
                    iArr2[i11] = (i10 & i13) | (i12 & i14);
                    iArr2[i9] = (i10 & i14) | (i12 & i13);
                    i9 = i11;
                }
            }
            i7 += iArr2[i2];
            i3--;
        }
        return i7 > 554;
    }

    static /* synthetic */ int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2) {
        return org.bouncycastle.util.Pack.littleEndianToInt(bArr, (i + i2) << 2);
    }

    static class QTesla1PPolynomial {
        private static final int[] getHighResolutionOutputSizeshNQ4ISI;
        private static final int[] getHighSpeedVideoSizes;

        static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
            for (int i4 = 0; i4 < 1024; i4++) {
                int i5 = iArr2[i2 + i4] - iArr3[i3 + i4];
                iArr[i + i4] = i5 - (((int) ((i5 * 3) >> 30)) * 343576577);
            }
        }

        static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, short[] sArr) {
            long[] jArr = new long[1024];
            for (int i3 = 0; i3 < 25; i3++) {
                int i4 = iArr3[i3];
                for (int i5 = 0; i5 < i4; i5++) {
                    jArr[i5] = jArr[i5] - (sArr[i3] * iArr2[((i2 + i5) + 1024) - i4]);
                }
                for (int i6 = i4; i6 < 1024; i6++) {
                    jArr[i6] = jArr[i6] + (sArr[i3] * iArr2[(i2 + i6) - i4]);
                }
            }
            for (int i7 = 0; i7 < 1024; i7++) {
                long j = jArr[i7];
                iArr[i + i7] = (int) (j - (((3 * j) >> 30) * 343576577));
            }
        }

        static void getHighSpeedVideoFpsRangesFor(int[] iArr, byte[] bArr, int i) {
            int i2 = 18144;
            byte[] bArr2 = new byte[18144];
            int i3 = 0;
            org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr2, 18144, (short) 0, bArr, i);
            int i4 = 108;
            int i5 = 0;
            int i6 = 0;
            short s = 1;
            while (i5 < 4096) {
                if (i6 > (i4 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 16) {
                    org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr2, i2, s, bArr, i);
                    i6 = i3;
                    s = (short) (s + 1);
                    i4 = 1;
                }
                int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, i6) & 536870911;
                int littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, i6 + 4) & 536870911;
                int littleEndianToInt3 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, i6 + 8) & 536870911;
                int littleEndianToInt4 = 536870911 & org.bouncycastle.util.Pack.littleEndianToInt(bArr2, i6 + 12);
                i6 += 16;
                if (littleEndianToInt < 343576577 && i5 < 4096) {
                    long j = littleEndianToInt;
                    iArr[i5] = (int) (((j * 13632409) + (((j * 30071016006880359L) & 4294967295L) * 343576577)) >> 32);
                    i5++;
                }
                if (littleEndianToInt2 < 343576577 && i5 < 4096) {
                    long j2 = littleEndianToInt2;
                    iArr[i5] = (int) (((j2 * 13632409) + (((j2 * 30071016006880359L) & 4294967295L) * 343576577)) >> 32);
                    i5++;
                }
                if (littleEndianToInt3 < 343576577 && i5 < 4096) {
                    long j3 = littleEndianToInt3;
                    iArr[i5] = (int) (((j3 * 13632409) + (((j3 * 30071016006880359L) & 4294967295L) * 343576577)) >> 32);
                    i5++;
                }
                if (littleEndianToInt4 < 343576577 && i5 < 4096) {
                    long j4 = littleEndianToInt4;
                    iArr[i5] = (int) (((13632409 * j4) + (((j4 * 30071016006880359L) & 4294967295L) * 343576577)) >> 32);
                    i5++;
                }
                i2 = 18144;
                i3 = 0;
            }
        }

        static void getHighSpeedVideoSizes(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
            for (int i4 = 0; i4 < 1024; i4++) {
                int i5 = iArr2[i2 + i4] + iArr3[i3 + i4];
                int i6 = (i5 + ((i5 >> 31) & 343576577)) - 343576577;
                iArr[i + i4] = i6 + ((i6 >> 31) & 343576577);
            }
        }

        static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
            char c;
            long j;
            int i3;
            int i4 = 0;
            while (true) {
                c = ' ';
                j = 343576577;
                i3 = 1024;
                if (i4 >= 1024) {
                    break;
                }
                long j2 = iArr2[i4 + i2] * iArr3[i4];
                iArr[i4 + i] = (int) ((j2 + ((4294967295L & (2205847551L * j2)) * 343576577)) >> 32);
                i4++;
            }
            int[] iArr4 = getHighSpeedVideoSizes;
            int i5 = 1;
            int i6 = 0;
            while (i5 < i3) {
                int i7 = 0;
                while (i7 < i3) {
                    int i8 = iArr4[i6];
                    int i9 = i7;
                    while (i9 < i7 + i5) {
                        int i10 = i + i9;
                        int i11 = i10 + i5;
                        int i12 = iArr[i11] + iArr[i10];
                        iArr[i10] = i12 - (((int) ((i12 * 3) >> 30)) * 343576577);
                        long j3 = i8 * (r16 - iArr[i11]);
                        iArr[i11] = (int) ((j3 + (((j3 * 2205847551L) & 4294967295L) * 343576577)) >> 32);
                        i9++;
                        i5 = i5;
                        c = ' ';
                        j = 343576577;
                    }
                    i7 = i9 + i5;
                    i6++;
                    i3 = 1024;
                }
                i5 *= 2;
                i3 = 1024;
            }
        }

        static void getHighSpeedVideoFpsRangesFor(int[] iArr, int[] iArr2) {
            for (int i = 0; i < 1024; i++) {
                iArr[i] = iArr2[i];
            }
            int[] iArr3 = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = 0;
            for (int i3 = 512; i3 > 0; i3 >>= 1) {
                int i4 = 0;
                while (i4 < 1024) {
                    int i5 = iArr3[i2];
                    int i6 = i4;
                    while (i6 < i4 + i3) {
                        int i7 = iArr[i6];
                        long j = i5 * iArr[r9];
                        int i8 = (int) ((j + (((2205847551L * j) & 4294967295L) * 343576577)) >> 32);
                        int i9 = (i7 + i8) - 343576577;
                        iArr[i6] = i9 + ((i9 >> 31) & 343576577);
                        int i10 = i7 - i8;
                        iArr[i6 + i3] = i10 + ((i10 >> 31) & 343576577);
                        i6++;
                    }
                    i4 = i6 + i3;
                    i2++;
                }
            }
        }

        static void getHighSpeedVideoSizes(int[] iArr, int i, byte[] bArr, int i2, int[] iArr2, short[] sArr) {
            for (int i3 = 0; i3 < 1024; i3++) {
                iArr[i + i3] = 0;
            }
            for (int i4 = 0; i4 < 25; i4++) {
                int i5 = iArr2[i4];
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = i + i6;
                    iArr[i7] = iArr[i7] - (sArr[i4] * bArr[((i2 + i6) + 1024) - i5]);
                }
                for (int i8 = i5; i8 < 1024; i8++) {
                    int i9 = i + i8;
                    iArr[i9] = iArr[i9] + (sArr[i4] * bArr[(i2 + i8) - i5]);
                }
            }
        }

        static void Camera2StreamConfigurationMap(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
            for (int i4 = 0; i4 < 1024; i4++) {
                iArr[i + i4] = iArr2[i2 + i4] - iArr3[i3 + i4];
            }
        }

        static void getHighSpeedVideoFpsRangesFor(int[] iArr, int[] iArr2, int[] iArr3) {
            for (int i = 0; i < 1024; i++) {
                iArr[i] = iArr2[i] + iArr3[i];
            }
        }

        QTesla1PPolynomial() {
        }

        static {
            int[] iArr = new int[1024];
            int[] iArr2 = new int[1024];
            java.nio.ByteBuffer.wrap("\n÷¹Ê\u0014WË\r\nBs>\u0012>>»\u000f\u0084þä\u0010\u0013\u009c\u001d\u00017Õe\u0000 ì\u001f\u0002(xC\u0003±Ù&\u0006¸\u0093\u008e\u0005\u0087rT\u0010\u0099¢f\bIb\u0010\nò*|\u0011Æ¡«\u00025<\u009c\rÀ¬]\u0006m7\u0089\u0005ÈWÁ\tVß\u0094\u0002Qn^\n%º\u001c\u000fuKK\n#,¶\bpqÃ\u0005÷¯ñ\u0013\u0098ý³\u0011H;x\u000fµÒ©\u0007Þ`\t\u0000Ý\u0080$\u00055ÿÒ\u000b|=z\u000baØ5\u000f¨L\u0011\u0013çîÈ\u0000Å¹\u0000\u0013w!\u00ad\u0010N\u0095\u0005\t\u000e'o\u000b\u00ad\u0017Ó\u000f\u009c\u001d\u0016\u0007.\u0081¹\n\u001buÒ\u0002\u00ad\u0010Ï\u0007©ê'\u0004\u0011\u0084û\u0001:?è\u0002¡æm\u0002&>(\u000fBfZ\nA|«\f¢^J\b\u0014\u0014Ù\u0006@Å\u0095\f%\u008f{\u0003(;Î\u0007Y^Ð\u0002ª=ÿ\u0013\u009e$\u0012\u000e¦\u0093¬\r&\u008b]\u000bòX\u0096\u0005\u0089 \u001a\f×Âª\r\u008dp \u0007.äÁ\u0010bD\u0002\u000e\u001cÄð\u0005\u0005\u000b\u0080\u0005Í§ä\rZ\u0006×\tùl}\u0013ám·\rv#í\u0011KW»\b8¸?\u0006\u0007\u0014«\u0005ªjÇ\u0000këõ\u0003~*µ\u000f¾\u001dÝ\f]çv\u000fý9\u0004\u0011h?.\té\u008c\n\u000fK/\u0098\u0007ö;0\u0007\"\u0097T\u0003w\u0099\u000e\u000b<\u001f\u001e\u000b\u0003\u007f\u0090\tLúâ\u0011\u00169Î\u0006·\t`\u0005Qès\u000fã\u00846\u0011R2g\u0004Ï ¡\nÄ¹\u0088\rx/Ú\u0006+z}\u0012'ä.\u0013\u0084d¾\u0005}\u0010©\u0011¦\bØ\b¢!L\u0012rZ\u0004\u0013§e\u0085\bq\u0083#\u000fË\u0013\u008d\r\u0094®\u0002\u0013\u0097-\u009b\foô\u0002\u0012k\r(\u0012Ò\u0094þ\nèMj\u0013Üiå\f 0§\u0000Ç+ß\u0001l\f©\nW\u0013ô\u0005Ê\u001f\u001f\u0003fÃ\u001f\u00047\u0085\u001e\f\u000bèq\u0012x@\u000e\u0003\\u\u0016\u0014\báå\u000bF)û\r\u0011G\u007f\u0011|1=\u00126¢\u0010\u0001\u0018pR\u0014\u0014æ«\u0003\u008bý\u0093\u0010\u0090Ç\u001b\fóÖ\u0013\u0007¶\u0006÷\u0012]q}\u0003e\u000fQ\u000bW\u000f:\u000bã\u0098)\u0007\u001cØî\b\u008fÉ0\u0001\fj\u0082\u0012r\u001c\u0003\nGã]\t$U\u001f\u0003\u00823°\u0004:¸\u007f\u000e*ø\u009b\u0006ë\u0081=\u0003µ\fO\u0004ÏE(\u0012\u0084\u0007b\u0013\u0095÷\\\u0000¸õ\u0096\u0004>ol\u000bì\u0001\u009f\u000e\u0001êÖ\u0001Lö\u0080\u0006\u001c\u001b\u00ad\ním%\u0003\u008f{A\u0010à.Ã\u0012±ß \u0001Ï?\u008f\t¹â\u001d\u0003\u0005äw\u0005ø®m\u0013@7B\u0005\u0088Vá\u0010à\u000f=\u0002\r¹L\u0012\u001aþN\u0005U\u000fò\bÊä\u008a\nw\u0080å\u0004\u008f5\u0015\r(ÄÏ\u0012-_g\u0002P^A\fô\u0000m\u0011õ\u0083ñ\u0013\u0097üO\u0006\fhó\u0010#T\u0006\u000f\u001fJG\n\u0080\u009e\u0098\u0013PÂ\u000b\u0006×jê\u0012!\u0010\u009f\u0010Pvh\b\u0096·&\u000fµaì\n¯\u0000\u0018\u000b1Æ=\u000e\u0098«þ\f\u0013&C\fz\u000eP\u0006üÐ\u0014\nÜ\u0016é\fýâ \u000f\tºà\u0013Éø\u0000\u0002À@\u0015\u0013ó¼0\u0003»{\"\u0011ókÆ\u0010Þ}È\f¦I \u000e\u0001\u0092\u008a\u0006f<\u008f\u0007yìa\nM\u000b\u0015\u0010\u001e\u001e«\tQ5*\u0012\u0093P%\u0003\u0003%\u009d\u000eÍì»\t.óç\u0013ÂâU\u0002ãZ0\u000fê\u008d \rwï\u008b\u0000ÿ¢Æ\u0004\u0094\u007fò\r\u007fF+\u0006q\u0093\u008b\t;d]\u0013r²=\u0006\t\u0094×\f+Á¶\u000380l\u00064o\u0096\u00066§O\u000f\u008dÅ£\u0013è5ú\u0011b·º\u0013\u0091©3\u0001ÃÅÛ\u0006Uâ&\t°]ö\u0010e\u000e\u007f\u0003ÓKõ\u000f¯N\u0084\u0000î\bÂ\u0013`®V\b.VP\u0003û\u0016ü\u0000H\u008f\u0018\u0012c¤K\n×\u0088É\u0013a\u0096½\r-´\u0018\u0007Ú7A\bË2\"\u0007×\tÓ\b\u0096cØ\të\bÂ\tIÅÏ\u000f\fþÊ\u000eÿ0\u0010\u0013HïÙ\fà|ù\rÝ¤U\u0005«\u00adæ\u0011)|·\u000e\n¸'\u0001î.&\u0004\u0092±;\u0003  ¿\b?\u001e\\\u0000\u0006\u001dy\u0003\u0018\f[\u000bÃ\u009cè\u0013\u0010aL\u0005àÌ.\u0005\u0006ü®\u0006q°\u001a\u0012Á¡v\b\u0004\u0095¢\u0003ß¦ä\u0000B\u001et\u0011 6\u0005\u000bö\u008c\u0090\bÌë¶\u0012ô\u007fÇ\u0004¡UV\u0005\u0083ºT\u0002\u0083:{\u00056\u009aI\u0010ýT\u0006\u0013Ø5\u0090\u0003»¼î\u0000Tq\u0091\u0012hÞó\u0005n\u000b\u0085\u0010\u0013³}\u0010Iï@\u000f\u0000/\u009e\u0005±\u001aZ\u0001JÃ[\nçÑÔ\n\u008f«\u009e\u0011\u0092\u00ad:\u0005\u0012õ¡\u0010N¸ª\u0005\u008cÕÑ\u0006î¸Æ\u0012\u009bú\u009a\u0001\u001cÑO\u0001ë97\u0012«Î\u0013\u0005ã9\u0018\u0010Tªï\u0012\u009a§Á\fB\r(\u000fÉv]\nª\u001aV\u0014T\u0014ÿ\rÞ(Ñ\nX`\u008e\n\u0086\u0091\u0014\tcÔ>\u0012.Ñ2\u0010\u0086ñ\u009a\n\"mD\r\u009fÂ3\u0001â\u009eÃ\nr\u0092\u0017\u000298\u0003\u0007GF¶\f\u008efx\ny\bw\u0012Á*Â\u0013gEZ\u000fæÌÂ\u0011õÆ>\u0013\u008b¶a\u0010\u00ad7*\u0012(T©\u0012!\u0003:\u0011t^¦\bÉÌÆ\u0005\u009c\u009dõ\u0002ic¶\r2\u0010M\u0010\u0012Ú\u008c\u000fÒ_\u0099\fkyå\t\u0096\u0095:\u0011&ò§\u00146÷\u0093\u0007¹\u008b\u00ad\u0005»Éf\u0006¾y\u0006\u0005·\u0002ë\fê³Õ\u0010ÿÖ#\u0004\tá£\u0004µßG\u0012m!\u0087\b@\u008bÁ\f¦ V\u0000Àæ|\u000e\u00843£\u0001þ\u008ea\u0004\u0096\u009eC\u0004=À\u000b\t\u0017J\u001b\u000b÷7(\u0002+ÐÛ\u00145Ý£\u0013\u0006¬ï\u000b9l¨\u000fÜtn\u0010°¸U\nóe1\u000e=\u008dÇ\u0001c0-\t\u0097«I\u000bõ\u0015Ö\t»\u007fz\u0011Â\bw\r\u0086\u008ct\u0005-\u000f\u0084\b©\\÷\f\r¼ø\u0003\u0017¼Ø\u0012û\u008a\u001e\u0010Ó\u001bÂ\r/\u008bÓ\f_±+\u0007ß\u0084±\u0013ò\u0003N\tÅ·Õ\u0004\u0006ic\n[\\\u008e\rÿÁy\u000f6Oî\u0010\u008eüN\u0003±\u0081 \fê?\u0016\u0005ºÅÿ\u0002Vl\u009b\u0004,\u008cU\u0000JÀ½\u000e1¨Ú\u000ewQ\u0092\u0010÷àO\u0004Ô\u009a<\u0013×¿û\u0000\u0007\u0012§\u0011Öª\u0014\f1õK\bë\u008d_\r>õE\u0001\u0099QÅ\u0004à\u008d¥\u0007 üY\u000búr'\u0000öj«\u0006|Xi\fùù«\t\u0019\u0012\u009e\u0001¶y#\u0000PtÚ\u0001,èÙ\rÏÜô\u0002ø¶â\u0007\rhF\u000b\u0011\u0017\u0096\rPìM\u000e}þ.\u000fpX\u009e\u0012hN\u000f\tÈÔF\u0014Y7°\u000by¹ù\u0005È§\u0014\u0010°BÎ\u000153D\u0001ëÆ\\\u0002\u009c\u0096ç\u0014x3s\u0007hùÐ\u00005)Ê\u0001ãßW\bÍg¸\u000b¥\u001a!\u0003;±^\u0010¢\u008dÓ\bãaQ\u0012\u0000\u001d(\u000e\u0093¥ý\u0001,\u009c+\bG\u0007k\r½\u0083E\u0006Ãý}\b\u0010b^\u0012¨c\u0014\u000f)\u0099_\r\u001a\u001fT\u000f\u001d=Q\r&Ë¬\u0007otq\u0007bÍÝ\u0013jµ\u007f\u0007\\µì\b;Úú\t.ÈÂ\u0012Âfx\u0003j\u001eÔ\r@Ø\u0012\u0004\u0091Gó\bªRÉ\u0003\u001a\u0010¯\r³µ\u0083\u0013×®\u0094\t\u0014\nÍ\u0005ª®\u0091\u0007pIv\u0010\u001a\bZ\u0002ÚÚ²\u0007!Cù\u0007ñ\u0086A\bBG\u0017\u0014_Ãi\u0003ïÖ\u0081\u0010Kæ_\u0012#W\\\fªZÎ\f\u008aF{\u0010\u0088ÿ\u0088\u0010¼\u0090\u00ad\rL¸à\t®#u\u0002\u00adMb\u0012à>\r\u0011Íñ}\u000f\u0011\u009c3\rÁ\u0087#\rºdö\u0003cª¾\u0014Ui\u009a\n\u0091P5\u000eË\u0092Ë\fÒèj\u0005Öé«\u0011b§g\t¦\u0091s\u0014>\u0093ô\fN\u001a~\u0001æ®(\u0010«\u0087\u001a\u0004ª\u001eo\u0010\u0006@°\u0005\u0084#1\u0014\u0012\u0006U\u0002Ó\b\u0015\u0003µX\u008f\u0004ç¦½\u0005[ª\"\u000fÜ£O\u0000\f\u0015;\u0001«ä\u0003\u0006\u0097\u0010b\ní1w\u0010Âaì\tê\u001f\u0080\u0005%>Ô\u000f\u0095Æ\u000b\tÐRo\u0005\r+ê\tc\u008b¹\fÆ\u0084K\u0004N\u008e\u0017\u0000ËÖn\r¦m/\f+Êz\n¹zS\u0001Lp¡\u0013³Þm\tÎû\u0013\b\u009cùÔ\u0010¶òU\u0013P¹\u009d\u000füÓp\u0013F\u001e\u0085\u0001\u009aU\u0013\r\u009eûû\tïÇf\u0003¥t½\u0000Î~ï\u0002\u0083q}\u0007î\u001aÝ\tn<]\r\u001e² \u0000ç\u008bD\u0010Ê\u007fq\u0010ê¨c\u000f°M%\u0011FG\u0018\u000e»\u0087y\u0010t\u0087}\u000bÆÚ·\u0002\u0002kÉ\nÔuQ\u0005Å\u007fª\u0001÷gú\r\u009féh\u0000=¦_\u0003â³m\u000fcá³\u0005¾pÏ\n\u0082\u0019\u009b\u0014\\\u0002á\u0012>¯Ë\r\tÐ4\u0001½nÐ\u0012\u0095Ù\u0083\u0012:Ðc\u0001âe;\u0001\u00ad;.\u0004U\u0090\u008a\u0002L\u0080i\u000bÆÒ\u0084\u0000âÿ\u001d\r\u009f\u0006j\u0011\u008eÆÕ\u0000%hÁ\tãã\u009a\u0006¯÷W\f4É\u007f\b=\u0003+\u00004v4\u0007\u0084ç×\u0003\u008fÈp\ty\u009eL\u000fûÏÒ\u000fÞ]à\u000e\u0091\u0097;\u0012?\u008fH\r\u0001%\b\u0011ý4g\fr\u009a×\f¥4{\f\u0080&\u0099\u0010\u000e\t\u0016\u0011 F²\u0000ÕS¤\u000fÀ§\u009c\u0011þ§Ý\u0010i\t\u0005\u0006bÐ\u000b\u0000=$/\b\u0093ß\u000f\bUêR\u0001\u0082ë!\u0001I²\u0080\u0014Pz«\u0005p\u0088\u0004\u000bÚ\u0081\u0013\u0002°yÅ\r[²d\u0010\u0011\u001b!\u0002\u008dô\u000b\u0010\u0007z¢\u000b<MÊ\u000e\u0007¦A\u0013Z[\u0099\u0006½\u001b§\n\u0090Yà\u0005Û¢M\u0007\u0004¡\u001b\u00055'Á\u0013\u00ad\u0015N\u0012\u0087ä\u008c\u000fÿ×g\u0001¤¨Å\u000fßv¦\nÐ\u0006x\u0003í2\u0097\u000e\u00adü®\u0007\u009b\u0095o\u0000ö}B\f\u0088Cô\u0000\u008dA\u000b\bÇ4\u0014\u000e\n\u008aO\u0014Q^a\u0001á\u008ch\ra\n \r´\"\u0010\u0002pÁN\u000f²n¿\u0000âÖ \u0001 ?:\u0003\u0019(\u009d\u0005ï\u000f\u0089\u0006qÌ@\b¨\tË\fõL?\u0005\u0002ªÂ\u000bU¾p\u0002Ë\u008b¸\fC\u0002Ý\u0011²Þ\u0099\u0013Ä\u0084ö\u0003\u008f\u0016\u0094\u000fØ<4\fÉ\u0010¢\u0012~d¥\u0005!\u000b2\u000e¼#Ù\u0010q|\f\u0003MEE\u0012\u000b\u001a±\tF\u0004\f\feÐB\u0011\u007fð>\u0012:\u0017T\bN\fà\u000bÓÝ^\u00065ëÃ\u0013\u0017¨\u008e\u0006\u0011¤\u0097\u00048\u0087÷\u0002\u00992\u0091\u000ekOå\f\u0089\f·\u0011ÎWú\t\t7î\u0005}<*\u0001x1)\u0003!\u0086¡\b\u0007\u008a\u0085\u0013X´ñ\u0011x]î\u0007Aàµ\u0013Nïa\u0010u-?\u0001ÿ\u00855\r\u000bÙã\u0002Ìs \u0001ùwî\u0011\u008b¯§\t¡¾ \ft\u009cÈ\u0007³Áö\u0013K,v\rø'\u0080\u0002ýQ}\u0007c\u001dw\u0004L\u0093¸\u0002\n\u0085;\n=Óþ\u0001\u008d\u0005¤\u0005\u009aH³\u0001²(}\u0001q\u0091\u001d\u000b9¶\u0098\nÌL3\b»Ð\u000b\u000b\u001dÏ\u0004\u000fdÔÇ\fXÏ\u0002\fPO\u00ad\u000bP®C\u0006lSD\u0007°\u008e\u001b\r@ei\u0013¿\u00873\u0002.Â\u0001\bpá(\u0010J\u0086h\u000e\u00ad\u000f\u0017\tN~¹\u0011J£M\t:ØÀ\u0012}¯ê\u0003\u0096c\u000e\u0004d¥s\rvôT\u0005=º\u0093\b~0[\t\u0019ÁÏ\u0002¼>±\f£\u0099Ü\bÚ©F\fað'\u0000C:X\n¯nT\fãu\u0092\rº6\u009f\u0012\u0014ËÜ\u0002{\u0002õ\u0002ÏM\u0087\u0000ÍC+\u0005£ä!\u0002ê\u000b\u0096\u0004\u00ad\u001bÐ\fÌe\u008d\u0011í «\u0000\u0017\u0014\u0097\nX\u0096Í\t»\u0013\\\u000eLSð\fBóp\u0012?\u0000÷\u0006_úT\bò \u0016\u0004\u0097ø<\u000e¯\u009eI\u000bç'\u0087\u0010²ü£\u000fI×v\u000b\u0096\u0006Ä\u0004¨\u001b\u008e\n\bx¾\nÅÍ£\b³\u0087x\u000e\u0081\u001d\u0090\u000bÔPr\u0004õ\u0003,\u0011\u0012\u009a0\u0001]3Ñ\u0010/\u0001Ê\u0003ñ-\u000f\u000e\u0084s \u0013]`ú\bé%|\u0001vQ³\u0001õ_&\u0003½ê\u00ad\u0003e$Ø\ri-°\u0007µ2B\u0004Õ\u0001Ù\u0010\u008e\r\u0014\fÝ\u001c\u0096\u0006üh´\u000b Öõ\u0011(\u001d\u001f\u0003q5u\t¶ÿ\u000f\u000ftÁT\b\u0011\u0095\u0015\u000b\u009d9\u0095\u000e\u001d+\u009c\r\u0011z\u000e\u0002\u00864<\u0001¨HI\u000b\u001a'*\u0012\u0084ä\n\u0000c\u000bx\r\u009fR\u008b\u0012Ô\u001b5\u0001S\to\b\u009b?ý\u0000ì\u0096þ\u0005<u´\tKö\u0004\u00017ýa\n\u0097áÂ\r\u0082±Ý\f<Þ3\u0010\u0011ya\u0007ø\u000bÄ\u000bIÖE\u0012Á5\u0080\u0012èzX\u0012!¤\u0018\teLÉ\u0011ÅRí\u000b\u0012Û·\u0014\u001cØ\u0017\u0000\b\u008a´\u0000CºÌ\u000eÙ [\u000b\u00043\u0092\r3«Î\fAµZ\nF\u000b\u0091\n\u0088E/\u0010~J¶\u0011¥¿ö\u0006¡\u0019é\u000f|b©\u0000ë\u0092k\u000bÍ\u0091V\b\u0002rï\t«éÅ\n-c\u001e\u000fO×\u0014\u0007v\u007fE\u0012M¤´\u0010©§Å\n#æ}\u0011±\u0080K\u000b8\u001bð\u0011\u009c\u00063\u0012ÇUÓ\n@çÙ\u0010¡ç®\u000bR«®\ttÿR\u000b\u0080Ê³\u0013v\u009cK\b\u0012¾I\u0005àÿ\u000f\u000fWN]\u0013_,\u0001\u0001\u0095/¢\u0003´ò©\r£¥è\u0010Zkñ\u0001\u001a\u0092ê\u000b\u0004¨ç\f\u0087;\u0005\u000b\"å®\rÂ¢¾\fU:\u000e\u000bþÔå\u0010x\u0080à\u0007&Ò\u0003\u0005r\u0006p\u0013dÝw\u0004\u001e)0\u0012QÓ\u009f\u0012i\u0013i\fq_©\u0001õ~®\t\u001e:\u00ad\fc\u0019E\u0003õ\u0097&\u0004\u0007Eö\u0007\u0015-R\u0000/ix\u00131æ\t\b´:0\u0006YáÎ\u000féwÇ\u0005V°\u0090\t+\u000b´\u0005iJ]\u0010'È\u0019\f%v\u0091\n\u0014\u0013\f\u0012ÓÁl\u0012K,À\u0000rá\u0016\u0013\u0088Î\u0003\r\u0095\u0080\\\u0000\"\u0089j\u0000Û\u0015\u0086\u0010\u0013êÜ\u00132´y\u0003\u0091\u0010_\u0011ÈDÞ\u0011sºÓ\u0014\u001fè\u0015\u0003ö[s\u0004\u0081ÂZ\u0013\u008e?+\t@ª\u008e\u00050\u0092Ý\u0002'Ïè\u0010P\u0090Õ\u0013'\nµ\fÿäg\u0012^o½\u0001M\u0093¡\nÄè\u0085\b\u000f\u001d´\u0007%g\u0000\u0007KÄ±\u000fòLl\u0014X\u0097²\u0005;\u008e\u001b\u000b³ìÏ\fð;ÿ\u0004û\u0016±\t\u007fý\"\u000f\"\u0087×\u000b\u0001æ>\fºÐ@\u000b\u0090\u00adØ\u0002$ê¢\u0001\u0013¾¯\u000eóºï\u0006Ü%N\bÍ×Ã\u0013°\u008eµ\u000fÝ±\u009c\u0001©\u0001ï\u0011°Ó¿\u000f29H\u0002\u0095.v\u0004h\u0015Ù\u0002 Ê¥\u0007#µÀ\fï Ú\u0000Á\u0098Ô\u000eóÞñ\u000e\u0089¾}\u0013³âV\u0011§é¡\f\u000bÏa\u0006¢j'\t\u0000Ö\u0090\u0006*\u008bÐ\u000e++\u0013\u0004°9æ\u0007=Ê\u009b\b\u0001$0\u0005C\u0003\u009c\n\u0091\u009f\\\u000b\u001f¾:\u0004£àò\f ')\b¯'«\u0011<±ò\u0010_ìÏ\u0013\u0092Úr\r\n5T\u0005q~÷\u0013-$\u0090\u0010\u008b},\u0003ë\u0001\u0002\u0010l`¥\b\u009bÐP\f)ÀË\n\u0091\u0016×\fÄ\u0081\u0014\u000fÇãñ\n\u0015\rÏ\u0013ÿÝØ\u0013èy=\u0010Áº·\u0012=%Ê\u0012\u0082G\u0090\b*\fÏ\fë\u008fö\u000e\u0010`\u0099\u000f$}\u009e\u0010ÿlM\u000fÁ'¢\u0000³ñ\u0003\bæ§\u0081\fÌ\f\n\u000f\u0093\u009a[\u0012éîW\u0001vCò\u0007\u0014\u009ay\u000f¾\u008f\u0088\nc\u008eì\u0013ÕÐÙ\u0005\u009d_ê\u0011-þÓ\nA?ô".getBytes("ISO-8859-1")).asIntBuffer().get(iArr2, 0, 1024);
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, 1024);
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            int[] iArr3 = new int[1024];
            int[] iArr4 = new int[1024];
            java.nio.ByteBuffer.wrap("\u0003L\u0091.\u000eÝ0\u0017\u0000¤¿(\n\u0017\u0001\u0015\u0004¼\u0000y\reõ\u0088\u0013\u0004L\u000f\u0001\u0090¡ª\u0004æõ¦\u0007®\u0083÷\u000b\u0093è\u0080\u0013Æ\u009eþ\u0004¹h_\u0003{#´\u0005V\u0012c\u0006j/h\u0007\u008f\u0000\u000b\fP\u00832\u0001øHq\u0002=j7\u0003¸ÕJ\u0000\u0092\u0016Ä\u0000z²)\ne\u00822\u0004²¬\u0010\u0007¶\u000eí\téy*\bPÏ6\u000bÞ¿±\u0004\u000e/\\\u0010\u008f\u008eÿ\u0003ï\u0012Õ\u0001Mkq\u000f\t\u0011\n\u0007pZ\u00ad\u0000çµ\u008f\u0004\u001a£2\u0003=Þ\u000f\u000bËhV\u0007ÚhØ\u000fÖ¯\u000f\tZÑÇ\tèð¥\u000f7\u008ce\fykÑ\r<Åf\u000fÊV\u001b\u0006Odî\u000eP\u00041\u000by¹q\rØ%Ú\bnÀ \u0002Ò¦`\u0000Æ\u00ad«\u0005ðÑ\u0084\u0005\u0086±\u0010\u0013¸÷-\u0007\u008bo'\rVÚA\u0012YÅ\\\u0010\u0012z(\u0011åa\u008b\u0005HV¹\u0002É¼B\u0012Ñ\u008e\u0012\u0004\u009cÞe\u0000Ê\u0001L\u000b¬¸>\r\u009ej³\u0005\u0086Õ\u0012\u0013fÑR\u0012U¥_\béâ)\u0007¿¿Á\tx©Ã\u0005X\b*\nú\u0092ß\u000f\u007fyP\u0007\u008aT\u0002\bÆ£2\u000f?\u0001æ\u0000!øO\u0004\u0088C\u0095\r.ËP\rU)\u0001\fkrM\tµ§|\u0013,ü`\u0002\u001c D\u0007z«\u009a\u0001S\u0085L\u0004)ÿ,\u0012RÀ\u0019\u000fIý$\u000b9ås\u0000ìPÖ\u000føÍ§\u0010\u00844\u008e\u0000Z§ì\u0003\u0006Õ.\u0002²K#\u0010é\u007f¢\u0001GÛ\u0088\u0004f¥%\u0013\u009fz{\u0014X\u0006\u0097\u0006å\u000f¥\u0000ñÁþ\u0014\u0007®ë\u0002/cA\u0001¦Î\u0095\nf|õ\bU\u0019p\u0004RÇè\u000f\u0011E¤\u000bO\u0084M\u000f#ßq\u0004\u0091\u0018:\u000e ®3\u000bÆUÑ\u0001H©ø\u0014K&\u0089\reb¯\u0010sJ\u000b\u0010\u0084øÛ\b\u0017v¼\u000b\\UT\u0012\u0085\u0011S\b\t0X\u0002\u0011|\u0098\u0002(¼b\u0010\\fÑ\u0001\u0015²\u008a\u000f\b\u0089\u0091\rS½þ\u0004\u0002\u000f!\b{»\u001c\b%Uó\u0006·íC\tWªS\u0007óTü\tuç\u001a\u0013_ý\u0017\u0004 $\u0010\u0006Öê\u0019\u0010Å\u009dX\u0012å`_\u0001\u001bd\u0000\u0005#A¤\u000e\u0099\u0090ò\fgÑ¸\u0001\u0003ó¶\bùÅN\u000b\u0005\u0090¯\t'äS\u0003Ø¨S\n9¨(\u0001³:.\u0002Þ\u0089Î\tBt\u0011\u0002É\u000f¶\nV©\u0084\u0003Ðè<\u0002,ëM\r\u0004\u0010¼\u0005*¸í\nM,ã\nÎ¦<\fx\u001d\u0012\b¬þ«\u0013\u008eý\u0096\u0004þ-X\rÙv\u0018\u0002ÔÐ\u000b\u0003üEK\tòJÒ\n4\u0084p\b8Ú§\u0007Fä3\tv\\o\u0005¡o¦\u00146Õ5\u0014r\u0005M\u0000]·ê\tg´J\u0002µ=\u0014\u000b\u0015C8\u0002Xëé\u0001\u0092\u0015©\u0001¹Z\u0081\t0¹¼\f\u0082\u0084=\u0004i\u0016 \b=±Î\u0006÷Þ$\tâ®?\u0013B\u0092 \u000b.\u0099ý\u000f>\u001aM\u0013\u008dù\u0003\u000bßP\u0004\u0013'\u0086\u0092\u0001¦tÌ\u0006Û=v\u0014\u0017\u0084\u0089\u0001õ«÷\t`h×\u0012ÒG¸\u0011ô[Å\u0007i\u0015ó\u0006]de\bÝVl\fhúì\u0005\u0005Î\u00ad\nÃ\u0090ò\u0011\tZ\u008c\u0003Rrâ\bÙ¹\f\r~'M\u0007\u009dsk\u0003ì\u0082í\u000f¥\u008e(\fÅ]¿\u0007\u0011bQ\u0011\u0015k)\u0010¼¥T\u0012\u00850Û\u0013\u0004>N\u000b\u0091j\u0085\u0001\u001d/\u0007\u0005ö\u001ca\u0010\u0089bò\u0004K\u008e7\u0013\u001d\\0\u0003gõÑ\u000f\u0085\u008cÕ\b¦?\u008f\u0005ùrq\u000bÇ\b\u0089\t´Â^\nr\u0017C\u000fÒts\bä\u0089=\u00050¸\u008b\u0003Ç\u0093^\b\u0093hz\u0005Êñ¸\u000fâ\u0097Å\u000b\u0088oë\u000e\u001a\u0095\u00ad\u0002;\u008f\n\b7\u009c\u0091\u0006.<\u0011\n¿|¥\n!ù4\u0014c{j\u0002\u008cïV\u0007®*t\u000fÍt1\u0011\u0090\u0084k\u000eÖ«à\u0013\u00adLÖ\u0011«Bz\u0011ÿ\u008d\f\u0002eÄ%\u0006ÀYb\u0007\u0097\u001ao\tË!\u00ad\u00147U©\b\u0018\u009fÚ\u000b\u009fæ»\u0007Öö%\u0011¾QP\u000b`Î2\u000bü_¦\u000f<Õn\u0007\u0003\u009b\u00ad\u0010\u0015ê\u008e\u0010ä,ó\u0001üà\u0017\u000b?·A\u0003/ì´\u000b,\u0011H\u0005Í\u0080ê\u00040\t\u0099\f\t®Ù\u0012KÎ\u0000\u0000»\bÎ\u0007:*\u0098\fÊ\u0001æ\u000e\u000e<½\t)á¾\b*@T\b!Àÿ\u0005\u0015»:\t\\Àý\u000b¾¿ö\t®CÎ\t@Ùi\u0013\bþä\u0012Èg\u0084\u000eàGN\u0012í\u008a]\n<¼\u0003\u0012p\nÆ\u0010-üI\r\u0017r\u008a\u0011}>\u0084\u0006\u0082h\u0081\u0001/c\u008b\fÆÎ\u000b\b\u0005ó9\nØÑa\u0002îàZ\u0012\u0081\u0018\u0013\u0011®\u001cá\u0007n¶\u001e\u0012{\nÌ\u0004\u0005bÂ\u0001+  \r8¯L\u0003\u00022\u0013\u0001!Û\u0010\fs\u0005|\u0011Y\t`\u0013\u0002^Ø\u000eýS×\u000bqX\u0013\u0002¬8\u0007\u0007ñ\u0083J\u0006\u000f@\u001c\u0011á]p\u0010B\b\n\u000ehëj\u0001bçs\u000eD¤>\b¦²£\f,\u0083!\u0002@x\u00ad\u0002ú\u009fÃ\b\u0014¿¿\u000b4\u008bõ\u0002ouP\u0011-J¼\u0004\t\u0013õ\u0005¾l(\u000fY\u0084Ï\u0001ü+\\\u0007±\u007f_\u0004¢SÍ\u0010ëym\u0000¶\u000b\u000b\u0002Ç±h\b7\u008d$\u0011¯\u0004I\t$Ñ\u0091\u000fwå?\u0007\u0085CÂ\u000bÒ\u00866\u000e\bÃÁ\u000e\u008b\u0080x\u0011agd\u0012ÚPÇ\u0013\u0097¹á\u0004È!B\u0012\tÎ³\u0006Æmñ\u0007\u0019\u0085a\u0012\u0099\u0003\u0099\u0000)1 \u0006p\u0005²\u000b³[í\u0013íNö\u0007òL\r\u0013\u0084\u0012¿\fÞú\u0092\u0005Ì\u0093S\u0010\u008d]j\tª\u0089\u0089\u0004\u009b\u0019[\u0012Õç<\u0004z¸\u009a\u0001ò«u\u0000Íz³\u000fEh@\ruîæ\u000e\u009eí´\tê6!\r½tZ\u0001 4h\u0006réÀ\t>B7\u0004s\u0015_\u0011ì\u009bö\u0004ità\u0007\u001eÝ\u009d\u0011Ê\u0016<\b \u000eî\u000f\n\u0007ý\u0000*\u0015V\u00130Ý\u0081\u0012÷¤à\f$¥¯\u000bæ°ò\u0014=kÒ\u000e\u0017¿ö\u0004\u0011\u0086ü\u0002{è$\u0004¹èe\u0013¥<]\u0002ÚIO\u0004l\u0086ë\u0007úih\u0007Õ[\u0086\b\u0007õ*\u0002}[\u009a\u0007yjù\u0002;\u0000¹\u0005èøÆ\u0004\u009c2!\u0004~À/\u000b\u0000ñµ\u0010êÇ\u0091\fõ¨*\u0014F\u0019Í\f=\u008cÖ\bEÆ\u0082\rÊ\u0098ª\n\u0096¬g\u0014U'@\u0002ëÉ,\u0006Û\u0089\u0097\u0013\u0097\u0090ä\b³½}\u0012.\u000f\u0098\u0010$ÿw\u0012ÍTÓ\u0012\u0098*Æ\u0002?¿\u009e\u0001ä¶~\u0012½!1\u0007p¿Í\u0002;à6\u0000\u001e\u008d \tøvf\u000e¼\u001f2\u0005\u0016®N\u0010\u0097Ü\u0094\u0014<é¢\u0006Ú¦\u0099\u0012\u0083(\u0007\u000eµ\u0010W\t¦\u001a°\u0012x$8\b³µJ\u0004\u0006\b\u0084\u0005¿\b\u0088\u00034Hé\u0004ÊBÜ\u0003\u008fç\u009e\u0003°\u0010\u0090\u0013\u0093\u0004½\u0007[Ýa\u000b\fS¤\f\u008cu$\u0011÷\u001e\u0084\u0013¬\u0011\u0012\u0010Õ\u001bD\n\u008aÈ\u009b\u0006Û\u0094\u0006\u0012à:î\u00014q|\u0004}¼\u0091\u0001)Öd\u0003Ã\u009d¬\u000bÝ\u0096-\n«\u0094î\u0000Æ±\u0094\u0013.\u001f`\tÁ\u0015®\bNÅ\u0087\u0006Ô\"Ò\u0013®¹\u0093\u0010,\u0001ê\u0007´\u000b¶\u000b\u0017\u0004H\u000fmd\u0017\nª=\u0092\u0004äÉö\u000fUQ-\n\u0090p\u0081\u0003¸.\u0015\t\u008d^\u008a\rã\u007f\u009f\u0012Î«þ\u0014nzÆ\u0004\u009dì²\u000f\u001eåß\u000f\u0092éD\u0010Å7r\u0011§\u0087ì\u0000h\u0089¬\u000eölÐ\u0004tOQ\u000fÐq\u0092\u0003Ï\bç\u0012\u0093áÙ\b,u\u0083\u0000;ü\r\nÓþ\u008e\u0003\u0017è\u009a\u000e£¦V\u0007§§\u0097\u0005®ý6\té?Ì\u0000%&g\u0011\u0016åC\u0006À+\u000b\u0006¹\bÞ\u0005hóÎ\u0002¬\u009e\u0084\u0001\u009aQô\u0011ÍB\u009f\nÌl\u008c\u0007-×!\u0003½ÿT\u0003ñ\u0090y\u0007ðI\u0086\u0007Ð53\u0002W8¥\u0004.©¢\u0010\u008a¹\u0080\u0000\u001aÌ\u0098\f8Hê\f\u0089\tÀ\rYL\b\u0011\u009fµO\u0004`\u0087§\r\nF\u008b\u000eÏáp\u000bf\u00854\u0000¢ám\u0006ÆÚ~\u0011`\u007fR\u000bÐ=8\u000féH\u000e\u00079·ï\u0011\u0010q-\u0001¸)\u0089\u000bKÇ?\f>µ\u0007\r\u001dÚ\u0015\u0001\u000fÚ\u0082\r\u0017Â$\r\u000b\u001b\u0090\u0007SÄU\u0005]R°\u0007`p\u00ad\u0005Pö¢\u0001Ò,í\fj-£\r¶\u0092\u0084\u0006½\f¼\f3\u0088\u0096\u0013MóÖ\u0005æê\u0004\u0002zrÙ\u000b\u0097.°\u0003Ø\u0002.\u0011>Þ£\bÕuà\u000b\u00ad(I\u0012\u0096°ª\u0014Ef7\r\u0011\u00961\u0000\u0002\\\u008e\u0011Ýù\u001a\u0012\u008eÉ¥\u0013E\\½\u0003ÊM3\u000e±èí\t\u0000Ö\b\u0000!XQ\n±»»\u0002\u0012Aò\u0005\n7c\u0005ü\u0091Ó\u0007)£´\tixk\rm'»\u0011\u0081Ù\u001f\u0006ª³\r\u0013M§(\u0014*\u001b'\u0012Ä\u0016Þ\u000ba}c\u0007\u0080\u0096V\rþ7\u0098\u0013\u0084%V\b\u0080\u001dÚ\fÙ\u0093¨\u000f\u009a\u0002\\\u0012á><\u0007;\u009a¼\u000b\u008f\u0002¢\bH\u009a¶\u0002£åí\u0014s}Z\u0000¢Ð\u0006\u000f¥õÅ\u0003\u0082¯²\u0006\u0003>o\u0006Hç'\u0014/ÏD\u0010N\u0003¬\u0012$#f\u000e¿Ê\u0002\u0007\u0090Pë\u0010É\u000ea\u0003ë\u0093³\u0005D@\u0013\u0006zÎ\u0088\n\u001f3s\u0010t&\u009e\n´Ø,\u0000\u0088\u008c³\f\u009b\u000bP\b\u001aÞÖ\u0007K\u0004.\u0003§t?\u0001\u007f\u0005ã\u0011bÓ)\blÓ\t\u000bÑ3\n\u000fM\u0080}\u0006ô\u0003\u008d\u0002¸\u0087\u008a\n¿\u0010\u0087\b\u0085z+\nâä¸\u0013\u0017_Ô\u0006=\u0002:\t\u0087*Ð\u0003É×¬\u0004\u009e\u001b\u0093\tA#Y\u0001sã\u0012\u0000D²^\u0012N¿&\b\u0083XÙ\u000bcEæ\u0010<Ïö\u000fãñ¾\u0012|\u0001 \u0005ö\\^\u0013¹©\u0085\u0007Óï«\f:\u0004@\u0002\rnz\u000fÄ°º\u0010p®^\u0003z¹Þ\u0007\u008fÜ,\u000eÃ\u008d\u0016\r¼\u0016û\u000e¾Æ\u009b\fÁ\u0004T\u0000C\u0098n\u0003S\u009dZ\nãúÇ\b\u000f\u0016\u001c\u0004¨0h\u0004gµu\u0007H\u007f´\u0012\u0011,K\u000eÝò\f\u000b°Ã;\u0003\u00061[\u0002Y\u008cÇ\u0002R;X\u0003ÍX×\u0000îÙ \u0002\u0084ÉÃ\u0004\u0093Ã?\u0001\u0013J§\u0001¹e?\n\u0001\u0087\u008a\u0007ì)\u0089\r3IK\u0012AWþ\n\u0007ýê\u0012\u0097ñ>\u0006ÚÍÎ\nX\"½\u0003ó\u009eg\u0002K¾Ï\u000b\u0016»Ã\tóþí\n\"/s\u0006\u009cg0\u0000&{\u0002\tÐu«\u0004±\u0019¤\b8\u0082Ù\u0001ßè@\u0004%å\u0012\u000e\u0097Vé\u0001ÎÁî\u0012\u008fVÊ\u0013]¾²\u0001Þ\u0095g\r\u008b×;\u000eíº0\u0004+×W\u000fg\u009a`\u0002çâÇ\têäc\t\u0092¾-\u0013/Ì¦\u000eÉu§\u0005z`c\u00040 Á\u0004fÜ\u0084\u000f\f\u0084|\u0002\u0011±\u000e\u0014&\u001ep\u0010¾Ó\u0013\u0000¢Zq\u0003};û\u000fCõ¸\u0011÷U\u0086\u000eöÕ\u00ad\u000fÙ:«\u0001\u0086\u0010:\u000b\u00ad¤K\b\u0084\u0003q\u0002ÚYü\u00148q\u008d\u0010\u009aé\u001d\fuú_\u0001¸î\u008b\u000e\bßç\u000fs\u0093S\u000e\u0099ÃÓ\u0001j.µ\b¶ó\u0019\u0011b\u0083¦\u0014tr\u0088\f;q¥\u0010ÚoB\u000fçÞÆ\u0012\u008caÛ\u0006o×Ú\u0003Q\u0013J\u000eÎâ\u001b\u0006\u009cë¬\u0007\u009a\u0013\b\u00011 (\u0005{_ñ\u0005m\u00917\u000b0Ê2\n\u008f\u0087?\u000bä,)\f£\u0086.\u000b¯]ß\f XÀ\u0007LÛé\u0001\u0018ùD\t£\u00078\u0002\u0016ë¶\u00142\u0000é\u0010\u007fy\u0005\fL9±\u0001\u0019á«\u0013\u008c\u0087?\u0004ËA}\u0010§D\f\u0004\u0015\u0081\u0082\nÊ2\u000b\u000e$\u00adÛ\u0012¶Ê&\u0000èæÎ\u0003\u0017ØG\u0000\u0092Z\u0007\u0004ìÊ^\u000eCè²\u000eF k\u0011B_\u0095\bNÎK\u000epû*\u0001\u0007ÝÄ\u000b?+¤\u000e\büv\u0006ûIÖ\u000fæ\u0010\u000f\u0013zí;\u0007\u0002 v\u0004\u0090\u0002a\u0011\u00975Ñ\u0000·\u00ad¬\u000bK\u009c\u001a\u0005¬£F\u0011wjd\u0001ç?Ü\u000b)Z×\u0004\\qV\n-\u0084ì\r\u0000£ \u000e\u0014Sr\u0006xýw\u0007ÔFa\u0003\u009c\u00129\u0002\u0087$;\u0010¿\u0014ß\u0000\u0086ÓÑ\u0011ºOì\u0000°\u0098\u0001\u0005pÕ!\u0007|\u00ada\t\u009ey\u0018\r}¿í\b\u0000\u0081±\bgi¾\u0005áä\u0003\tHÉÄ\tË\u008fé\u0004Å.\u0015\u000bãØÛ\u0004*\u0019\u0099\u0002Y\u007fb\r£%\u0017\u0001)Íö\tùñi\u0005[Eº\u0004W;û\u000en'\u000e\u0000â\u0093²\u0002\u0085\f\u0010\u0007\u0086\u008f\u0094\u0012*1À\u0002M0\u009a\u0007QË2\u000fëZì\n\u0003\u000f\u001c\u000b¯«w\u000f%\u0080\u000f\u0002_\u0091³\u0012lÖµ\u0003\u009a\u0080Ä\u000eò9 \u0001:X¿\u000e\u0081á\u0094\u0011t«\u008a\nÀ\u00adä\u0012«Pr\u0001È°á\u0003\u009aa>\u0010ë\u0014À\t\u008d\"Ü\u000e^tT\u0013-\u0099\u0081\u0006x¥+\b\u008e\u008eb\u0010< \u0095\u0013Á\u009ak\u0000ä\u0098¥\u0001ö\u0088\u009f\u000f«JÙ\u0010Å\u0083²\r\u008f\u000eÄ\u0006O\u0097f\u0010?×\u0082\u0010ø\\Q\u000bV:â\n2¬¤\u0002\bsþ\u0013n%\u007f\u000bêÆÑ\r]·\u0013\b\u0096÷Ø\t#\u0080Ç\u0011\u0015\u0080°\u0002\u001d\u001e\u0084\fÄ\u0089\n\u0007\u0086¹î\u0003éÈæ\u0010î\u0092n\u0000e©V\u0013b\u001f¯\u0002Cíñ\u0002þ^Ä\u0007iH\u0082\t4f\u0006\u0000q®\u001c\u0011\u001e\u001aë\u0002\u0002Oó\bn§\u0090\u0010C\nã\u0011\u0013Ìâ\u000e°pâ\n#|\r\u0013\u000e\u0083X\u0013³d\"\bZ_Z\u0000\u009e&\u001c\t\u0092B\u0097\u0001§û\u0003\u0002\u000f\u0082Ù\b\n\u009bÿ\u0000ãbf\u0006åáÿ\u0004¯|t\f\t\fÞ\u0000Ó*|\u0002\b5ý\u000bØnµ\u0002Ô\u0087)\u000eý\u007fX\u0000ö+C\u0002R«Ó\u000eO\u0015\u0084\u0007\u0002`'\tµÖy\u000fªï`\u0003(]\u009a\u0004\u0097\u000bË\u000f(§\u008e\rÃ\u0086¡\u0003dV3\u000b-\u0095\u001f\tw\u0010q\t>pã\u0011\u0002öó\rWø\u00ad\f\u0084TÑ\u0005/`i\n\u0091\u0003÷\u0003\u0012PÓ\u0004}Vý\b\u001c¨\u008b\u0004¼r$\u0010üeL\u0014\u000e¤\f\u000eÐ%:\u000es{V\fA×Â\u0003/8F\u0007\u0004l\u0014\u0000\u0099\"J\n\u0081#\u0084\u0007 \u0089*\u000e¬è\u001d\u000fu\u0084\u0081\u0006]Ë\u0011\u0004\u0018Kÿ\rK«@\u0006í\u001fá\u0007¢ÍW\u000eðïç\b\u00887k\u0007T\u0004¤\u0005ÓüU\u0000Ükï\u0011ÐR\u0002\r!11\u0011RT3\bU\u0000\u0086\u000e9Êl\ff{(\u0007Ø1·\n9\u0013V\u00058)§\u0012TQÙ\u0011Ø©\u0094\u0013@P\u0019\u0010i\u000b\u0006\fÐ¥Ú\u0011Í\u007f2\n_\u001a/\rL\u000eH\u0004Þrë\bÍx.\u000blh\u0092\u0004+úü\u0001\u0003nT\u0013´×\u0001\u0000\u0092¡9\u0004ÒCð\t\u0018·Ì\bþR\u0087\u000fD\u0090/\u0013\u009d\u000fÝ\f\u009c/ø\u0004Ä½X\u00032T\u0089\u0000á\u0092N\u000e\u0082à\u0010\f\n\u001e>\nWcK\u0005\u0005D¶\nTÕå\u0012)!£\u000b#°m\u000e²8@\u000e\rXx\u0006¹ã¤\u0012ESe\u0002³îV\t\u0088e\u0085\f1-ñ\u0003àí\u009b\u000eó\u001d\u00ad\rÁüs\u0010È¶Û\u0012R\u0017¾\u0014Y£â\u0013Bº\u009c\u0004fóä\u0004õ\u0091\u001d\u0002<QF\n8\u001cÃ\u0000\"Äô\t\u0082Ö7\n9P\r".getBytes("ISO-8859-1")).asIntBuffer().get(iArr4, 0, 1024);
            java.lang.System.arraycopy(iArr4, 0, iArr3, 0, 1024);
            getHighSpeedVideoSizes = iArr3;
        }
    }

    static int getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2, java.security.SecureRandom secureRandom) {
        int i;
        int i2;
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[224];
        int[] iArr = new int[1024];
        int[] iArr2 = new int[4096];
        int[] iArr3 = new int[4096];
        int[] iArr4 = new int[4096];
        int[] iArr5 = new int[1024];
        secureRandom.nextBytes(bArr3);
        int i3 = 0;
        org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr4, 0, 224, bArr3, 32);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = 4;
            if (i5 >= 4) {
                break;
            }
            do {
                i4++;
                i2 = i5 * 1024;
                org.bouncycastle.pqc.crypto.qtesla.QTesla1p.Gaussian.Camera2StreamConfigurationMap(i4, bArr4, i5 * 32, iArr2, i2);
            } while (getHighResolutionOutputSizeshNQ4ISI(iArr2, i2));
            i5++;
        }
        do {
            i4++;
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.Gaussian.Camera2StreamConfigurationMap(i4, bArr4, 128, iArr, 0);
        } while (getHighResolutionOutputSizeshNQ4ISI(iArr, 0));
        org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr3, bArr4, 160);
        org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr5, iArr);
        int i6 = 0;
        while (i6 < i) {
            int i7 = i6 * 1024;
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr4, i7, iArr3, i7, iArr5);
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoSizes(iArr4, i7, iArr4, i7, iArr2, i7);
            i6++;
            i = i;
            i3 = i3;
            iArr5 = iArr5;
        }
        int i8 = i;
        int i9 = i3;
        int i10 = i9;
        for (int i11 = i10; i11 < 3712; i11 += 29) {
            int i12 = i10 + 1;
            org.bouncycastle.util.Pack.intToLittleEndian(iArr4[i10] | (iArr4[i12] << 29), bArr, i11 << 2);
            int i13 = iArr4[i12];
            int i14 = i10 + 2;
            org.bouncycastle.util.Pack.intToLittleEndian((i13 >> 3) | (iArr4[i14] << 26), bArr, (i11 + 1) << 2);
            int i15 = iArr4[i14];
            int i16 = i10 + 3;
            org.bouncycastle.util.Pack.intToLittleEndian((i15 >> 6) | (iArr4[i16] << 23), bArr, (i11 + 2) << 2);
            int i17 = iArr4[i16];
            int i18 = i10 + 4;
            org.bouncycastle.util.Pack.intToLittleEndian((i17 >> 9) | (iArr4[i18] << 20), bArr, (i11 + 3) << 2);
            int i19 = iArr4[i18];
            int i20 = i10 + 5;
            org.bouncycastle.util.Pack.intToLittleEndian((i19 >> 12) | (iArr4[i20] << 17), bArr, (i11 + 4) << 2);
            int i21 = iArr4[i20];
            int i22 = i10 + 6;
            org.bouncycastle.util.Pack.intToLittleEndian((i21 >> 15) | (iArr4[i22] << 14), bArr, (i11 + 5) << 2);
            int i23 = iArr4[i22];
            int i24 = i10 + 7;
            org.bouncycastle.util.Pack.intToLittleEndian((i23 >> 18) | (iArr4[i24] << 11), bArr, (i11 + 6) << 2);
            int i25 = iArr4[i24];
            int i26 = i10 + 8;
            org.bouncycastle.util.Pack.intToLittleEndian((i25 >> 21) | (iArr4[i26] << 8), bArr, (i11 + 7) << 2);
            int i27 = iArr4[i26];
            int i28 = i10 + 9;
            org.bouncycastle.util.Pack.intToLittleEndian((i27 >> 24) | (iArr4[i28] << 5), bArr, (i11 + 8) << 2);
            int i29 = i10 + 11;
            org.bouncycastle.util.Pack.intToLittleEndian((iArr4[i28] >> 27) | (iArr4[i10 + 10] << 2) | (iArr4[i29] << 31), bArr, (i11 + 9) << 2);
            int i30 = i10 + 12;
            org.bouncycastle.util.Pack.intToLittleEndian((iArr4[i29] >> 1) | (iArr4[i30] << 28), bArr, (i11 + 10) << 2);
            int i31 = iArr4[i30];
            int i32 = i10 + 13;
            org.bouncycastle.util.Pack.intToLittleEndian((i31 >> i8) | (iArr4[i32] << 25), bArr, (i11 + 11) << 2);
            int i33 = iArr4[i32];
            int i34 = i10 + 14;
            org.bouncycastle.util.Pack.intToLittleEndian((i33 >> 7) | (iArr4[i34] << 22), bArr, (i11 + 12) << 2);
            int i35 = iArr4[i34];
            int i36 = i10 + 15;
            org.bouncycastle.util.Pack.intToLittleEndian((i35 >> 10) | (iArr4[i36] << 19), bArr, (i11 + 13) << 2);
            int i37 = iArr4[i36];
            int i38 = i10 + 16;
            org.bouncycastle.util.Pack.intToLittleEndian((i37 >> 13) | (iArr4[i38] << 16), bArr, (i11 + 14) << 2);
            int i39 = iArr4[i38];
            int i40 = i10 + 17;
            org.bouncycastle.util.Pack.intToLittleEndian((i39 >> 16) | (iArr4[i40] << 13), bArr, (i11 + 15) << 2);
            int i41 = iArr4[i40];
            int i42 = i10 + 18;
            org.bouncycastle.util.Pack.intToLittleEndian((i41 >> 19) | (iArr4[i42] << 10), bArr, (i11 + 16) << 2);
            int i43 = iArr4[i42];
            int i44 = i10 + 19;
            org.bouncycastle.util.Pack.intToLittleEndian((i43 >> 22) | (iArr4[i44] << 7), bArr, (i11 + 17) << 2);
            int i45 = iArr4[i44];
            int i46 = i10 + 20;
            org.bouncycastle.util.Pack.intToLittleEndian((i45 >> 25) | (iArr4[i46] << i8), bArr, (i11 + 18) << 2);
            int i47 = i10 + 22;
            org.bouncycastle.util.Pack.intToLittleEndian((iArr4[i46] >> 28) | (iArr4[i10 + 21] << 1) | (iArr4[i47] << 30), bArr, (i11 + 19) << 2);
            int i48 = i10 + 23;
            org.bouncycastle.util.Pack.intToLittleEndian((iArr4[i47] >> 2) | (iArr4[i48] << 27), bArr, (i11 + 20) << 2);
            int i49 = iArr4[i48];
            int i50 = i10 + 24;
            org.bouncycastle.util.Pack.intToLittleEndian((i49 >> 5) | (iArr4[i50] << 24), bArr, (i11 + 21) << 2);
            int i51 = iArr4[i50];
            int i52 = i10 + 25;
            org.bouncycastle.util.Pack.intToLittleEndian((i51 >> 8) | (iArr4[i52] << 21), bArr, (i11 + 22) << 2);
            int i53 = iArr4[i52];
            int i54 = i10 + 26;
            org.bouncycastle.util.Pack.intToLittleEndian((i53 >> 11) | (iArr4[i54] << 18), bArr, (i11 + 23) << 2);
            int i55 = iArr4[i54];
            int i56 = i10 + 27;
            org.bouncycastle.util.Pack.intToLittleEndian((i55 >> 14) | (iArr4[i56] << 15), bArr, (i11 + 24) << 2);
            int i57 = iArr4[i56];
            int i58 = i10 + 28;
            org.bouncycastle.util.Pack.intToLittleEndian((i57 >> 17) | (iArr4[i58] << 12), bArr, (i11 + 25) << 2);
            int i59 = iArr4[i58];
            int i60 = i10 + 29;
            org.bouncycastle.util.Pack.intToLittleEndian((i59 >> 20) | (iArr4[i60] << 9), bArr, (i11 + 26) << 2);
            int i61 = iArr4[i60];
            int i62 = i10 + 30;
            org.bouncycastle.util.Pack.intToLittleEndian((i61 >> 23) | (iArr4[i62] << 6), bArr, (i11 + 27) << 2);
            org.bouncycastle.util.Pack.intToLittleEndian((iArr4[i62] >> 26) | (iArr4[i10 + 31] << 3), bArr, (i11 + 28) << 2);
            i10 += 32;
        }
        java.lang.System.arraycopy(bArr4, 160, bArr, 14848, 32);
        for (int i63 = i9; i63 < 1024; i63++) {
            bArr2[i63] = (byte) iArr[i63];
        }
        for (int i64 = i9; i64 < i8; i64++) {
            for (int i65 = i9; i65 < 1024; i65++) {
                int i66 = (i64 * 1024) + i65;
                bArr2[i66 + 1024] = (byte) iArr2[i66];
            }
        }
        java.lang.System.arraycopy(bArr4, 160, bArr2, 5120, 64);
        org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr2, 5184, 40, bArr, 14848);
        return i9;
    }

    static int getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, java.security.SecureRandom secureRandom) {
        int[] iArr;
        int[] iArr2;
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[144];
        int[] iArr3 = new int[25];
        short[] sArr = new short[25];
        int[] iArr4 = new int[1024];
        int[] iArr5 = new int[1024];
        int[] iArr6 = new int[1024];
        int[] iArr7 = new int[4096];
        int[] iArr8 = new int[4096];
        int[] iArr9 = new int[1024];
        java.lang.System.arraycopy(bArr3, 5152, bArr6, 0, 32);
        byte[] bArr7 = new byte[32];
        int[] iArr10 = new int[4096];
        secureRandom.nextBytes(bArr7);
        java.lang.System.arraycopy(bArr7, 0, bArr6, 32, 32);
        org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr6, 64, 40, bArr2, i);
        org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr5, 0, 32, bArr6, 104);
        java.lang.System.arraycopy(bArr3, 5184, bArr6, 104, 40);
        org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr8, bArr3, 5120);
        int i2 = 0;
        boolean z = false;
        while (true) {
            int i3 = i2 + 1;
            int i4 = getHighSpeedVideoFpsRangesFor;
            int i5 = i4 * 1024;
            byte[] bArr8 = new byte[i5 + 1];
            short s = (short) (i3 << 8);
            boolean z2 = z;
            org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr8, i5, s, bArr5, 0);
            short s2 = (short) (s + 1);
            int i6 = 0;
            int i7 = 0;
            int i8 = 1024;
            while (true) {
                iArr = iArr6;
                if (i7 >= 1024) {
                    break;
                }
                if (i6 >= i8 * i4) {
                    i8 = getHighResolutionOutputSizeshNQ4ISI;
                    org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr8, i5, s2, bArr5, 0);
                    s2 = (short) (s2 + 1);
                    i6 = 0;
                }
                short s3 = s2;
                int i9 = i5;
                int i10 = (((bArr8[i6 + 1] & 255) << 8) | (bArr8[i6] & 255) | ((bArr8[i6 + 2] & 255) << 16)) & 1048575;
                iArr4[i7] = i10;
                int i11 = i10 - 524287;
                iArr4[i7] = i11;
                if (i11 != 524288) {
                    i7++;
                }
                i6 += i4;
                iArr6 = iArr;
                s2 = s3;
                i5 = i9;
            }
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr5, iArr4);
            for (int i12 = 0; i12 < 4; i12++) {
                int i13 = i12 * 1024;
                org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr7, i13, iArr8, i13, iArr5);
            }
            getHighResolutionOutputSizeshNQ4ISI(bArr4, iArr7, bArr6, 64);
            Camera2StreamConfigurationMap(iArr3, sArr, bArr4);
            int[] iArr11 = iArr8;
            int[] iArr12 = iArr10;
            int[] iArr13 = iArr7;
            iArr2 = iArr9;
            int[] iArr14 = iArr5;
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoSizes(iArr, 0, bArr3, 0, iArr3, sArr);
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr2, iArr4, iArr);
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 1024; i15 < i16; i16 = 1024) {
                int i17 = iArr2[i15];
                int i18 = i17 >> 31;
                i14 |= 523733 - ((i17 ^ i18) - i18);
                i15++;
            }
            if ((i14 >>> 31) == 0) {
                boolean z3 = z2;
                int i19 = 0;
                for (int i20 = 4; i19 < i20; i20 = 4) {
                    int i21 = i19 * 1024;
                    int i22 = i19 + 1;
                    org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoSizes(iArr12, i21, bArr3, i22 * 1024, iArr3, sArr);
                    org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.Camera2StreamConfigurationMap(iArr13, i21, iArr13, i21, iArr12, i21);
                    int i23 = 0;
                    while (true) {
                        if (i23 >= 1024) {
                            z3 = false;
                            break;
                        }
                        int i24 = iArr13[i21 + i23];
                        int i25 = (171788288 - i24) >> 31;
                        int i26 = ((i24 - 343576577) & i25) | ((~i25) & i24);
                        int i27 = i26 >> 31;
                        int i28 = (i26 ^ i27) - i27;
                        int i29 = i26 - (((2097151 + i26) >> 22) << 22);
                        int i30 = i29 >> 31;
                        if ((((~(((i29 ^ i30) - i30) - 2096598)) | (~(i28 - 171787734))) >>> 31) == 1) {
                            z3 = true;
                            break;
                        }
                        i23++;
                    }
                    if (z3) {
                        break;
                    }
                    i19 = i22;
                }
                if (!z3) {
                    break;
                }
                iArr6 = iArr;
                iArr9 = iArr2;
                iArr10 = iArr12;
                i2 = i3;
                iArr7 = iArr13;
                iArr5 = iArr14;
                z = z3;
                iArr8 = iArr11;
            } else {
                iArr6 = iArr;
                iArr9 = iArr2;
                iArr8 = iArr11;
                iArr10 = iArr12;
                i2 = i3;
                iArr7 = iArr13;
                iArr5 = iArr14;
                z = z2;
            }
        }
        int i31 = 0;
        for (int i32 = 0; i32 < 640; i32 += 10) {
            int i33 = i31 + 1;
            org.bouncycastle.util.Pack.intToLittleEndian((iArr2[i31] & 1048575) | (iArr2[i33] << 20), bArr, i32 << 2);
            int i34 = i31 + 3;
            org.bouncycastle.util.Pack.intToLittleEndian(((iArr2[i33] >>> 12) & 255) | ((iArr2[i31 + 2] & 1048575) << 8) | (iArr2[i34] << 28), bArr, (i32 + 1) << 2);
            int i35 = i31 + 4;
            org.bouncycastle.util.Pack.intToLittleEndian(((iArr2[i34] >>> 4) & 65535) | (iArr2[i35] << 16), bArr, (i32 + 2) << 2);
            int i36 = i31 + 6;
            org.bouncycastle.util.Pack.intToLittleEndian(((iArr2[i35] >>> 16) & 15) | ((iArr2[i31 + 5] & 1048575) << 4) | (iArr2[i36] << 24), bArr, (i32 + 3) << 2);
            org.bouncycastle.util.Pack.intToLittleEndian(((iArr2[i36] >>> 8) & my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL) | (iArr2[i31 + 7] << 12), bArr, (i32 + 4) << 2);
            int i37 = i31 + 9;
            org.bouncycastle.util.Pack.intToLittleEndian((iArr2[i31 + 8] & 1048575) | (iArr2[i37] << 20), bArr, (i32 + 5) << 2);
            int i38 = i31 + 11;
            org.bouncycastle.util.Pack.intToLittleEndian(((iArr2[i37] >>> 12) & 255) | ((iArr2[i31 + 10] & 1048575) << 8) | (iArr2[i38] << 28), bArr, (i32 + 6) << 2);
            int i39 = i31 + 12;
            org.bouncycastle.util.Pack.intToLittleEndian(((iArr2[i38] >>> 4) & 65535) | (iArr2[i39] << 16), bArr, (i32 + 7) << 2);
            int i40 = i31 + 14;
            org.bouncycastle.util.Pack.intToLittleEndian(((iArr2[i39] >>> 16) & 15) | ((iArr2[i31 + 13] & 1048575) << 4) | (iArr2[i40] << 24), bArr, (i32 + 8) << 2);
            org.bouncycastle.util.Pack.intToLittleEndian(((iArr2[i40] >>> 8) & my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL) | (iArr2[i31 + 15] << 12), bArr, (i32 + 9) << 2);
            i31 += 16;
        }
        java.lang.System.arraycopy(bArr4, 0, bArr, 2560, 32);
        return 0;
    }

    static int Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        int i2;
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[80];
        int[] iArr = new int[25];
        short[] sArr = new short[25];
        int[] iArr2 = new int[4096];
        int[] iArr3 = new int[4096];
        int[] iArr4 = new int[4096];
        int[] iArr5 = new int[1024];
        int[] iArr6 = new int[1024];
        int[] iArr7 = new int[4096];
        if (i != 2592) {
            return -1;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < 1024) {
            int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, i4 << 2);
            byte[] bArr8 = bArr5;
            int littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, (i4 + 1) << 2);
            int[] iArr8 = iArr4;
            int littleEndianToInt3 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, (i4 + 2) << 2);
            int[] iArr9 = iArr6;
            int littleEndianToInt4 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, (i4 + 3) << 2);
            short[] sArr2 = sArr;
            int littleEndianToInt5 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, (i4 + 4) << 2);
            int[] iArr10 = iArr;
            int littleEndianToInt6 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, (i4 + 5) << 2);
            int[] iArr11 = iArr3;
            int littleEndianToInt7 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, (i4 + 6) << 2);
            byte[] bArr9 = bArr7;
            int littleEndianToInt8 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, (i4 + 7) << 2);
            int littleEndianToInt9 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, (i4 + 8) << 2);
            byte[] bArr10 = bArr6;
            int littleEndianToInt10 = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, (i4 + 9) << 2);
            iArr5[i3] = (littleEndianToInt << 12) >> 12;
            iArr5[i3 + 1] = (littleEndianToInt >>> 20) | ((littleEndianToInt2 << 24) >> 12);
            iArr5[i3 + 2] = (littleEndianToInt2 << 4) >> 12;
            iArr5[i3 + 3] = (littleEndianToInt2 >>> 28) | ((littleEndianToInt3 << 16) >> 12);
            iArr5[i3 + 4] = (littleEndianToInt3 >>> 16) | ((littleEndianToInt4 << 28) >> 12);
            iArr5[i3 + 5] = (littleEndianToInt4 << 8) >> 12;
            iArr5[i3 + 6] = (littleEndianToInt4 >>> 24) | ((littleEndianToInt5 << 20) >> 12);
            iArr5[i3 + 7] = littleEndianToInt5 >> 12;
            iArr5[i3 + 8] = (littleEndianToInt6 << 12) >> 12;
            iArr5[i3 + 9] = (littleEndianToInt6 >>> 20) | ((littleEndianToInt7 << 24) >> 12);
            iArr5[i3 + 10] = (littleEndianToInt7 << 4) >> 12;
            iArr5[i3 + 11] = (littleEndianToInt7 >>> 28) | ((littleEndianToInt8 << 16) >> 12);
            iArr5[i3 + 12] = (littleEndianToInt8 >>> 16) | ((littleEndianToInt9 << 28) >> 12);
            iArr5[i3 + 13] = (littleEndianToInt9 << 8) >> 12;
            iArr5[i3 + 14] = (littleEndianToInt9 >>> 24) | ((littleEndianToInt10 << 20) >> 12);
            iArr5[i3 + 15] = littleEndianToInt10 >> 12;
            i4 += 10;
            i3 += 16;
            bArr5 = bArr8;
            iArr4 = iArr8;
            iArr6 = iArr9;
            sArr = sArr2;
            iArr = iArr10;
            iArr3 = iArr11;
            bArr7 = bArr9;
            bArr6 = bArr10;
        }
        int[] iArr12 = iArr6;
        byte[] bArr11 = bArr5;
        byte[] bArr12 = bArr6;
        byte[] bArr13 = bArr7;
        int[] iArr13 = iArr4;
        int[] iArr14 = iArr3;
        short[] sArr3 = sArr;
        int[] iArr15 = iArr;
        java.lang.System.arraycopy(bArr2, 2560, bArr4, 0, 32);
        for (int i5 = 0; i5 < 1024; i5++) {
            int i6 = iArr5[i5];
            if (i6 < -523733 || i6 > 523733) {
                return -2;
            }
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i2 = 4;
            if (i7 >= 4096) {
                break;
            }
            int i9 = i8 << 2;
            iArr2[i7] = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i9) & 536870911;
            int i10 = (i8 + 1) << 2;
            iArr2[i7 + 1] = ((org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i9) >>> 29) | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i10) << 3)) & 536870911;
            int littleEndianToInt11 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i10) >>> 26;
            int i11 = (i8 + 2) << 2;
            iArr2[i7 + 2] = (littleEndianToInt11 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i11) << 6)) & 536870911;
            int littleEndianToInt12 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i11) >>> 23;
            int i12 = (i8 + 3) << 2;
            iArr2[i7 + 3] = (littleEndianToInt12 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i12) << 9)) & 536870911;
            int littleEndianToInt13 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i12) >>> 20;
            int i13 = (i8 + 4) << 2;
            iArr2[i7 + 4] = (littleEndianToInt13 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i13) << 12)) & 536870911;
            int littleEndianToInt14 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i13) >>> 17;
            int i14 = (i8 + 5) << 2;
            iArr2[i7 + 5] = (littleEndianToInt14 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i14) << 15)) & 536870911;
            int littleEndianToInt15 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i14) >>> 14;
            int i15 = (i8 + 6) << 2;
            iArr2[i7 + 6] = (littleEndianToInt15 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i15) << 18)) & 536870911;
            int littleEndianToInt16 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i15) >>> 11;
            int i16 = (i8 + 7) << 2;
            iArr2[i7 + 7] = (littleEndianToInt16 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i16) << 21)) & 536870911;
            int littleEndianToInt17 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i16) >>> 8;
            int i17 = (i8 + 8) << 2;
            iArr2[i7 + 8] = (littleEndianToInt17 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i17) << 24)) & 536870911;
            int littleEndianToInt18 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i17) >>> 5;
            int i18 = (i8 + 9) << 2;
            iArr2[i7 + 9] = (littleEndianToInt18 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i18) << 27)) & 536870911;
            iArr2[i7 + 10] = (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i18) >>> 2) & 536870911;
            int littleEndianToInt19 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i18) >>> 31;
            int i19 = (i8 + 10) << 2;
            iArr2[i7 + 11] = (littleEndianToInt19 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i19) << 1)) & 536870911;
            int littleEndianToInt20 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i19) >>> 28;
            int i20 = (i8 + 11) << 2;
            iArr2[i7 + 12] = (littleEndianToInt20 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i20) << 4)) & 536870911;
            int littleEndianToInt21 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i20) >>> 25;
            int i21 = (i8 + 12) << 2;
            iArr2[i7 + 13] = (littleEndianToInt21 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i21) << 7)) & 536870911;
            int littleEndianToInt22 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i21) >>> 22;
            int i22 = (i8 + 13) << 2;
            iArr2[i7 + 14] = (littleEndianToInt22 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i22) << 10)) & 536870911;
            int littleEndianToInt23 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i22) >>> 19;
            int i23 = (i8 + 14) << 2;
            iArr2[i7 + 15] = (littleEndianToInt23 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i23) << 13)) & 536870911;
            int littleEndianToInt24 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i23) >>> 16;
            int i24 = (i8 + 15) << 2;
            iArr2[i7 + 16] = (littleEndianToInt24 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i24) << 16)) & 536870911;
            int littleEndianToInt25 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i24);
            int i25 = (i8 + 16) << 2;
            iArr2[i7 + 17] = ((littleEndianToInt25 >>> 13) | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i25) << 19)) & 536870911;
            int littleEndianToInt26 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i25) >>> 10;
            int i26 = (i8 + 17) << 2;
            iArr2[i7 + 18] = (littleEndianToInt26 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i26) << 22)) & 536870911;
            int littleEndianToInt27 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i26) >>> 7;
            int i27 = (i8 + 18) << 2;
            iArr2[i7 + 19] = (littleEndianToInt27 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i27) << 25)) & 536870911;
            int i28 = (i8 + 19) << 2;
            iArr2[i7 + 20] = ((org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i27) >>> 4) | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i28) << 28)) & 536870911;
            iArr2[i7 + 21] = (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i28) >>> 1) & 536870911;
            int littleEndianToInt28 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i28) >>> 30;
            int i29 = (i8 + 20) << 2;
            iArr2[i7 + 22] = (littleEndianToInt28 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i29) << 2)) & 536870911;
            int littleEndianToInt29 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i29) >>> 27;
            int i30 = (i8 + 21) << 2;
            iArr2[i7 + 23] = (littleEndianToInt29 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i30) << 5)) & 536870911;
            int littleEndianToInt30 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i30) >>> 24;
            int i31 = (i8 + 22) << 2;
            iArr2[i7 + 24] = (littleEndianToInt30 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i31) << 8)) & 536870911;
            int littleEndianToInt31 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i31) >>> 21;
            int i32 = (i8 + 23) << 2;
            iArr2[i7 + 25] = (littleEndianToInt31 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i32) << 11)) & 536870911;
            int littleEndianToInt32 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i32) >>> 18;
            int i33 = (i8 + 24) << 2;
            iArr2[i7 + 26] = (littleEndianToInt32 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i33) << 14)) & 536870911;
            int littleEndianToInt33 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i33) >>> 15;
            int i34 = (i8 + 25) << 2;
            iArr2[i7 + 27] = (littleEndianToInt33 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i34) << 17)) & 536870911;
            int littleEndianToInt34 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i34) >>> 12;
            int i35 = (i8 + 26) << 2;
            iArr2[i7 + 28] = (littleEndianToInt34 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i35) << 20)) & 536870911;
            int littleEndianToInt35 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i35) >>> 9;
            int i36 = (i8 + 27) << 2;
            iArr2[i7 + 29] = (littleEndianToInt35 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i36) << 23)) & 536870911;
            int littleEndianToInt36 = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i36) >>> 6;
            int i37 = (i8 + 28) << 2;
            iArr2[i7 + 30] = (littleEndianToInt36 | (org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i37) << 26)) & 536870911;
            iArr2[i7 + 31] = org.bouncycastle.util.Pack.littleEndianToInt(bArr3, i37) >>> 3;
            i8 += 29;
            i7 += 32;
        }
        java.lang.System.arraycopy(bArr3, 14848, bArr12, 0, 32);
        org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr13, 0, 40, bArr, bArr.length);
        org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr13, 40, 40, bArr3, 14848);
        org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr14, bArr12, 0);
        Camera2StreamConfigurationMap(iArr15, sArr3, bArr4);
        org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr12, iArr5);
        int i38 = 0;
        while (i38 < i2) {
            int i39 = i38 * 1024;
            int[] iArr16 = iArr13;
            int[] iArr17 = iArr7;
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighResolutionOutputSizeshNQ4ISI(iArr13, i39, iArr2, i39, iArr15, sArr3);
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighSpeedVideoFpsRangesFor(iArr17, i39, iArr14, i39, iArr12);
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.QTesla1PPolynomial.getHighResolutionOutputSizeshNQ4ISI(iArr17, i39, iArr17, i39, iArr16, i39);
            i38++;
            iArr7 = iArr17;
            iArr2 = iArr2;
            i2 = 4;
            iArr13 = iArr16;
        }
        getHighResolutionOutputSizeshNQ4ISI(bArr11, iArr7, bArr13, 0);
        for (int i40 = 0; i40 < 32; i40++) {
            if (bArr4[i40] != bArr11[i40]) {
                return -3;
            }
        }
        return 0;
    }

    static class Gaussian {
        private static final int[] getHighResolutionOutputSizeshNQ4ISI = {0, 0, 100790826, 671507412, 300982266, 372236861, 497060329, 1131554536, 686469725, 80027618, 866922278, 352172656, 1036478428, 1164298592, 1193606242, 860014474, 1337215220, 1378472045, 1466664345, 1948467327, 1581745882, 839957239, 1682648210, 1125857607, 1769902286, 2009293508, 1844317078, 664324558, 1906909508, 1466301668, 1958834133, 506071440, 2001317010, 234057451, 2035597220, 671584905, 2062878330, 786178128, 2084290940, 306011771, 2100866422, 714310105, 2113521119, 243698855, 2123049658, 417712145, 2130125692, 9470578, 2135308229, 1840927014, 2139051783, 1246948843, 2141718732, 589890969, 2143592579, 1774056149, 2144891082, 1109874008, 2145778525, 1056451611, 2146376698, 1812177762, 2146774350, 829172876, 2147035066, 313414831, 2147203651, 1956430050, 2147311165, 1160031633, 2147378788, 1398244789, 2147420737, 187242113, 2147446401, 321666415, 2147461886, 1304194029, 2147471101, 2048797972, 2147476510, 1282326805, 2147479641, 831849416, 2147481428, 1574767936, 2147482435, 194943011, 2147482993, 1991776993, 2147483299, 2120655340, 2147483465, 653713809, 2147483553, 799217300, 2147483599, 1380433609, 2147483623, 1329670087, 2147483635, 1873439229, 2147483642, 103862387, 2147483645, 254367675, 2147483646, 1339200562, Integer.MAX_VALUE, 754636301, Integer.MAX_VALUE, 1499965744, Integer.MAX_VALUE, 1850514943, Integer.MAX_VALUE, 2013121736, Integer.MAX_VALUE, 2087512222, Integer.MAX_VALUE, 2121077103, Integer.MAX_VALUE, 2136013361, Integer.MAX_VALUE, 2142568585, Integer.MAX_VALUE, 2145405997, Integer.MAX_VALUE, 2146617281, Integer.MAX_VALUE, 2147127267, Integer.MAX_VALUE, 2147339035, Integer.MAX_VALUE, 2147425762, Integer.MAX_VALUE, 2147460791, Integer.MAX_VALUE, 2147474745, Integer.MAX_VALUE, 2147480227, Integer.MAX_VALUE, 2147482351, Integer.MAX_VALUE, 2147483163, Integer.MAX_VALUE, 2147483469, Integer.MAX_VALUE, 2147483583, Integer.MAX_VALUE, 2147483625, Integer.MAX_VALUE, 2147483640, Integer.MAX_VALUE, 2147483645, Integer.MAX_VALUE, Integer.MAX_VALUE};

        static void Camera2StreamConfigurationMap(int i, byte[] bArr, int i2, int[] iArr, int i3) {
            int i4 = i << 8;
            byte[] bArr2 = new byte[4096];
            int[] iArr2 = new int[2];
            int i5 = 0;
            while (i5 < 1024) {
                org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr2, 4096, (short) i4, bArr, i2);
                for (int i6 = 0; i6 < 512; i6++) {
                    int i7 = i3 + i5 + i6;
                    iArr[i7] = 0;
                    for (int i8 = 1; i8 < 78; i8++) {
                        int i9 = 0;
                        for (int i10 = 1; i10 >= 0; i10--) {
                            int highSpeedVideoFpsRangesFor = (org.bouncycastle.pqc.crypto.qtesla.QTesla1p.getHighSpeedVideoFpsRangesFor(bArr2, i6 * 2, i10) & Integer.MAX_VALUE) - (getHighResolutionOutputSizeshNQ4ISI[(i8 * 2) + i10] + i9);
                            iArr2[i10] = highSpeedVideoFpsRangesFor;
                            i9 = highSpeedVideoFpsRangesFor >> 31;
                        }
                        iArr[i7] = iArr[i7] + ((~i9) & 1);
                    }
                    int i11 = bArr2[((i6 * 2) << 2) + 3] >> com.google.common.base.Ascii.US;
                    int i12 = iArr[i7];
                    iArr[i7] = (i11 & (-i12)) | ((~i11) & i12);
                }
                i5 += 512;
                i4++;
            }
        }

        Gaussian() {
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int[] iArr, byte[] bArr2, int i) {
        byte[] bArr3 = new byte[4176];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 * 1024;
            int i4 = 0;
            while (i4 < 1024) {
                int i5 = iArr[i3];
                int i6 = (171788288 - i5) >> 31;
                int i7 = ((i5 - 343576577) & i6) | ((~i6) & i5);
                int i8 = 4194303 & i7;
                int i9 = (2097152 - i8) >> 31;
                bArr3[i3] = (byte) ((i7 - (((i8 - 4194304) & i9) | ((~i9) & i8))) >> 22);
                i4++;
                i3++;
            }
        }
        java.lang.System.arraycopy(bArr2, i, bArr3, 4096, 80);
        org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr, 0, 32, bArr3, 4176);
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, short[] sArr, byte[] bArr) {
        short[] sArr2 = new short[1024];
        byte[] bArr2 = new byte[com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE];
        org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr2, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, (short) 0, bArr, 0);
        org.bouncycastle.util.Arrays.fill(sArr2, (short) 0);
        int i = 0;
        int i2 = 0;
        short s = 1;
        while (i < 25) {
            if (i2 > 165) {
                org.bouncycastle.pqc.crypto.qtesla.HashUtils.getHighSpeedVideoFpsRangesFor(bArr2, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, s, bArr, 0);
                s = (short) (s + 1);
                i2 = 0;
            }
            int i3 = ((bArr2[i2] << 8) | (bArr2[i2 + 1] & 255)) & 1023;
            if (sArr2[i3] == 0) {
                if ((bArr2[i2 + 2] & 1) == 1) {
                    sArr2[i3] = -1;
                } else {
                    sArr2[i3] = 1;
                }
                iArr[i] = i3;
                sArr[i] = sArr2[i3];
                i++;
            }
            i2 += 3;
        }
    }

    QTesla1p() {
    }
}
