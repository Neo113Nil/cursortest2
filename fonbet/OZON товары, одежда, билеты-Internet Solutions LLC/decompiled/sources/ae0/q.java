package ae0;

import Sc.s;
import We.E;
import We.G;
import We.L;
import We.M;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import te0.C9867b;
import ue0.C10044a;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final E f36688a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Regex f36689b;

    public q(@NotNull E okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f36688a = okHttpClient;
        this.f36689b = new Regex("name:[^\"]+");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(1:23))|11|(1:13)|14|15))|26|6|7|(0)(0)|11|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        te0.C9867b.f99466a.a("StyleDownloader", "error check style in cache", new ue0.C10044a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q qVar, Context context, String str, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        Object obj;
        int i11;
        qVar.getClass();
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i12 = lVar.f36660f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f36660f = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = lVar.f36658d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = lVar.f36660f;
                boolean z11 = false;
                if (i11 != 0) {
                    s.b(obj);
                    Ae0.f fVar = Ae0.f.f1194a;
                    lVar.f36660f = 1;
                    obj = fVar.b(context, str, lVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                if (((String) obj) != null) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        }
        lVar = new l(qVar, cVar);
        obj = lVar.f36658d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f36660f;
        boolean z112 = false;
        if (i11 != 0) {
        }
        if (((String) obj) != null) {
        }
        return Boolean.valueOf(z112);
    }

    public static final String b(q qVar, String str) {
        qVar.getClass();
        try {
            G.a aVar = new G.a();
            aVar.k(str);
            aVar.f(null, "GET");
            L execute = qVar.f36688a.a(aVar.b()).execute();
            try {
                if (!execute.v()) {
                    execute.close();
                    return null;
                }
                M c11 = execute.c();
                String string = c11 != null ? c11.string() : null;
                execute.close();
                return string;
            } finally {
            }
        } catch (Exception e11) {
            C9867b.f99466a.a("StyleDownloader", Nk.a.b("error download style by url:", str), new C10044a(e11));
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(2:(1:(1:11)(2:17|18))(1:19)|12)(3:20|(2:22|(1:24))(1:26)|25)|13|14))|30|6|7|(0)(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (Ae0.f.d(r5, r8, r9, r0) == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r5 = te0.C9867b.f99466a;
        r6 = "isFallback:" + r6 + " error save style of provider:" + r7;
        r7 = new ue0.C10044a(r4);
        r5.a("StyleDownloader", r6, r7);
        r6 = r6;
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r5v1, types: [te0.b] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Throwable, ue0.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0063 -> B:13:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(q qVar, Context context, boolean z11, GeoProviderConfig geoProviderConfig, String str, String str2, kotlin.coroutines.jvm.internal.c cVar) {
        p pVar;
        int i11;
        GeoProviderConfig geoProviderConfig2;
        boolean z12;
        qVar.getClass();
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f36687h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                pVar.f36687h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = pVar.f36685f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = pVar.f36687h;
                if (i11 != 0) {
                    s.b(obj);
                    if (z11) {
                        Ae0.f fVar = Ae0.f.f1194a;
                        pVar.f36684e = geoProviderConfig;
                        pVar.f36683d = z11;
                        pVar.f36687h = 1;
                        z11 = z11;
                        geoProviderConfig = geoProviderConfig;
                        if (Ae0.f.e(context, str, str2, pVar) == aVar) {
                        }
                    } else {
                        Ae0.f fVar2 = Ae0.f.f1194a;
                        pVar.f36684e = geoProviderConfig;
                        pVar.f36683d = z11;
                        pVar.f36687h = 2;
                        z11 = z11;
                        geoProviderConfig = geoProviderConfig;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    z12 = pVar.f36683d;
                    geoProviderConfig2 = pVar.f36684e;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z12 = pVar.f36683d;
                    geoProviderConfig2 = pVar.f36684e;
                }
                s.b(obj);
                z11 = z12;
                geoProviderConfig = geoProviderConfig2;
                return Unit.f71690a;
            }
        }
        pVar = new p(qVar, cVar);
        Object obj2 = pVar.f36685f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = pVar.f36687h;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, String str, kotlin.coroutines.jvm.internal.c cVar) {
        o oVar;
        int i11;
        try {
            if (cVar instanceof o) {
                oVar = (o) cVar;
                int i12 = oVar.f36682f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    oVar.f36682f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = oVar.f36680d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = oVar.f36682f;
                    if (i11 != 0) {
                        s.b(obj);
                        Ae0.f fVar = Ae0.f.f1194a;
                        oVar.f36682f = 1;
                        obj = fVar.b(context, str, oVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return (String) obj;
                }
            }
            if (i11 != 0) {
            }
            return (String) obj;
        } catch (Exception e11) {
            C9867b.f99466a.a("StyleDownloader", "error get style from cache", new C10044a(e11));
            return null;
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.f36680d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = oVar.f36682f;
    }

    public final Object e(@NotNull Context context, @NotNull GeoProviderConfig geoProviderConfig, boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new m(geoProviderConfig, this, context, z11, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull Context context, @NotNull String str, @NotNull String str2, String str3, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        int i11;
        q qVar;
        String str4;
        String X9;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i12 = nVar.f36679i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nVar.f36679i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nVar.f36677g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = nVar.f36679i;
                if (i11 != 0) {
                    s.b(obj);
                    nVar.f36674d = this;
                    nVar.f36675e = str2;
                    nVar.f36676f = str3;
                    nVar.f36679i = 1;
                    obj = g(context, str, nVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    qVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = nVar.f36676f;
                    str2 = nVar.f36675e;
                    qVar = nVar.f36674d;
                    s.b(obj);
                }
                str4 = (String) obj;
                if (str4 == null && (X9 = kotlin.text.h.X(str4, "<TILE_URL>", str2, false)) != null) {
                    qVar.getClass();
                    return str3 == null ? X9 : qVar.f36689b.replace(X9, "name:".concat(str3));
                }
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f36677g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f36679i;
        if (i11 != 0) {
        }
        str4 = (String) obj2;
        return str4 == null ? null : null;
    }
}
