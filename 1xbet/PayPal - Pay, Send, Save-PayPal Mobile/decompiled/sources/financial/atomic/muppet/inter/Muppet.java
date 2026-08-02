package financial.atomic.muppet.inter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lfinancial/atomic/muppet/inter/Muppet;", "T", "", "Lfinancial/atomic/muppet/inter/Browser$Factory;", "factory", "Lfinancial/atomic/muppet/inter/Browser;", "launch", "(Lfinancial/atomic/muppet/inter/Browser$Factory;)Lfinancial/atomic/muppet/inter/Browser;", "", "handle", "Lfinancial/atomic/muppet/inter/Page;", "getPage", "(Ljava/lang/String;)Lfinancial/atomic/muppet/inter/Page;", "page", "", "inject", "(Lfinancial/atomic/muppet/inter/Page;Lfinancial/atomic/muppet/inter/Browser$Factory;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Muppet<T> {
    financial.atomic.muppet.inter.Page<T> getPage(java.lang.String handle);

    void inject(financial.atomic.muppet.inter.Page<? extends T> page, financial.atomic.muppet.inter.Browser.Factory<T> factory);

    financial.atomic.muppet.inter.Browser<T> launch(financial.atomic.muppet.inter.Browser.Factory<T> factory);
}
