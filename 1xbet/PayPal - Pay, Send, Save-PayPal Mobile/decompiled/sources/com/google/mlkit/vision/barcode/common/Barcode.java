package com.google.mlkit.vision.barcode.common;

/* loaded from: classes.dex */
public class Barcode {
    public static final int FORMAT_ALL_FORMATS = 0;
    public static final int FORMAT_AZTEC = 4096;
    public static final int FORMAT_CODABAR = 8;
    public static final int FORMAT_CODE_128 = 1;
    public static final int FORMAT_CODE_39 = 2;
    public static final int FORMAT_CODE_93 = 4;
    public static final int FORMAT_DATA_MATRIX = 16;
    public static final int FORMAT_EAN_13 = 32;
    public static final int FORMAT_EAN_8 = 64;
    public static final int FORMAT_ITF = 128;
    public static final int FORMAT_PDF417 = 2048;
    public static final int FORMAT_QR_CODE = 256;
    public static final int FORMAT_UNKNOWN = -1;
    public static final int FORMAT_UPC_A = 512;
    public static final int FORMAT_UPC_E = 1024;
    public static final int TYPE_CALENDAR_EVENT = 11;
    public static final int TYPE_CONTACT_INFO = 1;
    public static final int TYPE_DRIVER_LICENSE = 12;
    public static final int TYPE_EMAIL = 2;
    public static final int TYPE_GEO = 10;
    public static final int TYPE_ISBN = 3;
    public static final int TYPE_PHONE = 4;
    public static final int TYPE_PRODUCT = 5;
    public static final int TYPE_SMS = 6;
    public static final int TYPE_TEXT = 7;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_URL = 8;
    public static final int TYPE_WIFI = 9;
    private final com.google.mlkit.vision.barcode.common.internal.BarcodeSource zza;
    private final android.graphics.Rect zzb;
    private final android.graphics.Point[] zzc;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface BarcodeFormat {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface BarcodeValueType {
    }

    public Barcode(com.google.mlkit.vision.barcode.common.internal.BarcodeSource barcodeSource) {
        this(barcodeSource, null);
    }

    public com.google.mlkit.vision.barcode.common.Barcode.CalendarEvent getCalendarEvent() {
        return this.zza.getCalendarEvent();
    }

    public com.google.mlkit.vision.barcode.common.Barcode.ContactInfo getContactInfo() {
        return this.zza.getContactInfo();
    }

    public java.lang.String getDisplayValue() {
        return this.zza.getDisplayValue();
    }

    public com.google.mlkit.vision.barcode.common.Barcode.DriverLicense getDriverLicense() {
        return this.zza.getDriverLicense();
    }

    public com.google.mlkit.vision.barcode.common.Barcode.Email getEmail() {
        return this.zza.getEmail();
    }

    public int getFormat() {
        int format = this.zza.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public com.google.mlkit.vision.barcode.common.Barcode.GeoPoint getGeoPoint() {
        return this.zza.getGeoPoint();
    }

    public com.google.mlkit.vision.barcode.common.Barcode.Phone getPhone() {
        return this.zza.getPhone();
    }

    public byte[] getRawBytes() {
        byte[] rawBytes = this.zza.getRawBytes();
        if (rawBytes != null) {
            return java.util.Arrays.copyOf(rawBytes, rawBytes.length);
        }
        return null;
    }

    public java.lang.String getRawValue() {
        return this.zza.getRawValue();
    }

    public com.google.mlkit.vision.barcode.common.Barcode.Sms getSms() {
        return this.zza.getSms();
    }

    public com.google.mlkit.vision.barcode.common.Barcode.UrlBookmark getUrl() {
        return this.zza.getUrl();
    }

    public int getValueType() {
        return this.zza.getValueType();
    }

    public com.google.mlkit.vision.barcode.common.Barcode.WiFi getWifi() {
        return this.zza.getWifi();
    }

    public Barcode(com.google.mlkit.vision.barcode.common.internal.BarcodeSource barcodeSource, android.graphics.Matrix matrix) {
        this.zza = (com.google.mlkit.vision.barcode.common.internal.BarcodeSource) com.google.android.gms.common.internal.Preconditions.checkNotNull(barcodeSource);
        android.graphics.Rect boundingBox = barcodeSource.getBoundingBox();
        if (boundingBox != null && matrix != null) {
            com.google.mlkit.vision.common.internal.CommonConvertUtils.transformRect(boundingBox, matrix);
        }
        this.zzb = boundingBox;
        android.graphics.Point[] cornerPoints = barcodeSource.getCornerPoints();
        if (cornerPoints != null && matrix != null) {
            com.google.mlkit.vision.common.internal.CommonConvertUtils.transformPointArray(cornerPoints, matrix);
        }
        this.zzc = cornerPoints;
    }

    /* loaded from: classes9.dex */
    public static class DriverLicense {
        private final java.lang.String zza;
        private final java.lang.String zzb;
        private final java.lang.String zzc;
        private final java.lang.String zzd;
        private final java.lang.String zze;
        private final java.lang.String zzf;
        private final java.lang.String zzg;
        private final java.lang.String zzh;
        private final java.lang.String zzi;
        private final java.lang.String zzj;
        private final java.lang.String zzk;
        private final java.lang.String zzl;
        private final java.lang.String zzm;
        private final java.lang.String zzn;

        public java.lang.String getMiddleName() {
            return this.zzc;
        }

        public java.lang.String getLicenseNumber() {
            return this.zzj;
        }

        public java.lang.String getLastName() {
            return this.zzd;
        }

        public java.lang.String getIssuingCountry() {
            return this.zzn;
        }

        public java.lang.String getIssueDate() {
            return this.zzk;
        }

        public java.lang.String getGender() {
            return this.zze;
        }

        public java.lang.String getFirstName() {
            return this.zzb;
        }

        public java.lang.String getExpiryDate() {
            return this.zzl;
        }

        public java.lang.String getDocumentType() {
            return this.zza;
        }

        public java.lang.String getBirthDate() {
            return this.zzm;
        }

        public java.lang.String getAddressZip() {
            return this.zzi;
        }

        public java.lang.String getAddressStreet() {
            return this.zzf;
        }

        public java.lang.String getAddressState() {
            return this.zzh;
        }

        public java.lang.String getAddressCity() {
            return this.zzg;
        }

        public DriverLicense(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = str4;
            this.zze = str5;
            this.zzf = str6;
            this.zzg = str7;
            this.zzh = str8;
            this.zzi = str9;
            this.zzj = str10;
            this.zzk = str11;
            this.zzl = str12;
            this.zzm = str13;
            this.zzn = str14;
        }
    }

    /* loaded from: classes9.dex */
    public static class CalendarDateTime {
        private final int zza;
        private final int zzb;
        private final int zzc;
        private final int zzd;
        private final int zze;
        private final int zzf;
        private final boolean zzg;
        private final java.lang.String zzh;

        public boolean isUtc() {
            return this.zzg;
        }

        public int getYear() {
            return this.zza;
        }

        public int getSeconds() {
            return this.zzf;
        }

        public java.lang.String getRawValue() {
            return this.zzh;
        }

        public int getMonth() {
            return this.zzb;
        }

        public int getMinutes() {
            return this.zze;
        }

        public int getHours() {
            return this.zzd;
        }

        public int getDay() {
            return this.zzc;
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, java.lang.String str) {
            this.zza = i;
            this.zzb = i2;
            this.zzc = i3;
            this.zzd = i4;
            this.zze = i5;
            this.zzf = i6;
            this.zzg = z;
            this.zzh = str;
        }
    }

    /* loaded from: classes9.dex */
    public static class CalendarEvent {
        private final java.lang.String zza;
        private final java.lang.String zzb;
        private final java.lang.String zzc;
        private final java.lang.String zzd;
        private final java.lang.String zze;
        private final com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime zzf;
        private final com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime zzg;

        public java.lang.String getSummary() {
            return this.zza;
        }

        public java.lang.String getStatus() {
            return this.zze;
        }

        public com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime getStart() {
            return this.zzf;
        }

        public java.lang.String getOrganizer() {
            return this.zzd;
        }

        public java.lang.String getLocation() {
            return this.zzc;
        }

        public com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime getEnd() {
            return this.zzg;
        }

        public java.lang.String getDescription() {
            return this.zzb;
        }

        public CalendarEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime calendarDateTime, com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime calendarDateTime2) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = str4;
            this.zze = str5;
            this.zzf = calendarDateTime;
            this.zzg = calendarDateTime2;
        }
    }

    /* loaded from: classes9.dex */
    public static class ContactInfo {
        private final com.google.mlkit.vision.barcode.common.Barcode.PersonName zza;
        private final java.lang.String zzb;
        private final java.lang.String zzc;
        private final java.util.List zzd;
        private final java.util.List zze;
        private final java.util.List zzf;
        private final java.util.List zzg;

        public java.util.List<java.lang.String> getUrls() {
            return this.zzf;
        }

        public java.lang.String getTitle() {
            return this.zzc;
        }

        public java.util.List<com.google.mlkit.vision.barcode.common.Barcode.Phone> getPhones() {
            return this.zzd;
        }

        public java.lang.String getOrganization() {
            return this.zzb;
        }

        public com.google.mlkit.vision.barcode.common.Barcode.PersonName getName() {
            return this.zza;
        }

        public java.util.List<com.google.mlkit.vision.barcode.common.Barcode.Email> getEmails() {
            return this.zze;
        }

        public java.util.List<com.google.mlkit.vision.barcode.common.Barcode.Address> getAddresses() {
            return this.zzg;
        }

        public ContactInfo(com.google.mlkit.vision.barcode.common.Barcode.PersonName personName, java.lang.String str, java.lang.String str2, java.util.List<com.google.mlkit.vision.barcode.common.Barcode.Phone> list, java.util.List<com.google.mlkit.vision.barcode.common.Barcode.Email> list2, java.util.List<java.lang.String> list3, java.util.List<com.google.mlkit.vision.barcode.common.Barcode.Address> list4) {
            this.zza = personName;
            this.zzb = str;
            this.zzc = str2;
            this.zzd = list;
            this.zze = list2;
            this.zzf = list3;
            this.zzg = list4;
        }
    }

    /* loaded from: classes9.dex */
    public static class PersonName {
        private final java.lang.String zza;
        private final java.lang.String zzb;
        private final java.lang.String zzc;
        private final java.lang.String zzd;
        private final java.lang.String zze;
        private final java.lang.String zzf;
        private final java.lang.String zzg;

        public java.lang.String getSuffix() {
            return this.zzg;
        }

        public java.lang.String getPronunciation() {
            return this.zzb;
        }

        public java.lang.String getPrefix() {
            return this.zzc;
        }

        public java.lang.String getMiddle() {
            return this.zze;
        }

        public java.lang.String getLast() {
            return this.zzf;
        }

        public java.lang.String getFormattedName() {
            return this.zza;
        }

        public java.lang.String getFirst() {
            return this.zzd;
        }

        public PersonName(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = str4;
            this.zze = str5;
            this.zzf = str6;
            this.zzg = str7;
        }
    }

    /* loaded from: classes9.dex */
    public static class Email {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        private final int zza;
        private final java.lang.String zzb;
        private final java.lang.String zzc;
        private final java.lang.String zzd;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
        /* loaded from: classes3.dex */
        public @interface FormatType {
        }

        public int getType() {
            return this.zza;
        }

        public java.lang.String getSubject() {
            return this.zzc;
        }

        public java.lang.String getBody() {
            return this.zzd;
        }

        public java.lang.String getAddress() {
            return this.zzb;
        }

        public Email(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.zza = i;
            this.zzb = str;
            this.zzc = str2;
            this.zzd = str3;
        }
    }

    /* loaded from: classes9.dex */
    public static class WiFi {
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_WEP = 3;
        public static final int TYPE_WPA = 2;
        private final java.lang.String zza;
        private final java.lang.String zzb;
        private final int zzc;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
        /* loaded from: classes3.dex */
        public @interface EncryptionType {
        }

        public java.lang.String getSsid() {
            return this.zza;
        }

        public java.lang.String getPassword() {
            return this.zzb;
        }

        public int getEncryptionType() {
            return this.zzc;
        }

        public WiFi(java.lang.String str, java.lang.String str2, int i) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = i;
        }
    }

    /* loaded from: classes9.dex */
    public static class Address {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        private final int zza;
        private final java.lang.String[] zzb;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
        /* loaded from: classes3.dex */
        public @interface AddressType {
        }

        public int getType() {
            return this.zza;
        }

        public java.lang.String[] getAddressLines() {
            return this.zzb;
        }

        public Address(int i, java.lang.String[] strArr) {
            this.zza = i;
            this.zzb = strArr;
        }
    }

    /* loaded from: classes9.dex */
    public static class GeoPoint {
        private final double zza;
        private final double zzb;

        public double getLng() {
            return this.zzb;
        }

        public double getLat() {
            return this.zza;
        }

        public GeoPoint(double d, double d2) {
            this.zza = d;
            this.zzb = d2;
        }
    }

    /* loaded from: classes9.dex */
    public static class Phone {
        public static final int TYPE_FAX = 3;
        public static final int TYPE_HOME = 2;
        public static final int TYPE_MOBILE = 4;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        private final java.lang.String zza;
        private final int zzb;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
        /* loaded from: classes3.dex */
        public @interface FormatType {
        }

        public int getType() {
            return this.zzb;
        }

        public java.lang.String getNumber() {
            return this.zza;
        }

        public Phone(java.lang.String str, int i) {
            this.zza = str;
            this.zzb = i;
        }
    }

    /* loaded from: classes9.dex */
    public static class Sms {
        private final java.lang.String zza;
        private final java.lang.String zzb;

        public java.lang.String getPhoneNumber() {
            return this.zzb;
        }

        public java.lang.String getMessage() {
            return this.zza;
        }

        public Sms(java.lang.String str, java.lang.String str2) {
            this.zza = str;
            this.zzb = str2;
        }
    }

    /* loaded from: classes9.dex */
    public static class UrlBookmark {
        private final java.lang.String zza;
        private final java.lang.String zzb;

        public java.lang.String getUrl() {
            return this.zzb;
        }

        public java.lang.String getTitle() {
            return this.zza;
        }

        public UrlBookmark(java.lang.String str, java.lang.String str2) {
            this.zza = str;
            this.zzb = str2;
        }
    }

    public android.graphics.Point[] getCornerPoints() {
        return this.zzc;
    }

    public android.graphics.Rect getBoundingBox() {
        return this.zzb;
    }
}
