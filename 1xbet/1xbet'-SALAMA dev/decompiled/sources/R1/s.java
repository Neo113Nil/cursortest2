package R1;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6010c;

    public s(String str, boolean z4, boolean z7) {
        this.f6008a = str;
        this.f6009b = z4;
        this.f6010c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != s.class) {
            return false;
        }
        s sVar = (s) obj;
        return TextUtils.equals(this.f6008a, sVar.f6008a) && this.f6009b == sVar.f6009b && this.f6010c == sVar.f6010c;
    }

    public final int hashCode() {
        return ((p150v0.a.d(31, 31, this.f6008a) + (this.f6009b ? 1231 : 1237)) * 31) + (this.f6010c ? 1231 : 1237);
    }
}
