package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Landroidx/paging/PlaceholderPaddedList;", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/paging/PlaceholderPaddedList;I)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncPagingDataDifferKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T getHighResolutionOutputSizeshNQ4ISI(androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList, int i) {
        if (i < 0 || i >= placeholderPaddedList.getSize()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(placeholderPaddedList.getSize());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        int placeholdersBefore = i - placeholderPaddedList.getPlaceholdersBefore();
        if (placeholdersBefore < 0 || placeholdersBefore >= placeholderPaddedList.getDataCount()) {
            return null;
        }
        return placeholderPaddedList.getItem(placeholdersBefore);
    }

    public static final /* synthetic */ androidx.paging.ItemSnapshotList access$snapshot(androidx.paging.PlaceholderPaddedList placeholderPaddedList) {
        int dataCount = placeholderPaddedList.getDataCount() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (dataCount >= 0) {
            int i = 0;
            while (true) {
                arrayList.add(placeholderPaddedList.getItem(i));
                if (i == dataCount) {
                    break;
                }
                i++;
            }
        }
        return new androidx.paging.ItemSnapshotList(placeholderPaddedList.getPlaceholdersBefore(), placeholderPaddedList.getPlaceholdersAfter(), arrayList);
    }
}
