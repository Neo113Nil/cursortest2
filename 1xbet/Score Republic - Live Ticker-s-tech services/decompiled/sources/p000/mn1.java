package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mn1 {

    /* JADX INFO: renamed from: b */
    public static final ol0 f5101b = new ol0(3);

    /* JADX INFO: renamed from: c */
    public static final mn1 f5102c;

    /* JADX INFO: renamed from: a */
    public final ln1 f5103a;

    static {
        List list = Collections.EMPTY_LIST;
        f5102c = new mn1(new ln1());
    }

    public mn1(ln1 ln1Var) {
        this.f5103a = ln1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mn1) && ((mn1) obj).f5103a.equals(this.f5103a);
    }

    public final int hashCode() {
        return ~this.f5103a.hashCode();
    }

    public final String toString() {
        return this.f5103a.toString();
    }
}
