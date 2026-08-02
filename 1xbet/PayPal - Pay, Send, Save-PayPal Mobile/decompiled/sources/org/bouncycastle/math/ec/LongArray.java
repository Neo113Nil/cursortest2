package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
class LongArray implements java.lang.Cloneable {
    static final byte[] Camera2StreamConfigurationMap;
    private static final long[] getOutputMinFrameDuration;
    long[] getHighResolutionOutputSizeshNQ4ISI;
    private static final short[] getHighSpeedVideoFpsRangesFor = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, com.visa.cbp.getEncExpo.initializeViewTreeOwners, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    private static final int[] getHighSpeedVideoFpsRanges = {0, 1, 8, 9, 64, 65, 72, 73, 512, 513, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL, 576, 577, 584, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, 4096, androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN, 4104, 4105, 4160, 4161, 4168, 4169, 4608, 4609, 4616, 4617, 4672, 4673, 4680, 4681, 32768, org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_EPSON_ERF_COMPRESSED, 32776, 32777, 32832, 32833, 32840, 32841, 33280, 33281, 33288, 33289, 33344, 33345, 33352, 33353, 36864, 36865, 36872, 36873, 36928, 36929, 36936, 36937, 37376, 37377, 37384, 37385, 37440, 37441, 37448, 37449, 262144, 262145, 262152, 262153, 262208, 262209, 262216, 262217, 262656, 262657, 262664, 262665, 262720, 262721, 262728, 262729, 266240, 266241, 266248, 266249, 266304, 266305, 266312, 266313, 266752, 266753, 266760, 266761, 266816, 266817, 266824, 266825, 294912, 294913, 294920, 294921, 294976, 294977, 294984, 294985, 295424, 295425, 295432, 295433, 295488, 295489, 295496, 295497, 299008, 299009, 299016, 299017, 299072, 299073, 299080, 299081, 299520, 299521, 299528, 299529, 299584, 299585, 299592, 299593};
    private static final int[] getHighSpeedVideoSizes = {0, 1, 16, 17, 256, 257, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 4096, androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN, 4112, 4113, 4352, 4353, 4368, 4369, 65536, 65537, 65552, 65553, 65792, 65793, 65808, 65809, 69632, 69633, 69648, 69649, 69888, 69889, 69904, 69905, 1048576, 1048577, 1048592, 1048593, 1048832, 1048833, 1048848, 1048849, 1052672, 1052673, 1052688, 1052689, 1052928, 1052929, 1052944, 1052945, androidx.media3.common.util.ParsableByteArray.INVALID_CODE_POINT, 1114113, 1114128, 1114129, 1114368, 1114369, 1114384, 1114385, 1118208, 1118209, 1118224, 1118225, 1118464, 1118465, 1118480, 1118481, 16777216, 16777217, androidx.core.view.InputDeviceCompat.SOURCE_JOYSTICK, 16777233, 16777472, 16777473, 16777488, 16777489, 16781312, 16781313, 16781328, 16781329, 16781568, 16781569, 16781584, 16781585, android.R.attr.theme, android.R.attr.label, android.R.attr.exported, android.R.attr.process, android.R.attr.transcriptMode, android.R.attr.cacheColorHint, android.R.attr.childIndicatorRight, android.R.attr.childDivider, 16846848, 16846849, 16846864, 16846865, 16847104, 16847105, 16847120, 16847121, android.R.raw.loaderror, android.R.raw.nodomain, 17825808, 17825809, 17826048, 17826049, 17826064, 17826065, 17829888, 17829889, 17829904, 17829905, 17830144, 17830145, 17830160, 17830161, android.R.bool.config_sendPackageName, android.R.bool.config_showDefaultAssistant, android.R.bool.allow_test_udfps, android.R.bool.auto_data_switch_allow_roaming, android.R.bool.config_cecSetMenuLanguageEnabled_default, android.R.bool.config_cecSetMenuLanguage_userConfigurable, android.R.bool.config_cecSystemAudioModeMuting_userConfigurable, android.R.bool.config_cecTvSendStandbyOnSleepDisabled_allowed, 17895424, 17895425, 17895440, 17895441, 17895680, 17895681, 17895696, 17895697, 268435456, 268435457, 268435472, 268435473, 268435712, 268435713, 268435728, 268435729, 268439552, 268439553, 268439568, 268439569, 268439808, 268439809, 268439824, 268439825, 268500992, 268500993, 268501008, 268501009, 268501248, 268501249, 268501264, 268501265, 268505088, 268505089, 268505104, 268505105, 268505344, 268505345, 268505360, 268505361, 269484032, 269484033, 269484048, 269484049, 269484288, 269484289, 269484304, 269484305, 269488128, 269488129, 269488144, 269488145, 269488384, 269488385, 269488400, 269488401, 269549568, 269549569, 269549584, 269549585, 269549824, 269549825, 269549840, 269549841, 269553664, 269553665, 269553680, 269553681, 269553920, 269553921, 269553936, 269553937, 285212672, 285212673, 285212688, 285212689, 285212928, 285212929, 285212944, 285212945, 285216768, 285216769, 285216784, 285216785, 285217024, 285217025, 285217040, 285217041, 285278208, 285278209, 285278224, 285278225, 285278464, 285278465, 285278480, 285278481, 285282304, 285282305, 285282320, 285282321, 285282560, 285282561, 285282576, 285282577, 286261248, 286261249, 286261264, 286261265, 286261504, 286261505, 286261520, 286261521, 286265344, 286265345, 286265360, 286265361, 286265600, 286265601, 286265616, 286265617, 286326784, 286326785, 286326800, 286326801, 286327040, 286327041, 286327056, 286327057, 286330880, 286330881, 286330896, 286330897, 286331136, 286331137, 286331152, 286331153};
    private static final int[] getOutputFormats = {0, 1, 32, 33, 1024, 1025, 1056, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_VERSION_INFO, 32768, org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_EPSON_ERF_COMPRESSED, 32800, 32801, 33792, 33793, 33824, 33825, 1048576, 1048577, 1048608, 1048609, 1049600, 1049601, 1049632, 1049633, 1081344, 1081345, 1081376, 1081377, 1082368, 1082369, 1082400, 1082401, 33554432, androidx.core.view.InputDeviceCompat.SOURCE_HDMI, 33554464, 33554465, 33555456, 33555457, 33555488, 33555489, 33587200, 33587201, 33587232, 33587233, 33588224, 33588225, 33588256, 33588257, 34603008, 34603009, 34603040, 34603041, 34604032, 34604033, 34604064, 34604065, 34635776, 34635777, 34635808, 34635809, 34636800, 34636801, 34636832, 34636833, 1073741824, 1073741825, 1073741856, 1073741857, 1073742848, 1073742849, 1073742880, 1073742881, 1073774592, 1073774593, 1073774624, 1073774625, 1073775616, 1073775617, 1073775648, 1073775649, 1074790400, 1074790401, 1074790432, 1074790433, 1074791424, 1074791425, 1074791456, 1074791457, 1074823168, 1074823169, 1074823200, 1074823201, 1074824192, 1074824193, 1074824224, 1074824225, 1107296256, 1107296257, 1107296288, 1107296289, 1107297280, 1107297281, 1107297312, 1107297313, 1107329024, 1107329025, 1107329056, 1107329057, 1107330048, 1107330049, 1107330080, 1107330081, 1108344832, 1108344833, 1108344864, 1108344865, 1108345856, 1108345857, 1108345888, 1108345889, 1108377600, 1108377601, 1108377632, 1108377633, 1108378624, 1108378625, 1108378656, 1108378657};

    private static void getHighSpeedVideoSizes(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = i + (i4 >>> 6);
        int i6 = i4 & 63;
        if (i6 == 0) {
            getHighResolutionOutputSizeshNQ4ISI(jArr, i5, jArr2, i2, i3);
            return;
        }
        int i7 = i5 + 1;
        int i8 = 64 - i6;
        long j = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                jArr[i5] = jArr[i5] ^ j;
                return;
            }
            long j2 = jArr2[i2 + i3];
            int i9 = i7 + i3;
            jArr[i9] = (j | (j2 >>> i8)) ^ jArr[i9];
            j = j2 << (64 - i8);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(long[] jArr, int i, int i2, int i3, int[] iArr) {
        int i4 = (i2 >>> 6) + i;
        jArr[i4] = jArr[i4] ^ (1 << (i2 & 63));
        int i5 = i2 - i3;
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                int i6 = i + (i5 >>> 6);
                jArr[i6] = jArr[i6] ^ (1 << (i5 & 63));
                return;
            } else {
                int i7 = iArr[length] + i5;
                int i8 = (i7 >>> 6) + i;
                jArr[i8] = jArr[i8] ^ (1 << (i7 & 63));
            }
        }
    }

    private static int Camera2StreamConfigurationMap(long[] jArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5 = (i3 + 63) >>> 6;
        if (i2 < i5) {
            return i2;
        }
        int i6 = i2 << 6;
        int min = java.lang.Math.min(i6, (i3 << 1) - 1);
        int i7 = i6 - min;
        int i8 = i2;
        while (i7 >= 64) {
            i8--;
            i7 -= 64;
        }
        int length = iArr.length;
        int i9 = iArr[length - 1];
        int i10 = length > 1 ? iArr[length - 2] : 0;
        int max = java.lang.Math.max(i3, i9 + 64);
        int min2 = (i7 + java.lang.Math.min(min - max, i3 - i10)) >> 6;
        if (min2 > 1) {
            int i11 = i8 - min2;
            int i12 = i11 << 6;
            int i13 = i12 - i3;
            int length2 = iArr.length;
            while (true) {
                int i14 = length2 - 1;
                if (i14 < 0) {
                    break;
                }
                getHighSpeedVideoSizes(jArr, 0, jArr, i11, i8 - i11, i13 + iArr[i14]);
                i11 = i11;
                length2 = i14;
            }
            int i15 = i11;
            getHighSpeedVideoSizes(jArr, 0, jArr, i15, i8 - i15, i13);
            while (i8 > i15) {
                i8--;
                jArr[i8] = 0;
            }
            min = i12;
        }
        if (min > max) {
            int i16 = max >>> 6;
            while (true) {
                int i17 = i8 - 1;
                if (i17 <= i16) {
                    break;
                }
                long j = jArr[i17];
                if (j != 0) {
                    jArr[i17] = 0;
                    i4 = i17;
                    getHighSpeedVideoSizes(jArr, 0, i17 << 6, j, i3, iArr);
                } else {
                    i4 = i17;
                }
                i8 = i4;
            }
            int i18 = max & 63;
            long j2 = jArr[i16];
            long j3 = j2 >>> i18;
            if (j3 != 0) {
                jArr[i16] = (j3 << i18) ^ j2;
                getHighSpeedVideoSizes(jArr, 0, max, j3, i3, iArr);
            }
        } else {
            max = min;
        }
        if (max > i3) {
            while (true) {
                max--;
                if (max < i3) {
                    break;
                }
                if ((jArr[max >>> 6] & (1 << (max & 63))) != 0) {
                    getHighResolutionOutputSizeshNQ4ISI(jArr, 0, max, i3, iArr);
                }
            }
        }
        return i5;
    }

    public final void getHighSpeedVideoSizes(org.bouncycastle.math.ec.LongArray longArray) {
        int highResolutionOutputSizeshNQ4ISI = longArray.getHighResolutionOutputSizeshNQ4ISI(longArray.getHighResolutionOutputSizeshNQ4ISI.length);
        if (highResolutionOutputSizeshNQ4ISI == 0) {
            return;
        }
        long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (highResolutionOutputSizeshNQ4ISI > jArr.length) {
            long[] jArr2 = new long[highResolutionOutputSizeshNQ4ISI];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, java.lang.Math.min(jArr.length, highResolutionOutputSizeshNQ4ISI));
            this.getHighResolutionOutputSizeshNQ4ISI = jArr2;
        }
        getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, 0, longArray.getHighResolutionOutputSizeshNQ4ISI, 0, highResolutionOutputSizeshNQ4ISI);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.math.ec.LongArray)) {
            return false;
        }
        org.bouncycastle.math.ec.LongArray longArray = (org.bouncycastle.math.ec.LongArray) obj;
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.length);
        if (longArray.getHighResolutionOutputSizeshNQ4ISI(longArray.getHighResolutionOutputSizeshNQ4ISI.length) != highResolutionOutputSizeshNQ4ISI) {
            return false;
        }
        for (int i = 0; i < highResolutionOutputSizeshNQ4ISI; i++) {
            if (this.getHighResolutionOutputSizeshNQ4ISI[i] != longArray.getHighResolutionOutputSizeshNQ4ISI[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.length);
        int i = 1;
        for (int i2 = 0; i2 < highResolutionOutputSizeshNQ4ISI; i2++) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public final org.bouncycastle.math.ec.LongArray getHighSpeedVideoSizes(org.bouncycastle.math.ec.LongArray longArray, int i, int[] iArr) {
        int i2;
        int i3;
        org.bouncycastle.math.ec.LongArray longArray2;
        org.bouncycastle.math.ec.LongArray longArray3;
        int i4;
        int i5;
        int highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == 0) {
            return this;
        }
        int highSpeedVideoSizes2 = longArray.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes2 == 0) {
            return longArray;
        }
        if (highSpeedVideoSizes > highSpeedVideoSizes2) {
            i3 = highSpeedVideoSizes;
            i2 = highSpeedVideoSizes2;
            longArray3 = this;
            longArray2 = longArray;
        } else {
            i2 = highSpeedVideoSizes;
            i3 = highSpeedVideoSizes2;
            longArray2 = this;
            longArray3 = longArray;
        }
        int i6 = (i2 + 63) >>> 6;
        int i7 = (i3 + 63) >>> 6;
        int i8 = ((i2 + i3) + 62) >>> 6;
        if (i6 == 1) {
            long j = longArray2.getHighResolutionOutputSizeshNQ4ISI[0];
            if (j == 1) {
                return longArray3;
            }
            long[] jArr = new long[i8];
            getHighResolutionOutputSizeshNQ4ISI(j, longArray3.getHighResolutionOutputSizeshNQ4ISI, i7, jArr);
            return new org.bouncycastle.math.ec.LongArray(jArr, 0, Camera2StreamConfigurationMap(jArr, 0, i8, i, iArr));
        }
        int i9 = (i3 + 70) >>> 6;
        int[] iArr2 = new int[16];
        int i10 = i9 << 4;
        long[] jArr2 = new long[i10];
        iArr2[1] = i9;
        java.lang.System.arraycopy(longArray3.getHighResolutionOutputSizeshNQ4ISI, 0, jArr2, i9, i7);
        int i11 = i9;
        for (int i12 = 2; i12 < 16; i12++) {
            i11 += i9;
            iArr2[i12] = i11;
            if ((i12 & 1) == 0) {
                getHighSpeedVideoFpsRangesFor(jArr2, i11 >>> 1, jArr2, i11, i9, 1);
            } else {
                getHighSpeedVideoFpsRangesFor(jArr2, i9, jArr2, i11 - i9, jArr2, i11, i9);
            }
        }
        long[] jArr3 = new long[i10];
        getHighSpeedVideoFpsRangesFor(jArr2, 0, jArr3, 0, i10, 4);
        long[] jArr4 = longArray2.getHighResolutionOutputSizeshNQ4ISI;
        int i13 = i8 << 3;
        long[] jArr5 = new long[i13];
        int i14 = 0;
        while (i14 < i6) {
            int i15 = i14;
            long j2 = jArr4[i14];
            while (true) {
                i4 = i6;
                i5 = i13;
                getHighSpeedVideoFpsRanges(jArr5, i15, jArr2, iArr2[((int) j2) & 15], jArr3, iArr2[((int) (j2 >>> 4)) & 15], i9);
                j2 >>>= 8;
                if (j2 == 0) {
                    break;
                }
                i15 += i8;
                i6 = i4;
                i13 = i5;
            }
            i14++;
            i6 = i4;
            i13 = i5;
        }
        while (true) {
            i13 -= i8;
            if (i13 == 0) {
                long[] jArr6 = jArr5;
                return new org.bouncycastle.math.ec.LongArray(jArr6, 0, Camera2StreamConfigurationMap(jArr6, 0, i8, i, iArr));
            }
            getHighResolutionOutputSizeshNQ4ISI(jArr5, i13 - i8, jArr5, i13, i8, 8);
            jArr5 = jArr5;
        }
    }

    public final org.bouncycastle.math.ec.LongArray Camera2StreamConfigurationMap(int i, int[] iArr) {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.length);
        if (highResolutionOutputSizeshNQ4ISI == 0) {
            return this;
        }
        int i2 = highResolutionOutputSizeshNQ4ISI << 1;
        long[] jArr = new long[i2];
        for (int i3 = 0; i3 < i2; i3 += 2) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI[i3 >>> 1];
            jArr[i3] = getHighSpeedVideoSizes((int) j);
            jArr[i3 + 1] = getHighSpeedVideoSizes((int) (j >>> 32));
        }
        return new org.bouncycastle.math.ec.LongArray(jArr, 0, Camera2StreamConfigurationMap(jArr, 0, i2, i, iArr));
    }

    public final org.bouncycastle.math.ec.LongArray Camera2StreamConfigurationMap(int i, int i2, int[] iArr) {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.length);
        if (highResolutionOutputSizeshNQ4ISI == 0) {
            return this;
        }
        int i3 = ((i2 + 63) >>> 6) << 1;
        long[] jArr = new long[i3];
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, jArr, 0, highResolutionOutputSizeshNQ4ISI);
        while (true) {
            i--;
            if (i < 0) {
                return new org.bouncycastle.math.ec.LongArray(jArr, 0, highResolutionOutputSizeshNQ4ISI);
            }
            int i4 = highResolutionOutputSizeshNQ4ISI << 1;
            while (true) {
                highResolutionOutputSizeshNQ4ISI--;
                if (highResolutionOutputSizeshNQ4ISI >= 0) {
                    long j = jArr[highResolutionOutputSizeshNQ4ISI];
                    jArr[i4 - 1] = getHighSpeedVideoSizes((int) (j >>> 32));
                    i4 -= 2;
                    jArr[i4] = getHighSpeedVideoSizes((int) j);
                }
            }
            highResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(jArr, 0, i3, i2, iArr);
        }
    }

    public final java.math.BigInteger Camera2StreamConfigurationMap() {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.length);
        if (highResolutionOutputSizeshNQ4ISI == 0) {
            return org.bouncycastle.math.ec.ECConstants.ZERO;
        }
        int i = highResolutionOutputSizeshNQ4ISI - 1;
        long j = this.getHighResolutionOutputSizeshNQ4ISI[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) (j >>> (i3 * 8));
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
                z = true;
            }
        }
        byte[] bArr2 = new byte[(i * 8) + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[i4];
        }
        for (int i5 = highResolutionOutputSizeshNQ4ISI - 2; i5 >= 0; i5--) {
            long j2 = this.getHighResolutionOutputSizeshNQ4ISI[i5];
            int i6 = 7;
            while (i6 >= 0) {
                bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                i6--;
                i2++;
            }
        }
        return new java.math.BigInteger(1, bArr2);
    }

    public java.lang.String toString() {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.length);
        if (highResolutionOutputSizeshNQ4ISI == 0) {
            return "0";
        }
        int i = highResolutionOutputSizeshNQ4ISI - 1;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(java.lang.Long.toBinaryString(this.getHighResolutionOutputSizeshNQ4ISI[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            java.lang.String binaryString = java.lang.Long.toBinaryString(this.getHighResolutionOutputSizeshNQ4ISI[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public final void getHighSpeedVideoSizes(int i, int[] iArr) {
        long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(jArr, 0, jArr.length, i, iArr);
        if (Camera2StreamConfigurationMap2 < jArr.length) {
            long[] jArr2 = new long[Camera2StreamConfigurationMap2];
            this.getHighResolutionOutputSizeshNQ4ISI = jArr2;
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, Camera2StreamConfigurationMap2);
        }
    }

    public final org.bouncycastle.math.ec.LongArray getHighSpeedVideoFpsRangesFor(org.bouncycastle.math.ec.LongArray longArray) {
        int i;
        int i2;
        org.bouncycastle.math.ec.LongArray longArray2;
        org.bouncycastle.math.ec.LongArray longArray3;
        int highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == 0) {
            return this;
        }
        int highSpeedVideoSizes2 = longArray.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes2 == 0) {
            return longArray;
        }
        if (highSpeedVideoSizes > highSpeedVideoSizes2) {
            i2 = highSpeedVideoSizes;
            i = highSpeedVideoSizes2;
            longArray3 = this;
            longArray2 = longArray;
        } else {
            i = highSpeedVideoSizes;
            i2 = highSpeedVideoSizes2;
            longArray2 = this;
            longArray3 = longArray;
        }
        int i3 = (i + 63) >>> 6;
        int i4 = (i2 + 63) >>> 6;
        int i5 = ((i + i2) + 62) >>> 6;
        if (i3 == 1) {
            long j = longArray2.getHighResolutionOutputSizeshNQ4ISI[0];
            if (j == 1) {
                return longArray3;
            }
            long[] jArr = new long[i5];
            getHighResolutionOutputSizeshNQ4ISI(j, longArray3.getHighResolutionOutputSizeshNQ4ISI, i4, jArr);
            return new org.bouncycastle.math.ec.LongArray(jArr, 0, i5);
        }
        int i6 = (i2 + 70) >>> 6;
        int[] iArr = new int[16];
        int i7 = i6 << 4;
        long[] jArr2 = new long[i7];
        iArr[1] = i6;
        java.lang.System.arraycopy(longArray3.getHighResolutionOutputSizeshNQ4ISI, 0, jArr2, i6, i4);
        int i8 = i6;
        for (int i9 = 2; i9 < 16; i9++) {
            i8 += i6;
            iArr[i9] = i8;
            if ((i9 & 1) == 0) {
                getHighSpeedVideoFpsRangesFor(jArr2, i8 >>> 1, jArr2, i8, i6, 1);
            } else {
                getHighSpeedVideoFpsRangesFor(jArr2, i6, jArr2, i8 - i6, jArr2, i8, i6);
            }
        }
        long[] jArr3 = new long[i7];
        getHighSpeedVideoFpsRangesFor(jArr2, 0, jArr3, 0, i7, 4);
        long[] jArr4 = longArray2.getHighResolutionOutputSizeshNQ4ISI;
        int i10 = i5 << 3;
        long[] jArr5 = new long[i10];
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = i11;
            long j2 = jArr4[i11];
            while (true) {
                getHighSpeedVideoFpsRanges(jArr5, i12, jArr2, iArr[((int) j2) & 15], jArr3, iArr[((int) (j2 >>> 4)) & 15], i6);
                j2 >>>= 8;
                if (j2 == 0) {
                    break;
                }
                i12 += i5;
            }
        }
        while (true) {
            i10 -= i5;
            if (i10 == 0) {
                return new org.bouncycastle.math.ec.LongArray(jArr5, 0, i5);
            }
            getHighResolutionOutputSizeshNQ4ISI(jArr5, i10 - i5, jArr5, i10, i5, 8);
            jArr5 = jArr5;
        }
    }

    public final org.bouncycastle.math.ec.LongArray getHighResolutionOutputSizeshNQ4ISI(int i, int[] iArr) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == 0) {
            throw new java.lang.IllegalStateException();
        }
        int i2 = 1;
        if (highSpeedVideoSizes == 1) {
            return this;
        }
        org.bouncycastle.math.ec.LongArray longArray = (org.bouncycastle.math.ec.LongArray) clone();
        int i3 = (i + 63) >>> 6;
        org.bouncycastle.math.ec.LongArray longArray2 = new org.bouncycastle.math.ec.LongArray(i3);
        int i4 = 0;
        getHighResolutionOutputSizeshNQ4ISI(longArray2.getHighResolutionOutputSizeshNQ4ISI, 0, i, i, iArr);
        org.bouncycastle.math.ec.LongArray longArray3 = new org.bouncycastle.math.ec.LongArray(i3);
        longArray3.getHighResolutionOutputSizeshNQ4ISI[0] = 1;
        int[] iArr2 = {highSpeedVideoSizes, i + 1};
        org.bouncycastle.math.ec.LongArray[] longArrayArr = {longArray, longArray2};
        int[] iArr3 = {1, 0};
        org.bouncycastle.math.ec.LongArray[] longArrayArr2 = {longArray3, new org.bouncycastle.math.ec.LongArray(i3)};
        int i5 = iArr2[1];
        int i6 = i5 - iArr2[0];
        while (true) {
            if (i6 < 0) {
                i6 = -i6;
                iArr2[i2] = i5;
                iArr3[i2] = i4;
                i2 = 1 - i2;
                i5 = iArr2[i2];
                i4 = iArr3[i2];
            }
            int i7 = 1 - i2;
            longArrayArr[i2].getHighResolutionOutputSizeshNQ4ISI(longArrayArr[i7], iArr2[i7], i6);
            int highSpeedVideoFpsRangesFor = longArrayArr[i2].getHighSpeedVideoFpsRangesFor(i5);
            if (highSpeedVideoFpsRangesFor == 0) {
                return longArrayArr2[i7];
            }
            int i8 = iArr3[i7];
            longArrayArr2[i2].getHighResolutionOutputSizeshNQ4ISI(longArrayArr2[i7], i8, i6);
            int i9 = i8 + i6;
            if (i9 > i4) {
                i4 = i9;
            } else if (i9 == i4) {
                i4 = longArrayArr2[i2].getHighSpeedVideoFpsRangesFor(i4);
            }
            i6 += highSpeedVideoFpsRangesFor - i5;
            i5 = highSpeedVideoFpsRangesFor;
        }
    }

    public final boolean getHighSpeedVideoFpsRanges() {
        long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int getHighResolutionOutputSizeshNQ4ISI(int i) {
        long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int min = java.lang.Math.min(i, jArr.length);
        if (min <= 0) {
            return 0;
        }
        if (jArr[0] != 0) {
            while (true) {
                int i2 = min - 1;
                if (jArr[i2] != 0) {
                    return min;
                }
                min = i2;
            }
        } else {
            while (true) {
                int i3 = min - 1;
                if (jArr[i3] != 0) {
                    return min;
                }
                if (i3 <= 0) {
                    return 0;
                }
                min = i3;
            }
        }
    }

    public final int getHighSpeedVideoSizes() {
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
        while (length != 0) {
            length--;
            long j = this.getHighResolutionOutputSizeshNQ4ISI[length];
            if (j != 0) {
                return (length << 6) + getHighSpeedVideoSizes(j);
            }
        }
        return 0;
    }

    public java.lang.Object clone() {
        return new org.bouncycastle.math.ec.LongArray(org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    private static long getHighSpeedVideoFpsRangesFor(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        long j = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr[i + i5];
            jArr2[i2 + i5] = j | (j2 << i4);
            j = j2 >>> (64 - i4);
        }
        return j;
    }

    private static void getHighSpeedVideoSizes(long[] jArr, int i, int i2, long j, int i3, int[] iArr) {
        int i4 = i2 - i3;
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                getHighSpeedVideoFpsRanges(jArr, i, i4, j);
                return;
            }
            getHighSpeedVideoFpsRanges(jArr, i, iArr[length] + i4, j);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(long j, long[] jArr, int i, long[] jArr2) {
        if ((j & 1) != 0) {
            getHighResolutionOutputSizeshNQ4ISI(jArr2, 0, jArr, 0, i);
        }
        long j2 = j;
        int i2 = 1;
        while (true) {
            long j3 = j2 >>> 1;
            if (j3 == 0) {
                return;
            }
            if ((j3 & 1) != 0) {
                long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(jArr2, 0, jArr, 0, i, i2);
                if (highResolutionOutputSizeshNQ4ISI != 0) {
                    jArr2[i] = highResolutionOutputSizeshNQ4ISI ^ jArr2[i];
                }
            }
            i2++;
            j2 = j3;
        }
    }

    static long getHighSpeedVideoSizes(int i) {
        short[] sArr = getHighSpeedVideoFpsRangesFor;
        return (((sArr[(i >>> 8) & 255] << 16) | sArr[i & 255]) & 4294967295L) | ((((sArr[i >>> 24] << 16) | sArr[(i >>> 16) & 255]) & 4294967295L) << 32);
    }

    private static void getHighSpeedVideoFpsRanges(long[] jArr, int i, int i2, long j) {
        int i3 = i + (i2 >>> 6);
        int i4 = i2 & 63;
        if (i4 == 0) {
            jArr[i3] = jArr[i3] ^ j;
            return;
        }
        jArr[i3] = jArr[i3] ^ (j << i4);
        long j2 = j >>> (64 - i4);
        if (j2 != 0) {
            int i5 = i3 + 1;
            jArr[i5] = j2 ^ jArr[i5];
        }
    }

    private int getHighSpeedVideoFpsRangesFor(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.getHighResolutionOutputSizeshNQ4ISI[i2];
            if (j != 0) {
                return (i2 << 6) + getHighSpeedVideoSizes(j);
            }
        }
        return 0;
    }

    private static int getHighSpeedVideoSizes(long j) {
        int i;
        int i2 = 32;
        int i3 = (int) (j >>> 32);
        if (i3 == 0) {
            i3 = (int) j;
            i2 = 0;
        }
        int i4 = i3 >>> 16;
        if (i4 == 0) {
            int i5 = i3 >>> 8;
            i = i5 == 0 ? Camera2StreamConfigurationMap[i3] : Camera2StreamConfigurationMap[i5] + 8;
        } else {
            int i6 = i3 >>> 24;
            i = i6 == 0 ? Camera2StreamConfigurationMap[i4] + 16 : Camera2StreamConfigurationMap[i6] + com.google.common.base.Ascii.CAN;
        }
        return i2 + i;
    }

    private static long getHighResolutionOutputSizeshNQ4ISI(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        long j = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr2[i2 + i5];
            int i6 = i + i5;
            jArr[i6] = (j | (j2 << i4)) ^ jArr[i6];
            j = j2 >>> (64 - i4);
        }
        return j;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.math.ec.LongArray longArray, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        if (i5 == 0) {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, i4, longArray.getHighResolutionOutputSizeshNQ4ISI, 0, i3);
            return;
        }
        long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, i4, longArray.getHighResolutionOutputSizeshNQ4ISI, 0, i3, i5);
        if (highResolutionOutputSizeshNQ4ISI != 0) {
            long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i6 = i3 + i4;
            jArr[i6] = highResolutionOutputSizeshNQ4ISI ^ jArr[i6];
        }
    }

    private static void getHighSpeedVideoFpsRanges(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            jArr[i6] = jArr[i6] ^ (jArr2[i2 + i5] ^ jArr3[i3 + i5]);
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            jArr3[i3 + i5] = jArr[i + i5] ^ jArr2[i2 + i5];
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(long[] jArr, int i, long[] jArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    public LongArray(long[] jArr, int i, int i2) {
        if (i2 == jArr.length) {
            this.getHighResolutionOutputSizeshNQ4ISI = jArr;
            return;
        }
        long[] jArr2 = new long[i2];
        this.getHighResolutionOutputSizeshNQ4ISI = jArr2;
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, i2);
    }

    public LongArray(long[] jArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = jArr;
    }

    public LongArray(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new java.lang.IllegalArgumentException("invalid F2m field value");
        }
        int i = 1;
        if (bigInteger.signum() == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = new long[]{0};
            return;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (byteArray[0] == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = (length + 7) / 8;
        this.getHighResolutionOutputSizeshNQ4ISI = new long[i2];
        int i3 = i2 - 1;
        int i4 = (length % 8) + i;
        if (i < i4) {
            long j = 0;
            while (i < i4) {
                j = (j << 8) | (byteArray[i] & 255);
                i++;
            }
            this.getHighResolutionOutputSizeshNQ4ISI[i3] = j;
            i3 = i2 - 2;
        }
        while (i3 >= 0) {
            long j2 = 0;
            int i5 = 0;
            while (i5 < 8) {
                j2 = (j2 << 8) | (byteArray[i] & 255);
                i5++;
                i++;
            }
            this.getHighResolutionOutputSizeshNQ4ISI[i3] = j2;
            i3--;
        }
    }

    private LongArray(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = new long[i];
    }

    static {
        long[] jArr = new long[512];
        long[] jArr2 = new long[512];
        java.nio.ByteBuffer.wrap("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0081\u0000\u0000\u0000\u0000\u0000\u0000@\u0000\u0000\u0000\u0000\u0000\u0000\u0000@\u0001\u0000\u0000\u0000\u0000\u0000\u0000@\u0080\u0000\u0000\u0000\u0000\u0000\u0000@\u0081\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0001\u0000\u0000\u0000\u0000\u0000 \u0000\u0080\u0000\u0000\u0000\u0000\u0000 \u0000\u0081\u0000\u0000\u0000\u0000\u0000 @\u0000\u0000\u0000\u0000\u0000\u0000 @\u0001\u0000\u0000\u0000\u0000\u0000 @\u0080\u0000\u0000\u0000\u0000\u0000 @\u0081\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0080\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0081\u0000\u0000\u0000\u0000\u0010\u0000@\u0000\u0000\u0000\u0000\u0000\u0010\u0000@\u0001\u0000\u0000\u0000\u0000\u0010\u0000@\u0080\u0000\u0000\u0000\u0000\u0010\u0000@\u0081\u0000\u0000\u0000\u0000\u0010 \u0000\u0000\u0000\u0000\u0000\u0000\u0010 \u0000\u0001\u0000\u0000\u0000\u0000\u0010 \u0000\u0080\u0000\u0000\u0000\u0000\u0010 \u0000\u0081\u0000\u0000\u0000\u0000\u0010 @\u0000\u0000\u0000\u0000\u0000\u0010 @\u0001\u0000\u0000\u0000\u0000\u0010 @\u0080\u0000\u0000\u0000\u0000\u0010 @\u0081\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0080\u0000\u0000\u0000\b\u0000\u0000\u0000\u0081\u0000\u0000\u0000\b\u0000\u0000@\u0000\u0000\u0000\u0000\b\u0000\u0000@\u0001\u0000\u0000\u0000\b\u0000\u0000@\u0080\u0000\u0000\u0000\b\u0000\u0000@\u0081\u0000\u0000\u0000\b\u0000 \u0000\u0000\u0000\u0000\u0000\b\u0000 \u0000\u0001\u0000\u0000\u0000\b\u0000 \u0000\u0080\u0000\u0000\u0000\b\u0000 \u0000\u0081\u0000\u0000\u0000\b\u0000 @\u0000\u0000\u0000\u0000\b\u0000 @\u0001\u0000\u0000\u0000\b\u0000 @\u0080\u0000\u0000\u0000\b\u0000 @\u0081\u0000\u0000\u0000\b\u0010\u0000\u0000\u0000\u0000\u0000\u0000\b\u0010\u0000\u0000\u0001\u0000\u0000\u0000\b\u0010\u0000\u0000\u0080\u0000\u0000\u0000\b\u0010\u0000\u0000\u0081\u0000\u0000\u0000\b\u0010\u0000@\u0000\u0000\u0000\u0000\b\u0010\u0000@\u0001\u0000\u0000\u0000\b\u0010\u0000@\u0080\u0000\u0000\u0000\b\u0010\u0000@\u0081\u0000\u0000\u0000\b\u0010 \u0000\u0000\u0000\u0000\u0000\b\u0010 \u0000\u0001\u0000\u0000\u0000\b\u0010 \u0000\u0080\u0000\u0000\u0000\b\u0010 \u0000\u0081\u0000\u0000\u0000\b\u0010 @\u0000\u0000\u0000\u0000\b\u0010 @\u0001\u0000\u0000\u0000\b\u0010 @\u0080\u0000\u0000\u0000\b\u0010 @\u0081\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0080\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0081\u0000\u0000\u0004\u0000\u0000\u0000@\u0000\u0000\u0000\u0004\u0000\u0000\u0000@\u0001\u0000\u0000\u0004\u0000\u0000\u0000@\u0080\u0000\u0000\u0004\u0000\u0000\u0000@\u0081\u0000\u0000\u0004\u0000\u0000 \u0000\u0000\u0000\u0000\u0004\u0000\u0000 \u0000\u0001\u0000\u0000\u0004\u0000\u0000 \u0000\u0080\u0000\u0000\u0004\u0000\u0000 \u0000\u0081\u0000\u0000\u0004\u0000\u0000 @\u0000\u0000\u0000\u0004\u0000\u0000 @\u0001\u0000\u0000\u0004\u0000\u0000 @\u0080\u0000\u0000\u0004\u0000\u0000 @\u0081\u0000\u0000\u0004\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0004\u0000\u0010\u0000\u0000\u0001\u0000\u0000\u0004\u0000\u0010\u0000\u0000\u0080\u0000\u0000\u0004\u0000\u0010\u0000\u0000\u0081\u0000\u0000\u0004\u0000\u0010\u0000@\u0000\u0000\u0000\u0004\u0000\u0010\u0000@\u0001\u0000\u0000\u0004\u0000\u0010\u0000@\u0080\u0000\u0000\u0004\u0000\u0010\u0000@\u0081\u0000\u0000\u0004\u0000\u0010 \u0000\u0000\u0000\u0000\u0004\u0000\u0010 \u0000\u0001\u0000\u0000\u0004\u0000\u0010 \u0000\u0080\u0000\u0000\u0004\u0000\u0010 \u0000\u0081\u0000\u0000\u0004\u0000\u0010 @\u0000\u0000\u0000\u0004\u0000\u0010 @\u0001\u0000\u0000\u0004\u0000\u0010 @\u0080\u0000\u0000\u0004\u0000\u0010 @\u0081\u0000\u0000\u0004\b\u0000\u0000\u0000\u0000\u0000\u0000\u0004\b\u0000\u0000\u0000\u0001\u0000\u0000\u0004\b\u0000\u0000\u0000\u0080\u0000\u0000\u0004\b\u0000\u0000\u0000\u0081\u0000\u0000\u0004\b\u0000\u0000@\u0000\u0000\u0000\u0004\b\u0000\u0000@\u0001\u0000\u0000\u0004\b\u0000\u0000@\u0080\u0000\u0000\u0004\b\u0000\u0000@\u0081\u0000\u0000\u0004\b\u0000 \u0000\u0000\u0000\u0000\u0004\b\u0000 \u0000\u0001\u0000\u0000\u0004\b\u0000 \u0000\u0080\u0000\u0000\u0004\b\u0000 \u0000\u0081\u0000\u0000\u0004\b\u0000 @\u0000\u0000\u0000\u0004\b\u0000 @\u0001\u0000\u0000\u0004\b\u0000 @\u0080\u0000\u0000\u0004\b\u0000 @\u0081\u0000\u0000\u0004\b\u0010\u0000\u0000\u0000\u0000\u0000\u0004\b\u0010\u0000\u0000\u0001\u0000\u0000\u0004\b\u0010\u0000\u0000\u0080\u0000\u0000\u0004\b\u0010\u0000\u0000\u0081\u0000\u0000\u0004\b\u0010\u0000@\u0000\u0000\u0000\u0004\b\u0010\u0000@\u0001\u0000\u0000\u0004\b\u0010\u0000@\u0080\u0000\u0000\u0004\b\u0010\u0000@\u0081\u0000\u0000\u0004\b\u0010 \u0000\u0000\u0000\u0000\u0004\b\u0010 \u0000\u0001\u0000\u0000\u0004\b\u0010 \u0000\u0080\u0000\u0000\u0004\b\u0010 \u0000\u0081\u0000\u0000\u0004\b\u0010 @\u0000\u0000\u0000\u0004\b\u0010 @\u0001\u0000\u0000\u0004\b\u0010 @\u0080\u0000\u0000\u0004\b\u0010 @\u0081\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0080\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0081\u0000\u0002\u0000\u0000\u0000\u0000@\u0000\u0000\u0002\u0000\u0000\u0000\u0000@\u0001\u0000\u0002\u0000\u0000\u0000\u0000@\u0080\u0000\u0002\u0000\u0000\u0000\u0000@\u0081\u0000\u0002\u0000\u0000\u0000 \u0000\u0000\u0000\u0002\u0000\u0000\u0000 \u0000\u0001\u0000\u0002\u0000\u0000\u0000 \u0000\u0080\u0000\u0002\u0000\u0000\u0000 \u0000\u0081\u0000\u0002\u0000\u0000\u0000 @\u0000\u0000\u0002\u0000\u0000\u0000 @\u0001\u0000\u0002\u0000\u0000\u0000 @\u0080\u0000\u0002\u0000\u0000\u0000 @\u0081\u0000\u0002\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0002\u0000\u0000\u0010\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0010\u0000\u0000\u0080\u0000\u0002\u0000\u0000\u0010\u0000\u0000\u0081\u0000\u0002\u0000\u0000\u0010\u0000@\u0000\u0000\u0002\u0000\u0000\u0010\u0000@\u0001\u0000\u0002\u0000\u0000\u0010\u0000@\u0080\u0000\u0002\u0000\u0000\u0010\u0000@\u0081\u0000\u0002\u0000\u0000\u0010 \u0000\u0000\u0000\u0002\u0000\u0000\u0010 \u0000\u0001\u0000\u0002\u0000\u0000\u0010 \u0000\u0080\u0000\u0002\u0000\u0000\u0010 \u0000\u0081\u0000\u0002\u0000\u0000\u0010 @\u0000\u0000\u0002\u0000\u0000\u0010 @\u0001\u0000\u0002\u0000\u0000\u0010 @\u0080\u0000\u0002\u0000\u0000\u0010 @\u0081\u0000\u0002\u0000\b\u0000\u0000\u0000\u0000\u0000\u0002\u0000\b\u0000\u0000\u0000\u0001\u0000\u0002\u0000\b\u0000\u0000\u0000\u0080\u0000\u0002\u0000\b\u0000\u0000\u0000\u0081\u0000\u0002\u0000\b\u0000\u0000@\u0000\u0000\u0002\u0000\b\u0000\u0000@\u0001\u0000\u0002\u0000\b\u0000\u0000@\u0080\u0000\u0002\u0000\b\u0000\u0000@\u0081\u0000\u0002\u0000\b\u0000 \u0000\u0000\u0000\u0002\u0000\b\u0000 \u0000\u0001\u0000\u0002\u0000\b\u0000 \u0000\u0080\u0000\u0002\u0000\b\u0000 \u0000\u0081\u0000\u0002\u0000\b\u0000 @\u0000\u0000\u0002\u0000\b\u0000 @\u0001\u0000\u0002\u0000\b\u0000 @\u0080\u0000\u0002\u0000\b\u0000 @\u0081\u0000\u0002\u0000\b\u0010\u0000\u0000\u0000\u0000\u0002\u0000\b\u0010\u0000\u0000\u0001\u0000\u0002\u0000\b\u0010\u0000\u0000\u0080\u0000\u0002\u0000\b\u0010\u0000\u0000\u0081\u0000\u0002\u0000\b\u0010\u0000@\u0000\u0000\u0002\u0000\b\u0010\u0000@\u0001\u0000\u0002\u0000\b\u0010\u0000@\u0080\u0000\u0002\u0000\b\u0010\u0000@\u0081\u0000\u0002\u0000\b\u0010 \u0000\u0000\u0000\u0002\u0000\b\u0010 \u0000\u0001\u0000\u0002\u0000\b\u0010 \u0000\u0080\u0000\u0002\u0000\b\u0010 \u0000\u0081\u0000\u0002\u0000\b\u0010 @\u0000\u0000\u0002\u0000\b\u0010 @\u0001\u0000\u0002\u0000\b\u0010 @\u0080\u0000\u0002\u0000\b\u0010 @\u0081\u0000\u0002\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0002\u0004\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0004\u0000\u0000\u0000\u0000\u0080\u0000\u0002\u0004\u0000\u0000\u0000\u0000\u0081\u0000\u0002\u0004\u0000\u0000\u0000@\u0000\u0000\u0002\u0004\u0000\u0000\u0000@\u0001\u0000\u0002\u0004\u0000\u0000\u0000@\u0080\u0000\u0002\u0004\u0000\u0000\u0000@\u0081\u0000\u0002\u0004\u0000\u0000 \u0000\u0000\u0000\u0002\u0004\u0000\u0000 \u0000\u0001\u0000\u0002\u0004\u0000\u0000 \u0000\u0080\u0000\u0002\u0004\u0000\u0000 \u0000\u0081\u0000\u0002\u0004\u0000\u0000 @\u0000\u0000\u0002\u0004\u0000\u0000 @\u0001\u0000\u0002\u0004\u0000\u0000 @\u0080\u0000\u0002\u0004\u0000\u0000 @\u0081\u0000\u0002\u0004\u0000\u0010\u0000\u0000\u0000\u0000\u0002\u0004\u0000\u0010\u0000\u0000\u0001\u0000\u0002\u0004\u0000\u0010\u0000\u0000\u0080\u0000\u0002\u0004\u0000\u0010\u0000\u0000\u0081\u0000\u0002\u0004\u0000\u0010\u0000@\u0000\u0000\u0002\u0004\u0000\u0010\u0000@\u0001\u0000\u0002\u0004\u0000\u0010\u0000@\u0080\u0000\u0002\u0004\u0000\u0010\u0000@\u0081\u0000\u0002\u0004\u0000\u0010 \u0000\u0000\u0000\u0002\u0004\u0000\u0010 \u0000\u0001\u0000\u0002\u0004\u0000\u0010 \u0000\u0080\u0000\u0002\u0004\u0000\u0010 \u0000\u0081\u0000\u0002\u0004\u0000\u0010 @\u0000\u0000\u0002\u0004\u0000\u0010 @\u0001\u0000\u0002\u0004\u0000\u0010 @\u0080\u0000\u0002\u0004\u0000\u0010 @\u0081\u0000\u0002\u0004\b\u0000\u0000\u0000\u0000\u0000\u0002\u0004\b\u0000\u0000\u0000\u0001\u0000\u0002\u0004\b\u0000\u0000\u0000\u0080\u0000\u0002\u0004\b\u0000\u0000\u0000\u0081\u0000\u0002\u0004\b\u0000\u0000@\u0000\u0000\u0002\u0004\b\u0000\u0000@\u0001\u0000\u0002\u0004\b\u0000\u0000@\u0080\u0000\u0002\u0004\b\u0000\u0000@\u0081\u0000\u0002\u0004\b\u0000 \u0000\u0000\u0000\u0002\u0004\b\u0000 \u0000\u0001\u0000\u0002\u0004\b\u0000 \u0000\u0080\u0000\u0002\u0004\b\u0000 \u0000\u0081\u0000\u0002\u0004\b\u0000 @\u0000\u0000\u0002\u0004\b\u0000 @\u0001\u0000\u0002\u0004\b\u0000 @\u0080\u0000\u0002\u0004\b\u0000 @\u0081\u0000\u0002\u0004\b\u0010\u0000\u0000\u0000\u0000\u0002\u0004\b\u0010\u0000\u0000\u0001\u0000\u0002\u0004\b\u0010\u0000\u0000\u0080\u0000\u0002\u0004\b\u0010\u0000\u0000\u0081\u0000\u0002\u0004\b\u0010\u0000@\u0000\u0000\u0002\u0004\b\u0010\u0000@\u0001\u0000\u0002\u0004\b\u0010\u0000@\u0080\u0000\u0002\u0004\b\u0010\u0000@\u0081\u0000\u0002\u0004\b\u0010 \u0000\u0000\u0000\u0002\u0004\b\u0010 \u0000\u0001\u0000\u0002\u0004\b\u0010 \u0000\u0080\u0000\u0002\u0004\b\u0010 \u0000\u0081\u0000\u0002\u0004\b\u0010 @\u0000\u0000\u0002\u0004\b\u0010 @\u0001\u0000\u0002\u0004\b\u0010 @\u0080\u0000\u0002\u0004\b\u0010 @\u0081\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0080\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0000@\u0000\u0001\u0000\u0000\u0000\u0000\u0000@\u0001\u0001\u0000\u0000\u0000\u0000\u0000@\u0080\u0001\u0000\u0000\u0000\u0000\u0000@\u0081\u0001\u0000\u0000\u0000\u0000 \u0000\u0000\u0001\u0000\u0000\u0000\u0000 \u0000\u0001\u0001\u0000\u0000\u0000\u0000 \u0000\u0080\u0001\u0000\u0000\u0000\u0000 \u0000\u0081\u0001\u0000\u0000\u0000\u0000 @\u0000\u0001\u0000\u0000\u0000\u0000 @\u0001\u0001\u0000\u0000\u0000\u0000 @\u0080\u0001\u0000\u0000\u0000\u0000 @\u0081\u0001\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0010\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0010\u0000\u0000\u0080\u0001\u0000\u0000\u0000\u0010\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0010\u0000@\u0000\u0001\u0000\u0000\u0000\u0010\u0000@\u0001\u0001\u0000\u0000\u0000\u0010\u0000@\u0080\u0001\u0000\u0000\u0000\u0010\u0000@\u0081\u0001\u0000\u0000\u0000\u0010 \u0000\u0000\u0001\u0000\u0000\u0000\u0010 \u0000\u0001\u0001\u0000\u0000\u0000\u0010 \u0000\u0080\u0001\u0000\u0000\u0000\u0010 \u0000\u0081\u0001\u0000\u0000\u0000\u0010 @\u0000\u0001\u0000\u0000\u0000\u0010 @\u0001\u0001\u0000\u0000\u0000\u0010 @\u0080\u0001\u0000\u0000\u0000\u0010 @\u0081\u0001\u0000\u0000\b\u0000\u0000\u0000\u0000\u0001\u0000\u0000\b\u0000\u0000\u0000\u0001\u0001\u0000\u0000\b\u0000\u0000\u0000\u0080\u0001\u0000\u0000\b\u0000\u0000\u0000\u0081\u0001\u0000\u0000\b\u0000\u0000@\u0000\u0001\u0000\u0000\b\u0000\u0000@\u0001\u0001\u0000\u0000\b\u0000\u0000@\u0080\u0001\u0000\u0000\b\u0000\u0000@\u0081\u0001\u0000\u0000\b\u0000 \u0000\u0000\u0001\u0000\u0000\b\u0000 \u0000\u0001\u0001\u0000\u0000\b\u0000 \u0000\u0080\u0001\u0000\u0000\b\u0000 \u0000\u0081\u0001\u0000\u0000\b\u0000 @\u0000\u0001\u0000\u0000\b\u0000 @\u0001\u0001\u0000\u0000\b\u0000 @\u0080\u0001\u0000\u0000\b\u0000 @\u0081\u0001\u0000\u0000\b\u0010\u0000\u0000\u0000\u0001\u0000\u0000\b\u0010\u0000\u0000\u0001\u0001\u0000\u0000\b\u0010\u0000\u0000\u0080\u0001\u0000\u0000\b\u0010\u0000\u0000\u0081\u0001\u0000\u0000\b\u0010\u0000@\u0000\u0001\u0000\u0000\b\u0010\u0000@\u0001\u0001\u0000\u0000\b\u0010\u0000@\u0080\u0001\u0000\u0000\b\u0010\u0000@\u0081\u0001\u0000\u0000\b\u0010 \u0000\u0000\u0001\u0000\u0000\b\u0010 \u0000\u0001\u0001\u0000\u0000\b\u0010 \u0000\u0080\u0001\u0000\u0000\b\u0010 \u0000\u0081\u0001\u0000\u0000\b\u0010 @\u0000\u0001\u0000\u0000\b\u0010 @\u0001\u0001\u0000\u0000\b\u0010 @\u0080\u0001\u0000\u0000\b\u0010 @\u0081\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0080\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0004\u0000\u0000\u0000@\u0000\u0001\u0000\u0004\u0000\u0000\u0000@\u0001\u0001\u0000\u0004\u0000\u0000\u0000@\u0080\u0001\u0000\u0004\u0000\u0000\u0000@\u0081\u0001\u0000\u0004\u0000\u0000 \u0000\u0000\u0001\u0000\u0004\u0000\u0000 \u0000\u0001\u0001\u0000\u0004\u0000\u0000 \u0000\u0080\u0001\u0000\u0004\u0000\u0000 \u0000\u0081\u0001\u0000\u0004\u0000\u0000 @\u0000\u0001\u0000\u0004\u0000\u0000 @\u0001\u0001\u0000\u0004\u0000\u0000 @\u0080\u0001\u0000\u0004\u0000\u0000 @\u0081\u0001\u0000\u0004\u0000\u0010\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0010\u0000\u0000\u0001\u0001\u0000\u0004\u0000\u0010\u0000\u0000\u0080\u0001\u0000\u0004\u0000\u0010\u0000\u0000\u0081\u0001\u0000\u0004\u0000\u0010\u0000@\u0000\u0001\u0000\u0004\u0000\u0010\u0000@\u0001\u0001\u0000\u0004\u0000\u0010\u0000@\u0080\u0001\u0000\u0004\u0000\u0010\u0000@\u0081\u0001\u0000\u0004\u0000\u0010 \u0000\u0000\u0001\u0000\u0004\u0000\u0010 \u0000\u0001\u0001\u0000\u0004\u0000\u0010 \u0000\u0080\u0001\u0000\u0004\u0000\u0010 \u0000\u0081\u0001\u0000\u0004\u0000\u0010 @\u0000\u0001\u0000\u0004\u0000\u0010 @\u0001\u0001\u0000\u0004\u0000\u0010 @\u0080\u0001\u0000\u0004\u0000\u0010 @\u0081\u0001\u0000\u0004\b\u0000\u0000\u0000\u0000\u0001\u0000\u0004\b\u0000\u0000\u0000\u0001\u0001\u0000\u0004\b\u0000\u0000\u0000\u0080\u0001\u0000\u0004\b\u0000\u0000\u0000\u0081\u0001\u0000\u0004\b\u0000\u0000@\u0000\u0001\u0000\u0004\b\u0000\u0000@\u0001\u0001\u0000\u0004\b\u0000\u0000@\u0080\u0001\u0000\u0004\b\u0000\u0000@\u0081\u0001\u0000\u0004\b\u0000 \u0000\u0000\u0001\u0000\u0004\b\u0000 \u0000\u0001\u0001\u0000\u0004\b\u0000 \u0000\u0080\u0001\u0000\u0004\b\u0000 \u0000\u0081\u0001\u0000\u0004\b\u0000 @\u0000\u0001\u0000\u0004\b\u0000 @\u0001\u0001\u0000\u0004\b\u0000 @\u0080\u0001\u0000\u0004\b\u0000 @\u0081\u0001\u0000\u0004\b\u0010\u0000\u0000\u0000\u0001\u0000\u0004\b\u0010\u0000\u0000\u0001\u0001\u0000\u0004\b\u0010\u0000\u0000\u0080\u0001\u0000\u0004\b\u0010\u0000\u0000\u0081\u0001\u0000\u0004\b\u0010\u0000@\u0000\u0001\u0000\u0004\b\u0010\u0000@\u0001\u0001\u0000\u0004\b\u0010\u0000@\u0080\u0001\u0000\u0004\b\u0010\u0000@\u0081\u0001\u0000\u0004\b\u0010 \u0000\u0000\u0001\u0000\u0004\b\u0010 \u0000\u0001\u0001\u0000\u0004\b\u0010 \u0000\u0080\u0001\u0000\u0004\b\u0010 \u0000\u0081\u0001\u0000\u0004\b\u0010 @\u0000\u0001\u0000\u0004\b\u0010 @\u0001\u0001\u0000\u0004\b\u0010 @\u0080\u0001\u0000\u0004\b\u0010 @\u0081\u0001\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0002\u0000\u0000\u0000\u0000\u0000\u0080\u0001\u0002\u0000\u0000\u0000\u0000\u0000\u0081\u0001\u0002\u0000\u0000\u0000\u0000@\u0000\u0001\u0002\u0000\u0000\u0000\u0000@\u0001\u0001\u0002\u0000\u0000\u0000\u0000@\u0080\u0001\u0002\u0000\u0000\u0000\u0000@\u0081\u0001\u0002\u0000\u0000\u0000 \u0000\u0000\u0001\u0002\u0000\u0000\u0000 \u0000\u0001\u0001\u0002\u0000\u0000\u0000 \u0000\u0080\u0001\u0002\u0000\u0000\u0000 \u0000\u0081\u0001\u0002\u0000\u0000\u0000 @\u0000\u0001\u0002\u0000\u0000\u0000 @\u0001\u0001\u0002\u0000\u0000\u0000 @\u0080\u0001\u0002\u0000\u0000\u0000 @\u0081\u0001\u0002\u0000\u0000\u0010\u0000\u0000\u0000\u0001\u0002\u0000\u0000\u0010\u0000\u0000\u0001\u0001\u0002\u0000\u0000\u0010\u0000\u0000\u0080\u0001\u0002\u0000\u0000\u0010\u0000\u0000\u0081\u0001\u0002\u0000\u0000\u0010\u0000@\u0000\u0001\u0002\u0000\u0000\u0010\u0000@\u0001\u0001\u0002\u0000\u0000\u0010\u0000@\u0080\u0001\u0002\u0000\u0000\u0010\u0000@\u0081\u0001\u0002\u0000\u0000\u0010 \u0000\u0000\u0001\u0002\u0000\u0000\u0010 \u0000\u0001\u0001\u0002\u0000\u0000\u0010 \u0000\u0080\u0001\u0002\u0000\u0000\u0010 \u0000\u0081\u0001\u0002\u0000\u0000\u0010 @\u0000\u0001\u0002\u0000\u0000\u0010 @\u0001\u0001\u0002\u0000\u0000\u0010 @\u0080\u0001\u0002\u0000\u0000\u0010 @\u0081\u0001\u0002\u0000\b\u0000\u0000\u0000\u0000\u0001\u0002\u0000\b\u0000\u0000\u0000\u0001\u0001\u0002\u0000\b\u0000\u0000\u0000\u0080\u0001\u0002\u0000\b\u0000\u0000\u0000\u0081\u0001\u0002\u0000\b\u0000\u0000@\u0000\u0001\u0002\u0000\b\u0000\u0000@\u0001\u0001\u0002\u0000\b\u0000\u0000@\u0080\u0001\u0002\u0000\b\u0000\u0000@\u0081\u0001\u0002\u0000\b\u0000 \u0000\u0000\u0001\u0002\u0000\b\u0000 \u0000\u0001\u0001\u0002\u0000\b\u0000 \u0000\u0080\u0001\u0002\u0000\b\u0000 \u0000\u0081\u0001\u0002\u0000\b\u0000 @\u0000\u0001\u0002\u0000\b\u0000 @\u0001\u0001\u0002\u0000\b\u0000 @\u0080\u0001\u0002\u0000\b\u0000 @\u0081\u0001\u0002\u0000\b\u0010\u0000\u0000\u0000\u0001\u0002\u0000\b\u0010\u0000\u0000\u0001\u0001\u0002\u0000\b\u0010\u0000\u0000\u0080\u0001\u0002\u0000\b\u0010\u0000\u0000\u0081\u0001\u0002\u0000\b\u0010\u0000@\u0000\u0001\u0002\u0000\b\u0010\u0000@\u0001\u0001\u0002\u0000\b\u0010\u0000@\u0080\u0001\u0002\u0000\b\u0010\u0000@\u0081\u0001\u0002\u0000\b\u0010 \u0000\u0000\u0001\u0002\u0000\b\u0010 \u0000\u0001\u0001\u0002\u0000\b\u0010 \u0000\u0080\u0001\u0002\u0000\b\u0010 \u0000\u0081\u0001\u0002\u0000\b\u0010 @\u0000\u0001\u0002\u0000\b\u0010 @\u0001\u0001\u0002\u0000\b\u0010 @\u0080\u0001\u0002\u0000\b\u0010 @\u0081\u0001\u0002\u0004\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0004\u0000\u0000\u0000\u0000\u0001\u0001\u0002\u0004\u0000\u0000\u0000\u0000\u0080\u0001\u0002\u0004\u0000\u0000\u0000\u0000\u0081\u0001\u0002\u0004\u0000\u0000\u0000@\u0000\u0001\u0002\u0004\u0000\u0000\u0000@\u0001\u0001\u0002\u0004\u0000\u0000\u0000@\u0080\u0001\u0002\u0004\u0000\u0000\u0000@\u0081\u0001\u0002\u0004\u0000\u0000 \u0000\u0000\u0001\u0002\u0004\u0000\u0000 \u0000\u0001\u0001\u0002\u0004\u0000\u0000 \u0000\u0080\u0001\u0002\u0004\u0000\u0000 \u0000\u0081\u0001\u0002\u0004\u0000\u0000 @\u0000\u0001\u0002\u0004\u0000\u0000 @\u0001\u0001\u0002\u0004\u0000\u0000 @\u0080\u0001\u0002\u0004\u0000\u0000 @\u0081\u0001\u0002\u0004\u0000\u0010\u0000\u0000\u0000\u0001\u0002\u0004\u0000\u0010\u0000\u0000\u0001\u0001\u0002\u0004\u0000\u0010\u0000\u0000\u0080\u0001\u0002\u0004\u0000\u0010\u0000\u0000\u0081\u0001\u0002\u0004\u0000\u0010\u0000@\u0000\u0001\u0002\u0004\u0000\u0010\u0000@\u0001\u0001\u0002\u0004\u0000\u0010\u0000@\u0080\u0001\u0002\u0004\u0000\u0010\u0000@\u0081\u0001\u0002\u0004\u0000\u0010 \u0000\u0000\u0001\u0002\u0004\u0000\u0010 \u0000\u0001\u0001\u0002\u0004\u0000\u0010 \u0000\u0080\u0001\u0002\u0004\u0000\u0010 \u0000\u0081\u0001\u0002\u0004\u0000\u0010 @\u0000\u0001\u0002\u0004\u0000\u0010 @\u0001\u0001\u0002\u0004\u0000\u0010 @\u0080\u0001\u0002\u0004\u0000\u0010 @\u0081\u0001\u0002\u0004\b\u0000\u0000\u0000\u0000\u0001\u0002\u0004\b\u0000\u0000\u0000\u0001\u0001\u0002\u0004\b\u0000\u0000\u0000\u0080\u0001\u0002\u0004\b\u0000\u0000\u0000\u0081\u0001\u0002\u0004\b\u0000\u0000@\u0000\u0001\u0002\u0004\b\u0000\u0000@\u0001\u0001\u0002\u0004\b\u0000\u0000@\u0080\u0001\u0002\u0004\b\u0000\u0000@\u0081\u0001\u0002\u0004\b\u0000 \u0000\u0000\u0001\u0002\u0004\b\u0000 \u0000\u0001\u0001\u0002\u0004\b\u0000 \u0000\u0080\u0001\u0002\u0004\b\u0000 \u0000\u0081\u0001\u0002\u0004\b\u0000 @\u0000\u0001\u0002\u0004\b\u0000 @\u0001\u0001\u0002\u0004\b\u0000 @\u0080\u0001\u0002\u0004\b\u0000 @\u0081\u0001\u0002\u0004\b\u0010\u0000\u0000\u0000\u0001\u0002\u0004\b\u0010\u0000\u0000\u0001\u0001\u0002\u0004\b\u0010\u0000\u0000\u0080\u0001\u0002\u0004\b\u0010\u0000\u0000\u0081\u0001\u0002\u0004\b\u0010\u0000@\u0000\u0001\u0002\u0004\b\u0010\u0000@\u0001\u0001\u0002\u0004\b\u0010\u0000@\u0080\u0001\u0002\u0004\b\u0010\u0000@\u0081\u0001\u0002\u0004\b\u0010 \u0000\u0000\u0001\u0002\u0004\b\u0010 \u0000\u0001\u0001\u0002\u0004\b\u0010 \u0000\u0080\u0001\u0002\u0004\b\u0010 \u0000\u0081\u0001\u0002\u0004\b\u0010 @\u0000\u0001\u0002\u0004\b\u0010 @\u0001\u0001\u0002\u0004\b\u0010 @\u0080\u0001\u0002\u0004\b\u0010 @\u0081".getBytes("ISO-8859-1")).asLongBuffer().get(jArr2, 0, 512);
        java.lang.System.arraycopy(jArr2, 0, jArr, 0, 512);
        getOutputMinFrameDuration = jArr;
        Camera2StreamConfigurationMap = new byte[]{0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    }
}
