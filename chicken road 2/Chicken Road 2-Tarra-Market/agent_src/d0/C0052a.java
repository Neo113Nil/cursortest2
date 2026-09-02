package d0;

import O.g;
import O.h;
import Q.C0005c;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052a extends com.google.android.gms.common.internal.a implements O.c {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f888C = 0;

    /* renamed from: A, reason: collision with root package name */
    public final Bundle f889A;

    /* renamed from: B, reason: collision with root package name */
    public final Integer f890B;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f891y;

    /* renamed from: z, reason: collision with root package name */
    public final C0005c f892z;

    public C0052a(Context context, Looper looper, C0005c c0005c, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, c0005c, gVar, hVar);
        this.f891y = true;
        this.f892z = c0005c;
        this.f889A = bundle;
        this.f890B = (Integer) c0005c.f405f;
    }

    @Override // com.google.android.gms.common.internal.a, O.c
    public final boolean j() {
        return this.f891y;
    }

    @Override // O.c
    public final int m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C0054c ? (C0054c) queryLocalInterface : new C0054c(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        C0005c c0005c = this.f892z;
        boolean equals = this.f734c.getPackageName().equals((String) c0005c.f402c);
        Bundle bundle = this.f889A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c0005c.f402c);
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
