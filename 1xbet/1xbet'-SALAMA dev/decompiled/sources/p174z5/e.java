package p174z5;

import p155w1.L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f18467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f18468b;

    static {
        e eVar = new e("PLAIN_TEXT", 0);
        f18467a = eVar;
        f18468b = new e[]{eVar};
    }

    public static e a(String str) {
        for (e eVar : values()) {
            eVar.getClass();
            if ("text/plain".equals(str)) {
                return eVar;
            }
        }
        throw new NoSuchFieldException(L.i("No such ClipboardContentFormat: ", str));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f18468b.clone();
    }
}
