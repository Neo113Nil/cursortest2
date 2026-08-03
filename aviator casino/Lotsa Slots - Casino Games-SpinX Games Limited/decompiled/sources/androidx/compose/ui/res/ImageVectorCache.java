package androidx.compose.ui.res;

/* compiled from: VectorResources.android.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0019\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H\u0086\u0002R6\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache;", "", "()V", "map", "Ljava/util/HashMap;", "Landroidx/compose/ui/res/ImageVectorCache$Key;", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "Lkotlin/collections/HashMap;", "clear", "", "get", com.ironsource.X3.i.W, "prune", "configChanges", "", "set", "imageVectorEntry", "ImageVectorEntry", "Key", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageVectorCache {
    public static final int $stable = 8;
    private final java.util.HashMap<androidx.compose.ui.res.ImageVectorCache.Key, java.lang.ref.WeakReference<androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry>> map = new java.util.HashMap<>();

    /* compiled from: VectorResources.android.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00060\u0003R\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003R\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache$Key;", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "id", "", "(Landroid/content/res/Resources$Theme;I)V", "getId", "()I", "getTheme", "()Landroid/content/res/Resources$Theme;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Key {
        public static final int $stable = 8;
        private final int id;
        private final android.content.res.Resources.Theme theme;

        public static /* synthetic */ androidx.compose.ui.res.ImageVectorCache.Key copy$default(androidx.compose.ui.res.ImageVectorCache.Key key, android.content.res.Resources.Theme theme, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                theme = key.theme;
            }
            if ((i2 & 2) != 0) {
                i = key.id;
            }
            return key.copy(theme, i);
        }

        /* renamed from: component1, reason: from getter */
        public final android.content.res.Resources.Theme getTheme() {
            return this.theme;
        }

        /* renamed from: component2, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final androidx.compose.ui.res.ImageVectorCache.Key copy(android.content.res.Resources.Theme theme, int id) {
            return new androidx.compose.ui.res.ImageVectorCache.Key(theme, id);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.res.ImageVectorCache.Key)) {
                return false;
            }
            androidx.compose.ui.res.ImageVectorCache.Key key = (androidx.compose.ui.res.ImageVectorCache.Key) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.theme, key.theme) && this.id == key.id;
        }

        public int hashCode() {
            return (this.theme.hashCode() * 31) + this.id;
        }

        public java.lang.String toString() {
            return "Key(theme=" + this.theme + ", id=" + this.id + ')';
        }

        public Key(android.content.res.Resources.Theme theme, int i) {
            this.theme = theme;
            this.id = i;
        }

        public final android.content.res.Resources.Theme getTheme() {
            return this.theme;
        }

        public final int getId() {
            return this.id;
        }
    }

    /* compiled from: VectorResources.android.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "configFlags", "", "(Landroidx/compose/ui/graphics/vector/ImageVector;I)V", "getConfigFlags", "()I", "getImageVector", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ImageVectorEntry {
        public static final int $stable = 0;
        private final int configFlags;
        private final androidx.compose.ui.graphics.vector.ImageVector imageVector;

        public static /* synthetic */ androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry copy$default(androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry, androidx.compose.ui.graphics.vector.ImageVector imageVector, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                imageVector = imageVectorEntry.imageVector;
            }
            if ((i2 & 2) != 0) {
                i = imageVectorEntry.configFlags;
            }
            return imageVectorEntry.copy(imageVector, i);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.graphics.vector.ImageVector getImageVector() {
            return this.imageVector;
        }

        /* renamed from: component2, reason: from getter */
        public final int getConfigFlags() {
            return this.configFlags;
        }

        public final androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry copy(androidx.compose.ui.graphics.vector.ImageVector imageVector, int configFlags) {
            return new androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry(imageVector, configFlags);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry)) {
                return false;
            }
            androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry = (androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
        }

        public int hashCode() {
            return (this.imageVector.hashCode() * 31) + this.configFlags;
        }

        public java.lang.String toString() {
            return "ImageVectorEntry(imageVector=" + this.imageVector + ", configFlags=" + this.configFlags + ')';
        }

        public ImageVectorEntry(androidx.compose.ui.graphics.vector.ImageVector imageVector, int i) {
            this.imageVector = imageVector;
            this.configFlags = i;
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getImageVector() {
            return this.imageVector;
        }

        public final int getConfigFlags() {
            return this.configFlags;
        }
    }

    public final androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry get(androidx.compose.ui.res.ImageVectorCache.Key key) {
        java.lang.ref.WeakReference<androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry> weakReference = this.map.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void prune(int configChanges) {
        java.util.Iterator<java.util.Map.Entry<androidx.compose.ui.res.ImageVectorCache.Key, java.lang.ref.WeakReference<androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry = it.next().getValue().get();
            if (imageVectorEntry == null || android.content.res.Configuration.needNewResources(configChanges, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(androidx.compose.ui.res.ImageVectorCache.Key key, androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry) {
        this.map.put(key, new java.lang.ref.WeakReference<>(imageVectorEntry));
    }

    public final void clear() {
        this.map.clear();
    }
}
