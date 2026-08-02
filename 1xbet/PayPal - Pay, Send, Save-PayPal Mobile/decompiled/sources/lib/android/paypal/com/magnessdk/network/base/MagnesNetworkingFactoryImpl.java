package lib.android.paypal.com.magnessdk.network.base;

/* loaded from: classes5.dex */
public final class MagnesNetworkingFactoryImpl implements lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactory {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.h.EnumC0225c.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.h.EnumC0225c.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.EnumC0225c.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactory
    public final lib.android.paypal.com.magnessdk.network.base.MagnesNetworking createHttpClient(lib.android.paypal.com.magnessdk.c.h.EnumC0225c enumC0225c) throws java.lang.Exception {
        int i = lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl.a.Camera2StreamConfigurationMap[enumC0225c.ordinal()];
        return i != 1 ? i != 2 ? new lib.android.paypal.com.magnessdk.network.base.b() : new lib.android.paypal.com.magnessdk.network.base.b() : new lib.android.paypal.com.magnessdk.network.base.a();
    }
}
