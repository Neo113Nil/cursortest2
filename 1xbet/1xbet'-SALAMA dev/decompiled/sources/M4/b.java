package M4;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements N4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4582c;

    public /* synthetic */ b(Context context, int i7, String str) {
        this.f4580a = i7;
        this.f4581b = context;
        this.f4582c = str;
    }

    @Override // N4.b
    public final Object get() {
        switch (this.f4580a) {
            case 0:
                return new h(this.f4581b, this.f4582c);
            default:
                return this.f4581b.getSharedPreferences(this.f4582c, 0);
        }
    }
}
