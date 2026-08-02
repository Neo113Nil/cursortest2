package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.UUID;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements ExoMediaDrm.Provider {
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
    public final ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
        ExoMediaDrm lambda$static$0;
        lambda$static$0 = FrameworkMediaDrm.lambda$static$0(uuid);
        return lambda$static$0;
    }
}
