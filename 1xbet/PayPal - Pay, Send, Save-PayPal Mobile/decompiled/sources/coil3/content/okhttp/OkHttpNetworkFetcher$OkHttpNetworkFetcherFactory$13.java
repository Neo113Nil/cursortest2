package coil3.content.okhttp;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$13 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.content.Context, coil3.content.ConnectivityChecker> {
    public static final coil3.content.okhttp.OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$13 getHighSpeedVideoSizes = new coil3.content.okhttp.OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$13();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ coil3.content.ConnectivityChecker invoke(android.content.Context context) {
        return coil3.content.C0299ConnectivityCheckerKt.ConnectivityChecker(context);
    }

    OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$13() {
        super(1, coil3.content.C0299ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
    }
}
