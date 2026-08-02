package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private java.lang.String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private com.nimbusds.jose.shaded.gson.internal.Excluder excluder;
    private final java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> factories;
    private com.nimbusds.jose.shaded.gson.FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> hierarchyFactories;
    private final java.util.Map<java.lang.reflect.Type, com.nimbusds.jose.shaded.gson.InstanceCreator<?>> instanceCreators;
    private boolean lenient;
    private com.nimbusds.jose.shaded.gson.LongSerializationPolicy longSerializationPolicy;
    private com.nimbusds.jose.shaded.gson.ToNumberStrategy numberToNumberStrategy;
    private com.nimbusds.jose.shaded.gson.ToNumberStrategy objectToNumberStrategy;
    private boolean prettyPrinting;
    private final java.util.LinkedList<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;
    private boolean useJdkUnsafe;

    public GsonBuilder() {
        this.excluder = com.nimbusds.jose.shaded.gson.internal.Excluder.DEFAULT;
        this.longSerializationPolicy = com.nimbusds.jose.shaded.gson.LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = com.nimbusds.jose.shaded.gson.FieldNamingPolicy.IDENTITY;
        this.instanceCreators = new java.util.HashMap();
        this.factories = new java.util.ArrayList();
        this.hierarchyFactories = new java.util.ArrayList();
        this.serializeNulls = false;
        this.datePattern = com.nimbusds.jose.shaded.gson.Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = com.nimbusds.jose.shaded.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = com.nimbusds.jose.shaded.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new java.util.LinkedList<>();
    }

    GsonBuilder(com.nimbusds.jose.shaded.gson.Gson gson) {
        this.excluder = com.nimbusds.jose.shaded.gson.internal.Excluder.DEFAULT;
        this.longSerializationPolicy = com.nimbusds.jose.shaded.gson.LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = com.nimbusds.jose.shaded.gson.FieldNamingPolicy.IDENTITY;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.instanceCreators = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.factories = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.datePattern = com.nimbusds.jose.shaded.gson.Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = com.nimbusds.jose.shaded.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = com.nimbusds.jose.shaded.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        java.util.LinkedList<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> linkedList = new java.util.LinkedList<>();
        this.reflectionFilters = linkedList;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        hashMap.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        arrayList.addAll(gson.builderFactories);
        arrayList2.addAll(gson.builderHierarchyFactories);
        this.useJdkUnsafe = gson.useJdkUnsafe;
        this.objectToNumberStrategy = gson.objectToNumberStrategy;
        this.numberToNumberStrategy = gson.numberToNumberStrategy;
        linkedList.addAll(gson.reflectionFilters);
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setVersion(double d) {
        if (java.lang.Double.isNaN(d) || d < 0.0d) {
            throw new java.lang.IllegalArgumentException("Invalid version: ".concat(java.lang.String.valueOf(d)));
        }
        this.excluder = this.excluder.withVersion(d);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        java.util.Objects.requireNonNull(iArr);
        this.excluder = this.excluder.withModifiers(iArr);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.disableInnerClassSerialization();
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setLongSerializationPolicy(com.nimbusds.jose.shaded.gson.LongSerializationPolicy longSerializationPolicy) {
        this.longSerializationPolicy = (com.nimbusds.jose.shaded.gson.LongSerializationPolicy) java.util.Objects.requireNonNull(longSerializationPolicy);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setFieldNamingPolicy(com.nimbusds.jose.shaded.gson.FieldNamingPolicy fieldNamingPolicy) {
        return setFieldNamingStrategy(fieldNamingPolicy);
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setFieldNamingStrategy(com.nimbusds.jose.shaded.gson.FieldNamingStrategy fieldNamingStrategy) {
        this.fieldNamingPolicy = (com.nimbusds.jose.shaded.gson.FieldNamingStrategy) java.util.Objects.requireNonNull(fieldNamingStrategy);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setObjectToNumberStrategy(com.nimbusds.jose.shaded.gson.ToNumberStrategy toNumberStrategy) {
        this.objectToNumberStrategy = (com.nimbusds.jose.shaded.gson.ToNumberStrategy) java.util.Objects.requireNonNull(toNumberStrategy);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setNumberToNumberStrategy(com.nimbusds.jose.shaded.gson.ToNumberStrategy toNumberStrategy) {
        this.numberToNumberStrategy = (com.nimbusds.jose.shaded.gson.ToNumberStrategy) java.util.Objects.requireNonNull(toNumberStrategy);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setExclusionStrategies(com.nimbusds.jose.shaded.gson.ExclusionStrategy... exclusionStrategyArr) {
        java.util.Objects.requireNonNull(exclusionStrategyArr);
        for (com.nimbusds.jose.shaded.gson.ExclusionStrategy exclusionStrategy : exclusionStrategyArr) {
            this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, true);
        }
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder addSerializationExclusionStrategy(com.nimbusds.jose.shaded.gson.ExclusionStrategy exclusionStrategy) {
        java.util.Objects.requireNonNull(exclusionStrategy);
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, false);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder addDeserializationExclusionStrategy(com.nimbusds.jose.shaded.gson.ExclusionStrategy exclusionStrategy) {
        java.util.Objects.requireNonNull(exclusionStrategy);
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, false, true);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setDateFormat(java.lang.String str) {
        this.datePattern = str;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setDateFormat(int i) {
        this.dateStyle = i;
        this.datePattern = null;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder setDateFormat(int i, int i2) {
        this.dateStyle = i;
        this.timeStyle = i2;
        this.datePattern = null;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder registerTypeAdapter(java.lang.reflect.Type type, java.lang.Object obj) {
        java.util.Objects.requireNonNull(type);
        boolean z = obj instanceof com.nimbusds.jose.shaded.gson.JsonSerializer;
        com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument(z || (obj instanceof com.nimbusds.jose.shaded.gson.JsonDeserializer) || (obj instanceof com.nimbusds.jose.shaded.gson.InstanceCreator) || (obj instanceof com.nimbusds.jose.shaded.gson.TypeAdapter));
        if (obj instanceof com.nimbusds.jose.shaded.gson.InstanceCreator) {
            this.instanceCreators.put(type, (com.nimbusds.jose.shaded.gson.InstanceCreator) obj);
        }
        if (z || (obj instanceof com.nimbusds.jose.shaded.gson.JsonDeserializer)) {
            this.factories.add(com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter.newFactoryWithMatchRawType(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(type), obj));
        }
        if (obj instanceof com.nimbusds.jose.shaded.gson.TypeAdapter) {
            this.factories.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(type), (com.nimbusds.jose.shaded.gson.TypeAdapter) obj));
        }
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder registerTypeAdapterFactory(com.nimbusds.jose.shaded.gson.TypeAdapterFactory typeAdapterFactory) {
        java.util.Objects.requireNonNull(typeAdapterFactory);
        this.factories.add(typeAdapterFactory);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder registerTypeHierarchyAdapter(java.lang.Class<?> cls, java.lang.Object obj) {
        java.util.Objects.requireNonNull(cls);
        boolean z = obj instanceof com.nimbusds.jose.shaded.gson.JsonSerializer;
        com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument(z || (obj instanceof com.nimbusds.jose.shaded.gson.JsonDeserializer) || (obj instanceof com.nimbusds.jose.shaded.gson.TypeAdapter));
        if ((obj instanceof com.nimbusds.jose.shaded.gson.JsonDeserializer) || z) {
            this.hierarchyFactories.add(com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
        }
        if (obj instanceof com.nimbusds.jose.shaded.gson.TypeAdapter) {
            this.factories.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(cls, (com.nimbusds.jose.shaded.gson.TypeAdapter) obj));
        }
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder disableJdkUnsafe() {
        this.useJdkUnsafe = false;
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder addReflectionAccessFilter(com.nimbusds.jose.shaded.gson.ReflectionAccessFilter reflectionAccessFilter) {
        java.util.Objects.requireNonNull(reflectionAccessFilter);
        this.reflectionFilters.addFirst(reflectionAccessFilter);
        return this;
    }

    public final com.nimbusds.jose.shaded.gson.Gson create() {
        java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> arrayList = new java.util.ArrayList<>(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList.addAll(this.factories);
        java.util.Collections.reverse(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.hierarchyFactories);
        java.util.Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        return new com.nimbusds.jose.shaded.gson.Gson(this.excluder, this.fieldNamingPolicy, new java.util.HashMap(this.instanceCreators), this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, new java.util.ArrayList(this.factories), new java.util.ArrayList(this.hierarchyFactories), arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy, new java.util.ArrayList(this.reflectionFilters));
    }

    private void addTypeAdaptersForDate(java.lang.String str, int i, int i2, java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> list) {
        com.nimbusds.jose.shaded.gson.TypeAdapterFactory typeAdapterFactory;
        com.nimbusds.jose.shaded.gson.TypeAdapterFactory typeAdapterFactory2;
        com.nimbusds.jose.shaded.gson.TypeAdapterFactory typeAdapterFactory3;
        boolean z = com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES;
        if (str != null && !str.trim().isEmpty()) {
            typeAdapterFactory = com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z) {
                typeAdapterFactory2 = com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                typeAdapterFactory3 = com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            }
            typeAdapterFactory2 = null;
            typeAdapterFactory3 = null;
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            com.nimbusds.jose.shaded.gson.TypeAdapterFactory createAdapterFactory = com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i, i2);
            if (z) {
                com.nimbusds.jose.shaded.gson.TypeAdapterFactory createAdapterFactory2 = com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i, i2);
                com.nimbusds.jose.shaded.gson.TypeAdapterFactory createAdapterFactory3 = com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i, i2);
                typeAdapterFactory2 = createAdapterFactory2;
                typeAdapterFactory = createAdapterFactory;
                typeAdapterFactory3 = createAdapterFactory3;
            } else {
                typeAdapterFactory = createAdapterFactory;
                typeAdapterFactory2 = null;
                typeAdapterFactory3 = null;
            }
        }
        list.add(typeAdapterFactory);
        if (z) {
            list.add(typeAdapterFactory2);
            list.add(typeAdapterFactory3);
        }
    }
}
