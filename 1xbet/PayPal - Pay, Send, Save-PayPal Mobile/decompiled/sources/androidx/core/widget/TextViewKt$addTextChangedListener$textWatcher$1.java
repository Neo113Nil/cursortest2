package androidx.core.widget;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e"}, d2 = {"Landroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1;", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", lib.android.paypal.com.magnessdk.g.n2, "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements android.text.TextWatcher {
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.text.Editable, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> function1, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function4, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function42) {
        this.getHighSpeedVideoSizes = function1;
        this.Camera2StreamConfigurationMap = function4;
        this.getHighSpeedVideoFpsRanges = function42;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable s) {
        this.getHighSpeedVideoSizes.invoke(s);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
        this.Camera2StreamConfigurationMap.invoke(text, java.lang.Integer.valueOf(start), java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(after));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
        this.getHighSpeedVideoFpsRanges.invoke(text, java.lang.Integer.valueOf(start), java.lang.Integer.valueOf(before), java.lang.Integer.valueOf(count));
    }
}
