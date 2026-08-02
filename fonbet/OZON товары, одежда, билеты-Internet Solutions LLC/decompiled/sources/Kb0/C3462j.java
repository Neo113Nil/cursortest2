package Kb0;

import dc0.C6144H;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

/* renamed from: Kb0.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final /* synthetic */ class C3462j extends C7735q implements Function2<URI, Map<String, ? extends List<? extends String>>, Map<String, ? extends List<? extends String>>> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Map<String, ? extends List<? extends String>> invoke(URI uri, Map<String, ? extends List<? extends String>> map) {
        return ((C6144H) this.receiver).g(uri, map);
    }
}
