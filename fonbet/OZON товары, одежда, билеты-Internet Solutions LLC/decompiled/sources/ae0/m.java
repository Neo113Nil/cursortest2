package ae0;

import Je0.d;
import Sc.s;
import android.content.Context;
import ei0.InterfaceC6369b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.data.model.VectorData;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import ve.C10312c;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.StyleDownloader$downloadVectorStyle$2", f = "StyleDownloader.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    long f36661d;

    /* renamed from: e, reason: collision with root package name */
    int f36662e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f36663f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ GeoProviderConfig f36664g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ q f36665h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Context f36666i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f36667j;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.StyleDownloader$downloadVectorStyle$2$res$1$2$1", f = "StyleDownloader.kt", l = {54, 58}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36668d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f36669e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f36670f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f36671g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f36672h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ GeoProviderConfig f36673i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, Context context, String str, boolean z11, GeoProviderConfig geoProviderConfig, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f36669e = qVar;
            this.f36670f = context;
            this.f36671g = str;
            this.f36672h = z11;
            this.f36673i = geoProviderConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f36669e, this.f36670f, this.f36671g, this.f36672h, this.f36673i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (ae0.q.d(r12.f36669e, r12.f36670f, r12.f36672h, r12.f36673i, r9, r12.f36671g, r12) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
        
            if (r13 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36668d;
            String str = this.f36671g;
            q qVar = this.f36669e;
            if (i11 == 0) {
                s.b(obj);
                this.f36668d = 1;
                obj = q.a(qVar, this.f36670f, str, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            if (!((Boolean) obj).booleanValue() && (r9 = q.b(qVar, str)) != null) {
                this.f36668d = 2;
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(GeoProviderConfig geoProviderConfig, q qVar, Context context, boolean z11, kotlin.coroutines.d<? super m> dVar) {
        super(2, dVar);
        this.f36664g = geoProviderConfig;
        this.f36665h = qVar;
        this.f36666i = context;
        this.f36667j = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        m mVar = new m(this.f36664g, this.f36665h, this.f36666i, this.f36667j, dVar);
        mVar.f36663f = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c8  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long b11;
        long j11;
        Set<Map.Entry<String, String>> entrySet;
        Je0.c cVar;
        InterfaceC6369b ozonTracker;
        Je0.c cVar2;
        Je0.c cVar3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36662e;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f36663f;
            kotlin.time.g.f71988a.getClass();
            kotlin.time.f.f71986a.getClass();
            b11 = kotlin.time.f.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            GeoProviderConfig geoProviderConfig = this.f36664g;
            VectorData parseVector = geoProviderConfig.parseVector();
            if (parseVector != null) {
                linkedHashSet.add(parseVector.getStyleUrl());
                Map<String, String> styleUrls = parseVector.getStyleUrls();
                if (styleUrls != null && (entrySet = styleUrls.entrySet()) != null) {
                    Iterator<T> it = entrySet.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(((Map.Entry) it.next()).getValue());
                    }
                }
            }
            if (!linkedHashSet.isEmpty()) {
                ArrayList arrayList = new ArrayList(C7714v.z(linkedHashSet, 10));
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C10727i.a(m11, null, null, new a(this.f36665h, this.f36666i, (String) it2.next(), this.f36667j, geoProviderConfig, null), 3));
                }
                this.f36661d = b11;
                this.f36662e = 1;
                if (C10721f.a(arrayList, this) == aVar) {
                    return aVar;
                }
                j11 = b11;
            }
            Unit unit = Unit.f71690a;
            kotlin.time.f.f71986a.getClass();
            C10312c c10312c = new C10312c(unit, kotlin.time.f.a(b11), null);
            ie0.g.f66321a.getClass();
            if (ie0.g.c() == null) {
                cVar = Je0.c.f14654d;
                if (cVar != null) {
                    cVar2 = Je0.c.f14654d;
                } else {
                    GeoProxyConfig c11 = ie0.g.c();
                    if (c11 == null || (ozonTracker = c11.getOzonTracker()) == null) {
                        d.a.a();
                    } else {
                        Je0.c.f14654d = new Je0.c(ozonTracker);
                        cVar2 = Je0.c.f14654d;
                    }
                }
                cVar3 = cVar2;
                if (cVar3 == null) {
                    return null;
                }
                Je0.c.d(cVar3, this.f36664g, Je0.e.STYLE_LOAD_TIME, null, new Long(kotlin.time.b.h(c10312c.getF102869b())), null, null, 112);
                return unit;
            }
            Je0.c.f14654d = null;
            cVar3 = null;
            if (cVar3 == null) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = this.f36661d;
            s.b(obj);
        }
        b11 = j11;
        Unit unit2 = Unit.f71690a;
        kotlin.time.f.f71986a.getClass();
        C10312c c10312c2 = new C10312c(unit2, kotlin.time.f.a(b11), null);
        ie0.g.f66321a.getClass();
        if (ie0.g.c() == null) {
        }
        cVar3 = null;
        if (cVar3 == null) {
        }
    }
}
