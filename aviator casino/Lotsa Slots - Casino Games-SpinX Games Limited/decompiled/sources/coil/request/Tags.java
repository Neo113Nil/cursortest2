package coil.request;

/* compiled from: Tags.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B!\b\u0002\u0012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\tJ'\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\b0\u0004¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00010\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcoil/request/Tags;", "", "tags", "", "Ljava/lang/Class;", "<init>", "(Ljava/util/Map;)V", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "T", "()Ljava/lang/Object;", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "asMap", "equals", "", "other", "hashCode", "", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Tags {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil.request.Tags.Companion INSTANCE = new coil.request.Tags.Companion(null);
    public static final coil.request.Tags EMPTY = new coil.request.Tags(kotlin.collections.MapsKt.emptyMap());
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> tags;

    public /* synthetic */ Tags(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @kotlin.jvm.JvmStatic
    public static final coil.request.Tags from(java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> map) {
        return INSTANCE.from(map);
    }

    private Tags(java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> map) {
        this.tags = map;
    }

    public final /* synthetic */ <T> T tag() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) tag(java.lang.Object.class);
    }

    public final <T> T tag(java.lang.Class<? extends T> type) {
        return type.cast(this.tags.get(type));
    }

    public final java.util.Map<java.lang.Class<?>, java.lang.Object> asMap() {
        return this.tags;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil.request.Tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, ((coil.request.Tags) other).tags);
    }

    public int hashCode() {
        return this.tags.hashCode();
    }

    public java.lang.String toString() {
        return "Tags(tags=" + this.tags + ')';
    }

    /* compiled from: Tags.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\bH\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcoil/request/Tags$Companion;", "", "<init>", "()V", "EMPTY", "Lcoil/request/Tags;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "tags", "", "Ljava/lang/Class;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final coil.request.Tags from(java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> tags) {
            return new coil.request.Tags(coil.util.Collections.toImmutableMap(tags), null);
        }
    }
}
