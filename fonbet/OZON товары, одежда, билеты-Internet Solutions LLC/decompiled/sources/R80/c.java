package R80;

import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {
    @NotNull
    public static final b a(@NotNull b bVar, @NotNull Function1<? super b, b> f7) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(f7, "f");
        return !bVar.e() ? bVar : f7.invoke(bVar);
    }

    @NotNull
    public static final b b(@NotNull b bVar, @NotNull String host) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(host, "host");
        if (!bVar.e()) {
            return bVar;
        }
        Uri d11 = bVar.d();
        return b.b(bVar, host.equals(d11 != null ? d11.getHost() : null), null, null, null, 30);
    }

    @NotNull
    public static final b c(@NotNull b bVar, @NotNull Set<String> hosts) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        if (!bVar.e()) {
            return bVar;
        }
        Set<String> set = hosts;
        Uri d11 = bVar.d();
        return b.b(bVar, C7714v.A(set, d11 != null ? d11.getHost() : null), null, null, null, 30);
    }

    @NotNull
    public static final b d(@NotNull b bVar, @NotNull String parameter) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        if (!bVar.e()) {
            return bVar;
        }
        Uri d11 = bVar.d();
        String queryParameter = d11 != null ? d11.getQueryParameter(parameter) : null;
        return queryParameter != null ? b.b(bVar, true, null, null, U.n(bVar.c(), new Pair(parameter, queryParameter)), 14) : b.b(bVar, false, null, null, null, 30);
    }

    @NotNull
    public static final b e(@NotNull b bVar, @NotNull String parameter) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        if (bVar.e()) {
            Uri d11 = bVar.d();
            String queryParameter = d11 != null ? d11.getQueryParameter(parameter) : null;
            if (queryParameter != null) {
                return b.b(bVar, false, null, null, U.n(bVar.c(), new Pair(parameter, queryParameter)), 15);
            }
        }
        return bVar;
    }

    @NotNull
    public static final b f(@NotNull b bVar, @NotNull Pattern pattern) {
        String str;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (!bVar.e()) {
            return bVar;
        }
        Uri d11 = bVar.d();
        if (d11 == null || (str = d11.getPath()) == null) {
            str = "";
        }
        Matcher matcher = pattern.matcher(str);
        boolean matches = matcher.matches();
        return b.b(bVar, matches, null, (matches && matcher.groupCount() == 1) ? matcher.group(1) : null, null, 22);
    }

    @NotNull
    public static final b g(@NotNull b bVar, String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (!bVar.e()) {
            return bVar;
        }
        Uri d11 = bVar.d();
        return b.b(bVar, str.equals(d11 != null ? d11.getScheme() : null), null, null, null, 30);
    }

    @NotNull
    public static final b h(@NotNull b bVar, Set<String> set) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (!bVar.e() || set == null) {
            return bVar;
        }
        Set<String> set2 = set;
        Uri d11 = bVar.d();
        return b.b(bVar, C7714v.A(set2, d11 != null ? d11.getScheme() : null), null, null, null, 30);
    }

    @NotNull
    public static final b i(@NotNull String str) {
        b bVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return new b(Uri.parse(str), true);
        } catch (Exception unused) {
            bVar = b.f24792e;
            return bVar;
        }
    }

    @NotNull
    public static final b j(@NotNull b bVar, Set<Pattern> set) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (!bVar.e() || set == null) {
            return bVar;
        }
        Set<Pattern> set2 = set;
        boolean z11 = false;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator<T> it = set2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Pattern) it.next()).matcher(String.valueOf(bVar.d())).matches()) {
                    z11 = true;
                    break;
                }
            }
        }
        return b.b(bVar, z11, null, null, null, 30);
    }

    @NotNull
    public static final b k(@NotNull b bVar, Set<String> set) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (!bVar.e()) {
            return bVar;
        }
        boolean z11 = true;
        if (set != null) {
            Set<String> set2 = set;
            Uri d11 = bVar.d();
            if (C7714v.A(set2, d11 != null ? d11.getScheme() : null)) {
                z11 = false;
            }
        }
        return b.b(bVar, z11, null, null, null, 30);
    }
}
