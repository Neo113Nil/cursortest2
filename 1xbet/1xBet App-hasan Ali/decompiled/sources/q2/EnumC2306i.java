package q2;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2306i implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2306i f18884k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC2306i[] f18885l;

    static {
        EnumC2306i enumC2306i = new EnumC2306i("INSTANCE", 0);
        f18884k = enumC2306i;
        f18885l = new EnumC2306i[]{enumC2306i};
    }

    public static EnumC2306i valueOf(String str) {
        return (EnumC2306i) Enum.valueOf(EnumC2306i.class, str);
    }

    public static EnumC2306i[] values() {
        return (EnumC2306i[]) f18885l.clone();
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
