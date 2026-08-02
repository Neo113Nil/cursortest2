package Hn;

import io.sentry.I2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.l;
import java.io.File;
import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements g, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f11221a;

    public /* synthetic */ e(Object obj) {
        this.f11221a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f11221a).invoke(obj);
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        int i11 = io.sentry.android.core.cache.c.f67079m;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f11221a;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        boolean z11 = false;
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean exists = file.exists();
                if (exists && !file.delete()) {
                    sentryAndroidOptions.getLogger().c(I2.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z11 = exists;
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().a(I2.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            }
        }
        return Boolean.valueOf(z11);
    }
}
