package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;
import java.io.Closeable;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements FileIOSpanManager.FileIOCallable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Closeable f14482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f14483c;

    public /* synthetic */ c(Closeable closeable, Serializable serializable, int i7) {
        this.f14481a = i7;
        this.f14482b = closeable;
        this.f14483c = serializable;
    }

    @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
    public final Object call() {
        Integer lambda$read$1;
        Integer lambda$read$0;
        Integer lambda$write$1;
        switch (this.f14481a) {
            case 0:
                lambda$read$1 = ((SentryFileInputStream) this.f14482b).lambda$read$1((byte[]) this.f14483c);
                return lambda$read$1;
            case 1:
                lambda$read$0 = ((SentryFileInputStream) this.f14482b).lambda$read$0((AtomicInteger) this.f14483c);
                return lambda$read$0;
            default:
                lambda$write$1 = ((SentryFileOutputStream) this.f14482b).lambda$write$1((byte[]) this.f14483c);
                return lambda$write$1;
        }
    }
}
