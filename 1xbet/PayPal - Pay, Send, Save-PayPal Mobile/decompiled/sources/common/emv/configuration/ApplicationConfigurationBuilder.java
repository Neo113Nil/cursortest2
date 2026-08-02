package common.emv.configuration;

/* loaded from: classes17.dex */
public class ApplicationConfigurationBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6689a;
    public final java.lang.String b;
    public final java.util.Map<java.lang.String, common.emv.configuration.DataObjectList> c = new java.util.HashMap();
    public final java.util.List<common.emv.configuration.DataObjectList> d = new java.util.ArrayList();
    public final java.util.List<common.emv.configuration.DataObjectList> e = new java.util.ArrayList();
    public final java.util.Map<java.lang.String, common.emv.configuration.EntryConfigurationData.Builder> f = new java.util.HashMap();

    public java.lang.String getKernelID() {
        return this.b;
    }

    public common.emv.configuration.EntryConfigurationData.Builder getEntryConfigurationDataBuilder(java.lang.String str) {
        common.emv.configuration.EntryConfigurationData.Builder builder = this.f.get(str);
        if (builder != null) {
            return builder;
        }
        common.emv.configuration.EntryConfigurationData.Builder builder2 = new common.emv.configuration.EntryConfigurationData.Builder();
        this.f.put(str, builder2);
        return builder2;
    }

    public java.util.List<common.emv.configuration.DataObjectList> getCrl() {
        return this.e;
    }

    public common.emv.configuration.DataObjectList getConfiguration(java.lang.String str) {
        common.emv.configuration.DataObjectList dataObjectList = this.c.get(str);
        if (dataObjectList != null) {
            return dataObjectList;
        }
        common.emv.configuration.DataObjectList dataObjectList2 = new common.emv.configuration.DataObjectList();
        this.c.put(str, dataObjectList2);
        return dataObjectList2;
    }

    public java.util.List<common.emv.configuration.DataObjectList> getCa() {
        return this.d;
    }

    public java.lang.String getAid() {
        return this.f6689a;
    }

    public ApplicationConfigurationBuilder(java.lang.String str, java.lang.String str2) {
        this.f6689a = str;
        this.b = str2;
    }
}
