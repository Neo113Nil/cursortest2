package androidx.glance.session;

import android.os.PowerManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi(33)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/glance/session/Api33Impl;", "", "()V", "isLightIdleOrLowPowerStandby", "", "pm", "Landroid/os/PowerManager;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Api33Impl {
    public static final Api33Impl INSTANCE = new Api33Impl();

    private Api33Impl() {
    }

    @DoNotInline
    public final boolean isLightIdleOrLowPowerStandby(PowerManager pm) {
        return pm.isLowPowerStandbyEnabled() || pm.isDeviceLightIdleMode();
    }
}
