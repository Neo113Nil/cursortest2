package O4;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: classes.dex */
public final class M extends C0256b {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4141r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i) {
        super(7);
        this.f4141r = i;
    }

    @Override // O4.C0256b
    public String c(Method method, int i) {
        Parameter[] parameters;
        boolean isNamePresent;
        String name;
        switch (this.f4141r) {
            case 1:
                parameters = method.getParameters();
                Parameter parameter = parameters[i];
                isNamePresent = parameter.isNamePresent();
                if (!isNamePresent) {
                    break;
                } else {
                    StringBuilder sb = new StringBuilder("parameter '");
                    name = parameter.getName();
                    sb.append(name);
                    sb.append('\'');
                    break;
                }
        }
        return super.c(method, i);
    }

    @Override // O4.C0256b
    public final Object d(Object obj, Method method, Object[] objArr) {
        switch (this.f4141r) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return Z.k(obj, method, objArr);
                }
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            default:
                return Z.k(obj, method, objArr);
        }
    }

    @Override // O4.C0256b
    public final boolean e(Method method) {
        boolean isDefault;
        boolean isDefault2;
        switch (this.f4141r) {
            case 0:
                isDefault = method.isDefault();
                return isDefault;
            default:
                isDefault2 = method.isDefault();
                return isDefault2;
        }
    }
}
