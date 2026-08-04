package R5;

/* JADX INFO: renamed from: R5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0405a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6130c;

    public C0405a(String str, String str2, String str3) {
        this.f6128a = str;
        this.f6129b = str2;
        this.f6130c = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f6129b;
    }
}
