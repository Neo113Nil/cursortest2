package L4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final e f4348A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ e[] f4349B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f4350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f4351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f4352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f4353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f4354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f4355f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f4356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f4357y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e f4358z;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("ALL", 0);
        e eVar2 = new e("LISTEN_STREAM_IDLE", 1);
        f4350a = eVar2;
        e eVar3 = new e("LISTEN_STREAM_CONNECTION_BACKOFF", 2);
        f4351b = eVar3;
        e eVar4 = new e("WRITE_STREAM_IDLE", 3);
        f4352c = eVar4;
        e eVar5 = new e("WRITE_STREAM_CONNECTION_BACKOFF", 4);
        f4353d = eVar5;
        e eVar6 = new e("HEALTH_CHECK_TIMEOUT", 5);
        f4354e = eVar6;
        e eVar7 = new e("ONLINE_STATE_TIMEOUT", 6);
        f4355f = eVar7;
        e eVar8 = new e("GARBAGE_COLLECTION", 7);
        f4356x = eVar8;
        e eVar9 = new e("RETRY_TRANSACTION", 8);
        f4357y = eVar9;
        e eVar10 = new e("CONNECTIVITY_ATTEMPT_TIMER", 9);
        f4358z = eVar10;
        e eVar11 = new e("INDEX_BACKFILL", 10);
        f4348A = eVar11;
        f4349B = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f4349B.clone();
    }
}
