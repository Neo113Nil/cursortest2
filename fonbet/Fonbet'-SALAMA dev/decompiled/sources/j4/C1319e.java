package j4;

import l4.s;

/* renamed from: j4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1319e implements Y3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f14630a;

    public C1319e(s sVar) {
        this.f14630a = sVar;
    }

    @Override // Y3.f
    public final void a(boolean z4) {
        s sVar = this.f14630a;
        if (z4) {
            sVar.d("app_in_background");
        } else {
            sVar.i("app_in_background");
        }
    }
}
