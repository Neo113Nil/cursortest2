package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708Wa implements W2.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12035k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0659Pa f12036l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BinderC0729Za f12037m;

    public /* synthetic */ C0708Wa(BinderC0729Za binderC0729Za, InterfaceC0659Pa interfaceC0659Pa, int i) {
        this.f12035k = i;
        this.f12036l = interfaceC0659Pa;
        this.f12037m = binderC0729Za;
    }

    @Override // W2.c
    public final void w(J2.b bVar) {
        switch (this.f12035k) {
            case 0:
                InterfaceC0659Pa interfaceC0659Pa = this.f12036l;
                try {
                    String canonicalName = this.f12037m.f12481k.getClass().getCanonicalName();
                    int i = bVar.f2695b;
                    String str = (String) bVar.f2696c;
                    U2.j.d(canonicalName + "failed to loaded mediation ad: ErrorCode = " + i + ". ErrorMessage = " + str + ". ErrorDomain = " + ((String) bVar.f2697d));
                    interfaceC0659Pa.a3(bVar.m());
                    interfaceC0659Pa.D2(str, i);
                    interfaceC0659Pa.B(i);
                    break;
                } catch (RemoteException e3) {
                    U2.j.g("", e3);
                    return;
                }
            case 1:
                InterfaceC0659Pa interfaceC0659Pa2 = this.f12036l;
                try {
                    String canonicalName2 = this.f12037m.f12481k.getClass().getCanonicalName();
                    int i5 = bVar.f2695b;
                    String str2 = (String) bVar.f2696c;
                    U2.j.d(canonicalName2 + "failed to load mediation ad: ErrorCode = " + i5 + ". ErrorMessage = " + str2 + ". ErrorDomain = " + ((String) bVar.f2697d));
                    interfaceC0659Pa2.a3(bVar.m());
                    interfaceC0659Pa2.D2(str2, i5);
                    interfaceC0659Pa2.B(i5);
                    break;
                } catch (RemoteException e5) {
                    U2.j.g("", e5);
                    return;
                }
            default:
                InterfaceC0659Pa interfaceC0659Pa3 = this.f12036l;
                try {
                    String canonicalName3 = this.f12037m.f12481k.getClass().getCanonicalName();
                    int i6 = bVar.f2695b;
                    String str3 = (String) bVar.f2696c;
                    U2.j.d(canonicalName3 + "failed to load mediation ad: ErrorCode = " + i6 + ". ErrorMessage = " + str3 + ". ErrorDomain = " + ((String) bVar.f2697d));
                    interfaceC0659Pa3.a3(bVar.m());
                    interfaceC0659Pa3.D2(str3, i6);
                    interfaceC0659Pa3.B(i6);
                    break;
                } catch (RemoteException e6) {
                    U2.j.g("", e6);
                }
        }
    }
}
