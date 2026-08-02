package p000;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0830w7 implements Callable, r60 {

    /* JADX INFO: renamed from: j */
    public static final EnumC0830w7 f8448j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0830w7[] f8449k;

    static {
        EnumC0830w7 enumC0830w7 = new EnumC0830w7("INSTANCE", 0);
        f8448j = enumC0830w7;
        f8449k = new EnumC0830w7[]{enumC0830w7};
    }

    public static EnumC0830w7 valueOf(String str) {
        return (EnumC0830w7) Enum.valueOf(EnumC0830w7.class, str);
    }

    public static EnumC0830w7[] values() {
        return (EnumC0830w7[]) f8449k.clone();
    }

    @Override // p000.r60
    public final Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ArrayList();
    }
}
