package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006BA\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/datetime/format/DayOfWeekNames;", "", "", "", "names", "<init>", "(Ljava/util/List;)V", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/List;", "getNames", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DayOfWeekNames {
    private final java.util.List<java.lang.String> names;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.format.DayOfWeekNames.Companion INSTANCE = new kotlinx.datetime.format.DayOfWeekNames.Companion(null);
    private static final kotlinx.datetime.format.DayOfWeekNames ENGLISH_FULL = new kotlinx.datetime.format.DayOfWeekNames(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
    private static final kotlinx.datetime.format.DayOfWeekNames ENGLISH_ABBREVIATED = new kotlinx.datetime.format.DayOfWeekNames(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}));

    public DayOfWeekNames(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.names = list;
        if (list.size() != 7) {
            throw new java.lang.IllegalArgumentException("Day of week names must contain exactly 7 elements".toString());
        }
        java.util.Iterator<java.lang.Integer> it = kotlin.collections.CollectionsKt.getIndices(list).iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
            if (this.names.get(nextInt).length() <= 0) {
                throw new java.lang.IllegalArgumentException("A day-of-week name can not be empty".toString());
            }
            for (int i = 0; i < nextInt; i++) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.names.get(nextInt), this.names.get(i))) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Day-of-week names must be unique, but '");
                    sb.append(this.names.get(nextInt));
                    sb.append("' was repeated");
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
            }
        }
    }

    public final java.util.List<java.lang.String> getNames() {
        return this.names;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DayOfWeekNames(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{str, str2, str3, str4, str5, str6, str7}));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lkotlinx/datetime/format/DayOfWeekNames$Companion;", "", "<init>", "()V", "Lkotlinx/datetime/format/DayOfWeekNames;", "ENGLISH_FULL", "Lkotlinx/datetime/format/DayOfWeekNames;", "getENGLISH_FULL", "()Lkotlinx/datetime/format/DayOfWeekNames;", "ENGLISH_ABBREVIATED", "getENGLISH_ABBREVIATED"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.datetime.format.DayOfWeekNames getENGLISH_FULL() {
            return kotlinx.datetime.format.DayOfWeekNames.ENGLISH_FULL;
        }

        public final kotlinx.datetime.format.DayOfWeekNames getENGLISH_ABBREVIATED() {
            return kotlinx.datetime.format.DayOfWeekNames.ENGLISH_ABBREVIATED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.names, ", ", "DayOfWeekNames(", ")", 0, null, kotlinx.datetime.format.DayOfWeekNames$toString$1.getHighSpeedVideoFpsRanges, 24, null);
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.datetime.format.DayOfWeekNames) && kotlin.jvm.internal.Intrinsics.areEqual(this.names, ((kotlinx.datetime.format.DayOfWeekNames) other).names);
    }

    public final int hashCode() {
        return this.names.hashCode();
    }
}
