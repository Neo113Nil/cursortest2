package TZ;

import P00.l;
import Sc.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sg.a f26962a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<String> f26963b;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26964a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.PARSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26964a = iArr;
        }
    }

    public f(@NotNull Sg.a analyticsScreenStorage, @NotNull Set<String> ignoreEmptyScreenErrorPages) {
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(ignoreEmptyScreenErrorPages, "ignoreEmptyScreenErrorPages");
        this.f26962a = analyticsScreenStorage;
        this.f26963b = ignoreEmptyScreenErrorPages;
    }

    public final b a(String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Set<String> set = this.f26963b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (h.t(url, (String) it.next(), false)) {
                    return null;
                }
            }
        }
        if (str == null) {
            str = "0";
        }
        return new b(this.f26962a.a(), new g(112, null, str, url, "error.emptyPage", null, null));
    }

    public final b b(@NotNull String url, @NotNull R00.b incident) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(incident, "incident");
        boolean z11 = incident instanceof R00.a;
        Sg.a aVar = this.f26962a;
        if (!z11) {
            if (!(incident instanceof R00.c)) {
                return null;
            }
            Throwable a11 = ((R00.c) incident).a();
            return new b(aVar.a(), new g(17, null, null, url, "error.noConnection", a11 != null ? a11.getMessage() : null, a11 != null ? a11.getClass().getCanonicalName() : null));
        }
        R00.a aVar2 = (R00.a) incident;
        String c11 = aVar2.c();
        if (c11 == null) {
            c11 = "0";
        }
        int a12 = aVar2.a();
        String b11 = aVar2.b();
        Rg.a a13 = aVar.a();
        if (a13 == null) {
            a13 = new Rg.a(url, null, null, null, null, null, null, null, null, null, null, 4094);
        }
        return new b(a13, new g(64, Integer.valueOf(a12), c11, url, "error.composerError", b11, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if (((R00.e) r11).h() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UZ.d c(String str, @NotNull R00.f widgetIncident) {
        Intrinsics.checkNotNullParameter(widgetIncident, "widgetIncident");
        if (str == null) {
            str = "0";
        }
        Rg.a a11 = this.f26962a.a();
        Pair pair = new Pair("id", str);
        Pair pair2 = new Pair("type", "error");
        String str2 = "notFound";
        if (!(widgetIncident instanceof R00.d)) {
            if (!(widgetIncident instanceof R00.e)) {
                str2 = "unknown";
            }
            Map j11 = U.j(pair, pair2, new Pair("reason", str2));
            String e11 = widgetIncident.e();
            RZ.b b11 = widgetIncident.b();
            if (b11 == null) {
            }
            RZ.b b12 = widgetIncident.b();
            if (b12 == null) {
            }
            RZ.b b13 = widgetIncident.b();
            return new UZ.d(a11, new XZ.d(j11, e11, r10, r6, b13 != null ? Long.valueOf(b13.a()) : null, 280));
        }
        int i11 = a.f26964a[((R00.d) widgetIncident).h().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new o();
            }
            str2 = "parsing";
        }
        Map j112 = U.j(pair, pair2, new Pair("reason", str2));
        String e112 = widgetIncident.e();
        RZ.b b112 = widgetIncident.b();
        String d11 = b112 == null ? b112.d() : null;
        RZ.b b122 = widgetIncident.b();
        String b14 = b122 == null ? b122.b() : null;
        RZ.b b132 = widgetIncident.b();
        return new UZ.d(a11, new XZ.d(j112, e112, d11, b14, b132 != null ? Long.valueOf(b132.a()) : null, 280));
    }
}
