package F;

/* renamed from: F.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020u implements C1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1.e f519b;

    public /* synthetic */ C0020u(C1.e eVar, int i2) {
        this.f518a = i2;
        this.f519b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // C1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.Object obj, k1.d dVar) {
        F.C0019t c0019t;
        int i2;
        f1.z zVar;
        int i3;
        switch (this.f518a) {
            case 0:
                if (dVar instanceof F.C0019t) {
                    c0019t = (F.C0019t) dVar;
                    int i4 = c0019t.f516e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0019t.f516e = i4 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = c0019t.f515d;
                        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                        i2 = c0019t.f516e;
                        if (i2 != 0) {
                            a.AbstractC0059a.A(obj2);
                            F.k0 k0Var = (F.k0) obj;
                            if (k0Var instanceof F.d0) {
                                throw ((F.d0) k0Var).f434b;
                            }
                            if (!(k0Var instanceof F.C0004d)) {
                                if (k0Var instanceof F.b0 ? true : k0Var instanceof F.l0) {
                                    throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new E1.A();
                            }
                            java.lang.Object obj3 = ((F.C0004d) k0Var).f432b;
                            c0019t.f516e = 1;
                            if (this.f519b.a(obj3, c0019t) == enumC0927a) {
                                return enumC0927a;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.AbstractC0059a.A(obj2);
                        }
                        return h1.C0177i.f3302a;
                    }
                }
                c0019t = new F.C0019t(this, dVar);
                java.lang.Object obj22 = c0019t.f515d;
                l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
                i2 = c0019t.f516e;
                if (i2 != 0) {
                }
                return h1.C0177i.f3302a;
            default:
                if (dVar instanceof f1.z) {
                    zVar = (f1.z) dVar;
                    int i5 = zVar.f2905e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zVar.f2905e = i5 - Integer.MIN_VALUE;
                        java.lang.Object obj4 = zVar.f2904d;
                        l1.EnumC0927a enumC0927a3 = l1.EnumC0927a.f8017a;
                        i3 = zVar.f2905e;
                        if (i3 != 0) {
                            a.AbstractC0059a.A(obj4);
                            java.util.Set keySet = ((I.b) obj).a().keySet();
                            zVar.f2905e = 1;
                            if (this.f519b.a(keySet, zVar) == enumC0927a3) {
                                return enumC0927a3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.AbstractC0059a.A(obj4);
                        }
                        return h1.C0177i.f3302a;
                    }
                }
                zVar = new f1.z(this, dVar);
                java.lang.Object obj42 = zVar.f2904d;
                l1.EnumC0927a enumC0927a32 = l1.EnumC0927a.f8017a;
                i3 = zVar.f2905e;
                if (i3 != 0) {
                }
                return h1.C0177i.f3302a;
        }
    }
}
