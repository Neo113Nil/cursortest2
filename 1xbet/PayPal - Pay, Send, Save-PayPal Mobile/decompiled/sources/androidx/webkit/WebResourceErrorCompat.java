package androidx.webkit;

/* loaded from: classes7.dex */
public abstract class WebResourceErrorCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface NetErrorCode {
    }

    public abstract java.lang.CharSequence getDescription();

    public abstract int getErrorCode();
}
