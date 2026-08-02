package androidx.camera.camera2.internal.compat.quirk;

import C.S;
import H.c;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.I0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import y.C10789a;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private static volatile I0 f38063a;

    static {
        G0.b().c(c.b(), new C10789a());
    }

    public static void a(F0 f02) {
        ArrayList arrayList = new ArrayList();
        List<String> list = ImageCapturePixelHDRPlusQuirk.f38046a;
        String str = Build.MODEL;
        boolean z11 = false;
        if (f02.a(list.contains(str) && "Google".equals(Build.MANUFACTURER), ImageCapturePixelHDRPlusQuirk.class)) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (f02.a(ExtraCroppingQuirk.g(), ExtraCroppingQuirk.class)) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        int i11 = Nexus4AndroidLTargetAspectRatioQuirk.f38055b;
        String str2 = Build.BRAND;
        "GOOGLE".equalsIgnoreCase(str2);
        if (f02.a(false, Nexus4AndroidLTargetAspectRatioQuirk.class)) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (f02.a(ExcludedSupportedSizesQuirk.h(), ExcludedSupportedSizesQuirk.class)) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        List<String> list2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f38033a;
        Locale locale = Locale.US;
        if (f02.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f38033a.contains(str.toUpperCase(locale)), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class)) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (f02.a(PreviewPixelHDRnetQuirk.e(), PreviewPixelHDRnetQuirk.class)) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (f02.a("SAMSUNG".equals(Build.MANUFACTURER.toUpperCase(locale)) && str.toUpperCase(locale).startsWith("SM-A716"), StillCaptureFlashStopRepeatingQuirk.class)) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (f02.a(ExtraSupportedSurfaceCombinationsQuirk.f(), ExtraSupportedSurfaceCombinationsQuirk.class)) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (f02.a(FlashAvailabilityBufferUnderflowQuirk.e(), FlashAvailabilityBufferUnderflowQuirk.class)) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (f02.a("Huawei".equalsIgnoreCase(str2) && "mha-l29".equalsIgnoreCase(str), RepeatingStreamConstraintForVideoRecordingQuirk.class)) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (f02.a(false, TextureViewIsClosedQuirk.class)) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (f02.a(false, CaptureSessionOnClosedNotCalledQuirk.class)) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        List<String> list3 = TorchIsClosedAfterImageCapturingQuirk.f38060a;
        if (f02.a(TorchIsClosedAfterImageCapturingQuirk.f38060a.contains(str.toLowerCase(locale)), TorchIsClosedAfterImageCapturingQuirk.class)) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (f02.a(ZslDisablerQuirk.f(), ZslDisablerQuirk.class)) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (f02.a("motorola".equalsIgnoreCase(str2) && "moto e5 play".equalsIgnoreCase(str), ExtraSupportedOutputSizeQuirk.class)) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (f02.a(InvalidVideoProfilesQuirk.e(), InvalidVideoProfilesQuirk.class)) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (f02.a("samsungexynos7870".equalsIgnoreCase(Build.HARDWARE), Preview3AThreadCrashQuirk.class)) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (f02.a(SmallDisplaySizeQuirk.f(), SmallDisplaySizeQuirk.class)) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if ("google".equalsIgnoreCase(str2) && Build.VERSION.SDK_INT >= 35) {
            z11 = true;
        }
        if (f02.a(z11, CaptureSessionShouldUseMrirQuirk.class)) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        f38063a = new I0(arrayList);
        S.a("DeviceQuirks", "camera2 DeviceQuirks = " + I0.d(f38063a));
    }

    public static <T extends E0> T b(@NonNull Class<T> cls) {
        return (T) f38063a.b(cls);
    }

    @NonNull
    public static I0 c() {
        return f38063a;
    }
}
