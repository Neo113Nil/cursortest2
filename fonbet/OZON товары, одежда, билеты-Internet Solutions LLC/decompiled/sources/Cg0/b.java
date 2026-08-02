package Cg0;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTime;

/* loaded from: classes3.dex */
public final class b {
    public static final long a(@NotNull PlaceholderInfo placeholderInfo) {
        Intrinsics.checkNotNullParameter(placeholderInfo, "<this>");
        return PlaceholderTime.m902constructorimpl(Math.max(placeholderInfo.getViewStartVisibleTime() > 0 ? SystemClock.elapsedRealtime() - placeholderInfo.getViewStartVisibleTime() : 0L, placeholderInfo.getMaxPlaceholderVisibilityDuration()));
    }
}
