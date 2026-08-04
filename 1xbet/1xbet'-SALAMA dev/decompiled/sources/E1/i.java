package E1;

import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements D1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1905a;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z4;
        if ("Amazon".equals(t.f17161c)) {
            String str = t.f17162d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        f1905a = z4;
    }
}
