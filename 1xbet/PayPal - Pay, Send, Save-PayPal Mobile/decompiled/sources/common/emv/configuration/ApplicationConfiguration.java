package common.emv.configuration;

/* loaded from: classes17.dex */
public final class ApplicationConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6688a;
    public final java.lang.String b;
    public final java.util.Map<common.emv.kernel.TransactionData.TransactionType, common.emv.configuration.DataObjectList> c;
    public final java.util.List<common.emv.configuration.DataObjectList> d;
    public final java.util.List<common.emv.configuration.DataObjectList> e;
    public final java.util.Map<common.emv.kernel.TransactionData.TransactionType, common.emv.configuration.EntryConfigurationData> f;

    public final boolean isTransactionTypeSupported(common.emv.kernel.TransactionData.TransactionType transactionType) {
        return this.c.containsKey(transactionType);
    }

    public final java.util.Map<common.emv.kernel.TransactionData.TransactionType, common.emv.configuration.DataObjectList> getTypeConfiguration() {
        return this.c;
    }

    public final java.lang.String getRid() {
        java.lang.String str = this.f6688a;
        if (str == null) {
            return null;
        }
        return str.substring(0, 10);
    }

    public final java.lang.String getKernelID() {
        return this.b;
    }

    public final common.emv.configuration.EntryConfigurationData getEntryConfigurationData(common.emv.kernel.TransactionData.TransactionType transactionType) {
        if (transactionType == common.emv.kernel.TransactionData.TransactionType.Unknown) {
            transactionType = common.emv.kernel.TransactionData.TransactionType.Purchase;
        }
        common.emv.configuration.EntryConfigurationData entryConfigurationData = this.f.get(transactionType);
        if (entryConfigurationData != null) {
            return entryConfigurationData;
        }
        throw new java.lang.IllegalArgumentException("no entry configuration found for selected transaction type. ");
    }

    @java.lang.Deprecated
    public final common.emv.configuration.EntryConfigurationData getEntryConfigurationData() {
        return getEntryConfigurationData(common.emv.kernel.TransactionData.TransactionType.Purchase);
    }

    public final java.util.List<common.emv.configuration.DataObjectList> getCrl() {
        return this.e;
    }

    public final common.emv.configuration.DataObjectList getConfiguration(common.emv.kernel.TransactionData.TransactionType transactionType) {
        if (transactionType == common.emv.kernel.TransactionData.TransactionType.Unknown) {
            transactionType = common.emv.kernel.TransactionData.TransactionType.Purchase;
        }
        common.emv.configuration.DataObjectList dataObjectList = this.c.get(transactionType);
        if (dataObjectList != null) {
            return dataObjectList;
        }
        throw new java.lang.IllegalArgumentException("no configuration found for selected transaction type. ");
    }

    @java.lang.Deprecated
    public final common.emv.configuration.DataObjectList getConfiguration() {
        return getConfiguration(common.emv.kernel.TransactionData.TransactionType.Purchase);
    }

    public final java.util.List<common.emv.configuration.DataObjectList> getCa() {
        return this.d;
    }

    public final java.lang.String getAid() {
        return this.f6688a;
    }

    public ApplicationConfiguration(java.lang.String str, java.util.Map<common.emv.kernel.TransactionData.TransactionType, common.emv.configuration.DataObjectList> map, java.util.List<common.emv.configuration.DataObjectList> list, java.util.List<common.emv.configuration.DataObjectList> list2, java.util.Map<common.emv.kernel.TransactionData.TransactionType, common.emv.configuration.EntryConfigurationData> map2, java.lang.String str2) {
        this.f6688a = str;
        this.c = map;
        this.d = list;
        this.e = list2;
        this.f = map2;
        this.b = str2;
    }

    public ApplicationConfiguration(java.lang.String str, common.emv.configuration.DataObjectList dataObjectList, java.util.List<common.emv.configuration.DataObjectList> list, java.util.List<common.emv.configuration.DataObjectList> list2, java.util.Map<common.emv.kernel.TransactionData.TransactionType, common.emv.configuration.EntryConfigurationData> map) {
        this.f6688a = str;
        this.c = new java.util.HashMap();
        this.d = list;
        this.e = list2;
        this.f = map;
        common.emv.kernel.TransactionData.TransactionType[] values = common.emv.kernel.TransactionData.TransactionType.values();
        for (int i = 0; i < 11; i++) {
            this.c.put(values[i], dataObjectList);
        }
        this.b = "";
    }
}
