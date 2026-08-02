package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Executor lambda$getComponents$7;
        lambda$getComponents$7 = ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
        return lambda$getComponents$7;
    }
}
