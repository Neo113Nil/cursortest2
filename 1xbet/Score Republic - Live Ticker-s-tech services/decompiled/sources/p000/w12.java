package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w12 extends hu1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8347b = 2;

    /* JADX INFO: renamed from: c */
    public final Object f8348c;

    public w12(qc1 qc1Var) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f8348c = qc1Var;
    }

    @Override // p000.hu1
    /* JADX INFO: renamed from: a */
    public final boolean mo563a(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (this.f8347b) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) iu1.m2701a(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                iu1.m2704d(parcel);
                qc1 qc1Var = (qc1) this.f8348c;
                if (status.f1341j > 0) {
                    af0.m197l(status, null, qc1Var);
                    return true;
                }
                try {
                    so1 so1Var = so1.f7176a;
                    int i2 = fo1.f2465a;
                    af0.m197l(status, a52.m26v(bArrCreateByteArray, so1.f7177b), qc1Var);
                    return true;
                } catch (mp1 e) {
                    qc1Var.m4060a(e);
                    return true;
                }
            case 1:
                qc1 qc1Var2 = (qc1) this.f8348c;
                switch (i) {
                    case 1:
                        Status status2 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status2, null, qc1Var2);
                        return true;
                    case 2:
                        Status status3 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status3, null, qc1Var2);
                        return true;
                    case 3:
                        Status status4 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status4, null, qc1Var2);
                        return true;
                    case 4:
                        Status status5 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        g12 g12Var = (g12) iu1.m2701a(parcel, g12.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status5, g12Var, qc1Var2);
                        return true;
                    case 5:
                        Status status6 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status6, null, qc1Var2);
                        return true;
                    case 6:
                        Status status7 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        m12 m12Var = (m12) iu1.m2701a(parcel, m12.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status7, m12Var, qc1Var2);
                        return true;
                    case 7:
                        Status status8 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        j12 j12Var = (j12) iu1.m2701a(parcel, j12.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status8, j12Var, qc1Var2);
                        return true;
                    case 8:
                        Status status9 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status9, null, qc1Var2);
                        return true;
                    case 9:
                        Status status10 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        n12 n12Var = (n12) iu1.m2701a(parcel, n12.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status10, n12Var, qc1Var2);
                        return true;
                    case 10:
                        Status status11 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        g12 g12Var2 = (g12) iu1.m2701a(parcel, g12.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status11, g12Var2, qc1Var2);
                        return true;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        Status status12 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        parcel.readLong();
                        iu1.m2704d(parcel);
                        af0.m197l(status12, null, qc1Var2);
                        return true;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        Status status13 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status13, null, qc1Var2);
                        return true;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        Status status14 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        r12 r12Var = (r12) iu1.m2701a(parcel, r12.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status14, r12Var, qc1Var2);
                        return true;
                    case 14:
                        Status status15 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status15, null, qc1Var2);
                        return true;
                    case 15:
                        Status status16 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        iu1.m2704d(parcel);
                        af0.m197l(status16, null, qc1Var2);
                        return true;
                    case 16:
                        Status status17 = (Status) iu1.m2701a(parcel, Status.CREATOR);
                        long j = parcel.readLong();
                        iu1.m2704d(parcel);
                        af0.m197l(status17, Long.valueOf(j), qc1Var2);
                        return true;
                    default:
                        return false;
                }
            default:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                iu1.m2704d(parcel);
                an0 an0Var = new an0(this, bArrCreateByteArray2);
                p90 p90Var = (p90) this.f8348c;
                ((ja0) p90Var.f6027j).execute(new f31(p90Var, an0Var, 5, z));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w12(e22 e22Var, p90 p90Var) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.f8348c = p90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w12(e22 e22Var, qc1 qc1Var) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.f8348c = qc1Var;
    }
}
