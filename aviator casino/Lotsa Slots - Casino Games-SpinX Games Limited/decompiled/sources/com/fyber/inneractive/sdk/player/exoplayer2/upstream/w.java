package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f4100a = new java.util.HashMap();
    public java.util.Map b;

    public final synchronized java.util.Map a() {
        if (this.b == null) {
            this.b = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.f4100a));
        }
        return this.b;
    }
}
