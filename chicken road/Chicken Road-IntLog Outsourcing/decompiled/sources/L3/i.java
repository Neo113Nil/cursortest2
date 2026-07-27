package L3;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class i implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1502a;

    public i(ArrayList arrayList) {
        this.f1502a = arrayList;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Iterator it = this.f1502a.iterator();
        if (!it.hasNext()) {
            return null;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "ScopeConfiguratorImpl{", "}");
        stringJoiner.add("conditions=" + ((String) this.f1502a.stream().map(new A3.b(11)).collect(Collectors.joining(StringUtils.COMMA, "[", "]"))));
        return stringJoiner.toString();
    }
}
