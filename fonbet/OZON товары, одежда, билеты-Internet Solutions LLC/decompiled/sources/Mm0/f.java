package Mm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    public static final f Critical;
    public static final f Fatal;
    public static final f Info;
    public static final f Warning;

    /* renamed from: transient, reason: not valid java name */
    private static final /* synthetic */ f[] f8transient;

    static {
        f fVar = new f("Info", 0);
        Info = fVar;
        f fVar2 = new f("Warning", 1);
        Warning = fVar2;
        f fVar3 = new f("Critical", 2);
        Critical = fVar3;
        f fVar4 = new f("Fatal", 3);
        Fatal = fVar4;
        f8transient = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    private f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f8transient.clone();
    }
}
