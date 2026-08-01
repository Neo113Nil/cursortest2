package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.A5;
import com.ironsource.AbstractC4455i3;
import com.ironsource.InterfaceC4763z7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4455i3 implements InterfaceC4745y7 {
    static boolean O = false;
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private HandlerThreadC4743y5 K;
    private C4293aa L;
    private Ue M;
    private boolean l;
    private C4760z4 p;
    private AbstractC4379e q;
    private ArrayList<C4689v5> r;
    private int t;
    private G8 u;
    private Context v;
    private int[] z;

    /* renamed from: a, reason: collision with root package name */
    final int f8235a = 1;
    final int b = 100;
    final int c = 5000;
    final int d = 90000;
    final int e = 1024;
    final int f = 5;
    final String g = "supersonic_sdk.db";
    final String h = IronSourceConstants.EVENTS_PROVIDER;
    final String i = "placement";
    private final String j = "abt";
    private final String k = L6.b1;
    private boolean m = false;
    private boolean n = false;
    private int o = -1;
    private boolean s = true;
    private int w = 100;
    private int x = 5000;
    private int y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object N = new Object();

    /* renamed from: com.ironsource.i3$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4455i3.this.a();
        }
    }

    /* renamed from: com.ironsource.i3$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4689v5 f8237a;
        final /* synthetic */ IronSource.a b;

        b(C4689v5 c4689v5, IronSource.a aVar) {
            this.f8237a = c4689v5;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8237a.a("eventSessionId", AbstractC4455i3.this.u.b());
            this.f8237a.a("essn", Integer.valueOf(AbstractC4455i3.this.u.c()));
            String a2 = IronSourceUtils.a(AbstractC4455i3.this.v);
            if (AbstractC4455i3.this.g(this.f8237a)) {
                this.f8237a.a("connectionType", a2);
            }
            if (AbstractC4455i3.this.a(a2, this.f8237a)) {
                C4689v5 c4689v5 = this.f8237a;
                c4689v5.a(AbstractC4455i3.this.b(c4689v5));
            }
            String d = R3.d(AbstractC4455i3.this.v);
            if (d != null) {
                this.f8237a.a("rawConnectionType", d);
            }
            int a3 = AbstractC4455i3.this.a(this.f8237a.c(), this.b);
            if (a3 != e.NOT_SUPPORTED.b()) {
                this.f8237a.a("adUnit", Integer.valueOf(a3));
            }
            AbstractC4455i3.this.a(this.f8237a, "reason");
            AbstractC4455i3.this.a(this.f8237a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC4455i3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC4455i3.this.E.entrySet()) {
                    if (!this.f8237a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f8237a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC4455i3.this.i(this.f8237a)) {
                if (AbstractC4455i3.this.h(this.f8237a) && !AbstractC4455i3.this.e(this.f8237a)) {
                    this.f8237a.a("sessionDepth", Integer.valueOf(AbstractC4455i3.this.c(this.f8237a)));
                }
                if (AbstractC4455i3.this.j(this.f8237a)) {
                    AbstractC4455i3.this.f(this.f8237a);
                }
                long a4 = AbstractC4455i3.this.u.a();
                if (a4 > 0) {
                    this.f8237a.a("firstSessionTimestamp", Long.valueOf(a4));
                }
                IronLog.EVENT.verbose(this.f8237a.toString());
                AbstractC4455i3.this.r.add(this.f8237a);
                AbstractC4455i3.this.t++;
            }
            AbstractC4455i3 abstractC4455i3 = AbstractC4455i3.this;
            boolean a5 = abstractC4455i3.a(abstractC4455i3.B) ? AbstractC4455i3.this.a(this.f8237a.c(), AbstractC4455i3.this.B) : AbstractC4455i3.this.d(this.f8237a);
            AbstractC4455i3 abstractC4455i32 = AbstractC4455i3.this;
            if (!abstractC4455i32.m && a5) {
                abstractC4455i32.m = true;
            }
            if (abstractC4455i32.p != null) {
                if (abstractC4455i32.g()) {
                    AbstractC4455i3.this.f();
                    return;
                }
                AbstractC4455i3 abstractC4455i33 = AbstractC4455i3.this;
                if (abstractC4455i33.b((ArrayList<C4689v5>) abstractC4455i33.r) || a5) {
                    AbstractC4455i3.this.a();
                }
            }
        }
    }

    /* renamed from: com.ironsource.i3$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4455i3.this.f();
        }
    }

    /* renamed from: com.ironsource.i3$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* renamed from: a, reason: collision with root package name */
        private int f8240a;

        e(int i) {
            this.f8240a = i;
        }

        public int b() {
            return this.f8240a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(C4689v5 c4689v5) {
        return c4689v5.c() + 90000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList<C4689v5> a2;
        try {
            this.m = false;
            ArrayList<C4689v5> arrayList = new ArrayList<>();
            try {
                synchronized (this.N) {
                    a2 = this.p.a(this.I);
                    this.p.b(this.I);
                }
                A5.c cVar = new A5.c(new A5.a(a2, this.r), this.x);
                this.p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th) {
                C4491k4.d().a(th);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                JSONObject b2 = I6.a().b();
                try {
                    a(b2);
                    String b3 = b();
                    if (!TextUtils.isEmpty(b3)) {
                        b2.put("abt", b3);
                    }
                    String j = com.ironsource.mediationsdk.p.g().j();
                    if (!TextUtils.isEmpty(j)) {
                        b2.put(L6.b1, j);
                    }
                    Map<String, String> c2 = c();
                    if (!c2.isEmpty()) {
                        for (Map.Entry<String, String> entry : c2.entrySet()) {
                            if (!b2.has(entry.getKey())) {
                                b2.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject a3 = new F5().a();
                    Iterator<String> keys = a3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b2.put(next, a3.get(next));
                    }
                } catch (Throwable th2) {
                    C4491k4.d().a(th2);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String a4 = this.q.a(arrayList, b2);
                if (TextUtils.isEmpty(a4)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!O && this.l && a(arrayList, EnumC4707w5.FIRST_INSTANCE.b())) {
                    IronLog.INTERNAL.verbose("events data: " + a4);
                    O = true;
                }
                if (this.n) {
                    try {
                        a4 = Base64.encodeToString(Q9.a(a4, this.o), 0);
                    } catch (Exception e2) {
                        C4491k4.d().a(e2);
                    }
                }
                Hf.f7662a.b(new G5(new c(), a4, this.q.b(), arrayList));
            }
        } catch (Throwable th3) {
            C4491k4.d().a(th3);
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.w || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(C4689v5 c4689v5) {
        if (c4689v5 == null) {
            return false;
        }
        if (a(this.z)) {
            return true ^ a(c4689v5.c(), this.z);
        }
        if (a(this.A)) {
            return a(c4689v5.c(), this.A);
        }
        return true;
    }

    public synchronized void a(Context context, C4293aa c4293aa) {
        String a2 = IronSourceUtils.a(context, this.I, this.H);
        this.H = a2;
        b(a2);
        this.q.a(IronSourceUtils.b(context, this.I, (String) null));
        this.p = C4760z4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.z = IronSourceUtils.c(context, this.I);
        this.A = IronSourceUtils.b(context, this.I);
        this.B = IronSourceUtils.d(context, this.I);
        this.C = IronSourceUtils.a(context, this.I);
        this.L = c4293aa;
        this.v = context;
    }

    protected abstract int c(C4689v5 c4689v5);

    @Override // com.ironsource.InterfaceC4745y7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.b(context, this.I, iArr);
    }

    abstract void d();

    @Override // com.ironsource.InterfaceC4745y7
    public void d(int i) {
        if (i > 0) {
            this.x = i;
        }
    }

    protected abstract boolean d(C4689v5 c4689v5);

    protected abstract String e(int i);

    void e() {
        this.r = new ArrayList<>();
        this.t = 0;
        this.q = D5.a(this.H, this.G);
        HandlerThreadC4743y5 handlerThreadC4743y5 = new HandlerThreadC4743y5(this.I + "EventThread");
        this.K = handlerThreadC4743y5;
        handlerThreadC4743y5.start();
        this.K.a();
        this.u = Ib.a0().m();
        this.J = new HashSet();
        d();
    }

    protected abstract void f(C4689v5 c4689v5);

    public void h() {
        this.K.a(new d());
    }

    protected abstract boolean j(C4689v5 c4689v5);

    private void b(String str) {
        AbstractC4379e abstractC4379e = this.q;
        if (abstractC4379e == null || !abstractC4379e.c().equals(str)) {
            this.q = D5.a(str, this.G);
        }
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.a(context, this.I, iArr);
    }

    protected boolean g(C4689v5 c4689v5) {
        return (c4689v5.c() == EnumC4707w5.CONSENT_TRUE_CODE.b() || c4689v5.c() == EnumC4707w5.CONSENT_FALSE_CODE.b() || c4689v5.c() == EnumC4707w5.SET_META_DATA.b() || c4689v5.c() == EnumC4707w5.SET_META_DATA_AFTER_INIT.b() || c4689v5.c() == EnumC4707w5.SET_USER_ID.b()) ? false : true;
    }

    protected boolean h(C4689v5 c4689v5) {
        return (c4689v5.c() == EnumC4707w5.FIRST_INSTANCE.b() || c4689v5.c() == EnumC4707w5.FIRST_INSTANCE_RESULT.b() || c4689v5.c() == EnumC4707w5.INIT_COMPLETE.b() || c4689v5.c() == EnumC4707w5.SDK_INIT_FAILED.b() || c4689v5.c() == EnumC4707w5.SDK_INIT_SUCCESS.b() || c4689v5.c() == EnumC4707w5.USING_CACHE_FOR_INIT_EVENT.b() || c4689v5.c() == EnumC4707w5.CONSENT_TRUE_CODE.b() || c4689v5.c() == EnumC4707w5.CONSENT_FALSE_CODE.b() || c4689v5.c() == EnumC4707w5.SET_META_DATA.b() || c4689v5.c() == EnumC4707w5.SET_META_DATA_AFTER_INIT.b() || c4689v5.c() == EnumC4707w5.SET_USER_ID.b()) ? false : true;
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void c(int i) {
        this.o = i;
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void b(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    public void c(boolean z) {
        this.l = z;
    }

    /* renamed from: com.ironsource.i3$c */
    class c implements InterfaceC4763z7 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(InterfaceC4763z7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC4455i3 abstractC4455i3 = AbstractC4455i3.this;
                    ArrayList<C4689v5> a2 = abstractC4455i3.p.a(abstractC4455i3.I);
                    AbstractC4455i3.this.t = a2.size() + AbstractC4455i3.this.r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC4455i3.this.a(AbstractC4455i3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e) {
                C4491k4.d().a(e);
            }
            a(aVar.b());
        }

        public void a(ArrayList<C4689v5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    C4491k4.d().a(e);
                    IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }

        @Override // com.ironsource.InterfaceC4763z7
        public synchronized void a(final InterfaceC4763z7.a aVar) {
            AbstractC4455i3.this.K.a(new Runnable() { // from class: com.ironsource.i3$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4455i3.c.this.b(aVar);
                }
            });
        }
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void b(int[] iArr, Context context) {
        this.z = iArr;
        IronSourceUtils.c(context, this.I, iArr);
    }

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC4379e abstractC4379e = this.q;
        if (abstractC4379e != null) {
            abstractC4379e.a(str);
        }
        IronSourceUtils.e(context, this.I, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(C4689v5 c4689v5) {
        JSONObject b2 = c4689v5.b();
        if (b2 == null) {
            return false;
        }
        return b2.has("sessionDepth");
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void b(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<C4689v5> arrayList) {
        return arrayList != null && arrayList.size() >= this.y;
    }

    public String b() {
        return this.F;
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    public synchronized void a(Ue ue) {
        this.M = ue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(String str, C4689v5 c4689v5) {
        boolean contains;
        if (!str.equalsIgnoreCase("none")) {
            return false;
        }
        if (a(this.C)) {
            contains = a(c4689v5.c(), this.C);
        } else {
            contains = this.J.contains(Integer.valueOf(c4689v5.c()));
        }
        return contains;
    }

    @Override // com.ironsource.InterfaceC4745y7
    public synchronized void a(C4689v5 c4689v5) {
        a(c4689v5, (IronSource.a) null);
    }

    public synchronized void a(C4689v5 c4689v5, IronSource.a aVar) {
        if (c4689v5 != null) {
            if (this.s) {
                this.K.a(new b(c4689v5, aVar));
            }
        }
    }

    private boolean a(ArrayList<C4689v5> arrayList, int i) {
        Iterator<C4689v5> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().c() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<C4689v5> a(ArrayList<C4689v5> arrayList, String str) {
        String a2 = a(str, 1024);
        Iterator<C4689v5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(a2);
        }
        return arrayList;
    }

    protected void a(ArrayList<C4689v5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.p.a(arrayList, this.I);
                this.t = this.p.a(this.I).size() + this.r.size();
            }
        }
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void a(int i) {
        if (i > 0) {
            this.w = i;
        }
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.d(context, this.I, iArr);
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.InterfaceC4745y7
    public void a(boolean z) {
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.N) {
            this.p.a(this.r, this.I);
            this.r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int[] iArr) {
        if (!a(iArr)) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    private void a(JSONObject jSONObject) {
        try {
            C4293aa c4293aa = this.L;
            if (c4293aa != null) {
                if (c4293aa.a() > 0) {
                    jSONObject.put("age", this.L.a());
                }
                if (!TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(C4293aa.n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > 0.0d) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            Ue ue = this.M;
            if (ue != null) {
                String b2 = ue.b();
                if (!TextUtils.isEmpty(b2)) {
                    jSONObject.put("segmentId", b2);
                }
                JSONObject a2 = this.M.a();
                Iterator<String> keys = a2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, a2.get(next));
                }
            }
        } catch (JSONException e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void a(String str) {
        this.F = str;
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(C4689v5 c4689v5, String str, int i) {
        JSONObject b2 = c4689v5.b();
        if (b2 == null || !b2.has(str)) {
            return;
        }
        try {
            c4689v5.a(str, a(b2.optString(str, null), i));
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    String a(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C4689v5 c4689v5, String str) {
        a(c4689v5, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, IronSource.a aVar) {
        int b2 = e.NOT_SUPPORTED.b();
        if (aVar != IronSource.a.REWARDED_VIDEO && ((i < 1000 || i >= 2000) && (i < 91000 || i >= 92000))) {
            if (aVar != IronSource.a.INTERSTITIAL && ((i < 2000 || i >= 3000) && (i < 92000 || i >= 93000))) {
                if (aVar == IronSource.a.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
                    return e.BANNER.b();
                }
                return (aVar == IronSource.a.NATIVE_AD || (i >= 4000 && i < 5000) || (i >= 94000 && i < 95000)) ? e.NATIVE_AD.b() : b2;
            }
            return e.INTERSTITIAL.b();
        }
        return e.REWARDED_VIDEO.b();
    }

    public void a(C4293aa c4293aa) {
        this.L = c4293aa;
    }

    void a(Runnable runnable) {
        this.K.a(runnable);
    }

    protected int f(int i) {
        return a(i, (IronSource.a) null);
    }
}
