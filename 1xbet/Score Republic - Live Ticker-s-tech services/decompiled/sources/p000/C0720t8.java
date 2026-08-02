package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: renamed from: t8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0720t8 {

    /* JADX INFO: renamed from: c */
    public static final Logger f7340c = Logger.getLogger(C0720t8.class.getName());

    /* JADX INFO: renamed from: a */
    public final String f7341a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f7342b;

    public C0720t8(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.f7342b = atomicLong;
        a90.m122f("value must be positive", j > 0);
        this.f7341a = "keepalive time nanos";
        atomicLong.set(j);
    }
}
