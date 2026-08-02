package G;

import C.S;
import android.location.Location;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f9605b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f9606c = new b();

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f9607d = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final List<String> f9608e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f9609f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9610g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.exifinterface.media.a f9611a;

    final class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    final class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    final class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    private h(androidx.exifinterface.media.a aVar) {
        this.f9611a = aVar;
    }

    @NonNull
    public static h b(@NonNull File file) throws IOException {
        return new h(new androidx.exifinterface.media.a(file.toString()));
    }

    @NonNull
    public static h c(@NonNull ByteArrayInputStream byteArrayInputStream) throws IOException {
        return new h(new androidx.exifinterface.media.a(byteArrayInputStream));
    }

    public final void a(@NonNull h hVar) {
        ArrayList arrayList = new ArrayList(f9608e);
        arrayList.removeAll(f9609f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String d11 = this.f9611a.d(str);
            androidx.exifinterface.media.a aVar = hVar.f9611a;
            String d12 = aVar.d(str);
            if (d11 != null && !d11.equals(d12)) {
                aVar.H(str, d11);
            }
        }
    }

    public final int d() {
        return this.f9611a.f(0, "Orientation");
    }

    public final int e() {
        switch (d()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public final void f(int i11) {
        int i12 = i11 % 90;
        androidx.exifinterface.media.a aVar = this.f9611a;
        if (i12 != 0) {
            Locale locale = Locale.US;
            S.k("h", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i11 + " is unsupported.");
            aVar.H("Orientation", String.valueOf(0));
            return;
        }
        int i13 = i11 % 360;
        int d11 = d();
        while (i13 < 0) {
            i13 += 90;
            switch (d11) {
                case 2:
                    d11 = 5;
                    break;
                case 3:
                case 8:
                    d11 = 6;
                    break;
                case 4:
                    d11 = 7;
                    break;
                case 5:
                    d11 = 4;
                    break;
                case 6:
                    d11 = 1;
                    break;
                case 7:
                    d11 = 2;
                    break;
                default:
                    d11 = 8;
                    break;
            }
        }
        while (i13 > 0) {
            i13 -= 90;
            switch (d11) {
                case 2:
                    d11 = 7;
                    break;
                case 3:
                    d11 = 8;
                    break;
                case 4:
                    d11 = 5;
                    break;
                case 5:
                    d11 = 2;
                    break;
                case 6:
                    d11 = 3;
                    break;
                case 7:
                    d11 = 4;
                    break;
                case 8:
                    d11 = 1;
                    break;
                default:
                    d11 = 6;
                    break;
            }
        }
        aVar.H("Orientation", String.valueOf(d11));
    }

    public final void g() throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        ThreadLocal<SimpleDateFormat> threadLocal = f9607d;
        String format = threadLocal.get().format(new Date(currentTimeMillis));
        androidx.exifinterface.media.a aVar = this.f9611a;
        aVar.H("DateTime", format);
        try {
            aVar.H("SubSecTime", Long.toString(currentTimeMillis - threadLocal.get().parse(format).getTime()));
        } catch (ParseException unused) {
        }
        aVar.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        double d11;
        long time;
        Integer num;
        long j11;
        Integer num2;
        Integer num3;
        Boolean bool;
        Location location;
        char c11;
        String d12;
        long time2;
        Locale locale = Locale.ENGLISH;
        androidx.exifinterface.media.a aVar = this.f9611a;
        Integer valueOf = Integer.valueOf(aVar.f(0, "ImageWidth"));
        Integer valueOf2 = Integer.valueOf(aVar.f(0, "ImageLength"));
        Integer valueOf3 = Integer.valueOf(e());
        int d13 = d();
        Boolean valueOf4 = Boolean.valueOf(d13 == 4 || d13 == 5 || d13 == 7);
        Boolean valueOf5 = Boolean.valueOf(d() == 2);
        String d14 = aVar.d("GPSProcessingMethod");
        double[] j12 = aVar.j();
        double e11 = aVar.e("GPSAltitude", -1.0d);
        int f7 = aVar.f(-1, "GPSAltitudeRef");
        if (e11 < 0.0d || f7 < 0) {
            str = d14;
            d11 = 0.0d;
        } else {
            str = d14;
            d11 = e11 * (f7 == 1 ? -1 : 1);
        }
        double e12 = aVar.e("GPSSpeed", 0.0d);
        String d15 = aVar.d("GPSSpeedRef");
        if (d15 == null) {
            d15 = "K";
        }
        String d16 = aVar.d("GPSDateStamp");
        String d17 = aVar.d("GPSTimeStamp");
        ThreadLocal<SimpleDateFormat> threadLocal = f9607d;
        long j13 = -1;
        if (d16 != null || d17 != null) {
            if (d17 == null) {
                time = f9605b.get().parse(d16).getTime();
            } else {
                if (d16 != null) {
                    String c12 = g.c(d16, " ", d17);
                    if (c12 != null) {
                        try {
                            time = threadLocal.get().parse(c12).getTime();
                        } catch (ParseException unused) {
                        }
                        num = valueOf2;
                        j11 = time;
                        if (j12 != null) {
                            num2 = num;
                            location = null;
                            num3 = valueOf3;
                            bool = valueOf4;
                        } else {
                            String str2 = str == null ? "h" : str;
                            num2 = num;
                            Location location2 = new Location(str2);
                            num3 = valueOf3;
                            bool = valueOf4;
                            location2.setLatitude(j12[0]);
                            location2.setLongitude(j12[1]);
                            if (d11 != 0.0d) {
                                location2.setAltitude(d11);
                            }
                            if (e12 != 0.0d) {
                                int hashCode = d15.hashCode();
                                if (hashCode == 75) {
                                    if (d15.equals("K")) {
                                        c11 = 2;
                                        if (c11 != 0) {
                                        }
                                        location2.setSpeed((float) (e12 / 2.23694d));
                                    }
                                    c11 = 65535;
                                    if (c11 != 0) {
                                    }
                                    location2.setSpeed((float) (e12 / 2.23694d));
                                } else if (hashCode != 77) {
                                    if (hashCode == 78 && d15.equals("N")) {
                                        c11 = 1;
                                        if (c11 != 0) {
                                            e12 *= c11 != 1 ? 0.621371d : 1.15078d;
                                        }
                                        location2.setSpeed((float) (e12 / 2.23694d));
                                    }
                                    c11 = 65535;
                                    if (c11 != 0) {
                                    }
                                    location2.setSpeed((float) (e12 / 2.23694d));
                                } else {
                                    if (d15.equals("M")) {
                                        c11 = 0;
                                        if (c11 != 0) {
                                        }
                                        location2.setSpeed((float) (e12 / 2.23694d));
                                    }
                                    c11 = 65535;
                                    if (c11 != 0) {
                                    }
                                    location2.setSpeed((float) (e12 / 2.23694d));
                                }
                            }
                            if (j11 != -1) {
                                location2.setTime(j11);
                            }
                            location = location2;
                        }
                        d12 = aVar.d("DateTimeOriginal");
                        if (d12 != null) {
                            try {
                                time2 = threadLocal.get().parse(d12).getTime();
                            } catch (ParseException unused2) {
                            }
                            if (time2 != -1) {
                                String d18 = aVar.d("SubSecTimeOriginal");
                                if (d18 != null) {
                                    try {
                                        long parseLong = Long.parseLong(d18);
                                        while (parseLong > 1000) {
                                            parseLong /= 10;
                                        }
                                        j13 = time2 + parseLong;
                                    } catch (NumberFormatException unused3) {
                                    }
                                }
                                j13 = time2;
                            }
                            return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", valueOf, num2, num3, bool, valueOf5, location, Long.valueOf(j13), aVar.d("ImageDescription"));
                        }
                        time2 = -1;
                        if (time2 != -1) {
                        }
                        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", valueOf, num2, num3, bool, valueOf5, location, Long.valueOf(j13), aVar.d("ImageDescription"));
                    }
                    time = -1;
                    num = valueOf2;
                    j11 = time;
                    if (j12 != null) {
                    }
                    d12 = aVar.d("DateTimeOriginal");
                    if (d12 != null) {
                    }
                    time2 = -1;
                    if (time2 != -1) {
                    }
                    return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", valueOf, num2, num3, bool, valueOf5, location, Long.valueOf(j13), aVar.d("ImageDescription"));
                }
                time = f9606c.get().parse(d17).getTime();
            }
            num = valueOf2;
            j11 = time;
            if (j12 != null) {
            }
            d12 = aVar.d("DateTimeOriginal");
            if (d12 != null) {
            }
            time2 = -1;
            if (time2 != -1) {
            }
            return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", valueOf, num2, num3, bool, valueOf5, location, Long.valueOf(j13), aVar.d("ImageDescription"));
        }
        num = valueOf2;
        j11 = -1;
        if (j12 != null) {
        }
        d12 = aVar.d("DateTimeOriginal");
        if (d12 != null) {
        }
        time2 = -1;
        if (time2 != -1) {
        }
        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", valueOf, num2, num3, bool, valueOf5, location, Long.valueOf(j13), aVar.d("ImageDescription"));
    }
}
