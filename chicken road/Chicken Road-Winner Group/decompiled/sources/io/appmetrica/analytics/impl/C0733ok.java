package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733ok {

    /* renamed from: a, reason: collision with root package name */
    public final C0707nk f8016a;

    /* renamed from: b, reason: collision with root package name */
    public volatile G9 f8017b;

    /* renamed from: c, reason: collision with root package name */
    public volatile G9 f8018c;

    /* renamed from: d, reason: collision with root package name */
    public volatile G9 f8019d;

    /* renamed from: e, reason: collision with root package name */
    public volatile G9 f8020e;
    public volatile G9 f;

    /* renamed from: g, reason: collision with root package name */
    public volatile G9 f8021g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ExecutorC0681mk f8022h;

    public C0733ok() {
        this(new C0707nk());
    }

    public final IHandlerExecutor a() {
        if (this.f8021g == null) {
            synchronized (this) {
                try {
                    if (this.f8021g == null) {
                        this.f8016a.getClass();
                        HandlerThreadC0594jb a3 = G9.a("IAA-SDE");
                        this.f8021g = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8021g;
    }

    public final IHandlerExecutor b() {
        if (this.f8017b == null) {
            synchronized (this) {
                try {
                    if (this.f8017b == null) {
                        this.f8016a.getClass();
                        HandlerThreadC0594jb a3 = G9.a("IAA-SC");
                        this.f8017b = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8017b;
    }

    public final IHandlerExecutor c() {
        if (this.f8019d == null) {
            synchronized (this) {
                try {
                    if (this.f8019d == null) {
                        this.f8016a.getClass();
                        HandlerThreadC0594jb a3 = G9.a("IAA-SMH-1");
                        this.f8019d = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8019d;
    }

    public final IHandlerExecutor d() {
        if (this.f8020e == null) {
            synchronized (this) {
                try {
                    if (this.f8020e == null) {
                        this.f8016a.getClass();
                        HandlerThreadC0594jb a3 = G9.a("IAA-SNTPE");
                        this.f8020e = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8020e;
    }

    public final IHandlerExecutor e() {
        if (this.f8018c == null) {
            synchronized (this) {
                try {
                    if (this.f8018c == null) {
                        this.f8016a.getClass();
                        HandlerThreadC0594jb a3 = G9.a("IAA-STE");
                        this.f8018c = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8018c;
    }

    public C0733ok(C0707nk c0707nk) {
        new HashMap();
        this.f8016a = c0707nk;
    }
}
