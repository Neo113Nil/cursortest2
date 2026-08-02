package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class S {

    /* renamed from: k, reason: collision with root package name */
    public static final S f20960k;

    /* renamed from: l, reason: collision with root package name */
    public static final S f20961l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ S[] f20962m;

    static {
        S s2 = new S("Min", 0);
        f20960k = s2;
        S s5 = new S("Max", 1);
        f20961l = s5;
        f20962m = new S[]{s2, s5};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) f20962m.clone();
    }
}
