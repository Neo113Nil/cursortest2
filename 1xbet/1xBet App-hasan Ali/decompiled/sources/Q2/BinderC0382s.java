package Q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;

/* renamed from: Q2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0382s extends E5 implements W {

    /* renamed from: k, reason: collision with root package name */
    public final J2.u f5057k;

    public BinderC0382s(J2.u uVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f5057k = uVar;
    }

    @Override // Q2.W
    public final void a0(C0387u0 c0387u0) {
        J2.u uVar = this.f5057k;
        if (uVar != null) {
            uVar.c(c0387u0.a());
        }
    }

    @Override // Q2.W
    public final void c() {
        J2.u uVar = this.f5057k;
        if (uVar != null) {
            uVar.e();
        }
    }

    @Override // Q2.W
    public final void p() {
        J2.u uVar = this.f5057k;
        if (uVar != null) {
            uVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
            F5.b(parcel);
            a0(c0387u0);
        } else if (i == 2) {
            c();
        } else if (i == 3) {
            p();
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // Q2.W
    public final void a() {
    }

    @Override // Q2.W
    public final void b() {
    }
}
