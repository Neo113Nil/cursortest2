package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "array", "<init>", "([J)V", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "id", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(J)V", "toArray", "()[J", "Landroidx/collection/MutableLongList;", "getHighSpeedVideoSizes", "Landroidx/collection/MutableLongList;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapshotIdArrayBuilder {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.MutableLongList Camera2StreamConfigurationMap;

    public SnapshotIdArrayBuilder(long[] jArr) {
        androidx.collection.MutableLongList mutableLongList;
        if (jArr != null) {
            long[] copyOf = java.util.Arrays.copyOf(jArr, jArr.length);
            mutableLongList = new androidx.collection.MutableLongList(copyOf.length);
            mutableLongList.addAll(mutableLongList._size, copyOf);
        } else {
            mutableLongList = new androidx.collection.MutableLongList(0, 1, null);
        }
        this.Camera2StreamConfigurationMap = mutableLongList;
    }

    public final void add(long id) {
        this.Camera2StreamConfigurationMap.add(id);
    }

    public final long[] toArray() {
        int i = this.Camera2StreamConfigurationMap._size;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        androidx.collection.MutableLongList mutableLongList = this.Camera2StreamConfigurationMap;
        long[] jArr2 = mutableLongList.content;
        int i2 = mutableLongList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = jArr2[i3];
        }
        return jArr;
    }
}
