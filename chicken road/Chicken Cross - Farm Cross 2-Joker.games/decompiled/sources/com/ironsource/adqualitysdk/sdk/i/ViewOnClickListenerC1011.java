package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṛ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC1011 extends AbstractC0325 implements View.OnClickListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2936 = StringFog.decrypt("6w+UdGeceyrNEqN9YJpiIsECuGpvi38U\n", "pGHXGA7/EGY=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1029 f2937;

    public ViewOnClickListenerC1011(View.OnClickListener onClickListener, InterfaceC1029 interfaceC1029) {
        super(onClickListener);
        this.f2937 = interfaceC1029;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f2937.mo5806(this, view);
        } catch (Throwable th) {
            AbstractC0480.m5464(f2936, StringFog.decrypt("xBFtKbzKC0ehDkskgoMRXeQNejTuhQxq7Qp8LQ==\n", "gWMfRs7qYik=\n"), th, false);
        }
        Object obj = this.f308;
        if (obj != null) {
            ((View.OnClickListener) obj).onClick(view);
        }
    }
}
