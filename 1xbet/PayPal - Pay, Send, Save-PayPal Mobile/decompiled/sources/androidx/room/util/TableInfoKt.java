package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\r\u001a!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\fH\u0000¢\u0006\u0004\b\u0007\u0010\u0011\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\fH\u0000¢\u0006\u0004\b\n\u0010\u0012\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00132\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0014\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0013H\u0000¢\u0006\u0004\b\u0007\u0010\u0015\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0013H\u0000¢\u0006\u0004\b\n\u0010\u0016\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0018\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0017H\u0000¢\u0006\u0004\b\u0007\u0010\u0019\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0017H\u0000¢\u0006\u0004\b\n\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\t2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u0017\u0010 \u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u001bH\u0002¢\u0006\u0004\b \u0010\u001e"}, d2 = {"Landroidx/room/util/TableInfo;", "", "other", "", "equalsCommon", "(Landroidx/room/util/TableInfo;Ljava/lang/Object;)Z", "", "hashCodeCommon", "(Landroidx/room/util/TableInfo;)I", "", "toStringCommon", "(Landroidx/room/util/TableInfo;)Ljava/lang/String;", "Landroidx/room/util/TableInfo$Column;", "(Landroidx/room/util/TableInfo$Column;Ljava/lang/Object;)Z", "current", "defaultValueEqualsCommon", "(Ljava/lang/String;Ljava/lang/String;)Z", "(Landroidx/room/util/TableInfo$Column;)I", "(Landroidx/room/util/TableInfo$Column;)Ljava/lang/String;", "Landroidx/room/util/TableInfo$ForeignKey;", "(Landroidx/room/util/TableInfo$ForeignKey;Ljava/lang/Object;)Z", "(Landroidx/room/util/TableInfo$ForeignKey;)I", "(Landroidx/room/util/TableInfo$ForeignKey;)Ljava/lang/String;", "Landroidx/room/util/TableInfo$Index;", "(Landroidx/room/util/TableInfo$Index;Ljava/lang/Object;)Z", "(Landroidx/room/util/TableInfo$Index;)I", "(Landroidx/room/util/TableInfo$Index;)Ljava/lang/String;", "", "collection", "formatString", "(Ljava/util/Collection;)Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TableInfoKt {
    public static final boolean equalsCommon(androidx.room.util.TableInfo tableInfo, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableInfo, "");
        if (tableInfo == obj) {
            return true;
        }
        if (!(obj instanceof androidx.room.util.TableInfo)) {
            return false;
        }
        androidx.room.util.TableInfo tableInfo2 = (androidx.room.util.TableInfo) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(tableInfo.name, tableInfo2.name) || !kotlin.jvm.internal.Intrinsics.areEqual(tableInfo.columns, tableInfo2.columns) || !kotlin.jvm.internal.Intrinsics.areEqual(tableInfo.foreignKeys, tableInfo2.foreignKeys)) {
            return false;
        }
        if (tableInfo.indices == null || tableInfo2.indices == null) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(tableInfo.indices, tableInfo2.indices);
    }

    public static final int hashCodeCommon(androidx.room.util.TableInfo tableInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableInfo, "");
        return (((tableInfo.name.hashCode() * 31) + tableInfo.columns.hashCode()) * 31) + tableInfo.foreignKeys.hashCode();
    }

    public static final java.lang.String toStringCommon(androidx.room.util.TableInfo tableInfo) {
        java.util.List emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableInfo, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(tableInfo.name);
        sb.append("',\n            |    columns = {");
        sb.append(formatString(kotlin.collections.CollectionsKt.sortedWith(tableInfo.columns.values(), new java.util.Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((androidx.room.util.TableInfo.Column) t).name, ((androidx.room.util.TableInfo.Column) t2).name);
            }
        })));
        sb.append("\n            |    foreignKeys = {");
        sb.append(formatString(tableInfo.foreignKeys));
        sb.append("\n            |    indices = {");
        java.util.Set<androidx.room.util.TableInfo.Index> set = tableInfo.indices;
        if (set == null || (emptyList = kotlin.collections.CollectionsKt.sortedWith(set, new java.util.Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((androidx.room.util.TableInfo.Index) t).name, ((androidx.room.util.TableInfo.Index) t2).name);
            }
        })) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        sb.append(formatString(emptyList));
        sb.append("\n            |}\n        ");
        return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }

    public static final boolean equalsCommon(androidx.room.util.TableInfo.Column column, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(column, "");
        if (column == obj) {
            return true;
        }
        if (!(obj instanceof androidx.room.util.TableInfo.Column)) {
            return false;
        }
        androidx.room.util.TableInfo.Column column2 = (androidx.room.util.TableInfo.Column) obj;
        if (column.isPrimaryKey() != column2.isPrimaryKey() || !kotlin.jvm.internal.Intrinsics.areEqual(column.name, column2.name) || column.notNull != column2.notNull) {
            return false;
        }
        java.lang.String str = column.defaultValue;
        java.lang.String str2 = column2.defaultValue;
        if (column.createdFrom == 1 && column2.createdFrom == 2 && str != null && !defaultValueEqualsCommon(str, column2.defaultValue)) {
            return false;
        }
        if (column.createdFrom != 2 || column2.createdFrom != 1 || str2 == null || defaultValueEqualsCommon(str2, str)) {
            return (column.createdFrom == 0 || column.createdFrom != column2.createdFrom || (str == null ? str2 == null : defaultValueEqualsCommon(str, str2))) && column.affinity == column2.affinity;
        }
        return false;
    }

    public static final boolean defaultValueEqualsCommon(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, str2)) {
            return true;
        }
        java.lang.String str3 = str;
        if (str3.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str3.length()) {
                    char charAt = str3.charAt(i);
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3++;
                } else if (i2 == 0) {
                    java.lang.String substring = str.substring(1, str.length() - 1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final int hashCodeCommon(androidx.room.util.TableInfo.Column column) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(column, "");
        int hashCode = column.name.hashCode();
        return (((((hashCode * 31) + column.affinity) * 31) + (column.notNull ? 1231 : 1237)) * 31) + column.primaryKeyPosition;
    }

    public static final java.lang.String toStringCommon(androidx.room.util.TableInfo.Column column) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(column, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(column.name);
        sb.append("',\n            |   type = '");
        sb.append(column.type);
        sb.append("',\n            |   affinity = '");
        sb.append(column.affinity);
        sb.append("',\n            |   notNull = '");
        sb.append(column.notNull);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(column.primaryKeyPosition);
        sb.append("',\n            |   defaultValue = '");
        java.lang.String str = column.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return kotlin.text.StringsKt.prependIndent$default(kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final boolean equalsCommon(androidx.room.util.TableInfo.ForeignKey foreignKey, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(foreignKey, "");
        if (foreignKey == obj) {
            return true;
        }
        if (!(obj instanceof androidx.room.util.TableInfo.ForeignKey)) {
            return false;
        }
        androidx.room.util.TableInfo.ForeignKey foreignKey2 = (androidx.room.util.TableInfo.ForeignKey) obj;
        if (kotlin.jvm.internal.Intrinsics.areEqual(foreignKey.referenceTable, foreignKey2.referenceTable) && kotlin.jvm.internal.Intrinsics.areEqual(foreignKey.onDelete, foreignKey2.onDelete) && kotlin.jvm.internal.Intrinsics.areEqual(foreignKey.onUpdate, foreignKey2.onUpdate) && kotlin.jvm.internal.Intrinsics.areEqual(foreignKey.columnNames, foreignKey2.columnNames)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(foreignKey.referenceColumnNames, foreignKey2.referenceColumnNames);
        }
        return false;
    }

    public static final int hashCodeCommon(androidx.room.util.TableInfo.ForeignKey foreignKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(foreignKey, "");
        int hashCode = foreignKey.referenceTable.hashCode();
        int hashCode2 = foreignKey.onDelete.hashCode();
        return (((((((hashCode * 31) + hashCode2) * 31) + foreignKey.onUpdate.hashCode()) * 31) + foreignKey.columnNames.hashCode()) * 31) + foreignKey.referenceColumnNames.hashCode();
    }

    public static final java.lang.String toStringCommon(androidx.room.util.TableInfo.ForeignKey foreignKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(foreignKey, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(foreignKey.referenceTable);
        sb.append("',\n            |   onDelete = '");
        sb.append(foreignKey.onDelete);
        sb.append("',\n            |   onUpdate = '");
        sb.append(foreignKey.onUpdate);
        sb.append("',\n            |   columnNames = {");
        sb.append(getHighSpeedVideoSizes(kotlin.collections.CollectionsKt.sorted(foreignKey.columnNames)));
        sb.append("\n            |   referenceColumnNames = {");
        sb.append(getHighSpeedVideoFpsRanges(kotlin.collections.CollectionsKt.sorted(foreignKey.referenceColumnNames)));
        sb.append("\n            |}\n        ");
        return kotlin.text.StringsKt.prependIndent$default(kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final boolean equalsCommon(androidx.room.util.TableInfo.Index index, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(index, "");
        if (index == obj) {
            return true;
        }
        if (!(obj instanceof androidx.room.util.TableInfo.Index)) {
            return false;
        }
        androidx.room.util.TableInfo.Index index2 = (androidx.room.util.TableInfo.Index) obj;
        if (index.unique != index2.unique || !kotlin.jvm.internal.Intrinsics.areEqual(index.columns, index2.columns) || !kotlin.jvm.internal.Intrinsics.areEqual(index.orders, index2.orders)) {
            return false;
        }
        if (kotlin.text.StringsKt.startsWith$default(index.name, androidx.room.util.TableInfo.Index.DEFAULT_PREFIX, false, 2, (java.lang.Object) null)) {
            return kotlin.text.StringsKt.startsWith$default(index2.name, androidx.room.util.TableInfo.Index.DEFAULT_PREFIX, false, 2, (java.lang.Object) null);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(index.name, index2.name);
    }

    public static final int hashCodeCommon(androidx.room.util.TableInfo.Index index) {
        int hashCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(index, "");
        if (kotlin.text.StringsKt.startsWith$default(index.name, androidx.room.util.TableInfo.Index.DEFAULT_PREFIX, false, 2, (java.lang.Object) null)) {
            hashCode = androidx.room.util.TableInfo.Index.DEFAULT_PREFIX.hashCode();
        } else {
            hashCode = index.name.hashCode();
        }
        boolean z = index.unique;
        return (((((hashCode * 31) + (z ? 1 : 0)) * 31) + index.columns.hashCode()) * 31) + index.orders.hashCode();
    }

    public static final java.lang.String toStringCommon(androidx.room.util.TableInfo.Index index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(index, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(index.name);
        sb.append("',\n            |   unique = '");
        sb.append(index.unique);
        sb.append("',\n            |   columns = {");
        sb.append(getHighSpeedVideoSizes(index.columns));
        sb.append("\n            |   orders = {");
        sb.append(getHighSpeedVideoFpsRanges(index.orders));
        sb.append("\n            |}\n        ");
        return kotlin.text.StringsKt.prependIndent$default(kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final java.lang.String formatString(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        if (!collection.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlin.text.StringsKt.prependIndent$default(kotlin.collections.CollectionsKt.joinToString$default(collection, ",\n", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, 0, null, null, 56, null), null, 1, null));
            sb.append("},");
            return sb.toString();
        }
        return " }";
    }

    private static final java.lang.String getHighSpeedVideoSizes(java.util.Collection<?> collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.prependIndent$default(kotlin.collections.CollectionsKt.joinToString$default(collection, ",", null, null, 0, null, null, 62, null), null, 1, null));
        sb.append(kotlin.text.StringsKt.prependIndent$default("},", null, 1, null));
        return sb.toString();
    }

    private static final java.lang.String getHighSpeedVideoFpsRanges(java.util.Collection<?> collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.prependIndent$default(kotlin.collections.CollectionsKt.joinToString$default(collection, ",", null, null, 0, null, null, 62, null), null, 1, null));
        sb.append(kotlin.text.StringsKt.prependIndent$default(" }", null, 1, null));
        return sb.toString();
    }
}
