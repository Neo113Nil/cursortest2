package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import I2.C0310s;
import I2.C0311t;
import I2.J;
import I2.P;
import J2.d;
import J2.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class zzcax {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzbck zze;
    private final zzbcn zzf;
    private final C0311t zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcac zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = C0252s.f2717f.f2722e.nextInt(100) < ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzmG)).intValue();
    }

    public zzcax(Context context, VersionInfoParcel versionInfoParcel, String str, zzbcn zzbcnVar, zzbck zzbckVar) {
        t tVar = new t(6);
        tVar.D0("min_1", Double.MIN_VALUE, 1.0d);
        tVar.D0("1_5", 1.0d, 5.0d);
        tVar.D0("5_10", 5.0d, 10.0d);
        tVar.D0("10_20", 10.0d, 20.0d);
        tVar.D0("20_30", 20.0d, 30.0d);
        tVar.D0("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = new C0311t(tVar);
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbcnVar;
        this.zze = zzbckVar;
        String str2 = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzP);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
            try {
                this.zzh[i7] = Long.parseLong(strArrSplit[i7]);
            } catch (NumberFormatException e7) {
                int i8 = J.f3546b;
                j.h("Unable to parse frame hash target time number.", e7);
                this.zzh[i7] = -1;
            }
        }
    }

    public final void zza(zzcac zzcacVar) {
        zzbcf.zza(this.zzf, this.zze, "vpc2");
        this.zzj = true;
        this.zzf.zzd("vpn", zzcacVar.zzj());
        this.zzo = zzcacVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbcf.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbcf.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzd() {
        Bundle bundleG0;
        if (!zza || this.zzp) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString(SentryBaseEvent.JsonKeys.REQUEST, this.zzc);
        bundle.putString("player", this.zzo.zzj());
        C0311t c0311t = this.zzg;
        c0311t.getClass();
        String[] strArr = c0311t.f3645a;
        ArrayList<C0310s> arrayList = new ArrayList(strArr.length);
        int i7 = 0;
        while (i7 < strArr.length) {
            String str = strArr[i7];
            double d7 = c0311t.f3647c[i7];
            double d8 = c0311t.f3646b[i7];
            int i8 = c0311t.f3648d[i7];
            arrayList.add(new C0310s(str, d7, d8, ((double) i8) / ((double) c0311t.f3649e), i8));
            i7++;
            bundle = bundle;
            c0311t = c0311t;
        }
        Bundle bundle2 = bundle;
        for (C0310s c0310s : arrayList) {
            String strValueOf = String.valueOf(c0310s.f3640a);
            bundle2.putString("fps_c_".concat(strValueOf), Integer.toString(c0310s.f3644e));
            String strValueOf2 = String.valueOf(c0310s.f3640a);
            bundle2.putString("fps_p_".concat(strValueOf2), Double.toString(c0310s.f3643d));
        }
        int i9 = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i9 >= jArr.length) {
                break;
            }
            String str2 = this.zzi[i9];
            if (str2 != null) {
                bundle2.putString("fh_".concat(Long.valueOf(jArr[i9]).toString()), str2);
            }
            i9++;
        }
        final Context context = this.zzb;
        VersionInfoParcel versionInfoParcel = this.zzd;
        final P p5 = o.f1952C.f1957c;
        String str3 = versionInfoParcel.f10834a;
        p5.getClass();
        bundle2.putString(Device.TYPE, P.H());
        zzbbp zzbbpVar = zzbby.zza;
        C0254t c0254t = C0254t.f2723d;
        bundle2.putString("eids", TextUtils.join(",", c0254t.f2724a.zza()));
        if (bundle2.isEmpty()) {
            int i10 = J.f3546b;
            j.b("Empty or null bundle.");
        } else {
            final String str4 = (String) c0254t.f2726c.zzb(zzbby.zzkA);
            boolean andSet = p5.f3583d.getAndSet(true);
            AtomicReference atomicReference = p5.f3582c;
            if (!andSet) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: I2.N
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str5) {
                        p5.f3582c.set(Q0.a.g0(context, str4));
                    }
                };
                if (TextUtils.isEmpty(str4)) {
                    bundleG0 = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleG0 = Q0.a.g0(context, str4);
                }
                atomicReference.set(bundleG0);
            }
            bundle2.putAll((Bundle) atomicReference.get());
        }
        d dVar = C0252s.f2717f.f2718a;
        d.o(context, str3, bundle2, new V0(16, context, str3, false));
        this.zzp = true;
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcac zzcacVar) {
        if (this.zzl && !this.zzm) {
            if (J.m() && !this.zzm) {
                J.k("VideoMetricsMixin first frame");
            }
            zzbcf.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        o.f1952C.j.getClass();
        long jNanoTime = System.nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            long j = jNanoTime - this.zzr;
            C0311t c0311t = this.zzg;
            double d7 = nanos / j;
            c0311t.f3649e++;
            int i7 = 0;
            while (true) {
                double[] dArr = c0311t.f3647c;
                if (i7 >= dArr.length) {
                    break;
                }
                double d8 = dArr[i7];
                if (d8 <= d7 && d7 < c0311t.f3646b[i7]) {
                    int[] iArr = c0311t.f3648d;
                    iArr[i7] = iArr[i7] + 1;
                }
                if (d7 < d8) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.zzq = this.zzn;
        this.zzr = jNanoTime;
        long jLongValue = ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzQ)).longValue();
        long jZza = zzcacVar.zza();
        int i8 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i8 >= strArr.length) {
                return;
            }
            if (strArr[i8] == null && jLongValue > Math.abs(jZza - this.zzh[i8])) {
                String[] strArr2 = this.zzi;
                int i9 = 8;
                Bitmap bitmap = zzcacVar.getBitmap(8, 8);
                long j3 = 63;
                int i10 = 0;
                long j7 = 0;
                while (i10 < i9) {
                    int i11 = 0;
                    while (i11 < i9) {
                        int pixel = bitmap.getPixel(i11, i10);
                        j7 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j3);
                        j3--;
                        i11++;
                        i9 = 8;
                    }
                    i10++;
                    i9 = 8;
                }
                strArr2[i8] = String.format("%016X", Long.valueOf(j7));
                return;
            }
            i8++;
        }
    }
}
