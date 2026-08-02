package androidx.compose.ui.res;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/res/ResourceIdCache;", "", "<init>", "()V", "Landroid/content/res/Resources;", "res", "", "id", "Landroid/util/TypedValue;", "resolveResourcePath", "(Landroid/content/res/Resources;I)Landroid/util/TypedValue;", "", "clear", "Landroidx/collection/MutableIntObjectMap;", "getHighSpeedVideoSizes", "Landroidx/collection/MutableIntObjectMap;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResourceIdCache {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.MutableIntObjectMap<android.util.TypedValue> getHighSpeedVideoFpsRanges = new androidx.collection.MutableIntObjectMap<>(0, 1, null);

    public final android.util.TypedValue resolveResourcePath(android.content.res.Resources res, int id) {
        android.util.TypedValue typedValue;
        synchronized (this) {
            typedValue = this.getHighSpeedVideoFpsRanges.get(id);
            if (typedValue == null) {
                typedValue = new android.util.TypedValue();
                res.getValue(id, typedValue, true);
                this.getHighSpeedVideoFpsRanges.put(id, typedValue);
            }
        }
        return typedValue;
    }

    public final void clear() {
        synchronized (this) {
            this.getHighSpeedVideoFpsRanges.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
