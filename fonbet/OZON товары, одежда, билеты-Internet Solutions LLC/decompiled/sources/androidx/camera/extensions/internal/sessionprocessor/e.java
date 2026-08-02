package androidx.camera.extensions.internal.sessionprocessor;

import C.S;
import G.j;
import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.EnumC5118t;
import androidx.camera.core.impl.EnumC5122v;
import androidx.camera.core.impl.EnumC5126x;
import androidx.camera.core.impl.EnumC5128y;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.X0;
import java.nio.BufferUnderflowException;
import java.util.Map;

/* loaded from: classes8.dex */
final class e implements InterfaceC5130z {

    /* renamed from: a, reason: collision with root package name */
    private final Map<CaptureResult.Key, Object> f38483a;

    /* renamed from: b, reason: collision with root package name */
    private X0 f38484b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38485c;

    e(long j11, @NonNull X0 x02, @NonNull Map<CaptureResult.Key, Object> map) {
        this.f38483a = map;
        this.f38484b = x02;
        this.f38485c = j11;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final X0 a() {
        return this.f38484b;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    public final void b(@NonNull j.b bVar) {
        Map<CaptureResult.Key, Object> map = this.f38483a;
        super.b(bVar);
        try {
            Integer num = (Integer) map.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            S.k("KeyValueMapCameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l11 = (Long) map.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l11 != null) {
            bVar.f(l11.longValue());
        }
        Float f7 = (Float) map.get(CaptureResult.LENS_APERTURE);
        if (f7 != null) {
            bVar.l(f7.floatValue());
        }
        Integer num2 = (Integer) map.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) map.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r2.intValue() / 100.0f)));
            }
            bVar.k(num2.intValue());
        }
        Float f11 = (Float) map.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num3 = (Integer) map.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            j.c cVar = j.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = j.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5122v c() {
        Integer num = (Integer) this.f38483a.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC5122v.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                S.c("KeyValueMapCameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC5122v.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5126x d() {
        Integer num = (Integer) this.f38483a.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC5126x.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC5126x.INACTIVE;
        }
        if (intValue == 1) {
            return EnumC5126x.METERING;
        }
        if (intValue == 2) {
            return EnumC5126x.CONVERGED;
        }
        if (intValue == 3) {
            return EnumC5126x.LOCKED;
        }
        S.c("KeyValueMapCameraCaptureResult", "Undefined awb state: " + num);
        return EnumC5126x.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5118t e() {
        Integer num = (Integer) this.f38483a.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC5118t.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC5118t.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return EnumC5118t.CONVERGED;
            }
            if (intValue == 3) {
                return EnumC5118t.LOCKED;
            }
            if (intValue == 4) {
                return EnumC5118t.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                S.c("KeyValueMapCameraCaptureResult", "Undefined ae state: " + num);
                return EnumC5118t.UNKNOWN;
            }
        }
        return EnumC5118t.SEARCHING;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5128y f() {
        Integer num = (Integer) this.f38483a.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC5128y.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return EnumC5128y.NONE;
        }
        if (intValue == 2) {
            return EnumC5128y.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return EnumC5128y.FIRED;
        }
        S.c("KeyValueMapCameraCaptureResult", "Undefined flash state: " + num);
        return EnumC5128y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    public final CaptureResult g() {
        return null;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    public final long getTimestamp() {
        return this.f38485c;
    }
}
