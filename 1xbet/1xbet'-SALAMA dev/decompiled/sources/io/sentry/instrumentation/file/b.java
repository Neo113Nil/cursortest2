package io.sentry.instrumentation.file;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements FileIOSpanManager.FileIOCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f14483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Closeable f14486e;

    public /* synthetic */ b(Closeable closeable, byte[] bArr, int i7, int i8, int i9) {
        this.f14482a = i9;
        this.f14486e = closeable;
        this.f14483b = bArr;
        this.f14484c = i7;
        this.f14485d = i8;
    }

    @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
    public final Object call() {
        switch (this.f14482a) {
            case 0:
                return ((SentryFileInputStream) this.f14486e).lambda$read$2(this.f14483b, this.f14484c, this.f14485d);
            default:
                return ((SentryFileOutputStream) this.f14486e).lambda$write$2(this.f14483b, this.f14484c, this.f14485d);
        }
    }
}
