package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataMigrationInitializer.kt */
@kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
/* loaded from: classes2.dex */
final class DataMigrationInitializer$Companion$runMigrations$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> $cleanUps;
    final /* synthetic */ java.util.List<androidx.datastore.core.DataMigration<T>> $migrations;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataMigrationInitializer$Companion$runMigrations$2(java.util.List<? extends androidx.datastore.core.DataMigration<T>> list, java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2> continuation) {
        super(2, continuation);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return invoke((androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2<T>) obj, (kotlin.coroutines.Continuation<? super androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2<T>>) obj2);
    }

    public final java.lang.Object invoke(T t, kotlin.coroutines.Continuation<? super T> continuation) {
        return ((androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2) create(t, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list;
        java.util.Iterator<T> it;
        androidx.datastore.core.DataMigration dataMigration;
        java.util.Iterator<T> it2;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            obj = this.L$0;
            java.util.List<androidx.datastore.core.DataMigration<T>> list2 = this.$migrations;
            list = this.$cleanUps;
            it = list2.iterator();
        } else if (i == 1) {
            obj2 = this.L$3;
            androidx.datastore.core.DataMigration dataMigration2 = (androidx.datastore.core.DataMigration) this.L$2;
            it2 = (java.util.Iterator) this.L$1;
            java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list3 = (java.util.List) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            dataMigration = dataMigration2;
            list = list3;
            if (((java.lang.Boolean) obj).booleanValue()) {
                obj = obj2;
                it = it2;
            } else {
                list.add(new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1(dataMigration, null));
                this.L$0 = list;
                this.L$1 = it2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = dataMigration.migrate(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = it2;
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.L$1;
            list = (java.util.List) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!it.hasNext()) {
            androidx.datastore.core.DataMigration dataMigration3 = (androidx.datastore.core.DataMigration) it.next();
            this.L$0 = list;
            this.L$1 = it;
            this.L$2 = dataMigration3;
            this.L$3 = obj;
            this.label = 1;
            java.lang.Object shouldMigrate = dataMigration3.shouldMigrate(obj, this);
            if (shouldMigrate == coroutine_suspended) {
                return coroutine_suspended;
            }
            java.util.Iterator<T> it3 = it;
            obj2 = obj;
            obj = shouldMigrate;
            dataMigration = dataMigration3;
            it2 = it3;
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
            if (!it.hasNext()) {
                return obj;
            }
        }
    }
}
