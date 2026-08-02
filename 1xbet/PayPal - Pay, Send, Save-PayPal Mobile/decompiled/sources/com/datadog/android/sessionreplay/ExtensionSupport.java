package com.datadog.android.sessionreplay;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/ExtensionSupport;", "", "", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "getCustomDrawableMapper", "()Ljava/util/List;", "Lcom/datadog/android/sessionreplay/MapperTypeWrapper;", "getCustomViewMappers", "Lcom/datadog/android/sessionreplay/recorder/OptionSelectorDetector;", "getOptionSelectorDetectors", "", "name", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ExtensionSupport {
    java.util.List<com.datadog.android.sessionreplay.utils.DrawableToColorMapper> getCustomDrawableMapper();

    java.util.List<com.datadog.android.sessionreplay.MapperTypeWrapper<?>> getCustomViewMappers();

    java.util.List<com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> getOptionSelectorDetectors();

    java.lang.String name();
}
