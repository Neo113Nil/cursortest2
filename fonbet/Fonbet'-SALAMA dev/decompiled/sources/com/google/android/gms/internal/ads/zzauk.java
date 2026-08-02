package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzp(Context context, String str, int i7, View view, Activity activity, byte[] bArr) {
        zzaui zzauiVar;
        String str2;
        int i8;
        int i9;
        Exception exc;
        int i10;
        int i11;
        String zzb;
        zzarr zzc;
        int i12;
        int i13;
        int i14 = i7;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcK)).booleanValue();
        zzarr zzarrVar = null;
        if (booleanValue) {
            zzauiVar = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzauiVar = null;
            str2 = null;
        }
        try {
            if (i14 == 3) {
                zzarrVar = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i13 = 1002;
                } catch (Exception e7) {
                    exc = e7;
                    i8 = 3;
                    i9 = 1;
                    if (booleanValue) {
                        if (i14 != i8) {
                        }
                        zzauiVar.zzc(i11, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (zzarrVar != null) {
                        }
                        zzb = Integer.toString(5);
                        return zzb;
                    }
                    i10 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzarrVar != null) {
                    }
                    zzb = Integer.toString(5);
                    return zzb;
                }
            } else {
                if (i14 == 2) {
                    zzc = zzi(context, view, activity);
                    i12 = 1008;
                } else {
                    zzc = zzc(context, null);
                    i12 = zzbbd.zzq.zzf;
                }
                zzarrVar = zzc;
                i13 = i12;
            }
            if (!booleanValue || zzauiVar == null) {
                i8 = 3;
            } else {
                i8 = 3;
                i9 = 1;
                try {
                    zzauiVar.zzc(i13, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e8) {
                    e = e8;
                    exc = e;
                    if (booleanValue && zzauiVar != null) {
                        if (i14 != i8) {
                            i11 = 1003;
                            i10 = 2;
                        } else {
                            i10 = 2;
                            if (i14 == 2) {
                                i11 = 1009;
                            } else {
                                i11 = 1001;
                                i14 = i9;
                            }
                        }
                        zzauiVar.zzc(i11, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (zzarrVar != null) {
                        }
                        zzb = Integer.toString(5);
                        return zzb;
                    }
                    i10 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (zzarrVar != null) {
                    }
                    zzb = Integer.toString(5);
                    return zzb;
                }
            }
        } catch (Exception e9) {
            e = e9;
            i8 = 3;
            i9 = 1;
        }
        i10 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (zzarrVar != null) {
            try {
            } catch (Exception e10) {
                zzb = Integer.toString(7);
                if (booleanValue && zzauiVar != null) {
                    zzauiVar.zzc(i14 == i8 ? 1007 : i14 == i10 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e10);
                }
            }
            if (((zzasm) zzarrVar.zzbr()).zzaY() != 0) {
                zzasm zzasmVar = (zzasm) zzarrVar.zzbr();
                int i15 = zzatm.zzc;
                zzb = zzatm.zzb(zzasmVar.zzaV(), str);
                if (booleanValue && zzauiVar != null) {
                    zzauiVar.zzc(i14 == i8 ? 1006 : i14 == i10 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return zzb;
            }
        }
        zzb = Integer.toString(5);
        return zzb;
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
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.zzb = obtain;
                        this.zzc.add(obtain);
                        if (this.zzc.size() > 6) {
                            ((MotionEvent) this.zzc.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zza(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += motionEvent.getHistorySize() + 1;
                        zzavt zzj = zzj(motionEvent);
                        Long l8 = zzj.zzd;
                        if (l8 != null && zzj.zzg != null) {
                            this.zzi = l8.longValue() + zzj.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l7 = zzj.zze) != null && zzj.zzh != null) {
                            this.zzj = l7.longValue() + zzj.zzh.longValue() + this.zzj;
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
