package Y50;

import P60.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.InstalledApps;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class c implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f34613a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f34614b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f34615c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f34616d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final r f34617e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final R30.a f34618f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.InstalledAppsBridgeInterface$handle$1", f = "InstalledAppsBridgeInterface.kt", l = {46}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        U50.j f34619d;

        /* renamed from: e, reason: collision with root package name */
        int f34620e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ U50.j f34621f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f34622g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U50.j jVar, c cVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f34621f = jVar;
            this.f34622g = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f34621f, this.f34622g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            U50.j jVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34620e;
            if (i11 == 0) {
                s.b(obj);
                U50.j jVar2 = this.f34621f;
                this.f34619d = jVar2;
                this.f34620e = 1;
                Object a11 = c.a(this.f34622g, this);
                if (a11 == aVar) {
                    return aVar;
                }
                jVar = jVar2;
                obj = a11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = this.f34619d;
                s.b(obj);
            }
            jVar.invoke(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.InstalledAppsBridgeInterface$handleSync$1", f = "InstalledAppsBridgeInterface.kt", l = {52}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super NativeResult>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34623d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super NativeResult> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34623d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            this.f34623d = 1;
            Object a11 = c.a(c.this, this);
            return a11 == aVar ? aVar : a11;
        }
    }

    public c(@NotNull Moshi moshi, @NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull r installedTargetAppsInteractor, @NotNull R30.a appCoroutineScopes) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(installedTargetAppsInteractor, "installedTargetAppsInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.f34613a = moshi;
        this.f34614b = featureToggles;
        this.f34615c = fintechSettings;
        this.f34616d = fintechAnalyticInteractor;
        this.f34617e = installedTargetAppsInteractor;
        this.f34618f = appCoroutineScopes;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:9)(2:24|25))(3:26|(1:28)(1:35)|(2:30|31)(2:32|(1:34)))|10|(2:13|11)|14|15|16|17|18|19))|36|6|(0)(0)|10|(1:11)|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        r0.printStackTrace();
        r0 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089 A[LOOP:0: B:11:0x0083->B:13:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        Y50.b bVar;
        int i11;
        Iterator it;
        cVar.getClass();
        if (cVar2 instanceof Y50.b) {
            bVar = (Y50.b) cVar2;
            int i12 = bVar.f34612g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f34612g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f34610e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f34612g;
                if (i11 != 0) {
                    s.b(obj);
                    if (!(Tl.a.f(cVar.f34614b, S90.c.MOB_DISCLOSURE_SCREEN) ? Intrinsics.d(cVar.f34615c.o(), Boolean.TRUE) : true)) {
                        L80.a.a("InstalledBanksAppsBridgeInterface", "Disabled by toggle");
                        return new NativeResult.Error("Disabled by toggle", NativeResult.Error.a.IS_NOT_AVAILABLE);
                    }
                    bVar.f34609d = cVar;
                    bVar.f34612g = 1;
                    obj = cVar.f34617e.a(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = bVar.f34609d;
                    s.b(obj);
                }
                List list = (List) obj;
                Moshi moshi = cVar.f34613a;
                List list2 = list;
                ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                String str = moshi.c(InstalledApps.class).toJson(new InstalledApps(arrayList));
                NativeResult.Success success = new NativeResult.Success(str);
                cVar.f34616d.k(new Integer(list.size()));
                return success;
            }
        }
        bVar = new Y50.b(cVar, cVar2);
        Object obj2 = bVar.f34610e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f34612g;
        if (i11 != 0) {
        }
        List list3 = (List) obj2;
        Moshi moshi2 = cVar.f34613a;
        List list22 = list3;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        String str2 = moshi2.c(InstalledApps.class).toJson(new InstalledApps(arrayList2));
        NativeResult.Success success2 = new NativeResult.Success(str2);
        cVar.f34616d.k(new Integer(list3.size()));
        return success2;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_installed_apps";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C10727i.c(this.f34618f.b(), null, null, new a((U50.j) callback, this, null), 3);
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return (NativeResult) C10727i.d(g.f71771a, new b(null));
    }
}
