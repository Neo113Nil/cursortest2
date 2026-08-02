package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i, java.util.Collection<java.lang.String> collection, int i2) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException;

    boolean stop(java.io.OutputStream outputStream, java.util.concurrent.Executor executor);
}
