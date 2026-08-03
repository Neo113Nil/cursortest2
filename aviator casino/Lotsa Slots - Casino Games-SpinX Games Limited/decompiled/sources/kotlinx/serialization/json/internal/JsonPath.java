package kotlinx.serialization.json.internal;

/* compiled from: JsonPath.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0016R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "<init>", "()V", "currentObjectPath", "", "[Ljava/lang/Object;", "indicies", "", "currentDepth", "", "pushDescriptor", "", com.ironsource.M6.z0, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "updateDescriptorIndex", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "updateCurrentMapKey", com.ironsource.X3.i.W, "resetCurrentMapKey", "popDescriptor", "getPath", "", "prettyString", "it", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "toString", "Tombstone", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonPath {
    private int currentDepth;
    private java.lang.Object[] currentObjectPath = new java.lang.Object[8];
    private int[] indicies;

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    /* compiled from: JsonPath.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath$Tombstone;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Tombstone {
        public static final kotlinx.serialization.json.internal.JsonPath.Tombstone INSTANCE = new kotlinx.serialization.json.internal.JsonPath.Tombstone();

        private Tombstone() {
        }
    }

    public final void pushDescriptor(kotlinx.serialization.descriptors.SerialDescriptor sd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sd, "sd");
        int i = this.currentDepth + 1;
        this.currentDepth = i;
        if (i == this.currentObjectPath.length) {
            resize();
        }
        this.currentObjectPath[i] = sd;
    }

    public final void updateDescriptorIndex(int index) {
        this.indicies[this.currentDepth] = index;
    }

    public final void updateCurrentMapKey(java.lang.Object key) {
        int[] iArr = this.indicies;
        int i = this.currentDepth;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.currentDepth = i2;
            if (i2 == this.currentObjectPath.length) {
                resize();
            }
        }
        java.lang.Object[] objArr = this.currentObjectPath;
        int i3 = this.currentDepth;
        objArr[i3] = key;
        this.indicies[i3] = -2;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.indicies;
        int i = this.currentDepth;
        if (iArr[i] == -2) {
            this.currentObjectPath[i] = kotlinx.serialization.json.internal.JsonPath.Tombstone.INSTANCE;
        }
    }

    public final void popDescriptor() {
        int i = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.currentDepth = i - 1;
        }
        int i2 = this.currentDepth;
        if (i2 != -1) {
            this.currentDepth = i2 - 1;
        }
    }

    public final java.lang.String getPath() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        int i = this.currentDepth + 1;
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.Object obj = this.currentObjectPath[i2];
            if (obj instanceof kotlinx.serialization.descriptors.SerialDescriptor) {
                kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE)) {
                    if (this.indicies[i2] != -1) {
                        sb.append(com.ironsource.X3.j.d);
                        sb.append(this.indicies[i2]);
                        sb.append(com.ironsource.X3.j.e);
                    }
                } else {
                    int i3 = this.indicies[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.getElementName(i3));
                    }
                }
            } else if (obj != kotlinx.serialization.json.internal.JsonPath.Tombstone.INSTANCE) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    private final java.lang.String prettyString(java.lang.Object it) {
        java.lang.String serialName;
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = it instanceof kotlinx.serialization.descriptors.SerialDescriptor ? (kotlinx.serialization.descriptors.SerialDescriptor) it : null;
        return (serialDescriptor == null || (serialName = serialDescriptor.getSerialName()) == null) ? java.lang.String.valueOf(it) : serialName;
    }

    private final void resize() {
        int i = this.currentDepth * 2;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.currentObjectPath, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.currentObjectPath = copyOf;
        int[] copyOf2 = java.util.Arrays.copyOf(this.indicies, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        this.indicies = copyOf2;
    }

    public java.lang.String toString() {
        return getPath();
    }
}
