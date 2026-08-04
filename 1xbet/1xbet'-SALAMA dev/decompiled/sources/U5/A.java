package U5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f6403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f6404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f6405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ A[] f6406d;

    /* JADX INFO: Fake field, exist only in values array */
    A EF0;

    static {
        A a2 = new A("CT_UNKNOWN", 0);
        A a4 = new A("CT_INFO", 1);
        f6403a = a4;
        A a7 = new A("CT_WARNING", 2);
        f6404b = a7;
        A a8 = new A("CT_ERROR", 3);
        f6405c = a8;
        f6406d = new A[]{a2, a4, a7, a8};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f6406d.clone();
    }
}
