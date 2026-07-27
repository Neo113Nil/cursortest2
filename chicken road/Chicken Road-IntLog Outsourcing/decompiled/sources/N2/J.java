package N2;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final l1.j f2067b;

    /* renamed from: c, reason: collision with root package name */
    public static final J f2068c;

    /* renamed from: d, reason: collision with root package name */
    public static final J f2069d;

    /* renamed from: e, reason: collision with root package name */
    public static final J f2070e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ J[] f2071f;

    /* renamed from: a, reason: collision with root package name */
    public final int f2072a;

    static {
        J j2 = new J("PLATFORM_ENCODED", 0, 0);
        f2068c = j2;
        J j6 = new J("JSON_ENCODED", 1, 1);
        f2069d = j6;
        J j7 = new J("UNEXPECTED_STRING", 2, 2);
        f2070e = j7;
        J[] jArr = {j2, j6, j7};
        f2071f = jArr;
        AbstractC1477a.n(jArr);
        f2067b = new l1.j(11);
    }

    public J(String str, int i2, int i3) {
        this.f2072a = i3;
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f2071f.clone();
    }
}
