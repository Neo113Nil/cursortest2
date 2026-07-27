package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.sdk.components.a;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.sf;
import java.io.Serializable;

/* loaded from: classes.dex */
public class SimpleTokenConfig implements Serializable {
    private static final long serialVersionUID = 2058698844345650499L;
    private boolean enabled = false;

    public final boolean a(Context context) {
        a a3 = a.a(context);
        sf sfVar = (sf) a3.f3341G.a();
        g6 g6Var = (g6) a3.f3362j.a();
        if (!sfVar.getBoolean("userDisabledSimpleToken", false) && this.enabled) {
            Boolean valueOf = (g6Var.b() && ((sf) g6Var.f3751b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f3751b.a()).getBoolean("consentApc", false)) : null;
            if (valueOf != null && valueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.enabled == ((SimpleTokenConfig) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.enabled).hashCode();
    }
}
