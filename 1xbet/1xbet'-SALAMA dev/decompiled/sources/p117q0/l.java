package p117q0;

import I4.j;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class l extends j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f15757x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar) {
        super(sVar);
        this.f15757x = sVar;
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
        k kVar = new k(this, this.f15757x);
        this.f3678b = kVar;
        kVar.onCreate();
    }
}
