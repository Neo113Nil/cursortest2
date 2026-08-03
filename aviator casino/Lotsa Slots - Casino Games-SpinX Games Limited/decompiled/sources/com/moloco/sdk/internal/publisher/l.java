package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class l<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> {

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f7103a;
    public com.moloco.sdk.internal.ortb.model.B b;
    public com.moloco.sdk.internal.publisher.C3427k c;
    public kotlinx.coroutines.Job d;
    public boolean e;
    public java.lang.String f;
    public java.lang.String g;
    public boolean h;

    public l() {
        this(null, null, null, null, false, null, null, false, 255, null);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b) {
        this.f7103a = b;
    }

    public final com.moloco.sdk.internal.publisher.C3427k b() {
        return this.c;
    }

    public final java.lang.String c() {
        return this.g;
    }

    public final java.lang.String d() {
        return this.f;
    }

    public final com.moloco.sdk.internal.ortb.model.B e() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f() {
        return this.f7103a;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.e;
    }

    public l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b, com.moloco.sdk.internal.ortb.model.B b2, com.moloco.sdk.internal.publisher.C3427k c3427k, kotlinx.coroutines.Job job, boolean z, java.lang.String str, java.lang.String str2, boolean z2) {
        this.f7103a = b;
        this.b = b2;
        this.c = c3427k;
        this.d = job;
        this.e = z;
        this.f = str;
        this.g = str2;
        this.h = z2;
    }

    public final void a(com.moloco.sdk.internal.ortb.model.B b) {
        this.b = b;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final void a(com.moloco.sdk.internal.publisher.C3427k c3427k) {
        this.c = c3427k;
    }

    public final void b(java.lang.String str) {
        this.f = str;
    }

    public final kotlinx.coroutines.Job a() {
        return this.d;
    }

    public final void a(kotlinx.coroutines.Job job) {
        this.d = job;
    }

    public final void a(java.lang.String str) {
        this.g = str;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public /* synthetic */ l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B b, com.moloco.sdk.internal.ortb.model.B b2, com.moloco.sdk.internal.publisher.C3427k c3427k, kotlinx.coroutines.Job job, boolean z, java.lang.String str, java.lang.String str2, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : b, (i & 2) != 0 ? null : b2, (i & 4) != 0 ? null : c3427k, (i & 8) != 0 ? null : job, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) == 0 ? str2 : null, (i & 128) == 0 ? z2 : false);
    }
}
