package p000;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t92 {

    /* JADX INFO: renamed from: c */
    public static final t92 f7371c;

    /* JADX INFO: renamed from: a */
    public final UUID f7372a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f7373b;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f7371c = new t92(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public t92(UUID uuid, long j) {
        this.f7372a = uuid;
        this.f7373b = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    /* JADX INFO: renamed from: a */
    public final long m4772a() {
        AtomicLong atomicLong;
        long j;
        long j2;
        long j3;
        do {
            atomicLong = this.f7373b;
            j = atomicLong.get();
            j2 = ((j * 25214903917L) + 11) & 281474976710655L;
            j3 = ((25214903917L * j2) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j, j3));
        return (((long) ((int) (j2 >>> 16))) << 32) + ((long) ((int) (j3 >>> 16)));
    }

    /* JADX INFO: renamed from: b */
    public final UUID m4773b() {
        long jM4772a = m4772a() & (-61441);
        long jM4772a2 = m4772a() >>> 2;
        UUID uuid = this.f7372a;
        return new UUID(jM4772a ^ uuid.getMostSignificantBits(), jM4772a2 ^ uuid.getLeastSignificantBits());
    }
}
