package B00;

import Sc.InterfaceC4008j;
import Sc.k;
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f2022a = k.b(C0049a.f2023b);

    /* renamed from: B00.a$a, reason: collision with other inner class name */
    static final class C0049a extends AbstractC7737t implements Function0<Regex> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0049a f2023b = new C0049a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Regex invoke() {
            return new Regex("^(?!(\\bhttps\\b)|(\\bhttp\\b)).*?://");
        }
    }

    @NotNull
    public static final String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (parse.getScheme() == null) {
            return h.e0(uri, "/", false) ? uri : "/".concat(uri);
        }
        String h11 = ((Regex) f2022a.getValue()).h(uri);
        return h11.length() == 0 ? "/" : h11;
    }
}
