package com.google.android.exoplayer2.ui;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.common.collect.G;
import com.google.common.collect.i0;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public interface AdViewProvider {
    default List<AdOverlayInfo> getAdOverlayInfos() {
        G.b bVar = G.b;
        return i0.e;
    }

    @Nullable
    ViewGroup getAdViewGroup();
}
