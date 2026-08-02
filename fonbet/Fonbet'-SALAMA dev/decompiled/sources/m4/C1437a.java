package m4;

import android.support.v4.media.session.t;
import io.sentry.TransactionOptions;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1437a {

    /* renamed from: a, reason: collision with root package name */
    public final L4.b f15260a;

    /* renamed from: b, reason: collision with root package name */
    public final t f15261b;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f15267h;

    /* renamed from: i, reason: collision with root package name */
    public long f15268i;

    /* renamed from: g, reason: collision with root package name */
    public final Random f15266g = new Random();
    public boolean j = true;

    /* renamed from: c, reason: collision with root package name */
    public final long f15262c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public final long f15263d = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;

    /* renamed from: f, reason: collision with root package name */
    public final double f15265f = 1.3d;

    /* renamed from: e, reason: collision with root package name */
    public final double f15264e = 0.7d;

    public C1437a(L4.b bVar, t tVar) {
        this.f15260a = bVar;
        this.f15261b = tVar;
    }
}
