package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzht {
    private final java.util.Deque zza = new java.util.ArrayDeque(16);

    private zzht(boolean z) {
    }

    public static com.google.android.gms.internal.fido.zzht zza() {
        return new com.google.android.gms.internal.fido.zzht(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0L;
        }
        return ((java.lang.Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j) {
        this.zza.pop();
        this.zza.push(java.lang.Long.valueOf(j));
    }

    public final void zzb() throws java.io.IOException {
        if (this.zza.isEmpty()) {
            return;
        }
        throw new java.io.IOException(java.lang.String.format("data item not completed, stackSize: %s scope: %s", java.lang.Integer.valueOf(this.zza.size()), java.lang.Long.valueOf(zzh())));
    }

    public final void zzc() throws java.io.IOException {
        long zzh = zzh();
        if (zzh >= 0) {
            throw new java.io.IOException(java.lang.String.format("expected indefinite length scope but found %s", java.lang.Long.valueOf(zzh)));
        }
        if (zzh == -5) {
            throw new java.io.IOException("expected a value for dangling key in indefinite-length map");
        }
        this.zza.pop();
    }

    public final void zzd() throws java.io.IOException {
        long zzh = zzh();
        if (zzh != -1) {
            if (zzh != -2) {
                return;
            } else {
                zzh = -2;
            }
        }
        throw new java.io.IOException(java.lang.String.format("expected non-string scope but found %s", java.lang.Long.valueOf(zzh)));
    }

    public final void zze(long j) throws java.io.IOException {
        long zzh = zzh();
        if (zzh != j) {
            if (zzh != -1) {
                if (zzh != -2) {
                    return;
                } else {
                    zzh = -2;
                }
            }
            throw new java.io.IOException(java.lang.String.format("expected non-string scope or scope %s but found %s", java.lang.Long.valueOf(j), java.lang.Long.valueOf(zzh)));
        }
    }

    public final void zzf() {
        long zzh = zzh();
        if (zzh == 1) {
            this.zza.pop();
            return;
        }
        if (zzh > 1) {
            zzi(zzh - 1);
        } else if (zzh == -4) {
            zzi(-5L);
        } else if (zzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j) {
        this.zza.push(java.lang.Long.valueOf(j));
    }
}
