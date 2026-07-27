package h1;

import A0.h;
import Q0.g;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325a extends com.google.android.gms.common.internal.a implements Q0.c {

    /* renamed from: A, reason: collision with root package name */
    public final Bundle f4983A;

    /* renamed from: B, reason: collision with root package name */
    public final Integer f4984B;
    public final boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final h f4985z;

    public C0325a(Context context, Looper looper, h hVar, Bundle bundle, g gVar, Q0.h hVar2) {
        super(context, looper, 44, hVar, gVar, hVar2);
        this.y = true;
        this.f4985z = hVar;
        this.f4983A = bundle;
        this.f4984B = (Integer) hVar.f55c;
    }

    @Override // Q0.c
    public final int d() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, Q0.c
    public final boolean j() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        h hVar = this.f4985z;
        boolean equals = this.f2574c.getPackageName().equals((String) hVar.f54b);
        Bundle bundle = this.f4983A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) hVar.f54b);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
