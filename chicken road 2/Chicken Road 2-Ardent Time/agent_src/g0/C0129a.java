package g0;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129a implements java.io.FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3039a;

    public C0129a(java.lang.String str) {
        this.f3039a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return str.startsWith(this.f3039a);
    }
}
