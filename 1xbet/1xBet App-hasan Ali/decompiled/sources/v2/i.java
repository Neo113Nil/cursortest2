package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final i f20414k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ i[] f20415l;

    /* JADX INFO: Fake field, exist only in values array */
    i EF3;

    static {
        i iVar = new i("IGNORE", 0);
        i iVar2 = new i("RESPECT_PERFORMANCE", 1);
        f20414k = iVar2;
        f20415l = new i[]{iVar, iVar2, new i("RESPECT_ALL", 2)};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f20415l.clone();
    }
}
