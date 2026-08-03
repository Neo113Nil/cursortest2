package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class u<T extends com.moloco.sdk.publisher.AdShowListener> {
    public static final int f = 8;

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> f7172a;
    public com.moloco.sdk.internal.ortb.model.B b;
    public com.moloco.sdk.internal.publisher.C3427k c;
    public kotlinx.coroutines.Job d;
    public com.moloco.sdk.internal.publisher.z e;

    public u() {
        this(null, null, null, null, null, 31, null);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a() {
        return this.f7172a;
    }

    public final kotlinx.coroutines.Job b() {
        return this.d;
    }

    public final com.moloco.sdk.internal.publisher.C3427k c() {
        return this.c;
    }

    public final com.moloco.sdk.internal.publisher.z d() {
        return this.e;
    }

    public final com.moloco.sdk.internal.ortb.model.B e() {
        return this.b;
    }

    public u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> lVar, com.moloco.sdk.internal.ortb.model.B b, com.moloco.sdk.internal.publisher.C3427k c3427k, kotlinx.coroutines.Job job, com.moloco.sdk.internal.publisher.z zVar) {
        this.f7172a = lVar;
        this.b = b;
        this.c = c3427k;
        this.d = job;
        this.e = zVar;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> lVar) {
        this.f7172a = lVar;
    }

    public final void a(com.moloco.sdk.internal.ortb.model.B b) {
        this.b = b;
    }

    public final void a(com.moloco.sdk.internal.publisher.C3427k c3427k) {
        this.c = c3427k;
    }

    public final void a(kotlinx.coroutines.Job job) {
        this.d = job;
    }

    public final void a(com.moloco.sdk.internal.publisher.z zVar) {
        this.e = zVar;
    }

    public /* synthetic */ u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar, com.moloco.sdk.internal.ortb.model.B b, com.moloco.sdk.internal.publisher.C3427k c3427k, kotlinx.coroutines.Job job, com.moloco.sdk.internal.publisher.z zVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lVar, (i & 2) != 0 ? null : b, (i & 4) != 0 ? null : c3427k, (i & 8) != 0 ? null : job, (i & 16) != 0 ? null : zVar);
    }
}
