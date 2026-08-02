package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final l f5881k;

    /* renamed from: l, reason: collision with root package name */
    public static final l f5882l;

    /* renamed from: m, reason: collision with root package name */
    public static final l f5883m;

    /* renamed from: n, reason: collision with root package name */
    public static final l f5884n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ l[] f5885o;

    static {
        l lVar = new l("SUCCESS", 0);
        f5881k = lVar;
        l lVar2 = new l("PERMANENT_FAILURE", 1);
        f5882l = lVar2;
        l lVar3 = new l("RETRIABLE_FAILURE", 2);
        f5883m = lVar3;
        l lVar4 = new l("BUFFERED", 3);
        f5884n = lVar4;
        f5885o = new l[]{lVar, lVar2, lVar3, lVar4};
    }

    public static l[] values() {
        return (l[]) f5885o.clone();
    }
}
