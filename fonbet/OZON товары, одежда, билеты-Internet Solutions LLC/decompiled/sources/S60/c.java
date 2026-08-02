package S60;

import E0.C2942q;
import G.g;
import H30.x;
import L30.n;
import Sc.s;
import T60.a;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.recyclerview.widget.m;
import c30.i;
import c30.j;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import r90.InterfaceC9218a;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;
import ru.ozon.fintech.features.metrix.data.DeviceInfo;
import ru.ozon.fintech.features.metrix.data.Event;
import ru.ozon.fintech.features.metrix.data.Geopoint;
import ru.ozon.fintech.features.metrix.data.MetrixDto;
import ru.ozon.fintech.features.metrix.network.FintechMetrixNetwork;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.AuthPinpad;
import s90.C9632a;
import s90.C9633b;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class c implements S60.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f25959a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final FintechMetrixNetwork f25960b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q90.c f25961c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final PowerManagerRepository f25962d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final DeviceInfoManager f25963e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final R30.a f25964f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final i f25965g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final j f25966h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC9218a f25967i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private Date f25968j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private ArrayList f25969k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25970l;

    @e(c = "ru.ozon.fintech.features.metrix.domain.FintechMetrixInteractorImpl$sendMetrixDtos$1", f = "FintechMetrixInteractorImpl.kt", l = {107, 116}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f25971d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<Event> f25973f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ double f25974g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ double f25975h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f25976i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f25977j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f25978k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f25979l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f25980m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f25981n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f25982o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f25983p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<Event> list, double d11, double d12, int i11, String str, String str2, String str3, String str4, boolean z11, long j11, String str5, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f25973f = list;
            this.f25974g = d11;
            this.f25975h = d12;
            this.f25976i = i11;
            this.f25977j = str;
            this.f25978k = str2;
            this.f25979l = str3;
            this.f25980m = str4;
            this.f25981n = z11;
            this.f25982o = j11;
            this.f25983p = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            String str = this.f25983p;
            return c.this.new a(this.f25973f, this.f25974g, this.f25975h, this.f25976i, this.f25977j, this.f25978k, this.f25979l, this.f25980m, this.f25981n, this.f25982o, str, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
        
            if (r2.sendMetrix(r14, r25) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0033, code lost:
        
            if (r2 == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object c11;
            Event copy;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f25971d;
            c cVar = c.this;
            try {
            } catch (Exception e11) {
                L80.a.b("FintechMetrixInteractorImpl", "Error send metrix e=" + e11);
            }
            if (i11 == 0) {
                s.b(obj);
                i iVar = cVar.f25965g;
                this.f25971d = 1;
                c11 = iVar.c(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                c11 = obj;
            }
            i.a aVar2 = (i.a) c11;
            List<Event> list = this.f25973f;
            boolean z11 = this.f25981n;
            long j11 = this.f25982o;
            String str = this.f25983p;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                copy = r10.copy((r28 & 1) != 0 ? r10.deviceTime : null, (r28 & 2) != 0 ? r10.eventName : null, (r28 & 4) != 0 ? r10.geopoint : new Geopoint(new Double(aVar2.b()), new Double(aVar2.c())), (r28 & 8) != 0 ? r10.network : str, (r28 & 16) != 0 ? r10.url : null, (r28 & 32) != 0 ? r10.entryType : null, (r28 & 64) != 0 ? r10.timingType : null, (r28 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r10.duration : z11 ? j11 : 0L, (r28 & 256) != 0 ? r10.responseStatus : 0, (r28 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r10.deliveryType : null, (r28 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? ((Event) it.next()).fetchStart : 0L);
                arrayList2.add(copy);
                arrayList = arrayList2;
            }
            FintechMetrixNetwork fintechMetrixNetwork = cVar.f25960b;
            MetrixDto metrixDto = new MetrixDto(String.valueOf(cVar.f25959a.getAppO3Name()), this.f25978k, new DeviceInfo(this.f25976i, (int) this.f25974g, this.f25977j, false, (int) this.f25975h), null, arrayList, true, "android", this.f25979l, cVar.f25959a.j(), this.f25980m);
            this.f25971d = 2;
        }
    }

    public c(@NotNull Context context, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull FintechMetrixNetwork metrixNetwork, @NotNull Q90.c featureToggles, @NotNull PowerManagerRepository powerManagerRepository, @NotNull DeviceInfoManager deviceInfoManager, @NotNull R30.a appCoroutineScopes, @NotNull i locationProvider, @NotNull j networkInfoProvider, @NotNull InterfaceC9218a fintechPermissionManager, @NotNull C9633b accessFineLocationPermission, @NotNull C9632a accessCoarseLocationPermission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(metrixNetwork, "metrixNetwork");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(powerManagerRepository, "powerManagerRepository");
        Intrinsics.checkNotNullParameter(deviceInfoManager, "deviceInfoManager");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(accessFineLocationPermission, "accessFineLocationPermission");
        Intrinsics.checkNotNullParameter(accessCoarseLocationPermission, "accessCoarseLocationPermission");
        this.f25959a = fintechSettings;
        this.f25960b = metrixNetwork;
        this.f25961c = featureToggles;
        this.f25962d = powerManagerRepository;
        this.f25963e = deviceInfoManager;
        this.f25964f = appCoroutineScopes;
        this.f25965g = locationProvider;
        this.f25966h = networkInfoProvider;
        this.f25967i = fintechPermissionManager;
        this.f25968j = new Date();
        this.f25969k = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(String str, List list, boolean z11) {
        String str2;
        Date a11 = n.a();
        ru.ozon.fintech.settings.domain.a aVar = this.f25959a;
        long time = aVar.isStandAloneIntegration() ? a11.getTime() - this.f25968j.getTime() : 0L;
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String str3 = BRAND + " " + MODEL;
        DeviceInfoManager deviceInfoManager = this.f25963e;
        List<Long> frequencies = deviceInfoManager.getHardwareInfo().getCpu().getFrequencies();
        Intrinsics.checkNotNullParameter(frequencies, "<this>");
        Iterator<T> it = frequencies.iterator();
        int i11 = 0;
        double d11 = 0.0d;
        while (it.hasNext()) {
            d11 += ((Number) it.next()).longValue();
            i11++;
            if (i11 < 0) {
                C7714v.N0();
                throw null;
            }
        }
        double d12 = (i11 == 0 ? Double.NaN : d11 / i11) / 1000;
        double ceil = Math.ceil(deviceInfoManager.getHardwareInfo().getTotalRam() != null ? r0.longValue() / 1.073741824E9d : 0.0d);
        int batteryCharge = this.f25962d.getBatteryCharge();
        String str4 = Build.VERSION.RELEASE;
        Intrinsics.f(str4);
        List m11 = h.m(str4, new String[]{"."}, 0, 6);
        String str5 = (String) C7714v.Q(0, m11);
        if (str5 == null) {
            str5 = "0";
        }
        String str6 = (String) C7714v.Q(1, m11);
        String c11 = g.c(str5, ".", str6 != null ? str6 : "0");
        String b11 = this.f25966h.b();
        MatchResult b12 = new Regex("\\d+\\.\\d+\\.\\d+").b(0, aVar.getVersionName());
        if (b12 == null || (str2 = b12.getValue()) == null) {
            str2 = "0.0.0";
        }
        C10727i.c(this.f25964f.b(), null, null, new a(list, d12, ceil, batteryCharge, str3, str2, c11, str, z11, time, b11, null), 3);
    }

    @Override // S60.a
    public final void a(@NotNull T60.a startEvent) {
        boolean z11;
        Object obj;
        Object obj2;
        AuthPinpad authPinpad;
        int i11;
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        L80.a.a("PINMETRIX", "sendMetrixStartTimeEvent startEventsProcessed=" + this.f25970l + " startEvent=" + startEvent);
        if (this.f25970l) {
            return;
        }
        ArrayList arrayList = this.f25969k;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((T60.a) it.next()).getClass() == startEvent.getClass()) {
                    return;
                }
            }
        }
        arrayList.add(startEvent);
        L80.a.a("PINMETRIX", "mayBeProcessStartEvents");
        if (!(C7714v.Z(arrayList) instanceof a.h) || this.f25970l) {
            return;
        }
        this.f25970l = true;
        while (true) {
            for (kotlin.reflect.d dVar : N.b(T60.a.class).m()) {
                if (arrayList.isEmpty()) {
                    i11 = 0;
                } else {
                    Iterator it2 = arrayList.iterator();
                    i11 = 0;
                    while (it2.hasNext()) {
                        if (dVar.A((T60.a) it2.next()) && (i11 = i11 + 1) < 0) {
                            C7714v.N0();
                            throw null;
                        }
                    }
                }
                z11 = i11 == 1 && z11;
            }
            S90.c cVar = S90.c.MOB_METRIX_START_TIME;
            Q90.c cVar2 = this.f25961c;
            JSONObject dict = cVar2.q(cVar).b().getDict();
            long j11 = dict != null ? dict.getLong("maxDelay") : 0L;
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (((T60.a) obj) instanceof a.f) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            T60.a aVar = (T60.a) obj;
            long a11 = aVar != null ? aVar.a() : 0L;
            boolean z12 = System.currentTimeMillis() - a11 < j11;
            StringBuilder sb2 = new StringBuilder("ensureStartFlow justOne=");
            sb2.append(z11);
            sb2.append(" maxDelay=");
            sb2.append(j11);
            C2942q.f(sb2, " processStartTime=", a11, " timePassedOk=");
            sb2.append(z12);
            L80.a.a("PINMETRIX", sb2.toString());
            if (z11 && z12) {
                AppConfig n11 = cVar2.n();
                boolean z13 = (n11 == null || (authPinpad = n11.getAuthPinpad()) == null || !authPinpad.getShowPinpad()) ? false : true;
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj2 = it4.next();
                        if (((T60.a) obj2) instanceof a.f) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                T60.a aVar2 = (T60.a) obj2;
                Long valueOf = aVar2 != null ? Long.valueOf(aVar2.a()) : null;
                L80.a.a("PINMETRIX", "mayBeProcessStartEvents ensureStartFlow==true isNative=" + z13 + " processStartTime=" + valueOf);
                if (valueOf != null) {
                    String b11 = n.b();
                    ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(((T60.a) it5.next()).c(valueOf.longValue(), b11));
                    }
                    C10727i.c(this.f25964f.b(), null, null, new b(this, arrayList2, z13, null), 3);
                    return;
                }
                return;
            }
            return;
        }
    }

    @Override // S60.a
    public final void b(String str) {
        if (Tl.a.f(this.f25961c, S90.c.MOB_METRIX_TRACKER)) {
            i("native", C7714v.a0(new Event(n.b(), "on_bank_tab_open", new Geopoint(Double.valueOf(0.0d), Double.valueOf(0.0d)), "", String.valueOf(str), "navigate", "navigate", 0L, m.e.DEFAULT_DRAG_ANIMATION_DURATION, "unknown", 0L)), true);
        }
    }

    @Override // S60.a
    public final boolean c(String str) {
        Uri e11;
        JSONObject dict = this.f25961c.q(S90.c.MOB_METRIX_START_TIME).b().getDict();
        String str2 = null;
        String string = dict != null ? dict.getString("webPinPadPath") : null;
        if (str != null && (e11 = x.e(str)) != null) {
            str2 = x.b(e11);
        }
        return (str2 == null || string == null || !str2.equals(string)) ? false : true;
    }

    @Override // S60.a
    public final void d(@NotNull Date initAppDate) {
        Intrinsics.checkNotNullParameter(initAppDate, "initAppDate");
        this.f25968j = initAppDate;
    }
}
