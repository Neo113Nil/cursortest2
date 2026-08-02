package P0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: k, reason: collision with root package name */
    public static final y f4684k;

    /* renamed from: l, reason: collision with root package name */
    public static final y f4685l;

    /* renamed from: m, reason: collision with root package name */
    public static final y f4686m;

    /* renamed from: n, reason: collision with root package name */
    public static final y f4687n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ y[] f4688o;

    static {
        y yVar = new y("StartInput", 0);
        f4684k = yVar;
        y yVar2 = new y("StopInput", 1);
        f4685l = yVar2;
        y yVar3 = new y("ShowKeyboard", 2);
        f4686m = yVar3;
        y yVar4 = new y("HideKeyboard", 3);
        f4687n = yVar4;
        f4688o = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f4688o.clone();
    }
}
