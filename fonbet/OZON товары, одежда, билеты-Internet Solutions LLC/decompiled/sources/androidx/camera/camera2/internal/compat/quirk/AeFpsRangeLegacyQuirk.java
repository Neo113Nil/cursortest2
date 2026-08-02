package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import w.C10368u;

/* loaded from: classes8.dex */
public class AeFpsRangeLegacyQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private final Range<Integer> f38029a;

    public AeFpsRangeLegacyQuirk(@NonNull C10368u c10368u) {
        Range[] rangeArr = (Range[]) c10368u.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range<Integer> range3 = new Range<>(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (range3.getUpper().intValue() == 30 && (range == null || range3.getLower().intValue() < range.getLower().intValue())) {
                    range = range3;
                }
            }
        }
        this.f38029a = range;
    }

    public final Range<Integer> e() {
        return this.f38029a;
    }
}
