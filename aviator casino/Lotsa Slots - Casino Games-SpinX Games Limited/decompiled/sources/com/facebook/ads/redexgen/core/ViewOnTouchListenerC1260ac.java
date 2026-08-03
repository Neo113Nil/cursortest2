package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1260ac implements android.view.View.OnTouchListener {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        return false;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i;
        switch (motionEvent.getAction()) {
            case 0:
                i = com.facebook.ads.redexgen.core.M6.A0K;
                com.facebook.ads.redexgen.core.YB.A0N(view, i);
                break;
            case 1:
                com.facebook.ads.redexgen.core.YB.A0N(view, 0);
                break;
        }
    }
}
