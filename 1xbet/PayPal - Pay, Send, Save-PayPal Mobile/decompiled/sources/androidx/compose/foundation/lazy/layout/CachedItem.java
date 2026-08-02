package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/layout/CachedItem;", "", "key", "", "mainAxisSize", "<init>", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "setKey", "(Ljava/lang/Object;)V", com.visa.cbp.getEncExpo.warmup, "getMainAxisSize", "()I", "setMainAxisSize", "(I)V", "NoKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CachedItem {
    private java.lang.Object key;
    private int mainAxisSize;

    /* renamed from: NoKey, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.layout.CachedItem.Companion INSTANCE = new androidx.compose.foundation.lazy.layout.CachedItem.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/CachedItem$NoKey;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.CachedItem$NoKey, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CachedItem(java.lang.Object obj, int i) {
        this.key = obj;
        this.mainAxisSize = i;
    }

    public final java.lang.Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final void setKey(java.lang.Object obj) {
        this.key = obj;
    }

    public final void setMainAxisSize(int i) {
        this.mainAxisSize = i;
    }
}
