package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Rd implements com.inmobi.media.C8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2390en f4938a;
    public final java.util.concurrent.atomic.AtomicBoolean b;
    public boolean c;
    public java.lang.Long d;

    public Rd(com.inmobi.media.C2390en videoMRC50Model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoMRC50Model, "videoMRC50Model");
        this.f4938a = videoMRC50Model;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.inmobi.media.C8
    public final void a() {
    }

    @Override // com.inmobi.media.C8
    public final kotlinx.coroutines.flow.Flow b() {
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.inmobi.media.Qd(this, null));
    }
}
