package common.emv.configuration;

/* loaded from: classes17.dex */
public final class ConfigurationTemplate {

    /* renamed from: a, reason: collision with root package name */
    public final common.emv.configuration.DataObjectList f6690a;
    public final java.util.Map<java.lang.String, common.emv.configuration.ApplicationConfigurationBuilder> b;

    public final common.emv.configuration.ApplicationConfiguration createConfiguration(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, common.emv.configuration.ApplicationConfigurationBuilder> map;
        if (str == null || str.length() < 10) {
            throw new java.lang.IllegalArgumentException("aid must be not null and more than 10 characters. ");
        }
        java.util.Map<java.lang.String, common.emv.configuration.ApplicationConfigurationBuilder> map2 = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        if (map2.get(sb.toString()) == null) {
            map = this.b;
        } else {
            map = this.b;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(str2);
            str = sb2.toString();
        }
        common.emv.configuration.ApplicationConfigurationBuilder applicationConfigurationBuilder = map.get(str);
        if (applicationConfigurationBuilder == null) {
            return null;
        }
        final java.util.HashMap hashMap = new java.util.HashMap();
        applicationConfigurationBuilder.c.forEach(new java.util.function.BiConsumer() { // from class: common.emv.configuration.ConfigurationTemplate$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                common.emv.configuration.ConfigurationTemplate.this.a(hashMap, (java.lang.String) obj, (common.emv.configuration.DataObjectList) obj2);
            }
        });
        final java.util.HashMap hashMap2 = new java.util.HashMap();
        applicationConfigurationBuilder.f.forEach(new java.util.function.BiConsumer() { // from class: common.emv.configuration.ConfigurationTemplate$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                hashMap2.put(common.emv.kernel.TransactionData.TransactionType.of((java.lang.String) obj), ((common.emv.configuration.EntryConfigurationData.Builder) obj2).build());
            }
        });
        return new common.emv.configuration.ApplicationConfiguration(applicationConfigurationBuilder.getAid(), hashMap, applicationConfigurationBuilder.getCa(), applicationConfigurationBuilder.getCrl(), hashMap2, str2);
    }

    public final java.util.Set<java.lang.String> supportedAIDSet() {
        return this.b.keySet();
    }

    public final common.emv.configuration.DataObjectList getTerminalConfiguration() {
        return this.f6690a;
    }

    public final common.emv.configuration.EntryConfigurationData.Builder getEntryConfiguration(java.lang.String str, common.emv.kernel.TransactionData.TransactionType transactionType, java.lang.String str2) {
        java.util.Map<java.lang.String, common.emv.configuration.ApplicationConfigurationBuilder> map = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        return ((common.emv.configuration.ApplicationConfigurationBuilder) java.util.Objects.requireNonNull(map.get(sb.toString()))).getEntryConfigurationDataBuilder(transactionType.code);
    }

    public final common.emv.configuration.EntryConfigurationData.Builder getEntryConfiguration(java.lang.String str, common.emv.kernel.TransactionData.TransactionType transactionType) {
        return ((common.emv.configuration.ApplicationConfigurationBuilder) java.util.Objects.requireNonNull(this.b.get(str))).getEntryConfigurationDataBuilder(transactionType.code);
    }

    public final common.emv.configuration.DataObjectList getConfiguration(java.lang.String str, common.emv.kernel.TransactionData.TransactionType transactionType, java.lang.String str2) {
        java.util.Map<java.lang.String, common.emv.configuration.ApplicationConfigurationBuilder> map = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        return map.get(sb.toString()).getConfiguration(transactionType.code);
    }

    public final common.emv.configuration.DataObjectList getConfiguration(java.lang.String str, common.emv.kernel.TransactionData.TransactionType transactionType) {
        return this.b.get(str).getConfiguration(transactionType.code);
    }

    public final common.emv.configuration.DataObjectList getConfiguration(java.lang.String str) {
        return getConfiguration(str, common.emv.kernel.TransactionData.TransactionType.Purchase, "");
    }

    public final common.emv.configuration.ApplicationConfiguration createConfiguration(java.lang.String str) {
        return createConfiguration(str, "");
    }

    public static common.emv.configuration.ConfigurationTemplate from(java.io.InputStream... inputStreamArr) {
        return zb.b.a(inputStreamArr);
    }

    public static common.emv.configuration.ConfigurationTemplate from(java.util.Collection<java.io.InputStream> collection) {
        return zb.b.a((java.io.InputStream[]) collection.toArray(new java.io.InputStream[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.util.Map map, java.lang.String str, common.emv.configuration.DataObjectList dataObjectList) {
        common.emv.configuration.DataObjectList dataObjectList2 = new common.emv.configuration.DataObjectList(this.f6690a);
        dataObjectList2.putAll(dataObjectList);
        map.put(common.emv.kernel.TransactionData.TransactionType.of(str), dataObjectList2);
    }

    public ConfigurationTemplate(common.emv.configuration.DataObjectList dataObjectList, java.util.Map<java.lang.String, common.emv.configuration.ApplicationConfigurationBuilder> map) {
        this.f6690a = dataObjectList;
        this.b = map;
    }
}
