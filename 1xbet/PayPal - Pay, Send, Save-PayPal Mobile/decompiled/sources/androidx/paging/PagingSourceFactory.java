package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/paging/PagingSourceFactory;", "", "Key", "Value", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "invoke", "()Landroidx/paging/PagingSource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PagingSourceFactory<Key, Value> extends kotlin.jvm.functions.Function0<androidx.paging.PagingSource<Key, Value>> {
    @Override // kotlin.jvm.functions.Function0
    androidx.paging.PagingSource<Key, Value> invoke();
}
