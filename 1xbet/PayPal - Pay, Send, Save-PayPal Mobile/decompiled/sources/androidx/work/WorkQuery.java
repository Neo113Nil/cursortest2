package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012BI\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0010\u0010\u000eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Landroidx/work/WorkQuery;", "", "", "Ljava/util/UUID;", "ids", "", "uniqueWorkNames", "tags", "Landroidx/work/WorkInfo$State;", "states", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "getUniqueWorkNames", "getTags", "getStates", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkQuery {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.WorkQuery.Companion INSTANCE = new androidx.work.WorkQuery.Companion(null);
    private final java.util.List<java.util.UUID> ids;
    private final java.util.List<androidx.work.WorkInfo.State> states;
    private final java.util.List<java.lang.String> tags;
    private final java.util.List<java.lang.String> uniqueWorkNames;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkQuery(java.util.List<java.util.UUID> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3, java.util.List<? extends androidx.work.WorkInfo.State> list4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "");
        this.ids = list;
        this.uniqueWorkNames = list2;
        this.tags = list3;
        this.states = list4;
    }

    public /* synthetic */ WorkQuery(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4);
    }

    public final java.util.List<java.util.UUID> getIds() {
        return this.ids;
    }

    public final java.util.List<java.lang.String> getUniqueWorkNames() {
        return this.uniqueWorkNames;
    }

    public final java.util.List<java.lang.String> getTags() {
        return this.tags;
    }

    public final java.util.List<androidx.work.WorkInfo.State> getStates() {
        return this.states;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\r\u0010\bJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Landroidx/work/WorkQuery$Builder;", "", "<init>", "()V", "", "Ljava/util/UUID;", "ids", "addIds", "(Ljava/util/List;)Landroidx/work/WorkQuery$Builder;", "", "uniqueWorkNames", "addUniqueWorkNames", "tags", "addTags", "Landroidx/work/WorkInfo$State;", "states", "addStates", "Landroidx/work/WorkQuery;", "build", "()Landroidx/work/WorkQuery;", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.work.WorkQuery.Builder.Companion INSTANCE = new androidx.work.WorkQuery.Builder.Companion(null);

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.List<java.lang.String> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.List<androidx.work.WorkInfo.State> getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.List<java.util.UUID> getHighSpeedVideoFpsRanges;

        private Builder() {
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            this.getHighSpeedVideoSizes = new java.util.ArrayList();
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        }

        public final androidx.work.WorkQuery.Builder addIds(java.util.List<java.util.UUID> ids) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ids, "");
            kotlin.collections.CollectionsKt.addAll(this.getHighSpeedVideoFpsRanges, ids);
            return this;
        }

        public final androidx.work.WorkQuery.Builder addUniqueWorkNames(java.util.List<java.lang.String> uniqueWorkNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uniqueWorkNames, "");
            kotlin.collections.CollectionsKt.addAll(this.getHighSpeedVideoFpsRangesFor, uniqueWorkNames);
            return this;
        }

        public final androidx.work.WorkQuery.Builder addTags(java.util.List<java.lang.String> tags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
            kotlin.collections.CollectionsKt.addAll(this.getHighSpeedVideoSizes, tags);
            return this;
        }

        public final androidx.work.WorkQuery.Builder addStates(java.util.List<? extends androidx.work.WorkInfo.State> states) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(states, "");
            kotlin.collections.CollectionsKt.addAll(this.getHighResolutionOutputSizeshNQ4ISI, states);
            return this;
        }

        public final androidx.work.WorkQuery build() {
            if (this.getHighSpeedVideoFpsRanges.isEmpty() && this.getHighSpeedVideoFpsRangesFor.isEmpty() && this.getHighSpeedVideoSizes.isEmpty() && this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new androidx.work.WorkQuery(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\t"}, d2 = {"Landroidx/work/WorkQuery$Builder$Companion;", "", "<init>", "()V", "", "Ljava/util/UUID;", "ids", "Landroidx/work/WorkQuery$Builder;", "fromIds", "(Ljava/util/List;)Landroidx/work/WorkQuery$Builder;", "", "uniqueWorkNames", "fromUniqueWorkNames", "tags", "fromTags", "Landroidx/work/WorkInfo$State;", "states", "fromStates"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.work.WorkQuery.Builder fromIds(java.util.List<java.util.UUID> ids) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ids, "");
                androidx.work.WorkQuery.Builder builder = new androidx.work.WorkQuery.Builder(null);
                builder.addIds(ids);
                return builder;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.work.WorkQuery.Builder fromUniqueWorkNames(java.util.List<java.lang.String> uniqueWorkNames) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uniqueWorkNames, "");
                androidx.work.WorkQuery.Builder builder = new androidx.work.WorkQuery.Builder(null);
                builder.addUniqueWorkNames(uniqueWorkNames);
                return builder;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.work.WorkQuery.Builder fromTags(java.util.List<java.lang.String> tags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
                androidx.work.WorkQuery.Builder builder = new androidx.work.WorkQuery.Builder(null);
                builder.addTags(tags);
                return builder;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.work.WorkQuery.Builder fromStates(java.util.List<? extends androidx.work.WorkInfo.State> states) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(states, "");
                androidx.work.WorkQuery.Builder builder = new androidx.work.WorkQuery.Builder(null);
                builder.addStates(states);
                return builder;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.work.WorkQuery.Builder fromUniqueWorkNames(java.util.List<java.lang.String> list) {
            return INSTANCE.fromUniqueWorkNames(list);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.work.WorkQuery.Builder fromTags(java.util.List<java.lang.String> list) {
            return INSTANCE.fromTags(list);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.work.WorkQuery.Builder fromStates(java.util.List<? extends androidx.work.WorkInfo.State> list) {
            return INSTANCE.fromStates(list);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.work.WorkQuery.Builder fromIds(java.util.List<java.util.UUID> list) {
            return INSTANCE.fromIds(list);
        }

        public /* synthetic */ Builder(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\tJ#\u0010\u000e\u001a\u00020\u00072\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\n\"\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\n\"\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\tJ\u001d\u0010\u0014\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\tJ#\u0010\u0014\u001a\u00020\u00072\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\n\"\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/work/WorkQuery$Companion;", "", "<init>", "()V", "", "Ljava/util/UUID;", "ids", "Landroidx/work/WorkQuery;", "fromIds", "(Ljava/util/List;)Landroidx/work/WorkQuery;", "", "([Ljava/util/UUID;)Landroidx/work/WorkQuery;", "", "tags", "fromTags", "([Ljava/lang/String;)Landroidx/work/WorkQuery;", "uniqueWorkNames", "fromUniqueWorkNames", "Landroidx/work/WorkInfo$State;", "states", "fromStates", "([Landroidx/work/WorkInfo$State;)Landroidx/work/WorkQuery;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.WorkQuery fromIds(java.util.List<java.util.UUID> ids) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ids, "");
            return new androidx.work.WorkQuery(ids, null, null, null, 14, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.WorkQuery fromIds(java.util.UUID... ids) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ids, "");
            return new androidx.work.WorkQuery(kotlin.collections.ArraysKt.toList(ids), null, null, null, 14, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.WorkQuery fromTags(java.util.List<java.lang.String> tags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
            return new androidx.work.WorkQuery(null, null, tags, null, 11, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.WorkQuery fromTags(java.lang.String... tags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
            return new androidx.work.WorkQuery(null, null, kotlin.collections.ArraysKt.toList(tags), null, 11, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.WorkQuery fromUniqueWorkNames(java.lang.String... uniqueWorkNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uniqueWorkNames, "");
            return new androidx.work.WorkQuery(null, kotlin.collections.ArraysKt.toList(uniqueWorkNames), null, null, 13, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.WorkQuery fromUniqueWorkNames(java.util.List<java.lang.String> uniqueWorkNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uniqueWorkNames, "");
            return new androidx.work.WorkQuery(null, uniqueWorkNames, null, null, 13, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.WorkQuery fromStates(java.util.List<? extends androidx.work.WorkInfo.State> states) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(states, "");
            return new androidx.work.WorkQuery(null, null, null, states, 7, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.WorkQuery fromStates(androidx.work.WorkInfo.State... states) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(states, "");
            return new androidx.work.WorkQuery(null, null, null, kotlin.collections.ArraysKt.toList(states), 7, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkQuery fromUniqueWorkNames(java.lang.String... strArr) {
        return INSTANCE.fromUniqueWorkNames(strArr);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkQuery fromUniqueWorkNames(java.util.List<java.lang.String> list) {
        return INSTANCE.fromUniqueWorkNames(list);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkQuery fromTags(java.lang.String... strArr) {
        return INSTANCE.fromTags(strArr);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkQuery fromTags(java.util.List<java.lang.String> list) {
        return INSTANCE.fromTags(list);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkQuery fromStates(androidx.work.WorkInfo.State... stateArr) {
        return INSTANCE.fromStates(stateArr);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkQuery fromStates(java.util.List<? extends androidx.work.WorkInfo.State> list) {
        return INSTANCE.fromStates(list);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkQuery fromIds(java.util.UUID... uuidArr) {
        return INSTANCE.fromIds(uuidArr);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkQuery fromIds(java.util.List<java.util.UUID> list) {
        return INSTANCE.fromIds(list);
    }

    public WorkQuery() {
        this(null, null, null, null, 15, null);
    }
}
