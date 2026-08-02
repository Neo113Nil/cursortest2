package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/work/OneTimeWorkRequest;", "Landroidx/work/WorkRequest;", "Landroidx/work/OneTimeWorkRequest$Builder;", "builder", "<init>", "(Landroidx/work/OneTimeWorkRequest$Builder;)V", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OneTimeWorkRequest extends androidx.work.WorkRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.OneTimeWorkRequest.Companion INSTANCE = new androidx.work.OneTimeWorkRequest.Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeWorkRequest(androidx.work.OneTimeWorkRequest.Builder builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.getTags$work_runtime_release());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b¢\u0006\u0004\b\u0006\u0010\tJ\u001d\u0010\f\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00008QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/OneTimeWorkRequest;", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "Landroidx/work/InputMerger;", "inputMerger", "setInputMerger", "(Ljava/lang/Class;)Landroidx/work/OneTimeWorkRequest$Builder;", "buildInternal$work_runtime_release", "()Landroidx/work/OneTimeWorkRequest;", "getThisObject$work_runtime_release", "()Landroidx/work/OneTimeWorkRequest$Builder;", "thisObject"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder extends androidx.work.WorkRequest.Builder<androidx.work.OneTimeWorkRequest.Builder, androidx.work.OneTimeWorkRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public final androidx.work.OneTimeWorkRequest.Builder getThisObject$work_runtime_release() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> cls) {
            super(cls);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(kotlin.reflect.KClass<? extends androidx.work.ListenableWorker> kClass) {
            this((java.lang.Class<? extends androidx.work.ListenableWorker>) kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        }

        public final androidx.work.OneTimeWorkRequest.Builder setInputMerger(java.lang.Class<? extends androidx.work.InputMerger> inputMerger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMerger, "");
            androidx.work.impl.model.WorkSpec workSpec = getWorkSpec();
            java.lang.String name2 = inputMerger.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            workSpec.inputMergerClassName = name2;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public final androidx.work.OneTimeWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getCamera2StreamConfigurationMap()) {
                throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            return new androidx.work.OneTimeWorkRequest(this);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\nH\u0007¢\u0006\u0004\b\b\u0010\f"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "workerClass", "Landroidx/work/OneTimeWorkRequest;", "from", "(Ljava/lang/Class;)Landroidx/work/OneTimeWorkRequest;", "", "workerClasses", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.OneTimeWorkRequest from(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClass, "");
            return new androidx.work.OneTimeWorkRequest.Builder(workerClass).build();
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<androidx.work.OneTimeWorkRequest> from(java.util.List<? extends java.lang.Class<? extends androidx.work.ListenableWorker>> workerClasses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClasses, "");
            java.util.List<? extends java.lang.Class<? extends androidx.work.ListenableWorker>> list = workerClasses;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) it.next()).build());
            }
            return arrayList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<androidx.work.OneTimeWorkRequest> from(java.util.List<? extends java.lang.Class<? extends androidx.work.ListenableWorker>> list) {
        return INSTANCE.from(list);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.OneTimeWorkRequest from(java.lang.Class<? extends androidx.work.ListenableWorker> cls) {
        return INSTANCE.from(cls);
    }
}
