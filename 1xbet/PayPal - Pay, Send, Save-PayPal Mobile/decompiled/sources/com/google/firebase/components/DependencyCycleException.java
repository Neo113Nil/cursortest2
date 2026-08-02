package com.google.firebase.components;

/* loaded from: classes9.dex */
public class DependencyCycleException extends com.google.firebase.components.DependencyException {
    private final java.util.List<com.google.firebase.components.Component<?>> componentsInCycle;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DependencyCycleException(java.util.List<com.google.firebase.components.Component<?>> list) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependency cycle detected: ");
        sb.append(java.util.Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }

    public java.util.List<com.google.firebase.components.Component<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}
