package R4;

import n4.C1345b;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f2727c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f2728d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f2729e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f2730f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w[] f2731g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1345b f2732h;

    /* renamed from: a, reason: collision with root package name */
    public final char f2733a;

    /* renamed from: b, reason: collision with root package name */
    public final char f2734b;

    static {
        w wVar = new w("OBJ", 0, '{', '}');
        f2727c = wVar;
        w wVar2 = new w("LIST", 1, '[', ']');
        f2728d = wVar2;
        w wVar3 = new w("MAP", 2, '{', '}');
        f2729e = wVar3;
        w wVar4 = new w("POLY_OBJ", 3, '[', ']');
        f2730f = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        f2731g = wVarArr;
        f2732h = AbstractC1477a.n(wVarArr);
    }

    public w(String str, int i2, char c2, char c6) {
        this.f2733a = c2;
        this.f2734b = c6;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f2731g.clone();
    }
}
