package androidx.work;

/* compiled from: OneTimeWorkRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/work/OneTimeWorkRequest;", "Landroidx/work/WorkRequest;", "builder", "Landroidx/work/OneTimeWorkRequest$Builder;", "(Landroidx/work/OneTimeWorkRequest$Builder;)V", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class OneTimeWorkRequest extends androidx.work.WorkRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.OneTimeWorkRequest.Companion INSTANCE = new androidx.work.OneTimeWorkRequest.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.work.OneTimeWorkRequest from(java.lang.Class<? extends androidx.work.ListenableWorker> cls) {
        return INSTANCE.from(cls);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<androidx.work.OneTimeWorkRequest> from(java.util.List<? extends java.lang.Class<? extends androidx.work.ListenableWorker>> list) {
        return INSTANCE.from(list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeWorkRequest(androidx.work.OneTimeWorkRequest.Builder builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.getTags$work_runtime_release());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
    }

    /* compiled from: OneTimeWorkRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0002\b\u000bJ\u0016\u0010\f\u001a\u00020\u00002\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004R\u0014\u0010\u0007\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/OneTimeWorkRequest;", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "(Ljava/lang/Class;)V", "thisObject", "getThisObject$work_runtime_release", "()Landroidx/work/OneTimeWorkRequest$Builder;", "buildInternal", "buildInternal$work_runtime_release", "setInputMerger", "inputMerger", "Landroidx/work/InputMerger;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder extends androidx.work.WorkRequest.Builder<androidx.work.OneTimeWorkRequest.Builder, androidx.work.OneTimeWorkRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public androidx.work.OneTimeWorkRequest.Builder getThisObject$work_runtime_release() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass) {
            super(workerClass);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            getWorkSpec().inputMergerClassName = androidx.work.OverwritingInputMerger.class.getName();
        }

        public final androidx.work.OneTimeWorkRequest.Builder setInputMerger(java.lang.Class<? extends androidx.work.InputMerger> inputMerger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMerger, "inputMerger");
            getWorkSpec().inputMergerClassName = inputMerger.getName();
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public androidx.work.OneTimeWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet() && android.os.Build.VERSION.SDK_INT >= 23 && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            return new androidx.work.OneTimeWorkRequest(this);
        }
    }

    /* compiled from: OneTimeWorkRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0007J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Companion;", "", "()V", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "Landroidx/work/OneTimeWorkRequest;", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "", "workerClasses", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.OneTimeWorkRequest from(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return new androidx.work.OneTimeWorkRequest.Builder(workerClass).build();
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<androidx.work.OneTimeWorkRequest> from(java.util.List<? extends java.lang.Class<? extends androidx.work.ListenableWorker>> workerClasses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClasses, "workerClasses");
            java.util.List<? extends java.lang.Class<? extends androidx.work.ListenableWorker>> list = workerClasses;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class) it.next()).build());
            }
            return arrayList;
        }
    }
}
