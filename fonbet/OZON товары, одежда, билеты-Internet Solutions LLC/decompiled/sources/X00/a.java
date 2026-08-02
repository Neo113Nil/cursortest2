package X00;

import We.B;
import We.G;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class a implements B {
    private final G addHeaderIfNeed(G g10) {
        String previousPageName;
        if (g10.d("x-page-previous") != null || !needAddHeader(g10) || (previousPageName = getPreviousPageName()) == null) {
            return g10;
        }
        G.a aVar = new G.a(g10);
        aVar.d("x-page-previous", previousPageName);
        return aVar.b();
    }

    protected abstract String getPreviousPageName();

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(addHeaderIfNeed(chain.request()));
    }

    protected abstract boolean needAddHeader(@NotNull G g10);
}
