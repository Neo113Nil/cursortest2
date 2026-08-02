package com.google.android.gms.common.internal;

import W5.AbstractC0486a1;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.internal.base.zac;
import o3.BinderC1507b;
import o3.C1508c;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class z extends o3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final z f11339a = new z("com.google.android.gms.common.ui.SignInButtonCreatorImpl");

    public static View a(int i7, Context context, int i8) {
        z zVar = f11339a;
        try {
            zax zaxVar = new zax(1, i7, i8, null);
            BinderC1507b binderC1507b = new BinderC1507b(context);
            x xVar = (x) zVar.getRemoteCreatorInstance(context);
            Parcel zaa = xVar.zaa();
            zac.zae(zaa, binderC1507b);
            zac.zad(zaa, zaxVar);
            Parcel zab = xVar.zab(2, zaa);
            InterfaceC1506a Z6 = BinderC1507b.Z(zab.readStrongBinder());
            zab.recycle();
            return (View) BinderC1507b.t0(Z6);
        } catch (Exception e7) {
            throw new C1508c(AbstractC0486a1.e(i7, i8, "Could not get button with size ", " and color "), e7);
        }
    }

    @Override // o3.d
    public final Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof x ? (x) queryLocalInterface : new x(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }
}
