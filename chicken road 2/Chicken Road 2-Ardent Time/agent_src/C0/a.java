package C0;

/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.a implements n0.InterfaceC0939c {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f97C = 0;

    /* renamed from: A, reason: collision with root package name */
    public final android.os.Bundle f98A;

    /* renamed from: B, reason: collision with root package name */
    public final java.lang.Integer f99B;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f100y;

    /* renamed from: z, reason: collision with root package name */
    public final P1.h f101z;

    public a(android.content.Context context, android.os.Looper looper, P1.h hVar, android.os.Bundle bundle, n0.g gVar, n0.h hVar2) {
        super(context, looper, 44, hVar, gVar, hVar2);
        this.f100y = true;
        this.f101z = hVar;
        this.f98A = bundle;
        this.f99B = (java.lang.Integer) hVar.f1488f;
    }

    @Override // com.google.android.gms.common.internal.a, n0.InterfaceC0939c
    public final boolean i() {
        return this.f100y;
    }

    @Override // n0.InterfaceC0939c
    public final int m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.IInterface n(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C0.d ? (C0.d) queryLocalInterface : new C0.d(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.Bundle p() {
        P1.h hVar = this.f101z;
        boolean equals = this.f2601c.getPackageName().equals((java.lang.String) hVar.f1485c);
        android.os.Bundle bundle = this.f98A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (java.lang.String) hVar.f1485c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
