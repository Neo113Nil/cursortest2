package kotlinx.coroutines.sync;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\t\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR(\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\u000e8'X§\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/coroutines/sync/Mutex;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "tryLock", "(Ljava/lang/Object;)Z", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "holdsLock", "unlock", "(Ljava/lang/Object;)V", "isLocked", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock$annotations", "()V", "onLock"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Mutex {
    kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> getOnLock();

    boolean holdsLock(java.lang.Object owner);

    boolean isLocked();

    java.lang.Object lock(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    boolean tryLock(java.lang.Object owner);

    void unlock(java.lang.Object owner);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void getOnLock$annotations() {
        }

        public static /* synthetic */ boolean tryLock$default(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return mutex.tryLock(obj);
        }

        public static /* synthetic */ java.lang.Object lock$default(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return mutex.lock(obj, continuation);
        }

        public static /* synthetic */ void unlock$default(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            mutex.unlock(obj);
        }
    }
}
