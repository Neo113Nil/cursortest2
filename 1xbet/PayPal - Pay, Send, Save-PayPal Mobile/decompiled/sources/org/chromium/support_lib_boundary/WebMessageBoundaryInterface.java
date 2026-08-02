package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebMessageBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    @java.lang.Deprecated
    java.lang.String getData();

    java.lang.reflect.InvocationHandler getMessagePayload();

    java.lang.reflect.InvocationHandler[] getPorts();
}
