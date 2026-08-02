package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzajl implements zzajq {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzajq
    public final int zza(zzz zzzVar) {
        char c3;
        String str = zzzVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
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
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzajq
    public final zzajs zzb(zzz zzzVar) {
        char c3;
        String str = zzzVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    return new zzaki(zzzVar.zzr);
                case 1:
                    return new zzall();
                case 2:
                    return new zzala();
                case 3:
                    return new zzakm();
                case 4:
                    return new zzakx(zzzVar.zzr);
                case 5:
                    return new zzakg();
                case 6:
                    return new zzakz(zzzVar.zzr);
                case 7:
                    return new zzake(zzzVar.zzr);
                case '\b':
                    return new zzaks();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final boolean zzc(zzz zzzVar) {
        String str = zzzVar.zzo;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}
