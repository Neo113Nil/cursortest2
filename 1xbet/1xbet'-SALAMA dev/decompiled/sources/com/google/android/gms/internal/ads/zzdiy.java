package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import I2.J;
import J2.d;
import J2.j;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import io.sentry.protocol.Device;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzdiy {
    private final zzdnq zza;
    private final zzdmf zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdiy(zzdnq zzdnqVar, zzdmf zzdmfVar) {
        this.zza = zzdnqVar;
        this.zzb = zzdmfVar;
    }

    public static /* synthetic */ void zzb(zzdiy zzdiyVar, WindowManager windowManager, View view, zzceb zzcebVar, Map map) {
        int i7 = J.f3546b;
        j.b("Hide native ad policy validator overlay.");
        zzcebVar.zzF().setVisibility(8);
        if (zzcebVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcebVar.zzF());
        }
        zzcebVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (zzdiyVar.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(zzdiyVar.zzc);
    }

    public static void zzc(final zzdiy zzdiyVar, final View view, final WindowManager windowManager, final zzceb zzcebVar, final Map map) {
        zzcebVar.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzdiw
            @Override // com.google.android.gms.internal.ads.zzcfr
            public final void zza(boolean z4, int i7, String str, String str2) {
                zzdiy.zzd(this.zza, map, z4, i7, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        String str = (String) map.get("validator_width");
        zzbbp zzbbpVar = zzbby.zzic;
        C0254t c0254t = C0254t.f2723d;
        int iZzf = zzf(context, str, ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) c0254t.f2726c.zzb(zzbby.zzid)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcebVar.zzaj(zzcfv.zzb(iZzf, iZzf2));
        try {
            zzcebVar.zzG().getSettings().setUseWideViewPort(((Boolean) c0254t.f2726c.zzb(zzbby.zzie)).booleanValue());
            zzcebVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) c0254t.f2726c.zzb(zzbby.zzif)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsA0 = p003a.a.A0();
        layoutParamsA0.x = iZzf3;
        layoutParamsA0.y = iZzf4;
        windowManager.updateViewLayout(zzcebVar.zzF(), layoutParamsA0);
        final String str2 = (String) map.get(Device.JsonKeys.ORIENTATION);
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i7 = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iZzf4;
            zzdiyVar.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdix
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzceb zzcebVar2 = zzcebVar;
                        if (zzcebVar2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i8 = i7;
                        WindowManager.LayoutParams layoutParams = layoutParamsA0;
                        String str3 = str2;
                        if ("1".equals(str3) || "2".equals(str3)) {
                            layoutParams.y = rect2.bottom - i8;
                        } else {
                            layoutParams.y = rect2.top - i8;
                        }
                        windowManager.updateViewLayout(zzcebVar2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(zzdiyVar.zzc);
            }
        }
        String str3 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        zzcebVar.loadUrl(str3);
    }

    public static /* synthetic */ void zzd(zzdiy zzdiyVar, Map map, boolean z4, int i7, String str, String str2) {
        HashMap mapM = k.m("messageType", "validatorHtmlLoaded");
        mapM.put("id", (String) map.get("id"));
        zzdiyVar.zzb.zzj("sendMessageToNativeJs", mapM);
    }

    private static final int zzf(Context context, String str, int i7) {
        try {
            i7 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        d dVar = C0252s.f2717f.f2718a;
        return d.p(i7, context);
    }

    public final View zza(final View view, final WindowManager windowManager) {
        zzceb zzcebVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.k(), null, null);
        zzcebVarZza.zzF().setVisibility(4);
        zzcebVarZza.zzF().setContentDescription("policy_validator");
        zzcebVarZza.zzag("/sendMessageToSdk", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdis
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                this.zza.zzb.zzj("sendMessageToNativeJs", map);
            }
        });
        zzcebVarZza.zzag("/hideValidatorOverlay", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdit
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                zzdiy.zzb(this.zza, windowManager, view, (zzceb) obj, map);
            }
        });
        zzcebVarZza.zzag("/open", new zzbjl(null, null, null, null, null));
        this.zzb.zzm(new WeakReference(zzcebVarZza), "/loadNativeAdPolicyViolations", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdiu
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                zzdiy.zzc(this.zza, view, windowManager, (zzceb) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcebVarZza), "/showValidatorOverlay", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdiv
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                int i7 = J.f3546b;
                j.b("Show native ad policy validator overlay.");
                ((zzceb) obj).zzF().setVisibility(0);
            }
        });
        return zzcebVarZza.zzF();
    }
}
