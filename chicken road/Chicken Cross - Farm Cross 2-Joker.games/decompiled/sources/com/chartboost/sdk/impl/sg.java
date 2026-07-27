package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.chartboost.sdk.impl.c0;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sg {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5009a;
    public final String b;
    public volatile long c;
    public final int d;
    public final AtomicInteger e;
    public final AtomicInteger f;
    public final AtomicInteger g;
    public mg h;

    public sg(SharedPreferences mPrefs) {
        Intrinsics.checkNotNullParameter(mPrefs, "mPrefs");
        this.f5009a = mPrefs;
        this.e = new AtomicInteger(0);
        this.f = new AtomicInteger(0);
        this.g = new AtomicInteger(0);
        this.h = new mg() { // from class: com.chartboost.sdk.impl.sg$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.mg
            public final boolean a() {
                return sg.h();
            }
        };
        this.b = a();
        this.c = SystemClock.uptimeMillis();
        Integer valueOf = Integer.valueOf(e() + 1);
        valueOf = valueOf.intValue() < 0 ? null : valueOf;
        this.d = valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE;
        g();
    }

    public static final boolean h() {
        return false;
    }

    public final void a(mg mgVar) {
        Intrinsics.checkNotNullParameter(mgVar, "<set-?>");
        this.h = mgVar;
    }

    public final int b() {
        return this.d;
    }

    public final long c() {
        if (this.h.a()) {
            return SystemClock.uptimeMillis() - this.c;
        }
        return 0L;
    }

    public final String d() {
        return this.b;
    }

    public final int e() {
        return this.f5009a.getInt("session_key", 0);
    }

    public final void f() {
        this.c = SystemClock.uptimeMillis();
    }

    public final void g() {
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor edit = this.f5009a.edit();
        if (edit == null || (putInt = edit.putInt("session_key", this.d)) == null) {
            return;
        }
        putInt.apply();
    }

    public final tg i() {
        return new tg(this.b, c(), this.d, b(c0.a.g), b(c0.c.g), b(c0.b.g));
    }

    public final void a(c0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, c0.b.g)) {
            this.e.incrementAndGet();
        } else if (Intrinsics.areEqual(type, c0.c.g)) {
            this.f.incrementAndGet();
        } else {
            if (!Intrinsics.areEqual(type, c0.a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            this.g.incrementAndGet();
        }
    }

    public final int b(c0 c0Var) {
        if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            return this.e.get();
        }
        if (Intrinsics.areEqual(c0Var, c0.c.g)) {
            return this.f.get();
        }
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            return this.g.get();
        }
        return 0;
    }

    public final String a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return q2.a(uuid);
    }
}
