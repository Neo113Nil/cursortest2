package T5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a DATA_DISK_CACHE;
    public static final a LOCAL;
    public static final a MEMORY_CACHE;
    public static final a REMOTE;
    public static final a RESOURCE_DISK_CACHE;

    static {
        a aVar = new a("LOCAL", 0);
        LOCAL = aVar;
        a aVar2 = new a("REMOTE", 1);
        REMOTE = aVar2;
        a aVar3 = new a("DATA_DISK_CACHE", 2);
        DATA_DISK_CACHE = aVar3;
        a aVar4 = new a("RESOURCE_DISK_CACHE", 3);
        RESOURCE_DISK_CACHE = aVar4;
        a aVar5 = new a("MEMORY_CACHE", 4);
        MEMORY_CACHE = aVar5;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    private a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
