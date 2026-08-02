package c;

import androidx.lifecycle.EnumC0486o;

/* renamed from: c.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0518E {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7306a;

    static {
        int[] iArr = new int[EnumC0486o.values().length];
        try {
            iArr[EnumC0486o.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0486o.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0486o.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7306a = iArr;
    }
}
