package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882ok {

    /* renamed from: a, reason: collision with root package name */
    public final C0856nk f8949a;

    /* renamed from: b, reason: collision with root package name */
    public volatile G9 f8950b;

    /* renamed from: c, reason: collision with root package name */
    public volatile G9 f8951c;

    /* renamed from: d, reason: collision with root package name */
    public volatile G9 f8952d;

    /* renamed from: e, reason: collision with root package name */
    public volatile G9 f8953e;

    /* renamed from: f, reason: collision with root package name */
    public volatile G9 f8954f;

    /* renamed from: g, reason: collision with root package name */
    public volatile G9 f8955g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ExecutorC0830mk f8956h;

    public C0882ok() {
        this(new C0856nk());
    }

    public final IHandlerExecutor a() {
        if (this.f8955g == null) {
            synchronized (this) {
                try {
                    if (this.f8955g == null) {
                        this.f8949a.getClass();
                        HandlerThreadC0743jb a6 = G9.a("IAA-SDE");
                        this.f8955g = new G9(a6, a6.getLooper(), new Handler(a6.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8955g;
    }

    public final IHandlerExecutor b() {
        if (this.f8950b == null) {
            synchronized (this) {
                try {
                    if (this.f8950b == null) {
                        this.f8949a.getClass();
                        HandlerThreadC0743jb a6 = G9.a("IAA-SC");
                        this.f8950b = new G9(a6, a6.getLooper(), new Handler(a6.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8950b;
    }

    public final IHandlerExecutor c() {
        if (this.f8952d == null) {
            synchronized (this) {
                try {
                    if (this.f8952d == null) {
                        this.f8949a.getClass();
                        HandlerThreadC0743jb a6 = G9.a("IAA-SMH-1");
                        this.f8952d = new G9(a6, a6.getLooper(), new Handler(a6.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8952d;
    }

    public final IHandlerExecutor d() {
        if (this.f8953e == null) {
            synchronized (this) {
                try {
                    if (this.f8953e == null) {
                        this.f8949a.getClass();
                        HandlerThreadC0743jb a6 = G9.a("IAA-SNTPE");
                        this.f8953e = new G9(a6, a6.getLooper(), new Handler(a6.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8953e;
    }

    public final IHandlerExecutor e() {
        if (this.f8951c == null) {
            synchronized (this) {
                try {
                    if (this.f8951c == null) {
                        this.f8949a.getClass();
                        HandlerThreadC0743jb a6 = G9.a("IAA-STE");
                        this.f8951c = new G9(a6, a6.getLooper(), new Handler(a6.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8951c;
    }

    public C0882ok(C0856nk c0856nk) {
        new HashMap();
        this.f8949a = c0856nk;
    }
}
