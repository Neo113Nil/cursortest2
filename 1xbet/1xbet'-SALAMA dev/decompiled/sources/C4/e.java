package C4;

import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f1579b = new e(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1580a;

    public e(String str) {
        this.f1580a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        String str = ((e) obj).f1580a;
        String str2 = this.f1580a;
        if (str2 != null) {
            return str2.equals(str);
        }
        return str == null;
    }

    public final int hashCode() {
        String str = this.f1580a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return k.i(new StringBuilder("User(uid:"), this.f1580a, ")");
    }
}
