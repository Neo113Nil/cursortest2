package Gc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class j implements Callable<Map<Object, Object>> {
    private static final /* synthetic */ j[] $VALUES;
    public static final j INSTANCE;

    static {
        j jVar = new j("INSTANCE", 0);
        INSTANCE = jVar;
        $VALUES = new j[]{jVar};
    }

    private j() {
        throw null;
    }

    public static j a() {
        return INSTANCE;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Callable
    public final Map<Object, Object> call() throws Exception {
        return new HashMap();
    }
}
