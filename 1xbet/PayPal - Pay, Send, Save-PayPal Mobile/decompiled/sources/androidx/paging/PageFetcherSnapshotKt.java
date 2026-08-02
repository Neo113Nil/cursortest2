package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/paging/GenerationalViewportHint;", "previous", "Landroidx/paging/LoadType;", "loadType", "", "shouldPrioritizeOver", "(Landroidx/paging/GenerationalViewportHint;Landroidx/paging/GenerationalViewportHint;Landroidx/paging/LoadType;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PageFetcherSnapshotKt {
    public static final boolean shouldPrioritizeOver(androidx.paging.GenerationalViewportHint generationalViewportHint, androidx.paging.GenerationalViewportHint generationalViewportHint2, androidx.paging.LoadType loadType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generationalViewportHint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generationalViewportHint2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        if (generationalViewportHint.getGenerationId() > generationalViewportHint2.getGenerationId()) {
            return true;
        }
        if (generationalViewportHint.getGenerationId() < generationalViewportHint2.getGenerationId()) {
            return false;
        }
        return androidx.paging.HintHandlerKt.shouldPrioritizeOver(generationalViewportHint.getHint(), generationalViewportHint2.getHint(), loadType);
    }
}
