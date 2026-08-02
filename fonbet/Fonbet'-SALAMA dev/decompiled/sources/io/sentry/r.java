package io.sentry;

import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14512a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ISerializer f14514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14516e;

    public /* synthetic */ r(Attachment attachment, long j, ISerializer iSerializer, ILogger iLogger) {
        this.f14515d = attachment;
        this.f14513b = j;
        this.f14514c = iSerializer;
        this.f14516e = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte[] lambda$fromAttachment$12;
        byte[] lambda$fromProfilingTrace$18;
        switch (this.f14512a) {
            case 0:
                lambda$fromAttachment$12 = SentryEnvelopeItem.lambda$fromAttachment$12((Attachment) this.f14515d, this.f14513b, this.f14514c, (ILogger) this.f14516e);
                return lambda$fromAttachment$12;
            default:
                lambda$fromProfilingTrace$18 = SentryEnvelopeItem.lambda$fromProfilingTrace$18((File) this.f14515d, this.f14513b, (ProfilingTraceData) this.f14516e, this.f14514c);
                return lambda$fromProfilingTrace$18;
        }
    }

    public /* synthetic */ r(File file, long j, ProfilingTraceData profilingTraceData, ISerializer iSerializer) {
        this.f14515d = file;
        this.f14513b = j;
        this.f14516e = profilingTraceData;
        this.f14514c = iSerializer;
    }
}
