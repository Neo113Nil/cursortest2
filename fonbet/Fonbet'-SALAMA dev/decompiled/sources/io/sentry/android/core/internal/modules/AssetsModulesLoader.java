package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.ContextUtils;
import io.sentry.internal.modules.ModulesLoader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class AssetsModulesLoader extends ModulesLoader {
    private final Context context;

    public AssetsModulesLoader(Context context, ILogger iLogger) {
        super(iLogger);
        this.context = ContextUtils.getApplicationContext(context);
        new Thread(new a(this, 0)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        getOrLoadModules();
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public Map<String, String> loadModules() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream open = this.context.getAssets().open(ModulesLoader.EXTERNAL_MODULES_FILENAME);
            try {
                Map<String, String> parseStream = parseStream(open);
                if (open != null) {
                    open.close();
                }
                return parseStream;
            } catch (Throwable th) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            this.logger.log(SentryLevel.INFO, "%s file was not found.", ModulesLoader.EXTERNAL_MODULES_FILENAME);
            return treeMap;
        } catch (IOException e7) {
            this.logger.log(SentryLevel.ERROR, "Error extracting modules.", e7);
            return treeMap;
        }
    }
}
