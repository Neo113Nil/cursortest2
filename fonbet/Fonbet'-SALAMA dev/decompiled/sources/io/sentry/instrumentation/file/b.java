package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements FileIOSpanManager.FileIOCallable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f14477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Closeable f14480e;

    public /* synthetic */ b(Closeable closeable, byte[] bArr, int i7, int i8, int i9) {
        this.f14476a = i9;
        this.f14480e = closeable;
        this.f14477b = bArr;
        this.f14478c = i7;
        this.f14479d = i8;
    }

    @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
    public final Object call() {
        Integer lambda$read$2;
        Integer lambda$write$2;
        switch (this.f14476a) {
            case 0:
                lambda$read$2 = ((SentryFileInputStream) this.f14480e).lambda$read$2(this.f14477b, this.f14478c, this.f14479d);
                return lambda$read$2;
            default:
                lambda$write$2 = ((SentryFileOutputStream) this.f14480e).lambda$write$2(this.f14477b, this.f14478c, this.f14479d);
                return lambda$write$2;
        }
    }
}
