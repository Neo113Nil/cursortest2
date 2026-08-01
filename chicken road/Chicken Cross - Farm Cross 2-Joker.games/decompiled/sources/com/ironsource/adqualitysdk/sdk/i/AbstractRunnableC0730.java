package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꭵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractRunnableC0730 implements Runnable {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2002 = StringFog.decrypt("40YXpqgNU1vZaiWlog0=\n", "twREx85oAS4=\n");

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo5316();
        } catch (Throwable th) {
            try {
                mo5391(th);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﾒ */
    public abstract void mo5316();

    /* renamed from: ﾒ */
    public void mo5391(Throwable th) {
        String str = f2002;
        try {
            AbstractC0480.m5463(str, StringFog.decrypt("ciNl/66d8kYXMnvxr867\n", "N1EXkNy9myg=\n") + getClass().getName(), AbstractC1257.m5940("5w==\n", "znHX/f4o/54=\n", new StringBuilder().append(StringFog.decrypt("CHliAeSX\n", "SxUDcpe/gE4=\n")).append(getClass().getName())), th, null, null, false, false, false);
        } catch (Throwable unused) {
        }
        AbstractC0544.m5502(str, StringFog.decrypt("Lgyvs1eG1nRLHbG9VtWf\n", "a37d3CWmvxo=\n") + getClass().getName());
        AbstractC0544.m5511(str, str, StringFog.decrypt("NIntwQ4dDF8=\n", "cOyZoGdxf2U=\n"), th, null, false);
    }
}
