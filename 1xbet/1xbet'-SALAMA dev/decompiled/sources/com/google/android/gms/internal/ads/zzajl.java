package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzajl implements zzajq {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    @Override // com.google.android.gms.internal.ads.zzajq
    public final int zza(zzz zzzVar) {
        String str = zzzVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/vobsub":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    @Override // com.google.android.gms.internal.ads.zzajq
    public final zzajs zzb(zzz zzzVar) {
        String str = zzzVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new zzaki(zzzVar.zzr);
                case "text/vtt":
                    return new zzall();
                case "application/x-mp4-vtt":
                    return new zzala();
                case "application/x-subrip":
                    return new zzakm();
                case "application/x-quicktime-tx3g":
                    return new zzakx(zzzVar.zzr);
                case "application/pgs":
                    return new zzakg();
                case "application/vobsub":
                    return new zzakz(zzzVar.zzr);
                case "application/dvbsubs":
                    return new zzake(zzzVar.zzr);
                case "application/ttml+xml":
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
