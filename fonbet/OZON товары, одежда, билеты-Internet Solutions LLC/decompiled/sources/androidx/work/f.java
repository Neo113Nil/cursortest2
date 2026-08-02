package androidx.work;

import Sc.InterfaceC3999a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f CANCEL_AND_REENQUEUE;
    public static final f KEEP;

    @InterfaceC3999a
    public static final f REPLACE;
    public static final f UPDATE;

    static {
        f fVar = new f("REPLACE", 0);
        REPLACE = fVar;
        f fVar2 = new f("KEEP", 1);
        KEEP = fVar2;
        f fVar3 = new f("UPDATE", 2);
        UPDATE = fVar3;
        f fVar4 = new f("CANCEL_AND_REENQUEUE", 3);
        CANCEL_AND_REENQUEUE = fVar4;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    private f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
