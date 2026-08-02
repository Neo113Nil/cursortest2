package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/tooling/CompositionDataRecord;", "", "", "Landroidx/compose/runtime/tooling/CompositionData;", "getStore", "()Ljava/util/Set;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CompositionDataRecord {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.tooling.CompositionDataRecord.Companion INSTANCE = androidx.compose.ui.tooling.CompositionDataRecord.Companion.getHighSpeedVideoFpsRangesFor;

    java.util.Set<androidx.compose.runtime.tooling.CompositionData> getStore();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/tooling/CompositionDataRecord$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "create", "()Landroidx/compose/ui/tooling/CompositionDataRecord;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.tooling.CompositionDataRecord.Companion getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.tooling.CompositionDataRecord.Companion();

        private Companion() {
        }

        public final androidx.compose.ui.tooling.CompositionDataRecord create() {
            return new androidx.compose.ui.tooling.CompositionDataRecordImpl();
        }
    }
}
