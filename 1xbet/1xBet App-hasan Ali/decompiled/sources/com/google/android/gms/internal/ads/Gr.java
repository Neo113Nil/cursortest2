package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class Gr {

    /* renamed from: d, reason: collision with root package name */
    public static final Mw f9278d = Mw.f10750l;

    /* renamed from: a, reason: collision with root package name */
    public final C0606Hd f9279a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f9280b;

    /* renamed from: c, reason: collision with root package name */
    public final Fr f9281c;

    public Gr(C0606Hd c0606Hd, ScheduledExecutorService scheduledExecutorService, Fr fr) {
        this.f9279a = c0606Hd;
        this.f9280b = scheduledExecutorService;
        this.f9281c = fr;
    }

    public final C1324n6 a(E3.a aVar, Object obj) {
        return new C1324n6(this, obj, null, aVar, Collections.singletonList(aVar), aVar);
    }
}
