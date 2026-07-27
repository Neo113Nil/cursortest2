package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class Je implements InterfaceC3675e9 {

    /* renamed from: a, reason: collision with root package name */
    public final C3608bp f6650a;
    public final AtomicBoolean b;
    public boolean c;
    public Long d;

    public Je(C3608bp videoMRC50Model) {
        Intrinsics.checkNotNullParameter(videoMRC50Model, "videoMRC50Model");
        this.f6650a = videoMRC50Model;
        this.b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC3675e9
    public final void a() {
    }

    @Override // com.inmobi.media.InterfaceC3675e9
    public final Flow b() {
        return FlowKt.channelFlow(new Ie(this, null));
    }
}
