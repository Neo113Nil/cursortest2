package P5;

import a.AbstractC0603a;
import e6.C1054c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class N {

    /* renamed from: b, reason: collision with root package name */
    public static final C1054c f5632b;

    /* renamed from: c, reason: collision with root package name */
    public static final N f5633c;

    /* renamed from: d, reason: collision with root package name */
    public static final N f5634d;

    /* renamed from: e, reason: collision with root package name */
    public static final N f5635e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ N[] f5636f;

    /* renamed from: a, reason: collision with root package name */
    public final int f5637a;

    static {
        N n2 = new N("PLATFORM_ENCODED", 0, 0);
        f5633c = n2;
        N n7 = new N("JSON_ENCODED", 1, 1);
        f5634d = n7;
        N n8 = new N("UNEXPECTED_STRING", 2, 2);
        f5635e = n8;
        N[] nArr = {n2, n7, n8};
        f5636f = nArr;
        AbstractC0603a.T(nArr);
        f5632b = new C1054c(8);
    }

    public N(String str, int i7, int i8) {
        this.f5637a = i8;
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f5636f.clone();
    }
}
