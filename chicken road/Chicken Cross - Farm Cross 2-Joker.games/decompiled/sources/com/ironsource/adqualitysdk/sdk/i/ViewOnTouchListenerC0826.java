package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓴ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC0826 extends AbstractC0325 implements View.OnTouchListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2403 = StringFog.decrypt("FMRqnMraMgMy2UqW0dwoCz7JUYHezTU9\n", "W6o+87+5Wk8=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0850 f2404;

    public ViewOnTouchListenerC0826(View.OnTouchListener onTouchListener, InterfaceC0850 interfaceC0850) {
        super(onTouchListener);
        this.f2404 = interfaceC0850;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            this.f2404.mo5386(this, view, motionEvent);
        } catch (Throwable th) {
            AbstractC0480.m5464(f2403, StringFog.decrypt("OxvpJs34/CJeBM8r87HmOBsH/juft/sYERz4IQ==\n", "fmmbSb/YlUw=\n"), th, false);
        }
        Object obj = this.f308;
        if (obj != null) {
            return ((View.OnTouchListener) obj).onTouch(view, motionEvent);
        }
        return false;
    }
}
