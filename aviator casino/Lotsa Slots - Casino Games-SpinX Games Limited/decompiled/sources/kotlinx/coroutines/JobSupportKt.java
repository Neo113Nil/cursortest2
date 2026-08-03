package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"boxIncomplete", "", "unboxState", "COMPLETING_ALREADY", "Lkotlinx/coroutines/internal/Symbol;", "COMPLETING_WAITING_CHILDREN", "COMPLETING_RETRY", "TOO_LATE_TO_CANCEL", "RETRY", "", "FALSE", "TRUE", "SEALED", "EMPTY_NEW", "Lkotlinx/coroutines/Empty;", "EMPTY_ACTIVE", "LIST_ON_COMPLETION_PERMISSION", "LIST_CHILD_PERMISSION", "LIST_CANCELLATION_PERMISSION", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JobSupportKt {
    private static final int FALSE = 0;
    private static final int LIST_CANCELLATION_PERMISSION = 4;
    private static final int LIST_CHILD_PERMISSION = 2;
    private static final int LIST_ON_COMPLETION_PERMISSION = 1;
    private static final int RETRY = -1;
    private static final int TRUE = 1;
    private static final kotlinx.coroutines.internal.Symbol COMPLETING_ALREADY = new kotlinx.coroutines.internal.Symbol("COMPLETING_ALREADY");
    public static final kotlinx.coroutines.internal.Symbol COMPLETING_WAITING_CHILDREN = new kotlinx.coroutines.internal.Symbol("COMPLETING_WAITING_CHILDREN");
    private static final kotlinx.coroutines.internal.Symbol COMPLETING_RETRY = new kotlinx.coroutines.internal.Symbol("COMPLETING_RETRY");
    private static final kotlinx.coroutines.internal.Symbol TOO_LATE_TO_CANCEL = new kotlinx.coroutines.internal.Symbol("TOO_LATE_TO_CANCEL");
    private static final kotlinx.coroutines.internal.Symbol SEALED = new kotlinx.coroutines.internal.Symbol("SEALED");
    private static final kotlinx.coroutines.Empty EMPTY_NEW = new kotlinx.coroutines.Empty(false);
    private static final kotlinx.coroutines.Empty EMPTY_ACTIVE = new kotlinx.coroutines.Empty(true);

    public static final java.lang.Object boxIncomplete(java.lang.Object obj) {
        return obj instanceof kotlinx.coroutines.Incomplete ? new kotlinx.coroutines.IncompleteStateBox((kotlinx.coroutines.Incomplete) obj) : obj;
    }

    public static final java.lang.Object unboxState(java.lang.Object obj) {
        kotlinx.coroutines.Incomplete incomplete;
        kotlinx.coroutines.IncompleteStateBox incompleteStateBox = obj instanceof kotlinx.coroutines.IncompleteStateBox ? (kotlinx.coroutines.IncompleteStateBox) obj : null;
        return (incompleteStateBox == null || (incomplete = incompleteStateBox.state) == null) ? obj : incomplete;
    }
}
