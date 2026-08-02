package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fa2 {

    /* JADX INFO: renamed from: a */
    public int f2362a;

    /* JADX INFO: renamed from: b */
    public final int f2363b;

    /* JADX INFO: renamed from: c */
    public fa2 f2364c;

    /* JADX INFO: renamed from: d */
    public final HashMap f2365d = new HashMap(0);

    public fa2(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        this.f2362a = i;
        this.f2363b = i2;
        this.f2364c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return j11.m2774i(new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4), "Node", iIdentityHashCode);
    }
}
