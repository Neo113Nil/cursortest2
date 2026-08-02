package androidx.camera.camera2.internal.compat.quirk;

import C.S;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.I0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import w.C10368u;

/* loaded from: classes8.dex */
public final class a {
    @NonNull
    public static I0 a(@NonNull C10368u c10368u) {
        Integer num;
        F0 a11 = G0.b().a();
        ArrayList arrayList = new ArrayList();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Integer num2 = (Integer) c10368u.a(key);
        boolean z11 = false;
        if (a11.a(num2 != null && num2.intValue() == 2, AeFpsRangeLegacyQuirk.class)) {
            arrayList.add(new AeFpsRangeLegacyQuirk(c10368u));
        }
        if (a11.a(false, AspectRatioLegacyApi21Quirk.class)) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (a11.a(JpegHalCorruptImageQuirk.e(), JpegHalCorruptImageQuirk.class)) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (a11.a(JpegCaptureDownsizingQuirk.e(c10368u), JpegCaptureDownsizingQuirk.class)) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        Integer num3 = (Integer) c10368u.a(key);
        if (a11.a(num3 != null && num3.intValue() == 2, CamcorderProfileResolutionQuirk.class)) {
            arrayList.add(new CamcorderProfileResolutionQuirk(c10368u));
        }
        String str = Build.HARDWARE;
        if (a11.a(("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 1, CaptureNoResponseQuirk.class)) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        Integer num4 = (Integer) c10368u.a(key);
        if (a11.a(num4 != null && num4.intValue() == 2, LegacyCameraOutputConfigNullPointerQuirk.class)) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        int i11 = Build.VERSION.SDK_INT;
        if (a11.a(i11 < 29 && (num = (Integer) c10368u.a(key)) != null && num.intValue() == 2, LegacyCameraSurfaceCleanupQuirk.class)) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        List<String> list = ImageCaptureWashedOutImageQuirk.f38047a;
        String str2 = Build.MODEL;
        Locale locale = Locale.US;
        if (a11.a(ImageCaptureWashedOutImageQuirk.f38047a.contains(str2.toUpperCase(locale)) && ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 1, ImageCaptureWashedOutImageQuirk.class)) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        List<String> list2 = CameraNoResponseWhenEnablingFlashQuirk.f38032a;
        if (a11.a(CameraNoResponseWhenEnablingFlashQuirk.f38032a.contains(str2.toUpperCase(locale)) && ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 1, CameraNoResponseWhenEnablingFlashQuirk.class)) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        String str3 = Build.BRAND;
        if (a11.a(("motorola".equalsIgnoreCase(str3) && "MotoG3".equalsIgnoreCase(str2)) || ("samsung".equalsIgnoreCase(str3) && "SM-G532F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str3) && "SM-J700F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str3) && "SM-A920F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str3) && "SM-J415F".equalsIgnoreCase(str2)) || ("xiaomi".equalsIgnoreCase(str3) && "Mi A1".equalsIgnoreCase(str2))))), YuvImageOnePixelShiftQuirk.class)) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (a11.a(FlashTooSlowQuirk.e(c10368u), FlashTooSlowQuirk.class)) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (a11.a(str3.equalsIgnoreCase("SAMSUNG") && i11 < 33 && ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 0, AfRegionFlipHorizontallyQuirk.class)) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        Integer num5 = (Integer) c10368u.a(key);
        if (a11.a(num5 != null && num5.intValue() == 2, ConfigureSurfaceToSecondarySessionFailQuirk.class)) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        Integer num6 = (Integer) c10368u.a(key);
        if (a11.a(num6 != null && num6.intValue() == 2, PreviewOrientationIncorrectQuirk.class)) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        Integer num7 = (Integer) c10368u.a(key);
        if (a11.a(num7 != null && num7.intValue() == 2, CaptureSessionStuckQuirk.class)) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (a11.a(ImageCaptureFlashNotFireQuirk.e(c10368u), ImageCaptureFlashNotFireQuirk.class)) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        List<String> list3 = ImageCaptureWithFlashUnderexposureQuirk.f38048a;
        if (a11.a(ImageCaptureWithFlashUnderexposureQuirk.f38048a.contains(str2.toLowerCase(locale)) && ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 1, ImageCaptureWithFlashUnderexposureQuirk.class)) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (a11.a(ImageCaptureFailWithAutoFlashQuirk.e(c10368u), ImageCaptureFailWithAutoFlashQuirk.class)) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        Integer num8 = (Integer) c10368u.a(key);
        if (a11.a(num8 != null && num8.intValue() == 2, IncorrectCaptureStateQuirk.class)) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (a11.a(TorchFlashRequiredFor3aUpdateQuirk.f(c10368u), TorchFlashRequiredFor3aUpdateQuirk.class)) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(c10368u));
        }
        String str4 = Build.MANUFACTURER;
        if (a11.a(("HUAWEI".equalsIgnoreCase(str4) && "HUAWEI ALE-L04".equalsIgnoreCase(str2)) || ("Samsung".equalsIgnoreCase(str4) && "sm-j320f".equalsIgnoreCase(str2)) || (("Samsung".equalsIgnoreCase(str4) && "sm-j700f".equalsIgnoreCase(str2)) || (("Samsung".equalsIgnoreCase(str4) && "sm-j111f".equalsIgnoreCase(str2)) || (("OPPO".equalsIgnoreCase(str4) && "A37F".equalsIgnoreCase(str2)) || ("Samsung".equalsIgnoreCase(str4) && "sm-j510fn".equalsIgnoreCase(str2))))), PreviewStretchWhenVideoCaptureIsBoundQuirk.class)) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (a11.a("Huawei".equalsIgnoreCase(str4), PreviewDelayWhenVideoCaptureIsBoundQuirk.class)) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (a11.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.e() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.f() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.i() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.g() || ("pixel 4 xl".equalsIgnoreCase(str2) && i11 == 29) || (("motorola".equalsIgnoreCase(str3) && "moto e13".equalsIgnoreCase(str2)) || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.h()), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class)) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (a11.a("Pixel 8".equalsIgnoreCase(str2) && ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 0, TemporalNoiseQuirk.class)) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (a11.a(ImageCaptureFailedForVideoSnapshotQuirk.e(), ImageCaptureFailedForVideoSnapshotQuirk.class)) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if ("samsung".equalsIgnoreCase(str3) && str2.toLowerCase(locale).startsWith("sm-m556")) {
            z11 = true;
        }
        if (a11.a(z11, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class)) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        I0 i02 = new I0(arrayList);
        S.a("CameraQuirks", "camera2 CameraQuirks = " + I0.d(i02));
        return i02;
    }
}
