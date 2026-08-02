package Bl0;

import Lm0.a;
import Ve.C4178d8;
import Ve.R5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Bl0.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2660v extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2660v(Object obj, int i11) {
        super(0);
        this.f3994b = i11;
        this.f3995c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3994b) {
            case 0:
                break;
            case 1:
                a.b bVar = Lm0.a.f17149a;
                bVar.b("TDsBinding");
                bVar.i("loadUrl " + ((String) this.f3995c), new Object[0]);
                break;
            default:
                ((R5) this.f3995c).f29830j.setValue(new C4178d8());
                break;
        }
        return Unit.f71690a;
    }
}
