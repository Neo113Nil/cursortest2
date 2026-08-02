package Gc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import qc.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class b implements Callable<List<Object>>, o<Object, List<Object>> {
    private static final /* synthetic */ b[] $VALUES;
    public static final b INSTANCE;

    static {
        b bVar = new b("INSTANCE", 0);
        INSTANCE = bVar;
        $VALUES = new b[]{bVar};
    }

    private b() {
        throw null;
    }

    public static b a() {
        return INSTANCE;
    }

    public static b b() {
        return INSTANCE;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // qc.o
    public final List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final List<Object> call() throws Exception {
        return new ArrayList();
    }
}
