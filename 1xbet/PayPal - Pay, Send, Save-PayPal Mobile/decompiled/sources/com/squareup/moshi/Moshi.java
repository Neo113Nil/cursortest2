package com.squareup.moshi;

/* loaded from: classes3.dex */
public final class Moshi {
    static final java.util.List<com.squareup.moshi.JsonAdapter.Factory> Camera2StreamConfigurationMap;
    private final java.util.List<com.squareup.moshi.JsonAdapter.Factory> getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final java.lang.ThreadLocal<com.squareup.moshi.Moshi.LookupChain> getHighSpeedVideoFpsRangesFor = new java.lang.ThreadLocal<>();
    private final java.util.Map<java.lang.Object, com.squareup.moshi.JsonAdapter<?>> getHighSpeedVideoSizes = new java.util.LinkedHashMap();

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        Camera2StreamConfigurationMap = arrayList;
        arrayList.add(com.squareup.moshi.StandardJsonAdapters.Camera2StreamConfigurationMap);
        arrayList.add(com.squareup.moshi.CollectionJsonAdapter.getHighResolutionOutputSizeshNQ4ISI);
        arrayList.add(com.squareup.moshi.MapJsonAdapter.Camera2StreamConfigurationMap);
        arrayList.add(com.squareup.moshi.ArrayJsonAdapter.getHighSpeedVideoSizes);
        arrayList.add(com.squareup.moshi.RecordJsonAdapter.Camera2StreamConfigurationMap);
        arrayList.add(com.squareup.moshi.ClassJsonAdapter.getHighResolutionOutputSizeshNQ4ISI);
    }

    Moshi(com.squareup.moshi.Moshi.Builder builder) {
        int size = builder.getHighSpeedVideoFpsRanges.size();
        java.util.List<com.squareup.moshi.JsonAdapter.Factory> list = Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList = new java.util.ArrayList(size + list.size());
        arrayList.addAll(builder.getHighSpeedVideoFpsRanges);
        arrayList.addAll(list);
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(arrayList);
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoSizes;
    }

    @javax.annotation.CheckReturnValue
    public final <T> com.squareup.moshi.JsonAdapter<T> adapter(java.lang.reflect.Type type) {
        return adapter(type, com.squareup.moshi.internal.Util.NO_ANNOTATIONS);
    }

    @javax.annotation.CheckReturnValue
    public final <T> com.squareup.moshi.JsonAdapter<T> adapter(java.lang.Class<T> cls) {
        return adapter(cls, com.squareup.moshi.internal.Util.NO_ANNOTATIONS);
    }

    @javax.annotation.CheckReturnValue
    public final <T> com.squareup.moshi.JsonAdapter<T> adapter(java.lang.reflect.Type type, java.lang.Class<? extends java.lang.annotation.Annotation> cls) {
        if (cls == null) {
            throw new java.lang.NullPointerException("annotationType == null");
        }
        return adapter(type, java.util.Collections.singleton(com.squareup.moshi.Types.getHighSpeedVideoFpsRangesFor(cls)));
    }

    @javax.annotation.CheckReturnValue
    public final <T> com.squareup.moshi.JsonAdapter<T> adapter(java.lang.reflect.Type type, java.lang.Class<? extends java.lang.annotation.Annotation>... clsArr) {
        if (clsArr.length == 1) {
            return adapter(type, clsArr[0]);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(clsArr.length);
        for (java.lang.Class<? extends java.lang.annotation.Annotation> cls : clsArr) {
            linkedHashSet.add(com.squareup.moshi.Types.getHighSpeedVideoFpsRangesFor(cls));
        }
        return adapter(type, java.util.Collections.unmodifiableSet(linkedHashSet));
    }

    @javax.annotation.CheckReturnValue
    public final <T> com.squareup.moshi.JsonAdapter<T> adapter(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set) {
        return adapter(type, set, null);
    }

    @javax.annotation.CheckReturnValue
    public final <T> com.squareup.moshi.JsonAdapter<T> adapter(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set, @javax.annotation.Nullable java.lang.String str) {
        com.squareup.moshi.Moshi.Lookup<?> lookup;
        if (type == null) {
            throw new java.lang.NullPointerException("type == null");
        }
        if (set == null) {
            throw new java.lang.NullPointerException("annotations == null");
        }
        java.lang.reflect.Type removeSubtypeWildcard = com.squareup.moshi.internal.Util.removeSubtypeWildcard(com.squareup.moshi.internal.Util.canonicalize(type));
        java.lang.Object asList = set.isEmpty() ? removeSubtypeWildcard : java.util.Arrays.asList(removeSubtypeWildcard, set);
        synchronized (this.getHighSpeedVideoSizes) {
            com.squareup.moshi.JsonAdapter<T> jsonAdapter = (com.squareup.moshi.JsonAdapter) this.getHighSpeedVideoSizes.get(asList);
            if (jsonAdapter != null) {
                return jsonAdapter;
            }
            com.squareup.moshi.Moshi.LookupChain lookupChain = this.getHighSpeedVideoFpsRangesFor.get();
            if (lookupChain == null) {
                lookupChain = new com.squareup.moshi.Moshi.LookupChain();
                this.getHighSpeedVideoFpsRangesFor.set(lookupChain);
            }
            int size = lookupChain.getHighSpeedVideoFpsRangesFor.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    lookup = lookupChain.getHighSpeedVideoFpsRangesFor.get(i);
                    if (lookup.getHighResolutionOutputSizeshNQ4ISI.equals(asList)) {
                        lookupChain.Camera2StreamConfigurationMap.add(lookup);
                        if (lookup.getHighSpeedVideoSizes != null) {
                            lookup = (com.squareup.moshi.JsonAdapter<T>) lookup.getHighSpeedVideoSizes;
                        }
                    } else {
                        i++;
                    }
                } else {
                    com.squareup.moshi.Moshi.Lookup<?> lookup2 = new com.squareup.moshi.Moshi.Lookup<>(removeSubtypeWildcard, str, asList);
                    lookupChain.getHighSpeedVideoFpsRangesFor.add(lookup2);
                    lookupChain.Camera2StreamConfigurationMap.add(lookup2);
                    lookup = null;
                    break;
                }
            }
            if (lookup != null) {
                return lookup;
            }
            try {
                try {
                    int size2 = this.getHighResolutionOutputSizeshNQ4ISI.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        com.squareup.moshi.JsonAdapter<T> jsonAdapter2 = (com.squareup.moshi.JsonAdapter<T>) this.getHighResolutionOutputSizeshNQ4ISI.get(i2).create(removeSubtypeWildcard, set, this);
                        if (jsonAdapter2 != null) {
                            lookupChain.Camera2StreamConfigurationMap.getLast().getHighSpeedVideoSizes = jsonAdapter2;
                            lookupChain.getHighSpeedVideoFpsRanges(true);
                            return jsonAdapter2;
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("No JsonAdapter for ");
                    sb.append(com.squareup.moshi.internal.Util.typeAnnotatedWithAnnotations(removeSubtypeWildcard, set));
                    throw new java.lang.IllegalArgumentException(sb.toString());
                } catch (java.lang.IllegalArgumentException e) {
                    if (lookupChain.getHighResolutionOutputSizeshNQ4ISI) {
                        throw e;
                    }
                    lookupChain.getHighResolutionOutputSizeshNQ4ISI = true;
                    if (lookupChain.Camera2StreamConfigurationMap.size() == 1 && lookupChain.Camera2StreamConfigurationMap.getFirst().getHighSpeedVideoFpsRangesFor == null) {
                        throw e;
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(e.getMessage());
                    java.util.Iterator<com.squareup.moshi.Moshi.Lookup<?>> descendingIterator = lookupChain.Camera2StreamConfigurationMap.descendingIterator();
                    while (descendingIterator.hasNext()) {
                        com.squareup.moshi.Moshi.Lookup<?> next = descendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.getHighSpeedVideoFpsRanges);
                        if (next.getHighSpeedVideoFpsRangesFor != null) {
                            sb2.append(' ');
                            sb2.append(next.getHighSpeedVideoFpsRangesFor);
                        }
                    }
                    throw new java.lang.IllegalArgumentException(sb2.toString(), e);
                }
            } finally {
                lookupChain.getHighSpeedVideoFpsRanges(false);
            }
        }
    }

    @javax.annotation.CheckReturnValue
    public final <T> com.squareup.moshi.JsonAdapter<T> nextAdapter(com.squareup.moshi.JsonAdapter.Factory factory, java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set) {
        if (set == null) {
            throw new java.lang.NullPointerException("annotations == null");
        }
        java.lang.reflect.Type removeSubtypeWildcard = com.squareup.moshi.internal.Util.removeSubtypeWildcard(com.squareup.moshi.internal.Util.canonicalize(type));
        int indexOf = this.getHighResolutionOutputSizeshNQ4ISI.indexOf(factory);
        if (indexOf == -1) {
            throw new java.lang.IllegalArgumentException("Unable to skip past unknown factory ".concat(java.lang.String.valueOf(factory)));
        }
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = indexOf + 1; i < size; i++) {
            com.squareup.moshi.JsonAdapter<T> jsonAdapter = (com.squareup.moshi.JsonAdapter<T>) this.getHighResolutionOutputSizeshNQ4ISI.get(i).create(removeSubtypeWildcard, set, this);
            if (jsonAdapter != null) {
                return jsonAdapter;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No next JsonAdapter for ");
        sb.append(com.squareup.moshi.internal.Util.typeAnnotatedWithAnnotations(removeSubtypeWildcard, set));
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @javax.annotation.CheckReturnValue
    public final com.squareup.moshi.Moshi.Builder newBuilder() {
        com.squareup.moshi.Moshi.Builder builder = new com.squareup.moshi.Moshi.Builder();
        int i = this.getHighSpeedVideoFpsRanges;
        for (int i2 = 0; i2 < i; i2++) {
            builder.add(this.getHighResolutionOutputSizeshNQ4ISI.get(i2));
        }
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        int size2 = Camera2StreamConfigurationMap.size();
        for (int i3 = this.getHighSpeedVideoFpsRanges; i3 < size - size2; i3++) {
            builder.addLast(this.getHighResolutionOutputSizeshNQ4ISI.get(i3));
        }
        return builder;
    }

    public static final class Builder {
        final java.util.List<com.squareup.moshi.JsonAdapter.Factory> getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        int getHighSpeedVideoSizes = 0;

        public final <T> com.squareup.moshi.Moshi.Builder add(java.lang.reflect.Type type, com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
            return add(com.squareup.moshi.Moshi.Camera2StreamConfigurationMap(type, jsonAdapter));
        }

        public final <T> com.squareup.moshi.Moshi.Builder add(java.lang.reflect.Type type, java.lang.Class<? extends java.lang.annotation.Annotation> cls, com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
            return add(com.squareup.moshi.Moshi.getHighSpeedVideoSizes(type, cls, jsonAdapter));
        }

        public final com.squareup.moshi.Moshi.Builder add(com.squareup.moshi.JsonAdapter.Factory factory) {
            if (factory == null) {
                throw new java.lang.IllegalArgumentException("factory == null");
            }
            java.util.List<com.squareup.moshi.JsonAdapter.Factory> list = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i + 1;
            list.add(i, factory);
            return this;
        }

        public final com.squareup.moshi.Moshi.Builder add(java.lang.Object obj) {
            if (obj == null) {
                throw new java.lang.IllegalArgumentException("adapter == null");
            }
            return add((com.squareup.moshi.JsonAdapter.Factory) com.squareup.moshi.AdapterMethodsFactory.getHighSpeedVideoFpsRanges(obj));
        }

        public final <T> com.squareup.moshi.Moshi.Builder addLast(java.lang.reflect.Type type, com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
            return addLast(com.squareup.moshi.Moshi.Camera2StreamConfigurationMap(type, jsonAdapter));
        }

        public final <T> com.squareup.moshi.Moshi.Builder addLast(java.lang.reflect.Type type, java.lang.Class<? extends java.lang.annotation.Annotation> cls, com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
            return addLast(com.squareup.moshi.Moshi.getHighSpeedVideoSizes(type, cls, jsonAdapter));
        }

        public final com.squareup.moshi.Moshi.Builder addLast(com.squareup.moshi.JsonAdapter.Factory factory) {
            if (factory == null) {
                throw new java.lang.IllegalArgumentException("factory == null");
            }
            this.getHighSpeedVideoFpsRanges.add(factory);
            return this;
        }

        public final com.squareup.moshi.Moshi.Builder addLast(java.lang.Object obj) {
            if (obj == null) {
                throw new java.lang.IllegalArgumentException("adapter == null");
            }
            return addLast((com.squareup.moshi.JsonAdapter.Factory) com.squareup.moshi.AdapterMethodsFactory.getHighSpeedVideoFpsRanges(obj));
        }

        @javax.annotation.CheckReturnValue
        public final com.squareup.moshi.Moshi build() {
            return new com.squareup.moshi.Moshi(this);
        }
    }

    static <T> com.squareup.moshi.JsonAdapter.Factory Camera2StreamConfigurationMap(final java.lang.reflect.Type type, final com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
        if (type == null) {
            throw new java.lang.IllegalArgumentException("type == null");
        }
        if (jsonAdapter == null) {
            throw new java.lang.IllegalArgumentException("jsonAdapter == null");
        }
        return new com.squareup.moshi.JsonAdapter.Factory() { // from class: com.squareup.moshi.Moshi.1
            @Override // com.squareup.moshi.JsonAdapter.Factory
            @javax.annotation.Nullable
            public com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type type2, java.util.Set<? extends java.lang.annotation.Annotation> set, com.squareup.moshi.Moshi moshi) {
                if (set.isEmpty() && com.squareup.moshi.internal.Util.typesMatch(type, type2)) {
                    return jsonAdapter;
                }
                return null;
            }
        };
    }

    static <T> com.squareup.moshi.JsonAdapter.Factory getHighSpeedVideoSizes(final java.lang.reflect.Type type, final java.lang.Class<? extends java.lang.annotation.Annotation> cls, final com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
        if (type == null) {
            throw new java.lang.IllegalArgumentException("type == null");
        }
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("annotation == null");
        }
        if (jsonAdapter == null) {
            throw new java.lang.IllegalArgumentException("jsonAdapter == null");
        }
        if (!cls.isAnnotationPresent(com.squareup.moshi.JsonQualifier.class)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls);
            sb.append(" does not have @JsonQualifier");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (cls.getDeclaredMethods().length > 0) {
            throw new java.lang.IllegalArgumentException("Use JsonAdapter.Factory for annotations with elements");
        }
        return new com.squareup.moshi.JsonAdapter.Factory() { // from class: com.squareup.moshi.Moshi.2
            @Override // com.squareup.moshi.JsonAdapter.Factory
            @javax.annotation.Nullable
            public com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type type2, java.util.Set<? extends java.lang.annotation.Annotation> set, com.squareup.moshi.Moshi moshi) {
                if (com.squareup.moshi.internal.Util.typesMatch(type, type2) && set.size() == 1 && com.squareup.moshi.internal.Util.isAnnotationPresent(set, cls)) {
                    return jsonAdapter;
                }
                return null;
            }
        };
    }

    final class LookupChain {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final java.util.List<com.squareup.moshi.Moshi.Lookup<?>> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        final java.util.Deque<com.squareup.moshi.Moshi.Lookup<?>> Camera2StreamConfigurationMap = new java.util.ArrayDeque();

        LookupChain() {
        }

        final void getHighSpeedVideoFpsRanges(boolean z) {
            this.Camera2StreamConfigurationMap.removeLast();
            if (this.Camera2StreamConfigurationMap.isEmpty()) {
                com.squareup.moshi.Moshi.this.getHighSpeedVideoFpsRangesFor.remove();
                if (z) {
                    synchronized (com.squareup.moshi.Moshi.this.getHighSpeedVideoSizes) {
                        int size = this.getHighSpeedVideoFpsRangesFor.size();
                        for (int i = 0; i < size; i++) {
                            com.squareup.moshi.Moshi.Lookup<?> lookup = this.getHighSpeedVideoFpsRangesFor.get(i);
                            com.squareup.moshi.JsonAdapter<T> jsonAdapter = (com.squareup.moshi.JsonAdapter) com.squareup.moshi.Moshi.this.getHighSpeedVideoSizes.put(lookup.getHighResolutionOutputSizeshNQ4ISI, lookup.getHighSpeedVideoSizes);
                            if (jsonAdapter != 0) {
                                lookup.getHighSpeedVideoSizes = jsonAdapter;
                                com.squareup.moshi.Moshi.this.getHighSpeedVideoSizes.put(lookup.getHighResolutionOutputSizeshNQ4ISI, jsonAdapter);
                            }
                        }
                    }
                }
            }
        }
    }

    static final class Lookup<T> extends com.squareup.moshi.JsonAdapter<T> {
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.reflect.Type getHighSpeedVideoFpsRanges;

        @javax.annotation.Nullable
        final java.lang.String getHighSpeedVideoFpsRangesFor;

        @javax.annotation.Nullable
        com.squareup.moshi.JsonAdapter<T> getHighSpeedVideoSizes;

        Lookup(java.lang.reflect.Type type, @javax.annotation.Nullable java.lang.String str, java.lang.Object obj) {
            this.getHighSpeedVideoFpsRanges = type;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            com.squareup.moshi.JsonAdapter<T> jsonAdapter = this.getHighSpeedVideoSizes;
            if (jsonAdapter == null) {
                throw new java.lang.IllegalStateException("JsonAdapter isn't ready");
            }
            return jsonAdapter.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(com.squareup.moshi.JsonWriter jsonWriter, T t) throws java.io.IOException {
            com.squareup.moshi.JsonAdapter<T> jsonAdapter = this.getHighSpeedVideoSizes;
            if (jsonAdapter == null) {
                throw new java.lang.IllegalStateException("JsonAdapter isn't ready");
            }
            jsonAdapter.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) t);
        }

        public final java.lang.String toString() {
            com.squareup.moshi.JsonAdapter<T> jsonAdapter = this.getHighSpeedVideoSizes;
            return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
        }
    }
}
