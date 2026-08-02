package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/miteksystems/misnap/core/ExifUtil;", "", "<init>", "()V", "", "jpeg", "", "Lorg/apache/commons/imaging/formats/tiff/taginfos/TagInfo;", "", "metadata", "writeExif", "([BLjava/util/Map;)[B", "tag", "readExifTag", "([BLorg/apache/commons/imaging/formats/tiff/taginfos/TagInfo;)Ljava/lang/String;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "image", "writeExifField$core_release", "(Lorg/apache/commons/imaging/formats/tiff/taginfos/TagInfo;Ljava/lang/String;[B)[B", "Lorg/apache/commons/imaging/formats/tiff/taginfos/TagInfoAscii;", "a", "Lorg/apache/commons/imaging/formats/tiff/taginfos/TagInfoAscii;", "getEXIF_TAG_OFFSET_TIME_ORIGINAl", "()Lorg/apache/commons/imaging/formats/tiff/taginfos/TagInfoAscii;", "getEXIF_TAG_OFFSET_TIME_ORIGINAl$annotations", "EXIF_TAG_OFFSET_TIME_ORIGINAl"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class ExifUtil {
    public static final com.miteksystems.misnap.core.ExifUtil INSTANCE = new com.miteksystems.misnap.core.ExifUtil();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_OFFSET_TIME_ORIGINAl = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii(androidx.exifinterface.media.ExifInterface.TAG_OFFSET_TIME_ORIGINAL, 36881, 7, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getEXIF_TAG_OFFSET_TIME_ORIGINAl$annotations() {
    }

    public final /* synthetic */ byte[] writeExifField$core_release(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tag, java.lang.String data, byte[] image) {
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata exif;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        if (kotlin.text.StringsKt.isBlank(data)) {
            return image;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            org.apache.commons.imaging.common.ImageMetadata metadata = org.apache.commons.imaging.Imaging.getMetadata(image);
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet = null;
            org.apache.commons.imaging.formats.jpeg.JpegImageMetadata jpegImageMetadata = metadata instanceof org.apache.commons.imaging.formats.jpeg.JpegImageMetadata ? (org.apache.commons.imaging.formats.jpeg.JpegImageMetadata) metadata : null;
            if (jpegImageMetadata != null && (exif = jpegImageMetadata.getExif()) != null) {
                tiffOutputSet = exif.getOutputSet();
            }
            if (tiffOutputSet == null) {
                tiffOutputSet = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet();
            }
            org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory orCreateExifDirectory = tiffOutputSet.getOrCreateExifDirectory();
            orCreateExifDirectory.removeField(tag);
            if (tag instanceof org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText) {
                orCreateExifDirectory.add((org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText) tag, data);
            } else {
                if (!(tag instanceof org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii)) {
                    return image;
                }
                orCreateExifDirectory.add((org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii) tag, data);
            }
            new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter().updateExifMetadataLossless(image, byteArrayOutputStream, tiffOutputSet);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
            return byteArray;
        } catch (java.lang.Exception unused) {
            java.lang.String str = tag.f7039name;
            int i = tag.length;
            int i2 = tag.tag;
            return image;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final byte[] writeExif(byte[] jpeg, java.util.Map<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo, java.lang.String> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jpeg, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        if (metadata.isEmpty()) {
            return jpeg;
        }
        for (java.util.Map.Entry<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo, java.lang.String> entry : metadata.entrySet()) {
            jpeg = INSTANCE.writeExifField$core_release(entry.getKey(), entry.getValue(), jpeg);
        }
        return jpeg;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String readExifTag(byte[] jpeg, org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tag) {
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata exif;
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> allFields;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jpeg, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        try {
            org.apache.commons.imaging.common.ImageMetadata metadata = org.apache.commons.imaging.Imaging.getMetadata(jpeg);
            org.apache.commons.imaging.formats.jpeg.JpegImageMetadata jpegImageMetadata = metadata instanceof org.apache.commons.imaging.formats.jpeg.JpegImageMetadata ? (org.apache.commons.imaging.formats.jpeg.JpegImageMetadata) metadata : null;
            if (jpegImageMetadata != null && (exif = jpegImageMetadata.getExif()) != null && (allFields = exif.getAllFields()) != null) {
                java.util.Iterator<T> it = allFields.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((org.apache.commons.imaging.formats.tiff.TiffField) obj).getTag() == tag.tag) {
                        break;
                    }
                }
                org.apache.commons.imaging.formats.tiff.TiffField tiffField = (org.apache.commons.imaging.formats.tiff.TiffField) obj;
                if (tiffField != null) {
                    return tiffField.getStringValue();
                }
            }
            return null;
        } catch (java.lang.Exception unused) {
            java.lang.String str = tag.f7039name;
            int i = tag.length;
            int i2 = tag.tag;
            return null;
        }
    }

    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii getEXIF_TAG_OFFSET_TIME_ORIGINAl() {
        return EXIF_TAG_OFFSET_TIME_ORIGINAl;
    }

    private ExifUtil() {
    }
}
