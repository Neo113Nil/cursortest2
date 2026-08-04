package io.sentry;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14518a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ISerializer f14520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14522e;

    public /* synthetic */ r(Attachment attachment, long j, ISerializer iSerializer, ILogger iLogger) {
        this.f14521d = attachment;
        this.f14519b = j;
        this.f14520c = iSerializer;
        this.f14522e = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14518a) {
            case 0:
                return SentryEnvelopeItem.lambda$fromAttachment$12((Attachment) this.f14521d, this.f14519b, this.f14520c, (ILogger) this.f14522e);
            default:
                return SentryEnvelopeItem.lambda$fromProfilingTrace$18((File) this.f14521d, this.f14519b, (ProfilingTraceData) this.f14522e, this.f14520c);
        }
    }

    public /* synthetic */ r(File file, long j, ProfilingTraceData profilingTraceData, ISerializer iSerializer) {
        this.f14521d = file;
        this.f14519b = j;
        this.f14522e = profilingTraceData;
        this.f14520c = iSerializer;
    }
}
