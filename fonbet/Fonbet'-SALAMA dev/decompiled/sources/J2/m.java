package J2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f3827a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f3828b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f3829c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f3830d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m[] f3831e;

    static {
        m mVar = new m("SUCCESS", 0);
        f3827a = mVar;
        m mVar2 = new m("PERMANENT_FAILURE", 1);
        f3828b = mVar2;
        m mVar3 = new m("RETRIABLE_FAILURE", 2);
        f3829c = mVar3;
        m mVar4 = new m("BUFFERED", 3);
        f3830d = mVar4;
        f3831e = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m[] values() {
        return (m[]) f3831e.clone();
    }
}
