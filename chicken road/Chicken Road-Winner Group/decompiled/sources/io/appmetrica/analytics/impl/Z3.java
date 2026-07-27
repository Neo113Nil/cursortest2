package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public final Y3 f6890a;

    /* renamed from: b, reason: collision with root package name */
    public volatile G9 f6891b;

    /* renamed from: c, reason: collision with root package name */
    public volatile G9 f6892c;

    public Z3() {
        this(new Y3());
    }

    public final IHandlerExecutor a() {
        if (this.f6891b == null) {
            synchronized (this) {
                try {
                    if (this.f6891b == null) {
                        this.f6890a.getClass();
                        HandlerThreadC0594jb a3 = G9.a("IAA-CDE");
                        this.f6891b = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6891b;
    }

    public final ICommonExecutor b() {
        if (this.f6892c == null) {
            synchronized (this) {
                try {
                    if (this.f6892c == null) {
                        this.f6890a.getClass();
                        HandlerThreadC0594jb a3 = G9.a("IAA-CRS");
                        this.f6892c = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6892c;
    }

    public Z3(Y3 y3) {
        this.f6890a = y3;
    }
}
