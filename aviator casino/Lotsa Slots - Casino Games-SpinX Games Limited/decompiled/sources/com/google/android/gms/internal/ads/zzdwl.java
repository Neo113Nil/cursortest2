package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdwl extends android.widget.FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzat zza;

    public zzdwl(android.content.Context context, android.view.View view, com.google.android.gms.ads.internal.util.zzat zzatVar) {
        super(context);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = zzatVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.zza.zza(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            android.view.KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof com.google.android.gms.internal.ads.zzcku) {
                arrayList.add((com.google.android.gms.internal.ads.zzcku) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.google.android.gms.internal.ads.zzcku) arrayList.get(i2)).destroy();
        }
    }
}
