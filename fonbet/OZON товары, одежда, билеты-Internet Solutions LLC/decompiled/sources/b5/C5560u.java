package b5;

import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import yf.C10890a;

/* renamed from: b5.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5560u implements InterfaceC5559t {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f55544a;

    public C5560u(@NonNull WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f55544a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // b5.InterfaceC5559t
    @NonNull
    public final String[] a() {
        return this.f55544a.getSupportedFeatures();
    }

    @Override // b5.InterfaceC5559t
    @NonNull
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C10890a.a(StaticsBoundaryInterface.class, this.f55544a.getStatics());
    }

    @Override // b5.InterfaceC5559t
    @NonNull
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C10890a.a(WebkitToCompatConverterBoundaryInterface.class, this.f55544a.getWebkitToCompatConverter());
    }
}
