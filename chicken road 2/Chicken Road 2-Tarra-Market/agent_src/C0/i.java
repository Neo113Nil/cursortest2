package C0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f65b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f66c;

    /* renamed from: a, reason: collision with root package name */
    public String f67a;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i("PLAIN_TEXT", 0);
        iVar.f67a = "text/plain";
        f65b = iVar;
        f66c = new i[]{iVar};
    }

    public static i a(String str) {
        for (i iVar : values()) {
            if (iVar.f67a.equals(str)) {
                return iVar;
            }
        }
        throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f66c.clone();
    }
}
