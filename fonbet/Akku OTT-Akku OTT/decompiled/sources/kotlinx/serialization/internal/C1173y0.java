package kotlinx.serialization.internal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;

@SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,214:1\n208#1,6:251\n208#1,6:257\n208#1,6:263\n208#1,6:269\n208#1,6:275\n208#1,6:281\n1#2:215\n3170#3,11:216\n1310#3,2:227\n3170#3,11:229\n3170#3,11:240\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n*L\n193#1:251,6\n197#1:257,6\n198#1:263,6\n199#1:269,6\n200#1:275,6\n203#1:281,6\n73#1:216,11\n81#1:227,2\n151#1:229,11\n156#1:240,11\n*E\n"})
/* renamed from: kotlinx.serialization.internal.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1173y0 {
    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:63)(1:62))(2:111|112))|(5:106|107|108|(8:80|81|(1:(3:83|(1:101)(1:(1:89)(2:86|87))|88)(2:102|(1:104)))|90|(1:100)(1:94)|95|(1:97)|99)|(1:79)(4:70|(1:78)|76|77))|65|(1:67)|80|81|(2:(0)(0)|88)|90|(1:92)|100|95|(0)|99|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0113, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00ca, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e A[Catch: NoSuchFieldException -> 0x01ad, TryCatch #0 {NoSuchFieldException -> 0x01ad, blocks: (B:81:0x0171, B:83:0x017e, B:92:0x019a, B:94:0x01a0, B:95:0x01a6, B:97:0x01aa, B:88:0x0192), top: B:80:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01aa A[Catch: NoSuchFieldException -> 0x01ad, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x01ad, blocks: (B:81:0x0171, B:83:0x017e, B:92:0x019a, B:94:0x01a0, B:95:0x01a6, B:97:0x01aa, B:88:0x0192), top: B:80:0x0171 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> kotlinx.serialization.b<T> a(KClass<T> kClass, kotlinx.serialization.b<Object>... args) {
        Object obj;
        kotlinx.serialization.b<T> bVar;
        Class<?> cls;
        Object obj2;
        kotlinx.serialization.b<T> bVar2;
        int length;
        int i;
        Object obj3;
        Field field;
        kotlinx.serialization.i iVar;
        boolean startsWith$default;
        boolean startsWith$default2;
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass);
        kotlinx.serialization.b[] args2 = (kotlinx.serialization.b[]) Arrays.copyOf(args, args.length);
        Intrinsics.checkNotNullParameter(javaClass, "<this>");
        Intrinsics.checkNotNullParameter(args2, "args");
        if (javaClass.isEnum() && javaClass.getAnnotation(kotlinx.serialization.i.class) == null && javaClass.getAnnotation(kotlinx.serialization.d.class) == null) {
            Object[] enumConstants = javaClass.getEnumConstants();
            String canonicalName = javaClass.getCanonicalName();
            Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
            Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new I(canonicalName, (Enum[]) enumConstants);
        }
        kotlinx.serialization.b[] bVarArr = (kotlinx.serialization.b[]) Arrays.copyOf(args2, args2.length);
        kotlinx.serialization.f fVar = null;
        try {
            Field declaredField = javaClass.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        kotlinx.serialization.b<T> b = obj == null ? null : b(obj, (kotlinx.serialization.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (b != null) {
            return b;
        }
        String canonicalName2 = javaClass.getCanonicalName();
        if (canonicalName2 != null) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(canonicalName2, "java.", false, 2, null);
            if (!startsWith$default) {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(canonicalName2, "kotlin.", false, 2, null);
                if (!startsWith$default2) {
                    Field[] declaredFields = javaClass.getDeclaredFields();
                    Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                    int length2 = declaredFields.length;
                    Field field2 = null;
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        if (i2 < length2) {
                            Field field3 = declaredFields[i2];
                            if (Intrinsics.areEqual(field3.getName(), "INSTANCE") && Intrinsics.areEqual(field3.getType(), javaClass) && Modifier.isStatic(field3.getModifiers())) {
                                if (z) {
                                    break;
                                }
                                z = true;
                                field2 = field3;
                            }
                            i2++;
                        }
                    }
                    if (field2 != null) {
                        Object obj4 = field2.get(null);
                        Method[] methods = javaClass.getMethods();
                        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                        int length3 = methods.length;
                        Method method = null;
                        int i3 = 0;
                        boolean z2 = false;
                        while (true) {
                            if (i3 < length3) {
                                Method method2 = methods[i3];
                                if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                                    Class<?>[] parameterTypes = method2.getParameterTypes();
                                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                                    if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), kotlinx.serialization.b.class)) {
                                        if (z2) {
                                            break;
                                        }
                                        z2 = true;
                                        method = method2;
                                    }
                                }
                                i3++;
                            }
                        }
                        method = null;
                        if (method != null) {
                            Object invoke = method.invoke(obj4, null);
                            if (invoke instanceof kotlinx.serialization.b) {
                                bVar = (kotlinx.serialization.b) invoke;
                                if (bVar == null) {
                                    return bVar;
                                }
                                kotlinx.serialization.b[] bVarArr2 = (kotlinx.serialization.b[]) Arrays.copyOf(args2, args2.length);
                                Class<?>[] declaredClasses = javaClass.getDeclaredClasses();
                                Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
                                int length4 = declaredClasses.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length4) {
                                        cls = null;
                                        break;
                                    }
                                    cls = declaredClasses[i4];
                                    if (cls.getAnnotation(InterfaceC1150m0.class) != null) {
                                        break;
                                    }
                                    i4++;
                                }
                                if (cls != null) {
                                    String simpleName = cls.getSimpleName();
                                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                                    try {
                                        Field declaredField2 = javaClass.getDeclaredField(simpleName);
                                        declaredField2.setAccessible(true);
                                        obj2 = declaredField2.get(null);
                                    } catch (Throwable unused2) {
                                    }
                                    if (obj2 != null || (bVar2 = b(obj2, (kotlinx.serialization.b[]) Arrays.copyOf(bVarArr2, bVarArr2.length))) == null) {
                                        Class<?>[] declaredClasses2 = javaClass.getDeclaredClasses();
                                        Intrinsics.checkNotNullExpressionValue(declaredClasses2, "getDeclaredClasses(...)");
                                        length = declaredClasses2.length;
                                        Class<?> cls2 = null;
                                        i = 0;
                                        boolean z3 = false;
                                        while (true) {
                                            if (i >= length) {
                                                Class<?> cls3 = declaredClasses2[i];
                                                if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                                                    if (z3) {
                                                        break;
                                                    }
                                                    z3 = true;
                                                    cls2 = cls3;
                                                }
                                                i++;
                                            } else if (!z3) {
                                            }
                                        }
                                        cls2 = null;
                                        obj3 = (cls2 != null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                                        if (obj3 instanceof kotlinx.serialization.b) {
                                            bVar2 = (kotlinx.serialization.b) obj3;
                                        }
                                        bVar2 = null;
                                    }
                                    if (bVar2 == null) {
                                        return bVar2;
                                    }
                                    if (javaClass.getAnnotation(kotlinx.serialization.d.class) != null || ((iVar = (kotlinx.serialization.i) javaClass.getAnnotation(kotlinx.serialization.i.class)) != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(iVar.with()), Reflection.getOrCreateKotlinClass(kotlinx.serialization.f.class)))) {
                                        fVar = new kotlinx.serialization.f(JvmClassMappingKt.getKotlinClass(javaClass));
                                    }
                                    return fVar;
                                }
                                obj2 = null;
                                if (obj2 != null) {
                                }
                                Class<?>[] declaredClasses22 = javaClass.getDeclaredClasses();
                                Intrinsics.checkNotNullExpressionValue(declaredClasses22, "getDeclaredClasses(...)");
                                length = declaredClasses22.length;
                                Class<?> cls22 = null;
                                i = 0;
                                boolean z32 = false;
                                while (true) {
                                    if (i >= length) {
                                    }
                                    i++;
                                }
                                cls22 = null;
                                if (cls22 != null) {
                                }
                                if (obj3 instanceof kotlinx.serialization.b) {
                                }
                                bVar2 = null;
                                if (bVar2 == null) {
                                }
                            }
                        }
                    }
                }
            }
        }
        bVar = null;
        if (bVar == null) {
        }
    }

    public static final <T> kotlinx.serialization.b<T> b(Object obj, kotlinx.serialization.b<Object>... bVarArr) {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = kotlinx.serialization.b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (invoke instanceof kotlinx.serialization.b) {
                return (kotlinx.serialization.b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final <T> boolean c(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return JvmClassMappingKt.getJavaClass((KClass) kClass).isInterface();
    }
}
