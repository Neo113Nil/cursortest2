package A1;

import java.io.IOException;

/* JADX INFO: renamed from: A1.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0045t0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f565b;

    public C0045t0(String str, Exception exc, boolean z4, int i7) {
        super(str, exc);
        this.f564a = z4;
        this.f565b = i7;
    }

    public static C0045t0 a(RuntimeException runtimeException, String str) {
        return new C0045t0(str, runtimeException, true, 1);
    }

    public static C0045t0 b(String str, Exception exc) {
        return new C0045t0(str, exc, true, 4);
    }

    public static C0045t0 c(String str) {
        return new C0045t0(str, null, false, 1);
    }
}
