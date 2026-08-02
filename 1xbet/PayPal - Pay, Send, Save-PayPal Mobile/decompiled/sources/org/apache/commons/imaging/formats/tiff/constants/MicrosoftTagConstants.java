package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class MicrosoftTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_MICROSOFT_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort EXIF_TAG_RATING;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort EXIF_TAG_RATING_PERCENT;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString EXIF_TAG_XPAUTHOR;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString EXIF_TAG_XPCOMMENT;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString EXIF_TAG_XPKEYWORDS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString EXIF_TAG_XPSUBJECT;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString EXIF_TAG_XPTITLE;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("Rating", 18246, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_IFD0);
        EXIF_TAG_RATING = tagInfoShort;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("RatingPercent", 18249, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_IFD0);
        EXIF_TAG_RATING_PERCENT = tagInfoShort2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString("XPTitle", 40091, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_IFD0);
        EXIF_TAG_XPTITLE = tagInfoXpString;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString("XPComment", 40092, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_IFD0);
        EXIF_TAG_XPCOMMENT = tagInfoXpString2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString3 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString("XPAuthor", 40093, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_IFD0);
        EXIF_TAG_XPAUTHOR = tagInfoXpString3;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString("XPKeywords", 40094, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_IFD0);
        EXIF_TAG_XPKEYWORDS = tagInfoXpString4;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString("XPSubject", 40095, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_IFD0);
        EXIF_TAG_XPSUBJECT = tagInfoXpString5;
        ALL_MICROSOFT_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoShort, tagInfoShort2, tagInfoXpString, tagInfoXpString2, tagInfoXpString3, tagInfoXpString4, tagInfoXpString5));
    }

    private MicrosoftTagConstants() {
    }
}
