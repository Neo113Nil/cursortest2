package p000;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 {

    /* JADX INFO: renamed from: e */
    public static final x80 f6969e = new x80(9);

    /* JADX INFO: renamed from: a */
    public final Object f6970a;

    /* JADX INFO: renamed from: b */
    public final qu0 f6971b;

    /* JADX INFO: renamed from: c */
    public final String f6972c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f6973d;

    public ru0(String str, Object obj, qu0 qu0Var) {
        if (TextUtils.isEmpty(str)) {
            C0270h1.m2190f("Must not be null or empty");
            throw null;
        }
        this.f6972c = str;
        this.f6970a = obj;
        this.f6971b = qu0Var;
    }

    /* JADX INFO: renamed from: a */
    public static ru0 m4406a(Object obj, String str) {
        return new ru0(str, obj, f6969e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ru0) {
            return this.f6972c.equals(((ru0) obj).f6972c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6972c.hashCode();
    }

    public final String toString() {
        return AbstractC0024an.m285h(new StringBuilder("Option{key='"), this.f6972c, "'}");
    }
}
