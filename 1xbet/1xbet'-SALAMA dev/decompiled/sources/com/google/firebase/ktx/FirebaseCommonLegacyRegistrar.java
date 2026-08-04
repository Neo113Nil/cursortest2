package com.google.firebase.ktx;

import Y4.D;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p048g4.a;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        return D.D(Q0.a.h("fire-core-ktx", "21.0.0"));
    }
}
