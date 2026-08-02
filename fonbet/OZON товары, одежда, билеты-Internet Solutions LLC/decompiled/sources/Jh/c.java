package Jh;

import Bl0.c0;
import Ih.b;
import di0.C6203c;
import k10.EnumC7467b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    private static long f14768h = -1;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b.a.InterfaceC0251b<Boolean> f14769a;

    /* renamed from: b, reason: collision with root package name */
    private long f14770b;

    /* renamed from: c, reason: collision with root package name */
    private long f14771c;

    /* renamed from: d, reason: collision with root package name */
    private long f14772d;

    /* renamed from: e, reason: collision with root package name */
    private long f14773e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14774f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14775g;

    public c(@NotNull b.a.InterfaceC0251b<Boolean> isNewMetricEnabled) {
        Intrinsics.checkNotNullParameter(isNewMetricEnabled, "isNewMetricEnabled");
        this.f14769a = isNewMetricEnabled;
        this.f14770b = -1L;
        this.f14771c = -1L;
        this.f14772d = -1L;
        this.f14773e = -1L;
    }

    public final synchronized void a(long j11) {
        if (this.f14775g) {
            if (this.f14774f) {
                return;
            }
            this.f14774f = true;
            this.f14773e = j11 - this.f14772d;
        }
    }

    public final synchronized void b(long j11) {
        if (this.f14775g) {
            this.f14772d = j11;
        }
    }

    public final synchronized void c(long j11) {
        boolean booleanValue = this.f14769a.getValue().booleanValue();
        this.f14775g = booleanValue;
        if (booleanValue) {
            this.f14770b = j11;
        }
    }

    public final synchronized void d(long j11) {
        if (this.f14775g) {
            this.f14771c = j11 - this.f14770b;
        }
    }

    public final synchronized void e() {
        if (this.f14775g) {
            long j11 = this.f14773e;
            if (j11 > -1 && this.f14771c > -1) {
                f14768h = this.f14771c + j11;
                this.f14770b = -1L;
                this.f14771c = -1L;
                this.f14772d = -1L;
                this.f14773e = -1L;
            }
        }
    }

    public final synchronized void f(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (this.f14775g) {
            long j11 = this.f14773e;
            if (!(j11 > -1 && this.f14771c > -1)) {
                long j12 = f14768h;
                if (j12 == -1) {
                    j12 = 0;
                }
                C6203c c6203c = C6203c.f61631a;
                c0.c(uuid, EnumC7467b.SCREEN_CREATE_TIME, j12, 8);
                f14768h = -1L;
                return;
            }
            C6203c c6203c2 = C6203c.f61631a;
            c0.c(uuid, EnumC7467b.SCREEN_CREATE_TIME, j11 + this.f14771c, 8);
            this.f14770b = -1L;
            this.f14771c = -1L;
            this.f14772d = -1L;
            this.f14773e = -1L;
            f14768h = -1L;
        }
    }
}
