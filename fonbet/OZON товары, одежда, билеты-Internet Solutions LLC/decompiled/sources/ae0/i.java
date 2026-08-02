package ae0;

import B0.A0;
import Sc.r;
import Sc.s;
import ae0.AbstractC5006b;
import ae0.EnumC5007c;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.ref.WeakReference;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.data.model.KeyInfo;
import ru.ozon.mapsdk.common.geoproxy.data.model.MapKeysResponse;
import te0.C9867b;
import ue0.C10044a;
import ue0.C10045b;
import ue0.InterfaceC10046c;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    private static volatile ArrayList f36653d;

    /* renamed from: f, reason: collision with root package name */
    private static Ae0.b f36655f;

    /* renamed from: g, reason: collision with root package name */
    private static WeakReference<Context> f36656g;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f36650a = new i();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f36651b = U.j(new Pair(EnumC5007c.YANDEX, C5008d.f36629d), new Pair(EnumC5007c.LIBRE, AbstractC5006b.a.f36625d));

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f36652c = true;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Ae0.c f36654e = new Ae0.c();

    public static WeakReference a() {
        return f36656g;
    }

    public static List b() {
        return f36653d;
    }

    public static boolean c() {
        return f36652c;
    }

    public static void f(ArrayList arrayList) {
        f36653d = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull Context context, @NotNull kotlin.coroutines.jvm.internal.c cVar, @NotNull GeoProviderConfig geoProviderConfig) {
        C5009e c5009e;
        int i11;
        AbstractC5006b abstractC5006b;
        GeoProviderConfig geoProviderConfig2;
        Context context2;
        AbstractC5006b abstractC5006b2;
        try {
            if (cVar instanceof C5009e) {
                c5009e = (C5009e) cVar;
                int i12 = c5009e.f36636i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c5009e.f36636i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c5009e.f36634g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c5009e.f36636i;
                    if (i11 != 0) {
                        s.b(obj);
                        EnumC5007c.a aVar2 = EnumC5007c.Companion;
                        GeoProviderConfig.SdkType sdkType = geoProviderConfig.getSdkType();
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
                        EnumC5007c enumC5007c = Intrinsics.d(sdkType, GeoProviderConfig.SdkType.Yandex.INSTANCE) ? EnumC5007c.YANDEX : Intrinsics.d(sdkType, GeoProviderConfig.SdkType.MapLibre.INSTANCE) ? EnumC5007c.LIBRE : null;
                        if (enumC5007c != null && (abstractC5006b = (AbstractC5006b) f36651b.get(enumC5007c)) != null && !abstractC5006b.b()) {
                            C10720e0 c10720e0 = C10720e0.f105451a;
                            He.b bVar = He.b.f10879b;
                            C5010f c5010f = new C5010f(abstractC5006b, context, null, geoProviderConfig);
                            c5009e.f36631d = geoProviderConfig;
                            c5009e.f36632e = context;
                            c5009e.f36633f = abstractC5006b;
                            c5009e.f36636i = 1;
                            if (C10727i.f(bVar, c5010f, c5009e) != aVar) {
                                geoProviderConfig2 = geoProviderConfig;
                                context2 = context;
                                abstractC5006b2 = abstractC5006b;
                            }
                        }
                        return geoProviderConfig;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        GeoProviderConfig geoProviderConfig3 = c5009e.f36631d;
                        s.b(obj);
                        return obj;
                    }
                    abstractC5006b2 = c5009e.f36633f;
                    context2 = c5009e.f36632e;
                    geoProviderConfig2 = c5009e.f36631d;
                    try {
                        s.b(obj);
                    } catch (Exception e11) {
                        e = e11;
                        geoProviderConfig = geoProviderConfig2;
                        C9867b.f99466a.a("MapInitializer", Nk.a.b("error initGeoProviderOrFallbackToDefaultLibre provider: ", geoProviderConfig.getName()), new C10044a(e));
                        return GeoProviderConfig.INSTANCE.getDefaultLibre();
                    }
                    C10720e0 c10720e02 = C10720e0.f105451a;
                    L0 x11 = De.s.f6650a.x();
                    g gVar = new g(abstractC5006b2, context2, null, geoProviderConfig2);
                    c5009e.f36631d = geoProviderConfig2;
                    c5009e.f36632e = null;
                    c5009e.f36633f = null;
                    c5009e.f36636i = 2;
                    Object f7 = C10727i.f(x11, gVar, c5009e);
                    return f7 != aVar ? aVar : f7;
                }
            }
            if (i11 != 0) {
            }
            C10720e0 c10720e022 = C10720e0.f105451a;
            L0 x112 = De.s.f6650a.x();
            g gVar2 = new g(abstractC5006b2, context2, null, geoProviderConfig2);
            c5009e.f36631d = geoProviderConfig2;
            c5009e.f36632e = null;
            c5009e.f36633f = null;
            c5009e.f36636i = 2;
            Object f72 = C10727i.f(x112, gVar2, c5009e);
            if (f72 != aVar) {
            }
        } catch (Exception e12) {
            e = e12;
        }
        c5009e = new C5009e(this, cVar);
        Object obj2 = c5009e.f36634g;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5009e.f36636i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(1:(5:12|13|(1:46)|15|(2:17|(1:19)(4:23|(0)|15|(4:24|(3:30|(4:33|(1:35)(1:44)|(2:40|41)(1:42)|31)|45)|28|29)(0)))(0))(2:47|48))(9:49|50|(5:53|(1:55)(2:78|(1:80)(1:81))|(1:77)(7:57|58|(1:76)|62|(1:64)|65|(3:67|68|(1:70)(1:71))(1:73))|72|51)|82|83|84|(5:86|(2:90|(1:92)(1:93))|94|15|(0)(0))|28|29))(1:95))(5:101|(4:103|104|105|106)|109|110|(2:112|21))|96|97|(5:99|50|(1:51)|82|83)|84|(0)|28|29))|115|6|7|(0)(0)|96|97|(0)|84|(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x004c, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00a2, code lost:
    
        r14 = Sc.r.INSTANCE;
        r14 = Sc.s.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01bb, code lost:
    
        if (r14 == r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x01bb -> B:13:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x01c1 -> B:14:0x01c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull Context context, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        Object a11;
        Iterator it;
        Object obj;
        Throwable b11;
        Iterator it2;
        Object obj2;
        Ae0.b dVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f36649i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f36649i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj3 = hVar.f36647g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f36649i;
                ?? r32 = f36651b;
                if (i11 != 0) {
                    s.b(obj3);
                    Context context2 = context.getApplicationContext();
                    f36656g = new WeakReference<>(context2);
                    Ae0.b bVar = f36655f;
                    if (bVar == null) {
                        Intrinsics.f(context2);
                        f36654e.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        try {
                            Context applicationContext = context2.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            dVar = new Ae0.a(applicationContext);
                        } catch (Exception unused) {
                            Context applicationContext2 = context2.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                            dVar = new Ae0.d(applicationContext2);
                        }
                        bVar = dVar;
                    }
                    f36655f = bVar;
                    r.Companion companion = r.INSTANCE;
                    ie0.g gVar = ie0.g.f66321a;
                    hVar.f36649i = 1;
                    gVar.getClass();
                    obj3 = ie0.g.e(hVar);
                    if (obj3 == aVar) {
                        return aVar;
                    }
                } else if (i11 == 1) {
                    s.b(obj3);
                } else {
                    if (i11 == 2) {
                        it = hVar.f36645e;
                        obj = hVar.f36644d;
                        s.b(obj3);
                        while (it.hasNext()) {
                            KeyInfo keyInfo = (KeyInfo) it.next();
                            EnumC5007c.a aVar2 = EnumC5007c.Companion;
                            GeoProviderConfig.SdkType sdkType = keyInfo.getSdkType();
                            aVar2.getClass();
                            Intrinsics.checkNotNullParameter(sdkType, "sdkType");
                            EnumC5007c enumC5007c = Intrinsics.d(sdkType, GeoProviderConfig.SdkType.Yandex.INSTANCE) ? EnumC5007c.YANDEX : Intrinsics.d(sdkType, GeoProviderConfig.SdkType.MapLibre.INSTANCE) ? EnumC5007c.LIBRE : null;
                            if (enumC5007c != null) {
                                if ((kotlin.text.h.K(keyInfo.getKeyId()) || keyInfo.getKeyId().length() == 0) && enumC5007c != EnumC5007c.LIBRE) {
                                    String b12 = A0.b("api-key for ", enumC5007c.name(), " is blank");
                                    C9867b c9867b = C9867b.f99466a;
                                    C9867b.f(b12, new C10044a(new Exception(b12)), InterfaceC10046c.a.ERROR);
                                }
                                AbstractC5006b abstractC5006b = (AbstractC5006b) r32.get(enumC5007c);
                                if (abstractC5006b != null) {
                                    abstractC5006b.g(keyInfo.getKeyId());
                                }
                                Ae0.b bVar2 = f36655f;
                                if (bVar2 != null) {
                                    String a12 = enumC5007c.a();
                                    String keyId = keyInfo.getKeyId();
                                    hVar.f36644d = obj;
                                    hVar.f36645e = it;
                                    hVar.f36649i = 2;
                                    if (bVar2.a(a12, keyId, hVar) == aVar) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        a11 = obj;
                        b11 = r.b(a11);
                        if (b11 != null) {
                            if (!(b11 instanceof HttpException) && !(b11 instanceof UnknownHostException)) {
                                if (C10045b.a(b11)) {
                                    C9867b c9867b2 = C9867b.f99466a;
                                    C9867b.f(Nk.a.b("decode error: ", b11.getMessage()), new C10044a(b11), InterfaceC10046c.a.ERROR);
                                } else {
                                    C9867b c9867b3 = C9867b.f99466a;
                                    C9867b.f("have error while try load keys from back", new C10044a(b11), InterfaceC10046c.a.ERROR);
                                }
                            }
                            it2 = r32.entrySet().iterator();
                            obj2 = a11;
                            if (it2.hasNext()) {
                            }
                        }
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5006b abstractC5006b2 = hVar.f36646f;
                    it2 = hVar.f36645e;
                    obj2 = hVar.f36644d;
                    s.b(obj3);
                    String str = (String) obj3;
                    if (str != null) {
                        abstractC5006b2.g(str);
                    }
                    if (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        EnumC5007c enumC5007c2 = (EnumC5007c) entry.getKey();
                        abstractC5006b2 = (AbstractC5006b) entry.getValue();
                        Ae0.b bVar3 = f36655f;
                        if (bVar3 != null) {
                            String a13 = enumC5007c2.a();
                            hVar.f36644d = obj2;
                            hVar.f36645e = it2;
                            hVar.f36646f = abstractC5006b2;
                            hVar.f36649i = 3;
                            obj3 = bVar3.b(a13, hVar);
                        } else {
                            str = null;
                            if (str != null) {
                            }
                            if (it2.hasNext()) {
                                EnumC5007c.Companion.getClass();
                                List a02 = C7714v.a0(EnumC5007c.YANDEX);
                                if (!(a02 instanceof Collection) || !a02.isEmpty()) {
                                    Iterator it3 = a02.iterator();
                                    while (it3.hasNext()) {
                                        AbstractC5006b abstractC5006b3 = (AbstractC5006b) r32.get((EnumC5007c) it3.next());
                                        String a14 = abstractC5006b3 != null ? abstractC5006b3.a() : null;
                                        if (a14 == null || kotlin.text.h.K(a14)) {
                                            C9867b c9867b4 = C9867b.f99466a;
                                            C9867b.f("The keys for initializing providers were not found", new C10044a(new Exception("The keys for initializing providers were not found")), InterfaceC10046c.a.ERROR);
                                            throw new IllegalStateException("The keys for initializing providers were not found");
                                        }
                                    }
                                }
                                return Unit.f71690a;
                            }
                        }
                    }
                }
                a11 = (MapKeysResponse) obj3;
                r.Companion companion2 = r.INSTANCE;
                if (!(a11 instanceof r.b)) {
                    it = ((MapKeysResponse) a11).getKeys().iterator();
                    obj = a11;
                    while (it.hasNext()) {
                    }
                    a11 = obj;
                }
                b11 = r.b(a11);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        }
        hVar = new h(this, cVar);
        Object obj32 = hVar.f36647g;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f36649i;
        ?? r322 = f36651b;
        if (i11 != 0) {
        }
        a11 = (MapKeysResponse) obj32;
        r.Companion companion22 = r.INSTANCE;
        if (!(a11 instanceof r.b)) {
        }
        b11 = r.b(a11);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }
}
