package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.MediaItem;

/* renamed from: androidx.media3.common.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0330o implements com.google.common.base.f {
    public final /* synthetic */ int a;

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        Bundle bundle = (Bundle) obj;
        switch (this.a) {
            case 0:
                return MediaItem.SubtitleConfiguration.fromBundle(bundle);
            default:
                return TrackSelectionOverride.fromBundle(bundle);
        }
    }
}
