package androidx.camera.video.internal.compat.quirk;

import C.S;
import H.c;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.I0;
import b0.C5496b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private static volatile I0 f38502a;

    static {
        G0.b().c(c.b(), new C5496b());
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(F0 f02) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        if (f02.a(false, MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class)) {
            arrayList.add(new MediaFormatMustNotUseFrameRateToFindEncoderQuirk());
        }
        List<String> list = MediaCodecInfoReportIncorrectInfoQuirk.f38501a;
        String str = Build.BRAND;
        if ((!"Nokia".equalsIgnoreCase(str) || !"Nokia 1".equalsIgnoreCase(Build.MODEL)) && ((!"motorola".equalsIgnoreCase(str) || !"moto c".equalsIgnoreCase(Build.MODEL)) && ((!"infinix".equalsIgnoreCase(str) || !"infinix x650".equalsIgnoreCase(Build.MODEL)) && ((!"LGE".equalsIgnoreCase(str) || !"LG-X230".equalsIgnoreCase(Build.MODEL)) && ((!"Huawei".equalsIgnoreCase(str) || !"mha-l29".equalsIgnoreCase(Build.MODEL)) && ((!"Redmi".equalsIgnoreCase(str) || !"Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL)) && (!"positivo".equalsIgnoreCase(str) || !"twist 2 pro".equalsIgnoreCase(Build.MODEL)))))))) {
            if (!MediaCodecInfoReportIncorrectInfoQuirk.f38501a.contains(Build.MODEL.toLowerCase(Locale.US))) {
                z11 = false;
                if (f02.a(z11, MediaCodecInfoReportIncorrectInfoQuirk.class)) {
                    arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
                }
                if (f02.a(false, DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) {
                    arrayList.add(new DeactivateEncoderSurfaceBeforeStopEncoderQuirk());
                }
                if (f02.a(CameraUseInconsistentTimebaseQuirk.e(), CameraUseInconsistentTimebaseQuirk.class)) {
                    arrayList.add(new CameraUseInconsistentTimebaseQuirk());
                }
                if (f02.a(ReportedVideoQualityNotSupportedQuirk.i(), ReportedVideoQualityNotSupportedQuirk.class)) {
                    arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
                }
                if (f02.a(EncoderNotUsePersistentInputSurfaceQuirk.e(), EncoderNotUsePersistentInputSurfaceQuirk.class)) {
                    arrayList.add(new EncoderNotUsePersistentInputSurfaceQuirk());
                }
                if (f02.a(!"positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL), VideoEncoderCrashQuirk.class)) {
                    arrayList.add(new VideoEncoderCrashQuirk());
                }
                if (f02.a(ExcludeStretchedVideoQualityQuirk.g(), ExcludeStretchedVideoQualityQuirk.class)) {
                    arrayList.add(new ExcludeStretchedVideoQualityQuirk());
                }
                if (f02.a((!"positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || ("itel".equalsIgnoreCase(str) && "itel w6004".equalsIgnoreCase(Build.MODEL)), MediaStoreVideoCannotWrite.class)) {
                    arrayList.add(new MediaStoreVideoCannotWrite());
                }
                if (f02.a(!"Sony".equalsIgnoreCase(str) && "G3125".equalsIgnoreCase(Build.MODEL), AudioEncoderIgnoresInputTimestampQuirk.class)) {
                    arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
                }
                if (f02.a(!"Samsung".equalsIgnoreCase(str) && Build.VERSION.SDK_INT < 29, VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class)) {
                    arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
                }
                if (f02.a(Build.VERSION.SDK_INT >= 34, NegativeLatLongSavesIncorrectlyQuirk.class)) {
                    arrayList.add(new NegativeLatLongSavesIncorrectlyQuirk());
                }
                if (f02.a(AudioTimestampFramePositionIncorrectQuirk.e(), AudioTimestampFramePositionIncorrectQuirk.class)) {
                    arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
                }
                if (f02.a(!"motorola".equalsIgnoreCase(str) && "moto e5 play".equalsIgnoreCase(Build.MODEL), ExtraSupportedResolutionQuirk.class)) {
                    arrayList.add(new ExtraSupportedResolutionQuirk());
                }
                if (f02.a(!"motorola".equalsIgnoreCase(str) && "moto e5 play".equalsIgnoreCase(Build.MODEL), StretchedVideoResolutionQuirk.class)) {
                    arrayList.add(new StretchedVideoResolutionQuirk());
                }
                if (f02.a(!"Nokia".equalsIgnoreCase(str) && "Nokia 1".equalsIgnoreCase(Build.MODEL), CodecStuckOnFlushQuirk.class)) {
                    arrayList.add(new CodecStuckOnFlushQuirk());
                }
                if (f02.a(!"motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL), StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class)) {
                    arrayList.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
                }
                if (f02.a(!"motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL), ExtraSupportedQualityQuirk.class)) {
                    arrayList.add(new ExtraSupportedQualityQuirk());
                }
                if (f02.a(!"Nokia".equalsIgnoreCase(str) && "Nokia 1".equalsIgnoreCase(Build.MODEL), SignalEosOutputBufferNotComeQuirk.class)) {
                    arrayList.add(new SignalEosOutputBufferNotComeQuirk());
                }
                if ("motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL)) {
                    z12 = true;
                }
                if (f02.a(z12, SizeCannotEncodeVideoQuirk.class)) {
                    arrayList.add(new SizeCannotEncodeVideoQuirk());
                }
                f38502a = new I0(arrayList);
                S.a("DeviceQuirks", "video DeviceQuirks = " + I0.d(f38502a));
            }
        }
        z11 = true;
        if (f02.a(z11, MediaCodecInfoReportIncorrectInfoQuirk.class)) {
        }
        if (f02.a(false, DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) {
        }
        if (f02.a(CameraUseInconsistentTimebaseQuirk.e(), CameraUseInconsistentTimebaseQuirk.class)) {
        }
        if (f02.a(ReportedVideoQualityNotSupportedQuirk.i(), ReportedVideoQualityNotSupportedQuirk.class)) {
        }
        if (f02.a(EncoderNotUsePersistentInputSurfaceQuirk.e(), EncoderNotUsePersistentInputSurfaceQuirk.class)) {
        }
        if (f02.a(!"positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL), VideoEncoderCrashQuirk.class)) {
        }
        if (f02.a(ExcludeStretchedVideoQualityQuirk.g(), ExcludeStretchedVideoQualityQuirk.class)) {
        }
        if (f02.a((!"positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || ("itel".equalsIgnoreCase(str) && "itel w6004".equalsIgnoreCase(Build.MODEL)), MediaStoreVideoCannotWrite.class)) {
        }
        if (f02.a(!"Sony".equalsIgnoreCase(str) && "G3125".equalsIgnoreCase(Build.MODEL), AudioEncoderIgnoresInputTimestampQuirk.class)) {
        }
        if (f02.a(!"Samsung".equalsIgnoreCase(str) && Build.VERSION.SDK_INT < 29, VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class)) {
        }
        if (f02.a(Build.VERSION.SDK_INT >= 34, NegativeLatLongSavesIncorrectlyQuirk.class)) {
        }
        if (f02.a(AudioTimestampFramePositionIncorrectQuirk.e(), AudioTimestampFramePositionIncorrectQuirk.class)) {
        }
        if (f02.a(!"motorola".equalsIgnoreCase(str) && "moto e5 play".equalsIgnoreCase(Build.MODEL), ExtraSupportedResolutionQuirk.class)) {
        }
        if (f02.a(!"motorola".equalsIgnoreCase(str) && "moto e5 play".equalsIgnoreCase(Build.MODEL), StretchedVideoResolutionQuirk.class)) {
        }
        if (f02.a(!"Nokia".equalsIgnoreCase(str) && "Nokia 1".equalsIgnoreCase(Build.MODEL), CodecStuckOnFlushQuirk.class)) {
        }
        if (f02.a(!"motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL), StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class)) {
        }
        if (f02.a(!"motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL), ExtraSupportedQualityQuirk.class)) {
        }
        if (f02.a(!"Nokia".equalsIgnoreCase(str) && "Nokia 1".equalsIgnoreCase(Build.MODEL), SignalEosOutputBufferNotComeQuirk.class)) {
        }
        if ("motorola".equalsIgnoreCase(str)) {
            z12 = true;
        }
        if (f02.a(z12, SizeCannotEncodeVideoQuirk.class)) {
        }
        f38502a = new I0(arrayList);
        S.a("DeviceQuirks", "video DeviceQuirks = " + I0.d(f38502a));
    }

    public static <T extends E0> T b(@NonNull Class<T> cls) {
        return (T) f38502a.b(cls);
    }

    @NonNull
    public static I0 c() {
        return f38502a;
    }
}
