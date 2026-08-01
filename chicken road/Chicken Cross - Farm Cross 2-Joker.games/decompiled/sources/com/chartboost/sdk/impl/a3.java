package com.chartboost.sdk.impl;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a3 {
    public static final a j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final c f4671a;
    public String b;
    public final ue c;
    public final File d;
    public final AtomicReference e;
    public long f;
    public long g;
    public long h;
    public b i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b b = new b("UI", 0);
        public static final b c = new b("ASYNC", 1);
        public static final /* synthetic */ b[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            b[] a2 = a();
            d = a2;
            e = EnumEntriesKt.enumEntries(a2);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{b, c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c b = new c("GET", 0);
        public static final c c = new c("POST", 1);
        public static final /* synthetic */ c[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            c[] a2 = a();
            d = a2;
            e = EnumEntriesKt.enumEntries(a2);
        }

        public c(String str, int i) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{b, c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d b = new d("CANCELED", 0);
        public static final d c = new d("QUEUED", 1);
        public static final d d = new d("PROCESSING", 2);
        public static final /* synthetic */ d[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            d[] a2 = a();
            e = a2;
            f = EnumEntriesKt.enumEntries(a2);
        }

        public d(String str, int i) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{b, c, d};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) e.clone();
        }
    }

    public a3(c method, String uri, ue priority, File file) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f4671a = method;
        this.b = uri;
        this.c = priority;
        this.d = file;
        this.e = new AtomicReference(d.c);
        this.i = b.b;
    }

    public void a(CBError cBError, d3 d3Var) {
    }

    public void a(Object obj, d3 d3Var) {
    }

    public void a(String uri, long j2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    public final boolean b() {
        return MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.e, d.c, d.b);
    }

    public final c c() {
        return this.f4671a;
    }

    public final ue d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public b3 a() {
        return new b3(null, null, null);
    }

    public c3 a(d3 d3Var) {
        return c3.c.a((Object) null);
    }
}
