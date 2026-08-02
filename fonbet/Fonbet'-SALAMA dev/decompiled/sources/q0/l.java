package q0;

import android.os.Bundle;

/* loaded from: classes.dex */
public class l extends I4.j {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f15751x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar) {
        super(sVar);
        this.f15751x = sVar;
    }

    @Override // I4.j
    public final void j(String str, Bundle bundle) {
        if (bundle != null) {
            ((j) this.f3678b).notifyChildrenChanged(str, bundle);
        } else {
            super.j(str, bundle);
        }
    }

    @Override // I4.j
    public final void k() {
        k kVar = new k(this, this.f15751x);
        this.f3678b = kVar;
        kVar.onCreate();
    }
}
