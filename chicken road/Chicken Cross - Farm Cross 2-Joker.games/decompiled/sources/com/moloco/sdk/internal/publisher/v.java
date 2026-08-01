package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Job;

/* loaded from: classes7.dex */
public final class v<T extends AdShowListener> {
    public static final int f = 8;

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> f10689a;
    public com.moloco.sdk.internal.ortb.model.D b;
    public C4796k c;
    public Job d;
    public A e;

    public v() {
        this(null, null, null, null, null, 31, null);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> a() {
        return this.f10689a;
    }

    public final Job b() {
        return this.d;
    }

    public final C4796k c() {
        return this.c;
    }

    public final A d() {
        return this.e;
    }

    public final com.moloco.sdk.internal.ortb.model.D e() {
        return this.b;
    }

    public v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> mVar, com.moloco.sdk.internal.ortb.model.D d, C4796k c4796k, Job job, A a2) {
        this.f10689a = mVar;
        this.b = d;
        this.c = c4796k;
        this.d = job;
        this.e = a2;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> mVar) {
        this.f10689a = mVar;
    }

    public final void a(com.moloco.sdk.internal.ortb.model.D d) {
        this.b = d;
    }

    public final void a(C4796k c4796k) {
        this.c = c4796k;
    }

    public final void a(Job job) {
        this.d = job;
    }

    public final void a(A a2) {
        this.e = a2;
    }

    public /* synthetic */ v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar, com.moloco.sdk.internal.ortb.model.D d, C4796k c4796k, Job job, A a2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mVar, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : c4796k, (i & 8) != 0 ? null : job, (i & 16) != 0 ? null : a2);
    }
}
