package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {41, 43}, m = "invokeSuspend", n = {"migration", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, s = {"L$2", "L$3"}, v = 1)
/* loaded from: classes3.dex */
final class DataMigrationInitializer$Companion$runMigrations$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ java.util.List<androidx.content.core.DataMigration<T>> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list;
        java.util.Iterator<T> it;
        androidx.content.core.DataMigration dataMigration;
        java.util.Iterator<T> it2;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            obj = this.getHighSpeedVideoFpsRanges;
            java.util.List<androidx.content.core.DataMigration<T>> list2 = this.Camera2StreamConfigurationMap;
            list = this.getHighResolutionOutputSizeshNQ4ISI;
            it = list2.iterator();
        } else if (i == 1) {
            obj2 = this.getInputFormats;
            androidx.content.core.DataMigration dataMigration2 = (androidx.content.core.DataMigration) this.getHighSpeedVideoSizes;
            it2 = (java.util.Iterator) this.getHighSpeedVideoFpsRangesFor;
            java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list3 = (java.util.List) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            dataMigration = dataMigration2;
            list = list3;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                list.add(new androidx.content.core.DataMigrationInitializer$Companion$runMigrations$2$1$1(dataMigration, null));
                this.getHighSpeedVideoFpsRanges = list;
                this.getHighSpeedVideoFpsRangesFor = it2;
                this.getHighSpeedVideoSizes = null;
                this.getInputFormats = null;
                this.getHighSpeedVideoSizesFor = 2;
                obj = dataMigration.migrate(obj2, this);
                if (obj != coroutine_suspended) {
                    it = it2;
                }
                return coroutine_suspended;
            }
            obj = obj2;
            it = it2;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.getHighSpeedVideoFpsRangesFor;
            list = (java.util.List) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!it.hasNext()) {
            androidx.content.core.DataMigration dataMigration3 = (androidx.content.core.DataMigration) it.next();
            this.getHighSpeedVideoFpsRanges = list;
            this.getHighSpeedVideoFpsRangesFor = it;
            this.getHighSpeedVideoSizes = dataMigration3;
            this.getInputFormats = obj;
            this.getHighSpeedVideoSizesFor = 1;
            java.lang.Object shouldMigrate = dataMigration3.shouldMigrate(obj, this);
            if (shouldMigrate != coroutine_suspended) {
                java.util.Iterator<T> it3 = it;
                obj2 = obj;
                obj = shouldMigrate;
                dataMigration = dataMigration3;
                it2 = it3;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return coroutine_suspended;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.content.core.DataMigrationInitializer$Companion$runMigrations$2) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.core.DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new androidx.content.core.DataMigrationInitializer$Companion$runMigrations$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.getHighSpeedVideoFpsRanges = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataMigrationInitializer$Companion$runMigrations$2(java.util.List<? extends androidx.content.core.DataMigration<T>> list, java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list2, kotlin.coroutines.Continuation<? super androidx.content.core.DataMigrationInitializer$Companion$runMigrations$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = list;
        this.getHighResolutionOutputSizeshNQ4ISI = list2;
    }
}
