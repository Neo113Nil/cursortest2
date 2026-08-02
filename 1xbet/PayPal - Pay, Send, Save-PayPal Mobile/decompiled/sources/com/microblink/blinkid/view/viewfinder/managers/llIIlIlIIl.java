package com.microblink.blinkid.view.viewfinder.managers;

/* loaded from: classes10.dex */
public final class llIIlIlIIl implements java.lang.Runnable {
    public final /* synthetic */ java.lang.CharSequence IlIllIlIIl;
    public final /* synthetic */ int IllIIIllII;
    public final /* synthetic */ com.microblink.blinkid.view.viewfinder.managers.DocumentViewfinderManager llIIIlllll;
    public final /* synthetic */ android.graphics.drawable.Drawable llIIlIlIIl;

    public llIIlIlIIl(com.microblink.blinkid.view.viewfinder.managers.DocumentViewfinderManager documentViewfinderManager, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence, int i) {
        this.llIIIlllll = documentViewfinderManager;
        this.llIIlIlIIl = drawable;
        this.IlIllIlIIl = charSequence;
        this.IllIIIllII = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.ImageView imageView2;
        com.microblink.blinkid.view.viewfinder.ViewfinderShapeView viewfinderShapeView;
        com.microblink.blinkid.view.viewfinder.ViewfinderShapeView viewfinderShapeView2;
        com.microblink.blinkid.view.viewfinder.ViewfinderShapeView viewfinderShapeView3;
        android.widget.TextView textView3;
        android.widget.ImageView imageView3;
        imageView = this.llIIIlllll.getHighSpeedVideoFpsRangesFor;
        imageView.setImageDrawable(this.llIIlIlIIl);
        textView = this.llIIIlllll.Camera2StreamConfigurationMap;
        textView.setText(this.IlIllIlIIl);
        textView2 = this.llIIIlllll.Camera2StreamConfigurationMap;
        textView2.setVisibility(0);
        imageView2 = this.llIIIlllll.getHighSpeedVideoFpsRangesFor;
        imageView2.setVisibility(0);
        viewfinderShapeView = this.llIIIlllll.getHighResolutionOutputSizeshNQ4ISI;
        viewfinderShapeView2 = this.llIIIlllll.getHighResolutionOutputSizeshNQ4ISI;
        viewfinderShapeView.setInnerColor(androidx.core.content.ContextCompat.getColor(viewfinderShapeView2.getContext(), this.IllIIIllII));
        viewfinderShapeView3 = this.llIIIlllll.getHighResolutionOutputSizeshNQ4ISI;
        viewfinderShapeView3.setInnerAlpha(0.67f);
        textView3 = this.llIIIlllll.Camera2StreamConfigurationMap;
        textView3.setAlpha(1.0f);
        imageView3 = this.llIIIlllll.getHighSpeedVideoFpsRangesFor;
        imageView3.setAlpha(1.0f);
    }
}
