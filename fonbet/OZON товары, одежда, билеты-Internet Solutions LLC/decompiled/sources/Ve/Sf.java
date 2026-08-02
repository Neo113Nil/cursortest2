package Ve;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* loaded from: classes10.dex */
public final class Sf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public static final C4675uf f29975a = new C4675uf();

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        We.M responseBody = (We.M) obj;
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Pf.f d11 = org.jsoup.parser.l.d(responseBody.string());
        Intrinsics.checkNotNullExpressionValue(d11, "parse(responseBody.string())");
        return new Re(d11);
    }
}
