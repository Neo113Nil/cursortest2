package io.flutter.plugins.firebase.auth;

import Q0.a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C1128a;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class FlutterFirebaseAuthRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1128a> getComponents() {
        return Collections.singletonList(a.h("flutter-fire-auth", "5.4.2"));
    }
}
