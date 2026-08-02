package kotlinx.serialization.json;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.G;

/* loaded from: classes5.dex */
public final /* synthetic */ class w implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        h hVar = (h) entry.getValue();
        StringBuilder sb = new StringBuilder();
        G.a(str, sb);
        sb.append(':');
        sb.append(hVar);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
