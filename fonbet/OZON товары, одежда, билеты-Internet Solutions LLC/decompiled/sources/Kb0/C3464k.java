package Kb0;

import dc0.C6144H;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

/* renamed from: Kb0.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final /* synthetic */ class C3464k extends C7719a implements Function2<URI, Map<String, ? extends List<? extends String>>, Unit> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(URI uri, Map<String, ? extends List<? extends String>> map) {
        ((C6144H) this.receiver).k(uri, map, false);
        return Unit.f71690a;
    }
}
