package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class Exif {
    private static final java.lang.String Camera2StreamConfigurationMap = "Exif";
    public static final long INVALID_TIMESTAMP = -1;
    public static final java.lang.String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    private final androidx.exifinterface.media.ExifInterface getHighSpeedVideoSizesFor;
    private boolean getInputFormats = false;
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> getHighSpeedVideoSizes = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.1
        @Override // java.lang.ThreadLocal
        public /* synthetic */ java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy:MM:dd", java.util.Locale.US);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> getOutputFormats = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.2
        @Override // java.lang.ThreadLocal
        public /* synthetic */ java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.US);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> getHighResolutionOutputSizeshNQ4ISI = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.3
        @Override // java.lang.ThreadLocal
        public /* synthetic */ java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat(com.miteksystems.misnap.core.DateUtil.ISO_DATE_FORMAT, java.util.Locale.US);
        }
    };
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = getAllExifTags();
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = java.util.Arrays.asList(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_PIXEL_X_DIMENSION, androidx.exifinterface.media.ExifInterface.TAG_PIXEL_Y_DIMENSION, androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, "ThumbnailOrientation");

    private Exif(androidx.exifinterface.media.ExifInterface exifInterface) {
        this.getHighSpeedVideoSizesFor = exifInterface;
    }

    public static androidx.camera.core.impl.utils.Exif createFromFile(java.io.File file) throws java.io.IOException {
        return createFromFileString(file.toString());
    }

    public static androidx.camera.core.impl.utils.Exif createFromImageProxy(androidx.camera.core.ImageProxy imageProxy) throws java.io.IOException {
        java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.get(bArr);
        return createFromInputStream(new java.io.ByteArrayInputStream(bArr));
    }

    public static androidx.camera.core.impl.utils.Exif createFromFileString(java.lang.String str) throws java.io.IOException {
        return new androidx.camera.core.impl.utils.Exif(new androidx.exifinterface.media.ExifInterface(str));
    }

    public static androidx.camera.core.impl.utils.Exif createFromInputStream(java.io.InputStream inputStream) throws java.io.IOException {
        return new androidx.camera.core.impl.utils.Exif(new androidx.exifinterface.media.ExifInterface(inputStream));
    }

    public final void save() throws java.io.IOException {
        if (!this.getInputFormats) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.ThreadLocal<java.text.SimpleDateFormat> threadLocal = getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String format = threadLocal.get().format(new java.util.Date(currentTimeMillis));
            this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, format);
            try {
                this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, java.lang.Long.toString(currentTimeMillis - threadLocal.get().parse(format).getTime()));
            } catch (java.text.ParseException unused) {
            }
        }
        this.getHighSpeedVideoSizesFor.saveAttributes();
    }

    public final void copyToCroppedImage(androidx.camera.core.impl.utils.Exif exif) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(getHighSpeedVideoFpsRangesFor);
        arrayList.removeAll(getHighSpeedVideoFpsRanges);
        for (java.lang.String str : arrayList) {
            java.lang.String attribute = this.getHighSpeedVideoSizesFor.getAttribute(str);
            java.lang.String attribute2 = exif.getHighSpeedVideoSizesFor.getAttribute(str);
            if (attribute != null && !java.util.Objects.equals(attribute, attribute2)) {
                exif.getHighSpeedVideoSizesFor.setAttribute(str, attribute);
            }
        }
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ENGLISH;
        int width = getWidth();
        int height = getHeight();
        int rotation = getRotation();
        boolean isFlippedVertically = isFlippedVertically();
        boolean isFlippedHorizontally = isFlippedHorizontally();
        android.location.Location location = getLocation();
        long timestamp = getTimestamp();
        return java.lang.String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(rotation), java.lang.Boolean.valueOf(isFlippedVertically), java.lang.Boolean.valueOf(isFlippedHorizontally), location, java.lang.Long.valueOf(timestamp), getDescription());
    }

    public final int getOrientation() {
        return this.getHighSpeedVideoSizesFor.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
    }

    public final void setOrientation(int i) {
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i));
    }

    public final int getWidth() {
        return this.getHighSpeedVideoSizesFor.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, 0);
    }

    public final int getHeight() {
        return this.getHighSpeedVideoSizesFor.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, 0);
    }

    public final java.lang.String getDescription() {
        return this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION);
    }

    public final void setDescription(java.lang.String str) {
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION, str);
    }

    public final int getRotation() {
        switch (getOrientation()) {
        }
        return 270;
    }

    public final boolean isFlippedVertically() {
        int orientation = getOrientation();
        return orientation == 4 || orientation == 5 || orientation == 7;
    }

    public final boolean isFlippedHorizontally() {
        return getOrientation() == 2;
    }

    public final long getLastModifiedTimestamp() {
        long highSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME));
        if (highSpeedVideoSizes == -1) {
            return -1L;
        }
        java.lang.String attribute = this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME);
        if (attribute == null) {
            return highSpeedVideoSizes;
        }
        try {
            long parseLong = java.lang.Long.parseLong(attribute);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return highSpeedVideoSizes + parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return highSpeedVideoSizes;
        }
    }

    public final long getTimestamp() {
        long highSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL));
        if (highSpeedVideoSizes == -1) {
            return -1L;
        }
        java.lang.String attribute = this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL);
        if (attribute == null) {
            return highSpeedVideoSizes;
        }
        try {
            long parseLong = java.lang.Long.parseLong(attribute);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return highSpeedVideoSizes + parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return highSpeedVideoSizes;
        }
    }

    public final android.location.Location getLocation() {
        double d;
        java.lang.String attribute = this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD);
        double[] latLong = this.getHighSpeedVideoSizesFor.getLatLong();
        double altitude = this.getHighSpeedVideoSizesFor.getAltitude(0.0d);
        double attributeDouble = this.getHighSpeedVideoSizesFor.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED, 0.0d);
        java.lang.String attribute2 = this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF);
        if (attribute2 == null) {
            attribute2 = "K";
        }
        long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP), this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP));
        if (latLong == null) {
            return null;
        }
        if (attribute == null) {
            attribute = Camera2StreamConfigurationMap;
        }
        android.location.Location location = new android.location.Location(attribute);
        location.setLatitude(latLong[0]);
        location.setLongitude(latLong[1]);
        if (altitude != 0.0d) {
            location.setAltitude(altitude);
        }
        if (attributeDouble != 0.0d) {
            int hashCode = attribute2.hashCode();
            if (hashCode == 75) {
                attribute2.equals("K");
            } else if (hashCode != 77) {
                if (hashCode == 78 && attribute2.equals("N")) {
                    d = androidx.camera.core.impl.utils.Exif.Speed.getHighResolutionOutputSizeshNQ4ISI(attributeDouble).getHighSpeedVideoFpsRanges;
                    location.setSpeed((float) (d / 2.23694d));
                }
            } else if (attribute2.equals("M")) {
                d = androidx.camera.core.impl.utils.Exif.Speed.Camera2StreamConfigurationMap(attributeDouble).getHighSpeedVideoFpsRanges;
                location.setSpeed((float) (d / 2.23694d));
            }
            d = androidx.camera.core.impl.utils.Exif.Speed.getHighSpeedVideoFpsRanges(attributeDouble).getHighSpeedVideoFpsRanges;
            location.setSpeed((float) (d / 2.23694d));
        }
        if (highSpeedVideoFpsRanges != -1) {
            location.setTime(highSpeedVideoFpsRanges);
        }
        return location;
    }

    public final void rotate(int i) {
        if (i % 90 != 0) {
            androidx.camera.core.Logger.w(Camera2StreamConfigurationMap, java.lang.String.format(java.util.Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", java.lang.Integer.valueOf(i)));
            this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, "0");
            return;
        }
        int i2 = i % 360;
        int orientation = getOrientation();
        while (i2 < 0) {
            i2 += 90;
            switch (orientation) {
                case 2:
                    orientation = 5;
                    break;
                case 3:
                case 8:
                    orientation = 6;
                    break;
                case 4:
                    orientation = 7;
                    break;
                case 5:
                    orientation = 4;
                    break;
                case 6:
                    orientation = 1;
                    break;
                case 7:
                    orientation = 2;
                    break;
                default:
                    orientation = 8;
                    break;
            }
        }
        while (i2 > 0) {
            i2 -= 90;
            switch (orientation) {
                case 2:
                    orientation = 7;
                    break;
                case 3:
                    orientation = 8;
                    break;
                case 4:
                    orientation = 5;
                    break;
                case 5:
                    orientation = 2;
                    break;
                case 6:
                    orientation = 3;
                    break;
                case 7:
                    orientation = 4;
                    break;
                case 8:
                    orientation = 1;
                    break;
                default:
                    orientation = 6;
                    break;
            }
        }
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(orientation));
    }

    public final void flipVertically() {
        int i;
        switch (getOrientation()) {
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 4;
                break;
        }
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i));
    }

    public final void flipHorizontally() {
        int i;
        switch (getOrientation()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 2;
                break;
        }
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i));
    }

    public final java.lang.String getMetadata() {
        return this.getHighSpeedVideoSizesFor.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_XMP);
    }

    public final androidx.exifinterface.media.ExifInterface getExifInterface() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final void attachTimestamp() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.ThreadLocal<java.text.SimpleDateFormat> threadLocal = getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String format = threadLocal.get().format(new java.util.Date(currentTimeMillis));
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, format);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, format);
        try {
            java.lang.String l = java.lang.Long.toString(currentTimeMillis - threadLocal.get().parse(format).getTime());
            this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, l);
            this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, l);
        } catch (java.text.ParseException unused) {
        }
        this.getInputFormats = false;
    }

    public final void removeTimestamp() {
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, null);
        this.getInputFormats = true;
    }

    public final void attachLocation(android.location.Location location) {
        this.getHighSpeedVideoSizesFor.setGpsInfo(location);
    }

    public final void removeLocation() {
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP, null);
        this.getHighSpeedVideoSizesFor.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, null);
    }

    static final class Speed {
        private Speed() {
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter getHighSpeedVideoFpsRanges(double d) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(d * 0.621371d);
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter Camera2StreamConfigurationMap(double d) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(d);
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter getHighResolutionOutputSizeshNQ4ISI(double d) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(d * 1.15078d);
        }

        static final class Converter {
            final double getHighSpeedVideoFpsRanges;

            Converter(double d) {
                this.getHighSpeedVideoFpsRanges = d;
            }
        }
    }

    public static java.util.List<java.lang.String> getAllExifTags() {
        return java.util.Arrays.asList(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_BITS_PER_SAMPLE, androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, androidx.exifinterface.media.ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION, androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, androidx.exifinterface.media.ExifInterface.TAG_SAMPLES_PER_PIXEL, androidx.exifinterface.media.ExifInterface.TAG_PLANAR_CONFIGURATION, androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING, androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_POSITIONING, androidx.exifinterface.media.ExifInterface.TAG_X_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_Y_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_RESOLUTION_UNIT, androidx.exifinterface.media.ExifInterface.TAG_STRIP_OFFSETS, androidx.exifinterface.media.ExifInterface.TAG_ROWS_PER_STRIP, androidx.exifinterface.media.ExifInterface.TAG_STRIP_BYTE_COUNTS, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_TRANSFER_FUNCTION, androidx.exifinterface.media.ExifInterface.TAG_WHITE_POINT, androidx.exifinterface.media.ExifInterface.TAG_PRIMARY_CHROMATICITIES, androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_COEFFICIENTS, androidx.exifinterface.media.ExifInterface.TAG_REFERENCE_BLACK_WHITE, androidx.exifinterface.media.ExifInterface.TAG_DATETIME, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION, androidx.exifinterface.media.ExifInterface.TAG_MAKE, androidx.exifinterface.media.ExifInterface.TAG_MODEL, androidx.exifinterface.media.ExifInterface.TAG_SOFTWARE, androidx.exifinterface.media.ExifInterface.TAG_ARTIST, androidx.exifinterface.media.ExifInterface.TAG_COPYRIGHT, androidx.exifinterface.media.ExifInterface.TAG_EXIF_VERSION, androidx.exifinterface.media.ExifInterface.TAG_FLASHPIX_VERSION, androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, androidx.exifinterface.media.ExifInterface.TAG_GAMMA, androidx.exifinterface.media.ExifInterface.TAG_PIXEL_X_DIMENSION, androidx.exifinterface.media.ExifInterface.TAG_PIXEL_Y_DIMENSION, androidx.exifinterface.media.ExifInterface.TAG_COMPONENTS_CONFIGURATION, androidx.exifinterface.media.ExifInterface.TAG_COMPRESSED_BITS_PER_PIXEL, androidx.exifinterface.media.ExifInterface.TAG_MAKER_NOTE, androidx.exifinterface.media.ExifInterface.TAG_USER_COMMENT, androidx.exifinterface.media.ExifInterface.TAG_RELATED_SOUND_FILE, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_OFFSET_TIME, androidx.exifinterface.media.ExifInterface.TAG_OFFSET_TIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_OFFSET_TIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_PROGRAM, androidx.exifinterface.media.ExifInterface.TAG_SPECTRAL_SENSITIVITY, androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, androidx.exifinterface.media.ExifInterface.TAG_OECF, androidx.exifinterface.media.ExifInterface.TAG_SENSITIVITY_TYPE, androidx.exifinterface.media.ExifInterface.TAG_STANDARD_OUTPUT_SENSITIVITY, androidx.exifinterface.media.ExifInterface.TAG_RECOMMENDED_EXPOSURE_INDEX, androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED, androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_LATITUDE_YYY, androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_LATITUDE_ZZZ, androidx.exifinterface.media.ExifInterface.TAG_SHUTTER_SPEED_VALUE, androidx.exifinterface.media.ExifInterface.TAG_APERTURE_VALUE, androidx.exifinterface.media.ExifInterface.TAG_BRIGHTNESS_VALUE, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_BIAS_VALUE, androidx.exifinterface.media.ExifInterface.TAG_MAX_APERTURE_VALUE, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_DISTANCE, androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, androidx.exifinterface.media.ExifInterface.TAG_FLASH, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_AREA, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_FLASH_ENERGY, androidx.exifinterface.media.ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_LOCATION, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_INDEX, androidx.exifinterface.media.ExifInterface.TAG_SENSING_METHOD, androidx.exifinterface.media.ExifInterface.TAG_FILE_SOURCE, androidx.exifinterface.media.ExifInterface.TAG_SCENE_TYPE, androidx.exifinterface.media.ExifInterface.TAG_CFA_PATTERN, androidx.exifinterface.media.ExifInterface.TAG_CUSTOM_RENDERED, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_MODE, androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE, androidx.exifinterface.media.ExifInterface.TAG_DIGITAL_ZOOM_RATIO, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM, androidx.exifinterface.media.ExifInterface.TAG_SCENE_CAPTURE_TYPE, androidx.exifinterface.media.ExifInterface.TAG_GAIN_CONTROL, androidx.exifinterface.media.ExifInterface.TAG_CONTRAST, androidx.exifinterface.media.ExifInterface.TAG_SATURATION, androidx.exifinterface.media.ExifInterface.TAG_SHARPNESS, androidx.exifinterface.media.ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_DISTANCE_RANGE, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_UNIQUE_ID, "CameraOwnerName", androidx.exifinterface.media.ExifInterface.TAG_BODY_SERIAL_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_LENS_SPECIFICATION, androidx.exifinterface.media.ExifInterface.TAG_LENS_MAKE, androidx.exifinterface.media.ExifInterface.TAG_LENS_MODEL, androidx.exifinterface.media.ExifInterface.TAG_LENS_SERIAL_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_GPS_VERSION_ID, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, androidx.exifinterface.media.ExifInterface.TAG_GPS_SATELLITES, androidx.exifinterface.media.ExifInterface.TAG_GPS_STATUS, androidx.exifinterface.media.ExifInterface.TAG_GPS_MEASURE_MODE, androidx.exifinterface.media.ExifInterface.TAG_GPS_DOP, androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED, androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK, androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION, androidx.exifinterface.media.ExifInterface.TAG_GPS_MAP_DATUM, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LATITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LATITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE, androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD, androidx.exifinterface.media.ExifInterface.TAG_GPS_AREA_INFORMATION, androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP, androidx.exifinterface.media.ExifInterface.TAG_GPS_DIFFERENTIAL, androidx.exifinterface.media.ExifInterface.TAG_GPS_H_POSITIONING_ERROR, androidx.exifinterface.media.ExifInterface.TAG_INTEROPERABILITY_INDEX, androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, "ThumbnailOrientation", androidx.exifinterface.media.ExifInterface.TAG_DNG_VERSION, androidx.exifinterface.media.ExifInterface.TAG_DEFAULT_CROP_SIZE, androidx.exifinterface.media.ExifInterface.TAG_ORF_THUMBNAIL_IMAGE, androidx.exifinterface.media.ExifInterface.TAG_ORF_PREVIEW_IMAGE_START, androidx.exifinterface.media.ExifInterface.TAG_ORF_PREVIEW_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_ORF_ASPECT_FRAME, androidx.exifinterface.media.ExifInterface.TAG_RW2_SENSOR_BOTTOM_BORDER, androidx.exifinterface.media.ExifInterface.TAG_RW2_SENSOR_LEFT_BORDER, androidx.exifinterface.media.ExifInterface.TAG_RW2_SENSOR_RIGHT_BORDER, androidx.exifinterface.media.ExifInterface.TAG_RW2_SENSOR_TOP_BORDER, androidx.exifinterface.media.ExifInterface.TAG_RW2_ISO, androidx.exifinterface.media.ExifInterface.TAG_RW2_JPG_FROM_RAW, androidx.exifinterface.media.ExifInterface.TAG_XMP, androidx.exifinterface.media.ExifInterface.TAG_NEW_SUBFILE_TYPE, androidx.exifinterface.media.ExifInterface.TAG_SUBFILE_TYPE);
    }

    private static long getHighSpeedVideoSizes(java.lang.String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return getHighResolutionOutputSizeshNQ4ISI.get().parse(str).getTime();
        } catch (java.text.ParseException unused) {
            return -1L;
        }
    }

    private static long getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return getHighSpeedVideoSizes.get().parse(str).getTime();
            } catch (java.text.ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return getOutputFormats.get().parse(str2).getTime();
            } catch (java.text.ParseException unused2) {
                return -1L;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return getHighSpeedVideoSizes(sb.toString());
    }
}
