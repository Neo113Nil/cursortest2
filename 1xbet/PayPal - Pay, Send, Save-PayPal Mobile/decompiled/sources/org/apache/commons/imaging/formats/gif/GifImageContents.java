package org.apache.commons.imaging.formats.gif;

/* loaded from: classes17.dex */
class GifImageContents {
    final java.util.List<org.apache.commons.imaging.formats.gif.GifBlock> blocks;
    final org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo;
    final byte[] globalColorTable;

    GifImageContents(org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo, byte[] bArr, java.util.List<org.apache.commons.imaging.formats.gif.GifBlock> list) {
        this.gifHeaderInfo = gifHeaderInfo;
        this.globalColorTable = bArr;
        this.blocks = list;
    }
}
