package com.squareup.moshi;

/* loaded from: classes3.dex */
final class AdapterMethodsFactory implements com.squareup.moshi.JsonAdapter.Factory {
    private final java.util.List<com.squareup.moshi.AdapterMethodsFactory.AdapterMethod> Camera2StreamConfigurationMap;
    private final java.util.List<com.squareup.moshi.AdapterMethodsFactory.AdapterMethod> getHighSpeedVideoSizes;

    private AdapterMethodsFactory(java.util.List<com.squareup.moshi.AdapterMethodsFactory.AdapterMethod> list, java.util.List<com.squareup.moshi.AdapterMethodsFactory.AdapterMethod> list2) {
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoSizes = list2;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    @javax.annotation.Nullable
    public final com.squareup.moshi.JsonAdapter<?> create(final java.lang.reflect.Type type, final java.util.Set<? extends java.lang.annotation.Annotation> set, final com.squareup.moshi.Moshi moshi) {
        final com.squareup.moshi.AdapterMethodsFactory.AdapterMethod highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, type, set);
        final com.squareup.moshi.AdapterMethodsFactory.AdapterMethod highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, type, set);
        com.squareup.moshi.JsonAdapter jsonAdapter = null;
        if (highSpeedVideoFpsRanges == null && highSpeedVideoFpsRanges2 == null) {
            return null;
        }
        if (highSpeedVideoFpsRanges == null || highSpeedVideoFpsRanges2 == null) {
            try {
                jsonAdapter = moshi.nextAdapter(this, type, set);
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.String str = highSpeedVideoFpsRanges == null ? "@ToJson" : "@FromJson";
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No ");
                sb.append(str);
                sb.append(" adapter for ");
                sb.append(com.squareup.moshi.internal.Util.typeAnnotatedWithAnnotations(type, set));
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        }
        final com.squareup.moshi.JsonAdapter jsonAdapter2 = jsonAdapter;
        if (highSpeedVideoFpsRanges != null) {
            highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(moshi, this);
        }
        if (highSpeedVideoFpsRanges2 != null) {
            highSpeedVideoFpsRanges2.getHighResolutionOutputSizeshNQ4ISI(moshi, this);
        }
        return new com.squareup.moshi.JsonAdapter<java.lang.Object>() { // from class: com.squareup.moshi.AdapterMethodsFactory.1
            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                com.squareup.moshi.AdapterMethodsFactory.AdapterMethod adapterMethod = highSpeedVideoFpsRanges;
                if (adapterMethod == null) {
                    jsonAdapter2.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) obj);
                    return;
                }
                if (!adapterMethod.getOutputSizeshNQ4ISI && obj == null) {
                    jsonWriter.nullValue();
                    return;
                }
                try {
                    highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(jsonWriter, obj);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    java.lang.Throwable cause = e2.getCause();
                    if (cause instanceof java.io.IOException) {
                        throw ((java.io.IOException) cause);
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(cause);
                    sb2.append(" at ");
                    sb2.append(jsonWriter.getPath());
                    throw new com.squareup.moshi.JsonDataException(sb2.toString(), cause);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            @javax.annotation.Nullable
            public java.lang.Object fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
                com.squareup.moshi.AdapterMethodsFactory.AdapterMethod adapterMethod = highSpeedVideoFpsRanges2;
                if (adapterMethod == null) {
                    return jsonAdapter2.fromJson(jsonReader);
                }
                if (!adapterMethod.getOutputSizeshNQ4ISI && jsonReader.peek() == com.squareup.moshi.JsonReader.Token.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRanges(jsonReader);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    java.lang.Throwable cause = e2.getCause();
                    if (cause instanceof java.io.IOException) {
                        throw ((java.io.IOException) cause);
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(cause);
                    sb2.append(" at ");
                    sb2.append(jsonReader.getPath());
                    throw new com.squareup.moshi.JsonDataException(sb2.toString(), cause);
                }
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JsonAdapter");
                sb2.append(set);
                sb2.append("(");
                sb2.append(type);
                sb2.append(")");
                return sb2.toString();
            }
        };
    }

    public static com.squareup.moshi.AdapterMethodsFactory getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        java.lang.reflect.Method[] methodArr;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.reflect.Method method;
        char c;
        com.squareup.moshi.AdapterMethodsFactory.AdapterMethod adapterMethod;
        com.squareup.moshi.AdapterMethodsFactory.AdapterMethod adapterMethod2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Class<?> cls = obj.getClass(); cls != java.lang.Object.class; cls = cls.getSuperclass()) {
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            char c2 = 0;
            int i2 = 0;
            for (int length = declaredMethods.length; i2 < length; length = i) {
                java.lang.reflect.Method method2 = declaredMethods[i2];
                if (method2.isAnnotationPresent(com.squareup.moshi.ToJson.class)) {
                    method2.setAccessible(true);
                    final java.lang.reflect.Type genericReturnType = method2.getGenericReturnType();
                    final java.lang.reflect.Type[] genericParameterTypes = method2.getGenericParameterTypes();
                    java.lang.annotation.Annotation[][] parameterAnnotations = method2.getParameterAnnotations();
                    if (genericParameterTypes.length >= 2 && genericParameterTypes[c2] == com.squareup.moshi.JsonWriter.class && genericReturnType == java.lang.Void.TYPE && getHighSpeedVideoFpsRangesFor(2, genericParameterTypes)) {
                        methodArr = declaredMethods;
                        adapterMethod2 = new com.squareup.moshi.AdapterMethodsFactory.AdapterMethod(genericParameterTypes[1], com.squareup.moshi.internal.Util.jsonAnnotations(parameterAnnotations[1]), obj, method2, genericParameterTypes.length) { // from class: com.squareup.moshi.AdapterMethodsFactory.2
                            @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                            public final void getHighSpeedVideoFpsRangesFor(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable java.lang.Object obj2) throws java.io.IOException, java.lang.reflect.InvocationTargetException {
                                getHighSpeedVideoSizes(jsonWriter, obj2);
                            }
                        };
                        i = length;
                        str = "Unexpected signature for ";
                        str2 = "\n    ";
                        method = method2;
                    } else {
                        methodArr = declaredMethods;
                        if (genericParameterTypes.length == 1 && genericReturnType != java.lang.Void.TYPE) {
                            final java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations = com.squareup.moshi.internal.Util.jsonAnnotations(method2);
                            final java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations2 = com.squareup.moshi.internal.Util.jsonAnnotations(parameterAnnotations[0]);
                            str = "Unexpected signature for ";
                            i = length;
                            str2 = "\n    ";
                            method = method2;
                            adapterMethod2 = new com.squareup.moshi.AdapterMethodsFactory.AdapterMethod(genericParameterTypes[0], jsonAnnotations2, obj, method2, genericParameterTypes.length, com.squareup.moshi.internal.Util.hasNullable(parameterAnnotations[0])) { // from class: com.squareup.moshi.AdapterMethodsFactory.3
                                private com.squareup.moshi.JsonAdapter<java.lang.Object> getHighSpeedVideoFpsRangesFor;

                                @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                                public final void getHighResolutionOutputSizeshNQ4ISI(com.squareup.moshi.Moshi moshi, com.squareup.moshi.JsonAdapter.Factory factory) {
                                    com.squareup.moshi.JsonAdapter<java.lang.Object> adapter;
                                    super.getHighResolutionOutputSizeshNQ4ISI(moshi, factory);
                                    if (com.squareup.moshi.Types.equals(genericParameterTypes[0], genericReturnType) && jsonAnnotations2.equals(jsonAnnotations)) {
                                        adapter = moshi.nextAdapter(factory, genericReturnType, jsonAnnotations);
                                    } else {
                                        adapter = moshi.adapter(genericReturnType, jsonAnnotations);
                                    }
                                    this.getHighSpeedVideoFpsRangesFor = adapter;
                                }

                                @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                                public final void getHighSpeedVideoFpsRangesFor(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable java.lang.Object obj2) throws java.io.IOException, java.lang.reflect.InvocationTargetException {
                                    this.getHighSpeedVideoFpsRangesFor.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) getHighSpeedVideoSizes(obj2));
                                }
                            };
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected signature for ");
                            sb.append(method2);
                            sb.append(".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                    }
                    com.squareup.moshi.AdapterMethodsFactory.AdapterMethod highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(arrayList, adapterMethod2.getOutputStallDurationlomOqCM, adapterMethod2.getOutputMinFrameDuration);
                    if (highSpeedVideoFpsRanges != null) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Conflicting @ToJson methods:\n    ");
                        sb2.append(highSpeedVideoFpsRanges.getHighSpeedVideoSizesFor);
                        sb2.append(str2);
                        sb2.append(adapterMethod2.getHighSpeedVideoSizesFor);
                        throw new java.lang.IllegalArgumentException(sb2.toString());
                    }
                    arrayList.add(adapterMethod2);
                } else {
                    methodArr = declaredMethods;
                    i = length;
                    str = "Unexpected signature for ";
                    str2 = "\n    ";
                    method = method2;
                }
                if (method.isAnnotationPresent(com.squareup.moshi.FromJson.class)) {
                    method.setAccessible(true);
                    final java.lang.reflect.Type genericReturnType2 = method.getGenericReturnType();
                    final java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations3 = com.squareup.moshi.internal.Util.jsonAnnotations(method);
                    final java.lang.reflect.Type[] genericParameterTypes2 = method.getGenericParameterTypes();
                    java.lang.annotation.Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                    if (genericParameterTypes2.length > 0 && genericParameterTypes2[0] == com.squareup.moshi.JsonReader.class && genericReturnType2 != java.lang.Void.TYPE && getHighSpeedVideoFpsRangesFor(1, genericParameterTypes2)) {
                        adapterMethod = new com.squareup.moshi.AdapterMethodsFactory.AdapterMethod(genericReturnType2, jsonAnnotations3, obj, method, genericParameterTypes2.length) { // from class: com.squareup.moshi.AdapterMethodsFactory.4
                            @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                            public final java.lang.Object getHighSpeedVideoFpsRanges(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException, java.lang.reflect.InvocationTargetException {
                                return getHighSpeedVideoSizes(jsonReader);
                            }
                        };
                        c = 0;
                    } else if (genericParameterTypes2.length == 1 && genericReturnType2 != java.lang.Void.TYPE) {
                        c = 0;
                        final java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations4 = com.squareup.moshi.internal.Util.jsonAnnotations(parameterAnnotations2[0]);
                        adapterMethod = new com.squareup.moshi.AdapterMethodsFactory.AdapterMethod(genericReturnType2, jsonAnnotations3, obj, method, genericParameterTypes2.length, com.squareup.moshi.internal.Util.hasNullable(parameterAnnotations2[0])) { // from class: com.squareup.moshi.AdapterMethodsFactory.5
                            com.squareup.moshi.JsonAdapter<java.lang.Object> getHighSpeedVideoSizes;

                            @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                            public final void getHighResolutionOutputSizeshNQ4ISI(com.squareup.moshi.Moshi moshi, com.squareup.moshi.JsonAdapter.Factory factory) {
                                com.squareup.moshi.JsonAdapter<java.lang.Object> adapter;
                                super.getHighResolutionOutputSizeshNQ4ISI(moshi, factory);
                                if (com.squareup.moshi.Types.equals(genericParameterTypes2[0], genericReturnType2) && jsonAnnotations4.equals(jsonAnnotations3)) {
                                    adapter = moshi.nextAdapter(factory, genericParameterTypes2[0], jsonAnnotations4);
                                } else {
                                    adapter = moshi.adapter(genericParameterTypes2[0], jsonAnnotations4);
                                }
                                this.getHighSpeedVideoSizes = adapter;
                            }

                            @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                            public final java.lang.Object getHighSpeedVideoFpsRanges(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException, java.lang.reflect.InvocationTargetException {
                                return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.fromJson(jsonReader));
                            }
                        };
                    } else {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(str);
                        sb3.append(method);
                        sb3.append(".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                        throw new java.lang.IllegalArgumentException(sb3.toString());
                    }
                    com.squareup.moshi.AdapterMethodsFactory.AdapterMethod highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(arrayList2, adapterMethod.getOutputStallDurationlomOqCM, adapterMethod.getOutputMinFrameDuration);
                    if (highSpeedVideoFpsRanges2 != null) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Conflicting @FromJson methods:\n    ");
                        sb4.append(highSpeedVideoFpsRanges2.getHighSpeedVideoSizesFor);
                        sb4.append(str2);
                        sb4.append(adapterMethod.getHighSpeedVideoSizesFor);
                        throw new java.lang.IllegalArgumentException(sb4.toString());
                    }
                    arrayList2.add(adapterMethod);
                } else {
                    c = 0;
                }
                i2++;
                c2 = c;
                declaredMethods = methodArr;
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Expected at least one @ToJson or @FromJson method on ");
            sb5.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb5.toString());
        }
        return new com.squareup.moshi.AdapterMethodsFactory(arrayList, arrayList2);
    }

    private static boolean getHighSpeedVideoFpsRangesFor(int i, java.lang.reflect.Type[] typeArr) {
        int length = typeArr.length;
        while (i < length) {
            java.lang.reflect.Type type = typeArr[i];
            if (!(type instanceof java.lang.reflect.ParameterizedType) || ((java.lang.reflect.ParameterizedType) type).getRawType() != com.squareup.moshi.JsonAdapter.class) {
                return false;
            }
            i++;
        }
        return true;
    }

    @javax.annotation.Nullable
    private static com.squareup.moshi.AdapterMethodsFactory.AdapterMethod getHighSpeedVideoFpsRanges(java.util.List<com.squareup.moshi.AdapterMethodsFactory.AdapterMethod> list, java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.squareup.moshi.AdapterMethodsFactory.AdapterMethod adapterMethod = list.get(i);
            if (com.squareup.moshi.Types.equals(adapterMethod.getOutputStallDurationlomOqCM, type) && adapterMethod.getOutputMinFrameDuration.equals(set)) {
                return adapterMethod;
            }
        }
        return null;
    }

    /* loaded from: classes16.dex */
    static abstract class AdapterMethod {
        final java.lang.reflect.Method getHighSpeedVideoSizesFor;
        final int getInputFormats;
        final com.squareup.moshi.JsonAdapter<?>[] getInputSizeshNQ4ISI;
        final java.lang.Object getOutputFormats;
        final java.util.Set<? extends java.lang.annotation.Annotation> getOutputMinFrameDuration;
        final boolean getOutputSizeshNQ4ISI;
        final java.lang.reflect.Type getOutputStallDurationlomOqCM;

        AdapterMethod(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set, java.lang.Object obj, java.lang.reflect.Method method, int i, int i2, boolean z) {
            this.getOutputStallDurationlomOqCM = com.squareup.moshi.internal.Util.canonicalize(type);
            this.getOutputMinFrameDuration = set;
            this.getOutputFormats = obj;
            this.getHighSpeedVideoSizesFor = method;
            this.getInputFormats = i2;
            this.getInputSizeshNQ4ISI = new com.squareup.moshi.JsonAdapter[i - i2];
            this.getOutputSizeshNQ4ISI = z;
        }

        public void getHighResolutionOutputSizeshNQ4ISI(com.squareup.moshi.Moshi moshi, com.squareup.moshi.JsonAdapter.Factory factory) {
            com.squareup.moshi.JsonAdapter<?> adapter;
            if (this.getInputSizeshNQ4ISI.length > 0) {
                java.lang.reflect.Type[] genericParameterTypes = this.getHighSpeedVideoSizesFor.getGenericParameterTypes();
                java.lang.annotation.Annotation[][] parameterAnnotations = this.getHighSpeedVideoSizesFor.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i = this.getInputFormats; i < length; i++) {
                    java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                    java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations = com.squareup.moshi.internal.Util.jsonAnnotations(parameterAnnotations[i]);
                    com.squareup.moshi.JsonAdapter<?>[] jsonAdapterArr = this.getInputSizeshNQ4ISI;
                    int i2 = this.getInputFormats;
                    if (com.squareup.moshi.Types.equals(this.getOutputStallDurationlomOqCM, type) && this.getOutputMinFrameDuration.equals(jsonAnnotations)) {
                        adapter = moshi.nextAdapter(factory, type, jsonAnnotations);
                    } else {
                        adapter = moshi.adapter(type, jsonAnnotations);
                    }
                    jsonAdapterArr[i - i2] = adapter;
                }
            }
        }

        public void getHighSpeedVideoFpsRangesFor(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException, java.lang.reflect.InvocationTargetException {
            throw new java.lang.AssertionError();
        }

        @javax.annotation.Nullable
        public java.lang.Object getHighSpeedVideoFpsRanges(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException, java.lang.reflect.InvocationTargetException {
            throw new java.lang.AssertionError();
        }

        @javax.annotation.Nullable
        protected final java.lang.Object getHighSpeedVideoSizes(@javax.annotation.Nullable java.lang.Object obj) throws java.lang.reflect.InvocationTargetException {
            com.squareup.moshi.JsonAdapter<?>[] jsonAdapterArr = this.getInputSizeshNQ4ISI;
            java.lang.Object[] objArr = new java.lang.Object[jsonAdapterArr.length + 1];
            objArr[0] = obj;
            java.lang.System.arraycopy(jsonAdapterArr, 0, objArr, 1, jsonAdapterArr.length);
            try {
                return this.getHighSpeedVideoSizesFor.invoke(this.getOutputFormats, objArr);
            } catch (java.lang.IllegalAccessException unused) {
                throw new java.lang.AssertionError();
            }
        }

        protected final java.lang.Object getHighSpeedVideoSizes(@javax.annotation.Nullable java.lang.Object obj, @javax.annotation.Nullable java.lang.Object obj2) throws java.lang.reflect.InvocationTargetException {
            com.squareup.moshi.JsonAdapter<?>[] jsonAdapterArr = this.getInputSizeshNQ4ISI;
            java.lang.Object[] objArr = new java.lang.Object[jsonAdapterArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            java.lang.System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
            try {
                return this.getHighSpeedVideoSizesFor.invoke(this.getOutputFormats, objArr);
            } catch (java.lang.IllegalAccessException unused) {
                throw new java.lang.AssertionError();
            }
        }
    }
}
