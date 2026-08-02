package androidx.media3.common;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.common.collect.G;
import java.util.List;

/* loaded from: classes3.dex */
public interface AdViewProvider {
    default List<AdOverlayInfo> getAdOverlayInfos() {
        G.b bVar = com.google.common.collect.G.b;
        return com.google.common.collect.i0.e;
    }

    @Nullable
    ViewGroup getAdViewGroup();
}
