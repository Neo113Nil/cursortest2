package androidx.compose.ui.tooling.preview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "T", "", "", "index", "", "getDisplayName", "(I)Ljava/lang/String;", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values", "getCount", "()I", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PreviewParameterProvider<T> {
    default java.lang.String getDisplayName(int index) {
        return null;
    }

    kotlin.sequences.Sequence<T> getValues();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> int getCount(androidx.compose.ui.tooling.preview.PreviewParameterProvider<T> previewParameterProvider) {
            return androidx.compose.ui.tooling.preview.PreviewParameterProvider.super.getCount();
        }

        @java.lang.Deprecated
        public static <T> java.lang.String getDisplayName(androidx.compose.ui.tooling.preview.PreviewParameterProvider<T> previewParameterProvider, int i) {
            return androidx.compose.ui.tooling.preview.PreviewParameterProvider.super.getDisplayName(i);
        }
    }

    default int getCount() {
        return kotlin.sequences.SequencesKt.count(getValues());
    }
}
