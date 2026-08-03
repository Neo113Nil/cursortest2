package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public class zzx extends com.google.android.gms.ads.internal.util.zzv {
    static final /* synthetic */ android.view.WindowInsets zzl(android.app.Activity activity, android.view.View view, android.view.WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzu() == null) {
            android.view.DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            java.lang.String str = "";
            if (displayCutout != null) {
                com.google.android.gms.ads.internal.util.zzg zzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                for (android.graphics.Rect rect : displayCutout.getBoundingRects()) {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "%d,%d,%d,%d", java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom));
                    if (!android.text.TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    java.lang.String.valueOf(format);
                    str = str.concat(java.lang.String.valueOf(format));
                }
                zzo.zzv(str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzo().zzv("");
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z, android.app.Activity activity) {
        android.view.Window window = activity.getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzj(final android.app.Activity activity) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbR)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().zzo().zzu() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final /* synthetic */ android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                    return com.google.android.gms.ads.internal.util.zzx.zzl(activity, view, windowInsets);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final int zzk(android.media.AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
