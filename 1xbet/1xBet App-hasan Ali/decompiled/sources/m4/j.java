package m4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ j[] f18117k = {new j("PUBLIC", 0), new j("PROTECTED", 1), new j("INTERNAL", 2), new j("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    j EF8;

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f18117k.clone();
    }
}
