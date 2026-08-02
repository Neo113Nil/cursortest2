package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzatk extends com.google.android.libraries.places.internal.zzbix {
    private final com.google.android.libraries.places.internal.zzbit zza;
    private final com.google.android.libraries.places.internal.zzbml zzb;
    private final com.google.common.collect.ImmutableList zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.libraries.places.internal.zzbis zzj;
    private int zzk;
    private com.google.android.libraries.places.internal.zzatj zzl;
    private int zzn;
    private com.google.android.libraries.places.internal.zzbiw zzo;
    private com.google.android.libraries.places.internal.zzbmg zzp;
    private final com.google.android.libraries.places.internal.zzati zzr;
    private com.google.android.libraries.places.internal.zzbix zzt;
    private final java.util.Set zze = com.google.common.collect.Sets.newIdentityHashSet();
    private final java.util.LinkedHashMap zzf = new java.util.LinkedHashMap();
    private final java.util.Set zzg = com.google.common.collect.Sets.newIdentityHashSet();
    private boolean zzq = false;
    private boolean zzs = false;
    private final java.util.Deque zzh = new java.util.ArrayDeque();
    private final java.util.Queue zzm = new java.util.ArrayDeque();
    private final java.util.Queue zzi = new java.util.ArrayDeque();

    zzatk(com.google.android.libraries.places.internal.zzbit zzbitVar, com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar, int i, com.google.common.collect.ImmutableList immutableList) {
        this.zza = zzbitVar;
        this.zzb = zzbmlVar;
        this.zzj = zzbisVar;
        this.zzc = immutableList;
        this.zzl = com.google.android.libraries.places.internal.zzatj.zzb(immutableList.size());
        java.util.concurrent.Executor zzj = zzbisVar.zzj();
        com.google.android.libraries.places.internal.zzati zzatiVar = new com.google.android.libraries.places.internal.zzati(zzj == null ? com.google.common.util.concurrent.MoreExecutors.directExecutor() : zzj);
        this.zzr = zzatiVar;
        final java.util.concurrent.Executor newSequentialExecutor = com.google.common.util.concurrent.MoreExecutors.newSequentialExecutor(zzatiVar);
        this.zzd = new java.util.concurrent.Executor() { // from class: com.google.android.libraries.places.internal.zzatb
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(final java.lang.Runnable runnable) {
                final com.google.android.libraries.places.internal.zzatk zzatkVar = com.google.android.libraries.places.internal.zzatk.this;
                newSequentialExecutor.execute(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzasr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.libraries.places.internal.zzatk.this.zzp(runnable);
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzl(final com.google.android.libraries.places.internal.zzasl zzaslVar, final com.google.android.libraries.places.internal.zzath zzathVar) {
        java.util.Iterator it = zzathVar.zzd().entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!((com.google.common.util.concurrent.ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            com.google.android.libraries.places.internal.zzasm zzasmVar = (com.google.android.libraries.places.internal.zzasm) entry.getKey();
            com.google.android.libraries.places.internal.zzats zza = com.google.android.libraries.places.internal.zzats.zza();
            if (zza.zzc().equals(com.google.android.libraries.places.internal.zzatq.CONTINUE_AFTER)) {
                com.google.common.util.concurrent.ListenableFuture zzd = zza.zzd();
                zzathVar.zzd().put(zzasmVar, zzd);
                zzd.addListener(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzasx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.libraries.places.internal.zzatk.this.zzl(zzaslVar, zzathVar);
                    }
                }), this.zzd);
            }
            zzx(zza);
        }
        if (zzathVar.zzd().isEmpty()) {
            zzB();
            zzC();
        }
    }

    private final void zzB() {
        while (true) {
            java.util.Deque deque = this.zzh;
            if (deque.isEmpty() || !((com.google.android.libraries.places.internal.zzath) deque.peek()).zza()) {
                return;
            }
            java.lang.Object zzc = ((com.google.android.libraries.places.internal.zzath) deque.poll()).zzc();
            if (this.zzl.zzg() == 4) {
                this.zzt.zzb(zzc);
            } else {
                this.zzi.add(zzc);
            }
        }
    }

    private final void zzC() {
        if (this.zzq) {
            com.google.android.libraries.places.internal.zzath zzathVar = (com.google.android.libraries.places.internal.zzath) this.zzh.peekLast();
            int zzg = this.zzl.zzg() - 1;
            if (zzg != 1) {
                if (zzg == 3 && zzathVar == null) {
                    this.zzt.zzd();
                    return;
                }
                return;
            }
            if (zzathVar == null || zzathVar.zzb()) {
                zzw();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzf(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        final com.google.android.libraries.places.internal.zzask zza = com.google.android.libraries.places.internal.zzask.zza(this.zzb, this.zzj, zzbmgVar, this.zza.zzb());
        com.google.common.collect.ImmutableList immutableList = (com.google.common.collect.ImmutableList) this.zzc.get(this.zzl.zze());
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            com.google.android.libraries.places.internal.zzasm zzasmVar = (com.google.android.libraries.places.internal.zzasm) immutableList.get(i);
            com.google.android.libraries.places.internal.zzats zza2 = zzasmVar.zza(zzv(zza));
            if (zza2.zzc().equals(com.google.android.libraries.places.internal.zzatq.CONTINUE_AFTER)) {
                com.google.common.util.concurrent.ListenableFuture zzd = zza2.zzd();
                this.zzf.put(zzasmVar, zzd);
                zzd.addListener(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzass
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.libraries.places.internal.zzatk.this.zzg(zza);
                    }
                }), this.zzd);
            }
            zzx(zza2);
            this.zzg.add(zzasmVar);
        }
        if (this.zzf.isEmpty()) {
            zzw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzh(final com.google.android.libraries.places.internal.zzask zzaskVar) {
        java.util.LinkedHashMap linkedHashMap = this.zzf;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!((com.google.common.util.concurrent.ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            com.google.android.libraries.places.internal.zzasm zzasmVar = (com.google.android.libraries.places.internal.zzasm) entry.getKey();
            com.google.android.libraries.places.internal.zzats zzb = zzasmVar.zzb(zzv(zzaskVar));
            if (zzb.zzc().equals(com.google.android.libraries.places.internal.zzatq.CONTINUE_AFTER)) {
                com.google.common.util.concurrent.ListenableFuture zzd = zzb.zzd();
                linkedHashMap.put(zzasmVar, zzd);
                zzd.addListener(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzast
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.libraries.places.internal.zzatk.this.zzh(zzaskVar);
                    }
                }), this.zzd);
            }
            zzx(zzb);
        }
        if (!linkedHashMap.isEmpty() || this.zzs) {
            return;
        }
        zzw();
    }

    private final com.google.android.libraries.places.internal.zzask zzv(com.google.android.libraries.places.internal.zzask zzaskVar) {
        com.google.android.libraries.places.internal.zzbis zzbisVar = this.zzj;
        if (zzbisVar == zzaskVar.zzc()) {
            return zzaskVar;
        }
        return com.google.android.libraries.places.internal.zzask.zza(this.zzb, zzbisVar, zzaskVar.zzb(), zzaskVar.zzd());
    }

    private final void zzw() {
        while (true) {
            com.google.android.libraries.places.internal.zzatj zzc = this.zzl.zzc();
            this.zzl = zzc;
            int zzg = zzc.zzg() - 1;
            if (zzg == 0) {
                zzf(this.zzp);
                return;
            }
            if (zzg != 2) {
                zzy();
                return;
            }
            com.google.android.libraries.places.internal.zzbix zza = this.zza.zza(this.zzb, this.zzj);
            this.zzt = zza;
            zza.zza(this.zzo, this.zzp);
            int i = this.zzk;
            if (i > 0) {
                this.zzt.zzc(i);
            }
            java.util.Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                this.zzt.zzb(it.next());
            }
            if (this.zzq && this.zzh.isEmpty()) {
                this.zzt.zzd();
            }
        }
    }

    private final boolean zzx(com.google.android.libraries.places.internal.zzats zzatsVar) {
        int ordinal = zzatsVar.zzc().ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            throw null;
        }
        if (ordinal == 2) {
            throw null;
        }
        if (ordinal != 3) {
            if (ordinal != 4) {
                throw new java.lang.IllegalStateException("Unrecognized outcome type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzatsVar.zzc()))));
            }
            this.zzl.zza();
            return false;
        }
        final com.google.common.util.concurrent.ListenableFuture zzd = zzatsVar.zzd();
        this.zze.add(zzd);
        zzd.addListener(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzasu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatk.this.zzi(zzd);
            }
        }), this.zzd);
        return false;
    }

    private final void zzy() {
        int zzg = this.zzl.zzg() - 1;
        if (zzg == 1) {
            for (com.google.android.libraries.places.internal.zzath zzathVar : this.zzh) {
                if (zzathVar.zze() <= this.zzl.zzf()) {
                    zzz(zzathVar, zzathVar.zze(), this.zzl.zzf() + 1);
                }
            }
            return;
        }
        if (zzg == 3) {
            for (com.google.android.libraries.places.internal.zzath zzathVar2 : this.zzh) {
                zzz(zzathVar2, zzathVar2.zze(), this.zzl.zzd());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzz(final com.google.android.libraries.places.internal.zzath zzathVar, int i, int i2) {
        final com.google.android.libraries.places.internal.zzasl zza = com.google.android.libraries.places.internal.zzasl.zza(zzathVar.zzc());
        while (i < i2) {
            com.google.common.collect.ImmutableList immutableList = (com.google.common.collect.ImmutableList) this.zzc.get(i);
            int size = immutableList.size();
            for (int i3 = 0; i3 < size; i3++) {
                com.google.android.libraries.places.internal.zzasm zzasmVar = (com.google.android.libraries.places.internal.zzasm) immutableList.get(i3);
                com.google.android.libraries.places.internal.zzats zza2 = com.google.android.libraries.places.internal.zzats.zza();
                if (zza2.zzc().equals(com.google.android.libraries.places.internal.zzatq.CONTINUE_AFTER)) {
                    com.google.common.util.concurrent.ListenableFuture zzd = zza2.zzd();
                    zzathVar.zzd().put(zzasmVar, zzd);
                    zzd.addListener(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzasw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.libraries.places.internal.zzatk.this.zzk(zza, zzathVar);
                        }
                    }), this.zzd);
                }
                zzx(zza2);
            }
            i++;
        }
        zzathVar.zzf(i2);
        if (zzathVar.zzd().isEmpty()) {
            zzB();
            zzC();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zza(com.google.android.libraries.places.internal.zzbiw zzbiwVar, final com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        com.google.common.collect.ImmutableList immutableList = this.zzc;
        java.util.Set set = this.zzg;
        java.util.concurrent.Executor executor = this.zzd;
        this.zzo = new com.google.android.libraries.places.internal.zzatg(this, new com.google.android.libraries.places.internal.zzatx(new com.google.android.libraries.places.internal.zzatm(zzbiwVar, immutableList, set, executor)));
        this.zzp = zzbmgVar;
        executor.execute(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzasq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatk.this.zzf(zzbmgVar);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zzb(final java.lang.Object obj) {
        this.zzd.execute(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzasv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatk.this.zzj(obj);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zzc(final int i) {
        synchronized (this.zzm) {
            this.zzn += i;
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.Queue queue = this.zzm;
        synchronized (queue) {
            if (!queue.isEmpty()) {
                int i2 = this.zzn;
                for (int i3 = 0; i3 < i2; i3++) {
                    java.lang.Object poll = queue.poll();
                    if (poll != null) {
                        arrayDeque.add(poll);
                        this.zzn--;
                    }
                }
                boolean isEmpty = queue.isEmpty();
                java.util.Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.zzo.zzb(it.next());
                }
                if (isEmpty) {
                    this.zzo.zzc(com.google.android.libraries.places.internal.zzbnp.zza, null);
                }
            }
        }
        this.zzd.execute(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzasy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatk.this.zzm(i);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zzd() {
        this.zzd.execute(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzasz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatk.this.zzn();
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zze(@javax.annotation.Nullable final java.lang.String str, @javax.annotation.Nullable final java.lang.Throwable th) {
        this.zzd.execute(com.google.android.libraries.places.internal.zzsc.zza(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzata
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatk.this.zzo(str, th);
            }
        }));
    }

    final /* synthetic */ void zzi(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zze.remove(listenableFuture);
    }

    final /* synthetic */ void zzj(java.lang.Object obj) {
        this.zzh.add(new com.google.android.libraries.places.internal.zzath(this, obj, null));
        zzy();
    }

    final /* synthetic */ void zzm(int i) {
        if (this.zzs) {
            return;
        }
        if (this.zzl.zzg() == 4) {
            this.zzt.zzc(i);
        } else {
            this.zzk += i;
        }
    }

    final /* synthetic */ void zzn() {
        if (this.zzs) {
            return;
        }
        this.zzq = true;
        zzC();
    }

    final /* synthetic */ void zzo(java.lang.String str, java.lang.Throwable th) {
        java.util.Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            ((com.google.common.util.concurrent.ListenableFuture) it.next()).cancel(true);
        }
        com.google.android.libraries.places.internal.zzbix zzbixVar = this.zzt;
        if (zzbixVar != null) {
            zzbixVar.zze(str, th);
        }
    }

    final /* synthetic */ void zzp(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.Throwable th) {
            this.zzs = true;
            com.google.android.libraries.places.internal.zzbiw zzbiwVar = this.zzo;
            if (zzbiwVar != null) {
                zzbiwVar.zzc(com.google.android.libraries.places.internal.zzbnp.zzb(th), new com.google.android.libraries.places.internal.zzbmg());
                if (this.zzt == null || this.zzl.zzg() != 4) {
                    return;
                }
                this.zzt.zze(null, th);
            }
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzati zzs() {
        return this.zzr;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzatj zzr() {
        return this.zzl;
    }

    final /* synthetic */ java.util.concurrent.Executor zzq() {
        return this.zzd;
    }
}
