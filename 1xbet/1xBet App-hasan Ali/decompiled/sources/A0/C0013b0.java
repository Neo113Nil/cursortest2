package A0;

import P.InterfaceC0289e0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h0.C1988b;

/* renamed from: A0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013b0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f471l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f472m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0013b0(int i, InterfaceC0289e0 interfaceC0289e0) {
        super(1);
        this.f471l = i;
        this.f472m = interfaceC0289e0;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        W3.o oVar = W3.o.f6046a;
        InterfaceC0289e0 interfaceC0289e0 = this.f472m;
        switch (this.f471l) {
            case 0:
                Configuration configuration = new Configuration((Configuration) obj);
                P.D d5 = AndroidCompositionLocals_androidKt.f6942a;
                interfaceC0289e0.setValue(configuration);
                return oVar;
            case 1:
                ((i4.c) interfaceC0289e0.getValue()).c(new C1988b(((C1988b) obj).f17191a));
                return oVar;
            default:
                return (Float) ((i4.c) interfaceC0289e0.getValue()).c(Float.valueOf(((Number) obj).floatValue()));
        }
    }
}
