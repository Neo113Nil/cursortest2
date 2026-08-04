package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzauk implements zzauj {
    protected static volatile zzavr zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzavj zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    public zzauk(Context context) {
        try {
            zzatm.zze();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcY)).booleanValue()) {
                this.zzr = new zzavj();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzm() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5 A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:45:0x00a8, B:48:0x00b5, B:57:0x00d9, B:60:0x00ed), top: B:74:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[Catch: Exception -> 0x00e9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e9, blocks: (B:45:0x00a8, B:48:0x00b5, B:57:0x00d9, B:60:0x00ed), top: B:74:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final String zzp(Context context, String str, int i7, View view, Activity activity, byte[] bArr) {
        zzaui zzauiVarZzd;
        String str2;
        int i8;
        Exception exc;
        int i9;
        int i10;
        long jCurrentTimeMillis;
        String strZzb;
        int i11;
        int i12;
        zzarr zzarrVarZzc;
        int i13;
        int i14;
        int i15 = i7;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcK)).booleanValue();
        zzarr zzarrVarZzb = null;
        if (zBooleanValue) {
            zzauiVarZzd = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzauiVarZzd = null;
            str2 = null;
        }
        int i16 = 1;
        try {
            if (i15 == 3) {
                zzarrVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i14 = 1002;
                } catch (Exception e7) {
                    exc = e7;
                    i8 = 3;
                    i16 = 1;
                    if (!zBooleanValue) {
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzarrVarZzb != null) {
                        try {
                            if (((zzasm) zzarrVarZzb.zzbr()).zzaY() == 0) {
                                strZzb = Integer.toString(5);
                            } else {
                                zzasm zzasmVar = (zzasm) zzarrVarZzb.zzbr();
                                int i17 = zzatm.zzc;
                                strZzb = zzatm.zzb(zzasmVar.zzaV(), str);
                                if (zBooleanValue) {
                                    if (i15 == i8) {
                                        i11 = 1006;
                                    } else if (i15 == i9) {
                                        i11 = 1010;
                                    } else {
                                        i11 = 1004;
                                    }
                                    zzauiVarZzd.zzc(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (Exception e8) {
                            strZzb = Integer.toString(7);
                            if (zBooleanValue && zzauiVarZzd != null) {
                                if (i15 == i8) {
                                    i12 = 1007;
                                } else {
                                    i12 = i15 == i9 ? 1011 : 1005;
                                }
                                zzauiVarZzd.zzc(i12, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e8);
                            }
                        }
                    } else {
                        strZzb = Integer.toString(5);
                    }
                    return strZzb;
                }
            } else {
                if (i15 == 2) {
                    zzarrVarZzc = zzi(context, view, activity);
                    i13 = 1008;
                } else {
                    zzarrVarZzc = zzc(context, null);
                    i13 = zzbbd.zzq.zzf;
                }
                zzarrVarZzb = zzarrVarZzc;
                i14 = i13;
            }
            if (!zBooleanValue || zzauiVarZzd == null) {
                i8 = 3;
            } else {
                i8 = 3;
                try {
                    zzauiVarZzd.zzc(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (Exception e9) {
                    e = e9;
                    exc = e;
                    if (!zBooleanValue && zzauiVarZzd != null) {
                        if (i15 == i8) {
                            i10 = 1003;
                            i9 = 2;
                        } else {
                            i9 = 2;
                            if (i15 == 2) {
                                i10 = 1009;
                            } else {
                                i10 = 1001;
                                i15 = i16;
                            }
                        }
                        zzauiVarZzd.zzc(i10, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzarrVarZzb != null) {
                        strZzb = Integer.toString(5);
                    } else if (((zzasm) zzarrVarZzb.zzbr()).zzaY() == 0) {
                        strZzb = Integer.toString(5);
                    } else {
                        zzasm zzasmVar2 = (zzasm) zzarrVarZzb.zzbr();
                        int i18 = zzatm.zzc;
                        strZzb = zzatm.zzb(zzasmVar2.zzaV(), str);
                        if (zBooleanValue) {
                            if (i15 == i8) {
                                i11 = 1006;
                            } else if (i15 == i9) {
                                i11 = 1010;
                            } else {
                                i11 = 1004;
                            }
                            zzauiVarZzd.zzc(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                        }
                    }
                    return strZzb;
                }
            }
        } catch (Exception e10) {
            e = e10;
            i8 = 3;
        }
        i9 = 2;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (zzarrVarZzb != null) {
            strZzb = Integer.toString(5);
        } else if (((zzasm) zzarrVarZzb.zzbr()).zzaY() == 0) {
            strZzb = Integer.toString(5);
        } else {
            zzasm zzasmVar3 = (zzasm) zzarrVarZzb.zzbr();
            int i19 = zzatm.zzc;
            strZzb = zzatm.zzb(zzasmVar3.zzaV(), str);
            if (zBooleanValue && zzauiVarZzd != null) {
                if (i15 == i8) {
                    i11 = 1006;
                } else if (i15 == i9) {
                    i11 = 1010;
                } else {
                    i11 = 1004;
                }
                zzauiVarZzd.zzc(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strZzb;
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr);

    public abstract zzarr zzb(Context context, View view, Activity activity);

    public abstract zzarr zzc(Context context, zzare zzareVar);

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzd(Context context, String str, View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zze(Context context, String str, View view, Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzf(Context context) {
        if (zzavu.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzh(Context context, View view, Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    public abstract zzarr zzi(Context context, View view, Activity activity);

    public abstract zzavt zzj(MotionEvent motionEvent);

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l7;
        try {
            if (this.zzu) {
                zzm();
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
                double d7 = rawX - this.zzs;
                double d8 = rawY - this.zzt;
                this.zzk += Math.sqrt((d8 * d8) + (d7 * d7));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.zzb = motionEventObtain;
                        this.zzc.add(motionEventObtain);
                        if (this.zzc.size() > 6) {
                            ((MotionEvent) this.zzc.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zza(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += (long) (motionEvent.getHistorySize() + 1);
                        zzavt zzavtVarZzj = zzj(motionEvent);
                        Long l8 = zzavtVarZzj.zzd;
                        if (l8 != null && zzavtVarZzj.zzg != null) {
                            this.zzi = l8.longValue() + zzavtVarZzj.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l7 = zzavtVarZzj.zze) != null && zzavtVarZzj.zzh != null) {
                            this.zzj = l7.longValue() + zzavtVarZzj.zzh.longValue() + this.zzj;
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzavh unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzl(int i7, int i8, int i9) {
        try {
            if (this.zzb != null) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcI)).booleanValue()) {
                    zzm();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f7 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i9, 1, i7 * f7, i8 * f7, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavj zzavjVar;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcY)).booleanValue() || (zzavjVar = this.zzr) == null) {
            return;
        }
        zzavjVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public void zzo(View view) {
    }
}
