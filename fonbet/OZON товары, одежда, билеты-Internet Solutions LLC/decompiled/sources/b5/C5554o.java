package b5;

import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: b5.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5554o implements InterfaceC5559t {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f55533a = new String[0];

    @Override // b5.InterfaceC5559t
    @NonNull
    public final String[] a() {
        return f55533a;
    }

    @Override // b5.InterfaceC5559t
    @NonNull
    public final StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // b5.InterfaceC5559t
    @NonNull
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
