package XY;

import Fb0.e;
import We.E;
import XY.c;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f34211a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final E f34212b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f34213c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c.a f34214d;

    public d(Context context, E okHttpClient, e appDomain) {
        c.a logConfig = new c.a(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(appDomain, "appDomain");
        Intrinsics.checkNotNullParameter(logConfig, "logConfig");
        this.f34211a = context;
        this.f34212b = okHttpClient;
        this.f34213c = appDomain;
        this.f34214d = logConfig;
    }

    @NotNull
    public final e a() {
        return this.f34213c;
    }

    @NotNull
    public final Context b() {
        return this.f34211a;
    }

    @NotNull
    public final c c() {
        return this.f34214d;
    }

    @NotNull
    public final E d() {
        return this.f34212b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f34211a, dVar.f34211a) && Intrinsics.d(this.f34212b, dVar.f34212b) && this.f34213c == dVar.f34213c && Intrinsics.d(this.f34214d, dVar.f34214d);
    }

    public final int hashCode() {
        return this.f34214d.hashCode() + ((this.f34213c.hashCode() + ((this.f34212b.hashCode() + (this.f34211a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "OzonCdnChooserSdkConfig(context=" + this.f34211a + ", okHttpClient=" + this.f34212b + ", appDomain=" + this.f34213c + ", logConfig=" + this.f34214d + ")";
    }
}
