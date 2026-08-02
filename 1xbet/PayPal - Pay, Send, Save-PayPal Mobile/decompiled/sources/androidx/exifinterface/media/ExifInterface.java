package androidx.exifinterface.media;

/* loaded from: classes7.dex */
public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    private static final java.util.Set<java.lang.String> AMEXKernel;
    private static final java.text.SimpleDateFormat AMEXKernelJNI;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag AMEXKernela;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] CoroutineDebuggingKt;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final java.lang.String GPS_DIRECTION_MAGNETIC = "M";
    public static final java.lang.String GPS_DIRECTION_TRUE = "T";
    public static final java.lang.String GPS_DISTANCE_KILOMETERS = "K";
    public static final java.lang.String GPS_DISTANCE_MILES = "M";
    public static final java.lang.String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final java.lang.String GPS_MEASUREMENT_2D = "2";
    public static final java.lang.String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final java.lang.String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final java.lang.String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final java.lang.String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final java.lang.String GPS_SPEED_KNOTS = "N";
    public static final java.lang.String GPS_SPEED_MILES_PER_HOUR = "M";
    public static final java.lang.String LATITUDE_NORTH = "N";
    public static final java.lang.String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final java.lang.String LONGITUDE_EAST = "E";
    public static final java.lang.String LONGITUDE_WEST = "W";
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final java.lang.String TAG_APERTURE_VALUE = "ApertureValue";
    public static final java.lang.String TAG_ARTIST = "Artist";
    public static final java.lang.String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final java.lang.String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final java.lang.String TAG_BRIGHTNESS_VALUE = "BrightnessValue";

    @java.lang.Deprecated
    public static final java.lang.String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CFA_PATTERN = "CFAPattern";
    public static final java.lang.String TAG_COLOR_SPACE = "ColorSpace";
    public static final java.lang.String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final java.lang.String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final java.lang.String TAG_COMPRESSION = "Compression";
    public static final java.lang.String TAG_CONTRAST = "Contrast";
    public static final java.lang.String TAG_COPYRIGHT = "Copyright";
    public static final java.lang.String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final java.lang.String TAG_DATETIME = "DateTime";
    public static final java.lang.String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final java.lang.String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final java.lang.String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final java.lang.String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final java.lang.String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final java.lang.String TAG_DNG_VERSION = "DNGVersion";
    public static final java.lang.String TAG_EXIF_VERSION = "ExifVersion";
    public static final java.lang.String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final java.lang.String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final java.lang.String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final java.lang.String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final java.lang.String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final java.lang.String TAG_FILE_SOURCE = "FileSource";
    public static final java.lang.String TAG_FLASH = "Flash";
    public static final java.lang.String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final java.lang.String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final java.lang.String TAG_FOCAL_LENGTH = "FocalLength";
    public static final java.lang.String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final java.lang.String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final java.lang.String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final java.lang.String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final java.lang.String TAG_F_NUMBER = "FNumber";
    public static final java.lang.String TAG_GAIN_CONTROL = "GainControl";
    public static final java.lang.String TAG_GAMMA = "Gamma";
    public static final java.lang.String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final java.lang.String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final java.lang.String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final java.lang.String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final java.lang.String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final java.lang.String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final java.lang.String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final java.lang.String TAG_GPS_DOP = "GPSDOP";
    public static final java.lang.String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    public static final java.lang.String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final java.lang.String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final java.lang.String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final java.lang.String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final java.lang.String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final java.lang.String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final java.lang.String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final java.lang.String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final java.lang.String TAG_GPS_SPEED = "GPSSpeed";
    public static final java.lang.String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final java.lang.String TAG_GPS_STATUS = "GPSStatus";
    public static final java.lang.String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final java.lang.String TAG_GPS_TRACK = "GPSTrack";
    public static final java.lang.String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final java.lang.String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final java.lang.String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final java.lang.String TAG_IMAGE_LENGTH = "ImageLength";
    public static final java.lang.String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final java.lang.String TAG_IMAGE_WIDTH = "ImageWidth";
    public static final java.lang.String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final java.lang.String TAG_ISO_SPEED = "ISOSpeed";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

    @java.lang.Deprecated
    public static final java.lang.String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final java.lang.String TAG_LENS_MAKE = "LensMake";
    public static final java.lang.String TAG_LENS_MODEL = "LensModel";
    public static final java.lang.String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final java.lang.String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final java.lang.String TAG_LIGHT_SOURCE = "LightSource";
    public static final java.lang.String TAG_MAKE = "Make";
    public static final java.lang.String TAG_MAKER_NOTE = "MakerNote";
    public static final java.lang.String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final java.lang.String TAG_METERING_MODE = "MeteringMode";
    public static final java.lang.String TAG_MODEL = "Model";
    public static final java.lang.String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final java.lang.String TAG_OECF = "OECF";
    public static final java.lang.String TAG_OFFSET_TIME = "OffsetTime";
    public static final java.lang.String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final java.lang.String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final java.lang.String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final java.lang.String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final java.lang.String TAG_ORIENTATION = "Orientation";
    public static final java.lang.String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final java.lang.String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final java.lang.String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final java.lang.String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final java.lang.String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final java.lang.String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    public static final java.lang.String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final java.lang.String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final java.lang.String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final java.lang.String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final java.lang.String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final java.lang.String TAG_RW2_ISO = "ISO";
    public static final java.lang.String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final java.lang.String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final java.lang.String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final java.lang.String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final java.lang.String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final java.lang.String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final java.lang.String TAG_SATURATION = "Saturation";
    public static final java.lang.String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final java.lang.String TAG_SCENE_TYPE = "SceneType";
    public static final java.lang.String TAG_SENSING_METHOD = "SensingMethod";
    public static final java.lang.String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final java.lang.String TAG_SHARPNESS = "Sharpness";
    public static final java.lang.String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final java.lang.String TAG_SOFTWARE = "Software";
    public static final java.lang.String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final java.lang.String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final java.lang.String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final java.lang.String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final java.lang.String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final java.lang.String TAG_SUBFILE_TYPE = "SubfileType";
    public static final java.lang.String TAG_SUBJECT_AREA = "SubjectArea";
    public static final java.lang.String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final java.lang.String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final java.lang.String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final java.lang.String TAG_SUBSEC_TIME = "SubSecTime";
    public static final java.lang.String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final java.lang.String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
    public static final java.lang.String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final java.lang.String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final java.lang.String TAG_USER_COMMENT = "UserComment";
    public static final java.lang.String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final java.lang.String TAG_WHITE_POINT = "WhitePoint";
    public static final java.lang.String TAG_XMP = "Xmp";
    public static final java.lang.String TAG_X_RESOLUTION = "XResolution";
    public static final java.lang.String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final java.lang.String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final java.lang.String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final java.lang.String TAG_Y_RESOLUTION = "YResolution";

    @java.lang.Deprecated
    public static final int WHITEBALANCE_AUTO = 0;

    @java.lang.Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] _BOUNDARY;

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f2736a;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] accessartificialFrame;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] coroutineBoundary;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] coroutineCreation;
    private static final java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface.ExifTag>[] free;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> freeTransaction;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] getARTIFICIAL_FRAME_PACKAGE_NAME;
    private static final java.nio.charset.Charset getHighSpeedVideoFpsRanges;
    static final androidx.exifinterface.media.ExifInterface.ExifTag[][] getHighSpeedVideoFpsRangesFor;
    static final byte[] getHighSpeedVideoSizes;
    private static final java.util.regex.Pattern getHighSpeedVideoSizesFor;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] getOutputFormats;
    private static final java.util.regex.Pattern getOutputMinFrameDuration;
    private static final java.util.regex.Pattern getOutputStallDuration;
    private static final byte[] getValidOutputFormatsForInputhNQ4ISI;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] init;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] kernelVersion;
    private static final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifTag>[] rsaCipher;
    private static final java.text.SimpleDateFormat sha1;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] unwrapAs;
    private boolean AMEXKernelProvider;
    private boolean BerTlvEncoder;
    private int TransactionOutcomeDecoder;
    private boolean TransactionOutcomeDecoderExternalSyntheticLambda0;
    private int TransactionOutcomeDecoderExternalSyntheticLambda1;
    private byte[] TransactionOutcomeDecoderExternalSyntheticLambda2;
    private int TransactionOutcomeDecoderExternalSyntheticLambda3;
    private java.io.FileDescriptor TransactionOutcomeDecoderExternalSyntheticLambda4;
    private int TransactionOutcomeDecoderExternalSyntheticLambda5;
    private int TransactionOutcomeDecoderExternalSyntheticLambda6;
    private androidx.exifinterface.media.ExifInterface.ExifAttribute TransactionOutcomeDecoderExternalSyntheticLambda7;
    private boolean aid;
    private int apply;
    private int decode;
    private java.lang.String encode;
    private boolean kernelID;
    private java.nio.ByteOrder newContext;
    private boolean provide;
    private android.content.res.AssetManager.AssetInputStream setup;
    private java.util.Set<java.lang.Integer> start;
    private int values;
    private final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] version;
    private static final boolean getInputSizeshNQ4ISI = android.util.Log.isLoggable("ExifInterface", 3);
    private static final java.util.List<java.lang.Integer> c = java.util.Arrays.asList(1, 6, 3, 8);
    private static final java.util.List<java.lang.Integer> getOutputStallDurationlomOqCM = java.util.Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    static final byte[] Camera2StreamConfigurationMap = {-1, -40, -1};
    private static final byte[] toString = {102, 116, 121, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4};
    private static final byte[] isOutputSupportedFor = {109, 105, 102, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
    private static final byte[] getOutputMinFrameDurationlomOqCM = {104, 101, 105, 99};
    private static final byte[] getOutputSizes = {97, 118, 105, 102};
    private static final byte[] getOutputSizeshNQ4ISI = {97, 118, 105, 115};
    private static final byte[] b = {com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 76, 89, 77, 80, 0};
    private static final byte[] _CREATION = {com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] d = {-119, 80, 78, 71, 13, 10, com.google.common.base.Ascii.SUB, 10};
    static final byte[] getHighResolutionOutputSizeshNQ4ISI = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    private static final byte[] AMEXKernelCallback = {82, 73, 70, 70};
    private static final byte[] requestPINEntry = {87, 69, 66, 80};
    private static final byte[] startTransaction = {69, 88, 73, 70};
    private static final byte[] updateUI = {-99, 1, 42};
    private static final byte[] requestGoOnline = "VP8X".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final byte[] l = "VP8L".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final byte[] release = "VP8 ".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final byte[] resetTransaction = "ANIM".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final byte[] exchange = "ANMF".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final java.lang.String[] ArtificialStackFrames = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int[] isOutputSupportedForhNQ4ISI = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] getInputFormats = {65, 83, 67, 73, 73, 0, 0, 0};

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ExifStreamType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface IfdType {
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i != 4) {
            return (i == 9 || i == 15 || i == 12 || i == 13) ? 2 : 1;
        }
        return 3;
    }

    static {
        androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr = {new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_NEW_SUBFILE_TYPE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SUBFILE_TYPE, 255, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_IMAGE_WIDTH, 256, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_IMAGE_LENGTH, 257, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_BITS_PER_SAMPLE, 258, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_COMPRESSION, 259, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_PHOTOMETRIC_INTERPRETATION, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_IMAGE_DESCRIPTION, 270, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_MAKE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_MODEL, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_STRIP_OFFSETS, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ORIENTATION, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SAMPLES_PER_PIXEL, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ROWS_PER_STRIP, com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_STRIP_BYTE_COUNTS, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_X_RESOLUTION, 282, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_Y_RESOLUTION, 283, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_PLANAR_CONFIGURATION, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RESOLUTION_UNIT, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_TRANSFER_FUNCTION, 301, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SOFTWARE, 305, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DATETIME, 306, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ARTIST, 315, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_WHITE_POINT, 318, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_PRIMARY_CHROMATICITIES, 319, 5), new androidx.exifinterface.media.ExifInterface.ExifTag("SubIFDPointer", com.visa.cbp.getCertUsage.setAucAID, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_JPEG_INTERCHANGE_FORMAT, 513, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_Y_CB_CR_POSITIONING, 531, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_REFERENCE_BLACK_WHITE, 532, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_COPYRIGHT, 33432, 2), new androidx.exifinterface.media.ExifInterface.ExifTag("ExifIFDPointer", 34665, 4), new androidx.exifinterface.media.ExifInterface.ExifTag("GPSInfoIFDPointer", 34853, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RW2_ISO, 23, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RW2_JPG_FROM_RAW, 46, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_XMP, 700, 1)};
        coroutineCreation = exifTagArr;
        androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr2 = {new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_EXPOSURE_TIME, 33434, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_F_NUMBER, 33437, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_EXPOSURE_PROGRAM, 34850, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_OECF, 34856, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SENSITIVITY_TYPE, 34864, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_STANDARD_OUTPUT_SENSITIVITY, 34865, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RECOMMENDED_EXPOSURE_INDEX, 34866, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ISO_SPEED, 34867, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ISO_SPEED_LATITUDE_YYY, 34868, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ISO_SPEED_LATITUDE_ZZZ, 34869, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_EXIF_VERSION, 36864, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DATETIME_ORIGINAL, 36867, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DATETIME_DIGITIZED, 36868, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_OFFSET_TIME, 36880, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_OFFSET_TIME_ORIGINAL, 36881, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_OFFSET_TIME_DIGITIZED, 36882, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_APERTURE_VALUE, 37378, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_BRIGHTNESS_VALUE, 37379, 10), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_MAX_APERTURE_VALUE, 37381, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SUBJECT_DISTANCE, 37382, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_METERING_MODE, 37383, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_LIGHT_SOURCE, 37384, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_FLASH, 37385, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_FOCAL_LENGTH, 37386, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SUBJECT_AREA, 37396, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_MAKER_NOTE, 37500, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_USER_COMMENT, 37510, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SUBSEC_TIME, 37520, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_FLASHPIX_VERSION, 40960, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_COLOR_SPACE, 40961, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RELATED_SOUND_FILE, 40964, 2), new androidx.exifinterface.media.ExifInterface.ExifTag("InteroperabilityIFDPointer", 40965, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_FLASH_ENERGY, 41483, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SUBJECT_LOCATION, 41492, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_EXPOSURE_INDEX, 41493, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SENSING_METHOD, 41495, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_FILE_SOURCE, 41728, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SCENE_TYPE, 41729, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_CFA_PATTERN, 41730, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_CUSTOM_RENDERED, 41985, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_EXPOSURE_MODE, 41986, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_WHITE_BALANCE, 41987, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GAIN_CONTROL, 41991, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_CONTRAST, 41992, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SATURATION, 41993, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SHARPNESS, 41994, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_IMAGE_UNIQUE_ID, 42016, 2), new androidx.exifinterface.media.ExifInterface.ExifTag("CameraOwnerName", 42032, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_BODY_SERIAL_NUMBER, 42033, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_LENS_SPECIFICATION, 42034, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_LENS_MAKE, 42035, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_LENS_MODEL, 42036, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GAMMA, 42240, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DNG_VERSION, 50706, 1), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        unwrapAs = exifTagArr2;
        androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr3 = {new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_VERSION_ID, 0, 1), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_LATITUDE_REF, 1, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_LATITUDE, 2, 5, 10), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_LONGITUDE_REF, 3, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_LONGITUDE, 4, 5, 10), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_ALTITUDE_REF, 5, 1), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_ALTITUDE, 6, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_TIMESTAMP, 7, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_SATELLITES, 8, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_STATUS, 9, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_MEASURE_MODE, 10, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DOP, 11, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_SPEED_REF, 12, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_SPEED, 13, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_TRACK_REF, 14, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_TRACK, 15, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_IMG_DIRECTION, 17, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_MAP_DATUM, 18, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DEST_LATITUDE, 20, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DEST_LONGITUDE, 22, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DEST_BEARING_REF, 23, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DEST_BEARING, 24, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DEST_DISTANCE, 26, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_PROCESSING_METHOD, 27, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_AREA_INFORMATION, 28, 7), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DATESTAMP, 29, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_DIFFERENTIAL, 30, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_GPS_H_POSITIONING_ERROR, 31, 5)};
        CoroutineDebuggingKt = exifTagArr3;
        androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr4 = {new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_INTEROPERABILITY_INDEX, 1, 2)};
        coroutineBoundary = exifTagArr4;
        androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr5 = {new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_NEW_SUBFILE_TYPE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SUBFILE_TYPE, 255, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_THUMBNAIL_IMAGE_LENGTH, 257, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_BITS_PER_SAMPLE, 258, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_COMPRESSION, 259, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_PHOTOMETRIC_INTERPRETATION, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_IMAGE_DESCRIPTION, 270, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_MAKE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_MODEL, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_STRIP_OFFSETS, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag("ThumbnailOrientation", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SAMPLES_PER_PIXEL, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ROWS_PER_STRIP, com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_STRIP_BYTE_COUNTS, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 3, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_X_RESOLUTION, 282, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_Y_RESOLUTION, 283, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_PLANAR_CONFIGURATION, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_RESOLUTION_UNIT, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_TRANSFER_FUNCTION, 301, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_SOFTWARE, 305, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DATETIME, 306, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ARTIST, 315, 2), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_WHITE_POINT, 318, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_PRIMARY_CHROMATICITIES, 319, 5), new androidx.exifinterface.media.ExifInterface.ExifTag("SubIFDPointer", com.visa.cbp.getCertUsage.setAucAID, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_JPEG_INTERCHANGE_FORMAT, 513, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_Y_CB_CR_POSITIONING, 531, 3), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_REFERENCE_BLACK_WHITE, 532, 5), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_COPYRIGHT, 33432, 2), new androidx.exifinterface.media.ExifInterface.ExifTag("ExifIFDPointer", 34665, 4), new androidx.exifinterface.media.ExifInterface.ExifTag("GPSInfoIFDPointer", 34853, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DNG_VERSION, 50706, 1), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        accessartificialFrame = exifTagArr5;
        AMEXKernela = new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_STRIP_OFFSETS, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3);
        androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr6 = {new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new androidx.exifinterface.media.ExifInterface.ExifTag("CameraSettingsIFDPointer", 8224, 4), new androidx.exifinterface.media.ExifInterface.ExifTag("ImageProcessingIFDPointer", 8256, 4)};
        kernelVersion = exifTagArr6;
        androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr7 = {new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)};
        _BOUNDARY = exifTagArr7;
        androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr8 = {new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_ORF_ASPECT_FRAME, 4371, 3)};
        getARTIFICIAL_FRAME_PACKAGE_NAME = exifTagArr8;
        androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr9 = {new androidx.exifinterface.media.ExifInterface.ExifTag(TAG_COLOR_SPACE, 55, 3)};
        init = exifTagArr9;
        getHighSpeedVideoFpsRangesFor = new androidx.exifinterface.media.ExifInterface.ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, exifTagArr6, exifTagArr7, exifTagArr8, exifTagArr9};
        getOutputFormats = new androidx.exifinterface.media.ExifInterface.ExifTag[]{new androidx.exifinterface.media.ExifInterface.ExifTag("SubIFDPointer", com.visa.cbp.getCertUsage.setAucAID, 4), new androidx.exifinterface.media.ExifInterface.ExifTag("ExifIFDPointer", 34665, 4), new androidx.exifinterface.media.ExifInterface.ExifTag("GPSInfoIFDPointer", 34853, 4), new androidx.exifinterface.media.ExifInterface.ExifTag("InteroperabilityIFDPointer", 40965, 4), new androidx.exifinterface.media.ExifInterface.ExifTag("CameraSettingsIFDPointer", 8224, 1), new androidx.exifinterface.media.ExifInterface.ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        free = new java.util.HashMap[10];
        rsaCipher = new java.util.HashMap[10];
        AMEXKernel = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE)));
        freeTransaction = new java.util.HashMap<>();
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("US-ASCII");
        getHighSpeedVideoFpsRanges = forName;
        getHighSpeedVideoSizes = "Exif\u0000\u0000".getBytes(forName);
        getValidOutputFormatsForInputhNQ4ISI = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.miteksystems.misnap.core.DateUtil.ISO_DATE_FORMAT, java.util.Locale.US);
        AMEXKernelJNI = simpleDateFormat;
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US);
        sha1 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        int i = 0;
        while (true) {
            androidx.exifinterface.media.ExifInterface.ExifTag[][] exifTagArr10 = getHighSpeedVideoFpsRangesFor;
            if (i < exifTagArr10.length) {
                free[i] = new java.util.HashMap<>();
                rsaCipher[i] = new java.util.HashMap<>();
                for (androidx.exifinterface.media.ExifInterface.ExifTag exifTag : exifTagArr10[i]) {
                    free[i].put(java.lang.Integer.valueOf(exifTag.getHighSpeedVideoSizes), exifTag);
                    rsaCipher[i].put(exifTag.getHighSpeedVideoFpsRanges, exifTag);
                }
                i++;
            } else {
                java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = freeTransaction;
                androidx.exifinterface.media.ExifInterface.ExifTag[] exifTagArr11 = getOutputFormats;
                hashMap.put(java.lang.Integer.valueOf(exifTagArr11[0].getHighSpeedVideoSizes), 5);
                hashMap.put(java.lang.Integer.valueOf(exifTagArr11[1].getHighSpeedVideoSizes), 1);
                hashMap.put(java.lang.Integer.valueOf(exifTagArr11[2].getHighSpeedVideoSizes), 2);
                hashMap.put(java.lang.Integer.valueOf(exifTagArr11[3].getHighSpeedVideoSizes), 3);
                hashMap.put(java.lang.Integer.valueOf(exifTagArr11[4].getHighSpeedVideoSizes), 7);
                hashMap.put(java.lang.Integer.valueOf(exifTagArr11[5].getHighSpeedVideoSizes), 8);
                f2736a = java.util.regex.Pattern.compile(".*[1-9].*");
                getOutputStallDuration = java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                getOutputMinFrameDuration = java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                getHighSpeedVideoSizesFor = java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    static class Rational {
        public final long Camera2StreamConfigurationMap;
        public final long getHighSpeedVideoSizes;

        /* synthetic */ Rational(long j, long j2, byte b) {
            this(j, j2);
        }

        private Rational(long j, long j2) {
            if (j2 == 0) {
                this.getHighSpeedVideoSizes = 0L;
                this.Camera2StreamConfigurationMap = 1L;
            } else {
                this.getHighSpeedVideoSizes = j;
                this.Camera2StreamConfigurationMap = j2;
            }
        }

        public static androidx.exifinterface.media.ExifInterface.Rational getHighSpeedVideoFpsRanges(double d) {
            long j;
            long j2;
            long j3 = 1;
            if (d >= 9.223372036854776E18d || d <= -9.223372036854776E18d) {
                return new androidx.exifinterface.media.ExifInterface.Rational(d > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double abs = java.lang.Math.abs(d);
            long j4 = 0;
            long j5 = 1;
            double d2 = abs;
            long j6 = 0;
            while (true) {
                double d3 = d2 % 1.0d;
                long j7 = (long) (d2 - d3);
                j = j6 + (j7 * j3);
                j2 = (j7 * j4) + j5;
                double d4 = 1.0d / d3;
                long j8 = j3;
                if (java.lang.Math.abs(abs - (j / j2)) <= 1.0E-8d * abs) {
                    break;
                }
                j3 = j;
                j6 = j8;
                long j9 = j4;
                j4 = j2;
                d2 = d4;
                j5 = j9;
            }
            if (d < 0.0d) {
                j = -j;
            }
            return new androidx.exifinterface.media.ExifInterface.Rational(j, j2);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(this.Camera2StreamConfigurationMap);
            return sb.toString();
        }
    }

    static class ExifAttribute {
        public final int Camera2StreamConfigurationMap;
        public final int getHighSpeedVideoFpsRanges;
        public final byte[] getHighSpeedVideoFpsRangesFor;
        public final long getHighSpeedVideoSizes;

        private ExifAttribute(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        ExifAttribute(int i, int i2, long j, byte[] bArr) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = i2;
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRangesFor = bArr;
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighResolutionOutputSizeshNQ4ISI(int[] iArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.isOutputSupportedForhNQ4ISI[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(3, iArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighSpeedVideoFpsRangesFor(int i, java.nio.ByteOrder byteOrder) {
            return getHighResolutionOutputSizeshNQ4ISI(new int[]{i}, byteOrder);
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute Camera2StreamConfigurationMap(long[] jArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.isOutputSupportedForhNQ4ISI[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(4, jArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighSpeedVideoFpsRangesFor(long j, java.nio.ByteOrder byteOrder) {
            return Camera2StreamConfigurationMap(new long[]{j}, byteOrder);
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighSpeedVideoFpsRanges(int[] iArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.isOutputSupportedForhNQ4ISI[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(9, iArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(androidx.exifinterface.media.ExifInterface.getHighSpeedVideoFpsRanges);
                return new androidx.exifinterface.media.ExifInterface.ExifAttribute(1, bytes.length, bytes);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)});
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append((char) 0);
            byte[] bytes = sb.toString().getBytes(androidx.exifinterface.media.ExifInterface.getHighSpeedVideoFpsRanges);
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(2, bytes.length, bytes);
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighSpeedVideoFpsRanges(androidx.exifinterface.media.ExifInterface.Rational[] rationalArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.isOutputSupportedForhNQ4ISI[5] * rationalArr.length]);
            wrap.order(byteOrder);
            for (androidx.exifinterface.media.ExifInterface.Rational rational : rationalArr) {
                wrap.putInt((int) rational.getHighSpeedVideoSizes);
                wrap.putInt((int) rational.Camera2StreamConfigurationMap);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(5, rationalArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.Rational rational, java.nio.ByteOrder byteOrder) {
            return getHighSpeedVideoFpsRanges(new androidx.exifinterface.media.ExifInterface.Rational[]{rational}, byteOrder);
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighSpeedVideoFpsRangesFor(androidx.exifinterface.media.ExifInterface.Rational[] rationalArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.isOutputSupportedForhNQ4ISI[10] * rationalArr.length]);
            wrap.order(byteOrder);
            for (androidx.exifinterface.media.ExifInterface.Rational rational : rationalArr) {
                wrap.putInt((int) rational.getHighSpeedVideoSizes);
                wrap.putInt((int) rational.Camera2StreamConfigurationMap);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(10, rationalArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute getHighSpeedVideoFpsRangesFor(double[] dArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.isOutputSupportedForhNQ4ISI[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(12, dArr.length, wrap.array());
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            sb.append(androidx.exifinterface.media.ExifInterface.ArtificialStackFrames[this.Camera2StreamConfigurationMap]);
            sb.append(", data length:");
            sb.append(this.getHighSpeedVideoFpsRangesFor.length);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v17, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v19, types: [long[]] */
        /* JADX WARN: Type inference failed for: r14v21, types: [androidx.exifinterface.media.ExifInterface$Rational[]] */
        /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v25, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v27, types: [androidx.exifinterface.media.ExifInterface$Rational[]] */
        /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
        /* JADX WARN: Type inference failed for: r14v32, types: [double[]] */
        final java.lang.Object getHighSpeedVideoSizes(java.nio.ByteOrder byteOrder) {
            androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream;
            java.lang.String str;
            byte b;
            byte b2;
            androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream2 = null;
            try {
                byteOrderedDataInputStream = new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(this.getHighSpeedVideoFpsRangesFor);
                try {
                    byteOrderedDataInputStream.getHighSpeedVideoSizes = byteOrder;
                    int i = 0;
                    switch (this.Camera2StreamConfigurationMap) {
                        case 1:
                        case 6:
                            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                str = new java.lang.String(new char[]{(char) (b + 48)});
                                break;
                            } else {
                                str = new java.lang.String(bArr, androidx.exifinterface.media.ExifInterface.getHighSpeedVideoFpsRanges);
                                break;
                            }
                            break;
                        case 2:
                        case 7:
                            if (this.getHighSpeedVideoFpsRanges >= androidx.exifinterface.media.ExifInterface.getInputFormats.length) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < androidx.exifinterface.media.ExifInterface.getInputFormats.length) {
                                        if (this.getHighSpeedVideoFpsRangesFor[i2] == androidx.exifinterface.media.ExifInterface.getInputFormats[i2]) {
                                            i2++;
                                        }
                                    } else {
                                        i = androidx.exifinterface.media.ExifInterface.getInputFormats.length;
                                    }
                                }
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            while (i < this.getHighSpeedVideoFpsRanges && (b2 = this.getHighSpeedVideoFpsRangesFor[i]) != 0) {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            str = sb.toString();
                            break;
                        case 3:
                            ?? r14 = new int[this.getHighSpeedVideoFpsRanges];
                            while (true) {
                                str = r14;
                                if (i < this.getHighSpeedVideoFpsRanges) {
                                    r14[i] = byteOrderedDataInputStream.readUnsignedShort();
                                    i++;
                                }
                            }
                            break;
                        case 4:
                            ?? r142 = new long[this.getHighSpeedVideoFpsRanges];
                            while (true) {
                                str = r142;
                                if (i < this.getHighSpeedVideoFpsRanges) {
                                    r142[i] = byteOrderedDataInputStream.readInt() & 4294967295L;
                                    i++;
                                }
                            }
                            break;
                        case 5:
                            ?? r143 = new androidx.exifinterface.media.ExifInterface.Rational[this.getHighSpeedVideoFpsRanges];
                            while (true) {
                                str = r143;
                                if (i < this.getHighSpeedVideoFpsRanges) {
                                    r143[i] = new androidx.exifinterface.media.ExifInterface.Rational(byteOrderedDataInputStream.readInt() & 4294967295L, byteOrderedDataInputStream.readInt() & 4294967295L, (byte) 0);
                                    i++;
                                }
                            }
                            break;
                        case 8:
                            ?? r144 = new int[this.getHighSpeedVideoFpsRanges];
                            while (true) {
                                str = r144;
                                if (i < this.getHighSpeedVideoFpsRanges) {
                                    r144[i] = byteOrderedDataInputStream.readShort();
                                    i++;
                                }
                            }
                            break;
                        case 9:
                            ?? r145 = new int[this.getHighSpeedVideoFpsRanges];
                            while (true) {
                                str = r145;
                                if (i < this.getHighSpeedVideoFpsRanges) {
                                    r145[i] = byteOrderedDataInputStream.readInt();
                                    i++;
                                }
                            }
                            break;
                        case 10:
                            ?? r146 = new androidx.exifinterface.media.ExifInterface.Rational[this.getHighSpeedVideoFpsRanges];
                            while (true) {
                                str = r146;
                                if (i < this.getHighSpeedVideoFpsRanges) {
                                    r146[i] = new androidx.exifinterface.media.ExifInterface.Rational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt(), (byte) 0);
                                    i++;
                                }
                            }
                            break;
                        case 11:
                            ?? r147 = new double[this.getHighSpeedVideoFpsRanges];
                            while (true) {
                                str = r147;
                                if (i < this.getHighSpeedVideoFpsRanges) {
                                    r147[i] = byteOrderedDataInputStream.readFloat();
                                    i++;
                                }
                            }
                            break;
                        case 12:
                            ?? r148 = new double[this.getHighSpeedVideoFpsRanges];
                            while (true) {
                                str = r148;
                                if (i < this.getHighSpeedVideoFpsRanges) {
                                    r148[i] = byteOrderedDataInputStream.readDouble();
                                    i++;
                                }
                            }
                            break;
                        default:
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (java.io.IOException unused) {
                            }
                            return null;
                    }
                    try {
                        byteOrderedDataInputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                    return str;
                } catch (java.io.IOException unused3) {
                    if (byteOrderedDataInputStream != null) {
                        try {
                            byteOrderedDataInputStream.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    return null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    byteOrderedDataInputStream2 = byteOrderedDataInputStream;
                    if (byteOrderedDataInputStream2 != null) {
                        try {
                            byteOrderedDataInputStream2.close();
                        } catch (java.io.IOException unused5) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException unused6) {
                byteOrderedDataInputStream = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }

        public final double getHighSpeedVideoFpsRangesFor(java.nio.ByteOrder byteOrder) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(byteOrder);
            if (highSpeedVideoSizes == null) {
                throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
            }
            if (highSpeedVideoSizes instanceof java.lang.String) {
                return java.lang.Double.parseDouble((java.lang.String) highSpeedVideoSizes);
            }
            if (highSpeedVideoSizes instanceof long[]) {
                if (((long[]) highSpeedVideoSizes).length == 1) {
                    return r5[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (highSpeedVideoSizes instanceof int[]) {
                if (((int[]) highSpeedVideoSizes).length == 1) {
                    return r5[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (highSpeedVideoSizes instanceof double[]) {
                double[] dArr = (double[]) highSpeedVideoSizes;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (highSpeedVideoSizes instanceof androidx.exifinterface.media.ExifInterface.Rational[]) {
                androidx.exifinterface.media.ExifInterface.Rational[] rationalArr = (androidx.exifinterface.media.ExifInterface.Rational[]) highSpeedVideoSizes;
                if (rationalArr.length == 1) {
                    androidx.exifinterface.media.ExifInterface.Rational rational = rationalArr[0];
                    return rational.getHighSpeedVideoSizes / rational.Camera2StreamConfigurationMap;
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            throw new java.lang.NumberFormatException("Couldn't find a double value");
        }

        public final int getHighSpeedVideoFpsRanges(java.nio.ByteOrder byteOrder) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(byteOrder);
            if (highSpeedVideoSizes == null) {
                throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
            }
            if (highSpeedVideoSizes instanceof java.lang.String) {
                return java.lang.Integer.parseInt((java.lang.String) highSpeedVideoSizes);
            }
            if (highSpeedVideoSizes instanceof long[]) {
                long[] jArr = (long[]) highSpeedVideoSizes;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (highSpeedVideoSizes instanceof int[]) {
                int[] iArr = (int[]) highSpeedVideoSizes;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            throw new java.lang.NumberFormatException("Couldn't find a integer value");
        }

        public final java.lang.String Camera2StreamConfigurationMap(java.nio.ByteOrder byteOrder) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(byteOrder);
            if (highSpeedVideoSizes == null) {
                return null;
            }
            if (highSpeedVideoSizes instanceof java.lang.String) {
                return (java.lang.String) highSpeedVideoSizes;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i = 0;
            if (highSpeedVideoSizes instanceof long[]) {
                long[] jArr = (long[]) highSpeedVideoSizes;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (highSpeedVideoSizes instanceof int[]) {
                int[] iArr = (int[]) highSpeedVideoSizes;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (highSpeedVideoSizes instanceof double[]) {
                double[] dArr = (double[]) highSpeedVideoSizes;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(highSpeedVideoSizes instanceof androidx.exifinterface.media.ExifInterface.Rational[])) {
                return null;
            }
            androidx.exifinterface.media.ExifInterface.Rational[] rationalArr = (androidx.exifinterface.media.ExifInterface.Rational[]) highSpeedVideoSizes;
            while (i < rationalArr.length) {
                sb.append(rationalArr[i].getHighSpeedVideoSizes);
                sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                sb.append(rationalArr[i].Camera2StreamConfigurationMap);
                i++;
                if (i != rationalArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    static class ExifTag {
        public final int getHighResolutionOutputSizeshNQ4ISI;
        public final java.lang.String getHighSpeedVideoFpsRanges;
        public final int getHighSpeedVideoFpsRangesFor;
        public final int getHighSpeedVideoSizes;

        ExifTag(java.lang.String str, int i, int i2) {
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoFpsRangesFor = -1;
        }

        ExifTag(java.lang.String str, int i, int i2, int i3) {
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoFpsRangesFor = i3;
        }

        final boolean Camera2StreamConfigurationMap(int i) {
            int i2;
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.getHighSpeedVideoFpsRangesFor) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }
    }

    public ExifInterface(java.io.File file) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ExifTag[][] exifTagArr = getHighSpeedVideoFpsRangesFor;
        this.version = new java.util.HashMap[exifTagArr.length];
        this.start = new java.util.HashSet(exifTagArr.length);
        this.newContext = java.nio.ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new java.lang.NullPointerException("file cannot be null");
        }
        Camera2StreamConfigurationMap(file.getAbsolutePath());
    }

    public ExifInterface(java.lang.String str) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ExifTag[][] exifTagArr = getHighSpeedVideoFpsRangesFor;
        this.version = new java.util.HashMap[exifTagArr.length];
        this.start = new java.util.HashSet(exifTagArr.length);
        this.newContext = java.nio.ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new java.lang.NullPointerException("filename cannot be null");
        }
        Camera2StreamConfigurationMap(str);
    }

    public ExifInterface(java.io.FileDescriptor fileDescriptor) throws java.io.IOException {
        boolean z;
        androidx.exifinterface.media.ExifInterface.ExifTag[][] exifTagArr = getHighSpeedVideoFpsRangesFor;
        this.version = new java.util.HashMap[exifTagArr.length];
        this.start = new java.util.HashSet(exifTagArr.length);
        this.newContext = java.nio.ByteOrder.BIG_ENDIAN;
        if (fileDescriptor == null) {
            throw new java.lang.NullPointerException("fileDescriptor cannot be null");
        }
        java.io.FileInputStream fileInputStream = null;
        this.setup = null;
        this.encode = null;
        if (getHighSpeedVideoFpsRanges(fileDescriptor)) {
            this.TransactionOutcomeDecoderExternalSyntheticLambda4 = fileDescriptor;
            try {
                fileDescriptor = android.system.Os.dup(fileDescriptor);
                z = true;
            } catch (java.lang.Exception e) {
                throw new java.io.IOException("Failed to duplicate file descriptor", e);
            }
        } else {
            this.TransactionOutcomeDecoderExternalSyntheticLambda4 = null;
            z = false;
        }
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(fileDescriptor);
            try {
                getHighSpeedVideoSizes(fileInputStream2);
                androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(fileInputStream2);
                if (z) {
                    androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoFpsRanges(fileDescriptor);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(fileInputStream);
                if (z) {
                    androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoFpsRanges(fileDescriptor);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public ExifInterface(java.io.InputStream inputStream) throws java.io.IOException {
        this(inputStream, 0);
    }

    public ExifInterface(java.io.InputStream inputStream, int i) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ExifTag[][] exifTagArr = getHighSpeedVideoFpsRangesFor;
        this.version = new java.util.HashMap[exifTagArr.length];
        this.start = new java.util.HashSet(exifTagArr.length);
        this.newContext = java.nio.ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new java.lang.NullPointerException("inputStream cannot be null");
        }
        this.encode = null;
        boolean z = i == 1;
        this.aid = z;
        if (!z) {
            if (inputStream instanceof android.content.res.AssetManager.AssetInputStream) {
                this.setup = (android.content.res.AssetManager.AssetInputStream) inputStream;
                this.TransactionOutcomeDecoderExternalSyntheticLambda4 = null;
            } else if (inputStream instanceof java.io.FileInputStream) {
                java.io.FileInputStream fileInputStream = (java.io.FileInputStream) inputStream;
                if (getHighSpeedVideoFpsRanges(fileInputStream.getFD())) {
                    this.setup = null;
                    this.TransactionOutcomeDecoderExternalSyntheticLambda4 = fileInputStream.getFD();
                }
            }
            getHighSpeedVideoSizes(inputStream);
        }
        this.setup = null;
        this.TransactionOutcomeDecoderExternalSyntheticLambda4 = null;
        getHighSpeedVideoSizes(inputStream);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean isSupportedMimeType(java.lang.String str) {
        char c2;
        if (str == null) {
            throw new java.lang.NullPointerException("mimeType shouldn't be null");
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -879258763:
                if (lowerCase.equals(androidx.media3.common.MimeTypes.IMAGE_PNG)) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return true;
            default:
                return false;
        }
    }

    private androidx.exifinterface.media.ExifInterface.ExifAttribute getHighSpeedVideoFpsRanges(java.lang.String str) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute;
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2;
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        if (TAG_XMP.equals(str) && getHighResolutionOutputSizeshNQ4ISI(this.apply) == 2 && (exifAttribute2 = this.TransactionOutcomeDecoderExternalSyntheticLambda7) != null) {
            return exifAttribute2;
        }
        for (int i = 0; i < getHighSpeedVideoFpsRangesFor.length; i++) {
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.version[i].get(str);
            if (exifAttribute3 != null) {
                return exifAttribute3;
            }
        }
        if (!TAG_XMP.equals(str) || (exifAttribute = this.TransactionOutcomeDecoderExternalSyntheticLambda7) == null) {
            return null;
        }
        return exifAttribute;
    }

    public java.lang.String getAttribute(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if (highSpeedVideoFpsRanges == null) {
            return null;
        }
        if (str.equals(TAG_GPS_TIMESTAMP)) {
            if (highSpeedVideoFpsRanges.Camera2StreamConfigurationMap != 5 && highSpeedVideoFpsRanges.Camera2StreamConfigurationMap != 10) {
                int i = highSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                return null;
            }
            androidx.exifinterface.media.ExifInterface.Rational[] rationalArr = (androidx.exifinterface.media.ExifInterface.Rational[]) highSpeedVideoFpsRanges.getHighSpeedVideoSizes(this.newContext);
            if (rationalArr == null || rationalArr.length != 3) {
                java.util.Arrays.toString(rationalArr);
                return null;
            }
            return java.lang.String.format("%02d:%02d:%02d", java.lang.Integer.valueOf((int) (rationalArr[0].getHighSpeedVideoSizes / rationalArr[0].Camera2StreamConfigurationMap)), java.lang.Integer.valueOf((int) (rationalArr[1].getHighSpeedVideoSizes / rationalArr[1].Camera2StreamConfigurationMap)), java.lang.Integer.valueOf((int) (rationalArr[2].getHighSpeedVideoSizes / rationalArr[2].Camera2StreamConfigurationMap)));
        }
        if (AMEXKernel.contains(str)) {
            try {
                return java.lang.Double.toString(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this.newContext));
            } catch (java.lang.NumberFormatException unused) {
                return null;
            }
        }
        return highSpeedVideoFpsRanges.Camera2StreamConfigurationMap(this.newContext);
    }

    public int getAttributeInt(java.lang.String str, int i) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if (highSpeedVideoFpsRanges != null) {
            try {
                return highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(this.newContext);
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return i;
    }

    public double getAttributeDouble(java.lang.String str, double d2) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if (highSpeedVideoFpsRanges != null) {
            try {
                return highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this.newContext);
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return d2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void setAttribute(java.lang.String str, java.lang.String str2) {
        androidx.exifinterface.media.ExifInterface.ExifTag exifTag;
        int i;
        java.lang.String str3;
        int i2;
        java.lang.String str4 = str;
        java.lang.String str5 = str2;
        if (str4 == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str4)) {
            str4 = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        int i3 = 2;
        java.lang.String str6 = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
        int i4 = 1;
        if (str5 != null) {
            if (AMEXKernel.contains(str4) && !str5.contains(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                try {
                    str5 = androidx.exifinterface.media.ExifInterface.Rational.getHighSpeedVideoFpsRanges(java.lang.Double.parseDouble(str2)).toString();
                } catch (java.lang.NumberFormatException unused) {
                    return;
                }
            } else if (str4.equals(TAG_GPS_TIMESTAMP)) {
                java.util.regex.Matcher matcher = getOutputStallDuration.matcher(str5);
                if (!matcher.find()) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(java.lang.Integer.parseInt(matcher.group(1)));
                sb.append("/1,");
                sb.append(java.lang.Integer.parseInt(matcher.group(2)));
                sb.append("/1,");
                sb.append(java.lang.Integer.parseInt(matcher.group(3)));
                sb.append("/1");
                str5 = sb.toString();
            } else if (TAG_DATETIME.equals(str4) || TAG_DATETIME_ORIGINAL.equals(str4) || TAG_DATETIME_DIGITIZED.equals(str4)) {
                boolean find = getOutputMinFrameDuration.matcher(str5).find();
                boolean find2 = getHighSpeedVideoSizesFor.matcher(str5).find();
                if (str2.length() != 19) {
                    return;
                }
                if (!find && !find2) {
                    return;
                }
                if (find2) {
                    str5 = str5.replaceAll("-", io.ktor.sse.ServerSentEventKt.COLON);
                }
            }
        }
        if (TAG_XMP.equals(str4)) {
            boolean z = this.version[0].containsKey(TAG_XMP) || this.version[5].containsKey(TAG_XMP);
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.apply);
            if ((highResolutionOutputSizeshNQ4ISI == 2 && (this.TransactionOutcomeDecoderExternalSyntheticLambda7 != null || !z)) || (highResolutionOutputSizeshNQ4ISI == 3 && !z)) {
                this.TransactionOutcomeDecoderExternalSyntheticLambda7 = str5 != null ? androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(str5) : null;
                return;
            }
        }
        int i5 = 0;
        while (i5 < getHighSpeedVideoFpsRangesFor.length) {
            if ((i5 != 4 || this.BerTlvEncoder) && (exifTag = rsaCipher[i5].get(str4)) != null) {
                if (str5 == null) {
                    this.version[i5].remove(str4);
                } else {
                    android.util.Pair<java.lang.Integer, java.lang.Integer> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(str5);
                    if (exifTag.getHighResolutionOutputSizeshNQ4ISI == ((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.first).intValue() || exifTag.getHighResolutionOutputSizeshNQ4ISI == ((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.second).intValue()) {
                        i = exifTag.getHighResolutionOutputSizeshNQ4ISI;
                    } else if (exifTag.getHighSpeedVideoFpsRangesFor != -1 && (exifTag.getHighSpeedVideoFpsRangesFor == ((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.first).intValue() || exifTag.getHighSpeedVideoFpsRangesFor == ((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.second).intValue())) {
                        i = exifTag.getHighSpeedVideoFpsRangesFor;
                    } else if (exifTag.getHighResolutionOutputSizeshNQ4ISI == i4 || exifTag.getHighResolutionOutputSizeshNQ4ISI == 7 || exifTag.getHighResolutionOutputSizeshNQ4ISI == i3) {
                        i = exifTag.getHighResolutionOutputSizeshNQ4ISI;
                    } else if (getInputSizeshNQ4ISI) {
                        java.lang.String[] strArr = ArtificialStackFrames;
                        java.lang.String str7 = strArr[exifTag.getHighResolutionOutputSizeshNQ4ISI];
                        if (exifTag.getHighSpeedVideoFpsRangesFor != -1) {
                            java.lang.String str8 = strArr[exifTag.getHighSpeedVideoFpsRangesFor];
                        }
                        java.lang.String str9 = strArr[((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.first).intValue()];
                        if (((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.second).intValue() != -1) {
                            java.lang.String str10 = strArr[((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.second).intValue()];
                        }
                    }
                    switch (i) {
                        case 1:
                            str3 = str6;
                            i2 = i4;
                            this.version[i5].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(str5));
                            break;
                        case 2:
                        case 7:
                            str3 = str6;
                            i2 = i4;
                            this.version[i5].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighResolutionOutputSizeshNQ4ISI(str5));
                            break;
                        case 3:
                            str3 = str6;
                            i2 = i4;
                            java.lang.String[] split = str5.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i6 = 0; i6 < split.length; i6++) {
                                iArr[i6] = java.lang.Integer.parseInt(split[i6]);
                            }
                            this.version[i5].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighResolutionOutputSizeshNQ4ISI(iArr, this.newContext));
                            break;
                        case 4:
                            str3 = str6;
                            i2 = i4;
                            java.lang.String[] split2 = str5.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i7 = 0; i7 < split2.length; i7++) {
                                jArr[i7] = java.lang.Long.parseLong(split2[i7]);
                            }
                            this.version[i5].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.Camera2StreamConfigurationMap(jArr, this.newContext));
                            break;
                        case 5:
                            java.lang.String[] split3 = str5.split(",", -1);
                            androidx.exifinterface.media.ExifInterface.Rational[] rationalArr = new androidx.exifinterface.media.ExifInterface.Rational[split3.length];
                            int i8 = 0;
                            while (i8 < split3.length) {
                                java.lang.String[] split4 = split3[i8].split(str6, -1);
                                rationalArr[i8] = new androidx.exifinterface.media.ExifInterface.Rational((long) java.lang.Double.parseDouble(split4[0]), (long) java.lang.Double.parseDouble(split4[1]), (byte) 0);
                                i8++;
                                str6 = str6;
                            }
                            str3 = str6;
                            i2 = 1;
                            this.version[i5].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRanges(rationalArr, this.newContext));
                            break;
                        case 9:
                            java.lang.String[] split5 = str5.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i9 = 0; i9 < split5.length; i9++) {
                                iArr2[i9] = java.lang.Integer.parseInt(split5[i9]);
                            }
                            this.version[i5].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRanges(iArr2, this.newContext));
                            str3 = str6;
                            i2 = 1;
                            break;
                        case 10:
                            java.lang.String[] split6 = str5.split(",", -1);
                            androidx.exifinterface.media.ExifInterface.Rational[] rationalArr2 = new androidx.exifinterface.media.ExifInterface.Rational[split6.length];
                            int i10 = 0;
                            while (i10 < split6.length) {
                                java.lang.String[] split7 = split6[i10].split(str6, -1);
                                rationalArr2[i10] = new androidx.exifinterface.media.ExifInterface.Rational((long) java.lang.Double.parseDouble(split7[0]), (long) java.lang.Double.parseDouble(split7[i4]), (byte) 0);
                                i10++;
                                split6 = split6;
                                i4 = 1;
                            }
                            this.version[i5].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(rationalArr2, this.newContext));
                            str3 = str6;
                            i2 = 1;
                            break;
                        case 12:
                            java.lang.String[] split8 = str5.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i11 = 0; i11 < split8.length; i11++) {
                                dArr[i11] = java.lang.Double.parseDouble(split8[i11]);
                            }
                            this.version[i5].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(dArr, this.newContext));
                            break;
                    }
                    i5++;
                    i4 = i2;
                    str6 = str3;
                    i3 = 2;
                }
            }
            str3 = str6;
            i2 = i4;
            i5++;
            i4 = i2;
            str6 = str3;
            i3 = 2;
        }
    }

    public void resetOrientation() {
        setAttribute(TAG_ORIENTATION, java.lang.Integer.toString(1));
    }

    public void rotate(int i) {
        if (i % 90 != 0) {
            throw new java.lang.IllegalArgumentException("degree should be a multiple of 90");
        }
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        java.util.List<java.lang.Integer> list = c;
        if (list.contains(java.lang.Integer.valueOf(attributeInt))) {
            int indexOf = (list.indexOf(java.lang.Integer.valueOf(attributeInt)) + (i / 90)) % 4;
            r4 = list.get(indexOf + (indexOf < 0 ? 4 : 0)).intValue();
        } else {
            java.util.List<java.lang.Integer> list2 = getOutputStallDurationlomOqCM;
            if (list2.contains(java.lang.Integer.valueOf(attributeInt))) {
                int indexOf2 = (list2.indexOf(java.lang.Integer.valueOf(attributeInt)) + (i / 90)) % 4;
                r4 = list2.get(indexOf2 + (indexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        setAttribute(TAG_ORIENTATION, java.lang.Integer.toString(r4));
    }

    public void flipVertically() {
        int i = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
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
                i = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, java.lang.Integer.toString(i));
    }

    public void flipHorizontally() {
        int i = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
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
                i = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, java.lang.Integer.toString(i));
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 3:
            case 4:
                return com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    private void getHighSpeedVideoSizes(java.io.InputStream inputStream) {
        boolean z;
        for (int i = 0; i < getHighSpeedVideoFpsRangesFor.length; i++) {
            try {
                try {
                    this.version[i] = new java.util.HashMap<>();
                } catch (java.io.IOException | java.lang.UnsupportedOperationException unused) {
                    boolean z2 = getInputSizeshNQ4ISI;
                    getHighResolutionOutputSizeshNQ4ISI();
                    if (z2) {
                        getOutputMinFrameDuration();
                        return;
                    }
                    return;
                }
            } finally {
                getHighResolutionOutputSizeshNQ4ISI();
                if (getInputSizeshNQ4ISI) {
                    getOutputMinFrameDuration();
                }
            }
        }
        if (!this.aid) {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream, 5000);
            java.io.BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            this.apply = getHighSpeedVideoSizes(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.apply;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream = new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(inputStream);
            int i3 = this.apply;
            if (i3 == 4) {
                getHighSpeedVideoFpsRanges(byteOrderedDataInputStream, 0, 0);
            } else if (i3 == 13) {
                getHighSpeedVideoFpsRanges(byteOrderedDataInputStream);
            } else if (i3 == 9) {
                getHighResolutionOutputSizeshNQ4ISI(byteOrderedDataInputStream);
            } else if (i3 == 14) {
                Camera2StreamConfigurationMap(byteOrderedDataInputStream);
            }
        } else {
            androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream(inputStream);
            if (!this.aid) {
                int i4 = this.apply;
                if (i4 == 12 || i4 == 15) {
                    getHighSpeedVideoFpsRanges(seekableByteOrderedDataInputStream, i4);
                } else if (i4 == 7) {
                    Camera2StreamConfigurationMap(seekableByteOrderedDataInputStream);
                } else if (i4 == 10) {
                    getHighResolutionOutputSizeshNQ4ISI(seekableByteOrderedDataInputStream);
                } else {
                    getHighSpeedVideoFpsRangesFor(seekableByteOrderedDataInputStream);
                }
            } else if (!getHighSpeedVideoSizes(seekableByteOrderedDataInputStream)) {
                if (z) {
                    return;
                } else {
                    return;
                }
            }
            seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(this.decode);
            getInputSizeshNQ4ISI(seekableByteOrderedDataInputStream);
        }
        getHighResolutionOutputSizeshNQ4ISI();
        if (getInputSizeshNQ4ISI) {
            getOutputMinFrameDuration();
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(java.io.FileDescriptor fileDescriptor) {
        try {
            android.system.Os.lseek(fileDescriptor, 0L, android.system.OsConstants.SEEK_CUR);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private void getOutputMinFrameDuration() {
        int i = 0;
        while (true) {
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] hashMapArr = this.version;
            if (i >= hashMapArr.length) {
                return;
            }
            hashMapArr[i].size();
            for (java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> entry : this.version[i].entrySet()) {
                androidx.exifinterface.media.ExifInterface.ExifAttribute value = entry.getValue();
                entry.getKey();
                value.Camera2StreamConfigurationMap(this.newContext);
            }
            i++;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0622: MOVE (r13 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:359:0x0621 */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x0624: MOVE (r4 I:??[OBJECT, ARRAY]) = (r23 I:??[OBJECT, ARRAY]), block:B:359:0x0621 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x02e5 -> B:58:0x031d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void saveAttributes() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.saveAttributes():void");
    }

    public boolean hasThumbnail() {
        return this.BerTlvEncoder;
    }

    public boolean hasAttribute(java.lang.String str) {
        return getHighSpeedVideoFpsRanges(str) != null;
    }

    public byte[] getThumbnail() {
        int i = this.TransactionOutcomeDecoderExternalSyntheticLambda3;
        if (i == 6 || i == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x001d, Exception -> 0x0087, TRY_ENTER, TryCatch #1 {Exception -> 0x0087, blocks: (B:27:0x004a, B:17:0x006e, B:18:0x0073), top: B:15:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] getThumbnailBytes() {
        java.lang.Throwable th;
        java.io.FileDescriptor fileDescriptor;
        java.io.InputStream inputStream;
        java.io.FileDescriptor fileDescriptor2;
        java.io.InputStream inputStream2 = null;
        if (!this.BerTlvEncoder) {
            return null;
        }
        byte[] bArr = this.TransactionOutcomeDecoderExternalSyntheticLambda2;
        if (bArr != null) {
            return bArr;
        }
        try {
            inputStream = this.setup;
            try {
                if (inputStream != null) {
                    try {
                        try {
                            if (!inputStream.markSupported()) {
                                androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream);
                                return null;
                            }
                            inputStream.reset();
                        } catch (java.lang.Exception unused) {
                            fileDescriptor2 = 0;
                            androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream);
                            if (fileDescriptor2 != 0) {
                            }
                            return null;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        java.io.InputStream inputStream3 = inputStream2;
                        inputStream2 = inputStream;
                        fileDescriptor = inputStream3;
                        androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream2);
                        if (fileDescriptor != 0) {
                        }
                        throw th;
                    }
                } else {
                    if (this.encode == null) {
                        fileDescriptor = android.system.Os.dup(this.TransactionOutcomeDecoderExternalSyntheticLambda4);
                        try {
                            android.system.Os.lseek(fileDescriptor, 0L, android.system.OsConstants.SEEK_SET);
                            fileDescriptor2 = fileDescriptor;
                            inputStream = new java.io.FileInputStream(fileDescriptor);
                            if (inputStream != null) {
                                throw new java.io.FileNotFoundException();
                            }
                            try {
                                androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream = new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(inputStream);
                                byteOrderedDataInputStream.getHighSpeedVideoSizes(this.values + this.decode);
                                byte[] bArr2 = new byte[this.TransactionOutcomeDecoderExternalSyntheticLambda5];
                                byteOrderedDataInputStream.readFully(bArr2);
                                this.TransactionOutcomeDecoderExternalSyntheticLambda2 = bArr2;
                                androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream);
                                if (fileDescriptor2 != 0) {
                                    androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoFpsRanges(fileDescriptor2);
                                }
                                return bArr2;
                            } catch (java.lang.Throwable th3) {
                                java.io.InputStream inputStream4 = fileDescriptor2;
                                th = th3;
                                inputStream2 = inputStream4;
                                java.io.InputStream inputStream32 = inputStream2;
                                inputStream2 = inputStream;
                                fileDescriptor = inputStream32;
                                androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream2);
                                if (fileDescriptor != 0) {
                                    androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoFpsRanges(fileDescriptor);
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception unused2) {
                            fileDescriptor2 = fileDescriptor;
                            inputStream = null;
                            androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream);
                            if (fileDescriptor2 != 0) {
                            }
                            return null;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream2);
                            if (fileDescriptor != 0) {
                            }
                            throw th;
                        }
                    }
                    inputStream = new java.io.FileInputStream(this.encode);
                }
                if (inputStream != null) {
                }
            } catch (java.lang.Exception unused3) {
                androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream);
                if (fileDescriptor2 != 0) {
                    androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoFpsRanges(fileDescriptor2);
                }
                return null;
            }
            fileDescriptor2 = 0;
        } catch (java.lang.Exception unused4) {
            inputStream = null;
            fileDescriptor2 = 0;
        } catch (java.lang.Throwable th5) {
            th = th5;
            fileDescriptor = 0;
        }
    }

    public android.graphics.Bitmap getThumbnailBitmap() {
        if (!this.BerTlvEncoder) {
            return null;
        }
        if (this.TransactionOutcomeDecoderExternalSyntheticLambda2 == null) {
            this.TransactionOutcomeDecoderExternalSyntheticLambda2 = getThumbnailBytes();
        }
        int i = this.TransactionOutcomeDecoderExternalSyntheticLambda3;
        if (i == 6 || i == 7) {
            return android.graphics.BitmapFactory.decodeByteArray(this.TransactionOutcomeDecoderExternalSyntheticLambda2, 0, this.TransactionOutcomeDecoderExternalSyntheticLambda5);
        }
        if (i == 1) {
            int length = this.TransactionOutcomeDecoderExternalSyntheticLambda2.length / 3;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr = this.TransactionOutcomeDecoderExternalSyntheticLambda2;
                int i3 = i2 * 3;
                iArr[i2] = (bArr[i3] << 16) + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
            }
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.version[4].get(TAG_THUMBNAIL_IMAGE_LENGTH);
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.version[4].get(TAG_THUMBNAIL_IMAGE_WIDTH);
            if (exifAttribute != null && exifAttribute2 != null) {
                return android.graphics.Bitmap.createBitmap(iArr, exifAttribute2.getHighSpeedVideoFpsRanges(this.newContext), exifAttribute.getHighSpeedVideoFpsRanges(this.newContext), android.graphics.Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    public boolean isThumbnailCompressed() {
        if (!this.BerTlvEncoder) {
            return false;
        }
        int i = this.TransactionOutcomeDecoderExternalSyntheticLambda3;
        return i == 6 || i == 7;
    }

    public long[] getThumbnailRange() {
        if (this.TransactionOutcomeDecoderExternalSyntheticLambda0) {
            throw new java.lang.IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.BerTlvEncoder) {
            return null;
        }
        if (!this.provide || this.AMEXKernelProvider) {
            return new long[]{this.values + this.decode, this.TransactionOutcomeDecoderExternalSyntheticLambda5};
        }
        return null;
    }

    public long[] getAttributeRange(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        if (this.TransactionOutcomeDecoderExternalSyntheticLambda0) {
            throw new java.lang.IllegalStateException("The underlying file has been modified since being parsed");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if (highSpeedVideoFpsRanges != null) {
            return new long[]{highSpeedVideoFpsRanges.getHighSpeedVideoSizes, highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor.length};
        }
        return null;
    }

    public byte[] getAttributeBytes(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if (highSpeedVideoFpsRanges != null) {
            return highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    @java.lang.Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public double[] getLatLong() {
        java.lang.String attribute = getAttribute(TAG_GPS_LATITUDE);
        java.lang.String attribute2 = getAttribute(TAG_GPS_LATITUDE_REF);
        java.lang.String attribute3 = getAttribute(TAG_GPS_LONGITUDE);
        java.lang.String attribute4 = getAttribute(TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{getHighSpeedVideoSizes(attribute, attribute2), getHighSpeedVideoSizes(attribute3, attribute4)};
        } catch (java.lang.IllegalArgumentException unused) {
            new java.lang.Object[]{attribute, attribute2, attribute3, attribute4};
            return null;
        }
    }

    public void setGpsInfo(android.location.Location location) {
        if (location == null) {
            return;
        }
        setAttribute(TAG_GPS_PROCESSING_METHOD, location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute(TAG_GPS_SPEED_REF, "K");
        setAttribute(TAG_GPS_SPEED, androidx.exifinterface.media.ExifInterface.Rational.getHighSpeedVideoFpsRanges((location.getSpeed() * java.util.concurrent.TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        java.lang.String[] split = AMEXKernelJNI.format(new java.util.Date(location.getTime())).split("\\s+", -1);
        setAttribute(TAG_GPS_DATESTAMP, split[0]);
        setAttribute(TAG_GPS_TIMESTAMP, split[1]);
    }

    public void setLatLong(double d2, double d3) {
        if (d2 < -90.0d || d2 > 90.0d || java.lang.Double.isNaN(d2)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Latitude value ");
            sb.append(d2);
            sb.append(" is not valid.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (d3 < -180.0d || d3 > 180.0d || java.lang.Double.isNaN(d3)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Longitude value ");
            sb2.append(d3);
            sb2.append(" is not valid.");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        setAttribute(TAG_GPS_LATITUDE_REF, d2 >= 0.0d ? "N" : "S");
        setAttribute(TAG_GPS_LATITUDE, getHighSpeedVideoFpsRangesFor(java.lang.Math.abs(d2)));
        setAttribute(TAG_GPS_LONGITUDE_REF, d3 >= 0.0d ? "E" : "W");
        setAttribute(TAG_GPS_LONGITUDE, getHighSpeedVideoFpsRangesFor(java.lang.Math.abs(d3)));
    }

    public double getAltitude(double d2) {
        double attributeDouble = getAttributeDouble(TAG_GPS_ALTITUDE, -1.0d);
        int attributeInt = getAttributeInt(TAG_GPS_ALTITUDE_REF, -1);
        if (attributeDouble < 0.0d || attributeInt < 0) {
            return d2;
        }
        return attributeDouble * (attributeInt != 1 ? 1 : -1);
    }

    public void setAltitude(double d2) {
        java.lang.String str = d2 >= 0.0d ? "0" : "1";
        setAttribute(TAG_GPS_ALTITUDE, androidx.exifinterface.media.ExifInterface.Rational.getHighSpeedVideoFpsRanges(java.lang.Math.abs(d2)).toString());
        setAttribute(TAG_GPS_ALTITUDE_REF, str);
    }

    public void setDateTime(java.lang.Long l2) {
        if (l2 == null) {
            throw new java.lang.NullPointerException("Timestamp should not be null.");
        }
        if (l2.longValue() < 0) {
            throw new java.lang.IllegalArgumentException("Timestamp should a positive value.");
        }
        java.lang.String l3 = java.lang.Long.toString(l2.longValue() % 1000);
        for (int length = l3.length(); length < 3; length++) {
            l3 = "0".concat(java.lang.String.valueOf(l3));
        }
        setAttribute(TAG_DATETIME, AMEXKernelJNI.format(new java.util.Date(l2.longValue())));
        setAttribute(TAG_SUBSEC_TIME, l3);
    }

    public java.lang.Long getDateTime() {
        return getHighResolutionOutputSizeshNQ4ISI(getAttribute(TAG_DATETIME), getAttribute(TAG_SUBSEC_TIME), getAttribute(TAG_OFFSET_TIME));
    }

    public java.lang.Long getDateTimeDigitized() {
        return getHighResolutionOutputSizeshNQ4ISI(getAttribute(TAG_DATETIME_DIGITIZED), getAttribute(TAG_SUBSEC_TIME_DIGITIZED), getAttribute(TAG_OFFSET_TIME_DIGITIZED));
    }

    public java.lang.Long getDateTimeOriginal() {
        return getHighResolutionOutputSizeshNQ4ISI(getAttribute(TAG_DATETIME_ORIGINAL), getAttribute(TAG_SUBSEC_TIME_ORIGINAL), getAttribute(TAG_OFFSET_TIME_ORIGINAL));
    }

    private static java.lang.Long getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str != null && f2736a.matcher(str).matches()) {
            java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
            try {
                java.util.Date parse = AMEXKernelJNI.parse(str, parsePosition);
                if (parse == null && (parse = sha1.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = parse.getTime();
                if (str3 != null) {
                    int i = 1;
                    java.lang.String substring = str3.substring(0, 1);
                    int parseInt = java.lang.Integer.parseInt(str3.substring(1, 3));
                    int parseInt2 = java.lang.Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(substring) || "-".equals(substring)) && io.ktor.sse.ServerSentEventKt.COLON.equals(str3.substring(3, 4)) && parseInt <= 14) {
                        if (!"-".equals(substring)) {
                            i = -1;
                        }
                        time += ((parseInt * 60) + parseInt2) * 60000 * i;
                    }
                }
                if (str2 != null) {
                    time += androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(str2);
                }
                return java.lang.Long.valueOf(time);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public java.lang.Long getGpsDateTime() {
        java.lang.String attribute = getAttribute(TAG_GPS_DATESTAMP);
        java.lang.String attribute2 = getAttribute(TAG_GPS_TIMESTAMP);
        if (attribute != null && attribute2 != null) {
            java.util.regex.Pattern pattern = f2736a;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(attribute);
                sb.append(' ');
                sb.append(attribute2);
                java.lang.String obj = sb.toString();
                java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
                try {
                    java.util.Date parse = AMEXKernelJNI.parse(obj, parsePosition);
                    if (parse == null && (parse = sha1.parse(obj, parsePosition)) == null) {
                        return null;
                    }
                    return java.lang.Long.valueOf(parse.getTime());
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    private void Camera2StreamConfigurationMap(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            throw new java.lang.NullPointerException("filename cannot be null");
        }
        java.io.FileInputStream fileInputStream = null;
        this.setup = null;
        this.encode = str;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(str);
            try {
                if (getHighSpeedVideoFpsRanges(fileInputStream2.getFD())) {
                    this.TransactionOutcomeDecoderExternalSyntheticLambda4 = fileInputStream2.getFD();
                } else {
                    this.TransactionOutcomeDecoderExternalSyntheticLambda4 = null;
                }
                getHighSpeedVideoSizes(fileInputStream2);
                androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(fileInputStream2);
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(fileInputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static double getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String[] split = str.split(",", -1);
            java.lang.String[] split2 = split[0].split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, -1);
            double parseDouble = java.lang.Double.parseDouble(split2[0].trim()) / java.lang.Double.parseDouble(split2[1].trim());
            java.lang.String[] split3 = split[1].split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, -1);
            double parseDouble2 = java.lang.Double.parseDouble(split3[0].trim()) / java.lang.Double.parseDouble(split3[1].trim());
            java.lang.String[] split4 = split[2].split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((java.lang.Double.parseDouble(split4[0].trim()) / java.lang.Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new java.lang.IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NumberFormatException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(double d2) {
        long j = (long) d2;
        double d3 = d2 - j;
        long j2 = (long) (d3 * 60.0d);
        long round = java.lang.Math.round((d3 - (j2 / 60.0d)) * 3600.0d * 1.0E7d);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j);
        sb.append("/1,");
        sb.append(j2);
        sb.append("/1,");
        sb.append(round);
        sb.append("/10000000");
        return sb.toString();
    }

    private int getHighSpeedVideoSizes(java.io.BufferedInputStream bufferedInputStream) throws java.io.IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = Camera2StreamConfigurationMap;
            if (i >= bArr2.length) {
                return 4;
            }
            if (bArr[i] != bArr2[i]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
                for (int i2 = 0; i2 < bytes.length; i2++) {
                    if (bArr[i2] != bytes[i2]) {
                        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
                        if (highSpeedVideoFpsRanges != 0) {
                            return highSpeedVideoFpsRanges;
                        }
                        if (Camera2StreamConfigurationMap(bArr)) {
                            return 7;
                        }
                        if (getHighSpeedVideoFpsRangesFor(bArr)) {
                            return 10;
                        }
                        int i3 = 0;
                        while (true) {
                            byte[] bArr3 = d;
                            if (i3 >= bArr3.length) {
                                return 13;
                            }
                            if (bArr[i3] != bArr3[i3]) {
                                int i4 = 0;
                                while (true) {
                                    byte[] bArr4 = AMEXKernelCallback;
                                    if (i4 >= bArr4.length) {
                                        int i5 = 0;
                                        while (true) {
                                            byte[] bArr5 = requestPINEntry;
                                            if (i5 >= bArr5.length) {
                                                return 14;
                                            }
                                            if (bArr[AMEXKernelCallback.length + i5 + 4] != bArr5[i5]) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    } else {
                                        if (bArr[i4] != bArr4[i4]) {
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                                return 0;
                            }
                            i3++;
                        }
                    }
                }
                return 9;
            }
            i++;
        }
    }

    private static int getHighSpeedVideoFpsRanges(byte[] bArr) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream;
        long readInt;
        byte[] bArr2;
        long j;
        androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream2 = null;
        try {
            byteOrderedDataInputStream = new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(bArr);
            try {
                readInt = byteOrderedDataInputStream.readInt();
                bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
            } catch (java.lang.Exception unused) {
                byteOrderedDataInputStream2 = byteOrderedDataInputStream;
                if (byteOrderedDataInputStream2 != null) {
                    byteOrderedDataInputStream2.close();
                }
                return 0;
            } catch (java.lang.Throwable th) {
                th = th;
                byteOrderedDataInputStream2 = byteOrderedDataInputStream;
                if (byteOrderedDataInputStream2 != null) {
                    byteOrderedDataInputStream2.close();
                }
                throw th;
            }
        } catch (java.lang.Exception unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        if (!java.util.Arrays.equals(bArr2, toString)) {
            byteOrderedDataInputStream.close();
            return 0;
        }
        if (readInt == 1) {
            readInt = byteOrderedDataInputStream.readLong();
            j = 16;
            if (readInt < 16) {
                byteOrderedDataInputStream.close();
                return 0;
            }
        } else {
            j = 8;
        }
        int length = bArr.length;
        if (readInt > 5000) {
            int length2 = bArr.length;
            readInt = 5000;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            byteOrderedDataInputStream.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            try {
                byteOrderedDataInputStream.readFully(bArr3);
                if (j3 != 1) {
                    if (java.util.Arrays.equals(bArr3, isOutputSupportedFor)) {
                        z3 = true;
                    } else if (java.util.Arrays.equals(bArr3, getOutputMinFrameDurationlomOqCM)) {
                        z2 = true;
                    } else if (java.util.Arrays.equals(bArr3, getOutputSizes) || java.util.Arrays.equals(bArr3, getOutputSizeshNQ4ISI)) {
                        z = true;
                    }
                    if (!z3) {
                        continue;
                    } else {
                        if (z2) {
                            byteOrderedDataInputStream.close();
                            return 12;
                        }
                        if (z) {
                            byteOrderedDataInputStream.close();
                            return 15;
                        }
                    }
                }
            } catch (java.io.EOFException unused3) {
                byteOrderedDataInputStream.close();
                return 0;
            }
        }
        byteOrderedDataInputStream.close();
        return 0;
    }

    private boolean Camera2StreamConfigurationMap(byte[] bArr) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream = null;
        try {
            androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream2 = new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(bArr);
            try {
                java.nio.ByteOrder highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(byteOrderedDataInputStream2);
                this.newContext = highSpeedVideoFpsRangesFor;
                byteOrderedDataInputStream2.getHighSpeedVideoSizes = highSpeedVideoFpsRangesFor;
                short readShort = byteOrderedDataInputStream2.readShort();
                boolean z = readShort == 20306 || readShort == 21330;
                byteOrderedDataInputStream2.close();
                return z;
            } catch (java.lang.Exception unused) {
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                return false;
            } catch (java.lang.Throwable th) {
                th = th;
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Exception unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(byte[] bArr) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream = null;
        try {
            androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream2 = new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(bArr);
            try {
                java.nio.ByteOrder highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(byteOrderedDataInputStream2);
                this.newContext = highSpeedVideoFpsRangesFor;
                byteOrderedDataInputStream2.getHighSpeedVideoSizes = highSpeedVideoFpsRangesFor;
                boolean z = byteOrderedDataInputStream2.readShort() == 85;
                byteOrderedDataInputStream2.close();
                return z;
            } catch (java.lang.Exception unused) {
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                return false;
            } catch (java.lang.Throwable th) {
                th = th;
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Exception unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        r18.getHighSpeedVideoSizes = r17.newContext;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9 A[LOOP:0: B:6:0x001c->B:27:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRanges(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream, int i, int i2) throws java.io.IOException {
        byteOrderedDataInputStream.getHighSpeedVideoSizes = java.nio.ByteOrder.BIG_ENDIAN;
        byte readByte = byteOrderedDataInputStream.readByte();
        if (readByte != -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid marker: ");
            sb.append(java.lang.Integer.toHexString(readByte & 255));
            throw new java.io.IOException(sb.toString());
        }
        if (byteOrderedDataInputStream.readByte() != -40) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid marker: ");
            sb2.append(java.lang.Integer.toHexString(readByte & 255));
            throw new java.io.IOException(sb2.toString());
        }
        int i3 = 2;
        while (true) {
            byte readByte2 = byteOrderedDataInputStream.readByte();
            if (readByte2 != -1) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid marker:");
                sb3.append(java.lang.Integer.toHexString(readByte2 & 255));
                throw new java.io.IOException(sb3.toString());
            }
            while (true) {
                byte readByte3 = byteOrderedDataInputStream.readByte();
                if (readByte3 == -1) {
                    i3++;
                } else if (readByte3 != -39 && readByte3 != -38) {
                    int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
                    int i4 = readUnsignedShort - 2;
                    int i5 = i3 + 4;
                    if (i4 < 0) {
                        throw new java.io.IOException("Invalid length");
                    }
                    if (readByte3 == -31) {
                        byte[] bArr = new byte[i4];
                        byteOrderedDataInputStream.readFully(bArr);
                        byte[] bArr2 = getHighSpeedVideoSizes;
                        if (androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoFpsRangesFor(bArr, bArr2)) {
                            byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, bArr2.length, i4);
                            this.decode = i + i5 + bArr2.length;
                            androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream(copyOfRange);
                            getHighSpeedVideoSizes((androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream) seekableByteOrderedDataInputStream);
                            getHighSpeedVideoSizes(seekableByteOrderedDataInputStream, i2);
                            getInputSizeshNQ4ISI(new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(copyOfRange));
                        } else {
                            byte[] bArr3 = getValidOutputFormatsForInputhNQ4ISI;
                            if (androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoFpsRangesFor(bArr, bArr3)) {
                                int length = bArr3.length;
                                byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr, bArr3.length, i4);
                                this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.exifinterface.media.ExifInterface.ExifAttribute(1, copyOfRange2.length, length + i5, copyOfRange2);
                                this.kernelID = true;
                            }
                        }
                        i5 += i4;
                    } else if (readByte3 == -2) {
                        byte[] bArr4 = new byte[i4];
                        byteOrderedDataInputStream.readFully(bArr4);
                        if (getAttribute(TAG_USER_COMMENT) == null) {
                            this.version[1].put(TAG_USER_COMMENT, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighResolutionOutputSizeshNQ4ISI(new java.lang.String(bArr4, getHighSpeedVideoFpsRanges)));
                        }
                    } else {
                        switch (readByte3) {
                            case -64:
                            case -63:
                            case -62:
                            case -61:
                                break;
                            default:
                                switch (readByte3) {
                                    case -59:
                                    case -58:
                                    case -57:
                                        break;
                                    default:
                                        switch (readByte3) {
                                            case -55:
                                            case -54:
                                            case -53:
                                                break;
                                            default:
                                                switch (readByte3) {
                                                }
                                        }
                                }
                        }
                        byteOrderedDataInputStream.getHighSpeedVideoSizes(1);
                        this.version[i2].put(i2 != 4 ? TAG_IMAGE_LENGTH : TAG_THUMBNAIL_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(byteOrderedDataInputStream.readUnsignedShort(), this.newContext));
                        this.version[i2].put(i2 != 4 ? TAG_IMAGE_WIDTH : TAG_THUMBNAIL_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(byteOrderedDataInputStream.readUnsignedShort(), this.newContext));
                        i4 = readUnsignedShort - 7;
                        if (i4 >= 0) {
                            throw new java.io.IOException("Invalid length");
                        }
                        byteOrderedDataInputStream.getHighSpeedVideoSizes(i4);
                        i3 = i5 + i4;
                    }
                    i4 = 0;
                    if (i4 >= 0) {
                    }
                }
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute;
        getHighSpeedVideoSizes((androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream) seekableByteOrderedDataInputStream);
        getHighSpeedVideoSizes(seekableByteOrderedDataInputStream, 0);
        getHighSpeedVideoFpsRangesFor(seekableByteOrderedDataInputStream, 0);
        getHighSpeedVideoFpsRangesFor(seekableByteOrderedDataInputStream, 5);
        getHighSpeedVideoFpsRangesFor(seekableByteOrderedDataInputStream, 4);
        getHighSpeedVideoSizesFor();
        if (this.apply != 8 || (exifAttribute = this.version[1].get(TAG_MAKER_NOTE)) == null) {
            return;
        }
        androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream(exifAttribute.getHighSpeedVideoFpsRangesFor);
        seekableByteOrderedDataInputStream2.getHighSpeedVideoSizes = this.newContext;
        seekableByteOrderedDataInputStream2.getHighSpeedVideoSizes(6);
        getHighSpeedVideoSizes(seekableByteOrderedDataInputStream2, 9);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.version[9].get(TAG_COLOR_SPACE);
        if (exifAttribute2 != null) {
            this.version[1].put(TAG_COLOR_SPACE, exifAttribute2);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream) throws java.io.IOException {
        byteOrderedDataInputStream.getHighSpeedVideoSizes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.readFully(bArr);
        byteOrderedDataInputStream.readFully(bArr2);
        byteOrderedDataInputStream.readFully(bArr3);
        int i = java.nio.ByteBuffer.wrap(bArr).getInt();
        int i2 = java.nio.ByteBuffer.wrap(bArr2).getInt();
        int i3 = java.nio.ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        byteOrderedDataInputStream.getHighSpeedVideoSizes(i - byteOrderedDataInputStream.Camera2StreamConfigurationMap());
        byteOrderedDataInputStream.readFully(bArr4);
        getHighSpeedVideoFpsRanges(new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(bArr4), i, 5);
        byteOrderedDataInputStream.getHighSpeedVideoSizes(i3 - byteOrderedDataInputStream.Camera2StreamConfigurationMap());
        byteOrderedDataInputStream.getHighSpeedVideoSizes = java.nio.ByteOrder.BIG_ENDIAN;
        int readInt = byteOrderedDataInputStream.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (readUnsignedShort == AMEXKernela.getHighSpeedVideoSizes) {
                short readShort = byteOrderedDataInputStream.readShort();
                short readShort2 = byteOrderedDataInputStream.readShort();
                androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor((int) readShort, this.newContext);
                androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor((int) readShort2, this.newContext);
                this.version[0].put(TAG_IMAGE_LENGTH, highSpeedVideoFpsRangesFor);
                this.version[0].put(TAG_IMAGE_WIDTH, highSpeedVideoFpsRangesFor2);
                return;
            }
            byteOrderedDataInputStream.getHighSpeedVideoSizes(readUnsignedShort2);
        }
    }

    private void getHighSpeedVideoFpsRanges(final androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws java.io.IOException {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            if (i == 15 && android.os.Build.VERSION.SDK_INT < 31) {
                throw new java.lang.UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
            }
            android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
            try {
                try {
                    androidx.exifinterface.media.ExifInterfaceUtils.Api23Impl.getHighSpeedVideoFpsRangesFor(mediaMetadataRetriever, new android.media.MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface.1
                        long getHighResolutionOutputSizeshNQ4ISI;

                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws java.io.IOException {
                        }

                        @Override // android.media.MediaDataSource
                        public long getSize() throws java.io.IOException {
                            return -1L;
                        }

                        @Override // android.media.MediaDataSource
                        public int readAt(long j, byte[] bArr, int i2, int i3) throws java.io.IOException {
                            if (i3 == 0) {
                                return 0;
                            }
                            if (j < 0) {
                                return -1;
                            }
                            try {
                                long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                if (j2 != j) {
                                    if (j2 >= 0 && j >= j2 + seekableByteOrderedDataInputStream.available()) {
                                        return -1;
                                    }
                                    seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(j);
                                    this.getHighResolutionOutputSizeshNQ4ISI = j;
                                }
                                if (i3 > seekableByteOrderedDataInputStream.available()) {
                                    i3 = seekableByteOrderedDataInputStream.available();
                                }
                                int read = seekableByteOrderedDataInputStream.read(bArr, i2, i3);
                                if (read >= 0) {
                                    this.getHighResolutionOutputSizeshNQ4ISI += read;
                                    return read;
                                }
                            } catch (java.io.IOException unused) {
                            }
                            this.getHighResolutionOutputSizeshNQ4ISI = -1L;
                            return -1;
                        }
                    });
                    java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    java.lang.String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    java.lang.String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    java.lang.String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str3 = mediaMetadataRetriever.extractMetadata(30);
                        str2 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str3 = mediaMetadataRetriever.extractMetadata(19);
                        str2 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    if (str != null) {
                        this.version[0].put(TAG_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(java.lang.Integer.parseInt(str), this.newContext));
                    }
                    if (str3 != null) {
                        this.version[0].put(TAG_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(java.lang.Integer.parseInt(str3), this.newContext));
                    }
                    if (str2 != null) {
                        int parseInt = java.lang.Integer.parseInt(str2);
                        this.version[0].put(TAG_ORIENTATION, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.newContext));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = java.lang.Integer.parseInt(extractMetadata);
                        int parseInt3 = java.lang.Integer.parseInt(extractMetadata2);
                        if (parseInt3 <= 6) {
                            throw new java.io.IOException("Invalid exif length");
                        }
                        seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(parseInt2);
                        byte[] bArr = new byte[6];
                        seekableByteOrderedDataInputStream.readFully(bArr);
                        if (!java.util.Arrays.equals(bArr, getHighSpeedVideoSizes)) {
                            throw new java.io.IOException("Invalid identifier");
                        }
                        byte[] bArr2 = new byte[parseInt3 - 6];
                        seekableByteOrderedDataInputStream.readFully(bArr2);
                        this.decode = parseInt2 + 6;
                        androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream(bArr2);
                        getHighSpeedVideoSizes((androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream) seekableByteOrderedDataInputStream2);
                        getHighSpeedVideoSizes(seekableByteOrderedDataInputStream2, 0);
                    }
                    java.lang.String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                    java.lang.String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                    if (extractMetadata5 != null && extractMetadata6 != null) {
                        int parseInt4 = java.lang.Integer.parseInt(extractMetadata5);
                        int parseInt5 = java.lang.Integer.parseInt(extractMetadata6);
                        long j = parseInt4;
                        seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(j);
                        byte[] bArr3 = new byte[parseInt5];
                        seekableByteOrderedDataInputStream.readFully(bArr3);
                        this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.exifinterface.media.ExifInterface.ExifAttribute(1, parseInt5, j, bArr3);
                        this.kernelID = true;
                    }
                    try {
                        return;
                    } catch (java.io.IOException unused) {
                        return;
                    }
                } catch (java.lang.RuntimeException e) {
                    throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
                }
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (java.io.IOException unused2) {
                }
            }
        }
        throw new java.lang.UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
    }

    private boolean getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws java.io.IOException {
        byte[] bArr = getHighSpeedVideoSizes;
        byte[] bArr2 = new byte[bArr.length];
        seekableByteOrderedDataInputStream.readFully(bArr2);
        if (!java.util.Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] highSpeedVideoFpsRangesFor = seekableByteOrderedDataInputStream.getHighSpeedVideoFpsRangesFor();
        this.decode = bArr.length;
        androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream(highSpeedVideoFpsRangesFor);
        getHighSpeedVideoSizes((androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream) seekableByteOrderedDataInputStream2);
        getHighSpeedVideoSizes(seekableByteOrderedDataInputStream2, 0);
        return true;
    }

    private void Camera2StreamConfigurationMap(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws java.io.IOException {
        int i;
        int i2;
        getHighSpeedVideoFpsRangesFor(seekableByteOrderedDataInputStream);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.version[1].get(TAG_MAKER_NOTE);
        if (exifAttribute != null) {
            androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream(exifAttribute.getHighSpeedVideoFpsRangesFor);
            seekableByteOrderedDataInputStream2.getHighSpeedVideoSizes = this.newContext;
            byte[] bArr = b;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.getHighResolutionOutputSizeshNQ4ISI(0L);
            byte[] bArr3 = _CREATION;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (java.util.Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.getHighResolutionOutputSizeshNQ4ISI(8L);
            } else if (java.util.Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.getHighResolutionOutputSizeshNQ4ISI(12L);
            }
            getHighSpeedVideoSizes(seekableByteOrderedDataInputStream2, 6);
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.version[7].get(TAG_ORF_PREVIEW_IMAGE_START);
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.version[7].get(TAG_ORF_PREVIEW_IMAGE_LENGTH);
            if (exifAttribute2 != null && exifAttribute3 != null) {
                this.version[5].put(TAG_JPEG_INTERCHANGE_FORMAT, exifAttribute2);
                this.version[5].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, exifAttribute3);
            }
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute4 = this.version[8].get(TAG_ORF_ASPECT_FRAME);
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.getHighSpeedVideoSizes(this.newContext);
                if (iArr == null || iArr.length != 4) {
                    java.util.Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(i5, this.newContext);
                androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(i6, this.newContext);
                this.version[0].put(TAG_IMAGE_WIDTH, highSpeedVideoFpsRangesFor);
                this.version[0].put(TAG_IMAGE_LENGTH, highSpeedVideoFpsRangesFor2);
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor(seekableByteOrderedDataInputStream);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.version[0].get(TAG_RW2_JPG_FROM_RAW);
        if (exifAttribute != null) {
            getHighSpeedVideoFpsRanges(new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(exifAttribute.getHighSpeedVideoFpsRangesFor), (int) exifAttribute.getHighSpeedVideoSizes, 5);
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.version[0].get(TAG_RW2_ISO);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.version[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        this.version[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, exifAttribute2);
    }

    private void getHighSpeedVideoFpsRanges(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream) throws java.io.IOException {
        byteOrderedDataInputStream.getHighSpeedVideoSizes = java.nio.ByteOrder.BIG_ENDIAN;
        int Camera2StreamConfigurationMap2 = byteOrderedDataInputStream.Camera2StreamConfigurationMap();
        byteOrderedDataInputStream.getHighSpeedVideoSizes(d.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                break;
            }
            try {
                int readInt = byteOrderedDataInputStream.readInt();
                int readInt2 = byteOrderedDataInputStream.readInt();
                int Camera2StreamConfigurationMap3 = byteOrderedDataInputStream.Camera2StreamConfigurationMap();
                if (byteOrderedDataInputStream.Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2 == 16 && readInt2 != 1229472850) {
                    throw new java.io.IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    break;
                }
                if (readInt2 == 1700284774 && !z) {
                    this.decode = byteOrderedDataInputStream.Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2;
                    byte[] bArr = new byte[readInt];
                    byteOrderedDataInputStream.readFully(bArr);
                    int readInt3 = byteOrderedDataInputStream.readInt();
                    java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                        sb.append(readInt3);
                        sb.append(", calculated CRC value: ");
                        sb.append(crc32.getValue());
                        throw new java.io.IOException(sb.toString());
                    }
                    androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream(bArr);
                    getHighSpeedVideoSizes((androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream) seekableByteOrderedDataInputStream);
                    getHighSpeedVideoSizes(seekableByteOrderedDataInputStream, 0);
                    getHighSpeedVideoSizesFor();
                    getInputSizeshNQ4ISI(new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(bArr));
                    z = true;
                } else if (readInt2 == 1767135348 && !z2) {
                    byte[] bArr2 = getHighResolutionOutputSizeshNQ4ISI;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        byteOrderedDataInputStream.readFully(bArr3);
                        if (java.util.Arrays.equals(bArr3, bArr2)) {
                            int Camera2StreamConfigurationMap4 = byteOrderedDataInputStream.Camera2StreamConfigurationMap();
                            int i = readInt - length;
                            byte[] bArr4 = new byte[i];
                            byteOrderedDataInputStream.readFully(bArr4);
                            this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.exifinterface.media.ExifInterface.ExifAttribute(1, i, Camera2StreamConfigurationMap4 - Camera2StreamConfigurationMap2, bArr4);
                            z2 = true;
                        }
                    }
                }
                byteOrderedDataInputStream.getHighSpeedVideoSizes(((Camera2StreamConfigurationMap3 + readInt) + 4) - byteOrderedDataInputStream.Camera2StreamConfigurationMap());
            } catch (java.io.EOFException e) {
                throw new java.io.IOException("Encountered corrupt PNG file.", e);
            }
        }
        this.kernelID = z2;
    }

    private void Camera2StreamConfigurationMap(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream) throws java.io.IOException {
        byteOrderedDataInputStream.getHighSpeedVideoSizes = java.nio.ByteOrder.LITTLE_ENDIAN;
        byteOrderedDataInputStream.getHighSpeedVideoSizes(AMEXKernelCallback.length);
        int readInt = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = requestPINEntry;
        byteOrderedDataInputStream.getHighSpeedVideoSizes(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int readInt2 = byteOrderedDataInputStream.readInt();
                int i = length + 8;
                if (java.util.Arrays.equals(startTransaction, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    byteOrderedDataInputStream.readFully(bArr3);
                    byte[] bArr4 = getHighSpeedVideoSizes;
                    if (androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoFpsRangesFor(bArr3, bArr4)) {
                        bArr3 = java.util.Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.decode = i;
                    androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream(bArr3);
                    getHighSpeedVideoSizes((androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream) seekableByteOrderedDataInputStream);
                    getHighSpeedVideoSizes(seekableByteOrderedDataInputStream, 0);
                    getInputSizeshNQ4ISI(new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new java.io.IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.getHighSpeedVideoSizes(readInt2);
            } catch (java.io.EOFException e) {
                throw new java.io.IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        this.decode = byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor.size() + getHighSpeedVideoSizes(new androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream(byteArrayOutputStream, java.nio.ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteOrderedDataOutputStream.write(byteArray);
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        byteOrderedDataOutputStream.Camera2StreamConfigurationMap((int) crc32.getValue());
    }

    private void getHighSpeedVideoFpsRanges(androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws java.io.IOException {
        byteOrderedDataOutputStream.Camera2StreamConfigurationMap(this.TransactionOutcomeDecoderExternalSyntheticLambda7.getHighSpeedVideoFpsRangesFor.length + 22);
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        byteOrderedDataOutputStream.Camera2StreamConfigurationMap(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
        byteOrderedDataOutputStream.write(bArr);
        crc32.update(bArr);
        byteOrderedDataOutputStream.write(this.TransactionOutcomeDecoderExternalSyntheticLambda7.getHighSpeedVideoFpsRangesFor);
        crc32.update(this.TransactionOutcomeDecoderExternalSyntheticLambda7.getHighSpeedVideoFpsRangesFor);
        byteOrderedDataOutputStream.Camera2StreamConfigurationMap((int) crc32.getValue());
        this.kernelID = true;
    }

    private static void getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream, androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream byteOrderedDataOutputStream, byte[] bArr, byte[] bArr2) throws java.io.IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            byteOrderedDataInputStream.readFully(bArr3);
            getHighSpeedVideoSizes(byteOrderedDataInputStream, byteOrderedDataOutputStream, bArr3);
            if (java.util.Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && java.util.Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private static void getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream, androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream byteOrderedDataOutputStream, byte[] bArr) throws java.io.IOException {
        int readInt = byteOrderedDataInputStream.readInt();
        byteOrderedDataOutputStream.write(bArr);
        byteOrderedDataOutputStream.Camera2StreamConfigurationMap(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        androidx.exifinterface.media.ExifInterfaceUtils.getHighResolutionOutputSizeshNQ4ISI(byteOrderedDataInputStream, byteOrderedDataOutputStream, readInt);
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.String attribute = getAttribute(TAG_DATETIME_ORIGINAL);
        if (attribute != null && getAttribute(TAG_DATETIME) == null) {
            this.version[0].put(TAG_DATETIME, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighResolutionOutputSizeshNQ4ISI(attribute));
        }
        if (getAttribute(TAG_IMAGE_WIDTH) == null) {
            this.version[0].put(TAG_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(0L, this.newContext));
        }
        if (getAttribute(TAG_IMAGE_LENGTH) == null) {
            this.version[0].put(TAG_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(0L, this.newContext));
        }
        if (getAttribute(TAG_ORIENTATION) == null) {
            this.version[0].put(TAG_ORIENTATION, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(0L, this.newContext));
        }
        if (getAttribute(TAG_LIGHT_SOURCE) == null) {
            this.version[1].put(TAG_LIGHT_SOURCE, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(0L, this.newContext));
        }
    }

    private static java.nio.ByteOrder getHighSpeedVideoFpsRangesFor(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream) throws java.io.IOException {
        short readShort = byteOrderedDataInputStream.readShort();
        if (readShort == 18761) {
            return java.nio.ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return java.nio.ByteOrder.BIG_ENDIAN;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte order: ");
        sb.append(java.lang.Integer.toHexString(readShort));
        throw new java.io.IOException(sb.toString());
    }

    private void getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream) throws java.io.IOException {
        java.nio.ByteOrder highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(byteOrderedDataInputStream);
        this.newContext = highSpeedVideoFpsRangesFor;
        byteOrderedDataInputStream.getHighSpeedVideoSizes = highSpeedVideoFpsRangesFor;
        int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i = this.apply;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid start code: ");
            sb.append(java.lang.Integer.toHexString(readUnsignedShort));
            throw new java.io.IOException(sb.toString());
        }
        int readInt = byteOrderedDataInputStream.readInt();
        if (readInt < 8) {
            throw new java.io.IOException("Invalid first Ifd offset: ".concat(java.lang.String.valueOf(readInt)));
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            byteOrderedDataInputStream.getHighSpeedVideoSizes(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws java.io.IOException {
        short s;
        long j;
        boolean z;
        int i2;
        short s2;
        long j2;
        int readUnsignedShort;
        long j3;
        int i3 = i;
        while (true) {
            this.start.add(java.lang.Integer.valueOf(seekableByteOrderedDataInputStream.Camera2StreamConfigurationMap()));
            short readShort = seekableByteOrderedDataInputStream.readShort();
            if (readShort <= 0) {
                return;
            }
            short s3 = 0;
            while (s3 < readShort) {
                int readUnsignedShort2 = seekableByteOrderedDataInputStream.readUnsignedShort();
                int readUnsignedShort3 = seekableByteOrderedDataInputStream.readUnsignedShort();
                int readInt = seekableByteOrderedDataInputStream.readInt();
                long Camera2StreamConfigurationMap2 = seekableByteOrderedDataInputStream.Camera2StreamConfigurationMap() + 4;
                androidx.exifinterface.media.ExifInterface.ExifTag exifTag = free[i3].get(java.lang.Integer.valueOf(readUnsignedShort2));
                boolean z2 = getInputSizeshNQ4ISI;
                if (z2) {
                    s = readShort;
                    new java.lang.Object[]{java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(readUnsignedShort2), exifTag != null ? exifTag.getHighSpeedVideoFpsRanges : null, java.lang.Integer.valueOf(readUnsignedShort3), java.lang.Integer.valueOf(readInt)};
                } else {
                    s = readShort;
                }
                if (exifTag != null && readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < isOutputSupportedForhNQ4ISI.length) {
                        if (exifTag.Camera2StreamConfigurationMap(readUnsignedShort3)) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = exifTag.getHighResolutionOutputSizeshNQ4ISI;
                            }
                            j = r6[readUnsignedShort3] * readInt;
                            if (j >= 0 && j <= androidx.collection.SieveCacheKt.NodeLinkMask) {
                                z = true;
                                if (!z) {
                                    seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2);
                                    i2 = i3;
                                    s2 = s3;
                                } else {
                                    if (j > 4) {
                                        int readInt2 = seekableByteOrderedDataInputStream.readInt();
                                        s2 = s3;
                                        if (this.apply == 7) {
                                            if (TAG_MAKER_NOTE.equals(exifTag.getHighSpeedVideoFpsRanges)) {
                                                this.TransactionOutcomeDecoder = readInt2;
                                            } else if (i3 == 6 && TAG_ORF_THUMBNAIL_IMAGE.equals(exifTag.getHighSpeedVideoFpsRanges)) {
                                                this.TransactionOutcomeDecoderExternalSyntheticLambda6 = readInt2;
                                                this.TransactionOutcomeDecoderExternalSyntheticLambda1 = readInt;
                                                androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(6, this.newContext);
                                                j2 = j;
                                                androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(this.TransactionOutcomeDecoderExternalSyntheticLambda6, this.newContext);
                                                i2 = i3;
                                                androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(this.TransactionOutcomeDecoderExternalSyntheticLambda1, this.newContext);
                                                this.version[4].put(TAG_COMPRESSION, highSpeedVideoFpsRangesFor);
                                                this.version[4].put(TAG_JPEG_INTERCHANGE_FORMAT, highSpeedVideoFpsRangesFor2);
                                                this.version[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, highSpeedVideoFpsRangesFor3);
                                                seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(readInt2);
                                            }
                                        }
                                        i2 = i3;
                                        j2 = j;
                                        seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(readInt2);
                                    } else {
                                        i2 = i3;
                                        s2 = s3;
                                        j2 = j;
                                    }
                                    java.lang.Integer num = freeTransaction.get(java.lang.Integer.valueOf(readUnsignedShort2));
                                    if (num != null) {
                                        if (readUnsignedShort3 == 3) {
                                            readUnsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                                        } else {
                                            if (readUnsignedShort3 == 4) {
                                                j3 = seekableByteOrderedDataInputStream.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = seekableByteOrderedDataInputStream.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = seekableByteOrderedDataInputStream.readInt();
                                            } else {
                                                j3 = -1;
                                            }
                                            if (z2) {
                                                new java.lang.Object[]{java.lang.Long.valueOf(j3), exifTag.getHighSpeedVideoFpsRanges};
                                            }
                                            if (j3 <= 0 && (seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI == -1 || j3 < seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI)) {
                                                if (!this.start.contains(java.lang.Integer.valueOf((int) j3))) {
                                                    seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(j3);
                                                    getHighSpeedVideoSizes(seekableByteOrderedDataInputStream, num.intValue());
                                                }
                                            } else if (z2 && seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI != -1) {
                                                int i4 = seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI;
                                            }
                                            seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2);
                                        }
                                        j3 = readUnsignedShort;
                                        if (z2) {
                                        }
                                        if (j3 <= 0) {
                                        }
                                        if (z2) {
                                            int i42 = seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI;
                                        }
                                        seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2);
                                    } else {
                                        int Camera2StreamConfigurationMap3 = seekableByteOrderedDataInputStream.Camera2StreamConfigurationMap();
                                        int i5 = this.decode;
                                        byte[] bArr = new byte[(int) j2];
                                        seekableByteOrderedDataInputStream.readFully(bArr);
                                        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = new androidx.exifinterface.media.ExifInterface.ExifAttribute(readUnsignedShort3, readInt, Camera2StreamConfigurationMap3 + i5, bArr);
                                        this.version[i2].put(exifTag.getHighSpeedVideoFpsRanges, exifAttribute);
                                        if (TAG_DNG_VERSION.equals(exifTag.getHighSpeedVideoFpsRanges)) {
                                            this.apply = 3;
                                        }
                                        if (((TAG_MAKE.equals(exifTag.getHighSpeedVideoFpsRanges) || TAG_MODEL.equals(exifTag.getHighSpeedVideoFpsRanges)) && exifAttribute.Camera2StreamConfigurationMap(this.newContext).contains("PENTAX")) || (TAG_COMPRESSION.equals(exifTag.getHighSpeedVideoFpsRanges) && exifAttribute.getHighSpeedVideoFpsRanges(this.newContext) == 65535)) {
                                            this.apply = 8;
                                        }
                                        if (seekableByteOrderedDataInputStream.Camera2StreamConfigurationMap() != Camera2StreamConfigurationMap2) {
                                            seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2);
                                        }
                                    }
                                }
                                s3 = (short) (s2 + 1);
                                i3 = i2;
                                readShort = s;
                            }
                            z = false;
                            if (!z) {
                            }
                            s3 = (short) (s2 + 1);
                            i3 = i2;
                            readShort = s;
                        } else if (z2) {
                            java.lang.String str = ArtificialStackFrames[readUnsignedShort3];
                            java.lang.String str2 = exifTag.getHighSpeedVideoFpsRanges;
                        }
                    }
                }
                j = 0;
                z = false;
                if (!z) {
                }
                s3 = (short) (s2 + 1);
                i3 = i2;
                readShort = s;
            }
            int readInt3 = seekableByteOrderedDataInputStream.readInt();
            if (getInputSizeshNQ4ISI) {
                new java.lang.Object[]{java.lang.Integer.valueOf(readInt3)};
            }
            long j4 = readInt3;
            if (j4 <= 0 || this.start.contains(java.lang.Integer.valueOf(readInt3))) {
                return;
            }
            seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(j4);
            int i6 = 4;
            if (!this.version[4].isEmpty()) {
                i6 = 5;
                if (!this.version[5].isEmpty()) {
                    return;
                }
            }
            i3 = i6;
        }
    }

    private void Camera2StreamConfigurationMap(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.version[i].get(TAG_IMAGE_LENGTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.version[i].get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.version[i].get(TAG_JPEG_INTERCHANGE_FORMAT);
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute4 = this.version[i].get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            if (exifAttribute3 == null || exifAttribute4 == null) {
                return;
            }
            int highSpeedVideoFpsRanges = exifAttribute3.getHighSpeedVideoFpsRanges(this.newContext);
            int highSpeedVideoFpsRanges2 = exifAttribute3.getHighSpeedVideoFpsRanges(this.newContext);
            seekableByteOrderedDataInputStream.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges);
            byte[] bArr = new byte[highSpeedVideoFpsRanges2];
            seekableByteOrderedDataInputStream.readFully(bArr);
            getHighSpeedVideoFpsRanges(new androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream(bArr), highSpeedVideoFpsRanges, i);
        }
    }

    private void getInputSizeshNQ4ISI(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream) throws java.io.IOException {
        java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap = this.version[4];
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = hashMap.get(TAG_COMPRESSION);
        if (exifAttribute != null) {
            int highSpeedVideoFpsRanges = exifAttribute.getHighSpeedVideoFpsRanges(this.newContext);
            this.TransactionOutcomeDecoderExternalSyntheticLambda3 = highSpeedVideoFpsRanges;
            if (highSpeedVideoFpsRanges != 1) {
                if (highSpeedVideoFpsRanges == 6) {
                    getHighSpeedVideoSizes(byteOrderedDataInputStream, hashMap);
                    return;
                } else if (highSpeedVideoFpsRanges != 7) {
                    return;
                }
            }
            if (getHighSpeedVideoFpsRanges(hashMap)) {
                getHighResolutionOutputSizeshNQ4ISI(byteOrderedDataInputStream, hashMap);
                return;
            }
            return;
        }
        this.TransactionOutcomeDecoderExternalSyntheticLambda3 = 6;
        getHighSpeedVideoSizes(byteOrderedDataInputStream, hashMap);
    }

    private void getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream, java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int highSpeedVideoFpsRanges = exifAttribute.getHighSpeedVideoFpsRanges(this.newContext);
        int highSpeedVideoFpsRanges2 = exifAttribute2.getHighSpeedVideoFpsRanges(this.newContext);
        if (this.apply == 7) {
            highSpeedVideoFpsRanges += this.TransactionOutcomeDecoder;
        }
        if (highSpeedVideoFpsRanges <= 0 || highSpeedVideoFpsRanges2 <= 0) {
            return;
        }
        this.BerTlvEncoder = true;
        if (this.encode == null && this.setup == null && this.TransactionOutcomeDecoderExternalSyntheticLambda4 == null) {
            byte[] bArr = new byte[highSpeedVideoFpsRanges2];
            byteOrderedDataInputStream.getHighSpeedVideoSizes(highSpeedVideoFpsRanges);
            byteOrderedDataInputStream.readFully(bArr);
            this.TransactionOutcomeDecoderExternalSyntheticLambda2 = bArr;
        }
        this.values = highSpeedVideoFpsRanges;
        this.TransactionOutcomeDecoderExternalSyntheticLambda5 = highSpeedVideoFpsRanges2;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream, java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = hashMap.get(TAG_STRIP_OFFSETS);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = hashMap.get(TAG_STRIP_BYTE_COUNTS);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        long[] highSpeedVideoSizes = androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoSizes(exifAttribute.getHighSpeedVideoSizes(this.newContext));
        long[] highSpeedVideoSizes2 = androidx.exifinterface.media.ExifInterfaceUtils.getHighSpeedVideoSizes(exifAttribute2.getHighSpeedVideoSizes(this.newContext));
        if (highSpeedVideoSizes == null || highSpeedVideoSizes.length == 0 || highSpeedVideoSizes2 == null || highSpeedVideoSizes2.length == 0 || highSpeedVideoSizes.length != highSpeedVideoSizes2.length) {
            return;
        }
        long j = 0;
        for (long j2 : highSpeedVideoSizes2) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.AMEXKernelProvider = true;
        this.provide = true;
        this.BerTlvEncoder = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < highSpeedVideoSizes.length; i4++) {
            int i5 = (int) highSpeedVideoSizes[i4];
            int i6 = (int) highSpeedVideoSizes2[i4];
            if (i4 < highSpeedVideoSizes.length - 1 && i5 + i6 != highSpeedVideoSizes[i4 + 1]) {
                this.AMEXKernelProvider = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                return;
            }
            try {
                byteOrderedDataInputStream.getHighSpeedVideoSizes(i7);
                byte[] bArr2 = new byte[i6];
                byteOrderedDataInputStream.readFully(bArr2);
                i2 = i2 + i7 + i6;
                java.lang.System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            } catch (java.io.EOFException unused) {
                return;
            }
        }
        this.TransactionOutcomeDecoderExternalSyntheticLambda2 = bArr;
        if (this.AMEXKernelProvider) {
            this.values = (int) highSpeedVideoSizes[0];
            this.TransactionOutcomeDecoderExternalSyntheticLambda5 = i;
        }
    }

    private boolean getHighSpeedVideoFpsRanges(java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute;
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = hashMap.get(TAG_BITS_PER_SAMPLE);
        if (exifAttribute2 == null) {
            return false;
        }
        int[] iArr = (int[]) exifAttribute2.getHighSpeedVideoSizes(this.newContext);
        int[] iArr2 = BITS_PER_SAMPLE_RGB;
        if (java.util.Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.apply != 3 || (exifAttribute = hashMap.get(TAG_PHOTOMETRIC_INTERPRETATION)) == null) {
            return false;
        }
        int highSpeedVideoFpsRanges = exifAttribute.getHighSpeedVideoFpsRanges(this.newContext);
        return (highSpeedVideoFpsRanges == 1 && java.util.Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (highSpeedVideoFpsRanges == 6 && java.util.Arrays.equals(iArr, iArr2));
    }

    private boolean getHighSpeedVideoFpsRangesFor(java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = hashMap.get(TAG_IMAGE_LENGTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = hashMap.get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.getHighSpeedVideoFpsRanges(this.newContext) <= 512 && exifAttribute2.getHighSpeedVideoFpsRanges(this.newContext) <= 512;
    }

    private void getHighSpeedVideoSizesFor() throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI(0, 5);
        getHighResolutionOutputSizeshNQ4ISI(0, 4);
        getHighResolutionOutputSizeshNQ4ISI(5, 4);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.version[1].get(TAG_PIXEL_X_DIMENSION);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.version[1].get(TAG_PIXEL_Y_DIMENSION);
        if (exifAttribute != null && exifAttribute2 != null) {
            this.version[0].put(TAG_IMAGE_WIDTH, exifAttribute);
            this.version[0].put(TAG_IMAGE_LENGTH, exifAttribute2);
        }
        if (this.version[4].isEmpty() && getHighSpeedVideoFpsRangesFor(this.version[5])) {
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] hashMapArr = this.version;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new java.util.HashMap<>();
        }
        getHighSpeedVideoFpsRangesFor(this.version[4]);
        getHighSpeedVideoSizes(0, "ThumbnailOrientation", TAG_ORIENTATION);
        getHighSpeedVideoSizes(0, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        getHighSpeedVideoSizes(0, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        getHighSpeedVideoSizes(5, "ThumbnailOrientation", TAG_ORIENTATION);
        getHighSpeedVideoSizes(5, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        getHighSpeedVideoSizes(5, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        getHighSpeedVideoSizes(4, TAG_ORIENTATION, "ThumbnailOrientation");
        getHighSpeedVideoSizes(4, TAG_IMAGE_LENGTH, TAG_THUMBNAIL_IMAGE_LENGTH);
        getHighSpeedVideoSizes(4, TAG_IMAGE_WIDTH, TAG_THUMBNAIL_IMAGE_WIDTH);
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor;
        androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor2;
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.version[i].get(TAG_DEFAULT_CROP_SIZE);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.version[i].get(TAG_RW2_SENSOR_TOP_BORDER);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.version[i].get(TAG_RW2_SENSOR_LEFT_BORDER);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute4 = this.version[i].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute5 = this.version[i].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (exifAttribute != null) {
            if (exifAttribute.Camera2StreamConfigurationMap == 5) {
                androidx.exifinterface.media.ExifInterface.Rational[] rationalArr = (androidx.exifinterface.media.ExifInterface.Rational[]) exifAttribute.getHighSpeedVideoSizes(this.newContext);
                if (rationalArr == null || rationalArr.length != 2) {
                    java.util.Arrays.toString(rationalArr);
                    return;
                } else {
                    highSpeedVideoFpsRangesFor = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoSizes(rationalArr[0], this.newContext);
                    highSpeedVideoFpsRangesFor2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoSizes(rationalArr[1], this.newContext);
                }
            } else {
                int[] iArr = (int[]) exifAttribute.getHighSpeedVideoSizes(this.newContext);
                if (iArr == null || iArr.length != 2) {
                    java.util.Arrays.toString(iArr);
                    return;
                } else {
                    highSpeedVideoFpsRangesFor = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(iArr[0], this.newContext);
                    highSpeedVideoFpsRangesFor2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(iArr[1], this.newContext);
                }
            }
            this.version[i].put(TAG_IMAGE_WIDTH, highSpeedVideoFpsRangesFor);
            this.version[i].put(TAG_IMAGE_LENGTH, highSpeedVideoFpsRangesFor2);
            return;
        }
        if (exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null && exifAttribute5 != null) {
            int highSpeedVideoFpsRanges = exifAttribute2.getHighSpeedVideoFpsRanges(this.newContext);
            int highSpeedVideoFpsRanges2 = exifAttribute4.getHighSpeedVideoFpsRanges(this.newContext);
            int highSpeedVideoFpsRanges3 = exifAttribute5.getHighSpeedVideoFpsRanges(this.newContext);
            int highSpeedVideoFpsRanges4 = exifAttribute3.getHighSpeedVideoFpsRanges(this.newContext);
            if (highSpeedVideoFpsRanges2 <= highSpeedVideoFpsRanges || highSpeedVideoFpsRanges3 <= highSpeedVideoFpsRanges4) {
                return;
            }
            androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges2 - highSpeedVideoFpsRanges, this.newContext);
            androidx.exifinterface.media.ExifInterface.ExifAttribute highSpeedVideoFpsRangesFor4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges3 - highSpeedVideoFpsRanges4, this.newContext);
            this.version[i].put(TAG_IMAGE_LENGTH, highSpeedVideoFpsRangesFor3);
            this.version[i].put(TAG_IMAGE_WIDTH, highSpeedVideoFpsRangesFor4);
            return;
        }
        Camera2StreamConfigurationMap(seekableByteOrderedDataInputStream, i);
    }

    private int getHighSpeedVideoSizes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws java.io.IOException {
        int i;
        androidx.exifinterface.media.ExifInterface.ExifTag[][] exifTagArr = getHighSpeedVideoFpsRangesFor;
        int[] iArr = new int[exifTagArr.length];
        int[] iArr2 = new int[exifTagArr.length];
        for (androidx.exifinterface.media.ExifInterface.ExifTag exifTag : getOutputFormats) {
            java.lang.String str = exifTag.getHighSpeedVideoFpsRanges;
            for (int i2 = 0; i2 < getHighSpeedVideoFpsRangesFor.length; i2++) {
                this.version[i2].remove(str);
            }
        }
        if (this.BerTlvEncoder) {
            if (this.provide) {
                for (int i3 = 0; i3 < getHighSpeedVideoFpsRangesFor.length; i3++) {
                    this.version[i3].remove(TAG_STRIP_OFFSETS);
                }
                for (int i4 = 0; i4 < getHighSpeedVideoFpsRangesFor.length; i4++) {
                    this.version[i4].remove(TAG_STRIP_BYTE_COUNTS);
                }
            } else {
                for (int i5 = 0; i5 < getHighSpeedVideoFpsRangesFor.length; i5++) {
                    this.version[i5].remove(TAG_JPEG_INTERCHANGE_FORMAT);
                }
                for (int i6 = 0; i6 < getHighSpeedVideoFpsRangesFor.length; i6++) {
                    this.version[i6].remove(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
                }
            }
        }
        for (int i7 = 0; i7 < getHighSpeedVideoFpsRangesFor.length; i7++) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>> it = this.version[i7].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        if (!this.version[1].isEmpty()) {
            this.version[0].put(getOutputFormats[1].getHighSpeedVideoFpsRanges, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(0L, this.newContext));
        }
        int i8 = 2;
        if (!this.version[2].isEmpty()) {
            this.version[0].put(getOutputFormats[2].getHighSpeedVideoFpsRanges, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(0L, this.newContext));
        }
        if (!this.version[3].isEmpty()) {
            this.version[1].put(getOutputFormats[3].getHighSpeedVideoFpsRanges, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(0L, this.newContext));
        }
        int i9 = 4;
        if (this.BerTlvEncoder) {
            if (this.provide) {
                this.version[4].put(TAG_STRIP_OFFSETS, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(0, this.newContext));
                this.version[4].put(TAG_STRIP_BYTE_COUNTS, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(this.TransactionOutcomeDecoderExternalSyntheticLambda5, this.newContext));
            } else {
                this.version[4].put(TAG_JPEG_INTERCHANGE_FORMAT, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(0L, this.newContext));
                this.version[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(this.TransactionOutcomeDecoderExternalSyntheticLambda5, this.newContext));
            }
        }
        for (int i10 = 0; i10 < getHighSpeedVideoFpsRangesFor.length; i10++) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>> it2 = this.version[i10].entrySet().iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                androidx.exifinterface.media.ExifInterface.ExifAttribute value = it2.next().getValue();
                int i12 = isOutputSupportedForhNQ4ISI[value.Camera2StreamConfigurationMap] * value.getHighSpeedVideoFpsRanges;
                if (i12 > 4) {
                    i11 += i12;
                }
            }
            iArr2[i10] = iArr2[i10] + i11;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < getHighSpeedVideoFpsRangesFor.length; i14++) {
            if (!this.version[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.version[i14].size() * 12) + 6 + iArr2[i14];
            }
        }
        if (this.BerTlvEncoder) {
            if (this.provide) {
                this.version[4].put(TAG_STRIP_OFFSETS, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(i13, this.newContext));
            } else {
                this.version[4].put(TAG_JPEG_INTERCHANGE_FORMAT, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(i13, this.newContext));
            }
            this.values = i13;
            i13 += this.TransactionOutcomeDecoderExternalSyntheticLambda5;
        }
        if (this.apply == 4) {
            i13 += 8;
        }
        if (getInputSizeshNQ4ISI) {
            for (int i15 = 0; i15 < getHighSpeedVideoFpsRangesFor.length; i15++) {
                new java.lang.Object[]{java.lang.Integer.valueOf(i15), java.lang.Integer.valueOf(iArr[i15]), java.lang.Integer.valueOf(this.version[i15].size()), java.lang.Integer.valueOf(iArr2[i15]), java.lang.Integer.valueOf(i13)};
            }
        }
        if (!this.version[1].isEmpty()) {
            this.version[0].put(getOutputFormats[1].getHighSpeedVideoFpsRanges, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(iArr[1], this.newContext));
        }
        if (!this.version[2].isEmpty()) {
            this.version[0].put(getOutputFormats[2].getHighSpeedVideoFpsRanges, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(iArr[2], this.newContext));
        }
        if (!this.version[3].isEmpty()) {
            this.version[1].put(getOutputFormats[3].getHighSpeedVideoFpsRanges, androidx.exifinterface.media.ExifInterface.ExifAttribute.getHighSpeedVideoFpsRangesFor(iArr[3], this.newContext));
        }
        int i16 = this.apply;
        if (i16 == 4) {
            if (i13 > 65535) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Size of exif data (");
                sb.append(i13);
                sb.append(" bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (i13 > 65535) {
                throw new java.lang.IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor((short) i13);
            byteOrderedDataOutputStream.write(getHighSpeedVideoSizes);
        } else if (i16 == 13) {
            byteOrderedDataOutputStream.Camera2StreamConfigurationMap(i13);
            byteOrderedDataOutputStream.Camera2StreamConfigurationMap(1700284774);
        } else if (i16 == 14) {
            byteOrderedDataOutputStream.write(startTransaction);
            byteOrderedDataOutputStream.Camera2StreamConfigurationMap(i13);
        }
        int size = byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor.size();
        byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor(this.newContext == java.nio.ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        byteOrderedDataOutputStream.getHighSpeedVideoFpsRanges = this.newContext;
        byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor((short) 42);
        byteOrderedDataOutputStream.Camera2StreamConfigurationMap(8);
        int i17 = 0;
        while (i17 < getHighSpeedVideoFpsRangesFor.length) {
            if (this.version[i17].isEmpty()) {
                i = i9;
            } else {
                int size2 = this.version[i17].size();
                if (size2 > 65535) {
                    throw new java.lang.IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
                }
                byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor((short) size2);
                int size3 = iArr[i17] + i8 + (this.version[i17].size() * 12) + i9;
                for (java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> entry : this.version[i17].entrySet()) {
                    int i18 = rsaCipher[i17].get(entry.getKey()).getHighSpeedVideoSizes;
                    androidx.exifinterface.media.ExifInterface.ExifAttribute value2 = entry.getValue();
                    int i19 = isOutputSupportedForhNQ4ISI[value2.Camera2StreamConfigurationMap] * value2.getHighSpeedVideoFpsRanges;
                    if (i18 > 65535) {
                        throw new java.lang.IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
                    }
                    byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor((short) i18);
                    int i20 = value2.Camera2StreamConfigurationMap;
                    if (i20 > 65535) {
                        throw new java.lang.IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
                    }
                    byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor((short) i20);
                    byteOrderedDataOutputStream.Camera2StreamConfigurationMap(value2.getHighSpeedVideoFpsRanges);
                    if (i19 <= i9) {
                        byteOrderedDataOutputStream.write(value2.getHighSpeedVideoFpsRangesFor);
                        if (i19 < 4) {
                            for (int i21 = 4; i19 < i21; i21 = 4) {
                                byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor.write(0);
                                i19++;
                            }
                        }
                    } else {
                        long j = size3;
                        if (j > 4294967295L) {
                            throw new java.lang.IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
                        }
                        byteOrderedDataOutputStream.Camera2StreamConfigurationMap((int) j);
                        size3 += i19;
                    }
                    i9 = 4;
                }
                if (i17 == 0 && !this.version[4].isEmpty()) {
                    long j2 = iArr[4];
                    if (j2 > 4294967295L) {
                        throw new java.lang.IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
                    }
                    byteOrderedDataOutputStream.Camera2StreamConfigurationMap((int) j2);
                } else {
                    byteOrderedDataOutputStream.Camera2StreamConfigurationMap(0);
                }
                java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>> it3 = this.version[i17].entrySet().iterator();
                while (it3.hasNext()) {
                    androidx.exifinterface.media.ExifInterface.ExifAttribute value3 = it3.next().getValue();
                    if (value3.getHighSpeedVideoFpsRangesFor.length > 4) {
                        byteOrderedDataOutputStream.write(value3.getHighSpeedVideoFpsRangesFor, 0, value3.getHighSpeedVideoFpsRangesFor.length);
                    }
                }
                i = 4;
            }
            i17++;
            i9 = i;
            i8 = 2;
        }
        if (this.BerTlvEncoder) {
            byteOrderedDataOutputStream.write(getThumbnailBytes());
        }
        if (this.apply == 14 && i13 % 2 == 1) {
            byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor.write(0);
        }
        byteOrderedDataOutputStream.getHighSpeedVideoFpsRanges = java.nio.ByteOrder.BIG_ENDIAN;
        return size;
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (str.contains(",")) {
            java.lang.String[] split = str.split(",", -1);
            android.util.Pair<java.lang.Integer, java.lang.Integer> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(split[0]);
            if (((java.lang.Integer) highResolutionOutputSizeshNQ4ISI.first).intValue() == 2) {
                return highResolutionOutputSizeshNQ4ISI;
            }
            for (int i = 1; i < split.length; i++) {
                android.util.Pair<java.lang.Integer, java.lang.Integer> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(split[i]);
                int intValue = (((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.first).equals(highResolutionOutputSizeshNQ4ISI.first) || ((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.second).equals(highResolutionOutputSizeshNQ4ISI.first)) ? ((java.lang.Integer) highResolutionOutputSizeshNQ4ISI.first).intValue() : -1;
                int intValue2 = (((java.lang.Integer) highResolutionOutputSizeshNQ4ISI.second).intValue() == -1 || !(((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.first).equals(highResolutionOutputSizeshNQ4ISI.second) || ((java.lang.Integer) highResolutionOutputSizeshNQ4ISI2.second).equals(highResolutionOutputSizeshNQ4ISI.second))) ? -1 : ((java.lang.Integer) highResolutionOutputSizeshNQ4ISI.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new android.util.Pair<>(2, -1);
                }
                if (intValue == -1) {
                    highResolutionOutputSizeshNQ4ISI = new android.util.Pair<>(java.lang.Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    highResolutionOutputSizeshNQ4ISI = new android.util.Pair<>(java.lang.Integer.valueOf(intValue), -1);
                }
            }
            return highResolutionOutputSizeshNQ4ISI;
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
                java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Long.parseLong(str));
                if (valueOf.longValue() >= 0 && valueOf.longValue() <= okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                    return new android.util.Pair<>(3, 4);
                }
                if (valueOf.longValue() < 0) {
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

    static class SeekableByteOrderedDataInputStream extends androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream {
        SeekableByteOrderedDataInputStream(byte[] bArr) throws java.io.IOException {
            super(bArr);
            this.getHighSpeedVideoFpsRangesFor.mark(Integer.MAX_VALUE);
        }

        SeekableByteOrderedDataInputStream(java.io.InputStream inputStream) throws java.io.IOException {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new java.lang.IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.getHighSpeedVideoFpsRangesFor.mark(Integer.MAX_VALUE);
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(long j) throws java.io.IOException {
            if (this.Camera2StreamConfigurationMap > j) {
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoFpsRangesFor.reset();
            } else {
                j -= this.Camera2StreamConfigurationMap;
            }
            getHighSpeedVideoSizes((int) j);
        }
    }

    static class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
        protected int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        private byte[] getHighSpeedVideoFpsRanges;
        protected final java.io.DataInputStream getHighSpeedVideoFpsRangesFor;
        java.nio.ByteOrder getHighSpeedVideoSizes;

        @Override // java.io.DataInput
        public java.lang.String readLine() throws java.io.IOException {
            return null;
        }

        ByteOrderedDataInputStream(byte[] bArr) throws java.io.IOException {
            this(new java.io.ByteArrayInputStream(bArr), java.nio.ByteOrder.BIG_ENDIAN);
            this.getHighResolutionOutputSizeshNQ4ISI = bArr.length;
        }

        ByteOrderedDataInputStream(java.io.InputStream inputStream) throws java.io.IOException {
            this(inputStream, java.nio.ByteOrder.BIG_ENDIAN);
        }

        ByteOrderedDataInputStream(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
            this.getHighSpeedVideoFpsRangesFor = dataInputStream;
            dataInputStream.mark(0);
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoSizes = byteOrder;
            this.getHighResolutionOutputSizeshNQ4ISI = inputStream instanceof androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream ? ((androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream) inputStream).getHighResolutionOutputSizeshNQ4ISI : -1;
        }

        public final int Camera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final byte[] getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
            byte[] bArr = new byte[1024];
            int i = 0;
            while (true) {
                if (i == bArr.length) {
                    bArr = java.util.Arrays.copyOf(bArr, bArr.length * 2);
                }
                int read = this.getHighSpeedVideoFpsRangesFor.read(bArr, i, bArr.length - i);
                if (read != -1) {
                    i += read;
                    this.Camera2StreamConfigurationMap += read;
                } else {
                    return java.util.Arrays.copyOf(bArr, i);
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return this.getHighSpeedVideoFpsRangesFor.available();
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            this.Camera2StreamConfigurationMap++;
            return this.getHighSpeedVideoFpsRangesFor.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            int read = this.getHighSpeedVideoFpsRangesFor.read(bArr, i, i2);
            this.Camera2StreamConfigurationMap += read;
            return read;
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws java.io.IOException {
            this.Camera2StreamConfigurationMap++;
            return this.getHighSpeedVideoFpsRangesFor.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws java.io.IOException {
            this.Camera2StreamConfigurationMap++;
            return this.getHighSpeedVideoFpsRangesFor.readBoolean();
        }

        @Override // java.io.DataInput
        public char readChar() throws java.io.IOException {
            this.Camera2StreamConfigurationMap += 2;
            return this.getHighSpeedVideoFpsRangesFor.readChar();
        }

        @Override // java.io.DataInput
        public java.lang.String readUTF() throws java.io.IOException {
            this.Camera2StreamConfigurationMap += 2;
            return this.getHighSpeedVideoFpsRangesFor.readUTF();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.Camera2StreamConfigurationMap += i2;
            this.getHighSpeedVideoFpsRangesFor.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws java.io.IOException {
            this.Camera2StreamConfigurationMap += bArr.length;
            this.getHighSpeedVideoFpsRangesFor.readFully(bArr);
        }

        @Override // java.io.DataInput
        public byte readByte() throws java.io.IOException {
            this.Camera2StreamConfigurationMap++;
            int read = this.getHighSpeedVideoFpsRangesFor.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new java.io.EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws java.io.IOException {
            this.Camera2StreamConfigurationMap += 2;
            int read = this.getHighSpeedVideoFpsRangesFor.read();
            int read2 = this.getHighSpeedVideoFpsRangesFor.read();
            if ((read | read2) < 0) {
                throw new java.io.EOFException();
            }
            if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte order: ");
            sb.append(this.getHighSpeedVideoSizes);
            throw new java.io.IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public int readInt() throws java.io.IOException {
            this.Camera2StreamConfigurationMap += 4;
            int read = this.getHighSpeedVideoFpsRangesFor.read();
            int read2 = this.getHighSpeedVideoFpsRangesFor.read();
            int read3 = this.getHighSpeedVideoFpsRangesFor.read();
            int read4 = this.getHighSpeedVideoFpsRangesFor.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new java.io.EOFException();
            }
            if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte order: ");
            sb.append(this.getHighSpeedVideoSizes);
            throw new java.io.IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public final void getHighSpeedVideoSizes(int i) throws java.io.IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.getHighSpeedVideoFpsRangesFor.skip(i3);
                if (skip <= 0) {
                    if (this.getHighSpeedVideoFpsRanges == null) {
                        this.getHighSpeedVideoFpsRanges = new byte[8192];
                    }
                    skip = this.getHighSpeedVideoFpsRangesFor.read(this.getHighSpeedVideoFpsRanges, 0, java.lang.Math.min(8192, i3));
                    if (skip == -1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Reached EOF while skipping ");
                        sb.append(i);
                        sb.append(" bytes.");
                        throw new java.io.EOFException(sb.toString());
                    }
                }
                i2 += skip;
            }
            this.Camera2StreamConfigurationMap += i2;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws java.io.IOException {
            this.Camera2StreamConfigurationMap += 2;
            int read = this.getHighSpeedVideoFpsRangesFor.read();
            int read2 = this.getHighSpeedVideoFpsRangesFor.read();
            if ((read | read2) < 0) {
                throw new java.io.EOFException();
            }
            if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte order: ");
            sb.append(this.getHighSpeedVideoSizes);
            throw new java.io.IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public long readLong() throws java.io.IOException {
            this.Camera2StreamConfigurationMap += 8;
            int read = this.getHighSpeedVideoFpsRangesFor.read();
            int read2 = this.getHighSpeedVideoFpsRangesFor.read();
            int read3 = this.getHighSpeedVideoFpsRangesFor.read();
            int read4 = this.getHighSpeedVideoFpsRangesFor.read();
            int read5 = this.getHighSpeedVideoFpsRangesFor.read();
            int read6 = this.getHighSpeedVideoFpsRangesFor.read();
            int read7 = this.getHighSpeedVideoFpsRangesFor.read();
            int read8 = this.getHighSpeedVideoFpsRangesFor.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new java.io.EOFException();
            }
            if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte order: ");
            sb.append(this.getHighSpeedVideoSizes);
            throw new java.io.IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readLong());
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new java.lang.UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new java.lang.UnsupportedOperationException("Reset is currently unsupported");
        }
    }

    static class ByteOrderedDataOutputStream extends java.io.FilterOutputStream {
        java.nio.ByteOrder getHighSpeedVideoFpsRanges;
        final java.io.DataOutputStream getHighSpeedVideoFpsRangesFor;

        public ByteOrderedDataOutputStream(java.io.OutputStream outputStream, java.nio.ByteOrder byteOrder) {
            super(outputStream);
            this.getHighSpeedVideoFpsRangesFor = new java.io.DataOutputStream(outputStream);
            this.getHighSpeedVideoFpsRanges = byteOrder;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoFpsRangesFor.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighSpeedVideoFpsRangesFor.write(bArr, i, i2);
        }

        public final void getHighSpeedVideoFpsRangesFor(short s) throws java.io.IOException {
            if (this.getHighSpeedVideoFpsRanges == java.nio.ByteOrder.LITTLE_ENDIAN) {
                this.getHighSpeedVideoFpsRangesFor.write(s & 255);
                this.getHighSpeedVideoFpsRangesFor.write((s >>> 8) & 255);
            } else if (this.getHighSpeedVideoFpsRanges == java.nio.ByteOrder.BIG_ENDIAN) {
                this.getHighSpeedVideoFpsRangesFor.write((s >>> 8) & 255);
                this.getHighSpeedVideoFpsRangesFor.write(s & 255);
            }
        }

        public final void Camera2StreamConfigurationMap(int i) throws java.io.IOException {
            if (this.getHighSpeedVideoFpsRanges == java.nio.ByteOrder.LITTLE_ENDIAN) {
                this.getHighSpeedVideoFpsRangesFor.write(i & 255);
                this.getHighSpeedVideoFpsRangesFor.write((i >>> 8) & 255);
                this.getHighSpeedVideoFpsRangesFor.write((i >>> 16) & 255);
                this.getHighSpeedVideoFpsRangesFor.write((i >>> 24) & 255);
                return;
            }
            if (this.getHighSpeedVideoFpsRanges == java.nio.ByteOrder.BIG_ENDIAN) {
                this.getHighSpeedVideoFpsRangesFor.write((i >>> 24) & 255);
                this.getHighSpeedVideoFpsRangesFor.write((i >>> 16) & 255);
                this.getHighSpeedVideoFpsRangesFor.write((i >>> 8) & 255);
                this.getHighSpeedVideoFpsRangesFor.write(i & 255);
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) throws java.io.IOException {
        if (this.version[i].isEmpty() || this.version[i2].isEmpty()) {
            return;
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.version[i].get(TAG_IMAGE_LENGTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.version[i].get(TAG_IMAGE_WIDTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.version[i2].get(TAG_IMAGE_LENGTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute4 = this.version[i2].get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null || exifAttribute3 == null || exifAttribute4 == null) {
            return;
        }
        int highSpeedVideoFpsRanges = exifAttribute.getHighSpeedVideoFpsRanges(this.newContext);
        int highSpeedVideoFpsRanges2 = exifAttribute2.getHighSpeedVideoFpsRanges(this.newContext);
        int highSpeedVideoFpsRanges3 = exifAttribute3.getHighSpeedVideoFpsRanges(this.newContext);
        int highSpeedVideoFpsRanges4 = exifAttribute4.getHighSpeedVideoFpsRanges(this.newContext);
        if (highSpeedVideoFpsRanges >= highSpeedVideoFpsRanges3 || highSpeedVideoFpsRanges2 >= highSpeedVideoFpsRanges4) {
            return;
        }
        java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] hashMapArr = this.version;
        java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    private void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.String str2) {
        if (this.version[i].isEmpty() || this.version[i].get(str) == null) {
            return;
        }
        java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap = this.version[i];
        hashMap.put(str2, hashMap.get(str));
        this.version[i].remove(str);
    }
}
