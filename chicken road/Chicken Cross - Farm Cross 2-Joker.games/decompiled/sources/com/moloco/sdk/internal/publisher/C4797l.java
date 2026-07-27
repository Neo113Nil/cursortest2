package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Job;

/* renamed from: com.moloco.sdk.internal.publisher.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4797l<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> {

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> f10617a;
    public com.moloco.sdk.internal.ortb.model.D b;
    public C4796k c;
    public Job d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;

    public C4797l() {
        this(null, null, null, null, false, null, null, false, 255, null);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> c) {
        this.f10617a = c;
    }

    public final C4796k b() {
        return this.c;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.f;
    }

    public final com.moloco.sdk.internal.ortb.model.D e() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> f() {
        return this.f10617a;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.e;
    }

    public C4797l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> c, com.moloco.sdk.internal.ortb.model.D d, C4796k c4796k, Job job, boolean z, String str, String str2, boolean z2) {
        this.f10617a = c;
        this.b = d;
        this.c = c4796k;
        this.d = job;
        this.e = z;
        this.f = str;
        this.g = str2;
        this.h = z2;
    }

    public final void a(com.moloco.sdk.internal.ortb.model.D d) {
        this.b = d;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final void a(C4796k c4796k) {
        this.c = c4796k;
    }

    public final void b(String str) {
        this.f = str;
    }

    public final Job a() {
        return this.d;
    }

    public final void a(Job job) {
        this.d = job;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public /* synthetic */ C4797l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C c, com.moloco.sdk.internal.ortb.model.D d, C4796k c4796k, Job job, boolean z, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : c4796k, (i & 8) != 0 ? null : job, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) == 0 ? str2 : null, (i & 128) == 0 ? z2 : false);
    }
}
