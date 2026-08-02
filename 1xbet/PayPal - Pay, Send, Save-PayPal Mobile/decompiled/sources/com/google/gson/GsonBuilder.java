package com.google.gson;

/* loaded from: classes4.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private java.lang.String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private com.google.gson.internal.Excluder excluder;
    private final java.util.List<com.google.gson.TypeAdapterFactory> factories;
    private com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private com.google.gson.FormattingStyle formattingStyle;
    private boolean generateNonExecutableJson;
    private final java.util.List<com.google.gson.TypeAdapterFactory> hierarchyFactories;
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private com.google.gson.LongSerializationPolicy longSerializationPolicy;
    private com.google.gson.ToNumberStrategy numberToNumberStrategy;
    private com.google.gson.ToNumberStrategy objectToNumberStrategy;
    private final java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private com.google.gson.Strictness strictness;
    private int timeStyle;
    private boolean useJdkUnsafe;

    public GsonBuilder() {
        this.excluder = com.google.gson.internal.Excluder.DEFAULT;
        this.longSerializationPolicy = com.google.gson.LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = com.google.gson.FieldNamingPolicy.IDENTITY;
        this.instanceCreators = new java.util.HashMap();
        this.factories = new java.util.ArrayList();
        this.hierarchyFactories = new java.util.ArrayList();
        this.serializeNulls = false;
        this.datePattern = com.google.gson.Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.formattingStyle = com.google.gson.Gson.DEFAULT_FORMATTING_STYLE;
        this.generateNonExecutableJson = false;
        this.strictness = com.google.gson.Gson.DEFAULT_STRICTNESS;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = com.google.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = com.google.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new java.util.ArrayDeque<>();
    }

    GsonBuilder(com.google.gson.Gson gson) {
        this.excluder = com.google.gson.internal.Excluder.DEFAULT;
        this.longSerializationPolicy = com.google.gson.LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = com.google.gson.FieldNamingPolicy.IDENTITY;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.instanceCreators = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.factories = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.datePattern = com.google.gson.Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.formattingStyle = com.google.gson.Gson.DEFAULT_FORMATTING_STYLE;
        this.generateNonExecutableJson = false;
        this.strictness = com.google.gson.Gson.DEFAULT_STRICTNESS;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = com.google.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = com.google.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> arrayDeque = new java.util.ArrayDeque<>();
        this.reflectionFilters = arrayDeque;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        hashMap.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.formattingStyle = gson.formattingStyle;
        this.strictness = gson.strictness;
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
        arrayDeque.addAll(gson.reflectionFilters);
    }

    public final com.google.gson.GsonBuilder setVersion(double d) {
        if (java.lang.Double.isNaN(d) || d < 0.0d) {
            throw new java.lang.IllegalArgumentException("Invalid version: ".concat(java.lang.String.valueOf(d)));
        }
        this.excluder = this.excluder.withVersion(d);
        return this;
    }

    public final com.google.gson.GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        java.util.Objects.requireNonNull(iArr);
        this.excluder = this.excluder.withModifiers(iArr);
        return this;
    }

    public final com.google.gson.GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public final com.google.gson.GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public final com.google.gson.GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public final com.google.gson.GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public final com.google.gson.GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.disableInnerClassSerialization();
        return this;
    }

    public final com.google.gson.GsonBuilder setLongSerializationPolicy(com.google.gson.LongSerializationPolicy longSerializationPolicy) {
        this.longSerializationPolicy = (com.google.gson.LongSerializationPolicy) java.util.Objects.requireNonNull(longSerializationPolicy);
        return this;
    }

    public final com.google.gson.GsonBuilder setFieldNamingPolicy(com.google.gson.FieldNamingPolicy fieldNamingPolicy) {
        return setFieldNamingStrategy(fieldNamingPolicy);
    }

    public final com.google.gson.GsonBuilder setFieldNamingStrategy(com.google.gson.FieldNamingStrategy fieldNamingStrategy) {
        this.fieldNamingPolicy = (com.google.gson.FieldNamingStrategy) java.util.Objects.requireNonNull(fieldNamingStrategy);
        return this;
    }

    public final com.google.gson.GsonBuilder setObjectToNumberStrategy(com.google.gson.ToNumberStrategy toNumberStrategy) {
        this.objectToNumberStrategy = (com.google.gson.ToNumberStrategy) java.util.Objects.requireNonNull(toNumberStrategy);
        return this;
    }

    public final com.google.gson.GsonBuilder setNumberToNumberStrategy(com.google.gson.ToNumberStrategy toNumberStrategy) {
        this.numberToNumberStrategy = (com.google.gson.ToNumberStrategy) java.util.Objects.requireNonNull(toNumberStrategy);
        return this;
    }

    public final com.google.gson.GsonBuilder setExclusionStrategies(com.google.gson.ExclusionStrategy... exclusionStrategyArr) {
        java.util.Objects.requireNonNull(exclusionStrategyArr);
        for (com.google.gson.ExclusionStrategy exclusionStrategy : exclusionStrategyArr) {
            this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, true);
        }
        return this;
    }

    public final com.google.gson.GsonBuilder addSerializationExclusionStrategy(com.google.gson.ExclusionStrategy exclusionStrategy) {
        java.util.Objects.requireNonNull(exclusionStrategy);
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, false);
        return this;
    }

    public final com.google.gson.GsonBuilder addDeserializationExclusionStrategy(com.google.gson.ExclusionStrategy exclusionStrategy) {
        java.util.Objects.requireNonNull(exclusionStrategy);
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, false, true);
        return this;
    }

    public final com.google.gson.GsonBuilder setPrettyPrinting() {
        return setFormattingStyle(com.google.gson.FormattingStyle.PRETTY);
    }

    public final com.google.gson.GsonBuilder setFormattingStyle(com.google.gson.FormattingStyle formattingStyle) {
        this.formattingStyle = (com.google.gson.FormattingStyle) java.util.Objects.requireNonNull(formattingStyle);
        return this;
    }

    @java.lang.Deprecated
    public final com.google.gson.GsonBuilder setLenient() {
        return setStrictness(com.google.gson.Strictness.LENIENT);
    }

    public final com.google.gson.GsonBuilder setStrictness(com.google.gson.Strictness strictness) {
        this.strictness = (com.google.gson.Strictness) java.util.Objects.requireNonNull(strictness);
        return this;
    }

    public final com.google.gson.GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public final com.google.gson.GsonBuilder setDateFormat(java.lang.String str) {
        if (str != null) {
            try {
                new java.text.SimpleDateFormat(str);
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The date pattern '");
                sb.append(str);
                sb.append("' is not valid");
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        }
        this.datePattern = str;
        return this;
    }

    @java.lang.Deprecated
    public final com.google.gson.GsonBuilder setDateFormat(int i) {
        this.dateStyle = checkDateFormatStyle(i);
        this.datePattern = null;
        return this;
    }

    public final com.google.gson.GsonBuilder setDateFormat(int i, int i2) {
        this.dateStyle = checkDateFormatStyle(i);
        this.timeStyle = checkDateFormatStyle(i2);
        this.datePattern = null;
        return this;
    }

    private static int checkDateFormatStyle(int i) {
        if (i < 0 || i > 3) {
            throw new java.lang.IllegalArgumentException("Invalid style: ".concat(java.lang.String.valueOf(i)));
        }
        return i;
    }

    public final com.google.gson.GsonBuilder registerTypeAdapter(java.lang.reflect.Type type, java.lang.Object obj) {
        java.util.Objects.requireNonNull(type);
        java.util.Objects.requireNonNull(obj);
        boolean z = obj instanceof com.google.gson.JsonSerializer;
        if (!z && !(obj instanceof com.google.gson.JsonDeserializer) && !(obj instanceof com.google.gson.InstanceCreator) && !(obj instanceof com.google.gson.TypeAdapter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
            sb.append(obj.getClass().getName());
            sb.append(" does not implement any supported type adapter class or interface");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (hasNonOverridableAdapter(type)) {
            throw new java.lang.IllegalArgumentException("Cannot override built-in adapter for ".concat(java.lang.String.valueOf(type)));
        }
        if (obj instanceof com.google.gson.InstanceCreator) {
            this.instanceCreators.put(type, (com.google.gson.InstanceCreator) obj);
        }
        if (z || (obj instanceof com.google.gson.JsonDeserializer)) {
            this.factories.add(com.google.gson.internal.bind.TreeTypeAdapter.newFactoryWithMatchRawType(com.google.gson.reflect.TypeToken.get(type), obj));
        }
        if (obj instanceof com.google.gson.TypeAdapter) {
            this.factories.add(com.google.gson.internal.bind.TypeAdapters.newFactory(com.google.gson.reflect.TypeToken.get(type), (com.google.gson.TypeAdapter) obj));
        }
        return this;
    }

    private static boolean hasNonOverridableAdapter(java.lang.reflect.Type type) {
        return type == java.lang.Object.class;
    }

    public final com.google.gson.GsonBuilder registerTypeAdapterFactory(com.google.gson.TypeAdapterFactory typeAdapterFactory) {
        java.util.Objects.requireNonNull(typeAdapterFactory);
        this.factories.add(typeAdapterFactory);
        return this;
    }

    public final com.google.gson.GsonBuilder registerTypeHierarchyAdapter(java.lang.Class<?> cls, java.lang.Object obj) {
        java.util.Objects.requireNonNull(cls);
        java.util.Objects.requireNonNull(obj);
        boolean z = obj instanceof com.google.gson.JsonSerializer;
        if (!z && !(obj instanceof com.google.gson.JsonDeserializer) && !(obj instanceof com.google.gson.TypeAdapter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
            sb.append(obj.getClass().getName());
            sb.append(" does not implement any supported type adapter class or interface");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if ((obj instanceof com.google.gson.JsonDeserializer) || z) {
            this.hierarchyFactories.add(com.google.gson.internal.bind.TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
        }
        if (obj instanceof com.google.gson.TypeAdapter) {
            this.factories.add(com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(cls, (com.google.gson.TypeAdapter) obj));
        }
        return this;
    }

    public final com.google.gson.GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public final com.google.gson.GsonBuilder disableJdkUnsafe() {
        this.useJdkUnsafe = false;
        return this;
    }

    public final com.google.gson.GsonBuilder addReflectionAccessFilter(com.google.gson.ReflectionAccessFilter reflectionAccessFilter) {
        java.util.Objects.requireNonNull(reflectionAccessFilter);
        this.reflectionFilters.addFirst(reflectionAccessFilter);
        return this;
    }

    public final com.google.gson.Gson create() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList.addAll(this.factories);
        java.util.Collections.reverse(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.hierarchyFactories);
        java.util.Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        return new com.google.gson.Gson(this.excluder, this.fieldNamingPolicy, new java.util.HashMap(this.instanceCreators), this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.formattingStyle, this.strictness, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, new java.util.ArrayList(this.factories), new java.util.ArrayList(this.hierarchyFactories), arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy, new java.util.ArrayList(this.reflectionFilters));
    }

    private static void addTypeAdaptersForDate(java.lang.String str, int i, int i2, java.util.List<com.google.gson.TypeAdapterFactory> list) {
        com.google.gson.TypeAdapterFactory typeAdapterFactory;
        com.google.gson.TypeAdapterFactory typeAdapterFactory2;
        com.google.gson.TypeAdapterFactory typeAdapterFactory3;
        boolean z = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES;
        if (str != null && !str.trim().isEmpty()) {
            typeAdapterFactory = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z) {
                typeAdapterFactory2 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                typeAdapterFactory3 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            }
            typeAdapterFactory2 = null;
            typeAdapterFactory3 = null;
        } else {
            if (i == 2 && i2 == 2) {
                return;
            }
            com.google.gson.TypeAdapterFactory createAdapterFactory = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i, i2);
            if (z) {
                com.google.gson.TypeAdapterFactory createAdapterFactory2 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i, i2);
                com.google.gson.TypeAdapterFactory createAdapterFactory3 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i, i2);
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
