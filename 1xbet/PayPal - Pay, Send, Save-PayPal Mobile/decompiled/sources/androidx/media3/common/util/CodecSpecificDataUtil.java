package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class CodecSpecificDataUtil {
    private static final byte[] getHighSpeedVideoFpsRangesFor = {0, 0, 0, 1};
    private static final java.lang.String[] Camera2StreamConfigurationMap = {"", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA};
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRanges = java.util.regex.Pattern.compile("^\\D?(\\d+)$");

    public static int[] parseAlacAudioSpecificConfig(byte[] bArr) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        parsableByteArray.setPosition(5);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(9);
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return new int[]{parsableByteArray.readUnsignedIntToInt(), readUnsignedByte2, readUnsignedByte};
    }

    public static java.util.List<byte[]> buildCea708InitializationData(boolean z) {
        return java.util.Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static java.lang.String buildIamfCodecString(byte[] bArr) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        java.lang.String str = null;
        java.lang.String str2 = null;
        while (parsableByteArray.bytesLeft() > 0 && (str == null || str2 == null)) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int i = readUnsignedByte >> 3;
            boolean z = (readUnsignedByte & 2) != 0;
            boolean z2 = (readUnsignedByte & 1) != 0;
            int readUnsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
            if (i > 4 && i < 24 && z) {
                parsableByteArray.skipLeb128();
                parsableByteArray.skipLeb128();
            }
            if (z2) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedLeb128ToInt());
            }
            int position = parsableByteArray.getPosition();
            if (i == 31) {
                parsableByteArray.skipBytes(4);
                str = androidx.media3.common.util.Util.formatInvariant("iamf.%03X.%03X", java.lang.Integer.valueOf(parsableByteArray.readUnsignedByte()), java.lang.Integer.valueOf(parsableByteArray.readUnsignedByte()));
            } else if (i == 0) {
                parsableByteArray.skipLeb128();
                str2 = parsableByteArray.readString(4);
                if (str2.equals("mp4a")) {
                    parsableByteArray.skipLeb128();
                    parsableByteArray.skipBytes(2);
                    androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray();
                    parsableBitArray.reset(parsableByteArray);
                    int readBits = parsableBitArray.readBits(5);
                    if (readBits == 31) {
                        readBits = parsableBitArray.readBits(6) + 32;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str2);
                    sb.append(".40.");
                    sb.append(readBits);
                    str2 = sb.toString();
                }
            }
            parsableByteArray.setPosition(position + readUnsignedLeb128ToInt);
        }
        if (str == null || str2 == null) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(".");
        sb2.append(str2);
        return sb2.toString();
    }

    public static boolean parseCea708InitializationData(java.util.List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static com.google.common.collect.ImmutableList<byte[]> buildVp9CodecPrivateInitializationData(byte b, byte b2, byte b3, byte b4) {
        return com.google.common.collect.ImmutableList.of(new byte[]{1, 1, b, 2, 1, b2, 3, 1, b3, 4, 1, b4});
    }

    public static java.nio.ByteBuffer getVorbisInitializationData(androidx.media3.common.Format format) {
        com.google.common.base.Preconditions.checkArgument(format.initializationData.size() > 1, "csd-0 and csd-1 must be present for Vorbis.");
        byte[] bArr = format.initializationData.get(0);
        byte[] bArr2 = format.initializationData.get(1);
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = length / 255;
        byte[] bArr3 = new byte[i + 1];
        java.util.Arrays.fill(bArr3, (byte) -1);
        bArr3[i] = (byte) (length % 255);
        int i2 = 23 / 255;
        byte[] bArr4 = {com.google.common.base.Ascii.ETB};
        java.util.Arrays.fill(bArr4, (byte) -1);
        int i3 = 23 % 255;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i + 3 + length + 23 + length2);
        allocate.put((byte) 2);
        allocate.put(bArr3);
        allocate.put(bArr4);
        allocate.put(bArr);
        allocate.put(new byte[]{3, 118, 111, 114, 98, 105, 115, 7, 0, 0, 0, 97, 110, 100, 114, 111, 105, 100, 0, 0, 0, 0, 1});
        allocate.put(bArr2);
        allocate.flip();
        return allocate;
    }

    public static byte[] buildDolbyVisionInitializationData(int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = new byte[24];
        if (i == 8) {
            i4 = 0;
            i3 = 4;
        } else if (i == 9) {
            i3 = 2;
            i4 = 1;
        } else {
            i3 = 0;
            i4 = 0;
        }
        bArr[0] = 1;
        bArr[1] = 0;
        byte b = (byte) ((i & 127) << 1);
        bArr[2] = b;
        bArr[2] = (byte) ((b | ((i2 >> 5) & 1)) & 255);
        byte b2 = (byte) ((i2 & 31) << 3);
        bArr[3] = b2;
        byte b3 = (byte) (b2 | 4);
        bArr[3] = b3;
        bArr[3] = b3;
        bArr[3] = (byte) (b3 | 1);
        byte b4 = (byte) (i3 << 4);
        bArr[4] = b4;
        bArr[4] = (byte) (b4 | (i4 << 2));
        return bArr;
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 >= bArr.length) {
                z = false;
                break;
            }
            if (parsableByteArray.readUnsignedInt24() == 1 && (bArr[i3] & com.visa.cbp.getEncExpo.onUnminimized) == 32) {
                z = true;
                break;
            }
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 2);
            i2++;
        }
        com.google.common.base.Preconditions.checkArgument(z, "Invalid input: VOL not found.");
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArr);
        parsableBitArray.skipBits((i2 + 4) * 8);
        parsableBitArray.skipBits(1);
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        if (parsableBitArray.readBits(4) == 15) {
            parsableBitArray.skipBits(8);
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(79);
            }
        }
        com.google.common.base.Preconditions.checkArgument(parsableBitArray.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        com.google.common.base.Preconditions.checkArgument(parsableBitArray.readBit());
        int readBits = parsableBitArray.readBits(16);
        com.google.common.base.Preconditions.checkArgument(parsableBitArray.readBit());
        if (parsableBitArray.readBit()) {
            com.google.common.base.Preconditions.checkArgument(readBits > 0);
            for (int i4 = readBits - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            parsableBitArray.skipBits(i);
        }
        com.google.common.base.Preconditions.checkArgument(parsableBitArray.readBit());
        int readBits2 = parsableBitArray.readBits(13);
        com.google.common.base.Preconditions.checkArgument(parsableBitArray.readBit());
        int readBits3 = parsableBitArray.readBits(13);
        com.google.common.base.Preconditions.checkArgument(parsableBitArray.readBit());
        parsableBitArray.skipBits(1);
        return android.util.Pair.create(java.lang.Integer.valueOf(readBits2), java.lang.Integer.valueOf(readBits3));
    }

    public static java.lang.String buildAvcCodecString(int i, int i2, int i3) {
        return java.lang.String.format("avc1.%02X%02X%02X", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
    }

    public static java.lang.String buildHevcCodecString(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.media3.common.util.Util.formatInvariant("hvc1.%s%d.%X.%c%d", Camera2StreamConfigurationMap[i], java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Character.valueOf(z ? 'H' : org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT), java.lang.Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(java.lang.String.format(".%02X", java.lang.Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static java.lang.String buildApvCodecString(byte[] bArr) {
        com.google.common.base.Preconditions.checkArgument(bArr.length >= 17, "Invalid APV CSD length: %s", bArr.length);
        byte b = bArr[0];
        com.google.common.base.Preconditions.checkArgument(b == 1, "Invalid APV CSD version: %s", (int) b);
        return androidx.media3.common.util.Util.formatInvariant("apv1.apvf%d.apvl%d.apvb%d", java.lang.Integer.valueOf(bArr[5]), java.lang.Integer.valueOf(bArr[6]), java.lang.Integer.valueOf(bArr[7]));
    }

    public static java.lang.String buildH263CodecString(int i, int i2) {
        return androidx.media3.common.util.Util.formatInvariant("s263.%d.%d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }

    public static java.lang.String buildDolbyVisionCodecString(int i, int i2) {
        if (i > 9) {
            return androidx.media3.common.util.Util.formatInvariant("dvh1.%02d.%02d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        if (i > 8) {
            return androidx.media3.common.util.Util.formatInvariant("dvav.%02d.%02d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        return androidx.media3.common.util.Util.formatInvariant("dvhe.%02d.%02d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(androidx.media3.common.Format format) {
        char c;
        char c2;
        java.lang.Integer num;
        char c3;
        java.lang.Integer num2 = null;
        if (format.codecs == null) {
            return null;
        }
        java.lang.String[] split = format.codecs.split("\\.");
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            java.lang.String str = format.codecs;
            if (split.length < 3) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(java.lang.String.valueOf(str)));
                return null;
            }
            java.util.regex.Matcher matcher = getHighSpeedVideoFpsRanges.matcher(split[1]);
            if (!matcher.matches()) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(java.lang.String.valueOf(str)));
                return null;
            }
            java.lang.String group = matcher.group(1);
            if (group != null) {
                group.hashCode();
                int hashCode = group.hashCode();
                if (hashCode != 1567) {
                    switch (hashCode) {
                        case 1536:
                            if (group.equals(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX)) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1537:
                            if (group.equals("01")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1538:
                            if (group.equals(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD)) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1539:
                            if (group.equals("03")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1540:
                            if (group.equals("04")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1541:
                            if (group.equals("05")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1542:
                            if (group.equals(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_DISCOVER)) {
                                c3 = 6;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1543:
                            if (group.equals("07")) {
                                c3 = 7;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1544:
                            if (group.equals("08")) {
                                c3 = '\b';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1545:
                            if (group.equals("09")) {
                                c3 = '\t';
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            num2 = 1;
                            break;
                        case 1:
                            num2 = 2;
                            break;
                        case 2:
                            num2 = 4;
                            break;
                        case 3:
                            num2 = 8;
                            break;
                        case 4:
                            num2 = 16;
                            break;
                        case 5:
                            num2 = 32;
                            break;
                        case 6:
                            num2 = 64;
                            break;
                        case 7:
                            num2 = 128;
                            break;
                        case '\b':
                            num2 = 256;
                            break;
                        case '\t':
                            num2 = 512;
                            break;
                        case '\n':
                            num2 = 1024;
                            break;
                        default:
                            num2 = null;
                            break;
                    }
                } else {
                    if (group.equals("10")) {
                        c3 = '\n';
                        switch (c3) {
                        }
                    }
                    c3 = 65535;
                    switch (c3) {
                    }
                }
            }
            if (num2 == null) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(java.lang.String.valueOf(group)));
                return null;
            }
            java.lang.String str2 = split[2];
            if (str2 != null) {
                str2.hashCode();
                int hashCode2 = str2.hashCode();
                switch (hashCode2) {
                    case 1537:
                        if (str2.equals("01")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1538:
                        if (str2.equals(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1539:
                        if (str2.equals("03")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1540:
                        if (str2.equals("04")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1541:
                        if (str2.equals("05")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1542:
                        if (str2.equals(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_DISCOVER)) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1543:
                        if (str2.equals("07")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1544:
                        if (str2.equals("08")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1545:
                        if (str2.equals("09")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        switch (hashCode2) {
                            case 1567:
                                if (str2.equals("10")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1568:
                                if (str2.equals("11")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1569:
                                if (str2.equals("12")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1570:
                                if (str2.equals("13")) {
                                    c2 = '\f';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                }
                switch (c2) {
                    case 0:
                        num = 1;
                        break;
                    case 1:
                        num = 2;
                        break;
                    case 2:
                        num = 4;
                        break;
                    case 3:
                        num = 8;
                        break;
                    case 4:
                        num = 16;
                        break;
                    case 5:
                        num = 32;
                        break;
                    case 6:
                        num = 64;
                        break;
                    case 7:
                        num = 128;
                        break;
                    case '\b':
                        num = 256;
                        break;
                    case '\t':
                        num = 512;
                        break;
                    case '\n':
                        num = 1024;
                        break;
                    case 11:
                        num = 2048;
                        break;
                    case '\f':
                        num = 4096;
                        break;
                }
                if (num != null) {
                    androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(java.lang.String.valueOf(str2)));
                    return null;
                }
                return new android.util.Pair<>(num2, num);
            }
            num = null;
            if (num != null) {
            }
        } else {
            java.lang.String str3 = split[0];
            str3.hashCode();
            switch (str3.hashCode()) {
                case 2986313:
                    if (str3.equals("ac-4")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3001066:
                    if (str3.equals("apv1")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3004662:
                    if (str3.equals("av01")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3224753:
                    if (str3.equals("iamf")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3475740:
                    if (str3.equals("s263")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0168, code lost:
    
        if (r11.equals("L60") != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getHevcProfileAndLevel(java.lang.String str, java.lang.String[] strArr, androidx.media3.common.ColorInfo colorInfo) {
        int i;
        java.lang.Integer num;
        if (strArr.length < 4) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        java.util.regex.Matcher matcher = getHighSpeedVideoFpsRanges.matcher(strArr[1]);
        if (!matcher.matches()) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        java.lang.String group = matcher.group(1);
        char c = 6;
        if ("1".equals(group)) {
            i = 1;
        } else if (androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D.equals(group)) {
            i = (colorInfo == null || colorInfo.colorTransfer != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(java.lang.String.valueOf(group)));
                return null;
            }
            i = 6;
        }
        java.lang.String str2 = strArr[3];
        if (str2 != null) {
            str2.hashCode();
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 74758:
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    num = 2;
                    break;
                case 1:
                    num = 8;
                    break;
                case 2:
                    num = 32;
                    break;
                case 3:
                    num = 128;
                    break;
                case 4:
                    num = 512;
                    break;
                case 5:
                    num = 1;
                    break;
                case 6:
                    num = 4;
                    break;
                case 7:
                    num = 16;
                    break;
                case '\b':
                    num = 64;
                    break;
                case '\t':
                    num = 256;
                    break;
                case '\n':
                    num = 2048;
                    break;
                case 11:
                    num = 8192;
                    break;
                case '\f':
                    num = 32768;
                    break;
                case '\r':
                    num = 131072;
                    break;
                case 14:
                    num = 524288;
                    break;
                case 15:
                    num = 2097152;
                    break;
                case 16:
                    num = 8388608;
                    break;
                case 17:
                    num = 33554432;
                    break;
                case 18:
                    num = 1024;
                    break;
                case 19:
                    num = 4096;
                    break;
                case 20:
                    num = 16384;
                    break;
                case 21:
                    num = 65536;
                    break;
                case 22:
                    num = 262144;
                    break;
                case 23:
                    num = 1048576;
                    break;
                case 24:
                    num = 4194304;
                    break;
                case 25:
                    num = 16777216;
                    break;
            }
            if (num != null) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(java.lang.String.valueOf(str2)));
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(i), num);
        }
        num = null;
        if (num != null) {
        }
    }

    public static byte[] buildNalUnit(byte[] bArr, int i, int i2) {
        byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
        byte[] bArr3 = new byte[bArr2.length + i2];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        java.lang.System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!Camera2StreamConfigurationMap(bArr, 0)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        do {
            arrayList.add(java.lang.Integer.valueOf(i));
            byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
            i += bArr2.length;
            int length = bArr.length;
            int length2 = bArr2.length;
            while (true) {
                if (i > length - length2) {
                    i = -1;
                    break;
                }
                if (Camera2StreamConfigurationMap(bArr, i)) {
                    break;
                }
                i++;
            }
        } while (i != -1);
        byte[][] bArr3 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int intValue = ((java.lang.Integer) arrayList.get(i2)).intValue();
            int intValue2 = (i2 < arrayList.size() + (-1) ? ((java.lang.Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr4 = new byte[intValue2];
            java.lang.System.arraycopy(bArr, intValue, bArr4, 0, intValue2);
            bArr3[i2] = bArr4;
            i2++;
        }
        return bArr3;
    }

    public static int dolbyVisionConstantToLevelNumber(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                switch (i) {
                    case 4:
                        return 3;
                    case 8:
                        return 4;
                    case 16:
                        return 5;
                    case 32:
                        return 6;
                    case 64:
                        return 7;
                    case 128:
                        return 8;
                    case 256:
                        return 9;
                    case 512:
                        return 10;
                    case 1024:
                        return 11;
                    case 2048:
                        return 12;
                    case 4096:
                        return 13;
                    default:
                        throw new java.lang.IllegalArgumentException("Unknown Dolby Vision level: ".concat(java.lang.String.valueOf(i)));
                }
            }
        }
        return i2;
    }

    public static int dolbyVisionConstantToProfileNumber(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        if (i == 1024) {
            return 10;
        }
        throw new java.lang.IllegalArgumentException("Unknown Dolby Vision profile: ".concat(java.lang.String.valueOf(i)));
    }

    private static boolean Camera2StreamConfigurationMap(byte[] bArr, int i) {
        if (bArr.length - i <= getHighSpeedVideoFpsRangesFor.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String[] strArr) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> pair = new android.util.Pair<>(1, 1);
        if (strArr.length < 3) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(java.lang.String.valueOf(str)));
            return pair;
        }
        try {
            return new android.util.Pair<>(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArr[1])), java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArr[2])));
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(java.lang.String.valueOf(str)));
            return pair;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String[] strArr) {
        int parseInt;
        int parseInt2;
        int i = 2;
        if (strArr.length < 2) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        int i2 = 1;
        try {
            if (strArr[1].length() == 6) {
                parseInt = java.lang.Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt2 = java.lang.Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                parseInt = java.lang.Integer.parseInt(strArr[1]);
                parseInt2 = java.lang.Integer.parseInt(strArr[2]);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Ignoring malformed AVC codec string: ");
                sb.append(str);
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", sb.toString());
                return null;
            }
            if (parseInt == 66) {
                i = 1;
            } else if (parseInt != 77) {
                i = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : 4;
            }
            if (i == -1) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown AVC profile: ".concat(java.lang.String.valueOf(parseInt)));
                return null;
            }
            switch (parseInt2) {
                case 10:
                    break;
                case 11:
                    i2 = 4;
                    break;
                case 12:
                    i2 = 8;
                    break;
                case 13:
                    i2 = 16;
                    break;
                default:
                    switch (parseInt2) {
                        case 20:
                            i2 = 32;
                            break;
                        case 21:
                            i2 = 64;
                            break;
                        case 22:
                            i2 = 128;
                            break;
                        default:
                            switch (parseInt2) {
                                case 30:
                                    i2 = 256;
                                    break;
                                case 31:
                                    i2 = 512;
                                    break;
                                case 32:
                                    i2 = 1024;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 40:
                                            i2 = 2048;
                                            break;
                                        case 41:
                                            i2 = 4096;
                                            break;
                                        case 42:
                                            i2 = 8192;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 50:
                                                    i2 = 16384;
                                                    break;
                                                case 51:
                                                    i2 = 32768;
                                                    break;
                                                case 52:
                                                    i2 = 65536;
                                                    break;
                                                default:
                                                    i2 = -1;
                                                    break;
                                            }
                                    }
                            }
                    }
            }
            if (i2 == -1) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown AVC level: ".concat(java.lang.String.valueOf(parseInt2)));
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getOutputMinFrameDuration(java.lang.String str, java.lang.String[] strArr) {
        if (strArr.length < 3) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        int i = 1;
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[1]);
            int parseInt2 = java.lang.Integer.parseInt(strArr[2]);
            int i2 = parseInt != 0 ? parseInt != 1 ? parseInt != 2 ? parseInt != 3 ? -1 : 8 : 4 : 2 : 1;
            if (i2 == -1) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown VP9 profile: ".concat(java.lang.String.valueOf(parseInt)));
                return null;
            }
            if (parseInt2 != 10) {
                if (parseInt2 == 11) {
                    i = 2;
                } else if (parseInt2 == 20) {
                    i = 4;
                } else if (parseInt2 == 21) {
                    i = 8;
                } else if (parseInt2 == 30) {
                    i = 16;
                } else if (parseInt2 == 31) {
                    i = 32;
                } else if (parseInt2 == 40) {
                    i = 64;
                } else if (parseInt2 == 41) {
                    i = 128;
                } else if (parseInt2 == 50) {
                    i = 256;
                } else if (parseInt2 != 51) {
                    switch (parseInt2) {
                        case 60:
                            i = 2048;
                            break;
                        case 61:
                            i = 4096;
                            break;
                        case 62:
                            i = 8192;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                } else {
                    i = 512;
                }
            }
            if (i == -1) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown VP9 level: ".concat(java.lang.String.valueOf(parseInt2)));
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHighSpeedVideoSizes(java.lang.String str, java.lang.String[] strArr, androidx.media3.common.ColorInfo colorInfo) {
        int i;
        int i2 = 4;
        if (strArr.length < 4) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[1]);
            int parseInt2 = java.lang.Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = java.lang.Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown AV1 profile: ".concat(java.lang.String.valueOf(parseInt)));
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown AV1 bit depth: ".concat(java.lang.String.valueOf(parseInt3)));
                return null;
            }
            if (parseInt3 != 8) {
                i = (colorInfo == null || !(colorInfo.hdrStaticInfo != null || colorInfo.colorTransfer == 7 || colorInfo.colorTransfer == 6)) ? 2 : 4096;
            } else {
                i = 1;
            }
            switch (parseInt2) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    break;
                case 3:
                    i2 = 8;
                    break;
                case 4:
                    i2 = 16;
                    break;
                case 5:
                    i2 = 32;
                    break;
                case 6:
                    i2 = 64;
                    break;
                case 7:
                    i2 = 128;
                    break;
                case 8:
                    i2 = 256;
                    break;
                case 9:
                    i2 = 512;
                    break;
                case 10:
                    i2 = 1024;
                    break;
                case 11:
                    i2 = 2048;
                    break;
                case 12:
                    i2 = 4096;
                    break;
                case 13:
                    i2 = 8192;
                    break;
                case 14:
                    i2 = 16384;
                    break;
                case 15:
                    i2 = 32768;
                    break;
                case 16:
                    i2 = 65536;
                    break;
                case 17:
                    i2 = 131072;
                    break;
                case 18:
                    i2 = 262144;
                    break;
                case 19:
                    i2 = 524288;
                    break;
                case 20:
                    i2 = 1048576;
                    break;
                case 21:
                    i2 = 2097152;
                    break;
                case 22:
                    i2 = 4194304;
                    break;
                case 23:
                    i2 = 8388608;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            if (i2 == -1) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown AV1 level: ".concat(java.lang.String.valueOf(parseInt2)));
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String[] strArr) {
        int i;
        if (strArr.length < 4) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[1].substring(4));
            int parseInt2 = java.lang.Integer.parseInt(strArr[2].substring(4));
            int parseInt3 = java.lang.Integer.parseInt(strArr[3].substring(4));
            if (parseInt == 33) {
                i = 1;
            } else {
                if (parseInt != 44) {
                    androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring invalid APV profile: ".concat(java.lang.String.valueOf(parseInt)));
                    return null;
                }
                i = 8192;
            }
            int i2 = (parseInt2 / 30) * 2;
            if (parseInt2 % 30 == 0) {
                i2--;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf((1 << parseInt3) | (256 << (i2 - 1))));
        } catch (java.lang.NumberFormatException e) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(java.lang.String.valueOf(str)), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[Catch: NumberFormatException -> 0x006b, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x006b, blocks: (B:8:0x0016, B:10:0x002a, B:22:0x004a, B:30:0x005c), top: B:7:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHighSpeedVideoSizes(java.lang.String str, java.lang.String[] strArr) {
        int i = 3;
        if (strArr.length != 3) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(androidx.media3.common.MimeTypes.getMimeTypeFromMp4ObjectType(java.lang.Integer.parseInt(strArr[1], 16)))) {
                int parseInt = java.lang.Integer.parseInt(strArr[2]);
                int i2 = 17;
                if (parseInt != 17) {
                    i2 = 20;
                    if (parseInt != 20) {
                        i2 = 23;
                        if (parseInt != 23) {
                            i2 = 29;
                            if (parseInt != 29) {
                                i2 = 39;
                                if (parseInt != 39) {
                                    i2 = 42;
                                    if (parseInt != 42) {
                                        switch (parseInt) {
                                            case 1:
                                                i = 1;
                                                break;
                                            case 2:
                                                i = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i = 4;
                                                break;
                                            case 5:
                                                i = 5;
                                                break;
                                            case 6:
                                                i = 6;
                                                break;
                                            default:
                                                i = -1;
                                                break;
                                        }
                                        if (i != -1) {
                                            return new android.util.Pair<>(java.lang.Integer.valueOf(i), 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
                if (i != -1) {
                }
            }
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(java.lang.String.valueOf(str)));
        }
        return null;
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> Camera2StreamConfigurationMap(java.lang.String str, java.lang.String[] strArr) {
        int i;
        int i2 = 4;
        if (strArr.length != 4) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[1]);
            int parseInt2 = java.lang.Integer.parseInt(strArr[2]);
            int parseInt3 = java.lang.Integer.parseInt(strArr[3]);
            if (parseInt == 0) {
                if (parseInt2 == 0) {
                    i = 257;
                }
                i = -1;
            } else if (parseInt != 1) {
                if (parseInt == 2) {
                    if (parseInt2 == 1) {
                        i = org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_LAYERS_GROUP_INFO;
                    } else if (parseInt2 == 2) {
                        i = org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA;
                    }
                }
                i = -1;
            } else if (parseInt2 == 0) {
                i = 513;
            } else {
                if (parseInt2 == 1) {
                    i = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID;
                }
                i = -1;
            }
            if (i == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown AC-4 profile: ");
                sb.append(parseInt);
                sb.append(".");
                sb.append(parseInt2);
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", sb.toString());
                return null;
            }
            if (parseInt3 == 0) {
                i2 = 1;
            } else if (parseInt3 == 1) {
                i2 = 2;
            } else if (parseInt3 != 2) {
                i2 = parseInt3 != 3 ? parseInt3 != 4 ? -1 : 16 : 8;
            }
            if (i2 == -1) {
                androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Unknown AC-4 level: ".concat(java.lang.String.valueOf(parseInt3)));
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHighSpeedVideoSizesFor(java.lang.String str, java.lang.String[] strArr) {
        char c;
        int i = 4;
        if (strArr.length < 4) {
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[1]);
            java.lang.String str2 = strArr[3];
            str2.hashCode();
            switch (str2.hashCode()) {
                case 2464863:
                    if (str2.equals("Opus")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3114792:
                    if (str2.equals("fLaC")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3238865:
                    if (str2.equals("ipcm")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3356560:
                    if (str2.equals("mp4a")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i = 1;
            } else if (c != 1) {
                if (c == 2) {
                    i = 8;
                } else {
                    if (c != 3) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Ignoring unknown codec identifier for IAMF auxiliary profile: ");
                        sb.append(strArr[3]);
                        androidx.media3.common.util.Log.w("CodecSpecificDataUtil", sb.toString());
                        return null;
                    }
                    i = 2;
                }
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf((1 << (parseInt + 16)) | 16777216 | i), 0);
        } catch (java.lang.NumberFormatException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Ignoring malformed primary profile in IAMF codec string: ");
            sb2.append(strArr[1]);
            androidx.media3.common.util.Log.w("CodecSpecificDataUtil", sb2.toString(), e);
            return null;
        }
    }

    private CodecSpecificDataUtil() {
    }
}
