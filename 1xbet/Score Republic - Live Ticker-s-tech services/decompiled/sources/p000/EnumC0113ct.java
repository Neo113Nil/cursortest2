package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ct */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0113ct implements Executor {

    /* JADX INFO: renamed from: j */
    public static final EnumC0113ct f1449j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0113ct[] f1450k;

    static {
        EnumC0113ct enumC0113ct = new EnumC0113ct("INSTANCE", 0);
        f1449j = enumC0113ct;
        f1450k = new EnumC0113ct[]{enumC0113ct};
    }

    public static EnumC0113ct valueOf(String str) {
        return (EnumC0113ct) Enum.valueOf(EnumC0113ct.class, str);
    }

    public static EnumC0113ct[] values() {
        return (EnumC0113ct[]) f1450k.clone();
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
