package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u00020\u0007*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR\"\u0010\u0015\u001a\u00020\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", "T", "", "<init>", "()V", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "at", "(Ljava/lang/Object;F)V", "", "buildPositions$foundation", "()[F", "", "buildKeys$foundation", "()Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Ljava/util/List;", "getKeys$foundation", "positions", "[F", "getPositions$foundation", "setPositions$foundation", "([F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final java.util.List<T> keys = new java.util.ArrayList();
    private float[] positions;

    public DraggableAnchorsConfig() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.positions = fArr;
    }

    public final java.util.List<T> getKeys$foundation() {
        return this.keys;
    }

    /* renamed from: getPositions$foundation, reason: from getter */
    public final float[] getPositions() {
        return this.positions;
    }

    public final void setPositions$foundation(float[] fArr) {
        this.positions = fArr;
    }

    public final void at(T t, float f) {
        this.keys.add(t);
        if (this.positions.length < this.keys.size()) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        this.positions[this.keys.size() - 1] = f;
    }

    public final float[] buildPositions$foundation() {
        return kotlin.collections.ArraysKt.copyOfRange(this.positions, 0, this.keys.size());
    }

    public final java.util.List<T> buildKeys$foundation() {
        return this.keys;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        float[] copyOf = java.util.Arrays.copyOf(this.positions, this.keys.size() + 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        this.positions = copyOf;
    }
}
