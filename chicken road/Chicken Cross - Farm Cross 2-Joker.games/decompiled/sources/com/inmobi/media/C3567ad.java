package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3567ad implements Zc {

    /* renamed from: a, reason: collision with root package name */
    public final Zc f7008a;
    public final AtomicBoolean b;

    public C3567ad(Zc mediaChangeReceiver) {
        Intrinsics.checkNotNullParameter(mediaChangeReceiver, "mediaChangeReceiver");
        this.f7008a = mediaChangeReceiver;
        this.b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Zc
    public final void a() {
        if (this.b.getAndSet(false)) {
            this.f7008a.a();
        }
    }

    @Override // com.inmobi.media.Zc
    public final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.f7008a.b();
    }
}
