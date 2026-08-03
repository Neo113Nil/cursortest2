package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzane implements com.google.android.gms.internal.ads.zzanj {
    @Override // com.google.android.gms.internal.ads.zzanj
    public final boolean zza(com.google.android.gms.internal.ads.zzv zzvVar) {
        java.lang.String str = zzvVar.zzp;
        return java.util.Objects.equals(str, "text/x-ssa") || java.util.Objects.equals(str, "text/vtt") || java.util.Objects.equals(str, "application/x-mp4-vtt") || java.util.Objects.equals(str, "application/x-subrip") || java.util.Objects.equals(str, "application/x-quicktime-tx3g") || java.util.Objects.equals(str, "application/pgs") || java.util.Objects.equals(str, "application/vobsub") || java.util.Objects.equals(str, "application/dvbsubs") || java.util.Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzanj
    public final int zzb(com.google.android.gms.internal.ads.zzv zzvVar) {
        char c;
        java.lang.String str = zzvVar.zzp;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                case 5:
                case 6:
                case 7:
                    return 2;
                case '\b':
                    return 1;
            }
        }
        java.lang.String.valueOf(str);
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzanj
    public final com.google.android.gms.internal.ads.zzanl zzc(com.google.android.gms.internal.ads.zzv zzvVar) {
        char c;
        java.lang.String str = zzvVar.zzp;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new com.google.android.gms.internal.ads.zzaob(zzvVar.zzs);
                case 1:
                    return new com.google.android.gms.internal.ads.zzapd();
                case 2:
                    return new com.google.android.gms.internal.ads.zzaot();
                case 3:
                    return new com.google.android.gms.internal.ads.zzaof();
                case 4:
                    return new com.google.android.gms.internal.ads.zzaoq(zzvVar.zzs);
                case 5:
                    return new com.google.android.gms.internal.ads.zzanz();
                case 6:
                    return new com.google.android.gms.internal.ads.zzaos(zzvVar.zzs);
                case 7:
                    return new com.google.android.gms.internal.ads.zzanx(zzvVar.zzs);
                case '\b':
                    return new com.google.android.gms.internal.ads.zzaol();
            }
        }
        java.lang.String.valueOf(str);
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
    }
}
