package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class me0 {

    /* JADX INFO: renamed from: d */
    public static final AtomicLong f5028d = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final String f5029a;

    /* JADX INFO: renamed from: b */
    public final String f5030b;

    /* JADX INFO: renamed from: c */
    public final long f5031c;

    public me0(long j, String str, String str2) {
        a90.m122f("empty type", !str.isEmpty());
        this.f5029a = str;
        this.f5030b = str2;
        this.f5031c = j;
    }

    /* JADX INFO: renamed from: a */
    public static me0 m3377a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new me0(f5028d.incrementAndGet(), simpleName, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5029a + "<" + this.f5031c + ">");
        String str = this.f5030b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
