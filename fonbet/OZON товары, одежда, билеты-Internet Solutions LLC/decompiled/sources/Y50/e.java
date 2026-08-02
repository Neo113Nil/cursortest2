package Y50;

import P60.n;
import P60.o;
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
public final class e implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f34629a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f34630b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f34631c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f34632d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final o f34633e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final R30.a f34634f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.InstalledBanksAppsBridgeInterface$handle$1", f = "InstalledBanksAppsBridgeInterface.kt", l = {47}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        U50.j f34635d;

        /* renamed from: e, reason: collision with root package name */
        int f34636e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ U50.j f34637f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f34638g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U50.j jVar, e eVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f34637f = jVar;
            this.f34638g = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f34637f, this.f34638g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            U50.j jVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34636e;
            if (i11 == 0) {
                s.b(obj);
                U50.j jVar2 = this.f34637f;
                this.f34635d = jVar2;
                this.f34636e = 1;
                Object a11 = e.a(this.f34638g, this);
                if (a11 == aVar) {
                    return aVar;
                }
                jVar = jVar2;
                obj = a11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = this.f34635d;
                s.b(obj);
            }
            jVar.invoke(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.InstalledBanksAppsBridgeInterface$handleSync$1", f = "InstalledBanksAppsBridgeInterface.kt", l = {53}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super NativeResult>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34639d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super NativeResult> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34639d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            this.f34639d = 1;
            Object a11 = e.a(e.this, this);
            return a11 == aVar ? aVar : a11;
        }
    }

    public e(@NotNull Moshi moshi, @NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull o installedBankAppsInteractor, @NotNull R30.a appCoroutineScopes) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(installedBankAppsInteractor, "installedBankAppsInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.f34629a = moshi;
        this.f34630b = featureToggles;
        this.f34631c = fintechSettings;
        this.f34632d = fintechAnalyticInteractor;
        this.f34633e = installedBankAppsInteractor;
        this.f34634f = appCoroutineScopes;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:9)(2:24|25))(3:26|(1:28)(1:35)|(2:30|31)(2:32|(1:34)))|10|(2:13|11)|14|15|16|17|18|19))|36|6|(0)(0)|10|(1:11)|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        r0.printStackTrace();
        r0 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089 A[LOOP:0: B:11:0x0083->B:13:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        Iterator it;
        eVar.getClass();
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f34628g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f34628g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f34626e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f34628g;
                if (i11 != 0) {
                    s.b(obj);
                    if (!(Tl.a.f(eVar.f34630b, S90.c.MOB_DISCLOSURE_SCREEN) ? Intrinsics.d(eVar.f34631c.o(), Boolean.TRUE) : true)) {
                        L80.a.a("InstalledBanksAppsBridgeInterface", "Disabled by toggle");
                        return new NativeResult.Error("Disabled by toggle", NativeResult.Error.a.IS_NOT_AVAILABLE);
                    }
                    dVar.f34625d = eVar;
                    dVar.f34628g = 1;
                    obj = eVar.f34633e.a(dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = dVar.f34625d;
                    s.b(obj);
                }
                List list = (List) obj;
                Moshi moshi = eVar.f34629a;
                List list2 = list;
                ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((n) it.next()).e());
                }
                String str = moshi.c(InstalledApps.class).toJson(new InstalledApps(arrayList));
                NativeResult.Success success = new NativeResult.Success(str);
                eVar.f34632d.O1(new Integer(list.size()));
                return success;
            }
        }
        dVar = new d(eVar, cVar);
        Object obj2 = dVar.f34626e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f34628g;
        if (i11 != 0) {
        }
        List list3 = (List) obj2;
        Moshi moshi2 = eVar.f34629a;
        List list22 = list3;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        String str2 = moshi2.c(InstalledApps.class).toJson(new InstalledApps(arrayList2));
        NativeResult.Success success2 = new NativeResult.Success(str2);
        eVar.f34632d.O1(new Integer(list3.size()));
        return success2;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_installed_bank_apps";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C10727i.c(this.f34634f.b(), null, null, new a((U50.j) callback, this, null), 3);
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return (NativeResult) C10727i.d(g.f71771a, new b(null));
    }
}
