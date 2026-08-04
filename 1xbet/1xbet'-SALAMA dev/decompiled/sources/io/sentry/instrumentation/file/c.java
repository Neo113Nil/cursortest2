package io.sentry.instrumentation.file;

import java.io.Closeable;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements FileIOSpanManager.FileIOCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Closeable f14488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f14489c;

    public /* synthetic */ c(Closeable closeable, Serializable serializable, int i7) {
        this.f14487a = i7;
        this.f14488b = closeable;
        this.f14489c = serializable;
    }

    @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
    public final Object call() {
        switch (this.f14487a) {
            case 0:
                return ((SentryFileInputStream) this.f14488b).lambda$read$1((byte[]) this.f14489c);
            case 1:
                return ((SentryFileInputStream) this.f14488b).lambda$read$0((AtomicInteger) this.f14489c);
            default:
                return ((SentryFileOutputStream) this.f14488b).lambda$write$1((byte[]) this.f14489c);
        }
    }
}
