package L3;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1483a;

    /* renamed from: b, reason: collision with root package name */
    public static final Random f1484b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f1485c;

    static {
        a aVar = new a("INSTANCE", 0);
        f1483a = aVar;
        f1485c = new a[]{aVar};
        f1484b = new Random();
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1485c.clone();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return f1484b;
    }
}
