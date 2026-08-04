package P2;

import F2.C0254t;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbyc;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzctt;
import com.google.android.gms.internal.ads.zzctu;
import com.google.android.gms.internal.ads.zzcuh;
import com.google.android.gms.internal.ads.zzdde;
import com.google.android.gms.internal.ads.zzdpy;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzfdy;
import com.google.android.gms.internal.ads.zzfey;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzfpu;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzfpz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzheg;
import com.google.android.gms.internal.ads.zzheo;
import com.google.android.gms.internal.ads.zzhep;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class s implements zzheg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzhep f5550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzhep f5551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f5552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzctu f5553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzhep f5554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzhep f5555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzhep f5556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzhep f5557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzcuh f5558i;

    public s(zzhep zzhepVar, zzhep zzhepVar2, u uVar, zzctu zzctuVar, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzcuh zzcuhVar) {
        this.f5550a = zzhepVar;
        this.f5551b = zzhepVar2;
        this.f5552c = uVar;
        this.f5553d = zzctuVar;
        this.f5554e = zzhepVar3;
        this.f5555f = zzhepVar4;
        this.f5556g = zzhepVar5;
        this.f5557h = zzhepVar6;
        this.f5558i = zzcuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        t tVar;
        I3.b bVarZza;
        String string;
        int i7;
        String string2;
        int i8;
        v vVar;
        Iterator it;
        t tVar2;
        BinderC0386l binderC0386l = (BinderC0386l) this.f5550a.zzb();
        zzffe zzffeVar = (zzffe) this.f5551b.zzb();
        t tVar3 = new t(zzfdy.zzc(), ((zzdvv) this.f5552c.f5562b).zzb());
        zzctt zzcttVarZzb = this.f5553d.zzb();
        zzdde zzddeVar = (zzdde) this.f5554e.zzb();
        o oVar = (o) this.f5555f.zzb();
        zzbyc zzbycVar = (zzbyc) this.f5556g.zzb();
        int iIntValue = ((Integer) this.f5557h.zzb()).intValue();
        Bundle bundle = this.f5558i.zza().zzs;
        v vVar2 = null;
        if (iIntValue != 1 || zzbycVar == null) {
            tVar = tVar3;
        } else {
            String strZza = zzdpy.READ_FROM_DISK_START.zza();
            E2.o oVar2 = E2.o.f1952C;
            oVar2.j.getClass();
            bundle.putLong(strZza, System.currentTimeMillis());
            oVar.getClass();
            o.c(bundle, zzdpy.SIGNAL_ON_DISK_VALIDATION_START);
            if (((I2.M) oVar2.f1961g.zzi()).k()) {
                oVar.f5539b.c();
                o.d(7, bundle);
            } else {
                if (oVar.f5542e == null) {
                    oVar.f5539b.c();
                    o.d(10, bundle);
                } else {
                    A a2 = oVar.f5539b;
                    Context context = oVar.f5538a;
                    a2.e();
                    synchronized (a2.f5403d) {
                        string = a2.f5400a.getString("pn", null);
                    }
                    a2.e();
                    synchronized (a2.f5403d) {
                        i7 = a2.f5400a.getInt("vc", -1);
                    }
                    a2.e();
                    synchronized (a2.f5403d) {
                        string2 = a2.f5400a.getString("dm", null);
                    }
                    a2.e();
                    synchronized (a2.f5403d) {
                        i8 = a2.f5400a.getInt("aav", -1);
                    }
                    if (TextUtils.equals(context.getApplicationInfo().packageName, string) && i7 == oVar.f5542e.versionCode && TextUtils.equals(Build.MODEL, string2) && i8 == Build.VERSION.SDK_INT) {
                        Iterator it2 = oVar.f5539b.b().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            try {
                                long j = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                                E2.o oVar3 = E2.o.f1952C;
                                oVar3.j.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                zzbbp zzbbpVar = zzbby.zzhB;
                                it = it2;
                                try {
                                    C0254t c0254t = C0254t.f2723d;
                                    tVar2 = tVar3;
                                    try {
                                        if (jCurrentTimeMillis <= ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue()) {
                                            zzfpu zzfpuVarZzh = zzfpy.zzj(oVar.f5538a).zzh(((Long) c0254t.f2726c.zzb(zzbby.zzdu)).longValue(), ((I2.M) oVar3.f1961g.zzi()).k());
                                            zzfpu zzfpuVarZzh2 = zzfpz.zzi(oVar.f5538a).zzh(((Long) c0254t.f2726c.zzb(zzbby.zzdv)).longValue(), ((I2.M) oVar3.f1961g.zzi()).k());
                                            if ((zzfpuVarZzh.zza() == -1 || zzfpuVarZzh.zza() <= j) && (zzfpuVarZzh2.zza() == -1 || zzfpuVarZzh2.zza() <= j)) {
                                            }
                                            it2 = it;
                                            tVar3 = tVar2;
                                        }
                                        oVar.f5539b.a((String) entry.getKey());
                                    } catch (IOException | JSONException unused) {
                                    }
                                } catch (IOException | JSONException unused2) {
                                    tVar2 = tVar3;
                                }
                            } catch (IOException | JSONException unused3) {
                                it = it2;
                            }
                            it2 = it;
                            tVar3 = tVar2;
                        }
                        tVar = tVar3;
                    } else {
                        tVar = tVar3;
                        oVar.f5539b.c();
                        oVar.f5539b.d(oVar.f5542e.versionCode, Build.VERSION.SDK_INT, oVar.f5538a.getApplicationInfo().packageName, Build.MODEL);
                    }
                    o.c(bundle, zzdpy.SIGNAL_ON_DISK_VALIDATION_END);
                    E2.o.f1952C.j.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - oVar.f5540c;
                    zzbbp zzbbpVar2 = zzbby.zzhy;
                    C0254t c0254t2 = C0254t.f2723d;
                    if (jCurrentTimeMillis2 > ((Long) c0254t2.f2726c.zzb(zzbbpVar2)).longValue()) {
                        o.d(2, bundle);
                    } else {
                        o.c(bundle, zzdpy.SIGNAL_ON_DISK_CACHE_KEY_START);
                        String str = zzbycVar.zza;
                        String str2 = zzbycVar.zzb;
                        String string3 = zzbycVar.zzd.f10743E.toString();
                        String string4 = zzbycVar.zzd.f10758c.toString();
                        zzm zzmVar = zzbycVar.zzd;
                        String strA = J2.d.a(str + str2 + string3 + string4 + zzmVar.f10764z + zzmVar.f10745G + String.valueOf(zzmVar.f10744F), "SHA-256");
                        if (TextUtils.isEmpty(strA)) {
                            o.d(3, bundle);
                        } else {
                            o.c(bundle, zzdpy.SIGNAL_ON_DISK_CACHE_KEY_END);
                            o.c(bundle, zzdpy.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                            String strA2 = oVar.f5539b.a(strA);
                            o.c(bundle, zzdpy.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                            if (!oVar.b()) {
                                oVar.f5541d.schedule(new A2.c(oVar, strA, binderC0386l, new zzbyc(zzbycVar.zza, zzbycVar.zzb, zzbycVar.zzc, zzbycVar.zzd, 2, strA), 2), ((Long) c0254t2.f2726c.zzb(zzbby.zzhA)).longValue(), TimeUnit.MILLISECONDS);
                            }
                            if (TextUtils.isEmpty(strA2)) {
                                o.d(4, bundle);
                            } else {
                                o.c(bundle, zzdpy.SIGNAL_ON_DISK_DECODE_START);
                                try {
                                    JSONObject jSONObject = new JSONObject(strA2);
                                    String string5 = jSONObject.getString("sr");
                                    if (TextUtils.isEmpty(string5)) {
                                        o.d(8, bundle);
                                    } else {
                                        String string6 = jSONObject.getString("rs");
                                        if (TextUtils.isEmpty(string6)) {
                                            o.d(9, bundle);
                                        } else {
                                            String strA3 = o.a(new String(Base64.decode(string6, 10), StandardCharsets.UTF_8));
                                            o.c(bundle, zzdpy.SIGNAL_ON_DISK_DECODE_END);
                                            try {
                                                JsonReader jsonReader = new JsonReader(new StringReader(string5));
                                                vVar = null;
                                                try {
                                                    v vVar3 = new v(jsonReader, null);
                                                    vVar3.f5565c = strA3;
                                                    vVar3.f5567e = bundle;
                                                    bundle.putBoolean("sod_h", true);
                                                    vVar2 = vVar3;
                                                } catch (IOException e7) {
                                                    e = e7;
                                                    o.d(6, bundle);
                                                    E2.o.f1952C.f1961g.zzw(e, "DiskCachingManager.getSignalResponse");
                                                    vVar2 = vVar;
                                                }
                                            } catch (IOException e8) {
                                                e = e8;
                                                vVar = null;
                                            }
                                        }
                                    }
                                } catch (JSONException e9) {
                                    vVar = null;
                                    o.d(5, bundle);
                                    E2.o.f1952C.f1961g.zzw(e9, "DiskCachingManager.getSignalResponse");
                                }
                            }
                        }
                    }
                    vVar2 = null;
                }
                p150v0.a.n(E2.o.f1952C.j, bundle, zzdpy.READ_FROM_DISK_END.zza());
            }
            tVar = tVar3;
            p150v0.a.n(E2.o.f1952C.j, bundle, zzdpy.READ_FROM_DISK_END.zza());
        }
        if (vVar2 != null) {
            zzddeVar.zza(vVar2);
            bVarZza = zzgbc.zzh(vVar2);
        } else {
            bVarZza = zzffeVar.zzb(zzfey.GENERATE_SIGNALS, zzcttVarZzb.zzc()).zzf(tVar).zzi(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzfD)).intValue(), TimeUnit.SECONDS).zza();
            zzgbc.zzr(bVarZza, new C1010l1(zzddeVar), zzbza.zza);
        }
        zzheo.zzb(bVarZza);
        return bVarZza;
    }
}
