package app.cash.sqldelight.db;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lapp/cash/sqldelight/db/AfterVersion;", "", "", "afterVersion", "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlDriver;", "", "block", "<init>", "(JLkotlin/jvm/functions/Function1;)V", "J", "getAfterVersion", "()J", "Lkotlin/jvm/functions/Function1;", "getBlock", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AfterVersion {
    private final long afterVersion;
    private final kotlin.jvm.functions.Function1<app.cash.sqldelight.db.SqlDriver, kotlin.Unit> block;

    /* JADX WARN: Multi-variable type inference failed */
    public AfterVersion(long j, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlDriver, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.afterVersion = j;
        this.block = function1;
    }

    public final long getAfterVersion() {
        return this.afterVersion;
    }

    public final kotlin.jvm.functions.Function1<app.cash.sqldelight.db.SqlDriver, kotlin.Unit> getBlock() {
        return this.block;
    }
}
