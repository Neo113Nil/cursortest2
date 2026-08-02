package P60;

import android.content.pm.PackageInfo;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.squareup.moshi.Moshi;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.installedapps.domain.WhiteListApps;
import ru.ozon.fintech.features.installedapps.models.AppPackage;
import ru.ozon.fintech.features.installedapps.models.ReceiverInfoCompact;
import ru.ozon.fintech.features.installedapps.models.ServiceInfoCompact;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f21877a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f21878b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f21879c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f21880d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.installedapps.domain.InstalledAppsInteractorImpl$getInstalledAppsByPermissions$2", f = "InstalledAppsInteractorImpl.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super List<? extends AppPackage>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f21881d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<String> f21883f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.installedapps.domain.InstalledAppsInteractorImpl$getInstalledAppsByPermissions$2$1", f = "InstalledAppsInteractorImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: P60.e$a$a, reason: collision with other inner class name */
        static final class C0432a extends kotlin.coroutines.jvm.internal.j implements Function2<PackageInfo, kotlin.coroutines.d<? super AppPackage>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f21884d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ e f21885e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<String> f21886f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0432a(e eVar, List<String> list, kotlin.coroutines.d<? super C0432a> dVar) {
                super(2, dVar);
                this.f21885e = eVar;
                this.f21886f = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0432a c0432a = new C0432a(this.f21885e, this.f21886f, dVar);
                c0432a.f21884d = obj;
                return c0432a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PackageInfo packageInfo, kotlin.coroutines.d<? super AppPackage> dVar) {
                return ((C0432a) create(packageInfo, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x010b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:12:0x003f->B:31:?, LOOP_END, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                boolean z11;
                boolean z12;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                PackageInfo packageInfo = (PackageInfo) this.f21884d;
                e eVar = this.f21885e;
                AppPackage e11 = e.e(eVar, packageInfo);
                if (e.d(eVar).contains(e11.getPackageName())) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(e11, "<this>");
                List<String> dangerList = this.f21886f;
                Intrinsics.checkNotNullParameter(dangerList, "dangerList");
                List<String> list = dangerList;
                boolean z13 = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        List<String> permission = e11.getPermission();
                        if (permission != null) {
                            List<String> list2 = permission;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (kotlin.text.h.t((String) it2.next(), str, true)) {
                                        break;
                                    }
                                }
                            }
                        }
                        List<ReceiverInfoCompact> declaredReceivers = e11.getDeclaredReceivers();
                        if (declaredReceivers != null) {
                            List<ReceiverInfoCompact> list3 = declaredReceivers;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator<T> it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    List<String> actions = ((ReceiverInfoCompact) it3.next()).getActions();
                                    if (actions != null) {
                                        List<String> list4 = actions;
                                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                            Iterator<T> it4 = list4.iterator();
                                            while (it4.hasNext()) {
                                                if (kotlin.text.h.t((String) it4.next(), str, true)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        List<ServiceInfoCompact> declaredServices = e11.getDeclaredServices();
                        if (declaredServices != null) {
                            List<ServiceInfoCompact> list5 = declaredServices;
                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                Iterator<T> it5 = list5.iterator();
                                while (it5.hasNext()) {
                                    String permission2 = ((ServiceInfoCompact) it5.next()).getPermission();
                                    if (permission2 != null ? kotlin.text.h.t(permission2, str, true) : false) {
                                        z11 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                            z12 = false;
                            if (!z12) {
                                z13 = true;
                                break;
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                    }
                }
                if (z13) {
                    return e11;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f21883f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(this.f21883f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends AppPackage>> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e eVar = e.this;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f21881d;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    List<PackageInfo> g10 = eVar.f21879c.g();
                    He.c a11 = C10720e0.a();
                    C0432a c0432a = new C0432a(eVar, this.f21883f, null);
                    this.f21881d = 1;
                    obj = N.d(new f(g10, a11, c0432a, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return (List) obj;
            } catch (Exception e11) {
                L80.a.c("InstalledApps", "Ошибка при получении списка приложений", e11);
                return K.f71697a;
            }
        }
    }

    public e(@NotNull Moshi mosh, @NotNull Q90.c featureToggles, @NotNull g installedAppsManager) {
        Intrinsics.checkNotNullParameter(mosh, "mosh");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(installedAppsManager, "installedAppsManager");
        this.f21877a = mosh;
        this.f21878b = featureToggles;
        this.f21879c = installedAppsManager;
        this.f21880d = Sc.k.a(Sc.n.PUBLICATION, new F90.d(this, 3));
    }

    public static List b(e eVar) {
        JSONObject dict = eVar.f21878b.q(S90.c.MOB_QUERY_APPS).b().getDict();
        if (dict != null) {
            String jSONObject = dict.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            WhiteListApps whiteListApps = (WhiteListApps) H30.q.a(eVar.f21877a, jSONObject, WhiteListApps.class);
            List<String> whitelist = whiteListApps != null ? whiteListApps.getWhitelist() : null;
            if (whitelist != null) {
                return whitelist;
            }
        }
        return K.f71697a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final List d(e eVar) {
        return (List) eVar.f21880d.getValue();
    }

    public static final AppPackage e(e eVar, PackageInfo packageInfo) {
        eVar.getClass();
        String packageName = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        g gVar = eVar.f21879c;
        String e11 = gVar.e(packageName);
        if (e11 == null) {
            e11 = "unknown";
        }
        return new AppPackage(gVar.m(packageInfo), packageName, packageInfo.versionName, gVar.a(packageInfo), packageInfo.firstInstallTime, packageInfo.lastUpdateTime, !r11.equals("com.android.vending"), gVar.c(packageInfo), e11, gVar.i(packageInfo), gVar.b(packageName), gVar.f(packageName));
    }

    @Override // P60.d
    public final Object a(@NotNull List<String> list, @NotNull kotlin.coroutines.d<? super List<AppPackage>> dVar) {
        return C10727i.f(C10720e0.a(), new a(list, null), dVar);
    }
}
