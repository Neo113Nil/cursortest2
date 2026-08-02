package Z0;

import android.os.Parcelable;
import android.util.SparseArray;
import i4.InterfaceC2015a;
import z0.p0;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f6284m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(q qVar, int i) {
        super(0);
        this.f6283l = i;
        this.f6284m = qVar;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        p0 snapshotObserver;
        switch (this.f6283l) {
            case 0:
                this.f6284m.getLayoutNode().C();
                break;
            case 1:
                q qVar = this.f6284m;
                if (qVar.f6298o && qVar.isAttachedToWindow() && qVar.getView().getParent() == qVar) {
                    snapshotObserver = qVar.getSnapshotObserver();
                    snapshotObserver.a(qVar, b.f6259m, qVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f6284m.J.saveHierarchyState(sparseArray);
                break;
            case 3:
                q qVar2 = this.f6284m;
                qVar2.getReleaseBlock().c(qVar2.J);
                q.n(qVar2);
                break;
            case 4:
                q qVar3 = this.f6284m;
                qVar3.getResetBlock().c(qVar3.J);
                break;
            default:
                q qVar4 = this.f6284m;
                qVar4.getUpdateBlock().c(qVar4.J);
                break;
        }
        return W3.o.f6046a;
    }
}
