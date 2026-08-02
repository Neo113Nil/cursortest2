package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0012\u0082\u0001\u0002\u001e\u001f"}, d2 = {"Landroidx/paging/ViewportHint;", "", "", "p0", "p1", "p2", "p3", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/paging/LoadType;", "loadType", "presentedItemsBeyondAnchor$paging_common", "(Landroidx/paging/LoadType;)I", "hashCode", "()I", "presentedItemsBefore", com.visa.cbp.getEncExpo.warmup, "getPresentedItemsBefore", "presentedItemsAfter", "getPresentedItemsAfter", "originalPageOffsetFirst", "getOriginalPageOffsetFirst", "originalPageOffsetLast", "getOriginalPageOffsetLast", "Initial", "Access", "Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint$Initial;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ViewportHint {
    private final int originalPageOffsetFirst;
    private final int originalPageOffsetLast;
    private final int presentedItemsAfter;
    private final int presentedItemsBefore;

    private ViewportHint(int i, int i2, int i3, int i4) {
        this.presentedItemsBefore = i;
        this.presentedItemsAfter = i2;
        this.originalPageOffsetFirst = i3;
        this.originalPageOffsetLast = i4;
    }

    public final int getPresentedItemsBefore() {
        return this.presentedItemsBefore;
    }

    public final int getPresentedItemsAfter() {
        return this.presentedItemsAfter;
    }

    public final int getOriginalPageOffsetFirst() {
        return this.originalPageOffsetFirst;
    }

    public final int getOriginalPageOffsetLast() {
        return this.originalPageOffsetLast;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.paging.ViewportHint)) {
            return false;
        }
        androidx.paging.ViewportHint viewportHint = (androidx.paging.ViewportHint) other;
        return this.presentedItemsBefore == viewportHint.presentedItemsBefore && this.presentedItemsAfter == viewportHint.presentedItemsAfter && this.originalPageOffsetFirst == viewportHint.originalPageOffsetFirst && this.originalPageOffsetLast == viewportHint.originalPageOffsetLast;
    }

    public final int presentedItemsBeyondAnchor$paging_common(androidx.paging.LoadType loadType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        int i = androidx.paging.ViewportHint.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            throw new java.lang.IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i == 2) {
            return this.presentedItemsBefore;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.presentedItemsAfter;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.presentedItemsBefore) + java.lang.Integer.hashCode(this.presentedItemsAfter) + java.lang.Integer.hashCode(this.originalPageOffsetFirst) + java.lang.Integer.hashCode(this.originalPageOffsetLast);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/paging/ViewportHint$Initial;", "Landroidx/paging/ViewportHint;", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial extends androidx.paging.ViewportHint {
        public Initial(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4, null);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewportHint.Initial(\n            |    presentedItemsBefore=");
            sb.append(getPresentedItemsBefore());
            sb.append(",\n            |    presentedItemsAfter=");
            sb.append(getPresentedItemsAfter());
            sb.append(",\n            |    originalPageOffsetFirst=");
            sb.append(getOriginalPageOffsetFirst());
            sb.append(",\n            |    originalPageOffsetLast=");
            sb.append(getOriginalPageOffsetLast());
            sb.append(",\n            |)");
            return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u0011"}, d2 = {"Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint;", "", "pageOffset", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIIIII)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPageOffset", "getIndexInPage"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Access extends androidx.paging.ViewportHint {
        private final int indexInPage;
        private final int pageOffset;

        public Access(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6, null);
            this.pageOffset = i;
            this.indexInPage = i2;
        }

        public final int getPageOffset() {
            return this.pageOffset;
        }

        public final int getIndexInPage() {
            return this.indexInPage;
        }

        @Override // androidx.paging.ViewportHint
        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.paging.ViewportHint.Access)) {
                return false;
            }
            androidx.paging.ViewportHint.Access access = (androidx.paging.ViewportHint.Access) other;
            return this.pageOffset == access.pageOffset && this.indexInPage == access.indexInPage && getPresentedItemsBefore() == access.getPresentedItemsBefore() && getPresentedItemsAfter() == access.getPresentedItemsAfter() && getOriginalPageOffsetFirst() == access.getOriginalPageOffsetFirst() && getOriginalPageOffsetLast() == access.getOriginalPageOffsetLast();
        }

        @Override // androidx.paging.ViewportHint
        public final int hashCode() {
            return super.hashCode() + java.lang.Integer.hashCode(this.pageOffset) + java.lang.Integer.hashCode(this.indexInPage);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewportHint.Access(\n            |    pageOffset=");
            sb.append(this.pageOffset);
            sb.append(",\n            |    indexInPage=");
            sb.append(this.indexInPage);
            sb.append(",\n            |    presentedItemsBefore=");
            sb.append(getPresentedItemsBefore());
            sb.append(",\n            |    presentedItemsAfter=");
            sb.append(getPresentedItemsAfter());
            sb.append(",\n            |    originalPageOffsetFirst=");
            sb.append(getOriginalPageOffsetFirst());
            sb.append(",\n            |    originalPageOffsetLast=");
            sb.append(getOriginalPageOffsetLast());
            sb.append(",\n            |)");
            return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.paging.LoadType.values().length];
            try {
                iArr[androidx.paging.LoadType.REFRESH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.paging.LoadType.PREPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.paging.LoadType.APPEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ViewportHint(int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4);
    }
}
