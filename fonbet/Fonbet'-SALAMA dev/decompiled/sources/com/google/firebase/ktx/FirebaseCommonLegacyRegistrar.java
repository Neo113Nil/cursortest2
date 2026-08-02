package com.google.firebase.ktx;

import Q0.a;
import Y4.D;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C1128a;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1128a> getComponents() {
        return D.D(a.h("fire-core-ktx", "21.0.0"));
    }
}
