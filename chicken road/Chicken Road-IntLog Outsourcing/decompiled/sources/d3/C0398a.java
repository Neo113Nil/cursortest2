package d3;

import J3.c;
import P3.e;
import V0.j;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import l3.C1255a;
import p3.C1383b;
import q3.C1389a;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398a implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final Duration f5481b;

    /* renamed from: a, reason: collision with root package name */
    public final j f5482a;

    static {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(10L);
        f5481b = ofSeconds;
    }

    public C0398a(j jVar) {
        this.f5482a = jVar;
    }

    @Override // P3.e
    public final c export(Collection collection) {
        CompletableFuture completedFuture;
        c cVar;
        long millis;
        C1389a c1389a;
        C1255a c1255a = ((C1383b) this.f5482a.f3212b).f11642a;
        j jVar = c1255a.f11031b;
        Logger logger = c1255a.f11033d;
        logger.finer("Intercepting batch.");
        try {
            try {
                ((B3.e) jVar.f3212b).d(collection);
                boolean b6 = c1255a.f11030a.b(jVar, 1);
                B3.e eVar = (B3.e) jVar.f3212b;
                if (b6) {
                    completedFuture = CompletableFuture.completedFuture(new C1389a(true, null));
                } else {
                    logger.fine("Could not store batch in disk.");
                    completedFuture = CompletableFuture.completedFuture(new C1389a(false, new Exception("Could not store batch in disk for an unknown reason.")));
                }
                eVar.e();
            } catch (IOException e3) {
                logger.log(Level.WARNING, "An unexpected error happened while attempting to write the data in disk.", (Throwable) e3);
                completedFuture = CompletableFuture.completedFuture(new C1389a(false, e3));
                ((B3.e) jVar.f3212b).e();
            }
            try {
                millis = f5481b.toMillis();
                c1389a = (C1389a) completedFuture.get(millis, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e6) {
                cVar = new c();
                cVar.a(e6);
            }
            if (c1389a.f11667a) {
                return c.f1361e;
            }
            Exception exc = c1389a.f11668b;
            if (exc == null) {
                return c.f1362f;
            }
            cVar = new c();
            cVar.a(exc);
            return cVar;
        } catch (Throwable th) {
            ((B3.e) jVar.f3212b).e();
            throw th;
        }
    }

    @Override // P3.e
    public final c flush() {
        return c.f1361e;
    }

    @Override // P3.e
    public final c shutdown() {
        return c.f1361e;
    }
}
