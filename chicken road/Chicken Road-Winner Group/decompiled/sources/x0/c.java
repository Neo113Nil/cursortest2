package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f10540a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f10541b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f10542c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f10543d;

    static {
        c cVar = new c("DEFAULT", 0);
        f10540a = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        f10541b = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f10542c = cVar3;
        f10543d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f10543d.clone();
    }
}
