package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class kk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.util.Map<com.ironsource.adqualitysdk.sdk.i.kk.d, java.lang.reflect.Method> f3044 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3045 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3046;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f3047;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f3048;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m8441() {
        f3048 = (char) 6;
        f3047 = new char[]{'R', 'e', 'f', 'l', 'c', 't', 'i', 'o', 'n', 'U', io.ktor.util.date.GMTDateParser.SECONDS, 'C', 'a', ' ', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'E', 'r', 'g', io.ktor.util.date.GMTDateParser.HOURS, io.ktor.util.date.GMTDateParser.MINUTES, 'N', '\'', '.', 'q', 'y', 'S', 'T', 'V', 'W', 'X', io.ktor.util.date.GMTDateParser.YEAR, 'Z', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, '\\', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST};
    }

    static {
        m8441();
        f3044 = new java.util.concurrent.ConcurrentHashMap();
        int i = f3046 + 111;
        f3045 = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.Class m8430(java.lang.String str, boolean z) {
        int i = 2 % 2;
        int i2 = f3045 + 57;
        f3046 = i2 % 128;
        java.lang.Object obj = null;
        try {
            if (i2 % 2 == 0) {
                java.lang.Class<?> cls = java.lang.Class.forName(str);
                int i3 = f3046 + 97;
                f3045 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 10 / 0;
                }
                return cls;
            }
            java.lang.Class.forName(str);
            super.hashCode();
            throw null;
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.String intern = m8435((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, "\u0001\u0002\u0003\u0004\u0002\u0005\u0000\u000b\b\t\u000b\u0003\t\u0000Ç", (byte) (android.text.TextUtils.indexOf("", "", 0) + 84)).intern();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m8435(android.graphics.Color.red(0) + 6, "\t\u0005\u0010\u0006\u0007\u0010", (byte) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30)).intern());
                sb.append(str);
                sb.append(m8435(10 - android.text.TextUtils.indexOf("", ""), "\u000e\u0007\u000b\u0001\u000e\u0001\b\r\t\u000e", (byte) (124 - android.text.TextUtils.getTrimmedLength(""))).intern());
                com.ironsource.adqualitysdk.sdk.i.cn.m7265(intern, sb.toString(), th);
            }
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.Object m8431(java.lang.Class cls, java.util.List<java.lang.Object> list, java.lang.Class... clsArr) throws java.lang.Exception {
        int i = 2 % 2;
        int i2 = f3046 + 55;
        f3045 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object newInstance = cls.getConstructor(clsArr).newInstance(list.toArray());
        int i4 = f3045 + 9;
        f3046 = i4 % 128;
        int i5 = i4 % 2;
        return newInstance;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static java.lang.Object m8434(java.lang.Class cls, java.util.List<java.lang.Object> list) throws java.lang.Exception {
        int i = 2 % 2;
        int i2 = f3045 + 55;
        f3046 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object newInstance = m8437(cls, list).newInstance(list.toArray());
        int i4 = f3045 + 75;
        f3046 = i4 % 128;
        if (i4 % 2 == 0) {
            return newInstance;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if ((!m8424(r4, r9)) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.i.kk.f3045 + 71;
        com.ironsource.adqualitysdk.sdk.i.kk.f3046 = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if ((r8 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r8 = 46 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        if (r4.getParameterTypes().length == r9.size()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r4.getParameterTypes().length == r9.size()) goto L11;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.reflect.Constructor m8437(java.lang.Class cls, java.util.List<java.lang.Object> list) {
        java.lang.reflect.Constructor<?> constructor;
        int i = 2 % 2;
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f3045 + 121;
            f3046 = i3 % 128;
            if (i3 % 2 != 0) {
                constructor = constructors[i2];
                int i4 = 16 / 0;
            } else {
                constructor = constructors[i2];
            }
            i2++;
            int i5 = f3046 + 105;
            f3045 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 5;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static java.lang.reflect.Method m8439(java.lang.Object obj, java.lang.String str, java.util.List<java.lang.Object> list) {
        java.lang.reflect.Method m8428;
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.kk.d dVar = new com.ironsource.adqualitysdk.sdk.i.kk.d(obj, str, m8440(list));
        java.lang.reflect.Method method = f3044.get(dVar);
        if (method != null) {
            if (m8425(method.getParameterTypes(), list)) {
                return method;
            }
            java.lang.String intern = m8435(15 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u0001\u0002\u0003\u0004\u0002\u0005\u0000\u000b\b\t\u000b\u0003\t\u0000Ç", (byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 84)).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8435(android.text.TextUtils.indexOf("", "", 0) + 28, "\u0011\f\r\u000b\f\u000e\u0013\u0000~~\u0007\t\u0013\f\u0000\u0010\u0001\u0016\u0003\r\u000e\u0013\u0002\u0000\u0019\r\u0010\u000e", (byte) (10 - android.view.KeyEvent.normalizeMetaState(0))).intern());
            sb.append(dVar);
            com.ironsource.adqualitysdk.sdk.i.cn.m7270(intern, sb.toString());
        }
        if (!(obj instanceof java.lang.Class)) {
            m8428 = m8428(obj, str, list);
        } else {
            int i2 = f3046 + 77;
            f3045 = i2 % 128;
            if (i2 % 2 != 0 ? (m8428 = m8438((java.lang.Class) obj, str, list, true)) == null : (m8428 = m8438((java.lang.Class) obj, str, list, false)) == null) {
                m8428 = m8428(java.lang.Class.class, str, list);
            }
        }
        if (m8428 != null) {
            int i3 = f3045 + 21;
            f3046 = i3 % 128;
            if (i3 % 2 != 0) {
                f3044.put(dVar, m8428);
                int i4 = 73 / 0;
            } else {
                f3044.put(dVar, m8428);
            }
        }
        return m8428;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.util.List<java.lang.Class> m8440(java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            int i2 = f3045 + 71;
            f3046 = i2 % 128;
            int i3 = i2 % 2;
            if (obj == null) {
                arrayList.add(java.lang.Object.class);
            } else {
                int i4 = f3045 + 91;
                f3046 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(obj.getClass());
            }
        }
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.reflect.Method m8428(java.lang.Object obj, java.lang.String str, java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        int i2 = f3045 + 81;
        f3046 = i2 % 128;
        int i3 = i2 % 2;
        return m8438(obj.getClass(), str, list, false);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.reflect.Method m8438(java.lang.Class cls, java.lang.String str, java.util.List<java.lang.Object> list, boolean z) {
        java.lang.reflect.Method[] methods;
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = f3045 + 29;
        f3046 = i3 % 128;
        if (i3 % 2 != 0) {
            methods = cls.getMethods();
            length = methods.length;
            i = 1;
        } else {
            methods = cls.getMethods();
            length = methods.length;
            i = 0;
        }
        while (i < length) {
            java.lang.reflect.Method method = methods[i];
            if (method.getName().equals(str)) {
                int i4 = f3046 + 47;
                f3045 = i4 % 128;
                if (i4 % 2 != 0) {
                    if (method.getParameterTypes().length == list.size() && java.lang.reflect.Modifier.isStatic(method.getModifiers()) == z && m8433(method, list)) {
                        return method;
                    }
                } else {
                    int length2 = method.getParameterTypes().length;
                    list.size();
                    throw null;
                }
            }
            i++;
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m8433(java.lang.reflect.Method method, java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        int i2 = f3046 + 31;
        f3045 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        if (i3 != 0) {
            return m8425(parameterTypes, list);
        }
        m8425(parameterTypes, list);
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m8424(java.lang.reflect.Constructor constructor, java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        int i2 = f3046 + 79;
        f3045 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (i3 != 0) {
            return m8425(parameterTypes, list);
        }
        boolean m8425 = m8425(parameterTypes, list);
        int i4 = 24 / 0;
        return m8425;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m8425(java.lang.Class[] clsArr, java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            java.lang.Object obj = list.get(i2);
            if (obj == null) {
                int i3 = f3045 + 63;
                f3046 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 43 / 0;
                    if (!java.lang.Object.class.isAssignableFrom(clsArr[i2])) {
                    }
                } else if (!java.lang.Object.class.isAssignableFrom(clsArr[i2])) {
                }
                return false;
            }
            if (obj != null) {
                int i5 = f3046 + 37;
                f3045 = i5 % 128;
                if (i5 % 2 == 0) {
                    m8423(clsArr[i2], obj);
                    java.lang.Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
                if (!m8423(clsArr[i2], obj)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r6.isAssignableFrom(java.lang.Long.class) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r6.isAssignableFrom(java.lang.Byte.class) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
    
        if (r6.isAssignableFrom(java.lang.Float.class) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011b, code lost:
    
        if (r6.isAssignableFrom(java.lang.Long.class) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0134, code lost:
    
        if (r6.isAssignableFrom(java.lang.Integer.class) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016e, code lost:
    
        if (r6.isAssignableFrom(java.lang.Double.class) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0199, code lost:
    
        if (r6.isAssignableFrom(java.lang.Long.class) == false) goto L101;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m8423(java.lang.Class cls, java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f3046 + 23;
        f3045 = i2 % 128;
        java.lang.Object obj2 = null;
        if (i2 % 2 == 0) {
            obj.getClass();
            cls.isAssignableFrom(java.lang.Byte.TYPE);
            throw null;
        }
        java.lang.Class<?> cls2 = obj.getClass();
        if ((!cls.isAssignableFrom(java.lang.Byte.TYPE) || !cls2.isAssignableFrom(java.lang.Byte.class)) && ((!cls.isAssignableFrom(java.lang.Short.TYPE) || !cls2.isAssignableFrom(java.lang.Short.class)) && ((!cls.isAssignableFrom(java.lang.Short.TYPE) || !cls2.isAssignableFrom(java.lang.Byte.class)) && ((!cls.isAssignableFrom(java.lang.Integer.TYPE) || !cls2.isAssignableFrom(java.lang.Integer.class)) && ((!cls.isAssignableFrom(java.lang.Integer.TYPE) || !cls2.isAssignableFrom(java.lang.Short.class)) && (!cls.isAssignableFrom(java.lang.Integer.TYPE) || !cls2.isAssignableFrom(java.lang.Byte.class))))))) {
            if (cls.isAssignableFrom(java.lang.Long.TYPE)) {
                int i3 = f3045 + 49;
                f3046 = i3 % 128;
                if (i3 % 2 != 0) {
                    cls2.isAssignableFrom(java.lang.Long.class);
                    super.hashCode();
                    throw null;
                }
            }
            if ((!cls.isAssignableFrom(java.lang.Long.TYPE) || !cls2.isAssignableFrom(java.lang.Integer.class)) && (!cls.isAssignableFrom(java.lang.Long.TYPE) || !cls2.isAssignableFrom(java.lang.Short.class))) {
                if (cls.isAssignableFrom(java.lang.Long.TYPE)) {
                    int i4 = f3045 + 91;
                    f3046 = i4 % 128;
                    if (i4 % 2 != 0) {
                        cls2.isAssignableFrom(java.lang.Byte.class);
                        super.hashCode();
                        throw null;
                    }
                }
                if (cls.isAssignableFrom(java.lang.Float.TYPE)) {
                    int i5 = f3046 + 1;
                    f3045 = i5 % 128;
                    if (i5 % 2 == 0) {
                        cls2.isAssignableFrom(java.lang.Float.class);
                        throw null;
                    }
                }
                if (cls.isAssignableFrom(java.lang.Float.TYPE)) {
                    int i6 = f3045 + 123;
                    f3046 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cls2.isAssignableFrom(java.lang.Long.class);
                        throw null;
                    }
                }
                if (cls.isAssignableFrom(java.lang.Float.TYPE)) {
                    int i7 = f3046 + 73;
                    f3045 = i7 % 128;
                    int i8 = i7 % 2;
                }
                if ((!cls.isAssignableFrom(java.lang.Float.TYPE) || !cls2.isAssignableFrom(java.lang.Short.class)) && ((!cls.isAssignableFrom(java.lang.Float.TYPE)) || !cls2.isAssignableFrom(java.lang.Byte.class))) {
                    if (cls.isAssignableFrom(java.lang.Double.TYPE)) {
                        int i9 = f3045 + 1;
                        f3046 = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    if (!cls.isAssignableFrom(java.lang.Double.TYPE) || !cls2.isAssignableFrom(java.lang.Float.class)) {
                        if (cls.isAssignableFrom(java.lang.Double.TYPE)) {
                            int i11 = f3045 + 73;
                            f3046 = i11 % 128;
                            if (i11 % 2 != 0) {
                                cls2.isAssignableFrom(java.lang.Long.class);
                                throw null;
                            }
                        }
                        if ((!cls.isAssignableFrom(java.lang.Double.TYPE) || !cls2.isAssignableFrom(java.lang.Integer.class)) && ((!cls.isAssignableFrom(java.lang.Double.TYPE) || !cls2.isAssignableFrom(java.lang.Short.class)) && ((!cls.isAssignableFrom(java.lang.Double.TYPE) || !cls2.isAssignableFrom(java.lang.Byte.class)) && (!cls.isAssignableFrom(java.lang.Boolean.TYPE) || !cls2.isAssignableFrom(java.lang.Boolean.class))))) {
                            if (cls != null) {
                                int i12 = f3046 + 115;
                                f3045 = i12 % 128;
                                int i13 = i12 % 2;
                                if (cls.isAssignableFrom(cls2)) {
                                    int i14 = f3046 + 13;
                                    f3045 = i14 % 128;
                                    return i14 % 2 != 0;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.reflect.Method] */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.reflect.Method m8432(java.lang.Object obj, java.lang.String str, java.util.List<java.lang.Class> list) {
        int i = 2 % 2;
        int i2 = f3046 + 5;
        f3045 = i2 % 128;
        int i3 = i2 % 2;
        try {
            java.lang.Class<?>[] m8426 = m8426(list);
            if (obj instanceof java.lang.Class) {
                try {
                    obj = ((java.lang.Class) obj).getMethod(str, m8426);
                    return obj;
                } catch (java.lang.NoSuchMethodException unused) {
                    return java.lang.Class.class.getMethod(str, m8426);
                }
            }
            java.lang.reflect.Method method = obj.getClass().getMethod(str, m8426);
            int i4 = f3045 + 5;
            f3046 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            return method;
        } catch (java.lang.NoSuchMethodException e) {
            java.lang.String intern = m8435(16 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0001\u0002\u0003\u0004\u0002\u0005\u0000\u000b\b\t\u000b\u0003\t\u0000Ç", (byte) (84 - ((android.os.Process.getThreadPriority(0) + 20) >> 6))).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8435((android.os.Process.myPid() >> 22) + 4, "\u0013\t\u0010\u0013", (byte) (81 - android.view.View.getDefaultSize(0, 0))).intern());
            sb.append(str);
            sb.append(m8435(android.text.TextUtils.indexOf("", "", 0, 0) + 19, "\u0013\u0010\u0013\u0002\u0001\u0017\t\r\u000e\u0001\b\r\t\u000e\u000e\u0001\u000b\r'", (byte) (6 - android.widget.ExpandableListView.getPackedPositionChild(0L))).intern());
            sb.append(obj);
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(intern, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static java.lang.reflect.Field[] m8436(java.lang.reflect.Field[] fieldArr, java.lang.reflect.Field[] fieldArr2) {
        int i = 2 % 2;
        int i2 = f3046 + 95;
        f3045 = i2 % 128;
        if (i2 % 2 == 0) {
            int length = fieldArr.length;
            int length2 = fieldArr2.length;
            java.lang.reflect.Field[] fieldArr3 = new java.lang.reflect.Field[length << length2];
            java.lang.System.arraycopy(fieldArr, 1, fieldArr3, 0, length);
            java.lang.System.arraycopy(fieldArr2, 0, fieldArr3, length, length2);
            return fieldArr3;
        }
        int length3 = fieldArr.length;
        int length4 = fieldArr2.length;
        java.lang.reflect.Field[] fieldArr4 = new java.lang.reflect.Field[length3 + length4];
        java.lang.System.arraycopy(fieldArr, 0, fieldArr4, 0, length3);
        java.lang.System.arraycopy(fieldArr2, 0, fieldArr4, length3, length4);
        return fieldArr4;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static java.lang.reflect.Method[] m8427(java.lang.reflect.Method[] methodArr, java.lang.reflect.Method[] methodArr2) {
        int i = 2 % 2;
        int i2 = f3046 + 125;
        f3045 = i2 % 128;
        int i3 = i2 % 2;
        int length = methodArr.length;
        int length2 = methodArr2.length;
        java.lang.reflect.Method[] methodArr3 = new java.lang.reflect.Method[length + length2];
        java.lang.System.arraycopy(methodArr, 0, methodArr3, 0, length);
        java.lang.System.arraycopy(methodArr2, 0, methodArr3, length, length2);
        int i4 = f3046 + 95;
        f3045 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return methodArr3;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.Class[] m8426(java.util.List<java.lang.Class> list) {
        int i = 2 % 2;
        int i2 = f3045 + 65;
        f3046 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        java.lang.Class[] clsArr = new java.lang.Class[list.size()];
        while (i4 < list.size()) {
            int i5 = f3045 + 61;
            f3046 = i5 % 128;
            if (i5 % 2 != 0) {
                clsArr[i4] = list.get(i4);
                i4 += 16;
            } else {
                clsArr[i4] = list.get(i4);
                i4++;
            }
        }
        int i6 = f3045 + 1;
        f3046 = i6 % 128;
        if (i6 % 2 == 0) {
            return clsArr;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m8429(java.lang.Class cls, java.util.List<java.lang.String> list) {
        int i = 2 % 2;
        if (cls != null) {
            if (list == null || list.isEmpty()) {
                return true;
            }
            for (java.lang.String str : list) {
                int i2 = f3045 + 95;
                f3046 = i2 % 128;
                int i3 = i2 % 2;
                if ((!str.equals("")) || (cls.getPackage() != null && !cls.getPackage().getName().equals(""))) {
                    if (!str.equals("")) {
                        int i4 = f3045 + 67;
                        f3046 = i4 % 128;
                        if (i4 % 2 != 0) {
                            cls.getName().startsWith(str);
                            java.lang.Object obj = null;
                            super.hashCode();
                            throw null;
                        }
                        if (cls.getName().startsWith(str)) {
                        }
                    }
                    int i5 = f3045 + 89;
                    f3046 = i5 % 128;
                    int i6 = i5 % 2;
                }
                return true;
            }
            if (!com.ironsource.adqualitysdk.sdk.i.kk.class.getName().startsWith(m8435((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, "\u0001\n\u0015\u0012\u000b\f\b\t\u000b\b\u000f\f\u0005\u0002\u0012\u0011\f\u001b\u000f\r\u0000\t\u0001\u001d", (byte) (124 - android.text.TextUtils.getOffsetBefore("", 0))).intern())) {
                if (!(com.ironsource.adqualitysdk.sdk.i.kk.class.getPackage() == null && cls.getPackage() == null) && (com.ironsource.adqualitysdk.sdk.i.kk.class.getPackage() == null || !com.ironsource.adqualitysdk.sdk.i.kk.class.getPackage().equals(cls.getPackage()))) {
                    return false;
                }
                int i7 = f3046 + 69;
                f3045 = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
        }
        return false;
    }

    static class d {

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f3049 = 1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f3050 = 0;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f3051 = 85;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private java.lang.Class f3052;

        /* renamed from: ｋ, reason: contains not printable characters */
        private java.lang.String f3053;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private java.util.List<java.lang.Class> f3054;

        public d(java.lang.Object obj, java.lang.String str, java.util.List<java.lang.Class> list) {
            if (obj instanceof java.lang.Class) {
                this.f3052 = (java.lang.Class) obj;
            } else {
                this.f3052 = obj.getClass();
            }
            this.f3053 = str;
            this.f3054 = list;
        }

        public final boolean equals(java.lang.Object obj) {
            int i = 2 % 2;
            int i2 = f3050 + 69;
            int i3 = i2 % 128;
            f3049 = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                int i5 = i3 + 85;
                f3050 = i5 % 128;
                int i6 = i5 % 2;
                if (getClass() == obj.getClass()) {
                    com.ironsource.adqualitysdk.sdk.i.kk.d dVar = (com.ironsource.adqualitysdk.sdk.i.kk.d) obj;
                    if (!this.f3052.equals(dVar.f3052) || !this.f3053.equals(dVar.f3053)) {
                        return false;
                    }
                    boolean equals = this.f3054.equals(dVar.f3054);
                    int i7 = f3050 + 107;
                    f3049 = i7 % 128;
                    int i8 = i7 % 2;
                    return equals;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = f3049 + 97;
            f3050 = i2 % 128;
            return i2 % 2 != 0 ? ((this.f3052.hashCode() >>> this.f3053.hashCode()) * 102) % this.f3054.hashCode() : (((this.f3052.hashCode() * 31) + this.f3053.hashCode()) * 31) + this.f3054.hashCode();
        }

        public final java.lang.String toString() {
            int i = 2 % 2;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(m8442(17 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), true, (-16777028) - android.graphics.Color.rgb(0, 0, 0), "\u0002\u0007\u0002\uffff\ufffe\uffdd�\b\u0001\r\ufffe￦\u0014\u0007\b\u0002\r", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12).intern());
            sb.append(m8442((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, true, 182 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0012\u0000\u000b￢\u0013\u0002\u0004\t\u0001￮\fￜ\u0012", 12 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
            sb.append(this.f3052);
            sb.append(m8442((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, false, 170 - android.view.View.combineMeasuredStates(0, 0), "ￗￋ\u0018\ufff8\u0010\u001f\u0013\u001a\u000f\ufff9\f\u0018\u0010￨ￒ", 15 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            sb.append(this.f3053);
            sb.append('\'');
            sb.append(m8442(android.text.TextUtils.lastIndexOf("", '0', 0) + 15, false, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 174, "\u0013\b\u001a\u001a\f\u001a￤ￓￇ\u0014￨\u0019\u000e￪", 7 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
            sb.append(this.f3054);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            java.lang.String obj = sb.toString();
            int i2 = f3049 + 53;
            f3050 = i2 % 128;
            int i3 = i2 % 2;
            return obj;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static java.lang.String m8442(int i, boolean z, int i2, java.lang.String str, int i3) {
            java.lang.String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
                char[] cArr3 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                    cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                    int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                    cArr3[i4] = (char) (cArr3[i4] - f3051);
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                if (i3 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                    char[] cArr4 = new char[i];
                    java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                    java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                    java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
                }
                if (z) {
                    char[] cArr5 = new char[i];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                        cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                        com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                    }
                    cArr3 = cArr5;
                }
                str2 = new java.lang.String(cArr3);
            }
            return str2;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m8435(int i, java.lang.String str, byte b) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
            char[] cArr3 = f3047;
            char c = f3048;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i) {
                    com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                    com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                    if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b);
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b);
                    } else {
                        com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c;
                        if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c) - 1) % c;
                            int i2 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i2];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i3];
                        } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c) - 1) % c;
                            int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i4];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i5];
                        } else {
                            int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i6];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i7];
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                }
            }
            str2 = new java.lang.String(cArr4);
        }
        return str2;
    }
}
