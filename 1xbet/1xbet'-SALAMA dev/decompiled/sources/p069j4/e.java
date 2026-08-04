package p069j4;

import Y3.f;
import p083l4.s;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f14636a;

    public e(s sVar) {
        this.f14636a = sVar;
    }

    @Override // Y3.f
    public final void a(boolean z4) {
        s sVar = this.f14636a;
        if (z4) {
            sVar.d("app_in_background");
        } else {
            sVar.i("app_in_background");
        }
    }
}
