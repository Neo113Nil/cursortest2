package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public class GenericImageMetadata implements org.apache.commons.imaging.common.ImageMetadata {
    private static final java.lang.String NEWLINE = java.lang.System.getProperty("line.separator");
    private final java.util.List<org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> items = new java.util.ArrayList();

    public void add(java.lang.String str, java.lang.String str2) {
        add(new org.apache.commons.imaging.common.GenericImageMetadata.GenericImageMetadataItem(str, str2));
    }

    public void add(org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem) {
        this.items.add(imageMetadataItem);
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public java.util.List<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> getItems() {
        return new java.util.ArrayList(this.items);
    }

    public java.lang.String toString() {
        return toString(null);
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public java.lang.String toString(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < this.items.size(); i++) {
            if (i > 0) {
                sb.append(NEWLINE);
            }
            org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem = this.items.get(i);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("\t");
            sb.append(imageMetadataItem.toString(sb2.toString()));
        }
        return sb.toString();
    }

    public static class GenericImageMetadataItem implements org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem {
        private final java.lang.String keyword;
        private final java.lang.String text;

        public GenericImageMetadataItem(java.lang.String str, java.lang.String str2) {
            this.keyword = str;
            this.text = str2;
        }

        public java.lang.String getKeyword() {
            return this.keyword;
        }

        public java.lang.String getText() {
            return this.text;
        }

        @Override // org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem
        public java.lang.String toString() {
            return toString(null);
        }

        @Override // org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem
        public java.lang.String toString(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.keyword);
            sb.append(": ");
            sb.append(this.text);
            java.lang.String obj = sb.toString();
            if (str == null) {
                return obj;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(obj);
            return sb2.toString();
        }
    }
}
