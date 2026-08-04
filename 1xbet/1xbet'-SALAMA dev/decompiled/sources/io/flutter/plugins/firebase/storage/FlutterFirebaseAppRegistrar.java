package io.flutter.plugins.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import p048g4.a;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        return Collections.singletonList(Q0.a.h("flutter-fire-gcs", "12.4.2"));
    }
}
