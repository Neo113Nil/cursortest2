package uz.shs.better_player_plus;

import androidx.media3.exoplayer.drm.DummyExoMediaDrm;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ExoMediaDrm.Provider {
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
    public final ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
        try {
            Intrinsics.checkNotNull(uuid);
            FrameworkMediaDrm newInstance = FrameworkMediaDrm.newInstance(uuid);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            newInstance.setPropertyString("securityLevel", "L3");
            return newInstance;
        } catch (UnsupportedDrmException unused) {
            return new DummyExoMediaDrm();
        }
    }
}
