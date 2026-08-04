package P6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureFlagHolderBoundaryInterface f5720a;

    public a(FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface) {
        this.f5720a = featureFlagHolderBoundaryInterface;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface = this.f5720a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, featureFlagHolderBoundaryInterface.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(featureFlagHolderBoundaryInterface, objArr);
        } catch (InvocationTargetException e7) {
            throw e7.getTargetException();
        } catch (ReflectiveOperationException e8) {
            throw new RuntimeException("Reflection failed for method " + method, e8);
        }
    }
}
