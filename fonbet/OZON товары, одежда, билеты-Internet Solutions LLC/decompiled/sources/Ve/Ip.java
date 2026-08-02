package Ve;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* loaded from: classes10.dex */
public final class Ip extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Ip(Object obj, int i11) {
        super(1);
        this.f29245b = i11;
        this.f29246c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, Ve.Jj] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f29246c;
        switch (this.f29245b) {
            case 0:
                MatchResult it = (MatchResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                kotlin.jvm.internal.M m11 = (kotlin.jvm.internal.M) obj2;
                Jj jj2 = (Jj) m11.f71787a;
                ArrayList W02 = C7714v.W0(jj2.f29299b);
                W02.add(it.getValue());
                Unit unit = Unit.f71690a;
                m11.f71787a = Jj.a(jj2, null, W02, null, 5);
                return "";
            default:
                Al0.b dto = (Al0.b) obj;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return ((nm0.u) obj2).f77424b.a(dto);
        }
    }
}
