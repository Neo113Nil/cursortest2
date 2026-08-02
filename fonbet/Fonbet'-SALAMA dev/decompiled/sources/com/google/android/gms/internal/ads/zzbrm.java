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
import r.c;

/* loaded from: classes.dex */
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
                                zzbrm.this.zzm(z4);
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
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0293, code lost:
    
        zzh("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0299, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b6 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0032, B:18:0x0037, B:20:0x0039, B:22:0x0041, B:23:0x0046, B:25:0x0048, B:27:0x0056, B:28:0x0068, B:30:0x0076, B:31:0x0088, B:33:0x0096, B:34:0x00a8, B:36:0x00b6, B:37:0x00c8, B:39:0x00d6, B:40:0x00e4, B:42:0x00f2, B:43:0x00f4, B:45:0x00f8, B:47:0x00fc, B:49:0x0104, B:52:0x010c, B:56:0x0148, B:62:0x0154, B:64:0x0293, B:65:0x0298, B:67:0x029a, B:69:0x02b6, B:71:0x02ba, B:73:0x02c7, B:74:0x0301, B:89:0x03b5, B:90:0x03e4, B:92:0x03fc, B:93:0x0416, B:95:0x041e, B:96:0x0425, B:97:0x0448, B:101:0x044b, B:103:0x046b, B:104:0x0480, B:106:0x03bc, B:107:0x03c3, B:108:0x03ca, B:109:0x03d1, B:110:0x03d7, B:111:0x03de, B:128:0x02fe, B:129:0x0482, B:130:0x0487, B:132:0x015d, B:134:0x0161, B:145:0x01b4, B:146:0x01be, B:148:0x0210, B:150:0x0215, B:152:0x021a, B:155:0x0221, B:156:0x01c2, B:157:0x01cc, B:158:0x01d3, B:159:0x01df, B:160:0x01e7, B:161:0x01fa, B:162:0x0206, B:179:0x0230, B:183:0x026d, B:186:0x027d, B:187:0x0273, B:189:0x027b, B:190:0x0263, B:192:0x0269, B:194:0x0282, B:195:0x028a, B:196:0x0489, B:197:0x048e, B:199:0x0490, B:200:0x0495), top: B:3:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(Map map) {
        ViewParent parent;
        char c3;
        int i7;
        char c4;
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
                    int[] m7 = P.m(activity);
                    C0252s c0252s = C0252s.f2717f;
                    int[] iArr = {c0252s.f2718a.g(m7[0], activity), c0252s.f2718a.g(m7[1], activity)};
                    int[] n2 = P.n(this.zzk);
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    int i14 = this.zzh;
                    int[] iArr2 = null;
                    if (i14 >= 50 && i14 <= i12) {
                        int i15 = this.zze;
                        if (i15 >= 50 && i15 <= i13) {
                            if (i15 == i13 && i14 == i12) {
                                int i16 = J.f3546b;
                                j.g("Cannot resize to a full-screen ad.");
                            } else if (this.zzb) {
                                String str2 = this.zza;
                                switch (str2.hashCode()) {
                                    case -1364013995:
                                        if (str2.equals("center")) {
                                            c4 = 2;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1012429441:
                                        if (str2.equals("top-left")) {
                                            c4 = 0;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -655373719:
                                        if (str2.equals("bottom-left")) {
                                            c4 = 3;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1163912186:
                                        if (str2.equals("bottom-right")) {
                                            c4 = 5;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1288627767:
                                        if (str2.equals("bottom-center")) {
                                            c4 = 4;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1755462605:
                                        if (str2.equals("top-center")) {
                                            c4 = 1;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    default:
                                        c4 = 65535;
                                        break;
                                }
                                if (c4 == 0) {
                                    i8 = this.zzc + this.zzf;
                                    i9 = this.zzd;
                                } else if (c4 != 1) {
                                    if (c4 != 2) {
                                        if (c4 == 3) {
                                            i8 = this.zzc + this.zzf;
                                            i11 = this.zzd;
                                        } else if (c4 == 4) {
                                            i8 = ((this.zzc + this.zzf) + (i14 >> 1)) - 25;
                                            i11 = this.zzd;
                                        } else if (c4 != 5) {
                                            i8 = ((this.zzc + this.zzf) + i14) - 50;
                                            i9 = this.zzd;
                                        } else {
                                            i8 = ((this.zzc + this.zzf) + i14) - 50;
                                            i11 = this.zzd;
                                        }
                                        i10 = ((i11 + this.zzg) + i15) - 50;
                                    } else {
                                        i8 = ((this.zzc + this.zzf) + (i14 >> 1)) - 25;
                                        i10 = ((this.zzd + this.zzg) + (i15 >> 1)) - 25;
                                    }
                                    if (i8 >= 0 && i8 + 50 <= i12 && i10 >= n2[0] && i10 + 50 <= n2[1]) {
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
                                int[] m8 = P.m(activity2);
                                int[] iArr3 = {c0252s.f2718a.g(m8[0], activity2), c0252s.f2718a.g(m8[1], activity2)};
                                int[] n7 = P.n(this.zzk);
                                int i17 = iArr3[0];
                                int i18 = this.zzc + this.zzf;
                                int i19 = this.zzd + this.zzg;
                                if (i18 < 0) {
                                    i7 = 0;
                                } else {
                                    int i20 = this.zzh;
                                    i7 = i18 + i20 > i17 ? i17 - i20 : i18;
                                }
                                int i21 = n7[0];
                                if (i19 < i21) {
                                    i19 = i21;
                                } else {
                                    int i22 = this.zze;
                                    int i23 = i19 + i22;
                                    int i24 = n7[1];
                                    if (i23 > i24) {
                                        i19 = i24 - i22;
                                    }
                                }
                                iArr2 = new int[]{i7, i19};
                            }
                            d dVar = c0252s.f2718a;
                            int p11 = d.p(this.zzh, this.zzk);
                            int p12 = d.p(this.zze, this.zzk);
                            parent = ((View) this.zzj).getParent();
                            if (parent != null || !(parent instanceof ViewGroup)) {
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
                                Bitmap createBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                                ((View) obj).setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(this.zzk);
                                this.zzm = imageView;
                                imageView.setImageBitmap(createBitmap);
                                this.zzl = this.zzj.zzO();
                                this.zzr.addView(this.zzm);
                            } else {
                                popupWindow.dismiss();
                            }
                            RelativeLayout relativeLayout = new RelativeLayout(this.zzk);
                            this.zzq = relativeLayout;
                            relativeLayout.setBackgroundColor(0);
                            this.zzq.setLayoutParams(new ViewGroup.LayoutParams(p11, p12));
                            PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, p11, p12, false);
                            this.zzp = popupWindow2;
                            popupWindow2.setOutsideTouchable(false);
                            this.zzp.setTouchable(true);
                            this.zzp.setClippingEnabled(!this.zzb);
                            this.zzq.addView((View) this.zzj, -1, -1);
                            this.zzn = new LinearLayout(this.zzk);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(d.p(50, this.zzk), d.p(50, this.zzk));
                            String str3 = this.zza;
                            switch (str3.hashCode()) {
                                case -1364013995:
                                    if (str3.equals("center")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1012429441:
                                    if (str3.equals("top-left")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -655373719:
                                    if (str3.equals("bottom-left")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1163912186:
                                    if (str3.equals("bottom-right")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1288627767:
                                    if (str3.equals("bottom-center")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1755462605:
                                    if (str3.equals("top-center")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            if (c3 == 0) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(9);
                            } else if (c3 == 1) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(14);
                            } else if (c3 == 2) {
                                layoutParams.addRule(13);
                            } else if (c3 == 3) {
                                layoutParams.addRule(12);
                                layoutParams.addRule(9);
                            } else if (c3 == 4) {
                                layoutParams.addRule(12);
                                layoutParams.addRule(14);
                            } else if (c3 != 5) {
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
                                int i25 = iArr2[0];
                                int i26 = iArr2[1];
                                zzbrt zzbrtVar = this.zzo;
                                if (zzbrtVar != null) {
                                    zzbrtVar.zza(i25, i26, this.zzh, this.zze);
                                }
                                this.zzj.zzaj(zzcfv.zzb(p11, p12));
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
                        int i27 = J.f3546b;
                        j.g("Height is too small or too large.");
                        d dVar2 = c0252s.f2718a;
                        int p112 = d.p(this.zzh, this.zzk);
                        int p122 = d.p(this.zze, this.zzk);
                        parent = ((View) this.zzj).getParent();
                        if (parent != null) {
                        }
                        zzh("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    int i28 = J.f3546b;
                    j.g("Width is too small or too large.");
                    d dVar22 = c0252s.f2718a;
                    int p1122 = d.p(this.zzh, this.zzk);
                    int p1222 = d.p(this.zze, this.zzk);
                    parent = ((View) this.zzj).getParent();
                    if (parent != null) {
                    }
                    zzh("Webview is detached, probably in the middle of a resize or expand.");
                    return;
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
