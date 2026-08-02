package c0;

import C.A;
import C.S;
import W.AbstractC4847s;
import W.u0;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import androidx.camera.core.impl.Y0;
import c0.i;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d0.W;
import d0.X;
import e0.C6245b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f56157a;

    /* renamed from: b, reason: collision with root package name */
    private static final Y0 f56158b;

    static {
        HashMap hashMap = new HashMap();
        f56157a = hashMap;
        f56158b = Y0.UPTIME;
        HashMap hashMap2 = new HashMap();
        X x11 = X.f60869a;
        hashMap2.put(1, x11);
        X x12 = X.f60871c;
        hashMap2.put(2, x12);
        X x13 = X.f60872d;
        hashMap2.put(4096, x13);
        hashMap2.put(8192, x13);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, x11);
        hashMap3.put(2, x12);
        hashMap3.put(4096, x13);
        hashMap3.put(8192, x13);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, x11);
        hashMap4.put(4, x12);
        hashMap4.put(4096, x13);
        hashMap4.put(16384, x13);
        hashMap4.put(2, x11);
        hashMap4.put(8, x12);
        hashMap4.put(8192, x13);
        hashMap4.put(32768, x13);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(256, x12);
        hashMap5.put(Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE), X.f60870b);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    @NonNull
    public static X a(int i11, @NonNull String str) {
        X x11;
        Map map = (Map) f56157a.get(str);
        if (map != null && (x11 = (X) map.get(Integer.valueOf(i11))) != null) {
            return x11;
        }
        S.k("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i11)));
        return X.f60869a;
    }

    @NonNull
    public static n b(@NonNull AbstractC4847s abstractC4847s, @NonNull A a11, Y.f fVar) {
        InterfaceC5086c0.c cVar;
        x2.i.f("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + a11 + "]", a11.d());
        String str = "video/avc";
        String str2 = abstractC4847s.b() != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        if (fVar != null) {
            Set set = (Set) C6245b.f61728b.get(Integer.valueOf(a11.b()));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) C6245b.f61727a.get(Integer.valueOf(a11.a()));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            Iterator<InterfaceC5086c0.c> it = fVar.d().iterator();
            while (it.hasNext()) {
                cVar = it.next();
                if (set.contains(Integer.valueOf(cVar.g())) && set2.contains(Integer.valueOf(cVar.b()))) {
                    String i11 = cVar.i();
                    if (str2.equals(i11)) {
                        S.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str2 + "]");
                    } else if (abstractC4847s.b() == -1) {
                        S.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + a11 + "]");
                    }
                    str2 = i11;
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            if (abstractC4847s.b() == -1) {
                int b11 = a11.b();
                if (b11 != 1) {
                    if (b11 == 3 || b11 == 4 || b11 == 5) {
                        str = "video/hevc";
                    } else {
                        if (b11 != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + a11 + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (fVar == null) {
                S.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + a11 + "]");
            } else {
                S.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + a11 + "]");
            }
        }
        i.a aVar = new i.a();
        aVar.c(str2);
        aVar.d(-1);
        if (cVar != null) {
            aVar.b(cVar);
        }
        return aVar.a();
    }

    public static int c(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, @NonNull Range<Integer> range) {
        Rational rational = new Rational(i12, i13);
        Rational rational2 = new Rational(i14, i15);
        int doubleValue = (int) (new Rational(i18, i19).doubleValue() * new Rational(i16, i17).doubleValue() * rational2.doubleValue() * rational.doubleValue() * i11);
        String format = S.f("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(doubleValue)) : "";
        if (!u0.f33138b.equals(range)) {
            Integer clamp = range.clamp(Integer.valueOf(doubleValue));
            int intValue = clamp.intValue();
            if (S.f("VideoConfigUtil")) {
                format = format.concat(String.format("\nClamped to range %s -> %dbps", range, clamp));
            }
            doubleValue = intValue;
        }
        S.a("VideoConfigUtil", format);
        return doubleValue;
    }

    @NonNull
    public static W d(@NonNull InterfaceC5086c0.c cVar) {
        W.a d11 = W.d();
        d11.f(cVar.i());
        d11.g(cVar.j());
        d11.h(new Size(cVar.k(), cVar.h()));
        d11.d(cVar.f());
        d11.b(cVar.c());
        d11.e(f56158b);
        return d11.a();
    }
}
