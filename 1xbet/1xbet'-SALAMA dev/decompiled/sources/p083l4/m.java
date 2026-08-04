package p083l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f14959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f14960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f14961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f14962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f14963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m[] f14964f;

    static {
        m mVar = new m("Disconnected", 0);
        f14959a = mVar;
        m mVar2 = new m("GettingToken", 1);
        f14960b = mVar2;
        m mVar3 = new m("Connecting", 2);
        f14961c = mVar3;
        m mVar4 = new m("Authenticating", 3);
        f14962d = mVar4;
        m mVar5 = new m("Connected", 4);
        f14963e = mVar5;
        f14964f = new m[]{mVar, mVar2, mVar3, mVar4, mVar5};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f14964f.clone();
    }
}
