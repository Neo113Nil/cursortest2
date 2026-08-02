package financial.atomic.muppet.impl;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0015\u0010\u0014J+\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u00198\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c"}, d2 = {"Lfinancial/atomic/muppet/impl/Muppet;", "T", "Lfinancial/atomic/muppet/Emitter;", "", "Lfinancial/atomic/muppet/inter/Muppet;", "<init>", "()V", "Lfinancial/atomic/muppet/inter/Browser$Factory;", "factory", "Lfinancial/atomic/muppet/inter/Browser;", "launch", "(Lfinancial/atomic/muppet/inter/Browser$Factory;)Lfinancial/atomic/muppet/inter/Browser;", "", "handle", "Lfinancial/atomic/muppet/inter/Page;", "getPage", "(Ljava/lang/String;)Lfinancial/atomic/muppet/inter/Page;", "browser", "", "addBrowser", "(Lfinancial/atomic/muppet/inter/Browser;)V", "removeBrowser", "page", "inject", "(Lfinancial/atomic/muppet/inter/Page;Lfinancial/atomic/muppet/inter/Browser$Factory;)V", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "_browsers"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Muppet<T> extends financial.atomic.muppet.Emitter<java.lang.Object> implements financial.atomic.muppet.inter.Muppet<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.List<financial.atomic.muppet.inter.Browser<T>> _browsers = new java.util.ArrayList();

    public final java.util.List<financial.atomic.muppet.inter.Browser<T>> a() {
        return this._browsers;
    }

    public final void addBrowser(financial.atomic.muppet.inter.Browser<T> browser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(browser, "");
        this._browsers.add(browser);
        browser.on(financial.atomic.muppet.impl.Browser.Event.closed, new financial.atomic.muppet.d.c(this, null));
    }

    @Override // financial.atomic.muppet.inter.Muppet
    public financial.atomic.muppet.inter.Page<T> getPage(java.lang.String handle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handle, "");
        java.util.Iterator<T> it = this._browsers.iterator();
        financial.atomic.muppet.inter.Page<T> page = null;
        while (it.hasNext()) {
            for (financial.atomic.muppet.inter.Page<T> page2 : ((financial.atomic.muppet.inter.Browser) it.next()).pages()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(page2.handle(), handle)) {
                    page = page2;
                }
            }
        }
        return page;
    }

    @Override // financial.atomic.muppet.inter.Muppet
    public void inject(financial.atomic.muppet.inter.Page<? extends T> page, financial.atomic.muppet.inter.Browser.Factory<T> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        financial.atomic.muppet.BridgeKt.inject(this, page, factory);
    }

    public abstract financial.atomic.muppet.inter.Browser<T> launch(financial.atomic.muppet.inter.Browser.Factory<T> factory);

    public final void removeBrowser(financial.atomic.muppet.inter.Browser<T> browser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(browser, "");
        this._browsers.remove(browser);
    }
}
