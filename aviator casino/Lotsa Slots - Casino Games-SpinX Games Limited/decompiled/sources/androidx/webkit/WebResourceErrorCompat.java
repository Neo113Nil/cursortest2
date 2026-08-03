package androidx.webkit;

/* loaded from: classes2.dex */
public abstract class WebResourceErrorCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NetErrorCode {
    }

    public abstract java.lang.CharSequence getDescription();

    public abstract int getErrorCode();
}
