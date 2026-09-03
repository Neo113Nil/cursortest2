package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.window.layout.SafeWindowLayoutComponentProvider;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements Function0 {
    public final /* synthetic */ SafeWindowLayoutComponentProvider b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ x5(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = safeWindowLayoutComponentProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r0.getReturnType().equals(r9) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
    
        if (r9.getReturnType().equals(r0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015e, code lost:
    
        if (r1.equals(r9) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01df, code lost:
    
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L68;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Class cls = Integer.TYPE;
        Class<?> cls2 = null;
        boolean z = false;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Class<?> loadClass = safeWindowLayoutComponentProvider.ra306ClFT3HT.yzPsTade5rL7D3.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass.getClass();
                Method method = loadClass.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass2 = safeWindowLayoutComponentProvider.yzPsTade5rL7D3.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass2.getClass();
                method.getClass();
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(loadClass2));
            case 1:
                Class<?> loadClass3 = safeWindowLayoutComponentProvider.yzPsTade5rL7D3.loadClass("androidx.window.extensions.layout.FoldingFeature");
                loadClass3.getClass();
                Method method2 = loadClass3.getMethod("getBounds", null);
                Method method3 = loadClass3.getMethod("getType", null);
                Method method4 = loadClass3.getMethod("getState", null);
                method2.getClass();
                if (method2.getReturnType().equals(JvmClassMappingKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(Rect.class))) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    if (method3.getReturnType().equals(JvmClassMappingKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(cls))) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        if (method4.getReturnType().equals(JvmClassMappingKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(cls)))) {
                            break;
                        }
                    }
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 2:
                ClassLoader classLoader = safeWindowLayoutComponentProvider.yzPsTade5rL7D3;
                Class<?> loadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                loadClass4.getClass();
                Method method5 = loadClass4.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls3 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> loadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                    loadClass5.getClass();
                    break;
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 3:
                Class<?> loadClass6 = safeWindowLayoutComponentProvider.yzPsTade5rL7D3.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                loadClass6.getClass();
                Method method6 = loadClass6.getMethod("getType", null);
                Method method7 = loadClass6.getMethod("hasProperty", cls);
                Method method8 = loadClass6.getMethod("hasProperties", int[].class);
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    cls.getClass();
                    if (method6.getReturnType().equals(cls)) {
                        method7.getClass();
                        if (Modifier.isPublic(method7.getModifiers())) {
                            Class cls4 = Boolean.TYPE;
                            cls4.getClass();
                            if (method7.getReturnType().equals(cls4)) {
                                method8.getClass();
                                if (Modifier.isPublic(method8.getModifiers())) {
                                    break;
                                }
                            }
                        }
                    }
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 4:
                ClassLoader classLoader2 = safeWindowLayoutComponentProvider.yzPsTade5rL7D3;
                Class<?> loadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass7.getClass();
                Method method9 = loadClass7.getMethod("getSupportedWindowFeatures", null);
                method9.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> loadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    loadClass8.getClass();
                    break;
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                try {
                    Class<?> loadClass9 = safeWindowLayoutComponentProvider.hRNgd2zGCE5kj.yzPsTade5rL7D3.loadClass("java.util.function.Consumer");
                    loadClass9.getClass();
                    cls2 = loadClass9;
                } catch (ClassNotFoundException unused) {
                }
                if (cls2 != null) {
                    Class<?> loadClass10 = safeWindowLayoutComponentProvider.yzPsTade5rL7D3.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    loadClass10.getClass();
                    Method method10 = loadClass10.getMethod("addWindowLayoutInfoListener", Activity.class, cls2);
                    Method method11 = loadClass10.getMethod("removeWindowLayoutInfoListener", cls2);
                    method10.getClass();
                    if (Modifier.isPublic(method10.getModifiers())) {
                        method11.getClass();
                        break;
                    }
                    r6 = false;
                    z = r6;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(SafeWindowLayoutComponentProvider.oyjLVtGms9eZwJ0(safeWindowLayoutComponentProvider));
        }
    }
}
