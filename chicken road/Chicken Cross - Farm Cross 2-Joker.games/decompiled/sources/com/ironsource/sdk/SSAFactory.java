package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC4466ie;
import com.ironsource.O9;

@Deprecated
/* loaded from: classes6.dex */
public class SSAFactory {
    public static InterfaceC4466ie getPublisherInstance(Activity activity) throws Exception {
        return O9.b((Context) activity);
    }

    public static InterfaceC4466ie getPublisherTestInstance(Activity activity, int i) throws Exception {
        return O9.a(activity, i);
    }
}
