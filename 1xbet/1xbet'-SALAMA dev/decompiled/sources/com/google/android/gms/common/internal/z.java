package com.google.android.gms.common.internal;

import W5.AbstractC0486a1;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes.dex */
public final class z extends p105o3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f11339a = new z("com.google.android.gms.common.ui.SignInButtonCreatorImpl");

    public static View a(int i7, Context context, int i8) throws p105o3.c {
        z zVar = f11339a;
        try {
            zax zaxVar = new zax(1, i7, i8, null);
            p105o3.b bVar = new p105o3.b(context);
            x xVar = (x) zVar.getRemoteCreatorInstance(context);
            Parcel parcelZaa = xVar.zaa();
            zac.zae(parcelZaa, bVar);
            zac.zad(parcelZaa, zaxVar);
            Parcel parcelZab = xVar.zab(2, parcelZaa);
            p105o3.a aVarZ = p105o3.b.Z(parcelZab.readStrongBinder());
            parcelZab.recycle();
            return (View) p105o3.b.t0(aVarZ);
        } catch (Exception e7) {
            throw new p105o3.c(AbstractC0486a1.e(i7, i8, "Could not get button with size ", " and color "), e7);
        }
    }

    @Override // p105o3.d
    public final Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof x ? (x) iInterfaceQueryLocalInterface : new x(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }
}
