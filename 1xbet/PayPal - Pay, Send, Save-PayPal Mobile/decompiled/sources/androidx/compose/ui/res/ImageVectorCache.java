package androidx.compose.ui.res;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0003R<\u0010\u0015\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u0012j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache;", "", "<init>", "()V", "Landroidx/compose/ui/res/ImageVectorCache$Key;", "key", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "get", "(Landroidx/compose/ui/res/ImageVectorCache$Key;)Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "configChanges", "", "prune", "(I)V", "imageVectorEntry", "set", "(Landroidx/compose/ui/res/ImageVectorCache$Key;Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;)V", "clear", "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "getHighSpeedVideoSizes", "Ljava/util/HashMap;", "Key", "ImageVectorEntry"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageVectorCache {
    public static final int $stable = 8;
    private final java.util.HashMap<androidx.compose.ui.res.ImageVectorCache.Key, java.lang.ref.WeakReference<androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry>> getHighSpeedVideoSizes = new java.util.HashMap<>();

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u00060\u0002R\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache$Key;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "", "id", "<init>", "(Landroid/content/res/Resources$Theme;I)V", "component1", "()Landroid/content/res/Resources$Theme;", "component2", "()I", "copy", "(Landroid/content/res/Resources$Theme;I)Landroidx/compose/ui/res/ImageVectorCache$Key;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/content/res/Resources$Theme;", "getTheme", com.visa.cbp.getEncExpo.warmup, "getId"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Key {
        public static final int $stable = 8;
        private final int id;
        private final android.content.res.Resources.Theme theme;

        public Key(android.content.res.Resources.Theme theme, int i) {
            this.theme = theme;
            this.id = i;
        }

        public final int getId() {
            return this.id;
        }

        public final android.content.res.Resources.Theme getTheme() {
            return this.theme;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key(theme=");
            sb.append(this.theme);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.theme.hashCode() * 31) + java.lang.Integer.hashCode(this.id);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.res.ImageVectorCache.Key)) {
                return false;
            }
            androidx.compose.ui.res.ImageVectorCache.Key key = (androidx.compose.ui.res.ImageVectorCache.Key) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.theme, key.theme) && this.id == key.id;
        }

        public final androidx.compose.ui.res.ImageVectorCache.Key copy(android.content.res.Resources.Theme theme, int id) {
            return new androidx.compose.ui.res.ImageVectorCache.Key(theme, id);
        }

        /* renamed from: component2, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final android.content.res.Resources.Theme getTheme() {
            return this.theme;
        }

        public static /* synthetic */ androidx.compose.ui.res.ImageVectorCache.Key copy$default(androidx.compose.ui.res.ImageVectorCache.Key key, android.content.res.Resources.Theme theme, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                theme = key.theme;
            }
            if ((i2 & 2) != 0) {
                i = key.id;
            }
            return key.copy(theme, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "configFlags", "<init>", "(Landroidx/compose/ui/graphics/vector/ImageVector;I)V", "component1", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component2", "()I", "copy", "(Landroidx/compose/ui/graphics/vector/ImageVector;I)Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getImageVector", com.visa.cbp.getEncExpo.warmup, "getConfigFlags"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ImageVectorEntry {
        public static final int $stable = 0;
        private final int configFlags;
        private final androidx.compose.ui.graphics.vector.ImageVector imageVector;

        public ImageVectorEntry(androidx.compose.ui.graphics.vector.ImageVector imageVector, int i) {
            this.imageVector = imageVector;
            this.configFlags = i;
        }

        public final int getConfigFlags() {
            return this.configFlags;
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getImageVector() {
            return this.imageVector;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.imageVector);
            sb.append(", configFlags=");
            sb.append(this.configFlags);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.imageVector.hashCode() * 31) + java.lang.Integer.hashCode(this.configFlags);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry)) {
                return false;
            }
            androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry = (androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
        }

        public final androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry copy(androidx.compose.ui.graphics.vector.ImageVector imageVector, int configFlags) {
            return new androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry(imageVector, configFlags);
        }

        /* renamed from: component2, reason: from getter */
        public final int getConfigFlags() {
            return this.configFlags;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.graphics.vector.ImageVector getImageVector() {
            return this.imageVector;
        }

        public static /* synthetic */ androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry copy$default(androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry, androidx.compose.ui.graphics.vector.ImageVector imageVector, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                imageVector = imageVectorEntry.imageVector;
            }
            if ((i2 & 2) != 0) {
                i = imageVectorEntry.configFlags;
            }
            return imageVectorEntry.copy(imageVector, i);
        }
    }

    public final androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry get(androidx.compose.ui.res.ImageVectorCache.Key key) {
        java.lang.ref.WeakReference<androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry> weakReference = this.getHighSpeedVideoSizes.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void prune(int configChanges) {
        java.util.Iterator<java.util.Map.Entry<androidx.compose.ui.res.ImageVectorCache.Key, java.lang.ref.WeakReference<androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry>>> it = this.getHighSpeedVideoSizes.entrySet().iterator();
        while (it.hasNext()) {
            androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry = it.next().getValue().get();
            if (imageVectorEntry == null || android.content.res.Configuration.needNewResources(configChanges, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(androidx.compose.ui.res.ImageVectorCache.Key key, androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry) {
        this.getHighSpeedVideoSizes.put(key, new java.lang.ref.WeakReference<>(imageVectorEntry));
    }

    public final void clear() {
        this.getHighSpeedVideoSizes.clear();
    }
}
