package p000;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: iy */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0339iy {

    /* JADX INFO: renamed from: A */
    public static final byte[] f3697A;

    /* JADX INFO: renamed from: B */
    public static final String[] f3698B;

    /* JADX INFO: renamed from: C */
    public static final int[] f3699C;

    /* JADX INFO: renamed from: D */
    public static final byte[] f3700D;

    /* JADX INFO: renamed from: E */
    public static final C0228fy f3701E;

    /* JADX INFO: renamed from: F */
    public static final C0228fy[][] f3702F;

    /* JADX INFO: renamed from: G */
    public static final C0228fy[] f3703G;

    /* JADX INFO: renamed from: H */
    public static final HashMap[] f3704H;

    /* JADX INFO: renamed from: I */
    public static final HashMap[] f3705I;

    /* JADX INFO: renamed from: J */
    public static final HashSet f3706J;

    /* JADX INFO: renamed from: K */
    public static final HashMap f3707K;

    /* JADX INFO: renamed from: L */
    public static final Charset f3708L;

    /* JADX INFO: renamed from: M */
    public static final byte[] f3709M;

    /* JADX INFO: renamed from: N */
    public static final byte[] f3710N;

    /* JADX INFO: renamed from: l */
    public static final boolean f3711l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m */
    public static final int[] f3712m;

    /* JADX INFO: renamed from: n */
    public static final int[] f3713n;

    /* JADX INFO: renamed from: o */
    public static final byte[] f3714o;

    /* JADX INFO: renamed from: p */
    public static final byte[] f3715p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f3716q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f3717r;

    /* JADX INFO: renamed from: s */
    public static final byte[] f3718s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f3719t;

    /* JADX INFO: renamed from: u */
    public static final byte[] f3720u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f3721v;

    /* JADX INFO: renamed from: w */
    public static final byte[] f3722w;

    /* JADX INFO: renamed from: x */
    public static final byte[] f3723x;

    /* JADX INFO: renamed from: y */
    public static final byte[] f3724y;

    /* JADX INFO: renamed from: z */
    public static final byte[] f3725z;

    /* JADX INFO: renamed from: a */
    public final FileDescriptor f3726a;

    /* JADX INFO: renamed from: b */
    public final AssetManager.AssetInputStream f3727b;

    /* JADX INFO: renamed from: c */
    public int f3728c;

    /* JADX INFO: renamed from: d */
    public final HashMap[] f3729d;

    /* JADX INFO: renamed from: e */
    public final HashSet f3730e;

    /* JADX INFO: renamed from: f */
    public ByteOrder f3731f;

    /* JADX INFO: renamed from: g */
    public boolean f3732g;

    /* JADX INFO: renamed from: h */
    public int f3733h;

    /* JADX INFO: renamed from: i */
    public int f3734i;

    /* JADX INFO: renamed from: j */
    public int f3735j;

    /* JADX INFO: renamed from: k */
    public int f3736k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f3712m = new int[]{8, 8, 8};
        f3713n = new int[]{8};
        f3714o = new byte[]{-1, -40, -1};
        f3715p = new byte[]{102, 116, 121, 112};
        f3716q = new byte[]{109, 105, 102, 49};
        f3717r = new byte[]{104, 101, 105, 99};
        f3718s = new byte[]{79, 76, 89, 77, 80, 0};
        f3719t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f3720u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f3721v = new byte[]{101, 88, 73, 102};
        f3722w = new byte[]{73, 72, 68, 82};
        f3723x = new byte[]{73, 69, 78, 68};
        f3724y = new byte[]{82, 73, 70, 70};
        f3725z = new byte[]{87, 69, 66, 80};
        f3697A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f3698B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f3699C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f3700D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0228fy[] c0228fyArr = {new C0228fy(254, 4, "NewSubfileType"), new C0228fy(255, 4, "SubfileType"), new C0228fy("ImageWidth", 256, 3, 4), new C0228fy("ImageLength", 257, 3, 4), new C0228fy(258, 3, "BitsPerSample"), new C0228fy(259, 3, "Compression"), new C0228fy(262, 3, "PhotometricInterpretation"), new C0228fy(270, 2, "ImageDescription"), new C0228fy(271, 2, "Make"), new C0228fy(272, 2, "Model"), new C0228fy("StripOffsets", 273, 3, 4), new C0228fy(274, 3, "Orientation"), new C0228fy(277, 3, "SamplesPerPixel"), new C0228fy("RowsPerStrip", 278, 3, 4), new C0228fy("StripByteCounts", 279, 3, 4), new C0228fy(282, 5, "XResolution"), new C0228fy(283, 5, "YResolution"), new C0228fy(284, 3, "PlanarConfiguration"), new C0228fy(296, 3, "ResolutionUnit"), new C0228fy(301, 3, "TransferFunction"), new C0228fy(305, 2, "Software"), new C0228fy(306, 2, "DateTime"), new C0228fy(315, 2, "Artist"), new C0228fy(318, 5, "WhitePoint"), new C0228fy(319, 5, "PrimaryChromaticities"), new C0228fy(330, 4, "SubIFDPointer"), new C0228fy(513, 4, "JPEGInterchangeFormat"), new C0228fy(514, 4, "JPEGInterchangeFormatLength"), new C0228fy(529, 5, "YCbCrCoefficients"), new C0228fy(530, 3, "YCbCrSubSampling"), new C0228fy(531, 3, "YCbCrPositioning"), new C0228fy(532, 5, "ReferenceBlackWhite"), new C0228fy(33432, 2, "Copyright"), new C0228fy(34665, 4, "ExifIFDPointer"), new C0228fy(34853, 4, "GPSInfoIFDPointer"), new C0228fy(4, 4, "SensorTopBorder"), new C0228fy(5, 4, "SensorLeftBorder"), new C0228fy(6, 4, "SensorBottomBorder"), new C0228fy(7, 4, "SensorRightBorder"), new C0228fy(23, 3, "ISO"), new C0228fy(46, 7, "JpgFromRaw"), new C0228fy(700, 1, "Xmp")};
        C0228fy[] c0228fyArr2 = {new C0228fy(33434, 5, "ExposureTime"), new C0228fy(33437, 5, "FNumber"), new C0228fy(34850, 3, "ExposureProgram"), new C0228fy(34852, 2, "SpectralSensitivity"), new C0228fy(34855, 3, "PhotographicSensitivity"), new C0228fy(34856, 7, "OECF"), new C0228fy(34864, 3, "SensitivityType"), new C0228fy(34865, 4, "StandardOutputSensitivity"), new C0228fy(34866, 4, "RecommendedExposureIndex"), new C0228fy(34867, 4, "ISOSpeed"), new C0228fy(34868, 4, "ISOSpeedLatitudeyyy"), new C0228fy(34869, 4, "ISOSpeedLatitudezzz"), new C0228fy(36864, 2, "ExifVersion"), new C0228fy(36867, 2, "DateTimeOriginal"), new C0228fy(36868, 2, "DateTimeDigitized"), new C0228fy(36880, 2, "OffsetTime"), new C0228fy(36881, 2, "OffsetTimeOriginal"), new C0228fy(36882, 2, "OffsetTimeDigitized"), new C0228fy(37121, 7, "ComponentsConfiguration"), new C0228fy(37122, 5, "CompressedBitsPerPixel"), new C0228fy(37377, 10, "ShutterSpeedValue"), new C0228fy(37378, 5, "ApertureValue"), new C0228fy(37379, 10, "BrightnessValue"), new C0228fy(37380, 10, "ExposureBiasValue"), new C0228fy(37381, 5, "MaxApertureValue"), new C0228fy(37382, 5, "SubjectDistance"), new C0228fy(37383, 3, "MeteringMode"), new C0228fy(37384, 3, "LightSource"), new C0228fy(37385, 3, "Flash"), new C0228fy(37386, 5, "FocalLength"), new C0228fy(37396, 3, "SubjectArea"), new C0228fy(37500, 7, "MakerNote"), new C0228fy(37510, 7, "UserComment"), new C0228fy(37520, 2, "SubSecTime"), new C0228fy(37521, 2, "SubSecTimeOriginal"), new C0228fy(37522, 2, "SubSecTimeDigitized"), new C0228fy(40960, 7, "FlashpixVersion"), new C0228fy(40961, 3, "ColorSpace"), new C0228fy("PixelXDimension", 40962, 3, 4), new C0228fy("PixelYDimension", 40963, 3, 4), new C0228fy(40964, 2, "RelatedSoundFile"), new C0228fy(40965, 4, "InteroperabilityIFDPointer"), new C0228fy(41483, 5, "FlashEnergy"), new C0228fy(41484, 7, "SpatialFrequencyResponse"), new C0228fy(41486, 5, "FocalPlaneXResolution"), new C0228fy(41487, 5, "FocalPlaneYResolution"), new C0228fy(41488, 3, "FocalPlaneResolutionUnit"), new C0228fy(41492, 3, "SubjectLocation"), new C0228fy(41493, 5, "ExposureIndex"), new C0228fy(41495, 3, "SensingMethod"), new C0228fy(41728, 7, "FileSource"), new C0228fy(41729, 7, "SceneType"), new C0228fy(41730, 7, "CFAPattern"), new C0228fy(41985, 3, "CustomRendered"), new C0228fy(41986, 3, "ExposureMode"), new C0228fy(41987, 3, "WhiteBalance"), new C0228fy(41988, 5, "DigitalZoomRatio"), new C0228fy(41989, 3, "FocalLengthIn35mmFilm"), new C0228fy(41990, 3, "SceneCaptureType"), new C0228fy(41991, 3, "GainControl"), new C0228fy(41992, 3, "Contrast"), new C0228fy(41993, 3, "Saturation"), new C0228fy(41994, 3, "Sharpness"), new C0228fy(41995, 7, "DeviceSettingDescription"), new C0228fy(41996, 3, "SubjectDistanceRange"), new C0228fy(42016, 2, "ImageUniqueID"), new C0228fy(42032, 2, "CameraOwnerName"), new C0228fy(42033, 2, "BodySerialNumber"), new C0228fy(42034, 5, "LensSpecification"), new C0228fy(42035, 2, "LensMake"), new C0228fy(42036, 2, "LensModel"), new C0228fy(42240, 5, "Gamma"), new C0228fy(50706, 1, "DNGVersion"), new C0228fy("DefaultCropSize", 50720, 3, 4)};
        C0228fy[] c0228fyArr3 = {new C0228fy(0, 1, "GPSVersionID"), new C0228fy(1, 2, "GPSLatitudeRef"), new C0228fy("GPSLatitude", 2, 5, 10), new C0228fy(3, 2, "GPSLongitudeRef"), new C0228fy("GPSLongitude", 4, 5, 10), new C0228fy(5, 1, "GPSAltitudeRef"), new C0228fy(6, 5, "GPSAltitude"), new C0228fy(7, 5, "GPSTimeStamp"), new C0228fy(8, 2, "GPSSatellites"), new C0228fy(9, 2, "GPSStatus"), new C0228fy(10, 2, "GPSMeasureMode"), new C0228fy(11, 5, "GPSDOP"), new C0228fy(12, 2, "GPSSpeedRef"), new C0228fy(13, 5, "GPSSpeed"), new C0228fy(14, 2, "GPSTrackRef"), new C0228fy(15, 5, "GPSTrack"), new C0228fy(16, 2, "GPSImgDirectionRef"), new C0228fy(17, 5, "GPSImgDirection"), new C0228fy(18, 2, "GPSMapDatum"), new C0228fy(19, 2, "GPSDestLatitudeRef"), new C0228fy(20, 5, "GPSDestLatitude"), new C0228fy(21, 2, "GPSDestLongitudeRef"), new C0228fy(22, 5, "GPSDestLongitude"), new C0228fy(23, 2, "GPSDestBearingRef"), new C0228fy(24, 5, "GPSDestBearing"), new C0228fy(25, 2, "GPSDestDistanceRef"), new C0228fy(26, 5, "GPSDestDistance"), new C0228fy(27, 7, "GPSProcessingMethod"), new C0228fy(28, 7, "GPSAreaInformation"), new C0228fy(29, 2, "GPSDateStamp"), new C0228fy(30, 3, "GPSDifferential"), new C0228fy(31, 5, "GPSHPositioningError")};
        C0228fy[] c0228fyArr4 = {new C0228fy(1, 2, "InteroperabilityIndex")};
        C0228fy[] c0228fyArr5 = {new C0228fy(254, 4, "NewSubfileType"), new C0228fy(255, 4, "SubfileType"), new C0228fy("ThumbnailImageWidth", 256, 3, 4), new C0228fy("ThumbnailImageLength", 257, 3, 4), new C0228fy(258, 3, "BitsPerSample"), new C0228fy(259, 3, "Compression"), new C0228fy(262, 3, "PhotometricInterpretation"), new C0228fy(270, 2, "ImageDescription"), new C0228fy(271, 2, "Make"), new C0228fy(272, 2, "Model"), new C0228fy("StripOffsets", 273, 3, 4), new C0228fy(274, 3, "ThumbnailOrientation"), new C0228fy(277, 3, "SamplesPerPixel"), new C0228fy("RowsPerStrip", 278, 3, 4), new C0228fy("StripByteCounts", 279, 3, 4), new C0228fy(282, 5, "XResolution"), new C0228fy(283, 5, "YResolution"), new C0228fy(284, 3, "PlanarConfiguration"), new C0228fy(296, 3, "ResolutionUnit"), new C0228fy(301, 3, "TransferFunction"), new C0228fy(305, 2, "Software"), new C0228fy(306, 2, "DateTime"), new C0228fy(315, 2, "Artist"), new C0228fy(318, 5, "WhitePoint"), new C0228fy(319, 5, "PrimaryChromaticities"), new C0228fy(330, 4, "SubIFDPointer"), new C0228fy(513, 4, "JPEGInterchangeFormat"), new C0228fy(514, 4, "JPEGInterchangeFormatLength"), new C0228fy(529, 5, "YCbCrCoefficients"), new C0228fy(530, 3, "YCbCrSubSampling"), new C0228fy(531, 3, "YCbCrPositioning"), new C0228fy(532, 5, "ReferenceBlackWhite"), new C0228fy(33432, 2, "Copyright"), new C0228fy(34665, 4, "ExifIFDPointer"), new C0228fy(34853, 4, "GPSInfoIFDPointer"), new C0228fy(50706, 1, "DNGVersion"), new C0228fy("DefaultCropSize", 50720, 3, 4)};
        f3701E = new C0228fy(273, 3, "StripOffsets");
        f3702F = new C0228fy[][]{c0228fyArr, c0228fyArr2, c0228fyArr3, c0228fyArr4, c0228fyArr5, c0228fyArr, new C0228fy[]{new C0228fy(256, 7, "ThumbnailImage"), new C0228fy(8224, 4, "CameraSettingsIFDPointer"), new C0228fy(8256, 4, "ImageProcessingIFDPointer")}, new C0228fy[]{new C0228fy(257, 4, "PreviewImageStart"), new C0228fy(258, 4, "PreviewImageLength")}, new C0228fy[]{new C0228fy(4371, 3, "AspectFrame")}, new C0228fy[]{new C0228fy(55, 3, "ColorSpace")}};
        f3703G = new C0228fy[]{new C0228fy(330, 4, "SubIFDPointer"), new C0228fy(34665, 4, "ExifIFDPointer"), new C0228fy(34853, 4, "GPSInfoIFDPointer"), new C0228fy(40965, 4, "InteroperabilityIFDPointer"), new C0228fy(8224, 1, "CameraSettingsIFDPointer"), new C0228fy(8256, 1, "ImageProcessingIFDPointer")};
        f3704H = new HashMap[10];
        f3705I = new HashMap[10];
        f3706J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f3707K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f3708L = charsetForName;
        f3709M = "Exif\u0000\u0000".getBytes(charsetForName);
        f3710N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0228fy[][] c0228fyArr6 = f3702F;
            if (i >= c0228fyArr6.length) {
                HashMap map = f3707K;
                C0228fy[] c0228fyArr7 = f3703G;
                map.put(Integer.valueOf(c0228fyArr7[0].f2532a), 5);
                map.put(Integer.valueOf(c0228fyArr7[1].f2532a), 1);
                map.put(Integer.valueOf(c0228fyArr7[2].f2532a), 2);
                map.put(Integer.valueOf(c0228fyArr7[3].f2532a), 3);
                map.put(Integer.valueOf(c0228fyArr7[4].f2532a), 7);
                map.put(Integer.valueOf(c0228fyArr7[5].f2532a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f3704H[i] = new HashMap();
            f3705I[i] = new HashMap();
            for (C0228fy c0228fy : c0228fyArr6[i]) {
                f3704H[i].put(Integer.valueOf(c0228fy.f2532a), c0228fy);
                f3705I[i].put(c0228fy.f2533b, c0228fy);
            }
            i++;
        }
    }

    public C0339iy(InputStream inputStream) throws IOException {
        C0228fy[][] c0228fyArr = f3702F;
        this.f3729d = new HashMap[c0228fyArr.length];
        this.f3730e = new HashSet(c0228fyArr.length);
        this.f3731f = ByteOrder.BIG_ENDIAN;
        boolean z = inputStream instanceof AssetManager.AssetInputStream;
        boolean z2 = f3711l;
        if (z) {
            this.f3727b = (AssetManager.AssetInputStream) inputStream;
            this.f3726a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC0413ky.m3105c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f3727b = null;
                this.f3726a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z2) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f3727b = null;
                this.f3726a = null;
            }
        } else {
            this.f3727b = null;
            this.f3726a = null;
        }
        for (int i = 0; i < c0228fyArr.length; i++) {
            try {
                try {
                    this.f3729d[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException e) {
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m2717a();
                    if (!z2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                m2717a();
                if (z2) {
                    m2732p();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM2722f = m2722f(bufferedInputStream);
        this.f3728c = iM2722f;
        if (iM2722f == 4 || iM2722f == 9 || iM2722f == 13 || iM2722f == 14) {
            C0154dy c0154dy = new C0154dy(bufferedInputStream);
            int i2 = this.f3728c;
            if (i2 == 4) {
                m2721e(c0154dy, 0, 0);
            } else if (i2 == 13) {
                m2724h(c0154dy);
            } else if (i2 == 9) {
                m2725i(c0154dy);
            } else if (i2 == 14) {
                m2728l(c0154dy);
            }
        } else {
            C0303hy c0303hy = new C0303hy(bufferedInputStream);
            int i3 = this.f3728c;
            if (i3 == 12) {
                m2720d(c0303hy);
            } else if (i3 == 7) {
                m2723g(c0303hy);
            } else if (i3 == 10) {
                m2727k(c0303hy);
            } else {
                m2726j(c0303hy);
            }
            c0303hy.m2349e(this.f3733h);
            m2736u(c0303hy);
        }
        m2717a();
        if (!z2) {
            return;
        }
        m2732p();
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m2716q(C0154dy c0154dy) throws IOException {
        short s = c0154dy.readShort();
        boolean z = f3711l;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            C0042ay.m527d(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public final void m2717a() {
        String strM2718b = m2718b("DateTimeOriginal");
        HashMap[] mapArr = this.f3729d;
        if (strM2718b != null && m2718b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM2718b.concat("\u0000").getBytes(f3708L);
            map.put("DateTime", new C0191ey(bytes, 2, bytes.length));
        }
        if (m2718b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C0191ey.m1518a(0L, this.f3731f));
        }
        if (m2718b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C0191ey.m1518a(0L, this.f3731f));
        }
        if (m2718b("Orientation") == null) {
            mapArr[0].put("Orientation", C0191ey.m1518a(0L, this.f3731f));
        }
        if (m2718b("LightSource") == null) {
            mapArr[1].put("LightSource", C0191ey.m1518a(0L, this.f3731f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m2718b(String str) {
        C0191ey c0191eyM2719c = m2719c(str);
        if (c0191eyM2719c != null) {
            int i = c0191eyM2719c.f2203a;
            if (!f3706J.contains(str)) {
                return c0191eyM2719c.m1523f(this.f3731f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C0266gy[] c0266gyArr = (C0266gy[]) c0191eyM2719c.m1524g(this.f3731f);
                if (c0266gyArr == null || c0266gyArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c0266gyArr));
                    return null;
                }
                C0266gy c0266gy = c0266gyArr[0];
                Integer numValueOf = Integer.valueOf((int) (c0266gy.f2959a / c0266gy.f2960b));
                C0266gy c0266gy2 = c0266gyArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c0266gy2.f2959a / c0266gy2.f2960b));
                C0266gy c0266gy3 = c0266gyArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c0266gy3.f2959a / c0266gy3.f2960b)));
            }
            try {
                return Double.toString(c0191eyM2719c.m1521d(this.f3731f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C0191ey m2719c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f3711l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f3702F.length; i++) {
            C0191ey c0191ey = (C0191ey) this.f3729d[i].get(str);
            if (c0191ey != null) {
                return c0191ey;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2720d(C0303hy c0303hy) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC0450ly.m3291a(mediaMetadataRetriever, new C0118cy(c0303hy));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f3729d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C0191ey.m1520c(Integer.parseInt(strExtractMetadata), this.f3731f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C0191ey.m1520c(Integer.parseInt(strExtractMetadata2), this.f3731f));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", C0191ey.m1520c(i, this.f3731f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c0303hy.m2349e(i3);
                    byte[] bArr = new byte[6];
                    if (c0303hy.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f3709M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (c0303hy.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f3733h = i5;
                    m2733r(0, bArr2);
                }
                if (f3711l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144 A[LOOP:2: B:69:0x013a->B:74:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: e */
    public final void m2721e(p000.C0154dy r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0339iy.m2721e(dy, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x015d A[LOOP:3: B:117:0x0151->B:122:0x015d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:129:0x0171 A[LOOP:4: B:124:0x0162->B:129:0x0171, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0177 A[LOOP:2: B:112:0x0144->B:132:0x0177, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x017f  */
    /* JADX WARN: Code duplicated, block: B:152:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0170 A[EDGE_INSN: B:166:0x0170->B:128:0x0170 BREAK  A[LOOP:3: B:117:0x0151->B:122:0x015d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0170 A[EDGE_INSN: B:168:0x0170->B:128:0x0170 BREAK  A[LOOP:3: B:117:0x0151->B:122:0x015d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:14:0x0039, B:19:0x005a, B:30:0x0076, B:33:0x007c, B:34:0x0082, B:38:0x008c, B:44:0x009b, B:47:0x00a5, B:62:0x00c6, B:64:0x00ca), top: B:145:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX INFO: renamed from: f */
    public final int m2722f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        C0154dy c0154dy;
        C0154dy c0154dy2;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        byte[] bArr3;
        C0154dy c0154dy3;
        short s;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr5 = f3714o;
            if (i7 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i7] != bArr5[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    byte b = bArr4[i8];
                    ?? r7 = bytes[i8];
                    if (b != r7) {
                        ?? r4 = 0;
                        C0154dy c0154dy4 = null;
                        C0154dy c0154dy5 = null;
                        C0154dy c0154dy6 = null;
                        try {
                            try {
                                try {
                                    try {
                                        c0154dy = new C0154dy(bArr4);
                                        try {
                                            long j2 = c0154dy.readInt();
                                            byte[] bArr6 = new byte[4];
                                            c0154dy.read(bArr6);
                                            if (Arrays.equals(bArr6, f3715p)) {
                                                if (j2 == 1) {
                                                    j2 = c0154dy.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                } else {
                                                    j = 8;
                                                }
                                                if (j2 > 5000) {
                                                    j2 = 5000;
                                                }
                                                long j3 = j2 - j;
                                                if (j3 >= 8) {
                                                    byte[] bArr7 = new byte[4];
                                                    long j4 = 0;
                                                    boolean z = false;
                                                    boolean z2 = false;
                                                    while (true) {
                                                        if (j4 >= j3 / 4) {
                                                            i = 0;
                                                            break;
                                                        }
                                                        i = 0;
                                                        try {
                                                            if (c0154dy.read(bArr7) != 4) {
                                                                break;
                                                            }
                                                            if (j4 != 1) {
                                                                if (Arrays.equals(bArr7, f3716q)) {
                                                                    z = true;
                                                                } else if (Arrays.equals(bArr7, f3717r)) {
                                                                    z2 = true;
                                                                }
                                                                if (z && z2) {
                                                                    c0154dy.close();
                                                                    return 12;
                                                                }
                                                            }
                                                            j4++;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            if (f3711l) {
                                                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                            }
                                                            if (c0154dy != null) {
                                                                break;
                                                            }
                                                            c0154dy2 = new C0154dy(bArr4);
                                                            ByteOrder byteOrderM2716q = m2716q(c0154dy2);
                                                            this.f3731f = byteOrderM2716q;
                                                            c0154dy2.f1881k = byteOrderM2716q;
                                                            s = c0154dy2.readShort();
                                                            if (s != 20306) {
                                                                i2 = 1;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            c0154dy2.close();
                                                            if (i2 != 0) {
                                                                return 7;
                                                            }
                                                            try {
                                                                c0154dy3 = new C0154dy(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM2716q2 = m2716q(c0154dy3);
                                                                    this.f3731f = byteOrderM2716q2;
                                                                    c0154dy3.f1881k = byteOrderM2716q2;
                                                                    i3 = c0154dy3.readShort() != 85 ? i : 1;
                                                                    c0154dy3.close();
                                                                } catch (Exception unused) {
                                                                    c0154dy4 = c0154dy3;
                                                                    if (c0154dy4 != null) {
                                                                        c0154dy4.close();
                                                                    }
                                                                    i3 = i;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    c0154dy5 = c0154dy3;
                                                                    if (c0154dy5 != null) {
                                                                        c0154dy5.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused2) {
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                            }
                                                            if (i3 != 0) {
                                                                return 10;
                                                            }
                                                            i4 = i;
                                                            while (true) {
                                                                bArr = f3720u;
                                                                if (i4 < bArr.length) {
                                                                    return 13;
                                                                }
                                                                if (bArr4[i4] != bArr[i4]) {
                                                                    i5 = i;
                                                                    while (true) {
                                                                        bArr2 = f3724y;
                                                                        if (i5 < bArr2.length) {
                                                                            i6 = i;
                                                                            while (true) {
                                                                                bArr3 = f3725z;
                                                                                if (i6 < bArr3.length) {
                                                                                    return 14;
                                                                                }
                                                                                if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                                    break;
                                                                                }
                                                                                i6++;
                                                                            }
                                                                        } else {
                                                                            if (bArr4[i5] != bArr2[i5]) {
                                                                                break;
                                                                            }
                                                                            i5++;
                                                                        }
                                                                    }
                                                                    return i;
                                                                }
                                                                i4++;
                                                            }
                                                        }
                                                    }
                                                    c0154dy.close();
                                                    c0154dy2 = new C0154dy(bArr4);
                                                    ByteOrder byteOrderM2716q3 = m2716q(c0154dy2);
                                                    this.f3731f = byteOrderM2716q3;
                                                    c0154dy2.f1881k = byteOrderM2716q3;
                                                    s = c0154dy2.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    c0154dy2.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    c0154dy3 = new C0154dy(bArr4);
                                                    ByteOrder byteOrderM2716q4 = m2716q(c0154dy3);
                                                    this.f3731f = byteOrderM2716q4;
                                                    c0154dy3.f1881k = byteOrderM2716q4;
                                                    if (c0154dy3.readShort() != 85) {
                                                    }
                                                    c0154dy3.close();
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = f3720u;
                                                        if (i4 < bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            while (true) {
                                                                bArr2 = f3724y;
                                                                if (i5 < bArr2.length) {
                                                                    i6 = i;
                                                                    while (true) {
                                                                        bArr3 = f3725z;
                                                                        if (i6 < bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i6++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i5] != bArr2[i5]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i5++;
                                                                }
                                                            }
                                                            return i;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                                if (f3711l) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (c0154dy != null) {
                                                    c0154dy.close();
                                                }
                                                c0154dy2 = new C0154dy(bArr4);
                                                ByteOrder byteOrderM2716q5 = m2716q(c0154dy2);
                                                this.f3731f = byteOrderM2716q5;
                                                c0154dy2.f1881k = byteOrderM2716q5;
                                                s = c0154dy2.readShort();
                                                if (s != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                c0154dy2.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                c0154dy3 = new C0154dy(bArr4);
                                                ByteOrder byteOrderM2716q6 = m2716q(c0154dy3);
                                                this.f3731f = byteOrderM2716q6;
                                                c0154dy3.f1881k = byteOrderM2716q6;
                                                if (c0154dy3.readShort() != 85) {
                                                }
                                                c0154dy3.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = f3720u;
                                                    if (i4 < bArr.length) {
                                                        return 13;
                                                    }
                                                    if (bArr4[i4] != bArr[i4]) {
                                                        i5 = i;
                                                        while (true) {
                                                            bArr2 = f3724y;
                                                            if (i5 < bArr2.length) {
                                                                i6 = i;
                                                                while (true) {
                                                                    bArr3 = f3725z;
                                                                    if (i6 < bArr3.length) {
                                                                        return 14;
                                                                    }
                                                                    if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                            } else {
                                                                if (bArr4[i5] != bArr2[i5]) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i5++;
                                                            }
                                                        }
                                                        return i;
                                                    }
                                                    i4++;
                                                }
                                            }
                                            c0154dy.close();
                                            i = 0;
                                        } catch (Exception e2) {
                                            e = e2;
                                            i = 0;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r4 = r7;
                                        if (r4 != 0) {
                                            r4.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i = 0;
                                    c0154dy = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    throw th;
                                }
                                ByteOrder byteOrderM2716q7 = m2716q(c0154dy2);
                                this.f3731f = byteOrderM2716q7;
                                c0154dy2.f1881k = byteOrderM2716q7;
                                s = c0154dy2.readShort();
                                if (s != 20306) {
                                    i2 = 1;
                                } else {
                                    i2 = 1;
                                }
                                c0154dy2.close();
                            } catch (Exception unused3) {
                                if (c0154dy2 != null) {
                                    c0154dy2.close();
                                }
                                i2 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                c0154dy6 = c0154dy2;
                                if (c0154dy6 != null) {
                                    c0154dy6.close();
                                }
                                throw th;
                            }
                            c0154dy2 = new C0154dy(bArr4);
                        } catch (Exception unused4) {
                            c0154dy2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i2 != 0) {
                            return 7;
                        }
                        c0154dy3 = new C0154dy(bArr4);
                        ByteOrder byteOrderM2716q8 = m2716q(c0154dy3);
                        this.f3731f = byteOrderM2716q8;
                        c0154dy3.f1881k = byteOrderM2716q8;
                        if (c0154dy3.readShort() != 85) {
                        }
                        c0154dy3.close();
                        if (i3 != 0) {
                            return 10;
                        }
                        i4 = i;
                        while (true) {
                            bArr = f3720u;
                            if (i4 < bArr.length) {
                                return 13;
                            }
                            if (bArr4[i4] != bArr[i4]) {
                                i5 = i;
                                while (true) {
                                    bArr2 = f3724y;
                                    if (i5 < bArr2.length) {
                                        i6 = i;
                                        while (true) {
                                            bArr3 = f3725z;
                                            if (i6 < bArr3.length) {
                                                return 14;
                                            }
                                            if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                break;
                                                break;
                                            }
                                            i6++;
                                        }
                                    } else {
                                        if (bArr4[i5] != bArr2[i5]) {
                                            break;
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                                return i;
                            }
                            i4++;
                        }
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2723g(C0303hy c0303hy) throws Throwable {
        int i;
        int i2;
        m2726j(c0303hy);
        HashMap[] mapArr = this.f3729d;
        C0191ey c0191ey = (C0191ey) mapArr[1].get("MakerNote");
        if (c0191ey != null) {
            C0303hy c0303hy2 = new C0303hy(c0191ey.f2206d);
            c0303hy2.f1881k = this.f3731f;
            byte[] bArr = f3718s;
            byte[] bArr2 = new byte[bArr.length];
            c0303hy2.readFully(bArr2);
            c0303hy2.m2349e(0L);
            byte[] bArr3 = f3719t;
            byte[] bArr4 = new byte[bArr3.length];
            c0303hy2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0303hy2.m2349e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0303hy2.m2349e(12L);
            }
            m2734s(c0303hy2, 6);
            C0191ey c0191ey2 = (C0191ey) mapArr[7].get("PreviewImageStart");
            C0191ey c0191ey3 = (C0191ey) mapArr[7].get("PreviewImageLength");
            if (c0191ey2 != null && c0191ey3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c0191ey2);
                mapArr[5].put("JPEGInterchangeFormatLength", c0191ey3);
            }
            C0191ey c0191ey4 = (C0191ey) mapArr[8].get("AspectFrame");
            if (c0191ey4 != null) {
                int[] iArr = (int[]) c0191ey4.m1524g(this.f3731f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
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
                C0191ey c0191eyM1520c = C0191ey.m1520c(i5, this.f3731f);
                C0191ey c0191eyM1520c2 = C0191ey.m1520c(i6, this.f3731f);
                mapArr[0].put("ImageWidth", c0191eyM1520c);
                mapArr[0].put("ImageLength", c0191eyM1520c2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2724h(C0154dy c0154dy) throws Throwable {
        if (f3711l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0154dy);
        }
        c0154dy.f1881k = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f3720u;
        c0154dy.m1325a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c0154dy.readInt();
                byte[] bArr2 = new byte[4];
                if (c0154dy.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f3722w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f3723x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f3721v)) {
                    byte[] bArr3 = new byte[i];
                    if (c0154dy.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + j22.m2793b(bArr2));
                    }
                    int i3 = c0154dy.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f3733h = i2;
                        m2733r(0, bArr3);
                        m2739x();
                        m2736u(new C0154dy(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c0154dy.m1325a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                C0270h1.m2187c("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2725i(C0154dy c0154dy) throws Throwable {
        boolean z = f3711l;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0154dy);
        }
        c0154dy.m1325a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0154dy.read(bArr);
        c0154dy.read(bArr2);
        c0154dy.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c0154dy.m1325a(i - c0154dy.f1882l);
        c0154dy.read(bArr4);
        m2721e(new C0154dy(bArr4), i, 5);
        c0154dy.m1325a(i3 - c0154dy.f1882l);
        c0154dy.f1881k = ByteOrder.BIG_ENDIAN;
        int i4 = c0154dy.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c0154dy.readUnsignedShort();
            int unsignedShort2 = c0154dy.readUnsignedShort();
            if (unsignedShort == f3701E.f2532a) {
                short s = c0154dy.readShort();
                short s2 = c0154dy.readShort();
                C0191ey c0191eyM1520c = C0191ey.m1520c(s, this.f3731f);
                C0191ey c0191eyM1520c2 = C0191ey.m1520c(s2, this.f3731f);
                HashMap[] mapArr = this.f3729d;
                mapArr[0].put("ImageLength", c0191eyM1520c);
                mapArr[0].put("ImageWidth", c0191eyM1520c2);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c0154dy.m1325a(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2726j(C0303hy c0303hy) throws Throwable {
        m2731o(c0303hy);
        m2734s(c0303hy, 0);
        m2738w(c0303hy, 0);
        m2738w(c0303hy, 5);
        m2738w(c0303hy, 4);
        m2739x();
        if (this.f3728c == 8) {
            HashMap[] mapArr = this.f3729d;
            C0191ey c0191ey = (C0191ey) mapArr[1].get("MakerNote");
            if (c0191ey != null) {
                C0303hy c0303hy2 = new C0303hy(c0191ey.f2206d);
                c0303hy2.f1881k = this.f3731f;
                c0303hy2.m1325a(6);
                m2734s(c0303hy2, 9);
                C0191ey c0191ey2 = (C0191ey) mapArr[9].get("ColorSpace");
                if (c0191ey2 != null) {
                    mapArr[1].put("ColorSpace", c0191ey2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2727k(C0303hy c0303hy) throws Throwable {
        if (f3711l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c0303hy);
        }
        m2726j(c0303hy);
        HashMap[] mapArr = this.f3729d;
        C0191ey c0191ey = (C0191ey) mapArr[0].get("JpgFromRaw");
        if (c0191ey != null) {
            m2721e(new C0154dy(c0191ey.f2206d), (int) c0191ey.f2205c, 5);
        }
        C0191ey c0191ey2 = (C0191ey) mapArr[0].get("ISO");
        C0191ey c0191ey3 = (C0191ey) mapArr[1].get("PhotographicSensitivity");
        if (c0191ey2 == null || c0191ey3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c0191ey2);
    }

    /* JADX INFO: renamed from: l */
    public final void m2728l(C0154dy c0154dy) throws Throwable {
        if (f3711l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0154dy);
        }
        c0154dy.f1881k = ByteOrder.LITTLE_ENDIAN;
        c0154dy.m1325a(f3724y.length);
        int i = c0154dy.readInt() + 8;
        byte[] bArr = f3725z;
        c0154dy.m1325a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0154dy.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c0154dy.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f3697A, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c0154dy.read(bArr3) == i2) {
                        this.f3733h = i3;
                        m2733r(0, bArr3);
                        m2736u(new C0154dy(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + j22.m2793b(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c0154dy.m1325a(i2);
            } catch (EOFException unused) {
                C0270h1.m2187c("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2729m(C0154dy c0154dy, HashMap map) throws Throwable {
        C0191ey c0191ey = (C0191ey) map.get("JPEGInterchangeFormat");
        C0191ey c0191ey2 = (C0191ey) map.get("JPEGInterchangeFormatLength");
        if (c0191ey == null || c0191ey2 == null) {
            return;
        }
        int iM1522e = c0191ey.m1522e(this.f3731f);
        int iM1522e2 = c0191ey2.m1522e(this.f3731f);
        if (this.f3728c == 7) {
            iM1522e += this.f3734i;
        }
        if (iM1522e > 0 && iM1522e2 > 0 && this.f3727b == null && this.f3726a == null) {
            c0154dy.skip(iM1522e);
            c0154dy.read(new byte[iM1522e2]);
        }
        if (f3711l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM1522e + ", length: " + iM1522e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2730n(HashMap map) {
        C0191ey c0191ey = (C0191ey) map.get("ImageLength");
        C0191ey c0191ey2 = (C0191ey) map.get("ImageWidth");
        if (c0191ey == null || c0191ey2 == null) {
            return false;
        }
        return c0191ey.m1522e(this.f3731f) <= 512 && c0191ey2.m1522e(this.f3731f) <= 512;
    }

    /* JADX INFO: renamed from: o */
    public final void m2731o(C0303hy c0303hy) throws IOException {
        ByteOrder byteOrderM2716q = m2716q(c0303hy);
        this.f3731f = byteOrderM2716q;
        c0303hy.f1881k = byteOrderM2716q;
        int unsignedShort = c0303hy.readUnsignedShort();
        int i = this.f3728c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            C0042ay.m527d(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = c0303hy.readInt();
        if (i2 < 8) {
            C0270h1.m2187c(j11.m2773h("Invalid first Ifd offset: ", i2));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c0303hy.m1325a(i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2732p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f3729d;
            if (i >= mapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + mapArr[i].size());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C0191ey c0191ey = (C0191ey) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c0191ey.toString() + ", tagValue: '" + c0191ey.m1523f(this.f3731f) + "'");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2733r(int i, byte[] bArr) throws IOException {
        C0303hy c0303hy = new C0303hy(bArr);
        m2731o(c0303hy);
        m2734s(c0303hy, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0220  */
    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x0238  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x028a  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02df  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309  */
    /* JADX WARN: Code duplicated, block: B:167:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:97:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0269, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x028a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0160, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01e8, please report this as an issue */
    /* JADX INFO: renamed from: s */
    public final void m2734s(C0303hy c0303hy, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z;
        int i2;
        long j3;
        Integer num;
        long j4;
        String str;
        int i3;
        int unsignedShort;
        long j5;
        int i4;
        Integer numValueOf = Integer.valueOf(c0303hy.f1882l);
        HashSet hashSet = this.f3730e;
        hashSet.add(numValueOf);
        short s = c0303hy.readShort();
        boolean z2 = f3711l;
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s));
        }
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            mapArr = this.f3729d;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = c0303hy.readUnsignedShort();
            int unsignedShort3 = c0303hy.readUnsignedShort();
            int i5 = c0303hy.readInt();
            long j6 = ((long) c0303hy.f1882l) + 4;
            C0228fy c0228fy = (C0228fy) f3704H[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c0228fy != null ? c0228fy.f2533b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            }
            if (c0228fy != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f3699C;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = c0228fy.f2534c;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = c0228fy.f2535d) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            j = j6;
                            j2 = ((long) i5) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i5);
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f3698B[unsignedShort3] + ") is unexpected for tag: " + c0228fy.f2533b);
                        }
                    }
                    if (z) {
                        j3 = j;
                        if (j2 > 4) {
                            i4 = c0303hy.readInt();
                            if (z2 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i4);
                            }
                            if (this.f3728c == 7) {
                                if ("MakerNote".equals(c0228fy.f2533b)) {
                                    this.f3734i = i4;
                                } else if (i != 6 && "ThumbnailImage".equals(c0228fy.f2533b)) {
                                    this.f3735j = i4;
                                    this.f3736k = i5;
                                    C0191ey c0191eyM1520c = C0191ey.m1520c(6, this.f3731f);
                                    C0191ey c0191eyM1518a = C0191ey.m1518a(this.f3735j, this.f3731f);
                                    C0191ey c0191eyM1518a2 = C0191ey.m1518a(this.f3736k, this.f3731f);
                                    mapArr[4].put("Compression", c0191eyM1520c);
                                    mapArr[4].put("JPEGInterchangeFormat", c0191eyM1518a);
                                    mapArr[4].put("JPEGInterchangeFormatLength", c0191eyM1518a2);
                                }
                            }
                            c0303hy.m2349e(i4);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            unsignedShort3 = unsignedShort3;
                        }
                        num = (Integer) f3707K.get(Integer.valueOf(unsignedShort2));
                        if (z2 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            i3 = unsignedShort3;
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    j5 = ((long) c0303hy.readInt()) & 4294967295L;
                                } else if (i3 == 8) {
                                    unsignedShort = c0303hy.readShort();
                                } else if (i3 != 9 || i3 == 13) {
                                    unsignedShort = c0303hy.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z2 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0228fy.f2533b));
                                }
                                if (j5 > 0) {
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        c0303hy.m2349e(j5);
                                        m2734s(c0303hy, num.intValue());
                                    } else if (z2 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                                }
                                c0303hy.m2349e(j3);
                            } else {
                                unsignedShort = c0303hy.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0228fy.f2533b));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    c0303hy.m2349e(j5);
                                    m2734s(c0303hy, num.intValue());
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            c0303hy.m2349e(j3);
                        } else {
                            j4 = j3;
                            int i7 = c0303hy.f1882l + this.f3733h;
                            byte[] bArr = new byte[(int) j2];
                            c0303hy.readFully(bArr);
                            C0191ey c0191ey = new C0191ey(i7, bArr, unsignedShort3, i5);
                            HashMap map = mapArr[i];
                            str = c0228fy.f2533b;
                            map.put(str, c0191ey);
                            if ("DNGVersion".equals(str)) {
                                this.f3728c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && c0191ey.m1523f(this.f3731f).contains("PENTAX")) || ("Compression".equals(str) && c0191ey.m1522e(this.f3731f) == 65535)) {
                                this.f3728c = 8;
                            }
                            if (c0303hy.f1882l != j4) {
                                c0303hy.m2349e(j4);
                            }
                        }
                    } else {
                        c0303hy.m2349e(j);
                    }
                    s2 = (short) (s2 + 1);
                    s = s;
                    z2 = z2;
                }
                j = j6;
                if (z2 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z = false;
                if (z) {
                    c0303hy.m2349e(j);
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i4 = c0303hy.readInt();
                        if (z2 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.f3728c == 7) {
                            if ("MakerNote".equals(c0228fy.f2533b)) {
                                this.f3734i = i4;
                            } else if (i != 6) {
                            }
                        }
                        c0303hy.m2349e(i4);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        unsignedShort3 = unsignedShort3;
                    }
                    num = (Integer) f3707K.get(Integer.valueOf(unsignedShort2));
                    if (z2 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        i3 = unsignedShort3;
                        if (i3 != 3) {
                            if (i3 == 4) {
                                j5 = ((long) c0303hy.readInt()) & 4294967295L;
                            } else if (i3 == 8) {
                                if (i3 != 9) {
                                }
                                unsignedShort = c0303hy.readInt();
                            } else {
                                unsignedShort = c0303hy.readShort();
                            }
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0228fy.f2533b));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    c0303hy.m2349e(j5);
                                    m2734s(c0303hy, num.intValue());
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            c0303hy.m2349e(j3);
                        } else {
                            unsignedShort = c0303hy.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0228fy.f2533b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c0303hy.m2349e(j5);
                                m2734s(c0303hy, num.intValue());
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c0303hy.m2349e(j3);
                    } else {
                        j4 = j3;
                        int i8 = c0303hy.f1882l + this.f3733h;
                        byte[] bArr2 = new byte[(int) j2];
                        c0303hy.readFully(bArr2);
                        C0191ey c0191ey2 = new C0191ey(i8, bArr2, unsignedShort3, i5);
                        HashMap map2 = mapArr[i];
                        str = c0228fy.f2533b;
                        map2.put(str, c0191ey2);
                        if ("DNGVersion".equals(str)) {
                            this.f3728c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f3728c = 8;
                        if (c0303hy.f1882l != j4) {
                            c0303hy.m2349e(j4);
                        }
                    }
                }
                s2 = (short) (s2 + 1);
                s = s;
                z2 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z = false;
            if (z) {
                c0303hy.m2349e(j);
            } else {
                j3 = j;
                if (j2 > 4) {
                    i4 = c0303hy.readInt();
                    if (z2 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.f3728c == 7) {
                        if ("MakerNote".equals(c0228fy.f2533b)) {
                            this.f3734i = i4;
                        } else if (i != 6) {
                        }
                    }
                    c0303hy.m2349e(i4);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    unsignedShort3 = unsignedShort3;
                }
                num = (Integer) f3707K.get(Integer.valueOf(unsignedShort2));
                if (z2 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    i3 = unsignedShort3;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            j5 = ((long) c0303hy.readInt()) & 4294967295L;
                        } else if (i3 == 8) {
                            if (i3 != 9) {
                            }
                            unsignedShort = c0303hy.readInt();
                        } else {
                            unsignedShort = c0303hy.readShort();
                        }
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0228fy.f2533b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c0303hy.m2349e(j5);
                                m2734s(c0303hy, num.intValue());
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c0303hy.m2349e(j3);
                    } else {
                        unsignedShort = c0303hy.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z2 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0228fy.f2533b));
                    }
                    if (j5 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j5))) {
                            c0303hy.m2349e(j5);
                            m2734s(c0303hy, num.intValue());
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                        }
                    } else if (z2 != 0) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                    }
                    c0303hy.m2349e(j3);
                } else {
                    j4 = j3;
                    int i9 = c0303hy.f1882l + this.f3733h;
                    byte[] bArr3 = new byte[(int) j2];
                    c0303hy.readFully(bArr3);
                    C0191ey c0191ey3 = new C0191ey(i9, bArr3, unsignedShort3, i5);
                    HashMap map3 = mapArr[i];
                    str = c0228fy.f2533b;
                    map3.put(str, c0191ey3);
                    if ("DNGVersion".equals(str)) {
                        this.f3728c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f3728c = 8;
                    if (c0303hy.f1882l != j4) {
                        c0303hy.m2349e(j4);
                    }
                }
            }
            s2 = (short) (s2 + 1);
            s = s;
            z2 = z2;
        }
        boolean z3 = z2;
        int i10 = c0303hy.readInt();
        if (z3) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j7 = i10;
        if (j7 <= 0) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i10))) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        c0303hy.m2349e(j7);
        if (mapArr[4].isEmpty()) {
            m2734s(c0303hy, 4);
        } else if (mapArr[5].isEmpty()) {
            m2734s(c0303hy, 5);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2735t(int i, String str, String str2) {
        HashMap[] mapArr = this.f3729d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m2736u(C0154dy c0154dy) throws Throwable {
        C0191ey c0191ey;
        int iM1522e;
        HashMap map = this.f3729d[4];
        C0191ey c0191ey2 = (C0191ey) map.get("Compression");
        if (c0191ey2 == null) {
            m2729m(c0154dy, map);
            return;
        }
        int iM1522e2 = c0191ey2.m1522e(this.f3731f);
        if (iM1522e2 != 1) {
            if (iM1522e2 == 6) {
                m2729m(c0154dy, map);
                return;
            } else if (iM1522e2 != 7) {
                return;
            }
        }
        C0191ey c0191ey3 = (C0191ey) map.get("BitsPerSample");
        if (c0191ey3 != null) {
            int[] iArr = (int[]) c0191ey3.m1524g(this.f3731f);
            int[] iArr2 = f3712m;
            if (Arrays.equals(iArr2, iArr) || (this.f3728c == 3 && (c0191ey = (C0191ey) map.get("PhotometricInterpretation")) != null && (((iM1522e = c0191ey.m1522e(this.f3731f)) == 1 && Arrays.equals(iArr, f3713n)) || (iM1522e == 6 && Arrays.equals(iArr, iArr2))))) {
                C0191ey c0191ey4 = (C0191ey) map.get("StripOffsets");
                C0191ey c0191ey5 = (C0191ey) map.get("StripByteCounts");
                if (c0191ey4 == null || c0191ey5 == null) {
                    return;
                }
                long[] jArrM2796e = j22.m2796e(c0191ey4.m1524g(this.f3731f));
                long[] jArrM2796e2 = j22.m2796e(c0191ey5.m1524g(this.f3731f));
                if (jArrM2796e == null || jArrM2796e.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM2796e2 == null || jArrM2796e2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM2796e.length != jArrM2796e2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM2796e2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f3732g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM2796e.length; i3++) {
                    int i4 = (int) jArrM2796e[i3];
                    int i5 = (int) jArrM2796e2[i3];
                    if (i3 < jArrM2796e.length - 1 && i4 + i5 != jArrM2796e[i3 + 1]) {
                        this.f3732g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c0154dy.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c0154dy.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f3732g) {
                    long j4 = jArrM2796e[0];
                    return;
                }
                return;
            }
        }
        if (f3711l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2737v(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f3729d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f3711l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C0191ey c0191ey = (C0191ey) mapArr[i].get("ImageLength");
        C0191ey c0191ey2 = (C0191ey) mapArr[i].get("ImageWidth");
        C0191ey c0191ey3 = (C0191ey) mapArr[i2].get("ImageLength");
        C0191ey c0191ey4 = (C0191ey) mapArr[i2].get("ImageWidth");
        if (c0191ey == null || c0191ey2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c0191ey3 == null || c0191ey4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM1522e = c0191ey.m1522e(this.f3731f);
        int iM1522e2 = c0191ey2.m1522e(this.f3731f);
        int iM1522e3 = c0191ey3.m1522e(this.f3731f);
        int iM1522e4 = c0191ey4.m1522e(this.f3731f);
        if (iM1522e >= iM1522e3 || iM1522e2 >= iM1522e4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: w */
    public final void m2738w(C0303hy c0303hy, int i) throws Throwable {
        C0191ey c0191eyM1520c;
        C0191ey c0191eyM1520c2;
        HashMap[] mapArr = this.f3729d;
        C0191ey c0191ey = (C0191ey) mapArr[i].get("DefaultCropSize");
        C0191ey c0191ey2 = (C0191ey) mapArr[i].get("SensorTopBorder");
        C0191ey c0191ey3 = (C0191ey) mapArr[i].get("SensorLeftBorder");
        C0191ey c0191ey4 = (C0191ey) mapArr[i].get("SensorBottomBorder");
        C0191ey c0191ey5 = (C0191ey) mapArr[i].get("SensorRightBorder");
        if (c0191ey != null) {
            int i2 = c0191ey.f2203a;
            ByteOrder byteOrder = this.f3731f;
            if (i2 == 5) {
                C0266gy[] c0266gyArr = (C0266gy[]) c0191ey.m1524g(byteOrder);
                if (c0266gyArr == null || c0266gyArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c0266gyArr));
                    return;
                }
                c0191eyM1520c = C0191ey.m1519b(c0266gyArr[0], this.f3731f);
                c0191eyM1520c2 = C0191ey.m1519b(c0266gyArr[1], this.f3731f);
            } else {
                int[] iArr = (int[]) c0191ey.m1524g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c0191eyM1520c = C0191ey.m1520c(iArr[0], this.f3731f);
                c0191eyM1520c2 = C0191ey.m1520c(iArr[1], this.f3731f);
            }
            mapArr[i].put("ImageWidth", c0191eyM1520c);
            mapArr[i].put("ImageLength", c0191eyM1520c2);
            return;
        }
        if (c0191ey2 != null && c0191ey3 != null && c0191ey4 != null && c0191ey5 != null) {
            int iM1522e = c0191ey2.m1522e(this.f3731f);
            int iM1522e2 = c0191ey4.m1522e(this.f3731f);
            int iM1522e3 = c0191ey5.m1522e(this.f3731f);
            int iM1522e4 = c0191ey3.m1522e(this.f3731f);
            if (iM1522e2 <= iM1522e || iM1522e3 <= iM1522e4) {
                return;
            }
            C0191ey c0191eyM1520c3 = C0191ey.m1520c(iM1522e2 - iM1522e, this.f3731f);
            C0191ey c0191eyM1520c4 = C0191ey.m1520c(iM1522e3 - iM1522e4, this.f3731f);
            mapArr[i].put("ImageLength", c0191eyM1520c3);
            mapArr[i].put("ImageWidth", c0191eyM1520c4);
            return;
        }
        C0191ey c0191ey6 = (C0191ey) mapArr[i].get("ImageLength");
        C0191ey c0191ey7 = (C0191ey) mapArr[i].get("ImageWidth");
        if (c0191ey6 == null || c0191ey7 == null) {
            C0191ey c0191ey8 = (C0191ey) mapArr[i].get("JPEGInterchangeFormat");
            C0191ey c0191ey9 = (C0191ey) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c0191ey8 == null || c0191ey9 == null) {
                return;
            }
            int iM1522e5 = c0191ey8.m1522e(this.f3731f);
            int iM1522e6 = c0191ey8.m1522e(this.f3731f);
            c0303hy.m2349e(iM1522e5);
            byte[] bArr = new byte[iM1522e6];
            c0303hy.read(bArr);
            m2721e(new C0154dy(bArr), iM1522e5, i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2739x() throws Throwable {
        m2737v(0, 5);
        m2737v(0, 4);
        m2737v(5, 4);
        HashMap[] mapArr = this.f3729d;
        C0191ey c0191ey = (C0191ey) mapArr[1].get("PixelXDimension");
        C0191ey c0191ey2 = (C0191ey) mapArr[1].get("PixelYDimension");
        if (c0191ey != null && c0191ey2 != null) {
            mapArr[0].put("ImageWidth", c0191ey);
            mapArr[0].put("ImageLength", c0191ey2);
        }
        if (mapArr[4].isEmpty() && m2730n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m2730n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m2735t(0, "ThumbnailOrientation", "Orientation");
        m2735t(0, "ThumbnailImageLength", "ImageLength");
        m2735t(0, "ThumbnailImageWidth", "ImageWidth");
        m2735t(5, "ThumbnailOrientation", "Orientation");
        m2735t(5, "ThumbnailImageLength", "ImageLength");
        m2735t(5, "ThumbnailImageWidth", "ImageWidth");
        m2735t(4, "Orientation", "ThumbnailOrientation");
        m2735t(4, "ImageLength", "ThumbnailImageLength");
        m2735t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
