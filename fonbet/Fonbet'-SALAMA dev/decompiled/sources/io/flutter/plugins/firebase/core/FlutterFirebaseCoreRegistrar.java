package io.flutter.plugins.firebase.core;

import Q0.a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C1128a;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1128a> getComponents() {
        return Collections.singletonList(a.h("flutter-fire-core", "3.11.0"));
    }
}
