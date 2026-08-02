package Dc0;

import Dc0.C2852a;
import android.content.Context;
import android.view.OrientationEventListener;
import kotlin.jvm.functions.Function1;

/* renamed from: Dc0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2853b extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2852a f6472a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2853b(C2852a c2852a, Context context) {
        super(context);
        this.f6472a = c2852a;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i11) {
        int i12;
        Fc0.e eVar;
        Fc0.e eVar2;
        Fc0.e eVar3;
        Function1 function1;
        if (i11 == -1) {
            return;
        }
        C2852a c2852a = this.f6472a;
        i12 = c2852a.f6468g;
        if (Math.abs(i11 - i12) < 3) {
            return;
        }
        c2852a.f6468g = i11;
        int g10 = C2852a.g(c2852a, i11);
        eVar = c2852a.f6467f;
        int i13 = C2852a.C0135a.f6470a[eVar.ordinal()];
        if (i13 == 1) {
            eVar2 = ((45 > g10 || g10 >= 136) && (225 > g10 || g10 >= 316)) ? Fc0.e.PORTRAIT : Fc0.e.LANDSCAPE;
        } else if (i13 == 2) {
            eVar2 = ((70 > g10 || g10 >= 111) && (250 > g10 || g10 >= 291)) ? Fc0.e.PORTRAIT : Fc0.e.LANDSCAPE;
        } else {
            if (i13 != 3) {
                throw new Sc.o();
            }
            eVar2 = ((g10 < 0 || g10 >= 21) && (340 > g10 || g10 >= 360) && (160 > g10 || g10 >= 201)) ? Fc0.e.LANDSCAPE : Fc0.e.PORTRAIT;
        }
        eVar3 = c2852a.f6467f;
        if (eVar2 != eVar3) {
            c2852a.f6467f = eVar2;
            function1 = c2852a.f6465d;
            function1.invoke(eVar2);
        }
    }
}
