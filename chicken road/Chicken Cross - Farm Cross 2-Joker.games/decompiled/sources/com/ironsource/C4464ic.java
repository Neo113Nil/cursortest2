package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4464ic {
    public static final a e = new a(null);
    private static volatile C4464ic f;

    /* renamed from: a, reason: collision with root package name */
    private Kd f8252a;
    private final AtomicBoolean b;
    private String c;
    private K3 d;

    /* renamed from: com.ironsource.ic$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final C4464ic a() {
            C4464ic c4464ic = C4464ic.f;
            if (c4464ic == null) {
                synchronized (this) {
                    c4464ic = C4464ic.f;
                    if (c4464ic == null) {
                        c4464ic = new C4464ic(null);
                        a aVar = C4464ic.e;
                        C4464ic.f = c4464ic;
                    }
                }
            }
            return c4464ic;
        }

        private a() {
        }

        public final InterfaceC4381e1 a(IronSource.a adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C4464ic c4464ic = C4464ic.f;
            K3 b = c4464ic != null ? c4464ic.b() : null;
            C4464ic c4464ic2 = C4464ic.f;
            Kd e = c4464ic2 != null ? c4464ic2.e() : null;
            if (b != null && e != null) {
                return new C4437h3(b, e, adFormat);
            }
            return new C4421g5();
        }
    }

    public /* synthetic */ C4464ic(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final C4464ic d() {
        return e.a();
    }

    public final K3 b() {
        return this.d;
    }

    public final AtomicBoolean c() {
        return this.b;
    }

    public final Kd e() {
        return this.f8252a;
    }

    public final String f() {
        return this.c;
    }

    public final void g() {
        this.b.set(true);
    }

    private C4464ic() {
        this.b = new AtomicBoolean(false);
        this.c = "";
    }

    public final void a(Kd kd) {
        this.f8252a = kd;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(K3 k3) {
        this.d = k3;
    }
}
