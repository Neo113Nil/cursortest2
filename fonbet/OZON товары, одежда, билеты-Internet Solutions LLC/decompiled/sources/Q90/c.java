package Q90;

import Ae.O0;
import Ae.x0;
import Q90.a;
import Sc.C4001c;
import Sc.s;
import We.M;
import We.z;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.AppConfigTab;
import ru.ozon.fintech.settings.models.AuthPinpad;
import ru.ozon.fintech.settings.models.FeatureFlag;
import ru.ozon.fintech.settings.models.FeatureFlagsRequest;
import ru.ozon.fintech.settings.models.FeatureValue;
import ru.ozon.fintech.settings.models.FilterRequest;
import ru.ozon.fintech.settings.network.AuthPinpadNetwork;
import xe.f1;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final Object f23053o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final Object f23054p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap f23055q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final HashMap f23056r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f23057s = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T90.a f23058a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ExternalFintechSettings f23059b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f23060c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AuthPinpadNetwork f23061d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f23062e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final O30.b f23063f;

    /* renamed from: g, reason: collision with root package name */
    private AppConfig f23064g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<AppConfig> f23065h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23066i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final JsonAdapter<List<FeatureFlag>> f23067j;

    /* renamed from: k, reason: collision with root package name */
    private String f23068k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final JsonAdapter<FeatureFlagsRequest> f23069l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Map<S90.c, S90.a> f23070m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private volatile LinkedHashMap f23071n;

    public static final class a {
        public static final Moshi a() {
            return (Moshi) c.f23053o.getValue();
        }

        @NotNull
        public static S90.a d(@NotNull S90.c featureName, @NotNull O30.b fintechLibType) {
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
            Map map = (Map) c.f23055q.get(fintechLibType);
            S90.a aVar = map != null ? (S90.a) map.get(featureName) : null;
            return aVar == null ? new S90.a(featureName, featureName.a()) : aVar;
        }

        public static void e(@NotNull SharedPreferences sharedPreferences, @NotNull O30.b fintechLibType) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
            k.b(sharedPreferences, fintechLibType);
            if (c.f23055q.get(fintechLibType) == null) {
                c.f23055q.put(fintechLibType, f(fintechLibType));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:3:0x000c, B:5:0x0018, B:9:0x0025, B:11:0x0028, B:12:0x002e, B:14:0x003f, B:16:0x0056, B:17:0x005c, B:19:0x0062, B:24:0x006e, B:29:0x007c, B:31:0x0088, B:33:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00cc, B:50:0x00d2, B:54:0x00e4, B:59:0x0083), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:3:0x000c, B:5:0x0018, B:9:0x0025, B:11:0x0028, B:12:0x002e, B:14:0x003f, B:16:0x0056, B:17:0x005c, B:19:0x0062, B:24:0x006e, B:29:0x007c, B:31:0x0088, B:33:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00cc, B:50:0x00d2, B:54:0x00e4, B:59:0x0083), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:3:0x000c, B:5:0x0018, B:9:0x0025, B:11:0x0028, B:12:0x002e, B:14:0x003f, B:16:0x0056, B:17:0x005c, B:19:0x0062, B:24:0x006e, B:29:0x007c, B:31:0x0088, B:33:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00cc, B:50:0x00d2, B:54:0x00e4, B:59:0x0083), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:3:0x000c, B:5:0x0018, B:9:0x0025, B:11:0x0028, B:12:0x002e, B:14:0x003f, B:16:0x0056, B:17:0x005c, B:19:0x0062, B:24:0x006e, B:29:0x007c, B:31:0x0088, B:33:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00cc, B:50:0x00d2, B:54:0x00e4, B:59:0x0083), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:3:0x000c, B:5:0x0018, B:9:0x0025, B:11:0x0028, B:12:0x002e, B:14:0x003f, B:16:0x0056, B:17:0x005c, B:19:0x0062, B:24:0x006e, B:29:0x007c, B:31:0x0088, B:33:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00cc, B:50:0x00d2, B:54:0x00e4, B:59:0x0083), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:3:0x000c, B:5:0x0018, B:9:0x0025, B:11:0x0028, B:12:0x002e, B:14:0x003f, B:16:0x0056, B:17:0x005c, B:19:0x0062, B:24:0x006e, B:29:0x007c, B:31:0x0088, B:33:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00cc, B:50:0x00d2, B:54:0x00e4, B:59:0x0083), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e4 A[Catch: Exception -> 0x0021, TRY_LEAVE, TryCatch #0 {Exception -> 0x0021, blocks: (B:3:0x000c, B:5:0x0018, B:9:0x0025, B:11:0x0028, B:12:0x002e, B:14:0x003f, B:16:0x0056, B:17:0x005c, B:19:0x0062, B:24:0x006e, B:29:0x007c, B:31:0x0088, B:33:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00cc, B:50:0x00d2, B:54:0x00e4, B:59:0x0083), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0083 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:3:0x000c, B:5:0x0018, B:9:0x0025, B:11:0x0028, B:12:0x002e, B:14:0x003f, B:16:0x0056, B:17:0x005c, B:19:0x0062, B:24:0x006e, B:29:0x007c, B:31:0x0088, B:33:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00cc, B:50:0x00d2, B:54:0x00e4, B:59:0x0083), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Map f(O30.b bVar) {
            Map c11;
            String a11;
            a.EnumC0453a enumC0453a;
            boolean z11;
            ArrayList<FeatureFlag> arrayList;
            boolean z12;
            String str;
            L80.a.a("TABSFLOW_FT", "FeatureToggles from init cache initFeatureFlagsSp");
            ArrayList arrayList2 = new ArrayList();
            try {
                a11 = k.a(bVar);
                enumC0453a = a.EnumC0453a.PREFS_GET;
            } catch (Exception e11) {
                arrayList2.add(new Q90.a(a.EnumC0453a.SOURCE_FEATURES_ERROR, false, null, e11.toString(), U.c(), 4));
                c11 = U.c();
            }
            if (a11 != null && a11.length() != 0) {
                z11 = false;
                arrayList2.add(new Q90.a(enumC0453a, !z11, Integer.valueOf(a11 == null ? a11.length() : 0), null, null, 16));
                c11 = null;
                if (a11 != null) {
                    Object value = c.f23054p.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    List list = (List) ((JsonAdapter) value).fromJson(a11);
                    if (list != null) {
                        arrayList = T90.e.a(list);
                        a.EnumC0453a enumC0453a2 = a.EnumC0453a.SOURCE_FEATURES_SUCCESS;
                        if (a11 != null && a11.length() != 0) {
                            z12 = true;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                str = null;
                                arrayList2.add(new Q90.a(enumC0453a2, z12, null, str, arrayList != null ? T90.e.c(arrayList) : U.c(), 4));
                                if (arrayList != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (FeatureFlag featureFlag : arrayList) {
                                        int i11 = c.f23057s;
                                        S90.a g10 = g(featureFlag);
                                        if (g10 != null) {
                                            arrayList3.add(g10);
                                        }
                                    }
                                    int h11 = U.h(C7714v.z(arrayList3, 10));
                                    if (h11 < 16) {
                                        h11 = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                                    Iterator it = arrayList3.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        linkedHashMap.put(((S90.a) next).a(), next);
                                    }
                                    c11 = linkedHashMap;
                                }
                                if (c11 == null) {
                                    c11 = U.c();
                                }
                                c.f23056r.put(bVar, arrayList2);
                                return c11;
                            }
                            str = "Empty SP featureFlags";
                            arrayList2.add(new Q90.a(enumC0453a2, z12, null, str, arrayList != null ? T90.e.c(arrayList) : U.c(), 4));
                            if (arrayList != null) {
                            }
                            if (c11 == null) {
                            }
                            c.f23056r.put(bVar, arrayList2);
                            return c11;
                        }
                        z12 = false;
                        if (arrayList != null) {
                            str = null;
                            arrayList2.add(new Q90.a(enumC0453a2, z12, null, str, arrayList != null ? T90.e.c(arrayList) : U.c(), 4));
                            if (arrayList != null) {
                            }
                            if (c11 == null) {
                            }
                            c.f23056r.put(bVar, arrayList2);
                            return c11;
                        }
                        str = "Empty SP featureFlags";
                        arrayList2.add(new Q90.a(enumC0453a2, z12, null, str, arrayList != null ? T90.e.c(arrayList) : U.c(), 4));
                        if (arrayList != null) {
                        }
                        if (c11 == null) {
                        }
                        c.f23056r.put(bVar, arrayList2);
                        return c11;
                    }
                }
                arrayList = null;
                a.EnumC0453a enumC0453a22 = a.EnumC0453a.SOURCE_FEATURES_SUCCESS;
                if (a11 != null) {
                    z12 = true;
                    if (arrayList != null) {
                    }
                    str = "Empty SP featureFlags";
                    arrayList2.add(new Q90.a(enumC0453a22, z12, null, str, arrayList != null ? T90.e.c(arrayList) : U.c(), 4));
                    if (arrayList != null) {
                    }
                    if (c11 == null) {
                    }
                    c.f23056r.put(bVar, arrayList2);
                    return c11;
                }
                z12 = false;
                if (arrayList != null) {
                }
                str = "Empty SP featureFlags";
                arrayList2.add(new Q90.a(enumC0453a22, z12, null, str, arrayList != null ? T90.e.c(arrayList) : U.c(), 4));
                if (arrayList != null) {
                }
                if (c11 == null) {
                }
                c.f23056r.put(bVar, arrayList2);
                return c11;
            }
            z11 = true;
            arrayList2.add(new Q90.a(enumC0453a, !z11, Integer.valueOf(a11 == null ? a11.length() : 0), null, null, 16));
            c11 = null;
            if (a11 != null) {
            }
            arrayList = null;
            a.EnumC0453a enumC0453a222 = a.EnumC0453a.SOURCE_FEATURES_SUCCESS;
            if (a11 != null) {
            }
            z12 = false;
            if (arrayList != null) {
            }
            str = "Empty SP featureFlags";
            arrayList2.add(new Q90.a(enumC0453a222, z12, null, str, arrayList != null ? T90.e.c(arrayList) : U.c(), 4));
            if (arrayList != null) {
            }
            if (c11 == null) {
            }
            c.f23056r.put(bVar, arrayList2);
            return c11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static S90.a g(FeatureFlag featureFlag) {
            S90.c cVar;
            FeatureValue featureValue;
            String featureName;
            if (featureFlag != null && (featureName = featureFlag.getFeatureName()) != null) {
                try {
                    String upperCase = featureName.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    cVar = S90.c.valueOf(upperCase);
                } catch (Exception unused) {
                }
                if (cVar == null && featureFlag != null) {
                    try {
                        int i11 = c.f23057s;
                        featureValue = (FeatureValue) ((Moshi) c.f23053o.getValue()).c(FeatureValue.class).fromJson(featureFlag.getFeatureFlagValue());
                    } catch (Exception e11) {
                        L80.a.c("FeatureToggles", null, e11);
                        featureValue = null;
                    }
                    if (featureValue != null) {
                        return new S90.a(cVar, featureValue);
                    }
                    return null;
                }
            }
            cVar = null;
            return cVar == null ? null : null;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23072a;

        static {
            int[] iArr = new int[a.EnumC0453a.values().length];
            try {
                iArr[a.EnumC0453a.PREFS_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0453a.SOURCE_FEATURES_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0453a.SOURCE_FEATURES_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23072a = iArr;
        }
    }

    static {
        Sc.n nVar = Sc.n.PUBLICATION;
        f23053o = Sc.k.a(nVar, new B30.n(1));
        f23054p = Sc.k.a(nVar, new Q90.b(0));
        f23055q = new ConcurrentHashMap();
        f23056r = new HashMap();
    }

    public c(@NotNull T90.a featureTogglesRepository, @NotNull ExternalFintechSettings externalFintechSettings, @NotNull o sessionIdProvider, @NotNull AuthPinpadNetwork authPinpadNetwork, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(featureTogglesRepository, "featureTogglesRepository");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
        Intrinsics.checkNotNullParameter(authPinpadNetwork, "authPinpadNetwork");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        this.f23058a = featureTogglesRepository;
        this.f23059b = externalFintechSettings;
        this.f23060c = sessionIdProvider;
        this.f23061d = authPinpadNetwork;
        this.f23062e = fintechAnalyticInteractor;
        this.f23063f = fintechLibType;
        this.f23065h = O0.a(null);
        this.f23066i = true;
        JsonAdapter<List<FeatureFlag>> d11 = a.a().d(D.e(List.class, FeatureFlag.class));
        Intrinsics.checkNotNullExpressionValue(d11, "adapter(...)");
        this.f23067j = d11;
        JsonAdapter<FeatureFlagsRequest> c11 = a.a().c(FeatureFlagsRequest.class);
        Intrinsics.checkNotNullExpressionValue(c11, "adapter(...)");
        this.f23069l = c11;
        this.f23071n = new LinkedHashMap();
        List<Q90.a> list = (List) f23056r.get(fintechLibType);
        if (list != null) {
            for (Q90.a aVar : list) {
                int i11 = b.f23072a[aVar.d().ordinal()];
                if (i11 == 1) {
                    InterfaceC6618a interfaceC6618a = this.f23062e;
                    boolean e11 = aVar.e();
                    Integer c12 = aVar.c();
                    interfaceC6618a.B1(c12 != null ? c12.intValue() : 0, e11);
                } else if (i11 == 2) {
                    this.f23062e.W1(aVar.a(), aVar.b(), aVar.e());
                } else {
                    if (i11 != 3) {
                        throw new Sc.o();
                    }
                    this.f23062e.W1(aVar.a(), aVar.b(), aVar.e());
                }
            }
        }
        f23056r.put(this.f23063f, K.f71697a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(4:9|10|11|12)(2:104|105))(8:106|107|108|110|111|(1:113)|76|77)|13|14|(20:16|(1:18)(1:88)|19|(2:20|(2:22|(2:24|25)(1:85))(2:86|87))|26|(1:28)(1:84)|29|30|(1:32)(1:83)|33|(9:38|(8:40|(1:42)|43|44|(1:46)(1:80)|47|(3:52|(1:54)|55)|79)|81|43|44|(0)(0)|47|(4:49|52|(0)|55)|79)|82|(0)|81|43|44|(0)(0)|47|(0)|79)(3:89|(4:91|(1:93)|94|95)|96)|76|77))|119|6|(0)(0)|13|14|(0)(0)|76|77|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        r0 = new java.util.ArrayList();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
    
        if (r2.hasNext() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0167, code lost:
    
        r3 = Q90.c.a.g((ru.ozon.fintech.settings.models.FeatureFlag) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
    
        if (r3 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0173, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r2 = kotlin.collections.U.h(kotlin.collections.C7714v.z(r0, 10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0183, code lost:
    
        if (r2 >= 16) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
    
        r2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        r4 = new java.util.LinkedHashMap(r2);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0193, code lost:
    
        if (r0.hasNext() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0195, code lost:
    
        r2 = r0.next();
        r4.put(((S90.a) r2).a(), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bc, code lost:
    
        if (r2 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00bf, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0 A[Catch: Exception -> 0x00be, TryCatch #1 {Exception -> 0x00be, blocks: (B:14:0x00a8, B:16:0x00b0, B:18:0x00b9, B:19:0x00c3, B:20:0x00d0, B:22:0x00d6, B:26:0x00eb, B:28:0x00ef, B:29:0x00f8, B:32:0x0100, B:35:0x010d, B:40:0x0119, B:44:0x0125, B:46:0x012c, B:47:0x0130, B:49:0x0136, B:52:0x013d, B:54:0x0143, B:55:0x014d, B:57:0x0158, B:58:0x0161, B:60:0x0167, B:63:0x0173, B:68:0x0177, B:71:0x0186, B:72:0x018f, B:74:0x0195, B:79:0x01a4, B:83:0x0106, B:89:0x01a9, B:91:0x01af, B:95:0x01be, B:96:0x01b8), top: B:13:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119 A[Catch: Exception -> 0x00be, TryCatch #1 {Exception -> 0x00be, blocks: (B:14:0x00a8, B:16:0x00b0, B:18:0x00b9, B:19:0x00c3, B:20:0x00d0, B:22:0x00d6, B:26:0x00eb, B:28:0x00ef, B:29:0x00f8, B:32:0x0100, B:35:0x010d, B:40:0x0119, B:44:0x0125, B:46:0x012c, B:47:0x0130, B:49:0x0136, B:52:0x013d, B:54:0x0143, B:55:0x014d, B:57:0x0158, B:58:0x0161, B:60:0x0167, B:63:0x0173, B:68:0x0177, B:71:0x0186, B:72:0x018f, B:74:0x0195, B:79:0x01a4, B:83:0x0106, B:89:0x01a9, B:91:0x01af, B:95:0x01be, B:96:0x01b8), top: B:13:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c A[Catch: Exception -> 0x00be, TryCatch #1 {Exception -> 0x00be, blocks: (B:14:0x00a8, B:16:0x00b0, B:18:0x00b9, B:19:0x00c3, B:20:0x00d0, B:22:0x00d6, B:26:0x00eb, B:28:0x00ef, B:29:0x00f8, B:32:0x0100, B:35:0x010d, B:40:0x0119, B:44:0x0125, B:46:0x012c, B:47:0x0130, B:49:0x0136, B:52:0x013d, B:54:0x0143, B:55:0x014d, B:57:0x0158, B:58:0x0161, B:60:0x0167, B:63:0x0173, B:68:0x0177, B:71:0x0186, B:72:0x018f, B:74:0x0195, B:79:0x01a4, B:83:0x0106, B:89:0x01a9, B:91:0x01af, B:95:0x01be, B:96:0x01b8), top: B:13:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[Catch: Exception -> 0x00be, TryCatch #1 {Exception -> 0x00be, blocks: (B:14:0x00a8, B:16:0x00b0, B:18:0x00b9, B:19:0x00c3, B:20:0x00d0, B:22:0x00d6, B:26:0x00eb, B:28:0x00ef, B:29:0x00f8, B:32:0x0100, B:35:0x010d, B:40:0x0119, B:44:0x0125, B:46:0x012c, B:47:0x0130, B:49:0x0136, B:52:0x013d, B:54:0x0143, B:55:0x014d, B:57:0x0158, B:58:0x0161, B:60:0x0167, B:63:0x0173, B:68:0x0177, B:71:0x0186, B:72:0x018f, B:74:0x0195, B:79:0x01a4, B:83:0x0106, B:89:0x01a9, B:91:0x01af, B:95:0x01be, B:96:0x01b8), top: B:13:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143 A[Catch: Exception -> 0x00be, TryCatch #1 {Exception -> 0x00be, blocks: (B:14:0x00a8, B:16:0x00b0, B:18:0x00b9, B:19:0x00c3, B:20:0x00d0, B:22:0x00d6, B:26:0x00eb, B:28:0x00ef, B:29:0x00f8, B:32:0x0100, B:35:0x010d, B:40:0x0119, B:44:0x0125, B:46:0x012c, B:47:0x0130, B:49:0x0136, B:52:0x013d, B:54:0x0143, B:55:0x014d, B:57:0x0158, B:58:0x0161, B:60:0x0167, B:63:0x0173, B:68:0x0177, B:71:0x0186, B:72:0x018f, B:74:0x0195, B:79:0x01a4, B:83:0x0106, B:89:0x01a9, B:91:0x01af, B:95:0x01be, B:96:0x01b8), top: B:13:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a9 A[Catch: Exception -> 0x00be, TryCatch #1 {Exception -> 0x00be, blocks: (B:14:0x00a8, B:16:0x00b0, B:18:0x00b9, B:19:0x00c3, B:20:0x00d0, B:22:0x00d6, B:26:0x00eb, B:28:0x00ef, B:29:0x00f8, B:32:0x0100, B:35:0x010d, B:40:0x0119, B:44:0x0125, B:46:0x012c, B:47:0x0130, B:49:0x0136, B:52:0x013d, B:54:0x0143, B:55:0x014d, B:57:0x0158, B:58:0x0161, B:60:0x0167, B:63:0x0173, B:68:0x0177, B:71:0x0186, B:72:0x018f, B:74:0x0195, B:79:0x01a4, B:83:0x0106, B:89:0x01a9, B:91:0x01af, B:95:0x01be, B:96:0x01b8), top: B:13:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [Wc.a] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable j(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        f fVar;
        int i11;
        String str;
        FeatureFlagsRequest featureFlagsRequest;
        String X9;
        String str2;
        Response response;
        String message;
        Pair<? extends String, ? extends String> pair;
        boolean z11;
        String json;
        boolean d11;
        c cVar3 = cVar;
        ExternalFintechSettings externalFintechSettings = cVar3.f23059b;
        if (cVar2 instanceof f) {
            fVar = (f) cVar2;
            int i12 = fVar.f23086h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f23086h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f23084f;
                ?? r42 = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f23086h;
                String str3 = "";
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        featureFlagsRequest = new FeatureFlagsRequest(new FilterRequest("mobile", null, "ANDROID", s(), externalFintechSettings.getFeatureFlagsConfig().a(), externalFintechSettings.getFeatureFlagsConfig().b()), 0, 1000);
                        String json2 = cVar3.f23069l.toJson(featureFlagsRequest);
                        Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                        Intrinsics.checkNotNullParameter(json2, "<this>");
                        X9 = kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(json2, " ", "", false), "\n", "", false), "\"", "", false);
                    } catch (Exception e11) {
                        e = e11;
                        str = "";
                    }
                    try {
                        T90.a aVar = cVar3.f23058a;
                        String c11 = externalFintechSettings.getFeatureFlagsConfig().c();
                        fVar.f23082d = cVar3;
                        fVar.f23083e = X9;
                        fVar.f23086h = 1;
                        obj = aVar.b(c11, featureFlagsRequest, fVar);
                        if (obj != r42) {
                            str2 = X9;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = X9;
                        cVar3.f23062e.Q1(null, str, false, kotlin.text.h.q0(400, e.toString()), U.c());
                        r42 = U.c();
                        return (Serializable) r42;
                    }
                    return (Serializable) r42;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str4 = fVar.f23083e;
                c cVar4 = fVar.f23082d;
                try {
                    s.b(obj);
                    str2 = str4;
                    cVar3 = cVar4;
                } catch (Exception e13) {
                    e = e13;
                    str = str4;
                    cVar3 = cVar4;
                    cVar3.f23062e.Q1(null, str, false, kotlin.text.h.q0(400, e.toString()), U.c());
                    r42 = U.c();
                    return (Serializable) r42;
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    M errorBody = response.errorBody();
                    if (errorBody != null) {
                        message = errorBody.string();
                        if (message == null) {
                        }
                        str3 = message;
                        cVar3.f23062e.Q1(null, str2, false, response.code() + " + " + kotlin.text.h.q0(400, str3), U.c());
                        r42 = U.c();
                    }
                    message = response.message();
                } else {
                    List list = (List) response.body();
                    String str5 = null;
                    ArrayList a11 = list != null ? T90.e.a(list) : null;
                    z headers = response.headers();
                    Intrinsics.checkNotNullExpressionValue(headers, "headers(...)");
                    Iterator<Pair<? extends String, ? extends String>> it = headers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            pair = null;
                            break;
                        }
                        pair = it.next();
                        if (Intrinsics.d(pair.e(), "x-o3-trace")) {
                            break;
                        }
                    }
                    Pair<? extends String, ? extends String> pair2 = pair;
                    String f7 = pair2 != null ? pair2.f() : null;
                    InterfaceC6618a interfaceC6618a = cVar3.f23062e;
                    O30.b bVar = cVar3.f23063f;
                    T90.a aVar2 = cVar3.f23058a;
                    Map c12 = a11 != null ? T90.e.c(a11) : U.c();
                    if (a11 != null && !a11.isEmpty()) {
                        z11 = true;
                        if (a11 != null) {
                            if (!a11.isEmpty()) {
                            }
                            interfaceC6618a.Q1(f7, str2, z11, str5, c12);
                            json = cVar3.f23067j.toJson(a11 == null ? K.f71697a : a11);
                            if (json != null && json.length() != 0) {
                                d11 = aVar2.d(bVar, json);
                                if (d11) {
                                    aVar2.e(bVar);
                                    L80.a.a("TABSFLOW_FT", "save flags from network to cache");
                                }
                                cVar3.f23062e.U0(json.length(), d11);
                            }
                            r42 = U.c();
                        }
                        str5 = "Empty NETWORK featureFlags";
                        interfaceC6618a.Q1(f7, str2, z11, str5, c12);
                        json = cVar3.f23067j.toJson(a11 == null ? K.f71697a : a11);
                        if (json != null) {
                            d11 = aVar2.d(bVar, json);
                            if (d11) {
                            }
                            cVar3.f23062e.U0(json.length(), d11);
                        }
                        r42 = U.c();
                    }
                    z11 = false;
                    if (a11 != null) {
                    }
                    str5 = "Empty NETWORK featureFlags";
                    interfaceC6618a.Q1(f7, str2, z11, str5, c12);
                    json = cVar3.f23067j.toJson(a11 == null ? K.f71697a : a11);
                    if (json != null) {
                    }
                    r42 = U.c();
                }
                return (Serializable) r42;
            }
        }
        fVar = new f(cVar3, cVar2);
        Object obj2 = fVar.f23084f;
        ?? r422 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f23086h;
        String str32 = "";
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
        return (Serializable) r422;
    }

    private final AppConfig p(Map<S90.c, S90.a> map) {
        S90.a aVar;
        List<AppConfigTab> tabs;
        List<AppConfigTab> tabs2;
        S90.c cVar = S90.c.MOB_TABS_CONFIGURATION;
        if (map != null && (aVar = map.get(cVar)) != null && aVar.b().isEnabled()) {
            if (aVar.b().getDictParsed() != null) {
                Object dictParsed = aVar.b().getDictParsed();
                AppConfig appConfig = dictParsed instanceof AppConfig ? (AppConfig) dictParsed : null;
                if (appConfig == null || (tabs2 = appConfig.getTabs()) == null || !tabs2.isEmpty()) {
                    return appConfig;
                }
                return null;
            }
            try {
                AppConfig appConfig2 = (AppConfig) a.a().c(AppConfig.class).fromJson(String.valueOf(aVar.b().getDict()));
                if (appConfig2 != null && (tabs = appConfig2.getTabs()) != null) {
                    if (tabs.isEmpty()) {
                        return null;
                    }
                }
                return appConfig2;
            } catch (Exception e11) {
                L80.a.c("FeatureToggles", null, e11);
                this.f23062e.y0(C4001c.b(e11), true);
            }
        }
        return null;
    }

    private static int s() {
        String RELEASE = Build.VERSION.RELEASE;
        if (RELEASE == null) {
            return 0;
        }
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        int I11 = kotlin.text.h.I('.', 0, 6, RELEASE);
        if (I11 >= 0) {
            RELEASE = RELEASE.substring(0, I11);
            Intrinsics.checkNotNullExpressionValue(RELEASE, "substring(...)");
        }
        return Integer.parseInt(RELEASE);
    }

    private final void x() {
        Map map;
        String str;
        Map map2;
        Map map3;
        InterfaceC6618a interfaceC6618a = this.f23062e;
        Map<S90.c, S90.a> map4 = this.f23070m;
        boolean z11 = false;
        if (map4 == null || map4.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = f23055q;
            Map map5 = (Map) concurrentHashMap.get(this.f23063f);
            if (map5 == null || map5.isEmpty()) {
                S90.c[] cVarArr = (S90.c[]) S90.c.b().toArray(new S90.c[0]);
                int h11 = U.h(cVarArr.length);
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                for (S90.c cVar : cVarArr) {
                    String lowerCase = cVar.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    Pair pair = new Pair(lowerCase, Boolean.valueOf(cVar.a().isEnabled()));
                    linkedHashMap.put(pair.e(), pair.f());
                }
                map = linkedHashMap;
            } else {
                Map map6 = (Map) concurrentHashMap.get(this.f23063f);
                map = map6 != null ? z(map6) : U.c();
            }
        } else {
            Map<S90.c, S90.a> map7 = this.f23070m;
            map = map7 != null ? z(map7) : U.c();
        }
        Map<S90.c, S90.a> map8 = this.f23070m;
        if (map8 == null || map8.isEmpty()) {
            Map map9 = (Map) f23055q.get(this.f23063f);
            str = (map9 == null || map9.isEmpty()) ? "default" : "cache";
        } else {
            str = "network";
        }
        Map<S90.c, S90.a> map10 = this.f23070m;
        if ((map10 != null && !map10.isEmpty()) || ((map2 = (Map) f23055q.get(this.f23063f)) != null && !map2.isEmpty())) {
            z11 = true;
        }
        Map<S90.c, S90.a> map11 = this.f23070m;
        interfaceC6618a.o1(str, ((map11 == null || map11.isEmpty()) && ((map3 = (Map) f23055q.get(this.f23063f)) == null || map3.isEmpty())) ? "Error parsing features from network or cache" : null, map, z11);
    }

    private static Map z(Map map) {
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String lowerCase = ((S90.c) entry.getKey()).name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(new Pair(lowerCase, Boolean.valueOf(((S90.a) entry.getValue()).b().isEnabled())));
            }
            Map s11 = U.s(arrayList);
            if (s11 != null) {
                return s11;
            }
        }
        return U.c();
    }

    public final void A(String str) {
        AuthPinpad authPinpad;
        AuthPinpad authPinpad2;
        AppConfig appConfig = this.f23064g;
        if (appConfig == null || (authPinpad = appConfig.getAuthPinpad()) == null || !authPinpad.getShowPinpad()) {
            this.f23068k = str;
            return;
        }
        AppConfig appConfig2 = this.f23064g;
        if (appConfig2 == null || (authPinpad2 = appConfig2.getAuthPinpad()) == null) {
            return;
        }
        authPinpad2.setRedirectToDeep(str);
    }

    public final void l() {
        this.f23065h.setValue(null);
        this.f23064g = null;
        this.f23066i = true;
        if (!this.f23059b.isUnderAutotest()) {
            this.f23071n.clear();
        }
        this.f23070m = null;
        f23055q.put(this.f23063f, new HashMap());
        this.f23058a.a(this.f23063f);
    }

    public final void m() {
        this.f23065h.setValue(null);
        this.f23064g = null;
        this.f23071n.remove(S90.c.MOB_TABS_CONFIGURATION);
    }

    public final AppConfig n() {
        return this.f23064g;
    }

    @NotNull
    public final x0<AppConfig> o() {
        return this.f23065h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final S90.a q(@NotNull S90.c featureName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        S90.a aVar = (S90.a) this.f23071n.get(featureName);
        S90.a aVar2 = null;
        if (aVar == null) {
            Map map = (Map) f23055q.get(this.f23063f);
            aVar = map != null ? (S90.a) map.get(featureName) : null;
        }
        if (aVar == null) {
            Map<S90.c, S90.a> map2 = this.f23070m;
            aVar = map2 != null ? map2.get(featureName) : null;
        }
        if (aVar == null) {
            Set<S90.a> d11 = this.f23059b.getFeatureFlagsConfig().d();
            if (d11 != null) {
                Iterator<T> it = d11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((S90.a) next).a() == featureName) {
                        aVar2 = next;
                        break;
                    }
                }
                aVar2 = aVar2;
            }
            aVar = aVar2;
        }
        return aVar == null ? new S90.a(featureName, featureName.a()) : aVar;
    }

    public final boolean r() {
        return this.f23066i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(Function1 function1, boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        AppConfig appConfig;
        AuthPinpad authPinpad;
        c cVar2;
        AppConfig appConfig2;
        Function1 function12;
        AppConfig appConfig3;
        Object obj;
        Object obj2;
        FeatureValue b11;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f23078i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f23078i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj3 = dVar.f23076g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f23078i;
                appConfig = null;
                if (i11 != 0) {
                    s.b(obj3);
                    AppConfig p11 = p(this.f23071n);
                    if (p11 == null) {
                        p11 = p((Map) f23055q.get(this.f23063f));
                    }
                    if (p11 == null) {
                        p11 = p(this.f23070m);
                    }
                    if (p11 == null) {
                        Set<S90.a> d11 = this.f23059b.getFeatureFlagsConfig().d();
                        if (d11 != null) {
                            Iterator<T> it = d11.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (((S90.a) obj2).a() == S90.c.MOB_TABS_CONFIGURATION) {
                                    break;
                                }
                            }
                            S90.a aVar2 = (S90.a) obj2;
                            if (aVar2 != null && (b11 = aVar2.b()) != null) {
                                obj = b11.getDictParsed();
                                p11 = !(obj instanceof AppConfig) ? (AppConfig) obj : null;
                            }
                        }
                        obj = null;
                        if (!(obj instanceof AppConfig)) {
                        }
                    }
                    if (p11 == null) {
                        this.f23062e.y0("AppConfig is null in every possible source", false);
                    }
                    AppConfig appConfig4 = this.f23064g;
                    authPinpad = appConfig4 != null ? appConfig4.getAuthPinpad() : null;
                    if (z11 || !Tl.a.f(this, S90.c.MOB_PINPAD)) {
                        cVar2 = this;
                        appConfig2 = p11;
                        if (appConfig2 != null) {
                            if (authPinpad == null) {
                                AuthPinpad.INSTANCE.getClass();
                                authPinpad = AuthPinpad.f97037NO;
                            }
                            appConfig = AppConfig.copy$default(appConfig2, null, null, authPinpad, 3, null);
                        }
                        cVar2.f23064g = appConfig;
                        if (appConfig != null && function1 != null) {
                            function1.invoke(appConfig);
                        }
                        cVar2.f23065h.setValue(cVar2.f23064g);
                        return Unit.f71690a;
                    }
                    e eVar = new e(this, null);
                    dVar.f23073d = this;
                    dVar.f23074e = function1;
                    dVar.f23075f = p11;
                    dVar.f23078i = 1;
                    Object c11 = f1.c(10000L, eVar, dVar);
                    if (c11 == aVar) {
                        return aVar;
                    }
                    function12 = function1;
                    appConfig3 = p11;
                    obj3 = c11;
                    cVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appConfig3 = dVar.f23075f;
                    function12 = dVar.f23074e;
                    cVar2 = dVar.f23073d;
                    s.b(obj3);
                }
                authPinpad = (AuthPinpad) obj3;
                appConfig2 = appConfig3;
                function1 = function12;
                if (appConfig2 != null) {
                }
                cVar2.f23064g = appConfig;
                if (appConfig != null) {
                    function1.invoke(appConfig);
                }
                cVar2.f23065h.setValue(cVar2.f23064g);
                return Unit.f71690a;
            }
        }
        dVar = new d(this, cVar);
        Object obj32 = dVar.f23076g;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f23078i;
        appConfig = null;
        if (i11 != 0) {
        }
        authPinpad = (AuthPinpad) obj32;
        appConfig2 = appConfig3;
        function1 = function12;
        if (appConfig2 != null) {
        }
        cVar2.f23064g = appConfig;
        if (appConfig != null) {
        }
        cVar2.f23065h.setValue(cVar2.f23064g);
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(@NotNull S90.d dVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        int i11;
        FeatureFlag b11;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f23089f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f23089f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gVar.f23087d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f23089f;
                if (i11 != 0) {
                    s.b(obj);
                    String lowerCase = dVar.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    ExternalFintechSettings externalFintechSettings = this.f23059b;
                    FeatureFlagsRequest featureFlagsRequest = new FeatureFlagsRequest(new FilterRequest(null, lowerCase, "ANDROID", s(), externalFintechSettings.getFeatureFlagsConfig().a(), externalFintechSettings.getFeatureFlagsConfig().b()), 0, 1000);
                    String c11 = externalFintechSettings.getFeatureFlagsConfig().c();
                    gVar.f23089f = 1;
                    obj = this.f23058a.c(c11, featureFlagsRequest, gVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                FeatureFlag featureFlag = (FeatureFlag) obj;
                b11 = featureFlag == null ? T90.e.b(featureFlag) : null;
                if ((b11 == null ? b11.getFeatureFlagValue() : null) == null) {
                    return (FeatureValue) a.a().c(FeatureValue.class).fromJson(b11.getFeatureFlagValue());
                }
                return null;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f23087d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f23089f;
        if (i11 != 0) {
        }
        FeatureFlag featureFlag2 = (FeatureFlag) obj2;
        if (featureFlag2 == null) {
        }
        if ((b11 == null ? b11.getFeatureFlagValue() : null) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r2.t(r12, false, r0) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        Map map;
        c cVar2;
        Function1 function12;
        int i12;
        Function1 function13;
        c cVar3;
        c cVar4;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i13 = hVar.f23096j;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f23096j = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f23094h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f23096j;
                int i14 = 1;
                if (i11 != 0) {
                    s.b(obj);
                    map = (Map) f23055q.get(this.f23063f);
                    if (map == null || map.isEmpty()) {
                        i iVar = new i(this, null);
                        hVar.f23090d = this;
                        hVar.f23091e = function1;
                        hVar.f23096j = 1;
                        obj = f1.c(5000L, iVar, hVar);
                        if (obj != aVar) {
                            cVar2 = this;
                        }
                        return aVar;
                    }
                    cVar2 = this;
                    if (map.isEmpty()) {
                        function12 = function1;
                        i12 = 0;
                        if (cVar2.f23070m == null) {
                        }
                        if (i12 == 0) {
                        }
                        return Unit.f71690a;
                    }
                    hVar.f23090d = cVar2;
                    hVar.f23091e = function1;
                    hVar.f23093g = 1;
                    hVar.f23096j = 2;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                cVar4 = hVar.f23090d;
                                s.b(obj);
                                cVar4.x();
                                return Unit.f71690a;
                            }
                            i12 = hVar.f23093g;
                            cVar2 = hVar.f23092f;
                            function13 = hVar.f23091e;
                            cVar3 = hVar.f23090d;
                            s.b(obj);
                            cVar2.f23070m = (Map) obj;
                            function12 = function13;
                            cVar2 = cVar3;
                            if (i12 == 0) {
                                hVar.f23090d = cVar2;
                                hVar.f23091e = null;
                                hVar.f23092f = null;
                                hVar.f23096j = 4;
                                if (cVar2.t(function12, false, hVar) != aVar) {
                                    cVar4 = cVar2;
                                    cVar4.x();
                                }
                                return aVar;
                            }
                            return Unit.f71690a;
                        }
                        i14 = hVar.f23093g;
                        function1 = hVar.f23091e;
                        cVar2 = hVar.f23090d;
                        s.b(obj);
                        cVar2.x();
                        function12 = function1;
                        i12 = i14;
                        if (cVar2.f23070m == null) {
                            j jVar = new j(cVar2, null);
                            hVar.f23090d = cVar2;
                            hVar.f23091e = function12;
                            hVar.f23092f = cVar2;
                            hVar.f23093g = i12;
                            hVar.f23096j = 3;
                            Object c11 = f1.c(10000L, jVar, hVar);
                            if (c11 != aVar) {
                                function13 = function12;
                                obj = c11;
                                cVar3 = cVar2;
                                cVar2.f23070m = (Map) obj;
                                function12 = function13;
                                cVar2 = cVar3;
                            }
                            return aVar;
                        }
                        if (i12 == 0) {
                        }
                        return Unit.f71690a;
                    }
                    function1 = hVar.f23091e;
                    cVar2 = hVar.f23090d;
                    s.b(obj);
                }
                map = (Map) obj;
                if (map == null) {
                    map = new HashMap();
                }
                f23055q.put(cVar2.f23063f, map);
                if (map.isEmpty()) {
                }
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f23094h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f23096j;
        int i142 = 1;
        if (i11 != 0) {
        }
        map = (Map) obj2;
        if (map == null) {
        }
        f23055q.put(cVar2.f23063f, map);
        if (map.isEmpty()) {
        }
    }

    public final void w(@NotNull Map<S90.c, S90.a> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f23071n.putAll(features);
    }

    public final void y(boolean z11) {
        this.f23066i = z11;
    }
}
