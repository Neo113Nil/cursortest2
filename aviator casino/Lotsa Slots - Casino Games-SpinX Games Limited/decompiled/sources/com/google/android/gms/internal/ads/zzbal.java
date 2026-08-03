package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbal implements com.google.android.gms.internal.ads.zzbak {
    protected static volatile com.google.android.gms.internal.ads.zzbbs zza;
    protected android.view.MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected android.util.DisplayMetrics zzq;
    protected com.google.android.gms.internal.ads.zzbbk zzr;
    private double zzs;
    private double zzt;
    protected final java.util.LinkedList zzc = new java.util.LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected zzbal(android.content.Context context) {
        try {
            com.google.android.gms.internal.ads.zzazo.zza();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdG)).booleanValue()) {
                this.zzr = new com.google.android.gms.internal.ads.zzbbk();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private final void zzo() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        java.util.LinkedList linkedList = this.zzc;
        if (linkedList.isEmpty()) {
            android.view.MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((android.view.MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.String zzp(android.content.Context context, java.lang.String str, int i, android.view.View view, android.app.Activity activity, byte[] bArr) {
        com.google.android.gms.internal.ads.zzbaj zzbajVar;
        java.lang.String str2;
        int i2;
        java.lang.Exception exc;
        int i3;
        int i4;
        java.lang.String zzb;
        int i5;
        int i6 = i;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdv)).booleanValue();
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = null;
        if (booleanValue) {
            zzbajVar = zza != null ? zza.zzh() : null;
            str2 = "be";
        } else {
            zzbajVar = null;
            str2 = null;
        }
        try {
            if (i6 == 3) {
                zzaxmVar = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i5 = 1002;
                } catch (java.lang.Exception e) {
                    exc = e;
                    i2 = 3;
                    if (booleanValue) {
                        if (i6 != i2) {
                        }
                        zzbajVar.zza(i4, -1, java.lang.System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        if (zzaxmVar != null) {
                        }
                        zzb = java.lang.Integer.toString(5);
                        return zzb;
                    }
                    i3 = 2;
                    long currentTimeMillis22 = java.lang.System.currentTimeMillis();
                    if (zzaxmVar != null) {
                    }
                    zzb = java.lang.Integer.toString(5);
                    return zzb;
                }
            } else if (i6 == 2) {
                zzaxmVar = zzc(context, view, activity);
                i5 = 1008;
            } else {
                zzaxmVar = zza(context, null);
                i5 = 1000;
            }
            if (!booleanValue || zzbajVar == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    zzbajVar.zza(i5, -1, java.lang.System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (java.lang.Exception e2) {
                    e = e2;
                    exc = e;
                    if (booleanValue && zzbajVar != null) {
                        if (i6 != i2) {
                            i3 = 2;
                            i4 = 1003;
                        } else {
                            i3 = 2;
                            if (i6 == 2) {
                                i4 = 1009;
                            } else {
                                i6 = 1;
                                i4 = 1001;
                            }
                        }
                        zzbajVar.zza(i4, -1, java.lang.System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = java.lang.System.currentTimeMillis();
                        if (zzaxmVar != null) {
                        }
                        zzb = java.lang.Integer.toString(5);
                        return zzb;
                    }
                    i3 = 2;
                    long currentTimeMillis2222 = java.lang.System.currentTimeMillis();
                    if (zzaxmVar != null) {
                    }
                    zzb = java.lang.Integer.toString(5);
                    return zzb;
                }
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            i2 = 3;
        }
        i3 = 2;
        long currentTimeMillis22222 = java.lang.System.currentTimeMillis();
        if (zzaxmVar != null) {
            try {
            } catch (java.lang.Exception e4) {
                zzb = java.lang.Integer.toString(7);
                if (booleanValue && zzbajVar != null) {
                    zzbajVar.zza(i6 == i2 ? 1007 : i6 == i3 ? 1011 : 1005, -1, java.lang.System.currentTimeMillis() - currentTimeMillis22222, str2, e4);
                }
            }
            if (((com.google.android.gms.internal.ads.zzaym) zzaxmVar.zzbu()).zzbr() != 0) {
                com.google.android.gms.internal.ads.zzaym zzaymVar = (com.google.android.gms.internal.ads.zzaym) zzaxmVar.zzbu();
                int i7 = com.google.android.gms.internal.ads.zzazo.zzc;
                zzb = com.google.android.gms.internal.ads.zzazo.zzb(zzaymVar.zzaN(), str);
                if (booleanValue && zzbajVar != null) {
                    zzbajVar.zza(i6 == i2 ? 1006 : i6 == i3 ? 1010 : 1004, -1, java.lang.System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return zzb;
            }
        }
        zzb = java.lang.Integer.toString(5);
        return zzb;
    }

    protected abstract com.google.android.gms.internal.ads.zzaxm zza(android.content.Context context, com.google.android.gms.internal.ads.zzawy zzawyVar);

    protected abstract com.google.android.gms.internal.ads.zzaxm zzb(android.content.Context context, android.view.View view, android.app.Activity activity);

    protected abstract com.google.android.gms.internal.ads.zzaxm zzc(android.content.Context context, android.view.View view, android.app.Activity activity);

    @Override // com.google.android.gms.internal.ads.zzbak
    public final synchronized void zzd(android.view.MotionEvent motionEvent) {
        java.lang.Long l;
        if (this.zzu) {
            zzo();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzs;
            double d2 = rawY - this.zzt;
            this.zzk += java.lang.Math.sqrt((d * d) + (d2 * d2));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    java.util.LinkedList linkedList = this.zzc;
                    linkedList.add(obtain);
                    if (linkedList.size() > 6) {
                        ((android.view.MotionEvent) linkedList.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zzn(new java.lang.Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    com.google.android.gms.internal.ads.zzbbu zzm = zzm(motionEvent);
                    java.lang.Long l2 = zzm.zzd;
                    if (l2 != null && zzm.zzg != null) {
                        this.zzi += l2.longValue() + zzm.zzg.longValue();
                    }
                    if (this.zzq != null && (l = zzm.zze) != null && zzm.zzh != null) {
                        this.zzj += l.longValue() + zzm.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (com.google.android.gms.internal.ads.zzbbi unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final synchronized void zze(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdt)).booleanValue()) {
                zzo();
            } else {
                this.zzb.recycle();
            }
        }
        android.util.DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            this.zzb = android.view.MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, i2 * this.zzq.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzf(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzg(android.content.Context context, java.lang.String str, android.view.View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public void zzh(android.view.View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzi(java.lang.StackTraceElement[] stackTraceElementArr) {
        com.google.android.gms.internal.ads.zzbbk zzbbkVar;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdG)).booleanValue() || (zzbbkVar = this.zzr) == null) {
            return;
        }
        zzbbkVar.zza(java.util.Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzj(android.content.Context context, android.view.View view, android.app.Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzk(android.content.Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzl(android.content.Context context) {
        if (com.google.android.gms.internal.ads.zzbbv.zzd()) {
            throw new java.lang.IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    protected abstract com.google.android.gms.internal.ads.zzbbu zzm(android.view.MotionEvent motionEvent) throws com.google.android.gms.internal.ads.zzbbi;

    protected abstract long zzn(java.lang.StackTraceElement[] stackTraceElementArr) throws com.google.android.gms.internal.ads.zzbbi;
}
