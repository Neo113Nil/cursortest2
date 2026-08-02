package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a$\u0010\b\u001a\u00020\u0002*\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/work/ListenableWorker;", "W", "Landroidx/work/OneTimeWorkRequest$Builder;", "OneTimeWorkRequestBuilder", "()Landroidx/work/OneTimeWorkRequest$Builder;", "Lkotlin/reflect/KClass;", "Landroidx/work/InputMerger;", "inputMerger", "setInputMerger", "(Landroidx/work/OneTimeWorkRequest$Builder;Lkotlin/reflect/KClass;)Landroidx/work/OneTimeWorkRequest$Builder;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OneTimeWorkRequestKt {
    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "W");
        return new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.ListenableWorker.class);
    }

    public static final androidx.work.OneTimeWorkRequest.Builder setInputMerger(androidx.work.OneTimeWorkRequest.Builder builder, kotlin.reflect.KClass<? extends androidx.work.InputMerger> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return builder.setInputMerger(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
    }
}
