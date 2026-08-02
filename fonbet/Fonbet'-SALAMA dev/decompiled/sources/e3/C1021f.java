package e3;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0827d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.p000authapi.zbc;

/* renamed from: e3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021f extends AbstractC0827d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12664a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1021f(o oVar, int i7) {
        super(X2.b.f7469b, oVar);
        this.f12664a = i7;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ s createFailedResult(Status status) {
        int i7 = this.f12664a;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0827d
    public final void doExecute(com.google.android.gms.common.api.b bVar) {
        switch (this.f12664a) {
            case 0:
                C1019d c1019d = (C1019d) bVar;
                C1025j c1025j = (C1025j) c1019d.getService();
                BinderC1020e binderC1020e = new BinderC1020e(this, 0);
                Parcel zba = c1025j.zba();
                zbc.zbd(zba, binderC1020e);
                zbc.zbc(zba, c1019d.f12661a);
                c1025j.zbb(102, zba);
                break;
            default:
                C1019d c1019d2 = (C1019d) bVar;
                C1025j c1025j2 = (C1025j) c1019d2.getService();
                BinderC1020e binderC1020e2 = new BinderC1020e(this, 1);
                Parcel zba2 = c1025j2.zba();
                zbc.zbd(zba2, binderC1020e2);
                zbc.zbc(zba2, c1019d2.f12661a);
                c1025j2.zbb(103, zba2);
                break;
        }
    }
}
