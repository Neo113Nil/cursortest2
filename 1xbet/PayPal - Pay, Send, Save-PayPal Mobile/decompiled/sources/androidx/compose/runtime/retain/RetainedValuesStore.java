package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J#\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/retain/RetainedValuesStore;", "", "key", "defaultValue", "consumeExitedValueOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "saveExitingValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "onContentEnteredComposition", "()V", "onContentExitComposition"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RetainedValuesStore {
    java.lang.Object consumeExitedValueOrDefault(java.lang.Object key, java.lang.Object defaultValue);

    void onContentEnteredComposition();

    void onContentExitComposition();

    void saveExitingValue(java.lang.Object key, java.lang.Object value);
}
