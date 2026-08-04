package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.d;
import J2.j;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import java.util.Map;
import p122r.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbrm extends zzbrs {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzceb zzj;
    private final Activity zzk;
    private zzcfv zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbrt zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        c cVar = new c(7);
        Collections.addAll(cVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(cVar);
    }

    public zzbrm(zzceb zzcebVar, zzbrt zzbrtVar) {
        super(zzcebVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcebVar;
        this.zzk = zzcebVar.zzi();
        this.zzo = zzbrtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(boolean z4) {
        zzbbp zzbbpVar = zzbby.zzkP;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzkQ)).booleanValue()) {
            ViewParent parent = ((View) this.zzj).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.zzj);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzkR)).booleanValue()) {
                try {
                    this.zzr.addView((View) this.zzj);
                    this.zzj.zzaj(this.zzl);
                } catch (IllegalStateException e7) {
                    int i7 = J.f3546b;
                    j.e("Unable to add webview back to view hierarchy.", e7);
                }
            } else {
                this.zzr.addView((View) this.zzj);
                this.zzj.zzaj(this.zzl);
            }
        }
        if (z4) {
            zzl("default");
            zzbrt zzbrtVar = this.zzo;
            if (zzbrtVar != null) {
                zzbrtVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zzb(final boolean z4) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkO)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzm(z4);
                    } else {
                        zzbza.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrk
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzm(z4);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    public final void zzc(Map map) {
        byte b7;
        int i7;
        byte b8;
        int i8;
        int i9;
        int i10;
        int i11;
        synchronized (this.zzi) {
            try {
                if (this.zzk == null) {
                    zzh("Not an activity context. Cannot resize.");
                    return;
                }
                if (this.zzj.zzO() == null) {
                    zzh("Webview is not yet available, size is not set.");
                    return;
                }
                if (this.zzj.zzO().zzi()) {
                    zzh("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (this.zzj.zzaF()) {
                    zzh("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    P p5 = o.f1952C.f1957c;
                    this.zzh = P.k((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    P p7 = o.f1952C.f1957c;
                    this.zze = P.k((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    P p8 = o.f1952C.f1957c;
                    this.zzf = P.k((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    P p9 = o.f1952C.f1957c;
                    this.zzg = P.k((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.zza = str;
                }
                if (this.zzh < 0 || this.zze < 0) {
                    zzh("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = this.zzk.getWindow();
                if (window != null && window.getDecorView() != null) {
                    P p10 = o.f1952C.f1957c;
                    Activity activity = this.zzk;
                    int[] iArrM = P.m(activity);
                    C0252s c0252s = C0252s.f2717f;
                    int[] iArr = {c0252s.f2718a.g(iArrM[0], activity), c0252s.f2718a.g(iArrM[1], activity)};
                    int[] iArrN = P.n(this.zzk);
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    int i14 = this.zzh;
                    int[] iArr2 = null;
                    if (i14 < 50 || i14 > i12) {
                        int i15 = J.f3546b;
                        j.g("Width is too small or too large.");
                    } else {
                        int i16 = this.zze;
                        if (i16 < 50 || i16 > i13) {
                            int i17 = J.f3546b;
                            j.g("Height is too small or too large.");
                        } else if (i16 == i13 && i14 == i12) {
                            int i18 = J.f3546b;
                            j.g("Cannot resize to a full-screen ad.");
                        } else if (this.zzb) {
                            switch (this.zza) {
                                case "center":
                                    b8 = 2;
                                    break;
                                case "top-left":
                                    b8 = 0;
                                    break;
                                case "bottom-left":
                                    b8 = 3;
                                    break;
                                case "bottom-right":
                                    b8 = 5;
                                    break;
                                case "bottom-center":
                                    b8 = 4;
                                    break;
                                case "top-center":
                                    b8 = 1;
                                    break;
                                default:
                                    b8 = -1;
                                    break;
                            }
                            if (b8 == 0) {
                                i8 = this.zzc + this.zzf;
                                i9 = this.zzd;
                            } else if (b8 != 1) {
                                if (b8 != 2) {
                                    if (b8 == 3) {
                                        i8 = this.zzc + this.zzf;
                                        i11 = this.zzd;
                                    } else if (b8 == 4) {
                                        i8 = ((this.zzc + this.zzf) + (i14 >> 1)) - 25;
                                        i11 = this.zzd;
                                    } else if (b8 != 5) {
                                        i8 = ((this.zzc + this.zzf) + i14) - 50;
                                        i9 = this.zzd;
                                    } else {
                                        i8 = ((this.zzc + this.zzf) + i14) - 50;
                                        i11 = this.zzd;
                                    }
                                    i10 = ((i11 + this.zzg) + i16) - 50;
                                } else {
                                    i8 = ((this.zzc + this.zzf) + (i14 >> 1)) - 25;
                                    i10 = ((this.zzd + this.zzg) + (i16 >> 1)) - 25;
                                }
                                if (i8 >= 0 && i8 + 50 <= i12 && i10 >= iArrN[0] && i10 + 50 <= iArrN[1]) {
                                    iArr2 = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                }
                            } else {
                                i8 = ((this.zzc + this.zzf) + (i14 >> 1)) - 25;
                                i9 = this.zzd;
                            }
                            i10 = i9 + this.zzg;
                            if (i8 >= 0) {
                                iArr2 = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            Activity activity2 = this.zzk;
                            int[] iArrM2 = P.m(activity2);
                            int[] iArr3 = {c0252s.f2718a.g(iArrM2[0], activity2), c0252s.f2718a.g(iArrM2[1], activity2)};
                            int[] iArrN2 = P.n(this.zzk);
                            int i19 = iArr3[0];
                            int i20 = this.zzc + this.zzf;
                            int i21 = this.zzd + this.zzg;
                            if (i20 < 0) {
                                i7 = 0;
                            } else {
                                int i22 = this.zzh;
                                i7 = i20 + i22 > i19 ? i19 - i22 : i20;
                            }
                            int i23 = iArrN2[0];
                            if (i21 < i23) {
                                i21 = i23;
                            } else {
                                int i24 = this.zze;
                                int i25 = i21 + i24;
                                int i26 = iArrN2[1];
                                if (i25 > i26) {
                                    i21 = i26 - i24;
                                }
                            }
                            iArr2 = new int[]{i7, i21};
                        }
                    }
                    if (iArr2 == null) {
                        zzh("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    d dVar = c0252s.f2718a;
                    int iP = d.p(this.zzh, this.zzk);
                    int iP2 = d.p(this.zze, this.zzk);
                    ViewParent parent = ((View) this.zzj).getParent();
                    if (parent == null || !(parent instanceof ViewGroup)) {
                        zzh("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) this.zzj);
                    PopupWindow popupWindow = this.zzp;
                    if (popupWindow == null) {
                        this.zzr = viewGroup;
                        Object obj = this.zzj;
                        ((View) obj).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                        ((View) obj).setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(this.zzk);
                        this.zzm = imageView;
                        imageView.setImageBitmap(bitmapCreateBitmap);
                        this.zzl = this.zzj.zzO();
                        this.zzr.addView(this.zzm);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(this.zzk);
                    this.zzq = relativeLayout;
                    relativeLayout.setBackgroundColor(0);
                    this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iP, iP2));
                    PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iP, iP2, false);
                    this.zzp = popupWindow2;
                    popupWindow2.setOutsideTouchable(false);
                    this.zzp.setTouchable(true);
                    this.zzp.setClippingEnabled(!this.zzb);
                    this.zzq.addView((View) this.zzj, -1, -1);
                    this.zzn = new LinearLayout(this.zzk);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(d.p(50, this.zzk), d.p(50, this.zzk));
                    switch (this.zza) {
                        case "center":
                            b7 = 2;
                            break;
                        case "top-left":
                            b7 = 0;
                            break;
                        case "bottom-left":
                            b7 = 3;
                            break;
                        case "bottom-right":
                            b7 = 5;
                            break;
                        case "bottom-center":
                            b7 = 4;
                            break;
                        case "top-center":
                            b7 = 1;
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 0) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(9);
                    } else if (b7 == 1) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(14);
                    } else if (b7 == 2) {
                        layoutParams.addRule(13);
                    } else if (b7 == 3) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                    } else if (b7 == 4) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(14);
                    } else if (b7 != 5) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                    } else {
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                    }
                    this.zzn.setOnClickListener(new zzbrl(this));
                    this.zzn.setContentDescription("Close button");
                    this.zzq.addView(this.zzn, layoutParams);
                    try {
                        this.zzp.showAtLocation(window.getDecorView(), 0, d.p(iArr2[0], this.zzk), d.p(iArr2[1], this.zzk));
                        int i27 = iArr2[0];
                        int i28 = iArr2[1];
                        zzbrt zzbrtVar = this.zzo;
                        if (zzbrtVar != null) {
                            zzbrtVar.zza(i27, i28, this.zzh, this.zze);
                        }
                        this.zzj.zzaj(zzcfv.zzb(iP, iP2));
                        zzk(iArr2[0], iArr2[1] - P.n(this.zzk)[0], this.zzh, this.zze);
                        zzl("resized");
                        return;
                    } catch (RuntimeException e7) {
                        zzh("Cannot show popup window: " + e7.getMessage());
                        this.zzq.removeView((View) this.zzj);
                        ViewGroup viewGroup2 = this.zzr;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(this.zzm);
                            this.zzr.addView((View) this.zzj);
                            this.zzj.zzaj(this.zzl);
                        }
                        return;
                    }
                }
                zzh("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(int i7, int i8, boolean z4) {
        synchronized (this.zzi) {
            this.zzc = i7;
            this.zzd = i8;
        }
    }

    public final void zze(int i7, int i8) {
        this.zzc = i7;
        this.zzd = i8;
    }

    public final boolean zzf() {
        boolean z4;
        synchronized (this.zzi) {
            z4 = this.zzp != null;
        }
        return z4;
    }
}
