package io.appmetrica.analytics.modulesapi.internal.common;

/* loaded from: classes.dex */
public interface TableDescription {
    java.util.List<java.lang.String> getColumnNames();

    java.lang.String getCreateTableScript();

    java.util.Map<java.lang.Integer, io.appmetrica.analytics.coreapi.internal.db.DatabaseScript> getDatabaseProviderUpgradeScript();

    java.lang.String getDropTableScript();

    java.lang.String getTableName();
}
