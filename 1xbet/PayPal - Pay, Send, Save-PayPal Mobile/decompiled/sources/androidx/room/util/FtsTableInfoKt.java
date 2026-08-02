package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/room/util/FtsTableInfo;", "", "other", "", "equalsCommon", "(Landroidx/room/util/FtsTableInfo;Ljava/lang/Object;)Z", "", "hashCodeCommon", "(Landroidx/room/util/FtsTableInfo;)I", "", "toStringCommon", "(Landroidx/room/util/FtsTableInfo;)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FtsTableInfoKt {
    public static final boolean equalsCommon(androidx.room.util.FtsTableInfo ftsTableInfo, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ftsTableInfo, "");
        if (ftsTableInfo == obj) {
            return true;
        }
        if (!(obj instanceof androidx.room.util.FtsTableInfo)) {
            return false;
        }
        androidx.room.util.FtsTableInfo ftsTableInfo2 = (androidx.room.util.FtsTableInfo) obj;
        if (kotlin.jvm.internal.Intrinsics.areEqual(ftsTableInfo.name, ftsTableInfo2.name) && kotlin.jvm.internal.Intrinsics.areEqual(ftsTableInfo.columns, ftsTableInfo2.columns)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(ftsTableInfo.options, ftsTableInfo2.options);
        }
        return false;
    }

    public static final int hashCodeCommon(androidx.room.util.FtsTableInfo ftsTableInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ftsTableInfo, "");
        return (((ftsTableInfo.name.hashCode() * 31) + ftsTableInfo.columns.hashCode()) * 31) + ftsTableInfo.options.hashCode();
    }

    public static final java.lang.String toStringCommon(androidx.room.util.FtsTableInfo ftsTableInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ftsTableInfo, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |FtsTableInfo {\n            |   name = '");
        sb.append(ftsTableInfo.name);
        sb.append("',\n            |   columns = {");
        sb.append(androidx.room.util.TableInfoKt.formatString(kotlin.collections.CollectionsKt.sorted(ftsTableInfo.columns)));
        sb.append("\n            |   options = {");
        sb.append(androidx.room.util.TableInfoKt.formatString(kotlin.collections.CollectionsKt.sorted(ftsTableInfo.options)));
        sb.append("\n            |}\n        ");
        return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }
}
