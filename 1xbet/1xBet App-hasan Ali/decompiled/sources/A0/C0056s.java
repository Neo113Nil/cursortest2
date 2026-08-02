package A0;

import P.AbstractC0329z;
import P.InterfaceC0314r0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: A0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056s extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final C0056s f567m = new C0056s(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0056s f568n = new C0056s(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0056s f569o = new C0056s(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0056s f570p = new C0056s(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C0056s f571q = new C0056s(1, 4);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f572l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0056s(int i, int i5) {
        super(i);
        this.f572l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f572l) {
            case 0:
                return W3.o.f6046a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                P.D d5 = AndroidCompositionLocals_androidKt.f6942a;
                X.i iVar = (X.i) ((InterfaceC0314r0) obj);
                iVar.getClass();
                AbstractC0329z.u(iVar, d5);
                return ((Context) AbstractC0329z.u(iVar, AndroidCompositionLocals_androidKt.f6943b)).getResources();
            default:
                return Boolean.valueOf(Z.p(obj));
        }
    }
}
