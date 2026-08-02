package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/room/RoomRawQuery;", "", "", com.datadog.trace.api.DDSpanTypes.SQL, "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "", "onBindStatement", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBindingFunction", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "getSql", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RoomRawQuery {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.database.SQLiteStatement, kotlin.Unit> getHighSpeedVideoFpsRanges;
    private final java.lang.String sql;

    public RoomRawQuery(java.lang.String str, final kotlin.jvm.functions.Function1<? super androidx.database.SQLiteStatement, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.sql = str;
        this.getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1() { // from class: androidx.room.RoomRawQuery$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.room.RoomRawQuery.$r8$lambda$hemBSnbnZseiHQiP_k8qIlrypn4(kotlin.jvm.functions.Function1.this, (androidx.database.SQLiteStatement) obj);
            }
        };
    }

    public final java.lang.String getSql() {
        return this.sql;
    }

    public /* synthetic */ RoomRawQuery(java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.room.RoomRawQuery$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.room.RoomRawQuery.$r8$lambda$B7f9pHNjNuR01XPYf17qe3_DNFI((androidx.database.SQLiteStatement) obj);
            }
        } : function1);
    }

    public final kotlin.jvm.functions.Function1<androidx.database.SQLiteStatement, kotlin.Unit> getBindingFunction() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B7f9pHNjNuR01XPYf17qe3_DNFI(androidx.database.SQLiteStatement sQLiteStatement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hemBSnbnZseiHQiP_k8qIlrypn4(kotlin.jvm.functions.Function1 function1, androidx.database.SQLiteStatement sQLiteStatement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        function1.invoke(new androidx.room.BindOnlySQLiteStatement(sQLiteStatement));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomRawQuery(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
