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
import v0.AbstractC1663a;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class s implements zzheg {

    /* renamed from: a, reason: collision with root package name */
    public final zzhep f5550a;

    /* renamed from: b, reason: collision with root package name */
    public final zzhep f5551b;

    /* renamed from: c, reason: collision with root package name */
    public final u f5552c;

    /* renamed from: d, reason: collision with root package name */
    public final zzctu f5553d;

    /* renamed from: e, reason: collision with root package name */
    public final zzhep f5554e;

    /* renamed from: f, reason: collision with root package name */
    public final zzhep f5555f;

    /* renamed from: g, reason: collision with root package name */
    public final zzhep f5556g;

    /* renamed from: h, reason: collision with root package name */
    public final zzhep f5557h;

    /* renamed from: i, reason: collision with root package name */
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

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b8, code lost:
    
        if (r9.zza() > r6) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0383  */
    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        t tVar;
        I3.b zza;
        String string;
        int i7;
        String string2;
        int i8;
        v vVar;
        JSONObject jSONObject;
        String string3;
        JsonReader jsonReader;
        Iterator it;
        t tVar2;
        long j;
        E2.o oVar;
        long currentTimeMillis;
        zzbbp zzbbpVar;
        C0254t c0254t;
        BinderC0386l binderC0386l = (BinderC0386l) this.f5550a.zzb();
        zzffe zzffeVar = (zzffe) this.f5551b.zzb();
        t tVar3 = new t(zzfdy.zzc(), ((zzdvv) this.f5552c.f5562b).zzb());
        zzctt zzb = this.f5553d.zzb();
        zzdde zzddeVar = (zzdde) this.f5554e.zzb();
        o oVar2 = (o) this.f5555f.zzb();
        zzbyc zzbycVar = (zzbyc) this.f5556g.zzb();
        int intValue = ((Integer) this.f5557h.zzb()).intValue();
        Bundle bundle = this.f5558i.zza().zzs;
        v vVar2 = null;
        if (intValue != 1) {
            tVar = tVar3;
        } else if (zzbycVar == null) {
            tVar = tVar3;
        } else {
            String zza2 = zzdpy.READ_FROM_DISK_START.zza();
            E2.o oVar3 = E2.o.f1952C;
            oVar3.j.getClass();
            bundle.putLong(zza2, System.currentTimeMillis());
            oVar2.getClass();
            o.c(bundle, zzdpy.SIGNAL_ON_DISK_VALIDATION_START);
            if (((I2.M) oVar3.f1961g.zzi()).k()) {
                oVar2.f5539b.c();
                o.d(7, bundle);
            } else if (oVar2.f5542e == null) {
                oVar2.f5539b.c();
                o.d(10, bundle);
            } else {
                A a2 = oVar2.f5539b;
                Context context = oVar2.f5538a;
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
                if (TextUtils.equals(context.getApplicationInfo().packageName, string) && i7 == oVar2.f5542e.versionCode && TextUtils.equals(Build.MODEL, string2) && i8 == Build.VERSION.SDK_INT) {
                    Iterator it2 = oVar2.f5539b.b().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        try {
                            j = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                            oVar = E2.o.f1952C;
                            oVar.j.getClass();
                            currentTimeMillis = System.currentTimeMillis() - j;
                            zzbbpVar = zzbby.zzhB;
                            it = it2;
                        } catch (IOException | JSONException unused) {
                            it = it2;
                        }
                        try {
                            c0254t = C0254t.f2723d;
                            tVar2 = tVar3;
                        } catch (IOException | JSONException unused2) {
                            tVar2 = tVar3;
                            it2 = it;
                            tVar3 = tVar2;
                        }
                        if (currentTimeMillis <= ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue()) {
                            zzfpu zzh = zzfpy.zzj(oVar2.f5538a).zzh(((Long) c0254t.f2726c.zzb(zzbby.zzdu)).longValue(), ((I2.M) oVar.f1961g.zzi()).k());
                            zzfpu zzh2 = zzfpz.zzi(oVar2.f5538a).zzh(((Long) c0254t.f2726c.zzb(zzbby.zzdv)).longValue(), ((I2.M) oVar.f1961g.zzi()).k());
                            if (zzh.zza() != -1) {
                            }
                            if (zzh2.zza() != -1) {
                                if (zzh2.zza() <= j) {
                                }
                            }
                            it2 = it;
                            tVar3 = tVar2;
                        }
                        oVar2.f5539b.a((String) entry.getKey());
                        it2 = it;
                        tVar3 = tVar2;
                    }
                    tVar = tVar3;
                } else {
                    tVar = tVar3;
                    oVar2.f5539b.c();
                    oVar2.f5539b.d(oVar2.f5542e.versionCode, Build.VERSION.SDK_INT, oVar2.f5538a.getApplicationInfo().packageName, Build.MODEL);
                }
                o.c(bundle, zzdpy.SIGNAL_ON_DISK_VALIDATION_END);
                E2.o.f1952C.j.getClass();
                long currentTimeMillis2 = System.currentTimeMillis() - oVar2.f5540c;
                zzbbp zzbbpVar2 = zzbby.zzhy;
                C0254t c0254t2 = C0254t.f2723d;
                if (currentTimeMillis2 > ((Long) c0254t2.f2726c.zzb(zzbbpVar2)).longValue()) {
                    o.d(2, bundle);
                } else {
                    o.c(bundle, zzdpy.SIGNAL_ON_DISK_CACHE_KEY_START);
                    String str = zzbycVar.zza;
                    String str2 = zzbycVar.zzb;
                    String bundle2 = zzbycVar.zzd.f10743E.toString();
                    String bundle3 = zzbycVar.zzd.f10758c.toString();
                    zzm zzmVar = zzbycVar.zzd;
                    String a4 = J2.d.a(str + str2 + bundle2 + bundle3 + zzmVar.f10764z + zzmVar.f10745G + String.valueOf(zzmVar.f10744F), "SHA-256");
                    if (TextUtils.isEmpty(a4)) {
                        o.d(3, bundle);
                    } else {
                        o.c(bundle, zzdpy.SIGNAL_ON_DISK_CACHE_KEY_END);
                        o.c(bundle, zzdpy.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                        String a7 = oVar2.f5539b.a(a4);
                        o.c(bundle, zzdpy.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                        if (!oVar2.b()) {
                            oVar2.f5541d.schedule(new A2.c(oVar2, a4, binderC0386l, new zzbyc(zzbycVar.zza, zzbycVar.zzb, zzbycVar.zzc, zzbycVar.zzd, 2, a4), 2), ((Long) c0254t2.f2726c.zzb(zzbby.zzhA)).longValue(), TimeUnit.MILLISECONDS);
                        }
                        if (TextUtils.isEmpty(a7)) {
                            o.d(4, bundle);
                        } else {
                            o.c(bundle, zzdpy.SIGNAL_ON_DISK_DECODE_START);
                            try {
                                jSONObject = new JSONObject(a7);
                                string3 = jSONObject.getString("sr");
                            } catch (JSONException e7) {
                                vVar = null;
                                o.d(5, bundle);
                                E2.o.f1952C.f1961g.zzw(e7, "DiskCachingManager.getSignalResponse");
                            }
                            if (TextUtils.isEmpty(string3)) {
                                o.d(8, bundle);
                            } else {
                                String string4 = jSONObject.getString("rs");
                                if (TextUtils.isEmpty(string4)) {
                                    o.d(9, bundle);
                                } else {
                                    String a8 = o.a(new String(Base64.decode(string4, 10), StandardCharsets.UTF_8));
                                    o.c(bundle, zzdpy.SIGNAL_ON_DISK_DECODE_END);
                                    try {
                                        jsonReader = new JsonReader(new StringReader(string3));
                                        vVar = null;
                                    } catch (IOException e8) {
                                        e = e8;
                                        vVar = null;
                                    }
                                    try {
                                        v vVar3 = new v(jsonReader, null);
                                        vVar3.f5565c = a8;
                                        vVar3.f5567e = bundle;
                                        bundle.putBoolean("sod_h", true);
                                        vVar2 = vVar3;
                                    } catch (IOException e9) {
                                        e = e9;
                                        o.d(6, bundle);
                                        E2.o.f1952C.f1961g.zzw(e, "DiskCachingManager.getSignalResponse");
                                        vVar2 = vVar;
                                        AbstractC1663a.n(E2.o.f1952C.j, bundle, zzdpy.READ_FROM_DISK_END.zza());
                                        if (vVar2 == null) {
                                        }
                                        zzheo.zzb(zza);
                                        return zza;
                                    }
                                    AbstractC1663a.n(E2.o.f1952C.j, bundle, zzdpy.READ_FROM_DISK_END.zza());
                                }
                            }
                        }
                    }
                }
                vVar2 = null;
                AbstractC1663a.n(E2.o.f1952C.j, bundle, zzdpy.READ_FROM_DISK_END.zza());
            }
            tVar = tVar3;
            AbstractC1663a.n(E2.o.f1952C.j, bundle, zzdpy.READ_FROM_DISK_END.zza());
        }
        if (vVar2 == null) {
            zzddeVar.zza(vVar2);
            zza = zzgbc.zzh(vVar2);
        } else {
            zza = zzffeVar.zzb(zzfey.GENERATE_SIGNALS, zzb.zzc()).zzf(tVar).zzi(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzfD)).intValue(), TimeUnit.SECONDS).zza();
            zzgbc.zzr(zza, new C1719l1(zzddeVar), zzbza.zza);
        }
        zzheo.zzb(zza);
        return zza;
    }
}
