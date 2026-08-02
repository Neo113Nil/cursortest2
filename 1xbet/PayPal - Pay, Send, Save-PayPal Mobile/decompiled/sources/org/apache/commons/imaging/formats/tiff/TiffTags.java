package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
final class TiffTags {
    private static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_TAGS;
    private static final java.util.Map<java.lang.Integer, java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo>> ALL_TAG_MAP;
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> TAG_COUNTS;

    private TiffTags() {
    }

    static {
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> makeMergedTagList = makeMergedTagList();
        ALL_TAGS = makeMergedTagList;
        ALL_TAG_MAP = makeTagMap(makeMergedTagList);
        TAG_COUNTS = countTags(makeMergedTagList);
    }

    private static java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> makeMergedTagList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.ALL_ADOBE_PAGEMAKER_6_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants.ALL_ADOBE_PHOTOSHOP_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants.ALL_ALIAS_SKETCHBOOK_PRO_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.ALL_DCF_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.ALL_DNG_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.ALL_EXIF_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants.ALL_GEO_TIFF_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants.ALL_GDAL_LIBRARY_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.ALL_GPS_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants.ALL_HYLAFAX_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants.ALL_MICROSOFT_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.ALL_MICROSOFT_HD_PHOTO_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants.ALL_MOLECULAR_DYNAMICS_GEL_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants.ALL_OCE_SCANJOB_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.ALL_RFC_2301_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants.ALL_TIFF_4_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.ALL_TIFF_EP_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ALL_TIFF_TAGS);
        arrayList.addAll(org.apache.commons.imaging.formats.tiff.constants.WangTagConstants.ALL_WANG_TAGS);
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private static java.util.Map<java.lang.Integer, java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo>> makeTagMap(java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo : list) {
            java.util.List list2 = (java.util.List) hashMap.get(java.lang.Integer.valueOf(tagInfo.tag));
            if (list2 == null) {
                list2 = new java.util.ArrayList();
                hashMap.put(java.lang.Integer.valueOf(tagInfo.tag), list2);
            }
            list2.add(tagInfo);
        }
        return hashMap;
    }

    private static java.util.Map<java.lang.Integer, java.lang.Integer> countTags(java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo : list) {
            java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(tagInfo.tag));
            if (num == null) {
                hashMap.put(java.lang.Integer.valueOf(tagInfo.tag), 1);
            } else {
                hashMap.put(java.lang.Integer.valueOf(tagInfo.tag), java.lang.Integer.valueOf(num.intValue() + 1));
            }
        }
        return hashMap;
    }

    static java.lang.Integer getTagCount(int i) {
        return TAG_COUNTS.get(java.lang.Integer.valueOf(i));
    }

    static org.apache.commons.imaging.formats.tiff.taginfos.TagInfo getTag(int i, int i2) {
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> list = ALL_TAG_MAP.get(java.lang.Integer.valueOf(i2));
        if (list == null) {
            return org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_UNKNOWN;
        }
        return getTag(i, list);
    }

    private static org.apache.commons.imaging.formats.tiff.taginfos.TagInfo getTag(int i, java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> list) {
        if (list.isEmpty()) {
            return null;
        }
        for (org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo : list) {
            if (tagInfo.directoryType != org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN && i == tagInfo.directoryType.directoryType) {
                return tagInfo;
            }
        }
        for (org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo2 : list) {
            if (tagInfo2.directoryType != org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN && ((i >= 0 && tagInfo2.directoryType.isImageDirectory()) || (i < 0 && !tagInfo2.directoryType.isImageDirectory()))) {
                return tagInfo2;
            }
        }
        for (org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo3 : list) {
            if (tagInfo3.directoryType == org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
                return tagInfo3;
            }
        }
        return org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_UNKNOWN;
    }
}
