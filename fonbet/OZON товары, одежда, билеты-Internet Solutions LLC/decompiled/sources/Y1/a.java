package Y1;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.K;

/* loaded from: classes8.dex */
final class a extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f34529b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f34530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(K k11, int i11) {
        super(0);
        this.f34529b = k11;
        this.f34530c = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        List list;
        list = c.f34532a;
        K k11 = this.f34529b;
        int i11 = k11.f71785a;
        k11.f71785a = i11 + 1;
        return (String) list.get(i11 % this.f34530c);
    }
}
