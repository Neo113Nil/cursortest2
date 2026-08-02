package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public abstract /* synthetic */ class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7010a;

    static {
        int[] iArr = new int[net.idrnd.misnap.iad.PayloadSize.values().length];
        try {
            iArr[net.idrnd.misnap.iad.PayloadSize.Small.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[net.idrnd.misnap.iad.PayloadSize.Normal.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        f7010a = iArr;
    }
}
