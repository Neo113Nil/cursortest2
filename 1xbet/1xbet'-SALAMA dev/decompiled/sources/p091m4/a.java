package p091m4;

import L4.b;
import android.support.v4.media.session.t;
import io.sentry.TransactionOptions;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f15266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f15267b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledFuture f15273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15274i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Random f15272g = new Random();
    public boolean j = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15268c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15269d = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f15271f = 1.3d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f15270e = 0.7d;

    public a(b bVar, t tVar) {
        this.f15266a = bVar;
        this.f15267b = tVar;
    }
}
