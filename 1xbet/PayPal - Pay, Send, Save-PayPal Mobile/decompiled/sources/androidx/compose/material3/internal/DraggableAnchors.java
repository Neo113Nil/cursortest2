package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchors;", "T", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "positionOf", "(Ljava/lang/Object;)F", "", "hasAnchorFor", "(Ljava/lang/Object;)Z", com.daon.sdk.face.license.License.FEATURE_POSITION, "closestAnchor", "(F)Ljava/lang/Object;", "searchUpwards", "(FZ)Ljava/lang/Object;", "minAnchor", "()F", "maxAnchor", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DraggableAnchors<T> {
    T closestAnchor(float position);

    T closestAnchor(float position, boolean searchUpwards);

    int getSize();

    boolean hasAnchorFor(T value);

    float maxAnchor();

    float minAnchor();

    float positionOf(T value);
}
