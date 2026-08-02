package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj0 {
    /* JADX INFO: renamed from: a */
    public abstract String mo1102a();

    /* JADX INFO: renamed from: b */
    public abstract mj0 mo1103b(AbstractC0477mo abstractC0477mo);

    /* JADX INFO: renamed from: c */
    public abstract dr0 mo1104c(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(mo1102a(), "policy");
        c0809vnM5362k.m5175f("priority", String.valueOf(5));
        c0809vnM5362k.m5174e("available", true);
        return c0809vnM5362k.toString();
    }
}
