package com.google.firebase.tracing;

/* loaded from: classes9.dex */
public class ComponentMonitor implements com.google.firebase.components.ComponentRegistrarProcessor {
    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public java.util.List<com.google.firebase.components.Component<?>> processRegistrar(com.google.firebase.components.ComponentRegistrar componentRegistrar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final com.google.firebase.components.Component<?> component : componentRegistrar.getComponents()) {
            final java.lang.String name2 = component.getName();
            if (name2 != null) {
                component = component.withFactory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.tracing.ComponentMonitor$$ExternalSyntheticLambda0
                    @Override // com.google.firebase.components.ComponentFactory
                    public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                        return com.google.firebase.tracing.ComponentMonitor.lambda$processRegistrar$0(name2, component, componentContainer);
                    }
                });
            }
            arrayList.add(component);
        }
        return arrayList;
    }

    static /* synthetic */ java.lang.Object lambda$processRegistrar$0(java.lang.String str, com.google.firebase.components.Component component, com.google.firebase.components.ComponentContainer componentContainer) {
        try {
            com.google.firebase.tracing.FirebaseTrace.pushTrace(str);
            return component.getFactory().create(componentContainer);
        } finally {
            com.google.firebase.tracing.FirebaseTrace.popTrace();
        }
    }
}
