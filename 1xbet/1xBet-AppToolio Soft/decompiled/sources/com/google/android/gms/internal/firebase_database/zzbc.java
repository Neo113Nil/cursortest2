package com.google.android.gms.internal.firebase_database;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzbc {
    private static long zzev;
    private final ScheduledExecutorService zzbc;
    private final zzhz zzbs;
    private zzbg zzew;
    private boolean zzex = false;
    private boolean zzey = false;
    private long zzez = 0;
    private zzbp zzfa;
    private zzbf zzfb;
    private ScheduledFuture<?> zzfc;
    private ScheduledFuture<?> zzfd;
    private final zzaf zzfe;

    public zzbc(zzaf zzafVar, zzah zzahVar, String str, zzbf zzbfVar, String str2) {
        this.zzfe = zzafVar;
        this.zzbc = zzafVar.zzs();
        this.zzfb = zzbfVar;
        long j = zzev;
        zzev = 1 + j;
        zzia zzq = zzafVar.zzq();
        StringBuilder sb = new StringBuilder(23);
        sb.append("ws_");
        sb.append(j);
        this.zzbs = new zzhz(zzq, "WebSocket", sb.toString());
        str = str == null ? zzahVar.getHost() : str;
        boolean isSecure = zzahVar.isSecure();
        String namespace = zzahVar.getNamespace();
        String str3 = isSecure ? "wss" : "ws";
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 15 + String.valueOf(str).length() + String.valueOf(namespace).length());
        sb2.append(str3);
        sb2.append("://");
        sb2.append(str);
        sb2.append("/.ws?ns=");
        sb2.append(namespace);
        sb2.append("&v=5");
        String sb3 = sb2.toString();
        if (str2 != null) {
            String valueOf = String.valueOf(sb3);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(str2).length());
            sb4.append(valueOf);
            sb4.append("&ls=");
            sb4.append(str2);
            sb3 = sb4.toString();
        }
        URI create = URI.create(sb3);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", this.zzfe.zzv());
        this.zzew = new zzbh(this, new zzjr(this.zzfe, create, null, hashMap), null);
    }

    private final void shutdown() {
        this.zzey = true;
        this.zzfb.zza(this.zzex);
    }

    static /* synthetic */ boolean zza(zzbc zzbcVar, boolean z) {
        zzbcVar.zzex = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzas() {
        zzhz zzhzVar;
        String str;
        if (this.zzey) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.zzfc;
        if (scheduledFuture == null) {
            if (this.zzbs.zzfa()) {
                zzhzVar = this.zzbs;
                str = "Reset keepAlive";
                zzhzVar.zza(str, null, new Object[0]);
            }
            this.zzfc = this.zzbc.schedule(new zzbe(this), 45000L, TimeUnit.MILLISECONDS);
        }
        scheduledFuture.cancel(false);
        if (this.zzbs.zzfa()) {
            zzhzVar = this.zzbs;
            long delay = this.zzfc.getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(48);
            sb.append("Reset keepAlive. Remaining: ");
            sb.append(delay);
            str = sb.toString();
            zzhzVar.zza(str, null, new Object[0]);
        }
        this.zzfc = this.zzbc.schedule(new zzbe(this), 45000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzat() {
        if (!this.zzey) {
            if (this.zzbs.zzfa()) {
                this.zzbs.zza("closing itself", null, new Object[0]);
            }
            shutdown();
        }
        this.zzew = null;
        ScheduledFuture<?> scheduledFuture = this.zzfc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzau() {
        if (this.zzex || this.zzey) {
            return;
        }
        if (this.zzbs.zzfa()) {
            this.zzbs.zza("timed out on connect", null, new Object[0]);
        }
        this.zzew.close();
    }

    private final void zzb(int i) {
        this.zzez = i;
        this.zzfa = new zzbp();
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            long j = this.zzez;
            StringBuilder sb = new StringBuilder(41);
            sb.append("HandleNewFrameCount: ");
            sb.append(j);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
    }

    private final void zzj(String str) {
        this.zzfa.zzn(str);
        this.zzez--;
        if (this.zzez == 0) {
            try {
                this.zzfa.zzba();
                Map<String, Object> zzv = zzke.zzv(this.zzfa.toString());
                this.zzfa = null;
                if (this.zzbs.zzfa()) {
                    zzhz zzhzVar = this.zzbs;
                    String valueOf = String.valueOf(zzv);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("handleIncomingFrame complete frame: ");
                    sb.append(valueOf);
                    zzhzVar.zza(sb.toString(), null, new Object[0]);
                }
                this.zzfb.zza(zzv);
            } catch (IOException e) {
                zzhz zzhzVar2 = this.zzbs;
                String valueOf2 = String.valueOf(this.zzfa.toString());
                zzhzVar2.zza(valueOf2.length() != 0 ? "Error parsing frame: ".concat(valueOf2) : new String("Error parsing frame: "), e);
                close();
                shutdown();
            } catch (ClassCastException e2) {
                zzhz zzhzVar3 = this.zzbs;
                String valueOf3 = String.valueOf(this.zzfa.toString());
                zzhzVar3.zza(valueOf3.length() != 0 ? "Error parsing frame (cast error): ".concat(valueOf3) : new String("Error parsing frame (cast error): "), e2);
                close();
                shutdown();
            }
        }
    }

    private final String zzk(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt <= 0) {
                    return null;
                }
                zzb(parseInt);
                return null;
            } catch (NumberFormatException unused) {
            }
        }
        zzb(1);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(String str) {
        if (this.zzey) {
            return;
        }
        zzas();
        if (this.zzfa != null) {
            zzj(str);
            return;
        }
        String zzk = zzk(str);
        if (zzk != null) {
            zzj(zzk);
        }
    }

    public final void close() {
        if (this.zzbs.zzfa()) {
            this.zzbs.zza("websocket is being closed", null, new Object[0]);
        }
        this.zzey = true;
        this.zzew.close();
        ScheduledFuture<?> scheduledFuture = this.zzfd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture2 = this.zzfc;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void open() {
        this.zzew.connect();
        this.zzfd = this.zzbc.schedule(new zzbd(this), 30000L, TimeUnit.MILLISECONDS);
    }

    public final void zze(Map<String, Object> map) {
        String[] strArr;
        zzas();
        try {
            String zze = zzke.zze(map);
            if (zze.length() <= 16384) {
                strArr = new String[]{zze};
            } else {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < zze.length()) {
                    int i2 = i + 16384;
                    arrayList.add(zze.substring(i, Math.min(i2, zze.length())));
                    i = i2;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            if (strArr.length > 1) {
                zzbg zzbgVar = this.zzew;
                int length = strArr.length;
                StringBuilder sb = new StringBuilder(11);
                sb.append(length);
                zzbgVar.zzm(sb.toString());
            }
            for (String str : strArr) {
                this.zzew.zzm(str);
            }
        } catch (IOException e) {
            zzhz zzhzVar = this.zzbs;
            String valueOf = String.valueOf(map.toString());
            zzhzVar.zza(valueOf.length() != 0 ? "Failed to serialize message: ".concat(valueOf) : new String("Failed to serialize message: "), e);
            shutdown();
        }
    }
}
