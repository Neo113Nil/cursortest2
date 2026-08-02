package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC0741o;

@Keep
/* loaded from: classes2.dex */
public class HiddenLifecycleReference {
    private final AbstractC0741o lifecycle;

    public HiddenLifecycleReference(AbstractC0741o abstractC0741o) {
        this.lifecycle = abstractC0741o;
    }

    public AbstractC0741o getLifecycle() {
        return this.lifecycle;
    }
}
