package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/DateHeaderCell;", "Lcom/ingo/sdk/android/ux/viewprovider/HistoryCell;", "", "displayHeader", "Ljava/util/Date;", "date", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "Ljava/lang/String;", "getDisplayHeader", "()Ljava/lang/String;", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DateHeaderCell extends com.ingo.sdk.android.ux.viewprovider.HistoryCell {
    public static final int $stable = 8;
    private final java.util.Date date;
    private final java.lang.String displayHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateHeaderCell(java.lang.String str, java.util.Date date) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        this.displayHeader = str;
        this.date = date;
    }

    public final java.util.Date getDate() {
        return this.date;
    }

    public final java.lang.String getDisplayHeader() {
        return this.displayHeader;
    }
}
