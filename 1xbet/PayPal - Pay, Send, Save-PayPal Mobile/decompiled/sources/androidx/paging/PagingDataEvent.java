package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e"}, d2 = {"Landroidx/paging/PagingDataEvent;", "", "T", "<init>", "()V", "Prepend", "Append", com.google.common.net.HttpHeaders.REFRESH, "DropPrepend", "DropAppend", "Landroidx/paging/PagingDataEvent$Append;", "Landroidx/paging/PagingDataEvent$DropAppend;", "Landroidx/paging/PagingDataEvent$DropPrepend;", "Landroidx/paging/PagingDataEvent$Prepend;", "Landroidx/paging/PagingDataEvent$Refresh;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PagingDataEvent<T> {
    private PagingDataEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0010"}, d2 = {"Landroidx/paging/PagingDataEvent$Prepend;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "inserted", "", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(Ljava/util/List;II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getInserted", "()Ljava/util/List;", com.visa.cbp.getEncExpo.warmup, "getNewPlaceholdersBefore", "getOldPlaceholdersBefore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Prepend<T> extends androidx.paging.PagingDataEvent<T> {
        private final java.util.List<T> inserted;
        private final int newPlaceholdersBefore;
        private final int oldPlaceholdersBefore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Prepend(java.util.List<? extends T> list, int i, int i2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.inserted = list;
            this.newPlaceholdersBefore = i;
            this.oldPlaceholdersBefore = i2;
        }

        public final java.util.List<T> getInserted() {
            return this.inserted;
        }

        public final int getNewPlaceholdersBefore() {
            return this.newPlaceholdersBefore;
        }

        public final int getOldPlaceholdersBefore() {
            return this.oldPlaceholdersBefore;
        }

        public final boolean equals(java.lang.Object other) {
            if (!(other instanceof androidx.paging.PagingDataEvent.Prepend)) {
                return false;
            }
            androidx.paging.PagingDataEvent.Prepend prepend = (androidx.paging.PagingDataEvent.Prepend) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.inserted, prepend.inserted) && this.newPlaceholdersBefore == prepend.newPlaceholdersBefore && this.oldPlaceholdersBefore == prepend.oldPlaceholdersBefore;
        }

        public final int hashCode() {
            return this.inserted.hashCode() + java.lang.Integer.hashCode(this.newPlaceholdersBefore) + java.lang.Integer.hashCode(this.oldPlaceholdersBefore);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PagingDataEvent.Prepend loaded ");
            sb.append(this.inserted.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.inserted));
            sb.append("\n                    |   last item: ");
            sb.append(kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.inserted));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.newPlaceholdersBefore);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.oldPlaceholdersBefore);
            sb.append("\n                    |)\n                    |");
            return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001b\u0010\u0011"}, d2 = {"Landroidx/paging/PagingDataEvent$Append;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "startIndex", "", "inserted", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(ILjava/util/List;II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStartIndex", "Ljava/util/List;", "getInserted", "()Ljava/util/List;", "getNewPlaceholdersAfter", "getOldPlaceholdersAfter"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Append<T> extends androidx.paging.PagingDataEvent<T> {
        private final java.util.List<T> inserted;
        private final int newPlaceholdersAfter;
        private final int oldPlaceholdersAfter;
        private final int startIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Append(int i, java.util.List<? extends T> list, int i2, int i3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.startIndex = i;
            this.inserted = list;
            this.newPlaceholdersAfter = i2;
            this.oldPlaceholdersAfter = i3;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final java.util.List<T> getInserted() {
            return this.inserted;
        }

        public final int getNewPlaceholdersAfter() {
            return this.newPlaceholdersAfter;
        }

        public final int getOldPlaceholdersAfter() {
            return this.oldPlaceholdersAfter;
        }

        public final boolean equals(java.lang.Object other) {
            if (!(other instanceof androidx.paging.PagingDataEvent.Append)) {
                return false;
            }
            androidx.paging.PagingDataEvent.Append append = (androidx.paging.PagingDataEvent.Append) other;
            return this.startIndex == append.startIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.inserted, append.inserted) && this.newPlaceholdersAfter == append.newPlaceholdersAfter && this.oldPlaceholdersAfter == append.oldPlaceholdersAfter;
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.startIndex) + this.inserted.hashCode() + java.lang.Integer.hashCode(this.newPlaceholdersAfter) + java.lang.Integer.hashCode(this.oldPlaceholdersAfter);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PagingDataEvent.Append loaded ");
            sb.append(this.inserted.size());
            sb.append(" items (\n                    |   startIndex: ");
            sb.append(this.startIndex);
            sb.append("\n                    |   first item: ");
            sb.append(kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.inserted));
            sb.append("\n                    |   last item: ");
            sb.append(kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.inserted));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.newPlaceholdersAfter);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.oldPlaceholdersAfter);
            sb.append("\n                    |)\n                    |");
            return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015"}, d2 = {"Landroidx/paging/PagingDataEvent$Refresh;", "", "T", "Landroidx/paging/PagingDataEvent;", "Landroidx/paging/PlaceholderPaddedList;", "newList", "previousList", "<init>", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/paging/PlaceholderPaddedList;", "getNewList", "()Landroidx/paging/PlaceholderPaddedList;", "getPreviousList"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Refresh<T> extends androidx.paging.PagingDataEvent<T> {
        private final androidx.paging.PlaceholderPaddedList<T> newList;
        private final androidx.paging.PlaceholderPaddedList<T> previousList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refresh(androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList, androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList2, "");
            this.newList = placeholderPaddedList;
            this.previousList = placeholderPaddedList2;
        }

        public final androidx.paging.PlaceholderPaddedList<T> getNewList() {
            return this.newList;
        }

        public final androidx.paging.PlaceholderPaddedList<T> getPreviousList() {
            return this.previousList;
        }

        public final boolean equals(java.lang.Object other) {
            if (!(other instanceof androidx.paging.PagingDataEvent.Refresh)) {
                return false;
            }
            androidx.paging.PagingDataEvent.Refresh refresh = (androidx.paging.PagingDataEvent.Refresh) other;
            return this.newList.getPlaceholdersBefore() == refresh.newList.getPlaceholdersBefore() && this.newList.getPlaceholdersAfter() == refresh.newList.getPlaceholdersAfter() && this.newList.getSize() == refresh.newList.getSize() && this.newList.getDataCount() == refresh.newList.getDataCount() && this.previousList.getPlaceholdersBefore() == refresh.previousList.getPlaceholdersBefore() && this.previousList.getPlaceholdersAfter() == refresh.previousList.getPlaceholdersAfter() && this.previousList.getSize() == refresh.previousList.getSize() && this.previousList.getDataCount() == refresh.previousList.getDataCount();
        }

        public final int hashCode() {
            return this.newList.hashCode() + this.previousList.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
            sb.append(this.newList.getPlaceholdersBefore());
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(this.newList.getPlaceholdersAfter());
            sb.append("\n                    |       size: ");
            sb.append(this.newList.getSize());
            sb.append("\n                    |       dataCount: ");
            sb.append(this.newList.getDataCount());
            sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
            sb.append(this.previousList.getPlaceholdersBefore());
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(this.previousList.getPlaceholdersAfter());
            sb.append("\n                    |       size: ");
            sb.append(this.previousList.getSize());
            sb.append("\n                    |       dataCount: ");
            sb.append(this.previousList.getDataCount());
            sb.append("\n                    |   )\n                    |");
            return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u000f"}, d2 = {"Landroidx/paging/PagingDataEvent$DropPrepend;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "dropCount", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(III)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getDropCount", "getNewPlaceholdersBefore", "getOldPlaceholdersBefore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DropPrepend<T> extends androidx.paging.PagingDataEvent<T> {
        private final int dropCount;
        private final int newPlaceholdersBefore;
        private final int oldPlaceholdersBefore;

        public DropPrepend(int i, int i2, int i3) {
            super(null);
            this.dropCount = i;
            this.newPlaceholdersBefore = i2;
            this.oldPlaceholdersBefore = i3;
        }

        public final int getDropCount() {
            return this.dropCount;
        }

        public final int getNewPlaceholdersBefore() {
            return this.newPlaceholdersBefore;
        }

        public final int getOldPlaceholdersBefore() {
            return this.oldPlaceholdersBefore;
        }

        public final boolean equals(java.lang.Object other) {
            if (!(other instanceof androidx.paging.PagingDataEvent.DropPrepend)) {
                return false;
            }
            androidx.paging.PagingDataEvent.DropPrepend dropPrepend = (androidx.paging.PagingDataEvent.DropPrepend) other;
            return this.dropCount == dropPrepend.dropCount && this.newPlaceholdersBefore == dropPrepend.newPlaceholdersBefore && this.oldPlaceholdersBefore == dropPrepend.oldPlaceholdersBefore;
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.dropCount) + java.lang.Integer.hashCode(this.newPlaceholdersBefore) + java.lang.Integer.hashCode(this.oldPlaceholdersBefore);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PagingDataEvent.DropPrepend dropped ");
            sb.append(this.dropCount);
            sb.append(" items (\n                    |   dropCount: ");
            sb.append(this.dropCount);
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.newPlaceholdersBefore);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.oldPlaceholdersBefore);
            sb.append("\n                    |)\n                    |");
            return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0010"}, d2 = {"Landroidx/paging/PagingDataEvent$DropAppend;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "startIndex", "dropCount", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStartIndex", "getDropCount", "getNewPlaceholdersAfter", "getOldPlaceholdersAfter"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DropAppend<T> extends androidx.paging.PagingDataEvent<T> {
        private final int dropCount;
        private final int newPlaceholdersAfter;
        private final int oldPlaceholdersAfter;
        private final int startIndex;

        public DropAppend(int i, int i2, int i3, int i4) {
            super(null);
            this.startIndex = i;
            this.dropCount = i2;
            this.newPlaceholdersAfter = i3;
            this.oldPlaceholdersAfter = i4;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final int getDropCount() {
            return this.dropCount;
        }

        public final int getNewPlaceholdersAfter() {
            return this.newPlaceholdersAfter;
        }

        public final int getOldPlaceholdersAfter() {
            return this.oldPlaceholdersAfter;
        }

        public final boolean equals(java.lang.Object other) {
            if (!(other instanceof androidx.paging.PagingDataEvent.DropAppend)) {
                return false;
            }
            androidx.paging.PagingDataEvent.DropAppend dropAppend = (androidx.paging.PagingDataEvent.DropAppend) other;
            return this.startIndex == dropAppend.startIndex && this.dropCount == dropAppend.dropCount && this.newPlaceholdersAfter == dropAppend.newPlaceholdersAfter && this.oldPlaceholdersAfter == dropAppend.oldPlaceholdersAfter;
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.startIndex) + java.lang.Integer.hashCode(this.dropCount) + java.lang.Integer.hashCode(this.newPlaceholdersAfter) + java.lang.Integer.hashCode(this.oldPlaceholdersAfter);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PagingDataEvent.DropAppend dropped ");
            sb.append(this.dropCount);
            sb.append(" items (\n                    |   startIndex: ");
            sb.append(this.startIndex);
            sb.append("\n                    |   dropCount: ");
            sb.append(this.dropCount);
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.newPlaceholdersAfter);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.oldPlaceholdersAfter);
            sb.append("\n                    |)\n                    |");
            return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
        }
    }

    public /* synthetic */ PagingDataEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
