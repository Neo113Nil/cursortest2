package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbya extends com.google.android.gms.internal.ads.zzbyg {
    private java.lang.String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final java.lang.Object zzi;
    private final com.google.android.gms.internal.ads.zzcku zzj;
    private final android.app.Activity zzk;
    private com.google.android.gms.internal.ads.zzcne zzl;
    private android.widget.ImageView zzm;
    private android.widget.LinearLayout zzn;
    private final com.google.android.gms.internal.ads.zzbyh zzo;
    private android.widget.PopupWindow zzp;
    private android.widget.RelativeLayout zzq;
    private android.view.ViewGroup zzr;

    static {
        com.google.android.gms.common.util.CollectionUtils.setOf(com.ironsource.X3.e.c, com.ironsource.X3.e.b, "top-center", "center", com.ironsource.X3.e.e, com.ironsource.X3.e.d, "bottom-center");
    }

    public zzbya(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzbyh zzbyhVar) {
        super(zzckuVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g);
        this.zza = com.ironsource.X3.e.b;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new java.lang.Object();
        this.zzj = zzckuVar;
        this.zzk = zzckuVar.zzj();
        this.zzo = zzbyhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzml)).booleanValue()) {
            this.zzq.removeView((android.view.View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((android.view.View) this.zzj);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmm)).booleanValue()) {
            android.view.View view = (android.view.View) this.zzj;
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view);
            }
        }
        android.view.ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmn)).booleanValue()) {
                try {
                    android.view.ViewGroup viewGroup2 = this.zzr;
                    com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzj;
                    viewGroup2.addView((android.view.View) zzckuVar);
                    zzckuVar.zzaf(this.zzl);
                } catch (java.lang.IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                android.view.ViewGroup viewGroup3 = this.zzr;
                com.google.android.gms.internal.ads.zzcku zzckuVar2 = this.zzj;
                viewGroup3.addView((android.view.View) zzckuVar2);
                zzckuVar2.zzaf(this.zzl);
            }
        }
        if (z) {
            zzk(com.unity3d.ads.BuildConfig.FLAVOR);
            com.google.android.gms.internal.ads.zzbyh zzbyhVar = this.zzo;
            if (zzbyhVar != null) {
                zzbyhVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ec A[Catch: all -> 0x046f, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x004f, B:28:0x0060, B:30:0x006e, B:31:0x007f, B:33:0x008d, B:34:0x009e, B:36:0x00ac, B:37:0x00bd, B:39:0x00cb, B:40:0x00d9, B:42:0x00e7, B:43:0x00e9, B:45:0x00ed, B:47:0x00f1, B:49:0x00f7, B:52:0x00ff, B:56:0x0121, B:62:0x012d, B:64:0x0262, B:65:0x0267, B:67:0x0269, B:69:0x0286, B:71:0x0292, B:72:0x02ca, B:103:0x037d, B:104:0x03ac, B:106:0x03c4, B:107:0x03e0, B:109:0x03e8, B:110:0x03ef, B:111:0x0415, B:115:0x0418, B:117:0x0446, B:118:0x0458, B:120:0x0384, B:121:0x038b, B:122:0x0392, B:123:0x0399, B:124:0x039f, B:125:0x03a6, B:126:0x02c7, B:127:0x045a, B:128:0x045f, B:130:0x0136, B:132:0x013a, B:145:0x018f, B:146:0x01de, B:147:0x01e9, B:149:0x01ec, B:151:0x01f1, B:153:0x01f6, B:156:0x019a, B:157:0x01b0, B:158:0x01bb, B:159:0x01a5, B:160:0x01b3, B:161:0x01c0, B:162:0x01d3, B:163:0x01e1, B:181:0x01fe, B:182:0x0212, B:186:0x023c, B:189:0x024c, B:190:0x0242, B:192:0x024a, B:193:0x0232, B:195:0x0238, B:197:0x0251, B:198:0x0259, B:199:0x0461, B:200:0x0466, B:202:0x0468, B:203:0x046d), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0262 A[Catch: all -> 0x046f, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x004f, B:28:0x0060, B:30:0x006e, B:31:0x007f, B:33:0x008d, B:34:0x009e, B:36:0x00ac, B:37:0x00bd, B:39:0x00cb, B:40:0x00d9, B:42:0x00e7, B:43:0x00e9, B:45:0x00ed, B:47:0x00f1, B:49:0x00f7, B:52:0x00ff, B:56:0x0121, B:62:0x012d, B:64:0x0262, B:65:0x0267, B:67:0x0269, B:69:0x0286, B:71:0x0292, B:72:0x02ca, B:103:0x037d, B:104:0x03ac, B:106:0x03c4, B:107:0x03e0, B:109:0x03e8, B:110:0x03ef, B:111:0x0415, B:115:0x0418, B:117:0x0446, B:118:0x0458, B:120:0x0384, B:121:0x038b, B:122:0x0392, B:123:0x0399, B:124:0x039f, B:125:0x03a6, B:126:0x02c7, B:127:0x045a, B:128:0x045f, B:130:0x0136, B:132:0x013a, B:145:0x018f, B:146:0x01de, B:147:0x01e9, B:149:0x01ec, B:151:0x01f1, B:153:0x01f6, B:156:0x019a, B:157:0x01b0, B:158:0x01bb, B:159:0x01a5, B:160:0x01b3, B:161:0x01c0, B:162:0x01d3, B:163:0x01e1, B:181:0x01fe, B:182:0x0212, B:186:0x023c, B:189:0x024c, B:190:0x0242, B:192:0x024a, B:193:0x0232, B:195:0x0238, B:197:0x0251, B:198:0x0259, B:199:0x0461, B:200:0x0466, B:202:0x0468, B:203:0x046d), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0269 A[Catch: all -> 0x046f, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x004f, B:28:0x0060, B:30:0x006e, B:31:0x007f, B:33:0x008d, B:34:0x009e, B:36:0x00ac, B:37:0x00bd, B:39:0x00cb, B:40:0x00d9, B:42:0x00e7, B:43:0x00e9, B:45:0x00ed, B:47:0x00f1, B:49:0x00f7, B:52:0x00ff, B:56:0x0121, B:62:0x012d, B:64:0x0262, B:65:0x0267, B:67:0x0269, B:69:0x0286, B:71:0x0292, B:72:0x02ca, B:103:0x037d, B:104:0x03ac, B:106:0x03c4, B:107:0x03e0, B:109:0x03e8, B:110:0x03ef, B:111:0x0415, B:115:0x0418, B:117:0x0446, B:118:0x0458, B:120:0x0384, B:121:0x038b, B:122:0x0392, B:123:0x0399, B:124:0x039f, B:125:0x03a6, B:126:0x02c7, B:127:0x045a, B:128:0x045f, B:130:0x0136, B:132:0x013a, B:145:0x018f, B:146:0x01de, B:147:0x01e9, B:149:0x01ec, B:151:0x01f1, B:153:0x01f6, B:156:0x019a, B:157:0x01b0, B:158:0x01bb, B:159:0x01a5, B:160:0x01b3, B:161:0x01c0, B:162:0x01d3, B:163:0x01e1, B:181:0x01fe, B:182:0x0212, B:186:0x023c, B:189:0x024c, B:190:0x0242, B:192:0x024a, B:193:0x0232, B:195:0x0238, B:197:0x0251, B:198:0x0259, B:199:0x0461, B:200:0x0466, B:202:0x0468, B:203:0x046d), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(java.util.Map map) {
        int i;
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this.zzi) {
            android.app.Activity activity = this.zzk;
            if (activity == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzj;
            if (zzckuVar.zzN() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (zzckuVar.zzN().zzg()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (zzckuVar.zzW()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzS((java.lang.String) map.get("width"));
            }
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zze = com.google.android.gms.ads.internal.util.zzs.zzS((java.lang.String) map.get("height"));
            }
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzS((java.lang.String) map.get("offsetX"));
            }
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzS((java.lang.String) map.get("offsetY"));
            }
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("allowOffscreen"))) {
                this.zzb = java.lang.Boolean.parseBoolean((java.lang.String) map.get("allowOffscreen"));
            }
            java.lang.String str = (java.lang.String) map.get("customClosePosition");
            if (!android.text.TextUtils.isEmpty(str)) {
                this.zza = str;
            }
            if (this.zzh < 0 || this.zze < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            android.view.Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzaa = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                int i6 = zzaa[0];
                int i7 = zzaa[1];
                int i8 = this.zzh;
                int[] iArr = null;
                if (i8 >= 50 && i8 <= i6) {
                    int i9 = this.zze;
                    if (i9 >= 50 && i9 <= i7) {
                        if (i9 == i7 && i8 == i6) {
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                        } else {
                            boolean z = this.zzb;
                            if (z) {
                                java.lang.String str2 = this.zza;
                                switch (str2.hashCode()) {
                                    case -1364013995:
                                        if (str2.equals("center")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1012429441:
                                        if (str2.equals(com.ironsource.X3.e.c)) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -655373719:
                                        if (str2.equals(com.ironsource.X3.e.e)) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1163912186:
                                        if (str2.equals(com.ironsource.X3.e.d)) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1288627767:
                                        if (str2.equals("bottom-center")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1755462605:
                                        if (str2.equals("top-center")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c == 0) {
                                    i2 = this.zzc + this.zzf;
                                    i3 = this.zzd;
                                } else if (c != 1) {
                                    if (c != 2) {
                                        if (c == 3) {
                                            i2 = this.zzc + this.zzf;
                                            i5 = this.zzd;
                                        } else if (c == 4) {
                                            i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                            i5 = this.zzd;
                                        } else if (c != 5) {
                                            i2 = ((this.zzc + this.zzf) + i8) - 50;
                                            i3 = this.zzd;
                                        } else {
                                            i2 = ((this.zzc + this.zzf) + i8) - 50;
                                            i5 = this.zzd;
                                        }
                                        i4 = ((i5 + this.zzg) + i9) - 50;
                                    } else {
                                        i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                        i4 = ((this.zzd + this.zzg) + (i9 >> 1)) - 25;
                                    }
                                    if (i2 >= 0) {
                                        if (i2 + 50 <= i6) {
                                            if (i4 >= zzW[0]) {
                                                if (i4 + 50 <= zzW[1]) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                    i3 = this.zzd;
                                }
                                i4 = i3 + this.zzg;
                                if (i2 >= 0) {
                                }
                            }
                            if (z) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            } else {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] zzaa2 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] zzW2 = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                                int i11 = zzaa2[0];
                                int i12 = this.zzc + this.zzf;
                                int i13 = this.zzd + this.zzg;
                                if (i12 < 0) {
                                    i = 0;
                                } else {
                                    int i14 = this.zzh;
                                    i = i12 + i14 > i11 ? i11 - i14 : i12;
                                }
                                int i15 = zzW2[0];
                                if (i13 < i15) {
                                    i13 = i15;
                                } else {
                                    int i16 = this.zze;
                                    int i17 = i13 + i16;
                                    int i18 = zzW2[1];
                                    if (i17 > i18) {
                                        i13 = i18 - i16;
                                    }
                                }
                                iArr = new int[]{i, i13};
                            }
                        }
                        if (iArr == null) {
                            zzg("Resize location out of screen or close button is not visible.");
                            return;
                        }
                        com.google.android.gms.ads.internal.client.zzay.zza();
                        int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zzh);
                        com.google.android.gms.ads.internal.client.zzay.zza();
                        int zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zze);
                        android.view.ViewParent parent = ((android.view.View) zzckuVar).getParent();
                        if (!(parent instanceof android.view.ViewGroup)) {
                            zzg("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                        viewGroup.removeView((android.view.View) zzckuVar);
                        android.widget.PopupWindow popupWindow = this.zzp;
                        if (popupWindow == null) {
                            this.zzr = viewGroup;
                            com.google.android.gms.ads.internal.zzt.zzc();
                            ((android.view.View) zzckuVar).setDrawingCacheEnabled(true);
                            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((android.view.View) zzckuVar).getDrawingCache());
                            ((android.view.View) zzckuVar).setDrawingCacheEnabled(false);
                            android.widget.ImageView imageView = new android.widget.ImageView(activity);
                            this.zzm = imageView;
                            imageView.setImageBitmap(createBitmap);
                            this.zzl = zzckuVar.zzN();
                            this.zzr.addView(this.zzm);
                        } else {
                            popupWindow.dismiss();
                        }
                        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(activity);
                        this.zzq = relativeLayout;
                        relativeLayout.setBackgroundColor(0);
                        this.zzq.setLayoutParams(new android.view.ViewGroup.LayoutParams(zzE, zzE2));
                        com.google.android.gms.ads.internal.zzt.zzc();
                        android.widget.PopupWindow popupWindow2 = new android.widget.PopupWindow((android.view.View) this.zzq, zzE, zzE2, false);
                        this.zzp = popupWindow2;
                        popupWindow2.setOutsideTouchable(false);
                        this.zzp.setTouchable(true);
                        this.zzp.setClippingEnabled(!this.zzb);
                        char c2 = 65535;
                        this.zzq.addView((android.view.View) zzckuVar, -1, -1);
                        this.zzn = new android.widget.LinearLayout(activity);
                        com.google.android.gms.ads.internal.client.zzay.zza();
                        int zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50);
                        com.google.android.gms.ads.internal.client.zzay.zza();
                        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50));
                        java.lang.String str3 = this.zza;
                        switch (str3.hashCode()) {
                            case -1364013995:
                                if (str3.equals("center")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -1012429441:
                                if (str3.equals(com.ironsource.X3.e.c)) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -655373719:
                                if (str3.equals(com.ironsource.X3.e.e)) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 1163912186:
                                if (str3.equals(com.ironsource.X3.e.d)) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 1288627767:
                                if (str3.equals("bottom-center")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 1755462605:
                                if (str3.equals("top-center")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(9);
                        } else if (c2 == 1) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(14);
                        } else if (c2 == 2) {
                            layoutParams.addRule(13);
                        } else if (c2 == 3) {
                            layoutParams.addRule(12);
                            layoutParams.addRule(9);
                        } else if (c2 == 4) {
                            layoutParams.addRule(12);
                            layoutParams.addRule(14);
                        } else if (c2 != 5) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(11);
                        } else {
                            layoutParams.addRule(12);
                            layoutParams.addRule(11);
                        }
                        this.zzn.setOnClickListener(new com.google.android.gms.internal.ads.zzbxy(this));
                        this.zzn.setContentDescription("Close button");
                        this.zzq.addView(this.zzn, layoutParams);
                        try {
                            android.widget.PopupWindow popupWindow3 = this.zzp;
                            android.view.View decorView = window.getDecorView();
                            com.google.android.gms.ads.internal.client.zzay.zza();
                            int zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[0]);
                            com.google.android.gms.ads.internal.client.zzay.zza();
                            popupWindow3.showAtLocation(decorView, 0, zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[1]));
                            int i19 = iArr[0];
                            int i20 = iArr[1];
                            com.google.android.gms.internal.ads.zzbyh zzbyhVar = this.zzo;
                            if (zzbyhVar != null) {
                                zzbyhVar.zza(i19, i20, this.zzh, this.zze);
                            }
                            this.zzj.zzaf(com.google.android.gms.internal.ads.zzcne.zzc(zzE, zzE2));
                            int i21 = iArr[0];
                            int i22 = iArr[1];
                            com.google.android.gms.ads.internal.zzt.zzc();
                            zzi(i21, i22 - com.google.android.gms.ads.internal.util.zzs.zzW(this.zzk)[0], this.zzh, this.zze);
                            zzk("resized");
                            return;
                        } catch (java.lang.RuntimeException e) {
                            java.lang.String message = e.getMessage();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 26);
                            sb.append("Cannot show popup window: ");
                            sb.append(message);
                            zzg(sb.toString());
                            android.widget.RelativeLayout relativeLayout2 = this.zzq;
                            com.google.android.gms.internal.ads.zzcku zzckuVar2 = this.zzj;
                            relativeLayout2.removeView((android.view.View) zzckuVar2);
                            android.view.ViewGroup viewGroup2 = this.zzr;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(this.zzm);
                                this.zzr.addView((android.view.View) zzckuVar2);
                                zzckuVar2.zzaf(this.zzl);
                            }
                            return;
                        }
                    }
                    int i23 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                    if (iArr == null) {
                    }
                }
                int i24 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                if (iArr == null) {
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzb(final boolean z) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmk)).booleanValue() || android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                    zzf(z);
                } else {
                    com.google.android.gms.internal.ads.zzcfr.zzf.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbxz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzbya.this.zzf(z);
                        }
                    });
                }
            }
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }
}
