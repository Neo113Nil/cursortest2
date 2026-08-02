package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fl {
    public static int c;
    public static int e;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.reflect.Type, com.facetec.sdk.em<?>> f3565a;
    private final boolean b;
    private final java.util.List<com.facetec.sdk.ez> d;

    public fl(java.util.Map<java.lang.reflect.Type, com.facetec.sdk.em<?>> map, boolean z, java.util.List<com.facetec.sdk.ez> list) {
        this.f3565a = map;
        this.b = z;
        this.d = list;
    }

    static java.lang.String b(java.lang.Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (java.lang.reflect.Modifier.isInterface(modifiers)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ");
            sb.append(cls.getName());
            return sb.toString();
        }
        if (!java.lang.reflect.Modifier.isAbstract(modifiers)) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ");
        sb2.append(cls.getName());
        return sb2.toString();
    }

    public final <T> com.facetec.sdk.fs<T> d(com.facetec.sdk.gw<T> gwVar) {
        com.facetec.sdk.fs<T> fsVar;
        final java.lang.reflect.Type b = gwVar.b();
        final java.lang.Class<? super T> a2 = gwVar.a();
        final com.facetec.sdk.em<?> emVar = this.f3565a.get(b);
        if (emVar != null) {
            return new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.2
                @Override // com.facetec.sdk.fs
                public final T e() {
                    return (T) emVar.d();
                }
            };
        }
        final com.facetec.sdk.em<?> emVar2 = this.f3565a.get(a2);
        if (emVar2 != null) {
            return new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.12
                @Override // com.facetec.sdk.fs
                public final T e() {
                    return (T) emVar2.d();
                }
            };
        }
        com.facetec.sdk.fs<T> fsVar2 = null;
        if (java.util.EnumSet.class.isAssignableFrom(a2)) {
            fsVar = new com.facetec.sdk.fl.AnonymousClass16<>(b);
        } else {
            fsVar = a2 == java.util.EnumMap.class ? new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.17
                @Override // com.facetec.sdk.fs
                public final T e() {
                    java.lang.reflect.Type type = b;
                    if (type instanceof java.lang.reflect.ParameterizedType) {
                        java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0];
                        if (type2 instanceof java.lang.Class) {
                            return (T) new java.util.EnumMap((java.lang.Class) type2);
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid EnumMap type: ");
                        sb.append(b.toString());
                        throw new com.facetec.sdk.et(sb.toString());
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid EnumMap type: ");
                    sb2.append(b.toString());
                    throw new com.facetec.sdk.et(sb2.toString());
                }
            } : null;
        }
        if (fsVar != null) {
            return fsVar;
        }
        com.facetec.sdk.ez.a d = com.facetec.sdk.ft.d(this.d, a2);
        com.facetec.sdk.fs<T> d2 = d(a2, d);
        if (d2 != null) {
            return d2;
        }
        if (java.util.Collection.class.isAssignableFrom(a2)) {
            if (java.util.SortedSet.class.isAssignableFrom(a2)) {
                fsVar2 = new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.4
                    @Override // com.facetec.sdk.fs
                    public final T e() {
                        return (T) new java.util.TreeSet();
                    }
                };
            } else if (java.util.Set.class.isAssignableFrom(a2)) {
                fsVar2 = new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.1
                    @Override // com.facetec.sdk.fs
                    public final T e() {
                        return (T) new java.util.LinkedHashSet();
                    }
                };
            } else if (java.util.Queue.class.isAssignableFrom(a2)) {
                fsVar2 = new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.5
                    @Override // com.facetec.sdk.fs
                    public final T e() {
                        return (T) new java.util.ArrayDeque();
                    }
                };
            } else {
                fsVar2 = new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.3
                    @Override // com.facetec.sdk.fs
                    public final T e() {
                        return (T) new java.util.ArrayList();
                    }
                };
            }
        } else if (java.util.Map.class.isAssignableFrom(a2)) {
            if (java.util.concurrent.ConcurrentNavigableMap.class.isAssignableFrom(a2)) {
                fsVar2 = new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.8
                    @Override // com.facetec.sdk.fs
                    public final T e() {
                        return (T) new java.util.concurrent.ConcurrentSkipListMap();
                    }
                };
            } else if (java.util.concurrent.ConcurrentMap.class.isAssignableFrom(a2)) {
                fsVar2 = new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.6
                    @Override // com.facetec.sdk.fs
                    public final T e() {
                        return (T) new java.util.concurrent.ConcurrentHashMap();
                    }
                };
            } else if (java.util.SortedMap.class.isAssignableFrom(a2)) {
                fsVar2 = new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.7
                    @Override // com.facetec.sdk.fs
                    public final T e() {
                        return (T) new java.util.TreeMap();
                    }
                };
            } else if ((b instanceof java.lang.reflect.ParameterizedType) && !java.lang.String.class.isAssignableFrom(com.facetec.sdk.gw.d(((java.lang.reflect.ParameterizedType) b).getActualTypeArguments()[0]).a())) {
                fsVar2 = new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.9
                    @Override // com.facetec.sdk.fs
                    public final T e() {
                        return (T) new java.util.LinkedHashMap();
                    }
                };
            } else {
                fsVar2 = new com.facetec.sdk.fl.AnonymousClass10<>();
            }
        }
        if (fsVar2 != null) {
            return fsVar2;
        }
        final java.lang.String b2 = b(a2);
        if (b2 != null) {
            return new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.15
                @Override // com.facetec.sdk.fs
                public final T e() {
                    throw new com.facetec.sdk.et(b2);
                }
            };
        }
        if (d != com.facetec.sdk.ez.a.ALLOW) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create instance of ");
            sb.append(a2);
            sb.append("; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
            final java.lang.String obj = sb.toString();
            return new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.14
                @Override // com.facetec.sdk.fs
                public final T e() {
                    throw new com.facetec.sdk.et(obj);
                }
            };
        }
        if (this.b) {
            return new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.13
                @Override // com.facetec.sdk.fs
                public final T e() {
                    try {
                        return (T) com.facetec.sdk.fu.e.a(a2);
                    } catch (java.lang.Exception e2) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to create instance of ");
                        sb2.append(a2);
                        sb2.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
                        throw new java.lang.RuntimeException(sb2.toString(), e2);
                    }
                }
            };
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to create instance of ");
        sb2.append(a2);
        sb2.append("; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        final java.lang.String obj2 = sb2.toString();
        return new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.11
            @Override // com.facetec.sdk.fs
            public final T e() {
                throw new com.facetec.sdk.et(obj2);
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.facetec.sdk.fl$16, reason: invalid class name */
    final class AnonymousClass16<T> implements com.facetec.sdk.fs<T> {
        public static int b;
        public static int e;
        private /* synthetic */ java.lang.reflect.Type d;

        AnonymousClass16(java.lang.reflect.Type type) {
            this.d = type;
        }

        @Override // com.facetec.sdk.fs
        public final T e() {
            java.lang.reflect.Type type = this.d;
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof java.lang.Class) {
                    return (T) java.util.EnumSet.noneOf((java.lang.Class) type2);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid EnumSet type: ");
                sb.append(this.d.toString());
                throw new com.facetec.sdk.et(sb.toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid EnumSet type: ");
            sb2.append(this.d.toString());
            throw new com.facetec.sdk.et(sb2.toString());
        }

        public static int c() {
            int i = b;
            b = i + 1;
            if (i % 5019868 != 0) {
                return e;
            }
            int myPid = android.os.Process.myPid();
            e = myPid;
            return myPid;
        }
    }

    private static <T> com.facetec.sdk.fs<T> d(java.lang.Class<? super T> cls, com.facetec.sdk.ez.a aVar) {
        java.lang.String e2;
        if (java.lang.reflect.Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final java.lang.reflect.Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            if (aVar != com.facetec.sdk.ez.a.ALLOW && (!com.facetec.sdk.ft.e(declaredConstructor, null) || (aVar == com.facetec.sdk.ez.a.BLOCK_ALL && !java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to invoke no-args constructor of ");
                sb.append(cls);
                sb.append("; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                final java.lang.String obj = sb.toString();
                return new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.20
                    @Override // com.facetec.sdk.fs
                    public final T e() {
                        throw new com.facetec.sdk.et(obj);
                    }
                };
            }
            if (aVar == com.facetec.sdk.ez.a.ALLOW && (e2 = com.facetec.sdk.gr.e(declaredConstructor)) != null) {
                return new com.facetec.sdk.fl.AnonymousClass18(e2);
            }
            return new com.facetec.sdk.fs<T>() { // from class: com.facetec.sdk.fl.19
                @Override // com.facetec.sdk.fs
                public final T e() {
                    try {
                        return (T) declaredConstructor.newInstance(new java.lang.Object[0]);
                    } catch (java.lang.IllegalAccessException e3) {
                        throw com.facetec.sdk.gr.b(e3);
                    } catch (java.lang.InstantiationException e4) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to invoke constructor '");
                        sb2.append(com.facetec.sdk.gr.d(declaredConstructor));
                        sb2.append("' with no args");
                        throw new java.lang.RuntimeException(sb2.toString(), e4);
                    } catch (java.lang.reflect.InvocationTargetException e5) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to invoke constructor '");
                        sb3.append(com.facetec.sdk.gr.d(declaredConstructor));
                        sb3.append("' with no args");
                        throw new java.lang.RuntimeException(sb3.toString(), e5.getCause());
                    }
                }
            };
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.facetec.sdk.fl$18, reason: invalid class name */
    final class AnonymousClass18<T> implements com.facetec.sdk.fs<T> {

        /* renamed from: a, reason: collision with root package name */
        public static int f3568a;
        public static int e;
        private /* synthetic */ java.lang.String b;

        AnonymousClass18(java.lang.String str) {
            this.b = str;
        }

        @Override // com.facetec.sdk.fs
        public final T e() {
            throw new com.facetec.sdk.et(this.b);
        }

        public static int d() {
            int i = f3568a;
            f3568a = i + 1;
            if (i % 9164946 != 0) {
                return e;
            }
            int myPid = android.os.Process.myPid();
            e = myPid;
            return myPid;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.facetec.sdk.fl$10, reason: invalid class name */
    final class AnonymousClass10<T> implements com.facetec.sdk.fs<T> {
        public static int b;
        public static int c;

        AnonymousClass10() {
        }

        @Override // com.facetec.sdk.fs
        public final T e() {
            return (T) new com.facetec.sdk.fp();
        }

        public static int a() {
            int i = c;
            c = i + 1;
            if (i % 9663180 != 0) {
                return b;
            }
            int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
            b = uptimeMillis;
            return uptimeMillis;
        }
    }

    public final java.lang.String toString() {
        return this.f3565a.toString();
    }

    public static int d() {
        int i = e;
        e = i + 1;
        if (i % 5362595 != 0) {
            return c;
        }
        int nextInt = new java.util.Random().nextInt();
        c = nextInt;
        return nextInt;
    }
}
