package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgqj {
    public static final android.content.ClipData zza = android.content.ClipData.newIntent("", new android.content.Intent());

    @javax.annotation.Nullable
    public static android.app.PendingIntent zza(android.content.Context context, int i, android.content.Intent intent, int i2) {
        return android.app.PendingIntent.getActivity(context, 0, zzc(intent, 201326592, 0), 201326592);
    }

    @javax.annotation.Nullable
    public static android.app.PendingIntent zzb(android.content.Context context, int i, android.content.Intent intent, int i2, int i3) {
        return android.app.PendingIntent.getService(context, 0, zzc(intent, 1140850688, 0), 1140850688);
    }

    private static android.content.Intent zzc(android.content.Intent intent, int i, int i2) {
        com.google.android.gms.internal.ads.zzgtj.zzb((i & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        com.google.android.gms.internal.ads.zzgtj.zzb((i & 1) == 0 || zzd(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        com.google.android.gms.internal.ads.zzgtj.zzb((i & 2) == 0 || zzd(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        com.google.android.gms.internal.ads.zzgtj.zzb((i & 4) == 0 || zzd(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        com.google.android.gms.internal.ads.zzgtj.zzb((i & 128) == 0 || zzd(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        com.google.android.gms.internal.ads.zzgtj.zzb(intent.getComponent() != null, "Must set component on Intent.");
        if (zzd(0, 1)) {
            com.google.android.gms.internal.ads.zzgtj.zzb(!zzd(i, androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            com.google.android.gms.internal.ads.zzgtj.zzb(zzd(i, androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        android.content.Intent intent2 = new android.content.Intent(intent);
        if (!zzd(i, androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzd(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzd(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzd(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(android.net.Uri.EMPTY, "*/*");
            }
            if (!zzd(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zza);
            }
        }
        return intent2;
    }

    private static boolean zzd(int i, int i2) {
        return (i & i2) == i2;
    }
}
