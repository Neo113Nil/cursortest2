package j6;

import a.AbstractC0603a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14642a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f14643b;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f14642a = aVar;
        a[] aVarArr = {aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
        f14643b = aVarArr;
        AbstractC0603a.T(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14643b.clone();
    }
}
