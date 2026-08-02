package G;

import C.S;
import T7.E;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.EnumC5128y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    static final l[] f9618c;

    /* renamed from: d, reason: collision with root package name */
    static final l[][] f9619d;

    /* renamed from: e, reason: collision with root package name */
    static final HashSet<String> f9620e;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f9621a;

    /* renamed from: b, reason: collision with root package name */
    private final ByteOrder f9622b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9623a;

        static {
            int[] iArr = new int[EnumC5128y.values().length];
            f9623a = iArr;
            try {
                iArr[EnumC5128y.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9623a[EnumC5128y.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9623a[EnumC5128y.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f9624c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f9625d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f9626e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f, reason: collision with root package name */
        static final ArrayList f9627f;

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f9628a;

        /* renamed from: b, reason: collision with root package name */
        private final ByteOrder f9629b;

        final class a implements Enumeration<HashMap<String, l>> {

            /* renamed from: a, reason: collision with root package name */
            int f9630a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i11 = this.f9630a;
                l[] lVarArr = j.f9618c;
                return i11 < 4;
            }

            @Override // java.util.Enumeration
            public final HashMap<String, l> nextElement() {
                HashMap<String, l> hashMap = new HashMap<>();
                for (l lVar : j.f9619d[this.f9630a]) {
                    hashMap.put(lVar.f9641b, lVar);
                }
                this.f9630a++;
                return hashMap;
            }
        }

        /* renamed from: G.j$b$b, reason: collision with other inner class name */
        final class C0200b implements Enumeration<Map<String, i>> {

            /* renamed from: a, reason: collision with root package name */
            int f9631a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i11 = this.f9631a;
                l[] lVarArr = j.f9618c;
                return i11 < 4;
            }

            @Override // java.util.Enumeration
            public final Map<String, i> nextElement() {
                this.f9631a++;
                return new HashMap();
            }
        }

        final class c implements Enumeration<Map<String, i>> {

            /* renamed from: a, reason: collision with root package name */
            final Enumeration<Map<String, i>> f9632a;

            c(b bVar) {
                this.f9632a = Collections.enumeration(bVar.f9628a);
            }

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                return this.f9632a.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public final Map<String, i> nextElement() {
                return new HashMap(this.f9632a.nextElement());
            }
        }

        static {
            a aVar = new a();
            aVar.f9630a = 0;
            f9627f = Collections.list(aVar);
        }

        b() {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            C0200b c0200b = new C0200b();
            c0200b.f9631a = 0;
            this.f9628a = Collections.list(c0200b);
            this.f9629b = byteOrder;
        }

        private static Pair<Integer, Integer> b(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> b11 = b(split[0]);
                if (((Integer) b11.first).intValue() == 2) {
                    return b11;
                }
                for (int i11 = 1; i11 < split.length; i11++) {
                    Pair<Integer, Integer> b12 = b(split[i11]);
                    int intValue = (((Integer) b12.first).equals(b11.first) || ((Integer) b12.second).equals(b11.first)) ? ((Integer) b11.first).intValue() : -1;
                    int intValue2 = (((Integer) b11.second).intValue() == -1 || !(((Integer) b12.first).equals(b11.second) || ((Integer) b12.second).equals(b11.second))) ? -1 : ((Integer) b11.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        b11 = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        b11 = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return b11;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        private void d(@NonNull String str, @NonNull String str2, @NonNull ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            e(str, str2, arrayList);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x016e, code lost:
        
            if (r12 != r9) goto L44;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void e(@NonNull String str, String str2, @NonNull List<Map<String, i>> list) {
            int i11;
            int i12;
            i iVar;
            int i13;
            int i14;
            boolean z11;
            int i15;
            String str3 = str;
            String str4 = str2;
            int i16 = 1;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
                boolean find = f9625d.matcher(str4).find();
                boolean find2 = f9626e.matcher(str4).find();
                if (str4.length() != 19 || (!find && !find2)) {
                    S.k("ExifData", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                if (find2) {
                    str4 = str4.replaceAll("-", ProductContainerDTO.RATIO_DELIMITER);
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str5 = str3;
            int i17 = 3;
            int i18 = 2;
            if (str4 != null && j.f9620e.contains(str5)) {
                if (str5.equals("GPSTimeStamp")) {
                    Matcher matcher = f9624c.matcher(str4);
                    if (!matcher.find()) {
                        S.k("ExifData", "Invalid value for " + str5 + " : " + str4);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    String group = matcher.group(1);
                    group.getClass();
                    sb2.append(Integer.parseInt(group));
                    sb2.append("/1,");
                    String group2 = matcher.group(2);
                    group2.getClass();
                    sb2.append(Integer.parseInt(group2));
                    sb2.append("/1,");
                    String group3 = matcher.group(3);
                    group3.getClass();
                    sb2.append(Integer.parseInt(group3));
                    sb2.append("/1");
                    str4 = sb2.toString();
                } else {
                    try {
                        str4 = new m((long) (Double.parseDouble(str4) * 10000.0d), 10000L).toString();
                    } catch (NumberFormatException e11) {
                        S.l("ExifData", Sh.b.c("Invalid value for ", str5, " : ", str4), e11);
                        return;
                    }
                }
            }
            int i19 = 0;
            while (true) {
                l[] lVarArr = j.f9618c;
                if (i19 >= 4) {
                    return;
                }
                l lVar = (l) ((HashMap) f9627f.get(i19)).get(str5);
                if (lVar != null) {
                    if (str4 == null) {
                        list.get(i19).remove(str5);
                    } else {
                        Pair<Integer, Integer> b11 = b(str4);
                        int intValue = ((Integer) b11.first).intValue();
                        int i21 = -1;
                        int i22 = lVar.f9642c;
                        if (i22 != intValue && i22 != ((Integer) b11.second).intValue()) {
                            int i23 = lVar.f9643d;
                            if (i23 != -1 && (i23 == ((Integer) b11.first).intValue() || i23 == ((Integer) b11.second).intValue())) {
                                i22 = i23;
                            } else if (i22 != i16) {
                                if (i22 != 7) {
                                }
                            }
                        }
                        ByteOrder byteOrder = this.f9629b;
                        switch (i22) {
                            case 1:
                                i11 = i18;
                                i12 = i17;
                                Map<String, i> map = list.get(i19);
                                Charset charset = i.f9612d;
                                i16 = i16;
                                if (str4.length() != i16 || str4.charAt(0) < '0' || str4.charAt(0) > '1') {
                                    byte[] bytes = str4.getBytes(i.f9612d);
                                    iVar = new i(i16, bytes.length, bytes);
                                } else {
                                    byte[] bArr = new byte[i16];
                                    bArr[0] = (byte) (str4.charAt(0) - '0');
                                    iVar = new i(i16, i16, bArr);
                                }
                                map.put(str5, iVar);
                                break;
                            case 2:
                            case 7:
                                i12 = i17;
                                Map<String, i> map2 = list.get(i19);
                                Charset charset2 = i.f9612d;
                                byte[] bytes2 = str4.concat("\u0000").getBytes(i.f9612d);
                                i11 = 2;
                                map2.put(str5, new i(2, bytes2.length, bytes2));
                                i16 = i16;
                                break;
                            case 3:
                                int i24 = i17;
                                i13 = i16;
                                String[] split = str4.split(",", -1);
                                int length = split.length;
                                int[] iArr = new int[length];
                                for (int i25 = 0; i25 < split.length; i25++) {
                                    iArr[i25] = Integer.parseInt(split[i25]);
                                }
                                Map<String, i> map3 = list.get(i19);
                                ByteBuffer wrap = ByteBuffer.wrap(new byte[i.f9614f[i24] * length]);
                                wrap.order(byteOrder);
                                for (int i26 = 0; i26 < length; i26++) {
                                    wrap.putShort((short) iArr[i26]);
                                }
                                i12 = i24;
                                map3.put(str5, new i(i12, length, wrap.array()));
                                i16 = i13;
                                i11 = 2;
                                break;
                            case 4:
                                i14 = i17;
                                i13 = i16;
                                z11 = false;
                                String[] split2 = str4.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i27 = 0; i27 < split2.length; i27++) {
                                    jArr[i27] = Long.parseLong(split2[i27]);
                                }
                                list.get(i19).put(str5, i.b(jArr, byteOrder));
                                i12 = i14;
                                i16 = i13;
                                i11 = 2;
                                break;
                            case 5:
                                i14 = i17;
                                i13 = i16;
                                int i28 = -1;
                                z11 = false;
                                String[] split3 = str4.split(",", -1);
                                int length2 = split3.length;
                                m[] mVarArr = new m[length2];
                                int i29 = 0;
                                while (i29 < split3.length) {
                                    String[] split4 = split3[i29].split("/", i28);
                                    mVarArr[i29] = new m((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[i13]));
                                    i29++;
                                    byteOrder = byteOrder;
                                    i28 = -1;
                                }
                                Map<String, i> map4 = list.get(i19);
                                ByteBuffer wrap2 = ByteBuffer.wrap(new byte[i.f9614f[5] * length2]);
                                wrap2.order(byteOrder);
                                for (int i31 = 0; i31 < length2; i31++) {
                                    m mVar = mVarArr[i31];
                                    wrap2.putInt((int) mVar.b());
                                    wrap2.putInt((int) mVar.a());
                                }
                                map4.put(str5, new i(5, length2, wrap2.array()));
                                i12 = i14;
                                i16 = i13;
                                i11 = 2;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                i11 = i18;
                                i12 = i17;
                                break;
                            case 9:
                                i15 = i17;
                                int i32 = i16;
                                String[] split5 = str4.split(",", -1);
                                int length3 = split5.length;
                                int[] iArr2 = new int[length3];
                                for (int i33 = 0; i33 < split5.length; i33++) {
                                    iArr2[i33] = Integer.parseInt(split5[i33]);
                                }
                                Map<String, i> map5 = list.get(i19);
                                ByteBuffer wrap3 = ByteBuffer.wrap(new byte[i.f9614f[9] * length3]);
                                wrap3.order(byteOrder);
                                for (int i34 = 0; i34 < length3; i34++) {
                                    wrap3.putInt(iArr2[i34]);
                                }
                                map5.put(str5, new i(9, length3, wrap3.array()));
                                i11 = i18;
                                i16 = i32;
                                i12 = i15;
                                break;
                            case 10:
                                int i35 = i16;
                                int i36 = 0;
                                String[] split6 = str4.split(",", -1);
                                int length4 = split6.length;
                                m[] mVarArr2 = new m[length4];
                                int i37 = 0;
                                while (i37 < split6.length) {
                                    String[] split7 = split6[i37].split("/", i21);
                                    int i38 = i36;
                                    m[] mVarArr3 = mVarArr2;
                                    mVarArr3[i37] = new m((long) Double.parseDouble(split7[i38]), (long) Double.parseDouble(split7[i35]));
                                    i37++;
                                    i36 = i38;
                                    i17 = i17;
                                    str4 = str4;
                                    mVarArr2 = mVarArr3;
                                    i21 = -1;
                                }
                                i15 = i17;
                                String str6 = str4;
                                m[] mVarArr4 = mVarArr2;
                                Map<String, i> map6 = list.get(i19);
                                ByteBuffer wrap4 = ByteBuffer.wrap(new byte[i.f9614f[10] * length4]);
                                wrap4.order(byteOrder);
                                for (int i39 = i36; i39 < length4; i39++) {
                                    m mVar2 = mVarArr4[i39];
                                    wrap4.putInt((int) mVar2.b());
                                    wrap4.putInt((int) mVar2.a());
                                }
                                map6.put(str5, new i(10, length4, wrap4.array()));
                                i11 = i18;
                                i16 = i35;
                                str4 = str6;
                                i12 = i15;
                                break;
                            case 12:
                                String[] split8 = str4.split(",", -1);
                                int length5 = split8.length;
                                double[] dArr = new double[length5];
                                for (int i41 = 0; i41 < split8.length; i41 += i16) {
                                    dArr[i41] = Double.parseDouble(split8[i41]);
                                }
                                Map<String, i> map7 = list.get(i19);
                                ByteBuffer wrap5 = ByteBuffer.wrap(new byte[i.f9614f[12] * length5]);
                                wrap5.order(byteOrder);
                                int i42 = 0;
                                while (i42 < length5) {
                                    wrap5.putDouble(dArr[i42]);
                                    i42++;
                                    i16 = i16;
                                }
                                map7.put(str5, new i(12, length5, wrap5.array()));
                                i11 = i18;
                                i16 = i16;
                                i12 = i17;
                                break;
                        }
                        i19 += i16;
                        i17 = i12;
                        i18 = i11;
                    }
                }
                i11 = i18;
                i12 = i17;
                i19 += i16;
                i17 = i12;
                i18 = i11;
            }
        }

        @NonNull
        public final j a() {
            ArrayList list = Collections.list(new c(this));
            if (!((Map) list.get(1)).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new j(this.f9629b, list);
        }

        @NonNull
        public final void c(@NonNull String str, @NonNull String str2) {
            e(str, str2, this.f9628a);
        }

        @NonNull
        public final void f(long j11) {
            e("ExposureTime", String.valueOf(j11 / TimeUnit.SECONDS.toNanos(1L)), this.f9628a);
        }

        @NonNull
        public final void g(@NonNull EnumC5128y enumC5128y) {
            int i11;
            if (enumC5128y == EnumC5128y.UNKNOWN) {
                return;
            }
            int i12 = a.f9623a[enumC5128y.ordinal()];
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 2) {
                i11 = 32;
            } else {
                if (i12 != 3) {
                    S.k("ExifData", "Unknown flash state: " + enumC5128y);
                    return;
                }
                i11 = 1;
            }
            if ((i11 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            e("Flash", String.valueOf(i11), this.f9628a);
        }

        @NonNull
        public final void h(float f7) {
            e("FocalLength", new m((long) (f7 * 1000.0f), 1000L).toString(), this.f9628a);
        }

        @NonNull
        public final void i(int i11) {
            e("ImageLength", String.valueOf(i11), this.f9628a);
        }

        @NonNull
        public final void j(int i11) {
            e("ImageWidth", String.valueOf(i11), this.f9628a);
        }

        @NonNull
        public final void k(int i11) {
            String valueOf = String.valueOf(3);
            ArrayList arrayList = this.f9628a;
            e("SensitivityType", valueOf, arrayList);
            e("PhotographicSensitivity", String.valueOf(Math.min(65535, i11)), arrayList);
        }

        @NonNull
        public final void l(float f7) {
            e("FNumber", String.valueOf(f7), this.f9628a);
        }

        @NonNull
        public final void m(int i11) {
            int i12;
            if (i11 == 0) {
                i12 = 1;
            } else if (i11 == 90) {
                i12 = 6;
            } else if (i11 == 180) {
                i12 = 3;
            } else if (i11 != 270) {
                S.k("ExifData", "Unexpected orientation value: " + i11 + ". Must be one of 0, 90, 180, 270.");
                i12 = 0;
            } else {
                i12 = 8;
            }
            e("Orientation", String.valueOf(i12), this.f9628a);
        }

        @NonNull
        public final void n(@NonNull c cVar) {
            int ordinal = cVar.ordinal();
            e("WhiteBalance", ordinal != 0 ? ordinal != 1 ? null : String.valueOf(1) : String.valueOf(0), this.f9628a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c AUTO;
        public static final c MANUAL;

        static {
            c cVar = new c("AUTO", 0);
            AUTO = cVar;
            c cVar2 = new c("MANUAL", 1);
            MANUAL = cVar2;
            $VALUES = new c[]{cVar, cVar2};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    static {
        l[] lVarArr = {new l("ImageWidth", 256, 3, 4), new l("ImageLength", 257, 3, 4), new l("Make", 271, 2), new l("Model", 272, 2), new l("Orientation", 274, 3), new l("XResolution", 282, 5), new l("YResolution", 283, 5), new l("ResolutionUnit", 296, 3), new l("Software", 305, 2), new l("DateTime", 306, 2), new l("YCbCrPositioning", 531, 3), new l("SubIFDPointer", 330, 4), new l("ExifIFDPointer", 34665, 4), new l("GPSInfoIFDPointer", 34853, 4)};
        l[] lVarArr2 = {new l("ExposureTime", 33434, 5), new l("FNumber", 33437, 5), new l("ExposureProgram", 34850, 3), new l("PhotographicSensitivity", 34855, 3), new l("SensitivityType", 34864, 3), new l("ExifVersion", 36864, 2), new l("DateTimeOriginal", 36867, 2), new l("DateTimeDigitized", 36868, 2), new l("ComponentsConfiguration", 37121, 7), new l("ShutterSpeedValue", 37377, 10), new l("ApertureValue", 37378, 5), new l("BrightnessValue", 37379, 10), new l("ExposureBiasValue", 37380, 10), new l("MaxApertureValue", 37381, 5), new l("MeteringMode", 37383, 3), new l("LightSource", 37384, 3), new l("Flash", 37385, 3), new l("FocalLength", 37386, 5), new l("SubSecTime", 37520, 2), new l("SubSecTimeOriginal", 37521, 2), new l("SubSecTimeDigitized", 37522, 2), new l("FlashpixVersion", 40960, 7), new l("ColorSpace", 40961, 3), new l("PixelXDimension", 40962, 3, 4), new l("PixelYDimension", 40963, 3, 4), new l("InteroperabilityIFDPointer", 40965, 4), new l("FocalPlaneResolutionUnit", 41488, 3), new l("SensingMethod", 41495, 3), new l("FileSource", 41728, 7), new l("SceneType", 41729, 7), new l("CustomRendered", 41985, 3), new l("ExposureMode", 41986, 3), new l("WhiteBalance", 41987, 3), new l("SceneCaptureType", 41990, 3), new l("Contrast", 41992, 3), new l("Saturation", 41993, 3), new l("Sharpness", 41994, 3)};
        l[] lVarArr3 = {new l("GPSVersionID", 0, 1), new l("GPSLatitudeRef", 1, 2), new l("GPSLatitude", 2, 5, 10), new l("GPSLongitudeRef", 3, 2), new l("GPSLongitude", 4, 5, 10), new l("GPSAltitudeRef", 5, 1), new l("GPSAltitude", 6, 5), new l("GPSTimeStamp", 7, 5), new l("GPSSpeedRef", 12, 2), new l("GPSTrackRef", 14, 2), new l("GPSImgDirectionRef", 16, 2), new l("GPSDestBearingRef", 23, 2), new l("GPSDestDistanceRef", 25, 2)};
        f9618c = new l[]{new l("SubIFDPointer", 330, 4), new l("ExifIFDPointer", 34665, 4), new l("GPSInfoIFDPointer", 34853, 4), new l("InteroperabilityIFDPointer", 40965, 4)};
        f9619d = new l[][]{lVarArr, lVarArr2, lVarArr3, new l[]{new l("InteroperabilityIndex", 1, 2)}};
        f9620e = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    j(ByteOrder byteOrder, ArrayList arrayList) {
        x2.i.f("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.f9622b = byteOrder;
        this.f9621a = arrayList;
    }

    @NonNull
    public static j a(@NonNull androidx.camera.core.p pVar, int i11) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        b bVar = new b();
        bVar.c("Orientation", String.valueOf(1));
        bVar.c("XResolution", "72/1");
        bVar.c("YResolution", "72/1");
        bVar.c("ResolutionUnit", String.valueOf(2));
        bVar.c("YCbCrPositioning", String.valueOf(1));
        bVar.c("Make", Build.MANUFACTURER);
        bVar.c("Model", Build.MODEL);
        if (pVar.x0() != null) {
            pVar.x0().b(bVar);
        }
        bVar.m(i11);
        bVar.j(pVar.getWidth());
        bVar.i(pVar.getHeight());
        return bVar.a();
    }

    @NonNull
    final Map<String, i> b(int i11) {
        x2.i.c(i11, 0, 4, E.a(i11, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.f9621a.get(i11);
    }

    @NonNull
    public final ByteOrder c() {
        return this.f9622b;
    }
}
