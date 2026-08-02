package org.apache.commons.imaging;

/* loaded from: classes17.dex */
public class ColorTools {
    private int countBitsInMask(int i) {
        int i2 = 0;
        while (i != 0) {
            i2 += i & 1;
            i >>>= 1;
        }
        return i2;
    }

    public java.awt.image.BufferedImage correctImage(java.awt.image.BufferedImage bufferedImage, java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.awt.color.ICC_Profile iCCProfile = org.apache.commons.imaging.Imaging.getICCProfile(file);
        return iCCProfile == null ? bufferedImage : convertFromColorSpace(bufferedImage, new java.awt.color.ICC_ColorSpace(iCCProfile));
    }

    public java.awt.image.BufferedImage relabelColorSpace(java.awt.image.BufferedImage bufferedImage, java.awt.color.ICC_Profile iCC_Profile) throws java.awt.image.ImagingOpException {
        return relabelColorSpace(bufferedImage, (java.awt.color.ColorSpace) new java.awt.color.ICC_ColorSpace(iCC_Profile));
    }

    public java.awt.image.BufferedImage relabelColorSpace(java.awt.image.BufferedImage bufferedImage, java.awt.color.ColorSpace colorSpace) throws java.awt.image.ImagingOpException {
        return relabelColorSpace(bufferedImage, deriveColorModel(bufferedImage, colorSpace));
    }

    public java.awt.image.BufferedImage relabelColorSpace(java.awt.image.BufferedImage bufferedImage, java.awt.image.ColorModel colorModel) throws java.awt.image.ImagingOpException {
        return new java.awt.image.BufferedImage(colorModel, bufferedImage.getRaster(), false, (java.util.Hashtable) null);
    }

    public java.awt.image.ColorModel deriveColorModel(java.awt.image.BufferedImage bufferedImage, java.awt.color.ColorSpace colorSpace) throws java.awt.image.ImagingOpException {
        return deriveColorModel(bufferedImage, colorSpace, false);
    }

    public java.awt.image.ColorModel deriveColorModel(java.awt.image.BufferedImage bufferedImage, java.awt.color.ColorSpace colorSpace, boolean z) throws java.awt.image.ImagingOpException {
        return deriveColorModel(bufferedImage.getColorModel(), colorSpace, z);
    }

    public java.awt.image.ColorModel deriveColorModel(java.awt.image.ColorModel colorModel, java.awt.color.ColorSpace colorSpace, boolean z) throws java.awt.image.ImagingOpException {
        if (colorModel instanceof java.awt.image.ComponentColorModel) {
            java.awt.image.ComponentColorModel componentColorModel = (java.awt.image.ComponentColorModel) colorModel;
            if (z) {
                return new java.awt.image.ComponentColorModel(colorSpace, false, false, 1, componentColorModel.getTransferType());
            }
            return new java.awt.image.ComponentColorModel(colorSpace, componentColorModel.hasAlpha(), componentColorModel.isAlphaPremultiplied(), componentColorModel.getTransparency(), componentColorModel.getTransferType());
        }
        if (colorModel instanceof java.awt.image.DirectColorModel) {
            java.awt.image.DirectColorModel directColorModel = (java.awt.image.DirectColorModel) colorModel;
            int redMask = directColorModel.getRedMask();
            int greenMask = directColorModel.getGreenMask();
            return new java.awt.image.DirectColorModel(colorSpace, countBitsInMask(redMask | greenMask | directColorModel.getBlueMask() | directColorModel.getAlphaMask()), directColorModel.getRedMask(), directColorModel.getGreenMask(), directColorModel.getBlueMask(), directColorModel.getAlphaMask(), directColorModel.isAlphaPremultiplied(), directColorModel.getTransferType());
        }
        throw new java.awt.image.ImagingOpException("Could not clone unknown ColorModel Type.");
    }

    public java.awt.image.BufferedImage convertToColorSpace(java.awt.image.BufferedImage bufferedImage, java.awt.color.ColorSpace colorSpace) {
        java.awt.color.ColorSpace colorSpace2 = bufferedImage.getColorModel().getColorSpace();
        java.awt.RenderingHints renderingHints = new java.awt.RenderingHints(java.awt.RenderingHints.KEY_RENDERING, java.awt.RenderingHints.VALUE_RENDER_QUALITY);
        renderingHints.put(java.awt.RenderingHints.KEY_COLOR_RENDERING, java.awt.RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        renderingHints.put(java.awt.RenderingHints.KEY_DITHERING, java.awt.RenderingHints.VALUE_DITHER_ENABLE);
        return relabelColorSpace(new java.awt.image.ColorConvertOp(colorSpace2, colorSpace, renderingHints).filter(bufferedImage, (java.awt.image.BufferedImage) null), colorSpace);
    }

    public java.awt.image.BufferedImage convertTosRGB(java.awt.image.BufferedImage bufferedImage) {
        return convertToColorSpace(bufferedImage, java.awt.image.ColorModel.getRGBdefault().getColorSpace());
    }

    protected java.awt.image.BufferedImage convertFromColorSpace(java.awt.image.BufferedImage bufferedImage, java.awt.color.ColorSpace colorSpace) {
        return convertBetweenColorSpaces(bufferedImage, colorSpace, java.awt.image.ColorModel.getRGBdefault().getColorSpace());
    }

    public java.awt.image.BufferedImage convertBetweenICCProfiles(java.awt.image.BufferedImage bufferedImage, java.awt.color.ICC_Profile iCC_Profile, java.awt.color.ICC_Profile iCC_Profile2) {
        return convertBetweenColorSpaces(bufferedImage, new java.awt.color.ICC_ColorSpace(iCC_Profile), new java.awt.color.ICC_ColorSpace(iCC_Profile2));
    }

    public java.awt.image.BufferedImage convertToICCProfile(java.awt.image.BufferedImage bufferedImage, java.awt.color.ICC_Profile iCC_Profile) {
        return convertToColorSpace(bufferedImage, new java.awt.color.ICC_ColorSpace(iCC_Profile));
    }

    public java.awt.image.BufferedImage convertBetweenColorSpacesX2(java.awt.image.BufferedImage bufferedImage, java.awt.color.ColorSpace colorSpace, java.awt.color.ColorSpace colorSpace2) {
        java.awt.RenderingHints renderingHints = new java.awt.RenderingHints(java.awt.RenderingHints.KEY_RENDERING, java.awt.RenderingHints.VALUE_RENDER_QUALITY);
        renderingHints.put(java.awt.RenderingHints.KEY_COLOR_RENDERING, java.awt.RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        renderingHints.put(java.awt.RenderingHints.KEY_DITHERING, java.awt.RenderingHints.VALUE_DITHER_ENABLE);
        java.awt.image.BufferedImage relabelColorSpace = relabelColorSpace(bufferedImage, colorSpace);
        java.awt.image.ColorConvertOp colorConvertOp = new java.awt.image.ColorConvertOp(colorSpace, colorSpace2, renderingHints);
        return relabelColorSpace(colorConvertOp.filter(relabelColorSpace(colorConvertOp.filter(relabelColorSpace, (java.awt.image.BufferedImage) null), colorSpace), (java.awt.image.BufferedImage) null), colorSpace2);
    }

    public java.awt.image.BufferedImage convertBetweenColorSpaces(java.awt.image.BufferedImage bufferedImage, java.awt.color.ColorSpace colorSpace, java.awt.color.ColorSpace colorSpace2) {
        java.awt.RenderingHints renderingHints = new java.awt.RenderingHints(java.awt.RenderingHints.KEY_RENDERING, java.awt.RenderingHints.VALUE_RENDER_QUALITY);
        renderingHints.put(java.awt.RenderingHints.KEY_COLOR_RENDERING, java.awt.RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        renderingHints.put(java.awt.RenderingHints.KEY_DITHERING, java.awt.RenderingHints.VALUE_DITHER_ENABLE);
        return relabelColorSpace(new java.awt.image.ColorConvertOp(colorSpace, colorSpace2, renderingHints).filter(relabelColorSpace(bufferedImage, colorSpace), (java.awt.image.BufferedImage) null), colorSpace2);
    }
}
