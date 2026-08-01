package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    public long f4682a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public int g;
    public final f3 h;
    public volatile long i;
    public volatile int j;

    public ak(long j, int i, int i2, long j2, long j3, long j4, int i3, f3 f3Var) {
        this.f4682a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = i3;
        this.h = f3Var;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final long b() {
        return this.f4682a;
    }

    public final void c(long j) {
        this.f4682a = j;
    }

    public final void d(long j) {
        this.d = j;
    }

    public final void e(long j) {
        this.e = j;
    }

    public final void f(long j) {
        this.f = j;
    }

    public final boolean g() {
        h();
        boolean z = this.j >= c();
        if (z) {
            jg.a("Video loading limit reached, will resume in timeToResetWindow: " + d());
        }
        mb.a("isMaxCountForTimeWindowReached() - " + z, (Throwable) null, 2, (Object) null);
        return z;
    }

    public final void h() {
        mb.a("resetWindowWhenTimeReached()", (Throwable) null, 2, (Object) null);
        if (e() > f()) {
            mb.a("resetWindowWhenTimeReached() - timer and count reset", (Throwable) null, 2, (Object) null);
            jg.a("Video loading limit reset");
            this.j = 0;
            this.i = 0L;
        }
    }

    public final long i() {
        return f() - (hh.a() - this.i);
    }

    public final void a() {
        mb.a("addDownloadToTimeWindow() - timeWindowStartTimeStamp " + this.i + ", timeWindowCachedVideosCount " + this.j, (Throwable) null, 2, (Object) null);
        if (this.i == 0) {
            this.i = hh.a();
        }
        this.j++;
    }

    public final void b(int i) {
        this.b = i;
    }

    public final void c(int i) {
        this.c = i;
    }

    public final long d() {
        return f() - e();
    }

    public final long e() {
        return hh.a() - this.i;
    }

    public final long f() {
        f3 f3Var = this.h;
        return ((f3Var == null || !f3Var.d()) ? this.d : this.e) * 1000;
    }

    public final boolean b(long j) {
        return j >= this.f4682a;
    }

    public final int c() {
        f3 f3Var = this.h;
        if (f3Var != null && f3Var.d()) {
            return this.c;
        }
        return this.b;
    }

    public final boolean a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return a(file.lastModified());
    }

    public final boolean a(long j) {
        return hh.a() - j > this.f * ((long) 1000);
    }
}
