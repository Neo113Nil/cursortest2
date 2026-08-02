package app.cash.sqldelight.driver.android;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lapp/cash/sqldelight/driver/android/Api28Impl;", "", "<init>", "()V", "Landroid/database/AbstractWindowedCursor;", "", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/database/AbstractWindowedCursor;J)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Api28Impl {
    public static final app.cash.sqldelight.driver.android.Api28Impl INSTANCE = new app.cash.sqldelight.driver.android.Api28Impl();

    private Api28Impl() {
    }

    @kotlin.jvm.JvmStatic
    public static final void getHighSpeedVideoFpsRangesFor(android.database.AbstractWindowedCursor abstractWindowedCursor, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractWindowedCursor, "");
        abstractWindowedCursor.setWindow(new android.database.CursorWindow(null, j));
    }
}
