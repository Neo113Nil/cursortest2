package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.google.common.base.a;
import com.google.common.base.j;
import com.google.common.base.k;
import com.google.common.base.s;
import com.google.common.base.t;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class zzkm {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkh zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        k.f(zzkk.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public /* synthetic */ zzkm(zzkg zzkgVar, String str, Object obj, boolean z, byte[] bArr) {
        if (zzkgVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkgVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzb(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        zzkh zzkhVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzkhVar != null) {
                            if (zzkhVar.zza() != context) {
                            }
                        }
                        if (zzkhVar != null) {
                            zzjr.zzd();
                            zzko.zzb();
                            zzjy.zzc();
                        }
                        zze = new zzjn(context, t.a(new s() { // from class: com.google.android.gms.internal.measurement.zzkl
                            @Override // com.google.common.base.s
                            /* renamed from: get */
                            public final /* synthetic */ Object get2() {
                                int i = zzkm.zzc;
                                return zzjz.zza(context);
                            }
                        }));
                        zzh.incrementAndGet();
                    }
                }
            } finally {
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:16:0x004b, B:18:0x0056, B:20:0x0060, B:22:0x0072, B:24:0x007a, B:27:0x00a1, B:30:0x00a9, B:31:0x00ac, B:32:0x00b0, B:33:0x0083, B:35:0x0087, B:37:0x0097, B:39:0x009d, B:43:0x00b5, B:44:0x00b8, B:48:0x00b9), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:16:0x004b, B:18:0x0056, B:20:0x0060, B:22:0x0072, B:24:0x007a, B:27:0x00a1, B:30:0x00a9, B:31:0x00ac, B:32:0x00b0, B:33:0x0083, B:35:0x0087, B:37:0x0097, B:39:0x009d, B:43:0x00b5, B:44:0x00b8, B:48:0x00b9), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd() {
        String str;
        Uri uri;
        String zze2;
        Object zze3;
        int i = zzh.get();
        if (this.zzi < i) {
            synchronized (this) {
                try {
                    if (this.zzi < i) {
                        zzkh zzkhVar = zze;
                        j jVar = a.a;
                        Object obj = null;
                        if (zzkhVar != null && zzkhVar.zzb() != null) {
                            s zzb = zzkhVar.zzb();
                            zzb.getClass();
                            jVar = (j) zzb.get2();
                            if (jVar.b()) {
                                zzjt zzjtVar = (zzjt) jVar.a();
                                zzkg zzkgVar = this.zza;
                                str = zzjtVar.zza(zzkgVar.zza, null, zzkgVar.zzc, this.zzb);
                                k.i(zzkhVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                                zzkg zzkgVar2 = this.zza;
                                uri = zzkgVar2.zza;
                                if (uri != null) {
                                    zzkhVar.zza();
                                    throw null;
                                }
                                zzjr zza = zzka.zza(zzkhVar.zza(), uri) ? zzjr.zza(zzkhVar.zza().getContentResolver(), uri, zzkj.zza) : null;
                                Object zza2 = (zza == null || (zze3 = zza.zze(this.zzb)) == null) ? null : zza(zze3);
                                if (zza2 == null) {
                                    if (!zzkgVar2.zzd && (zze2 = zzjy.zza(zzkhVar.zza()).zze(this.zzb)) != null) {
                                        obj = zza(zze2);
                                    }
                                    zza2 = obj == null ? this.zzg : obj;
                                }
                                if (jVar.b()) {
                                    zza2 = str == null ? this.zzg : zza(str);
                                }
                                this.zzj = zza2;
                                this.zzi = i;
                            }
                        }
                        str = null;
                        k.i(zzkhVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        zzkg zzkgVar22 = this.zza;
                        uri = zzkgVar22.zza;
                        if (uri != null) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzj;
    }
}
