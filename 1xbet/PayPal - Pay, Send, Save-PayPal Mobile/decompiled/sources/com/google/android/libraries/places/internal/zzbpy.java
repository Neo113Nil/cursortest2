package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbpy extends com.google.android.libraries.places.internal.zzboh {
    private static final com.google.android.libraries.places.internal.zzbpw zze = new com.google.android.libraries.places.internal.zzbpr();
    private static final com.google.android.libraries.places.internal.zzbpw zzf = new com.google.android.libraries.places.internal.zzbps();
    private static final com.google.android.libraries.places.internal.zzbpw zzg = new com.google.android.libraries.places.internal.zzbpt();
    private static final com.google.android.libraries.places.internal.zzbpw zzh = new com.google.android.libraries.places.internal.zzbpu();
    private static final com.google.android.libraries.places.internal.zzbpx zzi = new com.google.android.libraries.places.internal.zzbpv();
    private final java.util.Deque zza;
    private java.util.Deque zzb;
    private int zzc;
    private boolean zzd;

    public zzbpy() {
        new java.util.ArrayDeque(2);
        this.zza = new java.util.ArrayDeque();
    }

    private final int zzm(com.google.android.libraries.places.internal.zzbpx zzbpxVar, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        zzd(i);
        java.util.Deque deque = this.zza;
        if (!deque.isEmpty()) {
            zzo();
        }
        while (i > 0 && !deque.isEmpty()) {
            com.google.android.libraries.places.internal.zzbxo zzbxoVar = (com.google.android.libraries.places.internal.zzbxo) deque.peek();
            int min = java.lang.Math.min(i, zzbxoVar.zzf());
            i2 = zzbpxVar.zza(zzbxoVar, min, obj, i2);
            i -= min;
            this.zzc -= min;
            zzo();
        }
        if (i <= 0) {
            return i2;
        }
        throw new java.lang.AssertionError("Failed executing read operation");
    }

    private final int zzn(com.google.android.libraries.places.internal.zzbpw zzbpwVar, int i, java.lang.Object obj, int i2) {
        try {
            return zzm(zzbpwVar, i, obj, i2);
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    private final void zzo() {
        if (((com.google.android.libraries.places.internal.zzbxo) this.zza.peek()).zzf() == 0) {
            zzp();
        }
    }

    private final void zzp() {
        if (!this.zzd) {
            ((com.google.android.libraries.places.internal.zzbxo) this.zza.remove()).close();
            return;
        }
        java.util.Deque deque = this.zzb;
        java.util.Deque deque2 = this.zza;
        deque.add((com.google.android.libraries.places.internal.zzbxo) deque2.remove());
        com.google.android.libraries.places.internal.zzbxo zzbxoVar = (com.google.android.libraries.places.internal.zzbxo) deque2.peek();
        if (zzbxoVar != null) {
            zzbxoVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboh, com.google.android.libraries.places.internal.zzbxo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            java.util.Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            } else {
                ((com.google.android.libraries.places.internal.zzbxo) deque.remove()).close();
            }
        }
        if (this.zzb != null) {
            while (!this.zzb.isEmpty()) {
                ((com.google.android.libraries.places.internal.zzbxo) this.zzb.remove()).close();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboh, com.google.android.libraries.places.internal.zzbxo
    public final boolean zza() {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!((com.google.android.libraries.places.internal.zzbxo) it.next()).zza()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzboh, com.google.android.libraries.places.internal.zzbxo
    public final void zzc() {
        if (!this.zzd) {
            throw new java.nio.InvalidMarkException();
        }
        java.util.Deque deque = this.zza;
        com.google.android.libraries.places.internal.zzbxo zzbxoVar = (com.google.android.libraries.places.internal.zzbxo) deque.peek();
        if (zzbxoVar != null) {
            int zzf2 = zzbxoVar.zzf();
            zzbxoVar.zzc();
            this.zzc += zzbxoVar.zzf() - zzf2;
        }
        while (true) {
            com.google.android.libraries.places.internal.zzbxo zzbxoVar2 = (com.google.android.libraries.places.internal.zzbxo) this.zzb.pollLast();
            if (zzbxoVar2 == null) {
                return;
            }
            zzbxoVar2.zzc();
            deque.addFirst(zzbxoVar2);
            this.zzc += zzbxoVar2.zzf();
        }
    }

    public final void zze(com.google.android.libraries.places.internal.zzbxo zzbxoVar) {
        boolean z = this.zzd && this.zza.isEmpty();
        if (zzbxoVar instanceof com.google.android.libraries.places.internal.zzbpy) {
            com.google.android.libraries.places.internal.zzbpy zzbpyVar = (com.google.android.libraries.places.internal.zzbpy) zzbxoVar;
            while (true) {
                java.util.Deque deque = zzbpyVar.zza;
                if (deque.isEmpty()) {
                    break;
                } else {
                    this.zza.add((com.google.android.libraries.places.internal.zzbxo) deque.remove());
                }
            }
            this.zzc += zzbpyVar.zzc;
            zzbpyVar.zzc = 0;
            zzbpyVar.close();
        } else {
            this.zza.add(zzbxoVar);
            this.zzc += zzbxoVar.zzf();
        }
        if (z) {
            ((com.google.android.libraries.places.internal.zzbxo) this.zza.peek()).zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final int zzg() {
        return zzn(zze, 1, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzh(int i) {
        zzn(zzf, i, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzi(byte[] bArr, int i, int i2) {
        zzn(zzg, i2, bArr, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzj(java.nio.ByteBuffer byteBuffer) {
        zzn(zzh, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzk(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        zzm(zzi, i, outputStream, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.libraries.places.internal.zzbpy] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.google.android.libraries.places.internal.zzbxo
    public final com.google.android.libraries.places.internal.zzbxo zzl(int i) {
        com.google.android.libraries.places.internal.zzbxo zzbxoVar;
        int i2;
        com.google.android.libraries.places.internal.zzbxo zzbxoVar2;
        boolean z;
        if (i <= 0) {
            return com.google.android.libraries.places.internal.zzbxr.zza();
        }
        zzd(i);
        this.zzc -= i;
        com.google.android.libraries.places.internal.zzbxo zzbxoVar3 = null;
        ?? r1 = 0;
        while (true) {
            java.util.Deque deque = this.zza;
            com.google.android.libraries.places.internal.zzbxo zzbxoVar4 = (com.google.android.libraries.places.internal.zzbxo) deque.peek();
            int zzf2 = zzbxoVar4.zzf();
            if (zzf2 > i) {
                zzbxoVar2 = zzbxoVar4.zzl(i);
                i2 = 0;
            } else {
                if (this.zzd) {
                    zzbxoVar = zzbxoVar4.zzl(zzf2);
                    zzp();
                } else {
                    zzbxoVar = (com.google.android.libraries.places.internal.zzbxo) deque.poll();
                }
                com.google.android.libraries.places.internal.zzbxo zzbxoVar5 = zzbxoVar;
                i2 = i - zzf2;
                zzbxoVar2 = zzbxoVar5;
            }
            if (zzbxoVar3 == null) {
                zzbxoVar3 = zzbxoVar2;
                z = r1;
            } else {
                if (r1 == 0) {
                    com.google.android.libraries.places.internal.zzbpy zzbpyVar = new com.google.android.libraries.places.internal.zzbpy(i2 != 0 ? java.lang.Math.min(deque.size() + 2, 16) : 2);
                    zzbpyVar.zze(zzbxoVar3);
                    zzbxoVar3 = zzbpyVar;
                    r1 = zzbxoVar3;
                }
                r1.zze(zzbxoVar2);
                z = r1;
            }
            if (i2 <= 0) {
                return zzbxoVar3;
            }
            i = i2;
            r1 = z;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboh, com.google.android.libraries.places.internal.zzbxo
    public final void zzb() {
        if (this.zzb == null) {
            this.zzb = new java.util.ArrayDeque(java.lang.Math.min(this.zza.size(), 16));
        }
        while (!this.zzb.isEmpty()) {
            ((com.google.android.libraries.places.internal.zzbxo) this.zzb.remove()).close();
        }
        this.zzd = true;
        com.google.android.libraries.places.internal.zzbxo zzbxoVar = (com.google.android.libraries.places.internal.zzbxo) this.zza.peek();
        if (zzbxoVar != null) {
            zzbxoVar.zzb();
        }
    }

    public zzbpy(int i) {
        new java.util.ArrayDeque(2);
        this.zza = new java.util.ArrayDeque(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final int zzf() {
        return this.zzc;
    }
}
