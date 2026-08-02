package com.google.firebase.components;

import androidx.fragment.app.u;
import java.util.List;

/* loaded from: classes4.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new u();

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
