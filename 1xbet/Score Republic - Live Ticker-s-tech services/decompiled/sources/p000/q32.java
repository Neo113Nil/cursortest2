package p000;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q32 extends hu1 implements qx1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f6364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q32(v42 v42Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f6364b = atomicReference;
    }

    @Override // p000.hu1
    /* JADX INFO: renamed from: a */
    public final boolean mo563a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(y52.CREATOR);
        iu1.m2704d(parcel);
        mo3806y(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: y */
    public final void mo3806y(List list) {
        AtomicReference atomicReference = this.f6364b;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
