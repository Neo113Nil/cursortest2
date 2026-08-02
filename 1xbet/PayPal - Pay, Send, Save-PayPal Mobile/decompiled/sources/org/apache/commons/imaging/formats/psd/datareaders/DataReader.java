package org.apache.commons.imaging.formats.psd.datareaders;

/* loaded from: classes17.dex */
public interface DataReader {
    void readData(java.io.InputStream inputStream, java.awt.image.BufferedImage bufferedImage, org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents, org.apache.commons.imaging.common.BinaryFileParser binaryFileParser) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;
}
