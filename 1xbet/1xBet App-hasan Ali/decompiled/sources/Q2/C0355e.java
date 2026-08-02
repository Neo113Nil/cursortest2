package Q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1653ud;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.C1608td;
import com.google.android.gms.internal.ads.InterfaceC1698vd;
import s3.BinderC2361b;

/* renamed from: Q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355e extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0610Ia f5011c;

    public C0355e(Context context, BinderC0610Ia binderC0610Ia) {
        this.f5010b = context;
        this.f5011c = binderC0610Ia;
    }

    @Override // Q2.AbstractC0377p
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.y0(new BinderC2361b(this.f5010b), this.f5011c, 244410000);
    }

    @Override // Q2.AbstractC0377p
    public final Object c() {
        IInterface c1608td;
        Context context = this.f5010b;
        BinderC2361b binderC2361b = new BinderC2361b(context);
        try {
            try {
                IBinder b3 = U2.j.b(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = AbstractBinderC1653ud.f15868k;
                if (b3 == null) {
                    c1608td = null;
                } else {
                    IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    c1608td = queryLocalInterface instanceof InterfaceC1698vd ? (InterfaceC1698vd) queryLocalInterface : new C1608td(b3, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 0);
                }
                return ((C1608td) c1608td).t1(binderC2361b, this.f5011c);
            } catch (U2.k | RemoteException | NullPointerException unused) {
                return null;
            }
        } catch (Exception e3) {
            throw new U2.k(e3);
        }
    }
}
