package Q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC0604Hb;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.C0597Gb;
import com.google.android.gms.internal.ads.InterfaceC0611Ib;
import s3.BinderC2361b;

/* renamed from: Q2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357f extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0610Ia f5013c;

    public C0357f(Context context, BinderC0610Ia binderC0610Ia) {
        this.f5012b = context;
        this.f5013c = binderC0610Ia;
    }

    @Override // Q2.AbstractC0377p
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.v1(new BinderC2361b(this.f5012b), this.f5013c, 244410000);
    }

    @Override // Q2.AbstractC0377p
    public final Object c() {
        IInterface c0597Gb;
        Context context = this.f5012b;
        BinderC2361b binderC2361b = new BinderC2361b(context);
        try {
            try {
                IBinder b3 = U2.j.b(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = AbstractBinderC0604Hb.f9407k;
                if (b3 == null) {
                    c0597Gb = null;
                } else {
                    IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    c0597Gb = queryLocalInterface instanceof InterfaceC0611Ib ? (InterfaceC0611Ib) queryLocalInterface : new C0597Gb(b3, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 0);
                }
                return ((C0597Gb) c0597Gb).t1(binderC2361b, this.f5013c);
            } catch (U2.k | RemoteException | NullPointerException unused) {
                return null;
            }
        } catch (Exception e3) {
            throw new U2.k(e3);
        }
    }
}
