package io.appmetrica.analytics.coreutils.internal.io;

@io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
@android.annotation.TargetApi(24)
/* loaded from: classes.dex */
public final class AppDataDirProviderForN {
    public static final io.appmetrica.analytics.coreutils.internal.io.AppDataDirProviderForN INSTANCE = new io.appmetrica.analytics.coreutils.internal.io.AppDataDirProviderForN();

    private AppDataDirProviderForN() {
    }

    public final java.io.File dataDir(android.content.Context context) {
        return context.getDataDir();
    }
}
