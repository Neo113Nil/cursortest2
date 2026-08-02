package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(java.lang.reflect.InvocationHandler invocationHandler);

    void setWebMessageCallback(java.lang.reflect.InvocationHandler invocationHandler);

    void setWebMessageCallback(java.lang.reflect.InvocationHandler invocationHandler, android.os.Handler handler);
}
