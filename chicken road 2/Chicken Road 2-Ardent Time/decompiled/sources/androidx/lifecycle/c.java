package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2378a;

    static {
        int[] iArr = new int[androidx.lifecycle.d.values().length];
        try {
            iArr[androidx.lifecycle.d.ON_CREATE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[androidx.lifecycle.d.ON_STOP.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[androidx.lifecycle.d.ON_START.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[androidx.lifecycle.d.ON_PAUSE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[androidx.lifecycle.d.ON_RESUME.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[androidx.lifecycle.d.ON_DESTROY.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[androidx.lifecycle.d.ON_ANY.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        f2378a = iArr;
    }
}
