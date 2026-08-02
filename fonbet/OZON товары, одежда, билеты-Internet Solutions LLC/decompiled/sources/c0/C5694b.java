package c0;

import Am.C2438a;
import B90.C2618u;
import C.S;
import N3.C3660k;
import W.AbstractC4830a;
import W.AbstractC4847s;
import Z.q;
import android.util.Range;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import c0.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5694b {
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(@NonNull AbstractC4847s abstractC4847s, Y.f fVar) {
        InterfaceC5086c0.a aVar;
        String str = abstractC4847s.b() != 1 ? "audio/mp4a-latm" : "audio/vorbis";
        int i11 = (abstractC4847s.b() != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (fVar != null && fVar.f() != null) {
            aVar = fVar.f();
            String e11 = aVar.e();
            int f7 = aVar.f();
            if (!Objects.equals(e11, "audio/none")) {
                if (abstractC4847s.b() == -1) {
                    S.a("AudioConfigUtil", C2618u.f(f7, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: ", e11, "(profile: ", ")]"));
                    str = e11;
                    i11 = f7;
                } else if (str.equals(e11) && i11 == f7) {
                    S.a("AudioConfigUtil", C2618u.f(i11, "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: ", e11, "(profile: ", ")]"));
                    str = e11;
                } else {
                    StringBuilder c11 = C3660k.c(f7, "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: ", e11, "(profile: ", "), chosen mime type: ");
                    c11.append(str);
                    c11.append("(profile: ");
                    c11.append(i11);
                    c11.append(")]");
                    S.a("AudioConfigUtil", c11.toString());
                }
                h.a aVar2 = new h.a();
                aVar2.c(str);
                aVar2.d(-1);
                aVar2.d(i11);
                if (aVar != null) {
                    aVar2.b(aVar);
                }
                return aVar2.a();
            }
            S.a("AudioConfigUtil", C2618u.f(i11, "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: ", str, "(profile: ", ")]"));
        }
        aVar = null;
        h.a aVar22 = new h.a();
        aVar22.c(str);
        aVar22.d(-1);
        aVar22.d(i11);
        if (aVar != null) {
        }
        return aVar22.a();
    }

    static int b(@NonNull AbstractC4830a abstractC4830a) {
        int d11 = abstractC4830a.d();
        if (d11 == -1) {
            S.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        S.a("AudioConfigUtil", "Using provided AUDIO source: " + d11);
        return d11;
    }

    static int c(@NonNull AbstractC4830a abstractC4830a) {
        int e11 = abstractC4830a.e();
        if (e11 == -1) {
            S.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        S.a("AudioConfigUtil", "Using provided AUDIO source format: " + e11);
        return e11;
    }

    static int d(int i11, int i12, int i13, int i14, int i15, Range<Integer> range) {
        int doubleValue = (int) (new Rational(i14, i15).doubleValue() * new Rational(i12, i13).doubleValue() * i11);
        String format = S.f("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(doubleValue)) : "";
        if (!AbstractC4830a.f32997a.equals(range)) {
            Integer clamp = range.clamp(Integer.valueOf(doubleValue));
            doubleValue = clamp.intValue();
            if (S.f("AudioConfigUtil")) {
                format = format.concat(String.format("\nClamped to range %s -> %dbps", range, clamp));
            }
        }
        S.a("AudioConfigUtil", format);
        return doubleValue;
    }

    static int e(@NonNull Range<Integer> range, int i11, int i12, final int i13) {
        ArrayList arrayList = null;
        int i14 = 0;
        int i15 = i13;
        while (true) {
            if (!range.contains((Range<Integer>) Integer.valueOf(i15))) {
                S.a("AudioConfigUtil", "Sample rate " + i15 + "Hz is not in target range " + range);
            } else {
                if (q.d(i15, i11, i12)) {
                    return i15;
                }
                StringBuilder a11 = C2438a.a("Sample rate ", i15, "Hz is not supported by audio source with channel count ", " and source format ", i11);
                a11.append(i12);
                S.a("AudioConfigUtil", a11.toString());
            }
            if (arrayList == null) {
                S.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i13 + "Hz");
                arrayList = new ArrayList(Z.a.f35214a);
                Collections.sort(arrayList, new Comparator() { // from class: c0.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int intValue = ((Integer) obj).intValue();
                        int i16 = i13;
                        int abs = Math.abs(intValue - i16) - Math.abs(((Integer) obj2).intValue() - i16);
                        return (int) (abs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(abs));
                    }
                });
            }
            if (i14 >= arrayList.size()) {
                S.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            i15 = ((Integer) arrayList.get(i14)).intValue();
            i14++;
        }
    }
}
