package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wh extends d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ de f4609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yh f4611c;

    public wh(yh yhVar, de deVar, long j3) {
        this.f4611c = yhVar;
        this.f4609a = deVar;
        this.f4610b = j3;
    }

    @Override // com.startapp.sdk.internal.d3
    public final void a(za zaVar) {
        yh yhVar = this.f4611c;
        int abs = Math.abs(Arrays.hashCode(this.f4609a.f3589a));
        long j3 = this.f4610b;
        synchronized (yhVar) {
            yhVar.f4731b.put(Integer.valueOf(abs), yhVar.f4732c.scheduleAtFixedRate(zaVar, j3, j3, TimeUnit.MILLISECONDS));
        }
    }
}
