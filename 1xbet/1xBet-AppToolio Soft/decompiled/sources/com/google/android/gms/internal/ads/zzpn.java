package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzpn extends zzqb implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    @VisibleForTesting
    private static final String[] zzbjs = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};

    @VisibleForTesting
    @Nullable
    private zzoz zzbij;
    private final FrameLayout zzbjt;
    private View zzbju;
    private final boolean zzbjv;

    @VisibleForTesting
    @Nullable
    private View zzbjx;

    @VisibleForTesting
    @Nullable
    private FrameLayout zzvh;
    private final Object mLock = new Object();

    @VisibleForTesting
    private Map<String, WeakReference<View>> zzbjw = Collections.synchronizedMap(new HashMap());

    @VisibleForTesting
    private boolean zzbjy = false;

    @VisibleForTesting
    private Point zzbjz = new Point();

    @VisibleForTesting
    private Point zzbka = new Point();

    @VisibleForTesting
    private WeakReference<zzfp> zzbkb = new WeakReference<>(null);

    @TargetApi(21)
    public zzpn(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.zzbjt = frameLayout;
        this.zzvh = frameLayout2;
        com.google.android.gms.ads.internal.zzbv.zzfg();
        zzaor.zza((View) this.zzbjt, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzbv.zzfg();
        zzaor.zza((View) this.zzbjt, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzbjt.setOnTouchListener(this);
        this.zzbjt.setOnClickListener(this);
        if (frameLayout2 != null && PlatformVersion.isAtLeastLollipop()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        zznk.initialize(this.zzbjt.getContext());
        this.zzbjv = ((Boolean) zzkb.zzik().zzd(zznk.zzbcd)).booleanValue();
    }

    private final void zzkt() {
        synchronized (this.mLock) {
            if (!this.zzbjv && this.zzbjy) {
                int measuredWidth = this.zzbjt.getMeasuredWidth();
                int measuredHeight = this.zzbjt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0 && this.zzvh != null) {
                    this.zzvh.setLayoutParams(new FrameLayout.LayoutParams(measuredWidth, measuredHeight));
                    this.zzbjy = false;
                }
            }
        }
    }

    private final void zzl(@Nullable View view) {
        zzoz zzozVar = this.zzbij;
        if (zzozVar != null) {
            if (zzozVar instanceof zzoy) {
                zzozVar = ((zzoy) zzozVar).zzkn();
            }
            if (zzozVar != null) {
                zzozVar.zzl(view);
            }
        }
    }

    @VisibleForTesting
    private final int zzv(int i) {
        zzkb.zzif();
        return zzamu.zzb(this.zzbij.getContext(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void destroy() {
        synchronized (this.mLock) {
            if (this.zzvh != null) {
                this.zzvh.removeAllViews();
            }
            this.zzvh = null;
            this.zzbjw = null;
            this.zzbjx = null;
            this.zzbij = null;
            this.zzbjz = null;
            this.zzbka = null;
            this.zzbkb = null;
            this.zzbju = null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzoz zzozVar;
        String str;
        Map<String, WeakReference<View>> map;
        FrameLayout frameLayout;
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                return;
            }
            this.zzbij.cancelUnconfirmedClick();
            Bundle bundle = new Bundle();
            bundle.putFloat("x", zzv(this.zzbjz.x));
            bundle.putFloat("y", zzv(this.zzbjz.y));
            bundle.putFloat("start_x", zzv(this.zzbka.x));
            bundle.putFloat("start_y", zzv(this.zzbka.y));
            if (this.zzbjx == null || !this.zzbjx.equals(view)) {
                this.zzbij.zza(view, this.zzbjw, bundle, this.zzbjt);
            } else {
                if (!(this.zzbij instanceof zzoy)) {
                    zzozVar = this.zzbij;
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbjw;
                    frameLayout = this.zzbjt;
                } else if (((zzoy) this.zzbij).zzkn() != null) {
                    zzozVar = ((zzoy) this.zzbij).zzkn();
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbjw;
                    frameLayout = this.zzbjt;
                }
                zzozVar.zza(view, str, bundle, map, frameLayout);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized (this.mLock) {
            zzkt();
            if (this.zzbij != null) {
                this.zzbij.zzc(this.zzbjt, this.zzbjw);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized (this.mLock) {
            if (this.zzbij != null) {
                this.zzbij.zzc(this.zzbjt, this.zzbjw);
            }
            zzkt();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                return false;
            }
            this.zzbjt.getLocationOnScreen(new int[2]);
            Point point = new Point((int) (motionEvent.getRawX() - r0[0]), (int) (motionEvent.getRawY() - r0[1]));
            this.zzbjz = point;
            if (motionEvent.getAction() == 0) {
                this.zzbka = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(point.x, point.y);
            this.zzbij.zzd(obtain);
            obtain.recycle();
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:45|(1:47)|48|(5:50|(3:52|(3:55|(2:58|59)(1:57)|53)|138)|139|60|(16:62|(1:137)(1:65)|66|(3:68|(1:70)|(1:72)(2:73|(1:75)))|76|(4:78|(1:80)|81|(1:83))|84|85|(1:89)|90|1bb|107|108|(3:116|(1:118)|119)|120|121))|140|(0)|137|66|(0)|76|(0)|84|85|(2:87|89)|90|1bb) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0194, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0195, code lost:
    
        com.google.android.gms.ads.internal.zzbv.zzem();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x019c, code lost:
    
        if (com.google.android.gms.internal.ads.zzakq.zzrp() != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019e, code lost:
    
        com.google.android.gms.internal.ads.zzakb.zzdk("Privileged processes cannot create HTML overlays.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a9, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01a4, code lost:
    
        com.google.android.gms.internal.ads.zzakb.zzb("Error obtaining overlay.", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118 A[Catch: all -> 0x0257, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000f, B:8:0x0014, B:11:0x0016, B:13:0x001b, B:15:0x001f, B:16:0x002e, B:18:0x0037, B:20:0x0049, B:21:0x0052, B:23:0x0058, B:25:0x005e, B:27:0x0064, B:29:0x0074, B:31:0x007a, B:32:0x007d, B:35:0x0089, B:36:0x008c, B:38:0x0092, B:40:0x009c, B:41:0x00b0, B:43:0x00b4, B:45:0x00b6, B:47:0x00c8, B:48:0x00cd, B:50:0x00d8, B:52:0x00dc, B:55:0x00e8, B:59:0x00f4, B:60:0x00ff, B:62:0x0103, B:66:0x010d, B:68:0x0118, B:70:0x011c, B:72:0x012c, B:73:0x0135, B:75:0x014f, B:76:0x0154, B:78:0x0163, B:80:0x0167, B:81:0x017e, B:83:0x0188, B:85:0x018f, B:87:0x01ac, B:89:0x01b0, B:90:0x01b9, B:91:0x01bb, B:108:0x01fa, B:110:0x0211, B:112:0x0217, B:114:0x021d, B:116:0x022d, B:118:0x0237, B:119:0x024b, B:120:0x0252, B:129:0x0256, B:132:0x0195, B:134:0x019e, B:136:0x01a4, B:57:0x00fb, B:141:0x00a4, B:143:0x00aa, B:93:0x01bc, B:95:0x01c5, B:97:0x01ca, B:101:0x01d6, B:99:0x01dd, B:103:0x01e0, B:105:0x01e4, B:106:0x01e7, B:123:0x01e9, B:125:0x01f2, B:126:0x01f6), top: B:4:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[Catch: all -> 0x0257, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000f, B:8:0x0014, B:11:0x0016, B:13:0x001b, B:15:0x001f, B:16:0x002e, B:18:0x0037, B:20:0x0049, B:21:0x0052, B:23:0x0058, B:25:0x005e, B:27:0x0064, B:29:0x0074, B:31:0x007a, B:32:0x007d, B:35:0x0089, B:36:0x008c, B:38:0x0092, B:40:0x009c, B:41:0x00b0, B:43:0x00b4, B:45:0x00b6, B:47:0x00c8, B:48:0x00cd, B:50:0x00d8, B:52:0x00dc, B:55:0x00e8, B:59:0x00f4, B:60:0x00ff, B:62:0x0103, B:66:0x010d, B:68:0x0118, B:70:0x011c, B:72:0x012c, B:73:0x0135, B:75:0x014f, B:76:0x0154, B:78:0x0163, B:80:0x0167, B:81:0x017e, B:83:0x0188, B:85:0x018f, B:87:0x01ac, B:89:0x01b0, B:90:0x01b9, B:91:0x01bb, B:108:0x01fa, B:110:0x0211, B:112:0x0217, B:114:0x021d, B:116:0x022d, B:118:0x0237, B:119:0x024b, B:120:0x0252, B:129:0x0256, B:132:0x0195, B:134:0x019e, B:136:0x01a4, B:57:0x00fb, B:141:0x00a4, B:143:0x00aa, B:93:0x01bc, B:95:0x01c5, B:97:0x01ca, B:101:0x01d6, B:99:0x01dd, B:103:0x01e0, B:105:0x01e4, B:106:0x01e7, B:123:0x01e9, B:125:0x01f2, B:126:0x01f6), top: B:4:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(IObjectWrapper iObjectWrapper) {
        ViewGroup viewGroup;
        zzaqw zzaqwVar;
        zzpd zzpdVar;
        View view;
        zzpd zzpdVar2;
        synchronized (this.mLock) {
            View view2 = null;
            zzl(null);
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof zzpd)) {
                zzakb.zzdk("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            int i = 0;
            if (!this.zzbjv && this.zzvh != null) {
                this.zzvh.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
                this.zzbjt.requestLayout();
            }
            boolean z = true;
            this.zzbjy = true;
            zzpd zzpdVar3 = (zzpd) unwrap;
            if (this.zzbij != null) {
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbbu)).booleanValue()) {
                    this.zzbij.zzb(this.zzbjt, this.zzbjw);
                }
            }
            if ((this.zzbij instanceof zzpd) && (zzpdVar2 = (zzpd) this.zzbij) != null && zzpdVar2.getContext() != null && com.google.android.gms.ads.internal.zzbv.zzfh().zzu(this.zzbjt.getContext())) {
                zzaix zzks = zzpdVar2.zzks();
                if (zzks != null) {
                    zzks.zzx(false);
                }
                zzfp zzfpVar = this.zzbkb.get();
                if (zzfpVar != null && zzks != null) {
                    zzfpVar.zzb(zzks);
                }
            }
            if ((this.zzbij instanceof zzoy) && ((zzoy) this.zzbij).zzkm()) {
                ((zzoy) this.zzbij).zzc(zzpdVar3);
            } else {
                this.zzbij = zzpdVar3;
                if (zzpdVar3 instanceof zzoy) {
                    ((zzoy) zzpdVar3).zzc(null);
                }
            }
            if (this.zzvh == null) {
                return;
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbbu)).booleanValue()) {
                this.zzvh.setClickable(false);
            }
            this.zzvh.removeAllViews();
            boolean zzkj = zzpdVar3.zzkj();
            if (zzkj) {
                if (this.zzbjw != null) {
                    String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
                    for (int i2 = 0; i2 < 2; i2++) {
                        WeakReference<View> weakReference = this.zzbjw.get(strArr[i2]);
                        if (weakReference != null) {
                            view = weakReference.get();
                            break;
                        }
                    }
                }
                view = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                    if (zzkj || viewGroup == null) {
                        z = false;
                    }
                    this.zzbjx = zzpdVar3.zza(this, z);
                    if (this.zzbjx != null) {
                        if (this.zzbjw != null) {
                            this.zzbjw.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference<>(this.zzbjx));
                        }
                        if (z) {
                            viewGroup.removeAllViews();
                            viewGroup.addView(this.zzbjx);
                        } else {
                            AdChoicesView adChoicesView = new AdChoicesView(zzpdVar3.getContext());
                            adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            adChoicesView.addView(this.zzbjx);
                            if (this.zzvh != null) {
                                this.zzvh.addView(adChoicesView);
                            }
                        }
                    }
                    zzpdVar3.zza(this.zzbjt, this.zzbjw, (Map<String, WeakReference<View>>) null, this, this);
                    if (this.zzbjv) {
                        if (this.zzbju == null) {
                            this.zzbju = new View(this.zzbjt.getContext());
                            this.zzbju.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        }
                        if (this.zzbjt != this.zzbju.getParent()) {
                            this.zzbjt.addView(this.zzbju);
                        }
                    }
                    zzaqwVar = zzpdVar3.zzko();
                    if (zzaqwVar != null && this.zzvh != null) {
                        this.zzvh.addView(zzaqwVar.getView());
                    }
                    synchronized (this.mLock) {
                        zzpdVar3.zzf(this.zzbjw);
                        if (this.zzbjw != null) {
                            String[] strArr2 = zzbjs;
                            int length = strArr2.length;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                WeakReference<View> weakReference2 = this.zzbjw.get(strArr2[i]);
                                if (weakReference2 != null) {
                                    view2 = weakReference2.get();
                                    break;
                                }
                                i++;
                            }
                        }
                        if (view2 instanceof FrameLayout) {
                            zzpo zzpoVar = new zzpo(this, view2);
                            if (zzpdVar3 instanceof zzoy) {
                                zzpdVar3.zzb(view2, zzpoVar);
                            } else {
                                zzpdVar3.zza(view2, zzpoVar);
                            }
                        } else {
                            zzpdVar3.zzkq();
                        }
                    }
                    zzpdVar3.zzi(this.zzbjt);
                    zzl(this.zzbjt);
                    this.zzbij.zzj(this.zzbjt);
                    if ((this.zzbij instanceof zzpd) && (zzpdVar = (zzpd) this.zzbij) != null && zzpdVar.getContext() != null && com.google.android.gms.ads.internal.zzbv.zzfh().zzu(this.zzbjt.getContext())) {
                        zzfp zzfpVar2 = this.zzbkb.get();
                        if (zzfpVar2 == null) {
                            zzfpVar2 = new zzfp(this.zzbjt.getContext(), this.zzbjt);
                            this.zzbkb = new WeakReference<>(zzfpVar2);
                        }
                        zzfpVar2.zza(zzpdVar.zzks());
                    }
                    return;
                }
            }
            viewGroup = null;
            if (zzkj) {
            }
            z = false;
            this.zzbjx = zzpdVar3.zza(this, z);
            if (this.zzbjx != null) {
            }
            zzpdVar3.zza(this.zzbjt, this.zzbjw, (Map<String, WeakReference<View>>) null, this, this);
            if (this.zzbjv) {
            }
            zzaqwVar = zzpdVar3.zzko();
            if (zzaqwVar != null) {
                this.zzvh.addView(zzaqwVar.getView());
            }
            synchronized (this.mLock) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final IObjectWrapper zzak(String str) {
        synchronized (this.mLock) {
            View view = null;
            if (this.zzbjw == null) {
                return null;
            }
            WeakReference<View> weakReference = this.zzbjw.get(str);
            if (weakReference != null) {
                view = weakReference.get();
            }
            return ObjectWrapper.wrap(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzb(IObjectWrapper iObjectWrapper, int i) {
        WeakReference<zzfp> weakReference;
        zzfp zzfpVar;
        if (com.google.android.gms.ads.internal.zzbv.zzfh().zzu(this.zzbjt.getContext()) && (weakReference = this.zzbkb) != null && (zzfpVar = weakReference.get()) != null) {
            zzfpVar.zzgm();
        }
        zzkt();
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzb(String str, IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        synchronized (this.mLock) {
            if (this.zzbjw == null) {
                return;
            }
            if (view != null) {
                this.zzbjw.put(str, new WeakReference<>(view));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view.setOnTouchListener(this);
                    view.setClickable(true);
                    view.setOnClickListener(this);
                }
                return;
            }
            this.zzbjw.remove(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzc(IObjectWrapper iObjectWrapper) {
        this.zzbij.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
