package p000;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s32 extends hu1 implements tx1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f7023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v42 f7024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s32(v42 v42Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f7023b = atomicReference;
        this.f7024c = v42Var;
    }

    @Override // p000.hu1
    /* JADX INFO: renamed from: a */
    public final boolean mo563a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        j62 j62Var = (j62) iu1.m2701a(parcel, j62.CREATOR);
        iu1.m2704d(parcel);
        mo4419t(j62Var);
        return true;
    }

    @Override // p000.tx1
    /* JADX INFO: renamed from: t */
    public final void mo4419t(j62 j62Var) {
        AtomicReference atomicReference = this.f7023b;
        synchronized (atomicReference) {
            ky1 ky1Var = ((f02) this.f7024c.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5313b(Integer.valueOf(j62Var.f3831j.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(j62Var);
            atomicReference.notifyAll();
        }
    }
}
