package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ge implements com.facetec.sdk.fb {

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.gb f3591a;
    private final com.facetec.sdk.fm b;
    private final com.facetec.sdk.fl c;
    private final com.facetec.sdk.ek d;
    private final java.util.List<com.facetec.sdk.ez> e;

    public ge(com.facetec.sdk.fl flVar, com.facetec.sdk.ek ekVar, com.facetec.sdk.fm fmVar, com.facetec.sdk.gb gbVar, java.util.List<com.facetec.sdk.ez> list) {
        this.c = flVar;
        this.d = ekVar;
        this.b = fmVar;
        this.f3591a = gbVar;
        this.e = list;
    }

    private boolean d(java.lang.reflect.Field field, boolean z) {
        com.facetec.sdk.fm fmVar = this.b;
        if (fmVar.a(field.getType()) || fmVar.e(z)) {
            return false;
        }
        com.facetec.sdk.fm fmVar2 = this.b;
        if ((fmVar2.e & field.getModifiers()) != 0) {
            return false;
        }
        if ((fmVar2.b != -1.0d && !fmVar2.d((com.facetec.sdk.fh) field.getAnnotation(com.facetec.sdk.fh.class), (com.facetec.sdk.fe) field.getAnnotation(com.facetec.sdk.fe.class))) || field.isSynthetic()) {
            return false;
        }
        if (fmVar2.f3571a) {
            com.facetec.sdk.fi fiVar = (com.facetec.sdk.fi) field.getAnnotation(com.facetec.sdk.fi.class);
            if (fiVar == null) {
                return false;
            }
            if (z) {
                if (!fiVar.a()) {
                    return false;
                }
            } else if (!fiVar.e()) {
                return false;
            }
        }
        if ((!fmVar2.d && com.facetec.sdk.fm.b(field.getType())) || com.facetec.sdk.fm.e(field.getType())) {
            return false;
        }
        java.util.List<com.facetec.sdk.ef> list = z ? fmVar2.g : fmVar2.f;
        if (list.isEmpty()) {
            return true;
        }
        new com.facetec.sdk.ei(field);
        java.util.Iterator<com.facetec.sdk.ef> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().c()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facetec.sdk.fb
    public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
        java.lang.Class<? super T> a2 = gwVar.a();
        if (!java.lang.Object.class.isAssignableFrom(a2)) {
            return null;
        }
        com.facetec.sdk.ez.a d2 = com.facetec.sdk.ft.d(this.e, a2);
        if (d2 == com.facetec.sdk.ez.a.BLOCK_ALL) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectionAccessFilter does not permit using reflection for ");
            sb.append(a2);
            sb.append(". Register a TypeAdapter for this type or adjust the access filter.");
            throw new com.facetec.sdk.et(sb.toString());
        }
        boolean z = d2 == com.facetec.sdk.ez.a.BLOCK_INACCESSIBLE;
        if (com.facetec.sdk.gr.e(a2)) {
            return new com.facetec.sdk.ge.e(a2, c(eoVar, gwVar, a2, z, true), z);
        }
        return new com.facetec.sdk.ge.d(this.c.d(gwVar), c(eoVar, gwVar, a2, z, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.util.Map<java.lang.String, com.facetec.sdk.ge.c> c(final com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<?> gwVar, java.lang.Class<?> cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        java.lang.reflect.Method method;
        com.facetec.sdk.fg fgVar;
        java.util.ArrayList arrayList;
        int size;
        int i;
        com.facetec.sdk.ge.c cVar;
        int i2;
        int i3;
        boolean z5;
        java.lang.reflect.Field[] fieldArr;
        java.lang.Class<?> cls2;
        java.lang.reflect.Type type;
        java.util.LinkedHashMap linkedHashMap;
        boolean z6;
        java.util.ArrayList arrayList2;
        com.facetec.sdk.ge geVar = this;
        com.facetec.sdk.eo eoVar2 = eoVar;
        java.lang.Class<?> cls3 = cls;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (!cls.isInterface()) {
            java.lang.reflect.Type b = gwVar.b();
            com.facetec.sdk.gw<?> gwVar2 = gwVar;
            boolean z7 = z;
            java.lang.Class<?> cls4 = cls3;
            while (cls4 != java.lang.Object.class) {
                java.lang.reflect.Field[] declaredFields = cls4.getDeclaredFields();
                boolean z8 = true;
                boolean z9 = false;
                if (cls4 == cls3 || declaredFields.length <= 0) {
                    z3 = z7;
                } else {
                    com.facetec.sdk.ez.a d2 = com.facetec.sdk.ft.d(geVar.e, cls4);
                    if (d2 == com.facetec.sdk.ez.a.BLOCK_ALL) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectionAccessFilter does not permit using reflection for ");
                        sb.append(cls4);
                        sb.append(" (supertype of ");
                        sb.append(cls3);
                        sb.append("). Register a TypeAdapter for this type or adjust the access filter.");
                        throw new com.facetec.sdk.et(sb.toString());
                    }
                    z3 = d2 == com.facetec.sdk.ez.a.BLOCK_INACCESSIBLE;
                }
                int length = declaredFields.length;
                int i4 = 0;
                while (i4 < length) {
                    java.lang.reflect.Field field = declaredFields[i4];
                    boolean d3 = geVar.d(field, z8);
                    boolean d4 = geVar.d(field, z9);
                    if (d3 || d4) {
                        if (z2) {
                            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                                d4 = z9;
                            } else {
                                java.lang.reflect.Method e2 = com.facetec.sdk.gr.e(cls4, field);
                                if (!z3) {
                                    com.facetec.sdk.gr.b(e2);
                                }
                                if (e2.getAnnotation(com.facetec.sdk.fg.class) != null && field.getAnnotation(com.facetec.sdk.fg.class) == null) {
                                    java.lang.String a2 = com.facetec.sdk.gr.a(e2, z9);
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("@SerializedName on ");
                                    sb2.append(a2);
                                    sb2.append(" is not supported");
                                    throw new com.facetec.sdk.et(sb2.toString());
                                }
                                z4 = d4;
                                method = e2;
                                if (!z3 && method == null) {
                                    com.facetec.sdk.gr.b(field);
                                }
                                java.lang.reflect.Type c2 = com.facetec.sdk.fn.c(gwVar2.b(), cls4, field.getGenericType());
                                fgVar = (com.facetec.sdk.fg) field.getAnnotation(com.facetec.sdk.fg.class);
                                if (fgVar != null) {
                                    arrayList2 = java.util.Collections.singletonList(geVar.d.e(field));
                                } else {
                                    java.lang.String e3 = fgVar.e();
                                    java.lang.String[] a3 = fgVar.a();
                                    if (a3.length == 0) {
                                        arrayList2 = java.util.Collections.singletonList(e3);
                                    } else {
                                        java.util.ArrayList arrayList3 = new java.util.ArrayList(a3.length + (z8 ? 1 : 0));
                                        arrayList3.add(e3);
                                        java.util.Collections.addAll(arrayList3, a3);
                                        arrayList = arrayList3;
                                        size = arrayList.size();
                                        com.facetec.sdk.ge.c cVar2 = null;
                                        i = 0;
                                        while (i < size) {
                                            java.lang.String str = (java.lang.String) arrayList.get(i);
                                            boolean z10 = i != 0 ? false : d3;
                                            final com.facetec.sdk.gw<?> d5 = com.facetec.sdk.gw.d(c2);
                                            java.lang.Class<? super java.lang.Object> a4 = d5.a();
                                            com.facetec.sdk.ge.c cVar3 = cVar2;
                                            boolean z11 = (a4 instanceof java.lang.Class) && a4.isPrimitive();
                                            int modifiers = field.getModifiers();
                                            boolean z12 = java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers);
                                            com.facetec.sdk.ff ffVar = (com.facetec.sdk.ff) field.getAnnotation(com.facetec.sdk.ff.class);
                                            com.facetec.sdk.fd<?> d6 = ffVar != null ? com.facetec.sdk.gb.d(geVar.c, eoVar2, d5, ffVar) : null;
                                            boolean z13 = d6 != null;
                                            if (d6 == null) {
                                                d6 = eoVar2.a((com.facetec.sdk.gw) d5);
                                            }
                                            final com.facetec.sdk.fd<?> fdVar = d6;
                                            int i5 = i;
                                            int i6 = size;
                                            final java.lang.reflect.Field field2 = field;
                                            int i7 = i4;
                                            int i8 = length;
                                            final boolean z14 = z3;
                                            java.util.ArrayList arrayList4 = arrayList;
                                            final java.lang.reflect.Method method2 = method;
                                            java.lang.reflect.Field[] fieldArr2 = declaredFields;
                                            final boolean z15 = z13;
                                            java.lang.Class<?> cls5 = cls4;
                                            java.lang.reflect.Type type2 = b;
                                            java.util.LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                            final boolean z16 = z11;
                                            final boolean z17 = z12;
                                            cVar2 = (com.facetec.sdk.ge.c) linkedHashMap3.put(str, new com.facetec.sdk.ge.c(str, field.getName(), z10, z4) { // from class: com.facetec.sdk.ge.3
                                                @Override // com.facetec.sdk.ge.c
                                                final void b(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException {
                                                    java.lang.Object obj2;
                                                    if (this.d) {
                                                        if (z14) {
                                                            java.lang.reflect.Method method3 = method2;
                                                            if (method3 == null) {
                                                                com.facetec.sdk.ge.e(obj, field2);
                                                            } else {
                                                                com.facetec.sdk.ge.e(obj, method3);
                                                            }
                                                        }
                                                        java.lang.reflect.Method method4 = method2;
                                                        if (method4 != null) {
                                                            try {
                                                                obj2 = method4.invoke(obj, new java.lang.Object[0]);
                                                            } catch (java.lang.reflect.InvocationTargetException e4) {
                                                                java.lang.String a5 = com.facetec.sdk.gr.a(method2, false);
                                                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Accessor ");
                                                                sb3.append(a5);
                                                                sb3.append(" threw exception");
                                                                throw new com.facetec.sdk.et(sb3.toString(), e4.getCause());
                                                            }
                                                        } else {
                                                            obj2 = field2.get(obj);
                                                        }
                                                        if (obj2 == obj) {
                                                            return;
                                                        }
                                                        guVar.c(this.e);
                                                        (z15 ? fdVar : new com.facetec.sdk.gk(eoVar, fdVar, d5.b())).a(guVar, obj2);
                                                    }
                                                }

                                                @Override // com.facetec.sdk.ge.c
                                                final void e(com.facetec.sdk.gt gtVar, int i9, java.lang.Object[] objArr) throws java.io.IOException, com.facetec.sdk.ew {
                                                    java.lang.Object b2 = fdVar.b(gtVar);
                                                    if (b2 == null && z16) {
                                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("null is not allowed as value for record component '");
                                                        sb3.append(this.c);
                                                        sb3.append("' of primitive type; at path ");
                                                        sb3.append(gtVar.t());
                                                        throw new com.facetec.sdk.ew(sb3.toString());
                                                    }
                                                    objArr[i9] = b2;
                                                }

                                                @Override // com.facetec.sdk.ge.c
                                                final void c(com.facetec.sdk.gt gtVar, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException {
                                                    java.lang.Object b2 = fdVar.b(gtVar);
                                                    if (b2 == null && z16) {
                                                        return;
                                                    }
                                                    if (z14) {
                                                        com.facetec.sdk.ge.e(obj, field2);
                                                    } else if (z17) {
                                                        throw new com.facetec.sdk.et("Cannot set value of 'static final' ".concat(java.lang.String.valueOf(com.facetec.sdk.gr.a(field2, false))));
                                                    }
                                                    field2.set(obj, b2);
                                                }
                                            });
                                            if (cVar3 != null) {
                                                cVar2 = cVar3;
                                            }
                                            i = i5 + 1;
                                            geVar = this;
                                            eoVar2 = eoVar;
                                            cls4 = cls5;
                                            linkedHashMap2 = linkedHashMap3;
                                            d3 = z10;
                                            field = field2;
                                            size = i6;
                                            i4 = i7;
                                            length = i8;
                                            arrayList = arrayList4;
                                            z8 = true;
                                            declaredFields = fieldArr2;
                                            b = type2;
                                        }
                                        cVar = cVar2;
                                        i2 = i4;
                                        i3 = length;
                                        z5 = z8;
                                        fieldArr = declaredFields;
                                        cls2 = cls4;
                                        type = b;
                                        linkedHashMap = linkedHashMap2;
                                        z6 = false;
                                        if (cVar != null) {
                                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                            sb3.append(type);
                                            sb3.append(" declares multiple JSON fields named ");
                                            sb3.append(cVar.e);
                                            throw new java.lang.IllegalArgumentException(sb3.toString());
                                        }
                                    }
                                }
                                arrayList = arrayList2;
                                size = arrayList.size();
                                com.facetec.sdk.ge.c cVar22 = null;
                                i = 0;
                                while (i < size) {
                                }
                                cVar = cVar22;
                                i2 = i4;
                                i3 = length;
                                z5 = z8;
                                fieldArr = declaredFields;
                                cls2 = cls4;
                                type = b;
                                linkedHashMap = linkedHashMap2;
                                z6 = false;
                                if (cVar != null) {
                                }
                            }
                        }
                        z4 = d4;
                        method = null;
                        if (!z3) {
                            com.facetec.sdk.gr.b(field);
                        }
                        java.lang.reflect.Type c22 = com.facetec.sdk.fn.c(gwVar2.b(), cls4, field.getGenericType());
                        fgVar = (com.facetec.sdk.fg) field.getAnnotation(com.facetec.sdk.fg.class);
                        if (fgVar != null) {
                        }
                        arrayList = arrayList2;
                        size = arrayList.size();
                        com.facetec.sdk.ge.c cVar222 = null;
                        i = 0;
                        while (i < size) {
                        }
                        cVar = cVar222;
                        i2 = i4;
                        i3 = length;
                        z5 = z8;
                        fieldArr = declaredFields;
                        cls2 = cls4;
                        type = b;
                        linkedHashMap = linkedHashMap2;
                        z6 = false;
                        if (cVar != null) {
                        }
                    } else {
                        i2 = i4;
                        i3 = length;
                        z6 = z9;
                        z5 = z8 ? 1 : 0;
                        fieldArr = declaredFields;
                        cls2 = cls4;
                        type = b;
                        linkedHashMap = linkedHashMap2;
                    }
                    i4 = i2 + 1;
                    geVar = this;
                    eoVar2 = eoVar;
                    cls4 = cls2;
                    linkedHashMap2 = linkedHashMap;
                    length = i3;
                    z9 = z6;
                    z8 = z5;
                    declaredFields = fieldArr;
                    b = type;
                }
                java.lang.Class<?> cls6 = cls4;
                gwVar2 = com.facetec.sdk.gw.d(com.facetec.sdk.fn.c(gwVar2.b(), cls6, cls6.getGenericSuperclass()));
                cls4 = gwVar2.a();
                geVar = this;
                eoVar2 = eoVar;
                cls3 = cls;
                z7 = z3;
            }
        }
        return linkedHashMap2;
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final boolean f3593a;
        final java.lang.String c;
        final boolean d;
        final java.lang.String e;

        abstract void b(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract void c(com.facetec.sdk.gt gtVar, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract void e(com.facetec.sdk.gt gtVar, int i, java.lang.Object[] objArr) throws java.io.IOException, com.facetec.sdk.ew;

        protected c(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
            this.e = str;
            this.c = str2;
            this.d = z;
            this.f3593a = z2;
        }
    }

    public static abstract class a<T, A> extends com.facetec.sdk.fd<T> {

        /* renamed from: a, reason: collision with root package name */
        private java.util.Map<java.lang.String, com.facetec.sdk.ge.c> f3592a;

        abstract T b(A a2);

        abstract A c();

        abstract void c(A a2, com.facetec.sdk.gt gtVar, com.facetec.sdk.ge.c cVar) throws java.lang.IllegalAccessException, java.io.IOException;

        a(java.util.Map<java.lang.String, com.facetec.sdk.ge.c> map) {
            this.f3592a = map;
        }

        @Override // com.facetec.sdk.fd
        public final void a(com.facetec.sdk.gu guVar, T t) throws java.io.IOException {
            if (t == null) {
                guVar.g();
                return;
            }
            guVar.e();
            try {
                java.util.Iterator<com.facetec.sdk.ge.c> it = this.f3592a.values().iterator();
                while (it.hasNext()) {
                    it.next().b(guVar, t);
                }
                guVar.d();
            } catch (java.lang.IllegalAccessException e) {
                throw com.facetec.sdk.gr.b(e);
            }
        }

        @Override // com.facetec.sdk.fd
        public final T b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                gtVar.k();
                return null;
            }
            A c = c();
            try {
                gtVar.b();
                while (gtVar.d()) {
                    com.facetec.sdk.ge.c cVar = this.f3592a.get(gtVar.i());
                    if (cVar != null && cVar.f3593a) {
                        c(c, gtVar, cVar);
                    }
                    gtVar.n();
                }
                gtVar.c();
                return b((com.facetec.sdk.ge.a<T, A>) c);
            } catch (java.lang.IllegalAccessException e) {
                throw com.facetec.sdk.gr.b(e);
            } catch (java.lang.IllegalStateException e2) {
                throw new com.facetec.sdk.ev(e2);
            }
        }
    }

    static final class d<T> extends com.facetec.sdk.ge.a<T, T> {
        private final com.facetec.sdk.fs<T> e;

        @Override // com.facetec.sdk.ge.a
        final T b(T t) {
            return t;
        }

        d(com.facetec.sdk.fs<T> fsVar, java.util.Map<java.lang.String, com.facetec.sdk.ge.c> map) {
            super(map);
            this.e = fsVar;
        }

        @Override // com.facetec.sdk.ge.a
        final T c() {
            return this.e.e();
        }

        @Override // com.facetec.sdk.ge.a
        final void c(T t, com.facetec.sdk.gt gtVar, com.facetec.sdk.ge.c cVar) throws java.lang.IllegalAccessException, java.io.IOException {
            cVar.c(gtVar, t);
        }
    }

    static final class e<T> extends com.facetec.sdk.ge.a<T, java.lang.Object[]> {
        private static java.util.Map<java.lang.Class<?>, java.lang.Object> e;

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Constructor<T> f3594a;
        private final java.util.Map<java.lang.String, java.lang.Integer> c;
        private final java.lang.Object[] d;

        @Override // com.facetec.sdk.ge.a
        final /* synthetic */ void c(java.lang.Object[] objArr, com.facetec.sdk.gt gtVar, com.facetec.sdk.ge.c cVar) throws java.lang.IllegalAccessException, java.io.IOException {
            java.lang.Object[] objArr2 = objArr;
            java.lang.Integer num = this.c.get(cVar.c);
            if (num == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not find the index in the constructor '");
                sb.append(com.facetec.sdk.gr.d(this.f3594a));
                sb.append("' for field with name '");
                sb.append(cVar.c);
                sb.append("', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            cVar.e(gtVar, num.intValue(), objArr2);
        }

        e(java.lang.Class<T> cls, java.util.Map<java.lang.String, com.facetec.sdk.ge.c> map, boolean z) {
            super(map);
            this.c = new java.util.HashMap();
            java.lang.reflect.Constructor<T> a2 = com.facetec.sdk.gr.a(cls);
            this.f3594a = a2;
            if (z) {
                com.facetec.sdk.ge.e(null, a2);
            } else {
                com.facetec.sdk.gr.b(a2);
            }
            java.lang.String[] b = com.facetec.sdk.gr.b((java.lang.Class<?>) cls);
            for (int i = 0; i < b.length; i++) {
                this.c.put(b[i], java.lang.Integer.valueOf(i));
            }
            java.lang.Class<?>[] parameterTypes = this.f3594a.getParameterTypes();
            this.d = new java.lang.Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.d[i2] = e.get(parameterTypes[i2]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facetec.sdk.ge.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(java.lang.Object[] objArr) {
            try {
                return this.f3594a.newInstance(objArr);
            } catch (java.lang.IllegalAccessException e2) {
                throw com.facetec.sdk.gr.b(e2);
            } catch (java.lang.IllegalArgumentException e3) {
                e = e3;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to invoke constructor '");
                sb.append(com.facetec.sdk.gr.d(this.f3594a));
                sb.append("' with args ");
                sb.append(java.util.Arrays.toString(objArr));
                throw new java.lang.RuntimeException(sb.toString(), e);
            } catch (java.lang.InstantiationException e4) {
                e = e4;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to invoke constructor '");
                sb2.append(com.facetec.sdk.gr.d(this.f3594a));
                sb2.append("' with args ");
                sb2.append(java.util.Arrays.toString(objArr));
                throw new java.lang.RuntimeException(sb2.toString(), e);
            } catch (java.lang.reflect.InvocationTargetException e5) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to invoke constructor '");
                sb3.append(com.facetec.sdk.gr.d(this.f3594a));
                sb3.append("' with args ");
                sb3.append(java.util.Arrays.toString(objArr));
                throw new java.lang.RuntimeException(sb3.toString(), e5.getCause());
            }
        }

        @Override // com.facetec.sdk.ge.a
        final /* synthetic */ java.lang.Object[] c() {
            return (java.lang.Object[]) this.d.clone();
        }

        static {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(java.lang.Byte.TYPE, (byte) 0);
            hashMap.put(java.lang.Short.TYPE, (short) 0);
            hashMap.put(java.lang.Integer.TYPE, 0);
            hashMap.put(java.lang.Long.TYPE, 0L);
            hashMap.put(java.lang.Float.TYPE, java.lang.Float.valueOf(0.0f));
            hashMap.put(java.lang.Double.TYPE, java.lang.Double.valueOf(0.0d));
            hashMap.put(java.lang.Character.TYPE, (char) 0);
            hashMap.put(java.lang.Boolean.TYPE, java.lang.Boolean.FALSE);
            e = hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void e(java.lang.Object obj, java.lang.reflect.AccessibleObject accessibleObject) {
        if (java.lang.reflect.Modifier.isStatic(((java.lang.reflect.Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (com.facetec.sdk.ft.e(accessibleObject, obj)) {
            return;
        }
        java.lang.String a2 = com.facetec.sdk.gr.a(accessibleObject, true);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(a2);
        sb.append(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        throw new com.facetec.sdk.et(sb.toString());
    }
}
