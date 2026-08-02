package x;

import P.AbstractC0329z;
import P.InterfaceC0314r0;
import P.e1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2576e extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final C2576e f20754m = new C2576e(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2576e f20755n = new C2576e(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20756l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2576e(int i, int i5) {
        super(i);
        this.f20756l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f20756l) {
            case 0:
                e1 e1Var = AndroidCompositionLocals_androidKt.f6943b;
                X.i iVar = (X.i) ((InterfaceC0314r0) obj);
                iVar.getClass();
                if (((Context) AbstractC0329z.u(iVar, e1Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC2580g.f20764b;
                }
                InterfaceC2574d.f20750a.getClass();
                return C2572c.f20745c;
            default:
                return Boolean.valueOf(!(((t0.s) obj).i == 2));
        }
    }
}
