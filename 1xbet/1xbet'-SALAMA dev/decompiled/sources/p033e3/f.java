package p033e3;

import X2.b;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0783d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.p000authapi.zbc;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0783d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12670a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, int i7) {
        super(b.f7469b, oVar);
        this.f12670a = i7;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ s createFailedResult(Status status) {
        int i7 = this.f12670a;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0783d
    public final void doExecute(com.google.android.gms.common.api.b bVar) {
        switch (this.f12670a) {
            case 0:
                d dVar = (d) bVar;
                j jVar = (j) dVar.getService();
                e eVar = new e(this, 0);
                Parcel parcelZba = jVar.zba();
                zbc.zbd(parcelZba, eVar);
                zbc.zbc(parcelZba, dVar.f12667a);
                jVar.zbb(102, parcelZba);
                break;
            default:
                d dVar2 = (d) bVar;
                j jVar2 = (j) dVar2.getService();
                e eVar2 = new e(this, 1);
                Parcel parcelZba2 = jVar2.zba();
                zbc.zbd(parcelZba2, eVar2);
                zbc.zbc(parcelZba2, dVar2.f12667a);
                jVar2.zbb(103, parcelZba2);
                break;
        }
    }
}
