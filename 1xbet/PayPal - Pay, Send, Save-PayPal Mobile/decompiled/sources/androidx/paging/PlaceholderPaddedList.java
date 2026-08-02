package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/paging/PlaceholderPaddedList;", "T", "", "", "index", "getItem", "(I)Ljava/lang/Object;", "getPlaceholdersBefore", "()I", "placeholdersBefore", "getPlaceholdersAfter", "placeholdersAfter", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "getDataCount", "dataCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PlaceholderPaddedList<T> {
    int getDataCount();

    T getItem(int index);

    int getPlaceholdersAfter();

    int getPlaceholdersBefore();

    int getSize();
}
