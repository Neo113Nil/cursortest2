package I3;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3657a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f3658b;

    static {
        a aVar = new a("INSTANCE", 0);
        f3657a = aVar;
        f3658b = new a[]{aVar};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3658b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
