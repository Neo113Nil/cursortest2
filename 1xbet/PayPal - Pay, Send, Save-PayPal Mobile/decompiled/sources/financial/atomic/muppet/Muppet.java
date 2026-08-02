package financial.atomic.muppet;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lfinancial/atomic/muppet/Muppet;", "Lfinancial/atomic/muppet/impl/Muppet;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "", "dataDirectorySuffix", "", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "<init>", "(Landroid/content/Context;Ljava/lang/String;Z)V", "Lfinancial/atomic/muppet/Browser;", "launch", "()Lfinancial/atomic/muppet/Browser;", "Lfinancial/atomic/muppet/inter/Browser$Factory;", "factory", "Lfinancial/atomic/muppet/inter/Browser;", "(Lfinancial/atomic/muppet/inter/Browser$Factory;)Lfinancial/atomic/muppet/inter/Browser;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Muppet extends financial.atomic.muppet.impl.Muppet<android.webkit.WebView> {
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ Muppet(android.content.Context context, java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
    }

    public final financial.atomic.muppet.Browser launch() {
        financial.atomic.muppet.inter.Browser<android.webkit.WebView> launch = launch(new financial.atomic.muppet.inter.Browser.Factory() { // from class: financial.atomic.muppet.Muppet$$ExternalSyntheticLambda0
            @Override // financial.atomic.muppet.inter.Browser.Factory
            public final financial.atomic.muppet.inter.Browser create(financial.atomic.muppet.inter.Muppet muppet) {
                return financial.atomic.muppet.Muppet.$r8$lambda$UMGDvdQoPZwZ4cxWfOOY_TenVUI(financial.atomic.muppet.Muppet.this, muppet);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(launch, "");
        return (financial.atomic.muppet.Browser) launch;
    }

    public Muppet(android.content.Context context, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        android.webkit.WebView.setWebContentsDebuggingEnabled(z);
        if (android.os.Build.VERSION.SDK_INT < 28 || str == null) {
            return;
        }
        try {
            android.webkit.WebView.setDataDirectorySuffix(str);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // financial.atomic.muppet.impl.Muppet, financial.atomic.muppet.inter.Muppet
    public final financial.atomic.muppet.inter.Browser<android.webkit.WebView> launch(financial.atomic.muppet.inter.Browser.Factory<android.webkit.WebView> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        financial.atomic.muppet.inter.Browser<android.webkit.WebView> create = factory.create(this);
        addBrowser(create);
        return create;
    }

    public static /* synthetic */ financial.atomic.muppet.inter.Browser $r8$lambda$UMGDvdQoPZwZ4cxWfOOY_TenVUI(financial.atomic.muppet.Muppet muppet, financial.atomic.muppet.inter.Muppet muppet2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(muppet2, "");
        return new financial.atomic.muppet.Browser(muppet.getHighResolutionOutputSizeshNQ4ISI, null, 2, null);
    }
}
