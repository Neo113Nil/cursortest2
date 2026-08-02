package R5;

import android.webkit.ConsoleMessage;

/* renamed from: R5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0415k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6188a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f6188a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6188a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6188a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6188a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6188a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
