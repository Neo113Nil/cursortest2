package org.apache.commons.imaging;

/* loaded from: classes17.dex */
public class ImageDump {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.ImageDump.class.getName());

    private java.lang.String colorSpaceTypeToName(java.awt.color.ColorSpace colorSpace) {
        int type = colorSpace.getType();
        if (type == 5) {
            return "TYPE_RGB";
        }
        if (type == 9) {
            return "TYPE_CMYK";
        }
        switch (type) {
            case 1000:
                return "CS_sRGB";
            case 1001:
                return "CS_CIEXYZ";
            case 1002:
                return "CS_PYCC";
            case 1003:
                return "CS_GRAY";
            case 1004:
                return "CS_LINEAR_RGB";
            default:
                return "unknown";
        }
    }

    public void dumpColorSpace(java.lang.String str, java.awt.color.ColorSpace colorSpace) {
        java.util.logging.Logger logger = LOGGER;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": type: ");
        sb.append(colorSpace.getType());
        sb.append(" (");
        sb.append(colorSpaceTypeToName(colorSpace));
        sb.append(")");
        logger.fine(sb.toString());
        if (!(colorSpace instanceof java.awt.color.ICC_ColorSpace)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(": Unknown ColorSpace: ");
            sb2.append(colorSpace.getClass().getName());
            logger.fine(sb2.toString());
            return;
        }
        new org.apache.commons.imaging.icc.IccProfileParser().getICCProfileInfo(((java.awt.color.ICC_ColorSpace) colorSpace).getProfile().getData()).dump(str);
    }

    public void dump(java.awt.image.BufferedImage bufferedImage) {
        dump("", bufferedImage);
    }

    public void dump(java.lang.String str, java.awt.image.BufferedImage bufferedImage) {
        java.util.logging.Logger logger = LOGGER;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": dump");
        logger.fine(sb.toString());
        dumpColorSpace(str, bufferedImage.getColorModel().getColorSpace());
        dumpBIProps(str, bufferedImage);
    }

    public void dumpBIProps(java.lang.String str, java.awt.image.BufferedImage bufferedImage) {
        java.lang.String[] propertyNames = bufferedImage.getPropertyNames();
        if (propertyNames == null) {
            java.util.logging.Logger logger = LOGGER;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(": no props");
            logger.fine(sb.toString());
            return;
        }
        for (java.lang.String str2 : propertyNames) {
            java.util.logging.Logger logger2 = LOGGER;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(bufferedImage.getProperty(str2));
            logger2.fine(sb2.toString());
        }
    }
}
