package p000;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b90 implements hd1, do0, InterfaceC0752u3, iq0, InterfaceC0277h8, jk0, InterfaceC0538ob, InterfaceC0435lj, t10, InterfaceC0627qq, InterfaceC0043az, d11, InterfaceC0048b3, r60, InterfaceC0847wo {

    /* JADX INFO: renamed from: l */
    public static volatile b90 f785l;

    /* JADX INFO: renamed from: n */
    public static volatile b90 f787n;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f792j;

    /* JADX INFO: renamed from: k */
    public Object f793k;

    /* JADX INFO: renamed from: m */
    public static final Object f786m = new Object();

    /* JADX INFO: renamed from: o */
    public static final m70 f788o = new m70(1);

    /* JADX INFO: renamed from: p */
    public static final String[] f789p = {"_data"};

    /* JADX INFO: renamed from: q */
    public static final x80 f790q = new x80(23);

    /* JADX INFO: renamed from: r */
    public static final sa2 f791r = new sa2();

    public b90(int i) {
        oo0 oo0Var;
        this.f792j = i;
        switch (i) {
            case 1:
                this.f793k = new ConcurrentHashMap();
                break;
            case 2:
                try {
                    oo0Var = (oo0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    oo0Var = f788o;
                }
                oo0[] oo0VarArr = {m70.f4995b, oo0Var};
                vl0 vl0Var = new vl0();
                vl0Var.f8217a = oo0VarArr;
                Charset charset = fe0.f2381a;
                this.f793k = vl0Var;
                break;
            case 4:
                int i2 = fo1.f2465a;
                this.f793k = new an0(15, new xp1[]{nc1.f5379r, f790q});
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                this.f793k = new AtomicLong();
                break;
            case 16:
                this.f793k = new o31(19);
                break;
            case 20:
                break;
            default:
                this.f793k = new HashSet();
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public static b90 m606u() {
        if (f787n == null) {
            synchronized (f786m) {
                try {
                    if (f787n == null) {
                        f787n = new b90(1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b90 b90Var = f787n;
        p80.m3863h(b90Var);
        return b90Var;
    }

    /* JADX INFO: renamed from: z */
    public static void m607z(String str, ra2 ra2Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(ra2Var.f6771b / 1000000)));
        sb.append(": logging error [");
        za2 za2Var = ra2Var.f6773d;
        if (za2Var == null) {
            C0270h1.m2191g("cannot request log site information prior to postProcess()");
            return;
        }
        hn0.m2322r(1, za2Var, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    @Override // p000.InterfaceC0435lj
    /* JADX INFO: renamed from: a */
    public void mo608a(InterfaceC0187eu interfaceC0187eu) {
        ((InterfaceC0435lj) this.f793k).mo608a(interfaceC0187eu);
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        List list = (List) obj;
        Collections.sort(list, (c40) this.f793k);
        return list;
    }

    @Override // p000.do0
    /* JADX INFO: renamed from: b */
    public void mo609b(on0 on0Var, boolean z) {
        if (on0Var instanceof gb1) {
            ((gb1) on0Var).f2684I.mo2020k().m3707c(false);
        }
        do0 do0Var = ((C0603q2) this.f793k).f6328n;
        if (do0Var != null) {
            do0Var.mo609b(on0Var, z);
        }
    }

    @Override // p000.InterfaceC0043az
    /* JADX INFO: renamed from: c */
    public Object mo155c() {
        C0547ok c0547ok = (C0547ok) this.f793k;
        return new C0078bx((w80) c0547ok.f5762a, (w80) c0547ok.f5763b, (w80) c0547ok.f5764c, (w80) c0547ok.f5765d, (C0892xw) c0547ok.f5766e, (C0892xw) c0547ok.f5767f, (qd0) c0547ok.f5768g);
    }

    @Override // p000.InterfaceC0847wo
    /* JADX INFO: renamed from: d */
    public void mo610d() {
        ((h01) this.f793k).m2184e();
    }

    @Override // p000.d11
    /* JADX INFO: renamed from: e */
    public void mo611e() {
        d10 d10Var = ((b10) this.f793k).f674q;
        zc0 zc0Var = d10Var.f1516s;
        if (zc0Var == null || d10Var.f1517t == null) {
            return;
        }
        m80.m3347n("Impression timer onFinish for: ".concat((String) zc0Var.f9733b.f5010l));
        ((C0963zt) d10Var.f1517t).m6033b();
    }

    @Override // p000.InterfaceC0048b3
    /* JADX INFO: renamed from: f */
    public void mo585f(Object obj) {
        C0004a3 c0004a3 = (C0004a3) obj;
        t50 t50Var = (t50) this.f793k;
        p50 p50Var = (p50) t50Var.f7286F.pollLast();
        if (p50Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = p50Var.f5989j;
        int i = p50Var.f5990k;
        c50 c50VarM1663i = t50Var.f7299c.m1663i(str);
        if (c50VarM1663i != null) {
            c50VarM1663i.m874p(i, c0004a3.f29j, c0004a3.f30k);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // p000.InterfaceC0627qq
    /* JADX INFO: renamed from: g */
    public short mo612g() throws IOException {
        int i = ((InputStream) this.f793k).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C0590pq();
    }

    @Override // p000.InterfaceC0538ob
    /* JADX INFO: renamed from: i */
    public void mo613i(C0253gl c0253gl) {
        boolean z = c0253gl.f2796k == 0;
        AbstractC0575pb abstractC0575pb = (AbstractC0575pb) this.f793k;
        if (z) {
            abstractC0575pb.m3889j(null, abstractC0575pb.mo1393k());
            return;
        }
        InterfaceC0501nb interfaceC0501nb = abstractC0575pb.f6061p;
        if (interfaceC0501nb != null) {
            interfaceC0501nb.mo2852c(c0253gl);
        }
    }

    @Override // p000.jk0
    /* JADX INFO: renamed from: j */
    public void mo614j() {
        ((AtomicLong) this.f793k).getAndAdd(1L);
    }

    @Override // p000.InterfaceC0277h8
    /* JADX INFO: renamed from: k */
    public InterfaceC0551oo mo615k(AssetManager assetManager, String str) {
        return new d00(assetManager, str, 0);
    }

    @Override // p000.InterfaceC0627qq
    /* JADX INFO: renamed from: l */
    public int mo616l() {
        return mo612g() | (mo612g() << 8);
    }

    @Override // p000.InterfaceC0847wo
    /* JADX INFO: renamed from: m */
    public Object mo617m() {
        h01 h01Var = (h01) this.f793k;
        h01Var.reset();
        return h01Var;
    }

    @Override // p000.hd1
    /* JADX INFO: renamed from: n */
    public Cursor mo618n(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.f793k).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f789p, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // p000.InterfaceC0627qq
    /* JADX INFO: renamed from: o */
    public int mo619o(int i, byte[] bArr) throws C0590pq {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.f793k).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C0590pq();
        }
        return i2;
    }

    @Override // p000.InterfaceC0435lj
    public void onComplete() {
        ((InterfaceC0435lj) this.f793k).onComplete();
    }

    @Override // p000.InterfaceC0435lj
    public void onError(Throwable th) {
        ((InterfaceC0435lj) this.f793k).onComplete();
    }

    @Override // p000.InterfaceC0752u3
    /* JADX INFO: renamed from: p */
    public void mo620p(Set set) {
        C0863x3 c0863x3 = (C0863x3) this.f793k;
        ConcurrentHashMap concurrentHashMap = c0863x3.f8774b;
        if (!concurrentHashMap.containsKey("fiam") || concurrentHashMap.get("fiam") == null || set == null || set.isEmpty()) {
            return;
        }
        HashSet hashSet = ((hw1) c0863x3.f8774b.get("fiam")).f3350a;
        hashSet.clear();
        HashSet hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet2.size() >= 50) {
                break;
            }
            q01 q01Var = ou1.f5916a;
            if (str != null && str.length() != 0) {
                int iCodePointAt = str.codePointAt(0);
                if (!Character.isLetter(iCodePointAt)) {
                    if (iCodePointAt == 95) {
                        iCodePointAt = 95;
                    }
                }
                int length = str.length();
                int iCharCount = Character.charCount(iCodePointAt);
                while (true) {
                    if (iCharCount >= length) {
                        if (str.length() != 0) {
                            int iCodePointAt2 = str.codePointAt(0);
                            if (!Character.isLetter(iCodePointAt2)) {
                                break;
                            }
                            int length2 = str.length();
                            int iCharCount2 = Character.charCount(iCodePointAt2);
                            while (true) {
                                if (iCharCount2 < length2) {
                                    int iCodePointAt3 = str.codePointAt(iCharCount2);
                                    if (iCodePointAt3 != 95 && !Character.isLetterOrDigit(iCodePointAt3)) {
                                        break;
                                    } else {
                                        iCharCount2 += Character.charCount(iCodePointAt3);
                                    }
                                } else {
                                    String strM5656r = AbstractC0875xf.m5656r(str, zg1.f9762h, zg1.f9767m);
                                    if (strM5656r != null) {
                                        str = strM5656r;
                                    }
                                    hashSet2.add(str);
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    } else {
                        int iCodePointAt4 = str.codePointAt(iCharCount);
                        if (iCodePointAt4 != 95 && !Character.isLetterOrDigit(iCodePointAt4)) {
                            break;
                        } else {
                            iCharCount += Character.charCount(iCodePointAt4);
                        }
                    }
                }
            }
        }
        hashSet.addAll(hashSet2);
    }

    @Override // p000.do0
    /* JADX INFO: renamed from: q */
    public boolean mo621q(on0 on0Var) {
        C0603q2 c0603q2 = (C0603q2) this.f793k;
        if (on0Var == c0603q2.f6326l) {
            return false;
        }
        ((gb1) on0Var).f2685J.getClass();
        do0 do0Var = c0603q2.f6328n;
        if (do0Var != null) {
            return do0Var.mo621q(on0Var);
        }
        return false;
    }

    @Override // p000.t10
    /* JADX INFO: renamed from: r */
    public Object mo622r(u10 u10Var, AbstractC0882xm abstractC0882xm) {
        Object objMo622r = ((C0312i6) this.f793k).mo622r(new C0367jp(0, u10Var), abstractC0882xm);
        return objMo622r == EnumC0513nn.f5459j ? objMo622r : kf1.f4365a;
    }

    /* JADX INFO: renamed from: s */
    public boolean m623s(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m627y(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    @Override // p000.InterfaceC0627qq
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f793k;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        switch (this.f792j) {
            case 9:
                return new C0314i8(0, (AssetManager) this.f793k, this);
            default:
                return new C0058bd(1, (o31) this.f793k);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m624v() {
        ((e50) this.f793k).f1954q.m4706P();
    }

    /* JADX INFO: renamed from: w */
    public void m625w(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f793k;
        if ((serviceConnection instanceof o52) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m626x(int i, Object obj, r51 r51Var) {
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) this.f793k;
        abstractC0397ki.mo2075w(i, 3);
        r51Var.mo4255h((AbstractC0342j0) obj, abstractC0397ki.f4385a);
        abstractC0397ki.mo2075w(i, 4);
    }

    /* JADX INFO: renamed from: y */
    public boolean m627y(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f793k;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((tk1.m4792a(context).m1501d(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof o52) {
            if (executor == null) {
                executor = null;
            }
            return executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    public b90(AbstractC0575pb abstractC0575pb) {
        this.f792j = 12;
        Objects.requireNonNull(abstractC0575pb);
        this.f793k = abstractC0575pb;
    }

    public b90(InputStream inputStream, nk0 nk0Var) {
        this.f792j = 29;
        h01 h01Var = new h01(inputStream, nk0Var);
        this.f793k = h01Var;
        h01Var.mark(5242880);
    }

    public b90(C0884xo c0884xo) {
        this.f792j = 26;
        this.f793k = Collections.unmodifiableMap(new HashMap(c0884xo.f9009a));
    }

    public b90(AbstractC0397ki abstractC0397ki) {
        this.f792j = 13;
        fe0.m1772a(abstractC0397ki, "output");
        this.f793k = abstractC0397ki;
        abstractC0397ki.f4385a = this;
    }

    public /* synthetic */ b90(int i, Object obj) {
        this.f792j = i;
        this.f793k = obj;
    }

    public b90(boolean z) {
        this.f792j = 10;
        this.f793k = new AtomicBoolean(z);
    }

    public b90(C0398kj c0398kj, InterfaceC0435lj interfaceC0435lj) {
        this.f792j = 14;
        this.f793k = interfaceC0435lj;
    }
}
