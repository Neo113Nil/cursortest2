package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.lifecycle.e f2379a;

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.lifecycle.e f2380b;

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.lifecycle.e f2381c;

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.lifecycle.e f2382d;

    /* renamed from: e, reason: collision with root package name */
    public static final androidx.lifecycle.e f2383e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ androidx.lifecycle.e[] f2384f;

    static {
        androidx.lifecycle.e eVar = new androidx.lifecycle.e("DESTROYED", 0);
        f2379a = eVar;
        androidx.lifecycle.e eVar2 = new androidx.lifecycle.e("INITIALIZED", 1);
        f2380b = eVar2;
        androidx.lifecycle.e eVar3 = new androidx.lifecycle.e("CREATED", 2);
        f2381c = eVar3;
        androidx.lifecycle.e eVar4 = new androidx.lifecycle.e("STARTED", 3);
        f2382d = eVar4;
        androidx.lifecycle.e eVar5 = new androidx.lifecycle.e("RESUMED", 4);
        f2383e = eVar5;
        f2384f = new androidx.lifecycle.e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static androidx.lifecycle.e valueOf(java.lang.String str) {
        return (androidx.lifecycle.e) java.lang.Enum.valueOf(androidx.lifecycle.e.class, str);
    }

    public static androidx.lifecycle.e[] values() {
        return (androidx.lifecycle.e[]) f2384f.clone();
    }
}
