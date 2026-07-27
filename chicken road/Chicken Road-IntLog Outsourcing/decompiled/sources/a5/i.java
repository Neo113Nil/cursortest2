package a5;

import java.io.IOException;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f3957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3958b;

    public /* synthetic */ i(t tVar, long j2) {
        this.f3957a = tVar;
        this.f3958b = j2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        boolean z;
        t tVar = this.f3957a;
        long j2 = this.f3958b;
        synchronized (tVar) {
            long j6 = tVar.f4000m;
            long j7 = tVar.f3999l;
            if (j6 < j7) {
                z = true;
            } else {
                tVar.f3999l = j7 + 1;
                z = false;
            }
        }
        if (z) {
            EnumC0200b enumC0200b = EnumC0200b.f3918d;
            tVar.a(enumC0200b, enumC0200b, null);
            j2 = -1;
        } else {
            try {
                tVar.f4011x.p(1, 0, false);
            } catch (IOException e3) {
                EnumC0200b enumC0200b2 = EnumC0200b.f3918d;
                tVar.a(enumC0200b2, enumC0200b2, e3);
            }
        }
        return Long.valueOf(j2);
    }
}
