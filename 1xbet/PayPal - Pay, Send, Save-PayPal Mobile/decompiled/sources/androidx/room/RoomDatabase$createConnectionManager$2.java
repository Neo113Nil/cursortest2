package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class RoomDatabase$createConnectionManager$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Object>, ? extends java.lang.Object>, kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Object>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return androidx.room.RoomDatabaseKt.compatTransactionCoroutineExecute((androidx.room.RoomDatabase) this.receiver, function1, continuation);
    }

    RoomDatabase$createConnectionManager$2(java.lang.Object obj) {
        super(2, obj, androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }
}
