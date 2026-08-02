package org.apache.commons.imaging.formats.icns;

/* loaded from: classes17.dex */
enum IcnsType {
    ICNS_16x12_1BIT_IMAGE_AND_MASK("icm#", 16, 12, 1, true),
    ICNS_16x12_4BIT_IMAGE("icm4", 16, 12, 4, false),
    ICNS_16x12_8BIT_IMAGE("icm8", 16, 12, 8, false),
    ICNS_16x16_8BIT_MASK("s8mk", 16, 16, 8, true),
    ICNS_16x16_1BIT_IMAGE_AND_MASK("ics#", 16, 16, 1, true),
    ICNS_16x16_4BIT_IMAGE("ics4", 16, 16, 4, false),
    ICNS_16x16_8BIT_IMAGE("ics8", 16, 16, 8, false),
    ICNS_16x16_32BIT_IMAGE("is32", 16, 16, 32, false),
    ICNS_32x32_8BIT_MASK("l8mk", 32, 32, 8, true),
    ICNS_32x32_1BIT_IMAGE("ICON", 32, 32, 1, false),
    ICNS_32x32_1BIT_IMAGE_AND_MASK("ICN#", 32, 32, 1, true),
    ICNS_32x32_4BIT_IMAGE("icl4", 32, 32, 4, false),
    ICNS_32x32_8BIT_IMAGE("icl8", 32, 32, 8, false),
    ICNS_32x32_32BIT_IMAGE("il32", 32, 32, 32, false),
    ICNS_48x48_8BIT_MASK("h8mk", 48, 48, 8, true),
    ICNS_48x48_1BIT_IMAGE_AND_MASK("ich#", 48, 48, 1, true),
    ICNS_48x48_4BIT_IMAGE("ich4", 48, 48, 4, false),
    ICNS_48x48_8BIT_IMAGE("ich8", 48, 48, 8, false),
    ICNS_48x48_32BIT_IMAGE("ih32", 48, 48, 32, false),
    ICNS_128x128_8BIT_MASK("t8mk", 128, 128, 8, true),
    ICNS_128x128_32BIT_IMAGE("it32", 128, 128, 32, false),
    ICNS_16x16_32BIT_ARGB_IMAGE("icp4", 16, 16, 32, false),
    ICNS_32x32_32BIT_ARGB_IMAGE("icp5", 32, 32, 32, false),
    ICNS_64x64_32BIT_ARGB_IMAGE("icp6", 64, 64, 32, false),
    ICNS_128x128_32BIT_ARGB_IMAGE("ic07", 128, 128, 32, false),
    ICNS_256x256_32BIT_ARGB_IMAGE("ic08", 256, 256, 32, false),
    ICNS_512x512_32BIT_ARGB_IMAGE("ic09", 512, 512, 32, false),
    ICNS_1024x1024_32BIT_ARGB_IMAGE("ic10", 1024, 1024, 32, false),
    ICNS_32x32_2x_32BIT_ARGB_IMAGE("ic11", 32, 32, 32, false),
    ICNS_64x64_2x_32BIT_ARGB_IMAGE("ic12", 64, 64, 32, false),
    ICNS_256x256_2x_32BIT_ARGB_IMAGE("ic13", 256, 256, 32, false),
    ICNS_512x512_2x_32BIT_ARGB_IMAGE("ic14", 512, 512, 32, false);

    private static final org.apache.commons.imaging.formats.icns.IcnsType[] ALL_IMAGE_TYPES;
    private static final org.apache.commons.imaging.formats.icns.IcnsType[] ALL_MASK_TYPES;
    private final int bitsPerPixel;
    private final boolean hasMask;
    private final int height;
    private final int type;
    private final int width;

    static {
        org.apache.commons.imaging.formats.icns.IcnsType icnsType = ICNS_16x12_1BIT_IMAGE_AND_MASK;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType2 = ICNS_16x12_4BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType3 = ICNS_16x12_8BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType4 = ICNS_16x16_8BIT_MASK;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType5 = ICNS_16x16_1BIT_IMAGE_AND_MASK;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType6 = ICNS_16x16_4BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType7 = ICNS_16x16_8BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType8 = ICNS_16x16_32BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType9 = ICNS_32x32_8BIT_MASK;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType10 = ICNS_32x32_1BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType11 = ICNS_32x32_1BIT_IMAGE_AND_MASK;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType12 = ICNS_32x32_4BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType13 = ICNS_32x32_8BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType14 = ICNS_32x32_32BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType15 = ICNS_48x48_8BIT_MASK;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType16 = ICNS_48x48_1BIT_IMAGE_AND_MASK;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType17 = ICNS_48x48_4BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType18 = ICNS_48x48_8BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType19 = ICNS_48x48_32BIT_IMAGE;
        org.apache.commons.imaging.formats.icns.IcnsType icnsType20 = ICNS_128x128_8BIT_MASK;
        ALL_IMAGE_TYPES = new org.apache.commons.imaging.formats.icns.IcnsType[]{icnsType, icnsType2, icnsType3, icnsType5, icnsType6, icnsType7, icnsType8, icnsType10, icnsType11, icnsType12, icnsType13, icnsType14, icnsType16, icnsType17, icnsType18, icnsType19, ICNS_128x128_32BIT_IMAGE, ICNS_16x16_32BIT_ARGB_IMAGE, ICNS_32x32_32BIT_ARGB_IMAGE, ICNS_64x64_32BIT_ARGB_IMAGE, ICNS_128x128_32BIT_ARGB_IMAGE, ICNS_256x256_32BIT_ARGB_IMAGE, ICNS_512x512_32BIT_ARGB_IMAGE, ICNS_1024x1024_32BIT_ARGB_IMAGE, ICNS_32x32_2x_32BIT_ARGB_IMAGE, ICNS_64x64_2x_32BIT_ARGB_IMAGE, ICNS_256x256_2x_32BIT_ARGB_IMAGE, ICNS_512x512_2x_32BIT_ARGB_IMAGE};
        ALL_MASK_TYPES = new org.apache.commons.imaging.formats.icns.IcnsType[]{icnsType, icnsType5, icnsType4, icnsType11, icnsType9, icnsType16, icnsType15, icnsType20};
    }

    IcnsType(java.lang.String str, int i, int i2, int i3, boolean z) {
        this.type = typeAsInt(str);
        this.width = i;
        this.height = i2;
        this.bitsPerPixel = i3;
        this.hasMask = z;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getBitsPerPixel() {
        return this.bitsPerPixel;
    }

    public final boolean hasMask() {
        return this.hasMask;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append("[width=");
        sb.append(this.width);
        sb.append(",height=");
        sb.append(this.height);
        sb.append(",bpp=");
        sb.append(this.bitsPerPixel);
        sb.append(",hasMask=");
        sb.append(this.hasMask);
        sb.append("]");
        return sb.toString();
    }

    public static org.apache.commons.imaging.formats.icns.IcnsType findAnyType(int i) {
        for (org.apache.commons.imaging.formats.icns.IcnsType icnsType : ALL_IMAGE_TYPES) {
            if (icnsType.getType() == i) {
                return icnsType;
            }
        }
        for (org.apache.commons.imaging.formats.icns.IcnsType icnsType2 : ALL_MASK_TYPES) {
            if (icnsType2.getType() == i) {
                return icnsType2;
            }
        }
        return null;
    }

    public static org.apache.commons.imaging.formats.icns.IcnsType findImageType(int i) {
        for (org.apache.commons.imaging.formats.icns.IcnsType icnsType : ALL_IMAGE_TYPES) {
            if (icnsType.getType() == i) {
                return icnsType;
            }
        }
        return null;
    }

    public static org.apache.commons.imaging.formats.icns.IcnsType find8BPPMaskType(org.apache.commons.imaging.formats.icns.IcnsType icnsType) {
        for (org.apache.commons.imaging.formats.icns.IcnsType icnsType2 : ALL_MASK_TYPES) {
            if (icnsType2.getBitsPerPixel() == 8 && icnsType2.getWidth() == icnsType.getWidth() && icnsType2.getHeight() == icnsType.getHeight()) {
                return icnsType2;
            }
        }
        return null;
    }

    public static org.apache.commons.imaging.formats.icns.IcnsType find1BPPMaskType(org.apache.commons.imaging.formats.icns.IcnsType icnsType) {
        for (org.apache.commons.imaging.formats.icns.IcnsType icnsType2 : ALL_MASK_TYPES) {
            if (icnsType2.getBitsPerPixel() == 1 && icnsType2.getWidth() == icnsType.getWidth() && icnsType2.getHeight() == icnsType.getHeight()) {
                return icnsType2;
            }
        }
        return null;
    }

    public static int typeAsInt(java.lang.String str) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length != 4) {
            throw new java.lang.IllegalArgumentException("Invalid ICNS type");
        }
        return (bytes[3] & 255) | ((bytes[0] & 255) << 24) | ((bytes[1] & 255) << 16) | ((bytes[2] & 255) << 8);
    }

    public static java.lang.String describeType(int i) {
        return new java.lang.String(new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)}, java.nio.charset.StandardCharsets.US_ASCII);
    }
}
