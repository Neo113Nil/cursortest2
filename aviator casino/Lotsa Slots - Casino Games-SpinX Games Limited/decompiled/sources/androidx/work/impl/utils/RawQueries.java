package androidx.work.impl.utils;

/* compiled from: RawQueries.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t¨\u0006\n"}, d2 = {"bindings", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "", "toRawQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/work/WorkQuery;", "work-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RawQueries {
    public static final androidx.sqlite.db.SupportSQLiteQuery toRawQuery(androidx.work.WorkQuery workQuery) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workQuery, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT * FROM workspec");
        java.util.List<androidx.work.WorkInfo.State> states = workQuery.getStates();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(states, "states");
        java.lang.String str2 = " AND";
        if (!(!states.isEmpty())) {
            str = " WHERE";
        } else {
            java.util.List<androidx.work.WorkInfo.State> states2 = workQuery.getStates();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(states2, "states");
            java.util.List<androidx.work.WorkInfo.State> list = states2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (androidx.work.WorkInfo.State state : list) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(state);
                arrayList2.add(java.lang.Integer.valueOf(androidx.work.impl.model.WorkTypeConverters.stateToInt(state)));
            }
            java.util.ArrayList arrayList3 = arrayList2;
            sb.append(" WHERE state IN (");
            bindings(sb, arrayList3.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        java.util.List<java.util.UUID> ids = workQuery.getIds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ids, "ids");
        if (!ids.isEmpty()) {
            java.util.List<java.util.UUID> ids2 = workQuery.getIds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ids2, "ids");
            java.util.List<java.util.UUID> list2 = ids2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList4.add(((java.util.UUID) it.next()).toString());
            }
            sb.append(str.concat(" id IN ("));
            bindings(sb, workQuery.getIds().size());
            sb.append(")");
            arrayList.addAll(arrayList4);
            str = " AND";
        }
        java.util.List<java.lang.String> tags = workQuery.getTags();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tags, "tags");
        if (!tags.isEmpty()) {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            bindings(sb, workQuery.getTags().size());
            sb.append("))");
            java.util.List<java.lang.String> tags2 = workQuery.getTags();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tags2, "tags");
            arrayList.addAll(tags2);
        } else {
            str2 = str;
        }
        java.util.List<java.lang.String> uniqueWorkNames = workQuery.getUniqueWorkNames();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uniqueWorkNames, "uniqueWorkNames");
        if (!uniqueWorkNames.isEmpty()) {
            sb.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            bindings(sb, workQuery.getUniqueWorkNames().size());
            sb.append("))");
            java.util.List<java.lang.String> uniqueWorkNames2 = workQuery.getUniqueWorkNames();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uniqueWorkNames2, "uniqueWorkNames");
            arrayList.addAll(uniqueWorkNames2);
        }
        sb.append(";");
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return new androidx.sqlite.db.SimpleSQLiteQuery(sb2, arrayList.toArray(new java.lang.Object[0]));
    }

    private static final void bindings(java.lang.StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
    }
}
