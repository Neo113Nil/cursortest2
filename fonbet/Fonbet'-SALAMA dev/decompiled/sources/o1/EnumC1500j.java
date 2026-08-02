package o1;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1500j implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1500j f15570a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1500j[] f15571b;

    static {
        EnumC1500j enumC1500j = new EnumC1500j("INSTANCE", 0);
        f15570a = enumC1500j;
        f15571b = new EnumC1500j[]{enumC1500j};
    }

    public static EnumC1500j valueOf(String str) {
        return (EnumC1500j) Enum.valueOf(EnumC1500j.class, str);
    }

    public static EnumC1500j[] values() {
        return (EnumC1500j[]) f15571b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
