package y1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
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
import n.AbstractC2107A;
import v.q0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f21152A;

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f21153B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f21154C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f21155D;

    /* renamed from: E, reason: collision with root package name */
    public static final C2660d f21156E;

    /* renamed from: F, reason: collision with root package name */
    public static final C2660d[][] f21157F;

    /* renamed from: G, reason: collision with root package name */
    public static final C2660d[] f21158G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f21159H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f21160I;
    public static final HashSet J;
    public static final HashMap K;

    /* renamed from: L, reason: collision with root package name */
    public static final Charset f21161L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f21162M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f21163N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f21164l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f21165m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f21166n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f21167o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f21168p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f21169q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f21170r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f21171s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f21172t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f21173u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f21174v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f21175w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f21176x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f21177y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f21178z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f21179a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f21180b;

    /* renamed from: c, reason: collision with root package name */
    public int f21181c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f21182d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f21183e;
    public ByteOrder f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21184g;

    /* renamed from: h, reason: collision with root package name */
    public int f21185h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f21186j;

    /* renamed from: k, reason: collision with root package name */
    public int f21187k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f21165m = new int[]{8, 8, 8};
        f21166n = new int[]{8};
        f21167o = new byte[]{-1, -40, -1};
        f21168p = new byte[]{102, 116, 121, 112};
        f21169q = new byte[]{109, 105, 102, 49};
        f21170r = new byte[]{104, 101, 105, 99};
        f21171s = new byte[]{79, 76, 89, 77, 80, 0};
        f21172t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f21173u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f21174v = new byte[]{101, 88, 73, 102};
        f21175w = new byte[]{73, 72, 68, 82};
        f21176x = new byte[]{73, 69, 78, 68};
        f21177y = new byte[]{82, 73, 70, 70};
        f21178z = new byte[]{87, 69, 66, 80};
        f21152A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f21153B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f21154C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f21155D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C2660d[] c2660dArr = {new C2660d(254, 4, "NewSubfileType"), new C2660d(255, 4, "SubfileType"), new C2660d(256, 3, 4, "ImageWidth"), new C2660d(257, 3, 4, "ImageLength"), new C2660d(258, 3, "BitsPerSample"), new C2660d(259, 3, "Compression"), new C2660d(262, 3, "PhotometricInterpretation"), new C2660d(270, 2, "ImageDescription"), new C2660d(271, 2, "Make"), new C2660d(272, 2, "Model"), new C2660d(273, 3, 4, "StripOffsets"), new C2660d(274, 3, "Orientation"), new C2660d(277, 3, "SamplesPerPixel"), new C2660d(278, 3, 4, "RowsPerStrip"), new C2660d(279, 3, 4, "StripByteCounts"), new C2660d(282, 5, "XResolution"), new C2660d(283, 5, "YResolution"), new C2660d(284, 3, "PlanarConfiguration"), new C2660d(296, 3, "ResolutionUnit"), new C2660d(301, 3, "TransferFunction"), new C2660d(305, 2, "Software"), new C2660d(306, 2, "DateTime"), new C2660d(315, 2, "Artist"), new C2660d(318, 5, "WhitePoint"), new C2660d(319, 5, "PrimaryChromaticities"), new C2660d(330, 4, "SubIFDPointer"), new C2660d(513, 4, "JPEGInterchangeFormat"), new C2660d(514, 4, "JPEGInterchangeFormatLength"), new C2660d(529, 5, "YCbCrCoefficients"), new C2660d(530, 3, "YCbCrSubSampling"), new C2660d(531, 3, "YCbCrPositioning"), new C2660d(532, 5, "ReferenceBlackWhite"), new C2660d(33432, 2, "Copyright"), new C2660d(34665, 4, "ExifIFDPointer"), new C2660d(34853, 4, "GPSInfoIFDPointer"), new C2660d(4, 4, "SensorTopBorder"), new C2660d(5, 4, "SensorLeftBorder"), new C2660d(6, 4, "SensorBottomBorder"), new C2660d(7, 4, "SensorRightBorder"), new C2660d(23, 3, "ISO"), new C2660d(46, 7, "JpgFromRaw"), new C2660d(700, 1, "Xmp")};
        C2660d[] c2660dArr2 = {new C2660d(33434, 5, "ExposureTime"), new C2660d(33437, 5, "FNumber"), new C2660d(34850, 3, "ExposureProgram"), new C2660d(34852, 2, "SpectralSensitivity"), new C2660d(34855, 3, "PhotographicSensitivity"), new C2660d(34856, 7, "OECF"), new C2660d(34864, 3, "SensitivityType"), new C2660d(34865, 4, "StandardOutputSensitivity"), new C2660d(34866, 4, "RecommendedExposureIndex"), new C2660d(34867, 4, "ISOSpeed"), new C2660d(34868, 4, "ISOSpeedLatitudeyyy"), new C2660d(34869, 4, "ISOSpeedLatitudezzz"), new C2660d(36864, 2, "ExifVersion"), new C2660d(36867, 2, "DateTimeOriginal"), new C2660d(36868, 2, "DateTimeDigitized"), new C2660d(36880, 2, "OffsetTime"), new C2660d(36881, 2, "OffsetTimeOriginal"), new C2660d(36882, 2, "OffsetTimeDigitized"), new C2660d(37121, 7, "ComponentsConfiguration"), new C2660d(37122, 5, "CompressedBitsPerPixel"), new C2660d(37377, 10, "ShutterSpeedValue"), new C2660d(37378, 5, "ApertureValue"), new C2660d(37379, 10, "BrightnessValue"), new C2660d(37380, 10, "ExposureBiasValue"), new C2660d(37381, 5, "MaxApertureValue"), new C2660d(37382, 5, "SubjectDistance"), new C2660d(37383, 3, "MeteringMode"), new C2660d(37384, 3, "LightSource"), new C2660d(37385, 3, "Flash"), new C2660d(37386, 5, "FocalLength"), new C2660d(37396, 3, "SubjectArea"), new C2660d(37500, 7, "MakerNote"), new C2660d(37510, 7, "UserComment"), new C2660d(37520, 2, "SubSecTime"), new C2660d(37521, 2, "SubSecTimeOriginal"), new C2660d(37522, 2, "SubSecTimeDigitized"), new C2660d(40960, 7, "FlashpixVersion"), new C2660d(40961, 3, "ColorSpace"), new C2660d(40962, 3, 4, "PixelXDimension"), new C2660d(40963, 3, 4, "PixelYDimension"), new C2660d(40964, 2, "RelatedSoundFile"), new C2660d(40965, 4, "InteroperabilityIFDPointer"), new C2660d(41483, 5, "FlashEnergy"), new C2660d(41484, 7, "SpatialFrequencyResponse"), new C2660d(41486, 5, "FocalPlaneXResolution"), new C2660d(41487, 5, "FocalPlaneYResolution"), new C2660d(41488, 3, "FocalPlaneResolutionUnit"), new C2660d(41492, 3, "SubjectLocation"), new C2660d(41493, 5, "ExposureIndex"), new C2660d(41495, 3, "SensingMethod"), new C2660d(41728, 7, "FileSource"), new C2660d(41729, 7, "SceneType"), new C2660d(41730, 7, "CFAPattern"), new C2660d(41985, 3, "CustomRendered"), new C2660d(41986, 3, "ExposureMode"), new C2660d(41987, 3, "WhiteBalance"), new C2660d(41988, 5, "DigitalZoomRatio"), new C2660d(41989, 3, "FocalLengthIn35mmFilm"), new C2660d(41990, 3, "SceneCaptureType"), new C2660d(41991, 3, "GainControl"), new C2660d(41992, 3, "Contrast"), new C2660d(41993, 3, "Saturation"), new C2660d(41994, 3, "Sharpness"), new C2660d(41995, 7, "DeviceSettingDescription"), new C2660d(41996, 3, "SubjectDistanceRange"), new C2660d(42016, 2, "ImageUniqueID"), new C2660d(42032, 2, "CameraOwnerName"), new C2660d(42033, 2, "BodySerialNumber"), new C2660d(42034, 5, "LensSpecification"), new C2660d(42035, 2, "LensMake"), new C2660d(42036, 2, "LensModel"), new C2660d(42240, 5, "Gamma"), new C2660d(50706, 1, "DNGVersion"), new C2660d(50720, 3, 4, "DefaultCropSize")};
        C2660d[] c2660dArr3 = {new C2660d(0, 1, "GPSVersionID"), new C2660d(1, 2, "GPSLatitudeRef"), new C2660d(2, 5, 10, "GPSLatitude"), new C2660d(3, 2, "GPSLongitudeRef"), new C2660d(4, 5, 10, "GPSLongitude"), new C2660d(5, 1, "GPSAltitudeRef"), new C2660d(6, 5, "GPSAltitude"), new C2660d(7, 5, "GPSTimeStamp"), new C2660d(8, 2, "GPSSatellites"), new C2660d(9, 2, "GPSStatus"), new C2660d(10, 2, "GPSMeasureMode"), new C2660d(11, 5, "GPSDOP"), new C2660d(12, 2, "GPSSpeedRef"), new C2660d(13, 5, "GPSSpeed"), new C2660d(14, 2, "GPSTrackRef"), new C2660d(15, 5, "GPSTrack"), new C2660d(16, 2, "GPSImgDirectionRef"), new C2660d(17, 5, "GPSImgDirection"), new C2660d(18, 2, "GPSMapDatum"), new C2660d(19, 2, "GPSDestLatitudeRef"), new C2660d(20, 5, "GPSDestLatitude"), new C2660d(21, 2, "GPSDestLongitudeRef"), new C2660d(22, 5, "GPSDestLongitude"), new C2660d(23, 2, "GPSDestBearingRef"), new C2660d(24, 5, "GPSDestBearing"), new C2660d(25, 2, "GPSDestDistanceRef"), new C2660d(26, 5, "GPSDestDistance"), new C2660d(27, 7, "GPSProcessingMethod"), new C2660d(28, 7, "GPSAreaInformation"), new C2660d(29, 2, "GPSDateStamp"), new C2660d(30, 3, "GPSDifferential"), new C2660d(31, 5, "GPSHPositioningError")};
        C2660d[] c2660dArr4 = {new C2660d(1, 2, "InteroperabilityIndex")};
        C2660d[] c2660dArr5 = {new C2660d(254, 4, "NewSubfileType"), new C2660d(255, 4, "SubfileType"), new C2660d(256, 3, 4, "ThumbnailImageWidth"), new C2660d(257, 3, 4, "ThumbnailImageLength"), new C2660d(258, 3, "BitsPerSample"), new C2660d(259, 3, "Compression"), new C2660d(262, 3, "PhotometricInterpretation"), new C2660d(270, 2, "ImageDescription"), new C2660d(271, 2, "Make"), new C2660d(272, 2, "Model"), new C2660d(273, 3, 4, "StripOffsets"), new C2660d(274, 3, "ThumbnailOrientation"), new C2660d(277, 3, "SamplesPerPixel"), new C2660d(278, 3, 4, "RowsPerStrip"), new C2660d(279, 3, 4, "StripByteCounts"), new C2660d(282, 5, "XResolution"), new C2660d(283, 5, "YResolution"), new C2660d(284, 3, "PlanarConfiguration"), new C2660d(296, 3, "ResolutionUnit"), new C2660d(301, 3, "TransferFunction"), new C2660d(305, 2, "Software"), new C2660d(306, 2, "DateTime"), new C2660d(315, 2, "Artist"), new C2660d(318, 5, "WhitePoint"), new C2660d(319, 5, "PrimaryChromaticities"), new C2660d(330, 4, "SubIFDPointer"), new C2660d(513, 4, "JPEGInterchangeFormat"), new C2660d(514, 4, "JPEGInterchangeFormatLength"), new C2660d(529, 5, "YCbCrCoefficients"), new C2660d(530, 3, "YCbCrSubSampling"), new C2660d(531, 3, "YCbCrPositioning"), new C2660d(532, 5, "ReferenceBlackWhite"), new C2660d(33432, 2, "Copyright"), new C2660d(34665, 4, "ExifIFDPointer"), new C2660d(34853, 4, "GPSInfoIFDPointer"), new C2660d(50706, 1, "DNGVersion"), new C2660d(50720, 3, 4, "DefaultCropSize")};
        f21156E = new C2660d(273, 3, "StripOffsets");
        f21157F = new C2660d[][]{c2660dArr, c2660dArr2, c2660dArr3, c2660dArr4, c2660dArr5, c2660dArr, new C2660d[]{new C2660d(256, 7, "ThumbnailImage"), new C2660d(8224, 4, "CameraSettingsIFDPointer"), new C2660d(8256, 4, "ImageProcessingIFDPointer")}, new C2660d[]{new C2660d(257, 4, "PreviewImageStart"), new C2660d(258, 4, "PreviewImageLength")}, new C2660d[]{new C2660d(4371, 3, "AspectFrame")}, new C2660d[]{new C2660d(55, 3, "ColorSpace")}};
        f21158G = new C2660d[]{new C2660d(330, 4, "SubIFDPointer"), new C2660d(34665, 4, "ExifIFDPointer"), new C2660d(34853, 4, "GPSInfoIFDPointer"), new C2660d(40965, 4, "InteroperabilityIFDPointer"), new C2660d(8224, 1, "CameraSettingsIFDPointer"), new C2660d(8256, 1, "ImageProcessingIFDPointer")};
        f21159H = new HashMap[10];
        f21160I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f21161L = forName;
        f21162M = "Exif\u0000\u0000".getBytes(forName);
        f21163N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2660d[][] c2660dArr6 = f21157F;
            if (i >= c2660dArr6.length) {
                HashMap hashMap = K;
                C2660d[] c2660dArr7 = f21158G;
                hashMap.put(Integer.valueOf(c2660dArr7[0].f21146a), 5);
                hashMap.put(Integer.valueOf(c2660dArr7[1].f21146a), 1);
                hashMap.put(Integer.valueOf(c2660dArr7[2].f21146a), 2);
                hashMap.put(Integer.valueOf(c2660dArr7[3].f21146a), 3);
                hashMap.put(Integer.valueOf(c2660dArr7[4].f21146a), 7);
                hashMap.put(Integer.valueOf(c2660dArr7[5].f21146a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f21159H[i] = new HashMap();
            f21160I[i] = new HashMap();
            for (C2660d c2660d : c2660dArr6[i]) {
                f21159H[i].put(Integer.valueOf(c2660d.f21146a), c2660d);
                f21160I[i].put(c2660d.f21147b, c2660d);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:3:0x0021, B:5:0x0024, B:7:0x0039, B:13:0x0056, B:15:0x0061, B:16:0x0077, B:25:0x0068, B:28:0x0070, B:29:0x0074, B:30:0x0081, B:32:0x008a, B:34:0x0090, B:36:0x0096, B:38:0x009c, B:48:0x00aa), top: B:2:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(v2.h hVar) {
        C2660d[][] c2660dArr = f21157F;
        this.f21182d = new HashMap[c2660dArr.length];
        this.f21183e = new HashSet(c2660dArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        boolean z3 = f21164l;
        this.f21180b = null;
        this.f21179a = null;
        for (int i = 0; i < c2660dArr.length; i++) {
            try {
                try {
                    this.f21182d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z3) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e5) {
                e = e5;
                if (z3) {
                }
                a();
                if (!z3) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(hVar, 5000);
        int f = f(bufferedInputStream);
        this.f21181c = f;
        if (f != 4 && f != 9 && f != 13 && f != 14) {
            C2662f c2662f = new C2662f(bufferedInputStream);
            int i5 = this.f21181c;
            if (i5 == 12) {
                d(c2662f);
            } else if (i5 == 7) {
                g(c2662f);
            } else if (i5 == 10) {
                k(c2662f);
            } else {
                j(c2662f);
            }
            c2662f.d(this.f21185h);
            u(c2662f);
            a();
            if (!z3) {
                return;
            }
            p();
        }
        C2658b c2658b = new C2658b(bufferedInputStream);
        int i6 = this.f21181c;
        if (i6 == 4) {
            e(c2658b, 0, 0);
        } else if (i6 == 13) {
            h(c2658b);
        } else if (i6 == 9) {
            i(c2658b);
        } else if (i6 == 14) {
            l(c2658b);
        }
        a();
        if (!z3) {
        }
        p();
    }

    public static ByteOrder q(C2658b c2658b) {
        short readShort = c2658b.readShort();
        boolean z3 = f21164l;
        if (readShort == 18761) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b3 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f21182d;
        if (b3 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b3.concat("\u0000").getBytes(f21161L);
            hashMap.put("DateTime", new C2659c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C2659c.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C2659c.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C2659c.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C2659c.a(0L, this.f));
        }
    }

    public final String b(String str) {
        C2659c c5 = c(str);
        if (c5 != null) {
            if (!J.contains(str)) {
                return c5.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c5.f21142a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C2661e[] c2661eArr = (C2661e[]) c5.g(this.f);
                if (c2661eArr == null || c2661eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c2661eArr));
                    return null;
                }
                C2661e c2661e = c2661eArr[0];
                Integer valueOf = Integer.valueOf((int) (c2661e.f21150a / c2661e.f21151b));
                C2661e c2661e2 = c2661eArr[1];
                Integer valueOf2 = Integer.valueOf((int) (c2661e2.f21150a / c2661e2.f21151b));
                C2661e c2661e3 = c2661eArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (c2661e3.f21150a / c2661e3.f21151b)));
            }
            try {
                return Double.toString(c5.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C2659c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f21164l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f21157F.length; i++) {
            C2659c c2659c = (C2659c) this.f21182d[i].get(str);
            if (c2659c != null) {
                return c2659c;
            }
        }
        return null;
    }

    public final void d(C2662f c2662f) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new C2657a(c2662f));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f21182d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", C2659c.c(Integer.parseInt(str), this.f));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", C2659c.c(Integer.parseInt(str2), this.f));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", C2659c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c2662f.d(parseInt2);
                    byte[] bArr = new byte[6];
                    c2662f.readFully(bArr);
                    int i = parseInt2 + 6;
                    int i5 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f21162M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    c2662f.readFully(bArr2);
                    this.f21185h = i;
                    r(0, bArr2);
                }
                if (f21164l) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
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

    public final void e(C2658b c2658b, int i, int i5) {
        boolean z3 = f21164l;
        if (z3) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c2658b);
        }
        c2658b.f21139m = ByteOrder.BIG_ENDIAN;
        byte readByte = c2658b.readByte();
        byte b3 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (c2658b.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i6 = 2;
        int i7 = 2;
        while (true) {
            byte readByte2 = c2658b.readByte();
            if (readByte2 != b3) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = c2658b.readByte();
            if (z3) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = c2658b.readUnsignedShort();
                int i8 = readUnsignedShort - 2;
                int i9 = i7 + 4;
                if (z3) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i8 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap[] hashMapArr = this.f21182d;
                int i10 = 0;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i8];
                    c2658b.readFully(bArr);
                    int i11 = i9 + i8;
                    byte[] bArr2 = f21162M;
                    if (bArr2 != null && i8 >= bArr2.length) {
                        int i12 = 0;
                        while (i12 < bArr2.length) {
                            if (bArr[i12] == bArr2[i12]) {
                                i12++;
                                i10 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i8);
                        this.f21185h = i + i9 + bArr2.length;
                        r(i5, copyOfRange);
                        u(new C2658b(copyOfRange));
                        i9 = i11;
                        i8 = 0;
                    }
                    byte[] bArr3 = f21163N;
                    if (bArr3 != null && i8 >= bArr3.length) {
                        int i13 = i10;
                        while (true) {
                            if (i13 >= bArr3.length) {
                                int length = i9 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i8);
                                if (b("Xmp") == null) {
                                    hashMapArr[i10].put("Xmp", new C2659c(length, copyOfRange2, 1, copyOfRange2.length));
                                }
                            } else if (bArr[i13] == bArr3[i13]) {
                                i13++;
                            }
                        }
                    }
                    i9 = i11;
                    i8 = 0;
                } else if (readByte3 != -2) {
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
                    c2658b.b(1);
                    hashMapArr[i5].put(i5 != 4 ? "ImageLength" : "ThumbnailImageLength", C2659c.a(c2658b.readUnsignedShort(), this.f));
                    hashMapArr[i5].put(i5 != 4 ? "ImageWidth" : "ThumbnailImageWidth", C2659c.a(c2658b.readUnsignedShort(), this.f));
                    i8 = readUnsignedShort - 7;
                } else {
                    byte[] bArr4 = new byte[i8];
                    c2658b.readFully(bArr4);
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = f21161L;
                        byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                        hashMap.put("UserComment", new C2659c(bytes, i6, bytes.length));
                    }
                    i8 = 0;
                }
                if (i8 < 0) {
                    throw new IOException("Invalid length");
                }
                c2658b.b(i8);
                i7 = i9 + i8;
                i6 = 2;
                b3 = -1;
            }
        }
        c2658b.f21139m = this.f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(16:106|(2:108|109)(1:152)|111|112|(1:114)|115|(4:118|119|(7:123|124|125|(3:127|(1:129)(2:138|(1:140))|(3:132|133|134))(1:141)|136|120|121)|144)|117|22|23|25|26|27|(1:93)(1:31)|32|(1:34)(8:36|37|39|40|41|(1:43)(1:80)|44|(1:46)(3:47|(2:48|(2:50|(2:53|54)(1:52))(2:78|79))|(1:56)(3:57|(2:58|(2:60|(1:63)(1:62))(3:68|69|(2:70|(2:72|(1:75)(1:74))(2:76|77))))|(1:66)(1:67)))))|21|22|23|25|26|27|(1:29)|93|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f0, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f6, code lost:
    
        if (r6 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00f8, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00fb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00ca, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0162, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00fc, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00fe, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0101, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        int i;
        C2658b c2658b;
        int i5;
        int i6;
        int i7;
        int i8;
        C2658b c2658b2;
        long readInt;
        byte[] bArr;
        long j5;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i9 = 0;
        while (true) {
            byte[] bArr3 = f21167o;
            if (i9 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i9] != bArr3[i9]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i10 = 0; i10 < bytes.length; i10++) {
                    if (bArr2[i10] != bytes[i10]) {
                        C2658b c2658b3 = null;
                        try {
                            c2658b = new C2658b(bArr2);
                            try {
                                try {
                                    readInt = c2658b.readInt();
                                    bArr = new byte[4];
                                    c2658b.readFully(bArr);
                                } catch (Exception e3) {
                                    e = e3;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                c2658b3 = c2658b;
                                if (c2658b3 != null) {
                                    c2658b3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            i = 0;
                            c2658b = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, f21168p)) {
                            if (readInt == 1) {
                                readInt = c2658b.readLong();
                                j5 = 16;
                            } else {
                                j5 = 8;
                            }
                            i = 0;
                            long j6 = 5000;
                            if (readInt > j6) {
                                readInt = j6;
                            }
                            long j7 = readInt - j5;
                            if (j7 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z3 = false;
                                    boolean z5 = false;
                                    for (long j8 = 0; j8 < j7 / 4; j8++) {
                                        try {
                                            c2658b.readFully(bArr4);
                                            if (j8 != 1) {
                                                if (Arrays.equals(bArr4, f21169q)) {
                                                    z3 = true;
                                                } else if (Arrays.equals(bArr4, f21170r)) {
                                                    z5 = true;
                                                }
                                                if (z3 && z5) {
                                                    c2658b.close();
                                                    return 12;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    if (f21164l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            c2658b.close();
                            C2658b c2658b4 = new C2658b(bArr2);
                            ByteOrder q5 = q(c2658b4);
                            this.f = q5;
                            c2658b4.f21139m = q5;
                            short readShort = c2658b4.readShort();
                            i5 = (readShort != 20306 || readShort == 21330) ? 1 : i;
                            c2658b4.close();
                            if (i5 != 0) {
                                return 7;
                            }
                            try {
                                c2658b2 = new C2658b(bArr2);
                            } catch (Exception unused2) {
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                ByteOrder q6 = q(c2658b2);
                                this.f = q6;
                                c2658b2.f21139m = q6;
                                i6 = c2658b2.readShort() == 85 ? 1 : i;
                                c2658b2.close();
                            } catch (Exception unused3) {
                                c2658b3 = c2658b2;
                                if (c2658b3 != null) {
                                    c2658b3.close();
                                }
                                i6 = i;
                                if (i6 == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c2658b3 = c2658b2;
                                if (c2658b3 != null) {
                                    c2658b3.close();
                                }
                                throw th;
                            }
                            if (i6 == 0) {
                                return 10;
                            }
                            int i11 = i;
                            while (true) {
                                byte[] bArr5 = f21173u;
                                if (i11 >= bArr5.length) {
                                    i7 = 1;
                                    break;
                                }
                                if (bArr2[i11] != bArr5[i11]) {
                                    i7 = i;
                                    break;
                                }
                                i11++;
                            }
                            if (i7 != 0) {
                                return 13;
                            }
                            int i12 = i;
                            while (true) {
                                byte[] bArr6 = f21177y;
                                if (i12 >= bArr6.length) {
                                    int i13 = i;
                                    while (true) {
                                        byte[] bArr7 = f21178z;
                                        if (i13 >= bArr7.length) {
                                            i8 = 1;
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i13 + 4] != bArr7[i13]) {
                                            break;
                                        }
                                        i13++;
                                    }
                                } else {
                                    if (bArr2[i12] != bArr6[i12]) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            if (i8 != 0) {
                                return 14;
                            }
                            return i;
                        }
                        c2658b.close();
                        i = 0;
                        C2658b c2658b42 = new C2658b(bArr2);
                        ByteOrder q52 = q(c2658b42);
                        this.f = q52;
                        c2658b42.f21139m = q52;
                        short readShort2 = c2658b42.readShort();
                        if (readShort2 != 20306) {
                        }
                        c2658b42.close();
                        if (i5 != 0) {
                        }
                    }
                }
                return 9;
            }
            i9++;
        }
    }

    public final void g(C2662f c2662f) {
        int i;
        int i5;
        j(c2662f);
        HashMap[] hashMapArr = this.f21182d;
        C2659c c2659c = (C2659c) hashMapArr[1].get("MakerNote");
        if (c2659c != null) {
            C2662f c2662f2 = new C2662f(c2659c.f21145d);
            c2662f2.f21139m = this.f;
            byte[] bArr = f21171s;
            byte[] bArr2 = new byte[bArr.length];
            c2662f2.readFully(bArr2);
            c2662f2.d(0L);
            byte[] bArr3 = f21172t;
            byte[] bArr4 = new byte[bArr3.length];
            c2662f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c2662f2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c2662f2.d(12L);
            }
            s(c2662f2, 6);
            C2659c c2659c2 = (C2659c) hashMapArr[7].get("PreviewImageStart");
            C2659c c2659c3 = (C2659c) hashMapArr[7].get("PreviewImageLength");
            if (c2659c2 != null && c2659c3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c2659c2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c2659c3);
            }
            C2659c c2659c4 = (C2659c) hashMapArr[8].get("AspectFrame");
            if (c2659c4 != null) {
                int[] iArr = (int[]) c2659c4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i6 = iArr[2];
                int i7 = iArr[0];
                if (i6 <= i7 || (i = iArr[3]) <= (i5 = iArr[1])) {
                    return;
                }
                int i8 = (i6 - i7) + 1;
                int i9 = (i - i5) + 1;
                if (i8 < i9) {
                    int i10 = i8 + i9;
                    i9 = i10 - i9;
                    i8 = i10 - i9;
                }
                C2659c c5 = C2659c.c(i8, this.f);
                C2659c c6 = C2659c.c(i9, this.f);
                hashMapArr[0].put("ImageWidth", c5);
                hashMapArr[0].put("ImageLength", c6);
            }
        }
    }

    public final void h(C2658b c2658b) {
        if (f21164l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c2658b);
        }
        c2658b.f21139m = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f21173u;
        c2658b.b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c2658b.readInt();
                byte[] bArr2 = new byte[4];
                c2658b.readFully(bArr2);
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, f21175w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f21176x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f21174v)) {
                    byte[] bArr3 = new byte[readInt];
                    c2658b.readFully(bArr3);
                    int readInt2 = c2658b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f21185h = i;
                        r(0, bArr3);
                        x();
                        u(new C2658b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i5 = readInt + 4;
                c2658b.b(i5);
                length = i + i5;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C2658b c2658b) {
        boolean z3 = f21164l;
        if (z3) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c2658b);
        }
        c2658b.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c2658b.readFully(bArr);
        c2658b.readFully(bArr2);
        c2658b.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        int i6 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i5];
        c2658b.b(i - c2658b.f21138l);
        c2658b.readFully(bArr4);
        e(new C2658b(bArr4), i, 5);
        c2658b.b(i6 - c2658b.f21138l);
        c2658b.f21139m = ByteOrder.BIG_ENDIAN;
        int readInt = c2658b.readInt();
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i7 = 0; i7 < readInt; i7++) {
            int readUnsignedShort = c2658b.readUnsignedShort();
            int readUnsignedShort2 = c2658b.readUnsignedShort();
            if (readUnsignedShort == f21156E.f21146a) {
                short readShort = c2658b.readShort();
                short readShort2 = c2658b.readShort();
                C2659c c5 = C2659c.c(readShort, this.f);
                C2659c c6 = C2659c.c(readShort2, this.f);
                HashMap[] hashMapArr = this.f21182d;
                hashMapArr[0].put("ImageLength", c5);
                hashMapArr[0].put("ImageWidth", c6);
                if (z3) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c2658b.b(readUnsignedShort2);
        }
    }

    public final void j(C2662f c2662f) {
        o(c2662f);
        s(c2662f, 0);
        w(c2662f, 0);
        w(c2662f, 5);
        w(c2662f, 4);
        x();
        if (this.f21181c == 8) {
            HashMap[] hashMapArr = this.f21182d;
            C2659c c2659c = (C2659c) hashMapArr[1].get("MakerNote");
            if (c2659c != null) {
                C2662f c2662f2 = new C2662f(c2659c.f21145d);
                c2662f2.f21139m = this.f;
                c2662f2.b(6);
                s(c2662f2, 9);
                C2659c c2659c2 = (C2659c) hashMapArr[9].get("ColorSpace");
                if (c2659c2 != null) {
                    hashMapArr[1].put("ColorSpace", c2659c2);
                }
            }
        }
    }

    public final void k(C2662f c2662f) {
        if (f21164l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c2662f);
        }
        j(c2662f);
        HashMap[] hashMapArr = this.f21182d;
        C2659c c2659c = (C2659c) hashMapArr[0].get("JpgFromRaw");
        if (c2659c != null) {
            e(new C2658b(c2659c.f21145d), (int) c2659c.f21144c, 5);
        }
        C2659c c2659c2 = (C2659c) hashMapArr[0].get("ISO");
        C2659c c2659c3 = (C2659c) hashMapArr[1].get("PhotographicSensitivity");
        if (c2659c2 == null || c2659c3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c2659c2);
    }

    public final void l(C2658b c2658b) {
        if (f21164l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c2658b);
        }
        c2658b.f21139m = ByteOrder.LITTLE_ENDIAN;
        c2658b.b(f21177y.length);
        int readInt = c2658b.readInt() + 8;
        byte[] bArr = f21178z;
        c2658b.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c2658b.readFully(bArr2);
                int readInt2 = c2658b.readInt();
                int i = length + 8;
                if (Arrays.equals(f21152A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c2658b.readFully(bArr3);
                    this.f21185h = i;
                    r(0, bArr3);
                    u(new C2658b(bArr3));
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
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c2658b.b(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C2658b c2658b, HashMap hashMap) {
        C2659c c2659c = (C2659c) hashMap.get("JPEGInterchangeFormat");
        C2659c c2659c2 = (C2659c) hashMap.get("JPEGInterchangeFormatLength");
        if (c2659c == null || c2659c2 == null) {
            return;
        }
        int e3 = c2659c.e(this.f);
        int e5 = c2659c2.e(this.f);
        if (this.f21181c == 7) {
            e3 += this.i;
        }
        if (e3 > 0 && e5 > 0 && this.f21180b == null && this.f21179a == null) {
            c2658b.b(e3);
            c2658b.readFully(new byte[e5]);
        }
        if (f21164l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e3 + ", length: " + e5);
        }
    }

    public final boolean n(HashMap hashMap) {
        C2659c c2659c = (C2659c) hashMap.get("ImageLength");
        C2659c c2659c2 = (C2659c) hashMap.get("ImageWidth");
        if (c2659c == null || c2659c2 == null) {
            return false;
        }
        return c2659c.e(this.f) <= 512 && c2659c2.e(this.f) <= 512;
    }

    public final void o(C2662f c2662f) {
        ByteOrder q5 = q(c2662f);
        this.f = q5;
        c2662f.f21139m = q5;
        int readUnsignedShort = c2662f.readUnsignedShort();
        int i = this.f21181c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c2662f.readInt();
        if (readInt < 8) {
            throw new IOException(AbstractC2107A.q("Invalid first Ifd offset: ", readInt));
        }
        int i5 = readInt - 8;
        if (i5 > 0) {
            c2662f.b(i5);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f21182d;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder v4 = AbstractC2107A.v(i, "The size of tag group[", "]: ");
            v4.append(hashMapArr[i].size());
            Log.d("ExifInterface", v4.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                C2659c c2659c = (C2659c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c2659c.toString() + ", tagValue: '" + c2659c.f(this.f) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) {
        C2662f c2662f = new C2662f(bArr);
        o(c2662f);
        s(c2662f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(C2662f c2662f, int i) {
        HashMap[] hashMapArr;
        short s2;
        int i5;
        long j5;
        long j6;
        boolean z3;
        int i6;
        long j7;
        boolean z5;
        short s5;
        HashMap[] hashMapArr2;
        int readUnsignedShort;
        long j8;
        int i7 = i;
        Integer valueOf = Integer.valueOf(c2662f.f21138l);
        HashSet hashSet = this.f21183e;
        hashSet.add(valueOf);
        short readShort = c2662f.readShort();
        boolean z6 = f21164l;
        if (z6) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s6 = 0;
        while (true) {
            hashMapArr = this.f21182d;
            if (s6 >= readShort) {
                break;
            }
            int readUnsignedShort2 = c2662f.readUnsignedShort();
            int readUnsignedShort3 = c2662f.readUnsignedShort();
            int readInt = c2662f.readInt();
            long j9 = c2662f.f21138l + 4;
            C2660d c2660d = (C2660d) f21159H[i7].get(Integer.valueOf(readUnsignedShort2));
            if (z6) {
                s2 = readShort;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i7), Integer.valueOf(readUnsignedShort2), c2660d != null ? c2660d.f21147b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s2 = readShort;
            }
            if (c2660d == null) {
                if (z6) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                }
                i5 = readUnsignedShort2;
            } else {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f21154C.length) {
                        int i8 = c2660d.f21148c;
                        if (i8 == 7 || readUnsignedShort3 == 7 || i8 == readUnsignedShort3 || (i6 = c2660d.f21149d) == readUnsignedShort3) {
                            i5 = readUnsignedShort2;
                        } else {
                            i5 = readUnsignedShort2;
                            if (((i8 != 4 && i6 != 4) || readUnsignedShort3 != 3) && (((i8 != 9 && i6 != 9) || readUnsignedShort3 != 8) && ((i8 != 12 && i6 != 12) || readUnsignedShort3 != 11))) {
                                if (z6) {
                                    Log.d("ExifInterface", "Skip the tag entry since data format (" + f21153B[readUnsignedShort3] + ") is unexpected for tag: " + c2660d.f21147b);
                                }
                            }
                        }
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = i8;
                        }
                        j5 = r6[readUnsignedShort3] * readInt;
                        if (j5 < 0 || j5 > 2147483647L) {
                            if (z6) {
                                j6 = j5;
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                            } else {
                                j6 = j5;
                            }
                            z3 = false;
                            j5 = j6;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            c2662f.d(j9);
                            z5 = z6;
                            s5 = s6;
                        } else {
                            if (j5 > 4) {
                                z5 = z6;
                                int readInt2 = c2662f.readInt();
                                s5 = s6;
                                if (z5) {
                                    hashMapArr2 = hashMapArr;
                                    Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                } else {
                                    hashMapArr2 = hashMapArr;
                                }
                                if (this.f21181c == 7) {
                                    if ("MakerNote".equals(c2660d.f21147b)) {
                                        this.i = readInt2;
                                    } else if (i7 == 6 && "ThumbnailImage".equals(c2660d.f21147b)) {
                                        this.f21186j = readInt2;
                                        this.f21187k = readInt;
                                        C2659c c5 = C2659c.c(6, this.f);
                                        j7 = j9;
                                        C2659c a5 = C2659c.a(this.f21186j, this.f);
                                        C2659c a6 = C2659c.a(this.f21187k, this.f);
                                        hashMapArr2[4].put("Compression", c5);
                                        hashMapArr2[4].put("JPEGInterchangeFormat", a5);
                                        hashMapArr2[4].put("JPEGInterchangeFormatLength", a6);
                                        c2662f.d(readInt2);
                                    }
                                }
                                j7 = j9;
                                c2662f.d(readInt2);
                            } else {
                                j7 = j9;
                                z5 = z6;
                                s5 = s6;
                                hashMapArr2 = hashMapArr;
                            }
                            Integer num = (Integer) K.get(Integer.valueOf(i5));
                            if (z5) {
                                Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j5);
                            }
                            if (num != null) {
                                if (readUnsignedShort3 != 3) {
                                    if (readUnsignedShort3 == 4) {
                                        j8 = c2662f.readInt() & 4294967295L;
                                    } else if (readUnsignedShort3 == 8) {
                                        readUnsignedShort = c2662f.readShort();
                                    } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                        readUnsignedShort = c2662f.readInt();
                                    } else {
                                        j8 = -1;
                                    }
                                    if (!z5) {
                                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j8), c2660d.f21147b));
                                    }
                                    int i9 = c2662f.f21141o;
                                    if (j8 > 0 || (i9 != -1 && j8 >= i9)) {
                                        if (z5) {
                                            String r5 = AbstractC2107A.r("Skip jump into the IFD since its offset is invalid: ", j8);
                                            if (i9 != -1) {
                                                r5 = r5 + " (total length: " + i9 + ")";
                                            }
                                            Log.d("ExifInterface", r5);
                                        }
                                    } else if (!hashSet.contains(Integer.valueOf((int) j8))) {
                                        c2662f.d(j8);
                                        s(c2662f, num.intValue());
                                    } else if (z5) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j8 + ")");
                                    }
                                    c2662f.d(j7);
                                } else {
                                    readUnsignedShort = c2662f.readUnsignedShort();
                                }
                                j8 = readUnsignedShort;
                                if (!z5) {
                                }
                                int i92 = c2662f.f21141o;
                                if (j8 > 0) {
                                }
                                if (z5) {
                                }
                                c2662f.d(j7);
                            } else {
                                long j10 = j7;
                                int i10 = c2662f.f21138l + this.f21185h;
                                byte[] bArr = new byte[(int) j5];
                                c2662f.readFully(bArr);
                                C2659c c2659c = new C2659c(i10, bArr, readUnsignedShort3, readInt);
                                hashMapArr2[i].put(c2660d.f21147b, c2659c);
                                String str = c2660d.f21147b;
                                if ("DNGVersion".equals(str)) {
                                    this.f21181c = 3;
                                }
                                if ((("Make".equals(str) || "Model".equals(str)) && c2659c.f(this.f).contains("PENTAX")) || ("Compression".equals(str) && c2659c.e(this.f) == 65535)) {
                                    this.f21181c = 8;
                                }
                                if (c2662f.f21138l != j10) {
                                    c2662f.d(j10);
                                }
                                s6 = (short) (s5 + 1);
                                i7 = i;
                                readShort = s2;
                                z6 = z5;
                            }
                        }
                        s6 = (short) (s5 + 1);
                        i7 = i;
                        readShort = s2;
                        z6 = z5;
                    }
                }
                i5 = readUnsignedShort2;
                if (z6) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
            }
            z3 = false;
            j5 = 0;
            if (z3) {
            }
            s6 = (short) (s5 + 1);
            i7 = i;
            readShort = s2;
            z6 = z5;
        }
        boolean z7 = z6;
        int readInt3 = c2662f.readInt();
        if (z7) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j11 = readInt3;
        if (j11 <= 0) {
            if (z7) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(readInt3))) {
            if (z7) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        c2662f.d(j11);
        if (hashMapArr[4].isEmpty()) {
            s(c2662f, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(c2662f, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.f21182d;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void u(C2658b c2658b) {
        C2659c c2659c;
        int e3;
        HashMap hashMap = this.f21182d[4];
        C2659c c2659c2 = (C2659c) hashMap.get("Compression");
        if (c2659c2 == null) {
            m(c2658b, hashMap);
            return;
        }
        int e5 = c2659c2.e(this.f);
        if (e5 != 1) {
            if (e5 == 6) {
                m(c2658b, hashMap);
                return;
            } else if (e5 != 7) {
                return;
            }
        }
        C2659c c2659c3 = (C2659c) hashMap.get("BitsPerSample");
        if (c2659c3 != null) {
            int[] iArr = (int[]) c2659c3.g(this.f);
            int[] iArr2 = f21165m;
            if (Arrays.equals(iArr2, iArr) || (this.f21181c == 3 && (c2659c = (C2659c) hashMap.get("PhotometricInterpretation")) != null && (((e3 = c2659c.e(this.f)) == 1 && Arrays.equals(iArr, f21166n)) || (e3 == 6 && Arrays.equals(iArr, iArr2))))) {
                C2659c c2659c4 = (C2659c) hashMap.get("StripOffsets");
                C2659c c2659c5 = (C2659c) hashMap.get("StripByteCounts");
                if (c2659c4 == null || c2659c5 == null) {
                    return;
                }
                long[] a5 = q0.a(c2659c4.g(this.f));
                long[] a6 = q0.a(c2659c5.g(this.f));
                if (a5 == null || a5.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (a6 == null || a6.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (a5.length != a6.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j5 = 0;
                for (long j6 : a6) {
                    j5 += j6;
                }
                byte[] bArr = new byte[(int) j5];
                this.f21184g = true;
                int i = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < a5.length; i6++) {
                    int i7 = (int) a5[i6];
                    int i8 = (int) a6[i6];
                    if (i6 < a5.length - 1 && i7 + i8 != a5[i6 + 1]) {
                        this.f21184g = false;
                    }
                    int i9 = i7 - i;
                    if (i9 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        c2658b.b(i9);
                        int i10 = i + i9;
                        byte[] bArr2 = new byte[i8];
                        try {
                            c2658b.readFully(bArr2);
                            i = i10 + i8;
                            System.arraycopy(bArr2, 0, bArr, i5, i8);
                            i5 += i8;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                        return;
                    }
                }
                if (this.f21184g) {
                    long j7 = a5[0];
                    return;
                }
                return;
            }
        }
        if (f21164l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i5) {
        HashMap[] hashMapArr = this.f21182d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z3 = f21164l;
        if (isEmpty || hashMapArr[i5].isEmpty()) {
            if (z3) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C2659c c2659c = (C2659c) hashMapArr[i].get("ImageLength");
        C2659c c2659c2 = (C2659c) hashMapArr[i].get("ImageWidth");
        C2659c c2659c3 = (C2659c) hashMapArr[i5].get("ImageLength");
        C2659c c2659c4 = (C2659c) hashMapArr[i5].get("ImageWidth");
        if (c2659c == null || c2659c2 == null) {
            if (z3) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c2659c3 == null || c2659c4 == null) {
            if (z3) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e3 = c2659c.e(this.f);
        int e5 = c2659c2.e(this.f);
        int e6 = c2659c3.e(this.f);
        int e7 = c2659c4.e(this.f);
        if (e3 >= e6 || e5 >= e7) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i5];
        hashMapArr[i5] = hashMap;
    }

    public final void w(C2662f c2662f, int i) {
        C2659c c5;
        C2659c c6;
        HashMap[] hashMapArr = this.f21182d;
        C2659c c2659c = (C2659c) hashMapArr[i].get("DefaultCropSize");
        C2659c c2659c2 = (C2659c) hashMapArr[i].get("SensorTopBorder");
        C2659c c2659c3 = (C2659c) hashMapArr[i].get("SensorLeftBorder");
        C2659c c2659c4 = (C2659c) hashMapArr[i].get("SensorBottomBorder");
        C2659c c2659c5 = (C2659c) hashMapArr[i].get("SensorRightBorder");
        if (c2659c != null) {
            if (c2659c.f21142a == 5) {
                C2661e[] c2661eArr = (C2661e[]) c2659c.g(this.f);
                if (c2661eArr == null || c2661eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c2661eArr));
                    return;
                }
                c5 = C2659c.b(c2661eArr[0], this.f);
                c6 = C2659c.b(c2661eArr[1], this.f);
            } else {
                int[] iArr = (int[]) c2659c.g(this.f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c5 = C2659c.c(iArr[0], this.f);
                c6 = C2659c.c(iArr[1], this.f);
            }
            hashMapArr[i].put("ImageWidth", c5);
            hashMapArr[i].put("ImageLength", c6);
            return;
        }
        if (c2659c2 != null && c2659c3 != null && c2659c4 != null && c2659c5 != null) {
            int e3 = c2659c2.e(this.f);
            int e5 = c2659c4.e(this.f);
            int e6 = c2659c5.e(this.f);
            int e7 = c2659c3.e(this.f);
            if (e5 <= e3 || e6 <= e7) {
                return;
            }
            C2659c c7 = C2659c.c(e5 - e3, this.f);
            C2659c c8 = C2659c.c(e6 - e7, this.f);
            hashMapArr[i].put("ImageLength", c7);
            hashMapArr[i].put("ImageWidth", c8);
            return;
        }
        C2659c c2659c6 = (C2659c) hashMapArr[i].get("ImageLength");
        C2659c c2659c7 = (C2659c) hashMapArr[i].get("ImageWidth");
        if (c2659c6 == null || c2659c7 == null) {
            C2659c c2659c8 = (C2659c) hashMapArr[i].get("JPEGInterchangeFormat");
            C2659c c2659c9 = (C2659c) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (c2659c8 == null || c2659c9 == null) {
                return;
            }
            int e8 = c2659c8.e(this.f);
            int e9 = c2659c8.e(this.f);
            c2662f.d(e8);
            byte[] bArr = new byte[e9];
            c2662f.readFully(bArr);
            e(new C2658b(bArr), e8, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f21182d;
        C2659c c2659c = (C2659c) hashMapArr[1].get("PixelXDimension");
        C2659c c2659c2 = (C2659c) hashMapArr[1].get("PixelYDimension");
        if (c2659c != null && c2659c2 != null) {
            hashMapArr[0].put("ImageWidth", c2659c);
            hashMapArr[0].put("ImageLength", c2659c2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
