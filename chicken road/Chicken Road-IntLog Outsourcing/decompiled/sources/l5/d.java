package l5;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f11076a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f11077b;

    static {
        d dVar = new d("MEDIA_PLAYER", 0);
        f11076a = dVar;
        d[] dVarArr = {dVar, new d("LOW_LATENCY", 1)};
        f11077b = dVarArr;
        AbstractC1477a.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f11077b.clone();
    }
}
