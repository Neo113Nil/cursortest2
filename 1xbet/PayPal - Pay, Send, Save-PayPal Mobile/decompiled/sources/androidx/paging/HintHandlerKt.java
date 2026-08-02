package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/paging/ViewportHint;", "previous", "Landroidx/paging/LoadType;", "loadType", "", "shouldPrioritizeOver", "(Landroidx/paging/ViewportHint;Landroidx/paging/ViewportHint;Landroidx/paging/LoadType;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HintHandlerKt {
    public static final boolean shouldPrioritizeOver(androidx.paging.ViewportHint viewportHint, androidx.paging.ViewportHint viewportHint2, androidx.paging.LoadType loadType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewportHint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        if (viewportHint2 == null) {
            return true;
        }
        if ((viewportHint2 instanceof androidx.paging.ViewportHint.Initial) && (viewportHint instanceof androidx.paging.ViewportHint.Access)) {
            return true;
        }
        if ((viewportHint instanceof androidx.paging.ViewportHint.Initial) && (viewportHint2 instanceof androidx.paging.ViewportHint.Access)) {
            return false;
        }
        return (viewportHint.getOriginalPageOffsetFirst() == viewportHint2.getOriginalPageOffsetFirst() && viewportHint.getOriginalPageOffsetLast() == viewportHint2.getOriginalPageOffsetLast() && viewportHint2.presentedItemsBeyondAnchor$paging_common(loadType) <= viewportHint.presentedItemsBeyondAnchor$paging_common(loadType)) ? false : true;
    }
}
