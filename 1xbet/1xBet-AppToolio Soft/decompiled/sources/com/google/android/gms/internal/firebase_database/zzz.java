package com.google.android.gms.internal.firebase_database;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzz implements zzbf {
    private static long zzcb;
    private final zzhz zzbs;
    private zzah zzcc;
    private zzbc zzcd;
    private zzaa zzce;
    private int zzcf;

    public zzz(zzaf zzafVar, zzah zzahVar, String str, zzaa zzaaVar, String str2) {
        long j = zzcb;
        zzcb = 1 + j;
        this.zzcc = zzahVar;
        this.zzce = zzaaVar;
        zzia zzq = zzafVar.zzq();
        StringBuilder sb = new StringBuilder(25);
        sb.append("conn_");
        sb.append(j);
        this.zzbs = new zzhz(zzq, "Connection", sb.toString());
        this.zzcf = zzac.zzcj;
        this.zzcd = new zzbc(zzafVar, zzahVar, str, this, str2);
    }

    private final void zza(zzab zzabVar) {
        if (this.zzcf != zzac.zzcl) {
            if (this.zzbs.zzfa()) {
                this.zzbs.zza("closing realtime connection", null, new Object[0]);
            }
            this.zzcf = zzac.zzcl;
            zzbc zzbcVar = this.zzcd;
            if (zzbcVar != null) {
                zzbcVar.close();
                this.zzcd = null;
            }
            this.zzce.zzb(zzabVar);
        }
    }

    public final void close() {
        zza(zzab.OTHER);
    }

    public final void open() {
        if (this.zzbs.zzfa()) {
            this.zzbs.zza("Opening a connection", null, new Object[0]);
        }
        this.zzcd.open();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbf
    public final void zza(Map<String, Object> map) {
        zzab zzabVar;
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.zzbs.zzfa()) {
                    zzhz zzhzVar = this.zzbs;
                    String valueOf = String.valueOf(map.toString());
                    zzhzVar.zza(valueOf.length() != 0 ? "Failed to parse server message: missing message type:".concat(valueOf) : new String("Failed to parse server message: missing message type:"), null, new Object[0]);
                }
                zza(zzab.OTHER);
                return;
            }
            if (str.equals("d")) {
                Map<String, Object> map2 = (Map) map.get("d");
                if (this.zzbs.zzfa()) {
                    zzhz zzhzVar2 = this.zzbs;
                    String valueOf2 = String.valueOf(map2.toString());
                    zzhzVar2.zza(valueOf2.length() != 0 ? "received data message: ".concat(valueOf2) : new String("received data message: "), null, new Object[0]);
                }
                this.zzce.zzb(map2);
                return;
            }
            if (!str.equals("c")) {
                if (this.zzbs.zzfa()) {
                    zzhz zzhzVar3 = this.zzbs;
                    String valueOf3 = String.valueOf(str);
                    zzhzVar3.zza(valueOf3.length() != 0 ? "Ignoring unknown server message type: ".concat(valueOf3) : new String("Ignoring unknown server message type: "), null, new Object[0]);
                    return;
                }
                return;
            }
            Map map3 = (Map) map.get("d");
            if (this.zzbs.zzfa()) {
                zzhz zzhzVar4 = this.zzbs;
                String valueOf4 = String.valueOf(map3.toString());
                zzhzVar4.zza(valueOf4.length() != 0 ? "Got control message: ".concat(valueOf4) : new String("Got control message: "), null, new Object[0]);
            }
            try {
                String str2 = (String) map3.get("t");
                if (str2 == null) {
                    if (this.zzbs.zzfa()) {
                        zzhz zzhzVar5 = this.zzbs;
                        String valueOf5 = String.valueOf(map3.toString());
                        zzhzVar5.zza(valueOf5.length() != 0 ? "Got invalid control message: ".concat(valueOf5) : new String("Got invalid control message: "), null, new Object[0]);
                    }
                    zza(zzab.OTHER);
                    return;
                }
                if (str2.equals("s")) {
                    String str3 = (String) map3.get("d");
                    if (this.zzbs.zzfa()) {
                        this.zzbs.zza("Connection shutdown command received. Shutting down...", null, new Object[0]);
                    }
                    this.zzce.zze(str3);
                    zzabVar = zzab.OTHER;
                } else {
                    if (!str2.equals("r")) {
                        if (!str2.equals("h")) {
                            if (this.zzbs.zzfa()) {
                                zzhz zzhzVar6 = this.zzbs;
                                String valueOf6 = String.valueOf(str2);
                                zzhzVar6.zza(valueOf6.length() != 0 ? "Ignoring unknown control message: ".concat(valueOf6) : new String("Ignoring unknown control message: "), null, new Object[0]);
                                return;
                            }
                            return;
                        }
                        Map map4 = (Map) map3.get("d");
                        long longValue = ((Long) map4.get("ts")).longValue();
                        this.zzce.zzd((String) map4.get("h"));
                        String str4 = (String) map4.get("s");
                        if (this.zzcf == zzac.zzcj) {
                            if (this.zzbs.zzfa()) {
                                this.zzbs.zza("realtime connection established", null, new Object[0]);
                            }
                            this.zzcf = zzac.zzck;
                            this.zzce.zza(longValue, str4);
                            return;
                        }
                        return;
                    }
                    String str5 = (String) map3.get("d");
                    if (this.zzbs.zzfa()) {
                        zzhz zzhzVar7 = this.zzbs;
                        String host = this.zzcc.getHost();
                        StringBuilder sb = new StringBuilder(String.valueOf(host).length() + 62 + String.valueOf(str5).length());
                        sb.append("Got a reset; killing connection to ");
                        sb.append(host);
                        sb.append("; Updating internalHost to ");
                        sb.append(str5);
                        zzhzVar7.zza(sb.toString(), null, new Object[0]);
                    }
                    this.zzce.zzd(str5);
                    zzabVar = zzab.SERVER_RESET;
                }
                zza(zzabVar);
            } catch (ClassCastException e) {
                if (this.zzbs.zzfa()) {
                    zzhz zzhzVar8 = this.zzbs;
                    String valueOf7 = String.valueOf(e.toString());
                    zzhzVar8.zza(valueOf7.length() != 0 ? "Failed to parse control message: ".concat(valueOf7) : new String("Failed to parse control message: "), null, new Object[0]);
                }
                zza(zzab.OTHER);
            }
        } catch (ClassCastException e2) {
            if (this.zzbs.zzfa()) {
                zzhz zzhzVar9 = this.zzbs;
                String valueOf8 = String.valueOf(e2.toString());
                zzhzVar9.zza(valueOf8.length() != 0 ? "Failed to parse server message: ".concat(valueOf8) : new String("Failed to parse server message: "), null, new Object[0]);
            }
            zza(zzab.OTHER);
        }
    }

    public final void zza(Map<String, Object> map, boolean z) {
        zzhz zzhzVar;
        String str;
        Object[] objArr;
        HashMap hashMap = new HashMap();
        hashMap.put("t", "d");
        hashMap.put("d", map);
        if (this.zzcf != zzac.zzck) {
            this.zzbs.zza("Tried to send on an unconnected connection", null, new Object[0]);
            return;
        }
        if (z) {
            zzhzVar = this.zzbs;
            str = "Sending data (contents hidden)";
            objArr = new Object[0];
        } else {
            zzhzVar = this.zzbs;
            str = "Sending data: %s";
            objArr = new Object[]{hashMap};
        }
        zzhzVar.zza(str, null, objArr);
        this.zzcd.zze(hashMap);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbf
    public final void zza(boolean z) {
        zzhz zzhzVar;
        String str;
        this.zzcd = null;
        if (z || this.zzcf != zzac.zzcj) {
            if (this.zzbs.zzfa()) {
                zzhzVar = this.zzbs;
                str = "Realtime connection lost";
                zzhzVar.zza(str, null, new Object[0]);
            }
        } else if (this.zzbs.zzfa()) {
            zzhzVar = this.zzbs;
            str = "Realtime connection failed";
            zzhzVar.zza(str, null, new Object[0]);
        }
        zza(zzab.OTHER);
    }
}
