package com.vungle.ads.internal.task;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {
    public static e a(String str, List staleAdDirs, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            staleAdDirs = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNullParameter(staleAdDirs, "staleAdDirs");
        e h = new e("CleanupJob").h();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("AD_ID_KEY", str);
        }
        if (str == null) {
            bundle.putStringArrayList("STALE_DIRS_KEY", new ArrayList<>(staleAdDirs));
        }
        return h.a(bundle).a(str == null);
    }
}
