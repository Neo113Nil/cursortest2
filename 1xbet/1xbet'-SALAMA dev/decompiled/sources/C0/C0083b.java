package C0;

import C0.C0083b;
import D6.y0;
import F2.C0254t;
import I2.M;
import K4.AbstractC0315b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbnk;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzcja;
import com.google.android.gms.internal.ads.zzdqp;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzfgb;
import com.google.android.gms.internal.ads.zzgaj;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbn;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: C0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0083b implements F1.l, F1.m, p040f2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1247c;

    public /* synthetic */ C0083b(int i7) {
        this.f1245a = i7;
    }

    public static final void H(zzdqq zzdqqVar, String str, long j) {
        if (zzdqqVar != null) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmE)).booleanValue()) {
                zzdqp zzdqpVarZza = zzdqqVar.zza();
                zzdqpVarZza.zzb("action", "lat_init");
                zzdqpVarZza.zzb(str, Long.toString(j));
                zzdqpVarZza.zzj();
            }
        }
    }

    public int A(int i7) {
        C0083b c0083b = (C0083b) this.f1247c;
        if (c0083b == null) {
            return i7 >= 64 ? Long.bitCount(this.f1246b) : Long.bitCount(this.f1246b & ((1 << i7) - 1));
        }
        if (i7 < 64) {
            return Long.bitCount(this.f1246b & ((1 << i7) - 1));
        }
        return Long.bitCount(this.f1246b) + c0083b.A(i7 - 64);
    }

    public void B(BufferedInputStream bufferedInputStream) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            int i7 = 0;
            while (true) {
                int i8 = bufferedInputStream.read(bArr, 0, 16384);
                if (i8 == -1) {
                    byteArrayOutputStream.flush();
                    ((TaskCompletionSource) this.f1247c).setResult(byteArrayOutputStream.toByteArray());
                    bufferedInputStream.close();
                    return;
                } else {
                    i7 += i8;
                    if (i7 > this.f1246b) {
                        Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                        throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                    }
                    byteArrayOutputStream.write(bArr, 0, i8);
                }
            }
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public boolean C(int i7) {
        if (i7 < 64) {
            return (this.f1246b & (1 << i7)) != 0;
        }
        if (((C0083b) this.f1247c) == null) {
            this.f1247c = new C0083b();
        }
        return ((C0083b) this.f1247c).C(i7 - 64);
    }

    public void D() {
        this.f1246b = 0L;
        C0083b c0083b = (C0083b) this.f1247c;
        if (c0083b != null) {
            c0083b.D();
        }
    }

    public void E(Runnable runnable) {
        AbstractC0315b abstractC0315b = (AbstractC0315b) this.f1247c;
        abstractC0315b.f4001f.d();
        if (abstractC0315b.f4004i == this.f1246b) {
            runnable.run();
        } else {
            Q0.a.v(1, abstractC0315b.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
        }
    }

    public void F(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f1247c) == null) {
            this.f1247c = exc;
            this.f1246b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f1246b) {
            Exception exc2 = (Exception) this.f1247c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f1247c;
            this.f1247c = null;
            throw exc3;
        }
    }

    public void G(Context context, VersionInfoParcel versionInfoParcel, boolean z4, zzbyk zzbykVar, String str, String str2, zzcja zzcjaVar, final zzfgb zzfgbVar, final zzdqq zzdqqVar, final Long l7) {
        PackageInfo packageInfoT;
        E2.o oVar = E2.o.f1952C;
        oVar.j.getClass();
        if (SystemClock.elapsedRealtime() - this.f1246b < 5000) {
            int i7 = I2.J.f3546b;
            J2.j.g("Not retrying to fetch app settings");
            return;
        }
        p090m3.b bVar = oVar.j;
        bVar.getClass();
        this.f1246b = SystemClock.elapsedRealtime();
        if (zzbykVar != null && !TextUtils.isEmpty(zzbykVar.zzc())) {
            long jZza = zzbykVar.zza();
            bVar.getClass();
            if (System.currentTimeMillis() - jZza <= ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzeo)).longValue() && zzbykVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            int i8 = I2.J.f3546b;
            J2.j.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i9 = I2.J.f3546b;
            J2.j.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f1247c = applicationContext;
        final zzffn zzffnVarZza = zzffm.zza(context, 4);
        zzffnVarZza.zzi();
        zzbnq zzbnqVarZza = oVar.f1970q.zza((Context) this.f1247c, versionInfoParcel, zzfgbVar);
        zzbnk zzbnkVar = zzbnn.zza;
        zzbng zzbngVarZza = zzbnqVarZza.zza("google.afma.config.fetchAppSettings", zzbnkVar, zzbnkVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z4);
            jSONObject.put("pn", context.getPackageName());
            zzbbp zzbbpVar = zzbby.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", C0254t.f2723d.f2724a.zza()));
            jSONObject.put("js", versionInfoParcel.f10834a);
            try {
                ApplicationInfo applicationInfo = ((Context) this.f1247c).getApplicationInfo();
                if (applicationInfo != null && (packageInfoT = p097n3.c.a(context).t(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoT.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                I2.J.k("Error fetching PackageInfo.");
            }
            I3.b bVarZzb = zzbngVarZza.zzb(jSONObject);
            zzgaj zzgajVar = new zzgaj(this) { // from class: E2.d
                @Override // com.google.android.gms.internal.ads.zzgaj
                public final I3.b zza(Object obj) throws JSONException {
                    Long l8 = l7;
                    zzdqq zzdqqVar2 = zzdqqVar;
                    zzffn zzffnVar = zzffnVarZza;
                    zzfgb zzfgbVar2 = zzfgbVar;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        o oVar2 = o.f1952C;
                        M m7 = (M) oVar2.f1961g.zzi();
                        m7.l();
                        synchronized (m7.f3551a) {
                            try {
                                oVar2.j.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (string == null || string.equals(m7.f3563n.zzc())) {
                                    m7.f3563n.zzg(jCurrentTimeMillis);
                                } else {
                                    m7.f3563n = new zzbyk(string, jCurrentTimeMillis);
                                    SharedPreferences.Editor editor = m7.f3557g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        m7.f3557g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                        m7.f3557g.apply();
                                    }
                                    m7.m();
                                    Iterator it = m7.f3553c.iterator();
                                    while (it.hasNext()) {
                                        ((Runnable) it.next()).run();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (l8 != null) {
                            o.f1952C.j.getClass();
                            C0083b.H(zzdqqVar2, "cld_s", SystemClock.elapsedRealtime() - l8.longValue());
                        }
                    }
                    String strOptString = jSONObject2.optString("errorMessage", "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        zzffnVar.zzc(strOptString);
                    }
                    zzffnVar.zzg(zOptBoolean);
                    zzfgbVar2.zzc(zzffnVar.zzm());
                    return zzgbc.zzh(null);
                }
            };
            zzgbn zzgbnVar = zzbza.zzg;
            I3.b bVarZzn = zzgbc.zzn(bVarZzb, zzgajVar, zzgbnVar);
            if (zzcjaVar != null) {
                bVarZzb.addListener(zzcjaVar, zzgbnVar);
            }
            if (l7 != null) {
                bVarZzb.addListener(new y0(this, zzdqqVar, l7), zzgbnVar);
            }
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhJ)).booleanValue()) {
                zzbzd.zzb(bVarZzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzbzd.zza(bVarZzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e7) {
            int i10 = I2.J.f3546b;
            J2.j.e("Error requesting application settings", e7);
            zzffnVarZza.zzh(e7);
            zzffnVarZza.zzg(false);
            zzfgbVar.zzc(zzffnVarZza.zzm());
        }
    }

    @Override // F1.l
    public boolean a(byte[] bArr, int i7, int i8, boolean z4) {
        return ((F1.h) this.f1247c).a(bArr, 0, i8, z4);
    }

    @Override // p040f2.g
    public long b(long j) {
        return ((F1.f) this.f1247c).f2522e[(int) j] - this.f1246b;
    }

    @Override // F1.l
    public boolean c(byte[] bArr, int i7, int i8, boolean z4) {
        return ((F1.h) this.f1247c).c(bArr, i7, i8, z4);
    }

    @Override // F1.l
    public long d() {
        return ((F1.h) this.f1247c).d() - this.f1246b;
    }

    @Override // p040f2.g
    public long e(long j, long j3) {
        return ((F1.f) this.f1247c).f2521d[(int) j];
    }

    @Override // p040f2.g
    public long f(long j, long j3) {
        return 0L;
    }

    @Override // p040f2.g
    public long g(long j, long j3) {
        return -9223372036854775807L;
    }

    @Override // F1.l
    public void h(int i7) throws EOFException, InterruptedIOException {
        ((F1.h) this.f1247c).b(i7, false);
    }

    @Override // p040f2.g
    public g2.j i(long j) {
        F1.f fVar = (F1.f) this.f1247c;
        int i7 = (int) j;
        return new g2.j(null, fVar.f2520c[i7], fVar.f2519b[i7]);
    }

    @Override // F1.l
    public long j() {
        return ((F1.h) this.f1247c).f2533c - this.f1246b;
    }

    @Override // p040f2.g
    public long l(long j, long j3) {
        return p151v2.t.f(((F1.f) this.f1247c).f2522e, j + this.f1246b, true);
    }

    @Override // F1.m
    public void m(F1.s sVar) {
        ((F1.m) this.f1247c).m(new K1.d(this, sVar));
    }

    @Override // F1.m
    public void n() {
        ((F1.m) this.f1247c).n();
    }

    @Override // F1.l
    public void p() {
        ((F1.h) this.f1247c).f2536f = 0;
    }

    @Override // F1.l
    public void q(int i7) {
        ((F1.h) this.f1247c).q(i7);
    }

    @Override // F1.m
    public F1.v r(int i7, int i8) {
        return ((F1.m) this.f1247c).r(i7, i8);
    }

    @Override // p146u2.InterfaceC0951j
    public int read(byte[] bArr, int i7, int i8) {
        return ((F1.h) this.f1247c).read(bArr, i7, i8);
    }

    @Override // F1.l
    public void readFully(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        ((F1.h) this.f1247c).a(bArr, i7, i8, false);
    }

    @Override // p040f2.g
    public boolean s() {
        return true;
    }

    public String toString() {
        switch (this.f1245a) {
            case 0:
                if (((C0083b) this.f1247c) == null) {
                    return Long.toBinaryString(this.f1246b);
                }
                return ((C0083b) this.f1247c).toString() + "xx" + Long.toBinaryString(this.f1246b);
            default:
                return super.toString();
        }
    }

    @Override // p040f2.g
    public long u() {
        return 0L;
    }

    @Override // p040f2.g
    public long v(long j) {
        return ((F1.f) this.f1247c).f2518a;
    }

    @Override // p040f2.g
    public long w(long j, long j3) {
        return ((F1.f) this.f1247c).f2518a;
    }

    @Override // F1.l
    public void y(byte[] bArr, int i7, int i8) {
        ((F1.h) this.f1247c).c(bArr, i7, i8, false);
    }

    @Override // F1.l
    public long z() {
        return ((F1.h) this.f1247c).f2534d - this.f1246b;
    }

    public /* synthetic */ C0083b(long j, Object obj, int i7) {
        this.f1245a = i7;
        this.f1246b = j;
        this.f1247c = obj;
    }

    public /* synthetic */ C0083b(Object obj, long j, int i7) {
        this.f1245a = i7;
        this.f1247c = obj;
        this.f1246b = j;
    }

    public C0083b(F1.h hVar, long j) {
        this.f1245a = 3;
        this.f1247c = hVar;
        p151v2.a.f(hVar.f2534d >= j);
        this.f1246b = j;
    }

    public C0083b() {
        this.f1245a = 0;
        this.f1246b = 0L;
    }
}
