package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public class ExifData {
    static final androidx.camera.core.impl.utils.ExifTag[][] Camera2StreamConfigurationMap;
    static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final androidx.camera.core.impl.utils.ExifTag[] getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    static final java.util.HashSet<java.lang.String> getHighSpeedVideoSizes;
    private static final androidx.camera.core.impl.utils.ExifTag[] getHighSpeedVideoSizesFor;
    private static final androidx.camera.core.impl.utils.ExifTag[] getInputFormats;
    private static final androidx.camera.core.impl.utils.ExifTag[] getInputSizeshNQ4ISI;
    private static final androidx.camera.core.impl.utils.ExifTag[] getOutputMinFrameDuration;
    private final java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> getOutputFormats;
    private final java.nio.ByteOrder getOutputStallDurationlomOqCM;

    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    static {
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, 256, 3, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, 257, 3, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_MAKE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_MODEL, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_X_RESOLUTION, 282, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_Y_RESOLUTION, 283, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_RESOLUTION_UNIT, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SOFTWARE, 305, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, 306, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_POSITIONING, 531, 3), new androidx.camera.core.impl.utils.ExifTag("SubIFDPointer", com.visa.cbp.getCertUsage.setAucAID, 4), new androidx.camera.core.impl.utils.ExifTag("ExifIFDPointer", 34665, 4), new androidx.camera.core.impl.utils.ExifTag("GPSInfoIFDPointer", 34853, 4)};
        getInputFormats = exifTagArr;
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr2 = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, 33434, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, 33437, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_PROGRAM, 34850, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SENSITIVITY_TYPE, 34864, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXIF_VERSION, 36864, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, 36867, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, 36868, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_COMPONENTS_CONFIGURATION, 37121, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SHUTTER_SPEED_VALUE, 37377, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_APERTURE_VALUE, 37378, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_BRIGHTNESS_VALUE, 37379, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_MAX_APERTURE_VALUE, 37381, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, 37383, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, 37384, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FLASH, 37385, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, 37386, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, 37520, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FLASHPIX_VERSION, 40960, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, 40961, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new androidx.camera.core.impl.utils.ExifTag("InteroperabilityIFDPointer", 40965, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SENSING_METHOD, 41495, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FILE_SOURCE, 41728, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SCENE_TYPE, 41729, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_CUSTOM_RENDERED, 41985, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_MODE, 41986, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE, 41987, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SCENE_CAPTURE_TYPE, 41990, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_CONTRAST, 41992, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SATURATION, 41993, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SHARPNESS, 41994, 3)};
        getHighSpeedVideoSizesFor = exifTagArr2;
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr3 = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_VERSION_ID, 0, 1), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, 1, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, 2, 5, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, 3, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, 4, 5, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, 5, 1), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, 6, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, 7, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, 12, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK_REF, 14, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING_REF, 23, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF, 25, 2)};
        getOutputMinFrameDuration = exifTagArr3;
        getHighSpeedVideoFpsRanges = new androidx.camera.core.impl.utils.ExifTag[]{new androidx.camera.core.impl.utils.ExifTag("SubIFDPointer", com.visa.cbp.getCertUsage.setAucAID, 4), new androidx.camera.core.impl.utils.ExifTag("ExifIFDPointer", 34665, 4), new androidx.camera.core.impl.utils.ExifTag("GPSInfoIFDPointer", 34853, 4), new androidx.camera.core.impl.utils.ExifTag("InteroperabilityIFDPointer", 40965, 4)};
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr4 = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        getInputSizeshNQ4ISI = exifTagArr4;
        Camera2StreamConfigurationMap = new androidx.camera.core.impl.utils.ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4};
        getHighSpeedVideoSizes = new java.util.HashSet<>(java.util.Arrays.asList(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP));
        getHighSpeedVideoFpsRangesFor = new java.lang.String(new byte[]{1, 2, 3, 0}, java.nio.charset.StandardCharsets.UTF_8);
    }

    ExifData(java.nio.ByteOrder byteOrder, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> list) {
        androidx.core.util.Preconditions.checkState(list.size() == Camera2StreamConfigurationMap.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.getOutputStallDurationlomOqCM = byteOrder;
        this.getOutputFormats = list;
    }

    public static androidx.camera.core.impl.utils.ExifData create(androidx.camera.core.ImageProxy imageProxy, int i) {
        androidx.camera.core.impl.utils.ExifData.Builder builderForDevice = builderForDevice();
        if (imageProxy.getImageInfo() != null) {
            imageProxy.getImageInfo().populateExifData(builderForDevice);
        }
        builderForDevice.setOrientationDegrees(i);
        return builderForDevice.setImageWidth(imageProxy.getWidth()).setImageHeight(imageProxy.getHeight()).build();
    }

    public java.nio.ByteOrder getByteOrder() {
        return this.getOutputStallDurationlomOqCM;
    }

    final java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> getHighSpeedVideoFpsRanges(int i) {
        int length = Camera2StreamConfigurationMap.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid IFD index: ");
        sb.append(i);
        sb.append(". Index should be between [0, EXIF_TAGS.length] ");
        androidx.core.util.Preconditions.checkArgumentInRange(i, 0, length, sb.toString());
        return this.getOutputFormats.get(i);
    }

    public static androidx.camera.core.impl.utils.ExifData.Builder builderForDevice() {
        return new androidx.camera.core.impl.utils.ExifData.Builder(java.nio.ByteOrder.BIG_ENDIAN).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, "1").setAttribute(androidx.exifinterface.media.ExifInterface.TAG_X_RESOLUTION, "72/1").setAttribute(androidx.exifinterface.media.ExifInterface.TAG_Y_RESOLUTION, "72/1").setAttribute(androidx.exifinterface.media.ExifInterface.TAG_RESOLUTION_UNIT, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_POSITIONING, "1").setAttribute(androidx.exifinterface.media.ExifInterface.TAG_MAKE, android.os.Build.MANUFACTURER).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_MODEL, android.os.Build.MODEL);
    }

    public static final class Builder {
        final java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> getHighSpeedVideoFpsRangesFor = java.util.Collections.list(new java.util.Enumeration<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.2
            int getHighSpeedVideoSizes = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.getHighSpeedVideoSizes < androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap.length;
            }

            @Override // java.util.Enumeration
            public /* synthetic */ java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> nextElement() {
                this.getHighSpeedVideoSizes++;
                return new java.util.HashMap();
            }
        });
        private final java.nio.ByteOrder getHighSpeedVideoSizesFor;
        private static final java.util.regex.Pattern Camera2StreamConfigurationMap = java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final java.util.regex.Pattern getHighSpeedVideoSizes = java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final java.util.regex.Pattern getHighResolutionOutputSizeshNQ4ISI = java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        static final java.util.List<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag>> getHighSpeedVideoFpsRanges = java.util.Collections.list(new java.util.Enumeration<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.1
            int getHighSpeedVideoFpsRanges = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.getHighSpeedVideoFpsRanges < androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap.length;
            }

            @Override // java.util.Enumeration
            public /* synthetic */ java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag> nextElement() {
                java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag> hashMap = new java.util.HashMap<>();
                for (androidx.camera.core.impl.utils.ExifTag exifTag : androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap[this.getHighSpeedVideoFpsRanges]) {
                    hashMap.put(exifTag.Camera2StreamConfigurationMap, exifTag);
                }
                this.getHighSpeedVideoFpsRanges++;
                return hashMap;
            }
        });

        Builder(java.nio.ByteOrder byteOrder) {
            this.getHighSpeedVideoSizesFor = byteOrder;
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setImageWidth(int i) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, java.lang.String.valueOf(i));
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setImageHeight(int i) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, java.lang.String.valueOf(i));
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setOrientationDegrees(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected orientation value: ");
                sb.append(i);
                sb.append(". Must be one of 0, 90, 180, 270.");
                androidx.camera.core.Logger.w("ExifData", sb.toString());
                i2 = 0;
            } else {
                i2 = 8;
            }
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i2));
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setFlashState(androidx.camera.core.impl.CameraCaptureMetaData.FlashState flashState) {
            int i;
            if (flashState == androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN) {
                return this;
            }
            int i2 = androidx.camera.core.impl.utils.ExifData.AnonymousClass1.getHighSpeedVideoFpsRanges[flashState.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else {
                if (i2 != 3) {
                    androidx.camera.core.Logger.w("ExifData", "Unknown flash state: ".concat(java.lang.String.valueOf(flashState)));
                    return this;
                }
                i = 1;
            }
            if ((i & 1) == 1) {
                setAttribute(androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, "4");
            }
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_FLASH, java.lang.String.valueOf(i));
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setExposureTimeNanos(long j) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, java.lang.String.valueOf(j / java.util.concurrent.TimeUnit.SECONDS.toNanos(1L)));
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setLensFNumber(float f) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, java.lang.String.valueOf(f));
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setIso(int i) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SENSITIVITY_TYPE, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, java.lang.String.valueOf(java.lang.Math.min(65535, i)));
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setFocalLength(float f) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, new androidx.camera.core.impl.utils.LongRational((long) (f * 1000.0f), 1000L).toString());
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setWhiteBalanceMode(androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode whiteBalanceMode) {
            java.lang.String str;
            int ordinal = whiteBalanceMode.ordinal();
            if (ordinal == 0) {
                str = "0";
            } else {
                str = ordinal != 1 ? null : "1";
            }
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE, str);
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder setAttribute(java.lang.String str, java.lang.String str2) {
            Camera2StreamConfigurationMap(str, str2, this.getHighSpeedVideoFpsRangesFor);
            return this;
        }

        public final androidx.camera.core.impl.utils.ExifData.Builder removeAttribute(java.lang.String str) {
            Camera2StreamConfigurationMap(str, null, this.getHighSpeedVideoFpsRangesFor);
            return this;
        }

        private void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> list) {
            java.util.Iterator<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            Camera2StreamConfigurationMap(str, str2, list);
        }

        private void Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> list) {
            int i;
            java.lang.String str3 = str;
            java.lang.String str4 = str2;
            if ((androidx.exifinterface.media.ExifInterface.TAG_DATETIME.equals(str3) || androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL.equals(str3) || androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED.equals(str3)) && str4 != null) {
                boolean find = getHighSpeedVideoSizes.matcher(str4).find();
                boolean find2 = getHighResolutionOutputSizeshNQ4ISI.matcher(str4).find();
                if (str2.length() != 19 || (!find && !find2)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid value for ");
                    sb.append(str3);
                    sb.append(" : ");
                    sb.append(str4);
                    androidx.camera.core.Logger.w("ExifData", sb.toString());
                    return;
                }
                if (find2) {
                    str4 = str4.replaceAll("-", io.ktor.sse.ServerSentEventKt.COLON);
                }
            }
            if (androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str3)) {
                str3 = androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
            }
            java.lang.String str5 = str3;
            int i2 = 2;
            int i3 = 1;
            if (str4 != null && androidx.camera.core.impl.utils.ExifData.getHighSpeedVideoSizes.contains(str5)) {
                if (str5.equals(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP)) {
                    java.util.regex.Matcher matcher = Camera2StreamConfigurationMap.matcher(str4);
                    if (!matcher.find()) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid value for ");
                        sb2.append(str5);
                        sb2.append(" : ");
                        sb2.append(str4);
                        androidx.camera.core.Logger.w("ExifData", sb2.toString());
                        return;
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(java.lang.Integer.parseInt((java.lang.String) androidx.core.util.Preconditions.checkNotNull(matcher.group(1))));
                    sb3.append("/1,");
                    sb3.append(java.lang.Integer.parseInt((java.lang.String) androidx.core.util.Preconditions.checkNotNull(matcher.group(2))));
                    sb3.append("/1,");
                    sb3.append(java.lang.Integer.parseInt((java.lang.String) androidx.core.util.Preconditions.checkNotNull(matcher.group(3))));
                    sb3.append("/1");
                    str4 = sb3.toString();
                } else {
                    try {
                        str4 = new androidx.camera.core.impl.utils.LongRational(java.lang.Double.parseDouble(str4)).toString();
                    } catch (java.lang.NumberFormatException e) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Invalid value for ");
                        sb4.append(str5);
                        sb4.append(" : ");
                        sb4.append(str4);
                        androidx.camera.core.Logger.w("ExifData", sb4.toString(), e);
                        return;
                    }
                }
            }
            int i4 = 0;
            while (i4 < androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap.length) {
                androidx.camera.core.impl.utils.ExifTag exifTag = getHighSpeedVideoFpsRanges.get(i4).get(str5);
                if (exifTag != null) {
                    if (str4 == null) {
                        list.get(i4).remove(str5);
                    } else {
                        android.util.Pair<java.lang.Integer, java.lang.Integer> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str4);
                        int i5 = -1;
                        if (exifTag.getHighSpeedVideoFpsRanges == ((java.lang.Integer) highSpeedVideoFpsRanges.first).intValue() || exifTag.getHighSpeedVideoFpsRanges == ((java.lang.Integer) highSpeedVideoFpsRanges.second).intValue()) {
                            i = exifTag.getHighSpeedVideoFpsRanges;
                        } else if (exifTag.getHighSpeedVideoSizes != -1 && (exifTag.getHighSpeedVideoSizes == ((java.lang.Integer) highSpeedVideoFpsRanges.first).intValue() || exifTag.getHighSpeedVideoSizes == ((java.lang.Integer) highSpeedVideoFpsRanges.second).intValue())) {
                            i = exifTag.getHighSpeedVideoSizes;
                        } else if (exifTag.getHighSpeedVideoFpsRanges == i3 || exifTag.getHighSpeedVideoFpsRanges == 7 || exifTag.getHighSpeedVideoFpsRanges == i2) {
                            i = exifTag.getHighSpeedVideoFpsRanges;
                        }
                        java.lang.String str6 = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
                        switch (i) {
                            case 1:
                                list.get(i4).put(str5, androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoFpsRanges(str4));
                                break;
                            case 2:
                            case 7:
                                list.get(i4).put(str5, androidx.camera.core.impl.utils.ExifAttribute.Camera2StreamConfigurationMap(str4));
                                break;
                            case 3:
                                java.lang.String[] split = str4.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i6 = 0; i6 < split.length; i6++) {
                                    iArr[i6] = java.lang.Integer.parseInt(split[i6]);
                                }
                                list.get(i4).put(str5, androidx.camera.core.impl.utils.ExifAttribute.getHighResolutionOutputSizeshNQ4ISI(iArr, this.getHighSpeedVideoSizesFor));
                                break;
                            case 4:
                                java.lang.String[] split2 = str4.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i7 = 0; i7 < split2.length; i7++) {
                                    jArr[i7] = java.lang.Long.parseLong(split2[i7]);
                                }
                                list.get(i4).put(str5, androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoSizes(jArr, this.getHighSpeedVideoSizesFor));
                                break;
                            case 5:
                                java.lang.String[] split3 = str4.split(",", -1);
                                androidx.camera.core.impl.utils.LongRational[] longRationalArr = new androidx.camera.core.impl.utils.LongRational[split3.length];
                                int i8 = 0;
                                while (i8 < split3.length) {
                                    java.lang.String[] split4 = split3[i8].split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, i5);
                                    longRationalArr[i8] = new androidx.camera.core.impl.utils.LongRational((long) java.lang.Double.parseDouble(split4[0]), (long) java.lang.Double.parseDouble(split4[1]));
                                    i8++;
                                    i5 = -1;
                                }
                                list.get(i4).put(str5, androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoFpsRangesFor(longRationalArr, this.getHighSpeedVideoSizesFor));
                                break;
                            case 9:
                                java.lang.String[] split5 = str4.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i9 = 0; i9 < split5.length; i9++) {
                                    iArr2[i9] = java.lang.Integer.parseInt(split5[i9]);
                                }
                                list.get(i4).put(str5, androidx.camera.core.impl.utils.ExifAttribute.Camera2StreamConfigurationMap(iArr2, this.getHighSpeedVideoSizesFor));
                                break;
                            case 10:
                                java.lang.String[] split6 = str4.split(",", -1);
                                androidx.camera.core.impl.utils.LongRational[] longRationalArr2 = new androidx.camera.core.impl.utils.LongRational[split6.length];
                                int i10 = 0;
                                while (i10 < split6.length) {
                                    java.lang.String[] split7 = split6[i10].split(str6, -1);
                                    longRationalArr2[i10] = new androidx.camera.core.impl.utils.LongRational((long) java.lang.Double.parseDouble(split7[0]), (long) java.lang.Double.parseDouble(split7[i3]));
                                    i10++;
                                    str6 = str6;
                                    i3 = 1;
                                }
                                list.get(i4).put(str5, androidx.camera.core.impl.utils.ExifAttribute.Camera2StreamConfigurationMap(longRationalArr2, this.getHighSpeedVideoSizesFor));
                                break;
                            case 12:
                                java.lang.String[] split8 = str4.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i11 = 0; i11 < split8.length; i11++) {
                                    dArr[i11] = java.lang.Double.parseDouble(split8[i11]);
                                }
                                list.get(i4).put(str5, androidx.camera.core.impl.utils.ExifAttribute.getHighResolutionOutputSizeshNQ4ISI(dArr, this.getHighSpeedVideoSizesFor));
                                break;
                        }
                    }
                }
                i4++;
                i2 = 2;
                i3 = 1;
            }
        }

        public final androidx.camera.core.impl.utils.ExifData build() {
            java.util.ArrayList list = java.util.Collections.list(new java.util.Enumeration<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3
                final java.util.Enumeration<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> getHighSpeedVideoFpsRangesFor;

                {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.enumeration(androidx.camera.core.impl.utils.ExifData.Builder.this.getHighSpeedVideoFpsRangesFor);
                }

                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return this.getHighSpeedVideoFpsRangesFor.hasMoreElements();
                }

                @Override // java.util.Enumeration
                public /* synthetic */ java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> nextElement() {
                    return new java.util.HashMap(this.getHighSpeedVideoFpsRangesFor.nextElement());
                }
            });
            if (!list.get(1).isEmpty()) {
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_PROGRAM, "0", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_EXIF_VERSION, "0230", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_COMPONENTS_CONFIGURATION, androidx.camera.core.impl.utils.ExifData.getHighSpeedVideoFpsRangesFor, list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, "0", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, "0", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_FLASHPIX_VERSION, "0100", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_FILE_SOURCE, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_SCENE_TYPE, "1", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_CUSTOM_RENDERED, "0", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_SCENE_CAPTURE_TYPE, "0", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_CONTRAST, "0", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_SATURATION, "0", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_SHARPNESS, "0", list);
            }
            if (!list.get(2).isEmpty()) {
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_GPS_VERSION_ID, "2300", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, "K", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK_REF, "T", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF, "T", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING_REF, "T", list);
                getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF, "K", list);
            }
            return new androidx.camera.core.impl.utils.ExifData(this.getHighSpeedVideoSizesFor, list);
        }

        private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHighSpeedVideoFpsRanges(java.lang.String str) {
            if (str.contains(",")) {
                java.lang.String[] split = str.split(",", -1);
                android.util.Pair<java.lang.Integer, java.lang.Integer> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(split[0]);
                if (((java.lang.Integer) highSpeedVideoFpsRanges.first).intValue() == 2) {
                    return highSpeedVideoFpsRanges;
                }
                for (int i = 1; i < split.length; i++) {
                    android.util.Pair<java.lang.Integer, java.lang.Integer> highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(split[i]);
                    int intValue = (((java.lang.Integer) highSpeedVideoFpsRanges2.first).equals(highSpeedVideoFpsRanges.first) || ((java.lang.Integer) highSpeedVideoFpsRanges2.second).equals(highSpeedVideoFpsRanges.first)) ? ((java.lang.Integer) highSpeedVideoFpsRanges.first).intValue() : -1;
                    int intValue2 = (((java.lang.Integer) highSpeedVideoFpsRanges.second).intValue() == -1 || !(((java.lang.Integer) highSpeedVideoFpsRanges2.first).equals(highSpeedVideoFpsRanges.second) || ((java.lang.Integer) highSpeedVideoFpsRanges2.second).equals(highSpeedVideoFpsRanges.second))) ? -1 : ((java.lang.Integer) highSpeedVideoFpsRanges.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new android.util.Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        highSpeedVideoFpsRanges = new android.util.Pair<>(java.lang.Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        highSpeedVideoFpsRanges = new android.util.Pair<>(java.lang.Integer.valueOf(intValue), -1);
                    }
                }
                return highSpeedVideoFpsRanges;
            }
            if (str.contains(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                java.lang.String[] split2 = str.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) java.lang.Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) java.lang.Double.parseDouble(split2[1]);
                        if (parseDouble < 0 || parseDouble2 < 0) {
                            return new android.util.Pair<>(10, -1);
                        }
                        if (parseDouble > androidx.collection.SieveCacheKt.NodeLinkMask || parseDouble2 > androidx.collection.SieveCacheKt.NodeLinkMask) {
                            return new android.util.Pair<>(5, -1);
                        }
                        return new android.util.Pair<>(10, 5);
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                return new android.util.Pair<>(2, -1);
            }
            try {
                try {
                    long parseLong = java.lang.Long.parseLong(str);
                    if (parseLong >= 0 && parseLong <= okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return new android.util.Pair<>(3, 4);
                    }
                    if (parseLong < 0) {
                        return new android.util.Pair<>(9, -1);
                    }
                    return new android.util.Pair<>(4, -1);
                } catch (java.lang.NumberFormatException unused2) {
                    return new android.util.Pair<>(2, -1);
                }
            } catch (java.lang.NumberFormatException unused3) {
                java.lang.Double.parseDouble(str);
                return new android.util.Pair<>(12, -1);
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.ExifData$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public java.lang.String getAttribute(java.lang.String str) {
        androidx.camera.core.impl.utils.ExifAttribute exifAttribute;
        double d;
        java.lang.String str2 = androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str) ? androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY : str;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= Camera2StreamConfigurationMap.length) {
                exifAttribute = null;
                break;
            }
            exifAttribute = this.getOutputFormats.get(i2).get(str2);
            if (exifAttribute != null) {
                break;
            }
            i2++;
        }
        if (exifAttribute != null) {
            if (getHighSpeedVideoSizes.contains(str)) {
                if (str.equals(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP)) {
                    if (exifAttribute.getInputFormats != 5 && exifAttribute.getInputFormats != 10) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("GPS Timestamp format is not rational. format=");
                        sb.append(exifAttribute.getInputFormats);
                        androidx.camera.core.Logger.w("ExifData", sb.toString());
                        return null;
                    }
                    androidx.camera.core.impl.utils.LongRational[] longRationalArr = (androidx.camera.core.impl.utils.LongRational[]) exifAttribute.getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM);
                    if (longRationalArr == null || longRationalArr.length != 3) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid GPS Timestamp array. array=");
                        sb2.append(java.util.Arrays.toString(longRationalArr));
                        androidx.camera.core.Logger.w("ExifData", sb2.toString());
                        return null;
                    }
                    return java.lang.String.format(java.util.Locale.US, "%02d:%02d:%02d", java.lang.Integer.valueOf((int) (longRationalArr[0].getHighSpeedVideoSizes / longRationalArr[0].getHighResolutionOutputSizeshNQ4ISI)), java.lang.Integer.valueOf((int) (longRationalArr[1].getHighSpeedVideoSizes / longRationalArr[1].getHighResolutionOutputSizeshNQ4ISI)), java.lang.Integer.valueOf((int) (longRationalArr[2].getHighSpeedVideoSizes / longRationalArr[2].getHighResolutionOutputSizeshNQ4ISI)));
                }
                try {
                    java.lang.Object highSpeedVideoSizes = exifAttribute.getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM);
                    if (highSpeedVideoSizes == null) {
                        throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
                    }
                    if (highSpeedVideoSizes instanceof java.lang.String) {
                        d = java.lang.Double.parseDouble((java.lang.String) highSpeedVideoSizes);
                    } else if (highSpeedVideoSizes instanceof long[]) {
                        long[] jArr = (long[]) highSpeedVideoSizes;
                        if (jArr.length == 1) {
                            d = jArr[0];
                        } else {
                            throw new java.lang.NumberFormatException("There are more than one component");
                        }
                    } else if (highSpeedVideoSizes instanceof int[]) {
                        int[] iArr = (int[]) highSpeedVideoSizes;
                        if (iArr.length == 1) {
                            d = iArr[0];
                        } else {
                            throw new java.lang.NumberFormatException("There are more than one component");
                        }
                    } else if (highSpeedVideoSizes instanceof double[]) {
                        double[] dArr = (double[]) highSpeedVideoSizes;
                        if (dArr.length == 1) {
                            d = dArr[0];
                        } else {
                            throw new java.lang.NumberFormatException("There are more than one component");
                        }
                    } else if (highSpeedVideoSizes instanceof androidx.camera.core.impl.utils.LongRational[]) {
                        androidx.camera.core.impl.utils.LongRational[] longRationalArr2 = (androidx.camera.core.impl.utils.LongRational[]) highSpeedVideoSizes;
                        if (longRationalArr2.length == 1) {
                            androidx.camera.core.impl.utils.LongRational longRational = longRationalArr2[0];
                            d = longRational.getHighSpeedVideoSizes / longRational.getHighResolutionOutputSizeshNQ4ISI;
                        } else {
                            throw new java.lang.NumberFormatException("There are more than one component");
                        }
                    } else {
                        throw new java.lang.NumberFormatException("Couldn't find a double value");
                    }
                    return java.lang.Double.toString(d);
                } catch (java.lang.NumberFormatException unused) {
                }
            } else {
                java.lang.Object highSpeedVideoSizes2 = exifAttribute.getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM);
                if (highSpeedVideoSizes2 != null) {
                    if (highSpeedVideoSizes2 instanceof java.lang.String) {
                        return (java.lang.String) highSpeedVideoSizes2;
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    if (highSpeedVideoSizes2 instanceof long[]) {
                        long[] jArr2 = (long[]) highSpeedVideoSizes2;
                        while (i < jArr2.length) {
                            sb3.append(jArr2[i]);
                            i++;
                            if (i != jArr2.length) {
                                sb3.append(",");
                            }
                        }
                        return sb3.toString();
                    }
                    if (highSpeedVideoSizes2 instanceof int[]) {
                        int[] iArr2 = (int[]) highSpeedVideoSizes2;
                        while (i < iArr2.length) {
                            sb3.append(iArr2[i]);
                            i++;
                            if (i != iArr2.length) {
                                sb3.append(",");
                            }
                        }
                        return sb3.toString();
                    }
                    if (highSpeedVideoSizes2 instanceof double[]) {
                        double[] dArr2 = (double[]) highSpeedVideoSizes2;
                        while (i < dArr2.length) {
                            sb3.append(dArr2[i]);
                            i++;
                            if (i != dArr2.length) {
                                sb3.append(",");
                            }
                        }
                        return sb3.toString();
                    }
                    if (highSpeedVideoSizes2 instanceof androidx.camera.core.impl.utils.LongRational[]) {
                        androidx.camera.core.impl.utils.LongRational[] longRationalArr3 = (androidx.camera.core.impl.utils.LongRational[]) highSpeedVideoSizes2;
                        while (i < longRationalArr3.length) {
                            sb3.append(longRationalArr3[i].getHighSpeedVideoSizes);
                            sb3.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                            sb3.append(longRationalArr3[i].getHighResolutionOutputSizeshNQ4ISI);
                            i++;
                            if (i != longRationalArr3.length) {
                                sb3.append(",");
                            }
                        }
                        return sb3.toString();
                    }
                }
                return null;
            }
        }
        return null;
    }
}
