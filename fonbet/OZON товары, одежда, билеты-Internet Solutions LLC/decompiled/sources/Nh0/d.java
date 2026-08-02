package Nh0;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import We.M;
import Wh0.d;
import Zg0.d;
import Zg0.g;
import ch.InterfaceC5830a;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import dh0.C6200a;
import gh0.InterfaceC6738d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import jh0.C7429a;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ph0.f;
import ph0.h;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.push.sdk.external.liveactivity.model.LiveActivitySelector;
import ru.ozon.push.sdk.internal.token.api.TokenApi;
import ru.ozon.push.sdk.internal.token.api.TokenUpdateRequest;
import wh0.C10562a;
import xe.C10727i;

/* loaded from: classes7.dex */
public final class d implements Nh0.b, Nh0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TokenApi f19568a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ph0.b f19569b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final oh0.d f19570c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Oh0.a f19571d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final g f19572e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Rh0.b f19573f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final oh0.c f19574g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final th0.g f19575h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final DeviceInfoManager f19576i;

    /* renamed from: j, reason: collision with root package name */
    private final h f19577j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC5830a f19578k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f19579l;

    /* renamed from: m, reason: collision with root package name */
    private final ExecutorService f19580m;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7429a f19582c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f19583d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7429a c7429a, Boolean bool) {
            super(0);
            this.f19582c = c7429a;
            this.f19583d = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            f fVar;
            f fVar2;
            C7429a c7429a = this.f19582c;
            d dVar = d.this;
            if (!d.d(dVar, c7429a)) {
                if (c7429a.a().length() > 0 && (fVar2 = dVar.f19577j) != null) {
                    ((h) fVar2).g(c7429a.a());
                }
                List<C7429a> h11 = dVar.h();
                ArrayList arrayList = new ArrayList();
                for (Object obj : h11) {
                    if (((C7429a) obj).b() != c7429a.b()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(d.e(dVar, (C7429a) it.next()));
                }
                arrayList2.add(d.e(dVar, c7429a));
                d.c(dVar, arrayList2, true, this.f19583d);
                if (c7429a.a().length() > 0 && (fVar = dVar.f19577j) != null) {
                    ((h) fVar).f(c7429a.a());
                }
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC6738d.a> f19585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f19586d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Boolean f19587e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ jh0.c f19588f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<InterfaceC6738d.a> list, boolean z11, Boolean bool, jh0.c cVar) {
            super(0);
            this.f19585c = list;
            this.f19586d = z11;
            this.f19587e = bool;
            this.f19588f = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<InterfaceC6738d.a> list;
            Throwable a11;
            d dVar = d.this;
            List<C7429a> h11 = dVar.h();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = h11.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                list = this.f19585c;
                if (!hasNext) {
                    break;
                }
                Object next = it.next();
                C7429a c7429a = (C7429a) next;
                List<InterfaceC6738d.a> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((InterfaceC6738d.a) it2.next()).a() == c7429a.b()) {
                            break;
                        }
                    }
                }
                arrayList.add(next);
            }
            ArrayList W02 = C7714v.W0(list);
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C7429a) it3.next()).b());
                }
                String V11 = C7714v.V(arrayList2, null, null, null, null, 63);
                Zg0.d b11 = C6200a.b();
                if (b11 instanceof d.b) {
                    C6200a.c().a(C6200a.a(V11 + " saved push token(s) wasn't received from provider(s), so we need to send empty value for this token(s)."), null);
                    ((d.b) b11).getClass();
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                W02.add(new InterfaceC6738d.a(((C7429a) it4.next()).b(), this.f19588f, new d.a(null)));
            }
            Wh0.d c11 = d.c(dVar, W02, this.f19586d, this.f19587e);
            if (!(c11 instanceof d.a) || (a11 = ((d.a) c11).a()) == null) {
                return Unit.f71690a;
            }
            throw a11;
        }
    }

    public d(@NotNull TokenApi api, @NotNull Ph0.b workManagerDelegate, @NotNull oh0.d notificationAvailabilityChecker, @NotNull Oh0.a pushTokensStorage, @NotNull g configuration, @NotNull Rh0.b appInstanceIdRepository, @NotNull Lh0.a liveActivitySelectorToMapConverter, @NotNull oh0.c notificationAvailabilityCacheRepository, @NotNull th0.g incorrectMigrationLogger, @NotNull DeviceInfoManager deviceInfoManager, h hVar, InterfaceC5830a interfaceC5830a) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(workManagerDelegate, "workManagerDelegate");
        Intrinsics.checkNotNullParameter(notificationAvailabilityChecker, "notificationAvailabilityChecker");
        Intrinsics.checkNotNullParameter(pushTokensStorage, "pushTokensStorage");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(appInstanceIdRepository, "appInstanceIdRepository");
        Intrinsics.checkNotNullParameter(liveActivitySelectorToMapConverter, "liveActivitySelectorToMapConverter");
        Intrinsics.checkNotNullParameter(notificationAvailabilityCacheRepository, "notificationAvailabilityCacheRepository");
        Intrinsics.checkNotNullParameter(incorrectMigrationLogger, "incorrectMigrationLogger");
        Intrinsics.checkNotNullParameter(deviceInfoManager, "deviceInfoManager");
        this.f19568a = api;
        this.f19569b = workManagerDelegate;
        this.f19570c = notificationAvailabilityChecker;
        this.f19571d = pushTokensStorage;
        this.f19572e = configuration;
        this.f19573f = appInstanceIdRepository;
        this.f19574g = notificationAvailabilityCacheRepository;
        this.f19575h = incorrectMigrationLogger;
        this.f19576i = deviceInfoManager;
        this.f19577j = hVar;
        this.f19578k = interfaceC5830a;
        this.f19579l = k.b(e.f19589b);
        this.f19580m = Executors.newSingleThreadExecutor();
    }

    public static final Wh0.d c(d dVar, ArrayList arrayList, boolean z11, Boolean bool) {
        dVar.getClass();
        try {
            Response g10 = dVar.g(arrayList, bool);
            if (!g10.isSuccessful()) {
                throw new HttpException(g10);
            }
            Zg0.d b11 = C6200a.b();
            if (b11 instanceof d.b) {
                C6200a.c().a(C6200a.a("Push tokens were successfully sent."), null);
                ((d.b) b11).getClass();
            }
            dVar.o(arrayList);
            j(arrayList);
            return new d.b(Unit.f71690a);
        } catch (Exception e11) {
            if (z11) {
                dVar.f19569b.a(arrayList);
            }
            HttpException i11 = i(e11);
            Response<?> response = i11 != null ? i11.response() : null;
            boolean z12 = false;
            if (response != null && response.code() == 403) {
                M errorBody = response.errorBody();
                String string = errorBody != null ? errorBody.string() : null;
                if (string == null) {
                    string = "";
                }
                z12 = kotlin.text.h.t(string, "incidentId", false);
            }
            if (z12) {
                return new d.b(Unit.f71690a);
            }
            Zg0.d b12 = C6200a.b();
            if (b12 instanceof d.b) {
                C6200a.c().a(C6200a.a("Push tokens weren't sent. See exception for details."), e11);
                ((d.b) b12).getClass();
            }
            return new d.a(e11);
        }
    }

    public static final boolean d(d dVar, C7429a c7429a) {
        Oh0.a aVar = dVar.f19571d;
        return aVar.b() && aVar.c(c7429a);
    }

    public static final InterfaceC6738d.a e(d dVar, C7429a c7429a) {
        dVar.getClass();
        return new InterfaceC6738d.a(c7429a.b(), c7429a.c(), new d.b(c7429a));
    }

    private final void f(TokenUpdateRequest tokenUpdateRequest, Response<Unit> response) {
        if (response.isSuccessful()) {
            g gVar = this.f19572e;
            boolean h11 = gVar.h();
            String hwid = tokenUpdateRequest.getHwid();
            String oldHwId = tokenUpdateRequest.getOldHwId();
            this.f19573f.b(hwid, tokenUpdateRequest.getTokens(), oldHwId, h11);
            if (gVar.g()) {
                this.f19575h.b(tokenUpdateRequest.getHwid(), tokenUpdateRequest.getOldHwId(), tokenUpdateRequest.getTokens());
            }
        }
    }

    private static HttpException i(Throwable th2) {
        if (th2 instanceof HttpException) {
            return (HttpException) th2;
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            return i(cause);
        }
        return null;
    }

    private static void j(ArrayList arrayList) {
        Object obj;
        C7429a c7429a;
        if (C6200a.b() instanceof d.b) {
            for (jh0.b bVar : jh0.b.getEntries()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((InterfaceC6738d.a) obj).a() == bVar) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                InterfaceC6738d.a aVar = (InterfaceC6738d.a) obj;
                Wh0.d<C7429a> b11 = aVar != null ? aVar.b() : null;
                d.b bVar2 = b11 instanceof d.b ? (d.b) b11 : null;
                String a11 = (bVar2 == null || (c7429a = (C7429a) bVar2.a()) == null) ? null : c7429a.a();
                Zg0.d b12 = C6200a.b();
                if (b12 instanceof d.b) {
                    StringBuilder sb2 = new StringBuilder("OzonPushSDK - ");
                    sb2.append(bVar.getValue());
                    sb2.append(": ");
                    if (a11 == null) {
                        a11 = DevicePublicKeyStringDef.NONE;
                    }
                    sb2.append(a11);
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    C6200a.c().a(C6200a.a(sb3), null);
                    ((d.b) b12).getClass();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TokenUpdateRequest k(ArrayList arrayList, LinkedHashMap linkedHashMap, Boolean bool) {
        K k11;
        int i11;
        TokenUpdateRequest.TokenInfo.a aVar;
        Iterator it;
        C10562a c10562a;
        String str;
        int i12 = 1;
        Rh0.b bVar = this.f19573f;
        g gVar = this.f19572e;
        C10562a d11 = bVar.d(gVar);
        oh0.d dVar = this.f19570c;
        boolean a11 = dVar.a();
        String a12 = d11.a();
        String b11 = d11.b();
        TokenUpdateRequest.ApplicationInfo applicationInfo = new TokenUpdateRequest.ApplicationInfo(gVar.c(), "ANDROID", gVar.a());
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                int intValue = ((Number) this.f19579l.getValue()).intValue();
                TokenUpdateRequest.a.INSTANCE.getClass();
                TokenUpdateRequest.a aVar2 = a11 ? TokenUpdateRequest.a.ENABLED : TokenUpdateRequest.a.DISABLED;
                if (a11) {
                    ArrayList m02 = C7714v.m0(TokenUpdateRequest.b.NOTIFICATION_CENTER);
                    if (dVar.b()) {
                        m02.add(TokenUpdateRequest.b.SOUND);
                    }
                    Unit unit = Unit.f71690a;
                    k11 = m02;
                } else {
                    k11 = K.f71697a;
                }
                return new TokenUpdateRequest(a12, b11, applicationInfo, hashSet, intValue, aVar2, k11, this.f19576i.getDeviceModel(), ((Number) C10727i.d(kotlin.coroutines.g.f71771a, new c(this, null))).intValue(), bool);
            }
            InterfaceC6738d.a aVar3 = (InterfaceC6738d.a) it2.next();
            Wh0.d<C7429a> b12 = aVar3.b();
            C7429a c7429a = b12 instanceof d.b ? (C7429a) ((d.b) b12).a() : null;
            String a13 = c7429a != null ? c7429a.a() : null;
            String str2 = a13 == null ? "" : a13;
            TokenUpdateRequest.TokenInfo.a.Companion companion = TokenUpdateRequest.TokenInfo.a.INSTANCE;
            jh0.b pushTokenType = aVar3.a();
            companion.getClass();
            Intrinsics.checkNotNullParameter(pushTokenType, "pushTokenType");
            int i13 = TokenUpdateRequest.TokenInfo.a.Companion.C2144a.f97712a[pushTokenType.ordinal()];
            if (i13 == i12) {
                i11 = i12;
                aVar = TokenUpdateRequest.TokenInfo.a.FCM;
            } else if (i13 != 2) {
                i11 = i12;
                if (i13 != 3) {
                    throw new o();
                }
                aVar = TokenUpdateRequest.TokenInfo.a.RUSTORE;
            } else {
                i11 = i12;
                aVar = TokenUpdateRequest.TokenInfo.a.HMS;
            }
            TokenUpdateRequest.TokenInfo.a aVar4 = aVar;
            String e11 = U7.d.e(d11.a(), str2);
            if (e11 == null) {
                it = it2;
                c10562a = d11;
            } else {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bytes = e11.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    messageDigest.update(bytes);
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb2 = new StringBuilder();
                    int length = digest.length;
                    int i14 = 0;
                    while (i14 < length) {
                        int i15 = i14;
                        it = it2;
                        try {
                            StringBuilder sb3 = new StringBuilder(Integer.toHexString(digest[i15] & 255));
                            while (true) {
                                c10562a = d11;
                                if (sb3.length() < 2) {
                                    try {
                                        sb3.insert(0, "0");
                                        d11 = c10562a;
                                    } catch (NoSuchAlgorithmException e12) {
                                        e = e12;
                                        Lm0.a.f17149a.e(e);
                                        str = "";
                                        hashSet.add(new TokenUpdateRequest.TokenInfo(str2, aVar4, str, aVar3.c(), linkedHashMap, 0, 32, null));
                                        i12 = i11;
                                        it2 = it;
                                        d11 = c10562a;
                                    }
                                }
                            }
                            sb2.append((CharSequence) sb3);
                            i14 = i15 + 1;
                            it2 = it;
                            d11 = c10562a;
                        } catch (NoSuchAlgorithmException e13) {
                            e = e13;
                            c10562a = d11;
                            Lm0.a.f17149a.e(e);
                            str = "";
                            hashSet.add(new TokenUpdateRequest.TokenInfo(str2, aVar4, str, aVar3.c(), linkedHashMap, 0, 32, null));
                            i12 = i11;
                            it2 = it;
                            d11 = c10562a;
                        }
                    }
                    it = it2;
                    c10562a = d11;
                    String sb4 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                    str = sb4;
                } catch (NoSuchAlgorithmException e14) {
                    e = e14;
                    it = it2;
                }
                hashSet.add(new TokenUpdateRequest.TokenInfo(str2, aVar4, str, aVar3.c(), linkedHashMap, 0, 32, null));
                i12 = i11;
                it2 = it;
                d11 = c10562a;
            }
            str = "";
            hashSet.add(new TokenUpdateRequest.TokenInfo(str2, aVar4, str, aVar3.c(), linkedHashMap, 0, 32, null));
            i12 = i11;
            it2 = it;
            d11 = c10562a;
        }
    }

    @NotNull
    public final Response g(@NotNull ArrayList pushTokensUpdatesResults, Boolean bool) {
        Intrinsics.checkNotNullParameter(pushTokensUpdatesResults, "pushTokensUpdatesResults");
        TokenUpdateRequest k11 = k(pushTokensUpdatesResults, null, bool);
        Response<Unit> execute = this.f19568a.updateToken(k11).execute();
        boolean z11 = !k11.getPermissions().isEmpty();
        oh0.c cVar = this.f19574g;
        cVar.c(z11);
        cVar.d(k11.getMicrophonePermission());
        Intrinsics.f(execute);
        f(k11, execute);
        Intrinsics.checkNotNullExpressionValue(execute, "also(...)");
        return execute;
    }

    @NotNull
    public final List<C7429a> h() {
        return this.f19571d.a();
    }

    public final Unit l(@NotNull LiveActivitySelector selector, @NotNull ArrayList arrayList, Boolean bool) {
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7429a c7429a = (C7429a) it.next();
            arrayList2.add(new InterfaceC6738d.a(c7429a.b(), c7429a.c(), new d.b(c7429a)));
        }
        Intrinsics.checkNotNullParameter(selector, "selector");
        LinkedHashMap u11 = U.u(selector.a());
        u11.put("widgetName", selector.getF97685a());
        TokenUpdateRequest k11 = k(arrayList2, u11, bool);
        Response<Unit> execute = this.f19568a.updateToken(k11).execute();
        Intrinsics.f(execute);
        f(k11, execute);
        return Unit.f71690a;
    }

    @NotNull
    public final CompletableFuture<Unit> m(@NotNull List<InterfaceC6738d.a> pushTokensUpdatesResults, @NotNull jh0.c updateTrigger, boolean z11, Boolean bool) {
        Intrinsics.checkNotNullParameter(pushTokensUpdatesResults, "pushTokensUpdatesResults");
        Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
        ExecutorService executor = this.f19580m;
        Intrinsics.checkNotNullExpressionValue(executor, "executor");
        final b supplier = new b(pushTokensUpdatesResults, z11, bool, updateTrigger);
        int i11 = Wh0.c.f33873b;
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        CompletableFuture<Unit> supplyAsync = CompletableFuture.supplyAsync(new Supplier() { // from class: Wh0.a
            @Override // java.util.function.Supplier
            public final Object get() {
                return Function0.this.invoke();
            }
        }, executor);
        Intrinsics.checkNotNullExpressionValue(supplyAsync, "supplyAsync(...)");
        return supplyAsync;
    }

    public final void n(@NotNull C7429a updatedPushToken, Boolean bool) {
        Intrinsics.checkNotNullParameter(updatedPushToken, "updatedPushToken");
        ExecutorService executor = this.f19580m;
        Intrinsics.checkNotNullExpressionValue(executor, "executor");
        a callable = new a(updatedPushToken, bool);
        int i11 = Wh0.c.f33873b;
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullExpressionValue(executor.submit(new Wh0.b(callable)), "submit(...)");
    }

    public final void o(@NotNull ArrayList pushTokensUpdatesResults) {
        Intrinsics.checkNotNullParameter(pushTokensUpdatesResults, "pushTokensUpdatesResults");
        this.f19571d.e(pushTokensUpdatesResults);
    }
}
