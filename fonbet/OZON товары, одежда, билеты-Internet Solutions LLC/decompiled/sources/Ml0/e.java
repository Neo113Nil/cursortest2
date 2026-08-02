package Ml0;

import Ve.Ai;
import Ve.J4;
import Ve.N9;
import Ve.Zi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i11) {
        super(1);
        this.f18165b = i11;
        this.f18166c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18165b) {
            case 0:
                String packageName = (String) obj;
                Intrinsics.checkNotNullParameter(packageName, "packageName");
                return f.x((f) this.f18166c, packageName);
            default:
                Zi it = (Zi) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((N9) ((J4) this.f18166c).u()).e0(new Ai(it));
                return Unit.f71690a;
        }
    }
}
