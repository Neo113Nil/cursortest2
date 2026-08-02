package Q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;

/* renamed from: Q2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0373n extends E5 implements InterfaceC0386u {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0347a f5040k;

    public BinderC0373n(InterfaceC0347a interfaceC0347a) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f5040k = interfaceC0347a;
    }

    @Override // Q2.InterfaceC0386u
    public final void a() {
        this.f5040k.z();
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a();
        parcel2.writeNoException();
        return true;
    }
}
