package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.Set;

/* renamed from: K.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051t implements z2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2.e f896b;

    public /* synthetic */ C0051t(z2.e eVar, int i3) {
        this.f895a = i3;
        this.f896b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // z2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC0319c interfaceC0319c) {
        C0050s c0050s;
        int i3;
        a2.z zVar;
        int i4;
        switch (this.f895a) {
            case 0:
                if (interfaceC0319c instanceof C0050s) {
                    c0050s = (C0050s) interfaceC0319c;
                    int i5 = c0050s.f894e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0050s.f894e = i5 - Integer.MIN_VALUE;
                        Object obj2 = c0050s.f893d;
                        EnumC0326a enumC0326a = EnumC0326a.f4994a;
                        i3 = c0050s.f894e;
                        if (i3 != 0) {
                            X0.a.L(obj2);
                            j0 j0Var = (j0) obj;
                            if (j0Var instanceof c0) {
                                throw ((c0) j0Var).f828b;
                            }
                            if (!(j0Var instanceof C0036d)) {
                                if (j0Var instanceof a0 ? true : j0Var instanceof k0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new T0.b();
                            }
                            Object obj3 = ((C0036d) j0Var).f829b;
                            c0050s.f894e = 1;
                            if (this.f896b.a(obj3, c0050s) == enumC0326a) {
                                return enumC0326a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            X0.a.L(obj2);
                        }
                        return C0279i.f4852a;
                    }
                }
                c0050s = new C0050s(this, interfaceC0319c);
                Object obj22 = c0050s.f893d;
                EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
                i3 = c0050s.f894e;
                if (i3 != 0) {
                }
                return C0279i.f4852a;
            default:
                if (interfaceC0319c instanceof a2.z) {
                    zVar = (a2.z) interfaceC0319c;
                    int i6 = zVar.f1893e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        zVar.f1893e = i6 - Integer.MIN_VALUE;
                        Object obj4 = zVar.f1892d;
                        EnumC0326a enumC0326a3 = EnumC0326a.f4994a;
                        i4 = zVar.f1893e;
                        if (i4 != 0) {
                            X0.a.L(obj4);
                            Set keySet = ((N.b) obj).a().keySet();
                            zVar.f1893e = 1;
                            if (this.f896b.a(keySet, zVar) == enumC0326a3) {
                                return enumC0326a3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            X0.a.L(obj4);
                        }
                        return C0279i.f4852a;
                    }
                }
                zVar = new a2.z(this, interfaceC0319c);
                Object obj42 = zVar.f1892d;
                EnumC0326a enumC0326a32 = EnumC0326a.f4994a;
                i4 = zVar.f1893e;
                if (i4 != 0) {
                }
                return C0279i.f4852a;
        }
    }
}
