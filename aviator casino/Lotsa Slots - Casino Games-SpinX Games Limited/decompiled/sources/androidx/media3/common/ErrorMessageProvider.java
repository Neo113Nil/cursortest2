package androidx.media3.common;

/* loaded from: classes2.dex */
public interface ErrorMessageProvider<T extends java.lang.Throwable> {
    android.util.Pair<java.lang.Integer, java.lang.String> getErrorMessage(T t);
}
