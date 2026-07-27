package com.unity3d.ads.core.domain.coherence;

import android.content.Context;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.coherence.CoherenceInitConfig;
import com.unity3d.coherence.CoherenceLibrary;
import com.unity3d.coherence.CommonAttributesConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidCoherenceLibraryManager.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/coherence/AndroidCoherenceLibraryManager;", "Lcom/unity3d/ads/core/domain/coherence/CoherenceLibraryManager;", "context", "Landroid/content/Context;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/log/Logger;)V", "appContext", "kotlin.jvm.PlatformType", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialize", "", "getCommonAttributes", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidCoherenceLibraryManager implements CoherenceLibraryManager {
    private final Context appContext;
    private final AtomicBoolean initialized;
    private final Logger logger;

    public AndroidCoherenceLibraryManager(Context context, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.appContext = context.getApplicationContext();
        this.initialized = new AtomicBoolean(false);
    }

    private final void initialize() {
        if (this.initialized.get()) {
            return;
        }
        synchronized (this) {
            if (this.initialized.get()) {
                return;
            }
            CoherenceInitConfig build = new CoherenceInitConfig.Builder(this.appContext).setSource(2).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            CoherenceLibrary.init(build);
            this.initialized.set(true);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager
    public byte[] getCommonAttributes() {
        try {
            initialize();
            CommonAttributesConfig build = new CommonAttributesConfig.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return CoherenceLibrary.getInstance().getAttributesProvider().getCommonAttributes(build);
        } catch (Throwable th) {
            this.logger.error("CoherenceLibrary fetching payload failed", th);
            return null;
        }
    }
}
