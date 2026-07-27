package B0;

import P0.j;
import android.content.Context;
import b0.i;

/* loaded from: classes.dex */
public final class f implements C0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139a;

    /* renamed from: b, reason: collision with root package name */
    public final i f140b;

    public /* synthetic */ f(i iVar, int i3) {
        this.f139a = i3;
        this.f140b = iVar;
    }

    @Override // c2.a
    public final Object get() {
        switch (this.f139a) {
            case 0:
                return new e((Context) this.f140b.f2461b, new j(4), new j(3));
            default:
                String packageName = ((Context) this.f140b.f2461b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
