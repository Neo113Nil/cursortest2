package Jd0;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.glide.loaders.PerformanceListener;

/* loaded from: classes3.dex */
public final class g implements PerformanceListener {
    @Override // ru.ozon.app.android.pikazon.glide.loaders.PerformanceListener
    /* renamed from: onLoadStarted-SxA4cEA */
    public final void mo5onLoadStartedSxA4cEA(String url, String uuid, long j11) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        a.f14618a.d("Image loading was started with url = " + url);
    }

    @Override // ru.ozon.app.android.pikazon.glide.loaders.PerformanceListener
    public final void onResponse(String url, String uuid, int i11, int i12) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        a.f14618a.d("Image loading was finished with url = " + url);
    }
}
