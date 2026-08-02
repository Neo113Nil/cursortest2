package e2;

import d2.AbstractC1914b;
import r0.AbstractC2346c;

/* renamed from: e2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1932m extends C1921b {
    @Override // e2.AbstractC1922c
    public final boolean b() {
        if (!super.b() || !AbstractC2346c.x("MULTI_PROCESS")) {
            return false;
        }
        int i = AbstractC1914b.f16884a;
        if (AbstractC1933n.f16914c.b()) {
            return AbstractC1934o.f16917a.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
