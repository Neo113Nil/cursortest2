package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.contracts.ExperimentalContracts;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aJ\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0081\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"R", "Lkotlinx/coroutines/sync/a;", "", "owner", "Lkotlin/Function1;", "", "block", "withTryLock", "(Lkotlinx/coroutines/sync/a;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutexUtilsKt {
    @ExperimentalContracts
    public static final <R> R withTryLock(kotlinx.coroutines.sync.a aVar, Object obj, Function1<? super Boolean, ? extends R> block) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean a = aVar.a(obj);
        try {
            return block.invoke(Boolean.valueOf(a));
        } finally {
            InlineMarker.finallyStart(1);
            if (a) {
                aVar.c(obj);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object withTryLock$default(kotlinx.coroutines.sync.a aVar, Object obj, Function1 block, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean a = aVar.a(obj);
        try {
            return block.invoke(Boolean.valueOf(a));
        } finally {
            InlineMarker.finallyStart(1);
            if (a) {
                aVar.c(obj);
            }
            InlineMarker.finallyEnd(1);
        }
    }
}
