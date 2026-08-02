package androidx.browser.trusted;

/* loaded from: classes6.dex */
public final class LaunchHandlerClientMode {
    public static final int AUTO = 0;
    public static final int FOCUS_EXISTING = 2;
    public static final int NAVIGATE_EXISTING = 1;
    public static final int NAVIGATE_NEW = 3;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ClientMode {
    }

    private LaunchHandlerClientMode() {
    }
}
