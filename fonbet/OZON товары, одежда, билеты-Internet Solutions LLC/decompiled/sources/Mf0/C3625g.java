package Mf0;

import androidx.lifecycle.x0;
import h3.C6788a;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: Mf0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final /* synthetic */ class C3625g extends C7735q implements fd.p<String, Boolean, Boolean, Boolean, Integer, Unit> {
    public final void b(String url, boolean z11, boolean z12, boolean z13, int i11) {
        Intrinsics.checkNotNullParameter(url, "p0");
        O o11 = (O) this.receiver;
        o11.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        C6788a a11 = x0.a(o11);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new Q(o11, z13, z11, z12, url, i11, null), 2);
    }

    @Override // fd.p
    public final /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool, Boolean bool2, Boolean bool3, Integer num) {
        b(str, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), num.intValue());
        return Unit.f71690a;
    }
}
