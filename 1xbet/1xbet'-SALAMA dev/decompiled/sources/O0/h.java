package O0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4852b;

    public /* synthetic */ h() {
        this.f4851a = 2;
    }

    @Override // O0.n, O0.l
    public void c(m mVar) {
        switch (this.f4851a) {
            case 2:
                a aVar = (a) this.f4852b;
                if (!aVar.f4832Q) {
                    aVar.E();
                    aVar.f4832Q = true;
                }
                break;
        }
    }

    @Override // O0.l
    public final void e(m mVar) {
        switch (this.f4851a) {
            case 0:
                u uVar = t.f4897a;
                uVar.S((View) this.f4852b, 1.0f);
                uVar.getClass();
                mVar.v(this);
                break;
            case 1:
                ((m) this.f4852b).x();
                mVar.v(this);
                break;
            default:
                a aVar = (a) this.f4852b;
                int i7 = aVar.f4831P - 1;
                aVar.f4831P = i7;
                if (i7 == 0) {
                    aVar.f4832Q = false;
                    aVar.m();
                }
                mVar.v(this);
                break;
        }
    }

    public /* synthetic */ h(Object obj, int i7) {
        this.f4851a = i7;
        this.f4852b = obj;
    }
}
