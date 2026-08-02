package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g42 implements Comparable {

    /* JADX INFO: renamed from: j */
    public final long f2615j;

    /* JADX INFO: renamed from: k */
    public final String f2616k;

    /* JADX INFO: renamed from: l */
    public final int f2617l;

    /* JADX INFO: renamed from: m */
    public final long f2618m;

    /* JADX INFO: renamed from: n */
    public final Object f2619n;

    /* JADX INFO: renamed from: o */
    public final RuntimeException f2620o;

    public g42(long j, String str, int i, long j2, Object obj) {
        a90.m123g(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.f2615j = j;
        this.f2616k = str;
        this.f2617l = i;
        this.f2618m = j2;
        this.f2619n = obj;
        if (i != 5) {
            this.f2620o = null;
            return;
        }
        if (obj == null) {
            this.f2620o = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof ko1)) {
            this.f2620o = null;
        } else {
            this.f2620o = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m1985a() {
        int i = this.f2617l;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.f2618m;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.f2619n;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((ko1) obj).m3067p();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f2620o;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g42 g42Var = (g42) obj;
        long j = g42Var.f2615j;
        long j2 = this.f2615j;
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.f2616k;
        str.getClass();
        String str2 = g42Var.f2616k;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g42)) {
            return false;
        }
        g42 g42Var = (g42) obj;
        return this.f2615j == g42Var.f2615j && Objects.equals(this.f2616k, g42Var.f2616k);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f2615j), this.f2616k);
    }

    public final String toString() {
        String string = this.f2616k;
        if (string == null) {
            string = Long.toString(this.f2615j);
        }
        String strValueOf = String.valueOf(m1985a());
        return AbstractC0024an.m286i(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }
}
