package com.paypal.oslo.core.remoteconfig.cdn;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0081\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0015J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u0015R \u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u0015R \u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010\u0019R,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\u001bR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010<\u0012\u0004\b>\u00101\u001a\u0004\b=\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/cdn/DynamicConfigSpec;", "", "", "name", "type", "entity", "", "enabled", "", "Lkotlinx/serialization/json/JsonElement;", "defaultValue", "", "rules", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()Ljava/util/Map;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/util/List;)Lcom/paypal/oslo/core/remoteconfig/cdn/DynamicConfigSpec;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$remote_config_release", "(Lcom/paypal/oslo/core/remoteconfig/cdn/DynamicConfigSpec;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getType", "getType$annotations", "getEntity", "getEntity$annotations", "Z", "getEnabled", "getEnabled$annotations", "Ljava/util/Map;", "getDefaultValue", "getDefaultValue$annotations", "Ljava/util/List;", "getRules", "getRules$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DynamicConfigSpec {
    private final java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> defaultValue;
    private final boolean enabled;
    private final java.lang.String entity;
    private final java.lang.String name;
    private final java.util.List<kotlinx.serialization.json.JsonElement> rules;
    private final java.lang.String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec.Companion INSTANCE = new com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec.$r8$lambda$WChFljQavrFHiEk9X46PyCa7KyI();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec.$r8$lambda$K0qPorB4QuPGjA2QFEIBCMc38Jk();
        }
    })};

    @kotlinx.serialization.SerialName("defaultValue")
    public static /* synthetic */ void getDefaultValue$annotations() {
    }

    @kotlinx.serialization.SerialName("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @kotlinx.serialization.SerialName("entity")
    public static /* synthetic */ void getEntity$annotations() {
    }

    @kotlinx.serialization.SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @kotlinx.serialization.SerialName("rules")
    public static /* synthetic */ void getRules$annotations() {
    }

    @kotlinx.serialization.SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/cdn/DynamicConfigSpec$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/remoteconfig/cdn/DynamicConfigSpec;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> serializer() {
            return com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DynamicConfigSpec(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.Map map, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.type = "dynamic_config";
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.entity = "";
        } else {
            this.entity = str3;
        }
        if ((i & 8) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z;
        }
        if ((i & 16) == 0) {
            this.defaultValue = kotlin.collections.MapsKt.emptyMap();
        } else {
            this.defaultValue = map;
        }
        if ((i & 32) == 0) {
            this.rules = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.rules = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicConfigSpec(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.Map<java.lang.String, ? extends kotlinx.serialization.json.JsonElement> map, java.util.List<? extends kotlinx.serialization.json.JsonElement> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.type = str2;
        this.entity = str3;
        this.enabled = z;
        this.defaultValue = map;
        this.rules = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$remote_config_release(com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.type, "dynamic_config")) {
            output.encodeStringElement(serialDesc, 1, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self.entity, "")) {
            output.encodeStringElement(serialDesc, 2, self.entity);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.enabled) {
            output.encodeBooleanElement(serialDesc, 3, self.enabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !kotlin.jvm.internal.Intrinsics.areEqual(self.defaultValue, kotlin.collections.MapsKt.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.defaultValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !kotlin.jvm.internal.Intrinsics.areEqual(self.rules, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.rules);
        }
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public /* synthetic */ DynamicConfigSpec(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.Map map, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "dynamic_config" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getEntity() {
        return this.entity;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> getDefaultValue() {
        return this.defaultValue;
    }

    public final java.util.List<kotlinx.serialization.json.JsonElement> getRules() {
        return this.rules;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$K0qPorB4QuPGjA2QFEIBCMc38Jk() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.json.JsonElementSerializer.INSTANCE);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$WChFljQavrFHiEk9X46PyCa7KyI() {
        return new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.json.JsonElementSerializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.type;
        java.lang.String str3 = this.entity;
        boolean z = this.enabled;
        java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> map = this.defaultValue;
        java.util.List<kotlinx.serialization.json.JsonElement> list = this.rules;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DynamicConfigSpec(name=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", entity=");
        sb.append(str3);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", defaultValue=");
        sb.append(map);
        sb.append(", rules=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.entity.hashCode()) * 31) + java.lang.Boolean.hashCode(this.enabled)) * 31) + this.defaultValue.hashCode()) * 31) + this.rules.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec)) {
            return false;
        }
        com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec dynamicConfigSpec = (com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, dynamicConfigSpec.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, dynamicConfigSpec.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, dynamicConfigSpec.entity) && this.enabled == dynamicConfigSpec.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultValue, dynamicConfigSpec.defaultValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.rules, dynamicConfigSpec.rules);
    }

    public final com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec copy(java.lang.String name2, java.lang.String type, java.lang.String entity, boolean enabled, java.util.Map<java.lang.String, ? extends kotlinx.serialization.json.JsonElement> defaultValue, java.util.List<? extends kotlinx.serialization.json.JsonElement> rules) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "");
        return new com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec(name2, type, entity, enabled, defaultValue, rules);
    }

    public final java.util.List<kotlinx.serialization.json.JsonElement> component6() {
        return this.rules;
    }

    public final java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> component5() {
        return this.defaultValue;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEntity() {
        return this.entity;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec copy$default(com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec dynamicConfigSpec, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dynamicConfigSpec.name;
        }
        if ((i & 2) != 0) {
            str2 = dynamicConfigSpec.type;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = dynamicConfigSpec.entity;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            z = dynamicConfigSpec.enabled;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            map = dynamicConfigSpec.defaultValue;
        }
        java.util.Map map2 = map;
        if ((i & 32) != 0) {
            list = dynamicConfigSpec.rules;
        }
        return dynamicConfigSpec.copy(str, str4, str5, z2, map2, list);
    }
}
