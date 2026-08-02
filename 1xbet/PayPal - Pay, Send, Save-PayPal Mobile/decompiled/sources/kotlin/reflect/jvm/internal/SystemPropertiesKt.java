package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004"}, d2 = {"", "useK1Implementation", "Z", "getUseK1Implementation", "()Z", "loadMetadataDirectly", "getLoadMetadataDirectly"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SystemPropertiesKt {
    private static final boolean loadMetadataDirectly;
    private static final boolean useK1Implementation;

    static {
        java.lang.Object m23436constructorimpl;
        java.lang.Object m23436constructorimpl2;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.System.getProperty("kotlin.reflect.jvm.useK1Implementation"));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        java.lang.String str = (java.lang.String) m23436constructorimpl;
        boolean z = false;
        useK1Implementation = str != null && java.lang.Boolean.parseBoolean(str);
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(java.lang.System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly"));
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        java.lang.String str2 = (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl2) ? null : m23436constructorimpl2);
        if (str2 != null && java.lang.Boolean.parseBoolean(str2)) {
            z = true;
        }
        loadMetadataDirectly = z;
    }

    public static final boolean getUseK1Implementation() {
        return useK1Implementation;
    }

    public static final boolean getLoadMetadataDirectly() {
        return loadMetadataDirectly;
    }
}
