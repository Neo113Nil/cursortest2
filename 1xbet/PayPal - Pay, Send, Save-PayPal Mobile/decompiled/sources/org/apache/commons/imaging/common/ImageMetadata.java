package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public interface ImageMetadata {

    public interface ImageMetadataItem {
        java.lang.String toString();

        java.lang.String toString(java.lang.String str);
    }

    java.util.List<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> getItems();

    java.lang.String toString(java.lang.String str);
}
