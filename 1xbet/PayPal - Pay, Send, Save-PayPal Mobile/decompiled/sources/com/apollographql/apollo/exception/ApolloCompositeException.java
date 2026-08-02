package com.apollographql.apollo.exception;

@kotlin.Deprecated(message = "ApolloCompositeException is deprecated. Handle each ApolloResponse.exception instead.")
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0017\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloCompositeException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "first", "second", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "exceptions", "(Ljava/util/List;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloCompositeException extends com.apollographql.apollo.exception.ApolloException {
    public ApolloCompositeException(java.lang.Throwable th, java.lang.Throwable th2) {
        super("Multiple exceptions happened", th2, null);
        if (th != null) {
            kotlin.ExceptionsKt.addSuppressed(this, th);
        }
        if (th2 != null) {
            kotlin.ExceptionsKt.addSuppressed(this, th2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCompositeException(java.util.List<? extends java.lang.Throwable> list) {
        super("Multiple exceptions happened", (java.lang.Throwable) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.ExceptionsKt.addSuppressed(this, (java.lang.Throwable) it.next());
        }
    }
}
