package androidx.media3.datasource.cronet;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import org.chromium.net.CronetEngine;

@UnstableApi
@Deprecated
/* loaded from: classes3.dex */
public final class CronetEngineWrapper {

    @Nullable
    private final CronetEngine cronetEngine;

    public CronetEngineWrapper(Context context) {
        this(context, null, false);
    }

    @Nullable
    public CronetEngine getCronetEngine() {
        return this.cronetEngine;
    }

    public CronetEngineWrapper(Context context, @Nullable String str, boolean z) {
        this.cronetEngine = CronetUtil.buildCronetEngine(context, str, z);
    }

    public CronetEngineWrapper(CronetEngine cronetEngine) {
        this.cronetEngine = cronetEngine;
    }
}
