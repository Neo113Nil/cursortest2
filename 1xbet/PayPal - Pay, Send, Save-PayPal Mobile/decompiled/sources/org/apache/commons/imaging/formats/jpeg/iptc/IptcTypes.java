package org.apache.commons.imaging.formats.jpeg.iptc;

/* loaded from: classes17.dex */
public enum IptcTypes implements org.apache.commons.imaging.formats.jpeg.iptc.IptcType {
    RECORD_VERSION(0, "Record Version"),
    OBJECT_TYPE_REFERENCE(3, "Object Type Reference"),
    OBJECT_ATTRIBUTE_REFERENCE(4, "Object Attribute Reference"),
    OBJECT_NAME(5, "Object Name"),
    EDIT_STATUS(7, "Edit Status"),
    EDITORIAL_UPDATE(8, "Editorial Update"),
    URGENCY(10, "Urgency"),
    SUBJECT_REFERENCE(12, "Subject Reference"),
    CATEGORY(15, "Category"),
    SUPPLEMENTAL_CATEGORY(20, "Supplemental Category"),
    FIXTURE_IDENTIFIER(22, "Fixture Identifier"),
    KEYWORDS(25, "Keywords"),
    CONTENT_LOCATION_CODE(26, "Content Location Code"),
    CONTENT_LOCATION_NAME(27, "Content Location Name"),
    RELEASE_DATE(30, "Release Date"),
    RELEASE_TIME(35, "Release Time"),
    EXPIRATION_DATE(37, "Expiration Date"),
    EXPIRATION_TIME(38, "Expiration Time"),
    SPECIAL_INSTRUCTIONS(40, "Special Instructions"),
    ACTION_ADVISED(42, "Action Advised"),
    REFERENCE_SERVICE(45, "Reference Service"),
    REFERENCE_DATE(47, "Reference Date"),
    REFERENCE_NUMBER(50, "Reference Number"),
    DATE_CREATED(55, "Date Created"),
    TIME_CREATED(60, "Time Created"),
    DIGITAL_CREATION_DATE(62, "Digital Creation Date"),
    DIGITAL_CREATION_TIME(63, "Digital Creation Time"),
    ORIGINATING_PROGRAM(65, "Originating Program"),
    PROGRAM_VERSION(70, "Program Version"),
    OBJECT_CYCLE(75, "Object Cycle"),
    BYLINE(80, "By-line"),
    BYLINE_TITLE(85, "By-line Title"),
    CITY(90, "City"),
    SUBLOCATION(92, "Sublocation"),
    PROVINCE_STATE(95, "Province/State"),
    COUNTRY_PRIMARY_LOCATION_CODE(100, "Country/Primary Location Code"),
    COUNTRY_PRIMARY_LOCATION_NAME(101, "Country/Primary Location Name"),
    ORIGINAL_TRANSMISSION_REFERENCE(103, "Original Transmission, Reference"),
    HEADLINE(105, "Headline"),
    CREDIT(110, "Credit"),
    SOURCE(115, "Source"),
    COPYRIGHT_NOTICE(116, "Copyright Notice"),
    CONTACT(118, "Contact"),
    CAPTION_ABSTRACT(120, "Caption/Abstract"),
    WRITER_EDITOR(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, "Writer/Editor"),
    RASTERIZED_CAPTION(125, "Rasterized Caption"),
    IMAGE_TYPE(130, "ImageType"),
    IMAGE_ORIENTATION(131, "Image Orientation"),
    LANGUAGE_IDENTIFIER(135, "Language Identifier"),
    AUDIO_TYPE(150, "Audio Type"),
    AUDIO_SAMPLING_RATE(151, "Audio Sampling Rate"),
    AUDIO_SAMPLING_RESOLUTION(152, "Audio Sampling Resolution"),
    AUDIO_DURATION(153, "Audio Duration"),
    AUDIO_OUTCUE(154, "Audio Outcue"),
    OBJECT_DATA_PREVIEW_FILE_FORMAT(200, "Object Data Preview, File Format"),
    OBJECT_DATA_PREVIEW_FILE_FORMAT_VERSION(201, "Object Data Preview, File Format Version"),
    OBJECT_DATA_PREVIEW_DATA(202, "Object Data Preview Data");


    /* renamed from: name, reason: collision with root package name */
    public final java.lang.String f7036name;
    public final int type;

    IptcTypes(int i, java.lang.String str) {
        this.type = i;
        this.f7036name = str;
    }

    @Override // org.apache.commons.imaging.formats.jpeg.iptc.IptcType
    public final java.lang.String getName() {
        return this.f7036name;
    }

    @Override // org.apache.commons.imaging.formats.jpeg.iptc.IptcType
    public final int getType() {
        return this.type;
    }

    @Override // java.lang.Enum, org.apache.commons.imaging.formats.jpeg.iptc.IptcType
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f7036name);
        sb.append(" (");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }

    public static org.apache.commons.imaging.formats.jpeg.iptc.IptcType getUnknown(final int i) {
        return new org.apache.commons.imaging.formats.jpeg.iptc.IptcType() { // from class: org.apache.commons.imaging.formats.jpeg.iptc.IptcTypes.1
            @Override // org.apache.commons.imaging.formats.jpeg.iptc.IptcType
            public final java.lang.String getName() {
                return "Unknown";
            }

            @Override // org.apache.commons.imaging.formats.jpeg.iptc.IptcType
            public final int getType() {
                return i;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.iptc.IptcType
            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown (");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }
        };
    }
}
