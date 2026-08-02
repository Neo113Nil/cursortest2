package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ4\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\fR\u00020\r0\u000bH&¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/constraintlayout/compose/MotionItemsProvider;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "()I", "index", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getContent", "(I)Lkotlin/jvm/functions/Function2;", "Landroidx/compose/runtime/State;", "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "properties", "(ILandroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;", "", "hasItemsWithProperties", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MotionItemsProvider {
    int count();

    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent(int index);

    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent(int index, androidx.compose.runtime.State<androidx.constraintlayout.compose.MotionLayoutScope.MotionProperties> properties);

    boolean hasItemsWithProperties();
}
