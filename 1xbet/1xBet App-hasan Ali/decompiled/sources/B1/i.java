package B1;

import P.AbstractC0320u0;
import P.e1;
import W3.j;
import androidx.lifecycle.InterfaceC0491u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0320u0 f751a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof P.AbstractC0320u0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (P.AbstractC0320u0) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object p5;
        try {
            ClassLoader classLoader = InterfaceC0491u.class.getClassLoader();
            l.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof W3.a) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            p5 = G4.l.p(th);
        }
        AbstractC0320u0 abstractC0320u0 = (AbstractC0320u0) (p5 instanceof j ? null : p5);
        if (abstractC0320u0 == null) {
            abstractC0320u0 = new e1(new h(0));
        }
        f751a = abstractC0320u0;
    }
}
