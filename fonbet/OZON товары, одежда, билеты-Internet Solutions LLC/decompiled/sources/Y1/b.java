package Y1;

import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.sequences.Sequence;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b implements X1.a<String> {

    /* renamed from: a, reason: collision with root package name */
    private final int f34531a;

    public b(int i11) {
        this.f34531a = i11;
    }

    @Override // X1.a
    @NotNull
    public final Sequence<String> a() {
        List list;
        K k11 = new K();
        list = c.f34532a;
        String[] elements = {l.t(l.B(l.p(new a(k11, list.size())), this.f34531a), " ")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.g(elements);
    }
}
