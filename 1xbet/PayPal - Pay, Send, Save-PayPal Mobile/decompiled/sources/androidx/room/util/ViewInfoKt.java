package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/room/util/ViewInfo;", "", "other", "", "equalsCommon", "(Landroidx/room/util/ViewInfo;Ljava/lang/Object;)Z", "", "hashCodeCommon", "(Landroidx/room/util/ViewInfo;)I", "", "toStringCommon", "(Landroidx/room/util/ViewInfo;)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewInfoKt {
    public static final boolean equalsCommon(androidx.room.util.ViewInfo viewInfo, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInfo, "");
        if (viewInfo == obj) {
            return true;
        }
        if (!(obj instanceof androidx.room.util.ViewInfo)) {
            return false;
        }
        androidx.room.util.ViewInfo viewInfo2 = (androidx.room.util.ViewInfo) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(viewInfo.name, viewInfo2.name) && (viewInfo.sql == null ? viewInfo2.sql == null : kotlin.jvm.internal.Intrinsics.areEqual(viewInfo.sql, viewInfo2.sql));
    }

    public static final int hashCodeCommon(androidx.room.util.ViewInfo viewInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInfo, "");
        int hashCode = viewInfo.name.hashCode();
        java.lang.String str = viewInfo.sql;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public static final java.lang.String toStringCommon(androidx.room.util.ViewInfo viewInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInfo, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |ViewInfo {\n            |   name = '");
        sb.append(viewInfo.name);
        sb.append("',\n            |   sql = '");
        sb.append(viewInfo.sql);
        sb.append("'\n            |}\n        ");
        return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }
}
